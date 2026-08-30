package com.bytedance.sdk.openadsdk.bg.IL;

/* JADX INFO: loaded from: classes4.dex */
public class iR implements com.bytedance.sdk.openadsdk.bg.IL.ldr {
    private final com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener bg;

    public iR(com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener pAGNativeAdInteractionListener) {
        this.bg = pAGNativeAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        com.bytedance.sdk.openadsdk.utils.VJ.bg(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.bg.IL.iR.1
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.openadsdk.bg.IL.iR.this.bg != null) {
                    com.bytedance.sdk.openadsdk.bg.IL.iR.this.bg.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.bg.IL.ldr
    public void bg(com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd pAGNativeAd) {
        com.bytedance.sdk.openadsdk.utils.VJ.bg(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.bg.IL.iR.2
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.openadsdk.bg.IL.iR.this.bg != null) {
                    com.bytedance.sdk.openadsdk.bg.IL.iR.this.bg.onAdShowed();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.bg.IL.ldr
    public void bg() {
        com.bytedance.sdk.openadsdk.utils.VJ.bg(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.bg.IL.iR.3
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.openadsdk.bg.IL.iR.this.bg != null) {
                    com.bytedance.sdk.openadsdk.bg.IL.iR.this.bg.onAdDismissed();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.bg.IL.ldr
    public boolean IL() {
        return this.bg != null;
    }
}
