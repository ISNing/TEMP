// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * <pre>
 * Extra debugging information included in case of unexpected errors.
 * Presence of this element is usually the sign of a bug in the client code and
 * is always the sign that the client code needs to be updated: such issues
 * should be either fixed or reported as proper, expected error with a useful
 * status code.
 * </pre>
 *
 * Protobuf type {@code autofill_assistant.UnexpectedErrorInfoProto}
 */
public  final class UnexpectedErrorInfoProto extends
    com.google.protobuf.GeneratedMessageLite<
        UnexpectedErrorInfoProto, UnexpectedErrorInfoProto.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.UnexpectedErrorInfoProto)
    UnexpectedErrorInfoProtoOrBuilder {
  private UnexpectedErrorInfoProto() {
    sourceFile_ = "";
    jsExceptionClassname_ = "";
    devtoolsErrorMessage_ = "";
  }
  private int bitField0_;
  public static final int SOURCE_FILE_FIELD_NUMBER = 1;
  private java.lang.String sourceFile_;
  /**
   * <pre>
   * Source file, within the client code, where an unexpected error was detected
   * and reported.
   * Only filled for unexpected errors OTHER_ACTION_STATUS and
   * UNEXPECTED_JS_ERROR.
   * This and source_line are only meaningful for the exact version reported in
   * the client context.
   * </pre>
   *
   * <code>optional string source_file = 1;</code>
   */
  public boolean hasSourceFile() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <pre>
   * Source file, within the client code, where an unexpected error was detected
   * and reported.
   * Only filled for unexpected errors OTHER_ACTION_STATUS and
   * UNEXPECTED_JS_ERROR.
   * This and source_line are only meaningful for the exact version reported in
   * the client context.
   * </pre>
   *
   * <code>optional string source_file = 1;</code>
   */
  public java.lang.String getSourceFile() {
    return sourceFile_;
  }
  /**
   * <pre>
   * Source file, within the client code, where an unexpected error was detected
   * and reported.
   * Only filled for unexpected errors OTHER_ACTION_STATUS and
   * UNEXPECTED_JS_ERROR.
   * This and source_line are only meaningful for the exact version reported in
   * the client context.
   * </pre>
   *
   * <code>optional string source_file = 1;</code>
   */
  public com.google.protobuf.ByteString
      getSourceFileBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(sourceFile_);
  }
  /**
   * <pre>
   * Source file, within the client code, where an unexpected error was detected
   * and reported.
   * Only filled for unexpected errors OTHER_ACTION_STATUS and
   * UNEXPECTED_JS_ERROR.
   * This and source_line are only meaningful for the exact version reported in
   * the client context.
   * </pre>
   *
   * <code>optional string source_file = 1;</code>
   */
  private void setSourceFile(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
    sourceFile_ = value;
  }
  /**
   * <pre>
   * Source file, within the client code, where an unexpected error was detected
   * and reported.
   * Only filled for unexpected errors OTHER_ACTION_STATUS and
   * UNEXPECTED_JS_ERROR.
   * This and source_line are only meaningful for the exact version reported in
   * the client context.
   * </pre>
   *
   * <code>optional string source_file = 1;</code>
   */
  private void clearSourceFile() {
    bitField0_ = (bitField0_ & ~0x00000001);
    sourceFile_ = getDefaultInstance().getSourceFile();
  }
  /**
   * <pre>
   * Source file, within the client code, where an unexpected error was detected
   * and reported.
   * Only filled for unexpected errors OTHER_ACTION_STATUS and
   * UNEXPECTED_JS_ERROR.
   * This and source_line are only meaningful for the exact version reported in
   * the client context.
   * </pre>
   *
   * <code>optional string source_file = 1;</code>
   */
  private void setSourceFileBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
    sourceFile_ = value.toStringUtf8();
  }

  public static final int SOURCE_LINE_NUMBER_FIELD_NUMBER = 2;
  private int sourceLineNumber_;
  /**
   * <pre>
   * Line number, within the client's source file, where the error was detected.
   * </pre>
   *
   * <code>optional int32 source_line_number = 2;</code>
   */
  public boolean hasSourceLineNumber() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <pre>
   * Line number, within the client's source file, where the error was detected.
   * </pre>
   *
   * <code>optional int32 source_line_number = 2;</code>
   */
  public int getSourceLineNumber() {
    return sourceLineNumber_;
  }
  /**
   * <pre>
   * Line number, within the client's source file, where the error was detected.
   * </pre>
   *
   * <code>optional int32 source_line_number = 2;</code>
   */
  private void setSourceLineNumber(int value) {
    bitField0_ |= 0x00000002;
    sourceLineNumber_ = value;
  }
  /**
   * <pre>
   * Line number, within the client's source file, where the error was detected.
   * </pre>
   *
   * <code>optional int32 source_line_number = 2;</code>
   */
  private void clearSourceLineNumber() {
    bitField0_ = (bitField0_ & ~0x00000002);
    sourceLineNumber_ = 0;
  }

  public static final int JS_EXCEPTION_CLASSNAME_FIELD_NUMBER = 3;
  private java.lang.String jsExceptionClassname_;
  /**
   * <pre>
   * JavaScript exception class name, if reporting a JavaScript error.
   * </pre>
   *
   * <code>optional string js_exception_classname = 3;</code>
   */
  public boolean hasJsExceptionClassname() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <pre>
   * JavaScript exception class name, if reporting a JavaScript error.
   * </pre>
   *
   * <code>optional string js_exception_classname = 3;</code>
   */
  public java.lang.String getJsExceptionClassname() {
    return jsExceptionClassname_;
  }
  /**
   * <pre>
   * JavaScript exception class name, if reporting a JavaScript error.
   * </pre>
   *
   * <code>optional string js_exception_classname = 3;</code>
   */
  public com.google.protobuf.ByteString
      getJsExceptionClassnameBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(jsExceptionClassname_);
  }
  /**
   * <pre>
   * JavaScript exception class name, if reporting a JavaScript error.
   * </pre>
   *
   * <code>optional string js_exception_classname = 3;</code>
   */
  private void setJsExceptionClassname(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
    jsExceptionClassname_ = value;
  }
  /**
   * <pre>
   * JavaScript exception class name, if reporting a JavaScript error.
   * </pre>
   *
   * <code>optional string js_exception_classname = 3;</code>
   */
  private void clearJsExceptionClassname() {
    bitField0_ = (bitField0_ & ~0x00000004);
    jsExceptionClassname_ = getDefaultInstance().getJsExceptionClassname();
  }
  /**
   * <pre>
   * JavaScript exception class name, if reporting a JavaScript error.
   * </pre>
   *
   * <code>optional string js_exception_classname = 3;</code>
   */
  private void setJsExceptionClassnameBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
    jsExceptionClassname_ = value.toStringUtf8();
  }

  public static final int JS_EXCEPTION_LINE_NUMBER_FIELD_NUMBER = 4;
  private int jsExceptionLineNumber_;
  /**
   * <pre>
   * JavaScript exception line number, within the js snippet that was sent to
   * devtools runtime by the client, if reporting a JavaScript error.
   * </pre>
   *
   * <code>optional int32 js_exception_line_number = 4;</code>
   */
  public boolean hasJsExceptionLineNumber() {
    return ((bitField0_ & 0x00000008) == 0x00000008);
  }
  /**
   * <pre>
   * JavaScript exception line number, within the js snippet that was sent to
   * devtools runtime by the client, if reporting a JavaScript error.
   * </pre>
   *
   * <code>optional int32 js_exception_line_number = 4;</code>
   */
  public int getJsExceptionLineNumber() {
    return jsExceptionLineNumber_;
  }
  /**
   * <pre>
   * JavaScript exception line number, within the js snippet that was sent to
   * devtools runtime by the client, if reporting a JavaScript error.
   * </pre>
   *
   * <code>optional int32 js_exception_line_number = 4;</code>
   */
  private void setJsExceptionLineNumber(int value) {
    bitField0_ |= 0x00000008;
    jsExceptionLineNumber_ = value;
  }
  /**
   * <pre>
   * JavaScript exception line number, within the js snippet that was sent to
   * devtools runtime by the client, if reporting a JavaScript error.
   * </pre>
   *
   * <code>optional int32 js_exception_line_number = 4;</code>
   */
  private void clearJsExceptionLineNumber() {
    bitField0_ = (bitField0_ & ~0x00000008);
    jsExceptionLineNumber_ = 0;
  }

  public static final int JS_EXCEPTION_COLUMN_NUMBER_FIELD_NUMBER = 5;
  private int jsExceptionColumnNumber_;
  /**
   * <pre>
   * JavaScript exception column number, within the js snippet that was sent to
   * devtools runtime by the client, if reporting a JavaScript error.
   * </pre>
   *
   * <code>optional int32 js_exception_column_number = 5;</code>
   */
  public boolean hasJsExceptionColumnNumber() {
    return ((bitField0_ & 0x00000010) == 0x00000010);
  }
  /**
   * <pre>
   * JavaScript exception column number, within the js snippet that was sent to
   * devtools runtime by the client, if reporting a JavaScript error.
   * </pre>
   *
   * <code>optional int32 js_exception_column_number = 5;</code>
   */
  public int getJsExceptionColumnNumber() {
    return jsExceptionColumnNumber_;
  }
  /**
   * <pre>
   * JavaScript exception column number, within the js snippet that was sent to
   * devtools runtime by the client, if reporting a JavaScript error.
   * </pre>
   *
   * <code>optional int32 js_exception_column_number = 5;</code>
   */
  private void setJsExceptionColumnNumber(int value) {
    bitField0_ |= 0x00000010;
    jsExceptionColumnNumber_ = value;
  }
  /**
   * <pre>
   * JavaScript exception column number, within the js snippet that was sent to
   * devtools runtime by the client, if reporting a JavaScript error.
   * </pre>
   *
   * <code>optional int32 js_exception_column_number = 5;</code>
   */
  private void clearJsExceptionColumnNumber() {
    bitField0_ = (bitField0_ & ~0x00000010);
    jsExceptionColumnNumber_ = 0;
  }

  public static final int DEVTOOLS_ERROR_CODE_FIELD_NUMBER = 6;
  private int devtoolsErrorCode_;
  /**
   * <pre>
   * Error code returned by devtools, if any. 0 is considered a success.
   * </pre>
   *
   * <code>optional int32 devtools_error_code = 6;</code>
   */
  public boolean hasDevtoolsErrorCode() {
    return ((bitField0_ & 0x00000020) == 0x00000020);
  }
  /**
   * <pre>
   * Error code returned by devtools, if any. 0 is considered a success.
   * </pre>
   *
   * <code>optional int32 devtools_error_code = 6;</code>
   */
  public int getDevtoolsErrorCode() {
    return devtoolsErrorCode_;
  }
  /**
   * <pre>
   * Error code returned by devtools, if any. 0 is considered a success.
   * </pre>
   *
   * <code>optional int32 devtools_error_code = 6;</code>
   */
  private void setDevtoolsErrorCode(int value) {
    bitField0_ |= 0x00000020;
    devtoolsErrorCode_ = value;
  }
  /**
   * <pre>
   * Error code returned by devtools, if any. 0 is considered a success.
   * </pre>
   *
   * <code>optional int32 devtools_error_code = 6;</code>
   */
  private void clearDevtoolsErrorCode() {
    bitField0_ = (bitField0_ & ~0x00000020);
    devtoolsErrorCode_ = 0;
  }

  public static final int DEVTOOLS_ERROR_MESSAGE_FIELD_NUMBER = 7;
  private java.lang.String devtoolsErrorMessage_;
  /**
   * <pre>
   * Error message returned by devtools, if any.
   * </pre>
   *
   * <code>optional string devtools_error_message = 7;</code>
   */
  public boolean hasDevtoolsErrorMessage() {
    return ((bitField0_ & 0x00000040) == 0x00000040);
  }
  /**
   * <pre>
   * Error message returned by devtools, if any.
   * </pre>
   *
   * <code>optional string devtools_error_message = 7;</code>
   */
  public java.lang.String getDevtoolsErrorMessage() {
    return devtoolsErrorMessage_;
  }
  /**
   * <pre>
   * Error message returned by devtools, if any.
   * </pre>
   *
   * <code>optional string devtools_error_message = 7;</code>
   */
  public com.google.protobuf.ByteString
      getDevtoolsErrorMessageBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(devtoolsErrorMessage_);
  }
  /**
   * <pre>
   * Error message returned by devtools, if any.
   * </pre>
   *
   * <code>optional string devtools_error_message = 7;</code>
   */
  private void setDevtoolsErrorMessage(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000040;
    devtoolsErrorMessage_ = value;
  }
  /**
   * <pre>
   * Error message returned by devtools, if any.
   * </pre>
   *
   * <code>optional string devtools_error_message = 7;</code>
   */
  private void clearDevtoolsErrorMessage() {
    bitField0_ = (bitField0_ & ~0x00000040);
    devtoolsErrorMessage_ = getDefaultInstance().getDevtoolsErrorMessage();
  }
  /**
   * <pre>
   * Error message returned by devtools, if any.
   * </pre>
   *
   * <code>optional string devtools_error_message = 7;</code>
   */
  private void setDevtoolsErrorMessageBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000040;
    devtoolsErrorMessage_ = value.toStringUtf8();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeString(1, getSourceFile());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeInt32(2, sourceLineNumber_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeString(3, getJsExceptionClassname());
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      output.writeInt32(4, jsExceptionLineNumber_);
    }
    if (((bitField0_ & 0x00000010) == 0x00000010)) {
      output.writeInt32(5, jsExceptionColumnNumber_);
    }
    if (((bitField0_ & 0x00000020) == 0x00000020)) {
      output.writeInt32(6, devtoolsErrorCode_);
    }
    if (((bitField0_ & 0x00000040) == 0x00000040)) {
      output.writeString(7, getDevtoolsErrorMessage());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, getSourceFile());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, sourceLineNumber_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(3, getJsExceptionClassname());
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, jsExceptionLineNumber_);
    }
    if (((bitField0_ & 0x00000010) == 0x00000010)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, jsExceptionColumnNumber_);
    }
    if (((bitField0_ & 0x00000020) == 0x00000020)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, devtoolsErrorCode_);
    }
    if (((bitField0_ & 0x00000040) == 0x00000040)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(7, getDevtoolsErrorMessage());
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.UnexpectedErrorInfoProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.UnexpectedErrorInfoProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.UnexpectedErrorInfoProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.UnexpectedErrorInfoProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.UnexpectedErrorInfoProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.UnexpectedErrorInfoProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.UnexpectedErrorInfoProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.UnexpectedErrorInfoProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.UnexpectedErrorInfoProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.UnexpectedErrorInfoProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.UnexpectedErrorInfoProto prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * Extra debugging information included in case of unexpected errors.
   * Presence of this element is usually the sign of a bug in the client code and
   * is always the sign that the client code needs to be updated: such issues
   * should be either fixed or reported as proper, expected error with a useful
   * status code.
   * </pre>
   *
   * Protobuf type {@code autofill_assistant.UnexpectedErrorInfoProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.UnexpectedErrorInfoProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.UnexpectedErrorInfoProto)
      org.chromium.chrome.browser.autofill_assistant.proto.UnexpectedErrorInfoProtoOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.UnexpectedErrorInfoProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Source file, within the client code, where an unexpected error was detected
     * and reported.
     * Only filled for unexpected errors OTHER_ACTION_STATUS and
     * UNEXPECTED_JS_ERROR.
     * This and source_line are only meaningful for the exact version reported in
     * the client context.
     * </pre>
     *
     * <code>optional string source_file = 1;</code>
     */
    public boolean hasSourceFile() {
      return instance.hasSourceFile();
    }
    /**
     * <pre>
     * Source file, within the client code, where an unexpected error was detected
     * and reported.
     * Only filled for unexpected errors OTHER_ACTION_STATUS and
     * UNEXPECTED_JS_ERROR.
     * This and source_line are only meaningful for the exact version reported in
     * the client context.
     * </pre>
     *
     * <code>optional string source_file = 1;</code>
     */
    public java.lang.String getSourceFile() {
      return instance.getSourceFile();
    }
    /**
     * <pre>
     * Source file, within the client code, where an unexpected error was detected
     * and reported.
     * Only filled for unexpected errors OTHER_ACTION_STATUS and
     * UNEXPECTED_JS_ERROR.
     * This and source_line are only meaningful for the exact version reported in
     * the client context.
     * </pre>
     *
     * <code>optional string source_file = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSourceFileBytes() {
      return instance.getSourceFileBytes();
    }
    /**
     * <pre>
     * Source file, within the client code, where an unexpected error was detected
     * and reported.
     * Only filled for unexpected errors OTHER_ACTION_STATUS and
     * UNEXPECTED_JS_ERROR.
     * This and source_line are only meaningful for the exact version reported in
     * the client context.
     * </pre>
     *
     * <code>optional string source_file = 1;</code>
     */
    public Builder setSourceFile(
        java.lang.String value) {
      copyOnWrite();
      instance.setSourceFile(value);
      return this;
    }
    /**
     * <pre>
     * Source file, within the client code, where an unexpected error was detected
     * and reported.
     * Only filled for unexpected errors OTHER_ACTION_STATUS and
     * UNEXPECTED_JS_ERROR.
     * This and source_line are only meaningful for the exact version reported in
     * the client context.
     * </pre>
     *
     * <code>optional string source_file = 1;</code>
     */
    public Builder clearSourceFile() {
      copyOnWrite();
      instance.clearSourceFile();
      return this;
    }
    /**
     * <pre>
     * Source file, within the client code, where an unexpected error was detected
     * and reported.
     * Only filled for unexpected errors OTHER_ACTION_STATUS and
     * UNEXPECTED_JS_ERROR.
     * This and source_line are only meaningful for the exact version reported in
     * the client context.
     * </pre>
     *
     * <code>optional string source_file = 1;</code>
     */
    public Builder setSourceFileBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setSourceFileBytes(value);
      return this;
    }

    /**
     * <pre>
     * Line number, within the client's source file, where the error was detected.
     * </pre>
     *
     * <code>optional int32 source_line_number = 2;</code>
     */
    public boolean hasSourceLineNumber() {
      return instance.hasSourceLineNumber();
    }
    /**
     * <pre>
     * Line number, within the client's source file, where the error was detected.
     * </pre>
     *
     * <code>optional int32 source_line_number = 2;</code>
     */
    public int getSourceLineNumber() {
      return instance.getSourceLineNumber();
    }
    /**
     * <pre>
     * Line number, within the client's source file, where the error was detected.
     * </pre>
     *
     * <code>optional int32 source_line_number = 2;</code>
     */
    public Builder setSourceLineNumber(int value) {
      copyOnWrite();
      instance.setSourceLineNumber(value);
      return this;
    }
    /**
     * <pre>
     * Line number, within the client's source file, where the error was detected.
     * </pre>
     *
     * <code>optional int32 source_line_number = 2;</code>
     */
    public Builder clearSourceLineNumber() {
      copyOnWrite();
      instance.clearSourceLineNumber();
      return this;
    }

    /**
     * <pre>
     * JavaScript exception class name, if reporting a JavaScript error.
     * </pre>
     *
     * <code>optional string js_exception_classname = 3;</code>
     */
    public boolean hasJsExceptionClassname() {
      return instance.hasJsExceptionClassname();
    }
    /**
     * <pre>
     * JavaScript exception class name, if reporting a JavaScript error.
     * </pre>
     *
     * <code>optional string js_exception_classname = 3;</code>
     */
    public java.lang.String getJsExceptionClassname() {
      return instance.getJsExceptionClassname();
    }
    /**
     * <pre>
     * JavaScript exception class name, if reporting a JavaScript error.
     * </pre>
     *
     * <code>optional string js_exception_classname = 3;</code>
     */
    public com.google.protobuf.ByteString
        getJsExceptionClassnameBytes() {
      return instance.getJsExceptionClassnameBytes();
    }
    /**
     * <pre>
     * JavaScript exception class name, if reporting a JavaScript error.
     * </pre>
     *
     * <code>optional string js_exception_classname = 3;</code>
     */
    public Builder setJsExceptionClassname(
        java.lang.String value) {
      copyOnWrite();
      instance.setJsExceptionClassname(value);
      return this;
    }
    /**
     * <pre>
     * JavaScript exception class name, if reporting a JavaScript error.
     * </pre>
     *
     * <code>optional string js_exception_classname = 3;</code>
     */
    public Builder clearJsExceptionClassname() {
      copyOnWrite();
      instance.clearJsExceptionClassname();
      return this;
    }
    /**
     * <pre>
     * JavaScript exception class name, if reporting a JavaScript error.
     * </pre>
     *
     * <code>optional string js_exception_classname = 3;</code>
     */
    public Builder setJsExceptionClassnameBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setJsExceptionClassnameBytes(value);
      return this;
    }

    /**
     * <pre>
     * JavaScript exception line number, within the js snippet that was sent to
     * devtools runtime by the client, if reporting a JavaScript error.
     * </pre>
     *
     * <code>optional int32 js_exception_line_number = 4;</code>
     */
    public boolean hasJsExceptionLineNumber() {
      return instance.hasJsExceptionLineNumber();
    }
    /**
     * <pre>
     * JavaScript exception line number, within the js snippet that was sent to
     * devtools runtime by the client, if reporting a JavaScript error.
     * </pre>
     *
     * <code>optional int32 js_exception_line_number = 4;</code>
     */
    public int getJsExceptionLineNumber() {
      return instance.getJsExceptionLineNumber();
    }
    /**
     * <pre>
     * JavaScript exception line number, within the js snippet that was sent to
     * devtools runtime by the client, if reporting a JavaScript error.
     * </pre>
     *
     * <code>optional int32 js_exception_line_number = 4;</code>
     */
    public Builder setJsExceptionLineNumber(int value) {
      copyOnWrite();
      instance.setJsExceptionLineNumber(value);
      return this;
    }
    /**
     * <pre>
     * JavaScript exception line number, within the js snippet that was sent to
     * devtools runtime by the client, if reporting a JavaScript error.
     * </pre>
     *
     * <code>optional int32 js_exception_line_number = 4;</code>
     */
    public Builder clearJsExceptionLineNumber() {
      copyOnWrite();
      instance.clearJsExceptionLineNumber();
      return this;
    }

    /**
     * <pre>
     * JavaScript exception column number, within the js snippet that was sent to
     * devtools runtime by the client, if reporting a JavaScript error.
     * </pre>
     *
     * <code>optional int32 js_exception_column_number = 5;</code>
     */
    public boolean hasJsExceptionColumnNumber() {
      return instance.hasJsExceptionColumnNumber();
    }
    /**
     * <pre>
     * JavaScript exception column number, within the js snippet that was sent to
     * devtools runtime by the client, if reporting a JavaScript error.
     * </pre>
     *
     * <code>optional int32 js_exception_column_number = 5;</code>
     */
    public int getJsExceptionColumnNumber() {
      return instance.getJsExceptionColumnNumber();
    }
    /**
     * <pre>
     * JavaScript exception column number, within the js snippet that was sent to
     * devtools runtime by the client, if reporting a JavaScript error.
     * </pre>
     *
     * <code>optional int32 js_exception_column_number = 5;</code>
     */
    public Builder setJsExceptionColumnNumber(int value) {
      copyOnWrite();
      instance.setJsExceptionColumnNumber(value);
      return this;
    }
    /**
     * <pre>
     * JavaScript exception column number, within the js snippet that was sent to
     * devtools runtime by the client, if reporting a JavaScript error.
     * </pre>
     *
     * <code>optional int32 js_exception_column_number = 5;</code>
     */
    public Builder clearJsExceptionColumnNumber() {
      copyOnWrite();
      instance.clearJsExceptionColumnNumber();
      return this;
    }

    /**
     * <pre>
     * Error code returned by devtools, if any. 0 is considered a success.
     * </pre>
     *
     * <code>optional int32 devtools_error_code = 6;</code>
     */
    public boolean hasDevtoolsErrorCode() {
      return instance.hasDevtoolsErrorCode();
    }
    /**
     * <pre>
     * Error code returned by devtools, if any. 0 is considered a success.
     * </pre>
     *
     * <code>optional int32 devtools_error_code = 6;</code>
     */
    public int getDevtoolsErrorCode() {
      return instance.getDevtoolsErrorCode();
    }
    /**
     * <pre>
     * Error code returned by devtools, if any. 0 is considered a success.
     * </pre>
     *
     * <code>optional int32 devtools_error_code = 6;</code>
     */
    public Builder setDevtoolsErrorCode(int value) {
      copyOnWrite();
      instance.setDevtoolsErrorCode(value);
      return this;
    }
    /**
     * <pre>
     * Error code returned by devtools, if any. 0 is considered a success.
     * </pre>
     *
     * <code>optional int32 devtools_error_code = 6;</code>
     */
    public Builder clearDevtoolsErrorCode() {
      copyOnWrite();
      instance.clearDevtoolsErrorCode();
      return this;
    }

    /**
     * <pre>
     * Error message returned by devtools, if any.
     * </pre>
     *
     * <code>optional string devtools_error_message = 7;</code>
     */
    public boolean hasDevtoolsErrorMessage() {
      return instance.hasDevtoolsErrorMessage();
    }
    /**
     * <pre>
     * Error message returned by devtools, if any.
     * </pre>
     *
     * <code>optional string devtools_error_message = 7;</code>
     */
    public java.lang.String getDevtoolsErrorMessage() {
      return instance.getDevtoolsErrorMessage();
    }
    /**
     * <pre>
     * Error message returned by devtools, if any.
     * </pre>
     *
     * <code>optional string devtools_error_message = 7;</code>
     */
    public com.google.protobuf.ByteString
        getDevtoolsErrorMessageBytes() {
      return instance.getDevtoolsErrorMessageBytes();
    }
    /**
     * <pre>
     * Error message returned by devtools, if any.
     * </pre>
     *
     * <code>optional string devtools_error_message = 7;</code>
     */
    public Builder setDevtoolsErrorMessage(
        java.lang.String value) {
      copyOnWrite();
      instance.setDevtoolsErrorMessage(value);
      return this;
    }
    /**
     * <pre>
     * Error message returned by devtools, if any.
     * </pre>
     *
     * <code>optional string devtools_error_message = 7;</code>
     */
    public Builder clearDevtoolsErrorMessage() {
      copyOnWrite();
      instance.clearDevtoolsErrorMessage();
      return this;
    }
    /**
     * <pre>
     * Error message returned by devtools, if any.
     * </pre>
     *
     * <code>optional string devtools_error_message = 7;</code>
     */
    public Builder setDevtoolsErrorMessageBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setDevtoolsErrorMessageBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.UnexpectedErrorInfoProto)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.UnexpectedErrorInfoProto();
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
        org.chromium.chrome.browser.autofill_assistant.proto.UnexpectedErrorInfoProto other = (org.chromium.chrome.browser.autofill_assistant.proto.UnexpectedErrorInfoProto) arg1;
        sourceFile_ = visitor.visitString(
            hasSourceFile(), sourceFile_,
            other.hasSourceFile(), other.sourceFile_);
        sourceLineNumber_ = visitor.visitInt(
            hasSourceLineNumber(), sourceLineNumber_,
            other.hasSourceLineNumber(), other.sourceLineNumber_);
        jsExceptionClassname_ = visitor.visitString(
            hasJsExceptionClassname(), jsExceptionClassname_,
            other.hasJsExceptionClassname(), other.jsExceptionClassname_);
        jsExceptionLineNumber_ = visitor.visitInt(
            hasJsExceptionLineNumber(), jsExceptionLineNumber_,
            other.hasJsExceptionLineNumber(), other.jsExceptionLineNumber_);
        jsExceptionColumnNumber_ = visitor.visitInt(
            hasJsExceptionColumnNumber(), jsExceptionColumnNumber_,
            other.hasJsExceptionColumnNumber(), other.jsExceptionColumnNumber_);
        devtoolsErrorCode_ = visitor.visitInt(
            hasDevtoolsErrorCode(), devtoolsErrorCode_,
            other.hasDevtoolsErrorCode(), other.devtoolsErrorCode_);
        devtoolsErrorMessage_ = visitor.visitString(
            hasDevtoolsErrorMessage(), devtoolsErrorMessage_,
            other.hasDevtoolsErrorMessage(), other.devtoolsErrorMessage_);
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
                sourceFile_ = s;
                break;
              }
              case 16: {
                bitField0_ |= 0x00000002;
                sourceLineNumber_ = input.readInt32();
                break;
              }
              case 26: {
                String s = input.readString();
                bitField0_ |= 0x00000004;
                jsExceptionClassname_ = s;
                break;
              }
              case 32: {
                bitField0_ |= 0x00000008;
                jsExceptionLineNumber_ = input.readInt32();
                break;
              }
              case 40: {
                bitField0_ |= 0x00000010;
                jsExceptionColumnNumber_ = input.readInt32();
                break;
              }
              case 48: {
                bitField0_ |= 0x00000020;
                devtoolsErrorCode_ = input.readInt32();
                break;
              }
              case 58: {
                String s = input.readString();
                bitField0_ |= 0x00000040;
                devtoolsErrorMessage_ = s;
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
        if (PARSER == null) {    synchronized (org.chromium.chrome.browser.autofill_assistant.proto.UnexpectedErrorInfoProto.class) {
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


  // @@protoc_insertion_point(class_scope:autofill_assistant.UnexpectedErrorInfoProto)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.UnexpectedErrorInfoProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new UnexpectedErrorInfoProto();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.UnexpectedErrorInfoProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<UnexpectedErrorInfoProto> PARSER;

  public static com.google.protobuf.Parser<UnexpectedErrorInfoProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

