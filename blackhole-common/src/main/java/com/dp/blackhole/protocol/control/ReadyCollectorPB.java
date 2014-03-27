// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReadyCollector.proto

package com.dp.blackhole.protocol.control;

public final class ReadyCollectorPB {
  private ReadyCollectorPB() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class ReadyCollector extends
      com.google.protobuf.GeneratedMessage {
    // Use ReadyCollector.newBuilder() to construct.
    private ReadyCollector() {
      initFields();
    }
    private ReadyCollector(boolean noInit) {}
    
    private static final ReadyCollector defaultInstance;
    public static ReadyCollector getDefaultInstance() {
      return defaultInstance;
    }
    
    public ReadyCollector getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.dp.blackhole.protocol.control.ReadyCollectorPB.internal_static_blackhole_ReadyCollector_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.dp.blackhole.protocol.control.ReadyCollectorPB.internal_static_blackhole_ReadyCollector_fieldAccessorTable;
    }
    
    // required string app_name = 1;
    public static final int APP_NAME_FIELD_NUMBER = 1;
    private boolean hasAppName;
    private java.lang.String appName_ = "";
    public boolean hasAppName() { return hasAppName; }
    public java.lang.String getAppName() { return appName_; }
    
    // required string app_server = 2;
    public static final int APP_SERVER_FIELD_NUMBER = 2;
    private boolean hasAppServer;
    private java.lang.String appServer_ = "";
    public boolean hasAppServer() { return hasAppServer; }
    public java.lang.String getAppServer() { return appServer_; }
    
    // required string collector_server = 3;
    public static final int COLLECTOR_SERVER_FIELD_NUMBER = 3;
    private boolean hasCollectorServer;
    private java.lang.String collectorServer_ = "";
    public boolean hasCollectorServer() { return hasCollectorServer; }
    public java.lang.String getCollectorServer() { return collectorServer_; }
    
    // required int64 period = 4;
    public static final int PERIOD_FIELD_NUMBER = 4;
    private boolean hasPeriod;
    private long period_ = 0L;
    public boolean hasPeriod() { return hasPeriod; }
    public long getPeriod() { return period_; }
    
    // required int64 connectedTs = 5;
    public static final int CONNECTEDTS_FIELD_NUMBER = 5;
    private boolean hasConnectedTs;
    private long connectedTs_ = 0L;
    public boolean hasConnectedTs() { return hasConnectedTs; }
    public long getConnectedTs() { return connectedTs_; }
    
    private void initFields() {
    }
    public final boolean isInitialized() {
      if (!hasAppName) return false;
      if (!hasAppServer) return false;
      if (!hasCollectorServer) return false;
      if (!hasPeriod) return false;
      if (!hasConnectedTs) return false;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasAppName()) {
        output.writeString(1, getAppName());
      }
      if (hasAppServer()) {
        output.writeString(2, getAppServer());
      }
      if (hasCollectorServer()) {
        output.writeString(3, getCollectorServer());
      }
      if (hasPeriod()) {
        output.writeInt64(4, getPeriod());
      }
      if (hasConnectedTs()) {
        output.writeInt64(5, getConnectedTs());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasAppName()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getAppName());
      }
      if (hasAppServer()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(2, getAppServer());
      }
      if (hasCollectorServer()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(3, getCollectorServer());
      }
      if (hasPeriod()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(4, getPeriod());
      }
      if (hasConnectedTs()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(5, getConnectedTs());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.dp.blackhole.protocol.control.ReadyCollectorPB.ReadyCollector parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.dp.blackhole.protocol.control.ReadyCollectorPB.ReadyCollector parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.dp.blackhole.protocol.control.ReadyCollectorPB.ReadyCollector parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.dp.blackhole.protocol.control.ReadyCollectorPB.ReadyCollector parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.dp.blackhole.protocol.control.ReadyCollectorPB.ReadyCollector parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.dp.blackhole.protocol.control.ReadyCollectorPB.ReadyCollector parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.dp.blackhole.protocol.control.ReadyCollectorPB.ReadyCollector parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.dp.blackhole.protocol.control.ReadyCollectorPB.ReadyCollector parseDelimitedFrom(
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
    public static com.dp.blackhole.protocol.control.ReadyCollectorPB.ReadyCollector parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.dp.blackhole.protocol.control.ReadyCollectorPB.ReadyCollector parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.dp.blackhole.protocol.control.ReadyCollectorPB.ReadyCollector prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.dp.blackhole.protocol.control.ReadyCollectorPB.ReadyCollector result;
      
      // Construct using com.dp.blackhole.protocol.control.ReadyCollectorPB.ReadyCollector.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.dp.blackhole.protocol.control.ReadyCollectorPB.ReadyCollector();
        return builder;
      }
      
      protected com.dp.blackhole.protocol.control.ReadyCollectorPB.ReadyCollector internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.dp.blackhole.protocol.control.ReadyCollectorPB.ReadyCollector();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.dp.blackhole.protocol.control.ReadyCollectorPB.ReadyCollector.getDescriptor();
      }
      
      public com.dp.blackhole.protocol.control.ReadyCollectorPB.ReadyCollector getDefaultInstanceForType() {
        return com.dp.blackhole.protocol.control.ReadyCollectorPB.ReadyCollector.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.dp.blackhole.protocol.control.ReadyCollectorPB.ReadyCollector build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.dp.blackhole.protocol.control.ReadyCollectorPB.ReadyCollector buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.dp.blackhole.protocol.control.ReadyCollectorPB.ReadyCollector buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.dp.blackhole.protocol.control.ReadyCollectorPB.ReadyCollector returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.dp.blackhole.protocol.control.ReadyCollectorPB.ReadyCollector) {
          return mergeFrom((com.dp.blackhole.protocol.control.ReadyCollectorPB.ReadyCollector)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.dp.blackhole.protocol.control.ReadyCollectorPB.ReadyCollector other) {
        if (other == com.dp.blackhole.protocol.control.ReadyCollectorPB.ReadyCollector.getDefaultInstance()) return this;
        if (other.hasAppName()) {
          setAppName(other.getAppName());
        }
        if (other.hasAppServer()) {
          setAppServer(other.getAppServer());
        }
        if (other.hasCollectorServer()) {
          setCollectorServer(other.getCollectorServer());
        }
        if (other.hasPeriod()) {
          setPeriod(other.getPeriod());
        }
        if (other.hasConnectedTs()) {
          setConnectedTs(other.getConnectedTs());
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
            case 10: {
              setAppName(input.readString());
              break;
            }
            case 18: {
              setAppServer(input.readString());
              break;
            }
            case 26: {
              setCollectorServer(input.readString());
              break;
            }
            case 32: {
              setPeriod(input.readInt64());
              break;
            }
            case 40: {
              setConnectedTs(input.readInt64());
              break;
            }
          }
        }
      }
      
      
      // required string app_name = 1;
      public boolean hasAppName() {
        return result.hasAppName();
      }
      public java.lang.String getAppName() {
        return result.getAppName();
      }
      public Builder setAppName(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasAppName = true;
        result.appName_ = value;
        return this;
      }
      public Builder clearAppName() {
        result.hasAppName = false;
        result.appName_ = getDefaultInstance().getAppName();
        return this;
      }
      
      // required string app_server = 2;
      public boolean hasAppServer() {
        return result.hasAppServer();
      }
      public java.lang.String getAppServer() {
        return result.getAppServer();
      }
      public Builder setAppServer(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasAppServer = true;
        result.appServer_ = value;
        return this;
      }
      public Builder clearAppServer() {
        result.hasAppServer = false;
        result.appServer_ = getDefaultInstance().getAppServer();
        return this;
      }
      
      // required string collector_server = 3;
      public boolean hasCollectorServer() {
        return result.hasCollectorServer();
      }
      public java.lang.String getCollectorServer() {
        return result.getCollectorServer();
      }
      public Builder setCollectorServer(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasCollectorServer = true;
        result.collectorServer_ = value;
        return this;
      }
      public Builder clearCollectorServer() {
        result.hasCollectorServer = false;
        result.collectorServer_ = getDefaultInstance().getCollectorServer();
        return this;
      }
      
      // required int64 period = 4;
      public boolean hasPeriod() {
        return result.hasPeriod();
      }
      public long getPeriod() {
        return result.getPeriod();
      }
      public Builder setPeriod(long value) {
        result.hasPeriod = true;
        result.period_ = value;
        return this;
      }
      public Builder clearPeriod() {
        result.hasPeriod = false;
        result.period_ = 0L;
        return this;
      }
      
      // required int64 connectedTs = 5;
      public boolean hasConnectedTs() {
        return result.hasConnectedTs();
      }
      public long getConnectedTs() {
        return result.getConnectedTs();
      }
      public Builder setConnectedTs(long value) {
        result.hasConnectedTs = true;
        result.connectedTs_ = value;
        return this;
      }
      public Builder clearConnectedTs() {
        result.hasConnectedTs = false;
        result.connectedTs_ = 0L;
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:blackhole.ReadyCollector)
    }
    
    static {
      defaultInstance = new ReadyCollector(true);
      com.dp.blackhole.protocol.control.ReadyCollectorPB.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:blackhole.ReadyCollector)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_blackhole_ReadyCollector_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_blackhole_ReadyCollector_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024ReadyCollector.proto\022\tblackhole\"u\n\016Rea" +
      "dyCollector\022\020\n\010app_name\030\001 \002(\t\022\022\n\napp_ser" +
      "ver\030\002 \002(\t\022\030\n\020collector_server\030\003 \002(\t\022\016\n\006p" +
      "eriod\030\004 \002(\003\022\023\n\013connectedTs\030\005 \002(\003B5\n!com." +
      "dp.blackhole.protocol.controlB\020ReadyColl" +
      "ectorPB"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_blackhole_ReadyCollector_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_blackhole_ReadyCollector_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_blackhole_ReadyCollector_descriptor,
              new java.lang.String[] { "AppName", "AppServer", "CollectorServer", "Period", "ConnectedTs", },
              com.dp.blackhole.protocol.control.ReadyCollectorPB.ReadyCollector.class,
              com.dp.blackhole.protocol.control.ReadyCollectorPB.ReadyCollector.Builder.class);
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
