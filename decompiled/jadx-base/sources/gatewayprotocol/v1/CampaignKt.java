package gatewayprotocol.v1;

/* JADX INFO: compiled from: CampaignKt.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/CampaignKt;", "", "()V", "Dsl", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CampaignKt {
    public static final gatewayprotocol.v1.CampaignKt INSTANCE = new gatewayprotocol.v1.CampaignKt();

    /* JADX INFO: compiled from: CampaignKt.kt */
    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 32\u00020\u0001:\u00013B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010'\u001a\u00020(H\u0001J\u0006\u0010)\u001a\u00020*J\u0006\u0010+\u001a\u00020*J\u0006\u0010,\u001a\u00020*J\u0006\u0010-\u001a\u00020*J\u0006\u0010.\u001a\u00020*J\u0006\u0010/\u001a\u00020*J\u0006\u00100\u001a\u000201J\u0006\u00102\u001a\u000201R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00158G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u001b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010!\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00158G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u0018\"\u0004\b#\u0010\u001aR\u0017\u0010$\u001a\u0004\u0018\u00010\u0015*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u00064"}, d2 = {"Lgatewayprotocol/v1/CampaignKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/CampaignStateOuterClass$Campaign$Builder;", "(Lgatewayprotocol/v1/CampaignStateOuterClass$Campaign$Builder;)V", "value", "Lcom/google/protobuf/ByteString;", "data", "getData", "()Lcom/google/protobuf/ByteString;", "setData", "(Lcom/google/protobuf/ByteString;)V", "", "dataVersion", "getDataVersion", "()I", "setDataVersion", "(I)V", "impressionOpportunityId", "getImpressionOpportunityId", "setImpressionOpportunityId", "Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "loadTimestamp", "getLoadTimestamp", "()Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "setLoadTimestamp", "(Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;)V", "", com.json.y8.j, "getPlacementId", "()Ljava/lang/String;", "setPlacementId", "(Ljava/lang/String;)V", "showTimestamp", "getShowTimestamp", "setShowTimestamp", "showTimestampOrNull", "getShowTimestampOrNull", "(Lgatewayprotocol/v1/CampaignKt$Dsl;)Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "_build", "Lgatewayprotocol/v1/CampaignStateOuterClass$Campaign;", "clearData", "", "clearDataVersion", "clearImpressionOpportunityId", "clearLoadTimestamp", "clearPlacementId", "clearShowTimestamp", "hasLoadTimestamp", "", "hasShowTimestamp", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final gatewayprotocol.v1.CampaignKt.Dsl.Companion INSTANCE = new gatewayprotocol.v1.CampaignKt.Dsl.Companion(null);
        private final gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder _builder;

        public /* synthetic */ Dsl(gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder builder) {
            this._builder = builder;
        }

        /* JADX INFO: compiled from: CampaignKt.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/CampaignKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/CampaignKt$Dsl;", "builder", "Lgatewayprotocol/v1/CampaignStateOuterClass$Campaign$Builder;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ gatewayprotocol.v1.CampaignKt.Dsl _create(gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder builder) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
                return new gatewayprotocol.v1.CampaignKt.Dsl(builder, null);
            }
        }

        public final /* synthetic */ gatewayprotocol.v1.CampaignStateOuterClass.Campaign _build() {
            gatewayprotocol.v1.CampaignStateOuterClass.Campaign campaignBuild = this._builder.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(campaignBuild, "_builder.build()");
            return campaignBuild;
        }

        public final int getDataVersion() {
            return this._builder.getDataVersion();
        }

        public final void setDataVersion(int i) {
            this._builder.setDataVersion(i);
        }

        public final void clearDataVersion() {
            this._builder.clearDataVersion();
        }

        public final com.google.protobuf.ByteString getData() {
            com.google.protobuf.ByteString data = this._builder.getData();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data, "_builder.getData()");
            return data;
        }

        public final void setData(com.google.protobuf.ByteString value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setData(value);
        }

        public final void clearData() {
            this._builder.clearData();
        }

        public final java.lang.String getPlacementId() {
            java.lang.String placementId = this._builder.getPlacementId();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(placementId, "_builder.getPlacementId()");
            return placementId;
        }

        public final void setPlacementId(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setPlacementId(value);
        }

        public final void clearPlacementId() {
            this._builder.clearPlacementId();
        }

        public final com.google.protobuf.ByteString getImpressionOpportunityId() {
            com.google.protobuf.ByteString impressionOpportunityId = this._builder.getImpressionOpportunityId();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(impressionOpportunityId, "_builder.getImpressionOpportunityId()");
            return impressionOpportunityId;
        }

        public final void setImpressionOpportunityId(com.google.protobuf.ByteString value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setImpressionOpportunityId(value);
        }

        public final void clearImpressionOpportunityId() {
            this._builder.clearImpressionOpportunityId();
        }

        public final gatewayprotocol.v1.TimestampsOuterClass.Timestamps getLoadTimestamp() {
            gatewayprotocol.v1.TimestampsOuterClass.Timestamps loadTimestamp = this._builder.getLoadTimestamp();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(loadTimestamp, "_builder.getLoadTimestamp()");
            return loadTimestamp;
        }

        public final void setLoadTimestamp(gatewayprotocol.v1.TimestampsOuterClass.Timestamps value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setLoadTimestamp(value);
        }

        public final void clearLoadTimestamp() {
            this._builder.clearLoadTimestamp();
        }

        public final boolean hasLoadTimestamp() {
            return this._builder.hasLoadTimestamp();
        }

        public final gatewayprotocol.v1.TimestampsOuterClass.Timestamps getShowTimestamp() {
            gatewayprotocol.v1.TimestampsOuterClass.Timestamps showTimestamp = this._builder.getShowTimestamp();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(showTimestamp, "_builder.getShowTimestamp()");
            return showTimestamp;
        }

        public final void setShowTimestamp(gatewayprotocol.v1.TimestampsOuterClass.Timestamps value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setShowTimestamp(value);
        }

        public final void clearShowTimestamp() {
            this._builder.clearShowTimestamp();
        }

        public final boolean hasShowTimestamp() {
            return this._builder.hasShowTimestamp();
        }

        public final gatewayprotocol.v1.TimestampsOuterClass.Timestamps getShowTimestampOrNull(gatewayprotocol.v1.CampaignKt.Dsl dsl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dsl, "<this>");
            return gatewayprotocol.v1.CampaignKtKt.getShowTimestampOrNull(dsl._builder);
        }
    }

    private CampaignKt() {
    }
}
