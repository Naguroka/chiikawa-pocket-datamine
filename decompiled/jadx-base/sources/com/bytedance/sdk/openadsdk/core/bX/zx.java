package com.bytedance.sdk.openadsdk.core.bX;

/* JADX INFO: loaded from: classes4.dex */
public class zx implements com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener {
    private final com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener bg;

    @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public void onRenderFail(android.view.View view, java.lang.String str, int i) {
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public void onRenderSuccess(android.view.View view, float f, float f2) {
    }

    public zx(com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener pAGBannerAdInteractionListener) {
        this.bg = pAGBannerAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener pAGBannerAdInteractionListener = this.bg;
        if (pAGBannerAdInteractionListener != null) {
            pAGBannerAdInteractionListener.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public void onAdShow(android.view.View view, int i) {
        com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener pAGBannerAdInteractionListener = this.bg;
        if (pAGBannerAdInteractionListener != null) {
            pAGBannerAdInteractionListener.onAdShowed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public void onAdDismissed() {
        com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener pAGBannerAdInteractionListener = this.bg;
        if (pAGBannerAdInteractionListener != null) {
            pAGBannerAdInteractionListener.onAdDismissed();
        }
    }
}
