// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * Protobuf type {@code autofill_assistant.DateTimeRangeProto}
 */
public  final class DateTimeRangeProto extends
    com.google.protobuf.GeneratedMessageLite<
        DateTimeRangeProto, DateTimeRangeProto.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.DateTimeRangeProto)
    DateTimeRangeProtoOrBuilder {
  private DateTimeRangeProto() {
    startLabel_ = "";
    endLabel_ = "";
  }
  private int bitField0_;
  public static final int START_FIELD_NUMBER = 1;
  private org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto start_;
  /**
   * <pre>
   * The start value of the date/time range.
   * </pre>
   *
   * <code>optional .autofill_assistant.DateTimeProto start = 1;</code>
   */
  public boolean hasStart() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <pre>
   * The start value of the date/time range.
   * </pre>
   *
   * <code>optional .autofill_assistant.DateTimeProto start = 1;</code>
   */
  public org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto getStart() {
    return start_ == null ? org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto.getDefaultInstance() : start_;
  }
  /**
   * <pre>
   * The start value of the date/time range.
   * </pre>
   *
   * <code>optional .autofill_assistant.DateTimeProto start = 1;</code>
   */
  private void setStart(org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto value) {
    if (value == null) {
      throw new NullPointerException();
    }
    start_ = value;
    bitField0_ |= 0x00000001;
    }
  /**
   * <pre>
   * The start value of the date/time range.
   * </pre>
   *
   * <code>optional .autofill_assistant.DateTimeProto start = 1;</code>
   */
  private void setStart(
      org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto.Builder builderForValue) {
    start_ = builderForValue.build();
    bitField0_ |= 0x00000001;
  }
  /**
   * <pre>
   * The start value of the date/time range.
   * </pre>
   *
   * <code>optional .autofill_assistant.DateTimeProto start = 1;</code>
   */
  private void mergeStart(org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto value) {
    if (start_ != null &&
        start_ != org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto.getDefaultInstance()) {
      start_ =
        org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto.newBuilder(start_).mergeFrom(value).buildPartial();
    } else {
      start_ = value;
    }
    bitField0_ |= 0x00000001;
  }
  /**
   * <pre>
   * The start value of the date/time range.
   * </pre>
   *
   * <code>optional .autofill_assistant.DateTimeProto start = 1;</code>
   */
  private void clearStart() {  start_ = null;
    bitField0_ = (bitField0_ & ~0x00000001);
  }

  public static final int END_FIELD_NUMBER = 2;
  private org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto end_;
  /**
   * <pre>
   * The end value of the date/time range.
   * </pre>
   *
   * <code>optional .autofill_assistant.DateTimeProto end = 2;</code>
   */
  public boolean hasEnd() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <pre>
   * The end value of the date/time range.
   * </pre>
   *
   * <code>optional .autofill_assistant.DateTimeProto end = 2;</code>
   */
  public org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto getEnd() {
    return end_ == null ? org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto.getDefaultInstance() : end_;
  }
  /**
   * <pre>
   * The end value of the date/time range.
   * </pre>
   *
   * <code>optional .autofill_assistant.DateTimeProto end = 2;</code>
   */
  private void setEnd(org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto value) {
    if (value == null) {
      throw new NullPointerException();
    }
    end_ = value;
    bitField0_ |= 0x00000002;
    }
  /**
   * <pre>
   * The end value of the date/time range.
   * </pre>
   *
   * <code>optional .autofill_assistant.DateTimeProto end = 2;</code>
   */
  private void setEnd(
      org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto.Builder builderForValue) {
    end_ = builderForValue.build();
    bitField0_ |= 0x00000002;
  }
  /**
   * <pre>
   * The end value of the date/time range.
   * </pre>
   *
   * <code>optional .autofill_assistant.DateTimeProto end = 2;</code>
   */
  private void mergeEnd(org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto value) {
    if (end_ != null &&
        end_ != org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto.getDefaultInstance()) {
      end_ =
        org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto.newBuilder(end_).mergeFrom(value).buildPartial();
    } else {
      end_ = value;
    }
    bitField0_ |= 0x00000002;
  }
  /**
   * <pre>
   * The end value of the date/time range.
   * </pre>
   *
   * <code>optional .autofill_assistant.DateTimeProto end = 2;</code>
   */
  private void clearEnd() {  end_ = null;
    bitField0_ = (bitField0_ & ~0x00000002);
  }

  public static final int MIN_FIELD_NUMBER = 3;
  private org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto min_;
  /**
   * <pre>
   * The minimum allowed value of the date/time range.
   * </pre>
   *
   * <code>optional .autofill_assistant.DateTimeProto min = 3;</code>
   */
  public boolean hasMin() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <pre>
   * The minimum allowed value of the date/time range.
   * </pre>
   *
   * <code>optional .autofill_assistant.DateTimeProto min = 3;</code>
   */
  public org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto getMin() {
    return min_ == null ? org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto.getDefaultInstance() : min_;
  }
  /**
   * <pre>
   * The minimum allowed value of the date/time range.
   * </pre>
   *
   * <code>optional .autofill_assistant.DateTimeProto min = 3;</code>
   */
  private void setMin(org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto value) {
    if (value == null) {
      throw new NullPointerException();
    }
    min_ = value;
    bitField0_ |= 0x00000004;
    }
  /**
   * <pre>
   * The minimum allowed value of the date/time range.
   * </pre>
   *
   * <code>optional .autofill_assistant.DateTimeProto min = 3;</code>
   */
  private void setMin(
      org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto.Builder builderForValue) {
    min_ = builderForValue.build();
    bitField0_ |= 0x00000004;
  }
  /**
   * <pre>
   * The minimum allowed value of the date/time range.
   * </pre>
   *
   * <code>optional .autofill_assistant.DateTimeProto min = 3;</code>
   */
  private void mergeMin(org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto value) {
    if (min_ != null &&
        min_ != org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto.getDefaultInstance()) {
      min_ =
        org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto.newBuilder(min_).mergeFrom(value).buildPartial();
    } else {
      min_ = value;
    }
    bitField0_ |= 0x00000004;
  }
  /**
   * <pre>
   * The minimum allowed value of the date/time range.
   * </pre>
   *
   * <code>optional .autofill_assistant.DateTimeProto min = 3;</code>
   */
  private void clearMin() {  min_ = null;
    bitField0_ = (bitField0_ & ~0x00000004);
  }

  public static final int MAX_FIELD_NUMBER = 4;
  private org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto max_;
  /**
   * <pre>
   * The maximum allowed value of the date/time range.
   * </pre>
   *
   * <code>optional .autofill_assistant.DateTimeProto max = 4;</code>
   */
  public boolean hasMax() {
    return ((bitField0_ & 0x00000008) == 0x00000008);
  }
  /**
   * <pre>
   * The maximum allowed value of the date/time range.
   * </pre>
   *
   * <code>optional .autofill_assistant.DateTimeProto max = 4;</code>
   */
  public org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto getMax() {
    return max_ == null ? org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto.getDefaultInstance() : max_;
  }
  /**
   * <pre>
   * The maximum allowed value of the date/time range.
   * </pre>
   *
   * <code>optional .autofill_assistant.DateTimeProto max = 4;</code>
   */
  private void setMax(org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto value) {
    if (value == null) {
      throw new NullPointerException();
    }
    max_ = value;
    bitField0_ |= 0x00000008;
    }
  /**
   * <pre>
   * The maximum allowed value of the date/time range.
   * </pre>
   *
   * <code>optional .autofill_assistant.DateTimeProto max = 4;</code>
   */
  private void setMax(
      org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto.Builder builderForValue) {
    max_ = builderForValue.build();
    bitField0_ |= 0x00000008;
  }
  /**
   * <pre>
   * The maximum allowed value of the date/time range.
   * </pre>
   *
   * <code>optional .autofill_assistant.DateTimeProto max = 4;</code>
   */
  private void mergeMax(org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto value) {
    if (max_ != null &&
        max_ != org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto.getDefaultInstance()) {
      max_ =
        org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto.newBuilder(max_).mergeFrom(value).buildPartial();
    } else {
      max_ = value;
    }
    bitField0_ |= 0x00000008;
  }
  /**
   * <pre>
   * The maximum allowed value of the date/time range.
   * </pre>
   *
   * <code>optional .autofill_assistant.DateTimeProto max = 4;</code>
   */
  private void clearMax() {  max_ = null;
    bitField0_ = (bitField0_ & ~0x00000008);
  }

  public static final int START_LABEL_FIELD_NUMBER = 5;
  private java.lang.String startLabel_;
  /**
   * <pre>
   * The label of the start date/time value (e.g., 'Pick-up').
   * </pre>
   *
   * <code>optional string start_label = 5;</code>
   */
  public boolean hasStartLabel() {
    return ((bitField0_ & 0x00000010) == 0x00000010);
  }
  /**
   * <pre>
   * The label of the start date/time value (e.g., 'Pick-up').
   * </pre>
   *
   * <code>optional string start_label = 5;</code>
   */
  public java.lang.String getStartLabel() {
    return startLabel_;
  }
  /**
   * <pre>
   * The label of the start date/time value (e.g., 'Pick-up').
   * </pre>
   *
   * <code>optional string start_label = 5;</code>
   */
  public com.google.protobuf.ByteString
      getStartLabelBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(startLabel_);
  }
  /**
   * <pre>
   * The label of the start date/time value (e.g., 'Pick-up').
   * </pre>
   *
   * <code>optional string start_label = 5;</code>
   */
  private void setStartLabel(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
    startLabel_ = value;
  }
  /**
   * <pre>
   * The label of the start date/time value (e.g., 'Pick-up').
   * </pre>
   *
   * <code>optional string start_label = 5;</code>
   */
  private void clearStartLabel() {
    bitField0_ = (bitField0_ & ~0x00000010);
    startLabel_ = getDefaultInstance().getStartLabel();
  }
  /**
   * <pre>
   * The label of the start date/time value (e.g., 'Pick-up').
   * </pre>
   *
   * <code>optional string start_label = 5;</code>
   */
  private void setStartLabelBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
    startLabel_ = value.toStringUtf8();
  }

  public static final int END_LABEL_FIELD_NUMBER = 6;
  private java.lang.String endLabel_;
  /**
   * <pre>
   * The label of the end date/time value (e.g., 'Return').
   * </pre>
   *
   * <code>optional string end_label = 6;</code>
   */
  public boolean hasEndLabel() {
    return ((bitField0_ & 0x00000020) == 0x00000020);
  }
  /**
   * <pre>
   * The label of the end date/time value (e.g., 'Return').
   * </pre>
   *
   * <code>optional string end_label = 6;</code>
   */
  public java.lang.String getEndLabel() {
    return endLabel_;
  }
  /**
   * <pre>
   * The label of the end date/time value (e.g., 'Return').
   * </pre>
   *
   * <code>optional string end_label = 6;</code>
   */
  public com.google.protobuf.ByteString
      getEndLabelBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(endLabel_);
  }
  /**
   * <pre>
   * The label of the end date/time value (e.g., 'Return').
   * </pre>
   *
   * <code>optional string end_label = 6;</code>
   */
  private void setEndLabel(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
    endLabel_ = value;
  }
  /**
   * <pre>
   * The label of the end date/time value (e.g., 'Return').
   * </pre>
   *
   * <code>optional string end_label = 6;</code>
   */
  private void clearEndLabel() {
    bitField0_ = (bitField0_ & ~0x00000020);
    endLabel_ = getDefaultInstance().getEndLabel();
  }
  /**
   * <pre>
   * The label of the end date/time value (e.g., 'Return').
   * </pre>
   *
   * <code>optional string end_label = 6;</code>
   */
  private void setEndLabelBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
    endLabel_ = value.toStringUtf8();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeMessage(1, getStart());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeMessage(2, getEnd());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeMessage(3, getMin());
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      output.writeMessage(4, getMax());
    }
    if (((bitField0_ & 0x00000010) == 0x00000010)) {
      output.writeString(5, getStartLabel());
    }
    if (((bitField0_ & 0x00000020) == 0x00000020)) {
      output.writeString(6, getEndLabel());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getStart());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getEnd());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getMin());
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getMax());
    }
    if (((bitField0_ & 0x00000010) == 0x00000010)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(5, getStartLabel());
    }
    if (((bitField0_ & 0x00000020) == 0x00000020)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(6, getEndLabel());
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.DateTimeRangeProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DateTimeRangeProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DateTimeRangeProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DateTimeRangeProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DateTimeRangeProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DateTimeRangeProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DateTimeRangeProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DateTimeRangeProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DateTimeRangeProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DateTimeRangeProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.DateTimeRangeProto prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code autofill_assistant.DateTimeRangeProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.DateTimeRangeProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.DateTimeRangeProto)
      org.chromium.chrome.browser.autofill_assistant.proto.DateTimeRangeProtoOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.DateTimeRangeProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The start value of the date/time range.
     * </pre>
     *
     * <code>optional .autofill_assistant.DateTimeProto start = 1;</code>
     */
    public boolean hasStart() {
      return instance.hasStart();
    }
    /**
     * <pre>
     * The start value of the date/time range.
     * </pre>
     *
     * <code>optional .autofill_assistant.DateTimeProto start = 1;</code>
     */
    public org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto getStart() {
      return instance.getStart();
    }
    /**
     * <pre>
     * The start value of the date/time range.
     * </pre>
     *
     * <code>optional .autofill_assistant.DateTimeProto start = 1;</code>
     */
    public Builder setStart(org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto value) {
      copyOnWrite();
      instance.setStart(value);
      return this;
      }
    /**
     * <pre>
     * The start value of the date/time range.
     * </pre>
     *
     * <code>optional .autofill_assistant.DateTimeProto start = 1;</code>
     */
    public Builder setStart(
        org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto.Builder builderForValue) {
      copyOnWrite();
      instance.setStart(builderForValue);
      return this;
    }
    /**
     * <pre>
     * The start value of the date/time range.
     * </pre>
     *
     * <code>optional .autofill_assistant.DateTimeProto start = 1;</code>
     */
    public Builder mergeStart(org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto value) {
      copyOnWrite();
      instance.mergeStart(value);
      return this;
    }
    /**
     * <pre>
     * The start value of the date/time range.
     * </pre>
     *
     * <code>optional .autofill_assistant.DateTimeProto start = 1;</code>
     */
    public Builder clearStart() {  copyOnWrite();
      instance.clearStart();
      return this;
    }

    /**
     * <pre>
     * The end value of the date/time range.
     * </pre>
     *
     * <code>optional .autofill_assistant.DateTimeProto end = 2;</code>
     */
    public boolean hasEnd() {
      return instance.hasEnd();
    }
    /**
     * <pre>
     * The end value of the date/time range.
     * </pre>
     *
     * <code>optional .autofill_assistant.DateTimeProto end = 2;</code>
     */
    public org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto getEnd() {
      return instance.getEnd();
    }
    /**
     * <pre>
     * The end value of the date/time range.
     * </pre>
     *
     * <code>optional .autofill_assistant.DateTimeProto end = 2;</code>
     */
    public Builder setEnd(org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto value) {
      copyOnWrite();
      instance.setEnd(value);
      return this;
      }
    /**
     * <pre>
     * The end value of the date/time range.
     * </pre>
     *
     * <code>optional .autofill_assistant.DateTimeProto end = 2;</code>
     */
    public Builder setEnd(
        org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto.Builder builderForValue) {
      copyOnWrite();
      instance.setEnd(builderForValue);
      return this;
    }
    /**
     * <pre>
     * The end value of the date/time range.
     * </pre>
     *
     * <code>optional .autofill_assistant.DateTimeProto end = 2;</code>
     */
    public Builder mergeEnd(org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto value) {
      copyOnWrite();
      instance.mergeEnd(value);
      return this;
    }
    /**
     * <pre>
     * The end value of the date/time range.
     * </pre>
     *
     * <code>optional .autofill_assistant.DateTimeProto end = 2;</code>
     */
    public Builder clearEnd() {  copyOnWrite();
      instance.clearEnd();
      return this;
    }

    /**
     * <pre>
     * The minimum allowed value of the date/time range.
     * </pre>
     *
     * <code>optional .autofill_assistant.DateTimeProto min = 3;</code>
     */
    public boolean hasMin() {
      return instance.hasMin();
    }
    /**
     * <pre>
     * The minimum allowed value of the date/time range.
     * </pre>
     *
     * <code>optional .autofill_assistant.DateTimeProto min = 3;</code>
     */
    public org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto getMin() {
      return instance.getMin();
    }
    /**
     * <pre>
     * The minimum allowed value of the date/time range.
     * </pre>
     *
     * <code>optional .autofill_assistant.DateTimeProto min = 3;</code>
     */
    public Builder setMin(org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto value) {
      copyOnWrite();
      instance.setMin(value);
      return this;
      }
    /**
     * <pre>
     * The minimum allowed value of the date/time range.
     * </pre>
     *
     * <code>optional .autofill_assistant.DateTimeProto min = 3;</code>
     */
    public Builder setMin(
        org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto.Builder builderForValue) {
      copyOnWrite();
      instance.setMin(builderForValue);
      return this;
    }
    /**
     * <pre>
     * The minimum allowed value of the date/time range.
     * </pre>
     *
     * <code>optional .autofill_assistant.DateTimeProto min = 3;</code>
     */
    public Builder mergeMin(org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto value) {
      copyOnWrite();
      instance.mergeMin(value);
      return this;
    }
    /**
     * <pre>
     * The minimum allowed value of the date/time range.
     * </pre>
     *
     * <code>optional .autofill_assistant.DateTimeProto min = 3;</code>
     */
    public Builder clearMin() {  copyOnWrite();
      instance.clearMin();
      return this;
    }

    /**
     * <pre>
     * The maximum allowed value of the date/time range.
     * </pre>
     *
     * <code>optional .autofill_assistant.DateTimeProto max = 4;</code>
     */
    public boolean hasMax() {
      return instance.hasMax();
    }
    /**
     * <pre>
     * The maximum allowed value of the date/time range.
     * </pre>
     *
     * <code>optional .autofill_assistant.DateTimeProto max = 4;</code>
     */
    public org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto getMax() {
      return instance.getMax();
    }
    /**
     * <pre>
     * The maximum allowed value of the date/time range.
     * </pre>
     *
     * <code>optional .autofill_assistant.DateTimeProto max = 4;</code>
     */
    public Builder setMax(org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto value) {
      copyOnWrite();
      instance.setMax(value);
      return this;
      }
    /**
     * <pre>
     * The maximum allowed value of the date/time range.
     * </pre>
     *
     * <code>optional .autofill_assistant.DateTimeProto max = 4;</code>
     */
    public Builder setMax(
        org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto.Builder builderForValue) {
      copyOnWrite();
      instance.setMax(builderForValue);
      return this;
    }
    /**
     * <pre>
     * The maximum allowed value of the date/time range.
     * </pre>
     *
     * <code>optional .autofill_assistant.DateTimeProto max = 4;</code>
     */
    public Builder mergeMax(org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto value) {
      copyOnWrite();
      instance.mergeMax(value);
      return this;
    }
    /**
     * <pre>
     * The maximum allowed value of the date/time range.
     * </pre>
     *
     * <code>optional .autofill_assistant.DateTimeProto max = 4;</code>
     */
    public Builder clearMax() {  copyOnWrite();
      instance.clearMax();
      return this;
    }

    /**
     * <pre>
     * The label of the start date/time value (e.g., 'Pick-up').
     * </pre>
     *
     * <code>optional string start_label = 5;</code>
     */
    public boolean hasStartLabel() {
      return instance.hasStartLabel();
    }
    /**
     * <pre>
     * The label of the start date/time value (e.g., 'Pick-up').
     * </pre>
     *
     * <code>optional string start_label = 5;</code>
     */
    public java.lang.String getStartLabel() {
      return instance.getStartLabel();
    }
    /**
     * <pre>
     * The label of the start date/time value (e.g., 'Pick-up').
     * </pre>
     *
     * <code>optional string start_label = 5;</code>
     */
    public com.google.protobuf.ByteString
        getStartLabelBytes() {
      return instance.getStartLabelBytes();
    }
    /**
     * <pre>
     * The label of the start date/time value (e.g., 'Pick-up').
     * </pre>
     *
     * <code>optional string start_label = 5;</code>
     */
    public Builder setStartLabel(
        java.lang.String value) {
      copyOnWrite();
      instance.setStartLabel(value);
      return this;
    }
    /**
     * <pre>
     * The label of the start date/time value (e.g., 'Pick-up').
     * </pre>
     *
     * <code>optional string start_label = 5;</code>
     */
    public Builder clearStartLabel() {
      copyOnWrite();
      instance.clearStartLabel();
      return this;
    }
    /**
     * <pre>
     * The label of the start date/time value (e.g., 'Pick-up').
     * </pre>
     *
     * <code>optional string start_label = 5;</code>
     */
    public Builder setStartLabelBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setStartLabelBytes(value);
      return this;
    }

    /**
     * <pre>
     * The label of the end date/time value (e.g., 'Return').
     * </pre>
     *
     * <code>optional string end_label = 6;</code>
     */
    public boolean hasEndLabel() {
      return instance.hasEndLabel();
    }
    /**
     * <pre>
     * The label of the end date/time value (e.g., 'Return').
     * </pre>
     *
     * <code>optional string end_label = 6;</code>
     */
    public java.lang.String getEndLabel() {
      return instance.getEndLabel();
    }
    /**
     * <pre>
     * The label of the end date/time value (e.g., 'Return').
     * </pre>
     *
     * <code>optional string end_label = 6;</code>
     */
    public com.google.protobuf.ByteString
        getEndLabelBytes() {
      return instance.getEndLabelBytes();
    }
    /**
     * <pre>
     * The label of the end date/time value (e.g., 'Return').
     * </pre>
     *
     * <code>optional string end_label = 6;</code>
     */
    public Builder setEndLabel(
        java.lang.String value) {
      copyOnWrite();
      instance.setEndLabel(value);
      return this;
    }
    /**
     * <pre>
     * The label of the end date/time value (e.g., 'Return').
     * </pre>
     *
     * <code>optional string end_label = 6;</code>
     */
    public Builder clearEndLabel() {
      copyOnWrite();
      instance.clearEndLabel();
      return this;
    }
    /**
     * <pre>
     * The label of the end date/time value (e.g., 'Return').
     * </pre>
     *
     * <code>optional string end_label = 6;</code>
     */
    public Builder setEndLabelBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setEndLabelBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.DateTimeRangeProto)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.DateTimeRangeProto();
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
        org.chromium.chrome.browser.autofill_assistant.proto.DateTimeRangeProto other = (org.chromium.chrome.browser.autofill_assistant.proto.DateTimeRangeProto) arg1;
        start_ = visitor.visitMessage(start_, other.start_);
        end_ = visitor.visitMessage(end_, other.end_);
        min_ = visitor.visitMessage(min_, other.min_);
        max_ = visitor.visitMessage(max_, other.max_);
        startLabel_ = visitor.visitString(
            hasStartLabel(), startLabel_,
            other.hasStartLabel(), other.startLabel_);
        endLabel_ = visitor.visitString(
            hasEndLabel(), endLabel_,
            other.hasEndLabel(), other.endLabel_);
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
                org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = start_.toBuilder();
                }
                start_ = input.readMessage(org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(start_);
                  start_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
              case 18: {
                org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto.Builder subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = end_.toBuilder();
                }
                end_ = input.readMessage(org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(end_);
                  end_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
              case 26: {
                org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto.Builder subBuilder = null;
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                  subBuilder = min_.toBuilder();
                }
                min_ = input.readMessage(org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(min_);
                  min_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000004;
                break;
              }
              case 34: {
                org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto.Builder subBuilder = null;
                if (((bitField0_ & 0x00000008) == 0x00000008)) {
                  subBuilder = max_.toBuilder();
                }
                max_ = input.readMessage(org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(max_);
                  max_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000008;
                break;
              }
              case 42: {
                String s = input.readString();
                bitField0_ |= 0x00000010;
                startLabel_ = s;
                break;
              }
              case 50: {
                String s = input.readString();
                bitField0_ |= 0x00000020;
                endLabel_ = s;
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
        if (PARSER == null) {    synchronized (org.chromium.chrome.browser.autofill_assistant.proto.DateTimeRangeProto.class) {
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


  // @@protoc_insertion_point(class_scope:autofill_assistant.DateTimeRangeProto)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.DateTimeRangeProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new DateTimeRangeProto();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.DateTimeRangeProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<DateTimeRangeProto> PARSER;

  public static com.google.protobuf.Parser<DateTimeRangeProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

