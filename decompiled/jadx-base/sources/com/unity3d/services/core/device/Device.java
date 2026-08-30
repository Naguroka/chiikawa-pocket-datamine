package com.unity3d.services.core.device;

/* JADX INFO: loaded from: classes6.dex */
public class Device {
    private static java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Boolean> _reportedWarning = new java.util.concurrent.ConcurrentHashMap<>();
    private static com.unity3d.services.core.request.metrics.SDKMetricsSender sdkMetricsSender = (com.unity3d.services.core.request.metrics.SDKMetricsSender) com.unity3d.services.core.misc.Utilities.getService(com.unity3d.services.core.request.metrics.SDKMetricsSender.class);

    public enum MemoryInfoType {
        TOTAL_MEMORY,
        FREE_MEMORY
    }

    public static int getApiLevel() {
        return android.os.Build.VERSION.SDK_INT;
    }

    public static int getExtensionVersion() {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            return android.os.ext.SdkExtensions.getExtensionVersion(30);
        }
        return -1;
    }

    public static java.lang.String getOsVersion() {
        return android.os.Build.VERSION.RELEASE;
    }

    public static java.lang.String getManufacturer() {
        return android.os.Build.MANUFACTURER;
    }

    public static java.lang.String getModel() {
        return android.os.Build.MODEL;
    }

    public static int getScreenLayout() {
        if (com.unity3d.services.core.properties.ClientProperties.getApplicationContext() != null) {
            return com.unity3d.services.core.properties.ClientProperties.getApplicationContext().getResources().getConfiguration().screenLayout;
        }
        return -1;
    }

    public static java.lang.String getAdvertisingTrackingId() {
        return com.unity3d.services.core.device.AdvertisingId.getAdvertisingTrackingId();
    }

    public static boolean isLimitAdTrackingEnabled() {
        return com.unity3d.services.core.device.AdvertisingId.getLimitedAdTracking();
    }

    public static java.lang.String getOpenAdvertisingTrackingId() {
        return com.unity3d.services.core.device.OpenAdvertisingId.getOpenAdvertisingTrackingId();
    }

    public static boolean isLimitOpenAdTrackingEnabled() {
        return com.unity3d.services.core.device.OpenAdvertisingId.getLimitedOpenAdTracking();
    }

    public static boolean isUsingWifi() {
        android.net.ConnectivityManager connectivityManager;
        if (com.unity3d.services.core.properties.ClientProperties.getApplicationContext() == null || (connectivityManager = (android.net.ConnectivityManager) com.unity3d.services.core.properties.ClientProperties.getApplicationContext().getSystemService("connectivity")) == null) {
            return false;
        }
        android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) com.unity3d.services.core.properties.ClientProperties.getApplicationContext().getSystemService("phone");
        android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && connectivityManager.getBackgroundDataSetting() && connectivityManager.getActiveNetworkInfo().isConnected() && telephonyManager != null && activeNetworkInfo.getType() == 1 && activeNetworkInfo.isConnected();
    }

    public static java.lang.String getIdfi() {
        java.lang.String string = com.unity3d.services.core.preferences.AndroidPreferences.getString("unityads-installinfo", com.unity3d.services.UnityAdsConstants.Preferences.PREF_KEY_IDFI);
        if (string == null) {
            string = getAuid();
        }
        if (string != null) {
            return string;
        }
        java.lang.String uniqueEventId = getUniqueEventId();
        com.unity3d.services.core.preferences.AndroidPreferences.setString("unityads-installinfo", com.unity3d.services.UnityAdsConstants.Preferences.PREF_KEY_IDFI, uniqueEventId);
        return uniqueEventId;
    }

    public static java.lang.String getAuid() {
        return com.unity3d.services.core.preferences.AndroidPreferences.getString("supersonic_shared_preferen", "auid");
    }

    public static java.lang.String getConnectionType() {
        if (isUsingWifi()) {
            return com.json.u8.b;
        }
        return isActiveNetworkConnected() ? com.json.u8.g : "none";
    }

    public static int getNetworkType() {
        if (com.unity3d.services.core.properties.ClientProperties.getApplicationContext() == null) {
            return -1;
        }
        try {
            return ((android.telephony.TelephonyManager) com.unity3d.services.core.properties.ClientProperties.getApplicationContext().getSystemService("phone")).getNetworkType();
        } catch (java.lang.SecurityException unused) {
            if (_reportedWarning.containsKey("getNetworkType")) {
                return -1;
            }
            com.unity3d.services.core.log.DeviceLog.warning("Unity Ads was not able to get current network type due to missing permission");
            _reportedWarning.put("getNetworkType", true);
            return -1;
        }
    }

    public static boolean getNetworkMetered() {
        android.net.ConnectivityManager connectivityManager;
        if (com.unity3d.services.core.properties.ClientProperties.getApplicationContext() == null || (connectivityManager = (android.net.ConnectivityManager) com.unity3d.services.core.properties.ClientProperties.getApplicationContext().getSystemService("connectivity")) == null) {
            return false;
        }
        return connectivityManager.isActiveNetworkMetered();
    }

    public static java.lang.String getNetworkOperator() {
        return com.unity3d.services.core.properties.ClientProperties.getApplicationContext() != null ? ((android.telephony.TelephonyManager) com.unity3d.services.core.properties.ClientProperties.getApplicationContext().getSystemService("phone")).getNetworkOperator() : "";
    }

    public static java.lang.String getNetworkOperatorName() {
        return com.unity3d.services.core.properties.ClientProperties.getApplicationContext() != null ? ((android.telephony.TelephonyManager) com.unity3d.services.core.properties.ClientProperties.getApplicationContext().getSystemService("phone")).getNetworkOperatorName() : "";
    }

    public static java.lang.String getNetworkCountryISO() {
        return com.unity3d.services.core.properties.ClientProperties.getApplicationContext() != null ? ((android.telephony.TelephonyManager) com.unity3d.services.core.properties.ClientProperties.getApplicationContext().getSystemService("phone")).getNetworkCountryIso() : "";
    }

    public static float getDisplayMetricDensity() {
        if (com.unity3d.services.core.properties.ClientProperties.getApplicationContext() != null) {
            return com.unity3d.services.core.properties.ClientProperties.getApplicationContext().getResources().getDisplayMetrics().density;
        }
        return -1.0f;
    }

    public static int getScreenDensity() {
        if (com.unity3d.services.core.properties.ClientProperties.getApplicationContext() != null) {
            return com.unity3d.services.core.properties.ClientProperties.getApplicationContext().getResources().getDisplayMetrics().densityDpi;
        }
        return -1;
    }

    public static int getScreenWidth() {
        if (com.unity3d.services.core.properties.ClientProperties.getApplicationContext() != null) {
            return com.unity3d.services.core.properties.ClientProperties.getApplicationContext().getResources().getDisplayMetrics().widthPixels;
        }
        return -1;
    }

    public static int getScreenHeight() {
        if (com.unity3d.services.core.properties.ClientProperties.getApplicationContext() != null) {
            return com.unity3d.services.core.properties.ClientProperties.getApplicationContext().getResources().getDisplayMetrics().heightPixels;
        }
        return -1;
    }

    public static boolean isActiveNetworkConnected() {
        android.net.ConnectivityManager connectivityManager;
        android.net.NetworkInfo activeNetworkInfo;
        return (com.unity3d.services.core.properties.ClientProperties.getApplicationContext() == null || (connectivityManager = (android.net.ConnectivityManager) com.unity3d.services.core.properties.ClientProperties.getApplicationContext().getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? false : true;
    }

    public static java.lang.String getUniqueEventId() {
        return java.util.UUID.randomUUID().toString();
    }

    public static boolean isWiredHeadsetOn() {
        if (com.unity3d.services.core.properties.ClientProperties.getApplicationContext() != null) {
            return ((android.media.AudioManager) com.unity3d.services.core.properties.ClientProperties.getApplicationContext().getSystemService("audio")).isWiredHeadsetOn();
        }
        return false;
    }

    public static java.lang.String getSystemProperty(java.lang.String str, java.lang.String str2) {
        if (str2 != null) {
            return java.lang.System.getProperty(str, str2);
        }
        return java.lang.System.getProperty(str);
    }

    public static int getRingerMode() {
        if (com.unity3d.services.core.properties.ClientProperties.getApplicationContext() == null) {
            return -1;
        }
        android.media.AudioManager audioManager = (android.media.AudioManager) com.unity3d.services.core.properties.ClientProperties.getApplicationContext().getSystemService("audio");
        if (audioManager != null) {
            return audioManager.getRingerMode();
        }
        return -2;
    }

    public static int getStreamVolume(int i) {
        if (com.unity3d.services.core.properties.ClientProperties.getApplicationContext() == null) {
            return -1;
        }
        android.media.AudioManager audioManager = (android.media.AudioManager) com.unity3d.services.core.properties.ClientProperties.getApplicationContext().getSystemService("audio");
        if (audioManager != null) {
            return audioManager.getStreamVolume(i);
        }
        return -2;
    }

    public static int getStreamMaxVolume(int i) {
        if (com.unity3d.services.core.properties.ClientProperties.getApplicationContext() == null) {
            return -1;
        }
        android.media.AudioManager audioManager = (android.media.AudioManager) com.unity3d.services.core.properties.ClientProperties.getApplicationContext().getSystemService("audio");
        if (audioManager != null) {
            return audioManager.getStreamMaxVolume(i);
        }
        return -2;
    }

    public static int getScreenBrightness() {
        if (com.unity3d.services.core.properties.ClientProperties.getApplicationContext() != null) {
            return android.provider.Settings.System.getInt(com.unity3d.services.core.properties.ClientProperties.getApplicationContext().getContentResolver(), "screen_brightness", -1);
        }
        return -1;
    }

    public static long getFreeSpace(java.io.File file) {
        if (file == null || !file.exists()) {
            return -1L;
        }
        return java.lang.Math.round(file.getFreeSpace() / 1024);
    }

    public static long getTotalSpace(java.io.File file) {
        if (file == null || !file.exists()) {
            return -1L;
        }
        return java.lang.Math.round(file.getTotalSpace() / 1024);
    }

    public static float getBatteryLevel() {
        android.content.Intent intentRegisterReceiver;
        if (com.unity3d.services.core.properties.ClientProperties.getApplicationContext() == null || (intentRegisterReceiver = com.unity3d.services.core.properties.ClientProperties.getApplicationContext().registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"))) == null) {
            return -1.0f;
        }
        return intentRegisterReceiver.getIntExtra("level", -1) / intentRegisterReceiver.getIntExtra("scale", -1);
    }

    public static int getBatteryStatus() {
        android.content.Intent intentRegisterReceiver;
        if (com.unity3d.services.core.properties.ClientProperties.getApplicationContext() == null || (intentRegisterReceiver = com.unity3d.services.core.properties.ClientProperties.getApplicationContext().registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"))) == null) {
            return -1;
        }
        return intentRegisterReceiver.getIntExtra("status", -1);
    }

    public static long getTotalMemory() {
        return getMemoryInfo(com.unity3d.services.core.device.Device.MemoryInfoType.TOTAL_MEMORY);
    }

    public static long getFreeMemory() {
        return getMemoryInfo(com.unity3d.services.core.device.Device.MemoryInfoType.FREE_MEMORY);
    }

    /* JADX INFO: renamed from: com.unity3d.services.core.device.Device$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$services$core$device$Device$MemoryInfoType;

        static {
            int[] iArr = new int[com.unity3d.services.core.device.Device.MemoryInfoType.values().length];
            $SwitchMap$com$unity3d$services$core$device$Device$MemoryInfoType = iArr;
            try {
                iArr[com.unity3d.services.core.device.Device.MemoryInfoType.TOTAL_MEMORY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$unity3d$services$core$device$Device$MemoryInfoType[com.unity3d.services.core.device.Device.MemoryInfoType.FREE_MEMORY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private static long getMemoryInfo(com.unity3d.services.core.device.Device.MemoryInfoType memoryInfoType) throws java.lang.Throwable {
        java.io.RandomAccessFile randomAccessFile;
        java.io.IOException e;
        int i = com.unity3d.services.core.device.Device.AnonymousClass1.$SwitchMap$com$unity3d$services$core$device$Device$MemoryInfoType[memoryInfoType.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = -1;
            }
        }
        java.io.RandomAccessFile randomAccessFile2 = null;
        java.lang.String line = null;
        try {
            randomAccessFile = new java.io.RandomAccessFile(com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MEM_INFO, com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
            for (int i3 = 0; i3 < i2; i3++) {
                try {
                    try {
                        line = randomAccessFile.readLine();
                    } catch (java.io.IOException e2) {
                        e = e2;
                        com.unity3d.services.core.log.DeviceLog.exception("Error while reading memory info: " + memoryInfoType, e);
                        if (randomAccessFile == null) {
                            return -1L;
                        }
                        try {
                            randomAccessFile.close();
                            return -1L;
                        } catch (java.io.IOException e3) {
                            com.unity3d.services.core.log.DeviceLog.exception("Error closing RandomAccessFile", e3);
                            return -1L;
                        }
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    randomAccessFile2 = randomAccessFile;
                    if (randomAccessFile2 != null) {
                        try {
                            randomAccessFile2.close();
                        } catch (java.io.IOException e4) {
                            com.unity3d.services.core.log.DeviceLog.exception("Error closing RandomAccessFile", e4);
                        }
                    }
                    throw th;
                }
            }
            long memoryValueFromString = getMemoryValueFromString(line);
            try {
                randomAccessFile.close();
            } catch (java.io.IOException e5) {
                com.unity3d.services.core.log.DeviceLog.exception("Error closing RandomAccessFile", e5);
            }
            return memoryValueFromString;
        } catch (java.io.IOException e6) {
            randomAccessFile = null;
            e = e6;
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (randomAccessFile2 != null) {
                randomAccessFile2.close();
            }
            throw th;
        }
    }

    private static long getMemoryValueFromString(java.lang.String str) {
        if (str == null) {
            return -1L;
        }
        java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("(\\d+)").matcher(str);
        java.lang.String strGroup = "";
        while (matcher.find()) {
            strGroup = matcher.group(1);
        }
        return java.lang.Long.parseLong(strGroup);
    }

    public static boolean isRooted() {
        try {
            return searchPathForBinary("su");
        } catch (java.lang.Exception e) {
            com.unity3d.services.core.log.DeviceLog.exception("Rooted check failed", e);
            return false;
        }
    }

    public static java.lang.Boolean isAdbEnabled() {
        if (getApiLevel() < 17) {
            return oldAdbStatus();
        }
        return newAdbStatus();
    }

    private static java.lang.Boolean oldAdbStatus() {
        try {
            return java.lang.Boolean.valueOf(1 == android.provider.Settings.Secure.getInt(com.unity3d.services.core.properties.ClientProperties.getApplicationContext().getContentResolver(), "adb_enabled", 0));
        } catch (java.lang.Exception e) {
            com.unity3d.services.core.log.DeviceLog.exception("Problems fetching adb enabled status", e);
            return null;
        }
    }

    private static java.lang.Boolean newAdbStatus() {
        try {
            return java.lang.Boolean.valueOf(1 == android.provider.Settings.Global.getInt(com.unity3d.services.core.properties.ClientProperties.getApplicationContext().getContentResolver(), "adb_enabled", 0));
        } catch (java.lang.Exception e) {
            com.unity3d.services.core.log.DeviceLog.exception("Problems fetching adb enabled status", e);
            return null;
        }
    }

    public static org.json.JSONObject getPackageInfo(android.content.pm.PackageManager packageManager) throws org.json.JSONException, android.content.pm.PackageManager.NameNotFoundException {
        java.lang.String appName = com.unity3d.services.core.properties.ClientProperties.getAppName();
        android.content.pm.PackageInfo packageInfo = packageManager.getPackageInfo(appName, 0);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("installer", packageManager.getInstallerPackageName(appName));
        jSONObject.put(com.ironsource.y8.i.X, packageInfo.firstInstallTime);
        jSONObject.put(com.ironsource.y8.i.V, packageInfo.lastUpdateTime);
        jSONObject.put("versionCode", packageInfo.versionCode);
        jSONObject.put("versionName", packageInfo.versionName);
        jSONObject.put(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, packageInfo.packageName);
        return jSONObject;
    }

    private static boolean searchPathForBinary(java.lang.String str) {
        java.io.File[] fileArrListFiles;
        for (java.lang.String str2 : java.lang.System.getenv(com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.ENVIRONMENT_VARIABLE_PATH).split(":")) {
            java.io.File file = new java.io.File(str2);
            if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                for (java.io.File file2 : fileArrListFiles) {
                    if (file2.getName().equals(str)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static java.lang.String getGLVersion() {
        android.app.ActivityManager activityManager;
        android.content.pm.ConfigurationInfo deviceConfigurationInfo;
        if (com.unity3d.services.core.properties.ClientProperties.getApplicationContext() == null || (activityManager = (android.app.ActivityManager) com.unity3d.services.core.properties.ClientProperties.getApplicationContext().getSystemService("activity")) == null || (deviceConfigurationInfo = activityManager.getDeviceConfigurationInfo()) == null) {
            return null;
        }
        return deviceConfigurationInfo.getGlEsVersion();
    }

    public static java.lang.String getApkDigest() throws java.lang.Exception {
        java.lang.String packageCodePath = com.unity3d.services.core.properties.ClientProperties.getApplicationContext().getPackageCodePath();
        long jNanoTime = java.lang.System.nanoTime();
        java.io.FileInputStream fileInputStream = null;
        try {
            java.io.File file = new java.io.File(packageCodePath);
            long length = file.length() / 1048576;
            java.io.FileInputStream fileInputStream2 = new java.io.FileInputStream(file);
            try {
                java.lang.String strSha256 = com.unity3d.services.core.misc.Utilities.Sha256(fileInputStream2);
                try {
                    fileInputStream2.close();
                } catch (java.io.IOException unused) {
                }
                if (java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(java.lang.System.nanoTime() - jNanoTime) > 5000) {
                    sdkMetricsSender.sendMetric(new com.unity3d.services.core.request.metrics.Metric("native_device_info_apk_digest_timeout", java.lang.Long.valueOf(length)));
                }
                sdkMetricsSender.sendMetric(new com.unity3d.services.core.request.metrics.Metric("native_device_info_apk_size", java.lang.Long.valueOf(length)));
                return strSha256;
            } catch (java.lang.Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (java.io.IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    public static java.lang.String getCertificateFingerprint() {
        try {
            android.content.pm.Signature[] signatureArr = com.unity3d.services.core.properties.ClientProperties.getApplicationContext().getPackageManager().getPackageInfo(com.unity3d.services.core.properties.ClientProperties.getApplicationContext().getPackageName(), 64).signatures;
            if (signatureArr == null || signatureArr.length < 1) {
                return null;
            }
            return com.unity3d.services.core.misc.Utilities.toHexString(java.security.MessageDigest.getInstance(com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1).digest(((java.security.cert.X509Certificate) java.security.cert.CertificateFactory.getInstance(com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509).generateCertificate(new java.io.ByteArrayInputStream(signatureArr[0].toByteArray()))).getEncoded()));
        } catch (java.lang.Exception e) {
            com.unity3d.services.core.log.DeviceLog.exception("Exception when signing certificate fingerprint", e);
            return null;
        }
    }

    public static java.lang.String getBoard() {
        return android.os.Build.BOARD;
    }

    public static java.lang.String getBootloader() {
        return android.os.Build.BOOTLOADER;
    }

    public static java.lang.String getBrand() {
        return android.os.Build.BRAND;
    }

    public static java.lang.String getDevice() {
        return android.os.Build.DEVICE;
    }

    public static java.lang.String getHardware() {
        return android.os.Build.HARDWARE;
    }

    public static java.lang.String getHost() {
        return android.os.Build.HOST;
    }

    public static java.lang.String getProduct() {
        return android.os.Build.PRODUCT;
    }

    public static java.lang.String getFingerprint() {
        return android.os.Build.FINGERPRINT;
    }

    public static java.util.ArrayList<java.lang.String> getSupportedAbis() {
        if (getApiLevel() < 21) {
            return getOldAbiList();
        }
        return getNewAbiList();
    }

    public static java.util.List<android.hardware.Sensor> getSensorList() {
        if (com.unity3d.services.core.properties.ClientProperties.getApplicationContext() != null) {
            return ((android.hardware.SensorManager) com.unity3d.services.core.properties.ClientProperties.getApplicationContext().getSystemService("sensor")).getSensorList(-1);
        }
        return null;
    }

    public static boolean isUSBConnected() {
        android.content.Intent intentRegisterReceiver;
        if (com.unity3d.services.core.properties.ClientProperties.getApplicationContext() == null || (intentRegisterReceiver = com.unity3d.services.core.properties.ClientProperties.getApplicationContext().registerReceiver(null, new android.content.IntentFilter(com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.INTENT_USB_STATE))) == null) {
            return false;
        }
        return intentRegisterReceiver.getBooleanExtra(com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.USB_EXTRA_CONNECTED, false);
    }

    public static long getCPUCount() {
        return java.lang.Runtime.getRuntime().availableProcessors();
    }

    public static long getUptime() {
        return android.os.SystemClock.uptimeMillis();
    }

    public static long getElapsedRealtime() {
        return android.os.SystemClock.elapsedRealtime();
    }

    public static java.lang.String getBuildId() {
        return android.os.Build.ID;
    }

    public static java.lang.String getBuildVersionIncremental() {
        return android.os.Build.VERSION.INCREMENTAL;
    }

    private static java.util.ArrayList<java.lang.String> getOldAbiList() {
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        arrayList.add(android.os.Build.CPU_ABI);
        arrayList.add(android.os.Build.CPU_ABI2);
        return arrayList;
    }

    private static java.util.ArrayList<java.lang.String> getNewAbiList() {
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        arrayList.addAll(java.util.Arrays.asList(android.os.Build.SUPPORTED_ABIS));
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static java.util.Map<java.lang.String, java.lang.String> getProcessInfo() throws java.lang.Throwable {
        java.io.RandomAccessFile randomAccessFile;
        java.io.IOException e;
        java.util.HashMap map = new java.util.HashMap();
        java.io.RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                try {
                    randomAccessFile = new java.io.RandomAccessFile(com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_PROCESS_INFO, com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
                    try {
                        map.put(com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.KEY_STAT_CONTENT, randomAccessFile.readLine());
                        randomAccessFile.close();
                    } catch (java.io.IOException e2) {
                        e = e2;
                        com.unity3d.services.core.log.DeviceLog.exception("Error while reading processor info: ", e);
                        if (randomAccessFile != null) {
                            randomAccessFile.close();
                        }
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    randomAccessFile2 = randomAccessFile;
                    if (randomAccessFile2 != null) {
                        try {
                            randomAccessFile2.close();
                        } catch (java.io.IOException e3) {
                            com.unity3d.services.core.log.DeviceLog.exception("Error closing RandomAccessFile", e3);
                        }
                    }
                    throw th;
                }
            } catch (java.io.IOException e4) {
                randomAccessFile = null;
                e = e4;
            } catch (java.lang.Throwable th2) {
                th = th2;
                if (randomAccessFile2 != null) {
                    randomAccessFile2.close();
                }
                throw th;
            }
        } catch (java.io.IOException e5) {
            com.unity3d.services.core.log.DeviceLog.exception("Error closing RandomAccessFile", e5);
        }
        return map;
    }

    public static boolean hasX264Decoder() {
        return selectAllDecodeCodecs("video/avc").size() > 0;
    }

    public static boolean hasX265Decoder() {
        return selectAllDecodeCodecs("video/hevc").size() > 0;
    }

    public static boolean hasAV1Decoder() {
        return selectAllDecodeCodecs("video/av01").size() > 0;
    }

    public static java.util.List<android.media.MediaCodecInfo> selectAllDecodeCodecs(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int codecCount = android.media.MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            android.media.MediaCodecInfo codecInfoAt = android.media.MediaCodecList.getCodecInfoAt(i);
            if (!codecInfoAt.isEncoder()) {
                for (java.lang.String str2 : codecInfoAt.getSupportedTypes()) {
                    if (str2.equalsIgnoreCase(str) && isHardwareAccelerated(codecInfoAt, str)) {
                        arrayList.add(codecInfoAt);
                    }
                }
            }
        }
        return arrayList;
    }

    private static boolean isHardwareAccelerated(android.media.MediaCodecInfo mediaCodecInfo, java.lang.String str) {
        if (getApiLevel() >= 29) {
            return isHardwareAcceleratedV29(mediaCodecInfo);
        }
        return !isSoftwareOnly(mediaCodecInfo, str);
    }

    private static boolean isHardwareAcceleratedV29(android.media.MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    private static boolean isSoftwareOnly(android.media.MediaCodecInfo mediaCodecInfo, java.lang.String str) {
        if (getApiLevel() >= 29) {
            return isSoftwareOnlyV29(mediaCodecInfo);
        }
        java.lang.String lowerCase = mediaCodecInfo.getName().toLowerCase();
        if (lowerCase.startsWith("arc.")) {
            return false;
        }
        return lowerCase.startsWith("omx.google.") || lowerCase.startsWith("omx.ffmpeg.") || (lowerCase.startsWith("omx.sec.") && lowerCase.contains(".sw.")) || lowerCase.equals("omx.qcom.video.decoder.hevcswvdec") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.") || !(lowerCase.startsWith("omx.") || lowerCase.startsWith("c2."));
    }

    private static boolean isSoftwareOnlyV29(android.media.MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }
}
