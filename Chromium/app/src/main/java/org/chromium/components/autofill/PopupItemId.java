
// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../components/autofill/core/browser/ui/popup_item_ids.h

package org.chromium.components.autofill;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    PopupItemId.ITEM_ID_AUTOCOMPLETE_ENTRY,
    PopupItemId.ITEM_ID_INSECURE_CONTEXT_PAYMENT_DISABLED_MESSAGE,
    PopupItemId.ITEM_ID_PASSWORD_ENTRY, PopupItemId.ITEM_ID_SEPARATOR,
    PopupItemId.ITEM_ID_CLEAR_FORM, PopupItemId.ITEM_ID_AUTOFILL_OPTIONS,
    PopupItemId.ITEM_ID_DATALIST_ENTRY, PopupItemId.ITEM_ID_SCAN_CREDIT_CARD,
    PopupItemId.ITEM_ID_TITLE, PopupItemId.ITEM_ID_CREDIT_CARD_SIGNIN_PROMO,
    PopupItemId.ITEM_ID_USERNAME_ENTRY, PopupItemId.ITEM_ID_CREATE_HINT,
    PopupItemId.ITEM_ID_ALL_SAVED_PASSWORDS_ENTRY, PopupItemId.ITEM_ID_GENERATE_PASSWORD_ENTRY,
    PopupItemId.ITEM_ID_SHOW_ACCOUNT_CARDS, PopupItemId.ITEM_ID_PASSWORD_ACCOUNT_STORAGE_OPTIN,
    PopupItemId.ITEM_ID_HIDE_AUTOFILL_SUGGESTIONS
})
@Retention(RetentionPolicy.SOURCE)
public @interface PopupItemId {
  int ITEM_ID_AUTOCOMPLETE_ENTRY = 0;
  int ITEM_ID_INSECURE_CONTEXT_PAYMENT_DISABLED_MESSAGE = -1;
  int ITEM_ID_PASSWORD_ENTRY = -2;
  int ITEM_ID_SEPARATOR = -3;
  int ITEM_ID_CLEAR_FORM = -4;
  int ITEM_ID_AUTOFILL_OPTIONS = -5;
  int ITEM_ID_DATALIST_ENTRY = -6;
  int ITEM_ID_SCAN_CREDIT_CARD = -7;
  int ITEM_ID_TITLE = -8;
  int ITEM_ID_CREDIT_CARD_SIGNIN_PROMO = -9;
  int ITEM_ID_USERNAME_ENTRY = -11;
  int ITEM_ID_CREATE_HINT = -12;
  int ITEM_ID_ALL_SAVED_PASSWORDS_ENTRY = -13;
  int ITEM_ID_GENERATE_PASSWORD_ENTRY = -14;
  int ITEM_ID_SHOW_ACCOUNT_CARDS = -15;
  int ITEM_ID_PASSWORD_ACCOUNT_STORAGE_OPTIN = -16;
  int ITEM_ID_HIDE_AUTOFILL_SUGGESTIONS = -17;
}
