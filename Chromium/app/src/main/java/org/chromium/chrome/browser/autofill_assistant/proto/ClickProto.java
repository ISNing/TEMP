// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * <pre>
 * Contain all arguments to perform a click.
 * </pre>
 *
 * Protobuf type {@code autofill_assistant.ClickProto}
 */
public  final class ClickProto extends
    com.google.protobuf.GeneratedMessageLite<
        ClickProto, ClickProto.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.ClickProto)
    ClickProtoOrBuilder {
  private ClickProto() {
  }
  /**
   * Protobuf enum {@code autofill_assistant.ClickProto.ClickType}
   */
  public enum ClickType
      implements com.google.protobuf.Internal.EnumLite {
    /**
     * <code>NOT_SET = 0;</code>
     */
    NOT_SET(0),
    /**
     * <code>TAP = 1;</code>
     */
    TAP(1),
    /**
     * <code>JAVASCRIPT = 2;</code>
     */
    JAVASCRIPT(2),
    /**
     * <code>CLICK = 3;</code>
     */
    CLICK(3),
    ;

    /**
     * <code>NOT_SET = 0;</code>
     */
    public static final int NOT_SET_VALUE = 0;
    /**
     * <code>TAP = 1;</code>
     */
    public static final int TAP_VALUE = 1;
    /**
     * <code>JAVASCRIPT = 2;</code>
     */
    public static final int JAVASCRIPT_VALUE = 2;
    /**
     * <code>CLICK = 3;</code>
     */
    public static final int CLICK_VALUE = 3;


    public final int getNumber() {
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ClickType valueOf(int value) {
      return forNumber(value);
    }

    public static ClickType forNumber(int value) {
      switch (value) {
        case 0: return NOT_SET;
        case 1: return TAP;
        case 2: return JAVASCRIPT;
        case 3: return CLICK;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ClickType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ClickType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ClickType>() {
            public ClickType findValueByNumber(int number) {
              return ClickType.forNumber(number);
            }
          };

    private final int value;

    private ClickType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:autofill_assistant.ClickProto.ClickType)
  }

  private int bitField0_;
  public static final int ELEMENT_TO_CLICK_FIELD_NUMBER = 1;
  private org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto elementToClick_;
  /**
   * <code>optional .autofill_assistant.ElementReferenceProto element_to_click = 1;</code>
   */
  public boolean hasElementToClick() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional .autofill_assistant.ElementReferenceProto element_to_click = 1;</code>
   */
  public org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto getElementToClick() {
    return elementToClick_ == null ? org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto.getDefaultInstance() : elementToClick_;
  }
  /**
   * <code>optional .autofill_assistant.ElementReferenceProto element_to_click = 1;</code>
   */
  private void setElementToClick(org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto value) {
    if (value == null) {
      throw new NullPointerException();
    }
    elementToClick_ = value;
    bitField0_ |= 0x00000001;
    }
  /**
   * <code>optional .autofill_assistant.ElementReferenceProto element_to_click = 1;</code>
   */
  private void setElementToClick(
      org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto.Builder builderForValue) {
    elementToClick_ = builderForValue.build();
    bitField0_ |= 0x00000001;
  }
  /**
   * <code>optional .autofill_assistant.ElementReferenceProto element_to_click = 1;</code>
   */
  private void mergeElementToClick(org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto value) {
    if (elementToClick_ != null &&
        elementToClick_ != org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto.getDefaultInstance()) {
      elementToClick_ =
        org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto.newBuilder(elementToClick_).mergeFrom(value).buildPartial();
    } else {
      elementToClick_ = value;
    }
    bitField0_ |= 0x00000001;
  }
  /**
   * <code>optional .autofill_assistant.ElementReferenceProto element_to_click = 1;</code>
   */
  private void clearElementToClick() {  elementToClick_ = null;
    bitField0_ = (bitField0_ & ~0x00000001);
  }

  public static final int CLICK_TYPE_FIELD_NUMBER = 2;
  private int clickType_;
  /**
   * <code>optional .autofill_assistant.ClickProto.ClickType click_type = 2;</code>
   */
  public boolean hasClickType() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional .autofill_assistant.ClickProto.ClickType click_type = 2;</code>
   */
  public org.chromium.chrome.browser.autofill_assistant.proto.ClickProto.ClickType getClickType() {
    org.chromium.chrome.browser.autofill_assistant.proto.ClickProto.ClickType result = org.chromium.chrome.browser.autofill_assistant.proto.ClickProto.ClickType.forNumber(clickType_);
    return result == null ? org.chromium.chrome.browser.autofill_assistant.proto.ClickProto.ClickType.NOT_SET : result;
  }
  /**
   * <code>optional .autofill_assistant.ClickProto.ClickType click_type = 2;</code>
   */
  private void setClickType(org.chromium.chrome.browser.autofill_assistant.proto.ClickProto.ClickType value) {
    if (value == null) {
      throw new NullPointerException();
    }
    bitField0_ |= 0x00000002;
    clickType_ = value.getNumber();
  }
  /**
   * <code>optional .autofill_assistant.ClickProto.ClickType click_type = 2;</code>
   */
  private void clearClickType() {
    bitField0_ = (bitField0_ & ~0x00000002);
    clickType_ = 0;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeMessage(1, getElementToClick());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeEnum(2, clickType_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getElementToClick());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, clickType_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.ClickProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ClickProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ClickProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ClickProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ClickProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ClickProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ClickProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ClickProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ClickProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ClickProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.ClickProto prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * Contain all arguments to perform a click.
   * </pre>
   *
   * Protobuf type {@code autofill_assistant.ClickProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.ClickProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.ClickProto)
      org.chromium.chrome.browser.autofill_assistant.proto.ClickProtoOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.ClickProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional .autofill_assistant.ElementReferenceProto element_to_click = 1;</code>
     */
    public boolean hasElementToClick() {
      return instance.hasElementToClick();
    }
    /**
     * <code>optional .autofill_assistant.ElementReferenceProto element_to_click = 1;</code>
     */
    public org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto getElementToClick() {
      return instance.getElementToClick();
    }
    /**
     * <code>optional .autofill_assistant.ElementReferenceProto element_to_click = 1;</code>
     */
    public Builder setElementToClick(org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto value) {
      copyOnWrite();
      instance.setElementToClick(value);
      return this;
      }
    /**
     * <code>optional .autofill_assistant.ElementReferenceProto element_to_click = 1;</code>
     */
    public Builder setElementToClick(
        org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto.Builder builderForValue) {
      copyOnWrite();
      instance.setElementToClick(builderForValue);
      return this;
    }
    /**
     * <code>optional .autofill_assistant.ElementReferenceProto element_to_click = 1;</code>
     */
    public Builder mergeElementToClick(org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto value) {
      copyOnWrite();
      instance.mergeElementToClick(value);
      return this;
    }
    /**
     * <code>optional .autofill_assistant.ElementReferenceProto element_to_click = 1;</code>
     */
    public Builder clearElementToClick() {  copyOnWrite();
      instance.clearElementToClick();
      return this;
    }

    /**
     * <code>optional .autofill_assistant.ClickProto.ClickType click_type = 2;</code>
     */
    public boolean hasClickType() {
      return instance.hasClickType();
    }
    /**
     * <code>optional .autofill_assistant.ClickProto.ClickType click_type = 2;</code>
     */
    public org.chromium.chrome.browser.autofill_assistant.proto.ClickProto.ClickType getClickType() {
      return instance.getClickType();
    }
    /**
     * <code>optional .autofill_assistant.ClickProto.ClickType click_type = 2;</code>
     */
    public Builder setClickType(org.chromium.chrome.browser.autofill_assistant.proto.ClickProto.ClickType value) {
      copyOnWrite();
      instance.setClickType(value);
      return this;
    }
    /**
     * <code>optional .autofill_assistant.ClickProto.ClickType click_type = 2;</code>
     */
    public Builder clearClickType() {
      copyOnWrite();
      instance.clearClickType();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.ClickProto)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.ClickProto();
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
        org.chromium.chrome.browser.autofill_assistant.proto.ClickProto other = (org.chromium.chrome.browser.autofill_assistant.proto.ClickProto) arg1;
        elementToClick_ = visitor.visitMessage(elementToClick_, other.elementToClick_);
        clickType_ = visitor.visitInt(hasClickType(), clickType_,
            other.hasClickType(), other.clickType_);
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
                org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = elementToClick_.toBuilder();
                }
                elementToClick_ = input.readMessage(org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(elementToClick_);
                  elementToClick_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
              case 16: {
                int rawValue = input.readEnum();
                org.chromium.chrome.browser.autofill_assistant.proto.ClickProto.ClickType value = org.chromium.chrome.browser.autofill_assistant.proto.ClickProto.ClickType.forNumber(rawValue);
                if (value == null) {
                  super.mergeVarintField(2, rawValue);
                } else {
                  bitField0_ |= 0x00000002;
                  clickType_ = rawValue;
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
        if (PARSER == null) {    synchronized (org.chromium.chrome.browser.autofill_assistant.proto.ClickProto.class) {
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


  // @@protoc_insertion_point(class_scope:autofill_assistant.ClickProto)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.ClickProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ClickProto();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.ClickProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ClickProto> PARSER;

  public static com.google.protobuf.Parser<ClickProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

