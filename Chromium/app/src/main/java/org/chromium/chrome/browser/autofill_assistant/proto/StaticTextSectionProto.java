// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * <pre>
 * A section showing a simple text message.
 * </pre>
 *
 * Protobuf type {@code autofill_assistant.StaticTextSectionProto}
 */
public  final class StaticTextSectionProto extends
    com.google.protobuf.GeneratedMessageLite<
        StaticTextSectionProto, StaticTextSectionProto.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.StaticTextSectionProto)
    StaticTextSectionProtoOrBuilder {
  private StaticTextSectionProto() {
    text_ = "";
  }
  private int bitField0_;
  public static final int TEXT_FIELD_NUMBER = 1;
  private java.lang.String text_;
  /**
   * <pre>
   * The text to display. Can contain markup tags like &lt;b&gt;.
   * </pre>
   *
   * <code>optional string text = 1;</code>
   */
  public boolean hasText() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <pre>
   * The text to display. Can contain markup tags like &lt;b&gt;.
   * </pre>
   *
   * <code>optional string text = 1;</code>
   */
  public java.lang.String getText() {
    return text_;
  }
  /**
   * <pre>
   * The text to display. Can contain markup tags like &lt;b&gt;.
   * </pre>
   *
   * <code>optional string text = 1;</code>
   */
  public com.google.protobuf.ByteString
      getTextBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(text_);
  }
  /**
   * <pre>
   * The text to display. Can contain markup tags like &lt;b&gt;.
   * </pre>
   *
   * <code>optional string text = 1;</code>
   */
  private void setText(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
    text_ = value;
  }
  /**
   * <pre>
   * The text to display. Can contain markup tags like &lt;b&gt;.
   * </pre>
   *
   * <code>optional string text = 1;</code>
   */
  private void clearText() {
    bitField0_ = (bitField0_ & ~0x00000001);
    text_ = getDefaultInstance().getText();
  }
  /**
   * <pre>
   * The text to display. Can contain markup tags like &lt;b&gt;.
   * </pre>
   *
   * <code>optional string text = 1;</code>
   */
  private void setTextBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
    text_ = value.toStringUtf8();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeString(1, getText());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, getText());
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.StaticTextSectionProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.StaticTextSectionProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.StaticTextSectionProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.StaticTextSectionProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.StaticTextSectionProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.StaticTextSectionProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.StaticTextSectionProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.StaticTextSectionProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.StaticTextSectionProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.StaticTextSectionProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.StaticTextSectionProto prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * A section showing a simple text message.
   * </pre>
   *
   * Protobuf type {@code autofill_assistant.StaticTextSectionProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.StaticTextSectionProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.StaticTextSectionProto)
      org.chromium.chrome.browser.autofill_assistant.proto.StaticTextSectionProtoOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.StaticTextSectionProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The text to display. Can contain markup tags like &lt;b&gt;.
     * </pre>
     *
     * <code>optional string text = 1;</code>
     */
    public boolean hasText() {
      return instance.hasText();
    }
    /**
     * <pre>
     * The text to display. Can contain markup tags like &lt;b&gt;.
     * </pre>
     *
     * <code>optional string text = 1;</code>
     */
    public java.lang.String getText() {
      return instance.getText();
    }
    /**
     * <pre>
     * The text to display. Can contain markup tags like &lt;b&gt;.
     * </pre>
     *
     * <code>optional string text = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTextBytes() {
      return instance.getTextBytes();
    }
    /**
     * <pre>
     * The text to display. Can contain markup tags like &lt;b&gt;.
     * </pre>
     *
     * <code>optional string text = 1;</code>
     */
    public Builder setText(
        java.lang.String value) {
      copyOnWrite();
      instance.setText(value);
      return this;
    }
    /**
     * <pre>
     * The text to display. Can contain markup tags like &lt;b&gt;.
     * </pre>
     *
     * <code>optional string text = 1;</code>
     */
    public Builder clearText() {
      copyOnWrite();
      instance.clearText();
      return this;
    }
    /**
     * <pre>
     * The text to display. Can contain markup tags like &lt;b&gt;.
     * </pre>
     *
     * <code>optional string text = 1;</code>
     */
    public Builder setTextBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setTextBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.StaticTextSectionProto)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.StaticTextSectionProto();
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
        org.chromium.chrome.browser.autofill_assistant.proto.StaticTextSectionProto other = (org.chromium.chrome.browser.autofill_assistant.proto.StaticTextSectionProto) arg1;
        text_ = visitor.visitString(
            hasText(), text_,
            other.hasText(), other.text_);
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
                text_ = s;
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
        if (PARSER == null) {    synchronized (org.chromium.chrome.browser.autofill_assistant.proto.StaticTextSectionProto.class) {
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


  // @@protoc_insertion_point(class_scope:autofill_assistant.StaticTextSectionProto)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.StaticTextSectionProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new StaticTextSectionProto();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.StaticTextSectionProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<StaticTextSectionProto> PARSER;

  public static com.google.protobuf.Parser<StaticTextSectionProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

