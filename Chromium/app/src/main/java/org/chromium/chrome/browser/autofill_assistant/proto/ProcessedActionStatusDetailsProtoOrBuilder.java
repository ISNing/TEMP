// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface ProcessedActionStatusDetailsProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.ProcessedActionStatusDetailsProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * More information included for unexpected errors.
   * Only set for action whose status are OTHER_ACTION_STATUS or
   * UNEXPECTED_JS_ERROR.
   * </pre>
   *
   * <code>optional .autofill_assistant.UnexpectedErrorInfoProto unexpected_error_info = 1;</code>
   */
  boolean hasUnexpectedErrorInfo();
  /**
   * <pre>
   * More information included for unexpected errors.
   * Only set for action whose status are OTHER_ACTION_STATUS or
   * UNEXPECTED_JS_ERROR.
   * </pre>
   *
   * <code>optional .autofill_assistant.UnexpectedErrorInfoProto unexpected_error_info = 1;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.UnexpectedErrorInfoProto getUnexpectedErrorInfo();

  /**
   * <pre>
   * In some case, such as USER_ABORTED_ACTION and NAVIGATION_ERROR, the status
   * reported by the action is overridden after the action failed, to report a
   * more appropriate error. When that happens, this field contains the original
   * status, to help debugging.
   * </pre>
   *
   * <code>optional .autofill_assistant.ProcessedActionStatusProto original_status = 2;</code>
   */
  boolean hasOriginalStatus();
  /**
   * <pre>
   * In some case, such as USER_ABORTED_ACTION and NAVIGATION_ERROR, the status
   * reported by the action is overridden after the action failed, to report a
   * more appropriate error. When that happens, this field contains the original
   * status, to help debugging.
   * </pre>
   *
   * <code>optional .autofill_assistant.ProcessedActionStatusProto original_status = 2;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionStatusProto getOriginalStatus();

  /**
   * <pre>
   * More information included for autofill related errors.
   * </pre>
   *
   * <code>optional .autofill_assistant.AutofillErrorInfoProto autofill_error_info = 3;</code>
   */
  boolean hasAutofillErrorInfo();
  /**
   * <pre>
   * More information included for autofill related errors.
   * </pre>
   *
   * <code>optional .autofill_assistant.AutofillErrorInfoProto autofill_error_info = 3;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.AutofillErrorInfoProto getAutofillErrorInfo();
}
