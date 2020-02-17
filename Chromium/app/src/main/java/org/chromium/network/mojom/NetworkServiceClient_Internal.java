// NetworkServiceClient_Internal.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/network_service.mojom
//

package org.chromium.network.mojom;


class NetworkServiceClient_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<NetworkServiceClient, NetworkServiceClient.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<NetworkServiceClient, NetworkServiceClient.Proxy>() {

        @Override
        public String getName() {
            return "network.mojom.NetworkServiceClient";
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
        public Stub buildStub(org.chromium.mojo.system.Core core, NetworkServiceClient impl) {
            return new Stub(core, impl);
        }

        @Override
        public NetworkServiceClient[] buildArray(int size) {
          return new NetworkServiceClient[size];
        }
    };


    private static final int ON_LOADING_STATE_UPDATE_ORDINAL = 0;

    private static final int ON_DATA_USE_UPDATE_ORDINAL = 1;

    private static final int ON_RAW_REQUEST_ORDINAL = 2;

    private static final int ON_RAW_RESPONSE_ORDINAL = 3;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements NetworkServiceClient.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void onLoadingStateUpdate(
LoadInfo[] infos, 
OnLoadingStateUpdateResponse callback) {

            NetworkServiceClientOnLoadingStateUpdateParams _message = new NetworkServiceClientOnLoadingStateUpdateParams();

            _message.infos = infos;


            getProxyHandler().getMessageReceiver().acceptWithResponder(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(
                                    ON_LOADING_STATE_UPDATE_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG,
                                    0)),
                    new NetworkServiceClientOnLoadingStateUpdateResponseParamsForwardToCallback(callback));

        }


        @Override
        public void onDataUseUpdate(
int networkTrafficAnnotationIdHash, long recvBytes, long sentBytes) {

            NetworkServiceClientOnDataUseUpdateParams _message = new NetworkServiceClientOnDataUseUpdateParams();

            _message.networkTrafficAnnotationIdHash = networkTrafficAnnotationIdHash;

            _message.recvBytes = recvBytes;

            _message.sentBytes = sentBytes;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_DATA_USE_UPDATE_ORDINAL)));

        }


        @Override
        public void onRawRequest(
int processId, int routingId, String devtoolRequestId, CookieWithStatus[] cookiesWithStatus, HttpRawHeaderPair[] headers) {

            NetworkServiceClientOnRawRequestParams _message = new NetworkServiceClientOnRawRequestParams();

            _message.processId = processId;

            _message.routingId = routingId;

            _message.devtoolRequestId = devtoolRequestId;

            _message.cookiesWithStatus = cookiesWithStatus;

            _message.headers = headers;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_RAW_REQUEST_ORDINAL)));

        }


        @Override
        public void onRawResponse(
int processId, int routingId, String devtoolRequestId, CookieAndLineWithStatus[] cookiesWithStatus, HttpRawHeaderPair[] headers, String rawResponseHeaders) {

            NetworkServiceClientOnRawResponseParams _message = new NetworkServiceClientOnRawResponseParams();

            _message.processId = processId;

            _message.routingId = routingId;

            _message.devtoolRequestId = devtoolRequestId;

            _message.cookiesWithStatus = cookiesWithStatus;

            _message.headers = headers;

            _message.rawResponseHeaders = rawResponseHeaders;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_RAW_RESPONSE_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<NetworkServiceClient> {

        Stub(org.chromium.mojo.system.Core core, NetworkServiceClient impl) {
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
                                NetworkServiceClient_Internal.MANAGER, messageWithHeader);







                    case ON_DATA_USE_UPDATE_ORDINAL: {

                        NetworkServiceClientOnDataUseUpdateParams data =
                                NetworkServiceClientOnDataUseUpdateParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onDataUseUpdate(data.networkTrafficAnnotationIdHash, data.recvBytes, data.sentBytes);
                        return true;
                    }





                    case ON_RAW_REQUEST_ORDINAL: {

                        NetworkServiceClientOnRawRequestParams data =
                                NetworkServiceClientOnRawRequestParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onRawRequest(data.processId, data.routingId, data.devtoolRequestId, data.cookiesWithStatus, data.headers);
                        return true;
                    }





                    case ON_RAW_RESPONSE_ORDINAL: {

                        NetworkServiceClientOnRawResponseParams data =
                                NetworkServiceClientOnRawResponseParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onRawResponse(data.processId, data.routingId, data.devtoolRequestId, data.cookiesWithStatus, data.headers, data.rawResponseHeaders);
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
                                getCore(), NetworkServiceClient_Internal.MANAGER, messageWithHeader, receiver);







                    case ON_LOADING_STATE_UPDATE_ORDINAL: {

                        NetworkServiceClientOnLoadingStateUpdateParams data =
                                NetworkServiceClientOnLoadingStateUpdateParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onLoadingStateUpdate(data.infos, new NetworkServiceClientOnLoadingStateUpdateResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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


    
    static final class NetworkServiceClientOnLoadingStateUpdateParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public LoadInfo[] infos;

        private NetworkServiceClientOnLoadingStateUpdateParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public NetworkServiceClientOnLoadingStateUpdateParams() {
            this(0);
        }

        public static NetworkServiceClientOnLoadingStateUpdateParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static NetworkServiceClientOnLoadingStateUpdateParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static NetworkServiceClientOnLoadingStateUpdateParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            NetworkServiceClientOnLoadingStateUpdateParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new NetworkServiceClientOnLoadingStateUpdateParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    {
                        org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                        result.infos = new LoadInfo[si1.elementsOrVersion];
                        for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {
                            
                            org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                            result.infos[i1] = LoadInfo.decode(decoder2);
                        }
                    }
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
            
            if (this.infos == null) {
                encoder0.encodeNullPointer(8, false);
            } else {
                org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.infos.length, 8, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                for (int i0 = 0; i0 < this.infos.length; ++i0) {
                    
                    encoder1.encode(this.infos[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
                }
            }
        }
    }



    
    static final class NetworkServiceClientOnLoadingStateUpdateResponseParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 8;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(8, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];

        private NetworkServiceClientOnLoadingStateUpdateResponseParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public NetworkServiceClientOnLoadingStateUpdateResponseParams() {
            this(0);
        }

        public static NetworkServiceClientOnLoadingStateUpdateResponseParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static NetworkServiceClientOnLoadingStateUpdateResponseParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static NetworkServiceClientOnLoadingStateUpdateResponseParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            NetworkServiceClientOnLoadingStateUpdateResponseParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new NetworkServiceClientOnLoadingStateUpdateResponseParams(elementsOrVersion);

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

    static class NetworkServiceClientOnLoadingStateUpdateResponseParamsForwardToCallback extends org.chromium.mojo.bindings.SideEffectFreeCloseable
            implements org.chromium.mojo.bindings.MessageReceiver {
        private final NetworkServiceClient.OnLoadingStateUpdateResponse mCallback;

        NetworkServiceClientOnLoadingStateUpdateResponseParamsForwardToCallback(NetworkServiceClient.OnLoadingStateUpdateResponse callback) {
            this.mCallback = callback;
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(ON_LOADING_STATE_UPDATE_ORDINAL,
                                           org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG)) {
                    return false;
                }

                mCallback.call();
                return true;
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                return false;
            }
        }
    }

    static class NetworkServiceClientOnLoadingStateUpdateResponseParamsProxyToResponder implements NetworkServiceClient.OnLoadingStateUpdateResponse {

        private final org.chromium.mojo.system.Core mCore;
        private final org.chromium.mojo.bindings.MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkServiceClientOnLoadingStateUpdateResponseParamsProxyToResponder(
                org.chromium.mojo.system.Core core,
                org.chromium.mojo.bindings.MessageReceiver messageReceiver,
                long requestId) {
            mCore = core;
            mMessageReceiver = messageReceiver;
            mRequestId = requestId;
        }

        @Override
        public void call() {
            NetworkServiceClientOnLoadingStateUpdateResponseParams _response = new NetworkServiceClientOnLoadingStateUpdateResponseParams();

            org.chromium.mojo.bindings.ServiceMessage _message =
                    _response.serializeWithHeader(
                            mCore,
                            new org.chromium.mojo.bindings.MessageHeader(
                                    ON_LOADING_STATE_UPDATE_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG,
                                    mRequestId));
            mMessageReceiver.accept(_message);
        }
    }



    
    static final class NetworkServiceClientOnDataUseUpdateParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 32;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(32, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public int networkTrafficAnnotationIdHash;
        public long recvBytes;
        public long sentBytes;

        private NetworkServiceClientOnDataUseUpdateParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public NetworkServiceClientOnDataUseUpdateParams() {
            this(0);
        }

        public static NetworkServiceClientOnDataUseUpdateParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static NetworkServiceClientOnDataUseUpdateParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static NetworkServiceClientOnDataUseUpdateParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            NetworkServiceClientOnDataUseUpdateParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new NetworkServiceClientOnDataUseUpdateParams(elementsOrVersion);
                    {
                        
                    result.networkTrafficAnnotationIdHash = decoder0.readInt(8);
                    }
                    {
                        
                    result.recvBytes = decoder0.readLong(16);
                    }
                    {
                        
                    result.sentBytes = decoder0.readLong(24);
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
            
            encoder0.encode(this.networkTrafficAnnotationIdHash, 8);
            
            encoder0.encode(this.recvBytes, 16);
            
            encoder0.encode(this.sentBytes, 24);
        }
    }



    
    static final class NetworkServiceClientOnRawRequestParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 40;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(40, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public int processId;
        public int routingId;
        public String devtoolRequestId;
        public CookieWithStatus[] cookiesWithStatus;
        public HttpRawHeaderPair[] headers;

        private NetworkServiceClientOnRawRequestParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public NetworkServiceClientOnRawRequestParams() {
            this(0);
        }

        public static NetworkServiceClientOnRawRequestParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static NetworkServiceClientOnRawRequestParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static NetworkServiceClientOnRawRequestParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            NetworkServiceClientOnRawRequestParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new NetworkServiceClientOnRawRequestParams(elementsOrVersion);
                    {
                        
                    result.processId = decoder0.readInt(8);
                    }
                    {
                        
                    result.routingId = decoder0.readInt(12);
                    }
                    {
                        
                    result.devtoolRequestId = decoder0.readString(16, false);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, false);
                    {
                        org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                        result.cookiesWithStatus = new CookieWithStatus[si1.elementsOrVersion];
                        for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {
                            
                            org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                            result.cookiesWithStatus[i1] = CookieWithStatus.decode(decoder2);
                        }
                    }
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(32, false);
                    {
                        org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                        result.headers = new HttpRawHeaderPair[si1.elementsOrVersion];
                        for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {
                            
                            org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                            result.headers[i1] = HttpRawHeaderPair.decode(decoder2);
                        }
                    }
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
            
            encoder0.encode(this.processId, 8);
            
            encoder0.encode(this.routingId, 12);
            
            encoder0.encode(this.devtoolRequestId, 16, false);
            
            if (this.cookiesWithStatus == null) {
                encoder0.encodeNullPointer(24, false);
            } else {
                org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.cookiesWithStatus.length, 24, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                for (int i0 = 0; i0 < this.cookiesWithStatus.length; ++i0) {
                    
                    encoder1.encode(this.cookiesWithStatus[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
                }
            }
            
            if (this.headers == null) {
                encoder0.encodeNullPointer(32, false);
            } else {
                org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.headers.length, 32, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                for (int i0 = 0; i0 < this.headers.length; ++i0) {
                    
                    encoder1.encode(this.headers[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
                }
            }
        }
    }



    
    static final class NetworkServiceClientOnRawResponseParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 48;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(48, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public int processId;
        public int routingId;
        public String devtoolRequestId;
        public CookieAndLineWithStatus[] cookiesWithStatus;
        public HttpRawHeaderPair[] headers;
        public String rawResponseHeaders;

        private NetworkServiceClientOnRawResponseParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public NetworkServiceClientOnRawResponseParams() {
            this(0);
        }

        public static NetworkServiceClientOnRawResponseParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static NetworkServiceClientOnRawResponseParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static NetworkServiceClientOnRawResponseParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            NetworkServiceClientOnRawResponseParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new NetworkServiceClientOnRawResponseParams(elementsOrVersion);
                    {
                        
                    result.processId = decoder0.readInt(8);
                    }
                    {
                        
                    result.routingId = decoder0.readInt(12);
                    }
                    {
                        
                    result.devtoolRequestId = decoder0.readString(16, false);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, false);
                    {
                        org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                        result.cookiesWithStatus = new CookieAndLineWithStatus[si1.elementsOrVersion];
                        for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {
                            
                            org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                            result.cookiesWithStatus[i1] = CookieAndLineWithStatus.decode(decoder2);
                        }
                    }
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(32, false);
                    {
                        org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                        result.headers = new HttpRawHeaderPair[si1.elementsOrVersion];
                        for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {
                            
                            org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                            result.headers[i1] = HttpRawHeaderPair.decode(decoder2);
                        }
                    }
                    }
                    {
                        
                    result.rawResponseHeaders = decoder0.readString(40, true);
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
            
            encoder0.encode(this.processId, 8);
            
            encoder0.encode(this.routingId, 12);
            
            encoder0.encode(this.devtoolRequestId, 16, false);
            
            if (this.cookiesWithStatus == null) {
                encoder0.encodeNullPointer(24, false);
            } else {
                org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.cookiesWithStatus.length, 24, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                for (int i0 = 0; i0 < this.cookiesWithStatus.length; ++i0) {
                    
                    encoder1.encode(this.cookiesWithStatus[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
                }
            }
            
            if (this.headers == null) {
                encoder0.encodeNullPointer(32, false);
            } else {
                org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.headers.length, 32, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                for (int i0 = 0; i0 < this.headers.length; ++i0) {
                    
                    encoder1.encode(this.headers[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
                }
            }
            
            encoder0.encode(this.rawResponseHeaders, 40, true);
        }
    }



}