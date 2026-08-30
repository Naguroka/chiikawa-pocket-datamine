package com.facebook.ads;

/* JADX INFO: loaded from: classes4.dex */
public class NativeAdsManager {
    private final com.facebook.ads.internal.api.NativeAdsManagerApi mNativeAdsManagerApi;

    public interface Listener {
        void onAdError(com.facebook.ads.AdError adError);

        void onAdsLoaded();
    }

    public NativeAdsManager(android.content.Context context, java.lang.String str, int i) {
        com.facebook.ads.internal.util.common.Preconditions.checkNotNull(context, "Context can not be null");
        com.facebook.ads.internal.util.common.Preconditions.checkIsTrue(i > -1, "Number of requested ads should be not be negative");
        this.mNativeAdsManagerApi = com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.makeLoader(context).createNativeAdsManagerApi(context, str, i);
    }

    public void setListener(com.facebook.ads.NativeAdsManager.Listener listener) {
        this.mNativeAdsManagerApi.setListener(listener);
    }

    public void setExtraHints(java.lang.String str) {
        this.mNativeAdsManagerApi.setExtraHints(str);
    }

    public void loadAds() {
        this.mNativeAdsManagerApi.loadAds();
    }

    public void loadAds(com.facebook.ads.NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        this.mNativeAdsManagerApi.loadAds(mediaCacheFlag);
    }

    public int getUniqueNativeAdCount() {
        return this.mNativeAdsManagerApi.getUniqueNativeAdCount();
    }

    public com.facebook.ads.NativeAd nextNativeAd() {
        return this.mNativeAdsManagerApi.nextNativeAd();
    }

    public com.facebook.ads.NativeAd nextNativeAd(com.facebook.ads.NativeAdListener nativeAdListener) {
        return this.mNativeAdsManagerApi.nextNativeAd(nativeAdListener);
    }

    public boolean isLoaded() {
        return this.mNativeAdsManagerApi.isLoaded();
    }

    public void disableAutoRefresh() {
        this.mNativeAdsManagerApi.disableAutoRefresh();
    }
}
