package gatewayprotocol.v1;

/* JADX INFO: compiled from: AdPlayerConfigRequestKt.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/AdPlayerConfigRequestKt;", "", "()V", "Dsl", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AdPlayerConfigRequestKt {
    public static final gatewayprotocol.v1.AdPlayerConfigRequestKt INSTANCE = new gatewayprotocol.v1.AdPlayerConfigRequestKt();

    /* JADX INFO: compiled from: AdPlayerConfigRequestKt.kt */
    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0001,B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010!\u001a\u00020\"H\u0001J\u0006\u0010#\u001a\u00020$J\u0006\u0010%\u001a\u00020$J\u0006\u0010&\u001a\u00020$J\u0006\u0010'\u001a\u00020$J\u0006\u0010(\u001a\u00020$J\u0006\u0010)\u001a\u00020*J\u0006\u0010+\u001a\u00020*R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00158G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u001b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006-"}, d2 = {"Lgatewayprotocol/v1/AdPlayerConfigRequestKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest$Builder;", "(Lgatewayprotocol/v1/AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest$Builder;)V", "value", "Lgatewayprotocol/v1/InitializationResponseOuterClass$AdFormat;", com.json.mediationsdk.impressionData.ImpressionData.IMPRESSION_DATA_KEY_AD_FORMAT, "getAdFormat", "()Lgatewayprotocol/v1/InitializationResponseOuterClass$AdFormat;", "setAdFormat", "(Lgatewayprotocol/v1/InitializationResponseOuterClass$AdFormat;)V", "Lcom/google/protobuf/ByteString;", "configurationToken", "getConfigurationToken", "()Lcom/google/protobuf/ByteString;", "setConfigurationToken", "(Lcom/google/protobuf/ByteString;)V", "impressionOpportunityId", "getImpressionOpportunityId", "setImpressionOpportunityId", "", com.json.y8.j, "getPlacementId", "()Ljava/lang/String;", "setPlacementId", "(Ljava/lang/String;)V", "", "webviewVersion", "getWebviewVersion", "()I", "setWebviewVersion", "(I)V", "_build", "Lgatewayprotocol/v1/AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest;", "clearAdFormat", "", "clearConfigurationToken", "clearImpressionOpportunityId", "clearPlacementId", "clearWebviewVersion", "hasAdFormat", "", "hasWebviewVersion", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final gatewayprotocol.v1.AdPlayerConfigRequestKt.Dsl.Companion INSTANCE = new gatewayprotocol.v1.AdPlayerConfigRequestKt.Dsl.Companion(null);
        private final gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder _builder;

        public /* synthetic */ Dsl(gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder builder) {
            this._builder = builder;
        }

        /* JADX INFO: compiled from: AdPlayerConfigRequestKt.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/AdPlayerConfigRequestKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/AdPlayerConfigRequestKt$Dsl;", "builder", "Lgatewayprotocol/v1/AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest$Builder;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ gatewayprotocol.v1.AdPlayerConfigRequestKt.Dsl _create(gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder builder) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
                return new gatewayprotocol.v1.AdPlayerConfigRequestKt.Dsl(builder, null);
            }
        }

        public final /* synthetic */ gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest _build() {
            gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest adPlayerConfigRequestBuild = this._builder.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adPlayerConfigRequestBuild, "_builder.build()");
            return adPlayerConfigRequestBuild;
        }

        public final com.google.protobuf.ByteString getConfigurationToken() {
            com.google.protobuf.ByteString configurationToken = this._builder.getConfigurationToken();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(configurationToken, "_builder.getConfigurationToken()");
            return configurationToken;
        }

        public final void setConfigurationToken(com.google.protobuf.ByteString value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setConfigurationToken(value);
        }

        public final void clearConfigurationToken() {
            this._builder.clearConfigurationToken();
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

        public final int getWebviewVersion() {
            return this._builder.getWebviewVersion();
        }

        public final void setWebviewVersion(int i) {
            this._builder.setWebviewVersion(i);
        }

        public final void clearWebviewVersion() {
            this._builder.clearWebviewVersion();
        }

        public final boolean hasWebviewVersion() {
            return this._builder.hasWebviewVersion();
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

        public final gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat getAdFormat() {
            gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat adFormat = this._builder.getAdFormat();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adFormat, "_builder.getAdFormat()");
            return adFormat;
        }

        public final void setAdFormat(gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAdFormat(value);
        }

        public final void clearAdFormat() {
            this._builder.clearAdFormat();
        }

        public final boolean hasAdFormat() {
            return this._builder.hasAdFormat();
        }
    }

    private AdPlayerConfigRequestKt() {
    }
}
