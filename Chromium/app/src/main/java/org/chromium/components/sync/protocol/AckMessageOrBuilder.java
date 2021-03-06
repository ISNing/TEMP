// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sharing_message.proto

package org.chromium.components.sync.protocol;

public interface AckMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chrome_browser_sharing.AckMessage)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * required.
   * </pre>
   *
   * <code>optional string original_message_id = 1;</code>
   */
  java.lang.String getOriginalMessageId();
  /**
   * <pre>
   * required.
   * </pre>
   *
   * <code>optional string original_message_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getOriginalMessageIdBytes();

  /**
   * <pre>
   * The type of message that this is acknowledging. optional.
   * </pre>
   *
   * <code>optional .chrome_browser_sharing.MessageType original_message_type = 2;</code>
   */
  int getOriginalMessageTypeValue();
  /**
   * <pre>
   * The type of message that this is acknowledging. optional.
   * </pre>
   *
   * <code>optional .chrome_browser_sharing.MessageType original_message_type = 2;</code>
   */
  org.chromium.components.sync.protocol.MessageType getOriginalMessageType();

  /**
   * <pre>
   * Response of the message, optional.
   * </pre>
   *
   * <code>optional .chrome_browser_sharing.ResponseMessage response_message = 3;</code>
   */
  boolean hasResponseMessage();
  /**
   * <pre>
   * Response of the message, optional.
   * </pre>
   *
   * <code>optional .chrome_browser_sharing.ResponseMessage response_message = 3;</code>
   */
  org.chromium.components.sync.protocol.ResponseMessage getResponseMessage();
}
