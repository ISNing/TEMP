// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: reading_list_specifics.proto

package org.chromium.components.sync.protocol;

/**
 * <pre>
 * Sync Reading list entry. This proto contains the fields synced for a reading
 * list entry. It must be kept synced with the reading_list.ReadingListLocal
 * protobuf.
 * </pre>
 *
 * Protobuf type {@code sync_pb.ReadingListSpecifics}
 */
public  final class ReadingListSpecifics extends
    com.google.protobuf.GeneratedMessageLite<
        ReadingListSpecifics, ReadingListSpecifics.Builder> implements
    // @@protoc_insertion_point(message_implements:sync_pb.ReadingListSpecifics)
    ReadingListSpecificsOrBuilder {
  private ReadingListSpecifics() {
    entryId_ = "";
    title_ = "";
    url_ = "";
  }
  /**
   * Protobuf enum {@code sync_pb.ReadingListSpecifics.ReadingListEntryStatus}
   */
  public enum ReadingListEntryStatus
      implements com.google.protobuf.Internal.EnumLite {
    /**
     * <code>UNREAD = 0;</code>
     */
    UNREAD(0),
    /**
     * <code>READ = 1;</code>
     */
    READ(1),
    /**
     * <code>UNSEEN = 2;</code>
     */
    UNSEEN(2),
    ;

    /**
     * <code>UNREAD = 0;</code>
     */
    public static final int UNREAD_VALUE = 0;
    /**
     * <code>READ = 1;</code>
     */
    public static final int READ_VALUE = 1;
    /**
     * <code>UNSEEN = 2;</code>
     */
    public static final int UNSEEN_VALUE = 2;


    public final int getNumber() {
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ReadingListEntryStatus valueOf(int value) {
      return forNumber(value);
    }

    public static ReadingListEntryStatus forNumber(int value) {
      switch (value) {
        case 0: return UNREAD;
        case 1: return READ;
        case 2: return UNSEEN;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ReadingListEntryStatus>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ReadingListEntryStatus> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ReadingListEntryStatus>() {
            public ReadingListEntryStatus findValueByNumber(int number) {
              return ReadingListEntryStatus.forNumber(number);
            }
          };

    private final int value;

    private ReadingListEntryStatus(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:sync_pb.ReadingListSpecifics.ReadingListEntryStatus)
  }

  private int bitField0_;
  public static final int ENTRY_ID_FIELD_NUMBER = 1;
  private java.lang.String entryId_;
  /**
   * <code>optional string entry_id = 1;</code>
   */
  public boolean hasEntryId() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional string entry_id = 1;</code>
   */
  public java.lang.String getEntryId() {
    return entryId_;
  }
  /**
   * <code>optional string entry_id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getEntryIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(entryId_);
  }
  /**
   * <code>optional string entry_id = 1;</code>
   */
  private void setEntryId(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
    entryId_ = value;
  }
  /**
   * <code>optional string entry_id = 1;</code>
   */
  private void clearEntryId() {
    bitField0_ = (bitField0_ & ~0x00000001);
    entryId_ = getDefaultInstance().getEntryId();
  }
  /**
   * <code>optional string entry_id = 1;</code>
   */
  private void setEntryIdBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
    entryId_ = value.toStringUtf8();
  }

  public static final int TITLE_FIELD_NUMBER = 2;
  private java.lang.String title_;
  /**
   * <code>optional string title = 2;</code>
   */
  public boolean hasTitle() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional string title = 2;</code>
   */
  public java.lang.String getTitle() {
    return title_;
  }
  /**
   * <code>optional string title = 2;</code>
   */
  public com.google.protobuf.ByteString
      getTitleBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(title_);
  }
  /**
   * <code>optional string title = 2;</code>
   */
  private void setTitle(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
    title_ = value;
  }
  /**
   * <code>optional string title = 2;</code>
   */
  private void clearTitle() {
    bitField0_ = (bitField0_ & ~0x00000002);
    title_ = getDefaultInstance().getTitle();
  }
  /**
   * <code>optional string title = 2;</code>
   */
  private void setTitleBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
    title_ = value.toStringUtf8();
  }

  public static final int URL_FIELD_NUMBER = 3;
  private java.lang.String url_;
  /**
   * <code>optional string url = 3;</code>
   */
  public boolean hasUrl() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional string url = 3;</code>
   */
  public java.lang.String getUrl() {
    return url_;
  }
  /**
   * <code>optional string url = 3;</code>
   */
  public com.google.protobuf.ByteString
      getUrlBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(url_);
  }
  /**
   * <code>optional string url = 3;</code>
   */
  private void setUrl(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
    url_ = value;
  }
  /**
   * <code>optional string url = 3;</code>
   */
  private void clearUrl() {
    bitField0_ = (bitField0_ & ~0x00000004);
    url_ = getDefaultInstance().getUrl();
  }
  /**
   * <code>optional string url = 3;</code>
   */
  private void setUrlBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
    url_ = value.toStringUtf8();
  }

  public static final int CREATION_TIME_US_FIELD_NUMBER = 4;
  private long creationTimeUs_;
  /**
   * <code>optional int64 creation_time_us = 4;</code>
   */
  public boolean hasCreationTimeUs() {
    return ((bitField0_ & 0x00000008) == 0x00000008);
  }
  /**
   * <code>optional int64 creation_time_us = 4;</code>
   */
  public long getCreationTimeUs() {
    return creationTimeUs_;
  }
  /**
   * <code>optional int64 creation_time_us = 4;</code>
   */
  private void setCreationTimeUs(long value) {
    bitField0_ |= 0x00000008;
    creationTimeUs_ = value;
  }
  /**
   * <code>optional int64 creation_time_us = 4;</code>
   */
  private void clearCreationTimeUs() {
    bitField0_ = (bitField0_ & ~0x00000008);
    creationTimeUs_ = 0L;
  }

  public static final int UPDATE_TIME_US_FIELD_NUMBER = 5;
  private long updateTimeUs_;
  /**
   * <code>optional int64 update_time_us = 5;</code>
   */
  public boolean hasUpdateTimeUs() {
    return ((bitField0_ & 0x00000010) == 0x00000010);
  }
  /**
   * <code>optional int64 update_time_us = 5;</code>
   */
  public long getUpdateTimeUs() {
    return updateTimeUs_;
  }
  /**
   * <code>optional int64 update_time_us = 5;</code>
   */
  private void setUpdateTimeUs(long value) {
    bitField0_ |= 0x00000010;
    updateTimeUs_ = value;
  }
  /**
   * <code>optional int64 update_time_us = 5;</code>
   */
  private void clearUpdateTimeUs() {
    bitField0_ = (bitField0_ & ~0x00000010);
    updateTimeUs_ = 0L;
  }

  public static final int FIRST_READ_TIME_US_FIELD_NUMBER = 7;
  private long firstReadTimeUs_;
  /**
   * <code>optional int64 first_read_time_us = 7;</code>
   */
  public boolean hasFirstReadTimeUs() {
    return ((bitField0_ & 0x00000020) == 0x00000020);
  }
  /**
   * <code>optional int64 first_read_time_us = 7;</code>
   */
  public long getFirstReadTimeUs() {
    return firstReadTimeUs_;
  }
  /**
   * <code>optional int64 first_read_time_us = 7;</code>
   */
  private void setFirstReadTimeUs(long value) {
    bitField0_ |= 0x00000020;
    firstReadTimeUs_ = value;
  }
  /**
   * <code>optional int64 first_read_time_us = 7;</code>
   */
  private void clearFirstReadTimeUs() {
    bitField0_ = (bitField0_ & ~0x00000020);
    firstReadTimeUs_ = 0L;
  }

  public static final int UPDATE_TITLE_TIME_US_FIELD_NUMBER = 8;
  private long updateTitleTimeUs_;
  /**
   * <code>optional int64 update_title_time_us = 8;</code>
   */
  public boolean hasUpdateTitleTimeUs() {
    return ((bitField0_ & 0x00000040) == 0x00000040);
  }
  /**
   * <code>optional int64 update_title_time_us = 8;</code>
   */
  public long getUpdateTitleTimeUs() {
    return updateTitleTimeUs_;
  }
  /**
   * <code>optional int64 update_title_time_us = 8;</code>
   */
  private void setUpdateTitleTimeUs(long value) {
    bitField0_ |= 0x00000040;
    updateTitleTimeUs_ = value;
  }
  /**
   * <code>optional int64 update_title_time_us = 8;</code>
   */
  private void clearUpdateTitleTimeUs() {
    bitField0_ = (bitField0_ & ~0x00000040);
    updateTitleTimeUs_ = 0L;
  }

  public static final int STATUS_FIELD_NUMBER = 6;
  private int status_;
  /**
   * <pre>
   * If the field is not present, it defaults to UNSEEN.
   * </pre>
   *
   * <code>optional .sync_pb.ReadingListSpecifics.ReadingListEntryStatus status = 6;</code>
   */
  public boolean hasStatus() {
    return ((bitField0_ & 0x00000080) == 0x00000080);
  }
  /**
   * <pre>
   * If the field is not present, it defaults to UNSEEN.
   * </pre>
   *
   * <code>optional .sync_pb.ReadingListSpecifics.ReadingListEntryStatus status = 6;</code>
   */
  public org.chromium.components.sync.protocol.ReadingListSpecifics.ReadingListEntryStatus getStatus() {
    org.chromium.components.sync.protocol.ReadingListSpecifics.ReadingListEntryStatus result = org.chromium.components.sync.protocol.ReadingListSpecifics.ReadingListEntryStatus.forNumber(status_);
    return result == null ? org.chromium.components.sync.protocol.ReadingListSpecifics.ReadingListEntryStatus.UNREAD : result;
  }
  /**
   * <pre>
   * If the field is not present, it defaults to UNSEEN.
   * </pre>
   *
   * <code>optional .sync_pb.ReadingListSpecifics.ReadingListEntryStatus status = 6;</code>
   */
  private void setStatus(org.chromium.components.sync.protocol.ReadingListSpecifics.ReadingListEntryStatus value) {
    if (value == null) {
      throw new NullPointerException();
    }
    bitField0_ |= 0x00000080;
    status_ = value.getNumber();
  }
  /**
   * <pre>
   * If the field is not present, it defaults to UNSEEN.
   * </pre>
   *
   * <code>optional .sync_pb.ReadingListSpecifics.ReadingListEntryStatus status = 6;</code>
   */
  private void clearStatus() {
    bitField0_ = (bitField0_ & ~0x00000080);
    status_ = 0;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeString(1, getEntryId());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeString(2, getTitle());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeString(3, getUrl());
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      output.writeInt64(4, creationTimeUs_);
    }
    if (((bitField0_ & 0x00000010) == 0x00000010)) {
      output.writeInt64(5, updateTimeUs_);
    }
    if (((bitField0_ & 0x00000080) == 0x00000080)) {
      output.writeEnum(6, status_);
    }
    if (((bitField0_ & 0x00000020) == 0x00000020)) {
      output.writeInt64(7, firstReadTimeUs_);
    }
    if (((bitField0_ & 0x00000040) == 0x00000040)) {
      output.writeInt64(8, updateTitleTimeUs_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, getEntryId());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(2, getTitle());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(3, getUrl());
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, creationTimeUs_);
    }
    if (((bitField0_ & 0x00000010) == 0x00000010)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, updateTimeUs_);
    }
    if (((bitField0_ & 0x00000080) == 0x00000080)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(6, status_);
    }
    if (((bitField0_ & 0x00000020) == 0x00000020)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(7, firstReadTimeUs_);
    }
    if (((bitField0_ & 0x00000040) == 0x00000040)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(8, updateTitleTimeUs_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static org.chromium.components.sync.protocol.ReadingListSpecifics parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.ReadingListSpecifics parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.ReadingListSpecifics parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.ReadingListSpecifics parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.ReadingListSpecifics parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.ReadingListSpecifics parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.ReadingListSpecifics parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.ReadingListSpecifics parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.ReadingListSpecifics parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.ReadingListSpecifics parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.chromium.components.sync.protocol.ReadingListSpecifics prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * Sync Reading list entry. This proto contains the fields synced for a reading
   * list entry. It must be kept synced with the reading_list.ReadingListLocal
   * protobuf.
   * </pre>
   *
   * Protobuf type {@code sync_pb.ReadingListSpecifics}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.components.sync.protocol.ReadingListSpecifics, Builder> implements
      // @@protoc_insertion_point(builder_implements:sync_pb.ReadingListSpecifics)
      org.chromium.components.sync.protocol.ReadingListSpecificsOrBuilder {
    // Construct using org.chromium.components.sync.protocol.ReadingListSpecifics.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional string entry_id = 1;</code>
     */
    public boolean hasEntryId() {
      return instance.hasEntryId();
    }
    /**
     * <code>optional string entry_id = 1;</code>
     */
    public java.lang.String getEntryId() {
      return instance.getEntryId();
    }
    /**
     * <code>optional string entry_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getEntryIdBytes() {
      return instance.getEntryIdBytes();
    }
    /**
     * <code>optional string entry_id = 1;</code>
     */
    public Builder setEntryId(
        java.lang.String value) {
      copyOnWrite();
      instance.setEntryId(value);
      return this;
    }
    /**
     * <code>optional string entry_id = 1;</code>
     */
    public Builder clearEntryId() {
      copyOnWrite();
      instance.clearEntryId();
      return this;
    }
    /**
     * <code>optional string entry_id = 1;</code>
     */
    public Builder setEntryIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setEntryIdBytes(value);
      return this;
    }

    /**
     * <code>optional string title = 2;</code>
     */
    public boolean hasTitle() {
      return instance.hasTitle();
    }
    /**
     * <code>optional string title = 2;</code>
     */
    public java.lang.String getTitle() {
      return instance.getTitle();
    }
    /**
     * <code>optional string title = 2;</code>
     */
    public com.google.protobuf.ByteString
        getTitleBytes() {
      return instance.getTitleBytes();
    }
    /**
     * <code>optional string title = 2;</code>
     */
    public Builder setTitle(
        java.lang.String value) {
      copyOnWrite();
      instance.setTitle(value);
      return this;
    }
    /**
     * <code>optional string title = 2;</code>
     */
    public Builder clearTitle() {
      copyOnWrite();
      instance.clearTitle();
      return this;
    }
    /**
     * <code>optional string title = 2;</code>
     */
    public Builder setTitleBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setTitleBytes(value);
      return this;
    }

    /**
     * <code>optional string url = 3;</code>
     */
    public boolean hasUrl() {
      return instance.hasUrl();
    }
    /**
     * <code>optional string url = 3;</code>
     */
    public java.lang.String getUrl() {
      return instance.getUrl();
    }
    /**
     * <code>optional string url = 3;</code>
     */
    public com.google.protobuf.ByteString
        getUrlBytes() {
      return instance.getUrlBytes();
    }
    /**
     * <code>optional string url = 3;</code>
     */
    public Builder setUrl(
        java.lang.String value) {
      copyOnWrite();
      instance.setUrl(value);
      return this;
    }
    /**
     * <code>optional string url = 3;</code>
     */
    public Builder clearUrl() {
      copyOnWrite();
      instance.clearUrl();
      return this;
    }
    /**
     * <code>optional string url = 3;</code>
     */
    public Builder setUrlBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setUrlBytes(value);
      return this;
    }

    /**
     * <code>optional int64 creation_time_us = 4;</code>
     */
    public boolean hasCreationTimeUs() {
      return instance.hasCreationTimeUs();
    }
    /**
     * <code>optional int64 creation_time_us = 4;</code>
     */
    public long getCreationTimeUs() {
      return instance.getCreationTimeUs();
    }
    /**
     * <code>optional int64 creation_time_us = 4;</code>
     */
    public Builder setCreationTimeUs(long value) {
      copyOnWrite();
      instance.setCreationTimeUs(value);
      return this;
    }
    /**
     * <code>optional int64 creation_time_us = 4;</code>
     */
    public Builder clearCreationTimeUs() {
      copyOnWrite();
      instance.clearCreationTimeUs();
      return this;
    }

    /**
     * <code>optional int64 update_time_us = 5;</code>
     */
    public boolean hasUpdateTimeUs() {
      return instance.hasUpdateTimeUs();
    }
    /**
     * <code>optional int64 update_time_us = 5;</code>
     */
    public long getUpdateTimeUs() {
      return instance.getUpdateTimeUs();
    }
    /**
     * <code>optional int64 update_time_us = 5;</code>
     */
    public Builder setUpdateTimeUs(long value) {
      copyOnWrite();
      instance.setUpdateTimeUs(value);
      return this;
    }
    /**
     * <code>optional int64 update_time_us = 5;</code>
     */
    public Builder clearUpdateTimeUs() {
      copyOnWrite();
      instance.clearUpdateTimeUs();
      return this;
    }

    /**
     * <code>optional int64 first_read_time_us = 7;</code>
     */
    public boolean hasFirstReadTimeUs() {
      return instance.hasFirstReadTimeUs();
    }
    /**
     * <code>optional int64 first_read_time_us = 7;</code>
     */
    public long getFirstReadTimeUs() {
      return instance.getFirstReadTimeUs();
    }
    /**
     * <code>optional int64 first_read_time_us = 7;</code>
     */
    public Builder setFirstReadTimeUs(long value) {
      copyOnWrite();
      instance.setFirstReadTimeUs(value);
      return this;
    }
    /**
     * <code>optional int64 first_read_time_us = 7;</code>
     */
    public Builder clearFirstReadTimeUs() {
      copyOnWrite();
      instance.clearFirstReadTimeUs();
      return this;
    }

    /**
     * <code>optional int64 update_title_time_us = 8;</code>
     */
    public boolean hasUpdateTitleTimeUs() {
      return instance.hasUpdateTitleTimeUs();
    }
    /**
     * <code>optional int64 update_title_time_us = 8;</code>
     */
    public long getUpdateTitleTimeUs() {
      return instance.getUpdateTitleTimeUs();
    }
    /**
     * <code>optional int64 update_title_time_us = 8;</code>
     */
    public Builder setUpdateTitleTimeUs(long value) {
      copyOnWrite();
      instance.setUpdateTitleTimeUs(value);
      return this;
    }
    /**
     * <code>optional int64 update_title_time_us = 8;</code>
     */
    public Builder clearUpdateTitleTimeUs() {
      copyOnWrite();
      instance.clearUpdateTitleTimeUs();
      return this;
    }

    /**
     * <pre>
     * If the field is not present, it defaults to UNSEEN.
     * </pre>
     *
     * <code>optional .sync_pb.ReadingListSpecifics.ReadingListEntryStatus status = 6;</code>
     */
    public boolean hasStatus() {
      return instance.hasStatus();
    }
    /**
     * <pre>
     * If the field is not present, it defaults to UNSEEN.
     * </pre>
     *
     * <code>optional .sync_pb.ReadingListSpecifics.ReadingListEntryStatus status = 6;</code>
     */
    public org.chromium.components.sync.protocol.ReadingListSpecifics.ReadingListEntryStatus getStatus() {
      return instance.getStatus();
    }
    /**
     * <pre>
     * If the field is not present, it defaults to UNSEEN.
     * </pre>
     *
     * <code>optional .sync_pb.ReadingListSpecifics.ReadingListEntryStatus status = 6;</code>
     */
    public Builder setStatus(org.chromium.components.sync.protocol.ReadingListSpecifics.ReadingListEntryStatus value) {
      copyOnWrite();
      instance.setStatus(value);
      return this;
    }
    /**
     * <pre>
     * If the field is not present, it defaults to UNSEEN.
     * </pre>
     *
     * <code>optional .sync_pb.ReadingListSpecifics.ReadingListEntryStatus status = 6;</code>
     */
    public Builder clearStatus() {
      copyOnWrite();
      instance.clearStatus();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sync_pb.ReadingListSpecifics)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.components.sync.protocol.ReadingListSpecifics();
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
        org.chromium.components.sync.protocol.ReadingListSpecifics other = (org.chromium.components.sync.protocol.ReadingListSpecifics) arg1;
        entryId_ = visitor.visitString(
            hasEntryId(), entryId_,
            other.hasEntryId(), other.entryId_);
        title_ = visitor.visitString(
            hasTitle(), title_,
            other.hasTitle(), other.title_);
        url_ = visitor.visitString(
            hasUrl(), url_,
            other.hasUrl(), other.url_);
        creationTimeUs_ = visitor.visitLong(
            hasCreationTimeUs(), creationTimeUs_,
            other.hasCreationTimeUs(), other.creationTimeUs_);
        updateTimeUs_ = visitor.visitLong(
            hasUpdateTimeUs(), updateTimeUs_,
            other.hasUpdateTimeUs(), other.updateTimeUs_);
        firstReadTimeUs_ = visitor.visitLong(
            hasFirstReadTimeUs(), firstReadTimeUs_,
            other.hasFirstReadTimeUs(), other.firstReadTimeUs_);
        updateTitleTimeUs_ = visitor.visitLong(
            hasUpdateTitleTimeUs(), updateTitleTimeUs_,
            other.hasUpdateTitleTimeUs(), other.updateTitleTimeUs_);
        status_ = visitor.visitInt(hasStatus(), status_,
            other.hasStatus(), other.status_);
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
                entryId_ = s;
                break;
              }
              case 18: {
                String s = input.readString();
                bitField0_ |= 0x00000002;
                title_ = s;
                break;
              }
              case 26: {
                String s = input.readString();
                bitField0_ |= 0x00000004;
                url_ = s;
                break;
              }
              case 32: {
                bitField0_ |= 0x00000008;
                creationTimeUs_ = input.readInt64();
                break;
              }
              case 40: {
                bitField0_ |= 0x00000010;
                updateTimeUs_ = input.readInt64();
                break;
              }
              case 48: {
                int rawValue = input.readEnum();
                org.chromium.components.sync.protocol.ReadingListSpecifics.ReadingListEntryStatus value = org.chromium.components.sync.protocol.ReadingListSpecifics.ReadingListEntryStatus.forNumber(rawValue);
                if (value == null) {
                  super.mergeVarintField(6, rawValue);
                } else {
                  bitField0_ |= 0x00000080;
                  status_ = rawValue;
                }
                break;
              }
              case 56: {
                bitField0_ |= 0x00000020;
                firstReadTimeUs_ = input.readInt64();
                break;
              }
              case 64: {
                bitField0_ |= 0x00000040;
                updateTitleTimeUs_ = input.readInt64();
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
        if (PARSER == null) {    synchronized (org.chromium.components.sync.protocol.ReadingListSpecifics.class) {
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


  // @@protoc_insertion_point(class_scope:sync_pb.ReadingListSpecifics)
  private static final org.chromium.components.sync.protocol.ReadingListSpecifics DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ReadingListSpecifics();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static org.chromium.components.sync.protocol.ReadingListSpecifics getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ReadingListSpecifics> PARSER;

  public static com.google.protobuf.Parser<ReadingListSpecifics> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

