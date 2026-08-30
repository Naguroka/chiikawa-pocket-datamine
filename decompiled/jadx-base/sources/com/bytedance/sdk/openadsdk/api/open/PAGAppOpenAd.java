package com.bytedance.sdk.openadsdk.api.open;

/* JADX INFO: loaded from: classes4.dex */
public abstract class PAGAppOpenAd implements com.bytedance.sdk.openadsdk.api.PAGClientBidding, com.bytedance.sdk.openadsdk.api.PangleAd {
    public abstract void setAdInteractionCallback(com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionCallback pAGAppOpenAdInteractionCallback);

    public abstract void setAdInteractionListener(com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener);

    public abstract void show(android.app.Activity activity);

    public static void loadAd(java.lang.String str, com.bytedance.sdk.openadsdk.api.open.PAGAppOpenRequest pAGAppOpenRequest, com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener) {
        com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory iSDKTypeFactoryBg = com.bytedance.sdk.openadsdk.common.zx.bg(pAGAppOpenAdLoadListener);
        if (iSDKTypeFactoryBg != null) {
            iSDKTypeFactoryBg.createADTypeLoaderFactory(str).createOpenAdLoader().loadAd(str, pAGAppOpenRequest, pAGAppOpenAdLoadListener);
        }
    }

    public static void loadAd(java.lang.String str, com.bytedance.sdk.openadsdk.api.open.PAGAppOpenRequest pAGAppOpenRequest, final com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadCallback pAGAppOpenAdLoadCallback) {
        loadAd(str, pAGAppOpenRequest, new com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener() { // from class: com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd.1
            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.ldr
            public void onError(int i, java.lang.String str2) {
                pAGAppOpenAdLoadCallback.onError(new com.bytedance.sdk.openadsdk.api.model.PAGErrorModel(i, str2));
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            public void onAdLoaded(com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd pAGAppOpenAd) {
                pAGAppOpenAdLoadCallback.onAdLoaded(pAGAppOpenAd);
            }
        });
    }
}
