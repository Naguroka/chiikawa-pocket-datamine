package gatewayprotocol.v1;

/* JADX INFO: loaded from: classes6.dex */
public final class CampaignStateOuterClass {

    public interface CampaignOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        com.google.protobuf.ByteString getData();

        int getDataVersion();

        com.google.protobuf.ByteString getImpressionOpportunityId();

        gatewayprotocol.v1.TimestampsOuterClass.Timestamps getLoadTimestamp();

        java.lang.String getPlacementId();

        com.google.protobuf.ByteString getPlacementIdBytes();

        gatewayprotocol.v1.TimestampsOuterClass.Timestamps getShowTimestamp();

        boolean hasLoadTimestamp();

        boolean hasShowTimestamp();
    }

    public interface CampaignStateOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        gatewayprotocol.v1.CampaignStateOuterClass.Campaign getLoadedCampaigns(int i);

        int getLoadedCampaignsCount();

        java.util.List<gatewayprotocol.v1.CampaignStateOuterClass.Campaign> getLoadedCampaignsList();

        gatewayprotocol.v1.CampaignStateOuterClass.Campaign getShownCampaigns(int i);

        int getShownCampaignsCount();

        java.util.List<gatewayprotocol.v1.CampaignStateOuterClass.Campaign> getShownCampaignsList();
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
    }

    private CampaignStateOuterClass() {
    }

    public static final class Campaign extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.CampaignStateOuterClass.Campaign, gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder> implements gatewayprotocol.v1.CampaignStateOuterClass.CampaignOrBuilder {
        public static final int DATA_FIELD_NUMBER = 2;
        public static final int DATA_VERSION_FIELD_NUMBER = 1;
        private static final gatewayprotocol.v1.CampaignStateOuterClass.Campaign DEFAULT_INSTANCE;
        public static final int IMPRESSION_OPPORTUNITY_ID_FIELD_NUMBER = 4;
        public static final int LOAD_TIMESTAMP_FIELD_NUMBER = 5;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.CampaignStateOuterClass.Campaign> PARSER = null;
        public static final int PLACEMENT_ID_FIELD_NUMBER = 3;
        public static final int SHOW_TIMESTAMP_FIELD_NUMBER = 6;
        private int bitField0_;
        private int dataVersion_;
        private gatewayprotocol.v1.TimestampsOuterClass.Timestamps loadTimestamp_;
        private gatewayprotocol.v1.TimestampsOuterClass.Timestamps showTimestamp_;
        private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
        private java.lang.String placementId_ = "";
        private com.google.protobuf.ByteString impressionOpportunityId_ = com.google.protobuf.ByteString.EMPTY;

        private Campaign() {
        }

        @Override // gatewayprotocol.v1.CampaignStateOuterClass.CampaignOrBuilder
        public int getDataVersion() {
            return this.dataVersion_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDataVersion(int i) {
            this.dataVersion_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDataVersion() {
            this.dataVersion_ = 0;
        }

        @Override // gatewayprotocol.v1.CampaignStateOuterClass.CampaignOrBuilder
        public com.google.protobuf.ByteString getData() {
            return this.data_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setData(com.google.protobuf.ByteString byteString) {
            byteString.getClass();
            this.data_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearData() {
            this.data_ = getDefaultInstance().getData();
        }

        @Override // gatewayprotocol.v1.CampaignStateOuterClass.CampaignOrBuilder
        public java.lang.String getPlacementId() {
            return this.placementId_;
        }

        @Override // gatewayprotocol.v1.CampaignStateOuterClass.CampaignOrBuilder
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

        @Override // gatewayprotocol.v1.CampaignStateOuterClass.CampaignOrBuilder
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

        @Override // gatewayprotocol.v1.CampaignStateOuterClass.CampaignOrBuilder
        public boolean hasLoadTimestamp() {
            return this.loadTimestamp_ != null;
        }

        @Override // gatewayprotocol.v1.CampaignStateOuterClass.CampaignOrBuilder
        public gatewayprotocol.v1.TimestampsOuterClass.Timestamps getLoadTimestamp() {
            gatewayprotocol.v1.TimestampsOuterClass.Timestamps timestamps = this.loadTimestamp_;
            return timestamps == null ? gatewayprotocol.v1.TimestampsOuterClass.Timestamps.getDefaultInstance() : timestamps;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLoadTimestamp(gatewayprotocol.v1.TimestampsOuterClass.Timestamps timestamps) {
            timestamps.getClass();
            this.loadTimestamp_ = timestamps;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeLoadTimestamp(gatewayprotocol.v1.TimestampsOuterClass.Timestamps timestamps) {
            timestamps.getClass();
            gatewayprotocol.v1.TimestampsOuterClass.Timestamps timestamps2 = this.loadTimestamp_;
            if (timestamps2 != null && timestamps2 != gatewayprotocol.v1.TimestampsOuterClass.Timestamps.getDefaultInstance()) {
                this.loadTimestamp_ = gatewayprotocol.v1.TimestampsOuterClass.Timestamps.newBuilder(this.loadTimestamp_).mergeFrom(timestamps).buildPartial();
            } else {
                this.loadTimestamp_ = timestamps;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLoadTimestamp() {
            this.loadTimestamp_ = null;
        }

        @Override // gatewayprotocol.v1.CampaignStateOuterClass.CampaignOrBuilder
        public boolean hasShowTimestamp() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // gatewayprotocol.v1.CampaignStateOuterClass.CampaignOrBuilder
        public gatewayprotocol.v1.TimestampsOuterClass.Timestamps getShowTimestamp() {
            gatewayprotocol.v1.TimestampsOuterClass.Timestamps timestamps = this.showTimestamp_;
            return timestamps == null ? gatewayprotocol.v1.TimestampsOuterClass.Timestamps.getDefaultInstance() : timestamps;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShowTimestamp(gatewayprotocol.v1.TimestampsOuterClass.Timestamps timestamps) {
            timestamps.getClass();
            this.showTimestamp_ = timestamps;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeShowTimestamp(gatewayprotocol.v1.TimestampsOuterClass.Timestamps timestamps) {
            timestamps.getClass();
            gatewayprotocol.v1.TimestampsOuterClass.Timestamps timestamps2 = this.showTimestamp_;
            if (timestamps2 != null && timestamps2 != gatewayprotocol.v1.TimestampsOuterClass.Timestamps.getDefaultInstance()) {
                this.showTimestamp_ = gatewayprotocol.v1.TimestampsOuterClass.Timestamps.newBuilder(this.showTimestamp_).mergeFrom(timestamps).buildPartial();
            } else {
                this.showTimestamp_ = timestamps;
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearShowTimestamp() {
            this.showTimestamp_ = null;
            this.bitField0_ &= -2;
        }

        public static gatewayprotocol.v1.CampaignStateOuterClass.Campaign parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.CampaignStateOuterClass.Campaign) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.CampaignStateOuterClass.Campaign parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.CampaignStateOuterClass.Campaign) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.CampaignStateOuterClass.Campaign parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.CampaignStateOuterClass.Campaign) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.CampaignStateOuterClass.Campaign parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.CampaignStateOuterClass.Campaign) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.CampaignStateOuterClass.Campaign parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.CampaignStateOuterClass.Campaign) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.CampaignStateOuterClass.Campaign parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.CampaignStateOuterClass.Campaign) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.CampaignStateOuterClass.Campaign parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.CampaignStateOuterClass.Campaign) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.CampaignStateOuterClass.Campaign parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.CampaignStateOuterClass.Campaign) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.CampaignStateOuterClass.Campaign parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.CampaignStateOuterClass.Campaign) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.CampaignStateOuterClass.Campaign parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.CampaignStateOuterClass.Campaign) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.CampaignStateOuterClass.Campaign parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.CampaignStateOuterClass.Campaign) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.CampaignStateOuterClass.Campaign parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.CampaignStateOuterClass.Campaign) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder newBuilder(gatewayprotocol.v1.CampaignStateOuterClass.Campaign campaign) {
            return DEFAULT_INSTANCE.createBuilder(campaign);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.CampaignStateOuterClass.Campaign, gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder> implements gatewayprotocol.v1.CampaignStateOuterClass.CampaignOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.CampaignStateOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.CampaignStateOuterClass.Campaign.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.CampaignStateOuterClass.CampaignOrBuilder
            public int getDataVersion() {
                return ((gatewayprotocol.v1.CampaignStateOuterClass.Campaign) this.instance).getDataVersion();
            }

            public gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder setDataVersion(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.CampaignStateOuterClass.Campaign) this.instance).setDataVersion(i);
                return this;
            }

            public gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder clearDataVersion() {
                copyOnWrite();
                ((gatewayprotocol.v1.CampaignStateOuterClass.Campaign) this.instance).clearDataVersion();
                return this;
            }

            @Override // gatewayprotocol.v1.CampaignStateOuterClass.CampaignOrBuilder
            public com.google.protobuf.ByteString getData() {
                return ((gatewayprotocol.v1.CampaignStateOuterClass.Campaign) this.instance).getData();
            }

            public gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder setData(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.CampaignStateOuterClass.Campaign) this.instance).setData(byteString);
                return this;
            }

            public gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder clearData() {
                copyOnWrite();
                ((gatewayprotocol.v1.CampaignStateOuterClass.Campaign) this.instance).clearData();
                return this;
            }

            @Override // gatewayprotocol.v1.CampaignStateOuterClass.CampaignOrBuilder
            public java.lang.String getPlacementId() {
                return ((gatewayprotocol.v1.CampaignStateOuterClass.Campaign) this.instance).getPlacementId();
            }

            @Override // gatewayprotocol.v1.CampaignStateOuterClass.CampaignOrBuilder
            public com.google.protobuf.ByteString getPlacementIdBytes() {
                return ((gatewayprotocol.v1.CampaignStateOuterClass.Campaign) this.instance).getPlacementIdBytes();
            }

            public gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder setPlacementId(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.CampaignStateOuterClass.Campaign) this.instance).setPlacementId(str);
                return this;
            }

            public gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder clearPlacementId() {
                copyOnWrite();
                ((gatewayprotocol.v1.CampaignStateOuterClass.Campaign) this.instance).clearPlacementId();
                return this;
            }

            public gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder setPlacementIdBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.CampaignStateOuterClass.Campaign) this.instance).setPlacementIdBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.CampaignStateOuterClass.CampaignOrBuilder
            public com.google.protobuf.ByteString getImpressionOpportunityId() {
                return ((gatewayprotocol.v1.CampaignStateOuterClass.Campaign) this.instance).getImpressionOpportunityId();
            }

            public gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder setImpressionOpportunityId(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.CampaignStateOuterClass.Campaign) this.instance).setImpressionOpportunityId(byteString);
                return this;
            }

            public gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder clearImpressionOpportunityId() {
                copyOnWrite();
                ((gatewayprotocol.v1.CampaignStateOuterClass.Campaign) this.instance).clearImpressionOpportunityId();
                return this;
            }

            @Override // gatewayprotocol.v1.CampaignStateOuterClass.CampaignOrBuilder
            public boolean hasLoadTimestamp() {
                return ((gatewayprotocol.v1.CampaignStateOuterClass.Campaign) this.instance).hasLoadTimestamp();
            }

            @Override // gatewayprotocol.v1.CampaignStateOuterClass.CampaignOrBuilder
            public gatewayprotocol.v1.TimestampsOuterClass.Timestamps getLoadTimestamp() {
                return ((gatewayprotocol.v1.CampaignStateOuterClass.Campaign) this.instance).getLoadTimestamp();
            }

            public gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder setLoadTimestamp(gatewayprotocol.v1.TimestampsOuterClass.Timestamps timestamps) {
                copyOnWrite();
                ((gatewayprotocol.v1.CampaignStateOuterClass.Campaign) this.instance).setLoadTimestamp(timestamps);
                return this;
            }

            public gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder setLoadTimestamp(gatewayprotocol.v1.TimestampsOuterClass.Timestamps.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.CampaignStateOuterClass.Campaign) this.instance).setLoadTimestamp(builder.build());
                return this;
            }

            public gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder mergeLoadTimestamp(gatewayprotocol.v1.TimestampsOuterClass.Timestamps timestamps) {
                copyOnWrite();
                ((gatewayprotocol.v1.CampaignStateOuterClass.Campaign) this.instance).mergeLoadTimestamp(timestamps);
                return this;
            }

            public gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder clearLoadTimestamp() {
                copyOnWrite();
                ((gatewayprotocol.v1.CampaignStateOuterClass.Campaign) this.instance).clearLoadTimestamp();
                return this;
            }

            @Override // gatewayprotocol.v1.CampaignStateOuterClass.CampaignOrBuilder
            public boolean hasShowTimestamp() {
                return ((gatewayprotocol.v1.CampaignStateOuterClass.Campaign) this.instance).hasShowTimestamp();
            }

            @Override // gatewayprotocol.v1.CampaignStateOuterClass.CampaignOrBuilder
            public gatewayprotocol.v1.TimestampsOuterClass.Timestamps getShowTimestamp() {
                return ((gatewayprotocol.v1.CampaignStateOuterClass.Campaign) this.instance).getShowTimestamp();
            }

            public gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder setShowTimestamp(gatewayprotocol.v1.TimestampsOuterClass.Timestamps timestamps) {
                copyOnWrite();
                ((gatewayprotocol.v1.CampaignStateOuterClass.Campaign) this.instance).setShowTimestamp(timestamps);
                return this;
            }

            public gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder setShowTimestamp(gatewayprotocol.v1.TimestampsOuterClass.Timestamps.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.CampaignStateOuterClass.Campaign) this.instance).setShowTimestamp(builder.build());
                return this;
            }

            public gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder mergeShowTimestamp(gatewayprotocol.v1.TimestampsOuterClass.Timestamps timestamps) {
                copyOnWrite();
                ((gatewayprotocol.v1.CampaignStateOuterClass.Campaign) this.instance).mergeShowTimestamp(timestamps);
                return this;
            }

            public gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder clearShowTimestamp() {
                copyOnWrite();
                ((gatewayprotocol.v1.CampaignStateOuterClass.Campaign) this.instance).clearShowTimestamp();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.CampaignStateOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.CampaignStateOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.CampaignStateOuterClass.Campaign();
                case 2:
                    return new gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0004\u0002\n\u0003Ȉ\u0004\n\u0005\t\u0006ဉ\u0000", new java.lang.Object[]{"bitField0_", "dataVersion_", "data_", "placementId_", "impressionOpportunityId_", "loadTimestamp_", "showTimestamp_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.CampaignStateOuterClass.Campaign> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (gatewayprotocol.v1.CampaignStateOuterClass.Campaign.class) {
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
            gatewayprotocol.v1.CampaignStateOuterClass.Campaign campaign = new gatewayprotocol.v1.CampaignStateOuterClass.Campaign();
            DEFAULT_INSTANCE = campaign;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.CampaignStateOuterClass.Campaign.class, campaign);
        }

        public static gatewayprotocol.v1.CampaignStateOuterClass.Campaign getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.CampaignStateOuterClass.Campaign> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* JADX INFO: renamed from: gatewayprotocol.v1.CampaignStateOuterClass$1, reason: invalid class name */
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

    public static final class CampaignState extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.CampaignStateOuterClass.CampaignState, gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder> implements gatewayprotocol.v1.CampaignStateOuterClass.CampaignStateOrBuilder {
        private static final gatewayprotocol.v1.CampaignStateOuterClass.CampaignState DEFAULT_INSTANCE;
        public static final int LOADED_CAMPAIGNS_FIELD_NUMBER = 1;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.CampaignStateOuterClass.CampaignState> PARSER = null;
        public static final int SHOWN_CAMPAIGNS_FIELD_NUMBER = 2;
        private com.google.protobuf.Internal.ProtobufList<gatewayprotocol.v1.CampaignStateOuterClass.Campaign> loadedCampaigns_ = emptyProtobufList();
        private com.google.protobuf.Internal.ProtobufList<gatewayprotocol.v1.CampaignStateOuterClass.Campaign> shownCampaigns_ = emptyProtobufList();

        private CampaignState() {
        }

        @Override // gatewayprotocol.v1.CampaignStateOuterClass.CampaignStateOrBuilder
        public java.util.List<gatewayprotocol.v1.CampaignStateOuterClass.Campaign> getLoadedCampaignsList() {
            return this.loadedCampaigns_;
        }

        public java.util.List<? extends gatewayprotocol.v1.CampaignStateOuterClass.CampaignOrBuilder> getLoadedCampaignsOrBuilderList() {
            return this.loadedCampaigns_;
        }

        @Override // gatewayprotocol.v1.CampaignStateOuterClass.CampaignStateOrBuilder
        public int getLoadedCampaignsCount() {
            return this.loadedCampaigns_.size();
        }

        @Override // gatewayprotocol.v1.CampaignStateOuterClass.CampaignStateOrBuilder
        public gatewayprotocol.v1.CampaignStateOuterClass.Campaign getLoadedCampaigns(int i) {
            return this.loadedCampaigns_.get(i);
        }

        public gatewayprotocol.v1.CampaignStateOuterClass.CampaignOrBuilder getLoadedCampaignsOrBuilder(int i) {
            return this.loadedCampaigns_.get(i);
        }

        private void ensureLoadedCampaignsIsMutable() {
            com.google.protobuf.Internal.ProtobufList<gatewayprotocol.v1.CampaignStateOuterClass.Campaign> protobufList = this.loadedCampaigns_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.loadedCampaigns_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLoadedCampaigns(int i, gatewayprotocol.v1.CampaignStateOuterClass.Campaign campaign) {
            campaign.getClass();
            ensureLoadedCampaignsIsMutable();
            this.loadedCampaigns_.set(i, campaign);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLoadedCampaigns(gatewayprotocol.v1.CampaignStateOuterClass.Campaign campaign) {
            campaign.getClass();
            ensureLoadedCampaignsIsMutable();
            this.loadedCampaigns_.add(campaign);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLoadedCampaigns(int i, gatewayprotocol.v1.CampaignStateOuterClass.Campaign campaign) {
            campaign.getClass();
            ensureLoadedCampaignsIsMutable();
            this.loadedCampaigns_.add(i, campaign);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllLoadedCampaigns(java.lang.Iterable<? extends gatewayprotocol.v1.CampaignStateOuterClass.Campaign> iterable) {
            ensureLoadedCampaignsIsMutable();
            com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.loadedCampaigns_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLoadedCampaigns() {
            this.loadedCampaigns_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeLoadedCampaigns(int i) {
            ensureLoadedCampaignsIsMutable();
            this.loadedCampaigns_.remove(i);
        }

        @Override // gatewayprotocol.v1.CampaignStateOuterClass.CampaignStateOrBuilder
        public java.util.List<gatewayprotocol.v1.CampaignStateOuterClass.Campaign> getShownCampaignsList() {
            return this.shownCampaigns_;
        }

        public java.util.List<? extends gatewayprotocol.v1.CampaignStateOuterClass.CampaignOrBuilder> getShownCampaignsOrBuilderList() {
            return this.shownCampaigns_;
        }

        @Override // gatewayprotocol.v1.CampaignStateOuterClass.CampaignStateOrBuilder
        public int getShownCampaignsCount() {
            return this.shownCampaigns_.size();
        }

        @Override // gatewayprotocol.v1.CampaignStateOuterClass.CampaignStateOrBuilder
        public gatewayprotocol.v1.CampaignStateOuterClass.Campaign getShownCampaigns(int i) {
            return this.shownCampaigns_.get(i);
        }

        public gatewayprotocol.v1.CampaignStateOuterClass.CampaignOrBuilder getShownCampaignsOrBuilder(int i) {
            return this.shownCampaigns_.get(i);
        }

        private void ensureShownCampaignsIsMutable() {
            com.google.protobuf.Internal.ProtobufList<gatewayprotocol.v1.CampaignStateOuterClass.Campaign> protobufList = this.shownCampaigns_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.shownCampaigns_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShownCampaigns(int i, gatewayprotocol.v1.CampaignStateOuterClass.Campaign campaign) {
            campaign.getClass();
            ensureShownCampaignsIsMutable();
            this.shownCampaigns_.set(i, campaign);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addShownCampaigns(gatewayprotocol.v1.CampaignStateOuterClass.Campaign campaign) {
            campaign.getClass();
            ensureShownCampaignsIsMutable();
            this.shownCampaigns_.add(campaign);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addShownCampaigns(int i, gatewayprotocol.v1.CampaignStateOuterClass.Campaign campaign) {
            campaign.getClass();
            ensureShownCampaignsIsMutable();
            this.shownCampaigns_.add(i, campaign);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllShownCampaigns(java.lang.Iterable<? extends gatewayprotocol.v1.CampaignStateOuterClass.Campaign> iterable) {
            ensureShownCampaignsIsMutable();
            com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.shownCampaigns_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearShownCampaigns() {
            this.shownCampaigns_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeShownCampaigns(int i) {
            ensureShownCampaignsIsMutable();
            this.shownCampaigns_.remove(i);
        }

        public static gatewayprotocol.v1.CampaignStateOuterClass.CampaignState parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.CampaignStateOuterClass.CampaignState) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.CampaignStateOuterClass.CampaignState parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.CampaignStateOuterClass.CampaignState) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.CampaignStateOuterClass.CampaignState parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.CampaignStateOuterClass.CampaignState) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.CampaignStateOuterClass.CampaignState parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.CampaignStateOuterClass.CampaignState) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.CampaignStateOuterClass.CampaignState parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.CampaignStateOuterClass.CampaignState) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.CampaignStateOuterClass.CampaignState parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.CampaignStateOuterClass.CampaignState) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.CampaignStateOuterClass.CampaignState parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.CampaignStateOuterClass.CampaignState) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.CampaignStateOuterClass.CampaignState parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.CampaignStateOuterClass.CampaignState) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.CampaignStateOuterClass.CampaignState parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.CampaignStateOuterClass.CampaignState) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.CampaignStateOuterClass.CampaignState parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.CampaignStateOuterClass.CampaignState) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.CampaignStateOuterClass.CampaignState parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.CampaignStateOuterClass.CampaignState) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.CampaignStateOuterClass.CampaignState parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.CampaignStateOuterClass.CampaignState) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder newBuilder(gatewayprotocol.v1.CampaignStateOuterClass.CampaignState campaignState) {
            return DEFAULT_INSTANCE.createBuilder(campaignState);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.CampaignStateOuterClass.CampaignState, gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder> implements gatewayprotocol.v1.CampaignStateOuterClass.CampaignStateOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.CampaignStateOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.CampaignStateOuterClass.CampaignStateOrBuilder
            public java.util.List<gatewayprotocol.v1.CampaignStateOuterClass.Campaign> getLoadedCampaignsList() {
                return java.util.Collections.unmodifiableList(((gatewayprotocol.v1.CampaignStateOuterClass.CampaignState) this.instance).getLoadedCampaignsList());
            }

            @Override // gatewayprotocol.v1.CampaignStateOuterClass.CampaignStateOrBuilder
            public int getLoadedCampaignsCount() {
                return ((gatewayprotocol.v1.CampaignStateOuterClass.CampaignState) this.instance).getLoadedCampaignsCount();
            }

            @Override // gatewayprotocol.v1.CampaignStateOuterClass.CampaignStateOrBuilder
            public gatewayprotocol.v1.CampaignStateOuterClass.Campaign getLoadedCampaigns(int i) {
                return ((gatewayprotocol.v1.CampaignStateOuterClass.CampaignState) this.instance).getLoadedCampaigns(i);
            }

            public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder setLoadedCampaigns(int i, gatewayprotocol.v1.CampaignStateOuterClass.Campaign campaign) {
                copyOnWrite();
                ((gatewayprotocol.v1.CampaignStateOuterClass.CampaignState) this.instance).setLoadedCampaigns(i, campaign);
                return this;
            }

            public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder setLoadedCampaigns(int i, gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.CampaignStateOuterClass.CampaignState) this.instance).setLoadedCampaigns(i, builder.build());
                return this;
            }

            public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder addLoadedCampaigns(gatewayprotocol.v1.CampaignStateOuterClass.Campaign campaign) {
                copyOnWrite();
                ((gatewayprotocol.v1.CampaignStateOuterClass.CampaignState) this.instance).addLoadedCampaigns(campaign);
                return this;
            }

            public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder addLoadedCampaigns(int i, gatewayprotocol.v1.CampaignStateOuterClass.Campaign campaign) {
                copyOnWrite();
                ((gatewayprotocol.v1.CampaignStateOuterClass.CampaignState) this.instance).addLoadedCampaigns(i, campaign);
                return this;
            }

            public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder addLoadedCampaigns(gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.CampaignStateOuterClass.CampaignState) this.instance).addLoadedCampaigns(builder.build());
                return this;
            }

            public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder addLoadedCampaigns(int i, gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.CampaignStateOuterClass.CampaignState) this.instance).addLoadedCampaigns(i, builder.build());
                return this;
            }

            public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder addAllLoadedCampaigns(java.lang.Iterable<? extends gatewayprotocol.v1.CampaignStateOuterClass.Campaign> iterable) {
                copyOnWrite();
                ((gatewayprotocol.v1.CampaignStateOuterClass.CampaignState) this.instance).addAllLoadedCampaigns(iterable);
                return this;
            }

            public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder clearLoadedCampaigns() {
                copyOnWrite();
                ((gatewayprotocol.v1.CampaignStateOuterClass.CampaignState) this.instance).clearLoadedCampaigns();
                return this;
            }

            public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder removeLoadedCampaigns(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.CampaignStateOuterClass.CampaignState) this.instance).removeLoadedCampaigns(i);
                return this;
            }

            @Override // gatewayprotocol.v1.CampaignStateOuterClass.CampaignStateOrBuilder
            public java.util.List<gatewayprotocol.v1.CampaignStateOuterClass.Campaign> getShownCampaignsList() {
                return java.util.Collections.unmodifiableList(((gatewayprotocol.v1.CampaignStateOuterClass.CampaignState) this.instance).getShownCampaignsList());
            }

            @Override // gatewayprotocol.v1.CampaignStateOuterClass.CampaignStateOrBuilder
            public int getShownCampaignsCount() {
                return ((gatewayprotocol.v1.CampaignStateOuterClass.CampaignState) this.instance).getShownCampaignsCount();
            }

            @Override // gatewayprotocol.v1.CampaignStateOuterClass.CampaignStateOrBuilder
            public gatewayprotocol.v1.CampaignStateOuterClass.Campaign getShownCampaigns(int i) {
                return ((gatewayprotocol.v1.CampaignStateOuterClass.CampaignState) this.instance).getShownCampaigns(i);
            }

            public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder setShownCampaigns(int i, gatewayprotocol.v1.CampaignStateOuterClass.Campaign campaign) {
                copyOnWrite();
                ((gatewayprotocol.v1.CampaignStateOuterClass.CampaignState) this.instance).setShownCampaigns(i, campaign);
                return this;
            }

            public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder setShownCampaigns(int i, gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.CampaignStateOuterClass.CampaignState) this.instance).setShownCampaigns(i, builder.build());
                return this;
            }

            public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder addShownCampaigns(gatewayprotocol.v1.CampaignStateOuterClass.Campaign campaign) {
                copyOnWrite();
                ((gatewayprotocol.v1.CampaignStateOuterClass.CampaignState) this.instance).addShownCampaigns(campaign);
                return this;
            }

            public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder addShownCampaigns(int i, gatewayprotocol.v1.CampaignStateOuterClass.Campaign campaign) {
                copyOnWrite();
                ((gatewayprotocol.v1.CampaignStateOuterClass.CampaignState) this.instance).addShownCampaigns(i, campaign);
                return this;
            }

            public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder addShownCampaigns(gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.CampaignStateOuterClass.CampaignState) this.instance).addShownCampaigns(builder.build());
                return this;
            }

            public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder addShownCampaigns(int i, gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.CampaignStateOuterClass.CampaignState) this.instance).addShownCampaigns(i, builder.build());
                return this;
            }

            public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder addAllShownCampaigns(java.lang.Iterable<? extends gatewayprotocol.v1.CampaignStateOuterClass.Campaign> iterable) {
                copyOnWrite();
                ((gatewayprotocol.v1.CampaignStateOuterClass.CampaignState) this.instance).addAllShownCampaigns(iterable);
                return this;
            }

            public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder clearShownCampaigns() {
                copyOnWrite();
                ((gatewayprotocol.v1.CampaignStateOuterClass.CampaignState) this.instance).clearShownCampaigns();
                return this;
            }

            public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder removeShownCampaigns(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.CampaignStateOuterClass.CampaignState) this.instance).removeShownCampaigns(i);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.CampaignStateOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.CampaignStateOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.CampaignStateOuterClass.CampaignState();
                case 2:
                    return new gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new java.lang.Object[]{"loadedCampaigns_", gatewayprotocol.v1.CampaignStateOuterClass.Campaign.class, "shownCampaigns_", gatewayprotocol.v1.CampaignStateOuterClass.Campaign.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.CampaignStateOuterClass.CampaignState> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.class) {
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
            gatewayprotocol.v1.CampaignStateOuterClass.CampaignState campaignState = new gatewayprotocol.v1.CampaignStateOuterClass.CampaignState();
            DEFAULT_INSTANCE = campaignState;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.class, campaignState);
        }

        public static gatewayprotocol.v1.CampaignStateOuterClass.CampaignState getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.CampaignStateOuterClass.CampaignState> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }
}
