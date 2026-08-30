package com.adjust.sdk;

/* JADX INFO: loaded from: classes3.dex */
class DeviceInfo {
    private static final java.lang.String OFFICIAL_FACEBOOK_SIGNATURE = "30820268308201d102044a9c4610300d06092a864886f70d0101040500307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e3020170d3039303833313231353231365a180f32303530303932353231353231365a307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e30819f300d06092a864886f70d010101050003818d0030818902818100c207d51df8eb8c97d93ba0c8c1002c928fab00dc1b42fca5e66e99cc3023ed2d214d822bc59e8e35ddcf5f44c7ae8ade50d7e0c434f500e6c131f4a2834f987fc46406115de2018ebbb0d5a3c261bd97581ccfef76afc7135a6d59e8855ecd7eacc8f8737e794c60a761c536b72b11fac8e603f5da1a2d54aa103b8a13c0dbc10203010001300d06092a864886f70d0101040500038181005ee9be8bcbb250648d3b741290a82a1c9dc2e76a0af2f2228f1d9f9c4007529c446a70175c5a900d5141812866db46be6559e2141616483998211f4a673149fb2232a10d247663b26a9031e15f84bc1c74d141ff98a02d76f85b2c8ab2571b6469b232d8e768a7f7ca04f7abe4a775615916c07940656b58717457b42bd928a2";
    java.lang.String abi;
    java.lang.String androidId;
    java.lang.String apiLevel;
    java.lang.String appInstallTime;
    java.lang.String appSetId;
    java.lang.String appUpdateTime;
    java.lang.String appVersion;
    java.lang.String buildName;
    java.lang.String clientSdk;
    int connectivityType;
    java.lang.String country;
    java.lang.String deviceManufacturer;
    java.lang.String deviceName;
    java.lang.String deviceType;
    java.lang.String displayHeight;
    java.lang.String displayWidth;
    java.lang.String fbAttributionId;
    java.lang.String fireAdId;
    java.lang.Boolean fireTrackingEnabled;
    java.lang.String hardwareName;
    java.util.Map<java.lang.String, java.lang.String> imeiParameters;
    boolean isGooglePlayGamesForPC;
    java.lang.Boolean isTrackingEnabled;
    java.lang.String language;
    java.lang.String mcc;
    java.lang.String mnc;
    java.util.Map<java.lang.String, java.lang.String> oaidParameters;
    java.lang.String osName;
    java.lang.String osVersion;
    java.lang.String packageName;
    java.lang.String playAdId;
    java.lang.String playAdIdSource;
    java.lang.String screenDensity;
    java.lang.String screenFormat;
    java.lang.String screenSize;
    int uiMode;
    int playAdIdAttempt = -1;
    private boolean nonGoogleIdsReadOnce = false;
    private boolean playIdsReadOnce = false;
    private boolean otherDeviceIdsParamsReadOnce = false;

    public static class UtilDeviceIds {
        private UtilDeviceIds() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int getConnectivityType(android.content.Context context, com.adjust.sdk.ILogger iLogger) {
            android.net.NetworkCapabilities networkCapabilities;
            try {
                android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager == null) {
                    return -1;
                }
                int i = android.os.Build.VERSION.SDK_INT;
                android.net.Network activeNetwork = connectivityManager.getActiveNetwork();
                if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
                    return -1;
                }
                if (networkCapabilities.hasTransport(1)) {
                    return 1;
                }
                if (networkCapabilities.hasTransport(0)) {
                    return 0;
                }
                if (networkCapabilities.hasTransport(3)) {
                    return 3;
                }
                if (networkCapabilities.hasTransport(4)) {
                    return 4;
                }
                if (networkCapabilities.hasTransport(2)) {
                    return 2;
                }
                if (i < 26) {
                    return -1;
                }
                if (networkCapabilities.hasTransport(5)) {
                    return 5;
                }
                if (i >= 27 && networkCapabilities.hasTransport(6)) {
                    return 6;
                }
            } catch (java.lang.Exception e) {
                iLogger.warn("Couldn't read connectivity type (%s)", e.getMessage());
            }
            return -1;
        }

        private static java.lang.String getFireAdvertisingId(android.content.ContentResolver contentResolver) {
            if (contentResolver == null) {
                return null;
            }
            try {
                return android.provider.Settings.Secure.getString(contentResolver, "advertising_id");
            } catch (java.lang.Exception unused) {
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void getFireAdvertisingIdAsync(android.content.ContentResolver contentResolver, com.adjust.sdk.OnAmazonAdIdReadListener onAmazonAdIdReadListener) {
            if (contentResolver == null) {
                com.adjust.sdk.AdjustFactory.getLogger().error("contentResolver could not be retrieved", new java.lang.Object[0]);
                return;
            }
            try {
                onAmazonAdIdReadListener.onAmazonAdIdRead(android.provider.Settings.Secure.getString(contentResolver, "advertising_id"));
            } catch (java.lang.Exception e) {
                com.adjust.sdk.AdjustFactory.getLogger().error(e.getMessage(), new java.lang.Object[0]);
            }
        }

        private static java.lang.Boolean getFireTrackingEnabled(android.content.ContentResolver contentResolver) {
            try {
                return java.lang.Boolean.valueOf(android.provider.Settings.Secure.getInt(contentResolver, "limit_ad_tracking") == 0);
            } catch (java.lang.Exception unused) {
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static java.util.Map<java.lang.String, java.lang.String> getImeiParameters(com.adjust.sdk.AdjustConfig adjustConfig, com.adjust.sdk.ILogger iLogger) {
            if (adjustConfig.coppaComplianceEnabled || adjustConfig.playStoreKidsComplianceEnabled) {
                return null;
            }
            return com.adjust.sdk.Reflection.getImeiParameters(adjustConfig.context, iLogger);
        }

        public static java.lang.String getMcc(android.content.Context context, com.adjust.sdk.ILogger iLogger) {
            try {
                java.lang.String networkOperator = ((android.telephony.TelephonyManager) context.getSystemService("phone")).getNetworkOperator();
                if (!android.text.TextUtils.isEmpty(networkOperator)) {
                    return networkOperator.substring(0, 3);
                }
                com.adjust.sdk.AdjustFactory.getLogger().warn("Couldn't receive networkOperator string to read MCC", new java.lang.Object[0]);
                return null;
            } catch (java.lang.Exception unused) {
                com.adjust.sdk.AdjustFactory.getLogger().warn("Couldn't return mcc", new java.lang.Object[0]);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static java.lang.String getMnc(android.content.Context context, com.adjust.sdk.ILogger iLogger) {
            try {
                java.lang.String networkOperator = ((android.telephony.TelephonyManager) context.getSystemService("phone")).getNetworkOperator();
                if (!android.text.TextUtils.isEmpty(networkOperator)) {
                    return networkOperator.substring(3);
                }
                com.adjust.sdk.AdjustFactory.getLogger().warn("Couldn't receive networkOperator string to read MNC", new java.lang.Object[0]);
                return null;
            } catch (java.lang.Exception unused) {
                iLogger.warn("Couldn't return mnc", new java.lang.Object[0]);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static java.util.Map<java.lang.String, java.lang.String> getOaidParameters(com.adjust.sdk.AdjustConfig adjustConfig, com.adjust.sdk.ILogger iLogger) {
            if (adjustConfig.coppaComplianceEnabled || adjustConfig.playStoreKidsComplianceEnabled) {
                return null;
            }
            return com.adjust.sdk.Reflection.getOaidParameters(adjustConfig.context, iLogger);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static java.lang.String getFireAdvertisingId(com.adjust.sdk.AdjustConfig adjustConfig) {
            if (adjustConfig.coppaComplianceEnabled || adjustConfig.playStoreKidsComplianceEnabled) {
                return null;
            }
            return getFireAdvertisingId(adjustConfig.context.getContentResolver());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static java.lang.Boolean getFireTrackingEnabled(com.adjust.sdk.AdjustConfig adjustConfig) {
            if (adjustConfig.coppaComplianceEnabled || adjustConfig.playStoreKidsComplianceEnabled) {
                return null;
            }
            return getFireTrackingEnabled(adjustConfig.context.getContentResolver());
        }
    }

    public DeviceInfo(com.adjust.sdk.AdjustConfig adjustConfig) {
        android.content.Context context = adjustConfig.context;
        android.content.res.Resources resources = context.getResources();
        android.util.DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        android.content.res.Configuration configuration = resources.getConfiguration();
        java.util.Locale locale = com.adjust.sdk.Util.getLocale(configuration);
        android.content.pm.PackageInfo packageInfo = getPackageInfo(context);
        int i = configuration.screenLayout;
        this.isGooglePlayGamesForPC = com.adjust.sdk.Util.isGooglePlayGamesForPC(context);
        this.packageName = getPackageName(context);
        this.appVersion = getAppVersion(packageInfo);
        this.deviceType = getDeviceType(configuration);
        this.deviceName = getDeviceName();
        this.deviceManufacturer = getDeviceManufacturer();
        this.osName = getOsName();
        this.osVersion = getOsVersion();
        this.apiLevel = getApiLevel();
        this.language = getLanguage(locale);
        this.country = getCountry(locale);
        this.screenSize = getScreenSize(i);
        this.screenFormat = getScreenFormat(i);
        this.screenDensity = getScreenDensity(displayMetrics);
        this.displayWidth = getDisplayWidth(displayMetrics);
        this.displayHeight = getDisplayHeight(displayMetrics);
        this.clientSdk = getClientSdk(adjustConfig.sdkPrefix);
        this.fbAttributionId = getFacebookAttributionId(context);
        this.hardwareName = getHardwareName();
        this.abi = getABI();
        this.buildName = getBuildName();
        this.appInstallTime = getAppInstallTime(packageInfo);
        this.appUpdateTime = getAppUpdateTime(packageInfo);
        this.uiMode = getDeviceUiMode(configuration);
        if (com.adjust.sdk.Util.canReadPlayIds(adjustConfig)) {
            this.appSetId = com.adjust.sdk.Reflection.getAppSetId(context);
        }
    }

    private java.lang.String getABI() {
        java.lang.String[] supportedAbis = com.adjust.sdk.Util.getSupportedAbis();
        return (supportedAbis == null || supportedAbis.length == 0) ? com.adjust.sdk.Util.getCpuAbi() : supportedAbis[0];
    }

    private java.lang.String getApiLevel() {
        return "" + android.os.Build.VERSION.SDK_INT;
    }

    private java.lang.String getAppInstallTime(android.content.pm.PackageInfo packageInfo) {
        try {
            return com.adjust.sdk.Util.dateFormatter.format(new java.util.Date(packageInfo.firstInstallTime));
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    private java.lang.String getAppUpdateTime(android.content.pm.PackageInfo packageInfo) {
        try {
            return com.adjust.sdk.Util.dateFormatter.format(new java.util.Date(packageInfo.lastUpdateTime));
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    private java.lang.String getAppVersion(android.content.pm.PackageInfo packageInfo) {
        try {
            return packageInfo.versionName;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    private java.lang.String getBuildName() {
        return android.os.Build.ID;
    }

    private java.lang.String getClientSdk(java.lang.String str) {
        return str == null ? com.adjust.sdk.Constants.CLIENT_SDK : com.adjust.sdk.Util.formatString("%s@%s", str, com.adjust.sdk.Constants.CLIENT_SDK);
    }

    private java.lang.String getCountry(java.util.Locale locale) {
        return locale.getCountry();
    }

    private java.lang.String getDeviceManufacturer() {
        return android.os.Build.MANUFACTURER;
    }

    private java.lang.String getDeviceName() {
        if (this.isGooglePlayGamesForPC) {
            return null;
        }
        return android.os.Build.MODEL;
    }

    private java.lang.String getDeviceType(android.content.res.Configuration configuration) {
        if (this.isGooglePlayGamesForPC) {
            return "pc";
        }
        if ((configuration.uiMode & 15) == 4) {
            return "tv";
        }
        int i = configuration.screenLayout & 15;
        if (i == 1 || i == 2) {
            return "phone";
        }
        if (i == 3 || i == 4) {
            return "tablet";
        }
        return null;
    }

    private int getDeviceUiMode(android.content.res.Configuration configuration) {
        return configuration.uiMode & 15;
    }

    private java.lang.String getDisplayHeight(android.util.DisplayMetrics displayMetrics) {
        return java.lang.String.valueOf(displayMetrics.heightPixels);
    }

    private java.lang.String getDisplayWidth(android.util.DisplayMetrics displayMetrics) {
        return java.lang.String.valueOf(displayMetrics.widthPixels);
    }

    private java.lang.String getFacebookAttributionId(android.content.Context context) {
        android.content.pm.Signature[] apkContentsSigners;
        android.database.Cursor cursorQuery;
        try {
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                android.content.pm.SigningInfo signingInfo = context.getPackageManager().getPackageInfo(com.facebook.ads.internal.util.common.FbValidationUtils.FB_PACKAGE, androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE).signingInfo;
                apkContentsSigners = signingInfo != null ? signingInfo.getApkContentsSigners() : null;
            } else {
                apkContentsSigners = context.getPackageManager().getPackageInfo(com.facebook.ads.internal.util.common.FbValidationUtils.FB_PACKAGE, 64).signatures;
            }
            if (apkContentsSigners == null || apkContentsSigners.length != 1 || !OFFICIAL_FACEBOOK_SIGNATURE.equals(apkContentsSigners[0].toCharsString()) || (cursorQuery = context.getContentResolver().query(android.net.Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider"), new java.lang.String[]{com.json.tk.SESSION_HISTORY_KEY_AD_ID}, null, null, null)) == null) {
                return null;
            }
            if (!cursorQuery.moveToFirst()) {
                cursorQuery.close();
                return null;
            }
            java.lang.String string = cursorQuery.getString(cursorQuery.getColumnIndex(com.json.tk.SESSION_HISTORY_KEY_AD_ID));
            cursorQuery.close();
            return string;
        } catch (java.lang.Exception unused) {
        }
        return null;
    }

    public static void getFireAdvertisingIdBypassConditions(android.content.ContentResolver contentResolver, com.adjust.sdk.OnAmazonAdIdReadListener onAmazonAdIdReadListener) {
        com.adjust.sdk.DeviceInfo.UtilDeviceIds.getFireAdvertisingIdAsync(contentResolver, onAmazonAdIdReadListener);
    }

    private java.lang.String getHardwareName() {
        return android.os.Build.DISPLAY;
    }

    private java.lang.String getLanguage(java.util.Locale locale) {
        return locale.getLanguage();
    }

    private java.lang.String getOsName() {
        return this.isGooglePlayGamesForPC ? "windows" : "android";
    }

    private java.lang.String getOsVersion() {
        if (this.isGooglePlayGamesForPC) {
            return null;
        }
        return android.os.Build.VERSION.RELEASE;
    }

    private android.content.pm.PackageInfo getPackageInfo(android.content.Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    private java.lang.String getPackageName(android.content.Context context) {
        return context.getPackageName();
    }

    private java.lang.String getScreenDensity(android.util.DisplayMetrics displayMetrics) {
        int i = displayMetrics.densityDpi;
        if (i == 0) {
            return null;
        }
        if (i < 140) {
            return com.adjust.sdk.Constants.LOW;
        }
        return i > 200 ? com.adjust.sdk.Constants.HIGH : "medium";
    }

    private java.lang.String getScreenFormat(int i) {
        int i2 = i & 48;
        if (i2 == 16) {
            return com.adjust.sdk.Constants.NORMAL;
        }
        if (i2 != 32) {
            return null;
        }
        return com.adjust.sdk.Constants.LONG;
    }

    private java.lang.String getScreenSize(int i) {
        int i2 = i & 15;
        if (i2 == 1) {
            return com.adjust.sdk.Constants.SMALL;
        }
        if (i2 == 2) {
            return com.adjust.sdk.Constants.NORMAL;
        }
        if (i2 == 3) {
            return com.adjust.sdk.Constants.LARGE;
        }
        if (i2 != 4) {
            return null;
        }
        return com.adjust.sdk.Constants.XLARGE;
    }

    public void reloadNonPlayIds(com.adjust.sdk.AdjustConfig adjustConfig) {
        if (com.adjust.sdk.Util.canReadNonPlayIds(adjustConfig) && !this.nonGoogleIdsReadOnce) {
            this.androidId = com.adjust.sdk.Util.getAndroidId(adjustConfig.context);
            this.nonGoogleIdsReadOnce = true;
        }
    }

    public void reloadOtherDeviceInfoParams(com.adjust.sdk.AdjustConfig adjustConfig, com.adjust.sdk.ILogger iLogger) {
        if (adjustConfig.isDeviceIdsReadingOnceEnabled && this.otherDeviceIdsParamsReadOnce) {
            return;
        }
        this.imeiParameters = com.adjust.sdk.DeviceInfo.UtilDeviceIds.getImeiParameters(adjustConfig, iLogger);
        this.oaidParameters = com.adjust.sdk.DeviceInfo.UtilDeviceIds.getOaidParameters(adjustConfig, iLogger);
        this.fireAdId = com.adjust.sdk.DeviceInfo.UtilDeviceIds.getFireAdvertisingId(adjustConfig);
        this.fireTrackingEnabled = com.adjust.sdk.DeviceInfo.UtilDeviceIds.getFireTrackingEnabled(adjustConfig);
        this.connectivityType = com.adjust.sdk.DeviceInfo.UtilDeviceIds.getConnectivityType(adjustConfig.context, iLogger);
        this.mcc = com.adjust.sdk.DeviceInfo.UtilDeviceIds.getMcc(adjustConfig.context, iLogger);
        this.mnc = com.adjust.sdk.DeviceInfo.UtilDeviceIds.getMnc(adjustConfig.context, iLogger);
        this.otherDeviceIdsParamsReadOnce = true;
    }

    public void reloadPlayIds(com.adjust.sdk.AdjustConfig adjustConfig) {
        if (this.playIdsReadOnce && adjustConfig.isDeviceIdsReadingOnceEnabled) {
            if (com.adjust.sdk.Util.canReadPlayIds(adjustConfig)) {
                return;
            }
            this.playAdId = null;
            this.isTrackingEnabled = null;
            this.playAdIdSource = null;
            this.playAdIdAttempt = -1;
            return;
        }
        this.playAdId = null;
        this.isTrackingEnabled = null;
        this.playAdIdSource = null;
        this.playAdIdAttempt = -1;
        if (com.adjust.sdk.Util.canReadPlayIds(adjustConfig)) {
            android.content.Context context = adjustConfig.context;
            if (com.adjust.sdk.Reflection.isAppRunningInSamsungCloudEnvironment(context, adjustConfig.logger)) {
                this.playAdId = com.adjust.sdk.Reflection.getSamsungCloudDevGoogleAdId(context, adjustConfig.logger);
                this.playAdIdSource = "samsung_cloud_sdk";
                this.playIdsReadOnce = true;
            }
            java.lang.String str = this.playAdId;
            java.lang.Boolean bool = this.isTrackingEnabled;
            for (int i = 1; i <= 3; i++) {
                try {
                    com.adjust.sdk.GooglePlayServicesClient.GooglePlayServicesInfo googlePlayServicesInfo = com.adjust.sdk.GooglePlayServicesClient.getGooglePlayServicesInfo(context, i * 3000);
                    if (this.playAdId == null) {
                        this.playAdId = googlePlayServicesInfo.getGpsAdid();
                        this.playIdsReadOnce = true;
                    }
                    if (this.isTrackingEnabled == null) {
                        this.isTrackingEnabled = googlePlayServicesInfo.isTrackingEnabled();
                    }
                    if (this.playAdId != null && this.isTrackingEnabled != null) {
                        this.playAdIdSource = androidx.core.app.NotificationCompat.CATEGORY_SERVICE;
                        this.playAdIdAttempt = i;
                        return;
                    }
                } catch (java.lang.Exception unused) {
                }
            }
            for (int i2 = 1; i2 <= 3; i2++) {
                java.lang.Object advertisingInfoObject = com.adjust.sdk.Util.getAdvertisingInfoObject(context, 11000L);
                if (advertisingInfoObject != null) {
                    if (this.playAdId == null) {
                        this.playAdId = com.adjust.sdk.Util.getPlayAdId(context, advertisingInfoObject, 1000L);
                        this.playIdsReadOnce = true;
                    }
                    if (this.isTrackingEnabled == null) {
                        this.isTrackingEnabled = com.adjust.sdk.Util.isPlayTrackingEnabled(context, advertisingInfoObject, 1000L);
                    }
                    if (this.playAdId != null && this.isTrackingEnabled != null) {
                        this.playAdIdSource = "library";
                        this.playAdIdAttempt = i2;
                        return;
                    }
                }
            }
            if (this.playAdId == null) {
                this.playAdId = str;
                this.playIdsReadOnce = true;
            }
            if (this.isTrackingEnabled == null) {
                this.isTrackingEnabled = bool;
            }
        }
    }
}
