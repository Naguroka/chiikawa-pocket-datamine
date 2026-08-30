package com.bytedance.sdk.openadsdk.api.reward;

/* JADX INFO: loaded from: classes4.dex */
public interface PAGRewardedAdInteractionListener extends com.bytedance.sdk.openadsdk.api.PAGAdListener {
    void onUserEarnedReward(com.bytedance.sdk.openadsdk.api.reward.PAGRewardItem pAGRewardItem);

    void onUserEarnedRewardFail(int i, java.lang.String str);
}
