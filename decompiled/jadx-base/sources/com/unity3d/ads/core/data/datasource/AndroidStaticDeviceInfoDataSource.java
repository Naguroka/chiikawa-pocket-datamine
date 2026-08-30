package com.unity3d.ads.core.data.datasource;

/* JADX INFO: compiled from: AndroidStaticDeviceInfoDataSource.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 m2\u00020\u0001:\u0001mB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001f\u0010\u0015\u001a\u00020\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0017H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u0014H\u0016J\u0006\u0010\u001c\u001a\u00020\u000eJ\b\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u000eH\u0016J\b\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020\u000eH\u0002J\u0013\u0010#\u001a\u0004\u0018\u00010\u000eH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010$J\u0006\u0010%\u001a\u00020\u000eJ\u0006\u0010&\u001a\u00020\u000eJ\u0006\u0010'\u001a\u00020\u000eJ\b\u0010(\u001a\u0004\u0018\u00010\u000eJ\b\u0010)\u001a\u0004\u0018\u00010\u000eJ\b\u0010*\u001a\u00020!H\u0002J\b\u0010+\u001a\u00020\u000eH\u0002J\b\u0010,\u001a\u00020\u000eH\u0003J\u0006\u0010-\u001a\u00020\u000eJ\u0006\u0010.\u001a\u00020\u000eJ\b\u0010/\u001a\u000200H\u0002J\b\u00101\u001a\u00020\u001eH\u0002J\u0012\u00102\u001a\u0004\u0018\u0001032\u0006\u00104\u001a\u000205H\u0002J\b\u00106\u001a\u00020\u000eH\u0002J\u0013\u00107\u001a\u0004\u0018\u00010\u000eH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010$J\b\u00108\u001a\u00020\u000eH\u0002J\u0006\u00109\u001a\u00020\u000eJ\u0006\u0010:\u001a\u00020\u000eJ\u0011\u0010;\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010$J\b\u0010<\u001a\u00020\u000eH\u0003J\b\u0010=\u001a\u00020\u000eH\u0016J\u0010\u0010>\u001a\u00020!2\u0006\u0010?\u001a\u00020@H\u0002J\u0012\u0010A\u001a\u00020!2\b\u0010B\u001a\u0004\u0018\u00010\u000eH\u0002J\b\u0010C\u001a\u00020\u000eH\u0016J\u000e\u0010D\u001a\b\u0012\u0004\u0012\u00020\u000e0EH\u0003J\u000e\u0010F\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0017H\u0002J\b\u0010G\u001a\u00020\u000eH\u0002J\b\u0010H\u001a\u00020\u000eH\u0016J\b\u0010I\u001a\u00020\u001eH\u0002J\b\u0010J\u001a\u00020\u000eH\u0002J\u0006\u0010K\u001a\u00020\u000eJ\b\u0010L\u001a\u00020\u001eH\u0002J\b\u0010M\u001a\u00020\u001eH\u0002J\b\u0010N\u001a\u00020\u001eH\u0002J\b\u0010O\u001a\u00020\u001eH\u0002J\f\u0010P\u001a\b\u0012\u0004\u0012\u00020Q0\u0017J\b\u0010R\u001a\u00020\u000eH\u0002J\u001e\u0010S\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00172\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0017H\u0002J\f\u0010T\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0017J\b\u0010U\u001a\u00020!H\u0016J\u0006\u0010V\u001a\u00020!J\u0010\u0010W\u001a\u00020!2\b\u0010X\u001a\u0004\u0018\u000103J\b\u0010Y\u001a\u00020\u001eH\u0002J\b\u0010Z\u001a\u00020\u000eH\u0002J\b\u0010[\u001a\u00020\u000eH\u0002J\u0006\u0010\\\u001a\u00020]J\u0006\u0010^\u001a\u00020]J\b\u0010_\u001a\u00020]H\u0002J\u001a\u0010`\u001a\u00020]2\u0006\u0010a\u001a\u00020b2\b\u0010c\u001a\u0004\u0018\u00010\u000eH\u0002J\u0010\u0010d\u001a\u00020]2\u0006\u0010a\u001a\u00020bH\u0003J\u0006\u0010e\u001a\u00020]J\b\u0010f\u001a\u00020]H\u0002J\u001a\u0010g\u001a\u00020]2\u0006\u0010a\u001a\u00020b2\b\u0010c\u001a\u0004\u0018\u00010\u000eH\u0002J\u0010\u0010h\u001a\u00020]2\u0006\u0010a\u001a\u00020bH\u0003J\b\u0010i\u001a\u00020]H\u0002J\u0010\u0010j\u001a\u00020]2\u0006\u0010k\u001a\u00020\u000eH\u0002J\u0018\u0010l\u001a\b\u0012\u0004\u0012\u00020b0\u00172\b\u0010c\u001a\u0004\u0018\u00010\u000eH\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006n"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidStaticDeviceInfoDataSource;", "Lcom/unity3d/ads/core/data/datasource/StaticDeviceInfoDataSource;", "context", "Landroid/content/Context;", "glInfoStore", "Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;", "analyticsDataSource", "Lcom/unity3d/ads/core/data/datasource/AnalyticsDataSource;", "storeDataSource", "Lcom/unity3d/ads/core/data/datasource/StoreDataSource;", "(Landroid/content/Context;Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;Lcom/unity3d/ads/core/data/datasource/AnalyticsDataSource;Lcom/unity3d/ads/core/data/datasource/StoreDataSource;)V", "DEBUG_CERT", "Ljavax/security/auth/x500/X500Principal;", "analyticsUserId", "", "getAnalyticsUserId", "()Ljava/lang/String;", "getContext", "()Landroid/content/Context;", "staticDeviceInfo", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "fetch", "additionalStores", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchAndroidStaticDeviceInfo", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android;", "fetchCached", "getAdvertisingTrackingId", "getApiLevel", "", "getAppName", "getAppStartTime", "", "getAppVersion", "getAuid", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBoard", "getBootloader", "getBrand", "getBuildId", "getBuildVersionIncremental", "getCPUCount", "getCPUModel", "getCertificateFingerprint", "getDevice", "getDisplay", "getDisplayMetricDensity", "", "getExtensionVersion", "getFileForStorageType", "Ljava/io/File;", "storageType", "Lcom/unity3d/ads/core/data/model/StorageType;", "getFingerprint", "getGPUModel", "getGameId", "getHardware", "getHost", "getIdfi", "getInstallerPackageName", "getManufacturer", "getMemoryInfo", "infoType", "Lcom/unity3d/services/core/device/Device$MemoryInfoType;", "getMemoryValueFromString", "memVal", "getModel", "getNewAbiList", "Ljava/util/ArrayList;", "getOldAbiList", "getOpenAdvertisingTrackingId", "getOsVersion", "getPhoneType", "getPlatform", "getProduct", "getScreenDensity", "getScreenHeight", "getScreenLayout", "getScreenWidth", "getSensorList", "Landroid/hardware/Sensor;", "getSimOperator", "getStores", "getSupportedAbis", "getSystemBootTime", "getTotalMemory", "getTotalSpace", com.ironsource.y8.h.b, "getVersionCode", "getVersionName", "getWebViewUserAgent", "hasX264Decoder", "", "hasX265Decoder", "isAppDebuggable", "isHardwareAccelerated", "codecInfo", "Landroid/media/MediaCodecInfo;", "mimeType", "isHardwareAcceleratedV29", "isLimitOpenAdTrackingEnabled", "isRooted", "isSoftwareOnly", "isSoftwareOnlyV29", "isTestMode", "searchPathForBinary", "binary", "selectAllDecodeCodecs", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidStaticDeviceInfoDataSource implements com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource {
    public static final java.lang.String ALGORITHM_SHA1 = "SHA-1";
    public static final java.lang.String APP_VERSION_FAKE = "FakeVersionName";
    public static final java.lang.String BINARY_SU = "su";
    public static final java.lang.String CERTIFICATE_TYPE_X509 = "X.509";
    public static final java.lang.String ENVIRONMENT_VARIABLE_PATH = "PATH";
    public static final java.lang.String PLATFORM_ANDROID = "android";
    public static final java.lang.String STORE_GOOGLE = "google";
    private final javax.security.auth.x500.X500Principal DEBUG_CERT;
    private final com.unity3d.ads.core.data.datasource.AnalyticsDataSource analyticsDataSource;
    private final android.content.Context context;
    private final com.unity3d.ads.core.data.datasource.ByteStringDataSource glInfoStore;
    private gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo;
    private final com.unity3d.ads.core.data.datasource.StoreDataSource storeDataSource;

    /* JADX INFO: compiled from: AndroidStaticDeviceInfoDataSource.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.unity3d.services.core.device.Device.MemoryInfoType.values().length];
            try {
                iArr[com.unity3d.services.core.device.Device.MemoryInfoType.TOTAL_MEMORY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.unity3d.services.core.device.Device.MemoryInfoType.FREE_MEMORY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.unity3d.ads.core.data.model.StorageType.values().length];
            try {
                iArr2[com.unity3d.ads.core.data.model.StorageType.INTERNAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[com.unity3d.ads.core.data.model.StorageType.EXTERNAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$fetch$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidStaticDeviceInfoDataSource.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource", f = "AndroidStaticDeviceInfoDataSource.kt", i = {0, 0}, l = {97}, m = "fetch", n = {"this", "additionalStores"}, s = {"L$0", "L$1"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.this.fetch(null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$getGPUModel$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidStaticDeviceInfoDataSource.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource", f = "AndroidStaticDeviceInfoDataSource.kt", i = {}, l = {492}, m = "getGPUModel", n = {}, s = {})
    static final class C16351 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        int label;
        /* synthetic */ java.lang.Object result;

        C16351(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.C16351> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.this.getGPUModel(this);
        }
    }

    private final java.lang.String getPlatform() {
        return "android";
    }

    private final int getVersionCode() {
        return 41205;
    }

    private final java.lang.String getVersionName() {
        return "4.12.5";
    }

    public AndroidStaticDeviceInfoDataSource(android.content.Context context, com.unity3d.ads.core.data.datasource.ByteStringDataSource glInfoStore, com.unity3d.ads.core.data.datasource.AnalyticsDataSource analyticsDataSource, com.unity3d.ads.core.data.datasource.StoreDataSource storeDataSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(glInfoStore, "glInfoStore");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsDataSource, "analyticsDataSource");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storeDataSource, "storeDataSource");
        this.context = context;
        this.glInfoStore = glInfoStore;
        this.analyticsDataSource = analyticsDataSource;
        this.storeDataSource = storeDataSource;
        this.DEBUG_CERT = new javax.security.auth.x500.X500Principal("CN=Android Debug,O=Android,C=US");
        gatewayprotocol.v1.StaticDeviceInfoKt.Dsl.Companion companion = gatewayprotocol.v1.StaticDeviceInfoKt.Dsl.INSTANCE;
        gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builderNewBuilder = gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        gatewayprotocol.v1.StaticDeviceInfoKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setBundleId(getAppName());
        dsl_create.setBundleVersion(getAppVersion());
        dsl_create.setAppDebuggable(isAppDebuggable());
        dsl_create.setRooted(isRooted());
        dsl_create.setOsVersion(getOsVersion());
        dsl_create.setDeviceMake(getManufacturer());
        dsl_create.setDeviceModel(getModel());
        dsl_create.setWebviewUa(getWebViewUserAgent());
        dsl_create.setScreenDensity(getScreenDensity());
        dsl_create.setScreenWidth(getScreenWidth());
        dsl_create.setScreenHeight(getScreenHeight());
        dsl_create.setScreenSize(getScreenLayout());
        dsl_create.addAllStores(dsl_create.getStores(), getStores$default(this, null, 1, null));
        dsl_create.setTotalDiskSpace(getTotalSpace(getFileForStorageType(com.unity3d.ads.core.data.model.StorageType.EXTERNAL)));
        dsl_create.setTotalRamMemory(getTotalMemory());
        dsl_create.setCpuModel(getCPUModel());
        dsl_create.setCpuCount(getCPUCount());
        dsl_create.setAndroid(fetchAndroidStaticDeviceInfo());
        this.staticDeviceInfo = dsl_create._build();
    }

    public final android.content.Context getContext() {
        return this.context;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public java.lang.Object fetch(java.util.List<java.lang.String> list, kotlin.coroutines.Continuation<? super gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo> continuation) {
        com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.AnonymousClass1 anonymousClass1;
        com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource androidStaticDeviceInfoDataSource;
        if (continuation instanceof com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.AnonymousClass1) {
            anonymousClass1 = (com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.AnonymousClass1(continuation);
        }
        java.lang.Object gPUModel = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(gPUModel);
            java.lang.String gpuModel = this.staticDeviceInfo.getGpuModel();
            if (!(gpuModel == null || gpuModel.length() == 0)) {
                return this.staticDeviceInfo;
            }
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = list;
            anonymousClass1.label = 1;
            gPUModel = getGPUModel(anonymousClass1);
            if (gPUModel == coroutine_suspended) {
                return coroutine_suspended;
            }
            androidStaticDeviceInfoDataSource = this;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (java.util.List) anonymousClass1.L$1;
            androidStaticDeviceInfoDataSource = (com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource) anonymousClass1.L$0;
            kotlin.ResultKt.throwOnFailure(gPUModel);
        }
        java.lang.String str = (java.lang.String) gPUModel;
        java.lang.String str2 = str;
        if (str2 == null || str2.length() == 0) {
            return androidStaticDeviceInfoDataSource.staticDeviceInfo;
        }
        gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = androidStaticDeviceInfoDataSource.staticDeviceInfo;
        gatewayprotocol.v1.StaticDeviceInfoKt.Dsl.Companion companion = gatewayprotocol.v1.StaticDeviceInfoKt.Dsl.INSTANCE;
        gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder = staticDeviceInfo.toBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        gatewayprotocol.v1.StaticDeviceInfoKt.Dsl dsl_create = companion._create(builder);
        dsl_create.setGpuModel(str);
        dsl_create.clearStores(dsl_create.getStores());
        dsl_create.addAllStores(dsl_create.getStores(), androidStaticDeviceInfoDataSource.getStores(list));
        gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo_build = dsl_create._build();
        androidStaticDeviceInfoDataSource.staticDeviceInfo = staticDeviceInfo_build;
        return staticDeviceInfo_build;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    /* JADX INFO: renamed from: fetchCached, reason: from getter */
    public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
        return this.staticDeviceInfo;
    }

    private final gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android fetchAndroidStaticDeviceInfo() {
        gatewayprotocol.v1.StaticDeviceInfoKt staticDeviceInfoKt = gatewayprotocol.v1.StaticDeviceInfoKt.INSTANCE;
        gatewayprotocol.v1.StaticDeviceInfoKt.AndroidKt.Dsl.Companion companion = gatewayprotocol.v1.StaticDeviceInfoKt.AndroidKt.Dsl.INSTANCE;
        gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder builderNewBuilder = gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        gatewayprotocol.v1.StaticDeviceInfoKt.AndroidKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setApiLevel(getApiLevel());
        dsl_create.setVersionCode(getVersionCode());
        dsl_create.setAndroidFingerprint(getFingerprint());
        dsl_create.setAppInstaller(getInstallerPackageName());
        dsl_create.setApkDeveloperSigningCertificateHash(getCertificateFingerprint());
        dsl_create.setBuildBoard(getBoard());
        dsl_create.setBuildBrand(getBrand());
        dsl_create.setBuildDevice(getDevice());
        dsl_create.setBuildDisplay(getDisplay());
        dsl_create.setBuildFingerprint(getFingerprint());
        dsl_create.setBuildHardware(getHardware());
        dsl_create.setBuildHost(getHost());
        dsl_create.setBuildBootloader(getBootloader());
        dsl_create.setBuildProduct(getProduct());
        dsl_create.setExtensionVersion(getExtensionVersion());
        java.lang.String buildId = getBuildId();
        if (buildId != null) {
            dsl_create.setBuildId(buildId);
        }
        dsl_create.setPhoneType(getPhoneType());
        dsl_create.setSimOperator(getSimOperator());
        return dsl_create._build();
    }

    private final int getApiLevel() {
        return android.os.Build.VERSION.SDK_INT;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public java.lang.String getOsVersion() {
        java.lang.String str = android.os.Build.VERSION.RELEASE;
        return str == null ? "" : str;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public java.lang.String getManufacturer() {
        java.lang.String str = android.os.Build.MANUFACTURER;
        return str == null ? "" : str;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public java.lang.String getModel() {
        java.lang.String str = android.os.Build.MODEL;
        return str == null ? "" : str;
    }

    private final int getScreenLayout() {
        return this.context.getResources().getConfiguration().screenLayout;
    }

    public final java.lang.String getAdvertisingTrackingId() {
        java.lang.String advertisingTrackingId = com.unity3d.services.core.device.AdvertisingId.getAdvertisingTrackingId();
        return advertisingTrackingId == null ? "" : advertisingTrackingId;
    }

    private final java.lang.String getOpenAdvertisingTrackingId() {
        java.lang.String openAdvertisingTrackingId = com.unity3d.services.core.device.OpenAdvertisingId.getOpenAdvertisingTrackingId();
        return openAdvertisingTrackingId == null ? "" : openAdvertisingTrackingId;
    }

    public final boolean isLimitOpenAdTrackingEnabled() {
        return com.unity3d.services.core.device.OpenAdvertisingId.getLimitedOpenAdTracking();
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public java.lang.Object getIdfi(kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        java.lang.String string = com.unity3d.services.core.preferences.AndroidPreferences.getString("unityads-installinfo", com.unity3d.services.UnityAdsConstants.Preferences.PREF_KEY_IDFI);
        if (string == null) {
            string = null;
        }
        if (string != null) {
            return string;
        }
        java.lang.String string2 = java.util.UUID.randomUUID().toString();
        com.unity3d.services.core.preferences.AndroidPreferences.setString("unityads-installinfo", com.unity3d.services.UnityAdsConstants.Preferences.PREF_KEY_IDFI, string2);
        return string2;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public java.lang.String getAnalyticsUserId() {
        return this.analyticsDataSource.getUserId();
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public long getSystemBootTime() {
        return (java.lang.System.currentTimeMillis() - android.os.SystemClock.elapsedRealtime()) / ((long) 1000);
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public java.lang.Object getAuid(kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        java.lang.String string = com.unity3d.services.core.preferences.AndroidPreferences.getString("supersonic_shared_preferen", "auid");
        if (string == null) {
            return null;
        }
        return string;
    }

    private final float getDisplayMetricDensity() {
        android.util.DisplayMetrics displayMetrics;
        android.content.res.Resources resources = this.context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return 0.0f;
        }
        return displayMetrics.density;
    }

    private final int getScreenDensity() {
        android.util.DisplayMetrics displayMetrics;
        android.content.res.Resources resources = this.context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return -1;
        }
        return displayMetrics.densityDpi;
    }

    private final int getScreenWidth() {
        android.util.DisplayMetrics displayMetrics;
        android.content.res.Resources resources = this.context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return -1;
        }
        return displayMetrics.widthPixels;
    }

    private final int getScreenHeight() {
        android.util.DisplayMetrics displayMetrics;
        android.content.res.Resources resources = this.context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return -1;
        }
        return displayMetrics.heightPixels;
    }

    private final boolean isRooted() {
        try {
            return searchPathForBinary("su");
        } catch (java.lang.Exception e) {
            com.unity3d.services.core.log.DeviceLog.exception("Rooted check failed", e);
            return false;
        }
    }

    private final boolean searchPathForBinary(java.lang.String binary) {
        java.util.List listEmptyList;
        java.lang.String[] strArr;
        java.io.File[] fileArrListFiles;
        java.lang.String str = java.lang.System.getenv(ENVIRONMENT_VARIABLE_PATH);
        if (str != null) {
            java.util.List<java.lang.String> listSplit = new kotlin.text.Regex(":").split(str, 0);
            if (listSplit != null) {
                if (!listSplit.isEmpty()) {
                    java.util.ListIterator<java.lang.String> listIterator = listSplit.listIterator(listSplit.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            if (!(listIterator.previous().length() == 0)) {
                                listEmptyList = kotlin.collections.CollectionsKt.take(listSplit, listIterator.nextIndex() + 1);
                                break;
                            }
                        } else {
                            listEmptyList = kotlin.collections.CollectionsKt.emptyList();
                            break;
                        }
                    }
                } else {
                    listEmptyList = kotlin.collections.CollectionsKt.emptyList();
                    break;
                }
                if (listEmptyList != null && (strArr = (java.lang.String[]) listEmptyList.toArray(new java.lang.String[0])) != null) {
                    for (java.lang.String str2 : strArr) {
                        java.io.File file = new java.io.File(str2);
                        if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                            for (java.io.File file2 : fileArrListFiles) {
                                if (kotlin.jvm.internal.Intrinsics.areEqual(file2.getName(), binary)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @kotlin.Deprecated(message = "This constant was deprecated in API level 28. Use GET_SIGNING_CERTIFICATES instead")
    private final java.lang.String getCertificateFingerprint() {
        try {
            android.content.pm.Signature[] signatureArr = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 64).signatures;
            if (signatureArr == null) {
                return "";
            }
            if (!(!(signatureArr.length == 0))) {
                return "";
            }
            java.security.cert.Certificate certificateGenerateCertificate = java.security.cert.CertificateFactory.getInstance(CERTIFICATE_TYPE_X509).generateCertificate(new java.io.ByteArrayInputStream(signatureArr[0].toByteArray()));
            kotlin.jvm.internal.Intrinsics.checkNotNull(certificateGenerateCertificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            java.lang.String hexString = com.unity3d.services.core.misc.Utilities.toHexString(java.security.MessageDigest.getInstance(ALGORITHM_SHA1).digest(((java.security.cert.X509Certificate) certificateGenerateCertificate).getEncoded()));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(publicKey)");
            return hexString;
        } catch (java.lang.Exception e) {
            com.unity3d.services.core.log.DeviceLog.exception("Exception when signing certificate fingerprint", e);
            return "";
        }
    }

    public final java.lang.String getBoard() {
        java.lang.String str = android.os.Build.BOARD;
        return str == null ? "" : str;
    }

    public final java.lang.String getBootloader() {
        java.lang.String str = android.os.Build.BOOTLOADER;
        return str == null ? "" : str;
    }

    public final java.lang.String getBrand() {
        java.lang.String str = android.os.Build.BRAND;
        return str == null ? "" : str;
    }

    public final java.lang.String getDisplay() {
        java.lang.String str = android.os.Build.DISPLAY;
        return str == null ? "" : str;
    }

    public final java.lang.String getDevice() {
        java.lang.String str = android.os.Build.DEVICE;
        return str == null ? "" : str;
    }

    public final java.lang.String getHardware() {
        java.lang.String str = android.os.Build.HARDWARE;
        return str == null ? "" : str;
    }

    public final java.lang.String getHost() {
        java.lang.String str = android.os.Build.HOST;
        return str == null ? "" : str;
    }

    public final java.lang.String getProduct() {
        java.lang.String str = android.os.Build.PRODUCT;
        return str == null ? "" : str;
    }

    private final java.lang.String getFingerprint() {
        java.lang.String str = android.os.Build.FINGERPRINT;
        return str == null ? "" : str;
    }

    @kotlin.Deprecated(message = "This method was deprecated in API level 30. use getInstallSourceInfo")
    private final java.lang.String getInstallerPackageName() {
        java.lang.String installerPackageName = this.context.getPackageManager().getInstallerPackageName(this.context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }

    public final java.util.List<java.lang.String> getSupportedAbis() {
        if (getApiLevel() < 21) {
            return getOldAbiList();
        }
        return getNewAbiList();
    }

    public final java.util.List<android.hardware.Sensor> getSensorList() {
        java.lang.Object systemService = this.context.getSystemService("sensor");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        java.util.List<android.hardware.Sensor> sensorList = ((android.hardware.SensorManager) systemService).getSensorList(-1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sensorList, "sensorManager.getSensorList(Sensor.TYPE_ALL)");
        return sensorList;
    }

    private final java.lang.String getCPUModel() {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            java.lang.String str = android.os.Build.SOC_MODEL;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "{\n            Build.SOC_MODEL\n        }");
            return str;
        }
        try {
            return (java.lang.String) kotlin.collections.CollectionsKt.last(kotlin.io.FilesKt.readLines$default(new java.io.File("/proc/cpuinfo"), null, 1, null));
        } catch (java.io.FileNotFoundException e) {
            com.unity3d.services.core.log.DeviceLog.exception("Error reading CPU model", e);
            return "";
        }
    }

    private final long getCPUCount() {
        return java.lang.Runtime.getRuntime().availableProcessors();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final java.lang.Object getGPUModel(kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.C16351 c16351;
        if (continuation instanceof com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.C16351) {
            c16351 = (com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.C16351) continuation;
            if ((c16351.label & Integer.MIN_VALUE) != 0) {
                c16351.label -= Integer.MIN_VALUE;
            } else {
                c16351 = new com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.C16351(continuation);
            }
        } else {
            c16351 = new com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.C16351(continuation);
        }
        java.lang.Object obj = c16351.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c16351.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.unity3d.ads.core.data.datasource.ByteStringDataSource byteStringDataSource = this.glInfoStore;
            c16351.label = 1;
            obj = byteStringDataSource.get(c16351);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return ((com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore) obj).getData().toString(kotlin.text.Charsets.ISO_8859_1);
    }

    public final java.lang.String getBuildId() {
        return android.os.Build.ID;
    }

    public final java.lang.String getBuildVersionIncremental() {
        return android.os.Build.VERSION.INCREMENTAL;
    }

    private final java.util.List<java.lang.String> getOldAbiList() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String CPU_ABI = android.os.Build.CPU_ABI;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(CPU_ABI, "CPU_ABI");
        arrayList.add(CPU_ABI);
        java.lang.String CPU_ABI2 = android.os.Build.CPU_ABI2;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(CPU_ABI2, "CPU_ABI2");
        arrayList.add(CPU_ABI2);
        return arrayList;
    }

    private final java.util.ArrayList<java.lang.String> getNewAbiList() {
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        java.lang.String[] SUPPORTED_ABIS = android.os.Build.SUPPORTED_ABIS;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(SUPPORTED_ABIS, "SUPPORTED_ABIS");
        arrayList.addAll(kotlin.collections.CollectionsKt.listOf(java.util.Arrays.copyOf(SUPPORTED_ABIS, SUPPORTED_ABIS.length)));
        return arrayList;
    }

    private final java.lang.String getWebViewUserAgent() {
        try {
            java.lang.String defaultUserAgent = android.webkit.WebSettings.getDefaultUserAgent(this.context);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultUserAgent, "{\n        WebSettings.ge…tUserAgent(context)\n    }");
            return defaultUserAgent;
        } catch (java.lang.Exception e) {
            com.unity3d.services.core.log.DeviceLog.exception("Exception getting webview user agent", e);
            return "";
        }
    }

    private final java.util.List<java.lang.String> getStores(java.util.List<java.lang.String> additionalStores) {
        return this.storeDataSource.fetchStores(additionalStores);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ java.util.List getStores$default(com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource androidStaticDeviceInfoDataSource, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        return androidStaticDeviceInfoDataSource.getStores(list);
    }

    private final long getAppStartTime() {
        return com.unity3d.services.core.properties.SdkProperties.getInitializationTimeEpoch();
    }

    private final boolean isTestMode() {
        return com.unity3d.services.core.properties.SdkProperties.isTestMode();
    }

    private final java.lang.String getGameId() {
        java.lang.String gameId = com.unity3d.services.core.properties.ClientProperties.getGameId();
        return gameId == null ? "" : gameId;
    }

    public final long getTotalMemory() {
        return getMemoryInfo(com.unity3d.services.core.device.Device.MemoryInfoType.TOTAL_MEMORY);
    }

    private final long getMemoryInfo(com.unity3d.services.core.device.Device.MemoryInfoType infoType) {
        java.lang.String line;
        java.io.FileNotFoundException e;
        java.lang.Throwable th;
        int i = com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.WhenMappings.$EnumSwitchMapping$0[infoType.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        try {
            try {
                java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MEM_INFO, com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
                try {
                    java.io.RandomAccessFile randomAccessFile2 = randomAccessFile;
                    line = null;
                    for (int i3 = 0; i3 < i2; i3++) {
                        try {
                            line = randomAccessFile2.readLine();
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            try {
                                throw th;
                            } catch (java.lang.Throwable th3) {
                                kotlin.io.CloseableKt.closeFinally(randomAccessFile, th);
                                throw th3;
                            }
                        }
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    kotlin.io.CloseableKt.closeFinally(randomAccessFile, null);
                    return getMemoryValueFromString(line);
                } catch (java.lang.Throwable th4) {
                    line = null;
                    th = th4;
                }
            } catch (java.io.FileNotFoundException e2) {
                e = e2;
                com.unity3d.services.core.log.DeviceLog.exception("Error reading memory info", e);
            }
        } catch (java.io.FileNotFoundException e3) {
            line = null;
            e = e3;
            com.unity3d.services.core.log.DeviceLog.exception("Error reading memory info", e);
        }
    }

    private final long getMemoryValueFromString(java.lang.String memVal) {
        if (memVal == null) {
            return 0L;
        }
        java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("(\\d+)").matcher(memVal);
        java.lang.String strGroup = null;
        while (matcher.find()) {
            strGroup = matcher.group(1);
        }
        if (strGroup != null) {
            return java.lang.Long.parseLong(strGroup);
        }
        return -1L;
    }

    public final long getTotalSpace(java.io.File file) {
        if (file == null || !file.exists()) {
            return -1L;
        }
        return kotlin.math.MathKt.roundToInt(file.getTotalSpace() / ((long) 1024));
    }

    private final java.io.File getFileForStorageType(com.unity3d.ads.core.data.model.StorageType storageType) {
        int i = com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.WhenMappings.$EnumSwitchMapping$1[storageType.ordinal()];
        if (i == 1) {
            return this.context.getCacheDir();
        }
        if (i == 2) {
            return this.context.getExternalCacheDir();
        }
        com.unity3d.services.core.log.DeviceLog.error("Unhandled storagetype: " + storageType);
        return null;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public java.lang.String getAppName() {
        java.lang.String packageName = this.context.getPackageName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
        return packageName;
    }

    private final java.lang.String getAppVersion() {
        java.lang.String packageName = this.context.getPackageName();
        android.content.pm.PackageManager packageManager = this.context.getPackageManager();
        try {
            java.lang.String str = packageManager.getPackageInfo(packageName, 0).versionName == null ? APP_VERSION_FAKE : packageManager.getPackageInfo(packageName, 0).versionName;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "{\n            if (pm.get…e\n            }\n        }");
            return str;
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            com.unity3d.services.core.log.DeviceLog.exception("Error getting package info", e);
            return "";
        }
    }

    private final boolean isAppDebuggable() {
        boolean zAreEqual;
        android.content.pm.PackageManager packageManager = this.context.getPackageManager();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageManager, "context.packageManager");
        java.lang.String packageName = this.context.getPackageName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
        boolean z = true;
        try {
            android.content.pm.ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationInfo, "pm.getApplicationInfo(pkgName, 0)");
            applicationInfo.flags &= 2;
            if (applicationInfo.flags != 0) {
                zAreEqual = true;
                z = false;
            } else {
                z = false;
                zAreEqual = false;
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            com.unity3d.services.core.log.DeviceLog.exception("Could not find name", e);
            zAreEqual = false;
        }
        if (z) {
            try {
                android.content.pm.Signature[] signatures = packageManager.getPackageInfo(packageName, 64).signatures;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(signatures, "signatures");
                for (android.content.pm.Signature signature : signatures) {
                    java.security.cert.Certificate certificateGenerateCertificate = java.security.cert.CertificateFactory.getInstance(CERTIFICATE_TYPE_X509).generateCertificate(new java.io.ByteArrayInputStream(signature.toByteArray()));
                    kotlin.jvm.internal.Intrinsics.checkNotNull(certificateGenerateCertificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    zAreEqual = kotlin.jvm.internal.Intrinsics.areEqual(((java.security.cert.X509Certificate) certificateGenerateCertificate).getSubjectX500Principal(), this.DEBUG_CERT);
                    if (zAreEqual) {
                        break;
                    }
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException e2) {
                com.unity3d.services.core.log.DeviceLog.exception("Could not find name", e2);
            } catch (java.security.cert.CertificateException e3) {
                com.unity3d.services.core.log.DeviceLog.exception("Certificate exception", e3);
            }
        }
        return zAreEqual;
    }

    private final int getExtensionVersion() {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            return android.os.ext.SdkExtensions.getExtensionVersion(30);
        }
        return -1;
    }

    public final boolean hasX264Decoder() {
        return !selectAllDecodeCodecs("video/avc").isEmpty();
    }

    public final boolean hasX265Decoder() {
        return !selectAllDecodeCodecs("video/hevc").isEmpty();
    }

    private final java.util.List<android.media.MediaCodecInfo> selectAllDecodeCodecs(java.lang.String mimeType) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int codecCount = android.media.MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            android.media.MediaCodecInfo codecInfo = android.media.MediaCodecList.getCodecInfoAt(i);
            if (!codecInfo.isEncoder()) {
                for (java.lang.String str : codecInfo.getSupportedTypes()) {
                    if (kotlin.text.StringsKt.equals(str, mimeType, true)) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(codecInfo, "codecInfo");
                        if (isHardwareAccelerated(codecInfo, mimeType)) {
                            arrayList.add(codecInfo);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private final boolean isHardwareAccelerated(android.media.MediaCodecInfo codecInfo, java.lang.String mimeType) {
        if (getApiLevel() >= 29) {
            return isHardwareAcceleratedV29(codecInfo);
        }
        return !isSoftwareOnly(codecInfo, mimeType);
    }

    private final boolean isHardwareAcceleratedV29(android.media.MediaCodecInfo codecInfo) {
        return codecInfo.isHardwareAccelerated();
    }

    private final boolean isSoftwareOnly(android.media.MediaCodecInfo codecInfo, java.lang.String mimeType) {
        if (getApiLevel() >= 29) {
            return isSoftwareOnlyV29(codecInfo);
        }
        java.lang.String name = codecInfo.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name, "codecInfo.name");
        java.util.Locale ROOT = java.util.Locale.ROOT;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        java.lang.String lowerCase = name.toLowerCase(ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        if (kotlin.text.StringsKt.startsWith$default(lowerCase, "arc.", false, 2, (java.lang.Object) null)) {
            return false;
        }
        return kotlin.text.StringsKt.startsWith$default(lowerCase, "omx.google.", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.startsWith$default(lowerCase, "omx.ffmpeg.", false, 2, (java.lang.Object) null) || (kotlin.text.StringsKt.startsWith$default(lowerCase, "omx.sec.", false, 2, (java.lang.Object) null) && kotlin.text.StringsKt.contains$default((java.lang.CharSequence) lowerCase, (java.lang.CharSequence) ".sw.", false, 2, (java.lang.Object) null)) || kotlin.jvm.internal.Intrinsics.areEqual(lowerCase, "omx.qcom.video.decoder.hevcswvdec") || kotlin.text.StringsKt.startsWith$default(lowerCase, "c2.android.", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.startsWith$default(lowerCase, "c2.google.", false, 2, (java.lang.Object) null) || !(kotlin.text.StringsKt.startsWith$default(lowerCase, "omx.", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.startsWith$default(lowerCase, "c2.", false, 2, (java.lang.Object) null));
    }

    private final boolean isSoftwareOnlyV29(android.media.MediaCodecInfo codecInfo) {
        return codecInfo.isSoftwareOnly();
    }

    private final int getPhoneType() {
        java.lang.Object systemService = this.context.getSystemService("phone");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        return ((android.telephony.TelephonyManager) systemService).getPhoneType();
    }

    private final java.lang.String getSimOperator() {
        java.lang.Object systemService = this.context.getSystemService("phone");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        java.lang.String simOperator = ((android.telephony.TelephonyManager) systemService).getSimOperator();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(simOperator, "telephonyManager.simOperator");
        return simOperator;
    }
}
