// FontUniqueNameLookup_Internal.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/font_unique_name_lookup/font_unique_name_lookup.mojom
//

package org.chromium.blink.mojom;


class FontUniqueNameLookup_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<FontUniqueNameLookup, FontUniqueNameLookup.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<FontUniqueNameLookup, FontUniqueNameLookup.Proxy>() {

        @Override
        public String getName() {
            return "blink.mojom.FontUniqueNameLookup";
        }

        @Override
        public int getVersion() {
          return 0;
        }

        @Override
        public Proxy buildProxy(org.chromium.mojo.system.Core core,
                                org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override
        public Stub buildStub(org.chromium.mojo.system.Core core, FontUniqueNameLookup impl) {
            return new Stub(core, impl);
        }

        @Override
        public FontUniqueNameLookup[] buildArray(int size) {
          return new FontUniqueNameLookup[size];
        }
    };


    private static final int GET_UNIQUE_NAME_LOOKUP_TABLE_IF_AVAILABLE_ORDINAL = 0;

    private static final int GET_UNIQUE_NAME_LOOKUP_TABLE_ORDINAL = 1;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements FontUniqueNameLookup.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void getUniqueNameLookupTableIfAvailable(

GetUniqueNameLookupTableIfAvailableResponse callback) {

            FontUniqueNameLookupGetUniqueNameLookupTableIfAvailableParams _message = new FontUniqueNameLookupGetUniqueNameLookupTableIfAvailableParams();


            getProxyHandler().getMessageReceiver().acceptWithResponder(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(
                                    GET_UNIQUE_NAME_LOOKUP_TABLE_IF_AVAILABLE_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG,
                                    0)),
                    new FontUniqueNameLookupGetUniqueNameLookupTableIfAvailableResponseParamsForwardToCallback(callback));

        }


        @Override
        public void getUniqueNameLookupTable(

GetUniqueNameLookupTableResponse callback) {

            FontUniqueNameLookupGetUniqueNameLookupTableParams _message = new FontUniqueNameLookupGetUniqueNameLookupTableParams();


            getProxyHandler().getMessageReceiver().acceptWithResponder(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(
                                    GET_UNIQUE_NAME_LOOKUP_TABLE_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG,
                                    0)),
                    new FontUniqueNameLookupGetUniqueNameLookupTableResponseParamsForwardToCallback(callback));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<FontUniqueNameLookup> {

        Stub(org.chromium.mojo.system.Core core, FontUniqueNameLookup impl) {
            super(core, impl);
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(org.chromium.mojo.bindings.MessageHeader.NO_FLAG)) {
                    return false;
                }
                switch(header.getType()) {

                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_OR_CLOSE_PIPE_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRunOrClosePipe(
                                FontUniqueNameLookup_Internal.MANAGER, messageWithHeader);






                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }

        @Override
        public boolean acceptWithResponder(org.chromium.mojo.bindings.Message message, org.chromium.mojo.bindings.MessageReceiver receiver) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG)) {
                    return false;
                }
                switch(header.getType()) {

                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRun(
                                getCore(), FontUniqueNameLookup_Internal.MANAGER, messageWithHeader, receiver);







                    case GET_UNIQUE_NAME_LOOKUP_TABLE_IF_AVAILABLE_ORDINAL: {

                        FontUniqueNameLookupGetUniqueNameLookupTableIfAvailableParams.deserialize(messageWithHeader.getPayload());

                        getImpl().getUniqueNameLookupTableIfAvailable(new FontUniqueNameLookupGetUniqueNameLookupTableIfAvailableResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    }







                    case GET_UNIQUE_NAME_LOOKUP_TABLE_ORDINAL: {

                        FontUniqueNameLookupGetUniqueNameLookupTableParams.deserialize(messageWithHeader.getPayload());

                        getImpl().getUniqueNameLookupTable(new FontUniqueNameLookupGetUniqueNameLookupTableResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    }


                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }


    
    static final class FontUniqueNameLookupGetUniqueNameLookupTableIfAvailableParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 8;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(8, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];

        private FontUniqueNameLookupGetUniqueNameLookupTableIfAvailableParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public FontUniqueNameLookupGetUniqueNameLookupTableIfAvailableParams() {
            this(0);
        }

        public static FontUniqueNameLookupGetUniqueNameLookupTableIfAvailableParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static FontUniqueNameLookupGetUniqueNameLookupTableIfAvailableParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static FontUniqueNameLookupGetUniqueNameLookupTableIfAvailableParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            FontUniqueNameLookupGetUniqueNameLookupTableIfAvailableParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new FontUniqueNameLookupGetUniqueNameLookupTableIfAvailableParams(elementsOrVersion);

            } finally {
                decoder0.decreaseStackDepth();
            }
            return result;
        }

        @SuppressWarnings("unchecked")
        @Override
        protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }



    
    static final class FontUniqueNameLookupGetUniqueNameLookupTableIfAvailableResponseParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 24;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public boolean syncAvailable;
        public org.chromium.mojo_base.mojom.ReadOnlySharedMemoryRegion fontLookupTable;

        private FontUniqueNameLookupGetUniqueNameLookupTableIfAvailableResponseParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public FontUniqueNameLookupGetUniqueNameLookupTableIfAvailableResponseParams() {
            this(0);
        }

        public static FontUniqueNameLookupGetUniqueNameLookupTableIfAvailableResponseParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static FontUniqueNameLookupGetUniqueNameLookupTableIfAvailableResponseParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static FontUniqueNameLookupGetUniqueNameLookupTableIfAvailableResponseParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            FontUniqueNameLookupGetUniqueNameLookupTableIfAvailableResponseParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new FontUniqueNameLookupGetUniqueNameLookupTableIfAvailableResponseParams(elementsOrVersion);
                    {
                        
                    result.syncAvailable = decoder0.readBoolean(8, 0);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, true);
                    result.fontLookupTable = org.chromium.mojo_base.mojom.ReadOnlySharedMemoryRegion.decode(decoder1);
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
            
            encoder0.encode(this.syncAvailable, 8, 0);
            
            encoder0.encode(this.fontLookupTable, 16, true);
        }
    }

    static class FontUniqueNameLookupGetUniqueNameLookupTableIfAvailableResponseParamsForwardToCallback extends org.chromium.mojo.bindings.SideEffectFreeCloseable
            implements org.chromium.mojo.bindings.MessageReceiver {
        private final FontUniqueNameLookup.GetUniqueNameLookupTableIfAvailableResponse mCallback;

        FontUniqueNameLookupGetUniqueNameLookupTableIfAvailableResponseParamsForwardToCallback(FontUniqueNameLookup.GetUniqueNameLookupTableIfAvailableResponse callback) {
            this.mCallback = callback;
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(GET_UNIQUE_NAME_LOOKUP_TABLE_IF_AVAILABLE_ORDINAL,
                                           org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG)) {
                    return false;
                }

                FontUniqueNameLookupGetUniqueNameLookupTableIfAvailableResponseParams response = FontUniqueNameLookupGetUniqueNameLookupTableIfAvailableResponseParams.deserialize(messageWithHeader.getPayload());

                mCallback.call(response.syncAvailable, response.fontLookupTable);
                return true;
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                return false;
            }
        }
    }

    static class FontUniqueNameLookupGetUniqueNameLookupTableIfAvailableResponseParamsProxyToResponder implements FontUniqueNameLookup.GetUniqueNameLookupTableIfAvailableResponse {

        private final org.chromium.mojo.system.Core mCore;
        private final org.chromium.mojo.bindings.MessageReceiver mMessageReceiver;
        private final long mRequestId;

        FontUniqueNameLookupGetUniqueNameLookupTableIfAvailableResponseParamsProxyToResponder(
                org.chromium.mojo.system.Core core,
                org.chromium.mojo.bindings.MessageReceiver messageReceiver,
                long requestId) {
            mCore = core;
            mMessageReceiver = messageReceiver;
            mRequestId = requestId;
        }

        @Override
        public void call(Boolean syncAvailable, org.chromium.mojo_base.mojom.ReadOnlySharedMemoryRegion fontLookupTable) {
            FontUniqueNameLookupGetUniqueNameLookupTableIfAvailableResponseParams _response = new FontUniqueNameLookupGetUniqueNameLookupTableIfAvailableResponseParams();

            _response.syncAvailable = syncAvailable;

            _response.fontLookupTable = fontLookupTable;

            org.chromium.mojo.bindings.ServiceMessage _message =
                    _response.serializeWithHeader(
                            mCore,
                            new org.chromium.mojo.bindings.MessageHeader(
                                    GET_UNIQUE_NAME_LOOKUP_TABLE_IF_AVAILABLE_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG,
                                    mRequestId));
            mMessageReceiver.accept(_message);
        }
    }



    
    static final class FontUniqueNameLookupGetUniqueNameLookupTableParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 8;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(8, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];

        private FontUniqueNameLookupGetUniqueNameLookupTableParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public FontUniqueNameLookupGetUniqueNameLookupTableParams() {
            this(0);
        }

        public static FontUniqueNameLookupGetUniqueNameLookupTableParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static FontUniqueNameLookupGetUniqueNameLookupTableParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static FontUniqueNameLookupGetUniqueNameLookupTableParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            FontUniqueNameLookupGetUniqueNameLookupTableParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new FontUniqueNameLookupGetUniqueNameLookupTableParams(elementsOrVersion);

            } finally {
                decoder0.decreaseStackDepth();
            }
            return result;
        }

        @SuppressWarnings("unchecked")
        @Override
        protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }



    
    static final class FontUniqueNameLookupGetUniqueNameLookupTableResponseParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public org.chromium.mojo_base.mojom.ReadOnlySharedMemoryRegion fontLookupTable;

        private FontUniqueNameLookupGetUniqueNameLookupTableResponseParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public FontUniqueNameLookupGetUniqueNameLookupTableResponseParams() {
            this(0);
        }

        public static FontUniqueNameLookupGetUniqueNameLookupTableResponseParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static FontUniqueNameLookupGetUniqueNameLookupTableResponseParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static FontUniqueNameLookupGetUniqueNameLookupTableResponseParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            FontUniqueNameLookupGetUniqueNameLookupTableResponseParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new FontUniqueNameLookupGetUniqueNameLookupTableResponseParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, true);
                    result.fontLookupTable = org.chromium.mojo_base.mojom.ReadOnlySharedMemoryRegion.decode(decoder1);
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
            
            encoder0.encode(this.fontLookupTable, 8, true);
        }
    }

    static class FontUniqueNameLookupGetUniqueNameLookupTableResponseParamsForwardToCallback extends org.chromium.mojo.bindings.SideEffectFreeCloseable
            implements org.chromium.mojo.bindings.MessageReceiver {
        private final FontUniqueNameLookup.GetUniqueNameLookupTableResponse mCallback;

        FontUniqueNameLookupGetUniqueNameLookupTableResponseParamsForwardToCallback(FontUniqueNameLookup.GetUniqueNameLookupTableResponse callback) {
            this.mCallback = callback;
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(GET_UNIQUE_NAME_LOOKUP_TABLE_ORDINAL,
                                           org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG)) {
                    return false;
                }

                FontUniqueNameLookupGetUniqueNameLookupTableResponseParams response = FontUniqueNameLookupGetUniqueNameLookupTableResponseParams.deserialize(messageWithHeader.getPayload());

                mCallback.call(response.fontLookupTable);
                return true;
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                return false;
            }
        }
    }

    static class FontUniqueNameLookupGetUniqueNameLookupTableResponseParamsProxyToResponder implements FontUniqueNameLookup.GetUniqueNameLookupTableResponse {

        private final org.chromium.mojo.system.Core mCore;
        private final org.chromium.mojo.bindings.MessageReceiver mMessageReceiver;
        private final long mRequestId;

        FontUniqueNameLookupGetUniqueNameLookupTableResponseParamsProxyToResponder(
                org.chromium.mojo.system.Core core,
                org.chromium.mojo.bindings.MessageReceiver messageReceiver,
                long requestId) {
            mCore = core;
            mMessageReceiver = messageReceiver;
            mRequestId = requestId;
        }

        @Override
        public void call(org.chromium.mojo_base.mojom.ReadOnlySharedMemoryRegion fontLookupTable) {
            FontUniqueNameLookupGetUniqueNameLookupTableResponseParams _response = new FontUniqueNameLookupGetUniqueNameLookupTableResponseParams();

            _response.fontLookupTable = fontLookupTable;

            org.chromium.mojo.bindings.ServiceMessage _message =
                    _response.serializeWithHeader(
                            mCore,
                            new org.chromium.mojo.bindings.MessageHeader(
                                    GET_UNIQUE_NAME_LOOKUP_TABLE_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG,
                                    mRequestId));
            mMessageReceiver.accept(_message);
        }
    }



}
