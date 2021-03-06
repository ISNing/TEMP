// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface TellProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.TellProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The message to show in the status bar. The behavior is now the following
   *  * If the field is set, the status bar is updated (explicitly setting an
   *    empty string clears the status bar).
   *  * If the field is not set, the status bar is not updated.
   * </pre>
   *
   * <code>optional string message = 1;</code>
   */
  boolean hasMessage();
  /**
   * <pre>
   * The message to show in the status bar. The behavior is now the following
   *  * If the field is set, the status bar is updated (explicitly setting an
   *    empty string clears the status bar).
   *  * If the field is not set, the status bar is not updated.
   * </pre>
   *
   * <code>optional string message = 1;</code>
   */
  java.lang.String getMessage();
  /**
   * <pre>
   * The message to show in the status bar. The behavior is now the following
   *  * If the field is set, the status bar is updated (explicitly setting an
   *    empty string clears the status bar).
   *  * If the field is not set, the status bar is not updated.
   * </pre>
   *
   * <code>optional string message = 1;</code>
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <pre>
   * Show the UI if it's not shown yet, such as when a script has been started
   * by a direct action.
   * </pre>
   *
   * <code>optional bool needs_ui = 2 [default = true];</code>
   */
  boolean hasNeedsUi();
  /**
   * <pre>
   * Show the UI if it's not shown yet, such as when a script has been started
   * by a direct action.
   * </pre>
   *
   * <code>optional bool needs_ui = 2 [default = true];</code>
   */
  boolean getNeedsUi();
}
