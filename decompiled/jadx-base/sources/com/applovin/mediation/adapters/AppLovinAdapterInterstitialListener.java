package com.applovin.mediation.adapters;

/* JADX INFO: loaded from: classes3.dex */
public class AppLovinAdapterInterstitialListener implements com.applovin.impl.qb, com.applovin.sdk.AppLovinAdClickListener, com.applovin.impl.pb {
    private final com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener listener;
    private final com.applovin.mediation.adapters.AppLovinMediationAdapter parentAdapter;

    public AppLovinAdapterInterstitialListener(com.applovin.mediation.adapters.AppLovinMediationAdapter appLovinMediationAdapter, com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        this.parentAdapter = appLovinMediationAdapter;
        this.listener = maxInterstitialAdapterListener;
    }

    @Override // com.applovin.sdk.AppLovinAdClickListener
    public void adClicked(com.applovin.sdk.AppLovinAd appLovinAd) {
        this.parentAdapter.log("Interstitial ad clicked");
        this.listener.onInterstitialAdClicked(com.applovin.mediation.adapters.AppLovinMediationAdapter.getExtraInfo(appLovinAd));
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adDisplayed(com.applovin.sdk.AppLovinAd appLovinAd) {
        this.parentAdapter.log("Interstitial ad shown");
        android.os.Bundle bundle = new android.os.Bundle(1);
        if (appLovinAd instanceof com.applovin.impl.sdk.ad.b) {
            bundle.putBundle("applovin_ad_view_info", ((com.applovin.impl.sdk.ad.b) appLovinAd).e());
        }
        this.listener.onInterstitialAdDisplayed(bundle);
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adHidden(com.applovin.sdk.AppLovinAd appLovinAd) {
        this.parentAdapter.log("Interstitial ad hidden");
        this.listener.onInterstitialAdHidden(com.applovin.mediation.adapters.AppLovinMediationAdapter.getExtraInfo(appLovinAd));
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(com.applovin.sdk.AppLovinAd appLovinAd) {
        this.parentAdapter.log("Interstitial ad loaded");
        this.parentAdapter.loadedInterstitialAd = appLovinAd;
        this.listener.onInterstitialAdLoaded();
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i) {
        failedToReceiveAdV2(new com.applovin.impl.sdk.AppLovinError(i, ""));
    }

    @Override // com.applovin.impl.qb
    public void failedToReceiveAdV2(com.applovin.impl.sdk.AppLovinError appLovinError) {
        this.parentAdapter.log("Interstitial ad failed to load with error: " + appLovinError);
        this.listener.onInterstitialAdLoadFailed(com.applovin.mediation.adapters.AppLovinMediationAdapter.toMaxError(appLovinError));
    }

    @Override // com.applovin.impl.pb
    public void onAdDisplayFailed(java.lang.String str) {
        this.parentAdapter.log("Interstitial ad failed to display with error: " + str);
        this.listener.onInterstitialAdDisplayFailed(new com.applovin.mediation.adapter.MaxAdapterError(com.applovin.mediation.adapter.MaxAdapterError.ERROR_CODE_UNSPECIFIED, str));
    }
}
