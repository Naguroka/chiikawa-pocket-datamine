package gatewayprotocol.v1;

/* JADX INFO: compiled from: InitializationRequestKt.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/InitializationRequestKt;", "", "()V", "Dsl", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class InitializationRequestKt {
    public static final gatewayprotocol.v1.InitializationRequestKt INSTANCE = new gatewayprotocol.v1.InitializationRequestKt();

    /* JADX INFO: compiled from: InitializationRequestKt.kt */
    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 L2\u00020\u0001:\u0001LB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u00106\u001a\u000207H\u0001J\u0006\u00108\u001a\u000209J\u0006\u0010:\u001a\u000209J\u0006\u0010;\u001a\u000209J\u0006\u0010<\u001a\u000209J\u0006\u0010=\u001a\u000209J\u0006\u0010>\u001a\u000209J\u0006\u0010?\u001a\u000209J\u0006\u0010@\u001a\u000209J\u0006\u0010A\u001a\u000209J\u0006\u0010B\u001a\u000209J\u0006\u0010C\u001a\u000209J\u0006\u0010D\u001a\u00020'J\u0006\u0010E\u001a\u00020'J\u0006\u0010F\u001a\u00020'J\u0006\u0010G\u001a\u00020'J\u0006\u0010H\u001a\u00020'J\u0006\u0010I\u001a\u00020'J\u0006\u0010J\u001a\u00020'J\u0006\u0010K\u001a\u00020'R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR$\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00188G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u001e8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010$\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010\t\"\u0004\b&\u0010\u000bR$\u0010(\u001a\u00020'2\u0006\u0010\u0005\u001a\u00020'8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u0010-\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010\t\"\u0004\b/\u0010\u000bR$\u00100\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b1\u0010\u000f\"\u0004\b2\u0010\u0011R$\u00103\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b4\u0010\u000f\"\u0004\b5\u0010\u0011¨\u0006M"}, d2 = {"Lgatewayprotocol/v1/InitializationRequestKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest$Builder;", "(Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest$Builder;)V", "value", "", "analyticsUserId", "getAnalyticsUserId", "()Ljava/lang/String;", "setAnalyticsUserId", "(Ljava/lang/String;)V", "Lcom/google/protobuf/ByteString;", "auid", "getAuid", "()Lcom/google/protobuf/ByteString;", "setAuid", "(Lcom/google/protobuf/ByteString;)V", "auidString", "getAuidString", "setAuidString", "cache", "getCache", "setCache", "Lgatewayprotocol/v1/ClientInfoOuterClass$ClientInfo;", "clientInfo", "getClientInfo", "()Lgatewayprotocol/v1/ClientInfoOuterClass$ClientInfo;", "setClientInfo", "(Lgatewayprotocol/v1/ClientInfoOuterClass$ClientInfo;)V", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationDeviceInfo;", "deviceInfo", "getDeviceInfo", "()Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationDeviceInfo;", "setDeviceInfo", "(Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationDeviceInfo;)V", "idfi", "getIdfi", "setIdfi", "", "isFirstInit", "getIsFirstInit", "()Z", "setIsFirstInit", "(Z)V", "legacyFlowUserConsent", "getLegacyFlowUserConsent", "setLegacyFlowUserConsent", "privacy", "getPrivacy", "setPrivacy", com.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY, "getSessionId", "setSessionId", "_build", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest;", "clearAnalyticsUserId", "", "clearAuid", "clearAuidString", "clearCache", "clearClientInfo", "clearDeviceInfo", "clearIdfi", "clearIsFirstInit", "clearLegacyFlowUserConsent", "clearPrivacy", "clearSessionId", "hasAnalyticsUserId", "hasAuid", "hasAuidString", "hasCache", "hasClientInfo", "hasDeviceInfo", "hasLegacyFlowUserConsent", "hasPrivacy", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final gatewayprotocol.v1.InitializationRequestKt.Dsl.Companion INSTANCE = new gatewayprotocol.v1.InitializationRequestKt.Dsl.Companion(null);
        private final gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder _builder;

        public /* synthetic */ Dsl(gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder builder) {
            this._builder = builder;
        }

        /* JADX INFO: compiled from: InitializationRequestKt.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/InitializationRequestKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/InitializationRequestKt$Dsl;", "builder", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest$Builder;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ gatewayprotocol.v1.InitializationRequestKt.Dsl _create(gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder builder) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
                return new gatewayprotocol.v1.InitializationRequestKt.Dsl(builder, null);
            }
        }

        public final /* synthetic */ gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest _build() {
            gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest initializationRequestBuild = this._builder.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(initializationRequestBuild, "_builder.build()");
            return initializationRequestBuild;
        }

        public final gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo getClientInfo() {
            gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo clientInfo = this._builder.getClientInfo();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(clientInfo, "_builder.getClientInfo()");
            return clientInfo;
        }

        public final void setClientInfo(gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setClientInfo(value);
        }

        public final void clearClientInfo() {
            this._builder.clearClientInfo();
        }

        public final boolean hasClientInfo() {
            return this._builder.hasClientInfo();
        }

        public final com.google.protobuf.ByteString getPrivacy() {
            com.google.protobuf.ByteString privacy = this._builder.getPrivacy();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(privacy, "_builder.getPrivacy()");
            return privacy;
        }

        public final void setPrivacy(com.google.protobuf.ByteString value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setPrivacy(value);
        }

        public final void clearPrivacy() {
            this._builder.clearPrivacy();
        }

        public final boolean hasPrivacy() {
            return this._builder.hasPrivacy();
        }

        public final java.lang.String getIdfi() {
            java.lang.String idfi = this._builder.getIdfi();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(idfi, "_builder.getIdfi()");
            return idfi;
        }

        public final void setIdfi(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setIdfi(value);
        }

        public final void clearIdfi() {
            this._builder.clearIdfi();
        }

        public final com.google.protobuf.ByteString getSessionId() {
            com.google.protobuf.ByteString sessionId = this._builder.getSessionId();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sessionId, "_builder.getSessionId()");
            return sessionId;
        }

        public final void setSessionId(com.google.protobuf.ByteString value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setSessionId(value);
        }

        public final void clearSessionId() {
            this._builder.clearSessionId();
        }

        public final com.google.protobuf.ByteString getCache() {
            com.google.protobuf.ByteString cache = this._builder.getCache();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cache, "_builder.getCache()");
            return cache;
        }

        public final void setCache(com.google.protobuf.ByteString value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setCache(value);
        }

        public final void clearCache() {
            this._builder.clearCache();
        }

        public final boolean hasCache() {
            return this._builder.hasCache();
        }

        public final java.lang.String getLegacyFlowUserConsent() {
            java.lang.String legacyFlowUserConsent = this._builder.getLegacyFlowUserConsent();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(legacyFlowUserConsent, "_builder.getLegacyFlowUserConsent()");
            return legacyFlowUserConsent;
        }

        public final void setLegacyFlowUserConsent(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setLegacyFlowUserConsent(value);
        }

        public final void clearLegacyFlowUserConsent() {
            this._builder.clearLegacyFlowUserConsent();
        }

        public final boolean hasLegacyFlowUserConsent() {
            return this._builder.hasLegacyFlowUserConsent();
        }

        public final com.google.protobuf.ByteString getAuid() {
            com.google.protobuf.ByteString auid = this._builder.getAuid();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(auid, "_builder.getAuid()");
            return auid;
        }

        public final void setAuid(com.google.protobuf.ByteString value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAuid(value);
        }

        public final void clearAuid() {
            this._builder.clearAuid();
        }

        public final boolean hasAuid() {
            return this._builder.hasAuid();
        }

        public final java.lang.String getAnalyticsUserId() {
            java.lang.String analyticsUserId = this._builder.getAnalyticsUserId();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(analyticsUserId, "_builder.getAnalyticsUserId()");
            return analyticsUserId;
        }

        public final void setAnalyticsUserId(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAnalyticsUserId(value);
        }

        public final void clearAnalyticsUserId() {
            this._builder.clearAnalyticsUserId();
        }

        public final boolean hasAnalyticsUserId() {
            return this._builder.hasAnalyticsUserId();
        }

        public final gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo getDeviceInfo() {
            gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo deviceInfo = this._builder.getDeviceInfo();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(deviceInfo, "_builder.getDeviceInfo()");
            return deviceInfo;
        }

        public final void setDeviceInfo(gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setDeviceInfo(value);
        }

        public final void clearDeviceInfo() {
            this._builder.clearDeviceInfo();
        }

        public final boolean hasDeviceInfo() {
            return this._builder.hasDeviceInfo();
        }

        public final boolean getIsFirstInit() {
            return this._builder.getIsFirstInit();
        }

        public final void setIsFirstInit(boolean z) {
            this._builder.setIsFirstInit(z);
        }

        public final void clearIsFirstInit() {
            this._builder.clearIsFirstInit();
        }

        public final java.lang.String getAuidString() {
            java.lang.String auidString = this._builder.getAuidString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(auidString, "_builder.getAuidString()");
            return auidString;
        }

        public final void setAuidString(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAuidString(value);
        }

        public final void clearAuidString() {
            this._builder.clearAuidString();
        }

        public final boolean hasAuidString() {
            return this._builder.hasAuidString();
        }
    }

    private InitializationRequestKt() {
    }
}
