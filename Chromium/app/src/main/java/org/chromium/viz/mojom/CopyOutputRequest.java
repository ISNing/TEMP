// CopyOutputRequest.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/viz/public/mojom/compositing/copy_output_request.mojom
//

package org.chromium.viz.mojom;


public final class CopyOutputRequest extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 64;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(64, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public int resultFormat;
    public org.chromium.gfx.mojom.Vector2d scaleFrom;
    public org.chromium.gfx.mojom.Vector2d scaleTo;
    public org.chromium.mojo_base.mojom.UnguessableToken source;
    public org.chromium.gfx.mojom.Rect area;
    public org.chromium.gfx.mojom.Rect resultSelection;
    public CopyOutputResultSender resultSender;

    private CopyOutputRequest(int version) {
        super(STRUCT_SIZE, version);
    }

    public CopyOutputRequest() {
        this(0);
    }

    public static CopyOutputRequest deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static CopyOutputRequest deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static CopyOutputRequest decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        CopyOutputRequest result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new CopyOutputRequest(elementsOrVersion);
                {
                    
                result.resultFormat = decoder0.readInt(8);
                    CopyOutputResultFormat.validate(result.resultFormat);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                result.scaleFrom = org.chromium.gfx.mojom.Vector2d.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, false);
                result.scaleTo = org.chromium.gfx.mojom.Vector2d.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(32, true);
                result.source = org.chromium.mojo_base.mojom.UnguessableToken.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(40, true);
                result.area = org.chromium.gfx.mojom.Rect.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(48, true);
                result.resultSelection = org.chromium.gfx.mojom.Rect.decode(decoder1);
                }
                {
                    
                result.resultSender = decoder0.readServiceInterface(56, false, CopyOutputResultSender.MANAGER);
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
        
        encoder0.encode(this.resultFormat, 8);
        
        encoder0.encode(this.scaleFrom, 16, false);
        
        encoder0.encode(this.scaleTo, 24, false);
        
        encoder0.encode(this.source, 32, true);
        
        encoder0.encode(this.area, 40, true);
        
        encoder0.encode(this.resultSelection, 48, true);
        
        encoder0.encode(this.resultSender, 56, false, CopyOutputResultSender.MANAGER);
    }
}