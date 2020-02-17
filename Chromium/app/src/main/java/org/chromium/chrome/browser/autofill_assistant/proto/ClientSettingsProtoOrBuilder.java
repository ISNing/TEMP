// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface ClientSettingsProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.ClientSettingsProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Time between two periodic script precondition checks.
   * </pre>
   *
   * <code>optional int32 periodic_script_check_interval_ms = 1;</code>
   */
  boolean hasPeriodicScriptCheckIntervalMs();
  /**
   * <pre>
   * Time between two periodic script precondition checks.
   * </pre>
   *
   * <code>optional int32 periodic_script_check_interval_ms = 1;</code>
   */
  int getPeriodicScriptCheckIntervalMs();

  /**
   * <pre>
   * Time between two element checks in the script executor.
   * </pre>
   *
   * <code>optional int32 periodic_element_check_interval_ms = 2;</code>
   */
  boolean hasPeriodicElementCheckIntervalMs();
  /**
   * <pre>
   * Time between two element checks in the script executor.
   * </pre>
   *
   * <code>optional int32 periodic_element_check_interval_ms = 2;</code>
   */
  int getPeriodicElementCheckIntervalMs();

  /**
   * <pre>
   * Run that many periodic checks before giving up unless something happens to
   * wake it up, such as the user touching the screen.
   * </pre>
   *
   * <code>optional int32 periodic_script_check_count = 3;</code>
   */
  boolean hasPeriodicScriptCheckCount();
  /**
   * <pre>
   * Run that many periodic checks before giving up unless something happens to
   * wake it up, such as the user touching the screen.
   * </pre>
   *
   * <code>optional int32 periodic_script_check_count = 3;</code>
   */
  int getPeriodicScriptCheckCount();

  /**
   * <pre>
   * Time between two element position refreshes, when displaying highlighted
   * areas in prompt state.
   * </pre>
   *
   * <code>optional int32 element_position_update_interval_ms = 4;</code>
   */
  boolean hasElementPositionUpdateIntervalMs();
  /**
   * <pre>
   * Time between two element position refreshes, when displaying highlighted
   * areas in prompt state.
   * </pre>
   *
   * <code>optional int32 element_position_update_interval_ms = 4;</code>
   */
  int getElementPositionUpdateIntervalMs();

  /**
   * <pre>
   * Maximum amount of time normal actions should implicitly wait for a selector
   * to show up.
   * </pre>
   *
   * <code>optional int32 short_wait_for_element_deadline_ms = 5;</code>
   */
  boolean hasShortWaitForElementDeadlineMs();
  /**
   * <pre>
   * Maximum amount of time normal actions should implicitly wait for a selector
   * to show up.
   * </pre>
   *
   * <code>optional int32 short_wait_for_element_deadline_ms = 5;</code>
   */
  int getShortWaitForElementDeadlineMs();

  /**
   * <pre>
   * Time to wait between two checks of the box model, when waiting for an
   * element to become stable, such as before clicking.
   * </pre>
   *
   * <code>optional int32 box_model_check_interval_ms = 6;</code>
   */
  boolean hasBoxModelCheckIntervalMs();
  /**
   * <pre>
   * Time to wait between two checks of the box model, when waiting for an
   * element to become stable, such as before clicking.
   * </pre>
   *
   * <code>optional int32 box_model_check_interval_ms = 6;</code>
   */
  int getBoxModelCheckIntervalMs();

  /**
   * <pre>
   * Maximum number of checks to run while waiting for the element position to
   * become stable.
   * </pre>
   *
   * <code>optional int32 box_model_check_count = 7;</code>
   */
  boolean hasBoxModelCheckCount();
  /**
   * <pre>
   * Maximum number of checks to run while waiting for the element position to
   * become stable.
   * </pre>
   *
   * <code>optional int32 box_model_check_count = 7;</code>
   */
  int getBoxModelCheckCount();

  /**
   * <pre>
   * Time to wait between two checks of the document state, when waiting for the
   * document to become ready.
   * </pre>
   *
   * <code>optional int32 document_ready_check_interval_ms = 8;</code>
   */
  boolean hasDocumentReadyCheckIntervalMs();
  /**
   * <pre>
   * Time to wait between two checks of the document state, when waiting for the
   * document to become ready.
   * </pre>
   *
   * <code>optional int32 document_ready_check_interval_ms = 8;</code>
   */
  int getDocumentReadyCheckIntervalMs();

  /**
   * <pre>
   * Maximum number of checks to run while waiting for the document to become
   * ready.
   * </pre>
   *
   * <code>optional int32 document_ready_check_count = 9;</code>
   */
  boolean hasDocumentReadyCheckCount();
  /**
   * <pre>
   * Maximum number of checks to run while waiting for the document to become
   * ready.
   * </pre>
   *
   * <code>optional int32 document_ready_check_count = 9;</code>
   */
  int getDocumentReadyCheckCount();

  /**
   * <pre>
   * How much time to give users to tap undo when they tap a cancel button.
   * </pre>
   *
   * <code>optional int32 cancel_delay_ms = 12;</code>
   */
  boolean hasCancelDelayMs();
  /**
   * <pre>
   * How much time to give users to tap undo when they tap a cancel button.
   * </pre>
   *
   * <code>optional int32 cancel_delay_ms = 12;</code>
   */
  int getCancelDelayMs();

  /**
   * <pre>
   * If the user taps the overlay that many time within |tap_duration| turn the
   * UI off and give them |tap_shutdown_delay| to undo. If 0, unexpected taps
   * are ignored.
   * </pre>
   *
   * <code>optional int32 tap_count = 13;</code>
   */
  boolean hasTapCount();
  /**
   * <pre>
   * If the user taps the overlay that many time within |tap_duration| turn the
   * UI off and give them |tap_shutdown_delay| to undo. If 0, unexpected taps
   * are ignored.
   * </pre>
   *
   * <code>optional int32 tap_count = 13;</code>
   */
  int getTapCount();

  /**
   * <pre>
   * Reset the unexpected tap counter after that time.
   * </pre>
   *
   * <code>optional int32 tap_tracking_duration_ms = 14;</code>
   */
  boolean hasTapTrackingDurationMs();
  /**
   * <pre>
   * Reset the unexpected tap counter after that time.
   * </pre>
   *
   * <code>optional int32 tap_tracking_duration_ms = 14;</code>
   */
  int getTapTrackingDurationMs();

  /**
   * <pre>
   * How much time to give users to tap undo when after |tap_count| unexpected
   * taps where
   * </pre>
   *
   * <code>optional int32 tap_shutdown_delay_ms = 15;</code>
   */
  boolean hasTapShutdownDelayMs();
  /**
   * <pre>
   * How much time to give users to tap undo when after |tap_count| unexpected
   * taps where
   * </pre>
   *
   * <code>optional int32 tap_shutdown_delay_ms = 15;</code>
   */
  int getTapShutdownDelayMs();

  /**
   * <pre>
   * Optional image drawn on top of overlays.
   * </pre>
   *
   * <code>optional .autofill_assistant.OverlayImageProto overlay_image = 16;</code>
   */
  boolean hasOverlayImage();
  /**
   * <pre>
   * Optional image drawn on top of overlays.
   * </pre>
   *
   * <code>optional .autofill_assistant.OverlayImageProto overlay_image = 16;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.OverlayImageProto getOverlayImage();
}