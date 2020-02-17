// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: nigori_local_data.proto

package org.chromium.components.sync.protocol;

/**
 * Protobuf type {@code sync_pb.CryptographerData}
 */
public  final class CryptographerData extends
    com.google.protobuf.GeneratedMessageLite<
        CryptographerData, CryptographerData.Builder> implements
    // @@protoc_insertion_point(message_implements:sync_pb.CryptographerData)
    CryptographerDataOrBuilder {
  private CryptographerData() {
    defaultKeyName_ = "";
  }
  private int bitField0_;
  public static final int KEY_BAG_FIELD_NUMBER = 1;
  private org.chromium.components.sync.protocol.NigoriKeyBag keyBag_;
  /**
   * <pre>
   * Contains all known Nigori keys.
   * </pre>
   *
   * <code>optional .sync_pb.NigoriKeyBag key_bag = 1;</code>
   */
  public boolean hasKeyBag() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <pre>
   * Contains all known Nigori keys.
   * </pre>
   *
   * <code>optional .sync_pb.NigoriKeyBag key_bag = 1;</code>
   */
  public org.chromium.components.sync.protocol.NigoriKeyBag getKeyBag() {
    return keyBag_ == null ? org.chromium.components.sync.protocol.NigoriKeyBag.getDefaultInstance() : keyBag_;
  }
  /**
   * <pre>
   * Contains all known Nigori keys.
   * </pre>
   *
   * <code>optional .sync_pb.NigoriKeyBag key_bag = 1;</code>
   */
  private void setKeyBag(org.chromium.components.sync.protocol.NigoriKeyBag value) {
    if (value == null) {
      throw new NullPointerException();
    }
    keyBag_ = value;
    bitField0_ |= 0x00000001;
    }
  /**
   * <pre>
   * Contains all known Nigori keys.
   * </pre>
   *
   * <code>optional .sync_pb.NigoriKeyBag key_bag = 1;</code>
   */
  private void setKeyBag(
      org.chromium.components.sync.protocol.NigoriKeyBag.Builder builderForValue) {
    keyBag_ = builderForValue.build();
    bitField0_ |= 0x00000001;
  }
  /**
   * <pre>
   * Contains all known Nigori keys.
   * </pre>
   *
   * <code>optional .sync_pb.NigoriKeyBag key_bag = 1;</code>
   */
  private void mergeKeyBag(org.chromium.components.sync.protocol.NigoriKeyBag value) {
    if (keyBag_ != null &&
        keyBag_ != org.chromium.components.sync.protocol.NigoriKeyBag.getDefaultInstance()) {
      keyBag_ =
        org.chromium.components.sync.protocol.NigoriKeyBag.newBuilder(keyBag_).mergeFrom(value).buildPartial();
    } else {
      keyBag_ = value;
    }
    bitField0_ |= 0x00000001;
  }
  /**
   * <pre>
   * Contains all known Nigori keys.
   * </pre>
   *
   * <code>optional .sync_pb.NigoriKeyBag key_bag = 1;</code>
   */
  private void clearKeyBag() {  keyBag_ = null;
    bitField0_ = (bitField0_ & ~0x00000001);
  }

  public static final int DEFAULT_KEY_NAME_FIELD_NUMBER = 2;
  private java.lang.String defaultKeyName_;
  /**
   * <pre>
   * Default key is the key, that should be used for encryption. Can be empty
   * in case we have pending keys (waiting for explicit passphrase, or client
   * didn't received keystore keys).
   * </pre>
   *
   * <code>optional string default_key_name = 2;</code>
   */
  public boolean hasDefaultKeyName() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <pre>
   * Default key is the key, that should be used for encryption. Can be empty
   * in case we have pending keys (waiting for explicit passphrase, or client
   * didn't received keystore keys).
   * </pre>
   *
   * <code>optional string default_key_name = 2;</code>
   */
  public java.lang.String getDefaultKeyName() {
    return defaultKeyName_;
  }
  /**
   * <pre>
   * Default key is the key, that should be used for encryption. Can be empty
   * in case we have pending keys (waiting for explicit passphrase, or client
   * didn't received keystore keys).
   * </pre>
   *
   * <code>optional string default_key_name = 2;</code>
   */
  public com.google.protobuf.ByteString
      getDefaultKeyNameBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(defaultKeyName_);
  }
  /**
   * <pre>
   * Default key is the key, that should be used for encryption. Can be empty
   * in case we have pending keys (waiting for explicit passphrase, or client
   * didn't received keystore keys).
   * </pre>
   *
   * <code>optional string default_key_name = 2;</code>
   */
  private void setDefaultKeyName(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
    defaultKeyName_ = value;
  }
  /**
   * <pre>
   * Default key is the key, that should be used for encryption. Can be empty
   * in case we have pending keys (waiting for explicit passphrase, or client
   * didn't received keystore keys).
   * </pre>
   *
   * <code>optional string default_key_name = 2;</code>
   */
  private void clearDefaultKeyName() {
    bitField0_ = (bitField0_ & ~0x00000002);
    defaultKeyName_ = getDefaultInstance().getDefaultKeyName();
  }
  /**
   * <pre>
   * Default key is the key, that should be used for encryption. Can be empty
   * in case we have pending keys (waiting for explicit passphrase, or client
   * didn't received keystore keys).
   * </pre>
   *
   * <code>optional string default_key_name = 2;</code>
   */
  private void setDefaultKeyNameBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
    defaultKeyName_ = value.toStringUtf8();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeMessage(1, getKeyBag());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeString(2, getDefaultKeyName());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getKeyBag());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(2, getDefaultKeyName());
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static org.chromium.components.sync.protocol.CryptographerData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.CryptographerData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.CryptographerData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.CryptographerData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.CryptographerData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.CryptographerData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.CryptographerData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.CryptographerData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.CryptographerData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.CryptographerData parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.chromium.components.sync.protocol.CryptographerData prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code sync_pb.CryptographerData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.components.sync.protocol.CryptographerData, Builder> implements
      // @@protoc_insertion_point(builder_implements:sync_pb.CryptographerData)
      org.chromium.components.sync.protocol.CryptographerDataOrBuilder {
    // Construct using org.chromium.components.sync.protocol.CryptographerData.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Contains all known Nigori keys.
     * </pre>
     *
     * <code>optional .sync_pb.NigoriKeyBag key_bag = 1;</code>
     */
    public boolean hasKeyBag() {
      return instance.hasKeyBag();
    }
    /**
     * <pre>
     * Contains all known Nigori keys.
     * </pre>
     *
     * <code>optional .sync_pb.NigoriKeyBag key_bag = 1;</code>
     */
    public org.chromium.components.sync.protocol.NigoriKeyBag getKeyBag() {
      return instance.getKeyBag();
    }
    /**
     * <pre>
     * Contains all known Nigori keys.
     * </pre>
     *
     * <code>optional .sync_pb.NigoriKeyBag key_bag = 1;</code>
     */
    public Builder setKeyBag(org.chromium.components.sync.protocol.NigoriKeyBag value) {
      copyOnWrite();
      instance.setKeyBag(value);
      return this;
      }
    /**
     * <pre>
     * Contains all known Nigori keys.
     * </pre>
     *
     * <code>optional .sync_pb.NigoriKeyBag key_bag = 1;</code>
     */
    public Builder setKeyBag(
        org.chromium.components.sync.protocol.NigoriKeyBag.Builder builderForValue) {
      copyOnWrite();
      instance.setKeyBag(builderForValue);
      return this;
    }
    /**
     * <pre>
     * Contains all known Nigori keys.
     * </pre>
     *
     * <code>optional .sync_pb.NigoriKeyBag key_bag = 1;</code>
     */
    public Builder mergeKeyBag(org.chromium.components.sync.protocol.NigoriKeyBag value) {
      copyOnWrite();
      instance.mergeKeyBag(value);
      return this;
    }
    /**
     * <pre>
     * Contains all known Nigori keys.
     * </pre>
     *
     * <code>optional .sync_pb.NigoriKeyBag key_bag = 1;</code>
     */
    public Builder clearKeyBag() {  copyOnWrite();
      instance.clearKeyBag();
      return this;
    }

    /**
     * <pre>
     * Default key is the key, that should be used for encryption. Can be empty
     * in case we have pending keys (waiting for explicit passphrase, or client
     * didn't received keystore keys).
     * </pre>
     *
     * <code>optional string default_key_name = 2;</code>
     */
    public boolean hasDefaultKeyName() {
      return instance.hasDefaultKeyName();
    }
    /**
     * <pre>
     * Default key is the key, that should be used for encryption. Can be empty
     * in case we have pending keys (waiting for explicit passphrase, or client
     * didn't received keystore keys).
     * </pre>
     *
     * <code>optional string default_key_name = 2;</code>
     */
    public java.lang.String getDefaultKeyName() {
      return instance.getDefaultKeyName();
    }
    /**
     * <pre>
     * Default key is the key, that should be used for encryption. Can be empty
     * in case we have pending keys (waiting for explicit passphrase, or client
     * didn't received keystore keys).
     * </pre>
     *
     * <code>optional string default_key_name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getDefaultKeyNameBytes() {
      return instance.getDefaultKeyNameBytes();
    }
    /**
     * <pre>
     * Default key is the key, that should be used for encryption. Can be empty
     * in case we have pending keys (waiting for explicit passphrase, or client
     * didn't received keystore keys).
     * </pre>
     *
     * <code>optional string default_key_name = 2;</code>
     */
    public Builder setDefaultKeyName(
        java.lang.String value) {
      copyOnWrite();
      instance.setDefaultKeyName(value);
      return this;
    }
    /**
     * <pre>
     * Default key is the key, that should be used for encryption. Can be empty
     * in case we have pending keys (waiting for explicit passphrase, or client
     * didn't received keystore keys).
     * </pre>
     *
     * <code>optional string default_key_name = 2;</code>
     */
    public Builder clearDefaultKeyName() {
      copyOnWrite();
      instance.clearDefaultKeyName();
      return this;
    }
    /**
     * <pre>
     * Default key is the key, that should be used for encryption. Can be empty
     * in case we have pending keys (waiting for explicit passphrase, or client
     * didn't received keystore keys).
     * </pre>
     *
     * <code>optional string default_key_name = 2;</code>
     */
    public Builder setDefaultKeyNameBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setDefaultKeyNameBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sync_pb.CryptographerData)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.components.sync.protocol.CryptographerData();
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
        org.chromium.components.sync.protocol.CryptographerData other = (org.chromium.components.sync.protocol.CryptographerData) arg1;
        keyBag_ = visitor.visitMessage(keyBag_, other.keyBag_);
        defaultKeyName_ = visitor.visitString(
            hasDefaultKeyName(), defaultKeyName_,
            other.hasDefaultKeyName(), other.defaultKeyName_);
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
                org.chromium.components.sync.protocol.NigoriKeyBag.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = keyBag_.toBuilder();
                }
                keyBag_ = input.readMessage(org.chromium.components.sync.protocol.NigoriKeyBag.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(keyBag_);
                  keyBag_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
              case 18: {
                String s = input.readString();
                bitField0_ |= 0x00000002;
                defaultKeyName_ = s;
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
        if (PARSER == null) {    synchronized (org.chromium.components.sync.protocol.CryptographerData.class) {
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


  // @@protoc_insertion_point(class_scope:sync_pb.CryptographerData)
  private static final org.chromium.components.sync.protocol.CryptographerData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new CryptographerData();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static org.chromium.components.sync.protocol.CryptographerData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<CryptographerData> PARSER;

  public static com.google.protobuf.Parser<CryptographerData> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
