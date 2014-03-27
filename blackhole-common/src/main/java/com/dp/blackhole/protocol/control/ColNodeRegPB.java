// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ColNodeReg.proto

package com.dp.blackhole.protocol.control;

public final class ColNodeRegPB {
  private ColNodeRegPB() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class ColNodeReg extends
      com.google.protobuf.GeneratedMessage {
    // Use ColNodeReg.newBuilder() to construct.
    private ColNodeReg() {
      initFields();
    }
    private ColNodeReg(boolean noInit) {}
    
    private static final ColNodeReg defaultInstance;
    public static ColNodeReg getDefaultInstance() {
      return defaultInstance;
    }
    
    public ColNodeReg getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.dp.blackhole.protocol.control.ColNodeRegPB.internal_static_blackhole_ColNodeReg_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.dp.blackhole.protocol.control.ColNodeRegPB.internal_static_blackhole_ColNodeReg_fieldAccessorTable;
    }
    
    // required int32 port = 1;
    public static final int PORT_FIELD_NUMBER = 1;
    private boolean hasPort;
    private int port_ = 0;
    public boolean hasPort() { return hasPort; }
    public int getPort() { return port_; }
    
    private void initFields() {
    }
    public final boolean isInitialized() {
      if (!hasPort) return false;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasPort()) {
        output.writeInt32(1, getPort());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasPort()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, getPort());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.dp.blackhole.protocol.control.ColNodeRegPB.ColNodeReg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.dp.blackhole.protocol.control.ColNodeRegPB.ColNodeReg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.dp.blackhole.protocol.control.ColNodeRegPB.ColNodeReg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.dp.blackhole.protocol.control.ColNodeRegPB.ColNodeReg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.dp.blackhole.protocol.control.ColNodeRegPB.ColNodeReg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.dp.blackhole.protocol.control.ColNodeRegPB.ColNodeReg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.dp.blackhole.protocol.control.ColNodeRegPB.ColNodeReg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.dp.blackhole.protocol.control.ColNodeRegPB.ColNodeReg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.dp.blackhole.protocol.control.ColNodeRegPB.ColNodeReg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.dp.blackhole.protocol.control.ColNodeRegPB.ColNodeReg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.dp.blackhole.protocol.control.ColNodeRegPB.ColNodeReg prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.dp.blackhole.protocol.control.ColNodeRegPB.ColNodeReg result;
      
      // Construct using com.dp.blackhole.protocol.control.ColNodeRegPB.ColNodeReg.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.dp.blackhole.protocol.control.ColNodeRegPB.ColNodeReg();
        return builder;
      }
      
      protected com.dp.blackhole.protocol.control.ColNodeRegPB.ColNodeReg internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.dp.blackhole.protocol.control.ColNodeRegPB.ColNodeReg();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.dp.blackhole.protocol.control.ColNodeRegPB.ColNodeReg.getDescriptor();
      }
      
      public com.dp.blackhole.protocol.control.ColNodeRegPB.ColNodeReg getDefaultInstanceForType() {
        return com.dp.blackhole.protocol.control.ColNodeRegPB.ColNodeReg.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.dp.blackhole.protocol.control.ColNodeRegPB.ColNodeReg build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.dp.blackhole.protocol.control.ColNodeRegPB.ColNodeReg buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.dp.blackhole.protocol.control.ColNodeRegPB.ColNodeReg buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.dp.blackhole.protocol.control.ColNodeRegPB.ColNodeReg returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.dp.blackhole.protocol.control.ColNodeRegPB.ColNodeReg) {
          return mergeFrom((com.dp.blackhole.protocol.control.ColNodeRegPB.ColNodeReg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.dp.blackhole.protocol.control.ColNodeRegPB.ColNodeReg other) {
        if (other == com.dp.blackhole.protocol.control.ColNodeRegPB.ColNodeReg.getDefaultInstance()) return this;
        if (other.hasPort()) {
          setPort(other.getPort());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                return this;
              }
              break;
            }
            case 8: {
              setPort(input.readInt32());
              break;
            }
          }
        }
      }
      
      
      // required int32 port = 1;
      public boolean hasPort() {
        return result.hasPort();
      }
      public int getPort() {
        return result.getPort();
      }
      public Builder setPort(int value) {
        result.hasPort = true;
        result.port_ = value;
        return this;
      }
      public Builder clearPort() {
        result.hasPort = false;
        result.port_ = 0;
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:blackhole.ColNodeReg)
    }
    
    static {
      defaultInstance = new ColNodeReg(true);
      com.dp.blackhole.protocol.control.ColNodeRegPB.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:blackhole.ColNodeReg)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_blackhole_ColNodeReg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_blackhole_ColNodeReg_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020ColNodeReg.proto\022\tblackhole\"\032\n\nColNode" +
      "Reg\022\014\n\004port\030\001 \002(\005B1\n!com.dp.blackhole.pr" +
      "otocol.controlB\014ColNodeRegPB"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_blackhole_ColNodeReg_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_blackhole_ColNodeReg_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_blackhole_ColNodeReg_descriptor,
              new java.lang.String[] { "Port", },
              com.dp.blackhole.protocol.control.ColNodeRegPB.ColNodeReg.class,
              com.dp.blackhole.protocol.control.ColNodeRegPB.ColNodeReg.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  public static void internalForceInit() {}
  
  // @@protoc_insertion_point(outer_class_scope)
}
