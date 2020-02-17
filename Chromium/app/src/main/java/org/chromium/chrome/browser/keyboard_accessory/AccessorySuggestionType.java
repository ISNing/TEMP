
// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../chrome/browser/password_manager/password_accessory_metrics_util.h

package org.chromium.chrome.browser.keyboard_accessory;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    AccessorySuggestionType.USERNAME, AccessorySuggestionType.PASSWORD,
    AccessorySuggestionType.PAYMENT_INFO, AccessorySuggestionType.ADDRESS_INFO,
    AccessorySuggestionType.TOUCH_TO_FILL_INFO, AccessorySuggestionType.COUNT
})
@Retention(RetentionPolicy.SOURCE)
public @interface AccessorySuggestionType {
  int USERNAME = 0;
  int PASSWORD = 1;
  int PAYMENT_INFO = 2;
  int ADDRESS_INFO = 3;
  int TOUCH_TO_FILL_INFO = 4;
  int COUNT = 5;
}