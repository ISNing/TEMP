// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.net.impl;

// Version based on chrome/VERSION.
public class ImplVersion {
    private static final String CRONET_VERSION = "80.0.3987.99";
    private static final int API_LEVEL = 12;
    private static final String LAST_CHANGE = "a9b97dff480d5c50843b5190c4d02373a0fc6d84-refs/branch-heads/3987@{#863}";

   /**
    * Private constructor. All members of this class should be static.
    */
    private ImplVersion() {}

    public static String getCronetVersionWithLastChange() {
        return CRONET_VERSION + "@" + LAST_CHANGE.substring(0, 8);
    }

    public static int getApiLevel() {
        return API_LEVEL;
    }

    public static String getCronetVersion() {
        return CRONET_VERSION;
    }

    public static String getLastChange() {
        return LAST_CHANGE;
    }
}
