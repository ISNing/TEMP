// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sync.proto

package org.chromium.components.sync.protocol;

public interface ProfilingDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sync_pb.ProfilingData)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>optional int64 meta_data_write_time = 1;</code>
   */
  boolean hasMetaDataWriteTime();
  /**
   * <code>optional int64 meta_data_write_time = 1;</code>
   */
  long getMetaDataWriteTime();

  /**
   * <code>optional int64 file_data_write_time = 2;</code>
   */
  boolean hasFileDataWriteTime();
  /**
   * <code>optional int64 file_data_write_time = 2;</code>
   */
  long getFileDataWriteTime();

  /**
   * <code>optional int64 user_lookup_time = 3;</code>
   */
  boolean hasUserLookupTime();
  /**
   * <code>optional int64 user_lookup_time = 3;</code>
   */
  long getUserLookupTime();

  /**
   * <code>optional int64 meta_data_read_time = 4;</code>
   */
  boolean hasMetaDataReadTime();
  /**
   * <code>optional int64 meta_data_read_time = 4;</code>
   */
  long getMetaDataReadTime();

  /**
   * <code>optional int64 file_data_read_time = 5;</code>
   */
  boolean hasFileDataReadTime();
  /**
   * <code>optional int64 file_data_read_time = 5;</code>
   */
  long getFileDataReadTime();

  /**
   * <code>optional int64 total_request_time = 6;</code>
   */
  boolean hasTotalRequestTime();
  /**
   * <code>optional int64 total_request_time = 6;</code>
   */
  long getTotalRequestTime();
}