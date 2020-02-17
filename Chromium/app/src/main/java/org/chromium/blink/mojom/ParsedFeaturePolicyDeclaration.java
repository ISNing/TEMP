// ParsedFeaturePolicyDeclaration.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/feature_policy/feature_policy.mojom
//

package org.chromium.blink.mojom;


public final class ParsedFeaturePolicyDeclaration extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 40;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(40, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public int feature;
    public java.util.Map<org.chromium.url.internal.mojom.Origin, PolicyValue> values;
    public PolicyValue fallbackValue;
    public PolicyValue opaqueValue;

    private ParsedFeaturePolicyDeclaration(int version) {
        super(STRUCT_SIZE, version);
    }

    public ParsedFeaturePolicyDeclaration() {
        this(0);
    }

    public static ParsedFeaturePolicyDeclaration deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static ParsedFeaturePolicyDeclaration deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static ParsedFeaturePolicyDeclaration decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        ParsedFeaturePolicyDeclaration result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new ParsedFeaturePolicyDeclaration(elementsOrVersion);
                {
                    
                result.feature = decoder0.readInt(8);
                    FeaturePolicyFeature.validate(result.feature);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                {
                    decoder1.readDataHeaderForMap();
                    org.chromium.url.internal.mojom.Origin[] keys0;
                    PolicyValue[] values0;
                    {
                        
                        org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                        {
                            org.chromium.mojo.bindings.DataHeader si2 = decoder2.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                            keys0 = new org.chromium.url.internal.mojom.Origin[si2.elementsOrVersion];
                            for (int i2 = 0; i2 < si2.elementsOrVersion; ++i2) {
                                
                                org.chromium.mojo.bindings.Decoder decoder3 = decoder2.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i2, false);
                                keys0[i2] = org.chromium.url.internal.mojom.Origin.decode(decoder3);
                            }
                        }
                    }
                    {
                        
                        org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE, false);
                        {
                            org.chromium.mojo.bindings.DataHeader si2 = decoder2.readDataHeaderForPointerArray(keys0.length);
                            values0 = new PolicyValue[si2.elementsOrVersion];
                            for (int i2 = 0; i2 < si2.elementsOrVersion; ++i2) {
                                
                                org.chromium.mojo.bindings.Decoder decoder3 = decoder2.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i2, false);
                                values0[i2] = PolicyValue.decode(decoder3);
                            }
                        }
                    }
                    result.values = new java.util.HashMap<org.chromium.url.internal.mojom.Origin, PolicyValue>();
                    for (int index0 = 0; index0 < keys0.length; ++index0) {
                        result.values.put(keys0[index0],  values0[index0]);
                    }
                }
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, false);
                result.fallbackValue = PolicyValue.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(32, false);
                result.opaqueValue = PolicyValue.decode(decoder1);
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
        
        encoder0.encode(this.feature, 8);
        
        if (this.values == null) {
            encoder0.encodeNullPointer(16, false);
        } else {
            org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encoderForMap(16);
            int size0 = this.values.size();
            org.chromium.url.internal.mojom.Origin[] keys0 = new org.chromium.url.internal.mojom.Origin[size0];
            PolicyValue[] values0 = new PolicyValue[size0];
            int index0 = 0;
            for (java.util.Map.Entry<org.chromium.url.internal.mojom.Origin, PolicyValue> entry0 : this.values.entrySet()) {
                keys0[index0] = entry0.getKey();
                values0[index0] = entry0.getValue();
                ++index0;
            }
            
            {
                org.chromium.mojo.bindings.Encoder encoder2 = encoder1.encodePointerArray(keys0.length, org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                for (int i1 = 0; i1 < keys0.length; ++i1) {
                    
                    encoder2.encode(keys0[i1], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                }
            }
            
            {
                org.chromium.mojo.bindings.Encoder encoder2 = encoder1.encodePointerArray(values0.length, org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                for (int i1 = 0; i1 < values0.length; ++i1) {
                    
                    encoder2.encode(values0[i1], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                }
            }
        }
        
        encoder0.encode(this.fallbackValue, 24, false);
        
        encoder0.encode(this.opaqueValue, 32, false);
    }
}