package com.bytedance.sdk.openadsdk.component.reward;

/* JADX INFO: loaded from: classes4.dex */
public class iR implements com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener {
    final com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener bg;

    public iR(com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        this.bg = pAGRewardedAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.ldr
    public void onError(final int i, final java.lang.String str) {
        if (this.bg != null) {
            com.bytedance.sdk.openadsdk.utils.VJ.bg(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.iR.1
                @Override // java.lang.Runnable
                public void run() {
                    if (com.bytedance.sdk.openadsdk.component.reward.iR.this.bg != null) {
                        com.bytedance.sdk.openadsdk.component.reward.iR.this.bg.onError(i, str);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd pAGRewardedAd) {
        if (this.bg != null) {
            com.bytedance.sdk.openadsdk.utils.VJ.bg(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.iR.2
                @Override // java.lang.Runnable
                public void run() {
                    if (com.bytedance.sdk.openadsdk.component.reward.iR.this.bg != null) {
                        com.bytedance.sdk.openadsdk.component.reward.iR.this.bg.onAdLoaded(pAGRewardedAd);
                    }
                }
            });
        }
    }
}
