// VideoDecoder.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/mojom/video_decoder.mojom
//

package org.chromium.media.mojom;


public interface VideoDecoder extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends VideoDecoder, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<VideoDecoder, VideoDecoder.Proxy> MANAGER = VideoDecoder_Internal.MANAGER;


    void getSupportedConfigs(

GetSupportedConfigsResponse callback);

    interface GetSupportedConfigsResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<java.util.Map<Integer, SupportedVideoDecoderConfig[]>> { }



    void construct(
org.chromium.mojo.bindings.AssociatedInterfaceNotSupported client, org.chromium.mojo.bindings.AssociatedInterfaceNotSupported mediaLog, org.chromium.mojo.bindings.InterfaceRequest<VideoFrameHandleReleaser> videoFrameHandleReleaser, org.chromium.mojo.system.DataPipe.ConsumerHandle decoderBufferPipe, CommandBufferId commandBufferId, int implementation, org.chromium.gfx.mojom.ColorSpace targetColorSpace);



    void initialize(
VideoDecoderConfig config, boolean lowDelay, int cdmId, 
InitializeResponse callback);

    interface InitializeResponse extends org.chromium.mojo.bindings.Callbacks.Callback3<Boolean, Boolean, Integer> { }



    void decode(
DecoderBuffer buffer, 
DecodeResponse callback);

    interface DecodeResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }



    void reset(

ResetResponse callback);

    interface ResetResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }



    void onOverlayInfoChanged(
OverlayInfo overlayInfo);


}