// StorageType.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/quota/quota_types.mojom
//

package org.chromium.blink.mojom;

public final class StorageType {
    private static final boolean IS_EXTENSIBLE = false;

    public static final int TEMPORARY = 0;
    public static final int PERSISTENT = 1; // TEMPORARY + 1
    public static final int SYNCABLE = 2; // PERSISTENT + 1
    public static final int QUOTA_NOT_MANAGED = 3; // SYNCABLE + 1
    public static final int UNKNOWN = 4; // QUOTA_NOT_MANAGED + 1

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 4;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    private StorageType() {}
}