// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sharing_sms_fetch_message.proto

package org.chromium.components.sync.protocol;

/**
 * <pre>
 * Response message to fetch a SMS from a remote device.
 * </pre>
 *
 * Protobuf type {@code chrome_browser_sharing.SmsFetchResponse}
 */
public  final class SmsFetchResponse extends
    com.google.protobuf.GeneratedMessageLite<
        SmsFetchResponse, SmsFetchResponse.Builder> implements
    // @@protoc_insertion_point(message_implements:chrome_browser_sharing.SmsFetchResponse)
    SmsFetchResponseOrBuilder {
  private SmsFetchResponse() {
    sms_ = "";
    oneTimeCode_ = "";
  }
  public static final int SMS_FIELD_NUMBER = 1;
  private java.lang.String sms_;
  /**
   * <pre>
   * The full contents of the received SMS.
   * required
   * </pre>
   *
   * <code>optional string sms = 1;</code>
   */
  public java.lang.String getSms() {
    return sms_;
  }
  /**
   * <pre>
   * The full contents of the received SMS.
   * required
   * </pre>
   *
   * <code>optional string sms = 1;</code>
   */
  public com.google.protobuf.ByteString
      getSmsBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(sms_);
  }
  /**
   * <pre>
   * The full contents of the received SMS.
   * required
   * </pre>
   *
   * <code>optional string sms = 1;</code>
   */
  private void setSms(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    sms_ = value;
  }
  /**
   * <pre>
   * The full contents of the received SMS.
   * required
   * </pre>
   *
   * <code>optional string sms = 1;</code>
   */
  private void clearSms() {
    
    sms_ = getDefaultInstance().getSms();
  }
  /**
   * <pre>
   * The full contents of the received SMS.
   * required
   * </pre>
   *
   * <code>optional string sms = 1;</code>
   */
  private void setSmsBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    sms_ = value.toStringUtf8();
  }

  public static final int ONE_TIME_CODE_FIELD_NUMBER = 2;
  private java.lang.String oneTimeCode_;
  /**
   * <pre>
   * The parsed one time code of the received SMS.
   * required
   * </pre>
   *
   * <code>optional string one_time_code = 2;</code>
   */
  public java.lang.String getOneTimeCode() {
    return oneTimeCode_;
  }
  /**
   * <pre>
   * The parsed one time code of the received SMS.
   * required
   * </pre>
   *
   * <code>optional string one_time_code = 2;</code>
   */
  public com.google.protobuf.ByteString
      getOneTimeCodeBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(oneTimeCode_);
  }
  /**
   * <pre>
   * The parsed one time code of the received SMS.
   * required
   * </pre>
   *
   * <code>optional string one_time_code = 2;</code>
   */
  private void setOneTimeCode(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    oneTimeCode_ = value;
  }
  /**
   * <pre>
   * The parsed one time code of the received SMS.
   * required
   * </pre>
   *
   * <code>optional string one_time_code = 2;</code>
   */
  private void clearOneTimeCode() {
    
    oneTimeCode_ = getDefaultInstance().getOneTimeCode();
  }
  /**
   * <pre>
   * The parsed one time code of the received SMS.
   * required
   * </pre>
   *
   * <code>optional string one_time_code = 2;</code>
   */
  private void setOneTimeCodeBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    oneTimeCode_ = value.toStringUtf8();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!sms_.isEmpty()) {
      output.writeString(1, getSms());
    }
    if (!oneTimeCode_.isEmpty()) {
      output.writeString(2, getOneTimeCode());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (!sms_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, getSms());
    }
    if (!oneTimeCode_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(2, getOneTimeCode());
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static org.chromium.components.sync.protocol.SmsFetchResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.SmsFetchResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.SmsFetchResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.SmsFetchResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.SmsFetchResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.SmsFetchResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.SmsFetchResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.SmsFetchResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.SmsFetchResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.SmsFetchResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.chromium.components.sync.protocol.SmsFetchResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * Response message to fetch a SMS from a remote device.
   * </pre>
   *
   * Protobuf type {@code chrome_browser_sharing.SmsFetchResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.components.sync.protocol.SmsFetchResponse, Builder> implements
      // @@protoc_insertion_point(builder_implements:chrome_browser_sharing.SmsFetchResponse)
      org.chromium.components.sync.protocol.SmsFetchResponseOrBuilder {
    // Construct using org.chromium.components.sync.protocol.SmsFetchResponse.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The full contents of the received SMS.
     * required
     * </pre>
     *
     * <code>optional string sms = 1;</code>
     */
    public java.lang.String getSms() {
      return instance.getSms();
    }
    /**
     * <pre>
     * The full contents of the received SMS.
     * required
     * </pre>
     *
     * <code>optional string sms = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSmsBytes() {
      return instance.getSmsBytes();
    }
    /**
     * <pre>
     * The full contents of the received SMS.
     * required
     * </pre>
     *
     * <code>optional string sms = 1;</code>
     */
    public Builder setSms(
        java.lang.String value) {
      copyOnWrite();
      instance.setSms(value);
      return this;
    }
    /**
     * <pre>
     * The full contents of the received SMS.
     * required
     * </pre>
     *
     * <code>optional string sms = 1;</code>
     */
    public Builder clearSms() {
      copyOnWrite();
      instance.clearSms();
      return this;
    }
    /**
     * <pre>
     * The full contents of the received SMS.
     * required
     * </pre>
     *
     * <code>optional string sms = 1;</code>
     */
    public Builder setSmsBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setSmsBytes(value);
      return this;
    }

    /**
     * <pre>
     * The parsed one time code of the received SMS.
     * required
     * </pre>
     *
     * <code>optional string one_time_code = 2;</code>
     */
    public java.lang.String getOneTimeCode() {
      return instance.getOneTimeCode();
    }
    /**
     * <pre>
     * The parsed one time code of the received SMS.
     * required
     * </pre>
     *
     * <code>optional string one_time_code = 2;</code>
     */
    public com.google.protobuf.ByteString
        getOneTimeCodeBytes() {
      return instance.getOneTimeCodeBytes();
    }
    /**
     * <pre>
     * The parsed one time code of the received SMS.
     * required
     * </pre>
     *
     * <code>optional string one_time_code = 2;</code>
     */
    public Builder setOneTimeCode(
        java.lang.String value) {
      copyOnWrite();
      instance.setOneTimeCode(value);
      return this;
    }
    /**
     * <pre>
     * The parsed one time code of the received SMS.
     * required
     * </pre>
     *
     * <code>optional string one_time_code = 2;</code>
     */
    public Builder clearOneTimeCode() {
      copyOnWrite();
      instance.clearOneTimeCode();
      return this;
    }
    /**
     * <pre>
     * The parsed one time code of the received SMS.
     * required
     * </pre>
     *
     * <code>optional string one_time_code = 2;</code>
     */
    public Builder setOneTimeCodeBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setOneTimeCodeBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:chrome_browser_sharing.SmsFetchResponse)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.components.sync.protocol.SmsFetchResponse();
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
        org.chromium.components.sync.protocol.SmsFetchResponse other = (org.chromium.components.sync.protocol.SmsFetchResponse) arg1;
        sms_ = visitor.visitString(!sms_.isEmpty(), sms_,
            !other.sms_.isEmpty(), other.sms_);
        oneTimeCode_ = visitor.visitString(!oneTimeCode_.isEmpty(), oneTimeCode_,
            !other.oneTimeCode_.isEmpty(), other.oneTimeCode_);
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
                if (!input.skipField(tag)) {
                  done = true;
                }
                break;
              }
              case 10: {
                String s = input.readStringRequireUtf8();

                sms_ = s;
                break;
              }
              case 18: {
                String s = input.readStringRequireUtf8();

                oneTimeCode_ = s;
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
        if (PARSER == null) {    synchronized (org.chromium.components.sync.protocol.SmsFetchResponse.class) {
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


  // @@protoc_insertion_point(class_scope:chrome_browser_sharing.SmsFetchResponse)
  private static final org.chromium.components.sync.protocol.SmsFetchResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new SmsFetchResponse();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static org.chromium.components.sync.protocol.SmsFetchResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<SmsFetchResponse> PARSER;

  public static com.google.protobuf.Parser<SmsFetchResponse> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
