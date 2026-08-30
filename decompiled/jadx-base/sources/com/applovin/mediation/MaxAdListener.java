package com.applovin.mediation;

/* JADX INFO: loaded from: classes3.dex */
public interface MaxAdListener {
    void onAdClicked(com.applovin.mediation.MaxAd maxAd);

    void onAdDisplayFailed(com.applovin.mediation.MaxAd maxAd, com.applovin.mediation.MaxError maxError);

    void onAdDisplayed(com.applovin.mediation.MaxAd maxAd);

    void onAdHidden(com.applovin.mediation.MaxAd maxAd);

    void onAdLoadFailed(java.lang.String str, com.applovin.mediation.MaxError maxError);

    void onAdLoaded(com.applovin.mediation.MaxAd maxAd);
}
