package com.bytedance.sdk.openadsdk.api.interstitial;

/* JADX INFO: loaded from: classes4.dex */
public abstract class PAGInterstitialAd implements com.bytedance.sdk.openadsdk.api.PAGClientBidding, com.bytedance.sdk.openadsdk.api.PangleAd {
    public abstract void setAdInteractionCallback(com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionCallback pAGInterstitialAdInteractionCallback);

    public abstract void setAdInteractionListener(com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener);

    public abstract void show(android.app.Activity activity);

    public static void loadAd(java.lang.String str, com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialRequest pAGInterstitialRequest, com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory iSDKTypeFactoryBg = com.bytedance.sdk.openadsdk.common.zx.bg(pAGInterstitialAdLoadListener);
        if (iSDKTypeFactoryBg != null) {
            iSDKTypeFactoryBg.createADTypeLoaderFactory(str).createInterstitialAdLoader().loadAd(str, pAGInterstitialRequest, pAGInterstitialAdLoadListener);
        }
    }

    public static void loadAd(java.lang.String str, com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialRequest pAGInterstitialRequest, final com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadCallback pAGInterstitialAdLoadCallback) {
        loadAd(str, pAGInterstitialRequest, new com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener() { // from class: com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd.1
            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.ldr
            public void onError(int i, java.lang.String str2) {
                pAGInterstitialAdLoadCallback.onError(new com.bytedance.sdk.openadsdk.api.model.PAGErrorModel(i, str2));
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            public void onAdLoaded(com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd pAGInterstitialAd) {
                pAGInterstitialAdLoadCallback.onAdLoaded(pAGInterstitialAd);
            }
        });
    }
}
