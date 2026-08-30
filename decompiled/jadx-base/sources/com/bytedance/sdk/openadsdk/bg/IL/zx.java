package com.bytedance.sdk.openadsdk.bg.IL;

/* JADX INFO: loaded from: classes4.dex */
public class zx implements com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener {
    private final com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener bg;

    public zx(com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener pAGNativeAdLoadListener) {
        this.bg = pAGNativeAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.ldr
    public void onError(final int i, final java.lang.String str) {
        if (this.bg == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        com.bytedance.sdk.openadsdk.utils.VJ.bg(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.bg.IL.zx.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.bg.IL.zx.this.bg.onError(i, str);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd pAGNativeAd) {
        if (this.bg == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.VJ.bg(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.bg.IL.zx.2
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.bg.IL.zx.this.bg.onAdLoaded(pAGNativeAd);
            }
        });
    }
}
