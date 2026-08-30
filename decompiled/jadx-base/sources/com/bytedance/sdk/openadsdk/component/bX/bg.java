package com.bytedance.sdk.openadsdk.component.bX;

/* JADX INFO: loaded from: classes4.dex */
public class bg implements com.bytedance.sdk.openadsdk.bg.bX.IL {
    private final com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener bg;

    public bg(com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener) {
        this.bg = pAGInterstitialAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.bg.bX.IL
    public void bg() {
        com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.bg;
        if (pAGInterstitialAdInteractionListener != null) {
            pAGInterstitialAdInteractionListener.onAdShowed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.bg.bX.IL
    public void IL() {
        com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.bg;
        if (pAGInterstitialAdInteractionListener != null) {
            pAGInterstitialAdInteractionListener.onAdDismissed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.bg;
        if (pAGInterstitialAdInteractionListener != null) {
            pAGInterstitialAdInteractionListener.onAdClicked();
        }
    }
}
