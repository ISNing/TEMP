// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface OverlayImageProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.OverlayImageProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The image to display. If set, |image_size| is mandatory.
   * </pre>
   *
   * <code>optional string image_url = 1;</code>
   */
  boolean hasImageUrl();
  /**
   * <pre>
   * The image to display. If set, |image_size| is mandatory.
   * </pre>
   *
   * <code>optional string image_url = 1;</code>
   */
  java.lang.String getImageUrl();
  /**
   * <pre>
   * The image to display. If set, |image_size| is mandatory.
   * </pre>
   *
   * <code>optional string image_url = 1;</code>
   */
  com.google.protobuf.ByteString
      getImageUrlBytes();

  /**
   * <pre>
   * The size of the image to display.
   * </pre>
   *
   * <code>optional .autofill_assistant.ClientDimensionProto image_size = 2;</code>
   */
  boolean hasImageSize();
  /**
   * <pre>
   * The size of the image to display.
   * </pre>
   *
   * <code>optional .autofill_assistant.ClientDimensionProto image_size = 2;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ClientDimensionProto getImageSize();

  /**
   * <pre>
   * The margin between the top of the page (anchor) and the image.
   * </pre>
   *
   * <code>optional .autofill_assistant.ClientDimensionProto image_top_margin = 3;</code>
   */
  boolean hasImageTopMargin();
  /**
   * <pre>
   * The margin between the top of the page (anchor) and the image.
   * </pre>
   *
   * <code>optional .autofill_assistant.ClientDimensionProto image_top_margin = 3;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ClientDimensionProto getImageTopMargin();

  /**
   * <pre>
   * The margin between the bottom of the image and the baseline of the text.
   * </pre>
   *
   * <code>optional .autofill_assistant.ClientDimensionProto image_bottom_margin = 4;</code>
   */
  boolean hasImageBottomMargin();
  /**
   * <pre>
   * The margin between the bottom of the image and the baseline of the text.
   * </pre>
   *
   * <code>optional .autofill_assistant.ClientDimensionProto image_bottom_margin = 4;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ClientDimensionProto getImageBottomMargin();

  /**
   * <pre>
   * The text to display beneath the image. If set, |text_color| and |text_size|
   * are mandatory.
   * </pre>
   *
   * <code>optional string text = 5;</code>
   */
  boolean hasText();
  /**
   * <pre>
   * The text to display beneath the image. If set, |text_color| and |text_size|
   * are mandatory.
   * </pre>
   *
   * <code>optional string text = 5;</code>
   */
  java.lang.String getText();
  /**
   * <pre>
   * The text to display beneath the image. If set, |text_color| and |text_size|
   * are mandatory.
   * </pre>
   *
   * <code>optional string text = 5;</code>
   */
  com.google.protobuf.ByteString
      getTextBytes();

  /**
   * <pre>
   * Supported formats: #RRGGBB or #AARRGGBB.
   * </pre>
   *
   * <code>optional string text_color = 6;</code>
   */
  boolean hasTextColor();
  /**
   * <pre>
   * Supported formats: #RRGGBB or #AARRGGBB.
   * </pre>
   *
   * <code>optional string text_color = 6;</code>
   */
  java.lang.String getTextColor();
  /**
   * <pre>
   * Supported formats: #RRGGBB or #AARRGGBB.
   * </pre>
   *
   * <code>optional string text_color = 6;</code>
   */
  com.google.protobuf.ByteString
      getTextColorBytes();

  /**
   * <pre>
   * The size of the text to display.
   * </pre>
   *
   * <code>optional .autofill_assistant.ClientDimensionProto text_size = 7;</code>
   */
  boolean hasTextSize();
  /**
   * <pre>
   * The size of the text to display.
   * </pre>
   *
   * <code>optional .autofill_assistant.ClientDimensionProto text_size = 7;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ClientDimensionProto getTextSize();
}
