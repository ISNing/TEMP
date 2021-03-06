// PlatformVerification.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/mojom/platform_verification.mojom
//

package org.chromium.media.mojom;


public interface PlatformVerification extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends PlatformVerification, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<PlatformVerification, PlatformVerification.Proxy> MANAGER = PlatformVerification_Internal.MANAGER;


    void challengePlatform(
String serviceId, String challenge, 
ChallengePlatformResponse callback);

    interface ChallengePlatformResponse extends org.chromium.mojo.bindings.Callbacks.Callback4<Boolean, String, String, String> { }



    void getStorageId(
int version, 
GetStorageIdResponse callback);

    interface GetStorageIdResponse extends org.chromium.mojo.bindings.Callbacks.Callback2<Integer, byte[]> { }


}
