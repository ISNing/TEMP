// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface DirectActionProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.DirectActionProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Map to direct actions with the given names.
   * </pre>
   *
   * <code>repeated string names = 1;</code>
   */
  java.util.List<String>
      getNamesList();
  /**
   * <pre>
   * Map to direct actions with the given names.
   * </pre>
   *
   * <code>repeated string names = 1;</code>
   */
  int getNamesCount();
  /**
   * <pre>
   * Map to direct actions with the given names.
   * </pre>
   *
   * <code>repeated string names = 1;</code>
   */
  java.lang.String getNames(int index);
  /**
   * <pre>
   * Map to direct actions with the given names.
   * </pre>
   *
   * <code>repeated string names = 1;</code>
   */
  com.google.protobuf.ByteString
      getNamesBytes(int index);

  /**
   * <pre>
   * Arguments to report as required for the direct action.
   * This is included into the definition reported to the caller without being
   * interpreted. Requirement is not enforced.
   * </pre>
   *
   * <code>repeated string required_arguments = 2;</code>
   */
  java.util.List<String>
      getRequiredArgumentsList();
  /**
   * <pre>
   * Arguments to report as required for the direct action.
   * This is included into the definition reported to the caller without being
   * interpreted. Requirement is not enforced.
   * </pre>
   *
   * <code>repeated string required_arguments = 2;</code>
   */
  int getRequiredArgumentsCount();
  /**
   * <pre>
   * Arguments to report as required for the direct action.
   * This is included into the definition reported to the caller without being
   * interpreted. Requirement is not enforced.
   * </pre>
   *
   * <code>repeated string required_arguments = 2;</code>
   */
  java.lang.String getRequiredArguments(int index);
  /**
   * <pre>
   * Arguments to report as required for the direct action.
   * This is included into the definition reported to the caller without being
   * interpreted. Requirement is not enforced.
   * </pre>
   *
   * <code>repeated string required_arguments = 2;</code>
   */
  com.google.protobuf.ByteString
      getRequiredArgumentsBytes(int index);

  /**
   * <pre>
   * Arguments to report as optional for the direct action.
   * This is included into the definition reported to the caller without being
   * interpreted.
   * </pre>
   *
   * <code>repeated string optional_arguments = 3;</code>
   */
  java.util.List<String>
      getOptionalArgumentsList();
  /**
   * <pre>
   * Arguments to report as optional for the direct action.
   * This is included into the definition reported to the caller without being
   * interpreted.
   * </pre>
   *
   * <code>repeated string optional_arguments = 3;</code>
   */
  int getOptionalArgumentsCount();
  /**
   * <pre>
   * Arguments to report as optional for the direct action.
   * This is included into the definition reported to the caller without being
   * interpreted.
   * </pre>
   *
   * <code>repeated string optional_arguments = 3;</code>
   */
  java.lang.String getOptionalArguments(int index);
  /**
   * <pre>
   * Arguments to report as optional for the direct action.
   * This is included into the definition reported to the caller without being
   * interpreted.
   * </pre>
   *
   * <code>repeated string optional_arguments = 3;</code>
   */
  com.google.protobuf.ByteString
      getOptionalArgumentsBytes(int index);
}