package gatewayprotocol.v1;

/* JADX INFO: loaded from: classes6.dex */
public final class AdDataRefreshRequestOuterClass {

    public interface AdDataRefreshRequestOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        com.google.protobuf.ByteString getAdDataRefreshToken();

        gatewayprotocol.v1.CampaignStateOuterClass.CampaignState getCampaignState();

        gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo();

        com.google.protobuf.ByteString getImpressionOpportunityId();

        gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters getSessionCounters();

        gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo();

        boolean hasCampaignState();

        boolean hasDynamicDeviceInfo();

        boolean hasSessionCounters();

        boolean hasStaticDeviceInfo();
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
    }

    private AdDataRefreshRequestOuterClass() {
    }

    public static final class AdDataRefreshRequest extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest, gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest.Builder> implements gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequestOrBuilder {
        public static final int AD_DATA_REFRESH_TOKEN_FIELD_NUMBER = 6;
        public static final int CAMPAIGN_STATE_FIELD_NUMBER = 4;
        private static final gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest DEFAULT_INSTANCE;
        public static final int DYNAMIC_DEVICE_INFO_FIELD_NUMBER = 3;
        public static final int IMPRESSION_OPPORTUNITY_ID_FIELD_NUMBER = 5;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest> PARSER = null;
        public static final int SESSION_COUNTERS_FIELD_NUMBER = 1;
        public static final int STATIC_DEVICE_INFO_FIELD_NUMBER = 2;
        private gatewayprotocol.v1.CampaignStateOuterClass.CampaignState campaignState_;
        private gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo_;
        private gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters sessionCounters_;
        private gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo_;
        private com.google.protobuf.ByteString impressionOpportunityId_ = com.google.protobuf.ByteString.EMPTY;
        private com.google.protobuf.ByteString adDataRefreshToken_ = com.google.protobuf.ByteString.EMPTY;

        private AdDataRefreshRequest() {
        }

        @Override // gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequestOrBuilder
        public boolean hasSessionCounters() {
            return this.sessionCounters_ != null;
        }

        @Override // gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequestOrBuilder
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

        @Override // gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequestOrBuilder
        public boolean hasStaticDeviceInfo() {
            return this.staticDeviceInfo_ != null;
        }

        @Override // gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequestOrBuilder
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

        @Override // gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequestOrBuilder
        public boolean hasDynamicDeviceInfo() {
            return this.dynamicDeviceInfo_ != null;
        }

        @Override // gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequestOrBuilder
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

        @Override // gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequestOrBuilder
        public boolean hasCampaignState() {
            return this.campaignState_ != null;
        }

        @Override // gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequestOrBuilder
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

        @Override // gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequestOrBuilder
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

        @Override // gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequestOrBuilder
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

        public static gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest.Builder newBuilder(gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest adDataRefreshRequest) {
            return DEFAULT_INSTANCE.createBuilder(adDataRefreshRequest);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest, gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest.Builder> implements gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequestOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequestOrBuilder
            public boolean hasSessionCounters() {
                return ((gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest) this.instance).hasSessionCounters();
            }

            @Override // gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequestOrBuilder
            public gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters getSessionCounters() {
                return ((gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest) this.instance).getSessionCounters();
            }

            public gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest.Builder setSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters sessionCounters) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest) this.instance).setSessionCounters(sessionCounters);
                return this;
            }

            public gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest.Builder setSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest) this.instance).setSessionCounters(builder.build());
                return this;
            }

            public gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest.Builder mergeSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters sessionCounters) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest) this.instance).mergeSessionCounters(sessionCounters);
                return this;
            }

            public gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest.Builder clearSessionCounters() {
                copyOnWrite();
                ((gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest) this.instance).clearSessionCounters();
                return this;
            }

            @Override // gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequestOrBuilder
            public boolean hasStaticDeviceInfo() {
                return ((gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest) this.instance).hasStaticDeviceInfo();
            }

            @Override // gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequestOrBuilder
            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
                return ((gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest) this.instance).getStaticDeviceInfo();
            }

            public gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest.Builder setStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest) this.instance).setStaticDeviceInfo(staticDeviceInfo);
                return this;
            }

            public gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest.Builder setStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest) this.instance).setStaticDeviceInfo(builder.build());
                return this;
            }

            public gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest.Builder mergeStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest) this.instance).mergeStaticDeviceInfo(staticDeviceInfo);
                return this;
            }

            public gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest.Builder clearStaticDeviceInfo() {
                copyOnWrite();
                ((gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest) this.instance).clearStaticDeviceInfo();
                return this;
            }

            @Override // gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequestOrBuilder
            public boolean hasDynamicDeviceInfo() {
                return ((gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest) this.instance).hasDynamicDeviceInfo();
            }

            @Override // gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequestOrBuilder
            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
                return ((gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest) this.instance).getDynamicDeviceInfo();
            }

            public gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest.Builder setDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest) this.instance).setDynamicDeviceInfo(dynamicDeviceInfo);
                return this;
            }

            public gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest.Builder setDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest) this.instance).setDynamicDeviceInfo(builder.build());
                return this;
            }

            public gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest.Builder mergeDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest) this.instance).mergeDynamicDeviceInfo(dynamicDeviceInfo);
                return this;
            }

            public gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest.Builder clearDynamicDeviceInfo() {
                copyOnWrite();
                ((gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest) this.instance).clearDynamicDeviceInfo();
                return this;
            }

            @Override // gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequestOrBuilder
            public boolean hasCampaignState() {
                return ((gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest) this.instance).hasCampaignState();
            }

            @Override // gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequestOrBuilder
            public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState getCampaignState() {
                return ((gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest) this.instance).getCampaignState();
            }

            public gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest.Builder setCampaignState(gatewayprotocol.v1.CampaignStateOuterClass.CampaignState campaignState) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest) this.instance).setCampaignState(campaignState);
                return this;
            }

            public gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest.Builder setCampaignState(gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest) this.instance).setCampaignState(builder.build());
                return this;
            }

            public gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest.Builder mergeCampaignState(gatewayprotocol.v1.CampaignStateOuterClass.CampaignState campaignState) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest) this.instance).mergeCampaignState(campaignState);
                return this;
            }

            public gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest.Builder clearCampaignState() {
                copyOnWrite();
                ((gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest) this.instance).clearCampaignState();
                return this;
            }

            @Override // gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequestOrBuilder
            public com.google.protobuf.ByteString getImpressionOpportunityId() {
                return ((gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest) this.instance).getImpressionOpportunityId();
            }

            public gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest.Builder setImpressionOpportunityId(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest) this.instance).setImpressionOpportunityId(byteString);
                return this;
            }

            public gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest.Builder clearImpressionOpportunityId() {
                copyOnWrite();
                ((gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest) this.instance).clearImpressionOpportunityId();
                return this;
            }

            @Override // gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequestOrBuilder
            public com.google.protobuf.ByteString getAdDataRefreshToken() {
                return ((gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest) this.instance).getAdDataRefreshToken();
            }

            public gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest.Builder setAdDataRefreshToken(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest) this.instance).setAdDataRefreshToken(byteString);
                return this;
            }

            public gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest.Builder clearAdDataRefreshToken() {
                copyOnWrite();
                ((gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest) this.instance).clearAdDataRefreshToken();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest();
                case 2:
                    return new gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\n\u0006\n", new java.lang.Object[]{"sessionCounters_", "staticDeviceInfo_", "dynamicDeviceInfo_", "campaignState_", "impressionOpportunityId_", "adDataRefreshToken_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest.class) {
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
            gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest adDataRefreshRequest = new gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest();
            DEFAULT_INSTANCE = adDataRefreshRequest;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest.class, adDataRefreshRequest);
        }

        public static gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* JADX INFO: renamed from: gatewayprotocol.v1.AdDataRefreshRequestOuterClass$1, reason: invalid class name */
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
