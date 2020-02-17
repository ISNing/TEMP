
// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../components/autofill/core/browser/ui/accessory_sheet_enums.h

package org.chromium.chrome.browser.keyboard_accessory;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    AccessoryAction.GENERATE_PASSWORD_AUTOMATIC, AccessoryAction.MANAGE_PASSWORDS,
    AccessoryAction.AUTOFILL_SUGGESTION, AccessoryAction.MANAGE_CREDIT_CARDS,
    AccessoryAction.MANAGE_ADDRESSES, AccessoryAction.GENERATE_PASSWORD_MANUAL,
    AccessoryAction.COUNT
})
@Retention(RetentionPolicy.SOURCE)
public @interface AccessoryAction {
  int GENERATE_PASSWORD_AUTOMATIC = 0;
  int MANAGE_PASSWORDS = 1;
  int AUTOFILL_SUGGESTION = 2;
  int MANAGE_CREDIT_CARDS = 3;
  int MANAGE_ADDRESSES = 4;
  int GENERATE_PASSWORD_MANUAL = 5;
  int COUNT = 6;
}
