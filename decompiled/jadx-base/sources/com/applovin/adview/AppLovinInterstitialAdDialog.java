package com.applovin.adview;

/* JADX INFO: loaded from: classes3.dex */
public interface AppLovinInterstitialAdDialog {
    void setAdClickListener(com.applovin.sdk.AppLovinAdClickListener appLovinAdClickListener);

    void setAdDisplayListener(com.applovin.sdk.AppLovinAdDisplayListener appLovinAdDisplayListener);

    void setAdLoadListener(com.applovin.sdk.AppLovinAdLoadListener appLovinAdLoadListener);

    void setAdVideoPlaybackListener(com.applovin.sdk.AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener);

    void setExtraInfo(java.lang.String str, java.lang.Object obj);

    void show();

    void showAndRender(com.applovin.sdk.AppLovinAd appLovinAd);

    void showAndRender(com.applovin.sdk.AppLovinAd appLovinAd, android.view.ViewGroup viewGroup, androidx.lifecycle.Lifecycle lifecycle);
}
