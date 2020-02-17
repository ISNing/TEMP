// CacheStorageError.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/cache_storage/cache_storage.mojom
//

package org.chromium.blink.mojom;

public final class CacheStorageError {
    private static final boolean IS_EXTENSIBLE = false;

    public static final int SUCCESS = 0;
    public static final int ERROR_EXISTS = 1;
    public static final int ERROR_STORAGE = 2;
    public static final int ERROR_NOT_FOUND = 3;
    public static final int ERROR_QUOTA_EXCEEDED = 4;
    public static final int ERROR_CACHE_NAME_NOT_FOUND = 5;
    public static final int ERROR_QUERY_TOO_LARGE = 6;
    public static final int ERROR_NOT_IMPLEMENTED = 7;
    public static final int ERROR_DUPLICATE_OPERATION = 8;

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 8;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    private CacheStorageError() {}
}