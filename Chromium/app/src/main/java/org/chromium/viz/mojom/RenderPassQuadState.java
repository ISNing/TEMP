// RenderPassQuadState.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/viz/public/mojom/compositing/quads.mojom
//

package org.chromium.viz.mojom;


public final class RenderPassQuadState extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 72;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(72, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public long renderPassId;
    public int maskResourceId;
    public org.chromium.gfx.mojom.RectF maskUvRect;
    public org.chromium.gfx.mojom.Size maskTextureSize;
    public org.chromium.gfx.mojom.Vector2dF filtersScale;
    public org.chromium.gfx.mojom.PointF filtersOrigin;
    public org.chromium.gfx.mojom.RectF texCoordRect;
    public boolean forceAntiAliasingOff;
    public float backdropFilterQuality;

    private RenderPassQuadState(int version) {
        super(STRUCT_SIZE, version);
    }

    public RenderPassQuadState() {
        this(0);
    }

    public static RenderPassQuadState deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static RenderPassQuadState deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static RenderPassQuadState decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        RenderPassQuadState result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new RenderPassQuadState(elementsOrVersion);
                {
                    
                result.renderPassId = decoder0.readLong(8);
                }
                {
                    
                result.maskResourceId = decoder0.readInt(16);
                }
                {
                    
                result.forceAntiAliasingOff = decoder0.readBoolean(20, 0);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, false);
                result.maskUvRect = org.chromium.gfx.mojom.RectF.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(32, false);
                result.maskTextureSize = org.chromium.gfx.mojom.Size.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(40, false);
                result.filtersScale = org.chromium.gfx.mojom.Vector2dF.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(48, false);
                result.filtersOrigin = org.chromium.gfx.mojom.PointF.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(56, false);
                result.texCoordRect = org.chromium.gfx.mojom.RectF.decode(decoder1);
                }
                {
                    
                result.backdropFilterQuality = decoder0.readFloat(64);
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
        
        encoder0.encode(this.renderPassId, 8);
        
        encoder0.encode(this.maskResourceId, 16);
        
        encoder0.encode(this.forceAntiAliasingOff, 20, 0);
        
        encoder0.encode(this.maskUvRect, 24, false);
        
        encoder0.encode(this.maskTextureSize, 32, false);
        
        encoder0.encode(this.filtersScale, 40, false);
        
        encoder0.encode(this.filtersOrigin, 48, false);
        
        encoder0.encode(this.texCoordRect, 56, false);
        
        encoder0.encode(this.backdropFilterQuality, 64);
    }
}