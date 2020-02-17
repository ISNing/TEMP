// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * <pre>
 * Defines a mapping to an Android Q direct action.
 * </pre>
 *
 * Protobuf type {@code autofill_assistant.DirectActionProto}
 */
public  final class DirectActionProto extends
    com.google.protobuf.GeneratedMessageLite<
        DirectActionProto, DirectActionProto.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.DirectActionProto)
    DirectActionProtoOrBuilder {
  private DirectActionProto() {
    names_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    requiredArguments_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    optionalArguments_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
  }
  public static final int NAMES_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.ProtobufList<String> names_;
  /**
   * <pre>
   * Map to direct actions with the given names.
   * </pre>
   *
   * <code>repeated string names = 1;</code>
   */
  public java.util.List<String> getNamesList() {
    return names_;
  }
  /**
   * <pre>
   * Map to direct actions with the given names.
   * </pre>
   *
   * <code>repeated string names = 1;</code>
   */
  public int getNamesCount() {
    return names_.size();
  }
  /**
   * <pre>
   * Map to direct actions with the given names.
   * </pre>
   *
   * <code>repeated string names = 1;</code>
   */
  public java.lang.String getNames(int index) {
    return names_.get(index);
  }
  /**
   * <pre>
   * Map to direct actions with the given names.
   * </pre>
   *
   * <code>repeated string names = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNamesBytes(int index) {
    return com.google.protobuf.ByteString.copyFromUtf8(
        names_.get(index));
  }
  private void ensureNamesIsMutable() {
    if (!names_.isModifiable()) {
      names_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(names_);
     }
  }
  /**
   * <pre>
   * Map to direct actions with the given names.
   * </pre>
   *
   * <code>repeated string names = 1;</code>
   */
  private void setNames(
      int index, java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  ensureNamesIsMutable();
    names_.set(index, value);
  }
  /**
   * <pre>
   * Map to direct actions with the given names.
   * </pre>
   *
   * <code>repeated string names = 1;</code>
   */
  private void addNames(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  ensureNamesIsMutable();
    names_.add(value);
  }
  /**
   * <pre>
   * Map to direct actions with the given names.
   * </pre>
   *
   * <code>repeated string names = 1;</code>
   */
  private void addAllNames(
      java.lang.Iterable<java.lang.String> values) {
    ensureNamesIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, names_);
  }
  /**
   * <pre>
   * Map to direct actions with the given names.
   * </pre>
   *
   * <code>repeated string names = 1;</code>
   */
  private void clearNames() {
    names_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
  }
  /**
   * <pre>
   * Map to direct actions with the given names.
   * </pre>
   *
   * <code>repeated string names = 1;</code>
   */
  private void addNamesBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  ensureNamesIsMutable();
    names_.add(value.toStringUtf8());
  }

  public static final int REQUIRED_ARGUMENTS_FIELD_NUMBER = 2;
  private com.google.protobuf.Internal.ProtobufList<String> requiredArguments_;
  /**
   * <pre>
   * Arguments to report as required for the direct action.
   * This is included into the definition reported to the caller without being
   * interpreted. Requirement is not enforced.
   * </pre>
   *
   * <code>repeated string required_arguments = 2;</code>
   */
  public java.util.List<String> getRequiredArgumentsList() {
    return requiredArguments_;
  }
  /**
   * <pre>
   * Arguments to report as required for the direct action.
   * This is included into the definition reported to the caller without being
   * interpreted. Requirement is not enforced.
   * </pre>
   *
   * <code>repeated string required_arguments = 2;</code>
   */
  public int getRequiredArgumentsCount() {
    return requiredArguments_.size();
  }
  /**
   * <pre>
   * Arguments to report as required for the direct action.
   * This is included into the definition reported to the caller without being
   * interpreted. Requirement is not enforced.
   * </pre>
   *
   * <code>repeated string required_arguments = 2;</code>
   */
  public java.lang.String getRequiredArguments(int index) {
    return requiredArguments_.get(index);
  }
  /**
   * <pre>
   * Arguments to report as required for the direct action.
   * This is included into the definition reported to the caller without being
   * interpreted. Requirement is not enforced.
   * </pre>
   *
   * <code>repeated string required_arguments = 2;</code>
   */
  public com.google.protobuf.ByteString
      getRequiredArgumentsBytes(int index) {
    return com.google.protobuf.ByteString.copyFromUtf8(
        requiredArguments_.get(index));
  }
  private void ensureRequiredArgumentsIsMutable() {
    if (!requiredArguments_.isModifiable()) {
      requiredArguments_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(requiredArguments_);
     }
  }
  /**
   * <pre>
   * Arguments to report as required for the direct action.
   * This is included into the definition reported to the caller without being
   * interpreted. Requirement is not enforced.
   * </pre>
   *
   * <code>repeated string required_arguments = 2;</code>
   */
  private void setRequiredArguments(
      int index, java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  ensureRequiredArgumentsIsMutable();
    requiredArguments_.set(index, value);
  }
  /**
   * <pre>
   * Arguments to report as required for the direct action.
   * This is included into the definition reported to the caller without being
   * interpreted. Requirement is not enforced.
   * </pre>
   *
   * <code>repeated string required_arguments = 2;</code>
   */
  private void addRequiredArguments(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  ensureRequiredArgumentsIsMutable();
    requiredArguments_.add(value);
  }
  /**
   * <pre>
   * Arguments to report as required for the direct action.
   * This is included into the definition reported to the caller without being
   * interpreted. Requirement is not enforced.
   * </pre>
   *
   * <code>repeated string required_arguments = 2;</code>
   */
  private void addAllRequiredArguments(
      java.lang.Iterable<java.lang.String> values) {
    ensureRequiredArgumentsIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, requiredArguments_);
  }
  /**
   * <pre>
   * Arguments to report as required for the direct action.
   * This is included into the definition reported to the caller without being
   * interpreted. Requirement is not enforced.
   * </pre>
   *
   * <code>repeated string required_arguments = 2;</code>
   */
  private void clearRequiredArguments() {
    requiredArguments_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
  }
  /**
   * <pre>
   * Arguments to report as required for the direct action.
   * This is included into the definition reported to the caller without being
   * interpreted. Requirement is not enforced.
   * </pre>
   *
   * <code>repeated string required_arguments = 2;</code>
   */
  private void addRequiredArgumentsBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  ensureRequiredArgumentsIsMutable();
    requiredArguments_.add(value.toStringUtf8());
  }

  public static final int OPTIONAL_ARGUMENTS_FIELD_NUMBER = 3;
  private com.google.protobuf.Internal.ProtobufList<String> optionalArguments_;
  /**
   * <pre>
   * Arguments to report as optional for the direct action.
   * This is included into the definition reported to the caller without being
   * interpreted.
   * </pre>
   *
   * <code>repeated string optional_arguments = 3;</code>
   */
  public java.util.List<String> getOptionalArgumentsList() {
    return optionalArguments_;
  }
  /**
   * <pre>
   * Arguments to report as optional for the direct action.
   * This is included into the definition reported to the caller without being
   * interpreted.
   * </pre>
   *
   * <code>repeated string optional_arguments = 3;</code>
   */
  public int getOptionalArgumentsCount() {
    return optionalArguments_.size();
  }
  /**
   * <pre>
   * Arguments to report as optional for the direct action.
   * This is included into the definition reported to the caller without being
   * interpreted.
   * </pre>
   *
   * <code>repeated string optional_arguments = 3;</code>
   */
  public java.lang.String getOptionalArguments(int index) {
    return optionalArguments_.get(index);
  }
  /**
   * <pre>
   * Arguments to report as optional for the direct action.
   * This is included into the definition reported to the caller without being
   * interpreted.
   * </pre>
   *
   * <code>repeated string optional_arguments = 3;</code>
   */
  public com.google.protobuf.ByteString
      getOptionalArgumentsBytes(int index) {
    return com.google.protobuf.ByteString.copyFromUtf8(
        optionalArguments_.get(index));
  }
  private void ensureOptionalArgumentsIsMutable() {
    if (!optionalArguments_.isModifiable()) {
      optionalArguments_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(optionalArguments_);
     }
  }
  /**
   * <pre>
   * Arguments to report as optional for the direct action.
   * This is included into the definition reported to the caller without being
   * interpreted.
   * </pre>
   *
   * <code>repeated string optional_arguments = 3;</code>
   */
  private void setOptionalArguments(
      int index, java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  ensureOptionalArgumentsIsMutable();
    optionalArguments_.set(index, value);
  }
  /**
   * <pre>
   * Arguments to report as optional for the direct action.
   * This is included into the definition reported to the caller without being
   * interpreted.
   * </pre>
   *
   * <code>repeated string optional_arguments = 3;</code>
   */
  private void addOptionalArguments(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  ensureOptionalArgumentsIsMutable();
    optionalArguments_.add(value);
  }
  /**
   * <pre>
   * Arguments to report as optional for the direct action.
   * This is included into the definition reported to the caller without being
   * interpreted.
   * </pre>
   *
   * <code>repeated string optional_arguments = 3;</code>
   */
  private void addAllOptionalArguments(
      java.lang.Iterable<java.lang.String> values) {
    ensureOptionalArgumentsIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, optionalArguments_);
  }
  /**
   * <pre>
   * Arguments to report as optional for the direct action.
   * This is included into the definition reported to the caller without being
   * interpreted.
   * </pre>
   *
   * <code>repeated string optional_arguments = 3;</code>
   */
  private void clearOptionalArguments() {
    optionalArguments_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
  }
  /**
   * <pre>
   * Arguments to report as optional for the direct action.
   * This is included into the definition reported to the caller without being
   * interpreted.
   * </pre>
   *
   * <code>repeated string optional_arguments = 3;</code>
   */
  private void addOptionalArgumentsBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  ensureOptionalArgumentsIsMutable();
    optionalArguments_.add(value.toStringUtf8());
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < names_.size(); i++) {
      output.writeString(1, names_.get(i));
    }
    for (int i = 0; i < requiredArguments_.size(); i++) {
      output.writeString(2, requiredArguments_.get(i));
    }
    for (int i = 0; i < optionalArguments_.size(); i++) {
      output.writeString(3, optionalArguments_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < names_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeStringSizeNoTag(names_.get(i));
      }
      size += dataSize;
      size += 1 * getNamesList().size();
    }
    {
      int dataSize = 0;
      for (int i = 0; i < requiredArguments_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeStringSizeNoTag(requiredArguments_.get(i));
      }
      size += dataSize;
      size += 1 * getRequiredArgumentsList().size();
    }
    {
      int dataSize = 0;
      for (int i = 0; i < optionalArguments_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeStringSizeNoTag(optionalArguments_.get(i));
      }
      size += dataSize;
      size += 1 * getOptionalArgumentsList().size();
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.DirectActionProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DirectActionProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DirectActionProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DirectActionProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DirectActionProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DirectActionProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DirectActionProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DirectActionProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DirectActionProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DirectActionProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.DirectActionProto prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * Defines a mapping to an Android Q direct action.
   * </pre>
   *
   * Protobuf type {@code autofill_assistant.DirectActionProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.DirectActionProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.DirectActionProto)
      org.chromium.chrome.browser.autofill_assistant.proto.DirectActionProtoOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.DirectActionProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Map to direct actions with the given names.
     * </pre>
     *
     * <code>repeated string names = 1;</code>
     */
    public java.util.List<String>
        getNamesList() {
      return java.util.Collections.unmodifiableList(
          instance.getNamesList());
    }
    /**
     * <pre>
     * Map to direct actions with the given names.
     * </pre>
     *
     * <code>repeated string names = 1;</code>
     */
    public int getNamesCount() {
      return instance.getNamesCount();
    }
    /**
     * <pre>
     * Map to direct actions with the given names.
     * </pre>
     *
     * <code>repeated string names = 1;</code>
     */
    public java.lang.String getNames(int index) {
      return instance.getNames(index);
    }
    /**
     * <pre>
     * Map to direct actions with the given names.
     * </pre>
     *
     * <code>repeated string names = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNamesBytes(int index) {
      return instance.getNamesBytes(index);
    }
    /**
     * <pre>
     * Map to direct actions with the given names.
     * </pre>
     *
     * <code>repeated string names = 1;</code>
     */
    public Builder setNames(
        int index, java.lang.String value) {
      copyOnWrite();
      instance.setNames(index, value);
      return this;
    }
    /**
     * <pre>
     * Map to direct actions with the given names.
     * </pre>
     *
     * <code>repeated string names = 1;</code>
     */
    public Builder addNames(
        java.lang.String value) {
      copyOnWrite();
      instance.addNames(value);
      return this;
    }
    /**
     * <pre>
     * Map to direct actions with the given names.
     * </pre>
     *
     * <code>repeated string names = 1;</code>
     */
    public Builder addAllNames(
        java.lang.Iterable<java.lang.String> values) {
      copyOnWrite();
      instance.addAllNames(values);
      return this;
    }
    /**
     * <pre>
     * Map to direct actions with the given names.
     * </pre>
     *
     * <code>repeated string names = 1;</code>
     */
    public Builder clearNames() {
      copyOnWrite();
      instance.clearNames();
      return this;
    }
    /**
     * <pre>
     * Map to direct actions with the given names.
     * </pre>
     *
     * <code>repeated string names = 1;</code>
     */
    public Builder addNamesBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.addNamesBytes(value);
      return this;
    }

    /**
     * <pre>
     * Arguments to report as required for the direct action.
     * This is included into the definition reported to the caller without being
     * interpreted. Requirement is not enforced.
     * </pre>
     *
     * <code>repeated string required_arguments = 2;</code>
     */
    public java.util.List<String>
        getRequiredArgumentsList() {
      return java.util.Collections.unmodifiableList(
          instance.getRequiredArgumentsList());
    }
    /**
     * <pre>
     * Arguments to report as required for the direct action.
     * This is included into the definition reported to the caller without being
     * interpreted. Requirement is not enforced.
     * </pre>
     *
     * <code>repeated string required_arguments = 2;</code>
     */
    public int getRequiredArgumentsCount() {
      return instance.getRequiredArgumentsCount();
    }
    /**
     * <pre>
     * Arguments to report as required for the direct action.
     * This is included into the definition reported to the caller without being
     * interpreted. Requirement is not enforced.
     * </pre>
     *
     * <code>repeated string required_arguments = 2;</code>
     */
    public java.lang.String getRequiredArguments(int index) {
      return instance.getRequiredArguments(index);
    }
    /**
     * <pre>
     * Arguments to report as required for the direct action.
     * This is included into the definition reported to the caller without being
     * interpreted. Requirement is not enforced.
     * </pre>
     *
     * <code>repeated string required_arguments = 2;</code>
     */
    public com.google.protobuf.ByteString
        getRequiredArgumentsBytes(int index) {
      return instance.getRequiredArgumentsBytes(index);
    }
    /**
     * <pre>
     * Arguments to report as required for the direct action.
     * This is included into the definition reported to the caller without being
     * interpreted. Requirement is not enforced.
     * </pre>
     *
     * <code>repeated string required_arguments = 2;</code>
     */
    public Builder setRequiredArguments(
        int index, java.lang.String value) {
      copyOnWrite();
      instance.setRequiredArguments(index, value);
      return this;
    }
    /**
     * <pre>
     * Arguments to report as required for the direct action.
     * This is included into the definition reported to the caller without being
     * interpreted. Requirement is not enforced.
     * </pre>
     *
     * <code>repeated string required_arguments = 2;</code>
     */
    public Builder addRequiredArguments(
        java.lang.String value) {
      copyOnWrite();
      instance.addRequiredArguments(value);
      return this;
    }
    /**
     * <pre>
     * Arguments to report as required for the direct action.
     * This is included into the definition reported to the caller without being
     * interpreted. Requirement is not enforced.
     * </pre>
     *
     * <code>repeated string required_arguments = 2;</code>
     */
    public Builder addAllRequiredArguments(
        java.lang.Iterable<java.lang.String> values) {
      copyOnWrite();
      instance.addAllRequiredArguments(values);
      return this;
    }
    /**
     * <pre>
     * Arguments to report as required for the direct action.
     * This is included into the definition reported to the caller without being
     * interpreted. Requirement is not enforced.
     * </pre>
     *
     * <code>repeated string required_arguments = 2;</code>
     */
    public Builder clearRequiredArguments() {
      copyOnWrite();
      instance.clearRequiredArguments();
      return this;
    }
    /**
     * <pre>
     * Arguments to report as required for the direct action.
     * This is included into the definition reported to the caller without being
     * interpreted. Requirement is not enforced.
     * </pre>
     *
     * <code>repeated string required_arguments = 2;</code>
     */
    public Builder addRequiredArgumentsBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.addRequiredArgumentsBytes(value);
      return this;
    }

    /**
     * <pre>
     * Arguments to report as optional for the direct action.
     * This is included into the definition reported to the caller without being
     * interpreted.
     * </pre>
     *
     * <code>repeated string optional_arguments = 3;</code>
     */
    public java.util.List<String>
        getOptionalArgumentsList() {
      return java.util.Collections.unmodifiableList(
          instance.getOptionalArgumentsList());
    }
    /**
     * <pre>
     * Arguments to report as optional for the direct action.
     * This is included into the definition reported to the caller without being
     * interpreted.
     * </pre>
     *
     * <code>repeated string optional_arguments = 3;</code>
     */
    public int getOptionalArgumentsCount() {
      return instance.getOptionalArgumentsCount();
    }
    /**
     * <pre>
     * Arguments to report as optional for the direct action.
     * This is included into the definition reported to the caller without being
     * interpreted.
     * </pre>
     *
     * <code>repeated string optional_arguments = 3;</code>
     */
    public java.lang.String getOptionalArguments(int index) {
      return instance.getOptionalArguments(index);
    }
    /**
     * <pre>
     * Arguments to report as optional for the direct action.
     * This is included into the definition reported to the caller without being
     * interpreted.
     * </pre>
     *
     * <code>repeated string optional_arguments = 3;</code>
     */
    public com.google.protobuf.ByteString
        getOptionalArgumentsBytes(int index) {
      return instance.getOptionalArgumentsBytes(index);
    }
    /**
     * <pre>
     * Arguments to report as optional for the direct action.
     * This is included into the definition reported to the caller without being
     * interpreted.
     * </pre>
     *
     * <code>repeated string optional_arguments = 3;</code>
     */
    public Builder setOptionalArguments(
        int index, java.lang.String value) {
      copyOnWrite();
      instance.setOptionalArguments(index, value);
      return this;
    }
    /**
     * <pre>
     * Arguments to report as optional for the direct action.
     * This is included into the definition reported to the caller without being
     * interpreted.
     * </pre>
     *
     * <code>repeated string optional_arguments = 3;</code>
     */
    public Builder addOptionalArguments(
        java.lang.String value) {
      copyOnWrite();
      instance.addOptionalArguments(value);
      return this;
    }
    /**
     * <pre>
     * Arguments to report as optional for the direct action.
     * This is included into the definition reported to the caller without being
     * interpreted.
     * </pre>
     *
     * <code>repeated string optional_arguments = 3;</code>
     */
    public Builder addAllOptionalArguments(
        java.lang.Iterable<java.lang.String> values) {
      copyOnWrite();
      instance.addAllOptionalArguments(values);
      return this;
    }
    /**
     * <pre>
     * Arguments to report as optional for the direct action.
     * This is included into the definition reported to the caller without being
     * interpreted.
     * </pre>
     *
     * <code>repeated string optional_arguments = 3;</code>
     */
    public Builder clearOptionalArguments() {
      copyOnWrite();
      instance.clearOptionalArguments();
      return this;
    }
    /**
     * <pre>
     * Arguments to report as optional for the direct action.
     * This is included into the definition reported to the caller without being
     * interpreted.
     * </pre>
     *
     * <code>repeated string optional_arguments = 3;</code>
     */
    public Builder addOptionalArgumentsBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.addOptionalArgumentsBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.DirectActionProto)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.DirectActionProto();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        names_.makeImmutable();
        requiredArguments_.makeImmutable();
        optionalArguments_.makeImmutable();
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        org.chromium.chrome.browser.autofill_assistant.proto.DirectActionProto other = (org.chromium.chrome.browser.autofill_assistant.proto.DirectActionProto) arg1;
        names_= visitor.visitList(names_, other.names_);
        requiredArguments_= visitor.visitList(requiredArguments_, other.requiredArguments_);
        optionalArguments_= visitor.visitList(optionalArguments_, other.optionalArguments_);
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
                if (!parseUnknownField(tag, input)) {
                  done = true;
                }
                break;
              }
              case 10: {
                String s = input.readString();
                if (!names_.isModifiable()) {
                  names_ =
                      com.google.protobuf.GeneratedMessageLite.mutableCopy(names_);
                }
                names_.add(s);
                break;
              }
              case 18: {
                String s = input.readString();
                if (!requiredArguments_.isModifiable()) {
                  requiredArguments_ =
                      com.google.protobuf.GeneratedMessageLite.mutableCopy(requiredArguments_);
                }
                requiredArguments_.add(s);
                break;
              }
              case 26: {
                String s = input.readString();
                if (!optionalArguments_.isModifiable()) {
                  optionalArguments_ =
                      com.google.protobuf.GeneratedMessageLite.mutableCopy(optionalArguments_);
                }
                optionalArguments_.add(s);
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
        if (PARSER == null) {    synchronized (org.chromium.chrome.browser.autofill_assistant.proto.DirectActionProto.class) {
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


  // @@protoc_insertion_point(class_scope:autofill_assistant.DirectActionProto)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.DirectActionProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new DirectActionProto();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.DirectActionProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<DirectActionProto> PARSER;

  public static com.google.protobuf.Parser<DirectActionProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

