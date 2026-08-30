package gatewayprotocol.v1;

/* JADX INFO: loaded from: classes6.dex */
public final class PrivacyUpdateRequestOuterClass {

    public interface PrivacyUpdateRequestOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        com.google.protobuf.ByteString getContent();

        int getVersion();
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
    }

    private PrivacyUpdateRequestOuterClass() {
    }

    public static final class PrivacyUpdateRequest extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest, gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder> implements gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequestOrBuilder {
        public static final int CONTENT_FIELD_NUMBER = 2;
        private static final gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest> PARSER = null;
        public static final int VERSION_FIELD_NUMBER = 1;
        private com.google.protobuf.ByteString content_ = com.google.protobuf.ByteString.EMPTY;
        private int version_;

        private PrivacyUpdateRequest() {
        }

        @Override // gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequestOrBuilder
        public int getVersion() {
            return this.version_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersion(int i) {
            this.version_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVersion() {
            this.version_ = 0;
        }

        @Override // gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequestOrBuilder
        public com.google.protobuf.ByteString getContent() {
            return this.content_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContent(com.google.protobuf.ByteString byteString) {
            byteString.getClass();
            this.content_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearContent() {
            this.content_ = getDefaultInstance().getContent();
        }

        public static gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder newBuilder(gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest privacyUpdateRequest) {
            return DEFAULT_INSTANCE.createBuilder(privacyUpdateRequest);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest, gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder> implements gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequestOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequestOrBuilder
            public int getVersion() {
                return ((gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest) this.instance).getVersion();
            }

            public gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder setVersion(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest) this.instance).setVersion(i);
                return this;
            }

            public gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder clearVersion() {
                copyOnWrite();
                ((gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest) this.instance).clearVersion();
                return this;
            }

            @Override // gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequestOrBuilder
            public com.google.protobuf.ByteString getContent() {
                return ((gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest) this.instance).getContent();
            }

            public gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder setContent(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest) this.instance).setContent(byteString);
                return this;
            }

            public gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder clearContent() {
                copyOnWrite();
                ((gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest) this.instance).clearContent();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest();
                case 2:
                    return new gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\n", new java.lang.Object[]{"version_", "content_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.class) {
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
            gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest privacyUpdateRequest = new gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest();
            DEFAULT_INSTANCE = privacyUpdateRequest;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.class, privacyUpdateRequest);
        }

        public static gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* JADX INFO: renamed from: gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$1, reason: invalid class name */
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
