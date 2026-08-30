package gatewayprotocol.v1;

/* JADX INFO: loaded from: classes6.dex */
public final class SessionCountersOuterClass {

    public interface SessionCountersOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        int getBannerImpressions();

        int getBannerLoadRequests();

        int getBannerRequestsAdm();

        int getLoadRequests();

        int getLoadRequestsAdm();
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
    }

    private SessionCountersOuterClass() {
    }

    public static final class SessionCounters extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters, gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.Builder> implements gatewayprotocol.v1.SessionCountersOuterClass.SessionCountersOrBuilder {
        public static final int BANNER_IMPRESSIONS_FIELD_NUMBER = 5;
        public static final int BANNER_LOAD_REQUESTS_FIELD_NUMBER = 3;
        public static final int BANNER_REQUESTS_ADM_FIELD_NUMBER = 4;
        private static final gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters DEFAULT_INSTANCE;
        public static final int LOAD_REQUESTS_ADM_FIELD_NUMBER = 2;
        public static final int LOAD_REQUESTS_FIELD_NUMBER = 1;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters> PARSER;
        private int bannerImpressions_;
        private int bannerLoadRequests_;
        private int bannerRequestsAdm_;
        private int loadRequestsAdm_;
        private int loadRequests_;

        private SessionCounters() {
        }

        @Override // gatewayprotocol.v1.SessionCountersOuterClass.SessionCountersOrBuilder
        public int getLoadRequests() {
            return this.loadRequests_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLoadRequests(int i) {
            this.loadRequests_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLoadRequests() {
            this.loadRequests_ = 0;
        }

        @Override // gatewayprotocol.v1.SessionCountersOuterClass.SessionCountersOrBuilder
        public int getLoadRequestsAdm() {
            return this.loadRequestsAdm_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLoadRequestsAdm(int i) {
            this.loadRequestsAdm_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLoadRequestsAdm() {
            this.loadRequestsAdm_ = 0;
        }

        @Override // gatewayprotocol.v1.SessionCountersOuterClass.SessionCountersOrBuilder
        public int getBannerLoadRequests() {
            return this.bannerLoadRequests_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBannerLoadRequests(int i) {
            this.bannerLoadRequests_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBannerLoadRequests() {
            this.bannerLoadRequests_ = 0;
        }

        @Override // gatewayprotocol.v1.SessionCountersOuterClass.SessionCountersOrBuilder
        public int getBannerRequestsAdm() {
            return this.bannerRequestsAdm_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBannerRequestsAdm(int i) {
            this.bannerRequestsAdm_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBannerRequestsAdm() {
            this.bannerRequestsAdm_ = 0;
        }

        @Override // gatewayprotocol.v1.SessionCountersOuterClass.SessionCountersOrBuilder
        public int getBannerImpressions() {
            return this.bannerImpressions_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBannerImpressions(int i) {
            this.bannerImpressions_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBannerImpressions() {
            this.bannerImpressions_ = 0;
        }

        public static gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.Builder newBuilder(gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters sessionCounters) {
            return DEFAULT_INSTANCE.createBuilder(sessionCounters);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters, gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.Builder> implements gatewayprotocol.v1.SessionCountersOuterClass.SessionCountersOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.SessionCountersOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.SessionCountersOuterClass.SessionCountersOrBuilder
            public int getLoadRequests() {
                return ((gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters) this.instance).getLoadRequests();
            }

            public gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.Builder setLoadRequests(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters) this.instance).setLoadRequests(i);
                return this;
            }

            public gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.Builder clearLoadRequests() {
                copyOnWrite();
                ((gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters) this.instance).clearLoadRequests();
                return this;
            }

            @Override // gatewayprotocol.v1.SessionCountersOuterClass.SessionCountersOrBuilder
            public int getLoadRequestsAdm() {
                return ((gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters) this.instance).getLoadRequestsAdm();
            }

            public gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.Builder setLoadRequestsAdm(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters) this.instance).setLoadRequestsAdm(i);
                return this;
            }

            public gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.Builder clearLoadRequestsAdm() {
                copyOnWrite();
                ((gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters) this.instance).clearLoadRequestsAdm();
                return this;
            }

            @Override // gatewayprotocol.v1.SessionCountersOuterClass.SessionCountersOrBuilder
            public int getBannerLoadRequests() {
                return ((gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters) this.instance).getBannerLoadRequests();
            }

            public gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.Builder setBannerLoadRequests(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters) this.instance).setBannerLoadRequests(i);
                return this;
            }

            public gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.Builder clearBannerLoadRequests() {
                copyOnWrite();
                ((gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters) this.instance).clearBannerLoadRequests();
                return this;
            }

            @Override // gatewayprotocol.v1.SessionCountersOuterClass.SessionCountersOrBuilder
            public int getBannerRequestsAdm() {
                return ((gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters) this.instance).getBannerRequestsAdm();
            }

            public gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.Builder setBannerRequestsAdm(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters) this.instance).setBannerRequestsAdm(i);
                return this;
            }

            public gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.Builder clearBannerRequestsAdm() {
                copyOnWrite();
                ((gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters) this.instance).clearBannerRequestsAdm();
                return this;
            }

            @Override // gatewayprotocol.v1.SessionCountersOuterClass.SessionCountersOrBuilder
            public int getBannerImpressions() {
                return ((gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters) this.instance).getBannerImpressions();
            }

            public gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.Builder setBannerImpressions(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters) this.instance).setBannerImpressions(i);
                return this;
            }

            public gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.Builder clearBannerImpressions() {
                copyOnWrite();
                ((gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters) this.instance).clearBannerImpressions();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.SessionCountersOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.SessionCountersOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters();
                case 2:
                    return new gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004", new java.lang.Object[]{"loadRequests_", "loadRequestsAdm_", "bannerLoadRequests_", "bannerRequestsAdm_", "bannerImpressions_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.class) {
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
            gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters sessionCounters = new gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters();
            DEFAULT_INSTANCE = sessionCounters;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.class, sessionCounters);
        }

        public static gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* JADX INFO: renamed from: gatewayprotocol.v1.SessionCountersOuterClass$1, reason: invalid class name */
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
