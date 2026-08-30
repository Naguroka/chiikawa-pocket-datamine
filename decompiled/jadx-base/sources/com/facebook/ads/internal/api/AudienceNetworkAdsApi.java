package com.facebook.ads.internal.api;

/* JADX INFO: loaded from: classes4.dex */
public interface AudienceNetworkAdsApi {
    public static final int BANNER = 1;
    public static final int INTERSTITIAL = 2;
    public static final int NATIVE = 4;
    public static final int NATIVE_BANNER = 5;
    public static final int REWARDED_VIDEO = 6;
    public static final int UNKNOWN = 0;

    int getAdFormatForPlacement(java.lang.String str);

    void initialize(android.content.Context context, com.facebook.ads.internal.settings.MultithreadedBundleWrapper multithreadedBundleWrapper, com.facebook.ads.AudienceNetworkAds.InitListener initListener);

    boolean isInitialized();

    void onContentProviderCreated(android.content.Context context);
}
