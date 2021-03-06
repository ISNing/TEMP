// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: loopback_server.proto

package org.chromium.components.sync.protocol;

public interface LoopbackServerProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sync_pb.LoopbackServerProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The protocol buffer format version.
   * </pre>
   *
   * <code>optional int64 version = 1;</code>
   */
  boolean hasVersion();
  /**
   * <pre>
   * The protocol buffer format version.
   * </pre>
   *
   * <code>optional int64 version = 1;</code>
   */
  long getVersion();

  /**
   * <code>optional int64 store_birthday = 2;</code>
   */
  boolean hasStoreBirthday();
  /**
   * <code>optional int64 store_birthday = 2;</code>
   */
  long getStoreBirthday();

  /**
   * <code>repeated .sync_pb.LoopbackServerEntity entities = 3;</code>
   */
  java.util.List<org.chromium.components.sync.protocol.LoopbackServerEntity> 
      getEntitiesList();
  /**
   * <code>repeated .sync_pb.LoopbackServerEntity entities = 3;</code>
   */
  org.chromium.components.sync.protocol.LoopbackServerEntity getEntities(int index);
  /**
   * <code>repeated .sync_pb.LoopbackServerEntity entities = 3;</code>
   */
  int getEntitiesCount();

  /**
   * <pre>
   * All Keystore keys known to the server.
   * </pre>
   *
   * <code>repeated string keystore_keys = 4;</code>
   */
  java.util.List<String>
      getKeystoreKeysList();
  /**
   * <pre>
   * All Keystore keys known to the server.
   * </pre>
   *
   * <code>repeated string keystore_keys = 4;</code>
   */
  int getKeystoreKeysCount();
  /**
   * <pre>
   * All Keystore keys known to the server.
   * </pre>
   *
   * <code>repeated string keystore_keys = 4;</code>
   */
  java.lang.String getKeystoreKeys(int index);
  /**
   * <pre>
   * All Keystore keys known to the server.
   * </pre>
   *
   * <code>repeated string keystore_keys = 4;</code>
   */
  com.google.protobuf.ByteString
      getKeystoreKeysBytes(int index);

  /**
   * <pre>
   * The last entity ID that was assigned to an entity.
   * </pre>
   *
   * <code>optional int64 last_version_assigned = 5;</code>
   */
  boolean hasLastVersionAssigned();
  /**
   * <pre>
   * The last entity ID that was assigned to an entity.
   * </pre>
   *
   * <code>optional int64 last_version_assigned = 5;</code>
   */
  long getLastVersionAssigned();
}
