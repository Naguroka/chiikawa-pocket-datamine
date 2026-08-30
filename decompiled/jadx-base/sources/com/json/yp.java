package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class yp {
    private static com.json.yp b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.json.mediationsdk.model.NetworkSettings> f3593a = new java.util.concurrent.ConcurrentHashMap<>();

    private yp() {
    }

    public static synchronized com.json.yp c() {
        if (b == null) {
            b = new com.json.yp();
        }
        return b;
    }

    public java.util.HashSet<java.lang.String> a(java.lang.String str, java.lang.String str2) {
        java.util.HashSet<java.lang.String> hashSet = new java.util.HashSet<>();
        try {
            for (com.json.mediationsdk.model.NetworkSettings networkSettings : this.f3593a.values()) {
                if (networkSettings.getProviderTypeForReflection().equals(str)) {
                    if (networkSettings.getRewardedVideoSettings() != null && networkSettings.getRewardedVideoSettings().length() > 0 && !android.text.TextUtils.isEmpty(networkSettings.getRewardedVideoSettings().optString(str2))) {
                        hashSet.add(networkSettings.getRewardedVideoSettings().optString(str2));
                    }
                    if (networkSettings.getInterstitialSettings() != null && networkSettings.getInterstitialSettings().length() > 0 && !android.text.TextUtils.isEmpty(networkSettings.getInterstitialSettings().optString(str2))) {
                        hashSet.add(networkSettings.getInterstitialSettings().optString(str2));
                    }
                    if (networkSettings.getBannerSettings() != null && networkSettings.getBannerSettings().length() > 0 && !android.text.TextUtils.isEmpty(networkSettings.getBannerSettings().optString(str2))) {
                        hashSet.add(networkSettings.getBannerSettings().optString(str2));
                    }
                    if (networkSettings.getNativeAdSettings() != null && networkSettings.getNativeAdSettings().length() > 0 && !android.text.TextUtils.isEmpty(networkSettings.getNativeAdSettings().optString(str2))) {
                        hashSet.add(networkSettings.getNativeAdSettings().optString(str2));
                    }
                }
            }
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
        }
        return hashSet;
    }

    public void a() {
        this.f3593a.clear();
    }

    public void a(com.json.mediationsdk.model.NetworkSettings networkSettings) {
        if (networkSettings == null || android.text.TextUtils.isEmpty(networkSettings.getProviderName())) {
            return;
        }
        this.f3593a.put(networkSettings.getProviderName(), networkSettings);
    }

    public boolean a(java.lang.String str) {
        return this.f3593a.containsKey(str);
    }

    public com.json.mediationsdk.model.NetworkSettings b(java.lang.String str) {
        com.json.mediationsdk.model.NetworkSettings networkSettings = this.f3593a.get(str);
        if (networkSettings != null) {
            return networkSettings;
        }
        com.json.mediationsdk.model.NetworkSettings networkSettings2 = new com.json.mediationsdk.model.NetworkSettings(str);
        a(networkSettings2);
        return networkSettings2;
    }

    public void b() {
        for (com.json.mediationsdk.model.NetworkSettings networkSettings : this.f3593a.values()) {
            if (networkSettings.isMultipleInstances() && !android.text.TextUtils.isEmpty(networkSettings.getProviderTypeForReflection())) {
                com.json.mediationsdk.model.NetworkSettings networkSettingsB = b(networkSettings.getProviderDefaultInstance());
                networkSettings.setApplicationSettings(com.json.mediationsdk.utils.IronSourceUtils.mergeJsons(networkSettings.getApplicationSettings(), networkSettingsB.getApplicationSettings()));
                networkSettings.setInterstitialSettings(com.json.mediationsdk.utils.IronSourceUtils.mergeJsons(networkSettings.getInterstitialSettings(), networkSettingsB.getInterstitialSettings()));
                networkSettings.setRewardedVideoSettings(com.json.mediationsdk.utils.IronSourceUtils.mergeJsons(networkSettings.getRewardedVideoSettings(), networkSettingsB.getRewardedVideoSettings()));
                networkSettings.setBannerSettings(com.json.mediationsdk.utils.IronSourceUtils.mergeJsons(networkSettings.getBannerSettings(), networkSettingsB.getBannerSettings()));
                networkSettings.setNativeAdSettings(com.json.mediationsdk.utils.IronSourceUtils.mergeJsons(networkSettings.getNativeAdSettings(), networkSettingsB.getNativeAdSettings()));
            }
        }
    }

    public com.json.mediationsdk.model.NetworkSettings c(java.lang.String str) {
        for (com.json.mediationsdk.model.NetworkSettings networkSettings : this.f3593a.values()) {
            if ("IronSource".equals(networkSettings.getProviderTypeForReflection()) && str.equalsIgnoreCase(networkSettings.getSubProviderId())) {
                return networkSettings;
            }
        }
        return new com.json.mediationsdk.model.NetworkSettings(str);
    }

    public java.util.concurrent.ConcurrentHashMap<java.lang.String, com.json.mediationsdk.model.NetworkSettings> d() {
        return this.f3593a;
    }
}
