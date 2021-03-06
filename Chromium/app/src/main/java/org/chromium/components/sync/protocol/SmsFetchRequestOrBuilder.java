// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sharing_sms_fetch_message.proto

package org.chromium.components.sync.protocol;

public interface SmsFetchRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chrome_browser_sharing.SmsFetchRequest)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The origin that is requesting the SMS. Remote devices use it to match
   * against the metadata contained in the received SMS.
   * required
   * </pre>
   *
   * <code>optional string origin = 1;</code>
   */
  java.lang.String getOrigin();
  /**
   * <pre>
   * The origin that is requesting the SMS. Remote devices use it to match
   * against the metadata contained in the received SMS.
   * required
   * </pre>
   *
   * <code>optional string origin = 1;</code>
   */
  com.google.protobuf.ByteString
      getOriginBytes();
}
