// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface SelectionInputProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.SelectionInputProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * An optional label shown above the different choices.
   * </pre>
   *
   * <code>optional string label = 1;</code>
   */
  boolean hasLabel();
  /**
   * <pre>
   * An optional label shown above the different choices.
   * </pre>
   *
   * <code>optional string label = 1;</code>
   */
  java.lang.String getLabel();
  /**
   * <pre>
   * An optional label shown above the different choices.
   * </pre>
   *
   * <code>optional string label = 1;</code>
   */
  com.google.protobuf.ByteString
      getLabelBytes();

  /**
   * <pre>
   * The choices to display.
   * </pre>
   *
   * <code>repeated .autofill_assistant.SelectionInputProto.Choice choices = 2;</code>
   */
  java.util.List<org.chromium.chrome.browser.autofill_assistant.proto.SelectionInputProto.Choice> 
      getChoicesList();
  /**
   * <pre>
   * The choices to display.
   * </pre>
   *
   * <code>repeated .autofill_assistant.SelectionInputProto.Choice choices = 2;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.SelectionInputProto.Choice getChoices(int index);
  /**
   * <pre>
   * The choices to display.
   * </pre>
   *
   * <code>repeated .autofill_assistant.SelectionInputProto.Choice choices = 2;</code>
   */
  int getChoicesCount();

  /**
   * <pre>
   * Whether the user will be allowed to select multiple choices. If false, each
   * choice will be displayed with a radio button. Otherwise, it will be
   * displayed with checkboxes.
   * </pre>
   *
   * <code>optional bool allow_multiple = 3 [default = false];</code>
   */
  boolean hasAllowMultiple();
  /**
   * <pre>
   * Whether the user will be allowed to select multiple choices. If false, each
   * choice will be displayed with a radio button. Otherwise, it will be
   * displayed with checkboxes.
   * </pre>
   *
   * <code>optional bool allow_multiple = 3 [default = false];</code>
   */
  boolean getAllowMultiple();

  /**
   * <pre>
   * The minimum number of choices that should be selected to consider this
   * input valid.
   * </pre>
   *
   * <code>optional int32 min_selected_choices = 4 [default = 1];</code>
   */
  boolean hasMinSelectedChoices();
  /**
   * <pre>
   * The minimum number of choices that should be selected to consider this
   * input valid.
   * </pre>
   *
   * <code>optional int32 min_selected_choices = 4 [default = 1];</code>
   */
  int getMinSelectedChoices();
}
