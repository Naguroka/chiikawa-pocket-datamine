package com.applovin.mediation.adapter.listeners;

/* JADX INFO: loaded from: classes3.dex */
public interface MaxRewardedInterstitialAdapterListener extends com.applovin.mediation.adapter.listeners.MaxAdapterListener {
    void onRewardedInterstitialAdClicked();

    void onRewardedInterstitialAdClicked(android.os.Bundle bundle);

    void onRewardedInterstitialAdDisplayFailed(com.applovin.mediation.adapter.MaxAdapterError maxAdapterError);

    void onRewardedInterstitialAdDisplayFailed(com.applovin.mediation.adapter.MaxAdapterError maxAdapterError, android.os.Bundle bundle);

    void onRewardedInterstitialAdDisplayed();

    void onRewardedInterstitialAdDisplayed(android.os.Bundle bundle);

    void onRewardedInterstitialAdHidden();

    void onRewardedInterstitialAdHidden(android.os.Bundle bundle);

    void onRewardedInterstitialAdLoadFailed(com.applovin.mediation.adapter.MaxAdapterError maxAdapterError);

    void onRewardedInterstitialAdLoaded();

    void onRewardedInterstitialAdLoaded(android.os.Bundle bundle);

    void onUserRewarded(com.applovin.mediation.MaxReward maxReward);

    void onUserRewarded(com.applovin.mediation.MaxReward maxReward, android.os.Bundle bundle);
}
