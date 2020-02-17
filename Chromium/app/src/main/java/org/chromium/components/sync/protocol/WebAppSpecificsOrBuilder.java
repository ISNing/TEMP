// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: web_app_specifics.proto

package org.chromium.components.sync.protocol;

public interface WebAppSpecificsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sync_pb.WebAppSpecifics)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>optional string launch_url = 1;</code>
   */
  boolean hasLaunchUrl();
  /**
   * <code>optional string launch_url = 1;</code>
   */
  java.lang.String getLaunchUrl();
  /**
   * <code>optional string launch_url = 1;</code>
   */
  com.google.protobuf.ByteString
      getLaunchUrlBytes();

  /**
   * <code>optional string name = 2;</code>
   */
  boolean hasName();
  /**
   * <code>optional string name = 2;</code>
   */
  java.lang.String getName();
  /**
   * <code>optional string name = 2;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>optional .sync_pb.WebAppSpecifics.UserDisplayMode user_display_mode = 3;</code>
   */
  boolean hasUserDisplayMode();
  /**
   * <code>optional .sync_pb.WebAppSpecifics.UserDisplayMode user_display_mode = 3;</code>
   */
  org.chromium.components.sync.protocol.WebAppSpecifics.UserDisplayMode getUserDisplayMode();

  /**
   * <code>optional uint32 theme_color = 4;</code>
   */
  boolean hasThemeColor();
  /**
   * <code>optional uint32 theme_color = 4;</code>
   */
  int getThemeColor();
}
