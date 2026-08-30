package com.bytedance.sdk.openadsdk.api.banner;

/* JADX INFO: loaded from: classes4.dex */
public abstract class PAGBannerAdInteractionCallback implements com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener {
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
