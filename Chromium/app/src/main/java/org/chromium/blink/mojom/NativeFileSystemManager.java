// NativeFileSystemManager.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/native_file_system/native_file_system_manager.mojom
//

package org.chromium.blink.mojom;


public interface NativeFileSystemManager extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends NativeFileSystemManager, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<NativeFileSystemManager, NativeFileSystemManager.Proxy> MANAGER = NativeFileSystemManager_Internal.MANAGER;


    void getSandboxedFileSystem(

GetSandboxedFileSystemResponse callback);

    interface GetSandboxedFileSystemResponse extends org.chromium.mojo.bindings.Callbacks.Callback2<NativeFileSystemError, NativeFileSystemDirectoryHandle> { }



    void chooseEntries(
int type, ChooseFileSystemEntryAcceptsOption[] accepts, boolean includeAcceptsAll, 
ChooseEntriesResponse callback);

    interface ChooseEntriesResponse extends org.chromium.mojo.bindings.Callbacks.Callback2<NativeFileSystemError, NativeFileSystemEntry[]> { }



    void getFileHandleFromToken(
NativeFileSystemTransferToken token, org.chromium.mojo.bindings.InterfaceRequest<NativeFileSystemFileHandle> fileHandle);



    void getDirectoryHandleFromToken(
NativeFileSystemTransferToken token, org.chromium.mojo.bindings.InterfaceRequest<NativeFileSystemDirectoryHandle> directoryHandle);


}
