package com.bytedance.sdk.openadsdk.bg.eqN;

/* JADX INFO: loaded from: classes4.dex */
public class bg implements com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener {
    private final com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener bg;

    public bg(com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener) {
        this.bg = pAGAppOpenAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.ldr
    public void onError(final int i, final java.lang.String str) {
        if (this.bg == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        com.bytedance.sdk.openadsdk.utils.VJ.bg(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.bg.eqN.bg.1
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.openadsdk.bg.eqN.bg.this.bg != null) {
                    com.bytedance.sdk.openadsdk.bg.eqN.bg.this.bg.onError(i, str);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd pAGAppOpenAd) {
        if (this.bg == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.VJ.bg(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.bg.eqN.bg.2
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.openadsdk.bg.eqN.bg.this.bg != null) {
                    com.bytedance.sdk.openadsdk.bg.eqN.bg.this.bg.onAdLoaded(pAGAppOpenAd);
                }
            }
        });
    }
}
