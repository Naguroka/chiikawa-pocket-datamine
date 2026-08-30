package com.bytedance.sdk.openadsdk.bg.zx;

/* JADX INFO: loaded from: classes4.dex */
public class IL implements com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener {
    private final com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener bg;

    public IL(com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        this.bg = pAGRewardedAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.ldr
    public void onError(final int i, final java.lang.String str) {
        if (this.bg == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        com.bytedance.sdk.openadsdk.utils.VJ.bg(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.bg.zx.IL.1
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.openadsdk.bg.zx.IL.this.bg != null) {
                    com.bytedance.sdk.openadsdk.bg.zx.IL.this.bg.onError(i, str);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd pAGRewardedAd) {
        if (this.bg == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.VJ.bg(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.bg.zx.IL.2
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.openadsdk.bg.zx.IL.this.bg != null) {
                    com.bytedance.sdk.openadsdk.bg.zx.IL.this.bg.onAdLoaded(pAGRewardedAd);
                }
            }
        });
    }
}
