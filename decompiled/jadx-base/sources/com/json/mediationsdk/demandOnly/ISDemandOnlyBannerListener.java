package com.json.mediationsdk.demandOnly;

/* JADX INFO: loaded from: classes5.dex */
public interface ISDemandOnlyBannerListener {
    void onBannerAdClicked(java.lang.String str);

    void onBannerAdLeftApplication(java.lang.String str);

    void onBannerAdLoadFailed(java.lang.String str, com.json.mediationsdk.logger.IronSourceError ironSourceError);

    void onBannerAdLoaded(java.lang.String str);

    void onBannerAdShown(java.lang.String str);
}
