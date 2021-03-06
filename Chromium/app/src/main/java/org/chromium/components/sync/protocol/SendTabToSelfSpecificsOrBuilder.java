// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: send_tab_to_self_specifics.proto

package org.chromium.components.sync.protocol;

public interface SendTabToSelfSpecificsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sync_pb.SendTabToSelfSpecifics)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * A random unique identifier for each shared tab.
   * Required.
   * </pre>
   *
   * <code>optional string guid = 5;</code>
   */
  boolean hasGuid();
  /**
   * <pre>
   * A random unique identifier for each shared tab.
   * Required.
   * </pre>
   *
   * <code>optional string guid = 5;</code>
   */
  java.lang.String getGuid();
  /**
   * <pre>
   * A random unique identifier for each shared tab.
   * Required.
   * </pre>
   *
   * <code>optional string guid = 5;</code>
   */
  com.google.protobuf.ByteString
      getGuidBytes();

  /**
   * <pre>
   * The name of the tab being shared.
   * </pre>
   *
   * <code>optional string title = 1;</code>
   */
  boolean hasTitle();
  /**
   * <pre>
   * The name of the tab being shared.
   * </pre>
   *
   * <code>optional string title = 1;</code>
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * The name of the tab being shared.
   * </pre>
   *
   * <code>optional string title = 1;</code>
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * The URL of the tab being shared.
   * Required.
   * </pre>
   *
   * <code>optional string url = 2;</code>
   */
  boolean hasUrl();
  /**
   * <pre>
   * The URL of the tab being shared.
   * Required.
   * </pre>
   *
   * <code>optional string url = 2;</code>
   */
  java.lang.String getUrl();
  /**
   * <pre>
   * The URL of the tab being shared.
   * Required.
   * </pre>
   *
   * <code>optional string url = 2;</code>
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <pre>
   * The time the tab was shared as measured by the client in microseconds since
   * the windows epoch.
   * </pre>
   *
   * <code>optional int64 shared_time_usec = 3;</code>
   */
  boolean hasSharedTimeUsec();
  /**
   * <pre>
   * The time the tab was shared as measured by the client in microseconds since
   * the windows epoch.
   * </pre>
   *
   * <code>optional int64 shared_time_usec = 3;</code>
   */
  long getSharedTimeUsec();

  /**
   * <pre>
   * The time the tab was navigated to as measured by the client in microseconds
   * since the windows epoch.
   * </pre>
   *
   * <code>optional int64 navigation_time_usec = 6;</code>
   */
  boolean hasNavigationTimeUsec();
  /**
   * <pre>
   * The time the tab was navigated to as measured by the client in microseconds
   * since the windows epoch.
   * </pre>
   *
   * <code>optional int64 navigation_time_usec = 6;</code>
   */
  long getNavigationTimeUsec();

  /**
   * <pre>
   * A non-unique but human readable name to describe this client, used in UI.
   * </pre>
   *
   * <code>optional string device_name = 4;</code>
   */
  boolean hasDeviceName();
  /**
   * <pre>
   * A non-unique but human readable name to describe this client, used in UI.
   * </pre>
   *
   * <code>optional string device_name = 4;</code>
   */
  java.lang.String getDeviceName();
  /**
   * <pre>
   * A non-unique but human readable name to describe this client, used in UI.
   * </pre>
   *
   * <code>optional string device_name = 4;</code>
   */
  com.google.protobuf.ByteString
      getDeviceNameBytes();

  /**
   * <pre>
   * The stable Device_id of the device that this tab was shared with.
   * Required.
   * </pre>
   *
   * <code>optional string target_device_sync_cache_guid = 7;</code>
   */
  boolean hasTargetDeviceSyncCacheGuid();
  /**
   * <pre>
   * The stable Device_id of the device that this tab was shared with.
   * Required.
   * </pre>
   *
   * <code>optional string target_device_sync_cache_guid = 7;</code>
   */
  java.lang.String getTargetDeviceSyncCacheGuid();
  /**
   * <pre>
   * The stable Device_id of the device that this tab was shared with.
   * Required.
   * </pre>
   *
   * <code>optional string target_device_sync_cache_guid = 7;</code>
   */
  com.google.protobuf.ByteString
      getTargetDeviceSyncCacheGuidBytes();

  /**
   * <pre>
   * A boolean to designate if the shared tab been opened on the target device.
   * </pre>
   *
   * <code>optional bool opened = 8;</code>
   */
  boolean hasOpened();
  /**
   * <pre>
   * A boolean to designate if the shared tab been opened on the target device.
   * </pre>
   *
   * <code>optional bool opened = 8;</code>
   */
  boolean getOpened();

  /**
   * <pre>
   * Whether the notification for this proto been dismissed.
   * </pre>
   *
   * <code>optional bool notification_dismissed = 9;</code>
   */
  boolean hasNotificationDismissed();
  /**
   * <pre>
   * Whether the notification for this proto been dismissed.
   * </pre>
   *
   * <code>optional bool notification_dismissed = 9;</code>
   */
  boolean getNotificationDismissed();
}
