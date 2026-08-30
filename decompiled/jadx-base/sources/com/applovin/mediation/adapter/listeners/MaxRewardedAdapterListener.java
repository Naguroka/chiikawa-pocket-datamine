package com.applovin.mediation.adapter.listeners;

/* JADX INFO: loaded from: classes3.dex */
public interface MaxRewardedAdapterListener extends com.applovin.mediation.adapter.listeners.MaxAdapterListener {
    void onRewardedAdClicked();

    void onRewardedAdClicked(android.os.Bundle bundle);

    void onRewardedAdDisplayFailed(com.applovin.mediation.adapter.MaxAdapterError maxAdapterError);

    void onRewardedAdDisplayFailed(com.applovin.mediation.adapter.MaxAdapterError maxAdapterError, android.os.Bundle bundle);

    void onRewardedAdDisplayed();

    void onRewardedAdDisplayed(android.os.Bundle bundle);

    void onRewardedAdHidden();

    void onRewardedAdHidden(android.os.Bundle bundle);

    void onRewardedAdLoadFailed(com.applovin.mediation.adapter.MaxAdapterError maxAdapterError);

    void onRewardedAdLoaded();

    void onRewardedAdLoaded(android.os.Bundle bundle);

    void onUserRewarded(com.applovin.mediation.MaxReward maxReward);

    void onUserRewarded(com.applovin.mediation.MaxReward maxReward, android.os.Bundle bundle);
}
