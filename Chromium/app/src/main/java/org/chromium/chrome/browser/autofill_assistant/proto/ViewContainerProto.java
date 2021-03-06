// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: generic_ui.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * Protobuf type {@code autofill_assistant.ViewContainerProto}
 */
public  final class ViewContainerProto extends
    com.google.protobuf.GeneratedMessageLite<
        ViewContainerProto, ViewContainerProto.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.ViewContainerProto)
    ViewContainerProtoOrBuilder {
  private ViewContainerProto() {
    views_ = emptyProtobufList();
  }
  private int bitField0_;
  private int containerCase_ = 0;
  private java.lang.Object container_;
  public enum ContainerCase
      implements com.google.protobuf.Internal.EnumLite {
    LINEAR_LAYOUT(2),
    CONTAINER_NOT_SET(0);
    private final int value;
    private ContainerCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ContainerCase valueOf(int value) {
      return forNumber(value);
    }

    public static ContainerCase forNumber(int value) {
      switch (value) {
        case 2: return LINEAR_LAYOUT;
        case 0: return CONTAINER_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ContainerCase
  getContainerCase() {
    return ContainerCase.forNumber(
        containerCase_);
  }

  private void clearContainer() {
    containerCase_ = 0;
    container_ = null;
  }

  public static final int VIEWS_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.ProtobufList<org.chromium.chrome.browser.autofill_assistant.proto.ViewProto> views_;
  /**
   * <pre>
   * The list of views to add to this container.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ViewProto views = 1;</code>
   */
  public java.util.List<org.chromium.chrome.browser.autofill_assistant.proto.ViewProto> getViewsList() {
    return views_;
  }
  /**
   * <pre>
   * The list of views to add to this container.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ViewProto views = 1;</code>
   */
  public java.util.List<? extends org.chromium.chrome.browser.autofill_assistant.proto.ViewProtoOrBuilder> 
      getViewsOrBuilderList() {
    return views_;
  }
  /**
   * <pre>
   * The list of views to add to this container.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ViewProto views = 1;</code>
   */
  public int getViewsCount() {
    return views_.size();
  }
  /**
   * <pre>
   * The list of views to add to this container.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ViewProto views = 1;</code>
   */
  public org.chromium.chrome.browser.autofill_assistant.proto.ViewProto getViews(int index) {
    return views_.get(index);
  }
  /**
   * <pre>
   * The list of views to add to this container.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ViewProto views = 1;</code>
   */
  public org.chromium.chrome.browser.autofill_assistant.proto.ViewProtoOrBuilder getViewsOrBuilder(
      int index) {
    return views_.get(index);
  }
  private void ensureViewsIsMutable() {
    if (!views_.isModifiable()) {
      views_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(views_);
     }
  }

  /**
   * <pre>
   * The list of views to add to this container.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ViewProto views = 1;</code>
   */
  private void setViews(
      int index, org.chromium.chrome.browser.autofill_assistant.proto.ViewProto value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureViewsIsMutable();
    views_.set(index, value);
  }
  /**
   * <pre>
   * The list of views to add to this container.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ViewProto views = 1;</code>
   */
  private void setViews(
      int index, org.chromium.chrome.browser.autofill_assistant.proto.ViewProto.Builder builderForValue) {
    ensureViewsIsMutable();
    views_.set(index, builderForValue.build());
  }
  /**
   * <pre>
   * The list of views to add to this container.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ViewProto views = 1;</code>
   */
  private void addViews(org.chromium.chrome.browser.autofill_assistant.proto.ViewProto value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureViewsIsMutable();
    views_.add(value);
  }
  /**
   * <pre>
   * The list of views to add to this container.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ViewProto views = 1;</code>
   */
  private void addViews(
      int index, org.chromium.chrome.browser.autofill_assistant.proto.ViewProto value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureViewsIsMutable();
    views_.add(index, value);
  }
  /**
   * <pre>
   * The list of views to add to this container.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ViewProto views = 1;</code>
   */
  private void addViews(
      org.chromium.chrome.browser.autofill_assistant.proto.ViewProto.Builder builderForValue) {
    ensureViewsIsMutable();
    views_.add(builderForValue.build());
  }
  /**
   * <pre>
   * The list of views to add to this container.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ViewProto views = 1;</code>
   */
  private void addViews(
      int index, org.chromium.chrome.browser.autofill_assistant.proto.ViewProto.Builder builderForValue) {
    ensureViewsIsMutable();
    views_.add(index, builderForValue.build());
  }
  /**
   * <pre>
   * The list of views to add to this container.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ViewProto views = 1;</code>
   */
  private void addAllViews(
      java.lang.Iterable<? extends org.chromium.chrome.browser.autofill_assistant.proto.ViewProto> values) {
    ensureViewsIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, views_);
  }
  /**
   * <pre>
   * The list of views to add to this container.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ViewProto views = 1;</code>
   */
  private void clearViews() {
    views_ = emptyProtobufList();
  }
  /**
   * <pre>
   * The list of views to add to this container.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ViewProto views = 1;</code>
   */
  private void removeViews(int index) {
    ensureViewsIsMutable();
    views_.remove(index);
  }

  public static final int LINEAR_LAYOUT_FIELD_NUMBER = 2;
  /**
   * <code>optional .autofill_assistant.LinearLayoutProto linear_layout = 2;</code>
   */
  public boolean hasLinearLayout() {
    return containerCase_ == 2;
  }
  /**
   * <code>optional .autofill_assistant.LinearLayoutProto linear_layout = 2;</code>
   */
  public org.chromium.chrome.browser.autofill_assistant.proto.LinearLayoutProto getLinearLayout() {
    if (containerCase_ == 2) {
       return (org.chromium.chrome.browser.autofill_assistant.proto.LinearLayoutProto) container_;
    }
    return org.chromium.chrome.browser.autofill_assistant.proto.LinearLayoutProto.getDefaultInstance();
  }
  /**
   * <code>optional .autofill_assistant.LinearLayoutProto linear_layout = 2;</code>
   */
  private void setLinearLayout(org.chromium.chrome.browser.autofill_assistant.proto.LinearLayoutProto value) {
    if (value == null) {
      throw new NullPointerException();
    }
    container_ = value;
    containerCase_ = 2;
  }
  /**
   * <code>optional .autofill_assistant.LinearLayoutProto linear_layout = 2;</code>
   */
  private void setLinearLayout(
      org.chromium.chrome.browser.autofill_assistant.proto.LinearLayoutProto.Builder builderForValue) {
    container_ = builderForValue.build();
    containerCase_ = 2;
  }
  /**
   * <code>optional .autofill_assistant.LinearLayoutProto linear_layout = 2;</code>
   */
  private void mergeLinearLayout(org.chromium.chrome.browser.autofill_assistant.proto.LinearLayoutProto value) {
    if (containerCase_ == 2 &&
        container_ != org.chromium.chrome.browser.autofill_assistant.proto.LinearLayoutProto.getDefaultInstance()) {
      container_ = org.chromium.chrome.browser.autofill_assistant.proto.LinearLayoutProto.newBuilder((org.chromium.chrome.browser.autofill_assistant.proto.LinearLayoutProto) container_)
          .mergeFrom(value).buildPartial();
    } else {
      container_ = value;
    }
    containerCase_ = 2;
  }
  /**
   * <code>optional .autofill_assistant.LinearLayoutProto linear_layout = 2;</code>
   */
  private void clearLinearLayout() {
    if (containerCase_ == 2) {
      containerCase_ = 0;
      container_ = null;
    }
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < views_.size(); i++) {
      output.writeMessage(1, views_.get(i));
    }
    if (containerCase_ == 2) {
      output.writeMessage(2, (org.chromium.chrome.browser.autofill_assistant.proto.LinearLayoutProto) container_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < views_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, views_.get(i));
    }
    if (containerCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (org.chromium.chrome.browser.autofill_assistant.proto.LinearLayoutProto) container_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.ViewContainerProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ViewContainerProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ViewContainerProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ViewContainerProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ViewContainerProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ViewContainerProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ViewContainerProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ViewContainerProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ViewContainerProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ViewContainerProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.ViewContainerProto prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code autofill_assistant.ViewContainerProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.ViewContainerProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.ViewContainerProto)
      org.chromium.chrome.browser.autofill_assistant.proto.ViewContainerProtoOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.ViewContainerProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }

    public ContainerCase
        getContainerCase() {
      return instance.getContainerCase();
    }

    public Builder clearContainer() {
      copyOnWrite();
      instance.clearContainer();
      return this;
    }


    /**
     * <pre>
     * The list of views to add to this container.
     * </pre>
     *
     * <code>repeated .autofill_assistant.ViewProto views = 1;</code>
     */
    public java.util.List<org.chromium.chrome.browser.autofill_assistant.proto.ViewProto> getViewsList() {
      return java.util.Collections.unmodifiableList(
          instance.getViewsList());
    }
    /**
     * <pre>
     * The list of views to add to this container.
     * </pre>
     *
     * <code>repeated .autofill_assistant.ViewProto views = 1;</code>
     */
    public int getViewsCount() {
      return instance.getViewsCount();
    }/**
     * <pre>
     * The list of views to add to this container.
     * </pre>
     *
     * <code>repeated .autofill_assistant.ViewProto views = 1;</code>
     */
    public org.chromium.chrome.browser.autofill_assistant.proto.ViewProto getViews(int index) {
      return instance.getViews(index);
    }
    /**
     * <pre>
     * The list of views to add to this container.
     * </pre>
     *
     * <code>repeated .autofill_assistant.ViewProto views = 1;</code>
     */
    public Builder setViews(
        int index, org.chromium.chrome.browser.autofill_assistant.proto.ViewProto value) {
      copyOnWrite();
      instance.setViews(index, value);
      return this;
    }
    /**
     * <pre>
     * The list of views to add to this container.
     * </pre>
     *
     * <code>repeated .autofill_assistant.ViewProto views = 1;</code>
     */
    public Builder setViews(
        int index, org.chromium.chrome.browser.autofill_assistant.proto.ViewProto.Builder builderForValue) {
      copyOnWrite();
      instance.setViews(index, builderForValue);
      return this;
    }
    /**
     * <pre>
     * The list of views to add to this container.
     * </pre>
     *
     * <code>repeated .autofill_assistant.ViewProto views = 1;</code>
     */
    public Builder addViews(org.chromium.chrome.browser.autofill_assistant.proto.ViewProto value) {
      copyOnWrite();
      instance.addViews(value);
      return this;
    }
    /**
     * <pre>
     * The list of views to add to this container.
     * </pre>
     *
     * <code>repeated .autofill_assistant.ViewProto views = 1;</code>
     */
    public Builder addViews(
        int index, org.chromium.chrome.browser.autofill_assistant.proto.ViewProto value) {
      copyOnWrite();
      instance.addViews(index, value);
      return this;
    }
    /**
     * <pre>
     * The list of views to add to this container.
     * </pre>
     *
     * <code>repeated .autofill_assistant.ViewProto views = 1;</code>
     */
    public Builder addViews(
        org.chromium.chrome.browser.autofill_assistant.proto.ViewProto.Builder builderForValue) {
      copyOnWrite();
      instance.addViews(builderForValue);
      return this;
    }
    /**
     * <pre>
     * The list of views to add to this container.
     * </pre>
     *
     * <code>repeated .autofill_assistant.ViewProto views = 1;</code>
     */
    public Builder addViews(
        int index, org.chromium.chrome.browser.autofill_assistant.proto.ViewProto.Builder builderForValue) {
      copyOnWrite();
      instance.addViews(index, builderForValue);
      return this;
    }
    /**
     * <pre>
     * The list of views to add to this container.
     * </pre>
     *
     * <code>repeated .autofill_assistant.ViewProto views = 1;</code>
     */
    public Builder addAllViews(
        java.lang.Iterable<? extends org.chromium.chrome.browser.autofill_assistant.proto.ViewProto> values) {
      copyOnWrite();
      instance.addAllViews(values);
      return this;
    }
    /**
     * <pre>
     * The list of views to add to this container.
     * </pre>
     *
     * <code>repeated .autofill_assistant.ViewProto views = 1;</code>
     */
    public Builder clearViews() {
      copyOnWrite();
      instance.clearViews();
      return this;
    }
    /**
     * <pre>
     * The list of views to add to this container.
     * </pre>
     *
     * <code>repeated .autofill_assistant.ViewProto views = 1;</code>
     */
    public Builder removeViews(int index) {
      copyOnWrite();
      instance.removeViews(index);
      return this;
    }

    /**
     * <code>optional .autofill_assistant.LinearLayoutProto linear_layout = 2;</code>
     */
    public boolean hasLinearLayout() {
      return instance.hasLinearLayout();
    }
    /**
     * <code>optional .autofill_assistant.LinearLayoutProto linear_layout = 2;</code>
     */
    public org.chromium.chrome.browser.autofill_assistant.proto.LinearLayoutProto getLinearLayout() {
      return instance.getLinearLayout();
    }
    /**
     * <code>optional .autofill_assistant.LinearLayoutProto linear_layout = 2;</code>
     */
    public Builder setLinearLayout(org.chromium.chrome.browser.autofill_assistant.proto.LinearLayoutProto value) {
      copyOnWrite();
      instance.setLinearLayout(value);
      return this;
    }
    /**
     * <code>optional .autofill_assistant.LinearLayoutProto linear_layout = 2;</code>
     */
    public Builder setLinearLayout(
        org.chromium.chrome.browser.autofill_assistant.proto.LinearLayoutProto.Builder builderForValue) {
      copyOnWrite();
      instance.setLinearLayout(builderForValue);
      return this;
    }
    /**
     * <code>optional .autofill_assistant.LinearLayoutProto linear_layout = 2;</code>
     */
    public Builder mergeLinearLayout(org.chromium.chrome.browser.autofill_assistant.proto.LinearLayoutProto value) {
      copyOnWrite();
      instance.mergeLinearLayout(value);
      return this;
    }
    /**
     * <code>optional .autofill_assistant.LinearLayoutProto linear_layout = 2;</code>
     */
    public Builder clearLinearLayout() {
      copyOnWrite();
      instance.clearLinearLayout();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.ViewContainerProto)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.ViewContainerProto();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        views_.makeImmutable();
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        org.chromium.chrome.browser.autofill_assistant.proto.ViewContainerProto other = (org.chromium.chrome.browser.autofill_assistant.proto.ViewContainerProto) arg1;
        views_= visitor.visitList(views_, other.views_);
        switch (other.getContainerCase()) {
          case LINEAR_LAYOUT: {
            container_ = visitor.visitOneofMessage(
                containerCase_ == 2,
                container_,
                other.container_);
            break;
          }
          case CONTAINER_NOT_SET: {
            visitor.visitOneofNotSet(containerCase_ != 0);
            break;
          }
        }
        if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
            .INSTANCE) {
          if (other.containerCase_ != 0) {
            containerCase_ = other.containerCase_;
          }
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
                if (!views_.isModifiable()) {
                  views_ =
                      com.google.protobuf.GeneratedMessageLite.mutableCopy(views_);
                }
                views_.add(
                    input.readMessage(org.chromium.chrome.browser.autofill_assistant.proto.ViewProto.parser(), extensionRegistry));
                break;
              }
              case 18: {
                org.chromium.chrome.browser.autofill_assistant.proto.LinearLayoutProto.Builder subBuilder = null;
                if (containerCase_ == 2) {
                  subBuilder = ((org.chromium.chrome.browser.autofill_assistant.proto.LinearLayoutProto) container_).toBuilder();
                }
                container_ =
                     input.readMessage(org.chromium.chrome.browser.autofill_assistant.proto.LinearLayoutProto.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom((org.chromium.chrome.browser.autofill_assistant.proto.LinearLayoutProto) container_);
                  container_ = subBuilder.buildPartial();
                }
                containerCase_ = 2;
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
        if (PARSER == null) {    synchronized (org.chromium.chrome.browser.autofill_assistant.proto.ViewContainerProto.class) {
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


  // @@protoc_insertion_point(class_scope:autofill_assistant.ViewContainerProto)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.ViewContainerProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ViewContainerProto();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.ViewContainerProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ViewContainerProto> PARSER;

  public static com.google.protobuf.Parser<ViewContainerProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

