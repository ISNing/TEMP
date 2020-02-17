// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface DetailsChangesProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.DetailsChangesProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Whether the changes require user approval. This de-emphasize
   * non-highlighted fields.
   * </pre>
   *
   * <code>optional bool user_approval_required = 1;</code>
   */
  boolean hasUserApprovalRequired();
  /**
   * <pre>
   * Whether the changes require user approval. This de-emphasize
   * non-highlighted fields.
   * </pre>
   *
   * <code>optional bool user_approval_required = 1;</code>
   */
  boolean getUserApprovalRequired();

  /**
   * <pre>
   * Whether the title should be highlighted.
   * </pre>
   *
   * <code>optional bool highlight_title = 2;</code>
   */
  boolean hasHighlightTitle();
  /**
   * <pre>
   * Whether the title should be highlighted.
   * </pre>
   *
   * <code>optional bool highlight_title = 2;</code>
   */
  boolean getHighlightTitle();

  /**
   * <pre>
   * Whether the first description line should be highlighted.
   * </pre>
   *
   * <code>optional bool highlight_line1 = 3;</code>
   */
  boolean hasHighlightLine1();
  /**
   * <pre>
   * Whether the first description line should be highlighted.
   * </pre>
   *
   * <code>optional bool highlight_line1 = 3;</code>
   */
  boolean getHighlightLine1();

  /**
   * <pre>
   * Whether the second description line should be highlighted.
   * </pre>
   *
   * <code>optional bool highlight_line2 = 4;</code>
   */
  boolean hasHighlightLine2();
  /**
   * <pre>
   * Whether the second description line should be highlighted.
   * </pre>
   *
   * <code>optional bool highlight_line2 = 4;</code>
   */
  boolean getHighlightLine2();

  /**
   * <pre>
   * Whether the third description line should be highlighted.
   * </pre>
   *
   * <code>optional bool highlight_line3 = 5;</code>
   */
  boolean hasHighlightLine3();
  /**
   * <pre>
   * Whether the third description line should be highlighted.
   * </pre>
   *
   * <code>optional bool highlight_line3 = 5;</code>
   */
  boolean getHighlightLine3();
}