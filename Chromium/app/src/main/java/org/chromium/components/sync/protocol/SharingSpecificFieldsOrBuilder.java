// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: device_info_specifics.proto

package org.chromium.components.sync.protocol;

public interface SharingSpecificFieldsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sync_pb.SharingSpecificFields)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * FCM registration token of device subscribed using VAPID key.
   * TODO(crbug.com/1012226): Deprecate when VAPID migration is over.
   * </pre>
   *
   * <code>optional string vapid_fcm_token = 1;</code>
   */
  boolean hasVapidFcmToken();
  /**
   * <pre>
   * FCM registration token of device subscribed using VAPID key.
   * TODO(crbug.com/1012226): Deprecate when VAPID migration is over.
   * </pre>
   *
   * <code>optional string vapid_fcm_token = 1;</code>
   */
  java.lang.String getVapidFcmToken();
  /**
   * <pre>
   * FCM registration token of device subscribed using VAPID key.
   * TODO(crbug.com/1012226): Deprecate when VAPID migration is over.
   * </pre>
   *
   * <code>optional string vapid_fcm_token = 1;</code>
   */
  com.google.protobuf.ByteString
      getVapidFcmTokenBytes();

  /**
   * <pre>
   * Public key for message encryption [RFC8291] using VAPID key.
   * TODO(crbug.com/1012226): Deprecate when VAPID migration is over.
   * </pre>
   *
   * <code>optional bytes vapid_p256dh = 2;</code>
   */
  boolean hasVapidP256Dh();
  /**
   * <pre>
   * Public key for message encryption [RFC8291] using VAPID key.
   * TODO(crbug.com/1012226): Deprecate when VAPID migration is over.
   * </pre>
   *
   * <code>optional bytes vapid_p256dh = 2;</code>
   */
  com.google.protobuf.ByteString getVapidP256Dh();

  /**
   * <pre>
   * Auth secret for message encryption [RFC8291] using VAPID key.
   * TODO(crbug.com/1012226): Deprecate when VAPID migration is over.
   * </pre>
   *
   * <code>optional bytes vapid_auth_secret = 3;</code>
   */
  boolean hasVapidAuthSecret();
  /**
   * <pre>
   * Auth secret for message encryption [RFC8291] using VAPID key.
   * TODO(crbug.com/1012226): Deprecate when VAPID migration is over.
   * </pre>
   *
   * <code>optional bytes vapid_auth_secret = 3;</code>
   */
  com.google.protobuf.ByteString getVapidAuthSecret();

  /**
   * <pre>
   * A list of enabled Sharing features.
   * </pre>
   *
   * <code>repeated .sync_pb.SharingSpecificFields.EnabledFeatures enabled_features = 4;</code>
   */
  java.util.List<org.chromium.components.sync.protocol.SharingSpecificFields.EnabledFeatures> getEnabledFeaturesList();
  /**
   * <pre>
   * A list of enabled Sharing features.
   * </pre>
   *
   * <code>repeated .sync_pb.SharingSpecificFields.EnabledFeatures enabled_features = 4;</code>
   */
  int getEnabledFeaturesCount();
  /**
   * <pre>
   * A list of enabled Sharing features.
   * </pre>
   *
   * <code>repeated .sync_pb.SharingSpecificFields.EnabledFeatures enabled_features = 4;</code>
   */
  org.chromium.components.sync.protocol.SharingSpecificFields.EnabledFeatures getEnabledFeatures(int index);

  /**
   * <pre>
   * FCM registration token of device subscribed using Sharing sender ID.
   * </pre>
   *
   * <code>optional string sender_id_fcm_token = 5;</code>
   */
  boolean hasSenderIdFcmToken();
  /**
   * <pre>
   * FCM registration token of device subscribed using Sharing sender ID.
   * </pre>
   *
   * <code>optional string sender_id_fcm_token = 5;</code>
   */
  java.lang.String getSenderIdFcmToken();
  /**
   * <pre>
   * FCM registration token of device subscribed using Sharing sender ID.
   * </pre>
   *
   * <code>optional string sender_id_fcm_token = 5;</code>
   */
  com.google.protobuf.ByteString
      getSenderIdFcmTokenBytes();

  /**
   * <pre>
   * Public key for message encryption [RFC8291] using Sharing sender ID.
   * </pre>
   *
   * <code>optional bytes sender_id_p256dh = 6;</code>
   */
  boolean hasSenderIdP256Dh();
  /**
   * <pre>
   * Public key for message encryption [RFC8291] using Sharing sender ID.
   * </pre>
   *
   * <code>optional bytes sender_id_p256dh = 6;</code>
   */
  com.google.protobuf.ByteString getSenderIdP256Dh();

  /**
   * <pre>
   * Auth secret for message encryption [RFC8291] using Sharing sender ID.
   * </pre>
   *
   * <code>optional bytes sender_id_auth_secret = 7;</code>
   */
  boolean hasSenderIdAuthSecret();
  /**
   * <pre>
   * Auth secret for message encryption [RFC8291] using Sharing sender ID.
   * </pre>
   *
   * <code>optional bytes sender_id_auth_secret = 7;</code>
   */
  com.google.protobuf.ByteString getSenderIdAuthSecret();
}
