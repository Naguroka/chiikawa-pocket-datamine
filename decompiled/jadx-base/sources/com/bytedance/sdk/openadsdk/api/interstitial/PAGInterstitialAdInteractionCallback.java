package com.bytedance.sdk.openadsdk.api.interstitial;

/* JADX INFO: loaded from: classes4.dex */
public abstract class PAGInterstitialAdInteractionCallback implements com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener {
    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdClicked() {
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdDismissed() {
    }

    public void onAdShowFailed(com.bytedance.sdk.openadsdk.api.model.PAGErrorModel pAGErrorModel) {
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdShowed() {
    }
}
