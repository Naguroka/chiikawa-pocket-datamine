package com.bytedance.sdk.openadsdk.api.nativeAd;

/* JADX INFO: loaded from: classes4.dex */
public abstract class PAGNativeAd implements com.bytedance.sdk.openadsdk.api.PAGClientBidding, com.bytedance.sdk.openadsdk.api.PangleAd {
    public abstract com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData getNativeAdData();

    public abstract void registerViewForInteraction(android.view.ViewGroup viewGroup, java.util.List<android.view.View> list, java.util.List<android.view.View> list2, android.view.View view, com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionCallback pAGNativeAdInteractionCallback);

    public abstract void registerViewForInteraction(android.view.ViewGroup viewGroup, java.util.List<android.view.View> list, java.util.List<android.view.View> list2, android.view.View view, com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener pAGNativeAdInteractionListener);

    public abstract void showPrivacyActivity();

    public static void loadAd(java.lang.String str, com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeRequest pAGNativeRequest, com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener pAGNativeAdLoadListener) {
        com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory iSDKTypeFactoryBg = com.bytedance.sdk.openadsdk.common.zx.bg(pAGNativeAdLoadListener);
        if (iSDKTypeFactoryBg != null) {
            iSDKTypeFactoryBg.createADTypeLoaderFactory(str).createNativeAdLoader().loadAd(str, pAGNativeRequest, pAGNativeAdLoadListener);
        }
    }

    public static void loadAd(java.lang.String str, com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeRequest pAGNativeRequest, final com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadCallback pAGNativeAdLoadCallback) {
        loadAd(str, pAGNativeRequest, new com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener() { // from class: com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd.1
            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.ldr
            public void onError(int i, java.lang.String str2) {
                pAGNativeAdLoadCallback.onError(new com.bytedance.sdk.openadsdk.api.model.PAGErrorModel(i, str2));
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            public void onAdLoaded(com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd pAGNativeAd) {
                pAGNativeAdLoadCallback.onAdLoaded(pAGNativeAd);
            }
        });
    }
}
