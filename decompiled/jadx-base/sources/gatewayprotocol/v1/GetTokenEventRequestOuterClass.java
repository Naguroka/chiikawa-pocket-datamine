package gatewayprotocol.v1;

/* JADX INFO: loaded from: classes6.dex */
public final class GetTokenEventRequestOuterClass {

    public interface GetTokenEventRequestOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        com.google.protobuf.ByteString getBanner();

        com.google.protobuf.ByteString getInterstitial();

        com.google.protobuf.ByteString getRewarded();

        com.google.protobuf.ByteString getTokenId();

        boolean hasBanner();

        boolean hasInterstitial();

        boolean hasRewarded();
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
    }

    private GetTokenEventRequestOuterClass() {
    }

    public static final class GetTokenEventRequest extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest, gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder> implements gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequestOrBuilder {
        public static final int BANNER_FIELD_NUMBER = 3;
        private static final gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest DEFAULT_INSTANCE;
        public static final int INTERSTITIAL_FIELD_NUMBER = 2;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest> PARSER = null;
        public static final int REWARDED_FIELD_NUMBER = 1;
        public static final int TOKEN_ID_FIELD_NUMBER = 4;
        private int bitField0_;
        private com.google.protobuf.ByteString rewarded_ = com.google.protobuf.ByteString.EMPTY;
        private com.google.protobuf.ByteString interstitial_ = com.google.protobuf.ByteString.EMPTY;
        private com.google.protobuf.ByteString banner_ = com.google.protobuf.ByteString.EMPTY;
        private com.google.protobuf.ByteString tokenId_ = com.google.protobuf.ByteString.EMPTY;

        private GetTokenEventRequest() {
        }

        @Override // gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequestOrBuilder
        public boolean hasRewarded() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequestOrBuilder
        public com.google.protobuf.ByteString getRewarded() {
            return this.rewarded_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRewarded(com.google.protobuf.ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 1;
            this.rewarded_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRewarded() {
            this.bitField0_ &= -2;
            this.rewarded_ = getDefaultInstance().getRewarded();
        }

        @Override // gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequestOrBuilder
        public boolean hasInterstitial() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequestOrBuilder
        public com.google.protobuf.ByteString getInterstitial() {
            return this.interstitial_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInterstitial(com.google.protobuf.ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 2;
            this.interstitial_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInterstitial() {
            this.bitField0_ &= -3;
            this.interstitial_ = getDefaultInstance().getInterstitial();
        }

        @Override // gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequestOrBuilder
        public boolean hasBanner() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequestOrBuilder
        public com.google.protobuf.ByteString getBanner() {
            return this.banner_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBanner(com.google.protobuf.ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 4;
            this.banner_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBanner() {
            this.bitField0_ &= -5;
            this.banner_ = getDefaultInstance().getBanner();
        }

        @Override // gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequestOrBuilder
        public com.google.protobuf.ByteString getTokenId() {
            return this.tokenId_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTokenId(com.google.protobuf.ByteString byteString) {
            byteString.getClass();
            this.tokenId_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTokenId() {
            this.tokenId_ = getDefaultInstance().getTokenId();
        }

        public static gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder newBuilder(gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest getTokenEventRequest) {
            return DEFAULT_INSTANCE.createBuilder(getTokenEventRequest);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest, gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder> implements gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequestOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.GetTokenEventRequestOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequestOrBuilder
            public boolean hasRewarded() {
                return ((gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest) this.instance).hasRewarded();
            }

            @Override // gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequestOrBuilder
            public com.google.protobuf.ByteString getRewarded() {
                return ((gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest) this.instance).getRewarded();
            }

            public gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder setRewarded(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest) this.instance).setRewarded(byteString);
                return this;
            }

            public gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder clearRewarded() {
                copyOnWrite();
                ((gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest) this.instance).clearRewarded();
                return this;
            }

            @Override // gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequestOrBuilder
            public boolean hasInterstitial() {
                return ((gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest) this.instance).hasInterstitial();
            }

            @Override // gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequestOrBuilder
            public com.google.protobuf.ByteString getInterstitial() {
                return ((gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest) this.instance).getInterstitial();
            }

            public gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder setInterstitial(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest) this.instance).setInterstitial(byteString);
                return this;
            }

            public gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder clearInterstitial() {
                copyOnWrite();
                ((gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest) this.instance).clearInterstitial();
                return this;
            }

            @Override // gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequestOrBuilder
            public boolean hasBanner() {
                return ((gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest) this.instance).hasBanner();
            }

            @Override // gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequestOrBuilder
            public com.google.protobuf.ByteString getBanner() {
                return ((gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest) this.instance).getBanner();
            }

            public gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder setBanner(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest) this.instance).setBanner(byteString);
                return this;
            }

            public gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder clearBanner() {
                copyOnWrite();
                ((gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest) this.instance).clearBanner();
                return this;
            }

            @Override // gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequestOrBuilder
            public com.google.protobuf.ByteString getTokenId() {
                return ((gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest) this.instance).getTokenId();
            }

            public gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder setTokenId(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest) this.instance).setTokenId(byteString);
                return this;
            }

            public gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder clearTokenId() {
                copyOnWrite();
                ((gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest) this.instance).clearTokenId();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.GetTokenEventRequestOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.GetTokenEventRequestOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest();
                case 2:
                    return new gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004\n", new java.lang.Object[]{"bitField0_", "rewarded_", "interstitial_", "banner_", "tokenId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest.class) {
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
            gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest getTokenEventRequest = new gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest();
            DEFAULT_INSTANCE = getTokenEventRequest;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest.class, getTokenEventRequest);
        }

        public static gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* JADX INFO: renamed from: gatewayprotocol.v1.GetTokenEventRequestOuterClass$1, reason: invalid class name */
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
