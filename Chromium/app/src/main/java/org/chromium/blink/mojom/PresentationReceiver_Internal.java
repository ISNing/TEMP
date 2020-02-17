// PresentationReceiver_Internal.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/presentation/presentation.mojom
//

package org.chromium.blink.mojom;


class PresentationReceiver_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<PresentationReceiver, PresentationReceiver.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<PresentationReceiver, PresentationReceiver.Proxy>() {

        @Override
        public String getName() {
            return "blink.mojom.PresentationReceiver";
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
        public Stub buildStub(org.chromium.mojo.system.Core core, PresentationReceiver impl) {
            return new Stub(core, impl);
        }

        @Override
        public PresentationReceiver[] buildArray(int size) {
          return new PresentationReceiver[size];
        }
    };


    private static final int ON_RECEIVER_CONNECTION_AVAILABLE_ORDINAL = 0;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements PresentationReceiver.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void onReceiverConnectionAvailable(
PresentationInfo info, PresentationConnection controllerConnection, org.chromium.mojo.bindings.InterfaceRequest<PresentationConnection> receiverConnectionReceiver) {

            PresentationReceiverOnReceiverConnectionAvailableParams _message = new PresentationReceiverOnReceiverConnectionAvailableParams();

            _message.info = info;

            _message.controllerConnection = controllerConnection;

            _message.receiverConnectionReceiver = receiverConnectionReceiver;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_RECEIVER_CONNECTION_AVAILABLE_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<PresentationReceiver> {

        Stub(org.chromium.mojo.system.Core core, PresentationReceiver impl) {
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
                                PresentationReceiver_Internal.MANAGER, messageWithHeader);





                    case ON_RECEIVER_CONNECTION_AVAILABLE_ORDINAL: {

                        PresentationReceiverOnReceiverConnectionAvailableParams data =
                                PresentationReceiverOnReceiverConnectionAvailableParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onReceiverConnectionAvailable(data.info, data.controllerConnection, data.receiverConnectionReceiver);
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
                                getCore(), PresentationReceiver_Internal.MANAGER, messageWithHeader, receiver);




                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }


    
    static final class PresentationReceiverOnReceiverConnectionAvailableParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 32;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(32, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public PresentationInfo info;
        public PresentationConnection controllerConnection;
        public org.chromium.mojo.bindings.InterfaceRequest<PresentationConnection> receiverConnectionReceiver;

        private PresentationReceiverOnReceiverConnectionAvailableParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public PresentationReceiverOnReceiverConnectionAvailableParams() {
            this(0);
        }

        public static PresentationReceiverOnReceiverConnectionAvailableParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static PresentationReceiverOnReceiverConnectionAvailableParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static PresentationReceiverOnReceiverConnectionAvailableParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            PresentationReceiverOnReceiverConnectionAvailableParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new PresentationReceiverOnReceiverConnectionAvailableParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.info = PresentationInfo.decode(decoder1);
                    }
                    {
                        
                    result.controllerConnection = decoder0.readServiceInterface(16, false, PresentationConnection.MANAGER);
                    }
                    {
                        
                    result.receiverConnectionReceiver = decoder0.readInterfaceRequest(24, false);
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
            
            encoder0.encode(this.info, 8, false);
            
            encoder0.encode(this.controllerConnection, 16, false, PresentationConnection.MANAGER);
            
            encoder0.encode(this.receiverConnectionReceiver, 24, false);
        }
    }



}
