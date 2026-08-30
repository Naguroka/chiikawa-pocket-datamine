package gatewayprotocol.v1;

/* JADX INFO: compiled from: DynamicDeviceInfoKt.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u000f\u0010\u0011B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0087\bø\u0001\u0000¢\u0006\u0002\b\nJ*\u0010\u000b\u001a\u00020\f2\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0087\bø\u0001\u0000¢\u0006\u0002\b\u000e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, d2 = {"Lgatewayprotocol/v1/DynamicDeviceInfoKt;", "", "()V", "android", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android;", "block", "Lkotlin/Function1;", "Lgatewayprotocol/v1/DynamicDeviceInfoKt$AndroidKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializeandroid", "ios", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios;", "Lgatewayprotocol/v1/DynamicDeviceInfoKt$IosKt$Dsl;", "-initializeios", "AndroidKt", "Dsl", "IosKt", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DynamicDeviceInfoKt {
    public static final gatewayprotocol.v1.DynamicDeviceInfoKt INSTANCE = new gatewayprotocol.v1.DynamicDeviceInfoKt();

    /* JADX INFO: compiled from: DynamicDeviceInfoKt.kt */
    @kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b*\b\u0007\u0018\u0000 \u008a\u00012\u00020\u0001:\u0002\u008a\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010^\u001a\u00020_H\u0001J\u0006\u0010`\u001a\u00020aJ\u0006\u0010b\u001a\u00020aJ\u0006\u0010c\u001a\u00020aJ\u0006\u0010d\u001a\u00020aJ\u0006\u0010e\u001a\u00020aJ\u0006\u0010f\u001a\u00020aJ\u0006\u0010g\u001a\u00020aJ\u0006\u0010h\u001a\u00020aJ\u0006\u0010i\u001a\u00020aJ\u0006\u0010j\u001a\u00020aJ\u0006\u0010k\u001a\u00020aJ\u0006\u0010l\u001a\u00020aJ\u0006\u0010m\u001a\u00020aJ\u0006\u0010n\u001a\u00020aJ\u0006\u0010o\u001a\u00020aJ\u0006\u0010p\u001a\u00020aJ\u0006\u0010q\u001a\u00020aJ\u0006\u0010r\u001a\u00020aJ\u0006\u0010s\u001a\u00020aJ\u0006\u0010t\u001a\u00020aJ\u0006\u0010u\u001a\u00020aJ\u0006\u0010v\u001a\u00020\fJ\u0006\u0010w\u001a\u00020\fJ\u0006\u0010x\u001a\u00020\fJ\u0006\u0010y\u001a\u00020\fJ\u0006\u0010z\u001a\u00020\fJ\u0006\u0010{\u001a\u00020\fJ\u0006\u0010|\u001a\u00020\fJ\u0006\u0010}\u001a\u00020\fJ\u0006\u0010~\u001a\u00020\fJ\u0006\u0010\u007f\u001a\u00020\fJ\u0007\u0010\u0080\u0001\u001a\u00020\fJ\u0007\u0010\u0081\u0001\u001a\u00020\fJ\u0007\u0010\u0082\u0001\u001a\u00020\fJ\u0007\u0010\u0083\u0001\u001a\u00020\fJ\u0007\u0010\u0084\u0001\u001a\u00020\fJ\u0007\u0010\u0085\u0001\u001a\u00020\fJ\u0007\u0010\u0086\u0001\u001a\u00020\fJ\u0007\u0010\u0087\u0001\u001a\u00020\fJ\u0007\u0010\u0088\u0001\u001a\u00020\fJ\u0007\u0010\u0089\u0001\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00188G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u001e8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010%\u001a\u00020$2\u0006\u0010\u0005\u001a\u00020$8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010*\u001a\u00020$2\u0006\u0010\u0005\u001a\u00020$8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010'\"\u0004\b,\u0010)R$\u0010.\u001a\u00020-2\u0006\u0010\u0005\u001a\u00020-8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u00104\u001a\u0002032\u0006\u0010\u0005\u001a\u0002038G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u00109\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b:\u0010\u000f\"\u0004\b;\u0010\u0011R$\u0010<\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u0010\u000f\"\u0004\b>\u0010\u0011R$\u0010?\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b@\u0010\u000f\"\u0004\bA\u0010\u0011R$\u0010B\u001a\u0002032\u0006\u0010\u0005\u001a\u0002038G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bC\u00106\"\u0004\bD\u00108R$\u0010E\u001a\u0002032\u0006\u0010\u0005\u001a\u0002038G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bF\u00106\"\u0004\bG\u00108R\u0011\u0010H\u001a\u00020I8G¢\u0006\u0006\u001a\u0004\bJ\u0010KR$\u0010L\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00188G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bM\u0010\u001b\"\u0004\bN\u0010\u001dR$\u0010O\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00188G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bP\u0010\u001b\"\u0004\bQ\u0010\u001dR$\u0010R\u001a\u0002032\u0006\u0010\u0005\u001a\u0002038G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bS\u00106\"\u0004\bT\u00108R$\u0010U\u001a\u00020$2\u0006\u0010\u0005\u001a\u00020$8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bV\u0010'\"\u0004\bW\u0010)R$\u0010X\u001a\u0002032\u0006\u0010\u0005\u001a\u0002038G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bY\u00106\"\u0004\bZ\u00108R$\u0010[\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\\\u0010\u000f\"\u0004\b]\u0010\u0011¨\u0006\u008b\u0001"}, d2 = {"Lgatewayprotocol/v1/DynamicDeviceInfoKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder;", "(Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder;)V", "value", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android;", "android", "getAndroid", "()Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android;", "setAndroid", "(Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android;)V", "", "appActive", "getAppActive", "()Z", "setAppActive", "(Z)V", "", com.ironsource.y8.i.Y, "getBatteryLevel", "()D", "setBatteryLevel", "(D)V", "", "batteryStatus", "getBatteryStatus", "()I", "setBatteryStatus", "(I)V", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$ConnectionType;", com.ironsource.y8.i.t, "getConnectionType", "()Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$ConnectionType;", "setConnectionType", "(Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$ConnectionType;)V", "", "freeDiskSpace", "getFreeDiskSpace", "()J", "setFreeDiskSpace", "(J)V", "freeRamMemory", "getFreeRamMemory", "setFreeRamMemory", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios;", "ios", "getIos", "()Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios;", "setIos", "(Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios;)V", "", "language", "getLanguage", "()Ljava/lang/String;", "setLanguage", "(Ljava/lang/String;)V", "limitedOpenAdTracking", "getLimitedOpenAdTracking", "setLimitedOpenAdTracking", "limitedTracking", "getLimitedTracking", "setLimitedTracking", "lowPowerMode", "getLowPowerMode", "setLowPowerMode", "networkOperator", "getNetworkOperator", "setNetworkOperator", "networkOperatorName", "getNetworkOperatorName", "setNetworkOperatorName", "platformSpecificCase", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$PlatformSpecificCase;", "getPlatformSpecificCase", "()Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$PlatformSpecificCase;", "screenHeight", "getScreenHeight", "setScreenHeight", "screenWidth", "getScreenWidth", "setScreenWidth", "timeZone", "getTimeZone", "setTimeZone", "timeZoneOffset", "getTimeZoneOffset", "setTimeZoneOffset", "userId", "getUserId", "setUserId", "wiredHeadset", "getWiredHeadset", "setWiredHeadset", "_build", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "clearAndroid", "", "clearAppActive", "clearBatteryLevel", "clearBatteryStatus", "clearConnectionType", "clearFreeDiskSpace", "clearFreeRamMemory", "clearIos", "clearLanguage", "clearLimitedOpenAdTracking", "clearLimitedTracking", "clearLowPowerMode", "clearNetworkOperator", "clearNetworkOperatorName", "clearPlatformSpecific", "clearScreenHeight", "clearScreenWidth", "clearTimeZone", "clearTimeZoneOffset", "clearUserId", "clearWiredHeadset", "hasAndroid", "hasAppActive", "hasBatteryLevel", "hasBatteryStatus", "hasConnectionType", "hasFreeDiskSpace", "hasFreeRamMemory", "hasIos", "hasLanguage", "hasLimitedOpenAdTracking", "hasLimitedTracking", "hasLowPowerMode", "hasNetworkOperator", "hasNetworkOperatorName", "hasScreenHeight", "hasScreenWidth", "hasTimeZone", "hasTimeZoneOffset", "hasUserId", "hasWiredHeadset", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.Companion INSTANCE = new gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.Companion(null);
        private final gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder _builder;

        public /* synthetic */ Dsl(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builder) {
            this._builder = builder;
        }

        /* JADX INFO: compiled from: DynamicDeviceInfoKt.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/DynamicDeviceInfoKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/DynamicDeviceInfoKt$Dsl;", "builder", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl _create(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builder) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
                return new gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl(builder, null);
            }
        }

        public final /* synthetic */ gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo _build() {
            gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfoBuild = this._builder.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dynamicDeviceInfoBuild, "_builder.build()");
            return dynamicDeviceInfoBuild;
        }

        public final java.lang.String getLanguage() {
            java.lang.String language = this._builder.getLanguage();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(language, "_builder.getLanguage()");
            return language;
        }

        public final void setLanguage(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setLanguage(value);
        }

        public final void clearLanguage() {
            this._builder.clearLanguage();
        }

        public final boolean hasLanguage() {
            return this._builder.hasLanguage();
        }

        public final java.lang.String getNetworkOperator() {
            java.lang.String networkOperator = this._builder.getNetworkOperator();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(networkOperator, "_builder.getNetworkOperator()");
            return networkOperator;
        }

        public final void setNetworkOperator(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setNetworkOperator(value);
        }

        public final void clearNetworkOperator() {
            this._builder.clearNetworkOperator();
        }

        public final boolean hasNetworkOperator() {
            return this._builder.hasNetworkOperator();
        }

        public final java.lang.String getNetworkOperatorName() {
            java.lang.String networkOperatorName = this._builder.getNetworkOperatorName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(networkOperatorName, "_builder.getNetworkOperatorName()");
            return networkOperatorName;
        }

        public final void setNetworkOperatorName(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setNetworkOperatorName(value);
        }

        public final void clearNetworkOperatorName() {
            this._builder.clearNetworkOperatorName();
        }

        public final boolean hasNetworkOperatorName() {
            return this._builder.hasNetworkOperatorName();
        }

        public final long getFreeDiskSpace() {
            return this._builder.getFreeDiskSpace();
        }

        public final void setFreeDiskSpace(long j) {
            this._builder.setFreeDiskSpace(j);
        }

        public final void clearFreeDiskSpace() {
            this._builder.clearFreeDiskSpace();
        }

        public final boolean hasFreeDiskSpace() {
            return this._builder.hasFreeDiskSpace();
        }

        public final long getFreeRamMemory() {
            return this._builder.getFreeRamMemory();
        }

        public final void setFreeRamMemory(long j) {
            this._builder.setFreeRamMemory(j);
        }

        public final void clearFreeRamMemory() {
            this._builder.clearFreeRamMemory();
        }

        public final boolean hasFreeRamMemory() {
            return this._builder.hasFreeRamMemory();
        }

        public final boolean getWiredHeadset() {
            return this._builder.getWiredHeadset();
        }

        public final void setWiredHeadset(boolean z) {
            this._builder.setWiredHeadset(z);
        }

        public final void clearWiredHeadset() {
            this._builder.clearWiredHeadset();
        }

        public final boolean hasWiredHeadset() {
            return this._builder.hasWiredHeadset();
        }

        public final java.lang.String getTimeZone() {
            java.lang.String timeZone = this._builder.getTimeZone();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(timeZone, "_builder.getTimeZone()");
            return timeZone;
        }

        public final void setTimeZone(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setTimeZone(value);
        }

        public final void clearTimeZone() {
            this._builder.clearTimeZone();
        }

        public final boolean hasTimeZone() {
            return this._builder.hasTimeZone();
        }

        public final long getTimeZoneOffset() {
            return this._builder.getTimeZoneOffset();
        }

        public final void setTimeZoneOffset(long j) {
            this._builder.setTimeZoneOffset(j);
        }

        public final void clearTimeZoneOffset() {
            this._builder.clearTimeZoneOffset();
        }

        public final boolean hasTimeZoneOffset() {
            return this._builder.hasTimeZoneOffset();
        }

        public final boolean getLimitedTracking() {
            return this._builder.getLimitedTracking();
        }

        public final void setLimitedTracking(boolean z) {
            this._builder.setLimitedTracking(z);
        }

        public final void clearLimitedTracking() {
            this._builder.clearLimitedTracking();
        }

        public final boolean hasLimitedTracking() {
            return this._builder.hasLimitedTracking();
        }

        public final boolean getLimitedOpenAdTracking() {
            return this._builder.getLimitedOpenAdTracking();
        }

        public final void setLimitedOpenAdTracking(boolean z) {
            this._builder.setLimitedOpenAdTracking(z);
        }

        public final void clearLimitedOpenAdTracking() {
            this._builder.clearLimitedOpenAdTracking();
        }

        public final boolean hasLimitedOpenAdTracking() {
            return this._builder.hasLimitedOpenAdTracking();
        }

        public final double getBatteryLevel() {
            return this._builder.getBatteryLevel();
        }

        public final void setBatteryLevel(double d) {
            this._builder.setBatteryLevel(d);
        }

        public final void clearBatteryLevel() {
            this._builder.clearBatteryLevel();
        }

        public final boolean hasBatteryLevel() {
            return this._builder.hasBatteryLevel();
        }

        public final int getBatteryStatus() {
            return this._builder.getBatteryStatus();
        }

        public final void setBatteryStatus(int i) {
            this._builder.setBatteryStatus(i);
        }

        public final void clearBatteryStatus() {
            this._builder.clearBatteryStatus();
        }

        public final boolean hasBatteryStatus() {
            return this._builder.hasBatteryStatus();
        }

        public final gatewayprotocol.v1.DynamicDeviceInfoOuterClass.ConnectionType getConnectionType() {
            gatewayprotocol.v1.DynamicDeviceInfoOuterClass.ConnectionType connectionType = this._builder.getConnectionType();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(connectionType, "_builder.getConnectionType()");
            return connectionType;
        }

        public final void setConnectionType(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.ConnectionType value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setConnectionType(value);
        }

        public final void clearConnectionType() {
            this._builder.clearConnectionType();
        }

        public final boolean hasConnectionType() {
            return this._builder.hasConnectionType();
        }

        public final boolean getAppActive() {
            return this._builder.getAppActive();
        }

        public final void setAppActive(boolean z) {
            this._builder.setAppActive(z);
        }

        public final void clearAppActive() {
            this._builder.clearAppActive();
        }

        public final boolean hasAppActive() {
            return this._builder.hasAppActive();
        }

        public final boolean getLowPowerMode() {
            return this._builder.getLowPowerMode();
        }

        public final void setLowPowerMode(boolean z) {
            this._builder.setLowPowerMode(z);
        }

        public final void clearLowPowerMode() {
            this._builder.clearLowPowerMode();
        }

        public final boolean hasLowPowerMode() {
            return this._builder.hasLowPowerMode();
        }

        public final java.lang.String getUserId() {
            java.lang.String userId = this._builder.getUserId();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(userId, "_builder.getUserId()");
            return userId;
        }

        public final void setUserId(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setUserId(value);
        }

        public final void clearUserId() {
            this._builder.clearUserId();
        }

        public final boolean hasUserId() {
            return this._builder.hasUserId();
        }

        public final int getScreenWidth() {
            return this._builder.getScreenWidth();
        }

        public final void setScreenWidth(int i) {
            this._builder.setScreenWidth(i);
        }

        public final void clearScreenWidth() {
            this._builder.clearScreenWidth();
        }

        public final boolean hasScreenWidth() {
            return this._builder.hasScreenWidth();
        }

        public final int getScreenHeight() {
            return this._builder.getScreenHeight();
        }

        public final void setScreenHeight(int i) {
            this._builder.setScreenHeight(i);
        }

        public final void clearScreenHeight() {
            this._builder.clearScreenHeight();
        }

        public final boolean hasScreenHeight() {
            return this._builder.hasScreenHeight();
        }

        public final gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android getAndroid() {
            gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android android2 = this._builder.getAndroid();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(android2, "_builder.getAndroid()");
            return android2;
        }

        public final void setAndroid(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAndroid(value);
        }

        public final void clearAndroid() {
            this._builder.clearAndroid();
        }

        public final boolean hasAndroid() {
            return this._builder.hasAndroid();
        }

        public final gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios getIos() {
            gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios ios = this._builder.getIos();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ios, "_builder.getIos()");
            return ios;
        }

        public final void setIos(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setIos(value);
        }

        public final void clearIos() {
            this._builder.clearIos();
        }

        public final boolean hasIos() {
            return this._builder.hasIos();
        }

        public final gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.PlatformSpecificCase getPlatformSpecificCase() {
            gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.PlatformSpecificCase platformSpecificCase = this._builder.getPlatformSpecificCase();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(platformSpecificCase, "_builder.getPlatformSpecificCase()");
            return platformSpecificCase;
        }

        public final void clearPlatformSpecific() {
            this._builder.clearPlatformSpecific();
        }
    }

    private DynamicDeviceInfoKt() {
    }

    /* JADX INFO: compiled from: DynamicDeviceInfoKt.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/DynamicDeviceInfoKt$AndroidKt;", "", "()V", "Dsl", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AndroidKt {
        public static final gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt INSTANCE = new gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt();

        /* JADX INFO: compiled from: DynamicDeviceInfoKt.kt */
        @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001f\b\u0007\u0018\u0000 c2\u00020\u0001:\u0001cB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010B\u001a\u00020CH\u0001J\u0006\u0010D\u001a\u00020EJ\u0006\u0010F\u001a\u00020EJ\u0006\u0010G\u001a\u00020EJ\u0006\u0010H\u001a\u00020EJ\u0006\u0010I\u001a\u00020EJ\u0006\u0010J\u001a\u00020EJ\u0006\u0010K\u001a\u00020EJ\u0006\u0010L\u001a\u00020EJ\u0006\u0010M\u001a\u00020EJ\u0006\u0010N\u001a\u00020EJ\u0006\u0010O\u001a\u00020EJ\u0006\u0010P\u001a\u00020EJ\u0006\u0010Q\u001a\u00020EJ\u0006\u0010R\u001a\u00020EJ\u0006\u0010S\u001a\u00020EJ\u0006\u0010T\u001a\u00020\u0006J\u0006\u0010U\u001a\u00020\u0006J\u0006\u0010V\u001a\u00020\u0006J\u0006\u0010W\u001a\u00020\u0006J\u0006\u0010X\u001a\u00020\u0006J\u0006\u0010Y\u001a\u00020\u0006J\u0006\u0010Z\u001a\u00020\u0006J\u0006\u0010[\u001a\u00020\u0006J\u0006\u0010\\\u001a\u00020\u0006J\u0006\u0010]\u001a\u00020\u0006J\u0006\u0010^\u001a\u00020\u0006J\u0006\u0010_\u001a\u00020\u0006J\u0006\u0010`\u001a\u00020\u0006J\u0006\u0010a\u001a\u00020\u0006J\u0006\u0010b\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00158G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00158G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR$\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u001e8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010%\u001a\u00020$2\u0006\u0010\u0005\u001a\u00020$8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010*\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010\t\"\u0004\b,\u0010\u000bR$\u0010-\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010\t\"\u0004\b/\u0010\u000bR$\u00100\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b1\u0010\u0012\"\u0004\b2\u0010\u0014R$\u00103\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b4\u0010\t\"\u0004\b5\u0010\u000bR$\u00106\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b7\u0010\t\"\u0004\b8\u0010\u000bR$\u00109\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b:\u0010\u0012\"\u0004\b;\u0010\u0014R$\u0010<\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u0010\t\"\u0004\b>\u0010\u000bR$\u0010?\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u001e8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b@\u0010!\"\u0004\bA\u0010#¨\u0006d"}, d2 = {"Lgatewayprotocol/v1/DynamicDeviceInfoKt$AndroidKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android$Builder;", "(Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android$Builder;)V", "value", "", "adbEnabled", "getAdbEnabled", "()Z", "setAdbEnabled", "(Z)V", com.ironsource.y8.i.m0, "getAirplaneMode", "setAirplaneMode", "", com.ironsource.y8.i.l0, "getChargingType", "()I", "setChargingType", "(I)V", "", "deviceElapsedRealtime", "getDeviceElapsedRealtime", "()J", "setDeviceElapsedRealtime", "(J)V", "deviceUpTime", "getDeviceUpTime", "setDeviceUpTime", "", "maxVolume", "getMaxVolume", "()D", "setMaxVolume", "(D)V", "Lgatewayprotocol/v1/NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports;", "networkCapabilityTransports", "getNetworkCapabilityTransports", "()Lgatewayprotocol/v1/NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports;", "setNetworkCapabilityTransports", "(Lgatewayprotocol/v1/NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports;)V", "networkConnected", "getNetworkConnected", "setNetworkConnected", "networkMetered", "getNetworkMetered", "setNetworkMetered", "networkType", "getNetworkType", "setNetworkType", "sdCardPresent", "getSdCardPresent", "setSdCardPresent", "stayOnWhilePluggedIn", "getStayOnWhilePluggedIn", "setStayOnWhilePluggedIn", "telephonyManagerNetworkType", "getTelephonyManagerNetworkType", "setTelephonyManagerNetworkType", "usbConnected", "getUsbConnected", "setUsbConnected", "volume", "getVolume", "setVolume", "_build", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android;", "clearAdbEnabled", "", "clearAirplaneMode", "clearChargingType", "clearDeviceElapsedRealtime", "clearDeviceUpTime", "clearMaxVolume", "clearNetworkCapabilityTransports", "clearNetworkConnected", "clearNetworkMetered", "clearNetworkType", "clearSdCardPresent", "clearStayOnWhilePluggedIn", "clearTelephonyManagerNetworkType", "clearUsbConnected", "clearVolume", "hasAdbEnabled", "hasAirplaneMode", "hasChargingType", "hasDeviceElapsedRealtime", "hasDeviceUpTime", "hasMaxVolume", "hasNetworkCapabilityTransports", "hasNetworkConnected", "hasNetworkMetered", "hasNetworkType", "hasSdCardPresent", "hasStayOnWhilePluggedIn", "hasTelephonyManagerNetworkType", "hasUsbConnected", "hasVolume", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Dsl {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.Companion INSTANCE = new gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.Companion(null);
            private final gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder _builder;

            public /* synthetic */ Dsl(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(builder);
            }

            private Dsl(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder builder) {
                this._builder = builder;
            }

            /* JADX INFO: compiled from: DynamicDeviceInfoKt.kt */
            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/DynamicDeviceInfoKt$AndroidKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/DynamicDeviceInfoKt$AndroidKt$Dsl;", "builder", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android$Builder;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final /* synthetic */ gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl _create(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder builder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
                    return new gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl(builder, null);
                }
            }

            public final /* synthetic */ gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android _build() {
                gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android androidBuild = this._builder.build();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(androidBuild, "_builder.build()");
                return androidBuild;
            }

            public final boolean getNetworkConnected() {
                return this._builder.getNetworkConnected();
            }

            public final void setNetworkConnected(boolean z) {
                this._builder.setNetworkConnected(z);
            }

            public final void clearNetworkConnected() {
                this._builder.clearNetworkConnected();
            }

            public final boolean hasNetworkConnected() {
                return this._builder.hasNetworkConnected();
            }

            public final int getNetworkType() {
                return this._builder.getNetworkType();
            }

            public final void setNetworkType(int i) {
                this._builder.setNetworkType(i);
            }

            public final void clearNetworkType() {
                this._builder.clearNetworkType();
            }

            public final boolean hasNetworkType() {
                return this._builder.hasNetworkType();
            }

            public final boolean getNetworkMetered() {
                return this._builder.getNetworkMetered();
            }

            public final void setNetworkMetered(boolean z) {
                this._builder.setNetworkMetered(z);
            }

            public final void clearNetworkMetered() {
                this._builder.clearNetworkMetered();
            }

            public final boolean hasNetworkMetered() {
                return this._builder.hasNetworkMetered();
            }

            public final int getTelephonyManagerNetworkType() {
                return this._builder.getTelephonyManagerNetworkType();
            }

            public final void setTelephonyManagerNetworkType(int i) {
                this._builder.setTelephonyManagerNetworkType(i);
            }

            public final void clearTelephonyManagerNetworkType() {
                this._builder.clearTelephonyManagerNetworkType();
            }

            public final boolean hasTelephonyManagerNetworkType() {
                return this._builder.hasTelephonyManagerNetworkType();
            }

            public final boolean getAdbEnabled() {
                return this._builder.getAdbEnabled();
            }

            public final void setAdbEnabled(boolean z) {
                this._builder.setAdbEnabled(z);
            }

            public final void clearAdbEnabled() {
                this._builder.clearAdbEnabled();
            }

            public final boolean hasAdbEnabled() {
                return this._builder.hasAdbEnabled();
            }

            public final boolean getUsbConnected() {
                return this._builder.getUsbConnected();
            }

            public final void setUsbConnected(boolean z) {
                this._builder.setUsbConnected(z);
            }

            public final void clearUsbConnected() {
                this._builder.clearUsbConnected();
            }

            public final boolean hasUsbConnected() {
                return this._builder.hasUsbConnected();
            }

            public final double getVolume() {
                return this._builder.getVolume();
            }

            public final void setVolume(double d) {
                this._builder.setVolume(d);
            }

            public final void clearVolume() {
                this._builder.clearVolume();
            }

            public final boolean hasVolume() {
                return this._builder.hasVolume();
            }

            public final double getMaxVolume() {
                return this._builder.getMaxVolume();
            }

            public final void setMaxVolume(double d) {
                this._builder.setMaxVolume(d);
            }

            public final void clearMaxVolume() {
                this._builder.clearMaxVolume();
            }

            public final boolean hasMaxVolume() {
                return this._builder.hasMaxVolume();
            }

            public final long getDeviceUpTime() {
                return this._builder.getDeviceUpTime();
            }

            public final void setDeviceUpTime(long j) {
                this._builder.setDeviceUpTime(j);
            }

            public final void clearDeviceUpTime() {
                this._builder.clearDeviceUpTime();
            }

            public final boolean hasDeviceUpTime() {
                return this._builder.hasDeviceUpTime();
            }

            public final long getDeviceElapsedRealtime() {
                return this._builder.getDeviceElapsedRealtime();
            }

            public final void setDeviceElapsedRealtime(long j) {
                this._builder.setDeviceElapsedRealtime(j);
            }

            public final void clearDeviceElapsedRealtime() {
                this._builder.clearDeviceElapsedRealtime();
            }

            public final boolean hasDeviceElapsedRealtime() {
                return this._builder.hasDeviceElapsedRealtime();
            }

            public final boolean getAirplaneMode() {
                return this._builder.getAirplaneMode();
            }

            public final void setAirplaneMode(boolean z) {
                this._builder.setAirplaneMode(z);
            }

            public final void clearAirplaneMode() {
                this._builder.clearAirplaneMode();
            }

            public final boolean hasAirplaneMode() {
                return this._builder.hasAirplaneMode();
            }

            public final boolean getStayOnWhilePluggedIn() {
                return this._builder.getStayOnWhilePluggedIn();
            }

            public final void setStayOnWhilePluggedIn(boolean z) {
                this._builder.setStayOnWhilePluggedIn(z);
            }

            public final void clearStayOnWhilePluggedIn() {
                this._builder.clearStayOnWhilePluggedIn();
            }

            public final boolean hasStayOnWhilePluggedIn() {
                return this._builder.hasStayOnWhilePluggedIn();
            }

            public final boolean getSdCardPresent() {
                return this._builder.getSdCardPresent();
            }

            public final void setSdCardPresent(boolean z) {
                this._builder.setSdCardPresent(z);
            }

            public final void clearSdCardPresent() {
                this._builder.clearSdCardPresent();
            }

            public final boolean hasSdCardPresent() {
                return this._builder.hasSdCardPresent();
            }

            public final gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports getNetworkCapabilityTransports() {
                gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports networkCapabilityTransports = this._builder.getNetworkCapabilityTransports();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(networkCapabilityTransports, "_builder.getNetworkCapabilityTransports()");
                return networkCapabilityTransports;
            }

            public final void setNetworkCapabilityTransports(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setNetworkCapabilityTransports(value);
            }

            public final void clearNetworkCapabilityTransports() {
                this._builder.clearNetworkCapabilityTransports();
            }

            public final boolean hasNetworkCapabilityTransports() {
                return this._builder.hasNetworkCapabilityTransports();
            }

            public final int getChargingType() {
                return this._builder.getChargingType();
            }

            public final void setChargingType(int i) {
                this._builder.setChargingType(i);
            }

            public final void clearChargingType() {
                this._builder.clearChargingType();
            }

            public final boolean hasChargingType() {
                return this._builder.hasChargingType();
            }
        }

        private AndroidKt() {
        }
    }

    /* JADX INFO: renamed from: -initializeandroid, reason: not valid java name */
    public final gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android m1256initializeandroid(kotlin.jvm.functions.Function1<? super gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.Companion companion = gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.INSTANCE;
        gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder builderNewBuilder = gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    /* JADX INFO: compiled from: DynamicDeviceInfoKt.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/DynamicDeviceInfoKt$IosKt;", "", "()V", "Dsl", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class IosKt {
        public static final gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt INSTANCE = new gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt();

        /* JADX INFO: compiled from: DynamicDeviceInfoKt.kt */
        @kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u001c\n\u0002\b\u0012\b\u0007\u0018\u0000 Z2\u00020\u0001:\u0003Z[\\B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u00102\u001a\u000203H\u0001J\u0006\u00104\u001a\u000205J\u0006\u00106\u001a\u000205J\u0006\u00107\u001a\u000205J\u0006\u00108\u001a\u000205J\u0006\u00109\u001a\u000205J\u0006\u0010:\u001a\u000205J\u0006\u0010;\u001a\u000205J\u0006\u0010<\u001a\u000205J\u0006\u0010=\u001a\u00020>J\u0006\u0010?\u001a\u00020>J\u0006\u0010@\u001a\u00020>J\u0006\u0010A\u001a\u00020>J\u0006\u0010B\u001a\u00020>J\u0006\u0010C\u001a\u00020>J\u0006\u0010D\u001a\u00020>J\u0006\u0010E\u001a\u00020>J%\u0010F\u001a\u000205*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\bGJ%\u0010F\u001a\u000205*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020'0\u001f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\bHJ+\u0010I\u001a\u000205*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020 0\u001f2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00060KH\u0007¢\u0006\u0002\bLJ+\u0010I\u001a\u000205*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020'0\u001f2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00060KH\u0007¢\u0006\u0002\bMJ\u001d\u0010N\u001a\u000205*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020 0\u001fH\u0007¢\u0006\u0002\bOJ\u001d\u0010N\u001a\u000205*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020'0\u001fH\u0007¢\u0006\u0002\bPJ&\u0010Q\u001a\u000205*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0087\n¢\u0006\u0002\bRJ,\u0010Q\u001a\u000205*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020 0\u001f2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00060KH\u0087\n¢\u0006\u0002\bSJ&\u0010Q\u001a\u000205*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020'0\u001f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0087\n¢\u0006\u0002\bTJ,\u0010Q\u001a\u000205*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020'0\u001f2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00060KH\u0087\n¢\u0006\u0002\bUJ.\u0010V\u001a\u000205*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010W\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0002\bXJ.\u0010V\u001a\u000205*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020'0\u001f2\u0006\u0010W\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0002\bYR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00158G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00158G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u001d\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020 0\u001f8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R$\u0010#\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010\u000f\"\u0004\b%\u0010\u0011R\u001d\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020'0\u001f8F¢\u0006\u0006\u001a\u0004\b(\u0010\"R$\u0010)\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010\u000f\"\u0004\b+\u0010\u0011R$\u0010-\u001a\u00020,2\u0006\u0010\u0005\u001a\u00020,8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u0006]"}, d2 = {"Lgatewayprotocol/v1/DynamicDeviceInfoKt$IosKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios$Builder;", "(Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios$Builder;)V", "value", "", "currentRadioAccessTechnology", "getCurrentRadioAccessTechnology", "()Ljava/lang/String;", "setCurrentRadioAccessTechnology", "(Ljava/lang/String;)V", "", "currentUiTheme", "getCurrentUiTheme", "()I", "setCurrentUiTheme", "(I)V", "deviceName", "getDeviceName", "setDeviceName", "", "deviceUpTimeWithSleep", "getDeviceUpTimeWithSleep", "()J", "setDeviceUpTimeWithSleep", "(J)V", "deviceUpTimeWithoutSleep", "getDeviceUpTimeWithoutSleep", "setDeviceUpTimeWithoutSleep", "localeList", "Lcom/google/protobuf/kotlin/DslList;", "Lgatewayprotocol/v1/DynamicDeviceInfoKt$IosKt$Dsl$LocaleListProxy;", "getLocaleList", "()Lcom/google/protobuf/kotlin/DslList;", "networkReachabilityFlags", "getNetworkReachabilityFlags", "setNetworkReachabilityFlags", "nwPathInterfaces", "Lgatewayprotocol/v1/DynamicDeviceInfoKt$IosKt$Dsl$NwPathInterfacesProxy;", "getNwPathInterfaces", "trackingAuthStatus", "getTrackingAuthStatus", "setTrackingAuthStatus", "", "volume", "getVolume", "()D", "setVolume", "(D)V", "_build", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios;", "clearCurrentRadioAccessTechnology", "", "clearCurrentUiTheme", "clearDeviceName", "clearDeviceUpTimeWithSleep", "clearDeviceUpTimeWithoutSleep", "clearNetworkReachabilityFlags", "clearTrackingAuthStatus", "clearVolume", "hasCurrentRadioAccessTechnology", "", "hasCurrentUiTheme", "hasDeviceName", "hasDeviceUpTimeWithSleep", "hasDeviceUpTimeWithoutSleep", "hasNetworkReachabilityFlags", "hasTrackingAuthStatus", "hasVolume", "add", "addLocaleList", "addNwPathInterfaces", "addAll", "values", "", "addAllLocaleList", "addAllNwPathInterfaces", "clear", "clearLocaleList", "clearNwPathInterfaces", "plusAssign", "plusAssignLocaleList", "plusAssignAllLocaleList", "plusAssignNwPathInterfaces", "plusAssignAllNwPathInterfaces", "set", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "setLocaleList", "setNwPathInterfaces", "Companion", "LocaleListProxy", "NwPathInterfacesProxy", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Dsl {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.Companion INSTANCE = new gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.Companion(null);
            private final gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder _builder;

            public /* synthetic */ Dsl(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(builder);
            }

            private Dsl(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder builder) {
                this._builder = builder;
            }

            /* JADX INFO: compiled from: DynamicDeviceInfoKt.kt */
            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/DynamicDeviceInfoKt$IosKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/DynamicDeviceInfoKt$IosKt$Dsl;", "builder", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios$Builder;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final /* synthetic */ gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl _create(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder builder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
                    return new gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl(builder, null);
                }
            }

            public final /* synthetic */ gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios _build() {
                gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios iosBuild = this._builder.build();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(iosBuild, "_builder.build()");
                return iosBuild;
            }

            public final java.lang.String getCurrentRadioAccessTechnology() {
                java.lang.String currentRadioAccessTechnology = this._builder.getCurrentRadioAccessTechnology();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(currentRadioAccessTechnology, "_builder.getCurrentRadioAccessTechnology()");
                return currentRadioAccessTechnology;
            }

            public final void setCurrentRadioAccessTechnology(java.lang.String value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setCurrentRadioAccessTechnology(value);
            }

            public final void clearCurrentRadioAccessTechnology() {
                this._builder.clearCurrentRadioAccessTechnology();
            }

            public final boolean hasCurrentRadioAccessTechnology() {
                return this._builder.hasCurrentRadioAccessTechnology();
            }

            public final int getNetworkReachabilityFlags() {
                return this._builder.getNetworkReachabilityFlags();
            }

            public final void setNetworkReachabilityFlags(int i) {
                this._builder.setNetworkReachabilityFlags(i);
            }

            public final void clearNetworkReachabilityFlags() {
                this._builder.clearNetworkReachabilityFlags();
            }

            public final boolean hasNetworkReachabilityFlags() {
                return this._builder.hasNetworkReachabilityFlags();
            }

            /* JADX INFO: compiled from: DynamicDeviceInfoKt.kt */
            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lgatewayprotocol/v1/DynamicDeviceInfoKt$IosKt$Dsl$NwPathInterfacesProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class NwPathInterfacesProxy extends com.google.protobuf.kotlin.DslProxy {
                private NwPathInterfacesProxy() {
                }
            }

            public final com.google.protobuf.kotlin.DslList<java.lang.String, gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.NwPathInterfacesProxy> getNwPathInterfaces() {
                java.util.List<java.lang.String> nwPathInterfacesList = this._builder.getNwPathInterfacesList();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(nwPathInterfacesList, "_builder.getNwPathInterfacesList()");
                return new com.google.protobuf.kotlin.DslList<>(nwPathInterfacesList);
            }

            public final /* synthetic */ void addNwPathInterfaces(com.google.protobuf.kotlin.DslList dslList, java.lang.String value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                this._builder.addNwPathInterfaces(value);
            }

            public final /* synthetic */ void plusAssignNwPathInterfaces(com.google.protobuf.kotlin.DslList<java.lang.String, gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.NwPathInterfacesProxy> dslList, java.lang.String value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                addNwPathInterfaces(dslList, value);
            }

            public final /* synthetic */ void addAllNwPathInterfaces(com.google.protobuf.kotlin.DslList dslList, java.lang.Iterable values) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "values");
                this._builder.addAllNwPathInterfaces(values);
            }

            public final /* synthetic */ void plusAssignAllNwPathInterfaces(com.google.protobuf.kotlin.DslList<java.lang.String, gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.NwPathInterfacesProxy> dslList, java.lang.Iterable<java.lang.String> values) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "values");
                addAllNwPathInterfaces(dslList, values);
            }

            public final /* synthetic */ void setNwPathInterfaces(com.google.protobuf.kotlin.DslList dslList, int i, java.lang.String value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setNwPathInterfaces(i, value);
            }

            public final /* synthetic */ void clearNwPathInterfaces(com.google.protobuf.kotlin.DslList dslList) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
                this._builder.clearNwPathInterfaces();
            }

            /* JADX INFO: compiled from: DynamicDeviceInfoKt.kt */
            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lgatewayprotocol/v1/DynamicDeviceInfoKt$IosKt$Dsl$LocaleListProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class LocaleListProxy extends com.google.protobuf.kotlin.DslProxy {
                private LocaleListProxy() {
                }
            }

            public final com.google.protobuf.kotlin.DslList<java.lang.String, gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.LocaleListProxy> getLocaleList() {
                java.util.List<java.lang.String> localeListList = this._builder.getLocaleListList();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(localeListList, "_builder.getLocaleListList()");
                return new com.google.protobuf.kotlin.DslList<>(localeListList);
            }

            public final /* synthetic */ void addLocaleList(com.google.protobuf.kotlin.DslList dslList, java.lang.String value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                this._builder.addLocaleList(value);
            }

            public final /* synthetic */ void plusAssignLocaleList(com.google.protobuf.kotlin.DslList<java.lang.String, gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.LocaleListProxy> dslList, java.lang.String value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                addLocaleList(dslList, value);
            }

            public final /* synthetic */ void addAllLocaleList(com.google.protobuf.kotlin.DslList dslList, java.lang.Iterable values) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "values");
                this._builder.addAllLocaleList(values);
            }

            public final /* synthetic */ void plusAssignAllLocaleList(com.google.protobuf.kotlin.DslList<java.lang.String, gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.LocaleListProxy> dslList, java.lang.Iterable<java.lang.String> values) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "values");
                addAllLocaleList(dslList, values);
            }

            public final /* synthetic */ void setLocaleList(com.google.protobuf.kotlin.DslList dslList, int i, java.lang.String value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setLocaleList(i, value);
            }

            public final /* synthetic */ void clearLocaleList(com.google.protobuf.kotlin.DslList dslList) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
                this._builder.clearLocaleList();
            }

            public final int getCurrentUiTheme() {
                return this._builder.getCurrentUiTheme();
            }

            public final void setCurrentUiTheme(int i) {
                this._builder.setCurrentUiTheme(i);
            }

            public final void clearCurrentUiTheme() {
                this._builder.clearCurrentUiTheme();
            }

            public final boolean hasCurrentUiTheme() {
                return this._builder.hasCurrentUiTheme();
            }

            public final java.lang.String getDeviceName() {
                java.lang.String deviceName = this._builder.getDeviceName();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(deviceName, "_builder.getDeviceName()");
                return deviceName;
            }

            public final void setDeviceName(java.lang.String value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setDeviceName(value);
            }

            public final void clearDeviceName() {
                this._builder.clearDeviceName();
            }

            public final boolean hasDeviceName() {
                return this._builder.hasDeviceName();
            }

            public final double getVolume() {
                return this._builder.getVolume();
            }

            public final void setVolume(double d) {
                this._builder.setVolume(d);
            }

            public final void clearVolume() {
                this._builder.clearVolume();
            }

            public final boolean hasVolume() {
                return this._builder.hasVolume();
            }

            public final int getTrackingAuthStatus() {
                return this._builder.getTrackingAuthStatus();
            }

            public final void setTrackingAuthStatus(int i) {
                this._builder.setTrackingAuthStatus(i);
            }

            public final void clearTrackingAuthStatus() {
                this._builder.clearTrackingAuthStatus();
            }

            public final boolean hasTrackingAuthStatus() {
                return this._builder.hasTrackingAuthStatus();
            }

            public final long getDeviceUpTimeWithSleep() {
                return this._builder.getDeviceUpTimeWithSleep();
            }

            public final void setDeviceUpTimeWithSleep(long j) {
                this._builder.setDeviceUpTimeWithSleep(j);
            }

            public final void clearDeviceUpTimeWithSleep() {
                this._builder.clearDeviceUpTimeWithSleep();
            }

            public final boolean hasDeviceUpTimeWithSleep() {
                return this._builder.hasDeviceUpTimeWithSleep();
            }

            public final long getDeviceUpTimeWithoutSleep() {
                return this._builder.getDeviceUpTimeWithoutSleep();
            }

            public final void setDeviceUpTimeWithoutSleep(long j) {
                this._builder.setDeviceUpTimeWithoutSleep(j);
            }

            public final void clearDeviceUpTimeWithoutSleep() {
                this._builder.clearDeviceUpTimeWithoutSleep();
            }

            public final boolean hasDeviceUpTimeWithoutSleep() {
                return this._builder.hasDeviceUpTimeWithoutSleep();
            }
        }

        private IosKt() {
        }
    }

    /* JADX INFO: renamed from: -initializeios, reason: not valid java name */
    public final gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios m1257initializeios(kotlin.jvm.functions.Function1<? super gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.Companion companion = gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.INSTANCE;
        gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder builderNewBuilder = gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
