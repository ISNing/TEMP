// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aw_variations_seed.proto

package org.chromium.android_webview.proto;

public final class AwVariationsSeedOuterClass {
  private AwVariationsSeedOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface AwVariationsSeedOrBuilder extends
      // @@protoc_insertion_point(interface_extends:org.chromium.android_webview.proto.AwVariationsSeed)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     * Whether seed_data is compressed. Comes from HTTP header "X-Seed-Signature".
     * </pre>
     *
     * <code>optional string signature = 1;</code>
     */
    boolean hasSignature();
    /**
     * <pre>
     * Whether seed_data is compressed. Comes from HTTP header "X-Seed-Signature".
     * </pre>
     *
     * <code>optional string signature = 1;</code>
     */
    java.lang.String getSignature();
    /**
     * <pre>
     * Whether seed_data is compressed. Comes from HTTP header "X-Seed-Signature".
     * </pre>
     *
     * <code>optional string signature = 1;</code>
     */
    com.google.protobuf.ByteString
        getSignatureBytes();

    /**
     * <pre>
     * 2-letter country code. Comes from HTTP header "X-Country".
     * </pre>
     *
     * <code>optional string country = 2;</code>
     */
    boolean hasCountry();
    /**
     * <pre>
     * 2-letter country code. Comes from HTTP header "X-Country".
     * </pre>
     *
     * <code>optional string country = 2;</code>
     */
    java.lang.String getCountry();
    /**
     * <pre>
     * 2-letter country code. Comes from HTTP header "X-Country".
     * </pre>
     *
     * <code>optional string country = 2;</code>
     */
    com.google.protobuf.ByteString
        getCountryBytes();

    /**
     * <pre>
     * Date the seed was downloaded. Comes from HTTP header "Date"; see RFC 2616,
     * sections 3.3.1 and 14.18 for the format.
     * This was deprecated in favor of the |date| field in October 2019.
     * </pre>
     *
     * <code>optional string date_header = 3 [deprecated = true];</code>
     */
    @java.lang.Deprecated boolean hasDateHeader();
    /**
     * <pre>
     * Date the seed was downloaded. Comes from HTTP header "Date"; see RFC 2616,
     * sections 3.3.1 and 14.18 for the format.
     * This was deprecated in favor of the |date| field in October 2019.
     * </pre>
     *
     * <code>optional string date_header = 3 [deprecated = true];</code>
     */
    @java.lang.Deprecated java.lang.String getDateHeader();
    /**
     * <pre>
     * Date the seed was downloaded. Comes from HTTP header "Date"; see RFC 2616,
     * sections 3.3.1 and 14.18 for the format.
     * This was deprecated in favor of the |date| field in October 2019.
     * </pre>
     *
     * <code>optional string date_header = 3 [deprecated = true];</code>
     */
    @java.lang.Deprecated com.google.protobuf.ByteString
        getDateHeaderBytes();

    /**
     * <pre>
     * Whether seed_data is compressed. Comes from HTTP header "IM".
     * </pre>
     *
     * <code>optional bool is_gzip_compressed = 4;</code>
     */
    boolean hasIsGzipCompressed();
    /**
     * <pre>
     * Whether seed_data is compressed. Comes from HTTP header "IM".
     * </pre>
     *
     * <code>optional bool is_gzip_compressed = 4;</code>
     */
    boolean getIsGzipCompressed();

    /**
     * <pre>
     * The download body, itself a serialized VariationsSeed proto.
     * </pre>
     *
     * <code>optional bytes seed_data = 5;</code>
     */
    boolean hasSeedData();
    /**
     * <pre>
     * The download body, itself a serialized VariationsSeed proto.
     * </pre>
     *
     * <code>optional bytes seed_data = 5;</code>
     */
    com.google.protobuf.ByteString getSeedData();

    /**
     * <pre>
     * Date the seed was downloaded according to the device's clock in
     * milliseconds since UNIX epoch, GMT.
     * </pre>
     *
     * <code>optional int64 date = 6;</code>
     */
    boolean hasDate();
    /**
     * <pre>
     * Date the seed was downloaded according to the device's clock in
     * milliseconds since UNIX epoch, GMT.
     * </pre>
     *
     * <code>optional int64 date = 6;</code>
     */
    long getDate();
  }
  /**
   * <pre>
   * WebView uses AwVariationsSeed to serialize a downloaded seed, along with the
   * required HTTP header metadata, to a file. While Chrome stores the seed in
   * prefs, WebView stores it in a separate file so the WebView service can write
   * new seeds directly to each app's seed file.
   * Next tag: 7
   * </pre>
   *
   * Protobuf type {@code org.chromium.android_webview.proto.AwVariationsSeed}
   */
  public  static final class AwVariationsSeed extends
      com.google.protobuf.GeneratedMessageLite<
          AwVariationsSeed, AwVariationsSeed.Builder> implements
      // @@protoc_insertion_point(message_implements:org.chromium.android_webview.proto.AwVariationsSeed)
      AwVariationsSeedOrBuilder {
    private AwVariationsSeed() {
      signature_ = "";
      country_ = "";
      dateHeader_ = "";
      seedData_ = com.google.protobuf.ByteString.EMPTY;
    }
    private int bitField0_;
    public static final int SIGNATURE_FIELD_NUMBER = 1;
    private java.lang.String signature_;
    /**
     * <pre>
     * Whether seed_data is compressed. Comes from HTTP header "X-Seed-Signature".
     * </pre>
     *
     * <code>optional string signature = 1;</code>
     */
    public boolean hasSignature() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <pre>
     * Whether seed_data is compressed. Comes from HTTP header "X-Seed-Signature".
     * </pre>
     *
     * <code>optional string signature = 1;</code>
     */
    public java.lang.String getSignature() {
      return signature_;
    }
    /**
     * <pre>
     * Whether seed_data is compressed. Comes from HTTP header "X-Seed-Signature".
     * </pre>
     *
     * <code>optional string signature = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSignatureBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(signature_);
    }
    /**
     * <pre>
     * Whether seed_data is compressed. Comes from HTTP header "X-Seed-Signature".
     * </pre>
     *
     * <code>optional string signature = 1;</code>
     */
    private void setSignature(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      signature_ = value;
    }
    /**
     * <pre>
     * Whether seed_data is compressed. Comes from HTTP header "X-Seed-Signature".
     * </pre>
     *
     * <code>optional string signature = 1;</code>
     */
    private void clearSignature() {
      bitField0_ = (bitField0_ & ~0x00000001);
      signature_ = getDefaultInstance().getSignature();
    }
    /**
     * <pre>
     * Whether seed_data is compressed. Comes from HTTP header "X-Seed-Signature".
     * </pre>
     *
     * <code>optional string signature = 1;</code>
     */
    private void setSignatureBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      signature_ = value.toStringUtf8();
    }

    public static final int COUNTRY_FIELD_NUMBER = 2;
    private java.lang.String country_;
    /**
     * <pre>
     * 2-letter country code. Comes from HTTP header "X-Country".
     * </pre>
     *
     * <code>optional string country = 2;</code>
     */
    public boolean hasCountry() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <pre>
     * 2-letter country code. Comes from HTTP header "X-Country".
     * </pre>
     *
     * <code>optional string country = 2;</code>
     */
    public java.lang.String getCountry() {
      return country_;
    }
    /**
     * <pre>
     * 2-letter country code. Comes from HTTP header "X-Country".
     * </pre>
     *
     * <code>optional string country = 2;</code>
     */
    public com.google.protobuf.ByteString
        getCountryBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(country_);
    }
    /**
     * <pre>
     * 2-letter country code. Comes from HTTP header "X-Country".
     * </pre>
     *
     * <code>optional string country = 2;</code>
     */
    private void setCountry(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      country_ = value;
    }
    /**
     * <pre>
     * 2-letter country code. Comes from HTTP header "X-Country".
     * </pre>
     *
     * <code>optional string country = 2;</code>
     */
    private void clearCountry() {
      bitField0_ = (bitField0_ & ~0x00000002);
      country_ = getDefaultInstance().getCountry();
    }
    /**
     * <pre>
     * 2-letter country code. Comes from HTTP header "X-Country".
     * </pre>
     *
     * <code>optional string country = 2;</code>
     */
    private void setCountryBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      country_ = value.toStringUtf8();
    }

    public static final int DATE_HEADER_FIELD_NUMBER = 3;
    private java.lang.String dateHeader_;
    /**
     * <pre>
     * Date the seed was downloaded. Comes from HTTP header "Date"; see RFC 2616,
     * sections 3.3.1 and 14.18 for the format.
     * This was deprecated in favor of the |date| field in October 2019.
     * </pre>
     *
     * <code>optional string date_header = 3 [deprecated = true];</code>
     */
    @java.lang.Deprecated public boolean hasDateHeader() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <pre>
     * Date the seed was downloaded. Comes from HTTP header "Date"; see RFC 2616,
     * sections 3.3.1 and 14.18 for the format.
     * This was deprecated in favor of the |date| field in October 2019.
     * </pre>
     *
     * <code>optional string date_header = 3 [deprecated = true];</code>
     */
    @java.lang.Deprecated public java.lang.String getDateHeader() {
      return dateHeader_;
    }
    /**
     * <pre>
     * Date the seed was downloaded. Comes from HTTP header "Date"; see RFC 2616,
     * sections 3.3.1 and 14.18 for the format.
     * This was deprecated in favor of the |date| field in October 2019.
     * </pre>
     *
     * <code>optional string date_header = 3 [deprecated = true];</code>
     */
    @java.lang.Deprecated public com.google.protobuf.ByteString
        getDateHeaderBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(dateHeader_);
    }
    /**
     * <pre>
     * Date the seed was downloaded. Comes from HTTP header "Date"; see RFC 2616,
     * sections 3.3.1 and 14.18 for the format.
     * This was deprecated in favor of the |date| field in October 2019.
     * </pre>
     *
     * <code>optional string date_header = 3 [deprecated = true];</code>
     */
    private void setDateHeader(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      dateHeader_ = value;
    }
    /**
     * <pre>
     * Date the seed was downloaded. Comes from HTTP header "Date"; see RFC 2616,
     * sections 3.3.1 and 14.18 for the format.
     * This was deprecated in favor of the |date| field in October 2019.
     * </pre>
     *
     * <code>optional string date_header = 3 [deprecated = true];</code>
     */
    private void clearDateHeader() {
      bitField0_ = (bitField0_ & ~0x00000004);
      dateHeader_ = getDefaultInstance().getDateHeader();
    }
    /**
     * <pre>
     * Date the seed was downloaded. Comes from HTTP header "Date"; see RFC 2616,
     * sections 3.3.1 and 14.18 for the format.
     * This was deprecated in favor of the |date| field in October 2019.
     * </pre>
     *
     * <code>optional string date_header = 3 [deprecated = true];</code>
     */
    private void setDateHeaderBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      dateHeader_ = value.toStringUtf8();
    }

    public static final int IS_GZIP_COMPRESSED_FIELD_NUMBER = 4;
    private boolean isGzipCompressed_;
    /**
     * <pre>
     * Whether seed_data is compressed. Comes from HTTP header "IM".
     * </pre>
     *
     * <code>optional bool is_gzip_compressed = 4;</code>
     */
    public boolean hasIsGzipCompressed() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <pre>
     * Whether seed_data is compressed. Comes from HTTP header "IM".
     * </pre>
     *
     * <code>optional bool is_gzip_compressed = 4;</code>
     */
    public boolean getIsGzipCompressed() {
      return isGzipCompressed_;
    }
    /**
     * <pre>
     * Whether seed_data is compressed. Comes from HTTP header "IM".
     * </pre>
     *
     * <code>optional bool is_gzip_compressed = 4;</code>
     */
    private void setIsGzipCompressed(boolean value) {
      bitField0_ |= 0x00000008;
      isGzipCompressed_ = value;
    }
    /**
     * <pre>
     * Whether seed_data is compressed. Comes from HTTP header "IM".
     * </pre>
     *
     * <code>optional bool is_gzip_compressed = 4;</code>
     */
    private void clearIsGzipCompressed() {
      bitField0_ = (bitField0_ & ~0x00000008);
      isGzipCompressed_ = false;
    }

    public static final int SEED_DATA_FIELD_NUMBER = 5;
    private com.google.protobuf.ByteString seedData_;
    /**
     * <pre>
     * The download body, itself a serialized VariationsSeed proto.
     * </pre>
     *
     * <code>optional bytes seed_data = 5;</code>
     */
    public boolean hasSeedData() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <pre>
     * The download body, itself a serialized VariationsSeed proto.
     * </pre>
     *
     * <code>optional bytes seed_data = 5;</code>
     */
    public com.google.protobuf.ByteString getSeedData() {
      return seedData_;
    }
    /**
     * <pre>
     * The download body, itself a serialized VariationsSeed proto.
     * </pre>
     *
     * <code>optional bytes seed_data = 5;</code>
     */
    private void setSeedData(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
      seedData_ = value;
    }
    /**
     * <pre>
     * The download body, itself a serialized VariationsSeed proto.
     * </pre>
     *
     * <code>optional bytes seed_data = 5;</code>
     */
    private void clearSeedData() {
      bitField0_ = (bitField0_ & ~0x00000010);
      seedData_ = getDefaultInstance().getSeedData();
    }

    public static final int DATE_FIELD_NUMBER = 6;
    private long date_;
    /**
     * <pre>
     * Date the seed was downloaded according to the device's clock in
     * milliseconds since UNIX epoch, GMT.
     * </pre>
     *
     * <code>optional int64 date = 6;</code>
     */
    public boolean hasDate() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <pre>
     * Date the seed was downloaded according to the device's clock in
     * milliseconds since UNIX epoch, GMT.
     * </pre>
     *
     * <code>optional int64 date = 6;</code>
     */
    public long getDate() {
      return date_;
    }
    /**
     * <pre>
     * Date the seed was downloaded according to the device's clock in
     * milliseconds since UNIX epoch, GMT.
     * </pre>
     *
     * <code>optional int64 date = 6;</code>
     */
    private void setDate(long value) {
      bitField0_ |= 0x00000020;
      date_ = value;
    }
    /**
     * <pre>
     * Date the seed was downloaded according to the device's clock in
     * milliseconds since UNIX epoch, GMT.
     * </pre>
     *
     * <code>optional int64 date = 6;</code>
     */
    private void clearDate() {
      bitField0_ = (bitField0_ & ~0x00000020);
      date_ = 0L;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeString(1, getSignature());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeString(2, getCountry());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeString(3, getDateHeader());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBool(4, isGzipCompressed_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBytes(5, seedData_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeInt64(6, date_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getSignature());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(2, getCountry());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(3, getDateHeader());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, isGzipCompressed_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(5, seedData_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(6, date_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    public static org.chromium.android_webview.proto.AwVariationsSeedOuterClass.AwVariationsSeed parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.android_webview.proto.AwVariationsSeedOuterClass.AwVariationsSeed parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.android_webview.proto.AwVariationsSeedOuterClass.AwVariationsSeed parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.android_webview.proto.AwVariationsSeedOuterClass.AwVariationsSeed parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.android_webview.proto.AwVariationsSeedOuterClass.AwVariationsSeed parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static org.chromium.android_webview.proto.AwVariationsSeedOuterClass.AwVariationsSeed parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static org.chromium.android_webview.proto.AwVariationsSeedOuterClass.AwVariationsSeed parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static org.chromium.android_webview.proto.AwVariationsSeedOuterClass.AwVariationsSeed parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static org.chromium.android_webview.proto.AwVariationsSeedOuterClass.AwVariationsSeed parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static org.chromium.android_webview.proto.AwVariationsSeedOuterClass.AwVariationsSeed parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(org.chromium.android_webview.proto.AwVariationsSeedOuterClass.AwVariationsSeed prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * <pre>
     * WebView uses AwVariationsSeed to serialize a downloaded seed, along with the
     * required HTTP header metadata, to a file. While Chrome stores the seed in
     * prefs, WebView stores it in a separate file so the WebView service can write
     * new seeds directly to each app's seed file.
     * Next tag: 7
     * </pre>
     *
     * Protobuf type {@code org.chromium.android_webview.proto.AwVariationsSeed}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          org.chromium.android_webview.proto.AwVariationsSeedOuterClass.AwVariationsSeed, Builder> implements
        // @@protoc_insertion_point(builder_implements:org.chromium.android_webview.proto.AwVariationsSeed)
        org.chromium.android_webview.proto.AwVariationsSeedOuterClass.AwVariationsSeedOrBuilder {
      // Construct using org.chromium.android_webview.proto.AwVariationsSeedOuterClass.AwVariationsSeed.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       * Whether seed_data is compressed. Comes from HTTP header "X-Seed-Signature".
       * </pre>
       *
       * <code>optional string signature = 1;</code>
       */
      public boolean hasSignature() {
        return instance.hasSignature();
      }
      /**
       * <pre>
       * Whether seed_data is compressed. Comes from HTTP header "X-Seed-Signature".
       * </pre>
       *
       * <code>optional string signature = 1;</code>
       */
      public java.lang.String getSignature() {
        return instance.getSignature();
      }
      /**
       * <pre>
       * Whether seed_data is compressed. Comes from HTTP header "X-Seed-Signature".
       * </pre>
       *
       * <code>optional string signature = 1;</code>
       */
      public com.google.protobuf.ByteString
          getSignatureBytes() {
        return instance.getSignatureBytes();
      }
      /**
       * <pre>
       * Whether seed_data is compressed. Comes from HTTP header "X-Seed-Signature".
       * </pre>
       *
       * <code>optional string signature = 1;</code>
       */
      public Builder setSignature(
          java.lang.String value) {
        copyOnWrite();
        instance.setSignature(value);
        return this;
      }
      /**
       * <pre>
       * Whether seed_data is compressed. Comes from HTTP header "X-Seed-Signature".
       * </pre>
       *
       * <code>optional string signature = 1;</code>
       */
      public Builder clearSignature() {
        copyOnWrite();
        instance.clearSignature();
        return this;
      }
      /**
       * <pre>
       * Whether seed_data is compressed. Comes from HTTP header "X-Seed-Signature".
       * </pre>
       *
       * <code>optional string signature = 1;</code>
       */
      public Builder setSignatureBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setSignatureBytes(value);
        return this;
      }

      /**
       * <pre>
       * 2-letter country code. Comes from HTTP header "X-Country".
       * </pre>
       *
       * <code>optional string country = 2;</code>
       */
      public boolean hasCountry() {
        return instance.hasCountry();
      }
      /**
       * <pre>
       * 2-letter country code. Comes from HTTP header "X-Country".
       * </pre>
       *
       * <code>optional string country = 2;</code>
       */
      public java.lang.String getCountry() {
        return instance.getCountry();
      }
      /**
       * <pre>
       * 2-letter country code. Comes from HTTP header "X-Country".
       * </pre>
       *
       * <code>optional string country = 2;</code>
       */
      public com.google.protobuf.ByteString
          getCountryBytes() {
        return instance.getCountryBytes();
      }
      /**
       * <pre>
       * 2-letter country code. Comes from HTTP header "X-Country".
       * </pre>
       *
       * <code>optional string country = 2;</code>
       */
      public Builder setCountry(
          java.lang.String value) {
        copyOnWrite();
        instance.setCountry(value);
        return this;
      }
      /**
       * <pre>
       * 2-letter country code. Comes from HTTP header "X-Country".
       * </pre>
       *
       * <code>optional string country = 2;</code>
       */
      public Builder clearCountry() {
        copyOnWrite();
        instance.clearCountry();
        return this;
      }
      /**
       * <pre>
       * 2-letter country code. Comes from HTTP header "X-Country".
       * </pre>
       *
       * <code>optional string country = 2;</code>
       */
      public Builder setCountryBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setCountryBytes(value);
        return this;
      }

      /**
       * <pre>
       * Date the seed was downloaded. Comes from HTTP header "Date"; see RFC 2616,
       * sections 3.3.1 and 14.18 for the format.
       * This was deprecated in favor of the |date| field in October 2019.
       * </pre>
       *
       * <code>optional string date_header = 3 [deprecated = true];</code>
       */
      @java.lang.Deprecated public boolean hasDateHeader() {
        return instance.hasDateHeader();
      }
      /**
       * <pre>
       * Date the seed was downloaded. Comes from HTTP header "Date"; see RFC 2616,
       * sections 3.3.1 and 14.18 for the format.
       * This was deprecated in favor of the |date| field in October 2019.
       * </pre>
       *
       * <code>optional string date_header = 3 [deprecated = true];</code>
       */
      @java.lang.Deprecated public java.lang.String getDateHeader() {
        return instance.getDateHeader();
      }
      /**
       * <pre>
       * Date the seed was downloaded. Comes from HTTP header "Date"; see RFC 2616,
       * sections 3.3.1 and 14.18 for the format.
       * This was deprecated in favor of the |date| field in October 2019.
       * </pre>
       *
       * <code>optional string date_header = 3 [deprecated = true];</code>
       */
      @java.lang.Deprecated public com.google.protobuf.ByteString
          getDateHeaderBytes() {
        return instance.getDateHeaderBytes();
      }
      /**
       * <pre>
       * Date the seed was downloaded. Comes from HTTP header "Date"; see RFC 2616,
       * sections 3.3.1 and 14.18 for the format.
       * This was deprecated in favor of the |date| field in October 2019.
       * </pre>
       *
       * <code>optional string date_header = 3 [deprecated = true];</code>
       */
      @java.lang.Deprecated public Builder setDateHeader(
          java.lang.String value) {
        copyOnWrite();
        instance.setDateHeader(value);
        return this;
      }
      /**
       * <pre>
       * Date the seed was downloaded. Comes from HTTP header "Date"; see RFC 2616,
       * sections 3.3.1 and 14.18 for the format.
       * This was deprecated in favor of the |date| field in October 2019.
       * </pre>
       *
       * <code>optional string date_header = 3 [deprecated = true];</code>
       */
      @java.lang.Deprecated public Builder clearDateHeader() {
        copyOnWrite();
        instance.clearDateHeader();
        return this;
      }
      /**
       * <pre>
       * Date the seed was downloaded. Comes from HTTP header "Date"; see RFC 2616,
       * sections 3.3.1 and 14.18 for the format.
       * This was deprecated in favor of the |date| field in October 2019.
       * </pre>
       *
       * <code>optional string date_header = 3 [deprecated = true];</code>
       */
      @java.lang.Deprecated public Builder setDateHeaderBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setDateHeaderBytes(value);
        return this;
      }

      /**
       * <pre>
       * Whether seed_data is compressed. Comes from HTTP header "IM".
       * </pre>
       *
       * <code>optional bool is_gzip_compressed = 4;</code>
       */
      public boolean hasIsGzipCompressed() {
        return instance.hasIsGzipCompressed();
      }
      /**
       * <pre>
       * Whether seed_data is compressed. Comes from HTTP header "IM".
       * </pre>
       *
       * <code>optional bool is_gzip_compressed = 4;</code>
       */
      public boolean getIsGzipCompressed() {
        return instance.getIsGzipCompressed();
      }
      /**
       * <pre>
       * Whether seed_data is compressed. Comes from HTTP header "IM".
       * </pre>
       *
       * <code>optional bool is_gzip_compressed = 4;</code>
       */
      public Builder setIsGzipCompressed(boolean value) {
        copyOnWrite();
        instance.setIsGzipCompressed(value);
        return this;
      }
      /**
       * <pre>
       * Whether seed_data is compressed. Comes from HTTP header "IM".
       * </pre>
       *
       * <code>optional bool is_gzip_compressed = 4;</code>
       */
      public Builder clearIsGzipCompressed() {
        copyOnWrite();
        instance.clearIsGzipCompressed();
        return this;
      }

      /**
       * <pre>
       * The download body, itself a serialized VariationsSeed proto.
       * </pre>
       *
       * <code>optional bytes seed_data = 5;</code>
       */
      public boolean hasSeedData() {
        return instance.hasSeedData();
      }
      /**
       * <pre>
       * The download body, itself a serialized VariationsSeed proto.
       * </pre>
       *
       * <code>optional bytes seed_data = 5;</code>
       */
      public com.google.protobuf.ByteString getSeedData() {
        return instance.getSeedData();
      }
      /**
       * <pre>
       * The download body, itself a serialized VariationsSeed proto.
       * </pre>
       *
       * <code>optional bytes seed_data = 5;</code>
       */
      public Builder setSeedData(com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setSeedData(value);
        return this;
      }
      /**
       * <pre>
       * The download body, itself a serialized VariationsSeed proto.
       * </pre>
       *
       * <code>optional bytes seed_data = 5;</code>
       */
      public Builder clearSeedData() {
        copyOnWrite();
        instance.clearSeedData();
        return this;
      }

      /**
       * <pre>
       * Date the seed was downloaded according to the device's clock in
       * milliseconds since UNIX epoch, GMT.
       * </pre>
       *
       * <code>optional int64 date = 6;</code>
       */
      public boolean hasDate() {
        return instance.hasDate();
      }
      /**
       * <pre>
       * Date the seed was downloaded according to the device's clock in
       * milliseconds since UNIX epoch, GMT.
       * </pre>
       *
       * <code>optional int64 date = 6;</code>
       */
      public long getDate() {
        return instance.getDate();
      }
      /**
       * <pre>
       * Date the seed was downloaded according to the device's clock in
       * milliseconds since UNIX epoch, GMT.
       * </pre>
       *
       * <code>optional int64 date = 6;</code>
       */
      public Builder setDate(long value) {
        copyOnWrite();
        instance.setDate(value);
        return this;
      }
      /**
       * <pre>
       * Date the seed was downloaded according to the device's clock in
       * milliseconds since UNIX epoch, GMT.
       * </pre>
       *
       * <code>optional int64 date = 6;</code>
       */
      public Builder clearDate() {
        copyOnWrite();
        instance.clearDate();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:org.chromium.android_webview.proto.AwVariationsSeed)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new org.chromium.android_webview.proto.AwVariationsSeedOuterClass.AwVariationsSeed();
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
          org.chromium.android_webview.proto.AwVariationsSeedOuterClass.AwVariationsSeed other = (org.chromium.android_webview.proto.AwVariationsSeedOuterClass.AwVariationsSeed) arg1;
          signature_ = visitor.visitString(
              hasSignature(), signature_,
              other.hasSignature(), other.signature_);
          country_ = visitor.visitString(
              hasCountry(), country_,
              other.hasCountry(), other.country_);
          dateHeader_ = visitor.visitString(
              hasDateHeader(), dateHeader_,
              other.hasDateHeader(), other.dateHeader_);
          isGzipCompressed_ = visitor.visitBoolean(
              hasIsGzipCompressed(), isGzipCompressed_,
              other.hasIsGzipCompressed(), other.isGzipCompressed_);
          seedData_ = visitor.visitByteString(
              hasSeedData(), seedData_,
              other.hasSeedData(), other.seedData_);
          date_ = visitor.visitLong(
              hasDate(), date_,
              other.hasDate(), other.date_);
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
                  signature_ = s;
                  break;
                }
                case 18: {
                  String s = input.readString();
                  bitField0_ |= 0x00000002;
                  country_ = s;
                  break;
                }
                case 26: {
                  String s = input.readString();
                  bitField0_ |= 0x00000004;
                  dateHeader_ = s;
                  break;
                }
                case 32: {
                  bitField0_ |= 0x00000008;
                  isGzipCompressed_ = input.readBool();
                  break;
                }
                case 42: {
                  bitField0_ |= 0x00000010;
                  seedData_ = input.readBytes();
                  break;
                }
                case 48: {
                  bitField0_ |= 0x00000020;
                  date_ = input.readInt64();
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
          if (PARSER == null) {    synchronized (org.chromium.android_webview.proto.AwVariationsSeedOuterClass.AwVariationsSeed.class) {
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


    // @@protoc_insertion_point(class_scope:org.chromium.android_webview.proto.AwVariationsSeed)
    private static final org.chromium.android_webview.proto.AwVariationsSeedOuterClass.AwVariationsSeed DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new AwVariationsSeed();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static org.chromium.android_webview.proto.AwVariationsSeedOuterClass.AwVariationsSeed getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<AwVariationsSeed> PARSER;

    public static com.google.protobuf.Parser<AwVariationsSeed> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
