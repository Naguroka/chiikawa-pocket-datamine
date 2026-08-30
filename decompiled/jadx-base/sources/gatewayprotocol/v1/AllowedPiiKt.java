package gatewayprotocol.v1;

/* JADX INFO: compiled from: AllowedPiiKt.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/AllowedPiiKt;", "", "()V", "Dsl", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AllowedPiiKt {
    public static final gatewayprotocol.v1.AllowedPiiKt INSTANCE = new gatewayprotocol.v1.AllowedPiiKt();

    /* JADX INFO: compiled from: AllowedPiiKt.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000b¨\u0006\u0015"}, d2 = {"Lgatewayprotocol/v1/AllowedPiiKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/AllowedPiiOuterClass$AllowedPii$Builder;", "(Lgatewayprotocol/v1/AllowedPiiOuterClass$AllowedPii$Builder;)V", "value", "", "idfa", "getIdfa", "()Z", "setIdfa", "(Z)V", "idfv", "getIdfv", "setIdfv", "_build", "Lgatewayprotocol/v1/AllowedPiiOuterClass$AllowedPii;", "clearIdfa", "", "clearIdfv", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final gatewayprotocol.v1.AllowedPiiKt.Dsl.Companion INSTANCE = new gatewayprotocol.v1.AllowedPiiKt.Dsl.Companion(null);
        private final gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii.Builder _builder;

        public /* synthetic */ Dsl(gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii.Builder builder) {
            this._builder = builder;
        }

        /* JADX INFO: compiled from: AllowedPiiKt.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/AllowedPiiKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/AllowedPiiKt$Dsl;", "builder", "Lgatewayprotocol/v1/AllowedPiiOuterClass$AllowedPii$Builder;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ gatewayprotocol.v1.AllowedPiiKt.Dsl _create(gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii.Builder builder) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
                return new gatewayprotocol.v1.AllowedPiiKt.Dsl(builder, null);
            }
        }

        public final /* synthetic */ gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii _build() {
            gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii allowedPiiBuild = this._builder.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(allowedPiiBuild, "_builder.build()");
            return allowedPiiBuild;
        }

        public final boolean getIdfa() {
            return this._builder.getIdfa();
        }

        public final void setIdfa(boolean z) {
            this._builder.setIdfa(z);
        }

        public final void clearIdfa() {
            this._builder.clearIdfa();
        }

        public final boolean getIdfv() {
            return this._builder.getIdfv();
        }

        public final void setIdfv(boolean z) {
            this._builder.setIdfv(z);
        }

        public final void clearIdfv() {
            this._builder.clearIdfv();
        }
    }

    private AllowedPiiKt() {
    }
}
