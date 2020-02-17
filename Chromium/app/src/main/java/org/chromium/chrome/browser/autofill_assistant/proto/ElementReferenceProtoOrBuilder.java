// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface ElementReferenceProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.ElementReferenceProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * A sequence of CSS selectors. Any non-final CSS selector is expected to
   * arrive at a frame or an iframe, i.e. an element that contains another
   * document.
   * APIs are free to reject element references that do not refer to unique
   * elements (i.e. resolve to more than one element on the page).
   * </pre>
   *
   * <code>repeated string selectors = 2;</code>
   */
  java.util.List<String>
      getSelectorsList();
  /**
   * <pre>
   * A sequence of CSS selectors. Any non-final CSS selector is expected to
   * arrive at a frame or an iframe, i.e. an element that contains another
   * document.
   * APIs are free to reject element references that do not refer to unique
   * elements (i.e. resolve to more than one element on the page).
   * </pre>
   *
   * <code>repeated string selectors = 2;</code>
   */
  int getSelectorsCount();
  /**
   * <pre>
   * A sequence of CSS selectors. Any non-final CSS selector is expected to
   * arrive at a frame or an iframe, i.e. an element that contains another
   * document.
   * APIs are free to reject element references that do not refer to unique
   * elements (i.e. resolve to more than one element on the page).
   * </pre>
   *
   * <code>repeated string selectors = 2;</code>
   */
  java.lang.String getSelectors(int index);
  /**
   * <pre>
   * A sequence of CSS selectors. Any non-final CSS selector is expected to
   * arrive at a frame or an iframe, i.e. an element that contains another
   * document.
   * APIs are free to reject element references that do not refer to unique
   * elements (i.e. resolve to more than one element on the page).
   * </pre>
   *
   * <code>repeated string selectors = 2;</code>
   */
  com.google.protobuf.ByteString
      getSelectorsBytes(int index);

  /**
   * <pre>
   * If non-empty, only take into accounts the elements matched by selector
   * whose inner text matches the given JavaScript regex. This does a search,
   * not a full match. Add ^ and $ as necessary.
   * This is used to filter the elements matching the last selector, before
   * trying to get the pseudo_type, if any was set.
   * </pre>
   *
   * <code>optional string inner_text_pattern = 4;</code>
   */
  boolean hasInnerTextPattern();
  /**
   * <pre>
   * If non-empty, only take into accounts the elements matched by selector
   * whose inner text matches the given JavaScript regex. This does a search,
   * not a full match. Add ^ and $ as necessary.
   * This is used to filter the elements matching the last selector, before
   * trying to get the pseudo_type, if any was set.
   * </pre>
   *
   * <code>optional string inner_text_pattern = 4;</code>
   */
  java.lang.String getInnerTextPattern();
  /**
   * <pre>
   * If non-empty, only take into accounts the elements matched by selector
   * whose inner text matches the given JavaScript regex. This does a search,
   * not a full match. Add ^ and $ as necessary.
   * This is used to filter the elements matching the last selector, before
   * trying to get the pseudo_type, if any was set.
   * </pre>
   *
   * <code>optional string inner_text_pattern = 4;</code>
   */
  com.google.protobuf.ByteString
      getInnerTextPatternBytes();

  /**
   * <pre>
   * If non-empty, only take into accounts the elements matched by selector
   * whose value matches the given JavaScript regex. This does a search,
   * not a full match. Add ^ and $ as necessary.
   * This is used to filter the elements matching the last selector, before
   * trying to get the pseudo_type, if any was set.
   * </pre>
   *
   * <code>optional string value_pattern = 6;</code>
   */
  boolean hasValuePattern();
  /**
   * <pre>
   * If non-empty, only take into accounts the elements matched by selector
   * whose value matches the given JavaScript regex. This does a search,
   * not a full match. Add ^ and $ as necessary.
   * This is used to filter the elements matching the last selector, before
   * trying to get the pseudo_type, if any was set.
   * </pre>
   *
   * <code>optional string value_pattern = 6;</code>
   */
  java.lang.String getValuePattern();
  /**
   * <pre>
   * If non-empty, only take into accounts the elements matched by selector
   * whose value matches the given JavaScript regex. This does a search,
   * not a full match. Add ^ and $ as necessary.
   * This is used to filter the elements matching the last selector, before
   * trying to get the pseudo_type, if any was set.
   * </pre>
   *
   * <code>optional string value_pattern = 6;</code>
   */
  com.google.protobuf.ByteString
      getValuePatternBytes();

  /**
   * <pre>
   * Specifies whether the matched element(s) must be visible.
   * Visibility applies to the element matched in selectors; the pseudo type is
   * checked afterwards.
   * </pre>
   *
   * <code>optional .autofill_assistant.VisibilityRequirement visibility_requirement = 5;</code>
   */
  boolean hasVisibilityRequirement();
  /**
   * <pre>
   * Specifies whether the matched element(s) must be visible.
   * Visibility applies to the element matched in selectors; the pseudo type is
   * checked afterwards.
   * </pre>
   *
   * <code>optional .autofill_assistant.VisibilityRequirement visibility_requirement = 5;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.VisibilityRequirement getVisibilityRequirement();

  /**
   * <pre>
   * An optional pseudo type. This pseudo type is associated to the final
   * element matched, which means that we currently don't handle matching an
   * element inside a pseudo element.
   * </pre>
   *
   * <code>optional .autofill_assistant.PseudoType pseudo_type = 3;</code>
   */
  boolean hasPseudoType();
  /**
   * <pre>
   * An optional pseudo type. This pseudo type is associated to the final
   * element matched, which means that we currently don't handle matching an
   * element inside a pseudo element.
   * </pre>
   *
   * <code>optional .autofill_assistant.PseudoType pseudo_type = 3;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.PseudoType getPseudoType();
}