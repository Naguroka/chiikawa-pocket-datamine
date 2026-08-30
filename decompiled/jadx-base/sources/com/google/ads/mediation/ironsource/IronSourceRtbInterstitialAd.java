package com.google.ads.mediation.ironsource;

/* JADX INFO: loaded from: classes4.dex */
public class IronSourceRtbInterstitialAd implements com.google.android.gms.ads.mediation.MediationInterstitialAd, com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener, com.unity3d.ironsourceads.interstitial.InterstitialAdListener {
    private com.unity3d.ironsourceads.interstitial.InterstitialAd ad = null;
    private final java.lang.String bidToken;
    private final java.lang.String instanceID;
    private com.google.android.gms.ads.mediation.MediationInterstitialAdCallback interstitialAdCallback;
    private final com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationInterstitialAd, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback> mediationAdLoadCallback;
    private final java.lang.String watermark;

    public IronSourceRtbInterstitialAd(com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationInterstitialAd, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback> mediationAdLoadCallback) {
        this.instanceID = mediationInterstitialAdConfiguration.getServerParameters().getString("instanceId", "");
        this.bidToken = mediationInterstitialAdConfiguration.getBidResponse();
        this.watermark = mediationInterstitialAdConfiguration.getWatermark();
        this.mediationAdLoadCallback = mediationAdLoadCallback;
    }

    public void loadRtbAd() {
        if (android.text.TextUtils.isEmpty(this.instanceID)) {
            this.mediationAdLoadCallback.onFailure(com.google.ads.mediation.ironsource.IronSourceAdapterUtils.buildAdErrorAdapterDomain(101, "Missing or invalid instance ID."));
        } else {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(com.applovin.mediation.AppLovinExtras.Keys.KEY_WATERMARK, this.watermark);
            com.unity3d.ironsourceads.interstitial.InterstitialAdLoader.loadAd(new com.unity3d.ironsourceads.interstitial.InterstitialAdRequest.Builder(this.instanceID, this.bidToken).withExtraParams(bundle).build(), this);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(android.content.Context context) {
        com.unity3d.ironsourceads.interstitial.InterstitialAd interstitialAd = this.ad;
        if (interstitialAd == null) {
            reportAdFailedToShow(com.google.ads.mediation.ironsource.IronSourceAdapterUtils.buildAdErrorAdapterDomain(107, "ad is null"));
            return;
        }
        try {
            interstitialAd.setListener(this);
            this.ad.show((android.app.Activity) context);
        } catch (java.lang.ClassCastException unused) {
            reportAdFailedToShow(com.google.ads.mediation.ironsource.IronSourceAdapterUtils.buildAdErrorAdapterDomain(102, "IronSource requires an Activity context to load ads."));
        }
    }

    private void reportAdFailedToShow(com.google.android.gms.ads.AdError adError) {
        android.util.Log.e(com.google.ads.mediation.ironsource.IronSourceConstants.TAG, adError.toString());
        com.google.android.gms.ads.mediation.MediationInterstitialAdCallback mediationInterstitialAdCallback = this.interstitialAdCallback;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // com.unity3d.ironsourceads.interstitial.InterstitialAdListener
    public void onInterstitialAdClicked(com.unity3d.ironsourceads.interstitial.InterstitialAd interstitialAd) {
        com.google.android.gms.ads.mediation.MediationInterstitialAdCallback mediationInterstitialAdCallback = this.interstitialAdCallback;
        if (mediationInterstitialAdCallback == null) {
            return;
        }
        mediationInterstitialAdCallback.reportAdClicked();
    }

    @Override // com.unity3d.ironsourceads.interstitial.InterstitialAdListener
    public void onInterstitialAdDismissed(com.unity3d.ironsourceads.interstitial.InterstitialAd interstitialAd) {
        com.google.android.gms.ads.mediation.MediationInterstitialAdCallback mediationInterstitialAdCallback = this.interstitialAdCallback;
        if (mediationInterstitialAdCallback == null) {
            return;
        }
        mediationInterstitialAdCallback.onAdClosed();
    }

    @Override // com.unity3d.ironsourceads.interstitial.InterstitialAdListener
    public void onInterstitialAdFailedToShow(com.unity3d.ironsourceads.interstitial.InterstitialAd interstitialAd, com.json.mediationsdk.logger.IronSourceError ironSourceError) {
        reportAdFailedToShow(com.google.ads.mediation.ironsource.IronSourceAdapterUtils.buildAdErrorIronSourceDomain(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage()));
    }

    @Override // com.unity3d.ironsourceads.interstitial.InterstitialAdListener
    public void onInterstitialAdShown(com.unity3d.ironsourceads.interstitial.InterstitialAd interstitialAd) {
        com.google.android.gms.ads.mediation.MediationInterstitialAdCallback mediationInterstitialAdCallback = this.interstitialAdCallback;
        if (mediationInterstitialAdCallback == null) {
            return;
        }
        mediationInterstitialAdCallback.onAdOpened();
        this.interstitialAdCallback.reportAdImpression();
    }

    @Override // com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener
    public void onInterstitialAdLoadFailed(com.json.mediationsdk.logger.IronSourceError ironSourceError) {
        android.util.Log.e(com.google.ads.mediation.ironsource.IronSourceConstants.TAG, ironSourceError.toString());
        this.mediationAdLoadCallback.onFailure(com.google.ads.mediation.ironsource.IronSourceAdapterUtils.buildAdErrorIronSourceDomain(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage()));
    }

    @Override // com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener
    public void onInterstitialAdLoaded(com.unity3d.ironsourceads.interstitial.InterstitialAd interstitialAd) {
        this.ad = interstitialAd;
        this.interstitialAdCallback = this.mediationAdLoadCallback.onSuccess(this);
    }
}
