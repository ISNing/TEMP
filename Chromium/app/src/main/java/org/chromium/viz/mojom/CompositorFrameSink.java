// CompositorFrameSink.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/viz/public/mojom/compositing/compositor_frame_sink.mojom
//

package org.chromium.viz.mojom;


public interface CompositorFrameSink extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends CompositorFrameSink, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<CompositorFrameSink, CompositorFrameSink.Proxy> MANAGER = CompositorFrameSink_Internal.MANAGER;


    void setNeedsBeginFrame(
boolean needsBeginFrame);



    void setWantsAnimateOnlyBeginFrames(
);



    void submitCompositorFrame(
LocalSurfaceId localSurfaceId, CompositorFrame frame, HitTestRegionList hitTestRegionList, long submitTime);



    void submitCompositorFrameSync(
LocalSurfaceId localSurfaceId, CompositorFrame frame, HitTestRegionList hitTestRegionList, long submitTime, 
SubmitCompositorFrameSyncResponse callback);

    interface SubmitCompositorFrameSyncResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<ReturnedResource[]> { }



    void didNotProduceFrame(
BeginFrameAck ack);



    void didAllocateSharedBitmap(
org.chromium.mojo_base.mojom.ReadOnlySharedMemoryRegion region, org.chromium.gpu.mojom.Mailbox id);



    void didDeleteSharedBitmap(
org.chromium.gpu.mojom.Mailbox id);


}
