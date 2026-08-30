package com.google.ads.mediation.ironsource;

/* JADX INFO: loaded from: classes4.dex */
public class IronSourceBannerAdListener implements com.json.mediationsdk.demandOnly.ISDemandOnlyBannerListener {
    @Override // com.json.mediationsdk.demandOnly.ISDemandOnlyBannerListener
    public void onBannerAdLoaded(java.lang.String str) {
        android.util.Log.d(com.google.ads.mediation.ironsource.IronSourceConstants.TAG, java.lang.String.format("IronSource banner ad loaded for instance ID: %s", str));
        com.google.ads.mediation.ironsource.IronSourceBannerAd fromAvailableInstances = com.google.ads.mediation.ironsource.IronSourceBannerAd.getFromAvailableInstances(str);
        if (fromAvailableInstances == null || fromAvailableInstances.getIronSourceAdView() == null) {
            return;
        }
        fromAvailableInstances.getIronSourceAdView().addView(fromAvailableInstances.getIronSourceBannerLayout());
        if (fromAvailableInstances.getAdLoadCallback() != null) {
            fromAvailableInstances.setBannerAdCallback(fromAvailableInstances.getAdLoadCallback().onSuccess(fromAvailableInstances));
        }
    }

    @Override // com.json.mediationsdk.demandOnly.ISDemandOnlyBannerListener
    public void onBannerAdLoadFailed(java.lang.String str, com.json.mediationsdk.logger.IronSourceError ironSourceError) {
        com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), com.google.ads.mediation.ironsource.IronSourceMediationAdapter.IRONSOURCE_SDK_ERROR_DOMAIN);
        android.util.Log.w(com.google.ads.mediation.ironsource.IronSourceConstants.TAG, adError.toString());
        com.google.ads.mediation.ironsource.IronSourceBannerAd fromAvailableInstances = com.google.ads.mediation.ironsource.IronSourceBannerAd.getFromAvailableInstances(str);
        if (fromAvailableInstances == null) {
            return;
        }
        com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> adLoadCallback = fromAvailableInstances.getAdLoadCallback();
        if (adLoadCallback != null) {
            adLoadCallback.onFailure(adError);
        }
        if (ironSourceError.getErrorCode() == 1050 || ironSourceError.getErrorCode() == 619) {
            return;
        }
        com.google.ads.mediation.ironsource.IronSourceBannerAd.removeFromAvailableInstances(str);
    }

    @Override // com.json.mediationsdk.demandOnly.ISDemandOnlyBannerListener
    public void onBannerAdShown(java.lang.String str) {
        com.google.android.gms.ads.mediation.MediationBannerAdCallback bannerAdCallback;
        android.util.Log.d(com.google.ads.mediation.ironsource.IronSourceConstants.TAG, java.lang.String.format("IronSource banner ad shown for instance ID: %s", str));
        com.google.ads.mediation.ironsource.IronSourceBannerAd fromAvailableInstances = com.google.ads.mediation.ironsource.IronSourceBannerAd.getFromAvailableInstances(str);
        if (fromAvailableInstances != null && (bannerAdCallback = fromAvailableInstances.getBannerAdCallback()) != null) {
            bannerAdCallback.reportAdImpression();
        }
        com.google.ads.mediation.ironsource.IronSourceBannerAd.clearAllAvailableInstancesExceptOne(str);
    }

    @Override // com.json.mediationsdk.demandOnly.ISDemandOnlyBannerListener
    public void onBannerAdClicked(java.lang.String str) {
        com.google.android.gms.ads.mediation.MediationBannerAdCallback bannerAdCallback;
        android.util.Log.d(com.google.ads.mediation.ironsource.IronSourceConstants.TAG, java.lang.String.format("IronSource banner ad clicked for instance ID: %s", str));
        com.google.ads.mediation.ironsource.IronSourceBannerAd fromAvailableInstances = com.google.ads.mediation.ironsource.IronSourceBannerAd.getFromAvailableInstances(str);
        if (fromAvailableInstances == null || (bannerAdCallback = fromAvailableInstances.getBannerAdCallback()) == null) {
            return;
        }
        bannerAdCallback.onAdOpened();
        bannerAdCallback.reportAdClicked();
    }

    @Override // com.json.mediationsdk.demandOnly.ISDemandOnlyBannerListener
    public void onBannerAdLeftApplication(java.lang.String str) {
        com.google.android.gms.ads.mediation.MediationBannerAdCallback bannerAdCallback;
        android.util.Log.d(com.google.ads.mediation.ironsource.IronSourceConstants.TAG, java.lang.String.format("IronSource banner ad has caused user to leave the application for instance ID: %s", str));
        com.google.ads.mediation.ironsource.IronSourceBannerAd fromAvailableInstances = com.google.ads.mediation.ironsource.IronSourceBannerAd.getFromAvailableInstances(str);
        if (fromAvailableInstances == null || (bannerAdCallback = fromAvailableInstances.getBannerAdCallback()) == null) {
            return;
        }
        bannerAdCallback.onAdLeftApplication();
    }
}
