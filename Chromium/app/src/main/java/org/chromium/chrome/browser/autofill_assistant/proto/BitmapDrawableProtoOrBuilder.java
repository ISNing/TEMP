// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: generic_ui.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface BitmapDrawableProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.BitmapDrawableProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>optional string url = 1;</code>
   */
  boolean hasUrl();
  /**
   * <code>optional string url = 1;</code>
   */
  java.lang.String getUrl();
  /**
   * <code>optional string url = 1;</code>
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <code>optional .autofill_assistant.ClientDimensionProto width = 2;</code>
   */
  boolean hasWidth();
  /**
   * <code>optional .autofill_assistant.ClientDimensionProto width = 2;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ClientDimensionProto getWidth();

  /**
   * <code>optional .autofill_assistant.ClientDimensionProto height = 3;</code>
   */
  boolean hasHeight();
  /**
   * <code>optional .autofill_assistant.ClientDimensionProto height = 3;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ClientDimensionProto getHeight();
}
