package gatewayprotocol.v1;

/* JADX INFO: compiled from: StaticDeviceInfoKt.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u000f\u0010\u0011B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0087\bø\u0001\u0000¢\u0006\u0002\b\nJ*\u0010\u000b\u001a\u00020\f2\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0087\bø\u0001\u0000¢\u0006\u0002\b\u000e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, d2 = {"Lgatewayprotocol/v1/StaticDeviceInfoKt;", "", "()V", "android", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android;", "block", "Lkotlin/Function1;", "Lgatewayprotocol/v1/StaticDeviceInfoKt$AndroidKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializeandroid", "ios", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios;", "Lgatewayprotocol/v1/StaticDeviceInfoKt$IosKt$Dsl;", "-initializeios", "AndroidKt", "Dsl", "IosKt", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class StaticDeviceInfoKt {
    public static final gatewayprotocol.v1.StaticDeviceInfoKt INSTANCE = new gatewayprotocol.v1.StaticDeviceInfoKt();

    /* JADX INFO: compiled from: StaticDeviceInfoKt.kt */
    @kotlin.Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b*\n\u0002\u0010\u001c\n\u0002\b\f\b\u0007\u0018\u0000 \u0092\u00012\u00020\u0001:\u0004\u0092\u0001\u0093\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010Z\u001a\u00020[H\u0001J\u0006\u0010\\\u001a\u00020]J\u0006\u0010^\u001a\u00020]J\u0006\u0010_\u001a\u00020]J\u0006\u0010`\u001a\u00020]J\u0006\u0010a\u001a\u00020]J\u0006\u0010b\u001a\u00020]J\u0006\u0010c\u001a\u00020]J\u0006\u0010d\u001a\u00020]J\u0006\u0010e\u001a\u00020]J\u0006\u0010f\u001a\u00020]J\u0006\u0010g\u001a\u00020]J\u0006\u0010h\u001a\u00020]J\u0006\u0010i\u001a\u00020]J\u0006\u0010j\u001a\u00020]J\u0006\u0010k\u001a\u00020]J\u0006\u0010l\u001a\u00020]J\u0006\u0010m\u001a\u00020]J\u0006\u0010n\u001a\u00020]J\u0006\u0010o\u001a\u00020]J\u0006\u0010p\u001a\u00020]J\u0006\u0010q\u001a\u00020\fJ\u0006\u0010r\u001a\u00020\fJ\u0006\u0010s\u001a\u00020\fJ\u0006\u0010t\u001a\u00020\fJ\u0006\u0010u\u001a\u00020\fJ\u0006\u0010v\u001a\u00020\fJ\u0006\u0010w\u001a\u00020\fJ\u0006\u0010x\u001a\u00020\fJ\u0006\u0010y\u001a\u00020\fJ\u0006\u0010z\u001a\u00020\fJ\u0006\u0010{\u001a\u00020\fJ\u0006\u0010|\u001a\u00020\fJ\u0006\u0010}\u001a\u00020\fJ\u0006\u0010~\u001a\u00020\fJ\u0006\u0010\u007f\u001a\u00020\fJ\u0007\u0010\u0080\u0001\u001a\u00020\fJ\u0007\u0010\u0081\u0001\u001a\u00020\fJ\u0007\u0010\u0082\u0001\u001a\u00020\fJ\u0007\u0010\u0083\u0001\u001a\u00020\fJ'\u0010\u0084\u0001\u001a\u00020]*\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020N0M2\u0006\u0010\u0005\u001a\u00020\u0012H\u0007¢\u0006\u0003\b\u0085\u0001J/\u0010\u0086\u0001\u001a\u00020]*\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020N0M2\u000e\u0010\u0087\u0001\u001a\t\u0012\u0004\u0012\u00020\u00120\u0088\u0001H\u0007¢\u0006\u0003\b\u0089\u0001J\u001f\u0010\u008a\u0001\u001a\u00020]*\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020N0MH\u0007¢\u0006\u0003\b\u008b\u0001J(\u0010\u008c\u0001\u001a\u00020]*\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020N0M2\u0006\u0010\u0005\u001a\u00020\u0012H\u0087\n¢\u0006\u0003\b\u008d\u0001J0\u0010\u008c\u0001\u001a\u00020]*\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020N0M2\u000e\u0010\u0087\u0001\u001a\t\u0012\u0004\u0012\u00020\u00120\u0088\u0001H\u0087\n¢\u0006\u0003\b\u008e\u0001J1\u0010\u008f\u0001\u001a\u00020]*\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020N0M2\u0007\u0010\u0090\u0001\u001a\u00020=2\u0006\u0010\u0005\u001a\u00020\u0012H\u0087\u0002¢\u0006\u0003\b\u0091\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R$\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u001b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010!\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R$\u0010$\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010\u0015\"\u0004\b&\u0010\u0017R$\u0010'\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010\u0015\"\u0004\b)\u0010\u0017R$\u0010*\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010\u0015\"\u0004\b,\u0010\u0017R$\u0010.\u001a\u00020-2\u0006\u0010\u0005\u001a\u00020-8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u00103\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b4\u0010\u0015\"\u0004\b5\u0010\u0017R\u0011\u00106\u001a\u0002078G¢\u0006\u0006\u001a\u0004\b8\u00109R$\u0010:\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b;\u0010\u000f\"\u0004\b<\u0010\u0011R$\u0010>\u001a\u00020=2\u0006\u0010\u0005\u001a\u00020=8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010C\u001a\u00020=2\u0006\u0010\u0005\u001a\u00020=8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bD\u0010@\"\u0004\bE\u0010BR$\u0010F\u001a\u00020=2\u0006\u0010\u0005\u001a\u00020=8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bG\u0010@\"\u0004\bH\u0010BR$\u0010I\u001a\u00020=2\u0006\u0010\u0005\u001a\u00020=8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bJ\u0010@\"\u0004\bK\u0010BR\u001d\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020N0M8F¢\u0006\u0006\u001a\u0004\bO\u0010PR$\u0010Q\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u001b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bR\u0010\u001e\"\u0004\bS\u0010 R$\u0010T\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u001b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bU\u0010\u001e\"\u0004\bV\u0010 R$\u0010W\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bX\u0010\u0015\"\u0004\bY\u0010\u0017¨\u0006\u0094\u0001"}, d2 = {"Lgatewayprotocol/v1/StaticDeviceInfoKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Builder;", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Builder;)V", "value", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android;", "android", "getAndroid", "()Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android;", "setAndroid", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android;)V", "", "appDebuggable", "getAppDebuggable", "()Z", "setAppDebuggable", "(Z)V", "", "bundleId", "getBundleId", "()Ljava/lang/String;", "setBundleId", "(Ljava/lang/String;)V", "bundleVersion", "getBundleVersion", "setBundleVersion", "", "cpuCount", "getCpuCount", "()J", "setCpuCount", "(J)V", "cpuModel", "getCpuModel", "setCpuModel", "deviceMake", "getDeviceMake", "setDeviceMake", com.ironsource.y8.i.l, "getDeviceModel", "setDeviceModel", "gpuModel", "getGpuModel", "setGpuModel", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios;", "ios", "getIos", "()Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios;", "setIos", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios;)V", "osVersion", "getOsVersion", "setOsVersion", "platformSpecificCase", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$PlatformSpecificCase;", "getPlatformSpecificCase", "()Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$PlatformSpecificCase;", "rooted", "getRooted", "setRooted", "", "screenDensity", "getScreenDensity", "()I", "setScreenDensity", "(I)V", "screenHeight", "getScreenHeight", "setScreenHeight", "screenSize", "getScreenSize", "setScreenSize", "screenWidth", "getScreenWidth", "setScreenWidth", "stores", "Lcom/google/protobuf/kotlin/DslList;", "Lgatewayprotocol/v1/StaticDeviceInfoKt$Dsl$StoresProxy;", "getStores", "()Lcom/google/protobuf/kotlin/DslList;", "totalDiskSpace", "getTotalDiskSpace", "setTotalDiskSpace", "totalRamMemory", "getTotalRamMemory", "setTotalRamMemory", "webviewUa", "getWebviewUa", "setWebviewUa", "_build", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "clearAndroid", "", "clearAppDebuggable", "clearBundleId", "clearBundleVersion", "clearCpuCount", "clearCpuModel", "clearDeviceMake", "clearDeviceModel", "clearGpuModel", "clearIos", "clearOsVersion", "clearPlatformSpecific", "clearRooted", "clearScreenDensity", "clearScreenHeight", "clearScreenSize", "clearScreenWidth", "clearTotalDiskSpace", "clearTotalRamMemory", "clearWebviewUa", "hasAndroid", "hasAppDebuggable", "hasBundleId", "hasBundleVersion", "hasCpuCount", "hasCpuModel", "hasDeviceMake", "hasDeviceModel", "hasGpuModel", "hasIos", "hasOsVersion", "hasRooted", "hasScreenDensity", "hasScreenHeight", "hasScreenSize", "hasScreenWidth", "hasTotalDiskSpace", "hasTotalRamMemory", "hasWebviewUa", "add", "addStores", "addAll", "values", "", "addAllStores", "clear", "clearStores", "plusAssign", "plusAssignStores", "plusAssignAllStores", "set", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "setStores", "Companion", "StoresProxy", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final gatewayprotocol.v1.StaticDeviceInfoKt.Dsl.Companion INSTANCE = new gatewayprotocol.v1.StaticDeviceInfoKt.Dsl.Companion(null);
        private final gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder _builder;

        public /* synthetic */ Dsl(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder) {
            this._builder = builder;
        }

        /* JADX INFO: compiled from: StaticDeviceInfoKt.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/StaticDeviceInfoKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/StaticDeviceInfoKt$Dsl;", "builder", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Builder;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ gatewayprotocol.v1.StaticDeviceInfoKt.Dsl _create(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
                return new gatewayprotocol.v1.StaticDeviceInfoKt.Dsl(builder, null);
            }
        }

        public final /* synthetic */ gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo _build() {
            gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfoBuild = this._builder.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(staticDeviceInfoBuild, "_builder.build()");
            return staticDeviceInfoBuild;
        }

        public final java.lang.String getBundleId() {
            java.lang.String bundleId = this._builder.getBundleId();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bundleId, "_builder.getBundleId()");
            return bundleId;
        }

        public final void setBundleId(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setBundleId(value);
        }

        public final void clearBundleId() {
            this._builder.clearBundleId();
        }

        public final boolean hasBundleId() {
            return this._builder.hasBundleId();
        }

        public final java.lang.String getBundleVersion() {
            java.lang.String bundleVersion = this._builder.getBundleVersion();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bundleVersion, "_builder.getBundleVersion()");
            return bundleVersion;
        }

        public final void setBundleVersion(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setBundleVersion(value);
        }

        public final void clearBundleVersion() {
            this._builder.clearBundleVersion();
        }

        public final boolean hasBundleVersion() {
            return this._builder.hasBundleVersion();
        }

        public final boolean getAppDebuggable() {
            return this._builder.getAppDebuggable();
        }

        public final void setAppDebuggable(boolean z) {
            this._builder.setAppDebuggable(z);
        }

        public final void clearAppDebuggable() {
            this._builder.clearAppDebuggable();
        }

        public final boolean hasAppDebuggable() {
            return this._builder.hasAppDebuggable();
        }

        public final boolean getRooted() {
            return this._builder.getRooted();
        }

        public final void setRooted(boolean z) {
            this._builder.setRooted(z);
        }

        public final void clearRooted() {
            this._builder.clearRooted();
        }

        public final boolean hasRooted() {
            return this._builder.hasRooted();
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

        public final boolean hasOsVersion() {
            return this._builder.hasOsVersion();
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

        public final boolean hasDeviceMake() {
            return this._builder.hasDeviceMake();
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

        public final boolean hasDeviceModel() {
            return this._builder.hasDeviceModel();
        }

        public final java.lang.String getWebviewUa() {
            java.lang.String webviewUa = this._builder.getWebviewUa();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(webviewUa, "_builder.getWebviewUa()");
            return webviewUa;
        }

        public final void setWebviewUa(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setWebviewUa(value);
        }

        public final void clearWebviewUa() {
            this._builder.clearWebviewUa();
        }

        public final boolean hasWebviewUa() {
            return this._builder.hasWebviewUa();
        }

        public final int getScreenDensity() {
            return this._builder.getScreenDensity();
        }

        public final void setScreenDensity(int i) {
            this._builder.setScreenDensity(i);
        }

        public final void clearScreenDensity() {
            this._builder.clearScreenDensity();
        }

        public final boolean hasScreenDensity() {
            return this._builder.hasScreenDensity();
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

        public final int getScreenSize() {
            return this._builder.getScreenSize();
        }

        public final void setScreenSize(int i) {
            this._builder.setScreenSize(i);
        }

        public final void clearScreenSize() {
            this._builder.clearScreenSize();
        }

        public final boolean hasScreenSize() {
            return this._builder.hasScreenSize();
        }

        /* JADX INFO: compiled from: StaticDeviceInfoKt.kt */
        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lgatewayprotocol/v1/StaticDeviceInfoKt$Dsl$StoresProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class StoresProxy extends com.google.protobuf.kotlin.DslProxy {
            private StoresProxy() {
            }
        }

        public final com.google.protobuf.kotlin.DslList<java.lang.String, gatewayprotocol.v1.StaticDeviceInfoKt.Dsl.StoresProxy> getStores() {
            java.util.List<java.lang.String> storesList = this._builder.getStoresList();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(storesList, "_builder.getStoresList()");
            return new com.google.protobuf.kotlin.DslList<>(storesList);
        }

        public final /* synthetic */ void addStores(com.google.protobuf.kotlin.DslList dslList, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.addStores(value);
        }

        public final /* synthetic */ void plusAssignStores(com.google.protobuf.kotlin.DslList<java.lang.String, gatewayprotocol.v1.StaticDeviceInfoKt.Dsl.StoresProxy> dslList, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            addStores(dslList, value);
        }

        public final /* synthetic */ void addAllStores(com.google.protobuf.kotlin.DslList dslList, java.lang.Iterable values) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "values");
            this._builder.addAllStores(values);
        }

        public final /* synthetic */ void plusAssignAllStores(com.google.protobuf.kotlin.DslList<java.lang.String, gatewayprotocol.v1.StaticDeviceInfoKt.Dsl.StoresProxy> dslList, java.lang.Iterable<java.lang.String> values) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "values");
            addAllStores(dslList, values);
        }

        public final /* synthetic */ void setStores(com.google.protobuf.kotlin.DslList dslList, int i, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setStores(i, value);
        }

        public final /* synthetic */ void clearStores(com.google.protobuf.kotlin.DslList dslList) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            this._builder.clearStores();
        }

        public final long getTotalDiskSpace() {
            return this._builder.getTotalDiskSpace();
        }

        public final void setTotalDiskSpace(long j) {
            this._builder.setTotalDiskSpace(j);
        }

        public final void clearTotalDiskSpace() {
            this._builder.clearTotalDiskSpace();
        }

        public final boolean hasTotalDiskSpace() {
            return this._builder.hasTotalDiskSpace();
        }

        public final long getTotalRamMemory() {
            return this._builder.getTotalRamMemory();
        }

        public final void setTotalRamMemory(long j) {
            this._builder.setTotalRamMemory(j);
        }

        public final void clearTotalRamMemory() {
            this._builder.clearTotalRamMemory();
        }

        public final boolean hasTotalRamMemory() {
            return this._builder.hasTotalRamMemory();
        }

        public final java.lang.String getCpuModel() {
            java.lang.String cpuModel = this._builder.getCpuModel();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cpuModel, "_builder.getCpuModel()");
            return cpuModel;
        }

        public final void setCpuModel(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setCpuModel(value);
        }

        public final void clearCpuModel() {
            this._builder.clearCpuModel();
        }

        public final boolean hasCpuModel() {
            return this._builder.hasCpuModel();
        }

        public final long getCpuCount() {
            return this._builder.getCpuCount();
        }

        public final void setCpuCount(long j) {
            this._builder.setCpuCount(j);
        }

        public final void clearCpuCount() {
            this._builder.clearCpuCount();
        }

        public final boolean hasCpuCount() {
            return this._builder.hasCpuCount();
        }

        public final java.lang.String getGpuModel() {
            java.lang.String gpuModel = this._builder.getGpuModel();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(gpuModel, "_builder.getGpuModel()");
            return gpuModel;
        }

        public final void setGpuModel(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setGpuModel(value);
        }

        public final void clearGpuModel() {
            this._builder.clearGpuModel();
        }

        public final boolean hasGpuModel() {
            return this._builder.hasGpuModel();
        }

        public final gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android getAndroid() {
            gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android android2 = this._builder.getAndroid();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(android2, "_builder.getAndroid()");
            return android2;
        }

        public final void setAndroid(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAndroid(value);
        }

        public final void clearAndroid() {
            this._builder.clearAndroid();
        }

        public final boolean hasAndroid() {
            return this._builder.hasAndroid();
        }

        public final gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios getIos() {
            gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios ios = this._builder.getIos();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ios, "_builder.getIos()");
            return ios;
        }

        public final void setIos(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setIos(value);
        }

        public final void clearIos() {
            this._builder.clearIos();
        }

        public final boolean hasIos() {
            return this._builder.hasIos();
        }

        public final gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.PlatformSpecificCase getPlatformSpecificCase() {
            gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.PlatformSpecificCase platformSpecificCase = this._builder.getPlatformSpecificCase();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(platformSpecificCase, "_builder.getPlatformSpecificCase()");
            return platformSpecificCase;
        }

        public final void clearPlatformSpecific() {
            this._builder.clearPlatformSpecific();
        }
    }

    private StaticDeviceInfoKt() {
    }

    /* JADX INFO: compiled from: StaticDeviceInfoKt.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/StaticDeviceInfoKt$AndroidKt;", "", "()V", "Dsl", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AndroidKt {
        public static final gatewayprotocol.v1.StaticDeviceInfoKt.AndroidKt INSTANCE = new gatewayprotocol.v1.StaticDeviceInfoKt.AndroidKt();

        /* JADX INFO: compiled from: StaticDeviceInfoKt.kt */
        @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b6\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0007\u0018\u0000 j2\u00020\u0001:\u0001jB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010B\u001a\u00020CH\u0001J\u0006\u0010D\u001a\u00020EJ\u0006\u0010F\u001a\u00020EJ\u0006\u0010G\u001a\u00020EJ\u0006\u0010H\u001a\u00020EJ\u0006\u0010I\u001a\u00020EJ\u0006\u0010J\u001a\u00020EJ\u0006\u0010K\u001a\u00020EJ\u0006\u0010L\u001a\u00020EJ\u0006\u0010M\u001a\u00020EJ\u0006\u0010N\u001a\u00020EJ\u0006\u0010O\u001a\u00020EJ\u0006\u0010P\u001a\u00020EJ\u0006\u0010Q\u001a\u00020EJ\u0006\u0010R\u001a\u00020EJ\u0006\u0010S\u001a\u00020EJ\u0006\u0010T\u001a\u00020EJ\u0006\u0010U\u001a\u00020EJ\u0006\u0010V\u001a\u00020EJ\u0006\u0010W\u001a\u00020XJ\u0006\u0010Y\u001a\u00020XJ\u0006\u0010Z\u001a\u00020XJ\u0006\u0010[\u001a\u00020XJ\u0006\u0010\\\u001a\u00020XJ\u0006\u0010]\u001a\u00020XJ\u0006\u0010^\u001a\u00020XJ\u0006\u0010_\u001a\u00020XJ\u0006\u0010`\u001a\u00020XJ\u0006\u0010a\u001a\u00020XJ\u0006\u0010b\u001a\u00020XJ\u0006\u0010c\u001a\u00020XJ\u0006\u0010d\u001a\u00020XJ\u0006\u0010e\u001a\u00020XJ\u0006\u0010f\u001a\u00020XJ\u0006\u0010g\u001a\u00020XJ\u0006\u0010h\u001a\u00020XJ\u0006\u0010i\u001a\u00020XR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR$\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000bR$\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\t\"\u0004\b\u001a\u0010\u000bR$\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\t\"\u0004\b\u001d\u0010\u000bR$\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\t\"\u0004\b \u0010\u000bR$\u0010!\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010\t\"\u0004\b#\u0010\u000bR$\u0010$\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010\t\"\u0004\b&\u0010\u000bR$\u0010'\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010\t\"\u0004\b)\u0010\u000bR$\u0010*\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010\t\"\u0004\b,\u0010\u000bR$\u0010-\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010\t\"\u0004\b/\u0010\u000bR$\u00100\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b1\u0010\t\"\u0004\b2\u0010\u000bR$\u00103\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b4\u0010\t\"\u0004\b5\u0010\u000bR$\u00106\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b7\u0010\u000f\"\u0004\b8\u0010\u0011R$\u00109\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b:\u0010\u000f\"\u0004\b;\u0010\u0011R$\u0010<\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u0010\t\"\u0004\b>\u0010\u000bR$\u0010?\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b@\u0010\u000f\"\u0004\bA\u0010\u0011¨\u0006k"}, d2 = {"Lgatewayprotocol/v1/StaticDeviceInfoKt$AndroidKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android$Builder;", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android$Builder;)V", "value", "", "androidFingerprint", "getAndroidFingerprint", "()Ljava/lang/String;", "setAndroidFingerprint", "(Ljava/lang/String;)V", "", "apiLevel", "getApiLevel", "()I", "setApiLevel", "(I)V", "apkDeveloperSigningCertificateHash", "getApkDeveloperSigningCertificateHash", "setApkDeveloperSigningCertificateHash", "appInstaller", "getAppInstaller", "setAppInstaller", "buildBoard", "getBuildBoard", "setBuildBoard", "buildBootloader", "getBuildBootloader", "setBuildBootloader", "buildBrand", "getBuildBrand", "setBuildBrand", "buildDevice", "getBuildDevice", "setBuildDevice", "buildDisplay", "getBuildDisplay", "setBuildDisplay", "buildFingerprint", "getBuildFingerprint", "setBuildFingerprint", "buildHardware", "getBuildHardware", "setBuildHardware", "buildHost", "getBuildHost", "setBuildHost", "buildId", "getBuildId", "setBuildId", "buildProduct", "getBuildProduct", "setBuildProduct", "extensionVersion", "getExtensionVersion", "setExtensionVersion", com.ironsource.y8.i.S, "getPhoneType", "setPhoneType", com.ironsource.y8.i.R, "getSimOperator", "setSimOperator", "versionCode", "getVersionCode", "setVersionCode", "_build", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android;", "clearAndroidFingerprint", "", "clearApiLevel", "clearApkDeveloperSigningCertificateHash", "clearAppInstaller", "clearBuildBoard", "clearBuildBootloader", "clearBuildBrand", "clearBuildDevice", "clearBuildDisplay", "clearBuildFingerprint", "clearBuildHardware", "clearBuildHost", "clearBuildId", "clearBuildProduct", "clearExtensionVersion", "clearPhoneType", "clearSimOperator", "clearVersionCode", "hasAndroidFingerprint", "", "hasApiLevel", "hasApkDeveloperSigningCertificateHash", "hasAppInstaller", "hasBuildBoard", "hasBuildBootloader", "hasBuildBrand", "hasBuildDevice", "hasBuildDisplay", "hasBuildFingerprint", "hasBuildHardware", "hasBuildHost", "hasBuildId", "hasBuildProduct", "hasExtensionVersion", "hasPhoneType", "hasSimOperator", "hasVersionCode", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Dsl {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final gatewayprotocol.v1.StaticDeviceInfoKt.AndroidKt.Dsl.Companion INSTANCE = new gatewayprotocol.v1.StaticDeviceInfoKt.AndroidKt.Dsl.Companion(null);
            private final gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder _builder;

            public /* synthetic */ Dsl(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(builder);
            }

            private Dsl(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder builder) {
                this._builder = builder;
            }

            /* JADX INFO: compiled from: StaticDeviceInfoKt.kt */
            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/StaticDeviceInfoKt$AndroidKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/StaticDeviceInfoKt$AndroidKt$Dsl;", "builder", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android$Builder;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final /* synthetic */ gatewayprotocol.v1.StaticDeviceInfoKt.AndroidKt.Dsl _create(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder builder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
                    return new gatewayprotocol.v1.StaticDeviceInfoKt.AndroidKt.Dsl(builder, null);
                }
            }

            public final /* synthetic */ gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android _build() {
                gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android androidBuild = this._builder.build();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(androidBuild, "_builder.build()");
                return androidBuild;
            }

            public final int getApiLevel() {
                return this._builder.getApiLevel();
            }

            public final void setApiLevel(int i) {
                this._builder.setApiLevel(i);
            }

            public final void clearApiLevel() {
                this._builder.clearApiLevel();
            }

            public final boolean hasApiLevel() {
                return this._builder.hasApiLevel();
            }

            public final int getVersionCode() {
                return this._builder.getVersionCode();
            }

            public final void setVersionCode(int i) {
                this._builder.setVersionCode(i);
            }

            public final void clearVersionCode() {
                this._builder.clearVersionCode();
            }

            public final boolean hasVersionCode() {
                return this._builder.hasVersionCode();
            }

            public final java.lang.String getAndroidFingerprint() {
                java.lang.String androidFingerprint = this._builder.getAndroidFingerprint();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(androidFingerprint, "_builder.getAndroidFingerprint()");
                return androidFingerprint;
            }

            public final void setAndroidFingerprint(java.lang.String value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setAndroidFingerprint(value);
            }

            public final void clearAndroidFingerprint() {
                this._builder.clearAndroidFingerprint();
            }

            public final boolean hasAndroidFingerprint() {
                return this._builder.hasAndroidFingerprint();
            }

            public final java.lang.String getAppInstaller() {
                java.lang.String appInstaller = this._builder.getAppInstaller();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(appInstaller, "_builder.getAppInstaller()");
                return appInstaller;
            }

            public final void setAppInstaller(java.lang.String value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setAppInstaller(value);
            }

            public final void clearAppInstaller() {
                this._builder.clearAppInstaller();
            }

            public final boolean hasAppInstaller() {
                return this._builder.hasAppInstaller();
            }

            public final java.lang.String getApkDeveloperSigningCertificateHash() {
                java.lang.String apkDeveloperSigningCertificateHash = this._builder.getApkDeveloperSigningCertificateHash();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apkDeveloperSigningCertificateHash, "_builder.getApkDeveloperSigningCertificateHash()");
                return apkDeveloperSigningCertificateHash;
            }

            public final void setApkDeveloperSigningCertificateHash(java.lang.String value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setApkDeveloperSigningCertificateHash(value);
            }

            public final void clearApkDeveloperSigningCertificateHash() {
                this._builder.clearApkDeveloperSigningCertificateHash();
            }

            public final boolean hasApkDeveloperSigningCertificateHash() {
                return this._builder.hasApkDeveloperSigningCertificateHash();
            }

            public final java.lang.String getBuildBoard() {
                java.lang.String buildBoard = this._builder.getBuildBoard();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(buildBoard, "_builder.getBuildBoard()");
                return buildBoard;
            }

            public final void setBuildBoard(java.lang.String value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setBuildBoard(value);
            }

            public final void clearBuildBoard() {
                this._builder.clearBuildBoard();
            }

            public final boolean hasBuildBoard() {
                return this._builder.hasBuildBoard();
            }

            public final java.lang.String getBuildBrand() {
                java.lang.String buildBrand = this._builder.getBuildBrand();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(buildBrand, "_builder.getBuildBrand()");
                return buildBrand;
            }

            public final void setBuildBrand(java.lang.String value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setBuildBrand(value);
            }

            public final void clearBuildBrand() {
                this._builder.clearBuildBrand();
            }

            public final boolean hasBuildBrand() {
                return this._builder.hasBuildBrand();
            }

            public final java.lang.String getBuildDevice() {
                java.lang.String buildDevice = this._builder.getBuildDevice();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(buildDevice, "_builder.getBuildDevice()");
                return buildDevice;
            }

            public final void setBuildDevice(java.lang.String value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setBuildDevice(value);
            }

            public final void clearBuildDevice() {
                this._builder.clearBuildDevice();
            }

            public final boolean hasBuildDevice() {
                return this._builder.hasBuildDevice();
            }

            public final java.lang.String getBuildDisplay() {
                java.lang.String buildDisplay = this._builder.getBuildDisplay();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(buildDisplay, "_builder.getBuildDisplay()");
                return buildDisplay;
            }

            public final void setBuildDisplay(java.lang.String value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setBuildDisplay(value);
            }

            public final void clearBuildDisplay() {
                this._builder.clearBuildDisplay();
            }

            public final boolean hasBuildDisplay() {
                return this._builder.hasBuildDisplay();
            }

            public final java.lang.String getBuildFingerprint() {
                java.lang.String buildFingerprint = this._builder.getBuildFingerprint();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(buildFingerprint, "_builder.getBuildFingerprint()");
                return buildFingerprint;
            }

            public final void setBuildFingerprint(java.lang.String value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setBuildFingerprint(value);
            }

            public final void clearBuildFingerprint() {
                this._builder.clearBuildFingerprint();
            }

            public final boolean hasBuildFingerprint() {
                return this._builder.hasBuildFingerprint();
            }

            public final java.lang.String getBuildHardware() {
                java.lang.String buildHardware = this._builder.getBuildHardware();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(buildHardware, "_builder.getBuildHardware()");
                return buildHardware;
            }

            public final void setBuildHardware(java.lang.String value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setBuildHardware(value);
            }

            public final void clearBuildHardware() {
                this._builder.clearBuildHardware();
            }

            public final boolean hasBuildHardware() {
                return this._builder.hasBuildHardware();
            }

            public final java.lang.String getBuildHost() {
                java.lang.String buildHost = this._builder.getBuildHost();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(buildHost, "_builder.getBuildHost()");
                return buildHost;
            }

            public final void setBuildHost(java.lang.String value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setBuildHost(value);
            }

            public final void clearBuildHost() {
                this._builder.clearBuildHost();
            }

            public final boolean hasBuildHost() {
                return this._builder.hasBuildHost();
            }

            public final java.lang.String getBuildBootloader() {
                java.lang.String buildBootloader = this._builder.getBuildBootloader();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(buildBootloader, "_builder.getBuildBootloader()");
                return buildBootloader;
            }

            public final void setBuildBootloader(java.lang.String value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setBuildBootloader(value);
            }

            public final void clearBuildBootloader() {
                this._builder.clearBuildBootloader();
            }

            public final boolean hasBuildBootloader() {
                return this._builder.hasBuildBootloader();
            }

            public final java.lang.String getBuildProduct() {
                java.lang.String buildProduct = this._builder.getBuildProduct();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(buildProduct, "_builder.getBuildProduct()");
                return buildProduct;
            }

            public final void setBuildProduct(java.lang.String value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setBuildProduct(value);
            }

            public final void clearBuildProduct() {
                this._builder.clearBuildProduct();
            }

            public final boolean hasBuildProduct() {
                return this._builder.hasBuildProduct();
            }

            public final java.lang.String getBuildId() {
                java.lang.String buildId = this._builder.getBuildId();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(buildId, "_builder.getBuildId()");
                return buildId;
            }

            public final void setBuildId(java.lang.String value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setBuildId(value);
            }

            public final void clearBuildId() {
                this._builder.clearBuildId();
            }

            public final boolean hasBuildId() {
                return this._builder.hasBuildId();
            }

            public final int getExtensionVersion() {
                return this._builder.getExtensionVersion();
            }

            public final void setExtensionVersion(int i) {
                this._builder.setExtensionVersion(i);
            }

            public final void clearExtensionVersion() {
                this._builder.clearExtensionVersion();
            }

            public final boolean hasExtensionVersion() {
                return this._builder.hasExtensionVersion();
            }

            public final int getPhoneType() {
                return this._builder.getPhoneType();
            }

            public final void setPhoneType(int i) {
                this._builder.setPhoneType(i);
            }

            public final void clearPhoneType() {
                this._builder.clearPhoneType();
            }

            public final boolean hasPhoneType() {
                return this._builder.hasPhoneType();
            }

            public final java.lang.String getSimOperator() {
                java.lang.String simOperator = this._builder.getSimOperator();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(simOperator, "_builder.getSimOperator()");
                return simOperator;
            }

            public final void setSimOperator(java.lang.String value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setSimOperator(value);
            }

            public final void clearSimOperator() {
                this._builder.clearSimOperator();
            }

            public final boolean hasSimOperator() {
                return this._builder.hasSimOperator();
            }
        }

        private AndroidKt() {
        }
    }

    /* JADX INFO: renamed from: -initializeandroid, reason: not valid java name */
    public final gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android m1283initializeandroid(kotlin.jvm.functions.Function1<? super gatewayprotocol.v1.StaticDeviceInfoKt.AndroidKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        gatewayprotocol.v1.StaticDeviceInfoKt.AndroidKt.Dsl.Companion companion = gatewayprotocol.v1.StaticDeviceInfoKt.AndroidKt.Dsl.INSTANCE;
        gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder builderNewBuilder = gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        gatewayprotocol.v1.StaticDeviceInfoKt.AndroidKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    /* JADX INFO: compiled from: StaticDeviceInfoKt.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/StaticDeviceInfoKt$IosKt;", "", "()V", "Dsl", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class IosKt {
        public static final gatewayprotocol.v1.StaticDeviceInfoKt.IosKt INSTANCE = new gatewayprotocol.v1.StaticDeviceInfoKt.IosKt();

        /* JADX INFO: compiled from: StaticDeviceInfoKt.kt */
        @kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u001c\n\u0002\b\f\b\u0007\u0018\u0000 P2\u00020\u0001:\u0002PQB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010/\u001a\u000200H\u0001J\u0006\u00101\u001a\u000202J\u0006\u00103\u001a\u000202J\u0006\u00104\u001a\u000202J\u0006\u00105\u001a\u000202J\u0006\u00106\u001a\u000202J\u0006\u00107\u001a\u000202J\u0006\u00108\u001a\u000202J\u0006\u00109\u001a\u000202J\u0006\u0010:\u001a\u00020\fJ\u0006\u0010;\u001a\u00020\fJ\u0006\u0010<\u001a\u00020\fJ\u0006\u0010=\u001a\u00020\fJ\u0006\u0010>\u001a\u00020\fJ\u0006\u0010?\u001a\u00020\fJ\u0006\u0010@\u001a\u00020\fJ\u0006\u0010A\u001a\u00020\fJ%\u0010B\u001a\u000202*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\bCJ+\u0010D\u001a\u000202*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001d0\u001c2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00060FH\u0007¢\u0006\u0002\bGJ\u001d\u0010H\u001a\u000202*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001d0\u001cH\u0007¢\u0006\u0002\bIJ&\u0010J\u001a\u000202*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u0005\u001a\u00020\u0006H\u0087\n¢\u0006\u0002\bKJ,\u0010J\u001a\u000202*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001d0\u001c2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00060FH\u0087\n¢\u0006\u0002\bLJ.\u0010M\u001a\u000202*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010N\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0002\bOR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R\u001d\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001d0\u001c8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR$\u0010!\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020 8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010&\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010\t\"\u0004\b(\u0010\u000bR$\u0010)\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010\t\"\u0004\b+\u0010\u000bR$\u0010,\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010\t\"\u0004\b.\u0010\u000b¨\u0006R"}, d2 = {"Lgatewayprotocol/v1/StaticDeviceInfoKt$IosKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios$Builder;", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios$Builder;)V", "value", "", "builtSdkVersion", "getBuiltSdkVersion", "()Ljava/lang/String;", "setBuiltSdkVersion", "(Ljava/lang/String;)V", "", "canMakePayments", "getCanMakePayments", "()Z", "setCanMakePayments", "(Z)V", "", "screenScale", "getScreenScale", "()I", "setScreenScale", "(I)V", "simulator", "getSimulator", "setSimulator", "skadnetworkId", "Lcom/google/protobuf/kotlin/DslList;", "Lgatewayprotocol/v1/StaticDeviceInfoKt$IosKt$Dsl$SkadnetworkIdProxy;", "getSkadnetworkId", "()Lcom/google/protobuf/kotlin/DslList;", "", "systemBootTime", "getSystemBootTime", "()J", "setSystemBootTime", "(J)V", "xcodeBuildVersion", "getXcodeBuildVersion", "setXcodeBuildVersion", "xcodeSdkBuildVersion", "getXcodeSdkBuildVersion", "setXcodeSdkBuildVersion", "xcodeVersion", "getXcodeVersion", "setXcodeVersion", "_build", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios;", "clearBuiltSdkVersion", "", "clearCanMakePayments", "clearScreenScale", "clearSimulator", "clearSystemBootTime", "clearXcodeBuildVersion", "clearXcodeSdkBuildVersion", "clearXcodeVersion", "hasBuiltSdkVersion", "hasCanMakePayments", "hasScreenScale", "hasSimulator", "hasSystemBootTime", "hasXcodeBuildVersion", "hasXcodeSdkBuildVersion", "hasXcodeVersion", "add", "addSkadnetworkId", "addAll", "values", "", "addAllSkadnetworkId", "clear", "clearSkadnetworkId", "plusAssign", "plusAssignSkadnetworkId", "plusAssignAllSkadnetworkId", "set", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "setSkadnetworkId", "Companion", "SkadnetworkIdProxy", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Dsl {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final gatewayprotocol.v1.StaticDeviceInfoKt.IosKt.Dsl.Companion INSTANCE = new gatewayprotocol.v1.StaticDeviceInfoKt.IosKt.Dsl.Companion(null);
            private final gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder _builder;

            public /* synthetic */ Dsl(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(builder);
            }

            private Dsl(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder builder) {
                this._builder = builder;
            }

            /* JADX INFO: compiled from: StaticDeviceInfoKt.kt */
            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/StaticDeviceInfoKt$IosKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/StaticDeviceInfoKt$IosKt$Dsl;", "builder", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios$Builder;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final /* synthetic */ gatewayprotocol.v1.StaticDeviceInfoKt.IosKt.Dsl _create(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder builder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
                    return new gatewayprotocol.v1.StaticDeviceInfoKt.IosKt.Dsl(builder, null);
                }
            }

            public final /* synthetic */ gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios _build() {
                gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios iosBuild = this._builder.build();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(iosBuild, "_builder.build()");
                return iosBuild;
            }

            public final long getSystemBootTime() {
                return this._builder.getSystemBootTime();
            }

            public final void setSystemBootTime(long j) {
                this._builder.setSystemBootTime(j);
            }

            public final void clearSystemBootTime() {
                this._builder.clearSystemBootTime();
            }

            public final boolean hasSystemBootTime() {
                return this._builder.hasSystemBootTime();
            }

            public final boolean getSimulator() {
                return this._builder.getSimulator();
            }

            public final void setSimulator(boolean z) {
                this._builder.setSimulator(z);
            }

            public final void clearSimulator() {
                this._builder.clearSimulator();
            }

            public final boolean hasSimulator() {
                return this._builder.hasSimulator();
            }

            public final java.lang.String getBuiltSdkVersion() {
                java.lang.String builtSdkVersion = this._builder.getBuiltSdkVersion();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builtSdkVersion, "_builder.getBuiltSdkVersion()");
                return builtSdkVersion;
            }

            public final void setBuiltSdkVersion(java.lang.String value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setBuiltSdkVersion(value);
            }

            public final void clearBuiltSdkVersion() {
                this._builder.clearBuiltSdkVersion();
            }

            public final boolean hasBuiltSdkVersion() {
                return this._builder.hasBuiltSdkVersion();
            }

            /* JADX INFO: compiled from: StaticDeviceInfoKt.kt */
            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lgatewayprotocol/v1/StaticDeviceInfoKt$IosKt$Dsl$SkadnetworkIdProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class SkadnetworkIdProxy extends com.google.protobuf.kotlin.DslProxy {
                private SkadnetworkIdProxy() {
                }
            }

            public final com.google.protobuf.kotlin.DslList<java.lang.String, gatewayprotocol.v1.StaticDeviceInfoKt.IosKt.Dsl.SkadnetworkIdProxy> getSkadnetworkId() {
                java.util.List<java.lang.String> skadnetworkIdList = this._builder.getSkadnetworkIdList();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(skadnetworkIdList, "_builder.getSkadnetworkIdList()");
                return new com.google.protobuf.kotlin.DslList<>(skadnetworkIdList);
            }

            public final /* synthetic */ void addSkadnetworkId(com.google.protobuf.kotlin.DslList dslList, java.lang.String value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                this._builder.addSkadnetworkId(value);
            }

            public final /* synthetic */ void plusAssignSkadnetworkId(com.google.protobuf.kotlin.DslList<java.lang.String, gatewayprotocol.v1.StaticDeviceInfoKt.IosKt.Dsl.SkadnetworkIdProxy> dslList, java.lang.String value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                addSkadnetworkId(dslList, value);
            }

            public final /* synthetic */ void addAllSkadnetworkId(com.google.protobuf.kotlin.DslList dslList, java.lang.Iterable values) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "values");
                this._builder.addAllSkadnetworkId(values);
            }

            public final /* synthetic */ void plusAssignAllSkadnetworkId(com.google.protobuf.kotlin.DslList<java.lang.String, gatewayprotocol.v1.StaticDeviceInfoKt.IosKt.Dsl.SkadnetworkIdProxy> dslList, java.lang.Iterable<java.lang.String> values) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "values");
                addAllSkadnetworkId(dslList, values);
            }

            public final /* synthetic */ void setSkadnetworkId(com.google.protobuf.kotlin.DslList dslList, int i, java.lang.String value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setSkadnetworkId(i, value);
            }

            public final /* synthetic */ void clearSkadnetworkId(com.google.protobuf.kotlin.DslList dslList) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
                this._builder.clearSkadnetworkId();
            }

            public final int getScreenScale() {
                return this._builder.getScreenScale();
            }

            public final void setScreenScale(int i) {
                this._builder.setScreenScale(i);
            }

            public final void clearScreenScale() {
                this._builder.clearScreenScale();
            }

            public final boolean hasScreenScale() {
                return this._builder.hasScreenScale();
            }

            public final boolean getCanMakePayments() {
                return this._builder.getCanMakePayments();
            }

            public final void setCanMakePayments(boolean z) {
                this._builder.setCanMakePayments(z);
            }

            public final void clearCanMakePayments() {
                this._builder.clearCanMakePayments();
            }

            public final boolean hasCanMakePayments() {
                return this._builder.hasCanMakePayments();
            }

            public final java.lang.String getXcodeVersion() {
                java.lang.String xcodeVersion = this._builder.getXcodeVersion();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(xcodeVersion, "_builder.getXcodeVersion()");
                return xcodeVersion;
            }

            public final void setXcodeVersion(java.lang.String value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setXcodeVersion(value);
            }

            public final void clearXcodeVersion() {
                this._builder.clearXcodeVersion();
            }

            public final boolean hasXcodeVersion() {
                return this._builder.hasXcodeVersion();
            }

            public final java.lang.String getXcodeBuildVersion() {
                java.lang.String xcodeBuildVersion = this._builder.getXcodeBuildVersion();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(xcodeBuildVersion, "_builder.getXcodeBuildVersion()");
                return xcodeBuildVersion;
            }

            public final void setXcodeBuildVersion(java.lang.String value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setXcodeBuildVersion(value);
            }

            public final void clearXcodeBuildVersion() {
                this._builder.clearXcodeBuildVersion();
            }

            public final boolean hasXcodeBuildVersion() {
                return this._builder.hasXcodeBuildVersion();
            }

            public final java.lang.String getXcodeSdkBuildVersion() {
                java.lang.String xcodeSdkBuildVersion = this._builder.getXcodeSdkBuildVersion();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(xcodeSdkBuildVersion, "_builder.getXcodeSdkBuildVersion()");
                return xcodeSdkBuildVersion;
            }

            public final void setXcodeSdkBuildVersion(java.lang.String value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setXcodeSdkBuildVersion(value);
            }

            public final void clearXcodeSdkBuildVersion() {
                this._builder.clearXcodeSdkBuildVersion();
            }

            public final boolean hasXcodeSdkBuildVersion() {
                return this._builder.hasXcodeSdkBuildVersion();
            }
        }

        private IosKt() {
        }
    }

    /* JADX INFO: renamed from: -initializeios, reason: not valid java name */
    public final gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios m1284initializeios(kotlin.jvm.functions.Function1<? super gatewayprotocol.v1.StaticDeviceInfoKt.IosKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        gatewayprotocol.v1.StaticDeviceInfoKt.IosKt.Dsl.Companion companion = gatewayprotocol.v1.StaticDeviceInfoKt.IosKt.Dsl.INSTANCE;
        gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder builderNewBuilder = gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        gatewayprotocol.v1.StaticDeviceInfoKt.IosKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
