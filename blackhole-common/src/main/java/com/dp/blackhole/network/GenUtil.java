package com.dp.blackhole.network;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.GatheringByteChannel;

import com.dp.blackhole.common.Util;

public class GenUtil {
    public static int retryWrite(GatheringByteChannel channel, ByteBuffer buffer) throws IOException {
        int written = 0;
        for (int i = 0; i < 16; i++) {
            int num = channel.write(buffer);
            written += num;
            if (num != 0) {
                break;
            }
        }
        return written;
    }
    
    public static void writeString(String str, ByteBuffer buffer) {
        byte[] data = str.getBytes();
        buffer.putInt(data.length);
        buffer.put(data);
    }
    
    public static String readString(ByteBuffer buffer) {
        int len = buffer.getInt();
        byte[] data = new byte[len];
        buffer.get(data);
        return new String(data);
    }
    
    public static void writeObject(Object obj, ByteBuffer buffer) {
        byte[] data = Util.serialize(obj);
        buffer.putInt(data.length);
        buffer.put(data);
    }
    
    public static Object readObject(ByteBuffer buffer) {
        int len = buffer.getInt();
        byte[] data = new byte[len];
        buffer.get(data);
        return Util.deserialize(data);
    }
    
    public static int getStringSize(String str) {
        return Integer.SIZE/8 + str.getBytes().length;
    }
    
    public static int getObjectSize(Object obj) {
        return Integer.SIZE/8 + Util.serialize(obj).length;
    }
}
