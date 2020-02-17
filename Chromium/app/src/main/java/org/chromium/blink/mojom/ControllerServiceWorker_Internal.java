// ControllerServiceWorker_Internal.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/service_worker/controller_service_worker.mojom
//

package org.chromium.blink.mojom;


class ControllerServiceWorker_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<ControllerServiceWorker, ControllerServiceWorker.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<ControllerServiceWorker, ControllerServiceWorker.Proxy>() {

        @Override
        public String getName() {
            return "blink.mojom.ControllerServiceWorker";
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
        public Stub buildStub(org.chromium.mojo.system.Core core, ControllerServiceWorker impl) {
            return new Stub(core, impl);
        }

        @Override
        public ControllerServiceWorker[] buildArray(int size) {
          return new ControllerServiceWorker[size];
        }
    };


    private static final int DISPATCH_FETCH_EVENT_FOR_SUBRESOURCE_ORDINAL = 0;

    private static final int CLONE_ORDINAL = 1;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements ControllerServiceWorker.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void dispatchFetchEventForSubresource(
DispatchFetchEventParams params, ServiceWorkerFetchResponseCallback responseCallback, 
DispatchFetchEventForSubresourceResponse callback) {

            ControllerServiceWorkerDispatchFetchEventForSubresourceParams _message = new ControllerServiceWorkerDispatchFetchEventForSubresourceParams();

            _message.params = params;

            _message.responseCallback = responseCallback;


            getProxyHandler().getMessageReceiver().acceptWithResponder(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(
                                    DISPATCH_FETCH_EVENT_FOR_SUBRESOURCE_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG,
                                    0)),
                    new ControllerServiceWorkerDispatchFetchEventForSubresourceResponseParamsForwardToCallback(callback));

        }


        @Override
        public void clone(
org.chromium.mojo.bindings.InterfaceRequest<ControllerServiceWorker> receiver, int crossOriginEmbedderPolicy) {

            ControllerServiceWorkerCloneParams _message = new ControllerServiceWorkerCloneParams();

            _message.receiver = receiver;

            _message.crossOriginEmbedderPolicy = crossOriginEmbedderPolicy;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(CLONE_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<ControllerServiceWorker> {

        Stub(org.chromium.mojo.system.Core core, ControllerServiceWorker impl) {
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
                                ControllerServiceWorker_Internal.MANAGER, messageWithHeader);







                    case CLONE_ORDINAL: {

                        ControllerServiceWorkerCloneParams data =
                                ControllerServiceWorkerCloneParams.deserialize(messageWithHeader.getPayload());

                        getImpl().clone(data.receiver, data.crossOriginEmbedderPolicy);
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
                                getCore(), ControllerServiceWorker_Internal.MANAGER, messageWithHeader, receiver);







                    case DISPATCH_FETCH_EVENT_FOR_SUBRESOURCE_ORDINAL: {

                        ControllerServiceWorkerDispatchFetchEventForSubresourceParams data =
                                ControllerServiceWorkerDispatchFetchEventForSubresourceParams.deserialize(messageWithHeader.getPayload());

                        getImpl().dispatchFetchEventForSubresource(data.params, data.responseCallback, new ControllerServiceWorkerDispatchFetchEventForSubresourceResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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


    
    static final class ControllerServiceWorkerDispatchFetchEventForSubresourceParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 24;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public DispatchFetchEventParams params;
        public ServiceWorkerFetchResponseCallback responseCallback;

        private ControllerServiceWorkerDispatchFetchEventForSubresourceParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public ControllerServiceWorkerDispatchFetchEventForSubresourceParams() {
            this(0);
        }

        public static ControllerServiceWorkerDispatchFetchEventForSubresourceParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static ControllerServiceWorkerDispatchFetchEventForSubresourceParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static ControllerServiceWorkerDispatchFetchEventForSubresourceParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            ControllerServiceWorkerDispatchFetchEventForSubresourceParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new ControllerServiceWorkerDispatchFetchEventForSubresourceParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.params = DispatchFetchEventParams.decode(decoder1);
                    }
                    {
                        
                    result.responseCallback = decoder0.readServiceInterface(16, false, ServiceWorkerFetchResponseCallback.MANAGER);
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
            
            encoder0.encode(this.params, 8, false);
            
            encoder0.encode(this.responseCallback, 16, false, ServiceWorkerFetchResponseCallback.MANAGER);
        }
    }



    
    static final class ControllerServiceWorkerDispatchFetchEventForSubresourceResponseParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public int status;

        private ControllerServiceWorkerDispatchFetchEventForSubresourceResponseParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public ControllerServiceWorkerDispatchFetchEventForSubresourceResponseParams() {
            this(0);
        }

        public static ControllerServiceWorkerDispatchFetchEventForSubresourceResponseParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static ControllerServiceWorkerDispatchFetchEventForSubresourceResponseParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static ControllerServiceWorkerDispatchFetchEventForSubresourceResponseParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            ControllerServiceWorkerDispatchFetchEventForSubresourceResponseParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new ControllerServiceWorkerDispatchFetchEventForSubresourceResponseParams(elementsOrVersion);
                    {
                        
                    result.status = decoder0.readInt(8);
                        ServiceWorkerEventStatus.validate(result.status);
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
            
            encoder0.encode(this.status, 8);
        }
    }

    static class ControllerServiceWorkerDispatchFetchEventForSubresourceResponseParamsForwardToCallback extends org.chromium.mojo.bindings.SideEffectFreeCloseable
            implements org.chromium.mojo.bindings.MessageReceiver {
        private final ControllerServiceWorker.DispatchFetchEventForSubresourceResponse mCallback;

        ControllerServiceWorkerDispatchFetchEventForSubresourceResponseParamsForwardToCallback(ControllerServiceWorker.DispatchFetchEventForSubresourceResponse callback) {
            this.mCallback = callback;
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(DISPATCH_FETCH_EVENT_FOR_SUBRESOURCE_ORDINAL,
                                           org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG)) {
                    return false;
                }

                ControllerServiceWorkerDispatchFetchEventForSubresourceResponseParams response = ControllerServiceWorkerDispatchFetchEventForSubresourceResponseParams.deserialize(messageWithHeader.getPayload());

                mCallback.call(response.status);
                return true;
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                return false;
            }
        }
    }

    static class ControllerServiceWorkerDispatchFetchEventForSubresourceResponseParamsProxyToResponder implements ControllerServiceWorker.DispatchFetchEventForSubresourceResponse {

        private final org.chromium.mojo.system.Core mCore;
        private final org.chromium.mojo.bindings.MessageReceiver mMessageReceiver;
        private final long mRequestId;

        ControllerServiceWorkerDispatchFetchEventForSubresourceResponseParamsProxyToResponder(
                org.chromium.mojo.system.Core core,
                org.chromium.mojo.bindings.MessageReceiver messageReceiver,
                long requestId) {
            mCore = core;
            mMessageReceiver = messageReceiver;
            mRequestId = requestId;
        }

        @Override
        public void call(Integer status) {
            ControllerServiceWorkerDispatchFetchEventForSubresourceResponseParams _response = new ControllerServiceWorkerDispatchFetchEventForSubresourceResponseParams();

            _response.status = status;

            org.chromium.mojo.bindings.ServiceMessage _message =
                    _response.serializeWithHeader(
                            mCore,
                            new org.chromium.mojo.bindings.MessageHeader(
                                    DISPATCH_FETCH_EVENT_FOR_SUBRESOURCE_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG,
                                    mRequestId));
            mMessageReceiver.accept(_message);
        }
    }



    
    static final class ControllerServiceWorkerCloneParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public org.chromium.mojo.bindings.InterfaceRequest<ControllerServiceWorker> receiver;
        public int crossOriginEmbedderPolicy;

        private ControllerServiceWorkerCloneParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public ControllerServiceWorkerCloneParams() {
            this(0);
        }

        public static ControllerServiceWorkerCloneParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static ControllerServiceWorkerCloneParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static ControllerServiceWorkerCloneParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            ControllerServiceWorkerCloneParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new ControllerServiceWorkerCloneParams(elementsOrVersion);
                    {
                        
                    result.receiver = decoder0.readInterfaceRequest(8, false);
                    }
                    {
                        
                    result.crossOriginEmbedderPolicy = decoder0.readInt(12);
                        org.chromium.network.mojom.CrossOriginEmbedderPolicy.validate(result.crossOriginEmbedderPolicy);
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
            
            encoder0.encode(this.receiver, 8, false);
            
            encoder0.encode(this.crossOriginEmbedderPolicy, 12);
        }
    }



}
