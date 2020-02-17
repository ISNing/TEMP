// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: update_success_tracking.proto

package org.chromium.chrome.browser.omaha.metrics;

public final class UpdateProtos {
  private UpdateProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface TrackingOrBuilder extends
      // @@protoc_insertion_point(interface_extends:omaha_metrics.Tracking)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     * Timestamp since epoch of when the update started.
     * </pre>
     *
     * <code>optional int64 timestamp_ms = 1;</code>
     */
    boolean hasTimestampMs();
    /**
     * <pre>
     * Timestamp since epoch of when the update started.
     * </pre>
     *
     * <code>optional int64 timestamp_ms = 1;</code>
     */
    long getTimestampMs();

    /**
     * <pre>
     * The Chrome version string at the time the update started.
     * </pre>
     *
     * <code>optional string version = 2;</code>
     */
    boolean hasVersion();
    /**
     * <pre>
     * The Chrome version string at the time the update started.
     * </pre>
     *
     * <code>optional string version = 2;</code>
     */
    java.lang.String getVersion();
    /**
     * <pre>
     * The Chrome version string at the time the update started.
     * </pre>
     *
     * <code>optional string version = 2;</code>
     */
    com.google.protobuf.ByteString
        getVersionBytes();

    /**
     * <pre>
     * The type of update that was started.
     * </pre>
     *
     * <code>optional .omaha_metrics.Tracking.Type type = 3 [default = UNKNOWN_TYPE];</code>
     */
    boolean hasType();
    /**
     * <pre>
     * The type of update that was started.
     * </pre>
     *
     * <code>optional .omaha_metrics.Tracking.Type type = 3 [default = UNKNOWN_TYPE];</code>
     */
    org.chromium.chrome.browser.omaha.metrics.UpdateProtos.Tracking.Type getType();

    /**
     * <pre>
     * The UI surface that was interacted with to start the update.
     * </pre>
     *
     * <code>optional .omaha_metrics.Tracking.Source source = 4 [default = UNKNOWN_SOURCE];</code>
     */
    boolean hasSource();
    /**
     * <pre>
     * The UI surface that was interacted with to start the update.
     * </pre>
     *
     * <code>optional .omaha_metrics.Tracking.Source source = 4 [default = UNKNOWN_SOURCE];</code>
     */
    org.chromium.chrome.browser.omaha.metrics.UpdateProtos.Tracking.Source getSource();

    /**
     * <pre>
     * Whether or not the update success or failure has been recorded for session
     * attribution.
     * </pre>
     *
     * <code>optional bool recorded_session = 5;</code>
     */
    boolean hasRecordedSession();
    /**
     * <pre>
     * Whether or not the update success or failure has been recorded for session
     * attribution.
     * </pre>
     *
     * <code>optional bool recorded_session = 5;</code>
     */
    boolean getRecordedSession();
  }
  /**
   * Protobuf type {@code omaha_metrics.Tracking}
   */
  public  static final class Tracking extends
      com.google.protobuf.GeneratedMessageLite<
          Tracking, Tracking.Builder> implements
      // @@protoc_insertion_point(message_implements:omaha_metrics.Tracking)
      TrackingOrBuilder {
    private Tracking() {
      version_ = "";
      type_ = -1;
      source_ = -1;
    }
    /**
     * Protobuf enum {@code omaha_metrics.Tracking.Type}
     */
    public enum Type
        implements com.google.protobuf.Internal.EnumLite {
      /**
       * <code>UNKNOWN_TYPE = -1;</code>
       */
      UNKNOWN_TYPE(-1),
      /**
       * <code>INTENT = 0;</code>
       */
      INTENT(0),
      /**
       * <code>INLINE = 1;</code>
       */
      INLINE(1),
      ;

      /**
       * <code>UNKNOWN_TYPE = -1;</code>
       */
      public static final int UNKNOWN_TYPE_VALUE = -1;
      /**
       * <code>INTENT = 0;</code>
       */
      public static final int INTENT_VALUE = 0;
      /**
       * <code>INLINE = 1;</code>
       */
      public static final int INLINE_VALUE = 1;


      public final int getNumber() {
        return value;
      }

      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static Type valueOf(int value) {
        return forNumber(value);
      }

      public static Type forNumber(int value) {
        switch (value) {
          case -1: return UNKNOWN_TYPE;
          case 0: return INTENT;
          case 1: return INLINE;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Type>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          Type> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Type>() {
              public Type findValueByNumber(int number) {
                return Type.forNumber(number);
              }
            };

      private final int value;

      private Type(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:omaha_metrics.Tracking.Type)
    }

    /**
     * Protobuf enum {@code omaha_metrics.Tracking.Source}
     */
    public enum Source
        implements com.google.protobuf.Internal.EnumLite {
      /**
       * <code>UNKNOWN_SOURCE = -1;</code>
       */
      UNKNOWN_SOURCE(-1),
      /**
       * <code>FROM_MENU = 0;</code>
       */
      FROM_MENU(0),
      /**
       * <code>FROM_INFOBAR = 1;</code>
       */
      FROM_INFOBAR(1),
      /**
       * <code>FROM_NOTIFICATION = 2;</code>
       */
      FROM_NOTIFICATION(2),
      ;

      /**
       * <code>UNKNOWN_SOURCE = -1;</code>
       */
      public static final int UNKNOWN_SOURCE_VALUE = -1;
      /**
       * <code>FROM_MENU = 0;</code>
       */
      public static final int FROM_MENU_VALUE = 0;
      /**
       * <code>FROM_INFOBAR = 1;</code>
       */
      public static final int FROM_INFOBAR_VALUE = 1;
      /**
       * <code>FROM_NOTIFICATION = 2;</code>
       */
      public static final int FROM_NOTIFICATION_VALUE = 2;


      public final int getNumber() {
        return value;
      }

      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static Source valueOf(int value) {
        return forNumber(value);
      }

      public static Source forNumber(int value) {
        switch (value) {
          case -1: return UNKNOWN_SOURCE;
          case 0: return FROM_MENU;
          case 1: return FROM_INFOBAR;
          case 2: return FROM_NOTIFICATION;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Source>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          Source> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Source>() {
              public Source findValueByNumber(int number) {
                return Source.forNumber(number);
              }
            };

      private final int value;

      private Source(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:omaha_metrics.Tracking.Source)
    }

    private int bitField0_;
    public static final int TIMESTAMP_MS_FIELD_NUMBER = 1;
    private long timestampMs_;
    /**
     * <pre>
     * Timestamp since epoch of when the update started.
     * </pre>
     *
     * <code>optional int64 timestamp_ms = 1;</code>
     */
    public boolean hasTimestampMs() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <pre>
     * Timestamp since epoch of when the update started.
     * </pre>
     *
     * <code>optional int64 timestamp_ms = 1;</code>
     */
    public long getTimestampMs() {
      return timestampMs_;
    }
    /**
     * <pre>
     * Timestamp since epoch of when the update started.
     * </pre>
     *
     * <code>optional int64 timestamp_ms = 1;</code>
     */
    private void setTimestampMs(long value) {
      bitField0_ |= 0x00000001;
      timestampMs_ = value;
    }
    /**
     * <pre>
     * Timestamp since epoch of when the update started.
     * </pre>
     *
     * <code>optional int64 timestamp_ms = 1;</code>
     */
    private void clearTimestampMs() {
      bitField0_ = (bitField0_ & ~0x00000001);
      timestampMs_ = 0L;
    }

    public static final int VERSION_FIELD_NUMBER = 2;
    private java.lang.String version_;
    /**
     * <pre>
     * The Chrome version string at the time the update started.
     * </pre>
     *
     * <code>optional string version = 2;</code>
     */
    public boolean hasVersion() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <pre>
     * The Chrome version string at the time the update started.
     * </pre>
     *
     * <code>optional string version = 2;</code>
     */
    public java.lang.String getVersion() {
      return version_;
    }
    /**
     * <pre>
     * The Chrome version string at the time the update started.
     * </pre>
     *
     * <code>optional string version = 2;</code>
     */
    public com.google.protobuf.ByteString
        getVersionBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(version_);
    }
    /**
     * <pre>
     * The Chrome version string at the time the update started.
     * </pre>
     *
     * <code>optional string version = 2;</code>
     */
    private void setVersion(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      version_ = value;
    }
    /**
     * <pre>
     * The Chrome version string at the time the update started.
     * </pre>
     *
     * <code>optional string version = 2;</code>
     */
    private void clearVersion() {
      bitField0_ = (bitField0_ & ~0x00000002);
      version_ = getDefaultInstance().getVersion();
    }
    /**
     * <pre>
     * The Chrome version string at the time the update started.
     * </pre>
     *
     * <code>optional string version = 2;</code>
     */
    private void setVersionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      version_ = value.toStringUtf8();
    }

    public static final int TYPE_FIELD_NUMBER = 3;
    private int type_;
    /**
     * <pre>
     * The type of update that was started.
     * </pre>
     *
     * <code>optional .omaha_metrics.Tracking.Type type = 3 [default = UNKNOWN_TYPE];</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <pre>
     * The type of update that was started.
     * </pre>
     *
     * <code>optional .omaha_metrics.Tracking.Type type = 3 [default = UNKNOWN_TYPE];</code>
     */
    public org.chromium.chrome.browser.omaha.metrics.UpdateProtos.Tracking.Type getType() {
      org.chromium.chrome.browser.omaha.metrics.UpdateProtos.Tracking.Type result = org.chromium.chrome.browser.omaha.metrics.UpdateProtos.Tracking.Type.forNumber(type_);
      return result == null ? org.chromium.chrome.browser.omaha.metrics.UpdateProtos.Tracking.Type.UNKNOWN_TYPE : result;
    }
    /**
     * <pre>
     * The type of update that was started.
     * </pre>
     *
     * <code>optional .omaha_metrics.Tracking.Type type = 3 [default = UNKNOWN_TYPE];</code>
     */
    private void setType(org.chromium.chrome.browser.omaha.metrics.UpdateProtos.Tracking.Type value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      type_ = value.getNumber();
    }
    /**
     * <pre>
     * The type of update that was started.
     * </pre>
     *
     * <code>optional .omaha_metrics.Tracking.Type type = 3 [default = UNKNOWN_TYPE];</code>
     */
    private void clearType() {
      bitField0_ = (bitField0_ & ~0x00000004);
      type_ = -1;
    }

    public static final int SOURCE_FIELD_NUMBER = 4;
    private int source_;
    /**
     * <pre>
     * The UI surface that was interacted with to start the update.
     * </pre>
     *
     * <code>optional .omaha_metrics.Tracking.Source source = 4 [default = UNKNOWN_SOURCE];</code>
     */
    public boolean hasSource() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <pre>
     * The UI surface that was interacted with to start the update.
     * </pre>
     *
     * <code>optional .omaha_metrics.Tracking.Source source = 4 [default = UNKNOWN_SOURCE];</code>
     */
    public org.chromium.chrome.browser.omaha.metrics.UpdateProtos.Tracking.Source getSource() {
      org.chromium.chrome.browser.omaha.metrics.UpdateProtos.Tracking.Source result = org.chromium.chrome.browser.omaha.metrics.UpdateProtos.Tracking.Source.forNumber(source_);
      return result == null ? org.chromium.chrome.browser.omaha.metrics.UpdateProtos.Tracking.Source.UNKNOWN_SOURCE : result;
    }
    /**
     * <pre>
     * The UI surface that was interacted with to start the update.
     * </pre>
     *
     * <code>optional .omaha_metrics.Tracking.Source source = 4 [default = UNKNOWN_SOURCE];</code>
     */
    private void setSource(org.chromium.chrome.browser.omaha.metrics.UpdateProtos.Tracking.Source value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000008;
      source_ = value.getNumber();
    }
    /**
     * <pre>
     * The UI surface that was interacted with to start the update.
     * </pre>
     *
     * <code>optional .omaha_metrics.Tracking.Source source = 4 [default = UNKNOWN_SOURCE];</code>
     */
    private void clearSource() {
      bitField0_ = (bitField0_ & ~0x00000008);
      source_ = -1;
    }

    public static final int RECORDED_SESSION_FIELD_NUMBER = 5;
    private boolean recordedSession_;
    /**
     * <pre>
     * Whether or not the update success or failure has been recorded for session
     * attribution.
     * </pre>
     *
     * <code>optional bool recorded_session = 5;</code>
     */
    public boolean hasRecordedSession() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <pre>
     * Whether or not the update success or failure has been recorded for session
     * attribution.
     * </pre>
     *
     * <code>optional bool recorded_session = 5;</code>
     */
    public boolean getRecordedSession() {
      return recordedSession_;
    }
    /**
     * <pre>
     * Whether or not the update success or failure has been recorded for session
     * attribution.
     * </pre>
     *
     * <code>optional bool recorded_session = 5;</code>
     */
    private void setRecordedSession(boolean value) {
      bitField0_ |= 0x00000010;
      recordedSession_ = value;
    }
    /**
     * <pre>
     * Whether or not the update success or failure has been recorded for session
     * attribution.
     * </pre>
     *
     * <code>optional bool recorded_session = 5;</code>
     */
    private void clearRecordedSession() {
      bitField0_ = (bitField0_ & ~0x00000010);
      recordedSession_ = false;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt64(1, timestampMs_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeString(2, getVersion());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeEnum(3, type_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeEnum(4, source_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBool(5, recordedSession_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, timestampMs_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(2, getVersion());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, type_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(4, source_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, recordedSession_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    public static org.chromium.chrome.browser.omaha.metrics.UpdateProtos.Tracking parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.chrome.browser.omaha.metrics.UpdateProtos.Tracking parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.chrome.browser.omaha.metrics.UpdateProtos.Tracking parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.chrome.browser.omaha.metrics.UpdateProtos.Tracking parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.chrome.browser.omaha.metrics.UpdateProtos.Tracking parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static org.chromium.chrome.browser.omaha.metrics.UpdateProtos.Tracking parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static org.chromium.chrome.browser.omaha.metrics.UpdateProtos.Tracking parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static org.chromium.chrome.browser.omaha.metrics.UpdateProtos.Tracking parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static org.chromium.chrome.browser.omaha.metrics.UpdateProtos.Tracking parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static org.chromium.chrome.browser.omaha.metrics.UpdateProtos.Tracking parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(org.chromium.chrome.browser.omaha.metrics.UpdateProtos.Tracking prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code omaha_metrics.Tracking}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          org.chromium.chrome.browser.omaha.metrics.UpdateProtos.Tracking, Builder> implements
        // @@protoc_insertion_point(builder_implements:omaha_metrics.Tracking)
        org.chromium.chrome.browser.omaha.metrics.UpdateProtos.TrackingOrBuilder {
      // Construct using org.chromium.chrome.browser.omaha.metrics.UpdateProtos.Tracking.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       * Timestamp since epoch of when the update started.
       * </pre>
       *
       * <code>optional int64 timestamp_ms = 1;</code>
       */
      public boolean hasTimestampMs() {
        return instance.hasTimestampMs();
      }
      /**
       * <pre>
       * Timestamp since epoch of when the update started.
       * </pre>
       *
       * <code>optional int64 timestamp_ms = 1;</code>
       */
      public long getTimestampMs() {
        return instance.getTimestampMs();
      }
      /**
       * <pre>
       * Timestamp since epoch of when the update started.
       * </pre>
       *
       * <code>optional int64 timestamp_ms = 1;</code>
       */
      public Builder setTimestampMs(long value) {
        copyOnWrite();
        instance.setTimestampMs(value);
        return this;
      }
      /**
       * <pre>
       * Timestamp since epoch of when the update started.
       * </pre>
       *
       * <code>optional int64 timestamp_ms = 1;</code>
       */
      public Builder clearTimestampMs() {
        copyOnWrite();
        instance.clearTimestampMs();
        return this;
      }

      /**
       * <pre>
       * The Chrome version string at the time the update started.
       * </pre>
       *
       * <code>optional string version = 2;</code>
       */
      public boolean hasVersion() {
        return instance.hasVersion();
      }
      /**
       * <pre>
       * The Chrome version string at the time the update started.
       * </pre>
       *
       * <code>optional string version = 2;</code>
       */
      public java.lang.String getVersion() {
        return instance.getVersion();
      }
      /**
       * <pre>
       * The Chrome version string at the time the update started.
       * </pre>
       *
       * <code>optional string version = 2;</code>
       */
      public com.google.protobuf.ByteString
          getVersionBytes() {
        return instance.getVersionBytes();
      }
      /**
       * <pre>
       * The Chrome version string at the time the update started.
       * </pre>
       *
       * <code>optional string version = 2;</code>
       */
      public Builder setVersion(
          java.lang.String value) {
        copyOnWrite();
        instance.setVersion(value);
        return this;
      }
      /**
       * <pre>
       * The Chrome version string at the time the update started.
       * </pre>
       *
       * <code>optional string version = 2;</code>
       */
      public Builder clearVersion() {
        copyOnWrite();
        instance.clearVersion();
        return this;
      }
      /**
       * <pre>
       * The Chrome version string at the time the update started.
       * </pre>
       *
       * <code>optional string version = 2;</code>
       */
      public Builder setVersionBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setVersionBytes(value);
        return this;
      }

      /**
       * <pre>
       * The type of update that was started.
       * </pre>
       *
       * <code>optional .omaha_metrics.Tracking.Type type = 3 [default = UNKNOWN_TYPE];</code>
       */
      public boolean hasType() {
        return instance.hasType();
      }
      /**
       * <pre>
       * The type of update that was started.
       * </pre>
       *
       * <code>optional .omaha_metrics.Tracking.Type type = 3 [default = UNKNOWN_TYPE];</code>
       */
      public org.chromium.chrome.browser.omaha.metrics.UpdateProtos.Tracking.Type getType() {
        return instance.getType();
      }
      /**
       * <pre>
       * The type of update that was started.
       * </pre>
       *
       * <code>optional .omaha_metrics.Tracking.Type type = 3 [default = UNKNOWN_TYPE];</code>
       */
      public Builder setType(org.chromium.chrome.browser.omaha.metrics.UpdateProtos.Tracking.Type value) {
        copyOnWrite();
        instance.setType(value);
        return this;
      }
      /**
       * <pre>
       * The type of update that was started.
       * </pre>
       *
       * <code>optional .omaha_metrics.Tracking.Type type = 3 [default = UNKNOWN_TYPE];</code>
       */
      public Builder clearType() {
        copyOnWrite();
        instance.clearType();
        return this;
      }

      /**
       * <pre>
       * The UI surface that was interacted with to start the update.
       * </pre>
       *
       * <code>optional .omaha_metrics.Tracking.Source source = 4 [default = UNKNOWN_SOURCE];</code>
       */
      public boolean hasSource() {
        return instance.hasSource();
      }
      /**
       * <pre>
       * The UI surface that was interacted with to start the update.
       * </pre>
       *
       * <code>optional .omaha_metrics.Tracking.Source source = 4 [default = UNKNOWN_SOURCE];</code>
       */
      public org.chromium.chrome.browser.omaha.metrics.UpdateProtos.Tracking.Source getSource() {
        return instance.getSource();
      }
      /**
       * <pre>
       * The UI surface that was interacted with to start the update.
       * </pre>
       *
       * <code>optional .omaha_metrics.Tracking.Source source = 4 [default = UNKNOWN_SOURCE];</code>
       */
      public Builder setSource(org.chromium.chrome.browser.omaha.metrics.UpdateProtos.Tracking.Source value) {
        copyOnWrite();
        instance.setSource(value);
        return this;
      }
      /**
       * <pre>
       * The UI surface that was interacted with to start the update.
       * </pre>
       *
       * <code>optional .omaha_metrics.Tracking.Source source = 4 [default = UNKNOWN_SOURCE];</code>
       */
      public Builder clearSource() {
        copyOnWrite();
        instance.clearSource();
        return this;
      }

      /**
       * <pre>
       * Whether or not the update success or failure has been recorded for session
       * attribution.
       * </pre>
       *
       * <code>optional bool recorded_session = 5;</code>
       */
      public boolean hasRecordedSession() {
        return instance.hasRecordedSession();
      }
      /**
       * <pre>
       * Whether or not the update success or failure has been recorded for session
       * attribution.
       * </pre>
       *
       * <code>optional bool recorded_session = 5;</code>
       */
      public boolean getRecordedSession() {
        return instance.getRecordedSession();
      }
      /**
       * <pre>
       * Whether or not the update success or failure has been recorded for session
       * attribution.
       * </pre>
       *
       * <code>optional bool recorded_session = 5;</code>
       */
      public Builder setRecordedSession(boolean value) {
        copyOnWrite();
        instance.setRecordedSession(value);
        return this;
      }
      /**
       * <pre>
       * Whether or not the update success or failure has been recorded for session
       * attribution.
       * </pre>
       *
       * <code>optional bool recorded_session = 5;</code>
       */
      public Builder clearRecordedSession() {
        copyOnWrite();
        instance.clearRecordedSession();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:omaha_metrics.Tracking)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new org.chromium.chrome.browser.omaha.metrics.UpdateProtos.Tracking();
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
          org.chromium.chrome.browser.omaha.metrics.UpdateProtos.Tracking other = (org.chromium.chrome.browser.omaha.metrics.UpdateProtos.Tracking) arg1;
          timestampMs_ = visitor.visitLong(
              hasTimestampMs(), timestampMs_,
              other.hasTimestampMs(), other.timestampMs_);
          version_ = visitor.visitString(
              hasVersion(), version_,
              other.hasVersion(), other.version_);
          type_ = visitor.visitInt(hasType(), type_,
              other.hasType(), other.type_);
          source_ = visitor.visitInt(hasSource(), source_,
              other.hasSource(), other.source_);
          recordedSession_ = visitor.visitBoolean(
              hasRecordedSession(), recordedSession_,
              other.hasRecordedSession(), other.recordedSession_);
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
                  timestampMs_ = input.readInt64();
                  break;
                }
                case 18: {
                  String s = input.readString();
                  bitField0_ |= 0x00000002;
                  version_ = s;
                  break;
                }
                case 24: {
                  int rawValue = input.readEnum();
                  org.chromium.chrome.browser.omaha.metrics.UpdateProtos.Tracking.Type value = org.chromium.chrome.browser.omaha.metrics.UpdateProtos.Tracking.Type.forNumber(rawValue);
                  if (value == null) {
                    super.mergeVarintField(3, rawValue);
                  } else {
                    bitField0_ |= 0x00000004;
                    type_ = rawValue;
                  }
                  break;
                }
                case 32: {
                  int rawValue = input.readEnum();
                  org.chromium.chrome.browser.omaha.metrics.UpdateProtos.Tracking.Source value = org.chromium.chrome.browser.omaha.metrics.UpdateProtos.Tracking.Source.forNumber(rawValue);
                  if (value == null) {
                    super.mergeVarintField(4, rawValue);
                  } else {
                    bitField0_ |= 0x00000008;
                    source_ = rawValue;
                  }
                  break;
                }
                case 40: {
                  bitField0_ |= 0x00000010;
                  recordedSession_ = input.readBool();
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
          if (PARSER == null) {    synchronized (org.chromium.chrome.browser.omaha.metrics.UpdateProtos.Tracking.class) {
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


    // @@protoc_insertion_point(class_scope:omaha_metrics.Tracking)
    private static final org.chromium.chrome.browser.omaha.metrics.UpdateProtos.Tracking DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Tracking();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static org.chromium.chrome.browser.omaha.metrics.UpdateProtos.Tracking getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<Tracking> PARSER;

    public static com.google.protobuf.Parser<Tracking> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
