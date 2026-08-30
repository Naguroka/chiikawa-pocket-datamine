package gatewayprotocol.v1;

/* JADX INFO: loaded from: classes6.dex */
public final class AllowedPiiOuterClass {

    public interface AllowedPiiOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        boolean getIdfa();

        boolean getIdfv();
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
    }

    private AllowedPiiOuterClass() {
    }

    public static final class AllowedPii extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii, gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii.Builder> implements gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPiiOrBuilder {
        private static final gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii DEFAULT_INSTANCE;
        public static final int IDFA_FIELD_NUMBER = 1;
        public static final int IDFV_FIELD_NUMBER = 2;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii> PARSER;
        private boolean idfa_;
        private boolean idfv_;

        private AllowedPii() {
        }

        @Override // gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPiiOrBuilder
        public boolean getIdfa() {
            return this.idfa_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdfa(boolean z) {
            this.idfa_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIdfa() {
            this.idfa_ = false;
        }

        @Override // gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPiiOrBuilder
        public boolean getIdfv() {
            return this.idfv_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdfv(boolean z) {
            this.idfv_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIdfv() {
            this.idfv_ = false;
        }

        public static gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii.Builder newBuilder(gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii allowedPii) {
            return DEFAULT_INSTANCE.createBuilder(allowedPii);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii, gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii.Builder> implements gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPiiOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.AllowedPiiOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPiiOrBuilder
            public boolean getIdfa() {
                return ((gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii) this.instance).getIdfa();
            }

            public gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii.Builder setIdfa(boolean z) {
                copyOnWrite();
                ((gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii) this.instance).setIdfa(z);
                return this;
            }

            public gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii.Builder clearIdfa() {
                copyOnWrite();
                ((gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii) this.instance).clearIdfa();
                return this;
            }

            @Override // gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPiiOrBuilder
            public boolean getIdfv() {
                return ((gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii) this.instance).getIdfv();
            }

            public gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii.Builder setIdfv(boolean z) {
                copyOnWrite();
                ((gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii) this.instance).setIdfv(z);
                return this;
            }

            public gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii.Builder clearIdfv() {
                copyOnWrite();
                ((gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii) this.instance).clearIdfv();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.AllowedPiiOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.AllowedPiiOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii();
                case 2:
                    return new gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new java.lang.Object[]{"idfa_", "idfv_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii.class) {
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
            gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii allowedPii = new gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii();
            DEFAULT_INSTANCE = allowedPii;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii.class, allowedPii);
        }

        public static gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* JADX INFO: renamed from: gatewayprotocol.v1.AllowedPiiOuterClass$1, reason: invalid class name */
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
