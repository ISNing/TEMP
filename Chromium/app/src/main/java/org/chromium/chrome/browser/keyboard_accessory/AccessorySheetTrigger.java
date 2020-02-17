
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
    AccessorySheetTrigger.ANY_CLOSE, AccessorySheetTrigger.MANUAL_CLOSE,
    AccessorySheetTrigger.MANUAL_OPEN, AccessorySheetTrigger.COUNT
})
@Retention(RetentionPolicy.SOURCE)
public @interface AccessorySheetTrigger {
  int ANY_CLOSE = 0;
  int MANUAL_CLOSE = 1;
  int MANUAL_OPEN = 2;
  int COUNT = 3;
}
