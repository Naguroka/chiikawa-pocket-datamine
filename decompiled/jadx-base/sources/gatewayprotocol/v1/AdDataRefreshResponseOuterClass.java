package gatewayprotocol.v1;

/* JADX INFO: loaded from: classes6.dex */
public final class AdDataRefreshResponseOuterClass {

    public interface AdDataRefreshResponseOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        com.google.protobuf.ByteString getAdData();

        com.google.protobuf.ByteString getAdDataRefreshToken();

        int getAdDataVersion();

        gatewayprotocol.v1.ErrorOuterClass.Error getError();

        com.google.protobuf.ByteString getTrackingToken();

        boolean hasError();
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
    }

    private AdDataRefreshResponseOuterClass() {
    }

    public static final class AdDataRefreshResponse extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse, gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder> implements gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponseOrBuilder {
        public static final int AD_DATA_FIELD_NUMBER = 1;
        public static final int AD_DATA_REFRESH_TOKEN_FIELD_NUMBER = 4;
        public static final int AD_DATA_VERSION_FIELD_NUMBER = 2;
        private static final gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse DEFAULT_INSTANCE;
        public static final int ERROR_FIELD_NUMBER = 5;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse> PARSER = null;
        public static final int TRACKING_TOKEN_FIELD_NUMBER = 3;
        private int adDataVersion_;
        private int bitField0_;
        private gatewayprotocol.v1.ErrorOuterClass.Error error_;
        private com.google.protobuf.ByteString adData_ = com.google.protobuf.ByteString.EMPTY;
        private com.google.protobuf.ByteString trackingToken_ = com.google.protobuf.ByteString.EMPTY;
        private com.google.protobuf.ByteString adDataRefreshToken_ = com.google.protobuf.ByteString.EMPTY;

        private AdDataRefreshResponse() {
        }

        @Override // gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponseOrBuilder
        public com.google.protobuf.ByteString getAdData() {
            return this.adData_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdData(com.google.protobuf.ByteString byteString) {
            byteString.getClass();
            this.adData_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdData() {
            this.adData_ = getDefaultInstance().getAdData();
        }

        @Override // gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponseOrBuilder
        public int getAdDataVersion() {
            return this.adDataVersion_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdDataVersion(int i) {
            this.adDataVersion_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdDataVersion() {
            this.adDataVersion_ = 0;
        }

        @Override // gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponseOrBuilder
        public com.google.protobuf.ByteString getTrackingToken() {
            return this.trackingToken_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrackingToken(com.google.protobuf.ByteString byteString) {
            byteString.getClass();
            this.trackingToken_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTrackingToken() {
            this.trackingToken_ = getDefaultInstance().getTrackingToken();
        }

        @Override // gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponseOrBuilder
        public com.google.protobuf.ByteString getAdDataRefreshToken() {
            return this.adDataRefreshToken_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdDataRefreshToken(com.google.protobuf.ByteString byteString) {
            byteString.getClass();
            this.adDataRefreshToken_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdDataRefreshToken() {
            this.adDataRefreshToken_ = getDefaultInstance().getAdDataRefreshToken();
        }

        @Override // gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponseOrBuilder
        public boolean hasError() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponseOrBuilder
        public gatewayprotocol.v1.ErrorOuterClass.Error getError() {
            gatewayprotocol.v1.ErrorOuterClass.Error error = this.error_;
            return error == null ? gatewayprotocol.v1.ErrorOuterClass.Error.getDefaultInstance() : error;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setError(gatewayprotocol.v1.ErrorOuterClass.Error error) {
            error.getClass();
            this.error_ = error;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeError(gatewayprotocol.v1.ErrorOuterClass.Error error) {
            error.getClass();
            gatewayprotocol.v1.ErrorOuterClass.Error error2 = this.error_;
            if (error2 != null && error2 != gatewayprotocol.v1.ErrorOuterClass.Error.getDefaultInstance()) {
                this.error_ = gatewayprotocol.v1.ErrorOuterClass.Error.newBuilder(this.error_).mergeFrom(error).buildPartial();
            } else {
                this.error_ = error;
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearError() {
            this.error_ = null;
            this.bitField0_ &= -2;
        }

        public static gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder newBuilder(gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse adDataRefreshResponse) {
            return DEFAULT_INSTANCE.createBuilder(adDataRefreshResponse);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse, gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder> implements gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponseOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponseOrBuilder
            public com.google.protobuf.ByteString getAdData() {
                return ((gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse) this.instance).getAdData();
            }

            public gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder setAdData(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse) this.instance).setAdData(byteString);
                return this;
            }

            public gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder clearAdData() {
                copyOnWrite();
                ((gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse) this.instance).clearAdData();
                return this;
            }

            @Override // gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponseOrBuilder
            public int getAdDataVersion() {
                return ((gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse) this.instance).getAdDataVersion();
            }

            public gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder setAdDataVersion(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse) this.instance).setAdDataVersion(i);
                return this;
            }

            public gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder clearAdDataVersion() {
                copyOnWrite();
                ((gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse) this.instance).clearAdDataVersion();
                return this;
            }

            @Override // gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponseOrBuilder
            public com.google.protobuf.ByteString getTrackingToken() {
                return ((gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse) this.instance).getTrackingToken();
            }

            public gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder setTrackingToken(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse) this.instance).setTrackingToken(byteString);
                return this;
            }

            public gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder clearTrackingToken() {
                copyOnWrite();
                ((gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse) this.instance).clearTrackingToken();
                return this;
            }

            @Override // gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponseOrBuilder
            public com.google.protobuf.ByteString getAdDataRefreshToken() {
                return ((gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse) this.instance).getAdDataRefreshToken();
            }

            public gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder setAdDataRefreshToken(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse) this.instance).setAdDataRefreshToken(byteString);
                return this;
            }

            public gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder clearAdDataRefreshToken() {
                copyOnWrite();
                ((gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse) this.instance).clearAdDataRefreshToken();
                return this;
            }

            @Override // gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponseOrBuilder
            public boolean hasError() {
                return ((gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse) this.instance).hasError();
            }

            @Override // gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponseOrBuilder
            public gatewayprotocol.v1.ErrorOuterClass.Error getError() {
                return ((gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse) this.instance).getError();
            }

            public gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder setError(gatewayprotocol.v1.ErrorOuterClass.Error error) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse) this.instance).setError(error);
                return this;
            }

            public gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder setError(gatewayprotocol.v1.ErrorOuterClass.Error.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse) this.instance).setError(builder.build());
                return this;
            }

            public gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder mergeError(gatewayprotocol.v1.ErrorOuterClass.Error error) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse) this.instance).mergeError(error);
                return this;
            }

            public gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder clearError() {
                copyOnWrite();
                ((gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse) this.instance).clearError();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse();
                case 2:
                    return new gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\n\u0002\u0004\u0003\n\u0004\n\u0005ဉ\u0000", new java.lang.Object[]{"bitField0_", "adData_", "adDataVersion_", "trackingToken_", "adDataRefreshToken_", "error_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.class) {
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
            gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse adDataRefreshResponse = new gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse();
            DEFAULT_INSTANCE = adDataRefreshResponse;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.class, adDataRefreshResponse);
        }

        public static gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* JADX INFO: renamed from: gatewayprotocol.v1.AdDataRefreshResponseOuterClass$1, reason: invalid class name */
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
