package com.google.android.gms.ads.mediation;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class Adapter implements com.google.android.gms.ads.mediation.MediationExtrasReceiver {
    public abstract com.google.android.gms.ads.VersionInfo getSDKVersionInfo();

    public abstract com.google.android.gms.ads.VersionInfo getVersionInfo();

    public abstract void initialize(android.content.Context context, com.google.android.gms.ads.mediation.InitializationCompleteCallback initializationCompleteCallback, java.util.List<com.google.android.gms.ads.mediation.MediationConfiguration> list);

    public void loadAppOpenAd(com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationAppOpenAd, com.google.android.gms.ads.mediation.MediationAppOpenAdCallback> mediationAdLoadCallback) {
        mediationAdLoadCallback.onFailure(new com.google.android.gms.ads.AdError(7, java.lang.String.valueOf(getClass().getSimpleName()).concat(" does not support app open ads."), com.google.android.gms.ads.MobileAds.ERROR_DOMAIN));
    }

    public void loadBannerAd(com.google.android.gms.ads.mediation.MediationBannerAdConfiguration mediationBannerAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> mediationAdLoadCallback) {
        mediationAdLoadCallback.onFailure(new com.google.android.gms.ads.AdError(7, java.lang.String.valueOf(getClass().getSimpleName()).concat(" does not support banner ads."), com.google.android.gms.ads.MobileAds.ERROR_DOMAIN));
    }

    @java.lang.Deprecated
    public void loadInterscrollerAd(com.google.android.gms.ads.mediation.MediationBannerAdConfiguration mediationBannerAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationInterscrollerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> mediationAdLoadCallback) {
        mediationAdLoadCallback.onFailure(new com.google.android.gms.ads.AdError(7, java.lang.String.valueOf(getClass().getSimpleName()).concat(" does not support interscroller ads."), com.google.android.gms.ads.MobileAds.ERROR_DOMAIN));
    }

    public void loadInterstitialAd(com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationInterstitialAd, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback> mediationAdLoadCallback) {
        mediationAdLoadCallback.onFailure(new com.google.android.gms.ads.AdError(7, java.lang.String.valueOf(getClass().getSimpleName()).concat(" does not support interstitial ads."), com.google.android.gms.ads.MobileAds.ERROR_DOMAIN));
    }

    @java.lang.Deprecated
    public void loadNativeAd(com.google.android.gms.ads.mediation.MediationNativeAdConfiguration mediationNativeAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.UnifiedNativeAdMapper, com.google.android.gms.ads.mediation.MediationNativeAdCallback> mediationAdLoadCallback) {
        mediationAdLoadCallback.onFailure(new com.google.android.gms.ads.AdError(7, java.lang.String.valueOf(getClass().getSimpleName()).concat(" does not support native ads."), com.google.android.gms.ads.MobileAds.ERROR_DOMAIN));
    }

    public void loadNativeAdMapper(com.google.android.gms.ads.mediation.MediationNativeAdConfiguration mediationNativeAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.NativeAdMapper, com.google.android.gms.ads.mediation.MediationNativeAdCallback> mediationAdLoadCallback) throws android.os.RemoteException {
        throw new android.os.RemoteException("Method is not found");
    }

    public void loadRewardedAd(com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration mediationRewardedAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback) {
        mediationAdLoadCallback.onFailure(new com.google.android.gms.ads.AdError(7, java.lang.String.valueOf(getClass().getSimpleName()).concat(" does not support rewarded ads."), com.google.android.gms.ads.MobileAds.ERROR_DOMAIN));
    }

    public void loadRewardedInterstitialAd(com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration mediationRewardedAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback) {
        mediationAdLoadCallback.onFailure(new com.google.android.gms.ads.AdError(7, java.lang.String.valueOf(getClass().getSimpleName()).concat(" does not support rewarded interstitial ads."), com.google.android.gms.ads.MobileAds.ERROR_DOMAIN));
    }
}
