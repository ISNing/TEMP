// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: history_delete_directive_specifics.proto

package org.chromium.components.sync.protocol;

public interface HistoryDeleteDirectiveSpecificsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sync_pb.HistoryDeleteDirectiveSpecifics)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Exactly one of the fields below must be filled in.  Otherwise, this
   * delete directive must be ignored.
   * </pre>
   *
   * <code>optional .sync_pb.GlobalIdDirective global_id_directive = 1;</code>
   */
  boolean hasGlobalIdDirective();
  /**
   * <pre>
   * Exactly one of the fields below must be filled in.  Otherwise, this
   * delete directive must be ignored.
   * </pre>
   *
   * <code>optional .sync_pb.GlobalIdDirective global_id_directive = 1;</code>
   */
  org.chromium.components.sync.protocol.GlobalIdDirective getGlobalIdDirective();

  /**
   * <code>optional .sync_pb.TimeRangeDirective time_range_directive = 2;</code>
   */
  boolean hasTimeRangeDirective();
  /**
   * <code>optional .sync_pb.TimeRangeDirective time_range_directive = 2;</code>
   */
  org.chromium.components.sync.protocol.TimeRangeDirective getTimeRangeDirective();

  /**
   * <code>optional .sync_pb.UrlDirective url_directive = 3;</code>
   */
  boolean hasUrlDirective();
  /**
   * <code>optional .sync_pb.UrlDirective url_directive = 3;</code>
   */
  org.chromium.components.sync.protocol.UrlDirective getUrlDirective();
}
