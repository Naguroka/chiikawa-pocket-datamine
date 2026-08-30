package com.bytedance.sdk.openadsdk.api.reward;

/* JADX INFO: loaded from: classes4.dex */
public abstract class PAGRewardedAd implements com.bytedance.sdk.openadsdk.api.PAGClientBidding, com.bytedance.sdk.openadsdk.api.PangleAd {
    public abstract void setAdInteractionCallback(com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback);

    public abstract void setAdInteractionListener(com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener);

    public abstract void show(android.app.Activity activity);

    public static void loadAd(java.lang.String str, com.bytedance.sdk.openadsdk.api.reward.PAGRewardedRequest pAGRewardedRequest, com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory iSDKTypeFactoryBg = com.bytedance.sdk.openadsdk.common.zx.bg(pAGRewardedAdLoadListener);
        if (iSDKTypeFactoryBg != null) {
            iSDKTypeFactoryBg.createADTypeLoaderFactory(str).createRewardAdLoader().loadAd(str, pAGRewardedRequest, pAGRewardedAdLoadListener);
        }
    }

    public static void loadAd(java.lang.String str, com.bytedance.sdk.openadsdk.api.reward.PAGRewardedRequest pAGRewardedRequest, final com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadCallback pAGRewardedAdLoadCallback) {
        loadAd(str, pAGRewardedRequest, new com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener() { // from class: com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd.1
            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.ldr
            public void onError(int i, java.lang.String str2) {
                pAGRewardedAdLoadCallback.onError(new com.bytedance.sdk.openadsdk.api.model.PAGErrorModel(i, str2));
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            public void onAdLoaded(com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd pAGRewardedAd) {
                pAGRewardedAdLoadCallback.onAdLoaded(pAGRewardedAd);
            }
        });
    }
}
