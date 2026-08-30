package com.applovin.adview;

/* JADX INFO: loaded from: classes3.dex */
public class AppLovinIncentivizedInterstitial {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.ib f508a;

    public AppLovinIncentivizedInterstitial(android.content.Context context) {
        this(com.applovin.sdk.AppLovinSdk.getInstance(context));
    }

    public static com.applovin.adview.AppLovinIncentivizedInterstitial create(android.content.Context context) {
        return create(com.applovin.sdk.AppLovinSdk.getInstance(context));
    }

    protected com.applovin.impl.ib createIncentivizedAdController(java.lang.String str, com.applovin.sdk.AppLovinSdk appLovinSdk) {
        return new com.applovin.impl.ib(str, appLovinSdk);
    }

    public java.lang.String getZoneId() {
        return this.f508a.c();
    }

    public boolean isAdReadyToDisplay() {
        return this.f508a.d();
    }

    public void preload(com.applovin.sdk.AppLovinAdLoadListener appLovinAdLoadListener) {
        if (appLovinAdLoadListener == null) {
            com.applovin.impl.sdk.n.i("AppLovinIncentivizedInterstitial", "AppLovinAdLoadListener was null when preloading incentivized interstitials; using a listener is highly recommended.");
        }
        this.f508a.b(appLovinAdLoadListener);
    }

    public void setExtraInfo(java.lang.String str, java.lang.Object obj) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("No key specified");
        }
        this.f508a.a(str, obj);
    }

    public void show(android.content.Context context) {
        show(context, null, null);
    }

    public java.lang.String toString() {
        return "AppLovinIncentivizedInterstitial{zoneId='" + getZoneId() + "', isAdReadyToDisplay=" + isAdReadyToDisplay() + '}';
    }

    public AppLovinIncentivizedInterstitial(com.applovin.sdk.AppLovinSdk appLovinSdk) {
        this(null, appLovinSdk);
    }

    public static com.applovin.adview.AppLovinIncentivizedInterstitial create(com.applovin.sdk.AppLovinSdk appLovinSdk) {
        return create(null, appLovinSdk);
    }

    public void show(android.content.Context context, com.applovin.sdk.AppLovinAdRewardListener appLovinAdRewardListener) {
        show(context, appLovinAdRewardListener, null);
    }

    public AppLovinIncentivizedInterstitial(java.lang.String str, com.applovin.sdk.AppLovinSdk appLovinSdk) {
        if (appLovinSdk != null) {
            this.f508a = createIncentivizedAdController(str, appLovinSdk);
            return;
        }
        throw new java.lang.IllegalArgumentException("No sdk specified");
    }

    public static com.applovin.adview.AppLovinIncentivizedInterstitial create(java.lang.String str, com.applovin.sdk.AppLovinSdk appLovinSdk) {
        return new com.applovin.adview.AppLovinIncentivizedInterstitial(str, appLovinSdk);
    }

    public void show(android.content.Context context, com.applovin.sdk.AppLovinAdRewardListener appLovinAdRewardListener, com.applovin.sdk.AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        show(context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, null);
    }

    public void show(android.content.Context context, com.applovin.sdk.AppLovinAdRewardListener appLovinAdRewardListener, com.applovin.sdk.AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, com.applovin.sdk.AppLovinAdDisplayListener appLovinAdDisplayListener) {
        show(context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, null);
    }

    public void show(android.content.Context context, com.applovin.sdk.AppLovinAdRewardListener appLovinAdRewardListener, com.applovin.sdk.AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, com.applovin.sdk.AppLovinAdDisplayListener appLovinAdDisplayListener, com.applovin.sdk.AppLovinAdClickListener appLovinAdClickListener) {
        show(null, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    public void show(com.applovin.sdk.AppLovinAd appLovinAd, android.content.Context context, com.applovin.sdk.AppLovinAdRewardListener appLovinAdRewardListener, com.applovin.sdk.AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, com.applovin.sdk.AppLovinAdDisplayListener appLovinAdDisplayListener, com.applovin.sdk.AppLovinAdClickListener appLovinAdClickListener) {
        this.f508a.a(appLovinAd, context, null, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    public void show(com.applovin.sdk.AppLovinAd appLovinAd, android.view.ViewGroup viewGroup, androidx.lifecycle.Lifecycle lifecycle, android.content.Context context, com.applovin.sdk.AppLovinAdRewardListener appLovinAdRewardListener, com.applovin.sdk.AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, com.applovin.sdk.AppLovinAdDisplayListener appLovinAdDisplayListener, com.applovin.sdk.AppLovinAdClickListener appLovinAdClickListener) {
        this.f508a.b(appLovinAd, viewGroup, lifecycle, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }
}
