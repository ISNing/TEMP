// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: components/feed/core/proto/libraries/basicstream/internal/stream_saved_instance_state.proto

package org.chromium.components.feed.core.proto.libraries.basicstream.internal;

public final class StreamSavedInstanceStateProto {
  private StreamSavedInstanceStateProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface StreamSavedInstanceStateOrBuilder extends
      // @@protoc_insertion_point(interface_extends:components.feed.core.proto.libraries.basicstream.internal.StreamSavedInstanceState)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>optional string session_id = 1;</code>
     */
    boolean hasSessionId();
    /**
     * <code>optional string session_id = 1;</code>
     */
    java.lang.String getSessionId();
    /**
     * <code>optional string session_id = 1;</code>
     */
    com.google.protobuf.ByteString
        getSessionIdBytes();

    /**
     * <code>optional .components.feed.core.proto.libraries.sharedstream.ScrollState scroll_state = 2;</code>
     */
    boolean hasScrollState();
    /**
     * <code>optional .components.feed.core.proto.libraries.sharedstream.ScrollState scroll_state = 2;</code>
     */
    org.chromium.components.feed.core.proto.libraries.sharedstream.ScrollStateProto.ScrollState getScrollState();
  }
  /**
   * <pre>
   * Object representing the state of the Stream.
   * </pre>
   *
   * Protobuf type {@code components.feed.core.proto.libraries.basicstream.internal.StreamSavedInstanceState}
   */
  public  static final class StreamSavedInstanceState extends
      com.google.protobuf.GeneratedMessageLite<
          StreamSavedInstanceState, StreamSavedInstanceState.Builder> implements
      // @@protoc_insertion_point(message_implements:components.feed.core.proto.libraries.basicstream.internal.StreamSavedInstanceState)
      StreamSavedInstanceStateOrBuilder {
    private StreamSavedInstanceState() {
      sessionId_ = "";
    }
    private int bitField0_;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private java.lang.String sessionId_;
    /**
     * <code>optional string session_id = 1;</code>
     */
    public boolean hasSessionId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string session_id = 1;</code>
     */
    public java.lang.String getSessionId() {
      return sessionId_;
    }
    /**
     * <code>optional string session_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSessionIdBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(sessionId_);
    }
    /**
     * <code>optional string session_id = 1;</code>
     */
    private void setSessionId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      sessionId_ = value;
    }
    /**
     * <code>optional string session_id = 1;</code>
     */
    private void clearSessionId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      sessionId_ = getDefaultInstance().getSessionId();
    }
    /**
     * <code>optional string session_id = 1;</code>
     */
    private void setSessionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      sessionId_ = value.toStringUtf8();
    }

    public static final int SCROLL_STATE_FIELD_NUMBER = 2;
    private org.chromium.components.feed.core.proto.libraries.sharedstream.ScrollStateProto.ScrollState scrollState_;
    /**
     * <code>optional .components.feed.core.proto.libraries.sharedstream.ScrollState scroll_state = 2;</code>
     */
    public boolean hasScrollState() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional .components.feed.core.proto.libraries.sharedstream.ScrollState scroll_state = 2;</code>
     */
    public org.chromium.components.feed.core.proto.libraries.sharedstream.ScrollStateProto.ScrollState getScrollState() {
      return scrollState_ == null ? org.chromium.components.feed.core.proto.libraries.sharedstream.ScrollStateProto.ScrollState.getDefaultInstance() : scrollState_;
    }
    /**
     * <code>optional .components.feed.core.proto.libraries.sharedstream.ScrollState scroll_state = 2;</code>
     */
    private void setScrollState(org.chromium.components.feed.core.proto.libraries.sharedstream.ScrollStateProto.ScrollState value) {
      if (value == null) {
        throw new NullPointerException();
      }
      scrollState_ = value;
      bitField0_ |= 0x00000002;
      }
    /**
     * <code>optional .components.feed.core.proto.libraries.sharedstream.ScrollState scroll_state = 2;</code>
     */
    private void setScrollState(
        org.chromium.components.feed.core.proto.libraries.sharedstream.ScrollStateProto.ScrollState.Builder builderForValue) {
      scrollState_ = builderForValue.build();
      bitField0_ |= 0x00000002;
    }
    /**
     * <code>optional .components.feed.core.proto.libraries.sharedstream.ScrollState scroll_state = 2;</code>
     */
    private void mergeScrollState(org.chromium.components.feed.core.proto.libraries.sharedstream.ScrollStateProto.ScrollState value) {
      if (scrollState_ != null &&
          scrollState_ != org.chromium.components.feed.core.proto.libraries.sharedstream.ScrollStateProto.ScrollState.getDefaultInstance()) {
        scrollState_ =
          org.chromium.components.feed.core.proto.libraries.sharedstream.ScrollStateProto.ScrollState.newBuilder(scrollState_).mergeFrom(value).buildPartial();
      } else {
        scrollState_ = value;
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <code>optional .components.feed.core.proto.libraries.sharedstream.ScrollState scroll_state = 2;</code>
     */
    private void clearScrollState() {  scrollState_ = null;
      bitField0_ = (bitField0_ & ~0x00000002);
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeString(1, getSessionId());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, getScrollState());
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getSessionId());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getScrollState());
      }
      size += unknownFields.getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    public static org.chromium.components.feed.core.proto.libraries.basicstream.internal.StreamSavedInstanceStateProto.StreamSavedInstanceState parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.components.feed.core.proto.libraries.basicstream.internal.StreamSavedInstanceStateProto.StreamSavedInstanceState parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.components.feed.core.proto.libraries.basicstream.internal.StreamSavedInstanceStateProto.StreamSavedInstanceState parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.components.feed.core.proto.libraries.basicstream.internal.StreamSavedInstanceStateProto.StreamSavedInstanceState parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.components.feed.core.proto.libraries.basicstream.internal.StreamSavedInstanceStateProto.StreamSavedInstanceState parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static org.chromium.components.feed.core.proto.libraries.basicstream.internal.StreamSavedInstanceStateProto.StreamSavedInstanceState parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static org.chromium.components.feed.core.proto.libraries.basicstream.internal.StreamSavedInstanceStateProto.StreamSavedInstanceState parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static org.chromium.components.feed.core.proto.libraries.basicstream.internal.StreamSavedInstanceStateProto.StreamSavedInstanceState parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static org.chromium.components.feed.core.proto.libraries.basicstream.internal.StreamSavedInstanceStateProto.StreamSavedInstanceState parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static org.chromium.components.feed.core.proto.libraries.basicstream.internal.StreamSavedInstanceStateProto.StreamSavedInstanceState parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(org.chromium.components.feed.core.proto.libraries.basicstream.internal.StreamSavedInstanceStateProto.StreamSavedInstanceState prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * <pre>
     * Object representing the state of the Stream.
     * </pre>
     *
     * Protobuf type {@code components.feed.core.proto.libraries.basicstream.internal.StreamSavedInstanceState}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          org.chromium.components.feed.core.proto.libraries.basicstream.internal.StreamSavedInstanceStateProto.StreamSavedInstanceState, Builder> implements
        // @@protoc_insertion_point(builder_implements:components.feed.core.proto.libraries.basicstream.internal.StreamSavedInstanceState)
        org.chromium.components.feed.core.proto.libraries.basicstream.internal.StreamSavedInstanceStateProto.StreamSavedInstanceStateOrBuilder {
      // Construct using org.chromium.components.feed.core.proto.libraries.basicstream.internal.StreamSavedInstanceStateProto.StreamSavedInstanceState.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>optional string session_id = 1;</code>
       */
      public boolean hasSessionId() {
        return instance.hasSessionId();
      }
      /**
       * <code>optional string session_id = 1;</code>
       */
      public java.lang.String getSessionId() {
        return instance.getSessionId();
      }
      /**
       * <code>optional string session_id = 1;</code>
       */
      public com.google.protobuf.ByteString
          getSessionIdBytes() {
        return instance.getSessionIdBytes();
      }
      /**
       * <code>optional string session_id = 1;</code>
       */
      public Builder setSessionId(
          java.lang.String value) {
        copyOnWrite();
        instance.setSessionId(value);
        return this;
      }
      /**
       * <code>optional string session_id = 1;</code>
       */
      public Builder clearSessionId() {
        copyOnWrite();
        instance.clearSessionId();
        return this;
      }
      /**
       * <code>optional string session_id = 1;</code>
       */
      public Builder setSessionIdBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setSessionIdBytes(value);
        return this;
      }

      /**
       * <code>optional .components.feed.core.proto.libraries.sharedstream.ScrollState scroll_state = 2;</code>
       */
      public boolean hasScrollState() {
        return instance.hasScrollState();
      }
      /**
       * <code>optional .components.feed.core.proto.libraries.sharedstream.ScrollState scroll_state = 2;</code>
       */
      public org.chromium.components.feed.core.proto.libraries.sharedstream.ScrollStateProto.ScrollState getScrollState() {
        return instance.getScrollState();
      }
      /**
       * <code>optional .components.feed.core.proto.libraries.sharedstream.ScrollState scroll_state = 2;</code>
       */
      public Builder setScrollState(org.chromium.components.feed.core.proto.libraries.sharedstream.ScrollStateProto.ScrollState value) {
        copyOnWrite();
        instance.setScrollState(value);
        return this;
        }
      /**
       * <code>optional .components.feed.core.proto.libraries.sharedstream.ScrollState scroll_state = 2;</code>
       */
      public Builder setScrollState(
          org.chromium.components.feed.core.proto.libraries.sharedstream.ScrollStateProto.ScrollState.Builder builderForValue) {
        copyOnWrite();
        instance.setScrollState(builderForValue);
        return this;
      }
      /**
       * <code>optional .components.feed.core.proto.libraries.sharedstream.ScrollState scroll_state = 2;</code>
       */
      public Builder mergeScrollState(org.chromium.components.feed.core.proto.libraries.sharedstream.ScrollStateProto.ScrollState value) {
        copyOnWrite();
        instance.mergeScrollState(value);
        return this;
      }
      /**
       * <code>optional .components.feed.core.proto.libraries.sharedstream.ScrollState scroll_state = 2;</code>
       */
      public Builder clearScrollState() {  copyOnWrite();
        instance.clearScrollState();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:components.feed.core.proto.libraries.basicstream.internal.StreamSavedInstanceState)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new org.chromium.components.feed.core.proto.libraries.basicstream.internal.StreamSavedInstanceStateProto.StreamSavedInstanceState();
        }
        case IS_INITIALIZED: {
          return DEFAULT_INSTANCE;
        }
        case MAKE_IMMUTABLE: {
          return null;
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          org.chromium.components.feed.core.proto.libraries.basicstream.internal.StreamSavedInstanceStateProto.StreamSavedInstanceState other = (org.chromium.components.feed.core.proto.libraries.basicstream.internal.StreamSavedInstanceStateProto.StreamSavedInstanceState) arg1;
          sessionId_ = visitor.visitString(
              hasSessionId(), sessionId_,
              other.hasSessionId(), other.sessionId_);
          scrollState_ = visitor.visitMessage(scrollState_, other.scrollState_);
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
                  String s = input.readString();
                  bitField0_ |= 0x00000001;
                  sessionId_ = s;
                  break;
                }
                case 18: {
                  org.chromium.components.feed.core.proto.libraries.sharedstream.ScrollStateProto.ScrollState.Builder subBuilder = null;
                  if (((bitField0_ & 0x00000002) == 0x00000002)) {
                    subBuilder = scrollState_.toBuilder();
                  }
                  scrollState_ = input.readMessage(org.chromium.components.feed.core.proto.libraries.sharedstream.ScrollStateProto.ScrollState.parser(), extensionRegistry);
                  if (subBuilder != null) {
                    subBuilder.mergeFrom(scrollState_);
                    scrollState_ = subBuilder.buildPartial();
                  }
                  bitField0_ |= 0x00000002;
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
          if (PARSER == null) {    synchronized (org.chromium.components.feed.core.proto.libraries.basicstream.internal.StreamSavedInstanceStateProto.StreamSavedInstanceState.class) {
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


    // @@protoc_insertion_point(class_scope:components.feed.core.proto.libraries.basicstream.internal.StreamSavedInstanceState)
    private static final org.chromium.components.feed.core.proto.libraries.basicstream.internal.StreamSavedInstanceStateProto.StreamSavedInstanceState DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new StreamSavedInstanceState();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static org.chromium.components.feed.core.proto.libraries.basicstream.internal.StreamSavedInstanceStateProto.StreamSavedInstanceState getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<StreamSavedInstanceState> PARSER;

    public static com.google.protobuf.Parser<StreamSavedInstanceState> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
