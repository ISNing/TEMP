// UkmSourceIdFrameHost.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/ukm/ukm.mojom
//

package org.chromium.blink.mojom;


public interface UkmSourceIdFrameHost extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends UkmSourceIdFrameHost, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<UkmSourceIdFrameHost, UkmSourceIdFrameHost.Proxy> MANAGER = UkmSourceIdFrameHost_Internal.MANAGER;


    void setDocumentSourceId(
long sourceId);



    void getNavigationSourceId(

GetNavigationSourceIdResponse callback);

    interface GetNavigationSourceIdResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Long> { }


}