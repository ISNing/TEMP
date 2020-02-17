// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: managed_user_shared_setting_specifics.proto

package org.chromium.components.sync.protocol;

public interface ManagedUserSharedSettingSpecificsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sync_pb.ManagedUserSharedSettingSpecifics)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The MU ID for the managed user to whom the setting applies.
   * </pre>
   *
   * <code>optional string mu_id = 1;</code>
   */
  boolean hasMuId();
  /**
   * <pre>
   * The MU ID for the managed user to whom the setting applies.
   * </pre>
   *
   * <code>optional string mu_id = 1;</code>
   */
  java.lang.String getMuId();
  /**
   * <pre>
   * The MU ID for the managed user to whom the setting applies.
   * </pre>
   *
   * <code>optional string mu_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getMuIdBytes();

  /**
   * <pre>
   * The key of the setting.
   * </pre>
   *
   * <code>optional string key = 2;</code>
   */
  boolean hasKey();
  /**
   * <pre>
   * The key of the setting.
   * </pre>
   *
   * <code>optional string key = 2;</code>
   */
  java.lang.String getKey();
  /**
   * <pre>
   * The key of the setting.
   * </pre>
   *
   * <code>optional string key = 2;</code>
   */
  com.google.protobuf.ByteString
      getKeyBytes();

  /**
   * <pre>
   * The setting value. The setting is a JSON encoding of an arbitrary
   * Javascript value.
   * </pre>
   *
   * <code>optional string value = 3;</code>
   */
  boolean hasValue();
  /**
   * <pre>
   * The setting value. The setting is a JSON encoding of an arbitrary
   * Javascript value.
   * </pre>
   *
   * <code>optional string value = 3;</code>
   */
  java.lang.String getValue();
  /**
   * <pre>
   * The setting value. The setting is a JSON encoding of an arbitrary
   * Javascript value.
   * </pre>
   *
   * <code>optional string value = 3;</code>
   */
  com.google.protobuf.ByteString
      getValueBytes();

  /**
   * <pre>
   * This flag is set by the server to acknowledge that it has committed a
   * change to a setting.
   * </pre>
   *
   * <code>optional bool acknowledged = 4 [default = false];</code>
   */
  boolean hasAcknowledged();
  /**
   * <pre>
   * This flag is set by the server to acknowledge that it has committed a
   * change to a setting.
   * </pre>
   *
   * <code>optional bool acknowledged = 4 [default = false];</code>
   */
  boolean getAcknowledged();
}
