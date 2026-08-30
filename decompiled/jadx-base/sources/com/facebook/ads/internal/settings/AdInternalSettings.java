package com.facebook.ads.internal.settings;

/* JADX INFO: loaded from: classes4.dex */
public class AdInternalSettings {
    private static final java.lang.String BOOL_AUTOPLAY_ON_MOBILE_KEY = "BOOL_AUTOPLAY_ON_MOBILE_KEY";
    private static final java.lang.String BOOL_DEBUGGER_STATE_KEY = "BOOL_DEBUGGER_STATE_KEY";
    private static final java.lang.String BOOL_DEBUG_BUILD_KEY = "BOOL_DEBUG_BUILD_KEY";
    public static final java.lang.String BOOL_EXPLICIT_TEST_MODE_KEY = "BOOL_EXPLICIT_TEST_MODE_KEY";
    public static final java.lang.String BOOL_MIXED_AUDIENCE_KEY = "BOOL_MIXED_AUDIENCE_KEY";
    private static final java.lang.String BOOL_VIDEO_AUTOPLAY_KEY = "BOOL_VIDEO_AUTOPLAY_KEY";
    private static final java.lang.String BOOL_VISIBLE_ANIMATION_KEY = "BOOL_VISIBLE_ANIMATION_KEY";
    public static final java.lang.String DATA_PROCESSING_OPTIONS_COUNTRY_KEY = "DATA_PROCESSING_OPTIONS_COUNTRY_KEY";
    public static final java.lang.String DATA_PROCESSING_OPTIONS_KEY = "DATA_PROCESSING_OPTIONS_KEY";
    public static final java.lang.String DATA_PROCESSING_OPTIONS_STATE_KEY = "DATA_PROCESSING_OPTIONS_STATE_KEY";
    private static final java.lang.String LIST_TEST_DEVICES_KEY = "LIST_TEST_DEVICES_KEY";
    public static final java.lang.String SRL_INTEGRATION_ERROR_MODE_KEY = "SRL_INTEGRATION_ERROR_MODE_KEY";
    public static final java.lang.String STR_AD_TEST_TYPE_KEY = "STR_AD_TEST_TYPE_KEY";
    public static final java.lang.String STR_MEDIATION_SERVICE_KEY = "STR_MEDIATION_SERVICE_KEY";
    private static final java.lang.String STR_URL_PREFIX_KEY = "STR_URL_PREFIX_KEY";
    public static final java.lang.String TEST_AD_TYPE_KEY = "TEST_AD_TYPE_KEY";
    public static final com.facebook.ads.internal.settings.MultithreadedBundleWrapper sSettingsBundle = new com.facebook.ads.internal.settings.MultithreadedBundleWrapper();
    public static final java.util.concurrent.atomic.AtomicBoolean sDataProcessingOptionsUpdate = new java.util.concurrent.atomic.AtomicBoolean(false);

    public static void setTestMode(boolean z) {
        sSettingsBundle.putBoolean(BOOL_EXPLICIT_TEST_MODE_KEY, z);
    }

    public static void setVisibleAnimation(boolean z) {
        sSettingsBundle.putBoolean(BOOL_VISIBLE_ANIMATION_KEY, z);
    }

    public static void setUrlPrefix(java.lang.String str) {
        sSettingsBundle.putString(STR_URL_PREFIX_KEY, str);
    }

    public static void setMediationService(java.lang.String str) {
        sSettingsBundle.putString(STR_MEDIATION_SERVICE_KEY, str);
    }

    public static boolean isExplicitTestMode() {
        return sSettingsBundle.getBoolean(BOOL_EXPLICIT_TEST_MODE_KEY, false);
    }

    public static boolean isTestMode(android.content.Context context) {
        return com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.makeLoader(context).createAdSettingsApi().isTestMode(context);
    }

    public static boolean isVisibleAnimation() {
        return sSettingsBundle.getBoolean(BOOL_VISIBLE_ANIMATION_KEY, false);
    }

    public static java.lang.String getUrlPrefix() {
        return sSettingsBundle.getString(STR_URL_PREFIX_KEY, null);
    }

    public static java.lang.String getMediationService() {
        return sSettingsBundle.getString(STR_MEDIATION_SERVICE_KEY, null);
    }

    public static void addTestDevices(java.util.Collection<java.lang.String> collection) {
        getTestDevicesList().addAll(collection);
    }

    public static void addTestDevice(java.lang.String str) {
        getTestDevicesList().add(str);
    }

    public static void clearTestDevices() {
        getTestDevicesList().clear();
    }

    public static void turnOnSDKDebugger(android.content.Context context) {
        com.facebook.ads.internal.dynamicloading.DynamicLoader dynamicLoader = com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.getDynamicLoader();
        if (dynamicLoader != null) {
            dynamicLoader.createAdSettingsApi().turnOnDebugger();
        } else {
            sSettingsBundle.putBoolean(BOOL_DEBUGGER_STATE_KEY, true);
        }
    }

    public static void setDebugBuild(boolean z) {
        com.facebook.ads.internal.dynamicloading.DynamicLoader dynamicLoader = com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.getDynamicLoader();
        if (dynamicLoader != null && z) {
            dynamicLoader.createAdSettingsApi().turnOnDebugger();
        }
        sSettingsBundle.putBoolean(BOOL_DEBUG_BUILD_KEY, z);
    }

    public static boolean isVideoAutoplay() {
        return sSettingsBundle.getBoolean(BOOL_VIDEO_AUTOPLAY_KEY);
    }

    public static void setVideoAutoplay(boolean z) {
        sSettingsBundle.putBoolean(BOOL_VIDEO_AUTOPLAY_KEY, z);
    }

    public static void setVideoAutoplayOnMobile(boolean z) {
        sSettingsBundle.putBoolean(BOOL_AUTOPLAY_ON_MOBILE_KEY, z);
    }

    public static boolean isVideoAutoplayOnMobile() {
        return sSettingsBundle.getBoolean(BOOL_AUTOPLAY_ON_MOBILE_KEY, false);
    }

    public static boolean isDebugBuild() {
        return sSettingsBundle.getBoolean(BOOL_DEBUG_BUILD_KEY, false);
    }

    public static boolean isDebuggerOn() {
        return sSettingsBundle.getBoolean(BOOL_DEBUGGER_STATE_KEY, false);
    }

    public static java.util.ArrayList<java.lang.String> getTestDevicesList() {
        com.facebook.ads.internal.settings.MultithreadedBundleWrapper multithreadedBundleWrapper = sSettingsBundle;
        java.util.ArrayList<java.lang.String> stringArrayList = multithreadedBundleWrapper.getStringArrayList(LIST_TEST_DEVICES_KEY);
        if (stringArrayList != null) {
            return stringArrayList;
        }
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        multithreadedBundleWrapper.putStringArrayList(LIST_TEST_DEVICES_KEY, arrayList);
        return arrayList;
    }

    public static void setDataProcessingOptions(java.lang.String[] strArr, java.lang.Integer num, java.lang.Integer num2) {
        com.facebook.ads.internal.settings.MultithreadedBundleWrapper multithreadedBundleWrapper = sSettingsBundle;
        synchronized (multithreadedBundleWrapper) {
            sDataProcessingOptionsUpdate.set(true);
            multithreadedBundleWrapper.putStringArray(DATA_PROCESSING_OPTIONS_KEY, strArr);
            multithreadedBundleWrapper.putInteger(DATA_PROCESSING_OPTIONS_COUNTRY_KEY, num);
            multithreadedBundleWrapper.putInteger(DATA_PROCESSING_OPTIONS_STATE_KEY, num2);
        }
    }
}
