// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface FormInputProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.FormInputProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>optional .autofill_assistant.CounterInputProto counter = 1;</code>
   */
  boolean hasCounter();
  /**
   * <code>optional .autofill_assistant.CounterInputProto counter = 1;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.CounterInputProto getCounter();

  /**
   * <code>optional .autofill_assistant.SelectionInputProto selection = 2;</code>
   */
  boolean hasSelection();
  /**
   * <code>optional .autofill_assistant.SelectionInputProto selection = 2;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.SelectionInputProto getSelection();

  public org.chromium.chrome.browser.autofill_assistant.proto.FormInputProto.InputTypeCase getInputTypeCase();
}