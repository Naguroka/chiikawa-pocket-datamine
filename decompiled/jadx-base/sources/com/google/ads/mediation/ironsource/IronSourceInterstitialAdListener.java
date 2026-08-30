package com.google.ads.mediation.ironsource;

/* JADX INFO: loaded from: classes4.dex */
public class IronSourceInterstitialAdListener implements com.json.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener {
    @Override // com.json.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdReady(java.lang.String str) {
        android.util.Log.d(com.google.ads.mediation.ironsource.IronSourceConstants.TAG, java.lang.String.format("IronSource interstitial ad is ready for instance ID: %s", str));
        com.google.ads.mediation.ironsource.IronSourceInterstitialAd fromAvailableInstances = com.google.ads.mediation.ironsource.IronSourceInterstitialAd.getFromAvailableInstances(str);
        if (fromAvailableInstances == null || fromAvailableInstances.getMediationAdLoadCallback() == null) {
            return;
        }
        fromAvailableInstances.setInterstitialAdCallback(fromAvailableInstances.getMediationAdLoadCallback().onSuccess(fromAvailableInstances));
    }

    @Override // com.json.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdLoadFailed(java.lang.String str, com.json.mediationsdk.logger.IronSourceError ironSourceError) {
        com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), com.google.ads.mediation.ironsource.IronSourceMediationAdapter.IRONSOURCE_SDK_ERROR_DOMAIN);
        android.util.Log.w(com.google.ads.mediation.ironsource.IronSourceConstants.TAG, adError.toString());
        com.google.ads.mediation.ironsource.IronSourceInterstitialAd fromAvailableInstances = com.google.ads.mediation.ironsource.IronSourceInterstitialAd.getFromAvailableInstances(str);
        if (fromAvailableInstances != null && fromAvailableInstances.getMediationAdLoadCallback() != null) {
            fromAvailableInstances.getMediationAdLoadCallback().onFailure(adError);
        }
        com.google.ads.mediation.ironsource.IronSourceInterstitialAd.removeFromAvailableInstances(str);
    }

    @Override // com.json.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdOpened(java.lang.String str) {
        com.google.android.gms.ads.mediation.MediationInterstitialAdCallback interstitialAdCallback;
        android.util.Log.d(com.google.ads.mediation.ironsource.IronSourceConstants.TAG, java.lang.String.format("IronSource interstitial ad opened for instance ID: %s", str));
        com.google.ads.mediation.ironsource.IronSourceInterstitialAd fromAvailableInstances = com.google.ads.mediation.ironsource.IronSourceInterstitialAd.getFromAvailableInstances(str);
        if (fromAvailableInstances == null || (interstitialAdCallback = fromAvailableInstances.getInterstitialAdCallback()) == null) {
            return;
        }
        interstitialAdCallback.onAdOpened();
        interstitialAdCallback.reportAdImpression();
    }

    @Override // com.json.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdClosed(java.lang.String str) {
        com.google.android.gms.ads.mediation.MediationInterstitialAdCallback interstitialAdCallback;
        android.util.Log.d(com.google.ads.mediation.ironsource.IronSourceConstants.TAG, java.lang.String.format("IronSource interstitial ad closed for instance ID: %s", str));
        com.google.ads.mediation.ironsource.IronSourceInterstitialAd fromAvailableInstances = com.google.ads.mediation.ironsource.IronSourceInterstitialAd.getFromAvailableInstances(str);
        if (fromAvailableInstances != null && (interstitialAdCallback = fromAvailableInstances.getInterstitialAdCallback()) != null) {
            interstitialAdCallback.onAdClosed();
        }
        com.google.ads.mediation.ironsource.IronSourceInterstitialAd.removeFromAvailableInstances(str);
    }

    @Override // com.json.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdShowFailed(java.lang.String str, com.json.mediationsdk.logger.IronSourceError ironSourceError) {
        com.google.android.gms.ads.mediation.MediationInterstitialAdCallback interstitialAdCallback;
        com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), com.google.ads.mediation.ironsource.IronSourceMediationAdapter.IRONSOURCE_SDK_ERROR_DOMAIN);
        android.util.Log.w(com.google.ads.mediation.ironsource.IronSourceConstants.TAG, adError.toString());
        com.google.ads.mediation.ironsource.IronSourceInterstitialAd fromAvailableInstances = com.google.ads.mediation.ironsource.IronSourceInterstitialAd.getFromAvailableInstances(str);
        if (fromAvailableInstances != null && (interstitialAdCallback = fromAvailableInstances.getInterstitialAdCallback()) != null) {
            interstitialAdCallback.onAdFailedToShow(adError);
        }
        com.google.ads.mediation.ironsource.IronSourceInterstitialAd.removeFromAvailableInstances(str);
    }

    @Override // com.json.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdClicked(java.lang.String str) {
        com.google.android.gms.ads.mediation.MediationInterstitialAdCallback interstitialAdCallback;
        android.util.Log.d(com.google.ads.mediation.ironsource.IronSourceConstants.TAG, java.lang.String.format("IronSource interstitial ad clicked for instance ID: %s", str));
        com.google.ads.mediation.ironsource.IronSourceInterstitialAd fromAvailableInstances = com.google.ads.mediation.ironsource.IronSourceInterstitialAd.getFromAvailableInstances(str);
        if (fromAvailableInstances == null || (interstitialAdCallback = fromAvailableInstances.getInterstitialAdCallback()) == null) {
            return;
        }
        interstitialAdCallback.reportAdClicked();
    }
}
