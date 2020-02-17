// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: generic_ui.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * Protobuf type {@code autofill_assistant.GenericUserInterfaceProto}
 */
public  final class GenericUserInterfaceProto extends
    com.google.protobuf.GeneratedMessageLite<
        GenericUserInterfaceProto, GenericUserInterfaceProto.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.GenericUserInterfaceProto)
    GenericUserInterfaceProtoOrBuilder {
  private GenericUserInterfaceProto() {
  }
  private int bitField0_;
  public static final int ROOT_VIEW_FIELD_NUMBER = 1;
  private org.chromium.chrome.browser.autofill_assistant.proto.ViewProto rootView_;
  /**
   * <pre>
   * The root view, usually a view container.
   * </pre>
   *
   * <code>optional .autofill_assistant.ViewProto root_view = 1;</code>
   */
  public boolean hasRootView() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <pre>
   * The root view, usually a view container.
   * </pre>
   *
   * <code>optional .autofill_assistant.ViewProto root_view = 1;</code>
   */
  public org.chromium.chrome.browser.autofill_assistant.proto.ViewProto getRootView() {
    return rootView_ == null ? org.chromium.chrome.browser.autofill_assistant.proto.ViewProto.getDefaultInstance() : rootView_;
  }
  /**
   * <pre>
   * The root view, usually a view container.
   * </pre>
   *
   * <code>optional .autofill_assistant.ViewProto root_view = 1;</code>
   */
  private void setRootView(org.chromium.chrome.browser.autofill_assistant.proto.ViewProto value) {
    if (value == null) {
      throw new NullPointerException();
    }
    rootView_ = value;
    bitField0_ |= 0x00000001;
    }
  /**
   * <pre>
   * The root view, usually a view container.
   * </pre>
   *
   * <code>optional .autofill_assistant.ViewProto root_view = 1;</code>
   */
  private void setRootView(
      org.chromium.chrome.browser.autofill_assistant.proto.ViewProto.Builder builderForValue) {
    rootView_ = builderForValue.build();
    bitField0_ |= 0x00000001;
  }
  /**
   * <pre>
   * The root view, usually a view container.
   * </pre>
   *
   * <code>optional .autofill_assistant.ViewProto root_view = 1;</code>
   */
  private void mergeRootView(org.chromium.chrome.browser.autofill_assistant.proto.ViewProto value) {
    if (rootView_ != null &&
        rootView_ != org.chromium.chrome.browser.autofill_assistant.proto.ViewProto.getDefaultInstance()) {
      rootView_ =
        org.chromium.chrome.browser.autofill_assistant.proto.ViewProto.newBuilder(rootView_).mergeFrom(value).buildPartial();
    } else {
      rootView_ = value;
    }
    bitField0_ |= 0x00000001;
  }
  /**
   * <pre>
   * The root view, usually a view container.
   * </pre>
   *
   * <code>optional .autofill_assistant.ViewProto root_view = 1;</code>
   */
  private void clearRootView() {  rootView_ = null;
    bitField0_ = (bitField0_ & ~0x00000001);
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeMessage(1, getRootView());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getRootView());
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code autofill_assistant.GenericUserInterfaceProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.GenericUserInterfaceProto)
      org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProtoOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The root view, usually a view container.
     * </pre>
     *
     * <code>optional .autofill_assistant.ViewProto root_view = 1;</code>
     */
    public boolean hasRootView() {
      return instance.hasRootView();
    }
    /**
     * <pre>
     * The root view, usually a view container.
     * </pre>
     *
     * <code>optional .autofill_assistant.ViewProto root_view = 1;</code>
     */
    public org.chromium.chrome.browser.autofill_assistant.proto.ViewProto getRootView() {
      return instance.getRootView();
    }
    /**
     * <pre>
     * The root view, usually a view container.
     * </pre>
     *
     * <code>optional .autofill_assistant.ViewProto root_view = 1;</code>
     */
    public Builder setRootView(org.chromium.chrome.browser.autofill_assistant.proto.ViewProto value) {
      copyOnWrite();
      instance.setRootView(value);
      return this;
      }
    /**
     * <pre>
     * The root view, usually a view container.
     * </pre>
     *
     * <code>optional .autofill_assistant.ViewProto root_view = 1;</code>
     */
    public Builder setRootView(
        org.chromium.chrome.browser.autofill_assistant.proto.ViewProto.Builder builderForValue) {
      copyOnWrite();
      instance.setRootView(builderForValue);
      return this;
    }
    /**
     * <pre>
     * The root view, usually a view container.
     * </pre>
     *
     * <code>optional .autofill_assistant.ViewProto root_view = 1;</code>
     */
    public Builder mergeRootView(org.chromium.chrome.browser.autofill_assistant.proto.ViewProto value) {
      copyOnWrite();
      instance.mergeRootView(value);
      return this;
    }
    /**
     * <pre>
     * The root view, usually a view container.
     * </pre>
     *
     * <code>optional .autofill_assistant.ViewProto root_view = 1;</code>
     */
    public Builder clearRootView() {  copyOnWrite();
      instance.clearRootView();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.GenericUserInterfaceProto)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto();
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
        org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto other = (org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto) arg1;
        rootView_ = visitor.visitMessage(rootView_, other.rootView_);
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
                org.chromium.chrome.browser.autofill_assistant.proto.ViewProto.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = rootView_.toBuilder();
                }
                rootView_ = input.readMessage(org.chromium.chrome.browser.autofill_assistant.proto.ViewProto.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(rootView_);
                  rootView_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
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
        if (PARSER == null) {    synchronized (org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto.class) {
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


  // @@protoc_insertion_point(class_scope:autofill_assistant.GenericUserInterfaceProto)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new GenericUserInterfaceProto();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<GenericUserInterfaceProto> PARSER;

  public static com.google.protobuf.Parser<GenericUserInterfaceProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

