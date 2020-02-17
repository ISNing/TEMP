// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: generic_ui.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface ViewProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.ViewProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The unique identifier of the view.
   * </pre>
   *
   * <code>optional string identifier = 1;</code>
   */
  boolean hasIdentifier();
  /**
   * <pre>
   * The unique identifier of the view.
   * </pre>
   *
   * <code>optional string identifier = 1;</code>
   */
  java.lang.String getIdentifier();
  /**
   * <pre>
   * The unique identifier of the view.
   * </pre>
   *
   * <code>optional string identifier = 1;</code>
   */
  com.google.protobuf.ByteString
      getIdentifierBytes();

  /**
   * <pre>
   * Common view attributes, such as padding and background.
   * </pre>
   *
   * <code>optional .autofill_assistant.ViewAttributesProto attributes = 2;</code>
   */
  boolean hasAttributes();
  /**
   * <pre>
   * Common view attributes, such as padding and background.
   * </pre>
   *
   * <code>optional .autofill_assistant.ViewAttributesProto attributes = 2;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ViewAttributesProto getAttributes();

  /**
   * <pre>
   * Layout parameters such as width, height, and gravity.
   * </pre>
   *
   * <code>optional .autofill_assistant.ViewLayoutParamsProto layout_params = 3;</code>
   */
  boolean hasLayoutParams();
  /**
   * <pre>
   * Layout parameters such as width, height, and gravity.
   * </pre>
   *
   * <code>optional .autofill_assistant.ViewLayoutParamsProto layout_params = 3;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ViewLayoutParamsProto getLayoutParams();

  /**
   * <code>optional .autofill_assistant.ViewContainerProto view_container = 4;</code>
   */
  boolean hasViewContainer();
  /**
   * <code>optional .autofill_assistant.ViewContainerProto view_container = 4;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ViewContainerProto getViewContainer();

  /**
   * <pre>
   * A regular read-only text view.
   * </pre>
   *
   * <code>optional .autofill_assistant.TextViewProto text_view = 5;</code>
   */
  boolean hasTextView();
  /**
   * <pre>
   * A regular read-only text view.
   * </pre>
   *
   * <code>optional .autofill_assistant.TextViewProto text_view = 5;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.TextViewProto getTextView();

  /**
   * <pre>
   * A horizontal view divider.
   * </pre>
   *
   * <code>optional .autofill_assistant.DividerViewProto divider_view = 6;</code>
   */
  boolean hasDividerView();
  /**
   * <pre>
   * A horizontal view divider.
   * </pre>
   *
   * <code>optional .autofill_assistant.DividerViewProto divider_view = 6;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.DividerViewProto getDividerView();

  /**
   * <pre>
   * A regular image view.
   * </pre>
   *
   * <code>optional .autofill_assistant.ImageViewProto image_view = 7;</code>
   */
  boolean hasImageView();
  /**
   * <pre>
   * A regular image view.
   * </pre>
   *
   * <code>optional .autofill_assistant.ImageViewProto image_view = 7;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ImageViewProto getImageView();

  public org.chromium.chrome.browser.autofill_assistant.proto.ViewProto.ViewCase getViewCase();
}
