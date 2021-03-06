// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: components/feed/core/proto/wire/piet_shared_state_item.proto

package org.chromium.components.feed.core.proto.wire;

public final class PietSharedStateItemProto {
  private PietSharedStateItemProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface PietSharedStateItemOrBuilder extends
      // @@protoc_insertion_point(interface_extends:components.feed.core.proto.wire.PietSharedStateItem)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     * ContentId identifying the shared state.
     * </pre>
     *
     * <code>optional .components.feed.core.proto.wire.ContentId content_id = 1;</code>
     */
    boolean hasContentId();
    /**
     * <pre>
     * ContentId identifying the shared state.
     * </pre>
     *
     * <code>optional .components.feed.core.proto.wire.ContentId content_id = 1;</code>
     */
    org.chromium.components.feed.core.proto.wire.ContentIdProto.ContentId getContentId();

    /**
     * <pre>
     * A Piet Shared State which is used by a set of Piet cards.
     * </pre>
     *
     * <code>optional .components.feed.core.proto.ui.piet.PietSharedState piet_shared_state = 2;</code>
     */
    boolean hasPietSharedState();
    /**
     * <pre>
     * A Piet Shared State which is used by a set of Piet cards.
     * </pre>
     *
     * <code>optional .components.feed.core.proto.ui.piet.PietSharedState piet_shared_state = 2;</code>
     */
    org.chromium.components.feed.core.proto.ui.piet.PietProto.PietSharedState getPietSharedState();
  }
  /**
   * <pre>
   * This is a metadata payload containing a Piet Shared State.
   * </pre>
   *
   * Protobuf type {@code components.feed.core.proto.wire.PietSharedStateItem}
   */
  public  static final class PietSharedStateItem extends
      com.google.protobuf.GeneratedMessageLite<
          PietSharedStateItem, PietSharedStateItem.Builder> implements
      // @@protoc_insertion_point(message_implements:components.feed.core.proto.wire.PietSharedStateItem)
      PietSharedStateItemOrBuilder {
    private PietSharedStateItem() {
    }
    private int bitField0_;
    public static final int CONTENT_ID_FIELD_NUMBER = 1;
    private org.chromium.components.feed.core.proto.wire.ContentIdProto.ContentId contentId_;
    /**
     * <pre>
     * ContentId identifying the shared state.
     * </pre>
     *
     * <code>optional .components.feed.core.proto.wire.ContentId content_id = 1;</code>
     */
    public boolean hasContentId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <pre>
     * ContentId identifying the shared state.
     * </pre>
     *
     * <code>optional .components.feed.core.proto.wire.ContentId content_id = 1;</code>
     */
    public org.chromium.components.feed.core.proto.wire.ContentIdProto.ContentId getContentId() {
      return contentId_ == null ? org.chromium.components.feed.core.proto.wire.ContentIdProto.ContentId.getDefaultInstance() : contentId_;
    }
    /**
     * <pre>
     * ContentId identifying the shared state.
     * </pre>
     *
     * <code>optional .components.feed.core.proto.wire.ContentId content_id = 1;</code>
     */
    private void setContentId(org.chromium.components.feed.core.proto.wire.ContentIdProto.ContentId value) {
      if (value == null) {
        throw new NullPointerException();
      }
      contentId_ = value;
      bitField0_ |= 0x00000001;
      }
    /**
     * <pre>
     * ContentId identifying the shared state.
     * </pre>
     *
     * <code>optional .components.feed.core.proto.wire.ContentId content_id = 1;</code>
     */
    private void setContentId(
        org.chromium.components.feed.core.proto.wire.ContentIdProto.ContentId.Builder builderForValue) {
      contentId_ = builderForValue.build();
      bitField0_ |= 0x00000001;
    }
    /**
     * <pre>
     * ContentId identifying the shared state.
     * </pre>
     *
     * <code>optional .components.feed.core.proto.wire.ContentId content_id = 1;</code>
     */
    private void mergeContentId(org.chromium.components.feed.core.proto.wire.ContentIdProto.ContentId value) {
      if (contentId_ != null &&
          contentId_ != org.chromium.components.feed.core.proto.wire.ContentIdProto.ContentId.getDefaultInstance()) {
        contentId_ =
          org.chromium.components.feed.core.proto.wire.ContentIdProto.ContentId.newBuilder(contentId_).mergeFrom(value).buildPartial();
      } else {
        contentId_ = value;
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <pre>
     * ContentId identifying the shared state.
     * </pre>
     *
     * <code>optional .components.feed.core.proto.wire.ContentId content_id = 1;</code>
     */
    private void clearContentId() {  contentId_ = null;
      bitField0_ = (bitField0_ & ~0x00000001);
    }

    public static final int PIET_SHARED_STATE_FIELD_NUMBER = 2;
    private org.chromium.components.feed.core.proto.ui.piet.PietProto.PietSharedState pietSharedState_;
    /**
     * <pre>
     * A Piet Shared State which is used by a set of Piet cards.
     * </pre>
     *
     * <code>optional .components.feed.core.proto.ui.piet.PietSharedState piet_shared_state = 2;</code>
     */
    public boolean hasPietSharedState() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <pre>
     * A Piet Shared State which is used by a set of Piet cards.
     * </pre>
     *
     * <code>optional .components.feed.core.proto.ui.piet.PietSharedState piet_shared_state = 2;</code>
     */
    public org.chromium.components.feed.core.proto.ui.piet.PietProto.PietSharedState getPietSharedState() {
      return pietSharedState_ == null ? org.chromium.components.feed.core.proto.ui.piet.PietProto.PietSharedState.getDefaultInstance() : pietSharedState_;
    }
    /**
     * <pre>
     * A Piet Shared State which is used by a set of Piet cards.
     * </pre>
     *
     * <code>optional .components.feed.core.proto.ui.piet.PietSharedState piet_shared_state = 2;</code>
     */
    private void setPietSharedState(org.chromium.components.feed.core.proto.ui.piet.PietProto.PietSharedState value) {
      if (value == null) {
        throw new NullPointerException();
      }
      pietSharedState_ = value;
      bitField0_ |= 0x00000002;
      }
    /**
     * <pre>
     * A Piet Shared State which is used by a set of Piet cards.
     * </pre>
     *
     * <code>optional .components.feed.core.proto.ui.piet.PietSharedState piet_shared_state = 2;</code>
     */
    private void setPietSharedState(
        org.chromium.components.feed.core.proto.ui.piet.PietProto.PietSharedState.Builder builderForValue) {
      pietSharedState_ = builderForValue.build();
      bitField0_ |= 0x00000002;
    }
    /**
     * <pre>
     * A Piet Shared State which is used by a set of Piet cards.
     * </pre>
     *
     * <code>optional .components.feed.core.proto.ui.piet.PietSharedState piet_shared_state = 2;</code>
     */
    private void mergePietSharedState(org.chromium.components.feed.core.proto.ui.piet.PietProto.PietSharedState value) {
      if (pietSharedState_ != null &&
          pietSharedState_ != org.chromium.components.feed.core.proto.ui.piet.PietProto.PietSharedState.getDefaultInstance()) {
        pietSharedState_ =
          org.chromium.components.feed.core.proto.ui.piet.PietProto.PietSharedState.newBuilder(pietSharedState_).mergeFrom(value).buildPartial();
      } else {
        pietSharedState_ = value;
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <pre>
     * A Piet Shared State which is used by a set of Piet cards.
     * </pre>
     *
     * <code>optional .components.feed.core.proto.ui.piet.PietSharedState piet_shared_state = 2;</code>
     */
    private void clearPietSharedState() {  pietSharedState_ = null;
      bitField0_ = (bitField0_ & ~0x00000002);
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getContentId());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, getPietSharedState());
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getContentId());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getPietSharedState());
      }
      size += unknownFields.getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    public static org.chromium.components.feed.core.proto.wire.PietSharedStateItemProto.PietSharedStateItem parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.components.feed.core.proto.wire.PietSharedStateItemProto.PietSharedStateItem parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.components.feed.core.proto.wire.PietSharedStateItemProto.PietSharedStateItem parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.components.feed.core.proto.wire.PietSharedStateItemProto.PietSharedStateItem parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.components.feed.core.proto.wire.PietSharedStateItemProto.PietSharedStateItem parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static org.chromium.components.feed.core.proto.wire.PietSharedStateItemProto.PietSharedStateItem parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static org.chromium.components.feed.core.proto.wire.PietSharedStateItemProto.PietSharedStateItem parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static org.chromium.components.feed.core.proto.wire.PietSharedStateItemProto.PietSharedStateItem parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static org.chromium.components.feed.core.proto.wire.PietSharedStateItemProto.PietSharedStateItem parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static org.chromium.components.feed.core.proto.wire.PietSharedStateItemProto.PietSharedStateItem parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(org.chromium.components.feed.core.proto.wire.PietSharedStateItemProto.PietSharedStateItem prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * <pre>
     * This is a metadata payload containing a Piet Shared State.
     * </pre>
     *
     * Protobuf type {@code components.feed.core.proto.wire.PietSharedStateItem}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          org.chromium.components.feed.core.proto.wire.PietSharedStateItemProto.PietSharedStateItem, Builder> implements
        // @@protoc_insertion_point(builder_implements:components.feed.core.proto.wire.PietSharedStateItem)
        org.chromium.components.feed.core.proto.wire.PietSharedStateItemProto.PietSharedStateItemOrBuilder {
      // Construct using org.chromium.components.feed.core.proto.wire.PietSharedStateItemProto.PietSharedStateItem.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       * ContentId identifying the shared state.
       * </pre>
       *
       * <code>optional .components.feed.core.proto.wire.ContentId content_id = 1;</code>
       */
      public boolean hasContentId() {
        return instance.hasContentId();
      }
      /**
       * <pre>
       * ContentId identifying the shared state.
       * </pre>
       *
       * <code>optional .components.feed.core.proto.wire.ContentId content_id = 1;</code>
       */
      public org.chromium.components.feed.core.proto.wire.ContentIdProto.ContentId getContentId() {
        return instance.getContentId();
      }
      /**
       * <pre>
       * ContentId identifying the shared state.
       * </pre>
       *
       * <code>optional .components.feed.core.proto.wire.ContentId content_id = 1;</code>
       */
      public Builder setContentId(org.chromium.components.feed.core.proto.wire.ContentIdProto.ContentId value) {
        copyOnWrite();
        instance.setContentId(value);
        return this;
        }
      /**
       * <pre>
       * ContentId identifying the shared state.
       * </pre>
       *
       * <code>optional .components.feed.core.proto.wire.ContentId content_id = 1;</code>
       */
      public Builder setContentId(
          org.chromium.components.feed.core.proto.wire.ContentIdProto.ContentId.Builder builderForValue) {
        copyOnWrite();
        instance.setContentId(builderForValue);
        return this;
      }
      /**
       * <pre>
       * ContentId identifying the shared state.
       * </pre>
       *
       * <code>optional .components.feed.core.proto.wire.ContentId content_id = 1;</code>
       */
      public Builder mergeContentId(org.chromium.components.feed.core.proto.wire.ContentIdProto.ContentId value) {
        copyOnWrite();
        instance.mergeContentId(value);
        return this;
      }
      /**
       * <pre>
       * ContentId identifying the shared state.
       * </pre>
       *
       * <code>optional .components.feed.core.proto.wire.ContentId content_id = 1;</code>
       */
      public Builder clearContentId() {  copyOnWrite();
        instance.clearContentId();
        return this;
      }

      /**
       * <pre>
       * A Piet Shared State which is used by a set of Piet cards.
       * </pre>
       *
       * <code>optional .components.feed.core.proto.ui.piet.PietSharedState piet_shared_state = 2;</code>
       */
      public boolean hasPietSharedState() {
        return instance.hasPietSharedState();
      }
      /**
       * <pre>
       * A Piet Shared State which is used by a set of Piet cards.
       * </pre>
       *
       * <code>optional .components.feed.core.proto.ui.piet.PietSharedState piet_shared_state = 2;</code>
       */
      public org.chromium.components.feed.core.proto.ui.piet.PietProto.PietSharedState getPietSharedState() {
        return instance.getPietSharedState();
      }
      /**
       * <pre>
       * A Piet Shared State which is used by a set of Piet cards.
       * </pre>
       *
       * <code>optional .components.feed.core.proto.ui.piet.PietSharedState piet_shared_state = 2;</code>
       */
      public Builder setPietSharedState(org.chromium.components.feed.core.proto.ui.piet.PietProto.PietSharedState value) {
        copyOnWrite();
        instance.setPietSharedState(value);
        return this;
        }
      /**
       * <pre>
       * A Piet Shared State which is used by a set of Piet cards.
       * </pre>
       *
       * <code>optional .components.feed.core.proto.ui.piet.PietSharedState piet_shared_state = 2;</code>
       */
      public Builder setPietSharedState(
          org.chromium.components.feed.core.proto.ui.piet.PietProto.PietSharedState.Builder builderForValue) {
        copyOnWrite();
        instance.setPietSharedState(builderForValue);
        return this;
      }
      /**
       * <pre>
       * A Piet Shared State which is used by a set of Piet cards.
       * </pre>
       *
       * <code>optional .components.feed.core.proto.ui.piet.PietSharedState piet_shared_state = 2;</code>
       */
      public Builder mergePietSharedState(org.chromium.components.feed.core.proto.ui.piet.PietProto.PietSharedState value) {
        copyOnWrite();
        instance.mergePietSharedState(value);
        return this;
      }
      /**
       * <pre>
       * A Piet Shared State which is used by a set of Piet cards.
       * </pre>
       *
       * <code>optional .components.feed.core.proto.ui.piet.PietSharedState piet_shared_state = 2;</code>
       */
      public Builder clearPietSharedState() {  copyOnWrite();
        instance.clearPietSharedState();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:components.feed.core.proto.wire.PietSharedStateItem)
    }
    private byte memoizedIsInitialized = -1;
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new org.chromium.components.feed.core.proto.wire.PietSharedStateItemProto.PietSharedStateItem();
        }
        case IS_INITIALIZED: {
          byte isInitialized = memoizedIsInitialized;
          if (isInitialized == 1) return DEFAULT_INSTANCE;
          if (isInitialized == 0) return null;

          boolean shouldMemoize = ((Boolean) arg0).booleanValue();
          if (hasPietSharedState()) {
            if (!getPietSharedState().isInitialized()) {
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
          return null;
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          org.chromium.components.feed.core.proto.wire.PietSharedStateItemProto.PietSharedStateItem other = (org.chromium.components.feed.core.proto.wire.PietSharedStateItemProto.PietSharedStateItem) arg1;
          contentId_ = visitor.visitMessage(contentId_, other.contentId_);
          pietSharedState_ = visitor.visitMessage(pietSharedState_, other.pietSharedState_);
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
                  org.chromium.components.feed.core.proto.wire.ContentIdProto.ContentId.Builder subBuilder = null;
                  if (((bitField0_ & 0x00000001) == 0x00000001)) {
                    subBuilder = contentId_.toBuilder();
                  }
                  contentId_ = input.readMessage(org.chromium.components.feed.core.proto.wire.ContentIdProto.ContentId.parser(), extensionRegistry);
                  if (subBuilder != null) {
                    subBuilder.mergeFrom(contentId_);
                    contentId_ = subBuilder.buildPartial();
                  }
                  bitField0_ |= 0x00000001;
                  break;
                }
                case 18: {
                  org.chromium.components.feed.core.proto.ui.piet.PietProto.PietSharedState.Builder subBuilder = null;
                  if (((bitField0_ & 0x00000002) == 0x00000002)) {
                    subBuilder = pietSharedState_.toBuilder();
                  }
                  pietSharedState_ = input.readMessage(org.chromium.components.feed.core.proto.ui.piet.PietProto.PietSharedState.parser(), extensionRegistry);
                  if (subBuilder != null) {
                    subBuilder.mergeFrom(pietSharedState_);
                    pietSharedState_ = subBuilder.buildPartial();
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
          if (PARSER == null) {    synchronized (org.chromium.components.feed.core.proto.wire.PietSharedStateItemProto.PietSharedStateItem.class) {
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


    // @@protoc_insertion_point(class_scope:components.feed.core.proto.wire.PietSharedStateItem)
    private static final org.chromium.components.feed.core.proto.wire.PietSharedStateItemProto.PietSharedStateItem DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new PietSharedStateItem();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static org.chromium.components.feed.core.proto.wire.PietSharedStateItemProto.PietSharedStateItem getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<PietSharedStateItem> PARSER;

    public static com.google.protobuf.Parser<PietSharedStateItem> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
