// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: autofill_specifics.proto

package org.chromium.components.sync.protocol;

/**
 * Protobuf type {@code sync_pb.AutofillSpecifics}
 */
public  final class AutofillSpecifics extends
    com.google.protobuf.GeneratedMessageLite<
        AutofillSpecifics, AutofillSpecifics.Builder> implements
    // @@protoc_insertion_point(message_implements:sync_pb.AutofillSpecifics)
    AutofillSpecificsOrBuilder {
  private AutofillSpecifics() {
    name_ = "";
    value_ = "";
    usageTimestamp_ = emptyLongList();
  }
  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;
  private java.lang.String name_;
  /**
   * <pre>
   * If any of these 3 fields are present, then all 3 should be, and it implies
   * that this entity represents a classic autofill object.  In this case,
   * none of the autofill++ objects below should be present.
   * </pre>
   *
   * <code>optional string name = 1;</code>
   */
  public boolean hasName() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <pre>
   * If any of these 3 fields are present, then all 3 should be, and it implies
   * that this entity represents a classic autofill object.  In this case,
   * none of the autofill++ objects below should be present.
   * </pre>
   *
   * <code>optional string name = 1;</code>
   */
  public java.lang.String getName() {
    return name_;
  }
  /**
   * <pre>
   * If any of these 3 fields are present, then all 3 should be, and it implies
   * that this entity represents a classic autofill object.  In this case,
   * none of the autofill++ objects below should be present.
   * </pre>
   *
   * <code>optional string name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(name_);
  }
  /**
   * <pre>
   * If any of these 3 fields are present, then all 3 should be, and it implies
   * that this entity represents a classic autofill object.  In this case,
   * none of the autofill++ objects below should be present.
   * </pre>
   *
   * <code>optional string name = 1;</code>
   */
  private void setName(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
    name_ = value;
  }
  /**
   * <pre>
   * If any of these 3 fields are present, then all 3 should be, and it implies
   * that this entity represents a classic autofill object.  In this case,
   * none of the autofill++ objects below should be present.
   * </pre>
   *
   * <code>optional string name = 1;</code>
   */
  private void clearName() {
    bitField0_ = (bitField0_ & ~0x00000001);
    name_ = getDefaultInstance().getName();
  }
  /**
   * <pre>
   * If any of these 3 fields are present, then all 3 should be, and it implies
   * that this entity represents a classic autofill object.  In this case,
   * none of the autofill++ objects below should be present.
   * </pre>
   *
   * <code>optional string name = 1;</code>
   */
  private void setNameBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
    name_ = value.toStringUtf8();
  }

  public static final int VALUE_FIELD_NUMBER = 2;
  private java.lang.String value_;
  /**
   * <code>optional string value = 2;</code>
   */
  public boolean hasValue() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional string value = 2;</code>
   */
  public java.lang.String getValue() {
    return value_;
  }
  /**
   * <code>optional string value = 2;</code>
   */
  public com.google.protobuf.ByteString
      getValueBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(value_);
  }
  /**
   * <code>optional string value = 2;</code>
   */
  private void setValue(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
    value_ = value;
  }
  /**
   * <code>optional string value = 2;</code>
   */
  private void clearValue() {
    bitField0_ = (bitField0_ & ~0x00000002);
    value_ = getDefaultInstance().getValue();
  }
  /**
   * <code>optional string value = 2;</code>
   */
  private void setValueBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
    value_ = value.toStringUtf8();
  }

  public static final int USAGE_TIMESTAMP_FIELD_NUMBER = 3;
  private com.google.protobuf.Internal.LongList usageTimestamp_;
  /**
   * <code>repeated int64 usage_timestamp = 3;</code>
   */
  public java.util.List<java.lang.Long>
      getUsageTimestampList() {
    return usageTimestamp_;
  }
  /**
   * <code>repeated int64 usage_timestamp = 3;</code>
   */
  public int getUsageTimestampCount() {
    return usageTimestamp_.size();
  }
  /**
   * <code>repeated int64 usage_timestamp = 3;</code>
   */
  public long getUsageTimestamp(int index) {
    return usageTimestamp_.getLong(index);
  }
  private void ensureUsageTimestampIsMutable() {
    if (!usageTimestamp_.isModifiable()) {
      usageTimestamp_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(usageTimestamp_);
     }
  }
  /**
   * <code>repeated int64 usage_timestamp = 3;</code>
   */
  private void setUsageTimestamp(
      int index, long value) {
    ensureUsageTimestampIsMutable();
    usageTimestamp_.setLong(index, value);
  }
  /**
   * <code>repeated int64 usage_timestamp = 3;</code>
   */
  private void addUsageTimestamp(long value) {
    ensureUsageTimestampIsMutable();
    usageTimestamp_.addLong(value);
  }
  /**
   * <code>repeated int64 usage_timestamp = 3;</code>
   */
  private void addAllUsageTimestamp(
      java.lang.Iterable<? extends java.lang.Long> values) {
    ensureUsageTimestampIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, usageTimestamp_);
  }
  /**
   * <code>repeated int64 usage_timestamp = 3;</code>
   */
  private void clearUsageTimestamp() {
    usageTimestamp_ = emptyLongList();
  }

  public static final int PROFILE_FIELD_NUMBER = 4;
  private org.chromium.components.sync.protocol.AutofillProfileSpecifics profile_;
  /**
   * <pre>
   * An autofill++ profile object.  If present, indicates this entity
   * represents an AutofillProfile exclusively, and no other fields (such as
   * name/value or credit_card) should be present.
   * </pre>
   *
   * <code>optional .sync_pb.AutofillProfileSpecifics profile = 4;</code>
   */
  public boolean hasProfile() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <pre>
   * An autofill++ profile object.  If present, indicates this entity
   * represents an AutofillProfile exclusively, and no other fields (such as
   * name/value or credit_card) should be present.
   * </pre>
   *
   * <code>optional .sync_pb.AutofillProfileSpecifics profile = 4;</code>
   */
  public org.chromium.components.sync.protocol.AutofillProfileSpecifics getProfile() {
    return profile_ == null ? org.chromium.components.sync.protocol.AutofillProfileSpecifics.getDefaultInstance() : profile_;
  }
  /**
   * <pre>
   * An autofill++ profile object.  If present, indicates this entity
   * represents an AutofillProfile exclusively, and no other fields (such as
   * name/value or credit_card) should be present.
   * </pre>
   *
   * <code>optional .sync_pb.AutofillProfileSpecifics profile = 4;</code>
   */
  private void setProfile(org.chromium.components.sync.protocol.AutofillProfileSpecifics value) {
    if (value == null) {
      throw new NullPointerException();
    }
    profile_ = value;
    bitField0_ |= 0x00000004;
    }
  /**
   * <pre>
   * An autofill++ profile object.  If present, indicates this entity
   * represents an AutofillProfile exclusively, and no other fields (such as
   * name/value or credit_card) should be present.
   * </pre>
   *
   * <code>optional .sync_pb.AutofillProfileSpecifics profile = 4;</code>
   */
  private void setProfile(
      org.chromium.components.sync.protocol.AutofillProfileSpecifics.Builder builderForValue) {
    profile_ = builderForValue.build();
    bitField0_ |= 0x00000004;
  }
  /**
   * <pre>
   * An autofill++ profile object.  If present, indicates this entity
   * represents an AutofillProfile exclusively, and no other fields (such as
   * name/value or credit_card) should be present.
   * </pre>
   *
   * <code>optional .sync_pb.AutofillProfileSpecifics profile = 4;</code>
   */
  private void mergeProfile(org.chromium.components.sync.protocol.AutofillProfileSpecifics value) {
    if (profile_ != null &&
        profile_ != org.chromium.components.sync.protocol.AutofillProfileSpecifics.getDefaultInstance()) {
      profile_ =
        org.chromium.components.sync.protocol.AutofillProfileSpecifics.newBuilder(profile_).mergeFrom(value).buildPartial();
    } else {
      profile_ = value;
    }
    bitField0_ |= 0x00000004;
  }
  /**
   * <pre>
   * An autofill++ profile object.  If present, indicates this entity
   * represents an AutofillProfile exclusively, and no other fields (such as
   * name/value or credit_card) should be present.
   * </pre>
   *
   * <code>optional .sync_pb.AutofillProfileSpecifics profile = 4;</code>
   */
  private void clearProfile() {  profile_ = null;
    bitField0_ = (bitField0_ & ~0x00000004);
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeString(1, getName());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeString(2, getValue());
    }
    for (int i = 0; i < usageTimestamp_.size(); i++) {
      output.writeInt64(3, usageTimestamp_.getLong(i));
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeMessage(4, getProfile());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, getName());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(2, getValue());
    }
    {
      int dataSize = 0;
      for (int i = 0; i < usageTimestamp_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(usageTimestamp_.getLong(i));
      }
      size += dataSize;
      size += 1 * getUsageTimestampList().size();
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getProfile());
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static org.chromium.components.sync.protocol.AutofillSpecifics parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.AutofillSpecifics parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.AutofillSpecifics parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.AutofillSpecifics parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.AutofillSpecifics parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.AutofillSpecifics parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.AutofillSpecifics parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.AutofillSpecifics parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.AutofillSpecifics parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.AutofillSpecifics parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.chromium.components.sync.protocol.AutofillSpecifics prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code sync_pb.AutofillSpecifics}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.components.sync.protocol.AutofillSpecifics, Builder> implements
      // @@protoc_insertion_point(builder_implements:sync_pb.AutofillSpecifics)
      org.chromium.components.sync.protocol.AutofillSpecificsOrBuilder {
    // Construct using org.chromium.components.sync.protocol.AutofillSpecifics.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * If any of these 3 fields are present, then all 3 should be, and it implies
     * that this entity represents a classic autofill object.  In this case,
     * none of the autofill++ objects below should be present.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public boolean hasName() {
      return instance.hasName();
    }
    /**
     * <pre>
     * If any of these 3 fields are present, then all 3 should be, and it implies
     * that this entity represents a classic autofill object.  In this case,
     * none of the autofill++ objects below should be present.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public java.lang.String getName() {
      return instance.getName();
    }
    /**
     * <pre>
     * If any of these 3 fields are present, then all 3 should be, and it implies
     * that this entity represents a classic autofill object.  In this case,
     * none of the autofill++ objects below should be present.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      return instance.getNameBytes();
    }
    /**
     * <pre>
     * If any of these 3 fields are present, then all 3 should be, and it implies
     * that this entity represents a classic autofill object.  In this case,
     * none of the autofill++ objects below should be present.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public Builder setName(
        java.lang.String value) {
      copyOnWrite();
      instance.setName(value);
      return this;
    }
    /**
     * <pre>
     * If any of these 3 fields are present, then all 3 should be, and it implies
     * that this entity represents a classic autofill object.  In this case,
     * none of the autofill++ objects below should be present.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public Builder clearName() {
      copyOnWrite();
      instance.clearName();
      return this;
    }
    /**
     * <pre>
     * If any of these 3 fields are present, then all 3 should be, and it implies
     * that this entity represents a classic autofill object.  In this case,
     * none of the autofill++ objects below should be present.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setNameBytes(value);
      return this;
    }

    /**
     * <code>optional string value = 2;</code>
     */
    public boolean hasValue() {
      return instance.hasValue();
    }
    /**
     * <code>optional string value = 2;</code>
     */
    public java.lang.String getValue() {
      return instance.getValue();
    }
    /**
     * <code>optional string value = 2;</code>
     */
    public com.google.protobuf.ByteString
        getValueBytes() {
      return instance.getValueBytes();
    }
    /**
     * <code>optional string value = 2;</code>
     */
    public Builder setValue(
        java.lang.String value) {
      copyOnWrite();
      instance.setValue(value);
      return this;
    }
    /**
     * <code>optional string value = 2;</code>
     */
    public Builder clearValue() {
      copyOnWrite();
      instance.clearValue();
      return this;
    }
    /**
     * <code>optional string value = 2;</code>
     */
    public Builder setValueBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setValueBytes(value);
      return this;
    }

    /**
     * <code>repeated int64 usage_timestamp = 3;</code>
     */
    public java.util.List<java.lang.Long>
        getUsageTimestampList() {
      return java.util.Collections.unmodifiableList(
          instance.getUsageTimestampList());
    }
    /**
     * <code>repeated int64 usage_timestamp = 3;</code>
     */
    public int getUsageTimestampCount() {
      return instance.getUsageTimestampCount();
    }
    /**
     * <code>repeated int64 usage_timestamp = 3;</code>
     */
    public long getUsageTimestamp(int index) {
      return instance.getUsageTimestamp(index);
    }
    /**
     * <code>repeated int64 usage_timestamp = 3;</code>
     */
    public Builder setUsageTimestamp(
        int index, long value) {
      copyOnWrite();
      instance.setUsageTimestamp(index, value);
      return this;
    }
    /**
     * <code>repeated int64 usage_timestamp = 3;</code>
     */
    public Builder addUsageTimestamp(long value) {
      copyOnWrite();
      instance.addUsageTimestamp(value);
      return this;
    }
    /**
     * <code>repeated int64 usage_timestamp = 3;</code>
     */
    public Builder addAllUsageTimestamp(
        java.lang.Iterable<? extends java.lang.Long> values) {
      copyOnWrite();
      instance.addAllUsageTimestamp(values);
      return this;
    }
    /**
     * <code>repeated int64 usage_timestamp = 3;</code>
     */
    public Builder clearUsageTimestamp() {
      copyOnWrite();
      instance.clearUsageTimestamp();
      return this;
    }

    /**
     * <pre>
     * An autofill++ profile object.  If present, indicates this entity
     * represents an AutofillProfile exclusively, and no other fields (such as
     * name/value or credit_card) should be present.
     * </pre>
     *
     * <code>optional .sync_pb.AutofillProfileSpecifics profile = 4;</code>
     */
    public boolean hasProfile() {
      return instance.hasProfile();
    }
    /**
     * <pre>
     * An autofill++ profile object.  If present, indicates this entity
     * represents an AutofillProfile exclusively, and no other fields (such as
     * name/value or credit_card) should be present.
     * </pre>
     *
     * <code>optional .sync_pb.AutofillProfileSpecifics profile = 4;</code>
     */
    public org.chromium.components.sync.protocol.AutofillProfileSpecifics getProfile() {
      return instance.getProfile();
    }
    /**
     * <pre>
     * An autofill++ profile object.  If present, indicates this entity
     * represents an AutofillProfile exclusively, and no other fields (such as
     * name/value or credit_card) should be present.
     * </pre>
     *
     * <code>optional .sync_pb.AutofillProfileSpecifics profile = 4;</code>
     */
    public Builder setProfile(org.chromium.components.sync.protocol.AutofillProfileSpecifics value) {
      copyOnWrite();
      instance.setProfile(value);
      return this;
      }
    /**
     * <pre>
     * An autofill++ profile object.  If present, indicates this entity
     * represents an AutofillProfile exclusively, and no other fields (such as
     * name/value or credit_card) should be present.
     * </pre>
     *
     * <code>optional .sync_pb.AutofillProfileSpecifics profile = 4;</code>
     */
    public Builder setProfile(
        org.chromium.components.sync.protocol.AutofillProfileSpecifics.Builder builderForValue) {
      copyOnWrite();
      instance.setProfile(builderForValue);
      return this;
    }
    /**
     * <pre>
     * An autofill++ profile object.  If present, indicates this entity
     * represents an AutofillProfile exclusively, and no other fields (such as
     * name/value or credit_card) should be present.
     * </pre>
     *
     * <code>optional .sync_pb.AutofillProfileSpecifics profile = 4;</code>
     */
    public Builder mergeProfile(org.chromium.components.sync.protocol.AutofillProfileSpecifics value) {
      copyOnWrite();
      instance.mergeProfile(value);
      return this;
    }
    /**
     * <pre>
     * An autofill++ profile object.  If present, indicates this entity
     * represents an AutofillProfile exclusively, and no other fields (such as
     * name/value or credit_card) should be present.
     * </pre>
     *
     * <code>optional .sync_pb.AutofillProfileSpecifics profile = 4;</code>
     */
    public Builder clearProfile() {  copyOnWrite();
      instance.clearProfile();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sync_pb.AutofillSpecifics)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.components.sync.protocol.AutofillSpecifics();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        usageTimestamp_.makeImmutable();
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        org.chromium.components.sync.protocol.AutofillSpecifics other = (org.chromium.components.sync.protocol.AutofillSpecifics) arg1;
        name_ = visitor.visitString(
            hasName(), name_,
            other.hasName(), other.name_);
        value_ = visitor.visitString(
            hasValue(), value_,
            other.hasValue(), other.value_);
        usageTimestamp_= visitor.visitLongList(usageTimestamp_, other.usageTimestamp_);
        profile_ = visitor.visitMessage(profile_, other.profile_);
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
                name_ = s;
                break;
              }
              case 18: {
                String s = input.readString();
                bitField0_ |= 0x00000002;
                value_ = s;
                break;
              }
              case 24: {
                if (!usageTimestamp_.isModifiable()) {
                  usageTimestamp_ =
                      com.google.protobuf.GeneratedMessageLite.mutableCopy(usageTimestamp_);
                }
                usageTimestamp_.addLong(input.readInt64());
                break;
              }
              case 26: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                if (!usageTimestamp_.isModifiable() && input.getBytesUntilLimit() > 0) {
                  usageTimestamp_ =
                      com.google.protobuf.GeneratedMessageLite.mutableCopy(usageTimestamp_);
                }
                while (input.getBytesUntilLimit() > 0) {
                  usageTimestamp_.addLong(input.readInt64());
                }
                input.popLimit(limit);
                break;
              }
              case 34: {
                org.chromium.components.sync.protocol.AutofillProfileSpecifics.Builder subBuilder = null;
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                  subBuilder = profile_.toBuilder();
                }
                profile_ = input.readMessage(org.chromium.components.sync.protocol.AutofillProfileSpecifics.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(profile_);
                  profile_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000004;
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
        if (PARSER == null) {    synchronized (org.chromium.components.sync.protocol.AutofillSpecifics.class) {
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


  // @@protoc_insertion_point(class_scope:sync_pb.AutofillSpecifics)
  private static final org.chromium.components.sync.protocol.AutofillSpecifics DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new AutofillSpecifics();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static org.chromium.components.sync.protocol.AutofillSpecifics getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<AutofillSpecifics> PARSER;

  public static com.google.protobuf.Parser<AutofillSpecifics> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

