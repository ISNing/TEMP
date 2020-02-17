// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: history_delete_directive_specifics.proto

package org.chromium.components.sync.protocol;

public interface TimeRangeDirectiveOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sync_pb.TimeRangeDirective)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The time on or after which entries must be deleted.
   * </pre>
   *
   * <code>optional int64 start_time_usec = 1;</code>
   */
  boolean hasStartTimeUsec();
  /**
   * <pre>
   * The time on or after which entries must be deleted.
   * </pre>
   *
   * <code>optional int64 start_time_usec = 1;</code>
   */
  long getStartTimeUsec();

  /**
   * <pre>
   * The time on or before which entries must be deleted.
   * </pre>
   *
   * <code>optional int64 end_time_usec = 2;</code>
   */
  boolean hasEndTimeUsec();
  /**
   * <pre>
   * The time on or before which entries must be deleted.
   * </pre>
   *
   * <code>optional int64 end_time_usec = 2;</code>
   */
  long getEndTimeUsec();
}
