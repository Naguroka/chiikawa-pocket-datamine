package com.bytedance.sdk.openadsdk.api.open;

/* JADX INFO: loaded from: classes4.dex */
public abstract class PAGAppOpenAdInteractionCallback implements com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener {
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
