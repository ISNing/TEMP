// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sharing_remote_copy_message.proto

package org.chromium.components.sync.protocol;

public interface RemoteCopyMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chrome_browser_sharing.RemoteCopyMessage)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Plain text.
   * </pre>
   *
   * <code>optional string text = 1;</code>
   */
  java.lang.String getText();
  /**
   * <pre>
   * Plain text.
   * </pre>
   *
   * <code>optional string text = 1;</code>
   */
  com.google.protobuf.ByteString
      getTextBytes();

  /**
   * <pre>
   * The URL of an image to download and write to the clipboard.
   * </pre>
   *
   * <code>optional string image_url = 2;</code>
   */
  java.lang.String getImageUrl();
  /**
   * <pre>
   * The URL of an image to download and write to the clipboard.
   * </pre>
   *
   * <code>optional string image_url = 2;</code>
   */
  com.google.protobuf.ByteString
      getImageUrlBytes();

  public org.chromium.components.sync.protocol.RemoteCopyMessage.ContentCase getContentCase();
}
