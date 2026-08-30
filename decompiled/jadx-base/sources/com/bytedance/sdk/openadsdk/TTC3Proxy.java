package com.bytedance.sdk.openadsdk;

/* JADX INFO: loaded from: classes4.dex */
public class TTC3Proxy {
    public static void verityPlayable(java.lang.String str, int i, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.bytedance.sdk.openadsdk.component.reward.eo.bg(str, i, str2, str3, str4);
    }

    public static void loadReward(android.content.Context context, com.bytedance.sdk.openadsdk.AdSlot adSlot, com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        adSlot.setDurationSlotType(7);
        com.bytedance.sdk.openadsdk.component.reward.PX.bg(context).bg(adSlot, new com.bytedance.sdk.openadsdk.component.reward.iR(pAGRewardedAdLoadListener));
    }

    public static void loadFull(android.content.Context context, com.bytedance.sdk.openadsdk.AdSlot adSlot, com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        adSlot.setDurationSlotType(8);
        com.bytedance.sdk.openadsdk.component.reward.zx.bg(context).bg(adSlot, new com.bytedance.sdk.openadsdk.component.bX.IL(pAGInterstitialAdLoadListener));
    }

    public static void a(android.content.Context context) {
        try {
            com.bytedance.sdk.openadsdk.component.reward.PX.bg(context).bg();
        } catch (java.lang.Throwable unused) {
        }
        try {
            com.bytedance.sdk.openadsdk.component.reward.zx.bg(context).bg();
        } catch (java.lang.Throwable unused2) {
        }
    }
}
