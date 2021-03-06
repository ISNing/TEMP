// CspDirective.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/content_security_policy.mojom
//

package org.chromium.network.mojom;


public final class CspDirective extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 24;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];

    public static final class Name {
        private static final boolean IS_EXTENSIBLE = false;

        public static final int DEFAULT_SRC = 0;
        public static final int CHILD_SRC = 1; // DEFAULT_SRC + 1
        public static final int FRAME_SRC = 2; // CHILD_SRC + 1
        public static final int FORM_ACTION = 3; // FRAME_SRC + 1
        public static final int UPGRADE_INSECURE_REQUESTS = 4; // FORM_ACTION + 1
        public static final int NAVIGATE_TO = 5; // UPGRADE_INSECURE_REQUESTS + 1
        public static final int FRAME_ANCESTORS = 6; // NAVIGATE_TO + 1
        public static final int UNKNOWN = 7; // FRAME_ANCESTORS + 1

        public static boolean isKnownValue(int value) {
            return value >= 0 && value <= 7;
        }

        public static void validate(int value) {
            if (IS_EXTENSIBLE || isKnownValue(value)) return;
            throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
        }

        private Name() {}
    }
    public int name;
    public CspSourceList sourceList;

    private CspDirective(int version) {
        super(STRUCT_SIZE, version);
    }

    public CspDirective() {
        this(0);
    }

    public static CspDirective deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static CspDirective deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static CspDirective decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        CspDirective result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new CspDirective(elementsOrVersion);
                {
                    
                result.name = decoder0.readInt(8);
                    CspDirective.Name.validate(result.name);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                result.sourceList = CspSourceList.decode(decoder1);
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
        
        encoder0.encode(this.name, 8);
        
        encoder0.encode(this.sourceList, 16, false);
    }
}