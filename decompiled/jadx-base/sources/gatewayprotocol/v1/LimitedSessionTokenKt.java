package gatewayprotocol.v1;

/* JADX INFO: compiled from: LimitedSessionTokenKt.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/LimitedSessionTokenKt;", "", "()V", "Dsl", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LimitedSessionTokenKt {
    public static final gatewayprotocol.v1.LimitedSessionTokenKt INSTANCE = new gatewayprotocol.v1.LimitedSessionTokenKt();

    /* JADX INFO: compiled from: LimitedSessionTokenKt.kt */
    @kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 L2\u00020\u0001:\u0001LB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u00109\u001a\u00020:H\u0001J\u0006\u0010;\u001a\u00020<J\u0006\u0010=\u001a\u00020<J\u0006\u0010>\u001a\u00020<J\u0006\u0010?\u001a\u00020<J\u0006\u0010@\u001a\u00020<J\u0006\u0010A\u001a\u00020<J\u0006\u0010B\u001a\u00020<J\u0006\u0010C\u001a\u00020<J\u0006\u0010D\u001a\u00020<J\u0006\u0010E\u001a\u00020<J\u0006\u0010F\u001a\u00020<J\u0006\u0010G\u001a\u00020<J\u0006\u0010H\u001a\u00020IJ\u0006\u0010J\u001a\u00020IJ\u0006\u0010K\u001a\u00020IR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR$\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000bR$\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR$\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000bR$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00188G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\t\"\u0004\b \u0010\u000bR$\u0010!\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010\t\"\u0004\b#\u0010\u000bR$\u0010%\u001a\u00020$2\u0006\u0010\u0005\u001a\u00020$8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010+\u001a\u00020*2\u0006\u0010\u0005\u001a\u00020*8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u00100\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b1\u0010\t\"\u0004\b2\u0010\u000bR$\u00104\u001a\u0002032\u0006\u0010\u0005\u001a\u0002038G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108¨\u0006M"}, d2 = {"Lgatewayprotocol/v1/LimitedSessionTokenKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken$Builder;", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken$Builder;)V", "value", "", "customMediationName", "getCustomMediationName", "()Ljava/lang/String;", "setCustomMediationName", "(Ljava/lang/String;)V", "deviceMake", "getDeviceMake", "setDeviceMake", com.ironsource.y8.i.l, "getDeviceModel", "setDeviceModel", com.unity3d.ads.core.domain.AndroidGetAdPlayerContext.KEY_GAME_ID, "getGameId", "setGameId", "idfi", "getIdfi", "setIdfi", "Lgatewayprotocol/v1/ClientInfoOuterClass$MediationProvider;", "mediationProvider", "getMediationProvider", "()Lgatewayprotocol/v1/ClientInfoOuterClass$MediationProvider;", "setMediationProvider", "(Lgatewayprotocol/v1/ClientInfoOuterClass$MediationProvider;)V", "mediationVersion", "getMediationVersion", "setMediationVersion", "osVersion", "getOsVersion", "setOsVersion", "Lgatewayprotocol/v1/ClientInfoOuterClass$Platform;", com.json.ce.A, "getPlatform", "()Lgatewayprotocol/v1/ClientInfoOuterClass$Platform;", "setPlatform", "(Lgatewayprotocol/v1/ClientInfoOuterClass$Platform;)V", "", "sdkVersion", "getSdkVersion", "()I", "setSdkVersion", "(I)V", "sdkVersionName", "getSdkVersionName", "setSdkVersionName", "Lcom/google/protobuf/ByteString;", com.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY, "getSessionId", "()Lcom/google/protobuf/ByteString;", "setSessionId", "(Lcom/google/protobuf/ByteString;)V", "_build", "Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken;", "clearCustomMediationName", "", "clearDeviceMake", "clearDeviceModel", "clearGameId", "clearIdfi", "clearMediationProvider", "clearMediationVersion", "clearOsVersion", "clearPlatform", "clearSdkVersion", "clearSdkVersionName", "clearSessionId", "hasCustomMediationName", "", "hasMediationVersion", "hasSessionId", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final gatewayprotocol.v1.LimitedSessionTokenKt.Dsl.Companion INSTANCE = new gatewayprotocol.v1.LimitedSessionTokenKt.Dsl.Companion(null);
        private final gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.Builder _builder;

        public /* synthetic */ Dsl(gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.Builder builder) {
            this._builder = builder;
        }

        /* JADX INFO: compiled from: LimitedSessionTokenKt.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/LimitedSessionTokenKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/LimitedSessionTokenKt$Dsl;", "builder", "Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken$Builder;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ gatewayprotocol.v1.LimitedSessionTokenKt.Dsl _create(gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.Builder builder) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
                return new gatewayprotocol.v1.LimitedSessionTokenKt.Dsl(builder, null);
            }
        }

        public final /* synthetic */ gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken _build() {
            gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken limitedSessionTokenBuild = this._builder.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(limitedSessionTokenBuild, "_builder.build()");
            return limitedSessionTokenBuild;
        }

        public final java.lang.String getDeviceMake() {
            java.lang.String deviceMake = this._builder.getDeviceMake();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(deviceMake, "_builder.getDeviceMake()");
            return deviceMake;
        }

        public final void setDeviceMake(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setDeviceMake(value);
        }

        public final void clearDeviceMake() {
            this._builder.clearDeviceMake();
        }

        public final java.lang.String getDeviceModel() {
            java.lang.String deviceModel = this._builder.getDeviceModel();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(deviceModel, "_builder.getDeviceModel()");
            return deviceModel;
        }

        public final void setDeviceModel(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setDeviceModel(value);
        }

        public final void clearDeviceModel() {
            this._builder.clearDeviceModel();
        }

        public final java.lang.String getOsVersion() {
            java.lang.String osVersion = this._builder.getOsVersion();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(osVersion, "_builder.getOsVersion()");
            return osVersion;
        }

        public final void setOsVersion(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setOsVersion(value);
        }

        public final void clearOsVersion() {
            this._builder.clearOsVersion();
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

        public final int getSdkVersion() {
            return this._builder.getSdkVersion();
        }

        public final void setSdkVersion(int i) {
            this._builder.setSdkVersion(i);
        }

        public final void clearSdkVersion() {
            this._builder.clearSdkVersion();
        }

        public final java.lang.String getSdkVersionName() {
            java.lang.String sdkVersionName = this._builder.getSdkVersionName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sdkVersionName, "_builder.getSdkVersionName()");
            return sdkVersionName;
        }

        public final void setSdkVersionName(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setSdkVersionName(value);
        }

        public final void clearSdkVersionName() {
            this._builder.clearSdkVersionName();
        }

        public final java.lang.String getGameId() {
            java.lang.String gameId = this._builder.getGameId();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(gameId, "_builder.getGameId()");
            return gameId;
        }

        public final void setGameId(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setGameId(value);
        }

        public final void clearGameId() {
            this._builder.clearGameId();
        }

        public final gatewayprotocol.v1.ClientInfoOuterClass.Platform getPlatform() {
            gatewayprotocol.v1.ClientInfoOuterClass.Platform platform = this._builder.getPlatform();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(platform, "_builder.getPlatform()");
            return platform;
        }

        public final void setPlatform(gatewayprotocol.v1.ClientInfoOuterClass.Platform value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setPlatform(value);
        }

        public final void clearPlatform() {
            this._builder.clearPlatform();
        }

        public final gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider getMediationProvider() {
            gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider mediationProvider = this._builder.getMediationProvider();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mediationProvider, "_builder.getMediationProvider()");
            return mediationProvider;
        }

        public final void setMediationProvider(gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setMediationProvider(value);
        }

        public final void clearMediationProvider() {
            this._builder.clearMediationProvider();
        }

        public final java.lang.String getCustomMediationName() {
            java.lang.String customMediationName = this._builder.getCustomMediationName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(customMediationName, "_builder.getCustomMediationName()");
            return customMediationName;
        }

        public final void setCustomMediationName(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setCustomMediationName(value);
        }

        public final void clearCustomMediationName() {
            this._builder.clearCustomMediationName();
        }

        public final boolean hasCustomMediationName() {
            return this._builder.hasCustomMediationName();
        }

        public final java.lang.String getMediationVersion() {
            java.lang.String mediationVersion = this._builder.getMediationVersion();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mediationVersion, "_builder.getMediationVersion()");
            return mediationVersion;
        }

        public final void setMediationVersion(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setMediationVersion(value);
        }

        public final void clearMediationVersion() {
            this._builder.clearMediationVersion();
        }

        public final boolean hasMediationVersion() {
            return this._builder.hasMediationVersion();
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

        public final boolean hasSessionId() {
            return this._builder.hasSessionId();
        }
    }

    private LimitedSessionTokenKt() {
    }
}
