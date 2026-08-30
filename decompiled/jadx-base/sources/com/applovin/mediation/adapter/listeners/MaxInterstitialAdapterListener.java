package com.applovin.mediation.adapter.listeners;

/* JADX INFO: loaded from: classes3.dex */
public interface MaxInterstitialAdapterListener extends com.applovin.mediation.adapter.listeners.MaxAdapterListener {
    void onInterstitialAdClicked();

    void onInterstitialAdClicked(android.os.Bundle bundle);

    void onInterstitialAdDisplayFailed(com.applovin.mediation.adapter.MaxAdapterError maxAdapterError);

    void onInterstitialAdDisplayFailed(com.applovin.mediation.adapter.MaxAdapterError maxAdapterError, android.os.Bundle bundle);

    void onInterstitialAdDisplayed();

    void onInterstitialAdDisplayed(android.os.Bundle bundle);

    void onInterstitialAdHidden();

    void onInterstitialAdHidden(android.os.Bundle bundle);

    void onInterstitialAdLoadFailed(com.applovin.mediation.adapter.MaxAdapterError maxAdapterError);

    void onInterstitialAdLoaded();

    void onInterstitialAdLoaded(android.os.Bundle bundle);
}
