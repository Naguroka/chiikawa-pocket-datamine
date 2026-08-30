package gatewayprotocol.v1;

/* JADX INFO: compiled from: AdResponseKt.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/AdResponseKt;", "", "()V", "Dsl", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AdResponseKt {
    public static final gatewayprotocol.v1.AdResponseKt INSTANCE = new gatewayprotocol.v1.AdResponseKt();

    /* JADX INFO: compiled from: AdResponseKt.kt */
    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 >2\u00020\u0001:\u0001>B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u00100\u001a\u000201H\u0001J\u0006\u00102\u001a\u000203J\u0006\u00104\u001a\u000203J\u0006\u00105\u001a\u000203J\u0006\u00106\u001a\u000203J\u0006\u00107\u001a\u000203J\u0006\u00108\u001a\u000203J\u0006\u00109\u001a\u000203J\u0006\u0010:\u001a\u000203J\u0006\u0010;\u001a\u00020<J\u0006\u0010=\u001a\u00020<R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00158G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\t\"\u0004\b\u001d\u0010\u000bR$\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R$\u0010!\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010\t\"\u0004\b#\u0010\u000bR$\u0010%\u001a\u00020$2\u0006\u0010\u0005\u001a\u00020$8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0017\u0010*\u001a\u0004\u0018\u00010\u0015*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0017\u0010-\u001a\u0004\u0018\u00010$*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u0006?"}, d2 = {"Lgatewayprotocol/v1/AdResponseKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse$Builder;", "(Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse$Builder;)V", "value", "Lcom/google/protobuf/ByteString;", "adData", "getAdData", "()Lcom/google/protobuf/ByteString;", "setAdData", "(Lcom/google/protobuf/ByteString;)V", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_AD_DATA_REFRESH_TOKEN, "getAdDataRefreshToken", "setAdDataRefreshToken", "", "adDataVersion", "getAdDataVersion", "()I", "setAdDataVersion", "(I)V", "Lgatewayprotocol/v1/ErrorOuterClass$Error;", "error", "getError", "()Lgatewayprotocol/v1/ErrorOuterClass$Error;", "setError", "(Lgatewayprotocol/v1/ErrorOuterClass$Error;)V", "impressionConfiguration", "getImpressionConfiguration", "setImpressionConfiguration", "impressionConfigurationVersion", "getImpressionConfigurationVersion", "setImpressionConfigurationVersion", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN, "getTrackingToken", "setTrackingToken", "Lgatewayprotocol/v1/WebviewConfiguration$WebViewConfiguration;", "webviewConfiguration", "getWebviewConfiguration", "()Lgatewayprotocol/v1/WebviewConfiguration$WebViewConfiguration;", "setWebviewConfiguration", "(Lgatewayprotocol/v1/WebviewConfiguration$WebViewConfiguration;)V", "errorOrNull", "getErrorOrNull", "(Lgatewayprotocol/v1/AdResponseKt$Dsl;)Lgatewayprotocol/v1/ErrorOuterClass$Error;", "webviewConfigurationOrNull", "getWebviewConfigurationOrNull", "(Lgatewayprotocol/v1/AdResponseKt$Dsl;)Lgatewayprotocol/v1/WebviewConfiguration$WebViewConfiguration;", "_build", "Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;", "clearAdData", "", "clearAdDataRefreshToken", "clearAdDataVersion", "clearError", "clearImpressionConfiguration", "clearImpressionConfigurationVersion", "clearTrackingToken", "clearWebviewConfiguration", "hasError", "", "hasWebviewConfiguration", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final gatewayprotocol.v1.AdResponseKt.Dsl.Companion INSTANCE = new gatewayprotocol.v1.AdResponseKt.Dsl.Companion(null);
        private final gatewayprotocol.v1.AdResponseOuterClass.AdResponse.Builder _builder;

        public /* synthetic */ Dsl(gatewayprotocol.v1.AdResponseOuterClass.AdResponse.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(gatewayprotocol.v1.AdResponseOuterClass.AdResponse.Builder builder) {
            this._builder = builder;
        }

        /* JADX INFO: compiled from: AdResponseKt.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/AdResponseKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/AdResponseKt$Dsl;", "builder", "Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse$Builder;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ gatewayprotocol.v1.AdResponseKt.Dsl _create(gatewayprotocol.v1.AdResponseOuterClass.AdResponse.Builder builder) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
                return new gatewayprotocol.v1.AdResponseKt.Dsl(builder, null);
            }
        }

        public final /* synthetic */ gatewayprotocol.v1.AdResponseOuterClass.AdResponse _build() {
            gatewayprotocol.v1.AdResponseOuterClass.AdResponse adResponseBuild = this._builder.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adResponseBuild, "_builder.build()");
            return adResponseBuild;
        }

        public final com.google.protobuf.ByteString getTrackingToken() {
            com.google.protobuf.ByteString trackingToken = this._builder.getTrackingToken();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(trackingToken, "_builder.getTrackingToken()");
            return trackingToken;
        }

        public final void setTrackingToken(com.google.protobuf.ByteString value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setTrackingToken(value);
        }

        public final void clearTrackingToken() {
            this._builder.clearTrackingToken();
        }

        public final com.google.protobuf.ByteString getImpressionConfiguration() {
            com.google.protobuf.ByteString impressionConfiguration = this._builder.getImpressionConfiguration();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(impressionConfiguration, "_builder.getImpressionConfiguration()");
            return impressionConfiguration;
        }

        public final void setImpressionConfiguration(com.google.protobuf.ByteString value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setImpressionConfiguration(value);
        }

        public final void clearImpressionConfiguration() {
            this._builder.clearImpressionConfiguration();
        }

        public final int getImpressionConfigurationVersion() {
            return this._builder.getImpressionConfigurationVersion();
        }

        public final void setImpressionConfigurationVersion(int i) {
            this._builder.setImpressionConfigurationVersion(i);
        }

        public final void clearImpressionConfigurationVersion() {
            this._builder.clearImpressionConfigurationVersion();
        }

        public final gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration getWebviewConfiguration() {
            gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration webviewConfiguration = this._builder.getWebviewConfiguration();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(webviewConfiguration, "_builder.getWebviewConfiguration()");
            return webviewConfiguration;
        }

        public final void setWebviewConfiguration(gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setWebviewConfiguration(value);
        }

        public final void clearWebviewConfiguration() {
            this._builder.clearWebviewConfiguration();
        }

        public final boolean hasWebviewConfiguration() {
            return this._builder.hasWebviewConfiguration();
        }

        public final gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration getWebviewConfigurationOrNull(gatewayprotocol.v1.AdResponseKt.Dsl dsl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dsl, "<this>");
            return gatewayprotocol.v1.AdResponseKtKt.getWebviewConfigurationOrNull(dsl._builder);
        }

        public final com.google.protobuf.ByteString getAdDataRefreshToken() {
            com.google.protobuf.ByteString adDataRefreshToken = this._builder.getAdDataRefreshToken();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adDataRefreshToken, "_builder.getAdDataRefreshToken()");
            return adDataRefreshToken;
        }

        public final void setAdDataRefreshToken(com.google.protobuf.ByteString value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAdDataRefreshToken(value);
        }

        public final void clearAdDataRefreshToken() {
            this._builder.clearAdDataRefreshToken();
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

        public final gatewayprotocol.v1.ErrorOuterClass.Error getError() {
            gatewayprotocol.v1.ErrorOuterClass.Error error = this._builder.getError();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(error, "_builder.getError()");
            return error;
        }

        public final void setError(gatewayprotocol.v1.ErrorOuterClass.Error value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setError(value);
        }

        public final void clearError() {
            this._builder.clearError();
        }

        public final boolean hasError() {
            return this._builder.hasError();
        }

        public final gatewayprotocol.v1.ErrorOuterClass.Error getErrorOrNull(gatewayprotocol.v1.AdResponseKt.Dsl dsl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dsl, "<this>");
            return gatewayprotocol.v1.AdResponseKtKt.getErrorOrNull(dsl._builder);
        }
    }

    private AdResponseKt() {
    }
}
