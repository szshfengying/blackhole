package com.dp.blackhole.consumer;

import static java.lang.String.format;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicLong;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.dp.blackhole.collectornode.persistent.ByteBufferMessageSet;

public class PartitionTopicInfo {
    private final Log logger = LogFactory.getLog(PartitionTopicInfo.class);

    public final String topic;

    public final String brokerString;

    private final BlockingQueue<FetchedDataChunk> chunkQueue;

    private final AtomicLong consumedOffset;

    private final AtomicLong fetchedOffset;

    private final AtomicLong consumedOffsetChanged = new AtomicLong(0);

    final String partition;

    public PartitionTopicInfo(String topic, //
            String partition,//
            String brokerString,//
            BlockingQueue<FetchedDataChunk> chunkQueue, //
            AtomicLong consumedOffset, //
            AtomicLong fetchedOffset) {
        super();
        this.topic = topic;
        this.partition = partition;
        this.brokerString = brokerString;
        this.chunkQueue = chunkQueue;
        this.consumedOffset = consumedOffset;
        this.fetchedOffset = fetchedOffset;
    }

    public long getConsumedOffset() {
        return consumedOffset.get();
    }

    public AtomicLong getConsumedOffsetChanged() {
        return consumedOffsetChanged;
    }

    public boolean resetComsumedOffsetChanged(long lastChanged) {
        return consumedOffsetChanged.compareAndSet(lastChanged, 0);
    }

    public long getFetchedOffset() {
        return fetchedOffset.get();
    }

    public void resetConsumeOffset(long newConsumeOffset) {
        consumedOffset.set(newConsumeOffset);
        consumedOffsetChanged.incrementAndGet();
    }

    public void resetFetchOffset(long newFetchOffset) {
        fetchedOffset.set(newFetchOffset);
    }

    public long enqueue(ByteBufferMessageSet messages, long fetchOffset) throws InterruptedException {
        long size = messages.getValidSize();
        if (size > 0) {
            final long oldOffset = fetchedOffset.get();
            chunkQueue.put(new FetchedDataChunk(messages, this, fetchOffset));
            long newOffset = fetchedOffset.addAndGet(size);
            logger.debug(format("updated fetchset (origin+size=newOffset) => %d + %d = %d", oldOffset, size, newOffset));
        }
        return size;
    }

    @Override
    public String toString() {
        return topic + "-" + partition + ", fetched/consumed offset: " + fetchedOffset.get() + "/" + consumedOffset.get();
    }
}
