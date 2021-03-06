// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: printer_specifics.proto

package org.chromium.components.sync.protocol;

public interface PrinterPPDReferenceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sync_pb.PrinterPPDReference)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Url for user provided file.  Overrides other fields.
   * </pre>
   *
   * <code>optional string user_supplied_ppd_url = 1;</code>
   */
  boolean hasUserSuppliedPpdUrl();
  /**
   * <pre>
   * Url for user provided file.  Overrides other fields.
   * </pre>
   *
   * <code>optional string user_supplied_ppd_url = 1;</code>
   */
  java.lang.String getUserSuppliedPpdUrl();
  /**
   * <pre>
   * Url for user provided file.  Overrides other fields.
   * </pre>
   *
   * <code>optional string user_supplied_ppd_url = 1;</code>
   */
  com.google.protobuf.ByteString
      getUserSuppliedPpdUrlBytes();

  /**
   * <pre>
   * Retired fields
   * </pre>
   *
   * <code>optional string effective_manufacturer = 2 [deprecated = true];</code>
   */
  @java.lang.Deprecated boolean hasEffectiveManufacturer();
  /**
   * <pre>
   * Retired fields
   * </pre>
   *
   * <code>optional string effective_manufacturer = 2 [deprecated = true];</code>
   */
  @java.lang.Deprecated java.lang.String getEffectiveManufacturer();
  /**
   * <pre>
   * Retired fields
   * </pre>
   *
   * <code>optional string effective_manufacturer = 2 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getEffectiveManufacturerBytes();

  /**
   * <code>optional string effective_model = 3 [deprecated = true];</code>
   */
  @java.lang.Deprecated boolean hasEffectiveModel();
  /**
   * <code>optional string effective_model = 3 [deprecated = true];</code>
   */
  @java.lang.Deprecated java.lang.String getEffectiveModel();
  /**
   * <code>optional string effective_model = 3 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getEffectiveModelBytes();

  /**
   * <pre>
   * String identifying the type of printer, used to look up a ppd to drive the
   * printer.
   * </pre>
   *
   * <code>optional string effective_make_and_model = 4;</code>
   */
  boolean hasEffectiveMakeAndModel();
  /**
   * <pre>
   * String identifying the type of printer, used to look up a ppd to drive the
   * printer.
   * </pre>
   *
   * <code>optional string effective_make_and_model = 4;</code>
   */
  java.lang.String getEffectiveMakeAndModel();
  /**
   * <pre>
   * String identifying the type of printer, used to look up a ppd to drive the
   * printer.
   * </pre>
   *
   * <code>optional string effective_make_and_model = 4;</code>
   */
  com.google.protobuf.ByteString
      getEffectiveMakeAndModelBytes();

  /**
   * <pre>
   * True if the printer should be automatically configured, false otherwise.
   * </pre>
   *
   * <code>optional bool autoconf = 5 [default = false];</code>
   */
  boolean hasAutoconf();
  /**
   * <pre>
   * True if the printer should be automatically configured, false otherwise.
   * </pre>
   *
   * <code>optional bool autoconf = 5 [default = false];</code>
   */
  boolean getAutoconf();
}
