// CdmService.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/mojom/cdm_service.mojom
//

package org.chromium.media.mojom;


public interface CdmService extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends CdmService, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<CdmService, CdmService.Proxy> MANAGER = CdmService_Internal.MANAGER;


    void loadCdm(
org.chromium.mojo_base.mojom.FilePath cdmPath);



    void createCdmFactory(
org.chromium.mojo.bindings.InterfaceRequest<CdmFactory> factory, org.chromium.service_manager.mojom.InterfaceProvider hostInterfaces);


}
