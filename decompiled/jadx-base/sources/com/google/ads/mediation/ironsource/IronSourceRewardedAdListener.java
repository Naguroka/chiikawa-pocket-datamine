package com.google.ads.mediation.ironsource;

/* JADX INFO: loaded from: classes4.dex */
public class IronSourceRewardedAdListener implements com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener {
    @Override // com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdLoadSuccess(java.lang.String str) {
        android.util.Log.d(com.google.ads.mediation.ironsource.IronSourceConstants.TAG, java.lang.String.format("IronSource rewarded ad loaded for instance ID: %s", str));
        com.google.ads.mediation.ironsource.IronSourceRewardedAd fromAvailableInstances = com.google.ads.mediation.ironsource.IronSourceRewardedAd.getFromAvailableInstances(str);
        if (fromAvailableInstances == null || fromAvailableInstances.getMediationAdLoadCallback() == null) {
            return;
        }
        fromAvailableInstances.setRewardedAdCallback(fromAvailableInstances.getMediationAdLoadCallback().onSuccess(fromAvailableInstances));
    }

    @Override // com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdLoadFailed(java.lang.String str, com.json.mediationsdk.logger.IronSourceError ironSourceError) {
        com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), com.google.ads.mediation.ironsource.IronSourceMediationAdapter.IRONSOURCE_SDK_ERROR_DOMAIN);
        android.util.Log.e(com.google.ads.mediation.ironsource.IronSourceConstants.TAG, adError.toString());
        com.google.ads.mediation.ironsource.IronSourceRewardedAd fromAvailableInstances = com.google.ads.mediation.ironsource.IronSourceRewardedAd.getFromAvailableInstances(str);
        if (fromAvailableInstances != null && fromAvailableInstances.getMediationAdLoadCallback() != null) {
            fromAvailableInstances.getMediationAdLoadCallback().onFailure(adError);
        }
        com.google.ads.mediation.ironsource.IronSourceRewardedAd.removeFromAvailableInstances(str);
    }

    @Override // com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdOpened(java.lang.String str) {
        com.google.android.gms.ads.mediation.MediationRewardedAdCallback rewardedAdCallback;
        android.util.Log.d(com.google.ads.mediation.ironsource.IronSourceConstants.TAG, java.lang.String.format("IronSource rewarded ad opened for instance ID: %s", str));
        com.google.ads.mediation.ironsource.IronSourceRewardedAd fromAvailableInstances = com.google.ads.mediation.ironsource.IronSourceRewardedAd.getFromAvailableInstances(str);
        if (fromAvailableInstances == null || (rewardedAdCallback = fromAvailableInstances.getRewardedAdCallback()) == null) {
            return;
        }
        rewardedAdCallback.onAdOpened();
        rewardedAdCallback.onVideoStart();
        rewardedAdCallback.reportAdImpression();
    }

    @Override // com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdClosed(java.lang.String str) {
        com.google.android.gms.ads.mediation.MediationRewardedAdCallback rewardedAdCallback;
        android.util.Log.d(com.google.ads.mediation.ironsource.IronSourceConstants.TAG, java.lang.String.format("IronSource rewarded ad closed for instance ID: %s", str));
        com.google.ads.mediation.ironsource.IronSourceRewardedAd fromAvailableInstances = com.google.ads.mediation.ironsource.IronSourceRewardedAd.getFromAvailableInstances(str);
        if (fromAvailableInstances != null && (rewardedAdCallback = fromAvailableInstances.getRewardedAdCallback()) != null) {
            rewardedAdCallback.onAdClosed();
        }
        com.google.ads.mediation.ironsource.IronSourceRewardedAd.removeFromAvailableInstances(str);
    }

    @Override // com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdRewarded(java.lang.String str) {
        com.google.android.gms.ads.mediation.MediationRewardedAdCallback rewardedAdCallback;
        com.google.ads.mediation.ironsource.IronSourceRewardItem ironSourceRewardItem = new com.google.ads.mediation.ironsource.IronSourceRewardItem();
        android.util.Log.d(com.google.ads.mediation.ironsource.IronSourceConstants.TAG, java.lang.String.format("IronSource rewarded ad received reward: %d %s, for instance ID: %s", java.lang.Integer.valueOf(ironSourceRewardItem.getAmount()), ironSourceRewardItem.getType(), str));
        com.google.ads.mediation.ironsource.IronSourceRewardedAd fromAvailableInstances = com.google.ads.mediation.ironsource.IronSourceRewardedAd.getFromAvailableInstances(str);
        if (fromAvailableInstances == null || (rewardedAdCallback = fromAvailableInstances.getRewardedAdCallback()) == null) {
            return;
        }
        rewardedAdCallback.onVideoComplete();
        rewardedAdCallback.onUserEarnedReward(ironSourceRewardItem);
    }

    @Override // com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdShowFailed(java.lang.String str, com.json.mediationsdk.logger.IronSourceError ironSourceError) {
        com.google.android.gms.ads.mediation.MediationRewardedAdCallback rewardedAdCallback;
        com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), com.google.ads.mediation.ironsource.IronSourceMediationAdapter.IRONSOURCE_SDK_ERROR_DOMAIN);
        android.util.Log.e(com.google.ads.mediation.ironsource.IronSourceConstants.TAG, adError.toString());
        com.google.ads.mediation.ironsource.IronSourceRewardedAd fromAvailableInstances = com.google.ads.mediation.ironsource.IronSourceRewardedAd.getFromAvailableInstances(str);
        if (fromAvailableInstances != null && (rewardedAdCallback = fromAvailableInstances.getRewardedAdCallback()) != null) {
            rewardedAdCallback.onAdFailedToShow(adError);
        }
        com.google.ads.mediation.ironsource.IronSourceRewardedAd.removeFromAvailableInstances(str);
    }

    @Override // com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdClicked(java.lang.String str) {
        com.google.android.gms.ads.mediation.MediationRewardedAdCallback rewardedAdCallback;
        android.util.Log.d(com.google.ads.mediation.ironsource.IronSourceConstants.TAG, java.lang.String.format("IronSource rewarded ad clicked for instance ID: %s", str));
        com.google.ads.mediation.ironsource.IronSourceRewardedAd fromAvailableInstances = com.google.ads.mediation.ironsource.IronSourceRewardedAd.getFromAvailableInstances(str);
        if (fromAvailableInstances == null || (rewardedAdCallback = fromAvailableInstances.getRewardedAdCallback()) == null) {
            return;
        }
        rewardedAdCallback.reportAdClicked();
    }
}
