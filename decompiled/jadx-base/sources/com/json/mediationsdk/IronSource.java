package com.json.mediationsdk;

/* JADX INFO: loaded from: classes5.dex */
public abstract class IronSource {

    public enum AD_UNIT {
        REWARDED_VIDEO(com.json.ce.v0),
        INTERSTITIAL("interstitial"),
        BANNER("banner"),
        NATIVE_AD("nativeAd");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.String f2926a;

        AD_UNIT(java.lang.String str) {
            this.f2926a = str;
        }

        @Override // java.lang.Enum
        public java.lang.String toString() {
            return this.f2926a;
        }
    }

    public static void addImpressionDataListener(com.json.mediationsdk.impressionData.ImpressionDataListener impressionDataListener) {
        com.json.mediationsdk.p.m().b(impressionDataListener);
    }

    public static void clearRewardedVideoServerParameters() {
        com.json.mediationsdk.p.m().b();
    }

    @java.lang.Deprecated
    public static com.json.mediationsdk.IronSourceBannerLayout createBanner(android.app.Activity activity, com.json.mediationsdk.ISBannerSize iSBannerSize) {
        return com.json.mediationsdk.p.m().b(activity, iSBannerSize);
    }

    public static com.json.mediationsdk.demandOnly.ISDemandOnlyBannerLayout createBannerForDemandOnly(android.app.Activity activity, com.json.mediationsdk.ISBannerSize iSBannerSize) {
        return com.json.mediationsdk.p.m().a(activity, iSBannerSize);
    }

    @java.lang.Deprecated
    public static void destroyBanner(com.json.mediationsdk.IronSourceBannerLayout ironSourceBannerLayout) {
        com.json.mediationsdk.p.m().a(ironSourceBannerLayout);
    }

    public static void destroyISDemandOnlyBanner(java.lang.String str) {
        com.json.mediationsdk.p.m().c(str);
    }

    public static java.lang.String getAdvertiserId(android.content.Context context) {
        return com.json.mediationsdk.p.m().b(context);
    }

    public static synchronized java.lang.String getISDemandOnlyBiddingData(android.content.Context context) {
        return com.json.mediationsdk.p.m().a(context);
    }

    public static com.json.mediationsdk.model.InterstitialPlacement getInterstitialPlacementInfo(java.lang.String str) {
        return com.json.mediationsdk.p.m().g(str);
    }

    public static com.json.mediationsdk.model.Placement getRewardedVideoPlacementInfo(java.lang.String str) {
        return com.json.mediationsdk.p.m().i(str);
    }

    public static void init(android.content.Context context, java.lang.String str) {
        init(context, str, (com.ironsource.mediationsdk.IronSource.AD_UNIT[]) null);
    }

    public static void init(android.content.Context context, java.lang.String str, com.json.mediationsdk.sdk.InitializationListener initializationListener) {
        init(context, str, initializationListener, null);
    }

    public static void init(android.content.Context context, java.lang.String str, com.json.mediationsdk.sdk.InitializationListener initializationListener, com.ironsource.mediationsdk.IronSource.AD_UNIT... ad_unitArr) {
        com.json.mediationsdk.p.m().a(context, str, false, initializationListener, ad_unitArr);
    }

    public static void init(android.content.Context context, java.lang.String str, com.ironsource.mediationsdk.IronSource.AD_UNIT... ad_unitArr) {
        com.json.mediationsdk.p.m().a(context, str, false, (com.json.mediationsdk.sdk.InitializationListener) null, ad_unitArr);
    }

    @java.lang.Deprecated
    public static void initISDemandOnly(android.content.Context context, java.lang.String str, com.ironsource.mediationsdk.IronSource.AD_UNIT... ad_unitArr) {
        com.json.mediationsdk.p.m().a(context, str, ad_unitArr);
    }

    @java.lang.Deprecated
    public static boolean isBannerPlacementCapped(java.lang.String str) {
        return com.json.mediationsdk.p.m().q(str);
    }

    public static boolean isISDemandOnlyInterstitialReady(java.lang.String str) {
        return com.json.mediationsdk.p.m().f(str);
    }

    public static boolean isISDemandOnlyRewardedVideoAvailable(java.lang.String str) {
        return com.json.mediationsdk.p.m().j(str);
    }

    @java.lang.Deprecated
    public static boolean isInterstitialPlacementCapped(java.lang.String str) {
        return com.json.mediationsdk.p.m().r(str);
    }

    @java.lang.Deprecated
    public static boolean isInterstitialReady() {
        return com.json.mediationsdk.p.m().F();
    }

    public static boolean isRewardedVideoAvailable() {
        return com.json.mediationsdk.p.m().K();
    }

    public static boolean isRewardedVideoPlacementCapped(java.lang.String str) {
        return com.json.mediationsdk.p.m().s(str);
    }

    public static void launchTestSuite(android.content.Context context) {
        com.json.mediationsdk.p.m().c(context);
    }

    @java.lang.Deprecated
    public static void loadBanner(com.json.mediationsdk.IronSourceBannerLayout ironSourceBannerLayout) {
        com.json.mediationsdk.p.m().b(ironSourceBannerLayout);
    }

    @java.lang.Deprecated
    public static void loadBanner(com.json.mediationsdk.IronSourceBannerLayout ironSourceBannerLayout, java.lang.String str) {
        com.json.mediationsdk.p.m().a(ironSourceBannerLayout, str);
    }

    public static void loadISDemandOnlyBanner(android.app.Activity activity, com.json.mediationsdk.demandOnly.ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, java.lang.String str) {
        com.json.mediationsdk.p.m().a(activity, iSDemandOnlyBannerLayout, str);
    }

    public static void loadISDemandOnlyBannerWithAdm(android.app.Activity activity, com.json.mediationsdk.demandOnly.ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, java.lang.String str, java.lang.String str2) {
        com.json.mediationsdk.p.m().a(activity, iSDemandOnlyBannerLayout, str, str2);
    }

    public static void loadISDemandOnlyInterstitial(android.app.Activity activity, java.lang.String str) {
        com.json.mediationsdk.p.m().a(activity, str);
    }

    @java.lang.Deprecated
    public static void loadISDemandOnlyInterstitialWithAdm(android.app.Activity activity, java.lang.String str, java.lang.String str2) {
        com.json.mediationsdk.p.m().b(activity, str, str2);
    }

    public static void loadISDemandOnlyRewardedVideo(android.app.Activity activity, java.lang.String str) {
        com.json.mediationsdk.p.m().b(activity, str);
    }

    @java.lang.Deprecated
    public static void loadISDemandOnlyRewardedVideoWithAdm(android.app.Activity activity, java.lang.String str, java.lang.String str2) {
        com.json.mediationsdk.p.m().a(activity, str, str2);
    }

    @java.lang.Deprecated
    public static void loadInterstitial() {
        com.json.mediationsdk.p.m().P();
    }

    public static void loadRewardedVideo() {
        com.json.mediationsdk.p.m().Q();
    }

    public static void onPause(android.app.Activity activity) {
        com.json.mediationsdk.p.m().a(activity);
    }

    public static void onResume(android.app.Activity activity) {
        com.json.mediationsdk.p.m().b(activity);
    }

    public static void removeImpressionDataListener(com.json.mediationsdk.impressionData.ImpressionDataListener impressionDataListener) {
        com.json.mediationsdk.p.m().a(impressionDataListener);
    }

    public static void removeInterstitialListener() {
        com.json.mediationsdk.p.m().d();
    }

    public static void removeRewardedVideoListener() {
        com.json.mediationsdk.p.m().c();
    }

    public static void setAdRevenueData(java.lang.String str, org.json.JSONObject jSONObject) {
        com.json.mediationsdk.p.m().a(str, jSONObject);
    }

    public static void setAdaptersDebug(boolean z) {
        com.json.mediationsdk.p.m().a(z);
    }

    public static void setConsent(boolean z) {
        com.json.mediationsdk.p.m().b(z);
    }

    public static boolean setDynamicUserId(java.lang.String str) {
        return com.json.mediationsdk.p.m().e(str);
    }

    public static void setISDemandOnlyInterstitialListener(com.json.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        com.json.mediationsdk.p.m().a(iSDemandOnlyInterstitialListener);
    }

    public static void setISDemandOnlyRewardedVideoListener(com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        com.json.mediationsdk.p.m().a(iSDemandOnlyRewardedVideoListener);
    }

    @java.lang.Deprecated
    public static void setLevelPlayInterstitialListener(com.json.mediationsdk.sdk.LevelPlayInterstitialListener levelPlayInterstitialListener) {
        com.json.mediationsdk.p.m().a(levelPlayInterstitialListener);
    }

    public static void setLevelPlayRewardedVideoListener(com.json.mediationsdk.sdk.LevelPlayRewardedVideoListener levelPlayRewardedVideoListener) {
        com.json.mediationsdk.p.m().a(levelPlayRewardedVideoListener);
    }

    public static void setLevelPlayRewardedVideoManualListener(com.json.mediationsdk.sdk.LevelPlayRewardedVideoManualListener levelPlayRewardedVideoManualListener) {
        com.json.mediationsdk.p.m().a(levelPlayRewardedVideoManualListener);
    }

    public static void setLogListener(com.json.mediationsdk.logger.LogListener logListener) {
        com.json.mediationsdk.p.m().a(logListener);
    }

    public static void setMediationType(java.lang.String str) {
        com.json.mediationsdk.p.m().h(str);
    }

    public static void setMetaData(java.lang.String str, java.lang.String str2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(str2);
        com.json.mediationsdk.p.m().a(str, arrayList);
    }

    public static void setMetaData(java.lang.String str, java.util.List<java.lang.String> list) {
        com.json.mediationsdk.p.m().a(str, list);
    }

    public static void setNetworkData(java.lang.String str, org.json.JSONObject jSONObject) {
        com.json.mediationsdk.p.m().b(str, jSONObject);
    }

    public static void setRewardedVideoServerParameters(java.util.Map<java.lang.String, java.lang.String> map) {
        com.json.mediationsdk.p.m().a(map);
    }

    public static void setSegment(com.json.mediationsdk.IronSourceSegment ironSourceSegment) {
        com.json.mediationsdk.p.m().a(ironSourceSegment);
    }

    public static void setSegmentListener(com.json.mediationsdk.sdk.SegmentListener segmentListener) {
        com.json.mediationsdk.p.m().a(segmentListener);
    }

    public static void setUserId(java.lang.String str) {
        com.json.mediationsdk.p.m().t(str);
    }

    public static void setWaterfallConfiguration(com.json.mediationsdk.WaterfallConfiguration waterfallConfiguration, com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit) {
        com.json.mediationsdk.p.m().a(ad_unit, waterfallConfiguration);
    }

    public static void shouldTrackNetworkState(android.content.Context context, boolean z) {
        com.json.mediationsdk.p.m().a(context, z);
    }

    public static void showISDemandOnlyInterstitial(java.lang.String str) {
        com.json.mediationsdk.p.m().b(str);
    }

    public static void showISDemandOnlyRewardedVideo(java.lang.String str) {
        com.json.mediationsdk.p.m().a(str);
    }

    @java.lang.Deprecated
    public static void showInterstitial() {
        com.json.mediationsdk.p.m().c((android.app.Activity) null);
    }

    @java.lang.Deprecated
    public static void showInterstitial(android.app.Activity activity) {
        com.json.mediationsdk.p.m().c(activity);
    }

    @java.lang.Deprecated
    public static void showInterstitial(android.app.Activity activity, java.lang.String str) {
        com.json.mediationsdk.p.m().c(activity, str);
    }

    @java.lang.Deprecated
    public static void showInterstitial(java.lang.String str) {
        com.json.mediationsdk.p.m().c(null, str);
    }

    public static void showRewardedVideo() {
        com.json.mediationsdk.p.m().d((android.app.Activity) null);
    }

    public static void showRewardedVideo(android.app.Activity activity) {
        com.json.mediationsdk.p.m().d(activity);
    }

    public static void showRewardedVideo(android.app.Activity activity, java.lang.String str) {
        com.json.mediationsdk.p.m().f(activity, str);
    }

    public static void showRewardedVideo(java.lang.String str) {
        com.json.mediationsdk.p.m().f(null, str);
    }
}
