package gatewayprotocol.v1;

/* JADX INFO: loaded from: classes6.dex */
public final class NativeConfigurationOuterClass {

    public interface AdOperationsConfigurationOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        int getGetTokenTimeoutMs();

        int getLoadTimeoutMs();

        int getShowTimeoutMs();
    }

    public interface DiagnosticEventsConfigurationOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType getAllowedEvents(int i);

        int getAllowedEventsCount();

        java.util.List<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType> getAllowedEventsList();

        int getAllowedEventsValue(int i);

        java.util.List<java.lang.Integer> getAllowedEventsValueList();

        gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType getBlockedEvents(int i);

        int getBlockedEventsCount();

        java.util.List<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType> getBlockedEventsList();

        int getBlockedEventsValue(int i);

        java.util.List<java.lang.Integer> getBlockedEventsValueList();

        boolean getEnabled();

        int getMaxBatchIntervalMs();

        int getMaxBatchSize();

        gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity getSeverity();

        int getSeverityValue();

        boolean getTtmEnabled();
    }

    public interface FeatureFlagsOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        boolean getAppSheetBugCheckEnabled();

        boolean getBoldSdkNextSessionEnabled();

        boolean getOpenglGpuEnabled();

        boolean getOpportunityIdPlacementValidation();
    }

    public interface NativeConfigurationOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration getAdOperations();

        gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy getAdPolicy();

        java.lang.String getAdditionalStorePackages(int i);

        com.google.protobuf.ByteString getAdditionalStorePackagesBytes(int i);

        int getAdditionalStorePackagesCount();

        java.util.List<java.lang.String> getAdditionalStorePackagesList();

        gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration getDiagnosticEvents();

        boolean getEnableIapEvent();

        boolean getEnableOm();

        gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags getFeatureFlags();

        gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy getInitPolicy();

        gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy getOperativeEventPolicy();

        gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy getOtherPolicy();

        boolean hasAdOperations();

        boolean hasAdPolicy();

        boolean hasDiagnosticEvents();

        boolean hasFeatureFlags();

        boolean hasInitPolicy();

        boolean hasOperativeEventPolicy();

        boolean hasOtherPolicy();
    }

    public interface RequestPolicyOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy getRetryPolicy();

        gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy getTimeoutPolicy();

        boolean hasRetryPolicy();

        boolean hasTimeoutPolicy();
    }

    public interface RequestRetryPolicyOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        int getMaxDuration();

        float getRetryJitterPct();

        int getRetryMaxInterval();

        float getRetryScalingFactor();

        int getRetryWaitBase();

        boolean getShouldStoreLocally();
    }

    public interface RequestTimeoutPolicyOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        int getConnectTimeoutMs();

        int getOverallTimeoutMs();

        int getReadTimeoutMs();

        int getWriteTimeoutMs();
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
    }

    private NativeConfigurationOuterClass() {
    }

    public static final class RequestRetryPolicy extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy, gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder> implements gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicyOrBuilder {
        private static final gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy DEFAULT_INSTANCE;
        public static final int MAX_DURATION_FIELD_NUMBER = 1;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy> PARSER = null;
        public static final int RETRY_JITTER_PCT_FIELD_NUMBER = 4;
        public static final int RETRY_MAX_INTERVAL_FIELD_NUMBER = 3;
        public static final int RETRY_SCALING_FACTOR_FIELD_NUMBER = 5;
        public static final int RETRY_WAIT_BASE_FIELD_NUMBER = 2;
        public static final int SHOULD_STORE_LOCALLY_FIELD_NUMBER = 6;
        private int maxDuration_;
        private float retryJitterPct_;
        private int retryMaxInterval_;
        private float retryScalingFactor_;
        private int retryWaitBase_;
        private boolean shouldStoreLocally_;

        private RequestRetryPolicy() {
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicyOrBuilder
        public int getMaxDuration() {
            return this.maxDuration_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaxDuration(int i) {
            this.maxDuration_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMaxDuration() {
            this.maxDuration_ = 0;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicyOrBuilder
        public int getRetryWaitBase() {
            return this.retryWaitBase_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRetryWaitBase(int i) {
            this.retryWaitBase_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRetryWaitBase() {
            this.retryWaitBase_ = 0;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicyOrBuilder
        public int getRetryMaxInterval() {
            return this.retryMaxInterval_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRetryMaxInterval(int i) {
            this.retryMaxInterval_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRetryMaxInterval() {
            this.retryMaxInterval_ = 0;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicyOrBuilder
        public float getRetryJitterPct() {
            return this.retryJitterPct_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRetryJitterPct(float f) {
            this.retryJitterPct_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRetryJitterPct() {
            this.retryJitterPct_ = 0.0f;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicyOrBuilder
        public float getRetryScalingFactor() {
            return this.retryScalingFactor_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRetryScalingFactor(float f) {
            this.retryScalingFactor_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRetryScalingFactor() {
            this.retryScalingFactor_ = 0.0f;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicyOrBuilder
        public boolean getShouldStoreLocally() {
            return this.shouldStoreLocally_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShouldStoreLocally(boolean z) {
            this.shouldStoreLocally_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearShouldStoreLocally() {
            this.shouldStoreLocally_ = false;
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder newBuilder(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy requestRetryPolicy) {
            return DEFAULT_INSTANCE.createBuilder(requestRetryPolicy);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy, gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder> implements gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicyOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.NativeConfigurationOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicyOrBuilder
            public int getMaxDuration() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy) this.instance).getMaxDuration();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder setMaxDuration(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy) this.instance).setMaxDuration(i);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder clearMaxDuration() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy) this.instance).clearMaxDuration();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicyOrBuilder
            public int getRetryWaitBase() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy) this.instance).getRetryWaitBase();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder setRetryWaitBase(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy) this.instance).setRetryWaitBase(i);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder clearRetryWaitBase() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy) this.instance).clearRetryWaitBase();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicyOrBuilder
            public int getRetryMaxInterval() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy) this.instance).getRetryMaxInterval();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder setRetryMaxInterval(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy) this.instance).setRetryMaxInterval(i);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder clearRetryMaxInterval() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy) this.instance).clearRetryMaxInterval();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicyOrBuilder
            public float getRetryJitterPct() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy) this.instance).getRetryJitterPct();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder setRetryJitterPct(float f) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy) this.instance).setRetryJitterPct(f);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder clearRetryJitterPct() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy) this.instance).clearRetryJitterPct();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicyOrBuilder
            public float getRetryScalingFactor() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy) this.instance).getRetryScalingFactor();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder setRetryScalingFactor(float f) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy) this.instance).setRetryScalingFactor(f);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder clearRetryScalingFactor() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy) this.instance).clearRetryScalingFactor();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicyOrBuilder
            public boolean getShouldStoreLocally() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy) this.instance).getShouldStoreLocally();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder setShouldStoreLocally(boolean z) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy) this.instance).setShouldStoreLocally(z);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder clearShouldStoreLocally() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy) this.instance).clearShouldStoreLocally();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.NativeConfigurationOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.NativeConfigurationOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy();
                case 2:
                    return new gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0001\u0005\u0001\u0006\u0007", new java.lang.Object[]{"maxDuration_", "retryWaitBase_", "retryMaxInterval_", "retryJitterPct_", "retryScalingFactor_", "shouldStoreLocally_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.class) {
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
            gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy requestRetryPolicy = new gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy();
            DEFAULT_INSTANCE = requestRetryPolicy;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.class, requestRetryPolicy);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* JADX INFO: renamed from: gatewayprotocol.v1.NativeConfigurationOuterClass$1, reason: invalid class name */
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

    public static final class RequestTimeoutPolicy extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy, gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder> implements gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicyOrBuilder {
        public static final int CONNECT_TIMEOUT_MS_FIELD_NUMBER = 1;
        private static final gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy DEFAULT_INSTANCE;
        public static final int OVERALL_TIMEOUT_MS_FIELD_NUMBER = 4;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy> PARSER = null;
        public static final int READ_TIMEOUT_MS_FIELD_NUMBER = 2;
        public static final int WRITE_TIMEOUT_MS_FIELD_NUMBER = 3;
        private int connectTimeoutMs_;
        private int overallTimeoutMs_;
        private int readTimeoutMs_;
        private int writeTimeoutMs_;

        private RequestTimeoutPolicy() {
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicyOrBuilder
        public int getConnectTimeoutMs() {
            return this.connectTimeoutMs_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConnectTimeoutMs(int i) {
            this.connectTimeoutMs_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConnectTimeoutMs() {
            this.connectTimeoutMs_ = 0;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicyOrBuilder
        public int getReadTimeoutMs() {
            return this.readTimeoutMs_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReadTimeoutMs(int i) {
            this.readTimeoutMs_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReadTimeoutMs() {
            this.readTimeoutMs_ = 0;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicyOrBuilder
        public int getWriteTimeoutMs() {
            return this.writeTimeoutMs_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWriteTimeoutMs(int i) {
            this.writeTimeoutMs_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWriteTimeoutMs() {
            this.writeTimeoutMs_ = 0;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicyOrBuilder
        public int getOverallTimeoutMs() {
            return this.overallTimeoutMs_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOverallTimeoutMs(int i) {
            this.overallTimeoutMs_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOverallTimeoutMs() {
            this.overallTimeoutMs_ = 0;
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder newBuilder(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy requestTimeoutPolicy) {
            return DEFAULT_INSTANCE.createBuilder(requestTimeoutPolicy);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy, gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder> implements gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicyOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.NativeConfigurationOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicyOrBuilder
            public int getConnectTimeoutMs() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy) this.instance).getConnectTimeoutMs();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder setConnectTimeoutMs(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy) this.instance).setConnectTimeoutMs(i);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder clearConnectTimeoutMs() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy) this.instance).clearConnectTimeoutMs();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicyOrBuilder
            public int getReadTimeoutMs() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy) this.instance).getReadTimeoutMs();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder setReadTimeoutMs(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy) this.instance).setReadTimeoutMs(i);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder clearReadTimeoutMs() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy) this.instance).clearReadTimeoutMs();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicyOrBuilder
            public int getWriteTimeoutMs() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy) this.instance).getWriteTimeoutMs();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder setWriteTimeoutMs(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy) this.instance).setWriteTimeoutMs(i);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder clearWriteTimeoutMs() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy) this.instance).clearWriteTimeoutMs();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicyOrBuilder
            public int getOverallTimeoutMs() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy) this.instance).getOverallTimeoutMs();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder setOverallTimeoutMs(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy) this.instance).setOverallTimeoutMs(i);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder clearOverallTimeoutMs() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy) this.instance).clearOverallTimeoutMs();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.NativeConfigurationOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.NativeConfigurationOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy();
                case 2:
                    return new gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004", new java.lang.Object[]{"connectTimeoutMs_", "readTimeoutMs_", "writeTimeoutMs_", "overallTimeoutMs_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.class) {
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
            gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy requestTimeoutPolicy = new gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy();
            DEFAULT_INSTANCE = requestTimeoutPolicy;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.class, requestTimeoutPolicy);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class RequestPolicy extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy, gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder> implements gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicyOrBuilder {
        private static final gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy> PARSER = null;
        public static final int RETRY_POLICY_FIELD_NUMBER = 1;
        public static final int TIMEOUT_POLICY_FIELD_NUMBER = 2;
        private gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy retryPolicy_;
        private gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy timeoutPolicy_;

        private RequestPolicy() {
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicyOrBuilder
        public boolean hasRetryPolicy() {
            return this.retryPolicy_ != null;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicyOrBuilder
        public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy getRetryPolicy() {
            gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy requestRetryPolicy = this.retryPolicy_;
            return requestRetryPolicy == null ? gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.getDefaultInstance() : requestRetryPolicy;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRetryPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy requestRetryPolicy) {
            requestRetryPolicy.getClass();
            this.retryPolicy_ = requestRetryPolicy;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeRetryPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy requestRetryPolicy) {
            requestRetryPolicy.getClass();
            gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy requestRetryPolicy2 = this.retryPolicy_;
            if (requestRetryPolicy2 != null && requestRetryPolicy2 != gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.getDefaultInstance()) {
                this.retryPolicy_ = gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.newBuilder(this.retryPolicy_).mergeFrom(requestRetryPolicy).buildPartial();
            } else {
                this.retryPolicy_ = requestRetryPolicy;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRetryPolicy() {
            this.retryPolicy_ = null;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicyOrBuilder
        public boolean hasTimeoutPolicy() {
            return this.timeoutPolicy_ != null;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicyOrBuilder
        public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy getTimeoutPolicy() {
            gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy requestTimeoutPolicy = this.timeoutPolicy_;
            return requestTimeoutPolicy == null ? gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.getDefaultInstance() : requestTimeoutPolicy;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimeoutPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy requestTimeoutPolicy) {
            requestTimeoutPolicy.getClass();
            this.timeoutPolicy_ = requestTimeoutPolicy;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTimeoutPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy requestTimeoutPolicy) {
            requestTimeoutPolicy.getClass();
            gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy requestTimeoutPolicy2 = this.timeoutPolicy_;
            if (requestTimeoutPolicy2 != null && requestTimeoutPolicy2 != gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.getDefaultInstance()) {
                this.timeoutPolicy_ = gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.newBuilder(this.timeoutPolicy_).mergeFrom(requestTimeoutPolicy).buildPartial();
            } else {
                this.timeoutPolicy_ = requestTimeoutPolicy;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimeoutPolicy() {
            this.timeoutPolicy_ = null;
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder newBuilder(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
            return DEFAULT_INSTANCE.createBuilder(requestPolicy);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy, gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder> implements gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicyOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.NativeConfigurationOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicyOrBuilder
            public boolean hasRetryPolicy() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy) this.instance).hasRetryPolicy();
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicyOrBuilder
            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy getRetryPolicy() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy) this.instance).getRetryPolicy();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder setRetryPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy requestRetryPolicy) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy) this.instance).setRetryPolicy(requestRetryPolicy);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder setRetryPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy) this.instance).setRetryPolicy(builder.build());
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder mergeRetryPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy requestRetryPolicy) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy) this.instance).mergeRetryPolicy(requestRetryPolicy);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder clearRetryPolicy() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy) this.instance).clearRetryPolicy();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicyOrBuilder
            public boolean hasTimeoutPolicy() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy) this.instance).hasTimeoutPolicy();
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicyOrBuilder
            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy getTimeoutPolicy() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy) this.instance).getTimeoutPolicy();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder setTimeoutPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy requestTimeoutPolicy) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy) this.instance).setTimeoutPolicy(requestTimeoutPolicy);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder setTimeoutPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy) this.instance).setTimeoutPolicy(builder.build());
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder mergeTimeoutPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy requestTimeoutPolicy) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy) this.instance).mergeTimeoutPolicy(requestTimeoutPolicy);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder clearTimeoutPolicy() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy) this.instance).clearTimeoutPolicy();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.NativeConfigurationOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.NativeConfigurationOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy();
                case 2:
                    return new gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new java.lang.Object[]{"retryPolicy_", "timeoutPolicy_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.class) {
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
            gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy requestPolicy = new gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy();
            DEFAULT_INSTANCE = requestPolicy;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.class, requestPolicy);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class DiagnosticEventsConfiguration extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration, gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder> implements gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder {
        public static final int ALLOWED_EVENTS_FIELD_NUMBER = 6;
        public static final int BLOCKED_EVENTS_FIELD_NUMBER = 7;
        private static final gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration DEFAULT_INSTANCE;
        public static final int ENABLED_FIELD_NUMBER = 1;
        public static final int MAX_BATCH_INTERVAL_MS_FIELD_NUMBER = 3;
        public static final int MAX_BATCH_SIZE_FIELD_NUMBER = 2;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration> PARSER = null;
        public static final int SEVERITY_FIELD_NUMBER = 5;
        public static final int TTM_ENABLED_FIELD_NUMBER = 4;
        private static final com.google.protobuf.Internal.ListAdapter.Converter<java.lang.Integer, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType> allowedEvents_converter_ = new com.google.protobuf.Internal.ListAdapter.Converter<java.lang.Integer, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType>() { // from class: gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.1
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType convert(java.lang.Integer num) {
                gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventTypeForNumber = gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType.forNumber(num.intValue());
                return diagnosticEventTypeForNumber == null ? gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType.UNRECOGNIZED : diagnosticEventTypeForNumber;
            }
        };
        private static final com.google.protobuf.Internal.ListAdapter.Converter<java.lang.Integer, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType> blockedEvents_converter_ = new com.google.protobuf.Internal.ListAdapter.Converter<java.lang.Integer, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType>() { // from class: gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.2
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType convert(java.lang.Integer num) {
                gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventTypeForNumber = gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType.forNumber(num.intValue());
                return diagnosticEventTypeForNumber == null ? gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType.UNRECOGNIZED : diagnosticEventTypeForNumber;
            }
        };
        private int allowedEventsMemoizedSerializedSize;
        private int blockedEventsMemoizedSerializedSize;
        private boolean enabled_;
        private int maxBatchIntervalMs_;
        private int maxBatchSize_;
        private int severity_;
        private boolean ttmEnabled_;
        private com.google.protobuf.Internal.IntList allowedEvents_ = emptyIntList();
        private com.google.protobuf.Internal.IntList blockedEvents_ = emptyIntList();

        private DiagnosticEventsConfiguration() {
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
        public boolean getEnabled() {
            return this.enabled_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnabled(boolean z) {
            this.enabled_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnabled() {
            this.enabled_ = false;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
        public int getMaxBatchSize() {
            return this.maxBatchSize_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaxBatchSize(int i) {
            this.maxBatchSize_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMaxBatchSize() {
            this.maxBatchSize_ = 0;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
        public int getMaxBatchIntervalMs() {
            return this.maxBatchIntervalMs_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaxBatchIntervalMs(int i) {
            this.maxBatchIntervalMs_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMaxBatchIntervalMs() {
            this.maxBatchIntervalMs_ = 0;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
        public boolean getTtmEnabled() {
            return this.ttmEnabled_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTtmEnabled(boolean z) {
            this.ttmEnabled_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTtmEnabled() {
            this.ttmEnabled_ = false;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
        public int getSeverityValue() {
            return this.severity_;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
        public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity getSeverity() {
            gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity diagnosticEventsSeverityForNumber = gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity.forNumber(this.severity_);
            return diagnosticEventsSeverityForNumber == null ? gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity.UNRECOGNIZED : diagnosticEventsSeverityForNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSeverityValue(int i) {
            this.severity_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSeverity(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity diagnosticEventsSeverity) {
            this.severity_ = diagnosticEventsSeverity.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSeverity() {
            this.severity_ = 0;
        }

        static {
            gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticEventsConfiguration = new gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration();
            DEFAULT_INSTANCE = diagnosticEventsConfiguration;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.class, diagnosticEventsConfiguration);
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
        public java.util.List<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType> getAllowedEventsList() {
            return new com.google.protobuf.Internal.ListAdapter(this.allowedEvents_, allowedEvents_converter_);
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
        public int getAllowedEventsCount() {
            return this.allowedEvents_.size();
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
        public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType getAllowedEvents(int i) {
            gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventTypeForNumber = gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType.forNumber(this.allowedEvents_.getInt(i));
            return diagnosticEventTypeForNumber == null ? gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType.UNRECOGNIZED : diagnosticEventTypeForNumber;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
        public java.util.List<java.lang.Integer> getAllowedEventsValueList() {
            return this.allowedEvents_;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
        public int getAllowedEventsValue(int i) {
            return this.allowedEvents_.getInt(i);
        }

        private void ensureAllowedEventsIsMutable() {
            com.google.protobuf.Internal.IntList intList = this.allowedEvents_;
            if (intList.isModifiable()) {
                return;
            }
            this.allowedEvents_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(intList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAllowedEvents(int i, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType) {
            diagnosticEventType.getClass();
            ensureAllowedEventsIsMutable();
            this.allowedEvents_.setInt(i, diagnosticEventType.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllowedEvents(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType) {
            diagnosticEventType.getClass();
            ensureAllowedEventsIsMutable();
            this.allowedEvents_.addInt(diagnosticEventType.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAllowedEvents(java.lang.Iterable<? extends gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType> iterable) {
            ensureAllowedEventsIsMutable();
            java.util.Iterator<? extends gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType> it = iterable.iterator();
            while (it.hasNext()) {
                this.allowedEvents_.addInt(it.next().getNumber());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAllowedEvents() {
            this.allowedEvents_ = emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAllowedEventsValue(int i, int i2) {
            ensureAllowedEventsIsMutable();
            this.allowedEvents_.setInt(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllowedEventsValue(int i) {
            ensureAllowedEventsIsMutable();
            this.allowedEvents_.addInt(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAllowedEventsValue(java.lang.Iterable<java.lang.Integer> iterable) {
            ensureAllowedEventsIsMutable();
            java.util.Iterator<java.lang.Integer> it = iterable.iterator();
            while (it.hasNext()) {
                this.allowedEvents_.addInt(it.next().intValue());
            }
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
        public java.util.List<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType> getBlockedEventsList() {
            return new com.google.protobuf.Internal.ListAdapter(this.blockedEvents_, blockedEvents_converter_);
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
        public int getBlockedEventsCount() {
            return this.blockedEvents_.size();
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
        public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType getBlockedEvents(int i) {
            gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventTypeForNumber = gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType.forNumber(this.blockedEvents_.getInt(i));
            return diagnosticEventTypeForNumber == null ? gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType.UNRECOGNIZED : diagnosticEventTypeForNumber;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
        public java.util.List<java.lang.Integer> getBlockedEventsValueList() {
            return this.blockedEvents_;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
        public int getBlockedEventsValue(int i) {
            return this.blockedEvents_.getInt(i);
        }

        private void ensureBlockedEventsIsMutable() {
            com.google.protobuf.Internal.IntList intList = this.blockedEvents_;
            if (intList.isModifiable()) {
                return;
            }
            this.blockedEvents_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(intList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBlockedEvents(int i, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType) {
            diagnosticEventType.getClass();
            ensureBlockedEventsIsMutable();
            this.blockedEvents_.setInt(i, diagnosticEventType.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addBlockedEvents(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType) {
            diagnosticEventType.getClass();
            ensureBlockedEventsIsMutable();
            this.blockedEvents_.addInt(diagnosticEventType.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllBlockedEvents(java.lang.Iterable<? extends gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType> iterable) {
            ensureBlockedEventsIsMutable();
            java.util.Iterator<? extends gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType> it = iterable.iterator();
            while (it.hasNext()) {
                this.blockedEvents_.addInt(it.next().getNumber());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBlockedEvents() {
            this.blockedEvents_ = emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBlockedEventsValue(int i, int i2) {
            ensureBlockedEventsIsMutable();
            this.blockedEvents_.setInt(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addBlockedEventsValue(int i) {
            ensureBlockedEventsIsMutable();
            this.blockedEvents_.addInt(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllBlockedEventsValue(java.lang.Iterable<java.lang.Integer> iterable) {
            ensureBlockedEventsIsMutable();
            java.util.Iterator<java.lang.Integer> it = iterable.iterator();
            while (it.hasNext()) {
                this.blockedEvents_.addInt(it.next().intValue());
            }
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder newBuilder(gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticEventsConfiguration) {
            return DEFAULT_INSTANCE.createBuilder(diagnosticEventsConfiguration);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration, gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder> implements gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.NativeConfigurationOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
            public boolean getEnabled() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).getEnabled();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder setEnabled(boolean z) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).setEnabled(z);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder clearEnabled() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).clearEnabled();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
            public int getMaxBatchSize() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).getMaxBatchSize();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder setMaxBatchSize(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).setMaxBatchSize(i);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder clearMaxBatchSize() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).clearMaxBatchSize();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
            public int getMaxBatchIntervalMs() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).getMaxBatchIntervalMs();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder setMaxBatchIntervalMs(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).setMaxBatchIntervalMs(i);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder clearMaxBatchIntervalMs() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).clearMaxBatchIntervalMs();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
            public boolean getTtmEnabled() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).getTtmEnabled();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder setTtmEnabled(boolean z) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).setTtmEnabled(z);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder clearTtmEnabled() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).clearTtmEnabled();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
            public int getSeverityValue() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).getSeverityValue();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder setSeverityValue(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).setSeverityValue(i);
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity getSeverity() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).getSeverity();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder setSeverity(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity diagnosticEventsSeverity) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).setSeverity(diagnosticEventsSeverity);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder clearSeverity() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).clearSeverity();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
            public java.util.List<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType> getAllowedEventsList() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).getAllowedEventsList();
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
            public int getAllowedEventsCount() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).getAllowedEventsCount();
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType getAllowedEvents(int i) {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).getAllowedEvents(i);
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder setAllowedEvents(int i, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).setAllowedEvents(i, diagnosticEventType);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder addAllowedEvents(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).addAllowedEvents(diagnosticEventType);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder addAllAllowedEvents(java.lang.Iterable<? extends gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType> iterable) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).addAllAllowedEvents(iterable);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder clearAllowedEvents() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).clearAllowedEvents();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
            public java.util.List<java.lang.Integer> getAllowedEventsValueList() {
                return java.util.Collections.unmodifiableList(((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).getAllowedEventsValueList());
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
            public int getAllowedEventsValue(int i) {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).getAllowedEventsValue(i);
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder setAllowedEventsValue(int i, int i2) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).setAllowedEventsValue(i, i2);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder addAllowedEventsValue(int i) {
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).addAllowedEventsValue(i);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder addAllAllowedEventsValue(java.lang.Iterable<java.lang.Integer> iterable) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).addAllAllowedEventsValue(iterable);
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
            public java.util.List<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType> getBlockedEventsList() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).getBlockedEventsList();
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
            public int getBlockedEventsCount() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).getBlockedEventsCount();
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType getBlockedEvents(int i) {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).getBlockedEvents(i);
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder setBlockedEvents(int i, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).setBlockedEvents(i, diagnosticEventType);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder addBlockedEvents(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).addBlockedEvents(diagnosticEventType);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder addAllBlockedEvents(java.lang.Iterable<? extends gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType> iterable) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).addAllBlockedEvents(iterable);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder clearBlockedEvents() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).clearBlockedEvents();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
            public java.util.List<java.lang.Integer> getBlockedEventsValueList() {
                return java.util.Collections.unmodifiableList(((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).getBlockedEventsValueList());
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
            public int getBlockedEventsValue(int i) {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).getBlockedEventsValue(i);
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder setBlockedEventsValue(int i, int i2) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).setBlockedEventsValue(i, i2);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder addBlockedEventsValue(int i) {
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).addBlockedEventsValue(i);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder addAllBlockedEventsValue(java.lang.Iterable<java.lang.Integer> iterable) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).addAllBlockedEventsValue(iterable);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.NativeConfigurationOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.NativeConfigurationOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration();
                case 2:
                    return new gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0002\u0000\u0001\u0007\u0002\u0004\u0003\u0004\u0004\u0007\u0005\f\u0006,\u0007,", new java.lang.Object[]{"enabled_", "maxBatchSize_", "maxBatchIntervalMs_", "ttmEnabled_", "severity_", "allowedEvents_", "blockedEvents_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.class) {
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

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class AdOperationsConfiguration extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration, gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration.Builder> implements gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfigurationOrBuilder {
        private static final gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration DEFAULT_INSTANCE;
        public static final int GET_TOKEN_TIMEOUT_MS_FIELD_NUMBER = 3;
        public static final int LOAD_TIMEOUT_MS_FIELD_NUMBER = 1;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration> PARSER = null;
        public static final int SHOW_TIMEOUT_MS_FIELD_NUMBER = 2;
        private int getTokenTimeoutMs_;
        private int loadTimeoutMs_;
        private int showTimeoutMs_;

        private AdOperationsConfiguration() {
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfigurationOrBuilder
        public int getLoadTimeoutMs() {
            return this.loadTimeoutMs_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLoadTimeoutMs(int i) {
            this.loadTimeoutMs_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLoadTimeoutMs() {
            this.loadTimeoutMs_ = 0;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfigurationOrBuilder
        public int getShowTimeoutMs() {
            return this.showTimeoutMs_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShowTimeoutMs(int i) {
            this.showTimeoutMs_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearShowTimeoutMs() {
            this.showTimeoutMs_ = 0;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfigurationOrBuilder
        public int getGetTokenTimeoutMs() {
            return this.getTokenTimeoutMs_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGetTokenTimeoutMs(int i) {
            this.getTokenTimeoutMs_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGetTokenTimeoutMs() {
            this.getTokenTimeoutMs_ = 0;
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration.Builder newBuilder(gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration adOperationsConfiguration) {
            return DEFAULT_INSTANCE.createBuilder(adOperationsConfiguration);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration, gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration.Builder> implements gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfigurationOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.NativeConfigurationOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfigurationOrBuilder
            public int getLoadTimeoutMs() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration) this.instance).getLoadTimeoutMs();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration.Builder setLoadTimeoutMs(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration) this.instance).setLoadTimeoutMs(i);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration.Builder clearLoadTimeoutMs() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration) this.instance).clearLoadTimeoutMs();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfigurationOrBuilder
            public int getShowTimeoutMs() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration) this.instance).getShowTimeoutMs();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration.Builder setShowTimeoutMs(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration) this.instance).setShowTimeoutMs(i);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration.Builder clearShowTimeoutMs() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration) this.instance).clearShowTimeoutMs();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfigurationOrBuilder
            public int getGetTokenTimeoutMs() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration) this.instance).getGetTokenTimeoutMs();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration.Builder setGetTokenTimeoutMs(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration) this.instance).setGetTokenTimeoutMs(i);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration.Builder clearGetTokenTimeoutMs() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration) this.instance).clearGetTokenTimeoutMs();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.NativeConfigurationOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.NativeConfigurationOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration();
                case 2:
                    return new gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004", new java.lang.Object[]{"loadTimeoutMs_", "showTimeoutMs_", "getTokenTimeoutMs_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration.class) {
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
            gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration adOperationsConfiguration = new gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration();
            DEFAULT_INSTANCE = adOperationsConfiguration;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration.class, adOperationsConfiguration);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class NativeConfiguration extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration, gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder> implements gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder {
        public static final int ADDITIONAL_STORE_PACKAGES_FIELD_NUMBER = 10;
        public static final int AD_OPERATIONS_FIELD_NUMBER = 6;
        public static final int AD_POLICY_FIELD_NUMBER = 3;
        private static final gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration DEFAULT_INSTANCE;
        public static final int DIAGNOSTIC_EVENTS_FIELD_NUMBER = 1;
        public static final int ENABLE_IAP_EVENT_FIELD_NUMBER = 8;
        public static final int ENABLE_OM_FIELD_NUMBER = 9;
        public static final int FEATURE_FLAGS_FIELD_NUMBER = 7;
        public static final int INIT_POLICY_FIELD_NUMBER = 2;
        public static final int OPERATIVE_EVENT_POLICY_FIELD_NUMBER = 4;
        public static final int OTHER_POLICY_FIELD_NUMBER = 5;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration> PARSER;
        private gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration adOperations_;
        private gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy adPolicy_;
        private com.google.protobuf.Internal.ProtobufList<java.lang.String> additionalStorePackages_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
        private gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticEvents_;
        private boolean enableIapEvent_;
        private boolean enableOm_;
        private gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags featureFlags_;
        private gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy initPolicy_;
        private gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy operativeEventPolicy_;
        private gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy otherPolicy_;

        private NativeConfiguration() {
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public boolean hasDiagnosticEvents() {
            return this.diagnosticEvents_ != null;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration getDiagnosticEvents() {
            gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticEventsConfiguration = this.diagnosticEvents_;
            return diagnosticEventsConfiguration == null ? gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.getDefaultInstance() : diagnosticEventsConfiguration;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDiagnosticEvents(gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticEventsConfiguration) {
            diagnosticEventsConfiguration.getClass();
            this.diagnosticEvents_ = diagnosticEventsConfiguration;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDiagnosticEvents(gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticEventsConfiguration) {
            diagnosticEventsConfiguration.getClass();
            gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticEventsConfiguration2 = this.diagnosticEvents_;
            if (diagnosticEventsConfiguration2 != null && diagnosticEventsConfiguration2 != gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.getDefaultInstance()) {
                this.diagnosticEvents_ = gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.newBuilder(this.diagnosticEvents_).mergeFrom(diagnosticEventsConfiguration).buildPartial();
            } else {
                this.diagnosticEvents_ = diagnosticEventsConfiguration;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDiagnosticEvents() {
            this.diagnosticEvents_ = null;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public boolean hasInitPolicy() {
            return this.initPolicy_ != null;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy getInitPolicy() {
            gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy requestPolicy = this.initPolicy_;
            return requestPolicy == null ? gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.getDefaultInstance() : requestPolicy;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInitPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
            requestPolicy.getClass();
            this.initPolicy_ = requestPolicy;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeInitPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
            requestPolicy.getClass();
            gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy requestPolicy2 = this.initPolicy_;
            if (requestPolicy2 != null && requestPolicy2 != gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.getDefaultInstance()) {
                this.initPolicy_ = gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.newBuilder(this.initPolicy_).mergeFrom(requestPolicy).buildPartial();
            } else {
                this.initPolicy_ = requestPolicy;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInitPolicy() {
            this.initPolicy_ = null;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public boolean hasAdPolicy() {
            return this.adPolicy_ != null;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy getAdPolicy() {
            gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy requestPolicy = this.adPolicy_;
            return requestPolicy == null ? gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.getDefaultInstance() : requestPolicy;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
            requestPolicy.getClass();
            this.adPolicy_ = requestPolicy;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAdPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
            requestPolicy.getClass();
            gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy requestPolicy2 = this.adPolicy_;
            if (requestPolicy2 != null && requestPolicy2 != gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.getDefaultInstance()) {
                this.adPolicy_ = gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.newBuilder(this.adPolicy_).mergeFrom(requestPolicy).buildPartial();
            } else {
                this.adPolicy_ = requestPolicy;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdPolicy() {
            this.adPolicy_ = null;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public boolean hasOperativeEventPolicy() {
            return this.operativeEventPolicy_ != null;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy getOperativeEventPolicy() {
            gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy requestPolicy = this.operativeEventPolicy_;
            return requestPolicy == null ? gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.getDefaultInstance() : requestPolicy;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOperativeEventPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
            requestPolicy.getClass();
            this.operativeEventPolicy_ = requestPolicy;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeOperativeEventPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
            requestPolicy.getClass();
            gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy requestPolicy2 = this.operativeEventPolicy_;
            if (requestPolicy2 != null && requestPolicy2 != gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.getDefaultInstance()) {
                this.operativeEventPolicy_ = gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.newBuilder(this.operativeEventPolicy_).mergeFrom(requestPolicy).buildPartial();
            } else {
                this.operativeEventPolicy_ = requestPolicy;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOperativeEventPolicy() {
            this.operativeEventPolicy_ = null;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public boolean hasOtherPolicy() {
            return this.otherPolicy_ != null;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy getOtherPolicy() {
            gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy requestPolicy = this.otherPolicy_;
            return requestPolicy == null ? gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.getDefaultInstance() : requestPolicy;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOtherPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
            requestPolicy.getClass();
            this.otherPolicy_ = requestPolicy;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeOtherPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
            requestPolicy.getClass();
            gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy requestPolicy2 = this.otherPolicy_;
            if (requestPolicy2 != null && requestPolicy2 != gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.getDefaultInstance()) {
                this.otherPolicy_ = gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.newBuilder(this.otherPolicy_).mergeFrom(requestPolicy).buildPartial();
            } else {
                this.otherPolicy_ = requestPolicy;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOtherPolicy() {
            this.otherPolicy_ = null;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public boolean hasAdOperations() {
            return this.adOperations_ != null;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration getAdOperations() {
            gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration adOperationsConfiguration = this.adOperations_;
            return adOperationsConfiguration == null ? gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration.getDefaultInstance() : adOperationsConfiguration;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdOperations(gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration adOperationsConfiguration) {
            adOperationsConfiguration.getClass();
            this.adOperations_ = adOperationsConfiguration;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAdOperations(gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration adOperationsConfiguration) {
            adOperationsConfiguration.getClass();
            gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration adOperationsConfiguration2 = this.adOperations_;
            if (adOperationsConfiguration2 != null && adOperationsConfiguration2 != gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration.getDefaultInstance()) {
                this.adOperations_ = gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration.newBuilder(this.adOperations_).mergeFrom(adOperationsConfiguration).buildPartial();
            } else {
                this.adOperations_ = adOperationsConfiguration;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdOperations() {
            this.adOperations_ = null;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public boolean hasFeatureFlags() {
            return this.featureFlags_ != null;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags getFeatureFlags() {
            gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags featureFlags = this.featureFlags_;
            return featureFlags == null ? gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.getDefaultInstance() : featureFlags;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFeatureFlags(gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags featureFlags) {
            featureFlags.getClass();
            this.featureFlags_ = featureFlags;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeFeatureFlags(gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags featureFlags) {
            featureFlags.getClass();
            gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags featureFlags2 = this.featureFlags_;
            if (featureFlags2 != null && featureFlags2 != gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.getDefaultInstance()) {
                this.featureFlags_ = gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.newBuilder(this.featureFlags_).mergeFrom(featureFlags).buildPartial();
            } else {
                this.featureFlags_ = featureFlags;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFeatureFlags() {
            this.featureFlags_ = null;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public boolean getEnableIapEvent() {
            return this.enableIapEvent_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnableIapEvent(boolean z) {
            this.enableIapEvent_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnableIapEvent() {
            this.enableIapEvent_ = false;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public boolean getEnableOm() {
            return this.enableOm_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnableOm(boolean z) {
            this.enableOm_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnableOm() {
            this.enableOm_ = false;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public java.util.List<java.lang.String> getAdditionalStorePackagesList() {
            return this.additionalStorePackages_;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public int getAdditionalStorePackagesCount() {
            return this.additionalStorePackages_.size();
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public java.lang.String getAdditionalStorePackages(int i) {
            return this.additionalStorePackages_.get(i);
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public com.google.protobuf.ByteString getAdditionalStorePackagesBytes(int i) {
            return com.google.protobuf.ByteString.copyFromUtf8(this.additionalStorePackages_.get(i));
        }

        private void ensureAdditionalStorePackagesIsMutable() {
            com.google.protobuf.Internal.ProtobufList<java.lang.String> protobufList = this.additionalStorePackages_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.additionalStorePackages_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdditionalStorePackages(int i, java.lang.String str) {
            str.getClass();
            ensureAdditionalStorePackagesIsMutable();
            this.additionalStorePackages_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAdditionalStorePackages(java.lang.String str) {
            str.getClass();
            ensureAdditionalStorePackagesIsMutable();
            this.additionalStorePackages_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAdditionalStorePackages(java.lang.Iterable<java.lang.String> iterable) {
            ensureAdditionalStorePackagesIsMutable();
            com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.additionalStorePackages_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdditionalStorePackages() {
            this.additionalStorePackages_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAdditionalStorePackagesBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            ensureAdditionalStorePackagesIsMutable();
            this.additionalStorePackages_.add(byteString.toStringUtf8());
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder newBuilder(gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration) {
            return DEFAULT_INSTANCE.createBuilder(nativeConfiguration);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration, gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder> implements gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.NativeConfigurationOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public boolean hasDiagnosticEvents() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).hasDiagnosticEvents();
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration getDiagnosticEvents() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).getDiagnosticEvents();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setDiagnosticEvents(gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticEventsConfiguration) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).setDiagnosticEvents(diagnosticEventsConfiguration);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setDiagnosticEvents(gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).setDiagnosticEvents(builder.build());
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder mergeDiagnosticEvents(gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticEventsConfiguration) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).mergeDiagnosticEvents(diagnosticEventsConfiguration);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder clearDiagnosticEvents() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).clearDiagnosticEvents();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public boolean hasInitPolicy() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).hasInitPolicy();
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy getInitPolicy() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).getInitPolicy();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setInitPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).setInitPolicy(requestPolicy);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setInitPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).setInitPolicy(builder.build());
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder mergeInitPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).mergeInitPolicy(requestPolicy);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder clearInitPolicy() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).clearInitPolicy();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public boolean hasAdPolicy() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).hasAdPolicy();
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy getAdPolicy() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).getAdPolicy();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setAdPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).setAdPolicy(requestPolicy);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setAdPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).setAdPolicy(builder.build());
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder mergeAdPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).mergeAdPolicy(requestPolicy);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder clearAdPolicy() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).clearAdPolicy();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public boolean hasOperativeEventPolicy() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).hasOperativeEventPolicy();
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy getOperativeEventPolicy() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).getOperativeEventPolicy();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setOperativeEventPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).setOperativeEventPolicy(requestPolicy);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setOperativeEventPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).setOperativeEventPolicy(builder.build());
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder mergeOperativeEventPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).mergeOperativeEventPolicy(requestPolicy);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder clearOperativeEventPolicy() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).clearOperativeEventPolicy();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public boolean hasOtherPolicy() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).hasOtherPolicy();
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy getOtherPolicy() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).getOtherPolicy();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setOtherPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).setOtherPolicy(requestPolicy);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setOtherPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).setOtherPolicy(builder.build());
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder mergeOtherPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).mergeOtherPolicy(requestPolicy);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder clearOtherPolicy() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).clearOtherPolicy();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public boolean hasAdOperations() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).hasAdOperations();
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration getAdOperations() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).getAdOperations();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setAdOperations(gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration adOperationsConfiguration) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).setAdOperations(adOperationsConfiguration);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setAdOperations(gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).setAdOperations(builder.build());
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder mergeAdOperations(gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration adOperationsConfiguration) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).mergeAdOperations(adOperationsConfiguration);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder clearAdOperations() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).clearAdOperations();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public boolean hasFeatureFlags() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).hasFeatureFlags();
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags getFeatureFlags() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).getFeatureFlags();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setFeatureFlags(gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags featureFlags) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).setFeatureFlags(featureFlags);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setFeatureFlags(gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).setFeatureFlags(builder.build());
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder mergeFeatureFlags(gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags featureFlags) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).mergeFeatureFlags(featureFlags);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder clearFeatureFlags() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).clearFeatureFlags();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public boolean getEnableIapEvent() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).getEnableIapEvent();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setEnableIapEvent(boolean z) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).setEnableIapEvent(z);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder clearEnableIapEvent() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).clearEnableIapEvent();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public boolean getEnableOm() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).getEnableOm();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setEnableOm(boolean z) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).setEnableOm(z);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder clearEnableOm() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).clearEnableOm();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public java.util.List<java.lang.String> getAdditionalStorePackagesList() {
                return java.util.Collections.unmodifiableList(((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).getAdditionalStorePackagesList());
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public int getAdditionalStorePackagesCount() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).getAdditionalStorePackagesCount();
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public java.lang.String getAdditionalStorePackages(int i) {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).getAdditionalStorePackages(i);
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public com.google.protobuf.ByteString getAdditionalStorePackagesBytes(int i) {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).getAdditionalStorePackagesBytes(i);
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setAdditionalStorePackages(int i, java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).setAdditionalStorePackages(i, str);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder addAdditionalStorePackages(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).addAdditionalStorePackages(str);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder addAllAdditionalStorePackages(java.lang.Iterable<java.lang.String> iterable) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).addAllAdditionalStorePackages(iterable);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder clearAdditionalStorePackages() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).clearAdditionalStorePackages();
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder addAdditionalStorePackagesBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).addAdditionalStorePackagesBytes(byteString);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.NativeConfigurationOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.NativeConfigurationOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration();
                case 2:
                    return new gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0001\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t\u0006\t\u0007\t\b\u0007\t\u0007\nȚ", new java.lang.Object[]{"diagnosticEvents_", "initPolicy_", "adPolicy_", "operativeEventPolicy_", "otherPolicy_", "adOperations_", "featureFlags_", "enableIapEvent_", "enableOm_", "additionalStorePackages_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.class) {
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
            gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration = new gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration();
            DEFAULT_INSTANCE = nativeConfiguration;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.class, nativeConfiguration);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class FeatureFlags extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags, gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.Builder> implements gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlagsOrBuilder {
        public static final int APP_SHEET_BUG_CHECK_ENABLED_FIELD_NUMBER = 4;
        public static final int BOLD_SDK_NEXT_SESSION_ENABLED_FIELD_NUMBER = 3;
        private static final gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags DEFAULT_INSTANCE;
        public static final int OPENGL_GPU_ENABLED_FIELD_NUMBER = 1;
        public static final int OPPORTUNITY_ID_PLACEMENT_VALIDATION_FIELD_NUMBER = 2;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags> PARSER;
        private boolean appSheetBugCheckEnabled_;
        private boolean boldSdkNextSessionEnabled_;
        private boolean openglGpuEnabled_;
        private boolean opportunityIdPlacementValidation_;

        private FeatureFlags() {
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlagsOrBuilder
        public boolean getOpenglGpuEnabled() {
            return this.openglGpuEnabled_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOpenglGpuEnabled(boolean z) {
            this.openglGpuEnabled_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOpenglGpuEnabled() {
            this.openglGpuEnabled_ = false;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlagsOrBuilder
        public boolean getOpportunityIdPlacementValidation() {
            return this.opportunityIdPlacementValidation_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOpportunityIdPlacementValidation(boolean z) {
            this.opportunityIdPlacementValidation_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOpportunityIdPlacementValidation() {
            this.opportunityIdPlacementValidation_ = false;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlagsOrBuilder
        public boolean getBoldSdkNextSessionEnabled() {
            return this.boldSdkNextSessionEnabled_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBoldSdkNextSessionEnabled(boolean z) {
            this.boldSdkNextSessionEnabled_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBoldSdkNextSessionEnabled() {
            this.boldSdkNextSessionEnabled_ = false;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlagsOrBuilder
        public boolean getAppSheetBugCheckEnabled() {
            return this.appSheetBugCheckEnabled_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppSheetBugCheckEnabled(boolean z) {
            this.appSheetBugCheckEnabled_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppSheetBugCheckEnabled() {
            this.appSheetBugCheckEnabled_ = false;
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.Builder newBuilder(gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags featureFlags) {
            return DEFAULT_INSTANCE.createBuilder(featureFlags);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags, gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.Builder> implements gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlagsOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.NativeConfigurationOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlagsOrBuilder
            public boolean getOpenglGpuEnabled() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags) this.instance).getOpenglGpuEnabled();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.Builder setOpenglGpuEnabled(boolean z) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags) this.instance).setOpenglGpuEnabled(z);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.Builder clearOpenglGpuEnabled() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags) this.instance).clearOpenglGpuEnabled();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlagsOrBuilder
            public boolean getOpportunityIdPlacementValidation() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags) this.instance).getOpportunityIdPlacementValidation();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.Builder setOpportunityIdPlacementValidation(boolean z) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags) this.instance).setOpportunityIdPlacementValidation(z);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.Builder clearOpportunityIdPlacementValidation() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags) this.instance).clearOpportunityIdPlacementValidation();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlagsOrBuilder
            public boolean getBoldSdkNextSessionEnabled() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags) this.instance).getBoldSdkNextSessionEnabled();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.Builder setBoldSdkNextSessionEnabled(boolean z) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags) this.instance).setBoldSdkNextSessionEnabled(z);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.Builder clearBoldSdkNextSessionEnabled() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags) this.instance).clearBoldSdkNextSessionEnabled();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlagsOrBuilder
            public boolean getAppSheetBugCheckEnabled() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags) this.instance).getAppSheetBugCheckEnabled();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.Builder setAppSheetBugCheckEnabled(boolean z) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags) this.instance).setAppSheetBugCheckEnabled(z);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.Builder clearAppSheetBugCheckEnabled() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags) this.instance).clearAppSheetBugCheckEnabled();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.NativeConfigurationOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.NativeConfigurationOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags();
                case 2:
                    return new gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007", new java.lang.Object[]{"openglGpuEnabled_", "opportunityIdPlacementValidation_", "boldSdkNextSessionEnabled_", "appSheetBugCheckEnabled_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.class) {
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
            gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags featureFlags = new gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags();
            DEFAULT_INSTANCE = featureFlags;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.class, featureFlags);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }
}
