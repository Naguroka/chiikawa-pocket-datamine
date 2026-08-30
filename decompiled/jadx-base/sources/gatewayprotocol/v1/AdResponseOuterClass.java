package gatewayprotocol.v1;

/* JADX INFO: loaded from: classes6.dex */
public final class AdResponseOuterClass {

    public interface AdResponseOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        com.google.protobuf.ByteString getAdData();

        com.google.protobuf.ByteString getAdDataRefreshToken();

        int getAdDataVersion();

        gatewayprotocol.v1.ErrorOuterClass.Error getError();

        com.google.protobuf.ByteString getImpressionConfiguration();

        int getImpressionConfigurationVersion();

        com.google.protobuf.ByteString getTrackingToken();

        gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration getWebviewConfiguration();

        boolean hasError();

        boolean hasWebviewConfiguration();
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
    }

    private AdResponseOuterClass() {
    }

    public static final class AdResponse extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.AdResponseOuterClass.AdResponse, gatewayprotocol.v1.AdResponseOuterClass.AdResponse.Builder> implements gatewayprotocol.v1.AdResponseOuterClass.AdResponseOrBuilder {
        public static final int AD_DATA_FIELD_NUMBER = 6;
        public static final int AD_DATA_REFRESH_TOKEN_FIELD_NUMBER = 5;
        public static final int AD_DATA_VERSION_FIELD_NUMBER = 7;
        private static final gatewayprotocol.v1.AdResponseOuterClass.AdResponse DEFAULT_INSTANCE;
        public static final int ERROR_FIELD_NUMBER = 8;
        public static final int IMPRESSION_CONFIGURATION_FIELD_NUMBER = 2;
        public static final int IMPRESSION_CONFIGURATION_VERSION_FIELD_NUMBER = 3;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.AdResponseOuterClass.AdResponse> PARSER = null;
        public static final int TRACKING_TOKEN_FIELD_NUMBER = 1;
        public static final int WEBVIEW_CONFIGURATION_FIELD_NUMBER = 4;
        private int adDataVersion_;
        private int bitField0_;
        private gatewayprotocol.v1.ErrorOuterClass.Error error_;
        private int impressionConfigurationVersion_;
        private gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration webviewConfiguration_;
        private com.google.protobuf.ByteString trackingToken_ = com.google.protobuf.ByteString.EMPTY;
        private com.google.protobuf.ByteString impressionConfiguration_ = com.google.protobuf.ByteString.EMPTY;
        private com.google.protobuf.ByteString adDataRefreshToken_ = com.google.protobuf.ByteString.EMPTY;
        private com.google.protobuf.ByteString adData_ = com.google.protobuf.ByteString.EMPTY;

        private AdResponse() {
        }

        @Override // gatewayprotocol.v1.AdResponseOuterClass.AdResponseOrBuilder
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

        @Override // gatewayprotocol.v1.AdResponseOuterClass.AdResponseOrBuilder
        public com.google.protobuf.ByteString getImpressionConfiguration() {
            return this.impressionConfiguration_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImpressionConfiguration(com.google.protobuf.ByteString byteString) {
            byteString.getClass();
            this.impressionConfiguration_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearImpressionConfiguration() {
            this.impressionConfiguration_ = getDefaultInstance().getImpressionConfiguration();
        }

        @Override // gatewayprotocol.v1.AdResponseOuterClass.AdResponseOrBuilder
        public int getImpressionConfigurationVersion() {
            return this.impressionConfigurationVersion_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImpressionConfigurationVersion(int i) {
            this.impressionConfigurationVersion_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearImpressionConfigurationVersion() {
            this.impressionConfigurationVersion_ = 0;
        }

        @Override // gatewayprotocol.v1.AdResponseOuterClass.AdResponseOrBuilder
        public boolean hasWebviewConfiguration() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // gatewayprotocol.v1.AdResponseOuterClass.AdResponseOrBuilder
        public gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration getWebviewConfiguration() {
            gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration webViewConfiguration = this.webviewConfiguration_;
            return webViewConfiguration == null ? gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration.getDefaultInstance() : webViewConfiguration;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWebviewConfiguration(gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration webViewConfiguration) {
            webViewConfiguration.getClass();
            this.webviewConfiguration_ = webViewConfiguration;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeWebviewConfiguration(gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration webViewConfiguration) {
            webViewConfiguration.getClass();
            gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration webViewConfiguration2 = this.webviewConfiguration_;
            if (webViewConfiguration2 != null && webViewConfiguration2 != gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration.getDefaultInstance()) {
                this.webviewConfiguration_ = gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration.newBuilder(this.webviewConfiguration_).mergeFrom(webViewConfiguration).buildPartial();
            } else {
                this.webviewConfiguration_ = webViewConfiguration;
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWebviewConfiguration() {
            this.webviewConfiguration_ = null;
            this.bitField0_ &= -2;
        }

        @Override // gatewayprotocol.v1.AdResponseOuterClass.AdResponseOrBuilder
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

        @Override // gatewayprotocol.v1.AdResponseOuterClass.AdResponseOrBuilder
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

        @Override // gatewayprotocol.v1.AdResponseOuterClass.AdResponseOrBuilder
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

        @Override // gatewayprotocol.v1.AdResponseOuterClass.AdResponseOrBuilder
        public boolean hasError() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // gatewayprotocol.v1.AdResponseOuterClass.AdResponseOrBuilder
        public gatewayprotocol.v1.ErrorOuterClass.Error getError() {
            gatewayprotocol.v1.ErrorOuterClass.Error error = this.error_;
            return error == null ? gatewayprotocol.v1.ErrorOuterClass.Error.getDefaultInstance() : error;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setError(gatewayprotocol.v1.ErrorOuterClass.Error error) {
            error.getClass();
            this.error_ = error;
            this.bitField0_ |= 2;
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
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearError() {
            this.error_ = null;
            this.bitField0_ &= -3;
        }

        public static gatewayprotocol.v1.AdResponseOuterClass.AdResponse parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.AdResponseOuterClass.AdResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.AdResponseOuterClass.AdResponse parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.AdResponseOuterClass.AdResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.AdResponseOuterClass.AdResponse parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.AdResponseOuterClass.AdResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.AdResponseOuterClass.AdResponse parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.AdResponseOuterClass.AdResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.AdResponseOuterClass.AdResponse parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.AdResponseOuterClass.AdResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.AdResponseOuterClass.AdResponse parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.AdResponseOuterClass.AdResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.AdResponseOuterClass.AdResponse parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.AdResponseOuterClass.AdResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.AdResponseOuterClass.AdResponse parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.AdResponseOuterClass.AdResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.AdResponseOuterClass.AdResponse parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.AdResponseOuterClass.AdResponse) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.AdResponseOuterClass.AdResponse parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.AdResponseOuterClass.AdResponse) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.AdResponseOuterClass.AdResponse parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.AdResponseOuterClass.AdResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.AdResponseOuterClass.AdResponse parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.AdResponseOuterClass.AdResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.AdResponseOuterClass.AdResponse.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.AdResponseOuterClass.AdResponse.Builder newBuilder(gatewayprotocol.v1.AdResponseOuterClass.AdResponse adResponse) {
            return DEFAULT_INSTANCE.createBuilder(adResponse);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.AdResponseOuterClass.AdResponse, gatewayprotocol.v1.AdResponseOuterClass.AdResponse.Builder> implements gatewayprotocol.v1.AdResponseOuterClass.AdResponseOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.AdResponseOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.AdResponseOuterClass.AdResponse.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.AdResponseOuterClass.AdResponseOrBuilder
            public com.google.protobuf.ByteString getTrackingToken() {
                return ((gatewayprotocol.v1.AdResponseOuterClass.AdResponse) this.instance).getTrackingToken();
            }

            public gatewayprotocol.v1.AdResponseOuterClass.AdResponse.Builder setTrackingToken(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdResponseOuterClass.AdResponse) this.instance).setTrackingToken(byteString);
                return this;
            }

            public gatewayprotocol.v1.AdResponseOuterClass.AdResponse.Builder clearTrackingToken() {
                copyOnWrite();
                ((gatewayprotocol.v1.AdResponseOuterClass.AdResponse) this.instance).clearTrackingToken();
                return this;
            }

            @Override // gatewayprotocol.v1.AdResponseOuterClass.AdResponseOrBuilder
            public com.google.protobuf.ByteString getImpressionConfiguration() {
                return ((gatewayprotocol.v1.AdResponseOuterClass.AdResponse) this.instance).getImpressionConfiguration();
            }

            public gatewayprotocol.v1.AdResponseOuterClass.AdResponse.Builder setImpressionConfiguration(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdResponseOuterClass.AdResponse) this.instance).setImpressionConfiguration(byteString);
                return this;
            }

            public gatewayprotocol.v1.AdResponseOuterClass.AdResponse.Builder clearImpressionConfiguration() {
                copyOnWrite();
                ((gatewayprotocol.v1.AdResponseOuterClass.AdResponse) this.instance).clearImpressionConfiguration();
                return this;
            }

            @Override // gatewayprotocol.v1.AdResponseOuterClass.AdResponseOrBuilder
            public int getImpressionConfigurationVersion() {
                return ((gatewayprotocol.v1.AdResponseOuterClass.AdResponse) this.instance).getImpressionConfigurationVersion();
            }

            public gatewayprotocol.v1.AdResponseOuterClass.AdResponse.Builder setImpressionConfigurationVersion(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdResponseOuterClass.AdResponse) this.instance).setImpressionConfigurationVersion(i);
                return this;
            }

            public gatewayprotocol.v1.AdResponseOuterClass.AdResponse.Builder clearImpressionConfigurationVersion() {
                copyOnWrite();
                ((gatewayprotocol.v1.AdResponseOuterClass.AdResponse) this.instance).clearImpressionConfigurationVersion();
                return this;
            }

            @Override // gatewayprotocol.v1.AdResponseOuterClass.AdResponseOrBuilder
            public boolean hasWebviewConfiguration() {
                return ((gatewayprotocol.v1.AdResponseOuterClass.AdResponse) this.instance).hasWebviewConfiguration();
            }

            @Override // gatewayprotocol.v1.AdResponseOuterClass.AdResponseOrBuilder
            public gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration getWebviewConfiguration() {
                return ((gatewayprotocol.v1.AdResponseOuterClass.AdResponse) this.instance).getWebviewConfiguration();
            }

            public gatewayprotocol.v1.AdResponseOuterClass.AdResponse.Builder setWebviewConfiguration(gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration webViewConfiguration) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdResponseOuterClass.AdResponse) this.instance).setWebviewConfiguration(webViewConfiguration);
                return this;
            }

            public gatewayprotocol.v1.AdResponseOuterClass.AdResponse.Builder setWebviewConfiguration(gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdResponseOuterClass.AdResponse) this.instance).setWebviewConfiguration(builder.build());
                return this;
            }

            public gatewayprotocol.v1.AdResponseOuterClass.AdResponse.Builder mergeWebviewConfiguration(gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration webViewConfiguration) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdResponseOuterClass.AdResponse) this.instance).mergeWebviewConfiguration(webViewConfiguration);
                return this;
            }

            public gatewayprotocol.v1.AdResponseOuterClass.AdResponse.Builder clearWebviewConfiguration() {
                copyOnWrite();
                ((gatewayprotocol.v1.AdResponseOuterClass.AdResponse) this.instance).clearWebviewConfiguration();
                return this;
            }

            @Override // gatewayprotocol.v1.AdResponseOuterClass.AdResponseOrBuilder
            public com.google.protobuf.ByteString getAdDataRefreshToken() {
                return ((gatewayprotocol.v1.AdResponseOuterClass.AdResponse) this.instance).getAdDataRefreshToken();
            }

            public gatewayprotocol.v1.AdResponseOuterClass.AdResponse.Builder setAdDataRefreshToken(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdResponseOuterClass.AdResponse) this.instance).setAdDataRefreshToken(byteString);
                return this;
            }

            public gatewayprotocol.v1.AdResponseOuterClass.AdResponse.Builder clearAdDataRefreshToken() {
                copyOnWrite();
                ((gatewayprotocol.v1.AdResponseOuterClass.AdResponse) this.instance).clearAdDataRefreshToken();
                return this;
            }

            @Override // gatewayprotocol.v1.AdResponseOuterClass.AdResponseOrBuilder
            public com.google.protobuf.ByteString getAdData() {
                return ((gatewayprotocol.v1.AdResponseOuterClass.AdResponse) this.instance).getAdData();
            }

            public gatewayprotocol.v1.AdResponseOuterClass.AdResponse.Builder setAdData(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdResponseOuterClass.AdResponse) this.instance).setAdData(byteString);
                return this;
            }

            public gatewayprotocol.v1.AdResponseOuterClass.AdResponse.Builder clearAdData() {
                copyOnWrite();
                ((gatewayprotocol.v1.AdResponseOuterClass.AdResponse) this.instance).clearAdData();
                return this;
            }

            @Override // gatewayprotocol.v1.AdResponseOuterClass.AdResponseOrBuilder
            public int getAdDataVersion() {
                return ((gatewayprotocol.v1.AdResponseOuterClass.AdResponse) this.instance).getAdDataVersion();
            }

            public gatewayprotocol.v1.AdResponseOuterClass.AdResponse.Builder setAdDataVersion(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdResponseOuterClass.AdResponse) this.instance).setAdDataVersion(i);
                return this;
            }

            public gatewayprotocol.v1.AdResponseOuterClass.AdResponse.Builder clearAdDataVersion() {
                copyOnWrite();
                ((gatewayprotocol.v1.AdResponseOuterClass.AdResponse) this.instance).clearAdDataVersion();
                return this;
            }

            @Override // gatewayprotocol.v1.AdResponseOuterClass.AdResponseOrBuilder
            public boolean hasError() {
                return ((gatewayprotocol.v1.AdResponseOuterClass.AdResponse) this.instance).hasError();
            }

            @Override // gatewayprotocol.v1.AdResponseOuterClass.AdResponseOrBuilder
            public gatewayprotocol.v1.ErrorOuterClass.Error getError() {
                return ((gatewayprotocol.v1.AdResponseOuterClass.AdResponse) this.instance).getError();
            }

            public gatewayprotocol.v1.AdResponseOuterClass.AdResponse.Builder setError(gatewayprotocol.v1.ErrorOuterClass.Error error) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdResponseOuterClass.AdResponse) this.instance).setError(error);
                return this;
            }

            public gatewayprotocol.v1.AdResponseOuterClass.AdResponse.Builder setError(gatewayprotocol.v1.ErrorOuterClass.Error.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdResponseOuterClass.AdResponse) this.instance).setError(builder.build());
                return this;
            }

            public gatewayprotocol.v1.AdResponseOuterClass.AdResponse.Builder mergeError(gatewayprotocol.v1.ErrorOuterClass.Error error) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdResponseOuterClass.AdResponse) this.instance).mergeError(error);
                return this;
            }

            public gatewayprotocol.v1.AdResponseOuterClass.AdResponse.Builder clearError() {
                copyOnWrite();
                ((gatewayprotocol.v1.AdResponseOuterClass.AdResponse) this.instance).clearError();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.AdResponseOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.AdResponseOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.AdResponseOuterClass.AdResponse();
                case 2:
                    return new gatewayprotocol.v1.AdResponseOuterClass.AdResponse.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\n\u0002\n\u0003\u0004\u0004ဉ\u0000\u0005\n\u0006\n\u0007\u0004\bဉ\u0001", new java.lang.Object[]{"bitField0_", "trackingToken_", "impressionConfiguration_", "impressionConfigurationVersion_", "webviewConfiguration_", "adDataRefreshToken_", "adData_", "adDataVersion_", "error_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.AdResponseOuterClass.AdResponse> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (gatewayprotocol.v1.AdResponseOuterClass.AdResponse.class) {
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
            gatewayprotocol.v1.AdResponseOuterClass.AdResponse adResponse = new gatewayprotocol.v1.AdResponseOuterClass.AdResponse();
            DEFAULT_INSTANCE = adResponse;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.AdResponseOuterClass.AdResponse.class, adResponse);
        }

        public static gatewayprotocol.v1.AdResponseOuterClass.AdResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.AdResponseOuterClass.AdResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* JADX INFO: renamed from: gatewayprotocol.v1.AdResponseOuterClass$1, reason: invalid class name */
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
