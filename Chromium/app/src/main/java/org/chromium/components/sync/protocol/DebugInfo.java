// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: client_debug_info.proto

package org.chromium.components.sync.protocol;

/**
 * Protobuf type {@code sync_pb.DebugInfo}
 */
public  final class DebugInfo extends
    com.google.protobuf.GeneratedMessageLite<
        DebugInfo, DebugInfo.Builder> implements
    // @@protoc_insertion_point(message_implements:sync_pb.DebugInfo)
    DebugInfoOrBuilder {
  private DebugInfo() {
    events_ = emptyProtobufList();
  }
  private int bitField0_;
  public static final int EVENTS_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.ProtobufList<org.chromium.components.sync.protocol.DebugEventInfo> events_;
  /**
   * <code>repeated .sync_pb.DebugEventInfo events = 1;</code>
   */
  public java.util.List<org.chromium.components.sync.protocol.DebugEventInfo> getEventsList() {
    return events_;
  }
  /**
   * <code>repeated .sync_pb.DebugEventInfo events = 1;</code>
   */
  public java.util.List<? extends org.chromium.components.sync.protocol.DebugEventInfoOrBuilder> 
      getEventsOrBuilderList() {
    return events_;
  }
  /**
   * <code>repeated .sync_pb.DebugEventInfo events = 1;</code>
   */
  public int getEventsCount() {
    return events_.size();
  }
  /**
   * <code>repeated .sync_pb.DebugEventInfo events = 1;</code>
   */
  public org.chromium.components.sync.protocol.DebugEventInfo getEvents(int index) {
    return events_.get(index);
  }
  /**
   * <code>repeated .sync_pb.DebugEventInfo events = 1;</code>
   */
  public org.chromium.components.sync.protocol.DebugEventInfoOrBuilder getEventsOrBuilder(
      int index) {
    return events_.get(index);
  }
  private void ensureEventsIsMutable() {
    if (!events_.isModifiable()) {
      events_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(events_);
     }
  }

  /**
   * <code>repeated .sync_pb.DebugEventInfo events = 1;</code>
   */
  private void setEvents(
      int index, org.chromium.components.sync.protocol.DebugEventInfo value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureEventsIsMutable();
    events_.set(index, value);
  }
  /**
   * <code>repeated .sync_pb.DebugEventInfo events = 1;</code>
   */
  private void setEvents(
      int index, org.chromium.components.sync.protocol.DebugEventInfo.Builder builderForValue) {
    ensureEventsIsMutable();
    events_.set(index, builderForValue.build());
  }
  /**
   * <code>repeated .sync_pb.DebugEventInfo events = 1;</code>
   */
  private void addEvents(org.chromium.components.sync.protocol.DebugEventInfo value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureEventsIsMutable();
    events_.add(value);
  }
  /**
   * <code>repeated .sync_pb.DebugEventInfo events = 1;</code>
   */
  private void addEvents(
      int index, org.chromium.components.sync.protocol.DebugEventInfo value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureEventsIsMutable();
    events_.add(index, value);
  }
  /**
   * <code>repeated .sync_pb.DebugEventInfo events = 1;</code>
   */
  private void addEvents(
      org.chromium.components.sync.protocol.DebugEventInfo.Builder builderForValue) {
    ensureEventsIsMutable();
    events_.add(builderForValue.build());
  }
  /**
   * <code>repeated .sync_pb.DebugEventInfo events = 1;</code>
   */
  private void addEvents(
      int index, org.chromium.components.sync.protocol.DebugEventInfo.Builder builderForValue) {
    ensureEventsIsMutable();
    events_.add(index, builderForValue.build());
  }
  /**
   * <code>repeated .sync_pb.DebugEventInfo events = 1;</code>
   */
  private void addAllEvents(
      java.lang.Iterable<? extends org.chromium.components.sync.protocol.DebugEventInfo> values) {
    ensureEventsIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, events_);
  }
  /**
   * <code>repeated .sync_pb.DebugEventInfo events = 1;</code>
   */
  private void clearEvents() {
    events_ = emptyProtobufList();
  }
  /**
   * <code>repeated .sync_pb.DebugEventInfo events = 1;</code>
   */
  private void removeEvents(int index) {
    ensureEventsIsMutable();
    events_.remove(index);
  }

  public static final int CRYPTOGRAPHER_READY_FIELD_NUMBER = 2;
  private boolean cryptographerReady_;
  /**
   * <pre>
   * Whether cryptographer is ready to encrypt and decrypt data.
   * </pre>
   *
   * <code>optional bool cryptographer_ready = 2;</code>
   */
  public boolean hasCryptographerReady() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <pre>
   * Whether cryptographer is ready to encrypt and decrypt data.
   * </pre>
   *
   * <code>optional bool cryptographer_ready = 2;</code>
   */
  public boolean getCryptographerReady() {
    return cryptographerReady_;
  }
  /**
   * <pre>
   * Whether cryptographer is ready to encrypt and decrypt data.
   * </pre>
   *
   * <code>optional bool cryptographer_ready = 2;</code>
   */
  private void setCryptographerReady(boolean value) {
    bitField0_ |= 0x00000001;
    cryptographerReady_ = value;
  }
  /**
   * <pre>
   * Whether cryptographer is ready to encrypt and decrypt data.
   * </pre>
   *
   * <code>optional bool cryptographer_ready = 2;</code>
   */
  private void clearCryptographerReady() {
    bitField0_ = (bitField0_ & ~0x00000001);
    cryptographerReady_ = false;
  }

  public static final int CRYPTOGRAPHER_HAS_PENDING_KEYS_FIELD_NUMBER = 3;
  private boolean cryptographerHasPendingKeys_;
  /**
   * <pre>
   * Cryptographer has pending keys which indicates the correct passphrase
   * has not been provided yet.
   * </pre>
   *
   * <code>optional bool cryptographer_has_pending_keys = 3;</code>
   */
  public boolean hasCryptographerHasPendingKeys() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <pre>
   * Cryptographer has pending keys which indicates the correct passphrase
   * has not been provided yet.
   * </pre>
   *
   * <code>optional bool cryptographer_has_pending_keys = 3;</code>
   */
  public boolean getCryptographerHasPendingKeys() {
    return cryptographerHasPendingKeys_;
  }
  /**
   * <pre>
   * Cryptographer has pending keys which indicates the correct passphrase
   * has not been provided yet.
   * </pre>
   *
   * <code>optional bool cryptographer_has_pending_keys = 3;</code>
   */
  private void setCryptographerHasPendingKeys(boolean value) {
    bitField0_ |= 0x00000002;
    cryptographerHasPendingKeys_ = value;
  }
  /**
   * <pre>
   * Cryptographer has pending keys which indicates the correct passphrase
   * has not been provided yet.
   * </pre>
   *
   * <code>optional bool cryptographer_has_pending_keys = 3;</code>
   */
  private void clearCryptographerHasPendingKeys() {
    bitField0_ = (bitField0_ & ~0x00000002);
    cryptographerHasPendingKeys_ = false;
  }

  public static final int EVENTS_DROPPED_FIELD_NUMBER = 4;
  private boolean eventsDropped_;
  /**
   * <pre>
   * Indicates client has dropped some events to save bandwidth.
   * </pre>
   *
   * <code>optional bool events_dropped = 4;</code>
   */
  public boolean hasEventsDropped() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <pre>
   * Indicates client has dropped some events to save bandwidth.
   * </pre>
   *
   * <code>optional bool events_dropped = 4;</code>
   */
  public boolean getEventsDropped() {
    return eventsDropped_;
  }
  /**
   * <pre>
   * Indicates client has dropped some events to save bandwidth.
   * </pre>
   *
   * <code>optional bool events_dropped = 4;</code>
   */
  private void setEventsDropped(boolean value) {
    bitField0_ |= 0x00000004;
    eventsDropped_ = value;
  }
  /**
   * <pre>
   * Indicates client has dropped some events to save bandwidth.
   * </pre>
   *
   * <code>optional bool events_dropped = 4;</code>
   */
  private void clearEventsDropped() {
    bitField0_ = (bitField0_ & ~0x00000004);
    eventsDropped_ = false;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < events_.size(); i++) {
      output.writeMessage(1, events_.get(i));
    }
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeBool(2, cryptographerReady_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeBool(3, cryptographerHasPendingKeys_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeBool(4, eventsDropped_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < events_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, events_.get(i));
    }
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, cryptographerReady_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, cryptographerHasPendingKeys_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, eventsDropped_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static org.chromium.components.sync.protocol.DebugInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.DebugInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.DebugInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.DebugInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.DebugInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.DebugInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.DebugInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.DebugInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.DebugInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.DebugInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.chromium.components.sync.protocol.DebugInfo prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code sync_pb.DebugInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.components.sync.protocol.DebugInfo, Builder> implements
      // @@protoc_insertion_point(builder_implements:sync_pb.DebugInfo)
      org.chromium.components.sync.protocol.DebugInfoOrBuilder {
    // Construct using org.chromium.components.sync.protocol.DebugInfo.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>repeated .sync_pb.DebugEventInfo events = 1;</code>
     */
    public java.util.List<org.chromium.components.sync.protocol.DebugEventInfo> getEventsList() {
      return java.util.Collections.unmodifiableList(
          instance.getEventsList());
    }
    /**
     * <code>repeated .sync_pb.DebugEventInfo events = 1;</code>
     */
    public int getEventsCount() {
      return instance.getEventsCount();
    }/**
     * <code>repeated .sync_pb.DebugEventInfo events = 1;</code>
     */
    public org.chromium.components.sync.protocol.DebugEventInfo getEvents(int index) {
      return instance.getEvents(index);
    }
    /**
     * <code>repeated .sync_pb.DebugEventInfo events = 1;</code>
     */
    public Builder setEvents(
        int index, org.chromium.components.sync.protocol.DebugEventInfo value) {
      copyOnWrite();
      instance.setEvents(index, value);
      return this;
    }
    /**
     * <code>repeated .sync_pb.DebugEventInfo events = 1;</code>
     */
    public Builder setEvents(
        int index, org.chromium.components.sync.protocol.DebugEventInfo.Builder builderForValue) {
      copyOnWrite();
      instance.setEvents(index, builderForValue);
      return this;
    }
    /**
     * <code>repeated .sync_pb.DebugEventInfo events = 1;</code>
     */
    public Builder addEvents(org.chromium.components.sync.protocol.DebugEventInfo value) {
      copyOnWrite();
      instance.addEvents(value);
      return this;
    }
    /**
     * <code>repeated .sync_pb.DebugEventInfo events = 1;</code>
     */
    public Builder addEvents(
        int index, org.chromium.components.sync.protocol.DebugEventInfo value) {
      copyOnWrite();
      instance.addEvents(index, value);
      return this;
    }
    /**
     * <code>repeated .sync_pb.DebugEventInfo events = 1;</code>
     */
    public Builder addEvents(
        org.chromium.components.sync.protocol.DebugEventInfo.Builder builderForValue) {
      copyOnWrite();
      instance.addEvents(builderForValue);
      return this;
    }
    /**
     * <code>repeated .sync_pb.DebugEventInfo events = 1;</code>
     */
    public Builder addEvents(
        int index, org.chromium.components.sync.protocol.DebugEventInfo.Builder builderForValue) {
      copyOnWrite();
      instance.addEvents(index, builderForValue);
      return this;
    }
    /**
     * <code>repeated .sync_pb.DebugEventInfo events = 1;</code>
     */
    public Builder addAllEvents(
        java.lang.Iterable<? extends org.chromium.components.sync.protocol.DebugEventInfo> values) {
      copyOnWrite();
      instance.addAllEvents(values);
      return this;
    }
    /**
     * <code>repeated .sync_pb.DebugEventInfo events = 1;</code>
     */
    public Builder clearEvents() {
      copyOnWrite();
      instance.clearEvents();
      return this;
    }
    /**
     * <code>repeated .sync_pb.DebugEventInfo events = 1;</code>
     */
    public Builder removeEvents(int index) {
      copyOnWrite();
      instance.removeEvents(index);
      return this;
    }

    /**
     * <pre>
     * Whether cryptographer is ready to encrypt and decrypt data.
     * </pre>
     *
     * <code>optional bool cryptographer_ready = 2;</code>
     */
    public boolean hasCryptographerReady() {
      return instance.hasCryptographerReady();
    }
    /**
     * <pre>
     * Whether cryptographer is ready to encrypt and decrypt data.
     * </pre>
     *
     * <code>optional bool cryptographer_ready = 2;</code>
     */
    public boolean getCryptographerReady() {
      return instance.getCryptographerReady();
    }
    /**
     * <pre>
     * Whether cryptographer is ready to encrypt and decrypt data.
     * </pre>
     *
     * <code>optional bool cryptographer_ready = 2;</code>
     */
    public Builder setCryptographerReady(boolean value) {
      copyOnWrite();
      instance.setCryptographerReady(value);
      return this;
    }
    /**
     * <pre>
     * Whether cryptographer is ready to encrypt and decrypt data.
     * </pre>
     *
     * <code>optional bool cryptographer_ready = 2;</code>
     */
    public Builder clearCryptographerReady() {
      copyOnWrite();
      instance.clearCryptographerReady();
      return this;
    }

    /**
     * <pre>
     * Cryptographer has pending keys which indicates the correct passphrase
     * has not been provided yet.
     * </pre>
     *
     * <code>optional bool cryptographer_has_pending_keys = 3;</code>
     */
    public boolean hasCryptographerHasPendingKeys() {
      return instance.hasCryptographerHasPendingKeys();
    }
    /**
     * <pre>
     * Cryptographer has pending keys which indicates the correct passphrase
     * has not been provided yet.
     * </pre>
     *
     * <code>optional bool cryptographer_has_pending_keys = 3;</code>
     */
    public boolean getCryptographerHasPendingKeys() {
      return instance.getCryptographerHasPendingKeys();
    }
    /**
     * <pre>
     * Cryptographer has pending keys which indicates the correct passphrase
     * has not been provided yet.
     * </pre>
     *
     * <code>optional bool cryptographer_has_pending_keys = 3;</code>
     */
    public Builder setCryptographerHasPendingKeys(boolean value) {
      copyOnWrite();
      instance.setCryptographerHasPendingKeys(value);
      return this;
    }
    /**
     * <pre>
     * Cryptographer has pending keys which indicates the correct passphrase
     * has not been provided yet.
     * </pre>
     *
     * <code>optional bool cryptographer_has_pending_keys = 3;</code>
     */
    public Builder clearCryptographerHasPendingKeys() {
      copyOnWrite();
      instance.clearCryptographerHasPendingKeys();
      return this;
    }

    /**
     * <pre>
     * Indicates client has dropped some events to save bandwidth.
     * </pre>
     *
     * <code>optional bool events_dropped = 4;</code>
     */
    public boolean hasEventsDropped() {
      return instance.hasEventsDropped();
    }
    /**
     * <pre>
     * Indicates client has dropped some events to save bandwidth.
     * </pre>
     *
     * <code>optional bool events_dropped = 4;</code>
     */
    public boolean getEventsDropped() {
      return instance.getEventsDropped();
    }
    /**
     * <pre>
     * Indicates client has dropped some events to save bandwidth.
     * </pre>
     *
     * <code>optional bool events_dropped = 4;</code>
     */
    public Builder setEventsDropped(boolean value) {
      copyOnWrite();
      instance.setEventsDropped(value);
      return this;
    }
    /**
     * <pre>
     * Indicates client has dropped some events to save bandwidth.
     * </pre>
     *
     * <code>optional bool events_dropped = 4;</code>
     */
    public Builder clearEventsDropped() {
      copyOnWrite();
      instance.clearEventsDropped();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sync_pb.DebugInfo)
  }
  private byte memoizedIsInitialized = -1;
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.components.sync.protocol.DebugInfo();
      }
      case IS_INITIALIZED: {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1) return DEFAULT_INSTANCE;
        if (isInitialized == 0) return null;

        boolean shouldMemoize = ((Boolean) arg0).booleanValue();
        for (int i = 0; i < getEventsCount(); i++) {
          if (!getEvents(i).isInitialized()) {
            if (shouldMemoize) {
              memoizedIsInitialized = 0;
            }
            return null;
          }
        }
        if (shouldMemoize) memoizedIsInitialized = 1;
        return DEFAULT_INSTANCE;

      }
      case MAKE_IMMUTABLE: {
        events_.makeImmutable();
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        org.chromium.components.sync.protocol.DebugInfo other = (org.chromium.components.sync.protocol.DebugInfo) arg1;
        events_= visitor.visitList(events_, other.events_);
        cryptographerReady_ = visitor.visitBoolean(
            hasCryptographerReady(), cryptographerReady_,
            other.hasCryptographerReady(), other.cryptographerReady_);
        cryptographerHasPendingKeys_ = visitor.visitBoolean(
            hasCryptographerHasPendingKeys(), cryptographerHasPendingKeys_,
            other.hasCryptographerHasPendingKeys(), other.cryptographerHasPendingKeys_);
        eventsDropped_ = visitor.visitBoolean(
            hasEventsDropped(), eventsDropped_,
            other.hasEventsDropped(), other.eventsDropped_);
        if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
            .INSTANCE) {
          bitField0_ |= other.bitField0_;
        }
        return this;
      }
      case MERGE_FROM_STREAM: {
        com.google.protobuf.CodedInputStream input =
            (com.google.protobuf.CodedInputStream) arg0;
        com.google.protobuf.ExtensionRegistryLite extensionRegistry =
            (com.google.protobuf.ExtensionRegistryLite) arg1;
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              default: {
                if (!parseUnknownField(tag, input)) {
                  done = true;
                }
                break;
              }
              case 10: {
                if (!events_.isModifiable()) {
                  events_ =
                      com.google.protobuf.GeneratedMessageLite.mutableCopy(events_);
                }
                events_.add(
                    input.readMessage(org.chromium.components.sync.protocol.DebugEventInfo.parser(), extensionRegistry));
                break;
              }
              case 16: {
                bitField0_ |= 0x00000001;
                cryptographerReady_ = input.readBool();
                break;
              }
              case 24: {
                bitField0_ |= 0x00000002;
                cryptographerHasPendingKeys_ = input.readBool();
                break;
              }
              case 32: {
                bitField0_ |= 0x00000004;
                eventsDropped_ = input.readBool();
                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw new RuntimeException(e.setUnfinishedMessage(this));
        } catch (java.io.IOException e) {
          throw new RuntimeException(
              new com.google.protobuf.InvalidProtocolBufferException(
                  e.getMessage()).setUnfinishedMessage(this));
        } finally {
        }
      }
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        if (PARSER == null) {    synchronized (org.chromium.components.sync.protocol.DebugInfo.class) {
            if (PARSER == null) {
              PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
            }
          }
        }
        return PARSER;
      }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:sync_pb.DebugInfo)
  private static final org.chromium.components.sync.protocol.DebugInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new DebugInfo();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static org.chromium.components.sync.protocol.DebugInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<DebugInfo> PARSER;

  public static com.google.protobuf.Parser<DebugInfo> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
