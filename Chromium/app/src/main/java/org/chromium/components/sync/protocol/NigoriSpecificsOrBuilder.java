// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: nigori_specifics.proto

package org.chromium.components.sync.protocol;

public interface NigoriSpecificsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sync_pb.NigoriSpecifics)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>optional .sync_pb.EncryptedData encryption_keybag = 1;</code>
   */
  boolean hasEncryptionKeybag();
  /**
   * <code>optional .sync_pb.EncryptedData encryption_keybag = 1;</code>
   */
  org.chromium.components.sync.protocol.EncryptedData getEncryptionKeybag();

  /**
   * <pre>
   * Once keystore migration is performed, we have to freeze the keybag so that
   * older clients (that don't support keystore encryption) do not attempt to
   * update the keybag.
   * Previously |using_explicit_passphrase|.
   * </pre>
   *
   * <code>optional bool keybag_is_frozen = 2;</code>
   */
  boolean hasKeybagIsFrozen();
  /**
   * <pre>
   * Once keystore migration is performed, we have to freeze the keybag so that
   * older clients (that don't support keystore encryption) do not attempt to
   * update the keybag.
   * Previously |using_explicit_passphrase|.
   * </pre>
   *
   * <code>optional bool keybag_is_frozen = 2;</code>
   */
  boolean getKeybagIsFrozen();

  /**
   * <pre>
   * Booleans corresponding to whether a datatype should be encrypted.
   * Passwords and Wi-Fi configurations are always encrypted, so we don't need
   * a field here.  History delete directives need to be consumable by the
   * server, and thus can't be encrypted.
   * </pre>
   *
   * <code>optional bool encrypt_bookmarks = 13;</code>
   */
  boolean hasEncryptBookmarks();
  /**
   * <pre>
   * Booleans corresponding to whether a datatype should be encrypted.
   * Passwords and Wi-Fi configurations are always encrypted, so we don't need
   * a field here.  History delete directives need to be consumable by the
   * server, and thus can't be encrypted.
   * </pre>
   *
   * <code>optional bool encrypt_bookmarks = 13;</code>
   */
  boolean getEncryptBookmarks();

  /**
   * <code>optional bool encrypt_preferences = 14;</code>
   */
  boolean hasEncryptPreferences();
  /**
   * <code>optional bool encrypt_preferences = 14;</code>
   */
  boolean getEncryptPreferences();

  /**
   * <code>optional bool encrypt_autofill_profile = 15;</code>
   */
  boolean hasEncryptAutofillProfile();
  /**
   * <code>optional bool encrypt_autofill_profile = 15;</code>
   */
  boolean getEncryptAutofillProfile();

  /**
   * <code>optional bool encrypt_autofill = 16;</code>
   */
  boolean hasEncryptAutofill();
  /**
   * <code>optional bool encrypt_autofill = 16;</code>
   */
  boolean getEncryptAutofill();

  /**
   * <code>optional bool encrypt_themes = 17;</code>
   */
  boolean hasEncryptThemes();
  /**
   * <code>optional bool encrypt_themes = 17;</code>
   */
  boolean getEncryptThemes();

  /**
   * <code>optional bool encrypt_typed_urls = 18;</code>
   */
  boolean hasEncryptTypedUrls();
  /**
   * <code>optional bool encrypt_typed_urls = 18;</code>
   */
  boolean getEncryptTypedUrls();

  /**
   * <code>optional bool encrypt_extensions = 19;</code>
   */
  boolean hasEncryptExtensions();
  /**
   * <code>optional bool encrypt_extensions = 19;</code>
   */
  boolean getEncryptExtensions();

  /**
   * <code>optional bool encrypt_sessions = 20;</code>
   */
  boolean hasEncryptSessions();
  /**
   * <code>optional bool encrypt_sessions = 20;</code>
   */
  boolean getEncryptSessions();

  /**
   * <code>optional bool encrypt_apps = 21;</code>
   */
  boolean hasEncryptApps();
  /**
   * <code>optional bool encrypt_apps = 21;</code>
   */
  boolean getEncryptApps();

  /**
   * <code>optional bool encrypt_search_engines = 22;</code>
   */
  boolean hasEncryptSearchEngines();
  /**
   * <code>optional bool encrypt_search_engines = 22;</code>
   */
  boolean getEncryptSearchEngines();

  /**
   * <pre>
   * If true, all current and future datatypes will be encrypted.
   * </pre>
   *
   * <code>optional bool encrypt_everything = 24;</code>
   */
  boolean hasEncryptEverything();
  /**
   * <pre>
   * If true, all current and future datatypes will be encrypted.
   * </pre>
   *
   * <code>optional bool encrypt_everything = 24;</code>
   */
  boolean getEncryptEverything();

  /**
   * <code>optional bool encrypt_extension_settings = 25;</code>
   */
  boolean hasEncryptExtensionSettings();
  /**
   * <code>optional bool encrypt_extension_settings = 25;</code>
   */
  boolean getEncryptExtensionSettings();

  /**
   * <code>optional bool encrypt_app_notifications = 26 [deprecated = true];</code>
   */
  @java.lang.Deprecated boolean hasEncryptAppNotifications();
  /**
   * <code>optional bool encrypt_app_notifications = 26 [deprecated = true];</code>
   */
  @java.lang.Deprecated boolean getEncryptAppNotifications();

  /**
   * <code>optional bool encrypt_app_settings = 27;</code>
   */
  boolean hasEncryptAppSettings();
  /**
   * <code>optional bool encrypt_app_settings = 27;</code>
   */
  boolean getEncryptAppSettings();

  /**
   * <pre>
   * Enable syncing favicons as part of tab sync.
   * </pre>
   *
   * <code>optional bool sync_tab_favicons = 29;</code>
   */
  boolean hasSyncTabFavicons();
  /**
   * <pre>
   * Enable syncing favicons as part of tab sync.
   * </pre>
   *
   * <code>optional bool sync_tab_favicons = 29;</code>
   */
  boolean getSyncTabFavicons();

  /**
   * <pre>
   * An |int| field is used instead of enum PassphraseType so we can better
   * handle unknown values coming from later versions. Prior to M77, this was an
   * enum so old clients will assume IMPLICIT_PASSPHRASE for values greater than
   * 4.
   * </pre>
   *
   * <code>optional int32 passphrase_type = 30 [default = 1];</code>
   */
  boolean hasPassphraseType();
  /**
   * <pre>
   * An |int| field is used instead of enum PassphraseType so we can better
   * handle unknown values coming from later versions. Prior to M77, this was an
   * enum so old clients will assume IMPLICIT_PASSPHRASE for values greater than
   * 4.
   * </pre>
   *
   * <code>optional int32 passphrase_type = 30 [default = 1];</code>
   */
  int getPassphraseType();

  /**
   * <pre>
   * The keystore decryptor token blob. Encrypted with the keystore key, and
   * contains the encryption key used to decrypt |encryption_keybag|.
   * Only set if passphrase_state == KEYSTORE_PASSPHRASE.
   * </pre>
   *
   * <code>optional .sync_pb.EncryptedData keystore_decryptor_token = 31;</code>
   */
  boolean hasKeystoreDecryptorToken();
  /**
   * <pre>
   * The keystore decryptor token blob. Encrypted with the keystore key, and
   * contains the encryption key used to decrypt |encryption_keybag|.
   * Only set if passphrase_state == KEYSTORE_PASSPHRASE.
   * </pre>
   *
   * <code>optional .sync_pb.EncryptedData keystore_decryptor_token = 31;</code>
   */
  org.chromium.components.sync.protocol.EncryptedData getKeystoreDecryptorToken();

  /**
   * <pre>
   * The time (in epoch milliseconds) at which the keystore migration was
   * performed.
   * </pre>
   *
   * <code>optional int64 keystore_migration_time = 32;</code>
   */
  boolean hasKeystoreMigrationTime();
  /**
   * <pre>
   * The time (in epoch milliseconds) at which the keystore migration was
   * performed.
   * </pre>
   *
   * <code>optional int64 keystore_migration_time = 32;</code>
   */
  long getKeystoreMigrationTime();

  /**
   * <pre>
   * The time (in epoch milliseconds) at which a custom passphrase was set.
   * Note: this field may not be set if the custom passphrase was applied before
   * this field was introduced.
   * </pre>
   *
   * <code>optional int64 custom_passphrase_time = 33;</code>
   */
  boolean hasCustomPassphraseTime();
  /**
   * <pre>
   * The time (in epoch milliseconds) at which a custom passphrase was set.
   * Note: this field may not be set if the custom passphrase was applied before
   * this field was introduced.
   * </pre>
   *
   * <code>optional int64 custom_passphrase_time = 33;</code>
   */
  long getCustomPassphraseTime();

  /**
   * <pre>
   * Boolean corresponding to whether custom spelling dictionary should be
   * encrypted.
   * </pre>
   *
   * <code>optional bool encrypt_dictionary = 34;</code>
   */
  boolean hasEncryptDictionary();
  /**
   * <pre>
   * Boolean corresponding to whether custom spelling dictionary should be
   * encrypted.
   * </pre>
   *
   * <code>optional bool encrypt_dictionary = 34;</code>
   */
  boolean getEncryptDictionary();

  /**
   * <pre>
   * Boolean corresponding to Whether to encrypt favicons data or not.
   * </pre>
   *
   * <code>optional bool encrypt_favicon_images = 35;</code>
   */
  boolean hasEncryptFaviconImages();
  /**
   * <pre>
   * Boolean corresponding to Whether to encrypt favicons data or not.
   * </pre>
   *
   * <code>optional bool encrypt_favicon_images = 35;</code>
   */
  boolean getEncryptFaviconImages();

  /**
   * <code>optional bool encrypt_favicon_tracking = 36;</code>
   */
  boolean hasEncryptFaviconTracking();
  /**
   * <code>optional bool encrypt_favicon_tracking = 36;</code>
   */
  boolean getEncryptFaviconTracking();

  /**
   * <pre>
   * Boolean corresponding to whether app list items should be encrypted.
   * </pre>
   *
   * <code>optional bool encrypt_app_list = 38;</code>
   */
  boolean hasEncryptAppList();
  /**
   * <pre>
   * Boolean corresponding to whether app list items should be encrypted.
   * </pre>
   *
   * <code>optional bool encrypt_app_list = 38;</code>
   */
  boolean getEncryptAppList();

  /**
   * <pre>
   * Boolean corresponding to whether usage count and last use date of Wallet
   * data should be encrypted.
   * </pre>
   *
   * <code>optional bool encrypt_autofill_wallet_metadata = 39;</code>
   */
  boolean hasEncryptAutofillWalletMetadata();
  /**
   * <pre>
   * Boolean corresponding to whether usage count and last use date of Wallet
   * data should be encrypted.
   * </pre>
   *
   * <code>optional bool encrypt_autofill_wallet_metadata = 39;</code>
   */
  boolean getEncryptAutofillWalletMetadata();

  /**
   * <pre>
   * Boolean indicating whether this node was originally missing a
   * |keystore_migration_time| field value, and was fixed on the server by
   * giving the field a value.
   * THIS FIELD SHOULD ONLY BE SET BY THE SERVER.
   * </pre>
   *
   * <code>optional bool server_only_was_missing_keystore_migration_time = 40;</code>
   */
  boolean hasServerOnlyWasMissingKeystoreMigrationTime();
  /**
   * <pre>
   * Boolean indicating whether this node was originally missing a
   * |keystore_migration_time| field value, and was fixed on the server by
   * giving the field a value.
   * THIS FIELD SHOULD ONLY BE SET BY THE SERVER.
   * </pre>
   *
   * <code>optional bool server_only_was_missing_keystore_migration_time = 40;</code>
   */
  boolean getServerOnlyWasMissingKeystoreMigrationTime();

  /**
   * <pre>
   * Boolean corresponding to whether arc pakcage items should be encrypted.
   * </pre>
   *
   * <code>optional bool encrypt_arc_package = 41;</code>
   */
  boolean hasEncryptArcPackage();
  /**
   * <pre>
   * Boolean corresponding to whether arc pakcage items should be encrypted.
   * </pre>
   *
   * <code>optional bool encrypt_arc_package = 41;</code>
   */
  boolean getEncryptArcPackage();

  /**
   * <pre>
   * Boolean corresponding to whether printer items should be encrypted.
   * </pre>
   *
   * <code>optional bool encrypt_printers = 42;</code>
   */
  boolean hasEncryptPrinters();
  /**
   * <pre>
   * Boolean corresponding to whether printer items should be encrypted.
   * </pre>
   *
   * <code>optional bool encrypt_printers = 42;</code>
   */
  boolean getEncryptPrinters();

  /**
   * <pre>
   * Boolean corresponding to whether reading list items should be encrypted.
   * </pre>
   *
   * <code>optional bool encrypt_reading_list = 43;</code>
   */
  boolean hasEncryptReadingList();
  /**
   * <pre>
   * Boolean corresponding to whether reading list items should be encrypted.
   * </pre>
   *
   * <code>optional bool encrypt_reading_list = 43;</code>
   */
  boolean getEncryptReadingList();

  /**
   * <pre>
   * ID of the method used to derive the encryption key from a custom
   * passphrase. Should be set only when |passphrase_type| is CUSTOM_PASSPHRASE
   * and only based on CustomPassphraseKeyDerivationMethod. This field has been
   * added in M70. All previous versions just ignore it, attempt to use
   * PBKDF2_HMAC_SHA1_1003 and, thus, reject any passphrase if a different
   * method has been used. The default corresponds to UNSPECIFIED. An |int|
   * field is used so we can detect unknown values coming from later versions.
   * </pre>
   *
   * <code>optional int32 custom_passphrase_key_derivation_method = 45 [default = 0];</code>
   */
  boolean hasCustomPassphraseKeyDerivationMethod();
  /**
   * <pre>
   * ID of the method used to derive the encryption key from a custom
   * passphrase. Should be set only when |passphrase_type| is CUSTOM_PASSPHRASE
   * and only based on CustomPassphraseKeyDerivationMethod. This field has been
   * added in M70. All previous versions just ignore it, attempt to use
   * PBKDF2_HMAC_SHA1_1003 and, thus, reject any passphrase if a different
   * method has been used. The default corresponds to UNSPECIFIED. An |int|
   * field is used so we can detect unknown values coming from later versions.
   * </pre>
   *
   * <code>optional int32 custom_passphrase_key_derivation_method = 45 [default = 0];</code>
   */
  int getCustomPassphraseKeyDerivationMethod();

  /**
   * <pre>
   * Base64-encoded salt used for the derivation of the key from the custom
   * passphrase. Valid only if custom_passphrase_key_derivation_method ==
   * SCRYPT_8192_8_11, ignored in other cases.
   * </pre>
   *
   * <code>optional string custom_passphrase_key_derivation_salt = 46;</code>
   */
  boolean hasCustomPassphraseKeyDerivationSalt();
  /**
   * <pre>
   * Base64-encoded salt used for the derivation of the key from the custom
   * passphrase. Valid only if custom_passphrase_key_derivation_method ==
   * SCRYPT_8192_8_11, ignored in other cases.
   * </pre>
   *
   * <code>optional string custom_passphrase_key_derivation_salt = 46;</code>
   */
  java.lang.String getCustomPassphraseKeyDerivationSalt();
  /**
   * <pre>
   * Base64-encoded salt used for the derivation of the key from the custom
   * passphrase. Valid only if custom_passphrase_key_derivation_method ==
   * SCRYPT_8192_8_11, ignored in other cases.
   * </pre>
   *
   * <code>optional string custom_passphrase_key_derivation_salt = 46;</code>
   */
  com.google.protobuf.ByteString
      getCustomPassphraseKeyDerivationSaltBytes();

  /**
   * <pre>
   * Boolean corresponding to whether send tab should be encrypted.
   * </pre>
   *
   * <code>optional bool encrypt_send_tab_to_self = 47;</code>
   */
  boolean hasEncryptSendTabToSelf();
  /**
   * <pre>
   * Boolean corresponding to whether send tab should be encrypted.
   * </pre>
   *
   * <code>optional bool encrypt_send_tab_to_self = 47;</code>
   */
  boolean getEncryptSendTabToSelf();

  /**
   * <pre>
   * Boolean corresponding to whether Web Apps data should be encrypted.
   * </pre>
   *
   * <code>optional bool encrypt_web_apps = 48;</code>
   */
  boolean hasEncryptWebApps();
  /**
   * <pre>
   * Boolean corresponding to whether Web Apps data should be encrypted.
   * </pre>
   *
   * <code>optional bool encrypt_web_apps = 48;</code>
   */
  boolean getEncryptWebApps();

  /**
   * <pre>
   * Boolean corresponding to whether OS preferences should be encrypted.
   * </pre>
   *
   * <code>optional bool encrypt_os_preferences = 49;</code>
   */
  boolean hasEncryptOsPreferences();
  /**
   * <pre>
   * Boolean corresponding to whether OS preferences should be encrypted.
   * </pre>
   *
   * <code>optional bool encrypt_os_preferences = 49;</code>
   */
  boolean getEncryptOsPreferences();
}