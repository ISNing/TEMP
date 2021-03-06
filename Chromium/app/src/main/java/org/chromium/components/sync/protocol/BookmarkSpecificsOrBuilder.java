// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bookmark_specifics.proto

package org.chromium.components.sync.protocol;

public interface BookmarkSpecificsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sync_pb.BookmarkSpecifics)
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
   * <code>optional bytes favicon = 2;</code>
   */
  boolean hasFavicon();
  /**
   * <code>optional bytes favicon = 2;</code>
   */
  com.google.protobuf.ByteString getFavicon();

  /**
   * <code>optional string title = 3;</code>
   */
  boolean hasTitle();
  /**
   * <code>optional string title = 3;</code>
   */
  java.lang.String getTitle();
  /**
   * <code>optional string title = 3;</code>
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * Corresponds to BookmarkNode::date_added() represented as microseconds since
   * the Windows epoch.
   * </pre>
   *
   * <code>optional int64 creation_time_us = 4;</code>
   */
  boolean hasCreationTimeUs();
  /**
   * <pre>
   * Corresponds to BookmarkNode::date_added() represented as microseconds since
   * the Windows epoch.
   * </pre>
   *
   * <code>optional int64 creation_time_us = 4;</code>
   */
  long getCreationTimeUs();

  /**
   * <code>optional string icon_url = 5;</code>
   */
  boolean hasIconUrl();
  /**
   * <code>optional string icon_url = 5;</code>
   */
  java.lang.String getIconUrl();
  /**
   * <code>optional string icon_url = 5;</code>
   */
  com.google.protobuf.ByteString
      getIconUrlBytes();

  /**
   * <code>repeated .sync_pb.MetaInfo meta_info = 6;</code>
   */
  java.util.List<org.chromium.components.sync.protocol.MetaInfo> 
      getMetaInfoList();
  /**
   * <code>repeated .sync_pb.MetaInfo meta_info = 6;</code>
   */
  org.chromium.components.sync.protocol.MetaInfo getMetaInfo(int index);
  /**
   * <code>repeated .sync_pb.MetaInfo meta_info = 6;</code>
   */
  int getMetaInfoCount();

  /**
   * <pre>
   * Introduced in M78. If not present, originator_client_item_id is interpreted
   * as GUID as long as it is of the valid format. Otherwise, field is either
   * ignored or overwritten locally.
   * </pre>
   *
   * <code>optional string guid = 7;</code>
   */
  boolean hasGuid();
  /**
   * <pre>
   * Introduced in M78. If not present, originator_client_item_id is interpreted
   * as GUID as long as it is of the valid format. Otherwise, field is either
   * ignored or overwritten locally.
   * </pre>
   *
   * <code>optional string guid = 7;</code>
   */
  java.lang.String getGuid();
  /**
   * <pre>
   * Introduced in M78. If not present, originator_client_item_id is interpreted
   * as GUID as long as it is of the valid format. Otherwise, field is either
   * ignored or overwritten locally.
   * </pre>
   *
   * <code>optional string guid = 7;</code>
   */
  com.google.protobuf.ByteString
      getGuidBytes();
}
