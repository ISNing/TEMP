// FetchCacheMode.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/fetch/fetch_api_request.mojom
//

package org.chromium.blink.mojom;

public final class FetchCacheMode {
    private static final boolean IS_EXTENSIBLE = false;

    public static final int DEFAULT = 0;
    public static final int NO_STORE = 1; // DEFAULT + 1
    public static final int BYPASS_CACHE = 2; // NO_STORE + 1
    public static final int VALIDATE_CACHE = 3; // BYPASS_CACHE + 1
    public static final int FORCE_CACHE = 4; // VALIDATE_CACHE + 1
    public static final int ONLY_IF_CACHED = 5; // FORCE_CACHE + 1
    public static final int UNSPECIFIED_ONLY_IF_CACHED_STRICT = 6; // ONLY_IF_CACHED + 1
    public static final int UNSPECIFIED_FORCE_CACHE_MISS = 7; // UNSPECIFIED_ONLY_IF_CACHED_STRICT + 1

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 7;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    private FetchCacheMode() {}
}