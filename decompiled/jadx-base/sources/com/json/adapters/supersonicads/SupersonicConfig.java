package com.json.adapters.supersonicads;

/* JADX INFO: loaded from: classes5.dex */
public class SupersonicConfig {
    private static com.json.adapters.supersonicads.SupersonicConfig mInstance;
    private final java.lang.String CUSTOM_PARAM_PREFIX = androidx.media3.datasource.cache.ContentMetadata.KEY_CUSTOM_PREFIX;
    private final java.lang.String CLIENT_SIDE_CALLBACKS = "useClientSideCallbacks";
    private final java.lang.String DYNAMIC_CONTROLLER_URL = "controllerUrl";
    private final java.lang.String DYNAMIC_CONTROLLER_DEBUG_MODE = "debugMode";
    com.json.mediationsdk.model.NetworkSettings mProviderSettings = new com.json.mediationsdk.model.NetworkSettings(com.json.yp.c().b("Mediation"));

    private SupersonicConfig() {
    }

    private java.util.Map<java.lang.String, java.lang.String> convertCustomParams(java.util.Map<java.lang.String, java.lang.String> map) {
        java.util.HashMap map2 = new java.util.HashMap();
        if (map != null) {
            try {
                java.util.Set<java.lang.String> setKeySet = map.keySet();
                if (setKeySet != null) {
                    for (java.lang.String str : setKeySet) {
                        if (!android.text.TextUtils.isEmpty(str)) {
                            java.lang.String str2 = map.get(str);
                            if (android.text.TextUtils.isEmpty(str2)) {
                                continue;
                            } else {
                                map2.put(androidx.media3.datasource.cache.ContentMetadata.KEY_CUSTOM_PREFIX + str, str2);
                            }
                        }
                    }
                }
            } catch (java.lang.Exception e) {
                com.json.l9.d().a(e);
                com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE, ":convertCustomParams()", e);
            }
        }
        return map2;
    }

    public static com.json.adapters.supersonicads.SupersonicConfig getConfigObj() {
        if (mInstance == null) {
            mInstance = new com.json.adapters.supersonicads.SupersonicConfig();
        }
        return mInstance;
    }

    public boolean getClientSideCallbacks() {
        com.json.mediationsdk.model.NetworkSettings networkSettings = this.mProviderSettings;
        if (networkSettings == null || networkSettings.getRewardedVideoSettings() == null || !this.mProviderSettings.getRewardedVideoSettings().has("useClientSideCallbacks")) {
            return false;
        }
        return this.mProviderSettings.getRewardedVideoSettings().optBoolean("useClientSideCallbacks", false);
    }

    public void setClientSideCallbacks(boolean z) {
        this.mProviderSettings.setRewardedVideoSettings("useClientSideCallbacks", java.lang.String.valueOf(z));
    }

    public void setCustomControllerUrl(java.lang.String str) {
        this.mProviderSettings.setRewardedVideoSettings("controllerUrl", str);
        this.mProviderSettings.setInterstitialSettings("controllerUrl", str);
        this.mProviderSettings.setBannerSettings("controllerUrl", str);
        this.mProviderSettings.setNativeAdSettings("controllerUrl", str);
    }

    public void setDebugMode(int i) {
        this.mProviderSettings.setRewardedVideoSettings("debugMode", java.lang.Integer.valueOf(i));
        this.mProviderSettings.setInterstitialSettings("debugMode", java.lang.Integer.valueOf(i));
        this.mProviderSettings.setBannerSettings("debugMode", java.lang.Integer.valueOf(i));
        this.mProviderSettings.setNativeAdSettings("debugMode", java.lang.Integer.valueOf(i));
    }
}
