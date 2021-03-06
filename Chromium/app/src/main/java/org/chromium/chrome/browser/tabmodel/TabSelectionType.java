
// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../chrome/browser/ui/android/tab_model/tab_model.h

package org.chromium.chrome.browser.tabmodel;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    TabSelectionType.FROM_CLOSE, TabSelectionType.FROM_EXIT, TabSelectionType.FROM_NEW,
    TabSelectionType.FROM_USER, TabSelectionType.SIZE
})
@Retention(RetentionPolicy.SOURCE)
public @interface TabSelectionType {
  /**
   * Selection of adjacent tab when the active tab is closed in foreground.
   */
  int FROM_CLOSE = 0;
  /**
   * Selection of adjacent tab when the active tab is closed upon app exit.
   */
  int FROM_EXIT = 1;
  /**
   * Selection of newly created tab (e.g. for a URL intent or NTP).
   */
  int FROM_NEW = 2;
  /**
   * User-originated switch to existing tab or selection of main tab on app startup.
   */
  int FROM_USER = 3;
  /**
   * Must be last.
   */
  int SIZE = 4;
}
