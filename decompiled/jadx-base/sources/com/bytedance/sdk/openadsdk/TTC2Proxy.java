package com.bytedance.sdk.openadsdk;

/* JADX INFO: loaded from: classes4.dex */
public class TTC2Proxy {
    private TTC2Proxy() {
    }

    public static void load(android.content.Context context, com.bytedance.sdk.openadsdk.AdSlot adSlot, com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener, int i) {
        adSlot.setDurationSlotType(3);
        com.bytedance.sdk.openadsdk.component.iR.bg(context).bg(adSlot, pAGAppOpenAdLoadListener, i);
    }

    public static void a(android.content.Context context) {
        com.bytedance.sdk.openadsdk.component.iR.bg.bg(context);
    }
}
