// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * Protobuf type {@code autofill_assistant.NavigationInfoProto}
 */
public  final class NavigationInfoProto extends
    com.google.protobuf.GeneratedMessageLite<
        NavigationInfoProto, NavigationInfoProto.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.NavigationInfoProto)
    NavigationInfoProtoOrBuilder {
  private NavigationInfoProto() {
  }
  private int bitField0_;
  public static final int STARTED_FIELD_NUMBER = 1;
  private boolean started_;
  /**
   * <pre>
   * Navigation started while processing the current action.
   * </pre>
   *
   * <code>optional bool started = 1;</code>
   */
  public boolean hasStarted() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <pre>
   * Navigation started while processing the current action.
   * </pre>
   *
   * <code>optional bool started = 1;</code>
   */
  public boolean getStarted() {
    return started_;
  }
  /**
   * <pre>
   * Navigation started while processing the current action.
   * </pre>
   *
   * <code>optional bool started = 1;</code>
   */
  private void setStarted(boolean value) {
    bitField0_ |= 0x00000001;
    started_ = value;
  }
  /**
   * <pre>
   * Navigation started while processing the current action.
   * </pre>
   *
   * <code>optional bool started = 1;</code>
   */
  private void clearStarted() {
    bitField0_ = (bitField0_ & ~0x00000001);
    started_ = false;
  }

  public static final int ENDED_FIELD_NUMBER = 2;
  private boolean ended_;
  /**
   * <pre>
   * Navigation ended while processing the current action.
   * </pre>
   *
   * <code>optional bool ended = 2;</code>
   */
  public boolean hasEnded() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <pre>
   * Navigation ended while processing the current action.
   * </pre>
   *
   * <code>optional bool ended = 2;</code>
   */
  public boolean getEnded() {
    return ended_;
  }
  /**
   * <pre>
   * Navigation ended while processing the current action.
   * </pre>
   *
   * <code>optional bool ended = 2;</code>
   */
  private void setEnded(boolean value) {
    bitField0_ |= 0x00000002;
    ended_ = value;
  }
  /**
   * <pre>
   * Navigation ended while processing the current action.
   * </pre>
   *
   * <code>optional bool ended = 2;</code>
   */
  private void clearEnded() {
    bitField0_ = (bitField0_ & ~0x00000002);
    ended_ = false;
  }

  public static final int HAS_ERROR_FIELD_NUMBER = 3;
  private boolean hasError_;
  /**
   * <pre>
   * Navigation failed before or during the processing of the current action.
   * </pre>
   *
   * <code>optional bool has_error = 3;</code>
   */
  public boolean hasHasError() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <pre>
   * Navigation failed before or during the processing of the current action.
   * </pre>
   *
   * <code>optional bool has_error = 3;</code>
   */
  public boolean getHasError() {
    return hasError_;
  }
  /**
   * <pre>
   * Navigation failed before or during the processing of the current action.
   * </pre>
   *
   * <code>optional bool has_error = 3;</code>
   */
  private void setHasError(boolean value) {
    bitField0_ |= 0x00000004;
    hasError_ = value;
  }
  /**
   * <pre>
   * Navigation failed before or during the processing of the current action.
   * </pre>
   *
   * <code>optional bool has_error = 3;</code>
   */
  private void clearHasError() {
    bitField0_ = (bitField0_ & ~0x00000004);
    hasError_ = false;
  }

  public static final int UNEXPECTED_FIELD_NUMBER = 4;
  private boolean unexpected_;
  /**
   * <pre>
   * Unexpected navigation started while processing the current action. This
   * will happen during some actions, such as PROMPT action but it should
   * normally not happen during scripts that have been updated to use
   * expect_navigation.
   * </pre>
   *
   * <code>optional bool unexpected = 4;</code>
   */
  public boolean hasUnexpected() {
    return ((bitField0_ & 0x00000008) == 0x00000008);
  }
  /**
   * <pre>
   * Unexpected navigation started while processing the current action. This
   * will happen during some actions, such as PROMPT action but it should
   * normally not happen during scripts that have been updated to use
   * expect_navigation.
   * </pre>
   *
   * <code>optional bool unexpected = 4;</code>
   */
  public boolean getUnexpected() {
    return unexpected_;
  }
  /**
   * <pre>
   * Unexpected navigation started while processing the current action. This
   * will happen during some actions, such as PROMPT action but it should
   * normally not happen during scripts that have been updated to use
   * expect_navigation.
   * </pre>
   *
   * <code>optional bool unexpected = 4;</code>
   */
  private void setUnexpected(boolean value) {
    bitField0_ |= 0x00000008;
    unexpected_ = value;
  }
  /**
   * <pre>
   * Unexpected navigation started while processing the current action. This
   * will happen during some actions, such as PROMPT action but it should
   * normally not happen during scripts that have been updated to use
   * expect_navigation.
   * </pre>
   *
   * <code>optional bool unexpected = 4;</code>
   */
  private void clearUnexpected() {
    bitField0_ = (bitField0_ & ~0x00000008);
    unexpected_ = false;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeBool(1, started_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeBool(2, ended_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeBool(3, hasError_);
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      output.writeBool(4, unexpected_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, started_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, ended_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, hasError_);
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, unexpected_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.NavigationInfoProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.NavigationInfoProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.NavigationInfoProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.NavigationInfoProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.NavigationInfoProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.NavigationInfoProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.NavigationInfoProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.NavigationInfoProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.NavigationInfoProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.NavigationInfoProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.NavigationInfoProto prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code autofill_assistant.NavigationInfoProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.NavigationInfoProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.NavigationInfoProto)
      org.chromium.chrome.browser.autofill_assistant.proto.NavigationInfoProtoOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.NavigationInfoProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Navigation started while processing the current action.
     * </pre>
     *
     * <code>optional bool started = 1;</code>
     */
    public boolean hasStarted() {
      return instance.hasStarted();
    }
    /**
     * <pre>
     * Navigation started while processing the current action.
     * </pre>
     *
     * <code>optional bool started = 1;</code>
     */
    public boolean getStarted() {
      return instance.getStarted();
    }
    /**
     * <pre>
     * Navigation started while processing the current action.
     * </pre>
     *
     * <code>optional bool started = 1;</code>
     */
    public Builder setStarted(boolean value) {
      copyOnWrite();
      instance.setStarted(value);
      return this;
    }
    /**
     * <pre>
     * Navigation started while processing the current action.
     * </pre>
     *
     * <code>optional bool started = 1;</code>
     */
    public Builder clearStarted() {
      copyOnWrite();
      instance.clearStarted();
      return this;
    }

    /**
     * <pre>
     * Navigation ended while processing the current action.
     * </pre>
     *
     * <code>optional bool ended = 2;</code>
     */
    public boolean hasEnded() {
      return instance.hasEnded();
    }
    /**
     * <pre>
     * Navigation ended while processing the current action.
     * </pre>
     *
     * <code>optional bool ended = 2;</code>
     */
    public boolean getEnded() {
      return instance.getEnded();
    }
    /**
     * <pre>
     * Navigation ended while processing the current action.
     * </pre>
     *
     * <code>optional bool ended = 2;</code>
     */
    public Builder setEnded(boolean value) {
      copyOnWrite();
      instance.setEnded(value);
      return this;
    }
    /**
     * <pre>
     * Navigation ended while processing the current action.
     * </pre>
     *
     * <code>optional bool ended = 2;</code>
     */
    public Builder clearEnded() {
      copyOnWrite();
      instance.clearEnded();
      return this;
    }

    /**
     * <pre>
     * Navigation failed before or during the processing of the current action.
     * </pre>
     *
     * <code>optional bool has_error = 3;</code>
     */
    public boolean hasHasError() {
      return instance.hasHasError();
    }
    /**
     * <pre>
     * Navigation failed before or during the processing of the current action.
     * </pre>
     *
     * <code>optional bool has_error = 3;</code>
     */
    public boolean getHasError() {
      return instance.getHasError();
    }
    /**
     * <pre>
     * Navigation failed before or during the processing of the current action.
     * </pre>
     *
     * <code>optional bool has_error = 3;</code>
     */
    public Builder setHasError(boolean value) {
      copyOnWrite();
      instance.setHasError(value);
      return this;
    }
    /**
     * <pre>
     * Navigation failed before or during the processing of the current action.
     * </pre>
     *
     * <code>optional bool has_error = 3;</code>
     */
    public Builder clearHasError() {
      copyOnWrite();
      instance.clearHasError();
      return this;
    }

    /**
     * <pre>
     * Unexpected navigation started while processing the current action. This
     * will happen during some actions, such as PROMPT action but it should
     * normally not happen during scripts that have been updated to use
     * expect_navigation.
     * </pre>
     *
     * <code>optional bool unexpected = 4;</code>
     */
    public boolean hasUnexpected() {
      return instance.hasUnexpected();
    }
    /**
     * <pre>
     * Unexpected navigation started while processing the current action. This
     * will happen during some actions, such as PROMPT action but it should
     * normally not happen during scripts that have been updated to use
     * expect_navigation.
     * </pre>
     *
     * <code>optional bool unexpected = 4;</code>
     */
    public boolean getUnexpected() {
      return instance.getUnexpected();
    }
    /**
     * <pre>
     * Unexpected navigation started while processing the current action. This
     * will happen during some actions, such as PROMPT action but it should
     * normally not happen during scripts that have been updated to use
     * expect_navigation.
     * </pre>
     *
     * <code>optional bool unexpected = 4;</code>
     */
    public Builder setUnexpected(boolean value) {
      copyOnWrite();
      instance.setUnexpected(value);
      return this;
    }
    /**
     * <pre>
     * Unexpected navigation started while processing the current action. This
     * will happen during some actions, such as PROMPT action but it should
     * normally not happen during scripts that have been updated to use
     * expect_navigation.
     * </pre>
     *
     * <code>optional bool unexpected = 4;</code>
     */
    public Builder clearUnexpected() {
      copyOnWrite();
      instance.clearUnexpected();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.NavigationInfoProto)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.NavigationInfoProto();
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
        org.chromium.chrome.browser.autofill_assistant.proto.NavigationInfoProto other = (org.chromium.chrome.browser.autofill_assistant.proto.NavigationInfoProto) arg1;
        started_ = visitor.visitBoolean(
            hasStarted(), started_,
            other.hasStarted(), other.started_);
        ended_ = visitor.visitBoolean(
            hasEnded(), ended_,
            other.hasEnded(), other.ended_);
        hasError_ = visitor.visitBoolean(
            hasHasError(), hasError_,
            other.hasHasError(), other.hasError_);
        unexpected_ = visitor.visitBoolean(
            hasUnexpected(), unexpected_,
            other.hasUnexpected(), other.unexpected_);
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
              case 8: {
                bitField0_ |= 0x00000001;
                started_ = input.readBool();
                break;
              }
              case 16: {
                bitField0_ |= 0x00000002;
                ended_ = input.readBool();
                break;
              }
              case 24: {
                bitField0_ |= 0x00000004;
                hasError_ = input.readBool();
                break;
              }
              case 32: {
                bitField0_ |= 0x00000008;
                unexpected_ = input.readBool();
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
        if (PARSER == null) {    synchronized (org.chromium.chrome.browser.autofill_assistant.proto.NavigationInfoProto.class) {
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


  // @@protoc_insertion_point(class_scope:autofill_assistant.NavigationInfoProto)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.NavigationInfoProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new NavigationInfoProto();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.NavigationInfoProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<NavigationInfoProto> PARSER;

  public static com.google.protobuf.Parser<NavigationInfoProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

