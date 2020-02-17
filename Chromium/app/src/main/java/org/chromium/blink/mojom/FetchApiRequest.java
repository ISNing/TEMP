// FetchApiRequest.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/fetch/fetch_api_request.mojom
//

package org.chromium.blink.mojom;


public final class FetchApiRequest extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 104;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(104, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public int mode;
    public boolean isMainResourceLoad;
    public int requestContextType;
    public int frameType;
    public org.chromium.url.mojom.Url url;
    public String method;
    public FetchApiRequestHeaders headers;
    public SerializedBlob blob;
    public FetchApiRequestBody body;
    public Referrer referrer;
    public int credentialsMode;
    public int cacheMode;
    public int redirectMode;
    public String integrity;
    public int priority;
    public org.chromium.mojo_base.mojom.UnguessableToken fetchWindowId;
    public boolean keepalive;
    public boolean isReload;
    public boolean isHistoryNavigation;

    private FetchApiRequest(int version) {
        super(STRUCT_SIZE, version);
        this.mode = (int) org.chromium.network.mojom.RequestMode.NO_CORS;
        this.isMainResourceLoad = (boolean) false;
        this.requestContextType = (int) RequestContextType.UNSPECIFIED;
        this.frameType = (int) org.chromium.network.mojom.RequestContextFrameType.NONE;
        this.credentialsMode = (int) org.chromium.network.mojom.CredentialsMode.OMIT;
        this.cacheMode = (int) FetchCacheMode.DEFAULT;
        this.redirectMode = (int) org.chromium.network.mojom.RedirectMode.FOLLOW;
        this.priority = (int) org.chromium.network.mojom.RequestPriority.IDLE;
        this.keepalive = (boolean) false;
        this.isReload = (boolean) false;
        this.isHistoryNavigation = (boolean) false;
    }

    public FetchApiRequest() {
        this(0);
    }

    public static FetchApiRequest deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static FetchApiRequest deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static FetchApiRequest decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        FetchApiRequest result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new FetchApiRequest(elementsOrVersion);
                {
                    
                result.mode = decoder0.readInt(8);
                    org.chromium.network.mojom.RequestMode.validate(result.mode);
                }
                {
                    
                result.isMainResourceLoad = decoder0.readBoolean(12, 0);
                }
                {
                    
                result.keepalive = decoder0.readBoolean(12, 1);
                }
                {
                    
                result.isReload = decoder0.readBoolean(12, 2);
                }
                {
                    
                result.isHistoryNavigation = decoder0.readBoolean(12, 3);
                }
                {
                    
                result.requestContextType = decoder0.readInt(16);
                    RequestContextType.validate(result.requestContextType);
                }
                {
                    
                result.frameType = decoder0.readInt(20);
                    org.chromium.network.mojom.RequestContextFrameType.validate(result.frameType);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, false);
                result.url = org.chromium.url.mojom.Url.decode(decoder1);
                }
                {
                    
                result.method = decoder0.readString(32, false);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(40, false);
                result.headers = FetchApiRequestHeaders.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(48, true);
                result.blob = SerializedBlob.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(56, true);
                result.body = FetchApiRequestBody.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(64, true);
                result.referrer = Referrer.decode(decoder1);
                }
                {
                    
                result.credentialsMode = decoder0.readInt(72);
                    org.chromium.network.mojom.CredentialsMode.validate(result.credentialsMode);
                }
                {
                    
                result.cacheMode = decoder0.readInt(76);
                    FetchCacheMode.validate(result.cacheMode);
                }
                {
                    
                result.redirectMode = decoder0.readInt(80);
                    org.chromium.network.mojom.RedirectMode.validate(result.redirectMode);
                }
                {
                    
                result.priority = decoder0.readInt(84);
                    org.chromium.network.mojom.RequestPriority.validate(result.priority);
                }
                {
                    
                result.integrity = decoder0.readString(88, true);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(96, true);
                result.fetchWindowId = org.chromium.mojo_base.mojom.UnguessableToken.decode(decoder1);
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
        
        encoder0.encode(this.mode, 8);
        
        encoder0.encode(this.isMainResourceLoad, 12, 0);
        
        encoder0.encode(this.keepalive, 12, 1);
        
        encoder0.encode(this.isReload, 12, 2);
        
        encoder0.encode(this.isHistoryNavigation, 12, 3);
        
        encoder0.encode(this.requestContextType, 16);
        
        encoder0.encode(this.frameType, 20);
        
        encoder0.encode(this.url, 24, false);
        
        encoder0.encode(this.method, 32, false);
        
        encoder0.encode(this.headers, 40, false);
        
        encoder0.encode(this.blob, 48, true);
        
        encoder0.encode(this.body, 56, true);
        
        encoder0.encode(this.referrer, 64, true);
        
        encoder0.encode(this.credentialsMode, 72);
        
        encoder0.encode(this.cacheMode, 76);
        
        encoder0.encode(this.redirectMode, 80);
        
        encoder0.encode(this.priority, 84);
        
        encoder0.encode(this.integrity, 88, true);
        
        encoder0.encode(this.fetchWindowId, 96, true);
    }
}