// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface CounterInputProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.CounterInputProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * An optional label shown above the different counters.
   * </pre>
   *
   * <code>optional string label = 1;</code>
   */
  boolean hasLabel();
  /**
   * <pre>
   * An optional label shown above the different counters.
   * </pre>
   *
   * <code>optional string label = 1;</code>
   */
  java.lang.String getLabel();
  /**
   * <pre>
   * An optional label shown above the different counters.
   * </pre>
   *
   * <code>optional string label = 1;</code>
   */
  com.google.protobuf.ByteString
      getLabelBytes();

  /**
   * <pre>
   * The counters to display.
   * </pre>
   *
   * <code>repeated .autofill_assistant.CounterInputProto.Counter counters = 2;</code>
   */
  java.util.List<org.chromium.chrome.browser.autofill_assistant.proto.CounterInputProto.Counter> 
      getCountersList();
  /**
   * <pre>
   * The counters to display.
   * </pre>
   *
   * <code>repeated .autofill_assistant.CounterInputProto.Counter counters = 2;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.CounterInputProto.Counter getCounters(int index);
  /**
   * <pre>
   * The counters to display.
   * </pre>
   *
   * <code>repeated .autofill_assistant.CounterInputProto.Counter counters = 2;</code>
   */
  int getCountersCount();

  /**
   * <pre>
   * If specified, the input will initially display maximum |minimized_count|
   * counters. If |counters|.size &gt; |minimized_count|, the remaining counters
   * will be displayed in an expandable section below the first
   * |minimized_count| counters. Setting this value will have no effect if
   * |expand_text| and |minimize_text| are not set.
   * </pre>
   *
   * <code>optional int32 minimized_count = 3 [default = 2147483647];</code>
   */
  boolean hasMinimizedCount();
  /**
   * <pre>
   * If specified, the input will initially display maximum |minimized_count|
   * counters. If |counters|.size &gt; |minimized_count|, the remaining counters
   * will be displayed in an expandable section below the first
   * |minimized_count| counters. Setting this value will have no effect if
   * |expand_text| and |minimize_text| are not set.
   * </pre>
   *
   * <code>optional int32 minimized_count = 3 [default = 2147483647];</code>
   */
  int getMinimizedCount();

  /**
   * <pre>
   * Text shown when counters are inside the expandable section and the section
   * is minimized. Clicking this text will expand the section and show the
   * remaining counters.
   * </pre>
   *
   * <code>optional string expand_text = 4;</code>
   */
  boolean hasExpandText();
  /**
   * <pre>
   * Text shown when counters are inside the expandable section and the section
   * is minimized. Clicking this text will expand the section and show the
   * remaining counters.
   * </pre>
   *
   * <code>optional string expand_text = 4;</code>
   */
  java.lang.String getExpandText();
  /**
   * <pre>
   * Text shown when counters are inside the expandable section and the section
   * is minimized. Clicking this text will expand the section and show the
   * remaining counters.
   * </pre>
   *
   * <code>optional string expand_text = 4;</code>
   */
  com.google.protobuf.ByteString
      getExpandTextBytes();

  /**
   * <pre>
   * Text shown when counters are inside the expandable section and the section
   * is expanded. Clicking this text will minimize the section and hide the
   * counters inside it.
   * </pre>
   *
   * <code>optional string minimize_text = 5;</code>
   */
  boolean hasMinimizeText();
  /**
   * <pre>
   * Text shown when counters are inside the expandable section and the section
   * is expanded. Clicking this text will minimize the section and hide the
   * counters inside it.
   * </pre>
   *
   * <code>optional string minimize_text = 5;</code>
   */
  java.lang.String getMinimizeText();
  /**
   * <pre>
   * Text shown when counters are inside the expandable section and the section
   * is expanded. Clicking this text will minimize the section and hide the
   * counters inside it.
   * </pre>
   *
   * <code>optional string minimize_text = 5;</code>
   */
  com.google.protobuf.ByteString
      getMinimizeTextBytes();

  /**
   * <pre>
   * Validation rule used to check whether the current values of this input are
   * valid.
   * </pre>
   *
   * <code>optional .autofill_assistant.CounterInputProto.ValidationRule validation_rule = 6;</code>
   */
  boolean hasValidationRule();
  /**
   * <pre>
   * Validation rule used to check whether the current values of this input are
   * valid.
   * </pre>
   *
   * <code>optional .autofill_assistant.CounterInputProto.ValidationRule validation_rule = 6;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.CounterInputProto.ValidationRule getValidationRule();

  /**
   * <pre>
   * The minimum value of the sum of the counters. All counters decrease button
   * will be disabled if sum &lt;= min_counters_sum.
   * </pre>
   *
   * <code>optional int64 min_counters_sum = 7 [default = -9223372036854775808];</code>
   */
  boolean hasMinCountersSum();
  /**
   * <pre>
   * The minimum value of the sum of the counters. All counters decrease button
   * will be disabled if sum &lt;= min_counters_sum.
   * </pre>
   *
   * <code>optional int64 min_counters_sum = 7 [default = -9223372036854775808];</code>
   */
  long getMinCountersSum();

  /**
   * <pre>
   * The maximum value of the sum of the counters. All counters increase button
   * will be disabled if sum &gt;= max_counters_sum.
   * </pre>
   *
   * <code>optional int64 max_counters_sum = 8 [default = 9223372036854775807];</code>
   */
  boolean hasMaxCountersSum();
  /**
   * <pre>
   * The maximum value of the sum of the counters. All counters increase button
   * will be disabled if sum &gt;= max_counters_sum.
   * </pre>
   *
   * <code>optional int64 max_counters_sum = 8 [default = 9223372036854775807];</code>
   */
  long getMaxCountersSum();
}