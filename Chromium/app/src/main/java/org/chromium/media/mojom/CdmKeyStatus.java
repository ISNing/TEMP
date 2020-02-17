// CdmKeyStatus.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/mojom/content_decryption_module.mojom
//

package org.chromium.media.mojom;

public final class CdmKeyStatus {
    private static final boolean IS_EXTENSIBLE = false;

    public static final int USABLE = 0;
    public static final int INTERNAL_ERROR = 1; // USABLE + 1
    public static final int EXPIRED = 2; // INTERNAL_ERROR + 1
    public static final int OUTPUT_RESTRICTED = 3; // EXPIRED + 1
    public static final int OUTPUT_DOWNSCALED = 4; // OUTPUT_RESTRICTED + 1
    public static final int KEY_STATUS_PENDING = 5; // OUTPUT_DOWNSCALED + 1
    public static final int RELEASED = 6; // KEY_STATUS_PENDING + 1

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 6;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    private CdmKeyStatus() {}
}