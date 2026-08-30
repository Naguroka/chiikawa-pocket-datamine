package com.bytedance.sdk.openadsdk.component;

/* JADX INFO: loaded from: classes4.dex */
public class zx implements com.bytedance.sdk.openadsdk.bg.eqN.IL {
    private final java.util.concurrent.atomic.AtomicBoolean IL = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener bg;

    public zx(com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener) {
        this.bg = pAGAppOpenAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.bg.eqN.IL
    public void bg() {
        com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.bg;
        if (pAGAppOpenAdInteractionListener != null) {
            pAGAppOpenAdInteractionListener.onAdShowed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.bg;
        if (pAGAppOpenAdInteractionListener != null) {
            pAGAppOpenAdInteractionListener.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.bg.eqN.IL
    public void IL() {
        com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.bg;
        if (pAGAppOpenAdInteractionListener != null) {
            pAGAppOpenAdInteractionListener.onAdDismissed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.bg.eqN.IL
    public void bX() {
        com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener;
        if (this.IL.getAndSet(true) || (pAGAppOpenAdInteractionListener = this.bg) == null) {
            return;
        }
        pAGAppOpenAdInteractionListener.onAdDismissed();
    }
}
