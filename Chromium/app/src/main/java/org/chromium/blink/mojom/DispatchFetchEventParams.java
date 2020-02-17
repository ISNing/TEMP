// DispatchFetchEventParams.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/service_worker/dispatch_fetch_event_params.mojom
//

package org.chromium.blink.mojom;


public final class DispatchFetchEventParams extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 40;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(40, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public FetchApiRequest request;
    public String clientId;
    public FetchEventPreloadHandle preloadHandle;
    public WorkerTimingContainer workerTimingRemote;

    private DispatchFetchEventParams(int version) {
        super(STRUCT_SIZE, version);
    }

    public DispatchFetchEventParams() {
        this(0);
    }

    public static DispatchFetchEventParams deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static DispatchFetchEventParams deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static DispatchFetchEventParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        DispatchFetchEventParams result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new DispatchFetchEventParams(elementsOrVersion);
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                result.request = FetchApiRequest.decode(decoder1);
                }
                {
                    
                result.clientId = decoder0.readString(16, false);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, true);
                result.preloadHandle = FetchEventPreloadHandle.decode(decoder1);
                }
                {
                    
                result.workerTimingRemote = decoder0.readServiceInterface(32, true, WorkerTimingContainer.MANAGER);
                }

        } finally {
            decoder0.decreaseStackDepth();
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
        org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        
        encoder0.encode(this.request, 8, false);
        
        encoder0.encode(this.clientId, 16, false);
        
        encoder0.encode(this.preloadHandle, 24, true);
        
        encoder0.encode(this.workerTimingRemote, 32, true, WorkerTimingContainer.MANAGER);
    }
}