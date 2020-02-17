// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sharing_message.proto

package org.chromium.components.sync.protocol;

/**
 * <pre>
 * Message for acknowledging the sender after a non-AckMessage is received.
 * </pre>
 *
 * Protobuf type {@code chrome_browser_sharing.AckMessage}
 */
public  final class AckMessage extends
    com.google.protobuf.GeneratedMessageLite<
        AckMessage, AckMessage.Builder> implements
    // @@protoc_insertion_point(message_implements:chrome_browser_sharing.AckMessage)
    AckMessageOrBuilder {
  private AckMessage() {
    originalMessageId_ = "";
  }
  public static final int ORIGINAL_MESSAGE_ID_FIELD_NUMBER = 1;
  private java.lang.String originalMessageId_;
  /**
   * <pre>
   * required.
   * </pre>
   *
   * <code>optional string original_message_id = 1;</code>
   */
  public java.lang.String getOriginalMessageId() {
    return originalMessageId_;
  }
  /**
   * <pre>
   * required.
   * </pre>
   *
   * <code>optional string original_message_id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getOriginalMessageIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(originalMessageId_);
  }
  /**
   * <pre>
   * required.
   * </pre>
   *
   * <code>optional string original_message_id = 1;</code>
   */
  private void setOriginalMessageId(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    originalMessageId_ = value;
  }
  /**
   * <pre>
   * required.
   * </pre>
   *
   * <code>optional string original_message_id = 1;</code>
   */
  private void clearOriginalMessageId() {
    
    originalMessageId_ = getDefaultInstance().getOriginalMessageId();
  }
  /**
   * <pre>
   * required.
   * </pre>
   *
   * <code>optional string original_message_id = 1;</code>
   */
  private void setOriginalMessageIdBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    originalMessageId_ = value.toStringUtf8();
  }

  public static final int ORIGINAL_MESSAGE_TYPE_FIELD_NUMBER = 2;
  private int originalMessageType_;
  /**
   * <pre>
   * The type of message that this is acknowledging. optional.
   * </pre>
   *
   * <code>optional .chrome_browser_sharing.MessageType original_message_type = 2;</code>
   */
  public int getOriginalMessageTypeValue() {
    return originalMessageType_;
  }
  /**
   * <pre>
   * The type of message that this is acknowledging. optional.
   * </pre>
   *
   * <code>optional .chrome_browser_sharing.MessageType original_message_type = 2;</code>
   */
  public org.chromium.components.sync.protocol.MessageType getOriginalMessageType() {
    org.chromium.components.sync.protocol.MessageType result = org.chromium.components.sync.protocol.MessageType.forNumber(originalMessageType_);
    return result == null ? org.chromium.components.sync.protocol.MessageType.UNRECOGNIZED : result;
  }
  /**
   * <pre>
   * The type of message that this is acknowledging. optional.
   * </pre>
   *
   * <code>optional .chrome_browser_sharing.MessageType original_message_type = 2;</code>
   */
  private void setOriginalMessageTypeValue(int value) {
      originalMessageType_ = value;
  }
  /**
   * <pre>
   * The type of message that this is acknowledging. optional.
   * </pre>
   *
   * <code>optional .chrome_browser_sharing.MessageType original_message_type = 2;</code>
   */
  private void setOriginalMessageType(org.chromium.components.sync.protocol.MessageType value) {
    if (value == null) {
      throw new NullPointerException();
    }
    
    originalMessageType_ = value.getNumber();
  }
  /**
   * <pre>
   * The type of message that this is acknowledging. optional.
   * </pre>
   *
   * <code>optional .chrome_browser_sharing.MessageType original_message_type = 2;</code>
   */
  private void clearOriginalMessageType() {
    
    originalMessageType_ = 0;
  }

  public static final int RESPONSE_MESSAGE_FIELD_NUMBER = 3;
  private org.chromium.components.sync.protocol.ResponseMessage responseMessage_;
  /**
   * <pre>
   * Response of the message, optional.
   * </pre>
   *
   * <code>optional .chrome_browser_sharing.ResponseMessage response_message = 3;</code>
   */
  public boolean hasResponseMessage() {
    return responseMessage_ != null;
  }
  /**
   * <pre>
   * Response of the message, optional.
   * </pre>
   *
   * <code>optional .chrome_browser_sharing.ResponseMessage response_message = 3;</code>
   */
  public org.chromium.components.sync.protocol.ResponseMessage getResponseMessage() {
    return responseMessage_ == null ? org.chromium.components.sync.protocol.ResponseMessage.getDefaultInstance() : responseMessage_;
  }
  /**
   * <pre>
   * Response of the message, optional.
   * </pre>
   *
   * <code>optional .chrome_browser_sharing.ResponseMessage response_message = 3;</code>
   */
  private void setResponseMessage(org.chromium.components.sync.protocol.ResponseMessage value) {
    if (value == null) {
      throw new NullPointerException();
    }
    responseMessage_ = value;
    
    }
  /**
   * <pre>
   * Response of the message, optional.
   * </pre>
   *
   * <code>optional .chrome_browser_sharing.ResponseMessage response_message = 3;</code>
   */
  private void setResponseMessage(
      org.chromium.components.sync.protocol.ResponseMessage.Builder builderForValue) {
    responseMessage_ = builderForValue.build();
    
  }
  /**
   * <pre>
   * Response of the message, optional.
   * </pre>
   *
   * <code>optional .chrome_browser_sharing.ResponseMessage response_message = 3;</code>
   */
  private void mergeResponseMessage(org.chromium.components.sync.protocol.ResponseMessage value) {
    if (responseMessage_ != null &&
        responseMessage_ != org.chromium.components.sync.protocol.ResponseMessage.getDefaultInstance()) {
      responseMessage_ =
        org.chromium.components.sync.protocol.ResponseMessage.newBuilder(responseMessage_).mergeFrom(value).buildPartial();
    } else {
      responseMessage_ = value;
    }
    
  }
  /**
   * <pre>
   * Response of the message, optional.
   * </pre>
   *
   * <code>optional .chrome_browser_sharing.ResponseMessage response_message = 3;</code>
   */
  private void clearResponseMessage() {  responseMessage_ = null;
    
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!originalMessageId_.isEmpty()) {
      output.writeString(1, getOriginalMessageId());
    }
    if (originalMessageType_ != org.chromium.components.sync.protocol.MessageType.UNKNOWN_MESSAGE.getNumber()) {
      output.writeEnum(2, originalMessageType_);
    }
    if (responseMessage_ != null) {
      output.writeMessage(3, getResponseMessage());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (!originalMessageId_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, getOriginalMessageId());
    }
    if (originalMessageType_ != org.chromium.components.sync.protocol.MessageType.UNKNOWN_MESSAGE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, originalMessageType_);
    }
    if (responseMessage_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getResponseMessage());
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static org.chromium.components.sync.protocol.AckMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.AckMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.AckMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.AckMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.AckMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.AckMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.AckMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.AckMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.AckMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.AckMessage parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.chromium.components.sync.protocol.AckMessage prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * Message for acknowledging the sender after a non-AckMessage is received.
   * </pre>
   *
   * Protobuf type {@code chrome_browser_sharing.AckMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.components.sync.protocol.AckMessage, Builder> implements
      // @@protoc_insertion_point(builder_implements:chrome_browser_sharing.AckMessage)
      org.chromium.components.sync.protocol.AckMessageOrBuilder {
    // Construct using org.chromium.components.sync.protocol.AckMessage.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * required.
     * </pre>
     *
     * <code>optional string original_message_id = 1;</code>
     */
    public java.lang.String getOriginalMessageId() {
      return instance.getOriginalMessageId();
    }
    /**
     * <pre>
     * required.
     * </pre>
     *
     * <code>optional string original_message_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getOriginalMessageIdBytes() {
      return instance.getOriginalMessageIdBytes();
    }
    /**
     * <pre>
     * required.
     * </pre>
     *
     * <code>optional string original_message_id = 1;</code>
     */
    public Builder setOriginalMessageId(
        java.lang.String value) {
      copyOnWrite();
      instance.setOriginalMessageId(value);
      return this;
    }
    /**
     * <pre>
     * required.
     * </pre>
     *
     * <code>optional string original_message_id = 1;</code>
     */
    public Builder clearOriginalMessageId() {
      copyOnWrite();
      instance.clearOriginalMessageId();
      return this;
    }
    /**
     * <pre>
     * required.
     * </pre>
     *
     * <code>optional string original_message_id = 1;</code>
     */
    public Builder setOriginalMessageIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setOriginalMessageIdBytes(value);
      return this;
    }

    /**
     * <pre>
     * The type of message that this is acknowledging. optional.
     * </pre>
     *
     * <code>optional .chrome_browser_sharing.MessageType original_message_type = 2;</code>
     */
    public int getOriginalMessageTypeValue() {
      return instance.getOriginalMessageTypeValue();
    }
    /**
     * <pre>
     * The type of message that this is acknowledging. optional.
     * </pre>
     *
     * <code>optional .chrome_browser_sharing.MessageType original_message_type = 2;</code>
     */
    public Builder setOriginalMessageTypeValue(int value) {
      copyOnWrite();
      instance.setOriginalMessageTypeValue(value);
      return this;
    }
    /**
     * <pre>
     * The type of message that this is acknowledging. optional.
     * </pre>
     *
     * <code>optional .chrome_browser_sharing.MessageType original_message_type = 2;</code>
     */
    public org.chromium.components.sync.protocol.MessageType getOriginalMessageType() {
      return instance.getOriginalMessageType();
    }
    /**
     * <pre>
     * The type of message that this is acknowledging. optional.
     * </pre>
     *
     * <code>optional .chrome_browser_sharing.MessageType original_message_type = 2;</code>
     */
    public Builder setOriginalMessageType(org.chromium.components.sync.protocol.MessageType value) {
      copyOnWrite();
      instance.setOriginalMessageType(value);
      return this;
    }
    /**
     * <pre>
     * The type of message that this is acknowledging. optional.
     * </pre>
     *
     * <code>optional .chrome_browser_sharing.MessageType original_message_type = 2;</code>
     */
    public Builder clearOriginalMessageType() {
      copyOnWrite();
      instance.clearOriginalMessageType();
      return this;
    }

    /**
     * <pre>
     * Response of the message, optional.
     * </pre>
     *
     * <code>optional .chrome_browser_sharing.ResponseMessage response_message = 3;</code>
     */
    public boolean hasResponseMessage() {
      return instance.hasResponseMessage();
    }
    /**
     * <pre>
     * Response of the message, optional.
     * </pre>
     *
     * <code>optional .chrome_browser_sharing.ResponseMessage response_message = 3;</code>
     */
    public org.chromium.components.sync.protocol.ResponseMessage getResponseMessage() {
      return instance.getResponseMessage();
    }
    /**
     * <pre>
     * Response of the message, optional.
     * </pre>
     *
     * <code>optional .chrome_browser_sharing.ResponseMessage response_message = 3;</code>
     */
    public Builder setResponseMessage(org.chromium.components.sync.protocol.ResponseMessage value) {
      copyOnWrite();
      instance.setResponseMessage(value);
      return this;
      }
    /**
     * <pre>
     * Response of the message, optional.
     * </pre>
     *
     * <code>optional .chrome_browser_sharing.ResponseMessage response_message = 3;</code>
     */
    public Builder setResponseMessage(
        org.chromium.components.sync.protocol.ResponseMessage.Builder builderForValue) {
      copyOnWrite();
      instance.setResponseMessage(builderForValue);
      return this;
    }
    /**
     * <pre>
     * Response of the message, optional.
     * </pre>
     *
     * <code>optional .chrome_browser_sharing.ResponseMessage response_message = 3;</code>
     */
    public Builder mergeResponseMessage(org.chromium.components.sync.protocol.ResponseMessage value) {
      copyOnWrite();
      instance.mergeResponseMessage(value);
      return this;
    }
    /**
     * <pre>
     * Response of the message, optional.
     * </pre>
     *
     * <code>optional .chrome_browser_sharing.ResponseMessage response_message = 3;</code>
     */
    public Builder clearResponseMessage() {  copyOnWrite();
      instance.clearResponseMessage();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:chrome_browser_sharing.AckMessage)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.components.sync.protocol.AckMessage();
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
        org.chromium.components.sync.protocol.AckMessage other = (org.chromium.components.sync.protocol.AckMessage) arg1;
        originalMessageId_ = visitor.visitString(!originalMessageId_.isEmpty(), originalMessageId_,
            !other.originalMessageId_.isEmpty(), other.originalMessageId_);
        originalMessageType_ = visitor.visitInt(originalMessageType_ != 0, originalMessageType_,    other.originalMessageType_ != 0, other.originalMessageType_);
        responseMessage_ = visitor.visitMessage(responseMessage_, other.responseMessage_);
        if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
            .INSTANCE) {
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
                if (!input.skipField(tag)) {
                  done = true;
                }
                break;
              }
              case 10: {
                String s = input.readStringRequireUtf8();

                originalMessageId_ = s;
                break;
              }
              case 16: {
                int rawValue = input.readEnum();

                originalMessageType_ = rawValue;
                break;
              }
              case 26: {
                org.chromium.components.sync.protocol.ResponseMessage.Builder subBuilder = null;
                if (responseMessage_ != null) {
                  subBuilder = responseMessage_.toBuilder();
                }
                responseMessage_ = input.readMessage(org.chromium.components.sync.protocol.ResponseMessage.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(responseMessage_);
                  responseMessage_ = subBuilder.buildPartial();
                }

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
        if (PARSER == null) {    synchronized (org.chromium.components.sync.protocol.AckMessage.class) {
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


  // @@protoc_insertion_point(class_scope:chrome_browser_sharing.AckMessage)
  private static final org.chromium.components.sync.protocol.AckMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new AckMessage();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static org.chromium.components.sync.protocol.AckMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<AckMessage> PARSER;

  public static com.google.protobuf.Parser<AckMessage> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

