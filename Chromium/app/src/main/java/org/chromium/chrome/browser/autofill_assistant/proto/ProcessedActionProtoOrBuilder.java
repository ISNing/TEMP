// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface ProcessedActionProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.ProcessedActionProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The action that was processed.
   * </pre>
   *
   * <code>optional .autofill_assistant.ActionProto action = 1;</code>
   */
  boolean hasAction();
  /**
   * <pre>
   * The action that was processed.
   * </pre>
   *
   * <code>optional .autofill_assistant.ActionProto action = 1;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ActionProto getAction();

  /**
   * <code>optional .autofill_assistant.ProcessedActionStatusProto status = 2;</code>
   */
  boolean hasStatus();
  /**
   * <code>optional .autofill_assistant.ProcessedActionStatusProto status = 2;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionStatusProto getStatus();

  /**
   * <code>optional .autofill_assistant.ProcessedActionStatusDetailsProto status_details = 19;</code>
   */
  boolean hasStatusDetails();
  /**
   * <code>optional .autofill_assistant.ProcessedActionStatusDetailsProto status_details = 19;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionStatusDetailsProto getStatusDetails();

  /**
   * <code>optional .autofill_assistant.PromptProto.Choice prompt_choice = 5;</code>
   */
  boolean hasPromptChoice();
  /**
   * <code>optional .autofill_assistant.PromptProto.Choice prompt_choice = 5;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.PromptProto.Choice getPromptChoice();

  /**
   * <code>optional string html_source = 12;</code>
   */
  boolean hasHtmlSource();
  /**
   * <code>optional string html_source = 12;</code>
   */
  java.lang.String getHtmlSource();
  /**
   * <code>optional string html_source = 12;</code>
   */
  com.google.protobuf.ByteString
      getHtmlSourceBytes();

  /**
   * <pre>
   * Should be set as a result of CollectUserDataAction.
   * </pre>
   *
   * <code>optional .autofill_assistant.CollectUserDataResultProto collect_user_data_result = 15;</code>
   */
  boolean hasCollectUserDataResult();
  /**
   * <pre>
   * Should be set as a result of CollectUserDataAction.
   * </pre>
   *
   * <code>optional .autofill_assistant.CollectUserDataResultProto collect_user_data_result = 15;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.CollectUserDataResultProto getCollectUserDataResult();

  /**
   * <pre>
   * Should be set as a result of SetFormFieldValueAction.
   * </pre>
   *
   * <code>optional .autofill_assistant.SetFormFieldValueProto.Result set_form_field_value_result = 17;</code>
   */
  boolean hasSetFormFieldValueResult();
  /**
   * <pre>
   * Should be set as a result of SetFormFieldValueAction.
   * </pre>
   *
   * <code>optional .autofill_assistant.SetFormFieldValueProto.Result set_form_field_value_result = 17;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.SetFormFieldValueProto.Result getSetFormFieldValueResult();

  /**
   * <pre>
   * May be set as a result of WaitForDomProto.
   * </pre>
   *
   * <code>optional .autofill_assistant.WaitForDomProto.Result wait_for_dom_result = 22;</code>
   */
  boolean hasWaitForDomResult();
  /**
   * <pre>
   * May be set as a result of WaitForDomProto.
   * </pre>
   *
   * <code>optional .autofill_assistant.WaitForDomProto.Result wait_for_dom_result = 22;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.WaitForDomProto.Result getWaitForDomResult();

  /**
   * <pre>
   * Should be set as a result of FormAction.
   * </pre>
   *
   * <code>optional .autofill_assistant.FormProto.Result form_result = 21;</code>
   */
  boolean hasFormResult();
  /**
   * <pre>
   * Should be set as a result of FormAction.
   * </pre>
   *
   * <code>optional .autofill_assistant.FormProto.Result form_result = 21;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.FormProto.Result getFormResult();

  /**
   * <code>optional .autofill_assistant.WaitForDocumentProto.Result wait_for_document_result = 25;</code>
   */
  boolean hasWaitForDocumentResult();
  /**
   * <code>optional .autofill_assistant.WaitForDocumentProto.Result wait_for_document_result = 25;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.WaitForDocumentProto.Result getWaitForDocumentResult();

  /**
   * <pre>
   * Reports information about navigation that happened while
   * processing the action. This is meant for debugging.
   * </pre>
   *
   * <code>optional .autofill_assistant.NavigationInfoProto navigation_info = 20;</code>
   */
  boolean hasNavigationInfo();
  /**
   * <pre>
   * Reports information about navigation that happened while
   * processing the action. This is meant for debugging.
   * </pre>
   *
   * <code>optional .autofill_assistant.NavigationInfoProto navigation_info = 20;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.NavigationInfoProto getNavigationInfo();

  /**
   * <pre>
   * Reports how long it took for the client to run the action. This does not
   * include the delay specified in action.delay_ms.
   * </pre>
   *
   * <code>optional int64 run_time_ms = 23;</code>
   */
  boolean hasRunTimeMs();
  /**
   * <pre>
   * Reports how long it took for the client to run the action. This does not
   * include the delay specified in action.delay_ms.
   * </pre>
   *
   * <code>optional int64 run_time_ms = 23;</code>
   */
  long getRunTimeMs();

  /**
   * <pre>
   * If true, the user triggered, during the client action, at least one user
   * action, such as a prompt choice, through a direct action instead of
   * selecting a chip on the UI. This is meant for monitoring and debugging.
   * </pre>
   *
   * <code>optional bool direct_action = 24;</code>
   */
  boolean hasDirectAction();
  /**
   * <pre>
   * If true, the user triggered, during the client action, at least one user
   * action, such as a prompt choice, through a direct action instead of
   * selecting a chip on the UI. This is meant for monitoring and debugging.
   * </pre>
   *
   * <code>optional bool direct_action = 24;</code>
   */
  boolean getDirectAction();

  public org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionProto.ResultDataCase getResultDataCase();
}