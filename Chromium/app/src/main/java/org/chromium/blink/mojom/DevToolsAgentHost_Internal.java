// DevToolsAgentHost_Internal.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/devtools/devtools_agent.mojom
//

package org.chromium.blink.mojom;


class DevToolsAgentHost_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<DevToolsAgentHost, DevToolsAgentHost.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<DevToolsAgentHost, DevToolsAgentHost.Proxy>() {

        @Override
        public String getName() {
            return "blink.mojom.DevToolsAgentHost";
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
        public Stub buildStub(org.chromium.mojo.system.Core core, DevToolsAgentHost impl) {
            return new Stub(core, impl);
        }

        @Override
        public DevToolsAgentHost[] buildArray(int size) {
          return new DevToolsAgentHost[size];
        }
    };


    private static final int CHILD_WORKER_CREATED_ORDINAL = 0;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements DevToolsAgentHost.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void childWorkerCreated(
DevToolsAgent workerDevtoolsAgent, org.chromium.mojo.bindings.InterfaceRequest<DevToolsAgentHost> workerDevtoolsAgentHost, org.chromium.url.mojom.Url url, String name, org.chromium.mojo_base.mojom.UnguessableToken devtoolsWorkerToken, boolean waitingForDebugger) {

            DevToolsAgentHostChildWorkerCreatedParams _message = new DevToolsAgentHostChildWorkerCreatedParams();

            _message.workerDevtoolsAgent = workerDevtoolsAgent;

            _message.workerDevtoolsAgentHost = workerDevtoolsAgentHost;

            _message.url = url;

            _message.name = name;

            _message.devtoolsWorkerToken = devtoolsWorkerToken;

            _message.waitingForDebugger = waitingForDebugger;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(CHILD_WORKER_CREATED_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<DevToolsAgentHost> {

        Stub(org.chromium.mojo.system.Core core, DevToolsAgentHost impl) {
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
                                DevToolsAgentHost_Internal.MANAGER, messageWithHeader);





                    case CHILD_WORKER_CREATED_ORDINAL: {

                        DevToolsAgentHostChildWorkerCreatedParams data =
                                DevToolsAgentHostChildWorkerCreatedParams.deserialize(messageWithHeader.getPayload());

                        getImpl().childWorkerCreated(data.workerDevtoolsAgent, data.workerDevtoolsAgentHost, data.url, data.name, data.devtoolsWorkerToken, data.waitingForDebugger);
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
                                getCore(), DevToolsAgentHost_Internal.MANAGER, messageWithHeader, receiver);




                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }


    
    static final class DevToolsAgentHostChildWorkerCreatedParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 48;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(48, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public DevToolsAgent workerDevtoolsAgent;
        public org.chromium.mojo.bindings.InterfaceRequest<DevToolsAgentHost> workerDevtoolsAgentHost;
        public org.chromium.url.mojom.Url url;
        public String name;
        public org.chromium.mojo_base.mojom.UnguessableToken devtoolsWorkerToken;
        public boolean waitingForDebugger;

        private DevToolsAgentHostChildWorkerCreatedParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public DevToolsAgentHostChildWorkerCreatedParams() {
            this(0);
        }

        public static DevToolsAgentHostChildWorkerCreatedParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static DevToolsAgentHostChildWorkerCreatedParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static DevToolsAgentHostChildWorkerCreatedParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            DevToolsAgentHostChildWorkerCreatedParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new DevToolsAgentHostChildWorkerCreatedParams(elementsOrVersion);
                    {
                        
                    result.workerDevtoolsAgent = decoder0.readServiceInterface(8, false, DevToolsAgent.MANAGER);
                    }
                    {
                        
                    result.workerDevtoolsAgentHost = decoder0.readInterfaceRequest(16, false);
                    }
                    {
                        
                    result.waitingForDebugger = decoder0.readBoolean(20, 0);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, false);
                    result.url = org.chromium.url.mojom.Url.decode(decoder1);
                    }
                    {
                        
                    result.name = decoder0.readString(32, false);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(40, false);
                    result.devtoolsWorkerToken = org.chromium.mojo_base.mojom.UnguessableToken.decode(decoder1);
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
            
            encoder0.encode(this.workerDevtoolsAgent, 8, false, DevToolsAgent.MANAGER);
            
            encoder0.encode(this.workerDevtoolsAgentHost, 16, false);
            
            encoder0.encode(this.waitingForDebugger, 20, 0);
            
            encoder0.encode(this.url, 24, false);
            
            encoder0.encode(this.name, 32, false);
            
            encoder0.encode(this.devtoolsWorkerToken, 40, false);
        }
    }



}
