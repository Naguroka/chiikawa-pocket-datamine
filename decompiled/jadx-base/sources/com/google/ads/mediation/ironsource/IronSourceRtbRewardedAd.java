package com.google.ads.mediation.ironsource;

/* JADX INFO: loaded from: classes4.dex */
public class IronSourceRtbRewardedAd implements com.google.android.gms.ads.mediation.MediationRewardedAd, com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener, com.unity3d.ironsourceads.rewarded.RewardedAdListener {
    private com.unity3d.ironsourceads.rewarded.RewardedAd ad = null;
    private final java.lang.String bidToken;
    private final android.content.Context context;
    private final java.lang.String instanceID;
    private final com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback;
    private com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback;
    private final java.lang.String watermark;

    public IronSourceRtbRewardedAd(com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration mediationRewardedAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback) {
        this.instanceID = mediationRewardedAdConfiguration.getServerParameters().getString("instanceId", "");
        this.context = mediationRewardedAdConfiguration.getContext();
        this.bidToken = mediationRewardedAdConfiguration.getBidResponse();
        this.watermark = mediationRewardedAdConfiguration.getWatermark();
        this.mediationAdLoadCallback = mediationAdLoadCallback;
    }

    public void loadRtbAd() {
        if (android.text.TextUtils.isEmpty(this.instanceID)) {
            this.mediationAdLoadCallback.onFailure(com.google.ads.mediation.ironsource.IronSourceAdapterUtils.buildAdErrorAdapterDomain(101, "Missing or invalid instance ID."));
        } else {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(com.applovin.mediation.AppLovinExtras.Keys.KEY_WATERMARK, this.watermark);
            com.unity3d.ironsourceads.rewarded.RewardedAdLoader.loadAd(new com.unity3d.ironsourceads.rewarded.RewardedAdRequest.Builder(this.instanceID, this.bidToken).withExtraParams(bundle).build(), this);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(android.content.Context context) {
        android.util.Log.d(com.google.ads.mediation.ironsource.IronSourceConstants.TAG, java.lang.String.format("Showing IronSource rewarded ad for instance ID: %s", this.instanceID));
        com.unity3d.ironsourceads.rewarded.RewardedAd rewardedAd = this.ad;
        if (rewardedAd == null) {
            reportAdFailedToShow(com.google.ads.mediation.ironsource.IronSourceAdapterUtils.buildAdErrorAdapterDomain(107, "ad is null"));
            return;
        }
        try {
            rewardedAd.setListener(this);
            this.ad.show((android.app.Activity) context);
        } catch (java.lang.ClassCastException unused) {
            reportAdFailedToShow(com.google.ads.mediation.ironsource.IronSourceAdapterUtils.buildAdErrorAdapterDomain(102, "IronSource requires an Activity context to load ads."));
        }
    }

    private void reportAdFailedToShow(com.google.android.gms.ads.AdError adError) {
        android.util.Log.w(com.google.ads.mediation.ironsource.IronSourceConstants.TAG, adError.toString());
        com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // com.unity3d.ironsourceads.rewarded.RewardedAdListener
    public void onRewardedAdClicked(com.unity3d.ironsourceads.rewarded.RewardedAd rewardedAd) {
        com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback == null) {
            return;
        }
        mediationRewardedAdCallback.reportAdClicked();
    }

    @Override // com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener
    public void onRewardedAdLoadFailed(com.json.mediationsdk.logger.IronSourceError ironSourceError) {
        this.mediationAdLoadCallback.onFailure(com.google.ads.mediation.ironsource.IronSourceAdapterUtils.buildAdErrorIronSourceDomain(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage()));
    }

    @Override // com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener
    public void onRewardedAdLoaded(com.unity3d.ironsourceads.rewarded.RewardedAd rewardedAd) {
        this.ad = rewardedAd;
        this.mediationRewardedAdCallback = this.mediationAdLoadCallback.onSuccess(this);
    }

    @Override // com.unity3d.ironsourceads.rewarded.RewardedAdListener
    public void onRewardedAdDismissed(com.unity3d.ironsourceads.rewarded.RewardedAd rewardedAd) {
        com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback == null) {
            return;
        }
        mediationRewardedAdCallback.onAdClosed();
    }

    @Override // com.unity3d.ironsourceads.rewarded.RewardedAdListener
    public void onRewardedAdFailedToShow(com.unity3d.ironsourceads.rewarded.RewardedAd rewardedAd, com.json.mediationsdk.logger.IronSourceError ironSourceError) {
        reportAdFailedToShow(com.google.ads.mediation.ironsource.IronSourceAdapterUtils.buildAdErrorIronSourceDomain(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage()));
    }

    @Override // com.unity3d.ironsourceads.rewarded.RewardedAdListener
    public void onRewardedAdShown(com.unity3d.ironsourceads.rewarded.RewardedAd rewardedAd) {
        com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback == null) {
            return;
        }
        mediationRewardedAdCallback.onAdOpened();
        this.mediationRewardedAdCallback.onVideoStart();
        this.mediationRewardedAdCallback.reportAdImpression();
    }

    @Override // com.unity3d.ironsourceads.rewarded.RewardedAdListener
    public void onUserEarnedReward(com.unity3d.ironsourceads.rewarded.RewardedAd rewardedAd) {
        if (this.mediationRewardedAdCallback == null) {
            return;
        }
        com.google.ads.mediation.ironsource.IronSourceRewardItem ironSourceRewardItem = new com.google.ads.mediation.ironsource.IronSourceRewardItem();
        this.mediationRewardedAdCallback.onVideoComplete();
        this.mediationRewardedAdCallback.onUserEarnedReward(ironSourceRewardItem);
    }
}
