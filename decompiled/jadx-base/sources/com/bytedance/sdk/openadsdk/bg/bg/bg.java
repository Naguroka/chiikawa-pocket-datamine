package com.bytedance.sdk.openadsdk.bg.bg;

/* JADX INFO: loaded from: classes4.dex */
public class bg implements com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener {
    private final com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener bg;

    public bg(com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener pAGBannerAdLoadListener) {
        this.bg = pAGBannerAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.ldr
    public void onError(final int i, final java.lang.String str) {
        if (this.bg == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        com.bytedance.sdk.openadsdk.utils.VJ.bg(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.bg.bg.bg.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.bg.bg.bg.this.bg.onError(i, str);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd pAGBannerAd) {
        if (this.bg == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.VJ.bg(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.bg.bg.bg.2
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.bg.bg.bg.this.bg.onAdLoaded(pAGBannerAd);
            }
        });
    }
}
