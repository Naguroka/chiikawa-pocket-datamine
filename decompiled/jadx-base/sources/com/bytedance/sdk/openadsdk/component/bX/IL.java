package com.bytedance.sdk.openadsdk.component.bX;

/* JADX INFO: loaded from: classes4.dex */
public class IL implements com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener {
    final com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener bg;

    public IL(com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        this.bg = pAGInterstitialAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.ldr
    public void onError(final int i, final java.lang.String str) {
        if (this.bg != null) {
            com.bytedance.sdk.openadsdk.utils.VJ.bg(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.component.bX.IL.1
                @Override // java.lang.Runnable
                public void run() {
                    if (com.bytedance.sdk.openadsdk.component.bX.IL.this.bg != null) {
                        com.bytedance.sdk.openadsdk.component.bX.IL.this.bg.onError(i, str);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd pAGInterstitialAd) {
        if (this.bg != null) {
            com.bytedance.sdk.openadsdk.utils.VJ.bg(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.component.bX.IL.2
                @Override // java.lang.Runnable
                public void run() {
                    if (com.bytedance.sdk.openadsdk.component.bX.IL.this.bg != null) {
                        com.bytedance.sdk.openadsdk.component.bX.IL.this.bg.onAdLoaded(pAGInterstitialAd);
                    }
                }
            });
        }
    }
}
