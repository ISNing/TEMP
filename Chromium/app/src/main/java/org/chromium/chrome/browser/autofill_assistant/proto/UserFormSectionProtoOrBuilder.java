// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface UserFormSectionProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.UserFormSectionProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>optional string title = 1;</code>
   */
  boolean hasTitle();
  /**
   * <code>optional string title = 1;</code>
   */
  java.lang.String getTitle();
  /**
   * <code>optional string title = 1;</code>
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>optional .autofill_assistant.StaticTextSectionProto static_text_section = 2;</code>
   */
  boolean hasStaticTextSection();
  /**
   * <code>optional .autofill_assistant.StaticTextSectionProto static_text_section = 2;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.StaticTextSectionProto getStaticTextSection();

  /**
   * <code>optional .autofill_assistant.TextInputSectionProto text_input_section = 3;</code>
   */
  boolean hasTextInputSection();
  /**
   * <code>optional .autofill_assistant.TextInputSectionProto text_input_section = 3;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.TextInputSectionProto getTextInputSection();

  public org.chromium.chrome.browser.autofill_assistant.proto.UserFormSectionProto.SectionCase getSectionCase();
}
