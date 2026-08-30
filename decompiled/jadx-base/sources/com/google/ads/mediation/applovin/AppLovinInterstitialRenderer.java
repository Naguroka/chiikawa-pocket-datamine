package com.google.ads.mediation.applovin;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AppLovinInterstitialRenderer implements com.google.android.gms.ads.mediation.MediationInterstitialAd, com.applovin.sdk.AppLovinAdDisplayListener, com.applovin.sdk.AppLovinAdClickListener, com.applovin.sdk.AppLovinAdVideoPlaybackListener, com.applovin.sdk.AppLovinAdLoadListener {
    public static final java.lang.String ERROR_MSG_MULTIPLE_INTERSTITIAL_AD = " Cannot load multiple interstitial ads with the same Zone ID. Display one ad before attempting to load another. ";
    protected static final java.lang.String TAG = "AppLovinInterstitialRenderer";
    protected final com.google.ads.mediation.applovin.AppLovinAdFactory appLovinAdFactory;
    protected final com.google.ads.mediation.applovin.AppLovinInitializer appLovinInitializer;
    protected com.applovin.sdk.AppLovinAd appLovinInterstitialAd;
    private com.google.android.gms.ads.mediation.MediationInterstitialAdCallback interstitialAdCallback;
    protected final com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration interstitialAdConfiguration;
    protected final com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationInterstitialAd, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback> interstitialAdLoadCallback;
    protected java.lang.String zoneId;

    public abstract void loadAd();

    public AppLovinInterstitialRenderer(com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationInterstitialAd, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback> mediationAdLoadCallback, com.google.ads.mediation.applovin.AppLovinInitializer appLovinInitializer, com.google.ads.mediation.applovin.AppLovinAdFactory appLovinAdFactory) {
        this.interstitialAdConfiguration = mediationInterstitialAdConfiguration;
        this.interstitialAdLoadCallback = mediationAdLoadCallback;
        this.appLovinInitializer = appLovinInitializer;
        this.appLovinAdFactory = appLovinAdFactory;
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(com.applovin.sdk.AppLovinAd appLovinAd) {
        android.util.Log.d(TAG, "Interstitial did load ad for zone: " + this.zoneId);
        this.appLovinInterstitialAd = appLovinAd;
        this.interstitialAdCallback = this.interstitialAdLoadCallback.onSuccess(this);
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i) {
        com.google.android.gms.ads.AdError adError = com.applovin.mediation.AppLovinUtils.getAdError(i);
        android.util.Log.w(TAG, adError.getMessage());
        this.interstitialAdLoadCallback.onFailure(adError);
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adDisplayed(com.applovin.sdk.AppLovinAd appLovinAd) {
        android.util.Log.d(TAG, "Interstitial displayed.");
        this.interstitialAdCallback.onAdOpened();
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adHidden(com.applovin.sdk.AppLovinAd appLovinAd) {
        android.util.Log.d(TAG, "Interstitial dismissed.");
        this.interstitialAdCallback.onAdClosed();
    }

    @Override // com.applovin.sdk.AppLovinAdClickListener
    public void adClicked(com.applovin.sdk.AppLovinAd appLovinAd) {
        android.util.Log.d(TAG, "Interstitial clicked.");
        this.interstitialAdCallback.reportAdClicked();
        this.interstitialAdCallback.onAdLeftApplication();
    }

    @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
    public void videoPlaybackBegan(com.applovin.sdk.AppLovinAd appLovinAd) {
        android.util.Log.d(TAG, "Interstitial video playback began.");
    }

    @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
    public void videoPlaybackEnded(com.applovin.sdk.AppLovinAd appLovinAd, double d, boolean z) {
        android.util.Log.d(TAG, "Interstitial video playback ended at playback percent: " + d + "%.");
    }
}
