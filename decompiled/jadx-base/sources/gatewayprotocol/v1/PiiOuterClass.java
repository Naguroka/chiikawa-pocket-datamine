package gatewayprotocol.v1;

/* JADX INFO: loaded from: classes6.dex */
public final class PiiOuterClass {

    public interface PiiOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        com.google.protobuf.ByteString getAdvertisingId();

        com.google.protobuf.ByteString getOpenAdvertisingTrackingId();

        com.google.protobuf.ByteString getVendorId();
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
    }

    private PiiOuterClass() {
    }

    public static final class Pii extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.PiiOuterClass.Pii, gatewayprotocol.v1.PiiOuterClass.Pii.Builder> implements gatewayprotocol.v1.PiiOuterClass.PiiOrBuilder {
        public static final int ADVERTISING_ID_FIELD_NUMBER = 1;
        private static final gatewayprotocol.v1.PiiOuterClass.Pii DEFAULT_INSTANCE;
        public static final int OPEN_ADVERTISING_TRACKING_ID_FIELD_NUMBER = 3;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.PiiOuterClass.Pii> PARSER = null;
        public static final int VENDOR_ID_FIELD_NUMBER = 2;
        private com.google.protobuf.ByteString advertisingId_ = com.google.protobuf.ByteString.EMPTY;
        private com.google.protobuf.ByteString vendorId_ = com.google.protobuf.ByteString.EMPTY;
        private com.google.protobuf.ByteString openAdvertisingTrackingId_ = com.google.protobuf.ByteString.EMPTY;

        private Pii() {
        }

        @Override // gatewayprotocol.v1.PiiOuterClass.PiiOrBuilder
        public com.google.protobuf.ByteString getAdvertisingId() {
            return this.advertisingId_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdvertisingId(com.google.protobuf.ByteString byteString) {
            byteString.getClass();
            this.advertisingId_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdvertisingId() {
            this.advertisingId_ = getDefaultInstance().getAdvertisingId();
        }

        @Override // gatewayprotocol.v1.PiiOuterClass.PiiOrBuilder
        public com.google.protobuf.ByteString getVendorId() {
            return this.vendorId_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVendorId(com.google.protobuf.ByteString byteString) {
            byteString.getClass();
            this.vendorId_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVendorId() {
            this.vendorId_ = getDefaultInstance().getVendorId();
        }

        @Override // gatewayprotocol.v1.PiiOuterClass.PiiOrBuilder
        public com.google.protobuf.ByteString getOpenAdvertisingTrackingId() {
            return this.openAdvertisingTrackingId_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOpenAdvertisingTrackingId(com.google.protobuf.ByteString byteString) {
            byteString.getClass();
            this.openAdvertisingTrackingId_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOpenAdvertisingTrackingId() {
            this.openAdvertisingTrackingId_ = getDefaultInstance().getOpenAdvertisingTrackingId();
        }

        public static gatewayprotocol.v1.PiiOuterClass.Pii parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.PiiOuterClass.Pii) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.PiiOuterClass.Pii parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.PiiOuterClass.Pii) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.PiiOuterClass.Pii parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.PiiOuterClass.Pii) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.PiiOuterClass.Pii parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.PiiOuterClass.Pii) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.PiiOuterClass.Pii parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.PiiOuterClass.Pii) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.PiiOuterClass.Pii parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.PiiOuterClass.Pii) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.PiiOuterClass.Pii parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.PiiOuterClass.Pii) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.PiiOuterClass.Pii parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.PiiOuterClass.Pii) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.PiiOuterClass.Pii parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.PiiOuterClass.Pii) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.PiiOuterClass.Pii parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.PiiOuterClass.Pii) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.PiiOuterClass.Pii parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.PiiOuterClass.Pii) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.PiiOuterClass.Pii parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.PiiOuterClass.Pii) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.PiiOuterClass.Pii.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.PiiOuterClass.Pii.Builder newBuilder(gatewayprotocol.v1.PiiOuterClass.Pii pii) {
            return DEFAULT_INSTANCE.createBuilder(pii);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.PiiOuterClass.Pii, gatewayprotocol.v1.PiiOuterClass.Pii.Builder> implements gatewayprotocol.v1.PiiOuterClass.PiiOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.PiiOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.PiiOuterClass.Pii.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.PiiOuterClass.PiiOrBuilder
            public com.google.protobuf.ByteString getAdvertisingId() {
                return ((gatewayprotocol.v1.PiiOuterClass.Pii) this.instance).getAdvertisingId();
            }

            public gatewayprotocol.v1.PiiOuterClass.Pii.Builder setAdvertisingId(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.PiiOuterClass.Pii) this.instance).setAdvertisingId(byteString);
                return this;
            }

            public gatewayprotocol.v1.PiiOuterClass.Pii.Builder clearAdvertisingId() {
                copyOnWrite();
                ((gatewayprotocol.v1.PiiOuterClass.Pii) this.instance).clearAdvertisingId();
                return this;
            }

            @Override // gatewayprotocol.v1.PiiOuterClass.PiiOrBuilder
            public com.google.protobuf.ByteString getVendorId() {
                return ((gatewayprotocol.v1.PiiOuterClass.Pii) this.instance).getVendorId();
            }

            public gatewayprotocol.v1.PiiOuterClass.Pii.Builder setVendorId(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.PiiOuterClass.Pii) this.instance).setVendorId(byteString);
                return this;
            }

            public gatewayprotocol.v1.PiiOuterClass.Pii.Builder clearVendorId() {
                copyOnWrite();
                ((gatewayprotocol.v1.PiiOuterClass.Pii) this.instance).clearVendorId();
                return this;
            }

            @Override // gatewayprotocol.v1.PiiOuterClass.PiiOrBuilder
            public com.google.protobuf.ByteString getOpenAdvertisingTrackingId() {
                return ((gatewayprotocol.v1.PiiOuterClass.Pii) this.instance).getOpenAdvertisingTrackingId();
            }

            public gatewayprotocol.v1.PiiOuterClass.Pii.Builder setOpenAdvertisingTrackingId(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.PiiOuterClass.Pii) this.instance).setOpenAdvertisingTrackingId(byteString);
                return this;
            }

            public gatewayprotocol.v1.PiiOuterClass.Pii.Builder clearOpenAdvertisingTrackingId() {
                copyOnWrite();
                ((gatewayprotocol.v1.PiiOuterClass.Pii) this.instance).clearOpenAdvertisingTrackingId();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.PiiOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.PiiOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.PiiOuterClass.Pii();
                case 2:
                    return new gatewayprotocol.v1.PiiOuterClass.Pii.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002\n\u0003\n", new java.lang.Object[]{"advertisingId_", "vendorId_", "openAdvertisingTrackingId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.PiiOuterClass.Pii> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (gatewayprotocol.v1.PiiOuterClass.Pii.class) {
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
            gatewayprotocol.v1.PiiOuterClass.Pii pii = new gatewayprotocol.v1.PiiOuterClass.Pii();
            DEFAULT_INSTANCE = pii;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.PiiOuterClass.Pii.class, pii);
        }

        public static gatewayprotocol.v1.PiiOuterClass.Pii getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.PiiOuterClass.Pii> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* JADX INFO: renamed from: gatewayprotocol.v1.PiiOuterClass$1, reason: invalid class name */
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
