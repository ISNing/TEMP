// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: loopback_server.proto

package org.chromium.components.sync.protocol;

public interface LoopbackServerEntityOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sync_pb.LoopbackServerEntity)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>optional .sync_pb.LoopbackServerEntity.Type type = 1;</code>
   */
  boolean hasType();
  /**
   * <code>optional .sync_pb.LoopbackServerEntity.Type type = 1;</code>
   */
  org.chromium.components.sync.protocol.LoopbackServerEntity.Type getType();

  /**
   * <code>optional .sync_pb.SyncEntity entity = 2;</code>
   */
  boolean hasEntity();
  /**
   * <code>optional .sync_pb.SyncEntity entity = 2;</code>
   */
  org.chromium.components.sync.protocol.SyncEntity getEntity();

  /**
   * <code>optional int64 model_type = 3;</code>
   */
  boolean hasModelType();
  /**
   * <code>optional int64 model_type = 3;</code>
   */
  long getModelType();
}