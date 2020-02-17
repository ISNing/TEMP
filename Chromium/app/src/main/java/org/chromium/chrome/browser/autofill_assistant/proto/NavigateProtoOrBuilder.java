// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface NavigateProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.NavigateProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Navigate to the given URL.
   * </pre>
   *
   * <code>optional string url = 1;</code>
   */
  boolean hasUrl();
  /**
   * <pre>
   * Navigate to the given URL.
   * </pre>
   *
   * <code>optional string url = 1;</code>
   */
  java.lang.String getUrl();
  /**
   * <pre>
   * Navigate to the given URL.
   * </pre>
   *
   * <code>optional string url = 1;</code>
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <pre>
   * Navigate backward in the history. Action will return PRECONDITION_FAILED
   * if it is not possible.
   * </pre>
   *
   * <code>optional bool go_backward = 2;</code>
   */
  boolean hasGoBackward();
  /**
   * <pre>
   * Navigate backward in the history. Action will return PRECONDITION_FAILED
   * if it is not possible.
   * </pre>
   *
   * <code>optional bool go_backward = 2;</code>
   */
  boolean getGoBackward();

  /**
   * <pre>
   * Navigate forward in the history. Action will return PRECONDITION_FAILED
   * if it is not possible.
   * </pre>
   *
   * <code>optional bool go_forward = 3;</code>
   */
  boolean hasGoForward();
  /**
   * <pre>
   * Navigate forward in the history. Action will return PRECONDITION_FAILED
   * if it is not possible.
   * </pre>
   *
   * <code>optional bool go_forward = 3;</code>
   */
  boolean getGoForward();

  public org.chromium.chrome.browser.autofill_assistant.proto.NavigateProto.ValueCase getValueCase();
}
