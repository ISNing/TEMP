// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: session_specifics.proto

package org.chromium.components.sync.protocol;

public interface SessionWindowOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sync_pb.SessionWindow)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Unique (to the owner) id for this window.
   * </pre>
   *
   * <code>optional int32 window_id = 1;</code>
   */
  boolean hasWindowId();
  /**
   * <pre>
   * Unique (to the owner) id for this window.
   * </pre>
   *
   * <code>optional int32 window_id = 1;</code>
   */
  int getWindowId();

  /**
   * <pre>
   * Index of the selected tab in tabs; -1 if no tab is selected.
   * </pre>
   *
   * <code>optional int32 selected_tab_index = 2 [default = -1];</code>
   */
  boolean hasSelectedTabIndex();
  /**
   * <pre>
   * Index of the selected tab in tabs; -1 if no tab is selected.
   * </pre>
   *
   * <code>optional int32 selected_tab_index = 2 [default = -1];</code>
   */
  int getSelectedTabIndex();

  /**
   * <code>optional .sync_pb.SessionWindow.BrowserType browser_type = 3 [default = TYPE_TABBED];</code>
   */
  boolean hasBrowserType();
  /**
   * <code>optional .sync_pb.SessionWindow.BrowserType browser_type = 3 [default = TYPE_TABBED];</code>
   */
  org.chromium.components.sync.protocol.SessionWindow.BrowserType getBrowserType();

  /**
   * <pre>
   * The tabs that compose a window (correspond to tab id's).
   * </pre>
   *
   * <code>repeated int32 tab = 4;</code>
   */
  java.util.List<java.lang.Integer> getTabList();
  /**
   * <pre>
   * The tabs that compose a window (correspond to tab id's).
   * </pre>
   *
   * <code>repeated int32 tab = 4;</code>
   */
  int getTabCount();
  /**
   * <pre>
   * The tabs that compose a window (correspond to tab id's).
   * </pre>
   *
   * <code>repeated int32 tab = 4;</code>
   */
  int getTab(int index);
}
