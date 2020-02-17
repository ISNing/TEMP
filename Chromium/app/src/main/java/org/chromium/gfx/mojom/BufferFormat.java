// BufferFormat.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     ui/gfx/mojom/buffer_types.mojom
//

package org.chromium.gfx.mojom;

public final class BufferFormat {
    private static final boolean IS_EXTENSIBLE = false;

    public static final int R_8 = 0;
    public static final int R_16 = 1; // R_8 + 1
    public static final int RG_88 = 2; // R_16 + 1
    public static final int BGR_565 = 3; // RG_88 + 1
    public static final int RGBA_4444 = 4; // BGR_565 + 1
    public static final int RGBX_8888 = 5; // RGBA_4444 + 1
    public static final int RGBA_8888 = 6; // RGBX_8888 + 1
    public static final int BGRX_8888 = 7; // RGBA_8888 + 1
    public static final int BGRX_1010102 = 8; // BGRX_8888 + 1
    public static final int RGBX_1010102 = 9; // BGRX_1010102 + 1
    public static final int BGRA_8888 = 10; // RGBX_1010102 + 1
    public static final int RGBA_F16 = 11; // BGRA_8888 + 1
    public static final int YVU_420 = 12; // RGBA_F16 + 1
    public static final int YUV_420_BIPLANAR = 13; // YVU_420 + 1
    public static final int P010 = 14; // YUV_420_BIPLANAR + 1

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 14;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    private BufferFormat() {}
}