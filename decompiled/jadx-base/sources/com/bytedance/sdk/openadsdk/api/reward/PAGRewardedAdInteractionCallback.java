package com.bytedance.sdk.openadsdk.api.reward;

/* JADX INFO: loaded from: classes4.dex */
public abstract class PAGRewardedAdInteractionCallback {
    public void onAdClicked() {
    }

    public void onAdDismissed() {
    }

    public void onAdShowFailed(com.bytedance.sdk.openadsdk.api.model.PAGErrorModel pAGErrorModel) {
    }

    public void onAdShowed() {
    }

    public void onUserEarnedReward(com.bytedance.sdk.openadsdk.api.reward.PAGRewardItem pAGRewardItem) {
    }

    public void onUserEarnedRewardFail(com.bytedance.sdk.openadsdk.api.model.PAGErrorModel pAGErrorModel) {
    }
}
