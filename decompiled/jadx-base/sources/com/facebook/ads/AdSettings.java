package com.facebook.ads;

/* JADX INFO: loaded from: classes4.dex */
public class AdSettings {
    public static final boolean DEBUG = false;

    public enum IntegrationErrorMode {
        INTEGRATION_ERROR_CRASH_DEBUG_MODE,
        INTEGRATION_ERROR_CALLBACK_MODE;

        public static final long serialVersionUID = 1;
    }

    public enum TestAdType implements java.io.Serializable {
        DEFAULT("DEFAULT", androidx.webkit.Profile.DEFAULT_PROFILE_NAME),
        IMG_16_9_APP_INSTALL("IMG_16_9_APP_INSTALL", "Image App install"),
        IMG_16_9_LINK("IMG_16_9_LINK", "Image link"),
        VIDEO_HD_16_9_46S_APP_INSTALL("VID_HD_16_9_46S_APP_INSTALL", "Video 46 sec App install"),
        VIDEO_HD_16_9_46S_LINK("VID_HD_16_9_46S_LINK", "Video 46 sec link"),
        VIDEO_HD_16_9_15S_APP_INSTALL("VID_HD_16_9_15S_APP_INSTALL", "Video 15 sec App install"),
        VIDEO_HD_16_9_15S_LINK("VID_HD_16_9_15S_LINK", "Video 15 sec link"),
        VIDEO_HD_9_16_39S_APP_INSTALL("VID_HD_9_16_39S_APP_INSTALL", "Video 39 sec App install"),
        VIDEO_HD_9_16_39S_LINK("VID_HD_9_16_39S_LINK", "Video 39 sec link"),
        CAROUSEL_IMG_SQUARE_APP_INSTALL("CAROUSEL_IMG_SQUARE_APP_INSTALL", "Carousel App install"),
        CAROUSEL_IMG_SQUARE_LINK("CAROUSEL_IMG_SQUARE_LINK", "Carousel link"),
        PLAYABLE("PLAYABLE", "Playable ad");

        public static final long serialVersionUID = 1;
        private final java.lang.String adTypeString;
        private final java.lang.String humanReadable;

        TestAdType(java.lang.String str, java.lang.String str2) {
            this.adTypeString = str;
            this.humanReadable = str2;
        }

        public java.lang.String getAdTypeString() {
            return this.adTypeString;
        }

        public java.lang.String getHumanReadable() {
            return this.humanReadable;
        }
    }

    public static void setDebugBuild(boolean z) {
        com.facebook.ads.internal.settings.AdInternalSettings.setDebugBuild(z);
    }

    public static void turnOnSDKDebugger(android.content.Context context) {
        com.facebook.ads.internal.settings.AdInternalSettings.turnOnSDKDebugger(context);
    }

    public static void addTestDevice(java.lang.String str) {
        com.facebook.ads.internal.settings.AdInternalSettings.addTestDevice(str);
    }

    public static void addTestDevices(java.util.Collection<java.lang.String> collection) {
        com.facebook.ads.internal.settings.AdInternalSettings.addTestDevices(collection);
    }

    public static void clearTestDevices() {
        com.facebook.ads.internal.settings.AdInternalSettings.clearTestDevices();
    }

    public static boolean isTestMode(android.content.Context context) {
        return com.facebook.ads.internal.settings.AdInternalSettings.isTestMode(context);
    }

    public static void setTestMode(boolean z) {
        com.facebook.ads.internal.settings.AdInternalSettings.setTestMode(z);
    }

    public static void setUrlPrefix(java.lang.String str) {
        com.facebook.ads.internal.settings.AdInternalSettings.setUrlPrefix(str);
    }

    public static java.lang.String getUrlPrefix() {
        return com.facebook.ads.internal.settings.AdInternalSettings.getUrlPrefix();
    }

    public static boolean isVideoAutoplay() {
        return com.facebook.ads.internal.settings.AdInternalSettings.isVideoAutoplay();
    }

    public static boolean isVideoAutoplayOnMobile() {
        return com.facebook.ads.internal.settings.AdInternalSettings.isVideoAutoplayOnMobile();
    }

    public static void setVideoAutoplay(boolean z) {
        com.facebook.ads.internal.settings.AdInternalSettings.setVideoAutoplay(z);
    }

    public static void setVideoAutoplayOnMobile(boolean z) {
        com.facebook.ads.internal.settings.AdInternalSettings.setVideoAutoplayOnMobile(z);
    }

    public static void setMediationService(java.lang.String str) {
        com.facebook.ads.internal.settings.AdInternalSettings.setMediationService(str);
    }

    public static java.lang.String getMediationService() {
        return com.facebook.ads.internal.settings.AdInternalSettings.getMediationService();
    }

    public static void setMixedAudience(boolean z) {
        com.facebook.ads.internal.settings.AdInternalSettings.sSettingsBundle.putBoolean(com.facebook.ads.internal.settings.AdInternalSettings.BOOL_MIXED_AUDIENCE_KEY, z);
    }

    public static boolean isMixedAudience() {
        return com.facebook.ads.internal.settings.AdInternalSettings.sSettingsBundle.getBoolean(com.facebook.ads.internal.settings.AdInternalSettings.BOOL_MIXED_AUDIENCE_KEY, false);
    }

    public static void setTestAdType(com.facebook.ads.AdSettings.TestAdType testAdType) {
        com.facebook.ads.internal.settings.AdInternalSettings.sSettingsBundle.putSerializable(com.facebook.ads.internal.settings.AdInternalSettings.TEST_AD_TYPE_KEY, testAdType);
    }

    public static com.facebook.ads.AdSettings.TestAdType getTestAdType() {
        java.io.Serializable serializable = com.facebook.ads.internal.settings.AdInternalSettings.sSettingsBundle.getSerializable(com.facebook.ads.internal.settings.AdInternalSettings.TEST_AD_TYPE_KEY);
        if (!(serializable instanceof com.facebook.ads.AdSettings.TestAdType)) {
            com.facebook.ads.internal.settings.AdInternalSettings.sSettingsBundle.putSerializable(com.facebook.ads.internal.settings.AdInternalSettings.TEST_AD_TYPE_KEY, com.facebook.ads.AdSettings.TestAdType.DEFAULT);
            return com.facebook.ads.AdSettings.TestAdType.DEFAULT;
        }
        return (com.facebook.ads.AdSettings.TestAdType) serializable;
    }

    public static void setVisibleAnimation(boolean z) {
        com.facebook.ads.internal.settings.AdInternalSettings.setVisibleAnimation(z);
    }

    public static void setIntegrationErrorMode(com.facebook.ads.AdSettings.IntegrationErrorMode integrationErrorMode) {
        com.facebook.ads.internal.settings.AdInternalSettings.sSettingsBundle.putSerializable(com.facebook.ads.internal.settings.AdInternalSettings.SRL_INTEGRATION_ERROR_MODE_KEY, integrationErrorMode);
    }

    public static void setDataProcessingOptions(java.lang.String[] strArr) {
        com.facebook.ads.internal.settings.AdInternalSettings.setDataProcessingOptions(strArr, null, null);
    }

    public static void setDataProcessingOptions(java.lang.String[] strArr, int i, int i2) {
        com.facebook.ads.internal.settings.AdInternalSettings.setDataProcessingOptions(strArr, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
    }
}
