// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface CollectUserDataResultProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.CollectUserDataResultProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>optional string card_issuer_network = 1;</code>
   */
  boolean hasCardIssuerNetwork();
  /**
   * <code>optional string card_issuer_network = 1;</code>
   */
  java.lang.String getCardIssuerNetwork();
  /**
   * <code>optional string card_issuer_network = 1;</code>
   */
  com.google.protobuf.ByteString
      getCardIssuerNetworkBytes();

  /**
   * <pre>
   * Whether the integrated terms and conditions approval checkbox was checked.
   * </pre>
   *
   * <code>optional bool is_terms_and_conditions_accepted = 2;</code>
   */
  boolean hasIsTermsAndConditionsAccepted();
  /**
   * <pre>
   * Whether the integrated terms and conditions approval checkbox was checked.
   * </pre>
   *
   * <code>optional bool is_terms_and_conditions_accepted = 2;</code>
   */
  boolean getIsTermsAndConditionsAccepted();

  /**
   * <pre>
   * The email address of the payer.
   * </pre>
   *
   * <code>optional string payer_email = 3;</code>
   */
  boolean hasPayerEmail();
  /**
   * <pre>
   * The email address of the payer.
   * </pre>
   *
   * <code>optional string payer_email = 3;</code>
   */
  java.lang.String getPayerEmail();
  /**
   * <pre>
   * The email address of the payer.
   * </pre>
   *
   * <code>optional string payer_email = 3;</code>
   */
  com.google.protobuf.ByteString
      getPayerEmailBytes();

  /**
   * <pre>
   * If set, this means that the user triggered the action in
   * |CollectUserDataProto.additional_actions| that has index
   * |additional_action_index|.
   * </pre>
   *
   * <code>optional int32 additional_action_index = 4;</code>
   */
  boolean hasAdditionalActionIndex();
  /**
   * <pre>
   * If set, this means that the user triggered the action in
   * |CollectUserDataProto.additional_actions| that has index
   * |additional_action_index|.
   * </pre>
   *
   * <code>optional int32 additional_action_index = 4;</code>
   */
  int getAdditionalActionIndex();

  /**
   * <pre>
   * If set, this means that the user clicked on one of the terms and conditions
   * links.
   * </pre>
   *
   * <code>optional int32 terms_link = 5;</code>
   */
  boolean hasTermsLink();
  /**
   * <pre>
   * If set, this means that the user clicked on one of the terms and conditions
   * links.
   * </pre>
   *
   * <code>optional int32 terms_link = 5;</code>
   */
  int getTermsLink();

  /**
   * <pre>
   * The payload of the chosen login option.
   * </pre>
   *
   * <code>optional bytes login_payload = 6;</code>
   */
  boolean hasLoginPayload();
  /**
   * <pre>
   * The payload of the chosen login option.
   * </pre>
   *
   * <code>optional bytes login_payload = 6;</code>
   */
  com.google.protobuf.ByteString getLoginPayload();

  /**
   * <pre>
   * The start of the date/time range, if requested.
   * </pre>
   *
   * <code>optional .autofill_assistant.DateTimeProto date_time_start = 7;</code>
   */
  boolean hasDateTimeStart();
  /**
   * <pre>
   * The start of the date/time range, if requested.
   * </pre>
   *
   * <code>optional .autofill_assistant.DateTimeProto date_time_start = 7;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto getDateTimeStart();

  /**
   * <pre>
   * The end of the date/time range, if requested.
   * </pre>
   *
   * <code>optional .autofill_assistant.DateTimeProto date_time_end = 8;</code>
   */
  boolean hasDateTimeEnd();
  /**
   * <pre>
   * The end of the date/time range, if requested.
   * </pre>
   *
   * <code>optional .autofill_assistant.DateTimeProto date_time_end = 8;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto getDateTimeEnd();
}
