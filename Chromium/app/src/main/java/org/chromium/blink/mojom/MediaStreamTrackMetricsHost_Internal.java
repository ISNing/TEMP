// MediaStreamTrackMetricsHost_Internal.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/mediastream/media_stream.mojom
//

package org.chromium.blink.mojom;


class MediaStreamTrackMetricsHost_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<MediaStreamTrackMetricsHost, MediaStreamTrackMetricsHost.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<MediaStreamTrackMetricsHost, MediaStreamTrackMetricsHost.Proxy>() {

        @Override
        public String getName() {
            return "blink.mojom.MediaStreamTrackMetricsHost";
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
        public Stub buildStub(org.chromium.mojo.system.Core core, MediaStreamTrackMetricsHost impl) {
            return new Stub(core, impl);
        }

        @Override
        public MediaStreamTrackMetricsHost[] buildArray(int size) {
          return new MediaStreamTrackMetricsHost[size];
        }
    };


    private static final int ADD_TRACK_ORDINAL = 0;

    private static final int REMOVE_TRACK_ORDINAL = 1;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements MediaStreamTrackMetricsHost.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void addTrack(
long id, boolean isAudio, boolean isRemote) {

            MediaStreamTrackMetricsHostAddTrackParams _message = new MediaStreamTrackMetricsHostAddTrackParams();

            _message.id = id;

            _message.isAudio = isAudio;

            _message.isRemote = isRemote;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ADD_TRACK_ORDINAL)));

        }


        @Override
        public void removeTrack(
long id) {

            MediaStreamTrackMetricsHostRemoveTrackParams _message = new MediaStreamTrackMetricsHostRemoveTrackParams();

            _message.id = id;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(REMOVE_TRACK_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<MediaStreamTrackMetricsHost> {

        Stub(org.chromium.mojo.system.Core core, MediaStreamTrackMetricsHost impl) {
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
                                MediaStreamTrackMetricsHost_Internal.MANAGER, messageWithHeader);





                    case ADD_TRACK_ORDINAL: {

                        MediaStreamTrackMetricsHostAddTrackParams data =
                                MediaStreamTrackMetricsHostAddTrackParams.deserialize(messageWithHeader.getPayload());

                        getImpl().addTrack(data.id, data.isAudio, data.isRemote);
                        return true;
                    }





                    case REMOVE_TRACK_ORDINAL: {

                        MediaStreamTrackMetricsHostRemoveTrackParams data =
                                MediaStreamTrackMetricsHostRemoveTrackParams.deserialize(messageWithHeader.getPayload());

                        getImpl().removeTrack(data.id);
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
                                getCore(), MediaStreamTrackMetricsHost_Internal.MANAGER, messageWithHeader, receiver);






                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }


    
    static final class MediaStreamTrackMetricsHostAddTrackParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 24;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public long id;
        public boolean isAudio;
        public boolean isRemote;

        private MediaStreamTrackMetricsHostAddTrackParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public MediaStreamTrackMetricsHostAddTrackParams() {
            this(0);
        }

        public static MediaStreamTrackMetricsHostAddTrackParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static MediaStreamTrackMetricsHostAddTrackParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static MediaStreamTrackMetricsHostAddTrackParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            MediaStreamTrackMetricsHostAddTrackParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new MediaStreamTrackMetricsHostAddTrackParams(elementsOrVersion);
                    {
                        
                    result.id = decoder0.readLong(8);
                    }
                    {
                        
                    result.isAudio = decoder0.readBoolean(16, 0);
                    }
                    {
                        
                    result.isRemote = decoder0.readBoolean(16, 1);
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
            
            encoder0.encode(this.id, 8);
            
            encoder0.encode(this.isAudio, 16, 0);
            
            encoder0.encode(this.isRemote, 16, 1);
        }
    }



    
    static final class MediaStreamTrackMetricsHostRemoveTrackParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public long id;

        private MediaStreamTrackMetricsHostRemoveTrackParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public MediaStreamTrackMetricsHostRemoveTrackParams() {
            this(0);
        }

        public static MediaStreamTrackMetricsHostRemoveTrackParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static MediaStreamTrackMetricsHostRemoveTrackParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static MediaStreamTrackMetricsHostRemoveTrackParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            MediaStreamTrackMetricsHostRemoveTrackParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new MediaStreamTrackMetricsHostRemoveTrackParams(elementsOrVersion);
                    {
                        
                    result.id = decoder0.readLong(8);
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
            
            encoder0.encode(this.id, 8);
        }
    }



}
