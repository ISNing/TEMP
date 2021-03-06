// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: app_specifics.proto

package org.chromium.components.sync.protocol;

public interface LinkedAppIconInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sync_pb.LinkedAppIconInfo)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The URL of the app icon.
   * </pre>
   *
   * <code>optional string url = 1;</code>
   */
  boolean hasUrl();
  /**
   * <pre>
   * The URL of the app icon.
   * </pre>
   *
   * <code>optional string url = 1;</code>
   */
  java.lang.String getUrl();
  /**
   * <pre>
   * The URL of the app icon.
   * </pre>
   *
   * <code>optional string url = 1;</code>
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <pre>
   * The size of the app icon in DIPs.
   * </pre>
   *
   * <code>optional uint32 size = 2;</code>
   */
  boolean hasSize();
  /**
   * <pre>
   * The size of the app icon in DIPs.
   * </pre>
   *
   * <code>optional uint32 size = 2;</code>
   */
  int getSize();
}
