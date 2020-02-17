// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sync.proto

package org.chromium.components.sync.protocol;

public interface GetCrashInfoResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sync_pb.GetCrashInfoResponse)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Hash of the crashing call stack.
   * </pre>
   *
   * <code>optional string stack_id = 1;</code>
   */
  boolean hasStackId();
  /**
   * <pre>
   * Hash of the crashing call stack.
   * </pre>
   *
   * <code>optional string stack_id = 1;</code>
   */
  java.lang.String getStackId();
  /**
   * <pre>
   * Hash of the crashing call stack.
   * </pre>
   *
   * <code>optional string stack_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getStackIdBytes();

  /**
   * <pre>
   * Time of the crash, potentially rounded to remove
   * significant bits.
   * </pre>
   *
   * <code>optional int64 crash_time_millis = 2;</code>
   */
  boolean hasCrashTimeMillis();
  /**
   * <pre>
   * Time of the crash, potentially rounded to remove
   * significant bits.
   * </pre>
   *
   * <code>optional int64 crash_time_millis = 2;</code>
   */
  long getCrashTimeMillis();
}
