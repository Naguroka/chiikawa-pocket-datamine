package com.facebook.ads;

/* JADX INFO: loaded from: classes4.dex */
public class NativeAdScrollView extends android.widget.LinearLayout {
    public static final int DEFAULT_INSET = 20;
    public static final int DEFAULT_MAX_ADS = 10;
    private final com.facebook.ads.internal.api.NativeAdScrollViewApi mNativeAdScrollViewApi;

    public interface AdViewProvider {
        android.view.View createView(com.facebook.ads.NativeAd nativeAd, int i);

        void destroyView(com.facebook.ads.NativeAd nativeAd, android.view.View view);
    }

    private NativeAdScrollView(android.content.Context context, com.facebook.ads.NativeAdsManager nativeAdsManager, com.facebook.ads.NativeAdScrollView.AdViewProvider adViewProvider, int i, com.facebook.ads.NativeAdView.Type type, com.facebook.ads.NativeAdViewAttributes nativeAdViewAttributes, int i2) {
        super(context);
        this.mNativeAdScrollViewApi = com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.makeLoader(context).createNativeAdScrollViewApi(this, context, nativeAdsManager, adViewProvider, i, type, nativeAdViewAttributes, i2);
    }

    public NativeAdScrollView(android.content.Context context, com.facebook.ads.NativeAdsManager nativeAdsManager, com.facebook.ads.NativeAdScrollView.AdViewProvider adViewProvider) {
        this(context, nativeAdsManager, adViewProvider, 0, null, null, 10);
    }

    public NativeAdScrollView(android.content.Context context, com.facebook.ads.NativeAdsManager nativeAdsManager, com.facebook.ads.NativeAdScrollView.AdViewProvider adViewProvider, int i) {
        this(context, nativeAdsManager, adViewProvider, 0, null, null, i);
    }

    public NativeAdScrollView(android.content.Context context, com.facebook.ads.NativeAdsManager nativeAdsManager, int i) {
        this(context, nativeAdsManager, null, i, null, null, 10);
    }

    public NativeAdScrollView(android.content.Context context, com.facebook.ads.NativeAdsManager nativeAdsManager, int i, com.facebook.ads.NativeAdViewAttributes nativeAdViewAttributes) {
        this(context, nativeAdsManager, null, i, null, nativeAdViewAttributes, 10);
    }

    public NativeAdScrollView(android.content.Context context, com.facebook.ads.NativeAdsManager nativeAdsManager, int i, com.facebook.ads.NativeAdViewAttributes nativeAdViewAttributes, int i2) {
        this(context, nativeAdsManager, null, i, null, nativeAdViewAttributes, i2);
    }

    @java.lang.Deprecated
    public NativeAdScrollView(android.content.Context context, com.facebook.ads.NativeAdsManager nativeAdsManager, com.facebook.ads.NativeAdView.Type type) {
        this(context, nativeAdsManager, null, 0, type, null, 10);
    }

    @java.lang.Deprecated
    public NativeAdScrollView(android.content.Context context, com.facebook.ads.NativeAdsManager nativeAdsManager, com.facebook.ads.NativeAdView.Type type, com.facebook.ads.NativeAdViewAttributes nativeAdViewAttributes) {
        this(context, nativeAdsManager, null, 0, type, nativeAdViewAttributes, 10);
    }

    @java.lang.Deprecated
    public NativeAdScrollView(android.content.Context context, com.facebook.ads.NativeAdsManager nativeAdsManager, com.facebook.ads.NativeAdView.Type type, com.facebook.ads.NativeAdViewAttributes nativeAdViewAttributes, int i) {
        this(context, nativeAdsManager, null, 0, type, nativeAdViewAttributes, i);
    }

    public void setInset(int i) {
        this.mNativeAdScrollViewApi.setInset(i);
    }
}
