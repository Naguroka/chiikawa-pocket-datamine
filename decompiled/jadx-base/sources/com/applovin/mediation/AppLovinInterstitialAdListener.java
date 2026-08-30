package com.applovin.mediation;

/* JADX INFO: loaded from: classes3.dex */
class AppLovinInterstitialAdListener implements com.applovin.sdk.AppLovinAdDisplayListener, com.applovin.sdk.AppLovinAdClickListener, com.applovin.sdk.AppLovinAdVideoPlaybackListener {
    private final com.applovin.mediation.ApplovinAdapter adapter;
    private final com.google.android.gms.ads.mediation.MediationInterstitialListener mediationInterstitialListener;

    AppLovinInterstitialAdListener(com.applovin.mediation.ApplovinAdapter applovinAdapter, com.google.android.gms.ads.mediation.MediationInterstitialListener mediationInterstitialListener) {
        this.adapter = applovinAdapter;
        this.mediationInterstitialListener = mediationInterstitialListener;
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adDisplayed(com.applovin.sdk.AppLovinAd appLovinAd) {
        com.applovin.mediation.ApplovinAdapter.log(3, "Interstitial displayed.");
        this.mediationInterstitialListener.onAdOpened(this.adapter);
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adHidden(com.applovin.sdk.AppLovinAd appLovinAd) {
        com.applovin.mediation.ApplovinAdapter.log(3, "Interstitial dismissed.");
        this.adapter.unregister();
        this.mediationInterstitialListener.onAdClosed(this.adapter);
    }

    @Override // com.applovin.sdk.AppLovinAdClickListener
    public void adClicked(com.applovin.sdk.AppLovinAd appLovinAd) {
        com.applovin.mediation.ApplovinAdapter.log(3, "Interstitial clicked.");
        this.mediationInterstitialListener.onAdClicked(this.adapter);
        this.mediationInterstitialListener.onAdLeftApplication(this.adapter);
    }

    @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
    public void videoPlaybackBegan(com.applovin.sdk.AppLovinAd appLovinAd) {
        com.applovin.mediation.ApplovinAdapter.log(3, "Interstitial video playback began.");
    }

    @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
    public void videoPlaybackEnded(com.applovin.sdk.AppLovinAd appLovinAd, double d, boolean z) {
        com.applovin.mediation.ApplovinAdapter.log(3, "Interstitial video playback ended at playback percent: " + d + "%.");
    }
}
