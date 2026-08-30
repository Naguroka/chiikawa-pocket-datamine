package com.applovin.mediation.rtb;

/* JADX INFO: loaded from: classes3.dex */
public final class AppLovinRtbRewardedRenderer extends com.google.ads.mediation.applovin.AppLovinRewardedRenderer {
    private com.applovin.sdk.AppLovinAd appLovinAd;

    public AppLovinRtbRewardedRenderer(com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration mediationRewardedAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback, com.google.ads.mediation.applovin.AppLovinInitializer appLovinInitializer, com.google.ads.mediation.applovin.AppLovinAdFactory appLovinAdFactory, com.google.ads.mediation.applovin.AppLovinSdkUtilsWrapper appLovinSdkUtilsWrapper) {
        super(mediationRewardedAdConfiguration, mediationAdLoadCallback, appLovinInitializer, appLovinAdFactory, appLovinSdkUtilsWrapper);
    }

    @Override // com.google.ads.mediation.applovin.AppLovinRewardedRenderer
    public void loadAd() {
        this.appLovinSdk = this.appLovinInitializer.retrieveSdk(this.adConfiguration.getServerParameters(), this.adConfiguration.getContext());
        this.incentivizedInterstitial = this.appLovinAdFactory.createIncentivizedInterstitial(this.appLovinSdk);
        this.incentivizedInterstitial.setExtraInfo(com.applovin.mediation.AppLovinExtras.Keys.KEY_WATERMARK, this.adConfiguration.getWatermark());
        this.appLovinSdk.getAdService().loadNextAdForAdToken(this.adConfiguration.getBidResponse(), this);
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(android.content.Context context) {
        this.appLovinSdk.getSettings().setMuted(com.applovin.mediation.AppLovinUtils.shouldMuteAudio(this.adConfiguration.getMediationExtras()));
        this.incentivizedInterstitial.show(this.appLovinAd, context, this, this, this, this);
    }

    @Override // com.google.ads.mediation.applovin.AppLovinRewardedRenderer, com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(com.applovin.sdk.AppLovinAd appLovinAd) {
        this.appLovinAd = appLovinAd;
        super.adReceived(appLovinAd);
    }
}
