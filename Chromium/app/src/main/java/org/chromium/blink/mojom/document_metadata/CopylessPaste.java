// CopylessPaste.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/document_metadata/copyless_paste.mojom
//

package org.chromium.blink.mojom.document_metadata;


public interface CopylessPaste extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends CopylessPaste, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<CopylessPaste, CopylessPaste.Proxy> MANAGER = CopylessPaste_Internal.MANAGER;


    void getEntities(

GetEntitiesResponse callback);

    interface GetEntitiesResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<WebPage> { }


}
