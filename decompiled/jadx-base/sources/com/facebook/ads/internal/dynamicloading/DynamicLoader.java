package com.facebook.ads.internal.dynamicloading;

/* JADX INFO: loaded from: classes4.dex */
public interface DynamicLoader {
    com.facebook.ads.internal.api.AdOptionsViewApi createAdOptionsView(android.content.Context context, com.facebook.ads.NativeAdBase nativeAdBase, com.facebook.ads.NativeAdLayout nativeAdLayout, com.facebook.ads.AdOptionsView.Orientation orientation, int i, com.facebook.ads.AdOptionsView adOptionsView);

    com.facebook.ads.internal.api.AdOptionsViewApi createAdOptionsView(android.content.Context context, com.facebook.ads.NativeAdBase nativeAdBase, com.facebook.ads.NativeAdLayout nativeAdLayout, com.facebook.ads.AdOptionsView adOptionsView);

    com.facebook.ads.internal.api.AdSettingsApi createAdSettingsApi();

    com.facebook.ads.internal.api.AdSizeApi createAdSizeApi(int i);

    com.facebook.ads.internal.api.AdViewApi createAdViewApi(android.content.Context context, java.lang.String str, com.facebook.ads.AdSize adSize, com.facebook.ads.internal.api.AdViewParentApi adViewParentApi, com.facebook.ads.AdView adView);

    com.facebook.ads.internal.api.AdViewApi createAdViewApi(android.content.Context context, java.lang.String str, java.lang.String str2, com.facebook.ads.internal.api.AdViewParentApi adViewParentApi, com.facebook.ads.AdView adView) throws java.lang.Exception;

    com.facebook.ads.internal.api.AudienceNetworkActivityApi createAudienceNetworkActivity(com.facebook.ads.AudienceNetworkActivity audienceNetworkActivity, com.facebook.ads.internal.api.AudienceNetworkActivityApi audienceNetworkActivityApi);

    com.facebook.ads.internal.api.AudienceNetworkAdsApi createAudienceNetworkAdsApi();

    com.facebook.ads.internal.api.BidderTokenProviderApi createBidderTokenProviderApi();

    com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi createDefaultMediaViewVideoRendererApi();

    com.facebook.ads.internal.api.InterstitialAdApi createInterstitialAd(android.content.Context context, java.lang.String str, com.facebook.ads.InterstitialAd interstitialAd);

    com.facebook.ads.internal.api.MediaViewApi createMediaViewApi();

    com.facebook.ads.internal.api.MediaViewVideoRendererApi createMediaViewVideoRendererApi();

    com.facebook.ads.internal.api.NativeAdApi createNativeAdApi(com.facebook.ads.NativeAd nativeAd, com.facebook.ads.internal.api.NativeAdBaseApi nativeAdBaseApi);

    com.facebook.ads.internal.api.NativeAdApi createNativeAdApi(com.facebook.ads.NativeAdBase nativeAdBase, com.facebook.ads.NativeAd nativeAd, com.facebook.ads.internal.api.NativeAdBaseApi nativeAdBaseApi);

    com.facebook.ads.internal.api.NativeAdBaseApi createNativeAdBaseApi(android.content.Context context, java.lang.String str);

    com.facebook.ads.internal.api.NativeAdBaseApi createNativeAdBaseApi(com.facebook.ads.internal.api.NativeAdBaseApi nativeAdBaseApi);

    com.facebook.ads.NativeAdBase createNativeAdBaseFromBidPayload(android.content.Context context, java.lang.String str, java.lang.String str2) throws java.lang.Exception;

    com.facebook.ads.internal.api.NativeAdImageApi createNativeAdImageApi(org.json.JSONObject jSONObject);

    com.facebook.ads.internal.api.NativeAdLayoutApi createNativeAdLayoutApi();

    com.facebook.ads.internal.api.NativeAdRatingApi createNativeAdRatingApi(org.json.JSONObject jSONObject);

    com.facebook.ads.internal.api.NativeAdScrollViewApi createNativeAdScrollViewApi(com.facebook.ads.NativeAdScrollView nativeAdScrollView, android.content.Context context, com.facebook.ads.NativeAdsManager nativeAdsManager, com.facebook.ads.NativeAdScrollView.AdViewProvider adViewProvider, int i, com.facebook.ads.NativeAdView.Type type, com.facebook.ads.NativeAdViewAttributes nativeAdViewAttributes, int i2);

    com.facebook.ads.internal.api.NativeAdViewApi createNativeAdViewApi();

    com.facebook.ads.internal.api.NativeAdViewAttributesApi createNativeAdViewAttributesApi();

    com.facebook.ads.internal.api.NativeAdViewTypeApi createNativeAdViewTypeApi(int i);

    com.facebook.ads.internal.api.NativeAdsManagerApi createNativeAdsManagerApi(android.content.Context context, java.lang.String str, int i);

    com.facebook.ads.internal.api.NativeBannerAdApi createNativeBannerAdApi(com.facebook.ads.NativeBannerAd nativeBannerAd, com.facebook.ads.internal.api.NativeAdBaseApi nativeAdBaseApi);

    com.facebook.ads.internal.api.NativeBannerAdViewApi createNativeBannerAdViewApi();

    com.facebook.ads.internal.api.NativeComponentTagApi createNativeComponentTagApi();

    com.facebook.ads.internal.api.RewardedInterstitialAdApi createRewardedInterstitialAd(android.content.Context context, java.lang.String str, com.facebook.ads.RewardedInterstitialAd rewardedInterstitialAd);

    com.facebook.ads.internal.api.RewardedVideoAdApi createRewardedVideoAd(android.content.Context context, java.lang.String str, com.facebook.ads.RewardedVideoAd rewardedVideoAd);

    com.facebook.ads.internal.api.InitApi getInitApi();

    void maybeInitInternally(android.content.Context context);
}
