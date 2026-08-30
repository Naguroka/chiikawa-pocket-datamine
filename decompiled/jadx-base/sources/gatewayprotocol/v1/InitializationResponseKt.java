package gatewayprotocol.v1;

/* JADX INFO: compiled from: InitializationResponseKt.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/InitializationResponseKt;", "", "()V", "Dsl", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class InitializationResponseKt {
    public static final gatewayprotocol.v1.InitializationResponseKt INSTANCE = new gatewayprotocol.v1.InitializationResponseKt();

    /* JADX INFO: compiled from: InitializationResponseKt.kt */
    @kotlin.Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u001c\n\u0002\b\f\n\u0002\u0010$\n\u0002\b\u000b\b\u0007\u0018\u0000 W2\u00020\u0001:\u0003WXYB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u00103\u001a\u000204H\u0001J\u0006\u00105\u001a\u000206J\u0006\u00107\u001a\u000206J\u0006\u00108\u001a\u000206J\u0006\u00109\u001a\u000206J\u0006\u0010:\u001a\u000206J\u0006\u0010;\u001a\u00020%J\u0006\u0010<\u001a\u00020%J\u0006\u0010=\u001a\u00020%J%\u0010>\u001a\u000206*\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00192\u0006\u0010\u0005\u001a\u00020\u001aH\u0007¢\u0006\u0002\b?J+\u0010@\u001a\u000206*\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00192\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u001a0BH\u0007¢\u0006\u0002\bCJ\u001d\u0010D\u001a\u000206*\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019H\u0007¢\u0006\u0002\bEJ#\u0010D\u001a\u000206*\u0014\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0\u001fH\u0007¢\u0006\u0002\bFJ&\u0010G\u001a\u000206*\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00192\u0006\u0010\u0005\u001a\u00020\u001aH\u0087\n¢\u0006\u0002\bHJ,\u0010G\u001a\u000206*\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00192\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u001a0BH\u0087\n¢\u0006\u0002\bIJ3\u0010J\u001a\u000206*\u0014\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0\u001f2\u0006\u0010K\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020!H\u0007¢\u0006\u0002\bLJ7\u0010M\u001a\u000206*\u0014\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0\u001f2\u0012\u0010N\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0OH\u0007¢\u0006\u0002\bPJ+\u0010Q\u001a\u000206*\u0014\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0\u001f2\u0006\u0010K\u001a\u00020 H\u0007¢\u0006\u0002\bRJ.\u0010S\u001a\u000206*\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00192\u0006\u0010T\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u001aH\u0087\u0002¢\u0006\u0002\bUJ4\u0010S\u001a\u000206*\u0014\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0\u001f2\u0006\u0010K\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020!H\u0087\n¢\u0006\u0002\bVR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00198F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR#\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0\u001f8G¢\u0006\u0006\u001a\u0004\b#\u0010$R$\u0010&\u001a\u00020%2\u0006\u0010\u0005\u001a\u00020%8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010+\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020 8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0017\u00100\u001a\u0004\u0018\u00010\f*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b1\u00102¨\u0006Z"}, d2 = {"Lgatewayprotocol/v1/InitializationResponseKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/InitializationResponseOuterClass$InitializationResponse$Builder;", "(Lgatewayprotocol/v1/InitializationResponseOuterClass$InitializationResponse$Builder;)V", "value", "", "countOfLastShownCampaigns", "getCountOfLastShownCampaigns", "()I", "setCountOfLastShownCampaigns", "(I)V", "Lgatewayprotocol/v1/ErrorOuterClass$Error;", "error", "getError", "()Lgatewayprotocol/v1/ErrorOuterClass$Error;", "setError", "(Lgatewayprotocol/v1/ErrorOuterClass$Error;)V", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "nativeConfiguration", "getNativeConfiguration", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "setNativeConfiguration", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;)V", "scarEligibleFormats", "Lcom/google/protobuf/kotlin/DslList;", "Lgatewayprotocol/v1/InitializationResponseOuterClass$AdFormat;", "Lgatewayprotocol/v1/InitializationResponseKt$Dsl$ScarEligibleFormatsProxy;", "getScarEligibleFormats", "()Lcom/google/protobuf/kotlin/DslList;", "scarPlacements", "Lcom/google/protobuf/kotlin/DslMap;", "", "Lgatewayprotocol/v1/InitializationResponseOuterClass$Placement;", "Lgatewayprotocol/v1/InitializationResponseKt$Dsl$ScarPlacementsProxy;", "getScarPlacementsMap", "()Lcom/google/protobuf/kotlin/DslMap;", "", "triggerInitializationCompletedRequest", "getTriggerInitializationCompletedRequest", "()Z", "setTriggerInitializationCompletedRequest", "(Z)V", "universalRequestUrl", "getUniversalRequestUrl", "()Ljava/lang/String;", "setUniversalRequestUrl", "(Ljava/lang/String;)V", "errorOrNull", "getErrorOrNull", "(Lgatewayprotocol/v1/InitializationResponseKt$Dsl;)Lgatewayprotocol/v1/ErrorOuterClass$Error;", "_build", "Lgatewayprotocol/v1/InitializationResponseOuterClass$InitializationResponse;", "clearCountOfLastShownCampaigns", "", "clearError", "clearNativeConfiguration", "clearTriggerInitializationCompletedRequest", "clearUniversalRequestUrl", "hasError", "hasNativeConfiguration", "hasUniversalRequestUrl", "add", "addScarEligibleFormats", "addAll", "values", "", "addAllScarEligibleFormats", "clear", "clearScarEligibleFormats", "clearScarPlacements", "plusAssign", "plusAssignScarEligibleFormats", "plusAssignAllScarEligibleFormats", "put", com.ironsource.y8.h.W, "putScarPlacements", "putAll", "map", "", "putAllScarPlacements", "remove", "removeScarPlacements", "set", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "setScarEligibleFormats", "setScarPlacements", "Companion", "ScarEligibleFormatsProxy", "ScarPlacementsProxy", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final gatewayprotocol.v1.InitializationResponseKt.Dsl.Companion INSTANCE = new gatewayprotocol.v1.InitializationResponseKt.Dsl.Companion(null);
        private final gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder _builder;

        public /* synthetic */ Dsl(gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder builder) {
            this._builder = builder;
        }

        /* JADX INFO: compiled from: InitializationResponseKt.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/InitializationResponseKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/InitializationResponseKt$Dsl;", "builder", "Lgatewayprotocol/v1/InitializationResponseOuterClass$InitializationResponse$Builder;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ gatewayprotocol.v1.InitializationResponseKt.Dsl _create(gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder builder) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
                return new gatewayprotocol.v1.InitializationResponseKt.Dsl(builder, null);
            }
        }

        public final /* synthetic */ gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse _build() {
            gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse initializationResponseBuild = this._builder.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(initializationResponseBuild, "_builder.build()");
            return initializationResponseBuild;
        }

        public final gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration getNativeConfiguration() {
            gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration = this._builder.getNativeConfiguration();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(nativeConfiguration, "_builder.getNativeConfiguration()");
            return nativeConfiguration;
        }

        public final void setNativeConfiguration(gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setNativeConfiguration(value);
        }

        public final void clearNativeConfiguration() {
            this._builder.clearNativeConfiguration();
        }

        public final boolean hasNativeConfiguration() {
            return this._builder.hasNativeConfiguration();
        }

        public final java.lang.String getUniversalRequestUrl() {
            java.lang.String universalRequestUrl = this._builder.getUniversalRequestUrl();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(universalRequestUrl, "_builder.getUniversalRequestUrl()");
            return universalRequestUrl;
        }

        public final void setUniversalRequestUrl(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setUniversalRequestUrl(value);
        }

        public final void clearUniversalRequestUrl() {
            this._builder.clearUniversalRequestUrl();
        }

        public final boolean hasUniversalRequestUrl() {
            return this._builder.hasUniversalRequestUrl();
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

        public final gatewayprotocol.v1.ErrorOuterClass.Error getErrorOrNull(gatewayprotocol.v1.InitializationResponseKt.Dsl dsl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dsl, "<this>");
            return gatewayprotocol.v1.InitializationResponseKtKt.getErrorOrNull(dsl._builder);
        }

        public final boolean getTriggerInitializationCompletedRequest() {
            return this._builder.getTriggerInitializationCompletedRequest();
        }

        public final void setTriggerInitializationCompletedRequest(boolean z) {
            this._builder.setTriggerInitializationCompletedRequest(z);
        }

        public final void clearTriggerInitializationCompletedRequest() {
            this._builder.clearTriggerInitializationCompletedRequest();
        }

        public final int getCountOfLastShownCampaigns() {
            return this._builder.getCountOfLastShownCampaigns();
        }

        public final void setCountOfLastShownCampaigns(int i) {
            this._builder.setCountOfLastShownCampaigns(i);
        }

        public final void clearCountOfLastShownCampaigns() {
            this._builder.clearCountOfLastShownCampaigns();
        }

        /* JADX INFO: compiled from: InitializationResponseKt.kt */
        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lgatewayprotocol/v1/InitializationResponseKt$Dsl$ScarPlacementsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ScarPlacementsProxy extends com.google.protobuf.kotlin.DslProxy {
            private ScarPlacementsProxy() {
            }
        }

        public final /* synthetic */ com.google.protobuf.kotlin.DslMap getScarPlacementsMap() {
            java.util.Map<java.lang.String, gatewayprotocol.v1.InitializationResponseOuterClass.Placement> scarPlacementsMap = this._builder.getScarPlacementsMap();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(scarPlacementsMap, "_builder.getScarPlacementsMap()");
            return new com.google.protobuf.kotlin.DslMap(scarPlacementsMap);
        }

        public final void putScarPlacements(com.google.protobuf.kotlin.DslMap<java.lang.String, gatewayprotocol.v1.InitializationResponseOuterClass.Placement, gatewayprotocol.v1.InitializationResponseKt.Dsl.ScarPlacementsProxy> dslMap, java.lang.String key, gatewayprotocol.v1.InitializationResponseOuterClass.Placement value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslMap, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.putScarPlacements(key, value);
        }

        public final /* synthetic */ void setScarPlacements(com.google.protobuf.kotlin.DslMap<java.lang.String, gatewayprotocol.v1.InitializationResponseOuterClass.Placement, gatewayprotocol.v1.InitializationResponseKt.Dsl.ScarPlacementsProxy> dslMap, java.lang.String key, gatewayprotocol.v1.InitializationResponseOuterClass.Placement value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslMap, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            putScarPlacements(dslMap, key, value);
        }

        public final /* synthetic */ void removeScarPlacements(com.google.protobuf.kotlin.DslMap dslMap, java.lang.String key) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslMap, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
            this._builder.removeScarPlacements(key);
        }

        public final /* synthetic */ void putAllScarPlacements(com.google.protobuf.kotlin.DslMap dslMap, java.util.Map map) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslMap, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "map");
            this._builder.putAllScarPlacements(map);
        }

        public final /* synthetic */ void clearScarPlacements(com.google.protobuf.kotlin.DslMap dslMap) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslMap, "<this>");
            this._builder.clearScarPlacements();
        }

        /* JADX INFO: compiled from: InitializationResponseKt.kt */
        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lgatewayprotocol/v1/InitializationResponseKt$Dsl$ScarEligibleFormatsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ScarEligibleFormatsProxy extends com.google.protobuf.kotlin.DslProxy {
            private ScarEligibleFormatsProxy() {
            }
        }

        public final /* synthetic */ com.google.protobuf.kotlin.DslList getScarEligibleFormats() {
            java.util.List<gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat> scarEligibleFormatsList = this._builder.getScarEligibleFormatsList();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(scarEligibleFormatsList, "_builder.getScarEligibleFormatsList()");
            return new com.google.protobuf.kotlin.DslList(scarEligibleFormatsList);
        }

        public final /* synthetic */ void addScarEligibleFormats(com.google.protobuf.kotlin.DslList dslList, gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.addScarEligibleFormats(value);
        }

        public final /* synthetic */ void plusAssignScarEligibleFormats(com.google.protobuf.kotlin.DslList<gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat, gatewayprotocol.v1.InitializationResponseKt.Dsl.ScarEligibleFormatsProxy> dslList, gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            addScarEligibleFormats(dslList, value);
        }

        public final /* synthetic */ void addAllScarEligibleFormats(com.google.protobuf.kotlin.DslList dslList, java.lang.Iterable values) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "values");
            this._builder.addAllScarEligibleFormats(values);
        }

        public final /* synthetic */ void plusAssignAllScarEligibleFormats(com.google.protobuf.kotlin.DslList<gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat, gatewayprotocol.v1.InitializationResponseKt.Dsl.ScarEligibleFormatsProxy> dslList, java.lang.Iterable<? extends gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat> values) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "values");
            addAllScarEligibleFormats(dslList, values);
        }

        public final /* synthetic */ void setScarEligibleFormats(com.google.protobuf.kotlin.DslList dslList, int i, gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setScarEligibleFormats(i, value);
        }

        public final /* synthetic */ void clearScarEligibleFormats(com.google.protobuf.kotlin.DslList dslList) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            this._builder.clearScarEligibleFormats();
        }
    }

    private InitializationResponseKt() {
    }
}
