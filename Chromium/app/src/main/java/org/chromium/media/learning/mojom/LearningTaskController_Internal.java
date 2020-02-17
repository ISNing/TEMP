// LearningTaskController_Internal.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/learning/mojo/public/mojom/learning_task_controller.mojom
//

package org.chromium.media.learning.mojom;


class LearningTaskController_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<LearningTaskController, LearningTaskController.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<LearningTaskController, LearningTaskController.Proxy>() {

        @Override
        public String getName() {
            return "media.learning.mojom.LearningTaskController";
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
        public Stub buildStub(org.chromium.mojo.system.Core core, LearningTaskController impl) {
            return new Stub(core, impl);
        }

        @Override
        public LearningTaskController[] buildArray(int size) {
          return new LearningTaskController[size];
        }
    };


    private static final int BEGIN_OBSERVATION_ORDINAL = 0;

    private static final int COMPLETE_OBSERVATION_ORDINAL = 1;

    private static final int CANCEL_OBSERVATION_ORDINAL = 2;

    private static final int UPDATE_DEFAULT_TARGET_ORDINAL = 3;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements LearningTaskController.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void beginObservation(
org.chromium.mojo_base.mojom.UnguessableToken id, FeatureValue[] features, TargetValue defaultTarget) {

            LearningTaskControllerBeginObservationParams _message = new LearningTaskControllerBeginObservationParams();

            _message.id = id;

            _message.features = features;

            _message.defaultTarget = defaultTarget;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(BEGIN_OBSERVATION_ORDINAL)));

        }


        @Override
        public void completeObservation(
org.chromium.mojo_base.mojom.UnguessableToken id, ObservationCompletion completion) {

            LearningTaskControllerCompleteObservationParams _message = new LearningTaskControllerCompleteObservationParams();

            _message.id = id;

            _message.completion = completion;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(COMPLETE_OBSERVATION_ORDINAL)));

        }


        @Override
        public void cancelObservation(
org.chromium.mojo_base.mojom.UnguessableToken id) {

            LearningTaskControllerCancelObservationParams _message = new LearningTaskControllerCancelObservationParams();

            _message.id = id;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(CANCEL_OBSERVATION_ORDINAL)));

        }


        @Override
        public void updateDefaultTarget(
org.chromium.mojo_base.mojom.UnguessableToken id, TargetValue defaultTarget) {

            LearningTaskControllerUpdateDefaultTargetParams _message = new LearningTaskControllerUpdateDefaultTargetParams();

            _message.id = id;

            _message.defaultTarget = defaultTarget;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(UPDATE_DEFAULT_TARGET_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<LearningTaskController> {

        Stub(org.chromium.mojo.system.Core core, LearningTaskController impl) {
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
                                LearningTaskController_Internal.MANAGER, messageWithHeader);





                    case BEGIN_OBSERVATION_ORDINAL: {

                        LearningTaskControllerBeginObservationParams data =
                                LearningTaskControllerBeginObservationParams.deserialize(messageWithHeader.getPayload());

                        getImpl().beginObservation(data.id, data.features, data.defaultTarget);
                        return true;
                    }





                    case COMPLETE_OBSERVATION_ORDINAL: {

                        LearningTaskControllerCompleteObservationParams data =
                                LearningTaskControllerCompleteObservationParams.deserialize(messageWithHeader.getPayload());

                        getImpl().completeObservation(data.id, data.completion);
                        return true;
                    }





                    case CANCEL_OBSERVATION_ORDINAL: {

                        LearningTaskControllerCancelObservationParams data =
                                LearningTaskControllerCancelObservationParams.deserialize(messageWithHeader.getPayload());

                        getImpl().cancelObservation(data.id);
                        return true;
                    }





                    case UPDATE_DEFAULT_TARGET_ORDINAL: {

                        LearningTaskControllerUpdateDefaultTargetParams data =
                                LearningTaskControllerUpdateDefaultTargetParams.deserialize(messageWithHeader.getPayload());

                        getImpl().updateDefaultTarget(data.id, data.defaultTarget);
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
                                getCore(), LearningTaskController_Internal.MANAGER, messageWithHeader, receiver);










                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }


    
    static final class LearningTaskControllerBeginObservationParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 32;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(32, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public org.chromium.mojo_base.mojom.UnguessableToken id;
        public FeatureValue[] features;
        public TargetValue defaultTarget;

        private LearningTaskControllerBeginObservationParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public LearningTaskControllerBeginObservationParams() {
            this(0);
        }

        public static LearningTaskControllerBeginObservationParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static LearningTaskControllerBeginObservationParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static LearningTaskControllerBeginObservationParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            LearningTaskControllerBeginObservationParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new LearningTaskControllerBeginObservationParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.id = org.chromium.mojo_base.mojom.UnguessableToken.decode(decoder1);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                    {
                        org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                        result.features = new FeatureValue[si1.elementsOrVersion];
                        for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {
                            
                            org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                            result.features[i1] = FeatureValue.decode(decoder2);
                        }
                    }
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, true);
                    result.defaultTarget = TargetValue.decode(decoder1);
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
            
            encoder0.encode(this.id, 8, false);
            
            if (this.features == null) {
                encoder0.encodeNullPointer(16, false);
            } else {
                org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.features.length, 16, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                for (int i0 = 0; i0 < this.features.length; ++i0) {
                    
                    encoder1.encode(this.features[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
                }
            }
            
            encoder0.encode(this.defaultTarget, 24, true);
        }
    }



    
    static final class LearningTaskControllerCompleteObservationParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 24;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public org.chromium.mojo_base.mojom.UnguessableToken id;
        public ObservationCompletion completion;

        private LearningTaskControllerCompleteObservationParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public LearningTaskControllerCompleteObservationParams() {
            this(0);
        }

        public static LearningTaskControllerCompleteObservationParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static LearningTaskControllerCompleteObservationParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static LearningTaskControllerCompleteObservationParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            LearningTaskControllerCompleteObservationParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new LearningTaskControllerCompleteObservationParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.id = org.chromium.mojo_base.mojom.UnguessableToken.decode(decoder1);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                    result.completion = ObservationCompletion.decode(decoder1);
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
            
            encoder0.encode(this.id, 8, false);
            
            encoder0.encode(this.completion, 16, false);
        }
    }



    
    static final class LearningTaskControllerCancelObservationParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public org.chromium.mojo_base.mojom.UnguessableToken id;

        private LearningTaskControllerCancelObservationParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public LearningTaskControllerCancelObservationParams() {
            this(0);
        }

        public static LearningTaskControllerCancelObservationParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static LearningTaskControllerCancelObservationParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static LearningTaskControllerCancelObservationParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            LearningTaskControllerCancelObservationParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new LearningTaskControllerCancelObservationParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.id = org.chromium.mojo_base.mojom.UnguessableToken.decode(decoder1);
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
            
            encoder0.encode(this.id, 8, false);
        }
    }



    
    static final class LearningTaskControllerUpdateDefaultTargetParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 24;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public org.chromium.mojo_base.mojom.UnguessableToken id;
        public TargetValue defaultTarget;

        private LearningTaskControllerUpdateDefaultTargetParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public LearningTaskControllerUpdateDefaultTargetParams() {
            this(0);
        }

        public static LearningTaskControllerUpdateDefaultTargetParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static LearningTaskControllerUpdateDefaultTargetParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static LearningTaskControllerUpdateDefaultTargetParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            LearningTaskControllerUpdateDefaultTargetParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new LearningTaskControllerUpdateDefaultTargetParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.id = org.chromium.mojo_base.mojom.UnguessableToken.decode(decoder1);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, true);
                    result.defaultTarget = TargetValue.decode(decoder1);
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
            
            encoder0.encode(this.id, 8, false);
            
            encoder0.encode(this.defaultTarget, 16, true);
        }
    }



}
