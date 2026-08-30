package com.applovin.mediation.rtb;

/* JADX INFO: loaded from: classes3.dex */
public final class AppLovinRtbInterstitialRenderer extends com.google.ads.mediation.applovin.AppLovinInterstitialRenderer implements com.google.android.gms.ads.mediation.MediationInterstitialAd {
    private com.applovin.adview.AppLovinInterstitialAdDialog interstitialAd;
    private final com.applovin.sdk.AppLovinSdk sdk;

    public AppLovinRtbInterstitialRenderer(com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationInterstitialAd, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback> mediationAdLoadCallback, com.google.ads.mediation.applovin.AppLovinInitializer appLovinInitializer, com.google.ads.mediation.applovin.AppLovinAdFactory appLovinAdFactory) {
        super(mediationInterstitialAdConfiguration, mediationAdLoadCallback, appLovinInitializer, appLovinAdFactory);
        this.sdk = appLovinInitializer.retrieveSdk(mediationInterstitialAdConfiguration.getServerParameters(), mediationInterstitialAdConfiguration.getContext());
    }

    @Override // com.google.ads.mediation.applovin.AppLovinInterstitialRenderer
    public void loadAd() {
        com.applovin.adview.AppLovinInterstitialAdDialog appLovinInterstitialAdDialogCreateInterstitialAdDialog = this.appLovinAdFactory.createInterstitialAdDialog(this.sdk, this.interstitialAdConfiguration.getContext());
        this.interstitialAd = appLovinInterstitialAdDialogCreateInterstitialAdDialog;
        appLovinInterstitialAdDialogCreateInterstitialAdDialog.setAdDisplayListener(this);
        this.interstitialAd.setAdClickListener(this);
        this.interstitialAd.setAdVideoPlaybackListener(this);
        this.interstitialAd.setExtraInfo(com.applovin.mediation.AppLovinExtras.Keys.KEY_WATERMARK, this.interstitialAdConfiguration.getWatermark());
        this.sdk.getAdService().loadNextAdForAdToken(this.interstitialAdConfiguration.getBidResponse(), this);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(android.content.Context context) {
        this.sdk.getSettings().setMuted(com.applovin.mediation.AppLovinUtils.shouldMuteAudio(this.interstitialAdConfiguration.getMediationExtras()));
        this.interstitialAd.showAndRender(this.appLovinInterstitialAd);
    }
}
