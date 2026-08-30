package com.adjust.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class PackageBuilder {
    private static com.adjust.sdk.ILogger logger = com.adjust.sdk.AdjustFactory.getLogger();
    private com.adjust.sdk.PackageBuilder.a activityStateCopy;
    private com.adjust.sdk.AdjustConfig adjustConfig;
    com.adjust.sdk.AdjustAttribution attribution;
    private long createdAt;
    java.lang.String deeplink;
    private com.adjust.sdk.DeviceInfo deviceInfo;
    java.util.Map<java.lang.String, java.lang.String> extraParameters;
    private com.adjust.sdk.GlobalParameters globalParameters;
    java.lang.Boolean googlePlayInstant;
    java.lang.String installVersion;
    com.adjust.sdk.ActivityHandler.InternalState internalState;
    java.lang.Boolean isClick;
    java.lang.String preinstallLocation;
    java.lang.String preinstallPayload;
    java.lang.String rawReferrer;
    java.lang.String referrer;
    java.lang.String referrerApi;
    java.lang.String reftag;
    long clickTimeInSeconds = -1;
    long clickTimeInMilliseconds = -1;
    long installBeginTimeInSeconds = -1;
    long clickTimeServerInSeconds = -1;
    long installBeginTimeServerInSeconds = -1;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f84a;
        public final int b;
        public final int c;
        public final long d;
        public final long e;
        public final java.lang.String f;
        public final java.lang.String g;

        public a(com.adjust.sdk.ActivityState activityState) {
            this.f84a = -1;
            this.b = -1;
            this.c = -1;
            this.d = -1L;
            this.e = -1L;
            this.f = null;
            this.g = null;
            if (activityState == null) {
                return;
            }
            this.f84a = activityState.eventCount;
            this.b = activityState.sessionCount;
            this.c = activityState.subsessionCount;
            this.d = activityState.timeSpent;
            this.e = activityState.sessionLength;
            this.f = activityState.uuid;
            this.g = activityState.pushToken;
        }
    }

    public PackageBuilder(com.adjust.sdk.AdjustConfig adjustConfig, com.adjust.sdk.DeviceInfo deviceInfo, com.adjust.sdk.ActivityState activityState, com.adjust.sdk.GlobalParameters globalParameters, long j) {
        this.createdAt = j;
        this.deviceInfo = deviceInfo;
        this.adjustConfig = adjustConfig;
        this.activityStateCopy = new com.adjust.sdk.PackageBuilder.a(activityState);
        this.globalParameters = globalParameters;
    }

    public static void addBoolean(java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str, java.lang.Boolean bool) {
        if (bool == null) {
            return;
        }
        addLong(map, str, bool.booleanValue() ? 1L : 0L);
    }

    private static void addDate(java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str, java.util.Date date) {
        if (date == null) {
            return;
        }
        addString(map, str, com.adjust.sdk.Util.dateFormatter.format(date));
    }

    private static void addDateInMilliseconds(java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str, long j) {
        if (j <= 0) {
            return;
        }
        addDate(map, str, new java.util.Date(j));
    }

    private static void addDateInSeconds(java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str, long j) {
        if (j <= 0) {
            return;
        }
        addDate(map, str, new java.util.Date(j * 1000));
    }

    public static void addDouble(java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str, double d) {
        if (d < 0.0d) {
            return;
        }
        addString(map, str, java.lang.Double.toString(d));
    }

    private static void addDoubleWithoutRounding(java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str, java.lang.Double d) {
        if (d == null) {
            return;
        }
        addString(map, str, java.lang.Double.toString(d.doubleValue()));
    }

    private static void addDuration(java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str, long j) {
        if (j < 0) {
            return;
        }
        addLong(map, str, (j + 500) / 1000);
    }

    private static void addInteger(java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str, java.lang.Integer num) {
        if (num == null) {
            return;
        }
        addString(map, str, java.lang.Integer.toString(num.intValue()));
    }

    public static void addJsonObject(java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str, org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        addString(map, str, jSONObject.toString());
    }

    public static void addLong(java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str, long j) {
        if (j < 0) {
            return;
        }
        addString(map, str, java.lang.Long.toString(j));
    }

    public static void addMapJson(java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str, java.util.Map map2) {
        if (map2 == null || map2.size() == 0) {
            return;
        }
        addString(map, str, new org.json.JSONObject(map2).toString());
    }

    public static void addString(java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }

    private void checkDeviceIds(java.util.Map<java.lang.String, java.lang.String> map) {
        if (map == null || map.containsKey("android_id") || map.containsKey("gps_adid") || map.containsKey("fire_adid") || map.containsKey("oaid") || map.containsKey("imei") || map.containsKey("meid") || map.containsKey("device_id") || map.containsKey("imeis") || map.containsKey("meids") || map.containsKey("device_ids")) {
            return;
        }
        com.adjust.sdk.AdjustConfig adjustConfig = this.adjustConfig;
        if (adjustConfig.coppaComplianceEnabled) {
            logger.info("Missing Device IDs. COPPA enabled.", new java.lang.Object[0]);
        } else if (adjustConfig.playStoreKidsComplianceEnabled) {
            logger.info("Missing Device IDs. Play store kids compliance enabled.", new java.lang.Object[0]);
        } else {
            logger.error("Missing Device IDs. Please check if Proguard is correctly set with Adjust SDK", new java.lang.Object[0]);
        }
    }

    private boolean containsFireIds(java.util.Map<java.lang.String, java.lang.String> map) {
        if (map == null) {
            return false;
        }
        return map.containsKey("fire_adid");
    }

    private boolean containsPlayIds(java.util.Map<java.lang.String, java.lang.String> map) {
        if (map == null) {
            return false;
        }
        return map.containsKey("gps_adid");
    }

    private java.util.Map<java.lang.String, java.lang.String> getAdRevenueParameters(com.adjust.sdk.AdjustAdRevenue adjustAdRevenue) {
        java.util.HashMap map = new java.util.HashMap();
        this.deviceInfo.reloadOtherDeviceInfoParams(this.adjustConfig, logger);
        java.util.Map<java.lang.String, java.lang.String> map2 = this.deviceInfo.imeiParameters;
        if (map2 != null) {
            map.putAll(map2);
        }
        java.util.Map<java.lang.String, java.lang.String> map3 = this.deviceInfo.oaidParameters;
        if (map3 != null) {
            map.putAll(map3);
        }
        addMapJson(map, com.adjust.sdk.Constants.CALLBACK_PARAMETERS, com.adjust.sdk.Util.mergeParameters(this.globalParameters.callbackParameters, adjustAdRevenue.callbackParameters, "Callback"));
        addMapJson(map, com.adjust.sdk.Constants.PARTNER_PARAMETERS, com.adjust.sdk.Util.mergeParameters(this.globalParameters.partnerParameters, adjustAdRevenue.partnerParameters, "Partner"));
        this.deviceInfo.reloadPlayIds(this.adjustConfig);
        addString(map, "android_uuid", this.activityStateCopy.f);
        addString(map, "gps_adid", this.deviceInfo.playAdId);
        addLong(map, "gps_adid_attempt", this.deviceInfo.playAdIdAttempt);
        addString(map, "gps_adid_src", this.deviceInfo.playAdIdSource);
        addBoolean(map, "tracking_enabled", this.deviceInfo.isTrackingEnabled);
        addString(map, "fire_adid", this.deviceInfo.fireAdId);
        addBoolean(map, "fire_tracking_enabled", this.deviceInfo.fireTrackingEnabled);
        addString(map, "google_app_set_id", this.deviceInfo.appSetId);
        if (!containsPlayIds(map) && !containsFireIds(map)) {
            logger.warn("Google Advertising ID or Fire Advertising ID not detected, fallback to non Google Play and Fire identifiers will take place", new java.lang.Object[0]);
            this.deviceInfo.reloadNonPlayIds(this.adjustConfig);
            addString(map, "android_id", this.deviceInfo.androidId);
        }
        addString(map, "api_level", this.deviceInfo.apiLevel);
        addString(map, "app_token", this.adjustConfig.appToken);
        addString(map, "app_version", this.deviceInfo.appVersion);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        addBoolean(map, "attribution_deeplink", bool);
        addLong(map, "connectivity_type", this.deviceInfo.connectivityType);
        addString(map, com.json.mediationsdk.impressionData.ImpressionData.IMPRESSION_DATA_KEY_COUNTRY, this.deviceInfo.country);
        addString(map, "cpu_type", this.deviceInfo.abi);
        addDateInMilliseconds(map, "created_at", this.createdAt);
        addString(map, "default_tracker", this.adjustConfig.defaultTracker);
        addBoolean(map, "needs_cost", this.adjustConfig.isCostDataInAttributionEnabled);
        addString(map, "device_manufacturer", this.deviceInfo.deviceManufacturer);
        addString(map, "device_name", this.deviceInfo.deviceName);
        addString(map, "device_type", this.deviceInfo.deviceType);
        addLong(map, "ui_mode", this.deviceInfo.uiMode);
        addString(map, "display_height", this.deviceInfo.displayHeight);
        addString(map, "display_width", this.deviceInfo.displayWidth);
        addString(map, "environment", this.adjustConfig.environment);
        addString(map, "external_device_id", this.adjustConfig.externalDeviceId);
        addString(map, "fb_id", this.deviceInfo.fbAttributionId);
        addString(map, "hardware_name", this.deviceInfo.hardwareName);
        addString(map, "installed_at", this.deviceInfo.appInstallTime);
        addString(map, "language", this.deviceInfo.language);
        addString(map, "mcc", this.deviceInfo.mcc);
        addString(map, "mnc", this.deviceInfo.mnc);
        addBoolean(map, "needs_response_details", bool);
        addString(map, "os_build", this.deviceInfo.buildName);
        addString(map, "os_name", this.deviceInfo.osName);
        addString(map, "os_version", this.deviceInfo.osVersion);
        addString(map, com.ironsource.y8.h.V, this.deviceInfo.packageName);
        addString(map, "push_token", this.activityStateCopy.g);
        addString(map, "screen_density", this.deviceInfo.screenDensity);
        addString(map, "screen_format", this.deviceInfo.screenFormat);
        addString(map, "screen_size", this.deviceInfo.screenSize);
        addString(map, "source", adjustAdRevenue.source);
        addDoubleWithoutRounding(map, "revenue", adjustAdRevenue.revenue);
        addString(map, "currency", adjustAdRevenue.currency);
        addInteger(map, "ad_impressions_count", adjustAdRevenue.adImpressionsCount);
        addString(map, "ad_revenue_network", adjustAdRevenue.adRevenueNetwork);
        addString(map, "ad_revenue_unit", adjustAdRevenue.adRevenueUnit);
        addString(map, "ad_revenue_placement", adjustAdRevenue.adRevenuePlacement);
        addLong(map, "session_count", this.activityStateCopy.b);
        addDuration(map, "session_length", this.activityStateCopy.e);
        addLong(map, "subsession_count", this.activityStateCopy.c);
        addDuration(map, "time_spent", this.activityStateCopy.d);
        addString(map, "updated_at", this.deviceInfo.appUpdateTime);
        if (!this.deviceInfo.isGooglePlayGamesForPC) {
            bool = null;
        }
        addBoolean(map, "gpg_pc_enabled", bool);
        addJsonObject(map, "control_params", com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(this.adjustConfig.context).getControlParamsJson());
        injectFeatureFlagsWithParameters(map);
        checkDeviceIds(map);
        return map;
    }

    private java.util.Map<java.lang.String, java.lang.String> getAttributionParameters(java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        this.deviceInfo.reloadOtherDeviceInfoParams(this.adjustConfig, logger);
        java.util.Map<java.lang.String, java.lang.String> map2 = this.deviceInfo.imeiParameters;
        if (map2 != null) {
            map.putAll(map2);
        }
        java.util.Map<java.lang.String, java.lang.String> map3 = this.deviceInfo.oaidParameters;
        if (map3 != null) {
            map.putAll(map3);
        }
        this.deviceInfo.reloadPlayIds(this.adjustConfig);
        addString(map, "android_uuid", this.activityStateCopy.f);
        addString(map, "gps_adid", this.deviceInfo.playAdId);
        addLong(map, "gps_adid_attempt", this.deviceInfo.playAdIdAttempt);
        addString(map, "gps_adid_src", this.deviceInfo.playAdIdSource);
        addBoolean(map, "tracking_enabled", this.deviceInfo.isTrackingEnabled);
        addString(map, "fire_adid", this.deviceInfo.fireAdId);
        addBoolean(map, "fire_tracking_enabled", this.deviceInfo.fireTrackingEnabled);
        addString(map, "google_app_set_id", this.deviceInfo.appSetId);
        if (!containsPlayIds(map) && !containsFireIds(map)) {
            logger.warn("Google Advertising ID or Fire Advertising ID not detected, fallback to non Google Play and Fire identifiers will take place", new java.lang.Object[0]);
            this.deviceInfo.reloadNonPlayIds(this.adjustConfig);
            addString(map, "android_id", this.deviceInfo.androidId);
        }
        addString(map, "api_level", this.deviceInfo.apiLevel);
        addString(map, "app_token", this.adjustConfig.appToken);
        addString(map, "app_version", this.deviceInfo.appVersion);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        addBoolean(map, "attribution_deeplink", bool);
        addDateInMilliseconds(map, "created_at", this.createdAt);
        addBoolean(map, "needs_cost", this.adjustConfig.isCostDataInAttributionEnabled);
        addString(map, "device_name", this.deviceInfo.deviceName);
        addString(map, "device_type", this.deviceInfo.deviceType);
        addLong(map, "ui_mode", this.deviceInfo.uiMode);
        addString(map, "environment", this.adjustConfig.environment);
        addString(map, "external_device_id", this.adjustConfig.externalDeviceId);
        addString(map, "initiated_by", str);
        addBoolean(map, "needs_response_details", bool);
        addString(map, "os_name", this.deviceInfo.osName);
        addString(map, "os_version", this.deviceInfo.osVersion);
        addString(map, com.ironsource.y8.h.V, this.deviceInfo.packageName);
        addString(map, "push_token", this.activityStateCopy.g);
        if (!this.deviceInfo.isGooglePlayGamesForPC) {
            bool = null;
        }
        addBoolean(map, "gpg_pc_enabled", bool);
        addJsonObject(map, "control_params", com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(this.adjustConfig.context).getControlParamsJson());
        injectFeatureFlagsWithParameters(map);
        checkDeviceIds(map);
        return map;
    }

    private java.util.Map<java.lang.String, java.lang.String> getClickParameters(java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        this.deviceInfo.reloadOtherDeviceInfoParams(this.adjustConfig, logger);
        java.util.Map<java.lang.String, java.lang.String> map2 = this.deviceInfo.imeiParameters;
        if (map2 != null) {
            map.putAll(map2);
        }
        java.util.Map<java.lang.String, java.lang.String> map3 = this.deviceInfo.oaidParameters;
        if (map3 != null) {
            map.putAll(map3);
        }
        this.deviceInfo.reloadPlayIds(this.adjustConfig);
        addString(map, "android_uuid", this.activityStateCopy.f);
        addString(map, "gps_adid", this.deviceInfo.playAdId);
        addLong(map, "gps_adid_attempt", this.deviceInfo.playAdIdAttempt);
        addString(map, "gps_adid_src", this.deviceInfo.playAdIdSource);
        addBoolean(map, "tracking_enabled", this.deviceInfo.isTrackingEnabled);
        addString(map, "fire_adid", this.deviceInfo.fireAdId);
        addBoolean(map, "fire_tracking_enabled", this.deviceInfo.fireTrackingEnabled);
        addString(map, "google_app_set_id", this.deviceInfo.appSetId);
        if (!containsPlayIds(map) && !containsFireIds(map)) {
            logger.warn("Google Advertising ID or Fire Advertising ID not detected, fallback to non Google Play and Fire identifiers will take place", new java.lang.Object[0]);
            this.deviceInfo.reloadNonPlayIds(this.adjustConfig);
            addString(map, "android_id", this.deviceInfo.androidId);
        }
        com.adjust.sdk.AdjustAttribution adjustAttribution = this.attribution;
        if (adjustAttribution != null) {
            addString(map, "tracker", adjustAttribution.trackerName);
            addString(map, "campaign", this.attribution.campaign);
            addString(map, "adgroup", this.attribution.adgroup);
            addString(map, "creative", this.attribution.creative);
        }
        addString(map, "api_level", this.deviceInfo.apiLevel);
        addString(map, "app_token", this.adjustConfig.appToken);
        addString(map, "app_version", this.deviceInfo.appVersion);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        addBoolean(map, "attribution_deeplink", bool);
        addMapJson(map, com.adjust.sdk.Constants.CALLBACK_PARAMETERS, this.globalParameters.callbackParameters);
        addDateInMilliseconds(map, "click_time", this.clickTimeInMilliseconds);
        addDateInSeconds(map, "click_time", this.clickTimeInSeconds);
        addDateInSeconds(map, "click_time_server", this.clickTimeServerInSeconds);
        addLong(map, "connectivity_type", this.deviceInfo.connectivityType);
        addString(map, com.json.mediationsdk.impressionData.ImpressionData.IMPRESSION_DATA_KEY_COUNTRY, this.deviceInfo.country);
        addString(map, "cpu_type", this.deviceInfo.abi);
        addDateInMilliseconds(map, "created_at", this.createdAt);
        addString(map, com.adjust.sdk.Constants.DEEPLINK, this.deeplink);
        addBoolean(map, "needs_cost", this.adjustConfig.isCostDataInAttributionEnabled);
        addString(map, "device_manufacturer", this.deviceInfo.deviceManufacturer);
        addString(map, "device_name", this.deviceInfo.deviceName);
        addString(map, "device_type", this.deviceInfo.deviceType);
        addLong(map, "ui_mode", this.deviceInfo.uiMode);
        addString(map, "display_height", this.deviceInfo.displayHeight);
        addString(map, "display_width", this.deviceInfo.displayWidth);
        addString(map, "environment", this.adjustConfig.environment);
        addString(map, "external_device_id", this.adjustConfig.externalDeviceId);
        addString(map, "fb_id", this.deviceInfo.fbAttributionId);
        addBoolean(map, "google_play_instant", this.googlePlayInstant);
        addBoolean(map, "is_click", this.isClick);
        addString(map, "hardware_name", this.deviceInfo.hardwareName);
        addDateInSeconds(map, "install_begin_time", this.installBeginTimeInSeconds);
        addDateInSeconds(map, "install_begin_time_server", this.installBeginTimeServerInSeconds);
        addString(map, "install_version", this.installVersion);
        addString(map, "installed_at", this.deviceInfo.appInstallTime);
        addString(map, "language", this.deviceInfo.language);
        addString(map, "mcc", this.deviceInfo.mcc);
        addString(map, "mnc", this.deviceInfo.mnc);
        addBoolean(map, "needs_response_details", bool);
        addString(map, "os_build", this.deviceInfo.buildName);
        addString(map, "os_name", this.deviceInfo.osName);
        addString(map, "os_version", this.deviceInfo.osVersion);
        addString(map, com.ironsource.y8.h.V, this.deviceInfo.packageName);
        addMapJson(map, "params", this.extraParameters);
        addMapJson(map, com.adjust.sdk.Constants.PARTNER_PARAMETERS, this.globalParameters.partnerParameters);
        addString(map, "push_token", this.activityStateCopy.g);
        addString(map, "raw_referrer", this.rawReferrer);
        addString(map, com.adjust.sdk.Constants.REFERRER, this.referrer);
        addString(map, "referrer_api", this.referrerApi);
        addString(map, com.adjust.sdk.Constants.REFTAG, this.reftag);
        addString(map, "screen_density", this.deviceInfo.screenDensity);
        addString(map, "screen_format", this.deviceInfo.screenFormat);
        addString(map, "screen_size", this.deviceInfo.screenSize);
        addLong(map, "session_count", this.activityStateCopy.b);
        addDuration(map, "session_length", this.activityStateCopy.e);
        addString(map, "source", str);
        addLong(map, "subsession_count", this.activityStateCopy.c);
        addDuration(map, "time_spent", this.activityStateCopy.d);
        addString(map, "updated_at", this.deviceInfo.appUpdateTime);
        addString(map, "payload", this.preinstallPayload);
        addString(map, "found_location", this.preinstallLocation);
        if (!this.deviceInfo.isGooglePlayGamesForPC) {
            bool = null;
        }
        addBoolean(map, "gpg_pc_enabled", bool);
        addJsonObject(map, "control_params", com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(this.adjustConfig.context).getControlParamsJson());
        injectFeatureFlagsWithParameters(map);
        checkDeviceIds(map);
        return map;
    }

    private com.adjust.sdk.ActivityPackage getDefaultActivityPackage(com.adjust.sdk.ActivityKind activityKind) {
        com.adjust.sdk.ActivityPackage activityPackage = new com.adjust.sdk.ActivityPackage(activityKind);
        activityPackage.setClientSdk(this.deviceInfo.clientSdk);
        return activityPackage;
    }

    private java.lang.String getEventSuffix(com.adjust.sdk.AdjustEvent adjustEvent) {
        java.lang.Double d = adjustEvent.revenue;
        return d == null ? com.adjust.sdk.Util.formatString("'%s'", adjustEvent.eventToken) : com.adjust.sdk.Util.formatString("(%.5f %s, '%s')", d, adjustEvent.currency, adjustEvent.eventToken);
    }

    private java.util.Map<java.lang.String, java.lang.String> getGdprParameters() {
        java.util.HashMap map = new java.util.HashMap();
        this.deviceInfo.reloadOtherDeviceInfoParams(this.adjustConfig, logger);
        java.util.Map<java.lang.String, java.lang.String> map2 = this.deviceInfo.imeiParameters;
        if (map2 != null) {
            map.putAll(map2);
        }
        java.util.Map<java.lang.String, java.lang.String> map3 = this.deviceInfo.oaidParameters;
        if (map3 != null) {
            map.putAll(map3);
        }
        this.deviceInfo.reloadPlayIds(this.adjustConfig);
        addString(map, "android_uuid", this.activityStateCopy.f);
        addString(map, "gps_adid", this.deviceInfo.playAdId);
        addLong(map, "gps_adid_attempt", this.deviceInfo.playAdIdAttempt);
        addString(map, "gps_adid_src", this.deviceInfo.playAdIdSource);
        addBoolean(map, "tracking_enabled", this.deviceInfo.isTrackingEnabled);
        addString(map, "fire_adid", this.deviceInfo.fireAdId);
        addBoolean(map, "fire_tracking_enabled", this.deviceInfo.fireTrackingEnabled);
        addString(map, "google_app_set_id", this.deviceInfo.appSetId);
        if (!containsPlayIds(map) && !containsFireIds(map)) {
            logger.warn("Google Advertising ID or Fire Advertising ID not detected, fallback to non Google Play and Fire identifiers will take place", new java.lang.Object[0]);
            this.deviceInfo.reloadNonPlayIds(this.adjustConfig);
            addString(map, "android_id", this.deviceInfo.androidId);
        }
        addString(map, "api_level", this.deviceInfo.apiLevel);
        addString(map, "app_token", this.adjustConfig.appToken);
        addString(map, "app_version", this.deviceInfo.appVersion);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        addBoolean(map, "attribution_deeplink", bool);
        addDateInMilliseconds(map, "created_at", this.createdAt);
        addBoolean(map, "needs_cost", this.adjustConfig.isCostDataInAttributionEnabled);
        addString(map, "device_name", this.deviceInfo.deviceName);
        addString(map, "device_type", this.deviceInfo.deviceType);
        addLong(map, "ui_mode", this.deviceInfo.uiMode);
        addString(map, "environment", this.adjustConfig.environment);
        addString(map, "external_device_id", this.adjustConfig.externalDeviceId);
        addBoolean(map, "needs_response_details", bool);
        addString(map, "os_name", this.deviceInfo.osName);
        addString(map, "os_version", this.deviceInfo.osVersion);
        addString(map, com.ironsource.y8.h.V, this.deviceInfo.packageName);
        addString(map, "push_token", this.activityStateCopy.g);
        if (!this.deviceInfo.isGooglePlayGamesForPC) {
            bool = null;
        }
        addBoolean(map, "gpg_pc_enabled", bool);
        addJsonObject(map, "control_params", com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(this.adjustConfig.context).getControlParamsJson());
        injectFeatureFlagsWithParameters(map);
        checkDeviceIds(map);
        return map;
    }

    private java.util.Map<java.lang.String, java.lang.String> getInfoParameters(java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        this.deviceInfo.reloadOtherDeviceInfoParams(this.adjustConfig, logger);
        java.util.Map<java.lang.String, java.lang.String> map2 = this.deviceInfo.imeiParameters;
        if (map2 != null) {
            map.putAll(map2);
        }
        java.util.Map<java.lang.String, java.lang.String> map3 = this.deviceInfo.oaidParameters;
        if (map3 != null) {
            map.putAll(map3);
        }
        this.deviceInfo.reloadPlayIds(this.adjustConfig);
        addString(map, "android_uuid", this.activityStateCopy.f);
        addString(map, "gps_adid", this.deviceInfo.playAdId);
        addLong(map, "gps_adid_attempt", this.deviceInfo.playAdIdAttempt);
        addString(map, "gps_adid_src", this.deviceInfo.playAdIdSource);
        addBoolean(map, "tracking_enabled", this.deviceInfo.isTrackingEnabled);
        addString(map, "fire_adid", this.deviceInfo.fireAdId);
        addBoolean(map, "fire_tracking_enabled", this.deviceInfo.fireTrackingEnabled);
        addString(map, "google_app_set_id", this.deviceInfo.appSetId);
        if (!containsPlayIds(map) && !containsFireIds(map)) {
            logger.warn("Google Advertising ID or Fire Advertising ID not detected, fallback to non Google Play and Fire identifiers will take place", new java.lang.Object[0]);
            this.deviceInfo.reloadNonPlayIds(this.adjustConfig);
            addString(map, "android_id", this.deviceInfo.androidId);
        }
        addString(map, "app_token", this.adjustConfig.appToken);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        addBoolean(map, "attribution_deeplink", bool);
        addDateInMilliseconds(map, "created_at", this.createdAt);
        addBoolean(map, "needs_cost", this.adjustConfig.isCostDataInAttributionEnabled);
        addString(map, "environment", this.adjustConfig.environment);
        addString(map, "external_device_id", this.adjustConfig.externalDeviceId);
        addBoolean(map, "needs_response_details", bool);
        addString(map, "push_token", this.activityStateCopy.g);
        addString(map, "source", str);
        if (!this.deviceInfo.isGooglePlayGamesForPC) {
            bool = null;
        }
        addBoolean(map, "gpg_pc_enabled", bool);
        addJsonObject(map, "control_params", com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(this.adjustConfig.context).getControlParamsJson());
        injectFeatureFlagsWithParameters(map);
        checkDeviceIds(map);
        return map;
    }

    private java.util.Map<java.lang.String, java.lang.String> getMeasurementConsentParameters(boolean z) {
        java.util.HashMap map = new java.util.HashMap();
        this.deviceInfo.reloadOtherDeviceInfoParams(this.adjustConfig, logger);
        java.util.Map<java.lang.String, java.lang.String> map2 = this.deviceInfo.imeiParameters;
        if (map2 != null) {
            map.putAll(map2);
        }
        java.util.Map<java.lang.String, java.lang.String> map3 = this.deviceInfo.oaidParameters;
        if (map3 != null) {
            map.putAll(map3);
        }
        addString(map, "measurement", z ? com.json.mediationsdk.metadata.a.j : "disable");
        this.deviceInfo.reloadPlayIds(this.adjustConfig);
        addString(map, "android_uuid", this.activityStateCopy.f);
        addString(map, "gps_adid", this.deviceInfo.playAdId);
        addLong(map, "gps_adid_attempt", this.deviceInfo.playAdIdAttempt);
        addString(map, "gps_adid_src", this.deviceInfo.playAdIdSource);
        addBoolean(map, "tracking_enabled", this.deviceInfo.isTrackingEnabled);
        addString(map, "fire_adid", this.deviceInfo.fireAdId);
        addBoolean(map, "fire_tracking_enabled", this.deviceInfo.fireTrackingEnabled);
        addString(map, "google_app_set_id", this.deviceInfo.appSetId);
        if (!containsPlayIds(map) && !containsFireIds(map)) {
            logger.warn("Google Advertising ID or Fire Advertising ID not detected, fallback to non Google Play and Fire identifiers will take place", new java.lang.Object[0]);
            this.deviceInfo.reloadNonPlayIds(this.adjustConfig);
            addString(map, "android_id", this.deviceInfo.androidId);
        }
        addString(map, "api_level", this.deviceInfo.apiLevel);
        addString(map, "app_token", this.adjustConfig.appToken);
        addString(map, "app_version", this.deviceInfo.appVersion);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        addBoolean(map, "attribution_deeplink", bool);
        addDateInMilliseconds(map, "created_at", this.createdAt);
        addString(map, "device_name", this.deviceInfo.deviceName);
        addString(map, "device_type", this.deviceInfo.deviceType);
        addLong(map, "ui_mode", this.deviceInfo.uiMode);
        addString(map, "environment", this.adjustConfig.environment);
        addString(map, "external_device_id", this.adjustConfig.externalDeviceId);
        addBoolean(map, "needs_response_details", bool);
        addString(map, "os_name", this.deviceInfo.osName);
        addString(map, "os_version", this.deviceInfo.osVersion);
        addString(map, com.ironsource.y8.h.V, this.deviceInfo.packageName);
        addString(map, "push_token", this.activityStateCopy.g);
        if (!this.deviceInfo.isGooglePlayGamesForPC) {
            bool = null;
        }
        addBoolean(map, "gpg_pc_enabled", bool);
        addJsonObject(map, "control_params", com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(this.adjustConfig.context).getControlParamsJson());
        injectFeatureFlagsWithParameters(map);
        checkDeviceIds(map);
        return map;
    }

    private java.util.Map<java.lang.String, java.lang.String> getSessionParameters() {
        java.util.HashMap map = new java.util.HashMap();
        this.deviceInfo.reloadOtherDeviceInfoParams(this.adjustConfig, logger);
        java.util.Map<java.lang.String, java.lang.String> map2 = this.deviceInfo.imeiParameters;
        if (map2 != null) {
            map.putAll(map2);
        }
        java.util.Map<java.lang.String, java.lang.String> map3 = this.deviceInfo.oaidParameters;
        if (map3 != null) {
            map.putAll(map3);
        }
        addMapJson(map, com.adjust.sdk.Constants.CALLBACK_PARAMETERS, this.globalParameters.callbackParameters);
        addMapJson(map, com.adjust.sdk.Constants.PARTNER_PARAMETERS, this.globalParameters.partnerParameters);
        this.deviceInfo.reloadPlayIds(this.adjustConfig);
        addString(map, "android_uuid", this.activityStateCopy.f);
        addString(map, "gps_adid", this.deviceInfo.playAdId);
        addLong(map, "gps_adid_attempt", this.deviceInfo.playAdIdAttempt);
        addString(map, "gps_adid_src", this.deviceInfo.playAdIdSource);
        addBoolean(map, "tracking_enabled", this.deviceInfo.isTrackingEnabled);
        addString(map, "fire_adid", this.deviceInfo.fireAdId);
        addBoolean(map, "fire_tracking_enabled", this.deviceInfo.fireTrackingEnabled);
        addString(map, "google_app_set_id", this.deviceInfo.appSetId);
        if (!containsPlayIds(map) && !containsFireIds(map)) {
            logger.warn("Google Advertising ID or Fire Advertising ID not detected, fallback to non Google Play and Fire identifiers will take place", new java.lang.Object[0]);
            this.deviceInfo.reloadNonPlayIds(this.adjustConfig);
            addString(map, "android_id", this.deviceInfo.androidId);
        }
        addString(map, "api_level", this.deviceInfo.apiLevel);
        addString(map, "app_token", this.adjustConfig.appToken);
        addString(map, "app_version", this.deviceInfo.appVersion);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        addBoolean(map, "attribution_deeplink", bool);
        addLong(map, "connectivity_type", this.deviceInfo.connectivityType);
        addString(map, com.json.mediationsdk.impressionData.ImpressionData.IMPRESSION_DATA_KEY_COUNTRY, this.deviceInfo.country);
        addString(map, "cpu_type", this.deviceInfo.abi);
        addDateInMilliseconds(map, "created_at", this.createdAt);
        addString(map, "default_tracker", this.adjustConfig.defaultTracker);
        addBoolean(map, "needs_cost", this.adjustConfig.isCostDataInAttributionEnabled);
        addString(map, "device_manufacturer", this.deviceInfo.deviceManufacturer);
        addString(map, "device_name", this.deviceInfo.deviceName);
        addString(map, "device_type", this.deviceInfo.deviceType);
        addLong(map, "ui_mode", this.deviceInfo.uiMode);
        addString(map, "display_height", this.deviceInfo.displayHeight);
        addString(map, "display_width", this.deviceInfo.displayWidth);
        addString(map, "environment", this.adjustConfig.environment);
        addString(map, "external_device_id", this.adjustConfig.externalDeviceId);
        addString(map, "fb_id", this.deviceInfo.fbAttributionId);
        addString(map, "hardware_name", this.deviceInfo.hardwareName);
        addString(map, "installed_at", this.deviceInfo.appInstallTime);
        addString(map, "language", this.deviceInfo.language);
        addString(map, "mcc", this.deviceInfo.mcc);
        addString(map, "mnc", this.deviceInfo.mnc);
        addBoolean(map, "needs_response_details", bool);
        addString(map, "os_build", this.deviceInfo.buildName);
        addString(map, "os_name", this.deviceInfo.osName);
        addString(map, "os_version", this.deviceInfo.osVersion);
        addString(map, com.ironsource.y8.h.V, this.deviceInfo.packageName);
        addString(map, "push_token", this.activityStateCopy.g);
        addString(map, "screen_density", this.deviceInfo.screenDensity);
        addString(map, "screen_format", this.deviceInfo.screenFormat);
        addString(map, "screen_size", this.deviceInfo.screenSize);
        addLong(map, "session_count", this.activityStateCopy.b);
        addDuration(map, "session_length", this.activityStateCopy.e);
        addLong(map, "subsession_count", this.activityStateCopy.c);
        addDuration(map, "time_spent", this.activityStateCopy.d);
        addString(map, "updated_at", this.deviceInfo.appUpdateTime);
        if (!this.deviceInfo.isGooglePlayGamesForPC) {
            bool = null;
        }
        addBoolean(map, "gpg_pc_enabled", bool);
        addJsonObject(map, "control_params", com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(this.adjustConfig.context).getControlParamsJson());
        injectFeatureFlagsWithParameters(map);
        checkDeviceIds(map);
        return map;
    }

    private java.util.Map<java.lang.String, java.lang.String> getSubscriptionParameters(com.adjust.sdk.AdjustPlayStoreSubscription adjustPlayStoreSubscription) {
        java.util.HashMap map = new java.util.HashMap();
        this.deviceInfo.reloadOtherDeviceInfoParams(this.adjustConfig, logger);
        java.util.Map<java.lang.String, java.lang.String> map2 = this.deviceInfo.imeiParameters;
        if (map2 != null) {
            map.putAll(map2);
        }
        java.util.Map<java.lang.String, java.lang.String> map3 = this.deviceInfo.oaidParameters;
        if (map3 != null) {
            map.putAll(map3);
        }
        this.deviceInfo.reloadPlayIds(this.adjustConfig);
        addString(map, "android_uuid", this.activityStateCopy.f);
        addString(map, "gps_adid", this.deviceInfo.playAdId);
        addLong(map, "gps_adid_attempt", this.deviceInfo.playAdIdAttempt);
        addString(map, "gps_adid_src", this.deviceInfo.playAdIdSource);
        addBoolean(map, "tracking_enabled", this.deviceInfo.isTrackingEnabled);
        addString(map, "fire_adid", this.deviceInfo.fireAdId);
        addBoolean(map, "fire_tracking_enabled", this.deviceInfo.fireTrackingEnabled);
        addString(map, "google_app_set_id", this.deviceInfo.appSetId);
        if (!containsPlayIds(map) && !containsFireIds(map)) {
            logger.warn("Google Advertising ID or Fire Advertising ID not detected, fallback to non Google Play and Fire identifiers will take place", new java.lang.Object[0]);
            this.deviceInfo.reloadNonPlayIds(this.adjustConfig);
            addString(map, "android_id", this.deviceInfo.androidId);
        }
        addMapJson(map, com.adjust.sdk.Constants.CALLBACK_PARAMETERS, com.adjust.sdk.Util.mergeParameters(this.globalParameters.callbackParameters, adjustPlayStoreSubscription.getCallbackParameters(), "Callback"));
        addMapJson(map, com.adjust.sdk.Constants.PARTNER_PARAMETERS, com.adjust.sdk.Util.mergeParameters(this.globalParameters.partnerParameters, adjustPlayStoreSubscription.getPartnerParameters(), "Partner"));
        addString(map, "api_level", this.deviceInfo.apiLevel);
        addString(map, "app_token", this.adjustConfig.appToken);
        addString(map, "app_version", this.deviceInfo.appVersion);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        addBoolean(map, "attribution_deeplink", bool);
        addLong(map, "connectivity_type", this.deviceInfo.connectivityType);
        addString(map, com.json.mediationsdk.impressionData.ImpressionData.IMPRESSION_DATA_KEY_COUNTRY, this.deviceInfo.country);
        addString(map, "cpu_type", this.deviceInfo.abi);
        addDateInMilliseconds(map, "created_at", this.createdAt);
        addString(map, "default_tracker", this.adjustConfig.defaultTracker);
        addBoolean(map, "needs_cost", this.adjustConfig.isCostDataInAttributionEnabled);
        addString(map, "device_manufacturer", this.deviceInfo.deviceManufacturer);
        addString(map, "device_name", this.deviceInfo.deviceName);
        addString(map, "device_type", this.deviceInfo.deviceType);
        addLong(map, "ui_mode", this.deviceInfo.uiMode);
        addString(map, "display_height", this.deviceInfo.displayHeight);
        addString(map, "display_width", this.deviceInfo.displayWidth);
        addString(map, "environment", this.adjustConfig.environment);
        addString(map, "external_device_id", this.adjustConfig.externalDeviceId);
        addString(map, "fb_id", this.deviceInfo.fbAttributionId);
        addString(map, "hardware_name", this.deviceInfo.hardwareName);
        addString(map, "installed_at", this.deviceInfo.appInstallTime);
        addString(map, "language", this.deviceInfo.language);
        addString(map, "mcc", this.deviceInfo.mcc);
        addString(map, "mnc", this.deviceInfo.mnc);
        addBoolean(map, "needs_response_details", bool);
        addString(map, "os_build", this.deviceInfo.buildName);
        addString(map, "os_name", this.deviceInfo.osName);
        addString(map, "os_version", this.deviceInfo.osVersion);
        addString(map, com.ironsource.y8.h.V, this.deviceInfo.packageName);
        addString(map, "push_token", this.activityStateCopy.g);
        addString(map, "screen_density", this.deviceInfo.screenDensity);
        addString(map, "screen_format", this.deviceInfo.screenFormat);
        addString(map, "screen_size", this.deviceInfo.screenSize);
        addLong(map, "session_count", this.activityStateCopy.b);
        addDuration(map, "session_length", this.activityStateCopy.e);
        addLong(map, "subsession_count", this.activityStateCopy.c);
        addDuration(map, "time_spent", this.activityStateCopy.d);
        addString(map, "updated_at", this.deviceInfo.appUpdateTime);
        addString(map, "currency", adjustPlayStoreSubscription.getCurrency());
        addString(map, "product_id", adjustPlayStoreSubscription.getSku());
        addString(map, "purchase_token", adjustPlayStoreSubscription.getPurchaseToken());
        addString(map, "receipt", adjustPlayStoreSubscription.getSignature());
        addLong(map, "revenue", adjustPlayStoreSubscription.getPrice());
        addDateInMilliseconds(map, "transaction_date", adjustPlayStoreSubscription.getPurchaseTime());
        addString(map, "transaction_id", adjustPlayStoreSubscription.getOrderId());
        if (!this.deviceInfo.isGooglePlayGamesForPC) {
            bool = null;
        }
        addBoolean(map, "gpg_pc_enabled", bool);
        addJsonObject(map, "control_params", com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(this.adjustConfig.context).getControlParamsJson());
        injectFeatureFlagsWithParameters(map);
        checkDeviceIds(map);
        return map;
    }

    private java.util.Map<java.lang.String, java.lang.String> getThirdPartySharingParameters(com.adjust.sdk.AdjustThirdPartySharing adjustThirdPartySharing) {
        java.util.HashMap map = new java.util.HashMap();
        this.deviceInfo.reloadOtherDeviceInfoParams(this.adjustConfig, logger);
        java.util.Map<java.lang.String, java.lang.String> map2 = this.deviceInfo.imeiParameters;
        if (map2 != null) {
            map.putAll(map2);
        }
        java.util.Map<java.lang.String, java.lang.String> map3 = this.deviceInfo.oaidParameters;
        if (map3 != null) {
            map.putAll(map3);
        }
        java.lang.Boolean bool = adjustThirdPartySharing.isEnabled;
        if (bool != null) {
            addString(map, "sharing", bool.booleanValue() ? com.json.mediationsdk.metadata.a.j : "disable");
        }
        addMapJson(map, "granular_third_party_sharing_options", adjustThirdPartySharing.granularOptions);
        addMapJson(map, "partner_sharing_settings", adjustThirdPartySharing.partnerSharingSettings);
        this.deviceInfo.reloadPlayIds(this.adjustConfig);
        addString(map, "android_uuid", this.activityStateCopy.f);
        addString(map, "gps_adid", this.deviceInfo.playAdId);
        addLong(map, "gps_adid_attempt", this.deviceInfo.playAdIdAttempt);
        addString(map, "gps_adid_src", this.deviceInfo.playAdIdSource);
        addBoolean(map, "tracking_enabled", this.deviceInfo.isTrackingEnabled);
        addString(map, "fire_adid", this.deviceInfo.fireAdId);
        addBoolean(map, "fire_tracking_enabled", this.deviceInfo.fireTrackingEnabled);
        addString(map, "google_app_set_id", this.deviceInfo.appSetId);
        if (!containsPlayIds(map) && !containsFireIds(map)) {
            logger.warn("Google Advertising ID or Fire Advertising ID not detected, fallback to non Google Play and Fire identifiers will take place", new java.lang.Object[0]);
            this.deviceInfo.reloadNonPlayIds(this.adjustConfig);
            addString(map, "android_id", this.deviceInfo.androidId);
        }
        addString(map, "api_level", this.deviceInfo.apiLevel);
        addString(map, "app_token", this.adjustConfig.appToken);
        addString(map, "app_version", this.deviceInfo.appVersion);
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        addBoolean(map, "attribution_deeplink", bool2);
        addDateInMilliseconds(map, "created_at", this.createdAt);
        addString(map, "device_name", this.deviceInfo.deviceName);
        addString(map, "device_type", this.deviceInfo.deviceType);
        addLong(map, "ui_mode", this.deviceInfo.uiMode);
        addString(map, "environment", this.adjustConfig.environment);
        addString(map, "external_device_id", this.adjustConfig.externalDeviceId);
        addBoolean(map, "needs_response_details", bool2);
        addString(map, "os_name", this.deviceInfo.osName);
        addString(map, "os_version", this.deviceInfo.osVersion);
        addString(map, com.ironsource.y8.h.V, this.deviceInfo.packageName);
        addString(map, "push_token", this.activityStateCopy.g);
        if (!this.deviceInfo.isGooglePlayGamesForPC) {
            bool2 = null;
        }
        addBoolean(map, "gpg_pc_enabled", bool2);
        addJsonObject(map, "control_params", com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(this.adjustConfig.context).getControlParamsJson());
        injectFeatureFlagsWithParameters(map);
        checkDeviceIds(map);
        return map;
    }

    private java.util.Map<java.lang.String, java.lang.String> getVerificationParameters(com.adjust.sdk.AdjustEvent adjustEvent) {
        java.util.HashMap map = new java.util.HashMap();
        this.deviceInfo.reloadOtherDeviceInfoParams(this.adjustConfig, logger);
        java.util.Map<java.lang.String, java.lang.String> map2 = this.deviceInfo.imeiParameters;
        if (map2 != null) {
            map.putAll(map2);
        }
        java.util.Map<java.lang.String, java.lang.String> map3 = this.deviceInfo.oaidParameters;
        if (map3 != null) {
            map.putAll(map3);
        }
        this.deviceInfo.reloadPlayIds(this.adjustConfig);
        addString(map, "android_uuid", this.activityStateCopy.f);
        addString(map, "gps_adid", this.deviceInfo.playAdId);
        addLong(map, "gps_adid_attempt", this.deviceInfo.playAdIdAttempt);
        addString(map, "gps_adid_src", this.deviceInfo.playAdIdSource);
        addBoolean(map, "tracking_enabled", this.deviceInfo.isTrackingEnabled);
        addString(map, "fire_adid", this.deviceInfo.fireAdId);
        addBoolean(map, "fire_tracking_enabled", this.deviceInfo.fireTrackingEnabled);
        if (!containsPlayIds(map) && !containsFireIds(map)) {
            logger.warn("Google Advertising ID or Fire Advertising ID not detected, fallback to non Google Play and Fire identifiers will take place", new java.lang.Object[0]);
            this.deviceInfo.reloadNonPlayIds(this.adjustConfig);
            addString(map, "android_id", this.deviceInfo.androidId);
        }
        addString(map, "api_level", this.deviceInfo.apiLevel);
        addString(map, "app_token", this.adjustConfig.appToken);
        addString(map, "app_version", this.deviceInfo.appVersion);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        addBoolean(map, "attribution_deeplink", bool);
        addLong(map, "connectivity_type", this.deviceInfo.connectivityType);
        addString(map, com.json.mediationsdk.impressionData.ImpressionData.IMPRESSION_DATA_KEY_COUNTRY, this.deviceInfo.country);
        addString(map, "cpu_type", this.deviceInfo.abi);
        addDateInMilliseconds(map, "created_at", this.createdAt);
        addString(map, "default_tracker", this.adjustConfig.defaultTracker);
        addBoolean(map, "needs_cost", this.adjustConfig.isCostDataInAttributionEnabled);
        addString(map, "device_manufacturer", this.deviceInfo.deviceManufacturer);
        addString(map, "device_name", this.deviceInfo.deviceName);
        addString(map, "device_type", this.deviceInfo.deviceType);
        addLong(map, "ui_mode", this.deviceInfo.uiMode);
        addString(map, "display_height", this.deviceInfo.displayHeight);
        addString(map, "display_width", this.deviceInfo.displayWidth);
        addString(map, "environment", this.adjustConfig.environment);
        addString(map, "external_device_id", this.adjustConfig.externalDeviceId);
        addString(map, "fb_id", this.deviceInfo.fbAttributionId);
        addString(map, "hardware_name", this.deviceInfo.hardwareName);
        addString(map, "installed_at", this.deviceInfo.appInstallTime);
        addString(map, "language", this.deviceInfo.language);
        addString(map, "mcc", this.deviceInfo.mcc);
        addString(map, "mnc", this.deviceInfo.mnc);
        addBoolean(map, "needs_response_details", bool);
        addString(map, "os_build", this.deviceInfo.buildName);
        addString(map, "os_name", this.deviceInfo.osName);
        addString(map, "os_version", this.deviceInfo.osVersion);
        addString(map, com.ironsource.y8.h.V, this.deviceInfo.packageName);
        addString(map, "push_token", this.activityStateCopy.g);
        addString(map, "screen_density", this.deviceInfo.screenDensity);
        addString(map, "screen_format", this.deviceInfo.screenFormat);
        addString(map, "screen_size", this.deviceInfo.screenSize);
        addLong(map, "session_count", this.activityStateCopy.b);
        addDuration(map, "session_length", this.activityStateCopy.e);
        addLong(map, "subsession_count", this.activityStateCopy.c);
        addDuration(map, "time_spent", this.activityStateCopy.d);
        addString(map, "updated_at", this.deviceInfo.appUpdateTime);
        addString(map, "product_id", adjustEvent.getProductId());
        addString(map, "purchase_token", adjustEvent.getPurchaseToken());
        addString(map, "event_token", adjustEvent.getEventToken());
        addString(map, "currency", adjustEvent.getCurrency());
        addDouble(map, "revenue", adjustEvent.getRevenue());
        if (!this.deviceInfo.isGooglePlayGamesForPC) {
            bool = null;
        }
        addBoolean(map, "gpg_pc_enabled", bool);
        injectFeatureFlagsWithParameters(map);
        checkDeviceIds(map);
        return map;
    }

    private void injectFeatureFlagsWithParameters(java.util.Map<java.lang.String, java.lang.String> map) {
        java.lang.Boolean bool;
        java.lang.String str;
        if (this.adjustConfig.coppaComplianceEnabled) {
            addLong(map, "ff_coppa", 1L);
        }
        com.adjust.sdk.ActivityHandler.InternalState internalState = this.internalState;
        if (internalState != null) {
            addBoolean(map, "offline_mode_enabled", java.lang.Boolean.valueOf(internalState.offline));
            if (this.internalState.isInForeground()) {
                bool = java.lang.Boolean.TRUE;
                str = androidx.media3.exoplayer.offline.DownloadService.KEY_FOREGROUND;
            } else {
                bool = java.lang.Boolean.TRUE;
                str = "background";
            }
            addBoolean(map, str, bool);
        }
        if (this.adjustConfig.playStoreKidsComplianceEnabled) {
            addLong(map, "ff_play_store_kids_app", 1L);
        }
    }

    public com.adjust.sdk.ActivityPackage buildAdRevenuePackage(com.adjust.sdk.AdjustAdRevenue adjustAdRevenue) {
        java.util.Map<java.lang.String, java.lang.String> adRevenueParameters = getAdRevenueParameters(adjustAdRevenue);
        com.adjust.sdk.ActivityPackage defaultActivityPackage = getDefaultActivityPackage(com.adjust.sdk.ActivityKind.AD_REVENUE);
        defaultActivityPackage.setPath("/ad_revenue");
        defaultActivityPackage.setSuffix("");
        defaultActivityPackage.setParameters(adRevenueParameters);
        defaultActivityPackage.setCallbackParameters(adjustAdRevenue.callbackParameters);
        defaultActivityPackage.setPartnerParameters(adjustAdRevenue.partnerParameters);
        return defaultActivityPackage;
    }

    public com.adjust.sdk.ActivityPackage buildAttributionPackage(java.lang.String str) {
        java.util.Map<java.lang.String, java.lang.String> attributionParameters = getAttributionParameters(str);
        com.adjust.sdk.ActivityPackage defaultActivityPackage = getDefaultActivityPackage(com.adjust.sdk.ActivityKind.ATTRIBUTION);
        defaultActivityPackage.setPath(com.json.z8.ATTRIBUTION);
        defaultActivityPackage.setSuffix("");
        defaultActivityPackage.setParameters(attributionParameters);
        return defaultActivityPackage;
    }

    public com.adjust.sdk.ActivityPackage buildClickPackage(java.lang.String str) {
        java.util.Map<java.lang.String, java.lang.String> clickParameters = getClickParameters(str);
        com.adjust.sdk.ActivityPackage defaultActivityPackage = getDefaultActivityPackage(com.adjust.sdk.ActivityKind.CLICK);
        defaultActivityPackage.setPath("/sdk_click");
        defaultActivityPackage.setSuffix("");
        defaultActivityPackage.setClickTimeInMilliseconds(this.clickTimeInMilliseconds);
        defaultActivityPackage.setClickTimeInSeconds(this.clickTimeInSeconds);
        defaultActivityPackage.setInstallBeginTimeInSeconds(this.installBeginTimeInSeconds);
        defaultActivityPackage.setClickTimeServerInSeconds(this.clickTimeServerInSeconds);
        defaultActivityPackage.setInstallBeginTimeServerInSeconds(this.installBeginTimeServerInSeconds);
        defaultActivityPackage.setInstallVersion(this.installVersion);
        defaultActivityPackage.setGooglePlayInstant(this.googlePlayInstant);
        defaultActivityPackage.setIsClick(this.isClick);
        defaultActivityPackage.setParameters(clickParameters);
        return defaultActivityPackage;
    }

    public com.adjust.sdk.ActivityPackage buildEventPackage(com.adjust.sdk.AdjustEvent adjustEvent) {
        java.util.Map<java.lang.String, java.lang.String> eventParameters = getEventParameters(adjustEvent);
        com.adjust.sdk.ActivityPackage defaultActivityPackage = getDefaultActivityPackage(com.adjust.sdk.ActivityKind.EVENT);
        defaultActivityPackage.setPath("/event");
        defaultActivityPackage.setSuffix(getEventSuffix(adjustEvent));
        defaultActivityPackage.setParameters(eventParameters);
        defaultActivityPackage.setCallbackParameters(adjustEvent.callbackParameters);
        defaultActivityPackage.setPartnerParameters(adjustEvent.partnerParameters);
        return defaultActivityPackage;
    }

    public com.adjust.sdk.ActivityPackage buildGdprPackage() {
        java.util.Map<java.lang.String, java.lang.String> gdprParameters = getGdprParameters();
        com.adjust.sdk.ActivityPackage defaultActivityPackage = getDefaultActivityPackage(com.adjust.sdk.ActivityKind.GDPR);
        defaultActivityPackage.setPath("/gdpr_forget_device");
        defaultActivityPackage.setSuffix("");
        defaultActivityPackage.setParameters(gdprParameters);
        return defaultActivityPackage;
    }

    public com.adjust.sdk.ActivityPackage buildInfoPackage(java.lang.String str) {
        java.util.Map<java.lang.String, java.lang.String> infoParameters = getInfoParameters(str);
        com.adjust.sdk.ActivityPackage defaultActivityPackage = getDefaultActivityPackage(com.adjust.sdk.ActivityKind.INFO);
        defaultActivityPackage.setPath("/sdk_info");
        defaultActivityPackage.setSuffix("");
        defaultActivityPackage.setParameters(infoParameters);
        return defaultActivityPackage;
    }

    public com.adjust.sdk.ActivityPackage buildMeasurementConsentPackage(boolean z) {
        java.util.Map<java.lang.String, java.lang.String> measurementConsentParameters = getMeasurementConsentParameters(z);
        com.adjust.sdk.ActivityPackage defaultActivityPackage = getDefaultActivityPackage(com.adjust.sdk.ActivityKind.MEASUREMENT_CONSENT);
        defaultActivityPackage.setPath("/measurement_consent");
        defaultActivityPackage.setSuffix("");
        defaultActivityPackage.setParameters(measurementConsentParameters);
        return defaultActivityPackage;
    }

    public com.adjust.sdk.ActivityPackage buildSessionPackage() {
        java.util.Map<java.lang.String, java.lang.String> sessionParameters = getSessionParameters();
        com.adjust.sdk.ActivityPackage defaultActivityPackage = getDefaultActivityPackage(com.adjust.sdk.ActivityKind.SESSION);
        defaultActivityPackage.setPath("/session");
        defaultActivityPackage.setSuffix("");
        defaultActivityPackage.setParameters(sessionParameters);
        return defaultActivityPackage;
    }

    public com.adjust.sdk.ActivityPackage buildSubscriptionPackage(com.adjust.sdk.AdjustPlayStoreSubscription adjustPlayStoreSubscription) {
        java.util.Map<java.lang.String, java.lang.String> subscriptionParameters = getSubscriptionParameters(adjustPlayStoreSubscription);
        com.adjust.sdk.ActivityPackage defaultActivityPackage = getDefaultActivityPackage(com.adjust.sdk.ActivityKind.SUBSCRIPTION);
        defaultActivityPackage.setPath("/v2/purchase");
        defaultActivityPackage.setSuffix("");
        defaultActivityPackage.setParameters(subscriptionParameters);
        return defaultActivityPackage;
    }

    public com.adjust.sdk.ActivityPackage buildThirdPartySharingPackage(com.adjust.sdk.AdjustThirdPartySharing adjustThirdPartySharing) {
        java.util.Map<java.lang.String, java.lang.String> thirdPartySharingParameters = getThirdPartySharingParameters(adjustThirdPartySharing);
        com.adjust.sdk.ActivityPackage defaultActivityPackage = getDefaultActivityPackage(com.adjust.sdk.ActivityKind.THIRD_PARTY_SHARING);
        defaultActivityPackage.setPath("/third_party_sharing");
        defaultActivityPackage.setSuffix("");
        defaultActivityPackage.setParameters(thirdPartySharingParameters);
        return defaultActivityPackage;
    }

    public com.adjust.sdk.ActivityPackage buildVerificationPackage(com.adjust.sdk.AdjustEvent adjustEvent, com.adjust.sdk.OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener) {
        java.util.Map<java.lang.String, java.lang.String> verificationParameters = getVerificationParameters(adjustEvent);
        com.adjust.sdk.ActivityPackage defaultActivityPackage = getDefaultActivityPackage(com.adjust.sdk.ActivityKind.PURCHASE_VERIFICATION);
        defaultActivityPackage.setPath("/verify");
        defaultActivityPackage.setSuffix("");
        defaultActivityPackage.setPurchaseVerificationCallback(onPurchaseVerificationFinishedListener);
        defaultActivityPackage.setParameters(verificationParameters);
        return defaultActivityPackage;
    }

    public java.util.Map<java.lang.String, java.lang.String> getEventParameters(com.adjust.sdk.AdjustEvent adjustEvent) {
        java.util.HashMap map = new java.util.HashMap();
        this.deviceInfo.reloadOtherDeviceInfoParams(this.adjustConfig, logger);
        java.util.Map<java.lang.String, java.lang.String> map2 = this.deviceInfo.imeiParameters;
        if (map2 != null) {
            map.putAll(map2);
        }
        java.util.Map<java.lang.String, java.lang.String> map3 = this.deviceInfo.oaidParameters;
        if (map3 != null) {
            map.putAll(map3);
        }
        addMapJson(map, com.adjust.sdk.Constants.CALLBACK_PARAMETERS, com.adjust.sdk.Util.mergeParameters(this.globalParameters.callbackParameters, adjustEvent.callbackParameters, "Callback"));
        addMapJson(map, com.adjust.sdk.Constants.PARTNER_PARAMETERS, com.adjust.sdk.Util.mergeParameters(this.globalParameters.partnerParameters, adjustEvent.partnerParameters, "Partner"));
        this.deviceInfo.reloadPlayIds(this.adjustConfig);
        addString(map, "android_uuid", this.activityStateCopy.f);
        addString(map, "gps_adid", this.deviceInfo.playAdId);
        addLong(map, "gps_adid_attempt", this.deviceInfo.playAdIdAttempt);
        addString(map, "gps_adid_src", this.deviceInfo.playAdIdSource);
        addBoolean(map, "tracking_enabled", this.deviceInfo.isTrackingEnabled);
        addString(map, "fire_adid", this.deviceInfo.fireAdId);
        addBoolean(map, "fire_tracking_enabled", this.deviceInfo.fireTrackingEnabled);
        addString(map, "google_app_set_id", this.deviceInfo.appSetId);
        if (!containsPlayIds(map) && !containsFireIds(map)) {
            logger.warn("Google Advertising ID or Fire Advertising ID not detected, fallback to non Google Play and Fire identifiers will take place", new java.lang.Object[0]);
            this.deviceInfo.reloadNonPlayIds(this.adjustConfig);
            addString(map, "android_id", this.deviceInfo.androidId);
        }
        addString(map, "api_level", this.deviceInfo.apiLevel);
        addString(map, "app_token", this.adjustConfig.appToken);
        addString(map, "app_version", this.deviceInfo.appVersion);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        addBoolean(map, "attribution_deeplink", bool);
        addLong(map, "connectivity_type", this.deviceInfo.connectivityType);
        addString(map, com.json.mediationsdk.impressionData.ImpressionData.IMPRESSION_DATA_KEY_COUNTRY, this.deviceInfo.country);
        addString(map, "cpu_type", this.deviceInfo.abi);
        addDateInMilliseconds(map, "created_at", this.createdAt);
        addString(map, "currency", adjustEvent.currency);
        addBoolean(map, "needs_cost", this.adjustConfig.isCostDataInAttributionEnabled);
        addString(map, "device_manufacturer", this.deviceInfo.deviceManufacturer);
        addString(map, "device_name", this.deviceInfo.deviceName);
        addString(map, "device_type", this.deviceInfo.deviceType);
        addLong(map, "ui_mode", this.deviceInfo.uiMode);
        addString(map, "display_height", this.deviceInfo.displayHeight);
        addString(map, "display_width", this.deviceInfo.displayWidth);
        addString(map, "environment", this.adjustConfig.environment);
        addString(map, "event_callback_id", adjustEvent.callbackId);
        addLong(map, "event_count", this.activityStateCopy.f84a);
        addString(map, "event_token", adjustEvent.eventToken);
        addString(map, "external_device_id", this.adjustConfig.externalDeviceId);
        addString(map, "fb_id", this.deviceInfo.fbAttributionId);
        addString(map, "hardware_name", this.deviceInfo.hardwareName);
        addString(map, "language", this.deviceInfo.language);
        addString(map, "mcc", this.deviceInfo.mcc);
        addString(map, "mnc", this.deviceInfo.mnc);
        addBoolean(map, "needs_response_details", bool);
        addString(map, "os_build", this.deviceInfo.buildName);
        addString(map, "os_name", this.deviceInfo.osName);
        addString(map, "os_version", this.deviceInfo.osVersion);
        addString(map, com.ironsource.y8.h.V, this.deviceInfo.packageName);
        addString(map, "product_id", adjustEvent.productId);
        addString(map, "purchase_token", adjustEvent.purchaseToken);
        addString(map, "push_token", this.activityStateCopy.g);
        addDouble(map, "revenue", adjustEvent.revenue);
        addString(map, "order_id", adjustEvent.orderId);
        addString(map, "deduplication_id", adjustEvent.deduplicationId);
        addString(map, "screen_density", this.deviceInfo.screenDensity);
        addString(map, "screen_format", this.deviceInfo.screenFormat);
        addString(map, "screen_size", this.deviceInfo.screenSize);
        addLong(map, "session_count", this.activityStateCopy.b);
        addDuration(map, "session_length", this.activityStateCopy.e);
        addLong(map, "subsession_count", this.activityStateCopy.c);
        addDuration(map, "time_spent", this.activityStateCopy.d);
        if (!this.deviceInfo.isGooglePlayGamesForPC) {
            bool = null;
        }
        addBoolean(map, "gpg_pc_enabled", bool);
        addJsonObject(map, "control_params", com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(this.adjustConfig.context).getControlParamsJson());
        injectFeatureFlagsWithParameters(map);
        checkDeviceIds(map);
        return map;
    }

    private static void addDouble(java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str, java.lang.Double d) {
        if (d == null) {
            return;
        }
        addString(map, str, com.adjust.sdk.Util.formatString("%.5f", d));
    }

    private java.util.Map<java.lang.String, java.lang.String> getVerificationParameters(com.adjust.sdk.AdjustPlayStorePurchase adjustPlayStorePurchase) {
        java.util.HashMap map = new java.util.HashMap();
        this.deviceInfo.reloadOtherDeviceInfoParams(this.adjustConfig, logger);
        java.util.Map<java.lang.String, java.lang.String> map2 = this.deviceInfo.imeiParameters;
        if (map2 != null) {
            map.putAll(map2);
        }
        java.util.Map<java.lang.String, java.lang.String> map3 = this.deviceInfo.oaidParameters;
        if (map3 != null) {
            map.putAll(map3);
        }
        this.deviceInfo.reloadPlayIds(this.adjustConfig);
        addString(map, "android_uuid", this.activityStateCopy.f);
        addString(map, "gps_adid", this.deviceInfo.playAdId);
        addLong(map, "gps_adid_attempt", this.deviceInfo.playAdIdAttempt);
        addString(map, "gps_adid_src", this.deviceInfo.playAdIdSource);
        addBoolean(map, "tracking_enabled", this.deviceInfo.isTrackingEnabled);
        addString(map, "fire_adid", this.deviceInfo.fireAdId);
        addBoolean(map, "fire_tracking_enabled", this.deviceInfo.fireTrackingEnabled);
        if (!containsPlayIds(map) && !containsFireIds(map)) {
            logger.warn("Google Advertising ID or Fire Advertising ID not detected, fallback to non Google Play and Fire identifiers will take place", new java.lang.Object[0]);
            this.deviceInfo.reloadNonPlayIds(this.adjustConfig);
            addString(map, "android_id", this.deviceInfo.androidId);
        }
        addString(map, "api_level", this.deviceInfo.apiLevel);
        addString(map, "app_token", this.adjustConfig.appToken);
        addString(map, "app_version", this.deviceInfo.appVersion);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        addBoolean(map, "attribution_deeplink", bool);
        addLong(map, "connectivity_type", this.deviceInfo.connectivityType);
        addString(map, com.json.mediationsdk.impressionData.ImpressionData.IMPRESSION_DATA_KEY_COUNTRY, this.deviceInfo.country);
        addString(map, "cpu_type", this.deviceInfo.abi);
        addDateInMilliseconds(map, "created_at", this.createdAt);
        addString(map, "default_tracker", this.adjustConfig.defaultTracker);
        addBoolean(map, "needs_cost", this.adjustConfig.isCostDataInAttributionEnabled);
        addString(map, "device_manufacturer", this.deviceInfo.deviceManufacturer);
        addString(map, "device_name", this.deviceInfo.deviceName);
        addString(map, "device_type", this.deviceInfo.deviceType);
        addLong(map, "ui_mode", this.deviceInfo.uiMode);
        addString(map, "display_height", this.deviceInfo.displayHeight);
        addString(map, "display_width", this.deviceInfo.displayWidth);
        addString(map, "environment", this.adjustConfig.environment);
        addString(map, "external_device_id", this.adjustConfig.externalDeviceId);
        addString(map, "fb_id", this.deviceInfo.fbAttributionId);
        addString(map, "hardware_name", this.deviceInfo.hardwareName);
        addString(map, "installed_at", this.deviceInfo.appInstallTime);
        addString(map, "language", this.deviceInfo.language);
        addString(map, "mcc", this.deviceInfo.mcc);
        addString(map, "mnc", this.deviceInfo.mnc);
        addBoolean(map, "needs_response_details", bool);
        addString(map, "os_build", this.deviceInfo.buildName);
        addString(map, "os_name", this.deviceInfo.osName);
        addString(map, "os_version", this.deviceInfo.osVersion);
        addString(map, com.ironsource.y8.h.V, this.deviceInfo.packageName);
        addString(map, "push_token", this.activityStateCopy.g);
        addString(map, "screen_density", this.deviceInfo.screenDensity);
        addString(map, "screen_format", this.deviceInfo.screenFormat);
        addString(map, "screen_size", this.deviceInfo.screenSize);
        addLong(map, "session_count", this.activityStateCopy.b);
        addDuration(map, "session_length", this.activityStateCopy.e);
        addLong(map, "subsession_count", this.activityStateCopy.c);
        addDuration(map, "time_spent", this.activityStateCopy.d);
        addString(map, "updated_at", this.deviceInfo.appUpdateTime);
        addString(map, "product_id", adjustPlayStorePurchase.getProductId());
        addString(map, "purchase_token", adjustPlayStorePurchase.getPurchaseToken());
        if (!this.deviceInfo.isGooglePlayGamesForPC) {
            bool = null;
        }
        addBoolean(map, "gpg_pc_enabled", bool);
        addJsonObject(map, "control_params", com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(this.adjustConfig.context).getControlParamsJson());
        injectFeatureFlagsWithParameters(map);
        checkDeviceIds(map);
        return map;
    }

    public com.adjust.sdk.ActivityPackage buildVerificationPackage(com.adjust.sdk.AdjustPlayStorePurchase adjustPlayStorePurchase, com.adjust.sdk.OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener) {
        java.util.Map<java.lang.String, java.lang.String> verificationParameters = getVerificationParameters(adjustPlayStorePurchase);
        com.adjust.sdk.ActivityPackage defaultActivityPackage = getDefaultActivityPackage(com.adjust.sdk.ActivityKind.PURCHASE_VERIFICATION);
        defaultActivityPackage.setPath("/verify");
        defaultActivityPackage.setSuffix("");
        defaultActivityPackage.setPurchaseVerificationCallback(onPurchaseVerificationFinishedListener);
        defaultActivityPackage.setParameters(verificationParameters);
        return defaultActivityPackage;
    }
}
