// ColorSpaceTransferId.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     ui/gfx/mojom/color_space.mojom
//

package org.chromium.gfx.mojom;

public final class ColorSpaceTransferId {
    private static final boolean IS_EXTENSIBLE = false;

    public static final int INVALID = 0;
    public static final int BT709 = 1; // INVALID + 1
    public static final int BT709_APPLE = 2; // BT709 + 1
    public static final int GAMMA18 = 3; // BT709_APPLE + 1
    public static final int GAMMA22 = 4; // GAMMA18 + 1
    public static final int GAMMA24 = 5; // GAMMA22 + 1
    public static final int GAMMA28 = 6; // GAMMA24 + 1
    public static final int SMPTE170M = 7; // GAMMA28 + 1
    public static final int SMPTE240M = 8; // SMPTE170M + 1
    public static final int LINEAR = 9; // SMPTE240M + 1
    public static final int LOG = 10; // LINEAR + 1
    public static final int LOG_SQRT = 11; // LOG + 1
    public static final int IEC61966_2_4 = 12; // LOG_SQRT + 1
    public static final int BT1361_ECG = 13; // IEC61966_2_4 + 1
    public static final int IEC61966_2_1 = 14; // BT1361_ECG + 1
    public static final int BT2020_10 = 15; // IEC61966_2_1 + 1
    public static final int BT2020_12 = 16; // BT2020_10 + 1
    public static final int SMPTEST2084 = 17; // BT2020_12 + 1
    public static final int SMPTEST428_1 = 18; // SMPTEST2084 + 1
    public static final int ARIB_STD_B67 = 19; // SMPTEST428_1 + 1
    public static final int SMPTEST2084_NON_HDR = 20; // ARIB_STD_B67 + 1
    public static final int IEC61966_2_1_HDR = 21; // SMPTEST2084_NON_HDR + 1
    public static final int LINEAR_HDR = 22; // IEC61966_2_1_HDR + 1
    public static final int CUSTOM = 23; // LINEAR_HDR + 1

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 23;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    private ColorSpaceTransferId() {}
}