package com.google.ads.mediation.facebook;

/* JADX INFO: loaded from: classes4.dex */
public class MetaFactory {
    public com.facebook.ads.InterstitialAd createInterstitialAd(android.content.Context context, java.lang.String str) {
        return new com.facebook.ads.InterstitialAd(context, str);
    }

    public com.facebook.ads.RewardedVideoAd createRewardedAd(android.content.Context context, java.lang.String str) {
        return new com.facebook.ads.RewardedVideoAd(context, str);
    }

    public com.facebook.ads.AdView createMetaAdView(android.content.Context context, java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        return new com.facebook.ads.AdView(context, str, str2);
    }

    public com.facebook.ads.MediaView createMediaView(android.content.Context context) {
        return new com.facebook.ads.MediaView(context);
    }
}
