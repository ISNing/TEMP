// DataElement.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/url_loader.mojom
//

package org.chromium.network.mojom;


public final class DataElement extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 88;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(88, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public int type;
    public byte[] buf;
    public org.chromium.mojo_base.mojom.FilePath path;
    public org.chromium.mojo_base.mojom.File file;
    public String blobUuid;
    public DataPipeGetter dataPipeGetter;
    public ChunkedDataPipeGetter chunkedDataPipeGetter;
    public long offset;
    public long length;
    public org.chromium.mojo_base.mojom.Time expectedModificationTime;

    private DataElement(int version) {
        super(STRUCT_SIZE, version);
    }

    public DataElement() {
        this(0);
    }

    public static DataElement deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static DataElement deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static DataElement decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        DataElement result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new DataElement(elementsOrVersion);
                {
                    
                result.type = decoder0.readInt(8);
                    DataElementType.validate(result.type);
                }
                {
                    
                result.buf = decoder0.readBytes(16, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, false);
                result.path = org.chromium.mojo_base.mojom.FilePath.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(32, true);
                result.file = org.chromium.mojo_base.mojom.File.decode(decoder1);
                }
                {
                    
                result.blobUuid = decoder0.readString(40, true);
                }
                {
                    
                result.dataPipeGetter = decoder0.readServiceInterface(48, true, DataPipeGetter.MANAGER);
                }
                {
                    
                result.chunkedDataPipeGetter = decoder0.readServiceInterface(56, true, ChunkedDataPipeGetter.MANAGER);
                }
                {
                    
                result.offset = decoder0.readLong(64);
                }
                {
                    
                result.length = decoder0.readLong(72);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(80, false);
                result.expectedModificationTime = org.chromium.mojo_base.mojom.Time.decode(decoder1);
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
        
        encoder0.encode(this.type, 8);
        
        encoder0.encode(this.buf, 16, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
        
        encoder0.encode(this.path, 24, false);
        
        encoder0.encode(this.file, 32, true);
        
        encoder0.encode(this.blobUuid, 40, true);
        
        encoder0.encode(this.dataPipeGetter, 48, true, DataPipeGetter.MANAGER);
        
        encoder0.encode(this.chunkedDataPipeGetter, 56, true, ChunkedDataPipeGetter.MANAGER);
        
        encoder0.encode(this.offset, 64);
        
        encoder0.encode(this.length, 72);
        
        encoder0.encode(this.expectedModificationTime, 80, false);
    }
}