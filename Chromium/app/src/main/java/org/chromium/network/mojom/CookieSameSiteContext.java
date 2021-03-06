// CookieSameSiteContext.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/cookie_manager.mojom
//

package org.chromium.network.mojom;

public final class CookieSameSiteContext {
    private static final boolean IS_EXTENSIBLE = false;

    public static final int CROSS_SITE = 0;
    public static final int SAME_SITE_LAX_METHOD_UNSAFE = 1; // CROSS_SITE + 1
    public static final int SAME_SITE_LAX = 2; // SAME_SITE_LAX_METHOD_UNSAFE + 1
    public static final int SAME_SITE_STRICT = 3; // SAME_SITE_LAX + 1
    public static final int SAME_SITE_LAX_METHOD_UNSAFE_CROSS_SCHEME_SECURE_URL = 4; // SAME_SITE_STRICT + 1
    public static final int SAME_SITE_LAX_CROSS_SCHEME_SECURE_URL = 5; // SAME_SITE_LAX_METHOD_UNSAFE_CROSS_SCHEME_SECURE_URL + 1
    public static final int SAME_SITE_STRICT_CROSS_SCHEME_SECURE_URL = 6; // SAME_SITE_LAX_CROSS_SCHEME_SECURE_URL + 1
    public static final int SAME_SITE_LAX_METHOD_UNSAFE_CROSS_SCHEME_INSECURE_URL = 7; // SAME_SITE_STRICT_CROSS_SCHEME_SECURE_URL + 1
    public static final int SAME_SITE_LAX_CROSS_SCHEME_INSECURE_URL = 8; // SAME_SITE_LAX_METHOD_UNSAFE_CROSS_SCHEME_INSECURE_URL + 1
    public static final int SAME_SITE_STRICT_CROSS_SCHEME_INSECURE_URL = 9; // SAME_SITE_LAX_CROSS_SCHEME_INSECURE_URL + 1

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 9;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    private CookieSameSiteContext() {}
}