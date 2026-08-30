package gatewayprotocol.v1;

/* JADX INFO: loaded from: classes6.dex */
public final class AdPlayerConfigRequestOuterClass {

    public interface AdPlayerConfigRequestOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat getAdFormat();

        int getAdFormatValue();

        com.google.protobuf.ByteString getConfigurationToken();

        com.google.protobuf.ByteString getImpressionOpportunityId();

        java.lang.String getPlacementId();

        com.google.protobuf.ByteString getPlacementIdBytes();

        int getWebviewVersion();

        boolean hasAdFormat();

        boolean hasWebviewVersion();
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
    }

    private AdPlayerConfigRequestOuterClass() {
    }

    public static final class AdPlayerConfigRequest extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest, gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder> implements gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder {
        public static final int AD_FORMAT_FIELD_NUMBER = 5;
        public static final int CONFIGURATION_TOKEN_FIELD_NUMBER = 1;
        private static final gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest DEFAULT_INSTANCE;
        public static final int IMPRESSION_OPPORTUNITY_ID_FIELD_NUMBER = 4;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest> PARSER = null;
        public static final int PLACEMENT_ID_FIELD_NUMBER = 2;
        public static final int WEBVIEW_VERSION_FIELD_NUMBER = 9;
        private int adFormat_;
        private int bitField0_;
        private int webviewVersion_;
        private com.google.protobuf.ByteString configurationToken_ = com.google.protobuf.ByteString.EMPTY;
        private java.lang.String placementId_ = "";
        private com.google.protobuf.ByteString impressionOpportunityId_ = com.google.protobuf.ByteString.EMPTY;

        private AdPlayerConfigRequest() {
        }

        @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
        public com.google.protobuf.ByteString getConfigurationToken() {
            return this.configurationToken_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConfigurationToken(com.google.protobuf.ByteString byteString) {
            byteString.getClass();
            this.configurationToken_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConfigurationToken() {
            this.configurationToken_ = getDefaultInstance().getConfigurationToken();
        }

        @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
        public java.lang.String getPlacementId() {
            return this.placementId_;
        }

        @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
        public com.google.protobuf.ByteString getPlacementIdBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.placementId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlacementId(java.lang.String str) {
            str.getClass();
            this.placementId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPlacementId() {
            this.placementId_ = getDefaultInstance().getPlacementId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlacementIdBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.placementId_ = byteString.toStringUtf8();
        }

        @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
        public boolean hasWebviewVersion() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
        public int getWebviewVersion() {
            return this.webviewVersion_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWebviewVersion(int i) {
            this.bitField0_ |= 1;
            this.webviewVersion_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWebviewVersion() {
            this.bitField0_ &= -2;
            this.webviewVersion_ = 0;
        }

        @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
        public com.google.protobuf.ByteString getImpressionOpportunityId() {
            return this.impressionOpportunityId_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImpressionOpportunityId(com.google.protobuf.ByteString byteString) {
            byteString.getClass();
            this.impressionOpportunityId_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearImpressionOpportunityId() {
            this.impressionOpportunityId_ = getDefaultInstance().getImpressionOpportunityId();
        }

        @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
        public boolean hasAdFormat() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
        public int getAdFormatValue() {
            return this.adFormat_;
        }

        @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
        public gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat getAdFormat() {
            gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat adFormatForNumber = gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat.forNumber(this.adFormat_);
            return adFormatForNumber == null ? gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat.UNRECOGNIZED : adFormatForNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdFormatValue(int i) {
            this.bitField0_ |= 2;
            this.adFormat_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdFormat(gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat adFormat) {
            this.adFormat_ = adFormat.getNumber();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdFormat() {
            this.bitField0_ &= -3;
            this.adFormat_ = 0;
        }

        public static gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder newBuilder(gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest adPlayerConfigRequest) {
            return DEFAULT_INSTANCE.createBuilder(adPlayerConfigRequest);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest, gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder> implements gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
            public com.google.protobuf.ByteString getConfigurationToken() {
                return ((gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest) this.instance).getConfigurationToken();
            }

            public gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder setConfigurationToken(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest) this.instance).setConfigurationToken(byteString);
                return this;
            }

            public gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder clearConfigurationToken() {
                copyOnWrite();
                ((gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest) this.instance).clearConfigurationToken();
                return this;
            }

            @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
            public java.lang.String getPlacementId() {
                return ((gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest) this.instance).getPlacementId();
            }

            @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
            public com.google.protobuf.ByteString getPlacementIdBytes() {
                return ((gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest) this.instance).getPlacementIdBytes();
            }

            public gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder setPlacementId(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest) this.instance).setPlacementId(str);
                return this;
            }

            public gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder clearPlacementId() {
                copyOnWrite();
                ((gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest) this.instance).clearPlacementId();
                return this;
            }

            public gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder setPlacementIdBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest) this.instance).setPlacementIdBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
            public boolean hasWebviewVersion() {
                return ((gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest) this.instance).hasWebviewVersion();
            }

            @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
            public int getWebviewVersion() {
                return ((gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest) this.instance).getWebviewVersion();
            }

            public gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder setWebviewVersion(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest) this.instance).setWebviewVersion(i);
                return this;
            }

            public gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder clearWebviewVersion() {
                copyOnWrite();
                ((gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest) this.instance).clearWebviewVersion();
                return this;
            }

            @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
            public com.google.protobuf.ByteString getImpressionOpportunityId() {
                return ((gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest) this.instance).getImpressionOpportunityId();
            }

            public gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder setImpressionOpportunityId(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest) this.instance).setImpressionOpportunityId(byteString);
                return this;
            }

            public gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder clearImpressionOpportunityId() {
                copyOnWrite();
                ((gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest) this.instance).clearImpressionOpportunityId();
                return this;
            }

            @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
            public boolean hasAdFormat() {
                return ((gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest) this.instance).hasAdFormat();
            }

            @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
            public int getAdFormatValue() {
                return ((gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest) this.instance).getAdFormatValue();
            }

            public gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder setAdFormatValue(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest) this.instance).setAdFormatValue(i);
                return this;
            }

            @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
            public gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat getAdFormat() {
                return ((gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest) this.instance).getAdFormat();
            }

            public gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder setAdFormat(gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat adFormat) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest) this.instance).setAdFormat(adFormat);
                return this;
            }

            public gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder clearAdFormat() {
                copyOnWrite();
                ((gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest) this.instance).clearAdFormat();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest();
                case 2:
                    return new gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\t\u0005\u0000\u0000\u0000\u0001\n\u0002Ȉ\u0004\n\u0005ဌ\u0001\tင\u0000", new java.lang.Object[]{"bitField0_", "configurationToken_", "placementId_", "impressionOpportunityId_", "adFormat_", "webviewVersion_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.class) {
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
            gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest adPlayerConfigRequest = new gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest();
            DEFAULT_INSTANCE = adPlayerConfigRequest;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.class, adPlayerConfigRequest);
        }

        public static gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* JADX INFO: renamed from: gatewayprotocol.v1.AdPlayerConfigRequestOuterClass$1, reason: invalid class name */
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
