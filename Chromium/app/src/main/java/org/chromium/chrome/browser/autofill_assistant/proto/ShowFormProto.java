// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * <pre>
 * Allow scripts to display a form with multiple inputs.
 * </pre>
 *
 * Protobuf type {@code autofill_assistant.ShowFormProto}
 */
public  final class ShowFormProto extends
    com.google.protobuf.GeneratedMessageLite<
        ShowFormProto, ShowFormProto.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.ShowFormProto)
    ShowFormProtoOrBuilder {
  private ShowFormProto() {
  }
  private int bitField0_;
  public static final int FORM_FIELD_NUMBER = 1;
  private org.chromium.chrome.browser.autofill_assistant.proto.FormProto form_;
  /**
   * <pre>
   * The form to display.
   * </pre>
   *
   * <code>optional .autofill_assistant.FormProto form = 1;</code>
   */
  public boolean hasForm() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <pre>
   * The form to display.
   * </pre>
   *
   * <code>optional .autofill_assistant.FormProto form = 1;</code>
   */
  public org.chromium.chrome.browser.autofill_assistant.proto.FormProto getForm() {
    return form_ == null ? org.chromium.chrome.browser.autofill_assistant.proto.FormProto.getDefaultInstance() : form_;
  }
  /**
   * <pre>
   * The form to display.
   * </pre>
   *
   * <code>optional .autofill_assistant.FormProto form = 1;</code>
   */
  private void setForm(org.chromium.chrome.browser.autofill_assistant.proto.FormProto value) {
    if (value == null) {
      throw new NullPointerException();
    }
    form_ = value;
    bitField0_ |= 0x00000001;
    }
  /**
   * <pre>
   * The form to display.
   * </pre>
   *
   * <code>optional .autofill_assistant.FormProto form = 1;</code>
   */
  private void setForm(
      org.chromium.chrome.browser.autofill_assistant.proto.FormProto.Builder builderForValue) {
    form_ = builderForValue.build();
    bitField0_ |= 0x00000001;
  }
  /**
   * <pre>
   * The form to display.
   * </pre>
   *
   * <code>optional .autofill_assistant.FormProto form = 1;</code>
   */
  private void mergeForm(org.chromium.chrome.browser.autofill_assistant.proto.FormProto value) {
    if (form_ != null &&
        form_ != org.chromium.chrome.browser.autofill_assistant.proto.FormProto.getDefaultInstance()) {
      form_ =
        org.chromium.chrome.browser.autofill_assistant.proto.FormProto.newBuilder(form_).mergeFrom(value).buildPartial();
    } else {
      form_ = value;
    }
    bitField0_ |= 0x00000001;
  }
  /**
   * <pre>
   * The form to display.
   * </pre>
   *
   * <code>optional .autofill_assistant.FormProto form = 1;</code>
   */
  private void clearForm() {  form_ = null;
    bitField0_ = (bitField0_ & ~0x00000001);
  }

  public static final int CHIP_FIELD_NUMBER = 2;
  private org.chromium.chrome.browser.autofill_assistant.proto.ChipProto chip_;
  /**
   * <pre>
   * The chip to display below the form. This chip will be enabled only if all
   * form inputs are valid.
   * </pre>
   *
   * <code>optional .autofill_assistant.ChipProto chip = 2;</code>
   */
  public boolean hasChip() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <pre>
   * The chip to display below the form. This chip will be enabled only if all
   * form inputs are valid.
   * </pre>
   *
   * <code>optional .autofill_assistant.ChipProto chip = 2;</code>
   */
  public org.chromium.chrome.browser.autofill_assistant.proto.ChipProto getChip() {
    return chip_ == null ? org.chromium.chrome.browser.autofill_assistant.proto.ChipProto.getDefaultInstance() : chip_;
  }
  /**
   * <pre>
   * The chip to display below the form. This chip will be enabled only if all
   * form inputs are valid.
   * </pre>
   *
   * <code>optional .autofill_assistant.ChipProto chip = 2;</code>
   */
  private void setChip(org.chromium.chrome.browser.autofill_assistant.proto.ChipProto value) {
    if (value == null) {
      throw new NullPointerException();
    }
    chip_ = value;
    bitField0_ |= 0x00000002;
    }
  /**
   * <pre>
   * The chip to display below the form. This chip will be enabled only if all
   * form inputs are valid.
   * </pre>
   *
   * <code>optional .autofill_assistant.ChipProto chip = 2;</code>
   */
  private void setChip(
      org.chromium.chrome.browser.autofill_assistant.proto.ChipProto.Builder builderForValue) {
    chip_ = builderForValue.build();
    bitField0_ |= 0x00000002;
  }
  /**
   * <pre>
   * The chip to display below the form. This chip will be enabled only if all
   * form inputs are valid.
   * </pre>
   *
   * <code>optional .autofill_assistant.ChipProto chip = 2;</code>
   */
  private void mergeChip(org.chromium.chrome.browser.autofill_assistant.proto.ChipProto value) {
    if (chip_ != null &&
        chip_ != org.chromium.chrome.browser.autofill_assistant.proto.ChipProto.getDefaultInstance()) {
      chip_ =
        org.chromium.chrome.browser.autofill_assistant.proto.ChipProto.newBuilder(chip_).mergeFrom(value).buildPartial();
    } else {
      chip_ = value;
    }
    bitField0_ |= 0x00000002;
  }
  /**
   * <pre>
   * The chip to display below the form. This chip will be enabled only if all
   * form inputs are valid.
   * </pre>
   *
   * <code>optional .autofill_assistant.ChipProto chip = 2;</code>
   */
  private void clearChip() {  chip_ = null;
    bitField0_ = (bitField0_ & ~0x00000002);
  }

  public static final int DIRECT_ACTION_FIELD_NUMBER = 3;
  private org.chromium.chrome.browser.autofill_assistant.proto.DirectActionProto directAction_;
  /**
   * <pre>
   * Optionally allow confirming the prompt using given direct actions.
   * </pre>
   *
   * <code>optional .autofill_assistant.DirectActionProto direct_action = 3;</code>
   */
  public boolean hasDirectAction() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <pre>
   * Optionally allow confirming the prompt using given direct actions.
   * </pre>
   *
   * <code>optional .autofill_assistant.DirectActionProto direct_action = 3;</code>
   */
  public org.chromium.chrome.browser.autofill_assistant.proto.DirectActionProto getDirectAction() {
    return directAction_ == null ? org.chromium.chrome.browser.autofill_assistant.proto.DirectActionProto.getDefaultInstance() : directAction_;
  }
  /**
   * <pre>
   * Optionally allow confirming the prompt using given direct actions.
   * </pre>
   *
   * <code>optional .autofill_assistant.DirectActionProto direct_action = 3;</code>
   */
  private void setDirectAction(org.chromium.chrome.browser.autofill_assistant.proto.DirectActionProto value) {
    if (value == null) {
      throw new NullPointerException();
    }
    directAction_ = value;
    bitField0_ |= 0x00000004;
    }
  /**
   * <pre>
   * Optionally allow confirming the prompt using given direct actions.
   * </pre>
   *
   * <code>optional .autofill_assistant.DirectActionProto direct_action = 3;</code>
   */
  private void setDirectAction(
      org.chromium.chrome.browser.autofill_assistant.proto.DirectActionProto.Builder builderForValue) {
    directAction_ = builderForValue.build();
    bitField0_ |= 0x00000004;
  }
  /**
   * <pre>
   * Optionally allow confirming the prompt using given direct actions.
   * </pre>
   *
   * <code>optional .autofill_assistant.DirectActionProto direct_action = 3;</code>
   */
  private void mergeDirectAction(org.chromium.chrome.browser.autofill_assistant.proto.DirectActionProto value) {
    if (directAction_ != null &&
        directAction_ != org.chromium.chrome.browser.autofill_assistant.proto.DirectActionProto.getDefaultInstance()) {
      directAction_ =
        org.chromium.chrome.browser.autofill_assistant.proto.DirectActionProto.newBuilder(directAction_).mergeFrom(value).buildPartial();
    } else {
      directAction_ = value;
    }
    bitField0_ |= 0x00000004;
  }
  /**
   * <pre>
   * Optionally allow confirming the prompt using given direct actions.
   * </pre>
   *
   * <code>optional .autofill_assistant.DirectActionProto direct_action = 3;</code>
   */
  private void clearDirectAction() {  directAction_ = null;
    bitField0_ = (bitField0_ & ~0x00000004);
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeMessage(1, getForm());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeMessage(2, getChip());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeMessage(3, getDirectAction());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getForm());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getChip());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getDirectAction());
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowFormProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowFormProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowFormProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowFormProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowFormProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowFormProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowFormProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowFormProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowFormProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowFormProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.ShowFormProto prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * Allow scripts to display a form with multiple inputs.
   * </pre>
   *
   * Protobuf type {@code autofill_assistant.ShowFormProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.ShowFormProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.ShowFormProto)
      org.chromium.chrome.browser.autofill_assistant.proto.ShowFormProtoOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.ShowFormProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The form to display.
     * </pre>
     *
     * <code>optional .autofill_assistant.FormProto form = 1;</code>
     */
    public boolean hasForm() {
      return instance.hasForm();
    }
    /**
     * <pre>
     * The form to display.
     * </pre>
     *
     * <code>optional .autofill_assistant.FormProto form = 1;</code>
     */
    public org.chromium.chrome.browser.autofill_assistant.proto.FormProto getForm() {
      return instance.getForm();
    }
    /**
     * <pre>
     * The form to display.
     * </pre>
     *
     * <code>optional .autofill_assistant.FormProto form = 1;</code>
     */
    public Builder setForm(org.chromium.chrome.browser.autofill_assistant.proto.FormProto value) {
      copyOnWrite();
      instance.setForm(value);
      return this;
      }
    /**
     * <pre>
     * The form to display.
     * </pre>
     *
     * <code>optional .autofill_assistant.FormProto form = 1;</code>
     */
    public Builder setForm(
        org.chromium.chrome.browser.autofill_assistant.proto.FormProto.Builder builderForValue) {
      copyOnWrite();
      instance.setForm(builderForValue);
      return this;
    }
    /**
     * <pre>
     * The form to display.
     * </pre>
     *
     * <code>optional .autofill_assistant.FormProto form = 1;</code>
     */
    public Builder mergeForm(org.chromium.chrome.browser.autofill_assistant.proto.FormProto value) {
      copyOnWrite();
      instance.mergeForm(value);
      return this;
    }
    /**
     * <pre>
     * The form to display.
     * </pre>
     *
     * <code>optional .autofill_assistant.FormProto form = 1;</code>
     */
    public Builder clearForm() {  copyOnWrite();
      instance.clearForm();
      return this;
    }

    /**
     * <pre>
     * The chip to display below the form. This chip will be enabled only if all
     * form inputs are valid.
     * </pre>
     *
     * <code>optional .autofill_assistant.ChipProto chip = 2;</code>
     */
    public boolean hasChip() {
      return instance.hasChip();
    }
    /**
     * <pre>
     * The chip to display below the form. This chip will be enabled only if all
     * form inputs are valid.
     * </pre>
     *
     * <code>optional .autofill_assistant.ChipProto chip = 2;</code>
     */
    public org.chromium.chrome.browser.autofill_assistant.proto.ChipProto getChip() {
      return instance.getChip();
    }
    /**
     * <pre>
     * The chip to display below the form. This chip will be enabled only if all
     * form inputs are valid.
     * </pre>
     *
     * <code>optional .autofill_assistant.ChipProto chip = 2;</code>
     */
    public Builder setChip(org.chromium.chrome.browser.autofill_assistant.proto.ChipProto value) {
      copyOnWrite();
      instance.setChip(value);
      return this;
      }
    /**
     * <pre>
     * The chip to display below the form. This chip will be enabled only if all
     * form inputs are valid.
     * </pre>
     *
     * <code>optional .autofill_assistant.ChipProto chip = 2;</code>
     */
    public Builder setChip(
        org.chromium.chrome.browser.autofill_assistant.proto.ChipProto.Builder builderForValue) {
      copyOnWrite();
      instance.setChip(builderForValue);
      return this;
    }
    /**
     * <pre>
     * The chip to display below the form. This chip will be enabled only if all
     * form inputs are valid.
     * </pre>
     *
     * <code>optional .autofill_assistant.ChipProto chip = 2;</code>
     */
    public Builder mergeChip(org.chromium.chrome.browser.autofill_assistant.proto.ChipProto value) {
      copyOnWrite();
      instance.mergeChip(value);
      return this;
    }
    /**
     * <pre>
     * The chip to display below the form. This chip will be enabled only if all
     * form inputs are valid.
     * </pre>
     *
     * <code>optional .autofill_assistant.ChipProto chip = 2;</code>
     */
    public Builder clearChip() {  copyOnWrite();
      instance.clearChip();
      return this;
    }

    /**
     * <pre>
     * Optionally allow confirming the prompt using given direct actions.
     * </pre>
     *
     * <code>optional .autofill_assistant.DirectActionProto direct_action = 3;</code>
     */
    public boolean hasDirectAction() {
      return instance.hasDirectAction();
    }
    /**
     * <pre>
     * Optionally allow confirming the prompt using given direct actions.
     * </pre>
     *
     * <code>optional .autofill_assistant.DirectActionProto direct_action = 3;</code>
     */
    public org.chromium.chrome.browser.autofill_assistant.proto.DirectActionProto getDirectAction() {
      return instance.getDirectAction();
    }
    /**
     * <pre>
     * Optionally allow confirming the prompt using given direct actions.
     * </pre>
     *
     * <code>optional .autofill_assistant.DirectActionProto direct_action = 3;</code>
     */
    public Builder setDirectAction(org.chromium.chrome.browser.autofill_assistant.proto.DirectActionProto value) {
      copyOnWrite();
      instance.setDirectAction(value);
      return this;
      }
    /**
     * <pre>
     * Optionally allow confirming the prompt using given direct actions.
     * </pre>
     *
     * <code>optional .autofill_assistant.DirectActionProto direct_action = 3;</code>
     */
    public Builder setDirectAction(
        org.chromium.chrome.browser.autofill_assistant.proto.DirectActionProto.Builder builderForValue) {
      copyOnWrite();
      instance.setDirectAction(builderForValue);
      return this;
    }
    /**
     * <pre>
     * Optionally allow confirming the prompt using given direct actions.
     * </pre>
     *
     * <code>optional .autofill_assistant.DirectActionProto direct_action = 3;</code>
     */
    public Builder mergeDirectAction(org.chromium.chrome.browser.autofill_assistant.proto.DirectActionProto value) {
      copyOnWrite();
      instance.mergeDirectAction(value);
      return this;
    }
    /**
     * <pre>
     * Optionally allow confirming the prompt using given direct actions.
     * </pre>
     *
     * <code>optional .autofill_assistant.DirectActionProto direct_action = 3;</code>
     */
    public Builder clearDirectAction() {  copyOnWrite();
      instance.clearDirectAction();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.ShowFormProto)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.ShowFormProto();
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
        org.chromium.chrome.browser.autofill_assistant.proto.ShowFormProto other = (org.chromium.chrome.browser.autofill_assistant.proto.ShowFormProto) arg1;
        form_ = visitor.visitMessage(form_, other.form_);
        chip_ = visitor.visitMessage(chip_, other.chip_);
        directAction_ = visitor.visitMessage(directAction_, other.directAction_);
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
                org.chromium.chrome.browser.autofill_assistant.proto.FormProto.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = form_.toBuilder();
                }
                form_ = input.readMessage(org.chromium.chrome.browser.autofill_assistant.proto.FormProto.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(form_);
                  form_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
              case 18: {
                org.chromium.chrome.browser.autofill_assistant.proto.ChipProto.Builder subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = chip_.toBuilder();
                }
                chip_ = input.readMessage(org.chromium.chrome.browser.autofill_assistant.proto.ChipProto.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(chip_);
                  chip_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
              case 26: {
                org.chromium.chrome.browser.autofill_assistant.proto.DirectActionProto.Builder subBuilder = null;
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                  subBuilder = directAction_.toBuilder();
                }
                directAction_ = input.readMessage(org.chromium.chrome.browser.autofill_assistant.proto.DirectActionProto.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(directAction_);
                  directAction_ = subBuilder.buildPartial();
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
        if (PARSER == null) {    synchronized (org.chromium.chrome.browser.autofill_assistant.proto.ShowFormProto.class) {
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


  // @@protoc_insertion_point(class_scope:autofill_assistant.ShowFormProto)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.ShowFormProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ShowFormProto();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowFormProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ShowFormProto> PARSER;

  public static com.google.protobuf.Parser<ShowFormProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

