// ImageDecodeAcceleratorType.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     gpu/ipc/common/gpu_info.mojom
//

package org.chromium.gpu.mojom;

public final class ImageDecodeAcceleratorType {
    private static final boolean IS_EXTENSIBLE = false;

    public static final int JPEG = 0;
    public static final int WEB_P = 1; // JPEG + 1
    public static final int UNKNOWN = 2; // WEB_P + 1

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 2;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    private ImageDecodeAcceleratorType() {}
}