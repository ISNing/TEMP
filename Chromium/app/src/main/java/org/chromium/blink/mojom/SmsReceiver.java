// SmsReceiver.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/sms/sms_receiver.mojom
//

package org.chromium.blink.mojom;


public interface SmsReceiver extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends SmsReceiver, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<SmsReceiver, SmsReceiver.Proxy> MANAGER = SmsReceiver_Internal.MANAGER;


    void receive(

ReceiveResponse callback);

    interface ReceiveResponse extends org.chromium.mojo.bindings.Callbacks.Callback2<Integer, String> { }



    void abort(
);


}