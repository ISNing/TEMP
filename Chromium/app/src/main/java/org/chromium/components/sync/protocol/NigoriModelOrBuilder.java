// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: nigori_local_data.proto

package org.chromium.components.sync.protocol;

public interface NigoriModelOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sync_pb.NigoriModel)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Represents state of the cryptographer.
   * </pre>
   *
   * <code>optional .sync_pb.CryptographerData cryptographer_data = 1;</code>
   */
  boolean hasCryptographerData();
  /**
   * <pre>
   * Represents state of the cryptographer.
   * </pre>
   *
   * <code>optional .sync_pb.CryptographerData cryptographer_data = 1;</code>
   */
  org.chromium.components.sync.protocol.CryptographerData getCryptographerData();

  /**
   * <pre>
   * Contains the name of the key, used for encryption of
   * NigoriSpecifics.keystore_decryptor_token, should always be the name of the
   * latest keystore key. Equals to cryptographer_data.default_key_name iff it
   * is Nigori in full keystore mode (not in backward compatible keystore
   * mode).
   * </pre>
   *
   * <code>optional string current_keystore_key_name = 2;</code>
   */
  boolean hasCurrentKeystoreKeyName();
  /**
   * <pre>
   * Contains the name of the key, used for encryption of
   * NigoriSpecifics.keystore_decryptor_token, should always be the name of the
   * latest keystore key. Equals to cryptographer_data.default_key_name iff it
   * is Nigori in full keystore mode (not in backward compatible keystore
   * mode).
   * </pre>
   *
   * <code>optional string current_keystore_key_name = 2;</code>
   */
  java.lang.String getCurrentKeystoreKeyName();
  /**
   * <pre>
   * Contains the name of the key, used for encryption of
   * NigoriSpecifics.keystore_decryptor_token, should always be the name of the
   * latest keystore key. Equals to cryptographer_data.default_key_name iff it
   * is Nigori in full keystore mode (not in backward compatible keystore
   * mode).
   * </pre>
   *
   * <code>optional string current_keystore_key_name = 2;</code>
   */
  com.google.protobuf.ByteString
      getCurrentKeystoreKeyNameBytes();

  /**
   * <pre>
   * Contains keybag in encrypted form, should be empty once we were able to
   * decrypt keybag from specifics.
   * </pre>
   *
   * <code>optional .sync_pb.EncryptedData pending_keys = 3;</code>
   */
  boolean hasPendingKeys();
  /**
   * <pre>
   * Contains keybag in encrypted form, should be empty once we were able to
   * decrypt keybag from specifics.
   * </pre>
   *
   * <code>optional .sync_pb.EncryptedData pending_keys = 3;</code>
   */
  org.chromium.components.sync.protocol.EncryptedData getPendingKeys();

  /**
   * <pre>
   * PassphraseType used for encryption. IMPLICIT_PASSPRHASE shouldn't be used
   * here.
   * </pre>
   *
   * <code>optional .sync_pb.NigoriSpecifics.PassphraseType passphrase_type = 4 [default = UNKNOWN];</code>
   */
  boolean hasPassphraseType();
  /**
   * <pre>
   * PassphraseType used for encryption. IMPLICIT_PASSPRHASE shouldn't be used
   * here.
   * </pre>
   *
   * <code>optional .sync_pb.NigoriSpecifics.PassphraseType passphrase_type = 4 [default = UNKNOWN];</code>
   */
  org.chromium.components.sync.protocol.NigoriSpecifics.PassphraseType getPassphraseType();

  /**
   * <pre>
   * The time (in UNIX epoch milliseconds) at which the keystore migration was
   * performed.
   * </pre>
   *
   * <code>optional int64 keystore_migration_time = 5;</code>
   */
  boolean hasKeystoreMigrationTime();
  /**
   * <pre>
   * The time (in UNIX epoch milliseconds) at which the keystore migration was
   * performed.
   * </pre>
   *
   * <code>optional int64 keystore_migration_time = 5;</code>
   */
  long getKeystoreMigrationTime();

  /**
   * <pre>
   * The time (in UNIX epoch milliseconds) at which a custom passphrase was
   * set.
   * Note: this field may not be set if the custom passphrase was applied before
   * corresponding field in NigoriSpecifics was introduced.
   * </pre>
   *
   * <code>optional int64 custom_passphrase_time = 6;</code>
   */
  boolean hasCustomPassphraseTime();
  /**
   * <pre>
   * The time (in UNIX epoch milliseconds) at which a custom passphrase was
   * set.
   * Note: this field may not be set if the custom passphrase was applied before
   * corresponding field in NigoriSpecifics was introduced.
   * </pre>
   *
   * <code>optional int64 custom_passphrase_time = 6;</code>
   */
  long getCustomPassphraseTime();

  /**
   * <pre>
   * Params used for deriving keys from custom passphrase. Should be set iff
   * |passphrase_type| is CUSTOM_PASSPHRASE.
   * </pre>
   *
   * <code>optional .sync_pb.CustomPassphraseKeyDerivationParams custom_passphrase_key_derivation_params = 7;</code>
   */
  boolean hasCustomPassphraseKeyDerivationParams();
  /**
   * <pre>
   * Params used for deriving keys from custom passphrase. Should be set iff
   * |passphrase_type| is CUSTOM_PASSPHRASE.
   * </pre>
   *
   * <code>optional .sync_pb.CustomPassphraseKeyDerivationParams custom_passphrase_key_derivation_params = 7;</code>
   */
  org.chromium.components.sync.protocol.CustomPassphraseKeyDerivationParams getCustomPassphraseKeyDerivationParams();

  /**
   * <pre>
   * Indicates whether we need to encrypt all encryptable user types.
   * </pre>
   *
   * <code>optional bool encrypt_everything = 8;</code>
   */
  boolean hasEncryptEverything();
  /**
   * <pre>
   * Indicates whether we need to encrypt all encryptable user types.
   * </pre>
   *
   * <code>optional bool encrypt_everything = 8;</code>
   */
  boolean getEncryptEverything();

  /**
   * <pre>
   * The list of encrypted UserEncryptableTypes, represented by their specifics
   * field number.
   * </pre>
   *
   * <code>repeated int32 encrypted_types_specifics_field_number = 9;</code>
   */
  java.util.List<java.lang.Integer> getEncryptedTypesSpecificsFieldNumberList();
  /**
   * <pre>
   * The list of encrypted UserEncryptableTypes, represented by their specifics
   * field number.
   * </pre>
   *
   * <code>repeated int32 encrypted_types_specifics_field_number = 9;</code>
   */
  int getEncryptedTypesSpecificsFieldNumberCount();
  /**
   * <pre>
   * The list of encrypted UserEncryptableTypes, represented by their specifics
   * field number.
   * </pre>
   *
   * <code>repeated int32 encrypted_types_specifics_field_number = 9;</code>
   */
  int getEncryptedTypesSpecificsFieldNumber(int index);

  /**
   * <pre>
   * Keystore keys are used to decrypt keystore-based Nigori. Should be
   * persisted in order to not ask the keystore server for them during every
   * browser startup. Due to backward compatibility requirements keys are
   * always Base64 encoded.
   * </pre>
   *
   * <code>repeated string keystore_key = 10;</code>
   */
  java.util.List<String>
      getKeystoreKeyList();
  /**
   * <pre>
   * Keystore keys are used to decrypt keystore-based Nigori. Should be
   * persisted in order to not ask the keystore server for them during every
   * browser startup. Due to backward compatibility requirements keys are
   * always Base64 encoded.
   * </pre>
   *
   * <code>repeated string keystore_key = 10;</code>
   */
  int getKeystoreKeyCount();
  /**
   * <pre>
   * Keystore keys are used to decrypt keystore-based Nigori. Should be
   * persisted in order to not ask the keystore server for them during every
   * browser startup. Due to backward compatibility requirements keys are
   * always Base64 encoded.
   * </pre>
   *
   * <code>repeated string keystore_key = 10;</code>
   */
  java.lang.String getKeystoreKey(int index);
  /**
   * <pre>
   * Keystore keys are used to decrypt keystore-based Nigori. Should be
   * persisted in order to not ask the keystore server for them during every
   * browser startup. Due to backward compatibility requirements keys are
   * always Base64 encoded.
   * </pre>
   *
   * <code>repeated string keystore_key = 10;</code>
   */
  com.google.protobuf.ByteString
      getKeystoreKeyBytes(int index);

  /**
   * <pre>
   * Encryptor keystore decryptor token. Used for decryption of keystore Nigori
   * in case keystore keys arrived after NigoriSpecifics.
   * </pre>
   *
   * <code>optional .sync_pb.EncryptedData pending_keystore_decryptor_token = 11;</code>
   */
  boolean hasPendingKeystoreDecryptorToken();
  /**
   * <pre>
   * Encryptor keystore decryptor token. Used for decryption of keystore Nigori
   * in case keystore keys arrived after NigoriSpecifics.
   * </pre>
   *
   * <code>optional .sync_pb.EncryptedData pending_keystore_decryptor_token = 11;</code>
   */
  org.chromium.components.sync.protocol.EncryptedData getPendingKeystoreDecryptorToken();
}
