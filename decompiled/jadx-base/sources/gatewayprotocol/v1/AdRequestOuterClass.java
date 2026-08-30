package gatewayprotocol.v1;

/* JADX INFO: loaded from: classes6.dex */
public final class AdRequestOuterClass {

    public interface AdRequestOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat getAdFormat();

        int getAdFormatValue();

        gatewayprotocol.v1.AdRequestOuterClass.AdRequestType getAdRequestType();

        int getAdRequestTypeValue();

        gatewayprotocol.v1.AdRequestOuterClass.BannerSize getBannerSize();

        gatewayprotocol.v1.CampaignStateOuterClass.CampaignState getCampaignState();

        gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo();

        com.google.protobuf.ByteString getImpressionOpportunityId();

        java.lang.String getPlacementId();

        com.google.protobuf.ByteString getPlacementIdBytes();

        boolean getRequestImpressionConfiguration();

        com.google.protobuf.ByteString getScarSignal();

        gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters getSessionCounters();

        gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo();

        com.google.protobuf.ByteString getTcf();

        int getWebviewVersion();

        boolean hasAdFormat();

        boolean hasAdRequestType();

        boolean hasBannerSize();

        boolean hasCampaignState();

        boolean hasDynamicDeviceInfo();

        boolean hasSessionCounters();

        boolean hasStaticDeviceInfo();

        boolean hasTcf();

        boolean hasWebviewVersion();
    }

    public interface BannerSizeOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        int getHeight();

        int getWidth();
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
    }

    private AdRequestOuterClass() {
    }

    public enum AdRequestType implements com.google.protobuf.Internal.EnumLite {
        AD_REQUEST_TYPE_UNSPECIFIED(0),
        AD_REQUEST_TYPE_FULLSCREEN(1),
        AD_REQUEST_TYPE_BANNER(2),
        UNRECOGNIZED(-1);

        public static final int AD_REQUEST_TYPE_BANNER_VALUE = 2;
        public static final int AD_REQUEST_TYPE_FULLSCREEN_VALUE = 1;
        public static final int AD_REQUEST_TYPE_UNSPECIFIED_VALUE = 0;
        private static final com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.AdRequestOuterClass.AdRequestType> internalValueMap = new com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.AdRequestOuterClass.AdRequestType>() { // from class: gatewayprotocol.v1.AdRequestOuterClass.AdRequestType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public gatewayprotocol.v1.AdRequestOuterClass.AdRequestType findValueByNumber(int i) {
                return gatewayprotocol.v1.AdRequestOuterClass.AdRequestType.forNumber(i);
            }
        };
        private final int value;

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @java.lang.Deprecated
        public static gatewayprotocol.v1.AdRequestOuterClass.AdRequestType valueOf(int i) {
            return forNumber(i);
        }

        public static gatewayprotocol.v1.AdRequestOuterClass.AdRequestType forNumber(int i) {
            if (i == 0) {
                return AD_REQUEST_TYPE_UNSPECIFIED;
            }
            if (i == 1) {
                return AD_REQUEST_TYPE_FULLSCREEN;
            }
            if (i != 2) {
                return null;
            }
            return AD_REQUEST_TYPE_BANNER;
        }

        public static com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.AdRequestOuterClass.AdRequestType> internalGetValueMap() {
            return internalValueMap;
        }

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return gatewayprotocol.v1.AdRequestOuterClass.AdRequestType.AdRequestTypeVerifier.INSTANCE;
        }

        private static final class AdRequestTypeVerifier implements com.google.protobuf.Internal.EnumVerifier {
            static final com.google.protobuf.Internal.EnumVerifier INSTANCE = new gatewayprotocol.v1.AdRequestOuterClass.AdRequestType.AdRequestTypeVerifier();

            private AdRequestTypeVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return gatewayprotocol.v1.AdRequestOuterClass.AdRequestType.forNumber(i) != null;
            }
        }

        AdRequestType(int i) {
            this.value = i;
        }
    }

    public static final class BannerSize extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.AdRequestOuterClass.BannerSize, gatewayprotocol.v1.AdRequestOuterClass.BannerSize.Builder> implements gatewayprotocol.v1.AdRequestOuterClass.BannerSizeOrBuilder {
        private static final gatewayprotocol.v1.AdRequestOuterClass.BannerSize DEFAULT_INSTANCE;
        public static final int HEIGHT_FIELD_NUMBER = 2;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.AdRequestOuterClass.BannerSize> PARSER = null;
        public static final int WIDTH_FIELD_NUMBER = 1;
        private int height_;
        private int width_;

        private BannerSize() {
        }

        @Override // gatewayprotocol.v1.AdRequestOuterClass.BannerSizeOrBuilder
        public int getWidth() {
            return this.width_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWidth(int i) {
            this.width_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWidth() {
            this.width_ = 0;
        }

        @Override // gatewayprotocol.v1.AdRequestOuterClass.BannerSizeOrBuilder
        public int getHeight() {
            return this.height_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeight(int i) {
            this.height_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHeight() {
            this.height_ = 0;
        }

        public static gatewayprotocol.v1.AdRequestOuterClass.BannerSize parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.AdRequestOuterClass.BannerSize) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.AdRequestOuterClass.BannerSize parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.AdRequestOuterClass.BannerSize) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.AdRequestOuterClass.BannerSize parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.AdRequestOuterClass.BannerSize) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.AdRequestOuterClass.BannerSize parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.AdRequestOuterClass.BannerSize) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.AdRequestOuterClass.BannerSize parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.AdRequestOuterClass.BannerSize) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.AdRequestOuterClass.BannerSize parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.AdRequestOuterClass.BannerSize) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.AdRequestOuterClass.BannerSize parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.AdRequestOuterClass.BannerSize) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.AdRequestOuterClass.BannerSize parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.AdRequestOuterClass.BannerSize) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.AdRequestOuterClass.BannerSize parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.AdRequestOuterClass.BannerSize) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.AdRequestOuterClass.BannerSize parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.AdRequestOuterClass.BannerSize) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.AdRequestOuterClass.BannerSize parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.AdRequestOuterClass.BannerSize) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.AdRequestOuterClass.BannerSize parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.AdRequestOuterClass.BannerSize) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.AdRequestOuterClass.BannerSize.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.AdRequestOuterClass.BannerSize.Builder newBuilder(gatewayprotocol.v1.AdRequestOuterClass.BannerSize bannerSize) {
            return DEFAULT_INSTANCE.createBuilder(bannerSize);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.AdRequestOuterClass.BannerSize, gatewayprotocol.v1.AdRequestOuterClass.BannerSize.Builder> implements gatewayprotocol.v1.AdRequestOuterClass.BannerSizeOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.AdRequestOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.AdRequestOuterClass.BannerSize.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.BannerSizeOrBuilder
            public int getWidth() {
                return ((gatewayprotocol.v1.AdRequestOuterClass.BannerSize) this.instance).getWidth();
            }

            public gatewayprotocol.v1.AdRequestOuterClass.BannerSize.Builder setWidth(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdRequestOuterClass.BannerSize) this.instance).setWidth(i);
                return this;
            }

            public gatewayprotocol.v1.AdRequestOuterClass.BannerSize.Builder clearWidth() {
                copyOnWrite();
                ((gatewayprotocol.v1.AdRequestOuterClass.BannerSize) this.instance).clearWidth();
                return this;
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.BannerSizeOrBuilder
            public int getHeight() {
                return ((gatewayprotocol.v1.AdRequestOuterClass.BannerSize) this.instance).getHeight();
            }

            public gatewayprotocol.v1.AdRequestOuterClass.BannerSize.Builder setHeight(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdRequestOuterClass.BannerSize) this.instance).setHeight(i);
                return this;
            }

            public gatewayprotocol.v1.AdRequestOuterClass.BannerSize.Builder clearHeight() {
                copyOnWrite();
                ((gatewayprotocol.v1.AdRequestOuterClass.BannerSize) this.instance).clearHeight();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.AdRequestOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.AdRequestOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.AdRequestOuterClass.BannerSize();
                case 2:
                    return new gatewayprotocol.v1.AdRequestOuterClass.BannerSize.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new java.lang.Object[]{"width_", "height_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.AdRequestOuterClass.BannerSize> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (gatewayprotocol.v1.AdRequestOuterClass.BannerSize.class) {
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
            gatewayprotocol.v1.AdRequestOuterClass.BannerSize bannerSize = new gatewayprotocol.v1.AdRequestOuterClass.BannerSize();
            DEFAULT_INSTANCE = bannerSize;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.AdRequestOuterClass.BannerSize.class, bannerSize);
        }

        public static gatewayprotocol.v1.AdRequestOuterClass.BannerSize getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.AdRequestOuterClass.BannerSize> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* JADX INFO: renamed from: gatewayprotocol.v1.AdRequestOuterClass$1, reason: invalid class name */
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

    public static final class AdRequest extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.AdRequestOuterClass.AdRequest, gatewayprotocol.v1.AdRequestOuterClass.AdRequest.Builder> implements gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder {
        public static final int AD_FORMAT_FIELD_NUMBER = 13;
        public static final int AD_REQUEST_TYPE_FIELD_NUMBER = 11;
        public static final int BANNER_SIZE_FIELD_NUMBER = 12;
        public static final int CAMPAIGN_STATE_FIELD_NUMBER = 4;
        private static final gatewayprotocol.v1.AdRequestOuterClass.AdRequest DEFAULT_INSTANCE;
        public static final int DYNAMIC_DEVICE_INFO_FIELD_NUMBER = 3;
        public static final int IMPRESSION_OPPORTUNITY_ID_FIELD_NUMBER = 5;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.AdRequestOuterClass.AdRequest> PARSER = null;
        public static final int PLACEMENT_ID_FIELD_NUMBER = 6;
        public static final int REQUEST_IMPRESSION_CONFIGURATION_FIELD_NUMBER = 7;
        public static final int SCAR_SIGNAL_FIELD_NUMBER = 8;
        public static final int SESSION_COUNTERS_FIELD_NUMBER = 1;
        public static final int STATIC_DEVICE_INFO_FIELD_NUMBER = 2;
        public static final int TCF_FIELD_NUMBER = 10;
        public static final int WEBVIEW_VERSION_FIELD_NUMBER = 9;
        private int adFormat_;
        private int adRequestType_;
        private gatewayprotocol.v1.AdRequestOuterClass.BannerSize bannerSize_;
        private int bitField0_;
        private gatewayprotocol.v1.CampaignStateOuterClass.CampaignState campaignState_;
        private gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo_;
        private boolean requestImpressionConfiguration_;
        private gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters sessionCounters_;
        private gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo_;
        private int webviewVersion_;
        private com.google.protobuf.ByteString impressionOpportunityId_ = com.google.protobuf.ByteString.EMPTY;
        private java.lang.String placementId_ = "";
        private com.google.protobuf.ByteString scarSignal_ = com.google.protobuf.ByteString.EMPTY;
        private com.google.protobuf.ByteString tcf_ = com.google.protobuf.ByteString.EMPTY;

        private AdRequest() {
        }

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
        public boolean hasSessionCounters() {
            return this.sessionCounters_ != null;
        }

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
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

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
        public boolean hasStaticDeviceInfo() {
            return this.staticDeviceInfo_ != null;
        }

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
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

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
        public boolean hasDynamicDeviceInfo() {
            return this.dynamicDeviceInfo_ != null;
        }

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
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

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
        public boolean hasCampaignState() {
            return this.campaignState_ != null;
        }

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
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

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
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

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
        public java.lang.String getPlacementId() {
            return this.placementId_;
        }

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
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

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
        public boolean getRequestImpressionConfiguration() {
            return this.requestImpressionConfiguration_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRequestImpressionConfiguration(boolean z) {
            this.requestImpressionConfiguration_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRequestImpressionConfiguration() {
            this.requestImpressionConfiguration_ = false;
        }

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
        public com.google.protobuf.ByteString getScarSignal() {
            return this.scarSignal_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setScarSignal(com.google.protobuf.ByteString byteString) {
            byteString.getClass();
            this.scarSignal_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearScarSignal() {
            this.scarSignal_ = getDefaultInstance().getScarSignal();
        }

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
        public boolean hasWebviewVersion() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
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

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
        public boolean hasTcf() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
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

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
        public boolean hasAdRequestType() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
        public int getAdRequestTypeValue() {
            return this.adRequestType_;
        }

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
        public gatewayprotocol.v1.AdRequestOuterClass.AdRequestType getAdRequestType() {
            gatewayprotocol.v1.AdRequestOuterClass.AdRequestType adRequestTypeForNumber = gatewayprotocol.v1.AdRequestOuterClass.AdRequestType.forNumber(this.adRequestType_);
            return adRequestTypeForNumber == null ? gatewayprotocol.v1.AdRequestOuterClass.AdRequestType.UNRECOGNIZED : adRequestTypeForNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdRequestTypeValue(int i) {
            this.bitField0_ |= 4;
            this.adRequestType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdRequestType(gatewayprotocol.v1.AdRequestOuterClass.AdRequestType adRequestType) {
            this.adRequestType_ = adRequestType.getNumber();
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdRequestType() {
            this.bitField0_ &= -5;
            this.adRequestType_ = 0;
        }

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
        public boolean hasBannerSize() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
        public gatewayprotocol.v1.AdRequestOuterClass.BannerSize getBannerSize() {
            gatewayprotocol.v1.AdRequestOuterClass.BannerSize bannerSize = this.bannerSize_;
            return bannerSize == null ? gatewayprotocol.v1.AdRequestOuterClass.BannerSize.getDefaultInstance() : bannerSize;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBannerSize(gatewayprotocol.v1.AdRequestOuterClass.BannerSize bannerSize) {
            bannerSize.getClass();
            this.bannerSize_ = bannerSize;
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeBannerSize(gatewayprotocol.v1.AdRequestOuterClass.BannerSize bannerSize) {
            bannerSize.getClass();
            gatewayprotocol.v1.AdRequestOuterClass.BannerSize bannerSize2 = this.bannerSize_;
            if (bannerSize2 != null && bannerSize2 != gatewayprotocol.v1.AdRequestOuterClass.BannerSize.getDefaultInstance()) {
                this.bannerSize_ = gatewayprotocol.v1.AdRequestOuterClass.BannerSize.newBuilder(this.bannerSize_).mergeFrom(bannerSize).buildPartial();
            } else {
                this.bannerSize_ = bannerSize;
            }
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBannerSize() {
            this.bannerSize_ = null;
            this.bitField0_ &= -9;
        }

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
        public boolean hasAdFormat() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
        public int getAdFormatValue() {
            return this.adFormat_;
        }

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
        public gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat getAdFormat() {
            gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat adFormatForNumber = gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat.forNumber(this.adFormat_);
            return adFormatForNumber == null ? gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat.UNRECOGNIZED : adFormatForNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdFormatValue(int i) {
            this.bitField0_ |= 16;
            this.adFormat_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdFormat(gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat adFormat) {
            this.adFormat_ = adFormat.getNumber();
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdFormat() {
            this.bitField0_ &= -17;
            this.adFormat_ = 0;
        }

        public static gatewayprotocol.v1.AdRequestOuterClass.AdRequest parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.AdRequestOuterClass.AdRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.AdRequestOuterClass.AdRequest parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.AdRequestOuterClass.AdRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.AdRequestOuterClass.AdRequest parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.AdRequestOuterClass.AdRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.AdRequestOuterClass.AdRequest parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.AdRequestOuterClass.AdRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.AdRequestOuterClass.AdRequest parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.AdRequestOuterClass.AdRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.AdRequestOuterClass.AdRequest parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.AdRequestOuterClass.AdRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.AdRequestOuterClass.AdRequest parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.AdRequestOuterClass.AdRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.AdRequestOuterClass.AdRequest parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.AdRequestOuterClass.AdRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.AdRequestOuterClass.AdRequest parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.AdRequestOuterClass.AdRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.AdRequestOuterClass.AdRequest parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.AdRequestOuterClass.AdRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.AdRequestOuterClass.AdRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.AdRequestOuterClass.AdRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.AdRequestOuterClass.AdRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.AdRequestOuterClass.AdRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.AdRequestOuterClass.AdRequest.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.AdRequestOuterClass.AdRequest.Builder newBuilder(gatewayprotocol.v1.AdRequestOuterClass.AdRequest adRequest) {
            return DEFAULT_INSTANCE.createBuilder(adRequest);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.AdRequestOuterClass.AdRequest, gatewayprotocol.v1.AdRequestOuterClass.AdRequest.Builder> implements gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.AdRequestOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.AdRequestOuterClass.AdRequest.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            public boolean hasSessionCounters() {
                return ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).hasSessionCounters();
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            public gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters getSessionCounters() {
                return ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).getSessionCounters();
            }

            public gatewayprotocol.v1.AdRequestOuterClass.AdRequest.Builder setSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters sessionCounters) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).setSessionCounters(sessionCounters);
                return this;
            }

            public gatewayprotocol.v1.AdRequestOuterClass.AdRequest.Builder setSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).setSessionCounters(builder.build());
                return this;
            }

            public gatewayprotocol.v1.AdRequestOuterClass.AdRequest.Builder mergeSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters sessionCounters) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).mergeSessionCounters(sessionCounters);
                return this;
            }

            public gatewayprotocol.v1.AdRequestOuterClass.AdRequest.Builder clearSessionCounters() {
                copyOnWrite();
                ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).clearSessionCounters();
                return this;
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            public boolean hasStaticDeviceInfo() {
                return ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).hasStaticDeviceInfo();
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
                return ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).getStaticDeviceInfo();
            }

            public gatewayprotocol.v1.AdRequestOuterClass.AdRequest.Builder setStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).setStaticDeviceInfo(staticDeviceInfo);
                return this;
            }

            public gatewayprotocol.v1.AdRequestOuterClass.AdRequest.Builder setStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).setStaticDeviceInfo(builder.build());
                return this;
            }

            public gatewayprotocol.v1.AdRequestOuterClass.AdRequest.Builder mergeStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).mergeStaticDeviceInfo(staticDeviceInfo);
                return this;
            }

            public gatewayprotocol.v1.AdRequestOuterClass.AdRequest.Builder clearStaticDeviceInfo() {
                copyOnWrite();
                ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).clearStaticDeviceInfo();
                return this;
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            public boolean hasDynamicDeviceInfo() {
                return ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).hasDynamicDeviceInfo();
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
                return ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).getDynamicDeviceInfo();
            }

            public gatewayprotocol.v1.AdRequestOuterClass.AdRequest.Builder setDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).setDynamicDeviceInfo(dynamicDeviceInfo);
                return this;
            }

            public gatewayprotocol.v1.AdRequestOuterClass.AdRequest.Builder setDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).setDynamicDeviceInfo(builder.build());
                return this;
            }

            public gatewayprotocol.v1.AdRequestOuterClass.AdRequest.Builder mergeDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).mergeDynamicDeviceInfo(dynamicDeviceInfo);
                return this;
            }

            public gatewayprotocol.v1.AdRequestOuterClass.AdRequest.Builder clearDynamicDeviceInfo() {
                copyOnWrite();
                ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).clearDynamicDeviceInfo();
                return this;
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            public boolean hasCampaignState() {
                return ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).hasCampaignState();
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState getCampaignState() {
                return ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).getCampaignState();
            }

            public gatewayprotocol.v1.AdRequestOuterClass.AdRequest.Builder setCampaignState(gatewayprotocol.v1.CampaignStateOuterClass.CampaignState campaignState) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).setCampaignState(campaignState);
                return this;
            }

            public gatewayprotocol.v1.AdRequestOuterClass.AdRequest.Builder setCampaignState(gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).setCampaignState(builder.build());
                return this;
            }

            public gatewayprotocol.v1.AdRequestOuterClass.AdRequest.Builder mergeCampaignState(gatewayprotocol.v1.CampaignStateOuterClass.CampaignState campaignState) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).mergeCampaignState(campaignState);
                return this;
            }

            public gatewayprotocol.v1.AdRequestOuterClass.AdRequest.Builder clearCampaignState() {
                copyOnWrite();
                ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).clearCampaignState();
                return this;
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            public com.google.protobuf.ByteString getImpressionOpportunityId() {
                return ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).getImpressionOpportunityId();
            }

            public gatewayprotocol.v1.AdRequestOuterClass.AdRequest.Builder setImpressionOpportunityId(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).setImpressionOpportunityId(byteString);
                return this;
            }

            public gatewayprotocol.v1.AdRequestOuterClass.AdRequest.Builder clearImpressionOpportunityId() {
                copyOnWrite();
                ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).clearImpressionOpportunityId();
                return this;
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            public java.lang.String getPlacementId() {
                return ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).getPlacementId();
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            public com.google.protobuf.ByteString getPlacementIdBytes() {
                return ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).getPlacementIdBytes();
            }

            public gatewayprotocol.v1.AdRequestOuterClass.AdRequest.Builder setPlacementId(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).setPlacementId(str);
                return this;
            }

            public gatewayprotocol.v1.AdRequestOuterClass.AdRequest.Builder clearPlacementId() {
                copyOnWrite();
                ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).clearPlacementId();
                return this;
            }

            public gatewayprotocol.v1.AdRequestOuterClass.AdRequest.Builder setPlacementIdBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).setPlacementIdBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            public boolean getRequestImpressionConfiguration() {
                return ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).getRequestImpressionConfiguration();
            }

            public gatewayprotocol.v1.AdRequestOuterClass.AdRequest.Builder setRequestImpressionConfiguration(boolean z) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).setRequestImpressionConfiguration(z);
                return this;
            }

            public gatewayprotocol.v1.AdRequestOuterClass.AdRequest.Builder clearRequestImpressionConfiguration() {
                copyOnWrite();
                ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).clearRequestImpressionConfiguration();
                return this;
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            public com.google.protobuf.ByteString getScarSignal() {
                return ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).getScarSignal();
            }

            public gatewayprotocol.v1.AdRequestOuterClass.AdRequest.Builder setScarSignal(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).setScarSignal(byteString);
                return this;
            }

            public gatewayprotocol.v1.AdRequestOuterClass.AdRequest.Builder clearScarSignal() {
                copyOnWrite();
                ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).clearScarSignal();
                return this;
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            public boolean hasWebviewVersion() {
                return ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).hasWebviewVersion();
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            public int getWebviewVersion() {
                return ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).getWebviewVersion();
            }

            public gatewayprotocol.v1.AdRequestOuterClass.AdRequest.Builder setWebviewVersion(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).setWebviewVersion(i);
                return this;
            }

            public gatewayprotocol.v1.AdRequestOuterClass.AdRequest.Builder clearWebviewVersion() {
                copyOnWrite();
                ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).clearWebviewVersion();
                return this;
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            public boolean hasTcf() {
                return ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).hasTcf();
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            public com.google.protobuf.ByteString getTcf() {
                return ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).getTcf();
            }

            public gatewayprotocol.v1.AdRequestOuterClass.AdRequest.Builder setTcf(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).setTcf(byteString);
                return this;
            }

            public gatewayprotocol.v1.AdRequestOuterClass.AdRequest.Builder clearTcf() {
                copyOnWrite();
                ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).clearTcf();
                return this;
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            public boolean hasAdRequestType() {
                return ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).hasAdRequestType();
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            public int getAdRequestTypeValue() {
                return ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).getAdRequestTypeValue();
            }

            public gatewayprotocol.v1.AdRequestOuterClass.AdRequest.Builder setAdRequestTypeValue(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).setAdRequestTypeValue(i);
                return this;
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            public gatewayprotocol.v1.AdRequestOuterClass.AdRequestType getAdRequestType() {
                return ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).getAdRequestType();
            }

            public gatewayprotocol.v1.AdRequestOuterClass.AdRequest.Builder setAdRequestType(gatewayprotocol.v1.AdRequestOuterClass.AdRequestType adRequestType) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).setAdRequestType(adRequestType);
                return this;
            }

            public gatewayprotocol.v1.AdRequestOuterClass.AdRequest.Builder clearAdRequestType() {
                copyOnWrite();
                ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).clearAdRequestType();
                return this;
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            public boolean hasBannerSize() {
                return ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).hasBannerSize();
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            public gatewayprotocol.v1.AdRequestOuterClass.BannerSize getBannerSize() {
                return ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).getBannerSize();
            }

            public gatewayprotocol.v1.AdRequestOuterClass.AdRequest.Builder setBannerSize(gatewayprotocol.v1.AdRequestOuterClass.BannerSize bannerSize) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).setBannerSize(bannerSize);
                return this;
            }

            public gatewayprotocol.v1.AdRequestOuterClass.AdRequest.Builder setBannerSize(gatewayprotocol.v1.AdRequestOuterClass.BannerSize.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).setBannerSize(builder.build());
                return this;
            }

            public gatewayprotocol.v1.AdRequestOuterClass.AdRequest.Builder mergeBannerSize(gatewayprotocol.v1.AdRequestOuterClass.BannerSize bannerSize) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).mergeBannerSize(bannerSize);
                return this;
            }

            public gatewayprotocol.v1.AdRequestOuterClass.AdRequest.Builder clearBannerSize() {
                copyOnWrite();
                ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).clearBannerSize();
                return this;
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            public boolean hasAdFormat() {
                return ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).hasAdFormat();
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            public int getAdFormatValue() {
                return ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).getAdFormatValue();
            }

            public gatewayprotocol.v1.AdRequestOuterClass.AdRequest.Builder setAdFormatValue(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).setAdFormatValue(i);
                return this;
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            public gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat getAdFormat() {
                return ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).getAdFormat();
            }

            public gatewayprotocol.v1.AdRequestOuterClass.AdRequest.Builder setAdFormat(gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat adFormat) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).setAdFormat(adFormat);
                return this;
            }

            public gatewayprotocol.v1.AdRequestOuterClass.AdRequest.Builder clearAdFormat() {
                copyOnWrite();
                ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.instance).clearAdFormat();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.AdRequestOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.AdRequestOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.AdRequestOuterClass.AdRequest();
                case 2:
                    return new gatewayprotocol.v1.AdRequestOuterClass.AdRequest.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\n\u0006Ȉ\u0007\u0007\b\n\tင\u0000\nည\u0001\u000bဌ\u0002\fဉ\u0003\rဌ\u0004", new java.lang.Object[]{"bitField0_", "sessionCounters_", "staticDeviceInfo_", "dynamicDeviceInfo_", "campaignState_", "impressionOpportunityId_", "placementId_", "requestImpressionConfiguration_", "scarSignal_", "webviewVersion_", "tcf_", "adRequestType_", "bannerSize_", "adFormat_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.AdRequestOuterClass.AdRequest> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (gatewayprotocol.v1.AdRequestOuterClass.AdRequest.class) {
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
            gatewayprotocol.v1.AdRequestOuterClass.AdRequest adRequest = new gatewayprotocol.v1.AdRequestOuterClass.AdRequest();
            DEFAULT_INSTANCE = adRequest;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.AdRequestOuterClass.AdRequest.class, adRequest);
        }

        public static gatewayprotocol.v1.AdRequestOuterClass.AdRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.AdRequestOuterClass.AdRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }
}
