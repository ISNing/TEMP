// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface ConfigureBottomSheetProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.ConfigureBottomSheetProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Whether the viewport should be resized. Resizing the viewport is an
   * expensive operation, so toggling the resize on/off should be done
   * cautiously.
   * </pre>
   *
   * <code>optional .autofill_assistant.ConfigureBottomSheetProto.ViewportResizing viewport_resizing = 1;</code>
   */
  boolean hasViewportResizing();
  /**
   * <pre>
   * Whether the viewport should be resized. Resizing the viewport is an
   * expensive operation, so toggling the resize on/off should be done
   * cautiously.
   * </pre>
   *
   * <code>optional .autofill_assistant.ConfigureBottomSheetProto.ViewportResizing viewport_resizing = 1;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ConfigureBottomSheetProto.ViewportResizing getViewportResizing();

  /**
   * <pre>
   * Set the peek mode. This will change the peek height of the sheet. If
   * viewport_resizing is set to RESIZE_LAYOUT_VIEWPORT or was set by a previous
   * ConfigureBottomSheet action, the viewport will be resized to match the new
   * peek height.
   * </pre>
   *
   * <code>optional .autofill_assistant.ConfigureBottomSheetProto.PeekMode peek_mode = 2;</code>
   */
  boolean hasPeekMode();
  /**
   * <pre>
   * Set the peek mode. This will change the peek height of the sheet. If
   * viewport_resizing is set to RESIZE_LAYOUT_VIEWPORT or was set by a previous
   * ConfigureBottomSheet action, the viewport will be resized to match the new
   * peek height.
   * </pre>
   *
   * <code>optional .autofill_assistant.ConfigureBottomSheetProto.PeekMode peek_mode = 2;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ConfigureBottomSheetProto.PeekMode getPeekMode();

  /**
   * <pre>
   * Maximum time to wait for the window to resize before continuing with the
   * script. If 0 or unset, the action doesn't wait.
   * </pre>
   *
   * <code>optional int32 resize_timeout_ms = 3;</code>
   */
  boolean hasResizeTimeoutMs();
  /**
   * <pre>
   * Maximum time to wait for the window to resize before continuing with the
   * script. If 0 or unset, the action doesn't wait.
   * </pre>
   *
   * <code>optional int32 resize_timeout_ms = 3;</code>
   */
  int getResizeTimeoutMs();
}
