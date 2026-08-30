package com.bytedance.sdk.openadsdk.api.banner;

/* JADX INFO: loaded from: classes4.dex */
public abstract class PAGBannerAd implements com.bytedance.sdk.openadsdk.api.PAGClientBidding, com.bytedance.sdk.openadsdk.api.PangleAd {
    public abstract void destroy();

    public abstract android.view.View getBannerView();

    public abstract void setAdInteractionCallback(com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback);

    public abstract void setAdInteractionListener(com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener pAGBannerAdInteractionListener);

    public static void loadAd(java.lang.String str, com.bytedance.sdk.openadsdk.api.banner.PAGBannerRequest pAGBannerRequest, com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener pAGBannerAdLoadListener) {
        com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory iSDKTypeFactoryBg = com.bytedance.sdk.openadsdk.common.zx.bg(pAGBannerAdLoadListener);
        if (iSDKTypeFactoryBg != null) {
            iSDKTypeFactoryBg.createADTypeLoaderFactory(str).createBannerAdLoader().loadAd(str, pAGBannerRequest, pAGBannerAdLoadListener);
        }
    }

    public static void loadAd(java.lang.String str, com.bytedance.sdk.openadsdk.api.banner.PAGBannerRequest pAGBannerRequest, final com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadCallback pAGBannerAdLoadCallback) {
        loadAd(str, pAGBannerRequest, new com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener() { // from class: com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd.1
            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.ldr
            public void onError(int i, java.lang.String str2) {
                pAGBannerAdLoadCallback.onError(new com.bytedance.sdk.openadsdk.api.model.PAGErrorModel(i, str2));
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            public void onAdLoaded(com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd pAGBannerAd) {
                pAGBannerAdLoadCallback.onAdLoaded(pAGBannerAd);
            }
        });
    }
}
