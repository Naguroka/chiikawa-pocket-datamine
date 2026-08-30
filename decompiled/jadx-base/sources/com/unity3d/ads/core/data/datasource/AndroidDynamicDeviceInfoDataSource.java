package com.unity3d.ads.core.data.datasource;

/* JADX INFO: compiled from: AndroidDynamicDeviceInfoDataSource.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 Y2\u00020\u0001:\u0001YB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0013\u001a\u00020\rH\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\rH\u0002J\n\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\u0006\u0010\u001f\u001a\u00020\u001eJ\b\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020\fH\u0016J\n\u0010#\u001a\u0004\u0018\u00010$H\u0002J\b\u0010%\u001a\u00020\u001eH\u0016J\b\u0010&\u001a\u00020'H\u0002J\b\u0010(\u001a\u00020'H\u0002J\u0006\u0010)\u001a\u00020'J\u0012\u0010*\u001a\u00020'2\b\u0010+\u001a\u0004\u0018\u00010,H\u0003J\u0006\u0010-\u001a\u00020\rJ\b\u0010.\u001a\u00020\fH\u0002J\u000e\u0010/\u001a\b\u0012\u0004\u0012\u00020\f00H\u0016J\u0010\u00101\u001a\u00020'2\u0006\u00102\u001a\u000203H\u0002J\u0012\u00104\u001a\u00020'2\b\u00105\u001a\u0004\u0018\u00010\fH\u0002J\u0006\u00106\u001a\u000207J\u0006\u00108\u001a\u00020\fJ\b\u00109\u001a\u00020\rH\u0002J\b\u0010:\u001a\u00020\fH\u0002J\b\u0010;\u001a\u00020\fH\u0002J\b\u0010<\u001a\u00020\u001eH\u0003J\b\u0010=\u001a\u00020\fH\u0016J\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bJ\b\u0010?\u001a\u00020\u001eH\u0016J\u0006\u0010@\u001a\u00020\u001eJ\b\u0010A\u001a\u00020\u001eH\u0002J\b\u0010B\u001a\u00020\u001eH\u0002J\u0006\u0010C\u001a\u00020\rJ\u000e\u0010D\u001a\u00020\u001c2\u0006\u0010E\u001a\u00020\u001eJ\u0010\u0010F\u001a\u00020\u001c2\u0006\u0010E\u001a\u00020\u001eH\u0002J\n\u0010G\u001a\u0004\u0018\u00010HH\u0002J\b\u0010I\u001a\u00020\fH\u0002J\b\u0010J\u001a\u00020'H\u0002J\u0006\u0010K\u001a\u00020'J\b\u0010L\u001a\u00020'H\u0002J\u0012\u0010M\u001a\u00020'2\b\u0010+\u001a\u0004\u0018\u00010,H\u0002J\b\u0010N\u001a\u00020\rH\u0016J\b\u0010O\u001a\u00020\rH\u0002J\b\u0010P\u001a\u00020\rH\u0003J\b\u0010Q\u001a\u00020\rH\u0002J\b\u0010R\u001a\u00020\rH\u0002J\b\u0010S\u001a\u00020\rH\u0002J\b\u0010T\u001a\u00020\rH\u0002J\b\u0010U\u001a\u00020\rH\u0002J\b\u0010V\u001a\u00020\rH\u0002J\b\u0010W\u001a\u00020\rH\u0002J\b\u0010X\u001a\u00020\rH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006Z"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidDynamicDeviceInfoDataSource;", "Lcom/unity3d/ads/core/data/datasource/DynamicDeviceInfoDataSource;", "context", "Landroid/content/Context;", "lifecycleDataSource", "Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;", "(Landroid/content/Context;Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;)V", "getContext", "()Landroid/content/Context;", "reportedWarning", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "", "", "volumeSettingsChange", "Lkotlinx/coroutines/flow/Flow;", "Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange;", "getVolumeSettingsChange", "()Lkotlinx/coroutines/flow/Flow;", "adbStatus", "fetch", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "fetchAndroidDynamicDeviceInfo", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android;", "getAirplaneMode", "getAudioManager", "Landroid/media/AudioManager;", "getBatteryLevel", "", "getBatteryStatus", "", "getChargingType", "getConnectionType", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$ConnectionType;", "getConnectionTypeStr", "getConnectivityManager", "Landroid/net/ConnectivityManager;", "getCurrentUiTheme", "getElapsedRealtime", "", "getEventTimeStamp", "getFreeMemory", "getFreeSpace", com.ironsource.y8.h.b, "Ljava/io/File;", "getIsSdCardPresent", "getLanguage", "getLocaleList", "", "getMemoryInfo", "infoType", "Lcom/unity3d/services/core/device/Device$MemoryInfoType;", "getMemoryValueFromString", "memVal", "getNetworkCapabilityTransports", "Lgatewayprotocol/v1/NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports;", "getNetworkCountryISO", "getNetworkMetered", "getNetworkOperator", "getNetworkOperatorName", "getNetworkType", "getOrientation", "getProcessInfo", "getRingerMode", "getScreenBrightness", "getScreenHeight", "getScreenWidth", "getStayOnWhilePluggedIn", "getStreamMaxVolume", "streamType", "getStreamVolume", "getTelephonyManager", "Landroid/telephony/TelephonyManager;", "getTimeZone", "getTimeZoneOffset", "getTotalMemory", "getUptime", "getUsableSpace", "hasInternet", "hasInternetConnection", "hasInternetConnectionM", "isActiveNetworkConnected", "isAdbEnabled", "isAppActive", com.ironsource.y8.i.M, "isLimitOpenAdTrackingEnabled", "isUSBConnected", "isUsingWifi", "isWiredHeadsetOn", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidDynamicDeviceInfoDataSource implements com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource {
    public static final java.lang.String DIRECTORY_MEM_INFO = "/proc/meminfo";
    public static final java.lang.String DIRECTORY_MODE_READ = "r";
    public static final java.lang.String DIRECTORY_PROCESS_INFO = "/proc/self/stat";
    public static final java.lang.String INTENT_USB_STATE = "android.hardware.usb.action.USB_STATE";
    public static final java.lang.String KEY_STAT_CONTENT = "stat";
    public static final java.lang.String USB_EXTRA_CONNECTED = "connected";
    private final android.content.Context context;
    private final com.unity3d.ads.core.data.datasource.LifecycleDataSource lifecycleDataSource;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.Map<java.lang.String, java.lang.Boolean>> reportedWarning;
    private final kotlinx.coroutines.flow.Flow<com.unity3d.ads.core.data.datasource.VolumeSettingsChange> volumeSettingsChange;

    /* JADX INFO: compiled from: AndroidDynamicDeviceInfoDataSource.kt */
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
            int[] iArr2 = new int[gatewayprotocol.v1.DynamicDeviceInfoOuterClass.ConnectionType.values().length];
            try {
                iArr2[gatewayprotocol.v1.DynamicDeviceInfoOuterClass.ConnectionType.CONNECTION_TYPE_WIFI.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[gatewayprotocol.v1.DynamicDeviceInfoOuterClass.ConnectionType.CONNECTION_TYPE_CELLULAR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[gatewayprotocol.v1.DynamicDeviceInfoOuterClass.ConnectionType.CONNECTION_TYPE_UNSPECIFIED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public AndroidDynamicDeviceInfoDataSource(android.content.Context context, com.unity3d.ads.core.data.datasource.LifecycleDataSource lifecycleDataSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleDataSource, "lifecycleDataSource");
        this.context = context;
        this.lifecycleDataSource = lifecycleDataSource;
        this.reportedWarning = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(kotlin.collections.MapsKt.emptyMap());
        this.volumeSettingsChange = kotlinx.coroutines.flow.FlowKt.callbackFlow(new com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1(this, null));
    }

    public final android.content.Context getContext() {
        return this.context;
    }

    private final gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android fetchAndroidDynamicDeviceInfo() {
        gatewayprotocol.v1.DynamicDeviceInfoKt dynamicDeviceInfoKt = gatewayprotocol.v1.DynamicDeviceInfoKt.INSTANCE;
        gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.Companion companion = gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.INSTANCE;
        gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder builderNewBuilder = gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setNetworkConnected(isActiveNetworkConnected());
        dsl_create.setNetworkType(getNetworkType());
        dsl_create.setNetworkMetered(getNetworkMetered());
        dsl_create.setTelephonyManagerNetworkType(getNetworkType());
        dsl_create.setAdbEnabled(isAdbEnabled());
        dsl_create.setUsbConnected(isUSBConnected());
        dsl_create.setVolume(getStreamVolume(3));
        dsl_create.setMaxVolume(getStreamMaxVolume(3));
        dsl_create.setDeviceElapsedRealtime(getElapsedRealtime());
        dsl_create.setDeviceUpTime(getUptime());
        dsl_create.setAirplaneMode(getAirplaneMode());
        dsl_create.setChargingType(getChargingType());
        dsl_create.setStayOnWhilePluggedIn(getStayOnWhilePluggedIn());
        dsl_create.setSdCardPresent(getIsSdCardPresent());
        dsl_create.setNetworkCapabilityTransports(getNetworkCapabilityTransports());
        return dsl_create._build();
    }

    private final java.lang.String getLanguage() {
        java.lang.String string = java.util.Locale.getDefault().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getDefault().toString()");
        return string;
    }

    private final java.lang.String getTimeZone() {
        try {
            java.lang.String displayName = java.util.TimeZone.getDefault().getDisplayName(false, 0, java.util.Locale.US);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(displayName, "{\n            TimeZone.g…ORT, Locale.US)\n        }");
            return displayName;
        } catch (java.lang.AssertionError e) {
            com.unity3d.services.core.log.DeviceLog.error("Could not read timeZone information: %s", e.getMessage());
            return "";
        }
    }

    private final long getTimeZoneOffset() {
        return ((long) java.util.TimeZone.getDefault().getOffset(java.lang.System.currentTimeMillis())) / ((long) 1000);
    }

    private final boolean isUsingWifi() {
        android.net.ConnectivityManager connectivityManager = getConnectivityManager();
        if (connectivityManager == null) {
            return false;
        }
        android.telephony.TelephonyManager telephonyManager = getTelephonyManager();
        android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && connectivityManager.getBackgroundDataSetting() && activeNetworkInfo.isConnected() && telephonyManager != null && activeNetworkInfo.getType() == 1 && activeNetworkInfo.isConnected();
    }

    private final gatewayprotocol.v1.DynamicDeviceInfoOuterClass.ConnectionType getConnectionType() {
        if (isUsingWifi()) {
            return gatewayprotocol.v1.DynamicDeviceInfoOuterClass.ConnectionType.CONNECTION_TYPE_WIFI;
        }
        if (isActiveNetworkConnected()) {
            return gatewayprotocol.v1.DynamicDeviceInfoOuterClass.ConnectionType.CONNECTION_TYPE_CELLULAR;
        }
        return gatewayprotocol.v1.DynamicDeviceInfoOuterClass.ConnectionType.CONNECTION_TYPE_UNSPECIFIED;
    }

    @kotlin.Deprecated(message = "This method was deprecated in API level 30. Use getDataNetworkType()")
    private final int getNetworkType() {
        java.util.Map<java.lang.String, java.lang.Boolean> value;
        android.telephony.TelephonyManager telephonyManager = getTelephonyManager();
        if (telephonyManager == null) {
            return -1;
        }
        try {
            return telephonyManager.getNetworkType();
        } catch (java.lang.SecurityException unused) {
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) this.reportedWarning.getValue().get("getNetworkType"), (java.lang.Object) true)) {
                return -1;
            }
            kotlinx.coroutines.flow.MutableStateFlow<java.util.Map<java.lang.String, java.lang.Boolean>> mutableStateFlow = this.reportedWarning;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, kotlin.collections.MapsKt.plus(value, kotlin.TuplesKt.to("getNetworkType", true))));
            com.unity3d.services.core.log.DeviceLog.warning("Unity Ads was not able to get current network type due to missing permission");
            return -1;
        }
    }

    private final boolean getNetworkMetered() {
        android.net.ConnectivityManager connectivityManager = getConnectivityManager();
        return connectivityManager != null && connectivityManager.isActiveNetworkMetered();
    }

    private final java.lang.String getNetworkOperator() {
        android.telephony.TelephonyManager telephonyManager = getTelephonyManager();
        java.lang.String networkOperator = telephonyManager != null ? telephonyManager.getNetworkOperator() : null;
        return networkOperator == null ? "" : networkOperator;
    }

    private final java.lang.String getNetworkOperatorName() {
        android.telephony.TelephonyManager telephonyManager = getTelephonyManager();
        java.lang.String networkOperatorName = telephonyManager != null ? telephonyManager.getNetworkOperatorName() : null;
        return networkOperatorName == null ? "" : networkOperatorName;
    }

    public final java.lang.String getNetworkCountryISO() {
        android.telephony.TelephonyManager telephonyManager = getTelephonyManager();
        java.lang.String networkCountryIso = telephonyManager != null ? telephonyManager.getNetworkCountryIso() : null;
        return networkCountryIso == null ? "" : networkCountryIso;
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

    private final boolean isActiveNetworkConnected() {
        android.net.ConnectivityManager connectivityManager = getConnectivityManager();
        android.net.NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    private final boolean isWiredHeadsetOn() {
        android.media.AudioManager audioManager = getAudioManager();
        return audioManager != null && audioManager.isWiredHeadsetOn();
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    public int getRingerMode() {
        android.media.AudioManager audioManager = getAudioManager();
        if (audioManager != null) {
            return audioManager.getRingerMode();
        }
        return -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double getStreamVolume(int streamType) {
        android.media.AudioManager audioManager = getAudioManager();
        return audioManager != null ? audioManager.getStreamVolume(streamType) : -2;
    }

    public final double getStreamMaxVolume(int streamType) {
        android.media.AudioManager audioManager = getAudioManager();
        return audioManager != null ? audioManager.getStreamMaxVolume(streamType) : -2;
    }

    public final int getScreenBrightness() {
        return android.provider.Settings.System.getInt(this.context.getContentResolver(), "screen_brightness", -1);
    }

    @kotlin.Deprecated(message = "Legacy method, migrated from to .getUsableSpace()")
    private final long getFreeSpace(java.io.File file) {
        if (file == null || !file.exists()) {
            return -1L;
        }
        return kotlin.math.MathKt.roundToInt(file.getFreeSpace() / ((long) 1024));
    }

    private final long getUsableSpace(java.io.File file) {
        if (file == null || !file.exists()) {
            return -1L;
        }
        return kotlin.math.MathKt.roundToInt(file.getUsableSpace() / ((long) 1024));
    }

    private final double getBatteryLevel() {
        android.content.Intent intentRegisterReceiver = this.context.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            return -1.0d;
        }
        return ((double) intentRegisterReceiver.getIntExtra("level", 0)) / ((double) intentRegisterReceiver.getIntExtra("scale", 0));
    }

    private final int getBatteryStatus() {
        android.content.Intent intentRegisterReceiver = this.context.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return intentRegisterReceiver.getIntExtra("status", 0);
        }
        return -1;
    }

    public final long getTotalMemory() {
        return getMemoryInfo(com.unity3d.services.core.device.Device.MemoryInfoType.TOTAL_MEMORY);
    }

    public final long getFreeMemory() {
        return getMemoryInfo(com.unity3d.services.core.device.Device.MemoryInfoType.FREE_MEMORY);
    }

    private final long getMemoryInfo(com.unity3d.services.core.device.Device.MemoryInfoType infoType) {
        int i = com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.WhenMappings.$EnumSwitchMapping$0[infoType.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = -1;
            }
        }
        java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(DIRECTORY_MEM_INFO, DIRECTORY_MODE_READ);
        try {
            java.io.RandomAccessFile randomAccessFile2 = randomAccessFile;
            java.lang.String line = null;
            for (int i3 = 0; i3 < i2; i3++) {
                line = randomAccessFile2.readLine();
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            kotlin.io.CloseableKt.closeFinally(randomAccessFile, null);
            return getMemoryValueFromString(line);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                kotlin.io.CloseableKt.closeFinally(randomAccessFile, th);
                throw th2;
            }
        }
    }

    private final long getMemoryValueFromString(java.lang.String memVal) {
        if (memVal == null) {
            return -1L;
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

    private final boolean isAdbEnabled() {
        return adbStatus();
    }

    private final boolean adbStatus() {
        java.lang.Boolean boolValueOf;
        try {
            boolean z = true;
            if (1 != android.provider.Settings.Global.getInt(this.context.getContentResolver(), "adb_enabled", 0)) {
                z = false;
            }
            boolValueOf = java.lang.Boolean.valueOf(z);
        } catch (java.lang.Exception e) {
            com.unity3d.services.core.log.DeviceLog.exception("Problems fetching adb enabled status", e);
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    private final boolean isUSBConnected() {
        android.content.Intent intentRegisterReceiver = this.context.registerReceiver(null, new android.content.IntentFilter(INTENT_USB_STATE));
        if (intentRegisterReceiver != null) {
            return intentRegisterReceiver.getBooleanExtra(USB_EXTRA_CONNECTED, false);
        }
        return false;
    }

    private final long getUptime() {
        return android.os.SystemClock.uptimeMillis();
    }

    private final long getElapsedRealtime() {
        return android.os.SystemClock.elapsedRealtime();
    }

    public final java.util.Map<java.lang.String, java.lang.String> getProcessInfo() {
        java.util.HashMap map = new java.util.HashMap();
        java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(DIRECTORY_PROCESS_INFO, DIRECTORY_MODE_READ);
        try {
            java.lang.String statContent = randomAccessFile.readLine();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(statContent, "statContent");
            map.put(KEY_STAT_CONTENT, statContent);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            kotlin.io.CloseableKt.closeFinally(randomAccessFile, null);
            return map;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                kotlin.io.CloseableKt.closeFinally(randomAccessFile, th);
                throw th2;
            }
        }
    }

    private final boolean isLimitAdTrackingEnabled() {
        return com.unity3d.services.core.device.AdvertisingId.getLimitedAdTracking();
    }

    private final boolean isLimitOpenAdTrackingEnabled() {
        return com.unity3d.services.core.device.OpenAdvertisingId.getLimitedOpenAdTracking();
    }

    private final boolean isAppActive() {
        return this.lifecycleDataSource.appIsForeground();
    }

    private final long getEventTimeStamp() {
        return java.lang.System.currentTimeMillis() / ((long) 1000);
    }

    private final android.telephony.TelephonyManager getTelephonyManager() {
        java.lang.Object systemService = this.context.getSystemService("phone");
        if (systemService instanceof android.telephony.TelephonyManager) {
            return (android.telephony.TelephonyManager) systemService;
        }
        return null;
    }

    private final android.net.ConnectivityManager getConnectivityManager() {
        java.lang.Object systemService = this.context.getSystemService("connectivity");
        if (systemService instanceof android.net.ConnectivityManager) {
            return (android.net.ConnectivityManager) systemService;
        }
        return null;
    }

    private final android.media.AudioManager getAudioManager() {
        java.lang.Object systemService = this.context.getSystemService("audio");
        if (systemService instanceof android.media.AudioManager) {
            return (android.media.AudioManager) systemService;
        }
        return null;
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    public boolean hasInternet() {
        return hasInternetConnectionM();
    }

    private final boolean hasInternetConnection() {
        android.net.NetworkInfo activeNetworkInfo;
        android.net.ConnectivityManager connectivityManager = getConnectivityManager();
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? false : true;
    }

    private final boolean hasInternetConnectionM() {
        android.net.NetworkCapabilities networkCapabilities;
        android.net.ConnectivityManager connectivityManager = getConnectivityManager();
        return connectivityManager != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())) != null && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16);
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    public kotlinx.coroutines.flow.Flow<com.unity3d.ads.core.data.datasource.VolumeSettingsChange> getVolumeSettingsChange() {
        return this.volumeSettingsChange;
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    public java.lang.String getOrientation() {
        return getScreenHeight() > getScreenWidth() ? com.ironsource.y8.h.D : com.ironsource.y8.h.C;
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    public java.lang.String getConnectionTypeStr() {
        int i = com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.WhenMappings.$EnumSwitchMapping$1[getConnectionType().ordinal()];
        if (i != 1) {
            return i != 2 ? "none" : com.json.u8.g;
        }
        return com.json.u8.b;
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    public int getCurrentUiTheme() {
        return this.context.getResources().getConfiguration().uiMode;
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    public java.util.List<java.lang.String> getLocaleList() {
        android.os.LocaleList locales = this.context.getResources().getConfiguration().getLocales();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locales, "context.resources.configuration.locales");
        int size = locales.size();
        java.util.ArrayList arrayList = new java.util.ArrayList(size);
        for (int i = 0; i < size; i++) {
            java.lang.String string = locales.get(i).toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "locales[it].toString()");
            arrayList.add(string);
        }
        return arrayList;
    }

    private final boolean getAirplaneMode() {
        try {
            return android.provider.Settings.Global.getInt(this.context.getContentResolver(), "airplane_mode_on", 0) != 0;
        } catch (java.lang.Throwable th) {
            com.unity3d.services.core.log.DeviceLog.error("Problems fetching airplane mode status", th.getMessage());
            return false;
        }
    }

    public final int getChargingType() {
        android.content.Intent intentRegisterReceiver = this.context.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return intentRegisterReceiver.getIntExtra("plugged", -1);
        }
        return -1;
    }

    public final boolean getStayOnWhilePluggedIn() {
        try {
            return android.provider.Settings.Global.getInt(this.context.getContentResolver(), "stay_on_while_plugged_in", 0) != 0;
        } catch (java.lang.Throwable th) {
            com.unity3d.services.core.log.DeviceLog.error("Problems fetching stay on while plugged in status", th.getMessage());
            return false;
        }
    }

    public final boolean getIsSdCardPresent() {
        return kotlin.jvm.internal.Intrinsics.areEqual(android.os.Environment.getExternalStorageState(), "mounted");
    }

    public final gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports getNetworkCapabilityTransports() {
        android.net.Network activeNetwork;
        gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder result = gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.newBuilder();
        if (android.os.Build.VERSION.SDK_INT < 31) {
            gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports networkCapabilityTransportsBuild = result.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(networkCapabilityTransportsBuild, "result.build()");
            return networkCapabilityTransportsBuild;
        }
        java.lang.Object systemService = this.context.getSystemService("connectivity");
        android.net.ConnectivityManager connectivityManager = systemService instanceof android.net.ConnectivityManager ? (android.net.ConnectivityManager) systemService : null;
        if (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null) {
            gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports networkCapabilityTransportsBuild2 = result.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(networkCapabilityTransportsBuild2, "result.build()");
            return networkCapabilityTransportsBuild2;
        }
        android.net.NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities == null) {
            gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports networkCapabilityTransportsBuild3 = result.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(networkCapabilityTransportsBuild3, "result.build()");
            return networkCapabilityTransportsBuild3;
        }
        boolean zHasTransport = networkCapabilities.hasTransport(1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(result, "result");
        result.setWifi(zHasTransport);
        result.setCellular(networkCapabilities.hasTransport(0));
        result.setVpn(networkCapabilities.hasTransport(4));
        result.setEthernet(networkCapabilities.hasTransport(3));
        result.setWifiAware(networkCapabilities.hasTransport(5));
        result.setLowpan(networkCapabilities.hasTransport(6));
        result.setBluetooth(networkCapabilities.hasTransport(2));
        gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports networkCapabilityTransportsBuild4 = result.build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(networkCapabilityTransportsBuild4, "result.build()");
        return networkCapabilityTransportsBuild4;
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo fetch() {
        gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.Companion companion = gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.INSTANCE;
        gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builderNewBuilder = gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setLanguage(getLanguage());
        dsl_create.setNetworkOperator(getNetworkOperator());
        dsl_create.setNetworkOperatorName(getNetworkOperatorName());
        dsl_create.setFreeDiskSpace(getUsableSpace(this.context.getExternalFilesDir(null)));
        dsl_create.setFreeRamMemory(getFreeMemory());
        dsl_create.setWiredHeadset(isWiredHeadsetOn());
        dsl_create.setTimeZone(getTimeZone());
        dsl_create.setTimeZoneOffset(getTimeZoneOffset());
        dsl_create.setLimitedTracking(isLimitAdTrackingEnabled());
        dsl_create.setLimitedOpenAdTracking(isLimitOpenAdTrackingEnabled());
        dsl_create.setBatteryLevel(getBatteryLevel());
        dsl_create.setBatteryStatus(getBatteryStatus());
        dsl_create.setConnectionType(getConnectionType());
        dsl_create.setAndroid(fetchAndroidDynamicDeviceInfo());
        dsl_create.setAppActive(isAppActive());
        dsl_create.setScreenWidth(getScreenWidth());
        dsl_create.setScreenHeight(getScreenHeight());
        return dsl_create._build();
    }
}
