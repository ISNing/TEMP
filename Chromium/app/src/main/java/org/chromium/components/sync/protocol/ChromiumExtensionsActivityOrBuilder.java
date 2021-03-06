// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sync.proto

package org.chromium.components.sync.protocol;

public interface ChromiumExtensionsActivityOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sync_pb.ChromiumExtensionsActivity)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The human-readable ID identifying the extension responsible
   * for the traffic reported in this ChromiumExtensionsActivity.
   * </pre>
   *
   * <code>optional string extension_id = 1;</code>
   */
  boolean hasExtensionId();
  /**
   * <pre>
   * The human-readable ID identifying the extension responsible
   * for the traffic reported in this ChromiumExtensionsActivity.
   * </pre>
   *
   * <code>optional string extension_id = 1;</code>
   */
  java.lang.String getExtensionId();
  /**
   * <pre>
   * The human-readable ID identifying the extension responsible
   * for the traffic reported in this ChromiumExtensionsActivity.
   * </pre>
   *
   * <code>optional string extension_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getExtensionIdBytes();

  /**
   * <pre>
   * How many times the extension successfully invoked a write
   * operation through the bookmarks API since the last CommitMessage.
   * </pre>
   *
   * <code>optional uint32 bookmark_writes_since_last_commit = 2;</code>
   */
  boolean hasBookmarkWritesSinceLastCommit();
  /**
   * <pre>
   * How many times the extension successfully invoked a write
   * operation through the bookmarks API since the last CommitMessage.
   * </pre>
   *
   * <code>optional uint32 bookmark_writes_since_last_commit = 2;</code>
   */
  int getBookmarkWritesSinceLastCommit();
}
