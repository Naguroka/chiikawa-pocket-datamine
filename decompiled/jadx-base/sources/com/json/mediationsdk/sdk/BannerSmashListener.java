package com.json.mediationsdk.sdk;

/* JADX INFO: loaded from: classes5.dex */
public interface BannerSmashListener {
    void onBannerAdClicked();

    void onBannerAdLeftApplication();

    void onBannerAdLoadFailed(com.json.mediationsdk.logger.IronSourceError ironSourceError);

    void onBannerAdLoaded(android.view.View view, android.widget.FrameLayout.LayoutParams layoutParams);

    void onBannerAdScreenDismissed();

    void onBannerAdScreenPresented();

    void onBannerAdShown();

    void onBannerInitFailed(com.json.mediationsdk.logger.IronSourceError ironSourceError);

    void onBannerInitSuccess();
}
