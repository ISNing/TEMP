// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sharing_sms_fetch_message.proto

package org.chromium.components.sync.protocol;

public interface SmsFetchResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chrome_browser_sharing.SmsFetchResponse)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The full contents of the received SMS.
   * required
   * </pre>
   *
   * <code>optional string sms = 1;</code>
   */
  java.lang.String getSms();
  /**
   * <pre>
   * The full contents of the received SMS.
   * required
   * </pre>
   *
   * <code>optional string sms = 1;</code>
   */
  com.google.protobuf.ByteString
      getSmsBytes();

  /**
   * <pre>
   * The parsed one time code of the received SMS.
   * required
   * </pre>
   *
   * <code>optional string one_time_code = 2;</code>
   */
  java.lang.String getOneTimeCode();
  /**
   * <pre>
   * The parsed one time code of the received SMS.
   * required
   * </pre>
   *
   * <code>optional string one_time_code = 2;</code>
   */
  com.google.protobuf.ByteString
      getOneTimeCodeBytes();
}