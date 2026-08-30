package com.unity3d.scar.adapter.v2100.scarads;

/* JADX INFO: loaded from: classes6.dex */
public class ScarRewardedAdListener extends com.unity3d.scar.adapter.v2100.scarads.ScarAdListener {
    private final com.unity3d.scar.adapter.common.IScarRewardedAdListenerWrapper _adListenerWrapper;
    private final com.unity3d.scar.adapter.v2100.scarads.ScarRewardedAd _scarRewardedAd;
    private final com.google.android.gms.ads.rewarded.RewardedAdLoadCallback _adLoadCallback = new com.google.android.gms.ads.rewarded.RewardedAdLoadCallback() { // from class: com.unity3d.scar.adapter.v2100.scarads.ScarRewardedAdListener.1
        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(com.google.android.gms.ads.rewarded.RewardedAd rewardedAd) {
            super.onAdLoaded(rewardedAd);
            com.unity3d.scar.adapter.v2100.scarads.ScarRewardedAdListener.this._adListenerWrapper.onAdLoaded();
            rewardedAd.setFullScreenContentCallback(com.unity3d.scar.adapter.v2100.scarads.ScarRewardedAdListener.this._fullScreenContentCallback);
            com.unity3d.scar.adapter.v2100.scarads.ScarRewardedAdListener.this._scarRewardedAd.setGmaAd(rewardedAd);
            if (com.unity3d.scar.adapter.v2100.scarads.ScarRewardedAdListener.this._loadListener != null) {
                com.unity3d.scar.adapter.v2100.scarads.ScarRewardedAdListener.this._loadListener.onAdLoaded();
            }
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(com.google.android.gms.ads.LoadAdError loadAdError) {
            super.onAdFailedToLoad(loadAdError);
            com.unity3d.scar.adapter.v2100.scarads.ScarRewardedAdListener.this._adListenerWrapper.onAdFailedToLoad(loadAdError.getCode(), loadAdError.toString());
        }
    };
    private final com.google.android.gms.ads.OnUserEarnedRewardListener _onUserEarnedRewardListener = new com.google.android.gms.ads.OnUserEarnedRewardListener() { // from class: com.unity3d.scar.adapter.v2100.scarads.ScarRewardedAdListener.2
        @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
        public void onUserEarnedReward(com.google.android.gms.ads.rewarded.RewardItem rewardItem) {
            com.unity3d.scar.adapter.v2100.scarads.ScarRewardedAdListener.this._adListenerWrapper.onUserEarnedReward();
        }
    };
    private final com.google.android.gms.ads.FullScreenContentCallback _fullScreenContentCallback = new com.google.android.gms.ads.FullScreenContentCallback() { // from class: com.unity3d.scar.adapter.v2100.scarads.ScarRewardedAdListener.3
        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(com.google.android.gms.ads.AdError adError) {
            super.onAdFailedToShowFullScreenContent(adError);
            com.unity3d.scar.adapter.v2100.scarads.ScarRewardedAdListener.this._adListenerWrapper.onAdFailedToShow(adError.getCode(), adError.toString());
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            super.onAdShowedFullScreenContent();
            com.unity3d.scar.adapter.v2100.scarads.ScarRewardedAdListener.this._adListenerWrapper.onAdOpened();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            super.onAdDismissedFullScreenContent();
            com.unity3d.scar.adapter.v2100.scarads.ScarRewardedAdListener.this._adListenerWrapper.onAdClosed();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdImpression() {
            super.onAdImpression();
            com.unity3d.scar.adapter.v2100.scarads.ScarRewardedAdListener.this._adListenerWrapper.onAdImpression();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdClicked() {
            super.onAdClicked();
            com.unity3d.scar.adapter.v2100.scarads.ScarRewardedAdListener.this._adListenerWrapper.onAdClicked();
        }
    };

    public ScarRewardedAdListener(com.unity3d.scar.adapter.common.IScarRewardedAdListenerWrapper iScarRewardedAdListenerWrapper, com.unity3d.scar.adapter.v2100.scarads.ScarRewardedAd scarRewardedAd) {
        this._adListenerWrapper = iScarRewardedAdListenerWrapper;
        this._scarRewardedAd = scarRewardedAd;
    }

    public com.google.android.gms.ads.OnUserEarnedRewardListener getOnUserEarnedRewardListener() {
        return this._onUserEarnedRewardListener;
    }

    public com.google.android.gms.ads.rewarded.RewardedAdLoadCallback getAdLoadListener() {
        return this._adLoadCallback;
    }
}
