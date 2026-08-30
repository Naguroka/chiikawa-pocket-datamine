package gatewayprotocol.v1;

/* JADX INFO: loaded from: classes6.dex */
public final class HeaderBiddingTokenOuterClass {

    public interface HeaderBiddingTokenOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat getAdFormat();

        int getAdFormatValue();

        gatewayprotocol.v1.CampaignStateOuterClass.CampaignState getCampaignState();

        gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo getClientInfo();

        gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo();

        gatewayprotocol.v1.InitializationDataOuterClass.InitializationData getInitializationData();

        gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken getLimitedSessionToken();

        gatewayprotocol.v1.PiiOuterClass.Pii getPii();

        boolean getScarSignalsCollected();

        gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters getSessionCounters();

        com.google.protobuf.ByteString getSessionToken();

        gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo();

        com.google.protobuf.ByteString getTcf();

        gatewayprotocol.v1.TestDataOuterClass.TestData getTestData();

        gatewayprotocol.v1.TimestampsOuterClass.Timestamps getTimestamps();

        gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters getTokenCounters();

        com.google.protobuf.ByteString getTokenId();

        int getTokenNumber();

        boolean hasAdFormat();

        boolean hasCampaignState();

        boolean hasClientInfo();

        boolean hasDynamicDeviceInfo();

        boolean hasInitializationData();

        boolean hasLimitedSessionToken();

        boolean hasPii();

        boolean hasScarSignalsCollected();

        boolean hasSessionCounters();

        boolean hasStaticDeviceInfo();

        boolean hasTcf();

        boolean hasTestData();

        boolean hasTimestamps();

        boolean hasTokenCounters();
    }

    public interface TokenCountersOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        int getSeq();

        int getStarts();

        int getWins();
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
    }

    private HeaderBiddingTokenOuterClass() {
    }

    public static final class TokenCounters extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters, gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder> implements gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCountersOrBuilder {
        private static final gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters> PARSER = null;
        public static final int SEQ_FIELD_NUMBER = 1;
        public static final int STARTS_FIELD_NUMBER = 3;
        public static final int WINS_FIELD_NUMBER = 2;
        private int seq_;
        private int starts_;
        private int wins_;

        private TokenCounters() {
        }

        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCountersOrBuilder
        public int getSeq() {
            return this.seq_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSeq(int i) {
            this.seq_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSeq() {
            this.seq_ = 0;
        }

        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCountersOrBuilder
        public int getWins() {
            return this.wins_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWins(int i) {
            this.wins_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWins() {
            this.wins_ = 0;
        }

        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCountersOrBuilder
        public int getStarts() {
            return this.starts_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStarts(int i) {
            this.starts_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStarts() {
            this.starts_ = 0;
        }

        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder newBuilder(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters tokenCounters) {
            return DEFAULT_INSTANCE.createBuilder(tokenCounters);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters, gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder> implements gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCountersOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCountersOrBuilder
            public int getSeq() {
                return ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters) this.instance).getSeq();
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder setSeq(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters) this.instance).setSeq(i);
                return this;
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder clearSeq() {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters) this.instance).clearSeq();
                return this;
            }

            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCountersOrBuilder
            public int getWins() {
                return ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters) this.instance).getWins();
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder setWins(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters) this.instance).setWins(i);
                return this;
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder clearWins() {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters) this.instance).clearWins();
                return this;
            }

            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCountersOrBuilder
            public int getStarts() {
                return ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters) this.instance).getStarts();
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder setStarts(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters) this.instance).setStarts(i);
                return this;
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder clearStarts() {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters) this.instance).clearStarts();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.HeaderBiddingTokenOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.HeaderBiddingTokenOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters();
                case 2:
                    return new gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004", new java.lang.Object[]{"seq_", "wins_", "starts_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.class) {
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
            gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters tokenCounters = new gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters();
            DEFAULT_INSTANCE = tokenCounters;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.class, tokenCounters);
        }

        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* JADX INFO: renamed from: gatewayprotocol.v1.HeaderBiddingTokenOuterClass$1, reason: invalid class name */
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

    public static final class HeaderBiddingToken extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken, gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder> implements gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder {
        public static final int AD_FORMAT_FIELD_NUMBER = 15;
        public static final int CAMPAIGN_STATE_FIELD_NUMBER = 10;
        public static final int CLIENT_INFO_FIELD_NUMBER = 4;
        private static final gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken DEFAULT_INSTANCE;
        public static final int DYNAMIC_DEVICE_INFO_FIELD_NUMBER = 8;
        public static final int INITIALIZATION_DATA_FIELD_NUMBER = 14;
        public static final int LIMITED_SESSION_TOKEN_FIELD_NUMBER = 13;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken> PARSER = null;
        public static final int PII_FIELD_NUMBER = 9;
        public static final int SCAR_SIGNALS_COLLECTED_FIELD_NUMBER = 12;
        public static final int SESSION_COUNTERS_FIELD_NUMBER = 6;
        public static final int SESSION_TOKEN_FIELD_NUMBER = 3;
        public static final int STATIC_DEVICE_INFO_FIELD_NUMBER = 7;
        public static final int TCF_FIELD_NUMBER = 11;
        public static final int TEST_DATA_FIELD_NUMBER = 16;
        public static final int TIMESTAMPS_FIELD_NUMBER = 5;
        public static final int TOKEN_COUNTERS_FIELD_NUMBER = 17;
        public static final int TOKEN_ID_FIELD_NUMBER = 1;
        public static final int TOKEN_NUMBER_FIELD_NUMBER = 2;
        private int adFormat_;
        private int bitField0_;
        private gatewayprotocol.v1.CampaignStateOuterClass.CampaignState campaignState_;
        private gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo clientInfo_;
        private gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo_;
        private gatewayprotocol.v1.InitializationDataOuterClass.InitializationData initializationData_;
        private gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken limitedSessionToken_;
        private gatewayprotocol.v1.PiiOuterClass.Pii pii_;
        private boolean scarSignalsCollected_;
        private gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters sessionCounters_;
        private gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo_;
        private gatewayprotocol.v1.TestDataOuterClass.TestData testData_;
        private gatewayprotocol.v1.TimestampsOuterClass.Timestamps timestamps_;
        private gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters tokenCounters_;
        private int tokenNumber_;
        private com.google.protobuf.ByteString tokenId_ = com.google.protobuf.ByteString.EMPTY;
        private com.google.protobuf.ByteString sessionToken_ = com.google.protobuf.ByteString.EMPTY;
        private com.google.protobuf.ByteString tcf_ = com.google.protobuf.ByteString.EMPTY;

        private HeaderBiddingToken() {
        }

        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
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

        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public int getTokenNumber() {
            return this.tokenNumber_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTokenNumber(int i) {
            this.tokenNumber_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTokenNumber() {
            this.tokenNumber_ = 0;
        }

        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public com.google.protobuf.ByteString getSessionToken() {
            return this.sessionToken_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionToken(com.google.protobuf.ByteString byteString) {
            byteString.getClass();
            this.sessionToken_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionToken() {
            this.sessionToken_ = getDefaultInstance().getSessionToken();
        }

        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public boolean hasClientInfo() {
            return this.clientInfo_ != null;
        }

        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo getClientInfo() {
            gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo clientInfo = this.clientInfo_;
            return clientInfo == null ? gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.getDefaultInstance() : clientInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClientInfo(gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo clientInfo) {
            clientInfo.getClass();
            this.clientInfo_ = clientInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeClientInfo(gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo clientInfo) {
            clientInfo.getClass();
            gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo clientInfo2 = this.clientInfo_;
            if (clientInfo2 != null && clientInfo2 != gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.getDefaultInstance()) {
                this.clientInfo_ = gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.newBuilder(this.clientInfo_).mergeFrom(clientInfo).buildPartial();
            } else {
                this.clientInfo_ = clientInfo;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClientInfo() {
            this.clientInfo_ = null;
        }

        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public boolean hasTimestamps() {
            return this.timestamps_ != null;
        }

        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public gatewayprotocol.v1.TimestampsOuterClass.Timestamps getTimestamps() {
            gatewayprotocol.v1.TimestampsOuterClass.Timestamps timestamps = this.timestamps_;
            return timestamps == null ? gatewayprotocol.v1.TimestampsOuterClass.Timestamps.getDefaultInstance() : timestamps;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimestamps(gatewayprotocol.v1.TimestampsOuterClass.Timestamps timestamps) {
            timestamps.getClass();
            this.timestamps_ = timestamps;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTimestamps(gatewayprotocol.v1.TimestampsOuterClass.Timestamps timestamps) {
            timestamps.getClass();
            gatewayprotocol.v1.TimestampsOuterClass.Timestamps timestamps2 = this.timestamps_;
            if (timestamps2 != null && timestamps2 != gatewayprotocol.v1.TimestampsOuterClass.Timestamps.getDefaultInstance()) {
                this.timestamps_ = gatewayprotocol.v1.TimestampsOuterClass.Timestamps.newBuilder(this.timestamps_).mergeFrom(timestamps).buildPartial();
            } else {
                this.timestamps_ = timestamps;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimestamps() {
            this.timestamps_ = null;
        }

        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public boolean hasSessionCounters() {
            return this.sessionCounters_ != null;
        }

        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters getSessionCounters() {
            gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters sessionCounters = this.sessionCounters_;
            return sessionCounters == null ? gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.getDefaultInstance() : sessionCounters;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters sessionCounters) {
            sessionCounters.getClass();
            this.sessionCounters_ = sessionCounters;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters sessionCounters) {
            sessionCounters.getClass();
            gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters sessionCounters2 = this.sessionCounters_;
            if (sessionCounters2 != null && sessionCounters2 != gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.getDefaultInstance()) {
                this.sessionCounters_ = gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.newBuilder(this.sessionCounters_).mergeFrom(sessionCounters).buildPartial();
            } else {
                this.sessionCounters_ = sessionCounters;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionCounters() {
            this.sessionCounters_ = null;
        }

        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public boolean hasStaticDeviceInfo() {
            return this.staticDeviceInfo_ != null;
        }

        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = this.staticDeviceInfo_;
            return staticDeviceInfo == null ? gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.getDefaultInstance() : staticDeviceInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.getClass();
            this.staticDeviceInfo_ = staticDeviceInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.getClass();
            gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo2 = this.staticDeviceInfo_;
            if (staticDeviceInfo2 != null && staticDeviceInfo2 != gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.getDefaultInstance()) {
                this.staticDeviceInfo_ = gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.newBuilder(this.staticDeviceInfo_).mergeFrom(staticDeviceInfo).buildPartial();
            } else {
                this.staticDeviceInfo_ = staticDeviceInfo;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStaticDeviceInfo() {
            this.staticDeviceInfo_ = null;
        }

        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public boolean hasDynamicDeviceInfo() {
            return this.dynamicDeviceInfo_ != null;
        }

        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
            gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = this.dynamicDeviceInfo_;
            return dynamicDeviceInfo == null ? gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.getDefaultInstance() : dynamicDeviceInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.getClass();
            this.dynamicDeviceInfo_ = dynamicDeviceInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.getClass();
            gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo2 = this.dynamicDeviceInfo_;
            if (dynamicDeviceInfo2 != null && dynamicDeviceInfo2 != gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.getDefaultInstance()) {
                this.dynamicDeviceInfo_ = gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.newBuilder(this.dynamicDeviceInfo_).mergeFrom(dynamicDeviceInfo).buildPartial();
            } else {
                this.dynamicDeviceInfo_ = dynamicDeviceInfo;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDynamicDeviceInfo() {
            this.dynamicDeviceInfo_ = null;
        }

        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public boolean hasPii() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public gatewayprotocol.v1.PiiOuterClass.Pii getPii() {
            gatewayprotocol.v1.PiiOuterClass.Pii pii = this.pii_;
            return pii == null ? gatewayprotocol.v1.PiiOuterClass.Pii.getDefaultInstance() : pii;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPii(gatewayprotocol.v1.PiiOuterClass.Pii pii) {
            pii.getClass();
            this.pii_ = pii;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergePii(gatewayprotocol.v1.PiiOuterClass.Pii pii) {
            pii.getClass();
            gatewayprotocol.v1.PiiOuterClass.Pii pii2 = this.pii_;
            if (pii2 != null && pii2 != gatewayprotocol.v1.PiiOuterClass.Pii.getDefaultInstance()) {
                this.pii_ = gatewayprotocol.v1.PiiOuterClass.Pii.newBuilder(this.pii_).mergeFrom(pii).buildPartial();
            } else {
                this.pii_ = pii;
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPii() {
            this.pii_ = null;
            this.bitField0_ &= -2;
        }

        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public boolean hasCampaignState() {
            return this.campaignState_ != null;
        }

        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState getCampaignState() {
            gatewayprotocol.v1.CampaignStateOuterClass.CampaignState campaignState = this.campaignState_;
            return campaignState == null ? gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.getDefaultInstance() : campaignState;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCampaignState(gatewayprotocol.v1.CampaignStateOuterClass.CampaignState campaignState) {
            campaignState.getClass();
            this.campaignState_ = campaignState;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeCampaignState(gatewayprotocol.v1.CampaignStateOuterClass.CampaignState campaignState) {
            campaignState.getClass();
            gatewayprotocol.v1.CampaignStateOuterClass.CampaignState campaignState2 = this.campaignState_;
            if (campaignState2 != null && campaignState2 != gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.getDefaultInstance()) {
                this.campaignState_ = gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.newBuilder(this.campaignState_).mergeFrom(campaignState).buildPartial();
            } else {
                this.campaignState_ = campaignState;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCampaignState() {
            this.campaignState_ = null;
        }

        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public boolean hasTcf() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public com.google.protobuf.ByteString getTcf() {
            return this.tcf_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTcf(com.google.protobuf.ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 2;
            this.tcf_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTcf() {
            this.bitField0_ &= -3;
            this.tcf_ = getDefaultInstance().getTcf();
        }

        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public boolean hasScarSignalsCollected() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public boolean getScarSignalsCollected() {
            return this.scarSignalsCollected_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setScarSignalsCollected(boolean z) {
            this.bitField0_ |= 4;
            this.scarSignalsCollected_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearScarSignalsCollected() {
            this.bitField0_ &= -5;
            this.scarSignalsCollected_ = false;
        }

        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public boolean hasLimitedSessionToken() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken getLimitedSessionToken() {
            gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken limitedSessionToken = this.limitedSessionToken_;
            return limitedSessionToken == null ? gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.getDefaultInstance() : limitedSessionToken;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLimitedSessionToken(gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken limitedSessionToken) {
            limitedSessionToken.getClass();
            this.limitedSessionToken_ = limitedSessionToken;
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeLimitedSessionToken(gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken limitedSessionToken) {
            limitedSessionToken.getClass();
            gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken limitedSessionToken2 = this.limitedSessionToken_;
            if (limitedSessionToken2 != null && limitedSessionToken2 != gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.getDefaultInstance()) {
                this.limitedSessionToken_ = gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.newBuilder(this.limitedSessionToken_).mergeFrom(limitedSessionToken).buildPartial();
            } else {
                this.limitedSessionToken_ = limitedSessionToken;
            }
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLimitedSessionToken() {
            this.limitedSessionToken_ = null;
            this.bitField0_ &= -9;
        }

        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public boolean hasInitializationData() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public gatewayprotocol.v1.InitializationDataOuterClass.InitializationData getInitializationData() {
            gatewayprotocol.v1.InitializationDataOuterClass.InitializationData initializationData = this.initializationData_;
            return initializationData == null ? gatewayprotocol.v1.InitializationDataOuterClass.InitializationData.getDefaultInstance() : initializationData;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInitializationData(gatewayprotocol.v1.InitializationDataOuterClass.InitializationData initializationData) {
            initializationData.getClass();
            this.initializationData_ = initializationData;
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeInitializationData(gatewayprotocol.v1.InitializationDataOuterClass.InitializationData initializationData) {
            initializationData.getClass();
            gatewayprotocol.v1.InitializationDataOuterClass.InitializationData initializationData2 = this.initializationData_;
            if (initializationData2 != null && initializationData2 != gatewayprotocol.v1.InitializationDataOuterClass.InitializationData.getDefaultInstance()) {
                this.initializationData_ = gatewayprotocol.v1.InitializationDataOuterClass.InitializationData.newBuilder(this.initializationData_).mergeFrom(initializationData).buildPartial();
            } else {
                this.initializationData_ = initializationData;
            }
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInitializationData() {
            this.initializationData_ = null;
            this.bitField0_ &= -17;
        }

        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public boolean hasAdFormat() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public int getAdFormatValue() {
            return this.adFormat_;
        }

        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat getAdFormat() {
            gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat adFormatForNumber = gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat.forNumber(this.adFormat_);
            return adFormatForNumber == null ? gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat.UNRECOGNIZED : adFormatForNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdFormatValue(int i) {
            this.bitField0_ |= 32;
            this.adFormat_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdFormat(gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat adFormat) {
            this.adFormat_ = adFormat.getNumber();
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdFormat() {
            this.bitField0_ &= -33;
            this.adFormat_ = 0;
        }

        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public boolean hasTestData() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public gatewayprotocol.v1.TestDataOuterClass.TestData getTestData() {
            gatewayprotocol.v1.TestDataOuterClass.TestData testData = this.testData_;
            return testData == null ? gatewayprotocol.v1.TestDataOuterClass.TestData.getDefaultInstance() : testData;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTestData(gatewayprotocol.v1.TestDataOuterClass.TestData testData) {
            testData.getClass();
            this.testData_ = testData;
            this.bitField0_ |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTestData(gatewayprotocol.v1.TestDataOuterClass.TestData testData) {
            testData.getClass();
            gatewayprotocol.v1.TestDataOuterClass.TestData testData2 = this.testData_;
            if (testData2 != null && testData2 != gatewayprotocol.v1.TestDataOuterClass.TestData.getDefaultInstance()) {
                this.testData_ = gatewayprotocol.v1.TestDataOuterClass.TestData.newBuilder(this.testData_).mergeFrom(testData).buildPartial();
            } else {
                this.testData_ = testData;
            }
            this.bitField0_ |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTestData() {
            this.testData_ = null;
            this.bitField0_ &= -65;
        }

        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public boolean hasTokenCounters() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters getTokenCounters() {
            gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters tokenCounters = this.tokenCounters_;
            return tokenCounters == null ? gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.getDefaultInstance() : tokenCounters;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTokenCounters(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters tokenCounters) {
            tokenCounters.getClass();
            this.tokenCounters_ = tokenCounters;
            this.bitField0_ |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTokenCounters(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters tokenCounters) {
            tokenCounters.getClass();
            gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters tokenCounters2 = this.tokenCounters_;
            if (tokenCounters2 != null && tokenCounters2 != gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.getDefaultInstance()) {
                this.tokenCounters_ = gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.newBuilder(this.tokenCounters_).mergeFrom(tokenCounters).buildPartial();
            } else {
                this.tokenCounters_ = tokenCounters;
            }
            this.bitField0_ |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTokenCounters() {
            this.tokenCounters_ = null;
            this.bitField0_ &= -129;
        }

        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder newBuilder(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken headerBiddingToken) {
            return DEFAULT_INSTANCE.createBuilder(headerBiddingToken);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken, gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder> implements gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public com.google.protobuf.ByteString getTokenId() {
                return ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).getTokenId();
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setTokenId(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).setTokenId(byteString);
                return this;
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder clearTokenId() {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).clearTokenId();
                return this;
            }

            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public int getTokenNumber() {
                return ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).getTokenNumber();
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setTokenNumber(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).setTokenNumber(i);
                return this;
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder clearTokenNumber() {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).clearTokenNumber();
                return this;
            }

            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public com.google.protobuf.ByteString getSessionToken() {
                return ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).getSessionToken();
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setSessionToken(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).setSessionToken(byteString);
                return this;
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder clearSessionToken() {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).clearSessionToken();
                return this;
            }

            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public boolean hasClientInfo() {
                return ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).hasClientInfo();
            }

            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo getClientInfo() {
                return ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).getClientInfo();
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setClientInfo(gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo clientInfo) {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).setClientInfo(clientInfo);
                return this;
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setClientInfo(gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).setClientInfo(builder.build());
                return this;
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder mergeClientInfo(gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo clientInfo) {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).mergeClientInfo(clientInfo);
                return this;
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder clearClientInfo() {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).clearClientInfo();
                return this;
            }

            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public boolean hasTimestamps() {
                return ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).hasTimestamps();
            }

            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public gatewayprotocol.v1.TimestampsOuterClass.Timestamps getTimestamps() {
                return ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).getTimestamps();
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setTimestamps(gatewayprotocol.v1.TimestampsOuterClass.Timestamps timestamps) {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).setTimestamps(timestamps);
                return this;
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setTimestamps(gatewayprotocol.v1.TimestampsOuterClass.Timestamps.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).setTimestamps(builder.build());
                return this;
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder mergeTimestamps(gatewayprotocol.v1.TimestampsOuterClass.Timestamps timestamps) {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).mergeTimestamps(timestamps);
                return this;
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder clearTimestamps() {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).clearTimestamps();
                return this;
            }

            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public boolean hasSessionCounters() {
                return ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).hasSessionCounters();
            }

            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters getSessionCounters() {
                return ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).getSessionCounters();
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters sessionCounters) {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).setSessionCounters(sessionCounters);
                return this;
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).setSessionCounters(builder.build());
                return this;
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder mergeSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters sessionCounters) {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).mergeSessionCounters(sessionCounters);
                return this;
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder clearSessionCounters() {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).clearSessionCounters();
                return this;
            }

            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public boolean hasStaticDeviceInfo() {
                return ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).hasStaticDeviceInfo();
            }

            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
                return ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).getStaticDeviceInfo();
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).setStaticDeviceInfo(staticDeviceInfo);
                return this;
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).setStaticDeviceInfo(builder.build());
                return this;
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder mergeStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).mergeStaticDeviceInfo(staticDeviceInfo);
                return this;
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder clearStaticDeviceInfo() {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).clearStaticDeviceInfo();
                return this;
            }

            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public boolean hasDynamicDeviceInfo() {
                return ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).hasDynamicDeviceInfo();
            }

            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
                return ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).getDynamicDeviceInfo();
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).setDynamicDeviceInfo(dynamicDeviceInfo);
                return this;
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).setDynamicDeviceInfo(builder.build());
                return this;
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder mergeDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).mergeDynamicDeviceInfo(dynamicDeviceInfo);
                return this;
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder clearDynamicDeviceInfo() {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).clearDynamicDeviceInfo();
                return this;
            }

            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public boolean hasPii() {
                return ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).hasPii();
            }

            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public gatewayprotocol.v1.PiiOuterClass.Pii getPii() {
                return ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).getPii();
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setPii(gatewayprotocol.v1.PiiOuterClass.Pii pii) {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).setPii(pii);
                return this;
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setPii(gatewayprotocol.v1.PiiOuterClass.Pii.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).setPii(builder.build());
                return this;
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder mergePii(gatewayprotocol.v1.PiiOuterClass.Pii pii) {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).mergePii(pii);
                return this;
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder clearPii() {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).clearPii();
                return this;
            }

            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public boolean hasCampaignState() {
                return ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).hasCampaignState();
            }

            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState getCampaignState() {
                return ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).getCampaignState();
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setCampaignState(gatewayprotocol.v1.CampaignStateOuterClass.CampaignState campaignState) {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).setCampaignState(campaignState);
                return this;
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setCampaignState(gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).setCampaignState(builder.build());
                return this;
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder mergeCampaignState(gatewayprotocol.v1.CampaignStateOuterClass.CampaignState campaignState) {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).mergeCampaignState(campaignState);
                return this;
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder clearCampaignState() {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).clearCampaignState();
                return this;
            }

            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public boolean hasTcf() {
                return ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).hasTcf();
            }

            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public com.google.protobuf.ByteString getTcf() {
                return ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).getTcf();
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setTcf(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).setTcf(byteString);
                return this;
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder clearTcf() {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).clearTcf();
                return this;
            }

            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public boolean hasScarSignalsCollected() {
                return ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).hasScarSignalsCollected();
            }

            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public boolean getScarSignalsCollected() {
                return ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).getScarSignalsCollected();
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setScarSignalsCollected(boolean z) {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).setScarSignalsCollected(z);
                return this;
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder clearScarSignalsCollected() {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).clearScarSignalsCollected();
                return this;
            }

            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public boolean hasLimitedSessionToken() {
                return ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).hasLimitedSessionToken();
            }

            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken getLimitedSessionToken() {
                return ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).getLimitedSessionToken();
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setLimitedSessionToken(gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken limitedSessionToken) {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).setLimitedSessionToken(limitedSessionToken);
                return this;
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setLimitedSessionToken(gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).setLimitedSessionToken(builder.build());
                return this;
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder mergeLimitedSessionToken(gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken limitedSessionToken) {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).mergeLimitedSessionToken(limitedSessionToken);
                return this;
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder clearLimitedSessionToken() {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).clearLimitedSessionToken();
                return this;
            }

            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public boolean hasInitializationData() {
                return ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).hasInitializationData();
            }

            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public gatewayprotocol.v1.InitializationDataOuterClass.InitializationData getInitializationData() {
                return ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).getInitializationData();
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setInitializationData(gatewayprotocol.v1.InitializationDataOuterClass.InitializationData initializationData) {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).setInitializationData(initializationData);
                return this;
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setInitializationData(gatewayprotocol.v1.InitializationDataOuterClass.InitializationData.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).setInitializationData(builder.build());
                return this;
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder mergeInitializationData(gatewayprotocol.v1.InitializationDataOuterClass.InitializationData initializationData) {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).mergeInitializationData(initializationData);
                return this;
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder clearInitializationData() {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).clearInitializationData();
                return this;
            }

            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public boolean hasAdFormat() {
                return ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).hasAdFormat();
            }

            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public int getAdFormatValue() {
                return ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).getAdFormatValue();
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setAdFormatValue(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).setAdFormatValue(i);
                return this;
            }

            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat getAdFormat() {
                return ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).getAdFormat();
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setAdFormat(gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat adFormat) {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).setAdFormat(adFormat);
                return this;
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder clearAdFormat() {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).clearAdFormat();
                return this;
            }

            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public boolean hasTestData() {
                return ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).hasTestData();
            }

            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public gatewayprotocol.v1.TestDataOuterClass.TestData getTestData() {
                return ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).getTestData();
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setTestData(gatewayprotocol.v1.TestDataOuterClass.TestData testData) {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).setTestData(testData);
                return this;
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setTestData(gatewayprotocol.v1.TestDataOuterClass.TestData.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).setTestData(builder.build());
                return this;
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder mergeTestData(gatewayprotocol.v1.TestDataOuterClass.TestData testData) {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).mergeTestData(testData);
                return this;
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder clearTestData() {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).clearTestData();
                return this;
            }

            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public boolean hasTokenCounters() {
                return ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).hasTokenCounters();
            }

            @Override // gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters getTokenCounters() {
                return ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).getTokenCounters();
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setTokenCounters(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters tokenCounters) {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).setTokenCounters(tokenCounters);
                return this;
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder setTokenCounters(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).setTokenCounters(builder.build());
                return this;
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder mergeTokenCounters(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters tokenCounters) {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).mergeTokenCounters(tokenCounters);
                return this;
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder clearTokenCounters() {
                copyOnWrite();
                ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) this.instance).clearTokenCounters();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.HeaderBiddingTokenOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.HeaderBiddingTokenOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken();
                case 2:
                    return new gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0011\u0000\u0001\u0001\u0011\u0011\u0000\u0000\u0000\u0001\n\u0002\u0004\u0003\n\u0004\t\u0005\t\u0006\t\u0007\t\b\t\tဉ\u0000\n\t\u000bည\u0001\fဇ\u0002\rဉ\u0003\u000eဉ\u0004\u000fဌ\u0005\u0010ဉ\u0006\u0011ဉ\u0007", new java.lang.Object[]{"bitField0_", "tokenId_", "tokenNumber_", "sessionToken_", "clientInfo_", "timestamps_", "sessionCounters_", "staticDeviceInfo_", "dynamicDeviceInfo_", "pii_", "campaignState_", "tcf_", "scarSignalsCollected_", "limitedSessionToken_", "initializationData_", "adFormat_", "testData_", "tokenCounters_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.class) {
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
            gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken headerBiddingToken = new gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken();
            DEFAULT_INSTANCE = headerBiddingToken;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.class, headerBiddingToken);
        }

        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }
}
