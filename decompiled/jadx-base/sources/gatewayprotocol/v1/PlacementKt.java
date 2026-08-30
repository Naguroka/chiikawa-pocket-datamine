package gatewayprotocol.v1;

/* JADX INFO: compiled from: PlacementKt.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/PlacementKt;", "", "()V", "Dsl", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PlacementKt {
    public static final gatewayprotocol.v1.PlacementKt INSTANCE = new gatewayprotocol.v1.PlacementKt();

    /* JADX INFO: compiled from: PlacementKt.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\rH\u0001J\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lgatewayprotocol/v1/PlacementKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/InitializationResponseOuterClass$Placement$Builder;", "(Lgatewayprotocol/v1/InitializationResponseOuterClass$Placement$Builder;)V", "value", "Lgatewayprotocol/v1/InitializationResponseOuterClass$AdFormat;", com.json.mediationsdk.impressionData.ImpressionData.IMPRESSION_DATA_KEY_AD_FORMAT, "getAdFormat", "()Lgatewayprotocol/v1/InitializationResponseOuterClass$AdFormat;", "setAdFormat", "(Lgatewayprotocol/v1/InitializationResponseOuterClass$AdFormat;)V", "_build", "Lgatewayprotocol/v1/InitializationResponseOuterClass$Placement;", "clearAdFormat", "", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final gatewayprotocol.v1.PlacementKt.Dsl.Companion INSTANCE = new gatewayprotocol.v1.PlacementKt.Dsl.Companion(null);
        private final gatewayprotocol.v1.InitializationResponseOuterClass.Placement.Builder _builder;

        public /* synthetic */ Dsl(gatewayprotocol.v1.InitializationResponseOuterClass.Placement.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(gatewayprotocol.v1.InitializationResponseOuterClass.Placement.Builder builder) {
            this._builder = builder;
        }

        /* JADX INFO: compiled from: PlacementKt.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/PlacementKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/PlacementKt$Dsl;", "builder", "Lgatewayprotocol/v1/InitializationResponseOuterClass$Placement$Builder;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ gatewayprotocol.v1.PlacementKt.Dsl _create(gatewayprotocol.v1.InitializationResponseOuterClass.Placement.Builder builder) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
                return new gatewayprotocol.v1.PlacementKt.Dsl(builder, null);
            }
        }

        public final /* synthetic */ gatewayprotocol.v1.InitializationResponseOuterClass.Placement _build() {
            gatewayprotocol.v1.InitializationResponseOuterClass.Placement placementBuild = this._builder.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(placementBuild, "_builder.build()");
            return placementBuild;
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
    }

    private PlacementKt() {
    }
}
