// VirtualAuthenticator.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/webauthn/virtual_authenticator.mojom
//

package org.chromium.blink.test.mojom;


public interface VirtualAuthenticator extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends VirtualAuthenticator, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<VirtualAuthenticator, VirtualAuthenticator.Proxy> MANAGER = VirtualAuthenticator_Internal.MANAGER;


    void getUniqueId(

GetUniqueIdResponse callback);

    interface GetUniqueIdResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<String> { }



    void addRegistration(
RegisteredKey key, 
AddRegistrationResponse callback);

    interface AddRegistrationResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Boolean> { }



    void getRegistrations(

GetRegistrationsResponse callback);

    interface GetRegistrationsResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<RegisteredKey[]> { }



    void removeRegistration(
byte[] keyHandle, 
RemoveRegistrationResponse callback);

    interface RemoveRegistrationResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Boolean> { }



    void clearRegistrations(

ClearRegistrationsResponse callback);

    interface ClearRegistrationsResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }



    void setUserVerified(
boolean verified, 
SetUserVerifiedResponse callback);

    interface SetUserVerifiedResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }


}
