package gatewayprotocol.v1;

/* JADX INFO: compiled from: HeaderBiddingAdMarkupKt.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/HeaderBiddingAdMarkupKt;", "", "()V", "Dsl", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class HeaderBiddingAdMarkupKt {
    public static final gatewayprotocol.v1.HeaderBiddingAdMarkupKt INSTANCE = new gatewayprotocol.v1.HeaderBiddingAdMarkupKt();

    /* JADX INFO: compiled from: HeaderBiddingAdMarkupKt.kt */
    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0015\u001a\u00020\u0016H\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u001a\u001a\u00020\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000b¨\u0006\u001c"}, d2 = {"Lgatewayprotocol/v1/HeaderBiddingAdMarkupKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup$Builder;", "(Lgatewayprotocol/v1/HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup$Builder;)V", "value", "Lcom/google/protobuf/ByteString;", "adData", "getAdData", "()Lcom/google/protobuf/ByteString;", "setAdData", "(Lcom/google/protobuf/ByteString;)V", "", "adDataVersion", "getAdDataVersion", "()I", "setAdDataVersion", "(I)V", "configurationToken", "getConfigurationToken", "setConfigurationToken", "_build", "Lgatewayprotocol/v1/HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup;", "clearAdData", "", "clearAdDataVersion", "clearConfigurationToken", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final gatewayprotocol.v1.HeaderBiddingAdMarkupKt.Dsl.Companion INSTANCE = new gatewayprotocol.v1.HeaderBiddingAdMarkupKt.Dsl.Companion(null);
        private final gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.Builder _builder;

        public /* synthetic */ Dsl(gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.Builder builder) {
            this._builder = builder;
        }

        /* JADX INFO: compiled from: HeaderBiddingAdMarkupKt.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/HeaderBiddingAdMarkupKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/HeaderBiddingAdMarkupKt$Dsl;", "builder", "Lgatewayprotocol/v1/HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup$Builder;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ gatewayprotocol.v1.HeaderBiddingAdMarkupKt.Dsl _create(gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.Builder builder) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
                return new gatewayprotocol.v1.HeaderBiddingAdMarkupKt.Dsl(builder, null);
            }
        }

        public final /* synthetic */ gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup _build() {
            gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkupBuild = this._builder.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(headerBiddingAdMarkupBuild, "_builder.build()");
            return headerBiddingAdMarkupBuild;
        }

        public final com.google.protobuf.ByteString getAdData() {
            com.google.protobuf.ByteString adData = this._builder.getAdData();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adData, "_builder.getAdData()");
            return adData;
        }

        public final void setAdData(com.google.protobuf.ByteString value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAdData(value);
        }

        public final void clearAdData() {
            this._builder.clearAdData();
        }

        public final int getAdDataVersion() {
            return this._builder.getAdDataVersion();
        }

        public final void setAdDataVersion(int i) {
            this._builder.setAdDataVersion(i);
        }

        public final void clearAdDataVersion() {
            this._builder.clearAdDataVersion();
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
    }

    private HeaderBiddingAdMarkupKt() {
    }
}
