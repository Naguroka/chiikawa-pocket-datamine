package gatewayprotocol.v1;

/* JADX INFO: loaded from: classes6.dex */
public final class InitializationDataOuterClass {

    public interface InitializationDataOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest getInitializationRequest();

        gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData getSharedData();

        boolean hasInitializationRequest();

        boolean hasSharedData();
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
    }

    private InitializationDataOuterClass() {
    }

    public static final class InitializationData extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.InitializationDataOuterClass.InitializationData, gatewayprotocol.v1.InitializationDataOuterClass.InitializationData.Builder> implements gatewayprotocol.v1.InitializationDataOuterClass.InitializationDataOrBuilder {
        private static final gatewayprotocol.v1.InitializationDataOuterClass.InitializationData DEFAULT_INSTANCE;
        public static final int INITIALIZATION_REQUEST_FIELD_NUMBER = 1;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.InitializationDataOuterClass.InitializationData> PARSER = null;
        public static final int SHARED_DATA_FIELD_NUMBER = 2;
        private int bitField0_;
        private gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest initializationRequest_;
        private gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData sharedData_;

        private InitializationData() {
        }

        @Override // gatewayprotocol.v1.InitializationDataOuterClass.InitializationDataOrBuilder
        public boolean hasInitializationRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // gatewayprotocol.v1.InitializationDataOuterClass.InitializationDataOrBuilder
        public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest getInitializationRequest() {
            gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest initializationRequest = this.initializationRequest_;
            return initializationRequest == null ? gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.getDefaultInstance() : initializationRequest;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInitializationRequest(gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest initializationRequest) {
            initializationRequest.getClass();
            this.initializationRequest_ = initializationRequest;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeInitializationRequest(gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest initializationRequest) {
            initializationRequest.getClass();
            gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest initializationRequest2 = this.initializationRequest_;
            if (initializationRequest2 != null && initializationRequest2 != gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.getDefaultInstance()) {
                this.initializationRequest_ = gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.newBuilder(this.initializationRequest_).mergeFrom(initializationRequest).buildPartial();
            } else {
                this.initializationRequest_ = initializationRequest;
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInitializationRequest() {
            this.initializationRequest_ = null;
            this.bitField0_ &= -2;
        }

        @Override // gatewayprotocol.v1.InitializationDataOuterClass.InitializationDataOrBuilder
        public boolean hasSharedData() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // gatewayprotocol.v1.InitializationDataOuterClass.InitializationDataOrBuilder
        public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData getSharedData() {
            gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData sharedData = this.sharedData_;
            return sharedData == null ? gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.getDefaultInstance() : sharedData;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSharedData(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData sharedData) {
            sharedData.getClass();
            this.sharedData_ = sharedData;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSharedData(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData sharedData) {
            sharedData.getClass();
            gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData sharedData2 = this.sharedData_;
            if (sharedData2 != null && sharedData2 != gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.getDefaultInstance()) {
                this.sharedData_ = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.newBuilder(this.sharedData_).mergeFrom(sharedData).buildPartial();
            } else {
                this.sharedData_ = sharedData;
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSharedData() {
            this.sharedData_ = null;
            this.bitField0_ &= -3;
        }

        public static gatewayprotocol.v1.InitializationDataOuterClass.InitializationData parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.InitializationDataOuterClass.InitializationData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.InitializationDataOuterClass.InitializationData parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.InitializationDataOuterClass.InitializationData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.InitializationDataOuterClass.InitializationData parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.InitializationDataOuterClass.InitializationData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.InitializationDataOuterClass.InitializationData parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.InitializationDataOuterClass.InitializationData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.InitializationDataOuterClass.InitializationData parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.InitializationDataOuterClass.InitializationData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.InitializationDataOuterClass.InitializationData parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.InitializationDataOuterClass.InitializationData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.InitializationDataOuterClass.InitializationData parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.InitializationDataOuterClass.InitializationData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.InitializationDataOuterClass.InitializationData parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.InitializationDataOuterClass.InitializationData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.InitializationDataOuterClass.InitializationData parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.InitializationDataOuterClass.InitializationData) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.InitializationDataOuterClass.InitializationData parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.InitializationDataOuterClass.InitializationData) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.InitializationDataOuterClass.InitializationData parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.InitializationDataOuterClass.InitializationData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.InitializationDataOuterClass.InitializationData parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.InitializationDataOuterClass.InitializationData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.InitializationDataOuterClass.InitializationData.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.InitializationDataOuterClass.InitializationData.Builder newBuilder(gatewayprotocol.v1.InitializationDataOuterClass.InitializationData initializationData) {
            return DEFAULT_INSTANCE.createBuilder(initializationData);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.InitializationDataOuterClass.InitializationData, gatewayprotocol.v1.InitializationDataOuterClass.InitializationData.Builder> implements gatewayprotocol.v1.InitializationDataOuterClass.InitializationDataOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.InitializationDataOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.InitializationDataOuterClass.InitializationData.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.InitializationDataOuterClass.InitializationDataOrBuilder
            public boolean hasInitializationRequest() {
                return ((gatewayprotocol.v1.InitializationDataOuterClass.InitializationData) this.instance).hasInitializationRequest();
            }

            @Override // gatewayprotocol.v1.InitializationDataOuterClass.InitializationDataOrBuilder
            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest getInitializationRequest() {
                return ((gatewayprotocol.v1.InitializationDataOuterClass.InitializationData) this.instance).getInitializationRequest();
            }

            public gatewayprotocol.v1.InitializationDataOuterClass.InitializationData.Builder setInitializationRequest(gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest initializationRequest) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationDataOuterClass.InitializationData) this.instance).setInitializationRequest(initializationRequest);
                return this;
            }

            public gatewayprotocol.v1.InitializationDataOuterClass.InitializationData.Builder setInitializationRequest(gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationDataOuterClass.InitializationData) this.instance).setInitializationRequest(builder.build());
                return this;
            }

            public gatewayprotocol.v1.InitializationDataOuterClass.InitializationData.Builder mergeInitializationRequest(gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest initializationRequest) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationDataOuterClass.InitializationData) this.instance).mergeInitializationRequest(initializationRequest);
                return this;
            }

            public gatewayprotocol.v1.InitializationDataOuterClass.InitializationData.Builder clearInitializationRequest() {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationDataOuterClass.InitializationData) this.instance).clearInitializationRequest();
                return this;
            }

            @Override // gatewayprotocol.v1.InitializationDataOuterClass.InitializationDataOrBuilder
            public boolean hasSharedData() {
                return ((gatewayprotocol.v1.InitializationDataOuterClass.InitializationData) this.instance).hasSharedData();
            }

            @Override // gatewayprotocol.v1.InitializationDataOuterClass.InitializationDataOrBuilder
            public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData getSharedData() {
                return ((gatewayprotocol.v1.InitializationDataOuterClass.InitializationData) this.instance).getSharedData();
            }

            public gatewayprotocol.v1.InitializationDataOuterClass.InitializationData.Builder setSharedData(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData sharedData) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationDataOuterClass.InitializationData) this.instance).setSharedData(sharedData);
                return this;
            }

            public gatewayprotocol.v1.InitializationDataOuterClass.InitializationData.Builder setSharedData(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationDataOuterClass.InitializationData) this.instance).setSharedData(builder.build());
                return this;
            }

            public gatewayprotocol.v1.InitializationDataOuterClass.InitializationData.Builder mergeSharedData(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData sharedData) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationDataOuterClass.InitializationData) this.instance).mergeSharedData(sharedData);
                return this;
            }

            public gatewayprotocol.v1.InitializationDataOuterClass.InitializationData.Builder clearSharedData() {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationDataOuterClass.InitializationData) this.instance).clearSharedData();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.InitializationDataOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.InitializationDataOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.InitializationDataOuterClass.InitializationData();
                case 2:
                    return new gatewayprotocol.v1.InitializationDataOuterClass.InitializationData.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new java.lang.Object[]{"bitField0_", "initializationRequest_", "sharedData_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.InitializationDataOuterClass.InitializationData> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (gatewayprotocol.v1.InitializationDataOuterClass.InitializationData.class) {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                            break;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new java.lang.UnsupportedOperationException();
            }
        }

        static {
            gatewayprotocol.v1.InitializationDataOuterClass.InitializationData initializationData = new gatewayprotocol.v1.InitializationDataOuterClass.InitializationData();
            DEFAULT_INSTANCE = initializationData;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.InitializationDataOuterClass.InitializationData.class, initializationData);
        }

        public static gatewayprotocol.v1.InitializationDataOuterClass.InitializationData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.InitializationDataOuterClass.InitializationData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* JADX INFO: renamed from: gatewayprotocol.v1.InitializationDataOuterClass$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }
}
