package com.json.mediationsdk.server;

/* JADX INFO: loaded from: classes5.dex */
public class ServerURL {
    private static final java.lang.String AMPERSAND = "&";
    private static final java.lang.String ANDROID = "android";
    private static final java.lang.String APPLICATION_KEY = "applicationKey";
    private static final java.lang.String APPLICATION_USER_ID = "applicationUserId";
    private static final java.lang.String APPLICATION_VERSION = "appVer";
    private static final java.lang.String AUID = "auid";
    private static java.lang.String BASE_URL_PREFIX = "https://i-sdk.mediation.unity3d.com/sdk/v";
    private static final java.lang.String BASE_URL_SUFFIX = "?request=";
    private static final java.lang.String BROWSER_USER_AGENT = "browserUserAgent";
    private static final java.lang.String BUNDLE_ID = "bundleId";
    private static final java.lang.String CONNECTION_TYPE = "connType";
    private static final java.lang.String COPPA = "coppa";
    private static final java.lang.String DEVICE_LANG = "deviceLang";
    private static final java.lang.String DEVICE_MAKE = "devMake";
    private static final java.lang.String DEVICE_MODEL = "devModel";
    private static final java.lang.String EQUAL = "=";
    private static final java.lang.String FIRST_SESSION = "fs";
    private static final java.lang.String GAID = "advId";
    private static final java.lang.String GOOGLE_FAMILY_SUPPORT = "dff";
    private static final java.lang.String IMPRESSION = "impression";
    private static final java.lang.String ISO_COUNTRY_CODE = "icc";
    private static final java.lang.String IS_DEMAND_ONLY = "isDemandOnly";
    private static final java.lang.String MEDIATION_TYPE = "mt";
    private static final java.lang.String MOBILE_CARRIER = "mCar";
    private static final java.lang.String MOBILE_COUNTRY_CODE = "mcc";
    private static final java.lang.String MOBILE_NETWORK_CODE = "mnc";
    private static final java.lang.String OS_VERSION = "osVer";
    private static final java.lang.String PLACEMENT = "placementId";
    private static final java.lang.String PLATFORM_KEY = "platform";
    private static final java.lang.String PLUGIN_FW_VERSION = "plugin_fw_v";
    private static final java.lang.String PLUGIN_TYPE = "pluginType";
    private static final java.lang.String PLUGIN_VERSION = "pluginVersion";
    private static final java.lang.String REWARDED_VIDEO_MANUAL_MODE = "rvManual";
    private static final java.lang.String SDK_VERSION = "sdkVersion";
    private static final java.lang.String SERR = "serr";
    private static final java.lang.String TEST_SUITE = "ts";
    private static final java.lang.String TIME_ZONE_ID = "tz";
    private static final java.lang.String TIME_ZONE_OFFSET = "tzOff";

    public static java.lang.String buildInitURL(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, java.util.List<android.util.Pair<java.lang.String, java.lang.String>> list, boolean z2) throws java.io.UnsupportedEncodingException {
        java.lang.String str5;
        java.util.List<java.lang.String> list2;
        com.json.Cif cifF = com.json.im.S().f();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new android.util.Pair("platform", "android"));
        arrayList.add(new android.util.Pair("applicationKey", str));
        if (!android.text.TextUtils.isEmpty(str2)) {
            arrayList.add(new android.util.Pair("applicationUserId", str2));
        }
        arrayList.add(new android.util.Pair("sdkVersion", com.json.mediationsdk.utils.IronSourceUtils.getSDKVersion()));
        if (z) {
            arrayList.add(new android.util.Pair(REWARDED_VIDEO_MANUAL_MODE, "1"));
        }
        if (!com.json.mediationsdk.utils.IronSourceUtils.isEncryptedResponse()) {
            arrayList.add(new android.util.Pair(SERR, "0"));
        }
        if (!android.text.TextUtils.isEmpty(com.json.mediationsdk.config.ConfigFile.getConfigFile().getPluginType())) {
            arrayList.add(new android.util.Pair(PLUGIN_TYPE, com.json.mediationsdk.config.ConfigFile.getConfigFile().getPluginType()));
        }
        if (!android.text.TextUtils.isEmpty(com.json.mediationsdk.config.ConfigFile.getConfigFile().getPluginVersion())) {
            arrayList.add(new android.util.Pair(PLUGIN_VERSION, com.json.mediationsdk.config.ConfigFile.getConfigFile().getPluginVersion()));
        }
        if (!android.text.TextUtils.isEmpty(com.json.mediationsdk.config.ConfigFile.getConfigFile().getPluginFrameworkVersion())) {
            arrayList.add(new android.util.Pair(PLUGIN_FW_VERSION, com.json.mediationsdk.config.ConfigFile.getConfigFile().getPluginFrameworkVersion()));
        }
        if (!android.text.TextUtils.isEmpty(str3)) {
            arrayList.add(new android.util.Pair(GAID, str3));
        }
        if (!android.text.TextUtils.isEmpty(str4)) {
            arrayList.add(new android.util.Pair("mt", str4));
        }
        java.lang.String strB = com.json.z3.b(context, context.getPackageName());
        if (!android.text.TextUtils.isEmpty(strB)) {
            arrayList.add(new android.util.Pair(APPLICATION_VERSION, strB));
        }
        arrayList.add(new android.util.Pair(OS_VERSION, android.os.Build.VERSION.SDK_INT + ""));
        arrayList.add(new android.util.Pair(DEVICE_MAKE, android.os.Build.MANUFACTURER));
        arrayList.add(new android.util.Pair(DEVICE_MODEL, android.os.Build.MODEL));
        arrayList.add(new android.util.Pair("fs", (com.json.mediationsdk.utils.IronSourceUtils.getFirstSession(context) ? 1 : 0) + ""));
        java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<java.lang.String>> concurrentHashMapC = com.json.lk.b().c();
        if (concurrentHashMapC.containsKey(com.json.mediationsdk.metadata.a.b)) {
            arrayList.add(new android.util.Pair(COPPA, concurrentHashMapC.get(com.json.mediationsdk.metadata.a.b).get(0)));
        }
        if (concurrentHashMapC.containsKey(com.json.mediationsdk.metadata.a.f)) {
            java.lang.String str6 = concurrentHashMapC.get(com.json.mediationsdk.metadata.a.f).get(0);
            if (!android.text.TextUtils.isEmpty(str6) && str6.equalsIgnoreCase(com.json.mediationsdk.metadata.a.j)) {
                arrayList.add(new android.util.Pair("ts", "1"));
            }
        }
        if (concurrentHashMapC.containsKey(com.json.mediationsdk.metadata.a.d)) {
            java.lang.String str7 = concurrentHashMapC.get(com.json.mediationsdk.metadata.a.d).get(0);
            if (!android.text.TextUtils.isEmpty(str7) && str7.equalsIgnoreCase(com.json.mediationsdk.metadata.a.g)) {
                arrayList.add(new android.util.Pair(GOOGLE_FAMILY_SUPPORT, "1"));
            }
        }
        if (concurrentHashMapC.containsKey(com.json.mediationsdk.metadata.a.e) && (list2 = concurrentHashMapC.get(com.json.mediationsdk.metadata.a.e)) != null) {
            arrayList.add(new android.util.Pair(com.json.mediationsdk.metadata.a.e, list2.get(0)));
        }
        java.lang.String connectionType = com.json.mediationsdk.utils.IronSourceUtils.getConnectionType(context);
        if (!android.text.TextUtils.isEmpty(connectionType)) {
            arrayList.add(new android.util.Pair(CONNECTION_TYPE, connectionType));
        }
        if (list != null) {
            arrayList.addAll(list);
        }
        java.lang.String strS = cifF.s();
        if (strS.length() != 0) {
            arrayList.add(new android.util.Pair(BROWSER_USER_AGENT, strS));
        }
        try {
            str5 = cifF.b(context) + "-" + cifF.G(context);
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            str5 = null;
        }
        if (str5 != null && str5.length() != 0) {
            arrayList.add(new android.util.Pair(DEVICE_LANG, str5));
        }
        arrayList.add(new android.util.Pair("bundleId", context.getPackageName()));
        arrayList.add(new android.util.Pair("mcc", "" + com.json.u8.b(context)));
        arrayList.add(new android.util.Pair("mnc", "" + com.json.u8.c(context)));
        java.lang.String strN = cifF.n(context);
        if (!android.text.TextUtils.isEmpty(strN)) {
            arrayList.add(new android.util.Pair("icc", strN));
        }
        java.lang.String strJ = cifF.j(context);
        if (!android.text.TextUtils.isEmpty(strJ)) {
            arrayList.add(new android.util.Pair(MOBILE_CARRIER, strJ));
        }
        java.lang.String strB2 = cifF.b();
        if (!android.text.TextUtils.isEmpty(strB2)) {
            arrayList.add(new android.util.Pair("tz", strB2));
        }
        arrayList.add(new android.util.Pair(TIME_ZONE_OFFSET, "" + cifF.p()));
        java.lang.String strS2 = cifF.s(context);
        if (!android.text.TextUtils.isEmpty(strS2)) {
            arrayList.add(new android.util.Pair("auid", strS2));
        }
        if (z2) {
            arrayList.add(new android.util.Pair("isDemandOnly", "1"));
        }
        arrayList.add(new android.util.Pair(com.json.ce.Y, java.lang.String.valueOf(com.json.h1.a())));
        return getBaseUrl(com.json.mediationsdk.utils.IronSourceUtils.getSDKVersion()) + java.net.URLEncoder.encode(com.json.mediationsdk.utils.IronSourceAES.encode(com.json.jb.b().c(), createURLParams(arrayList)), com.adjust.sdk.Constants.ENCODING);
    }

    private static java.lang.String createURLParams(java.util.List<android.util.Pair<java.lang.String, java.lang.String>> list) throws java.io.UnsupportedEncodingException {
        java.lang.String str = "";
        for (android.util.Pair<java.lang.String, java.lang.String> pair : list) {
            if (str.length() > 0) {
                str = str + "&";
            }
            str = str + ((java.lang.String) pair.first) + "=" + java.net.URLEncoder.encode((java.lang.String) pair.second, com.adjust.sdk.Constants.ENCODING);
        }
        return str;
    }

    private static java.lang.String getBaseUrl(java.lang.String str) {
        return BASE_URL_PREFIX + str + BASE_URL_SUFFIX;
    }

    public static java.lang.String getRequestURL(java.lang.String str, boolean z, int i) throws java.io.UnsupportedEncodingException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new android.util.Pair("impression", java.lang.Boolean.toString(z)));
        arrayList.add(new android.util.Pair("placementId", java.lang.Integer.toString(i)));
        return str + "&" + createURLParams(arrayList);
    }

    private static void setBaseUrlPrefix(java.lang.String str) {
        BASE_URL_PREFIX = str;
    }
}
