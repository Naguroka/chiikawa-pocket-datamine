package com.applovin.mediation.adapter.listeners;

/* JADX INFO: loaded from: classes3.dex */
public interface MaxNativeAdAdapterListener extends com.applovin.mediation.adapter.listeners.MaxAdapterListener {
    void onNativeAdClicked();

    void onNativeAdClicked(android.os.Bundle bundle);

    void onNativeAdDisplayed(android.os.Bundle bundle);

    void onNativeAdLoadFailed(com.applovin.mediation.adapter.MaxAdapterError maxAdapterError);

    void onNativeAdLoaded(com.applovin.mediation.nativeAds.MaxNativeAd maxNativeAd, android.os.Bundle bundle);
}
