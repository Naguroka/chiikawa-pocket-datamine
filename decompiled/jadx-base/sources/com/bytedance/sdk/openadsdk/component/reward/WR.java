package com.bytedance.sdk.openadsdk.component.reward;

/* JADX INFO: loaded from: classes4.dex */
public class WR implements com.bytedance.sdk.openadsdk.bg.zx.bg {
    private final com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionCallback IL;
    private final com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener bg;

    public WR(com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener) {
        this.bg = pAGRewardedAdInteractionListener;
        this.IL = null;
    }

    public WR(com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback) {
        this.IL = pAGRewardedAdInteractionCallback;
        this.bg = null;
    }

    @Override // com.bytedance.sdk.openadsdk.bg.zx.bg
    public void bg() {
        com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.bg;
        if (pAGRewardedAdInteractionListener != null) {
            pAGRewardedAdInteractionListener.onAdShowed();
            return;
        }
        com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.IL;
        if (pAGRewardedAdInteractionCallback != null) {
            pAGRewardedAdInteractionCallback.onAdShowed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.bg;
        if (pAGRewardedAdInteractionListener != null) {
            pAGRewardedAdInteractionListener.onAdClicked();
            return;
        }
        com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.IL;
        if (pAGRewardedAdInteractionCallback != null) {
            pAGRewardedAdInteractionCallback.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.bg.zx.bg
    public void IL() {
        com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.bg;
        if (pAGRewardedAdInteractionListener != null) {
            pAGRewardedAdInteractionListener.onAdDismissed();
            return;
        }
        com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.IL;
        if (pAGRewardedAdInteractionCallback != null) {
            pAGRewardedAdInteractionCallback.onAdDismissed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.bg.zx.bg
    public void bg(boolean z, int i, java.lang.String str, int i2, java.lang.String str2) {
        com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.bg;
        if (pAGRewardedAdInteractionListener != null) {
            if (z) {
                pAGRewardedAdInteractionListener.onUserEarnedReward(new com.bytedance.sdk.openadsdk.api.reward.PAGRewardItem(i, str));
                return;
            } else {
                pAGRewardedAdInteractionListener.onUserEarnedRewardFail(i2, str2);
                return;
            }
        }
        com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.IL;
        if (pAGRewardedAdInteractionCallback != null) {
            if (z) {
                pAGRewardedAdInteractionCallback.onUserEarnedReward(new com.bytedance.sdk.openadsdk.api.reward.PAGRewardItem(i, str));
            } else {
                pAGRewardedAdInteractionCallback.onUserEarnedRewardFail(new com.bytedance.sdk.openadsdk.api.model.PAGErrorModel(i2, str2));
            }
        }
    }
}
