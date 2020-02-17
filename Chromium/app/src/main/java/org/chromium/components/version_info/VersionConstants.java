// Copyright 2018 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.components.version_info;

import org.chromium.base.annotations.MainDex;

// Constants shared by Android Chrome and WebView. Chrome specific constants are
// in ChromeVersionConstants.
@MainDex
public class VersionConstants {
    public static final String PRODUCT_VERSION = "80.0.3987.99";
    @SuppressWarnings({"ComplexBooleanConstant", "IdentityBinaryExpression"})
    public static final boolean IS_OFFICIAL_BUILD = 1 == 1;

    public static final int PRODUCT_MAJOR_VERSION = 80;
    public static final int PRODUCT_BUILD_VERSION = 3987;

    public static final int CHANNEL = Channel.STABLE;
}
