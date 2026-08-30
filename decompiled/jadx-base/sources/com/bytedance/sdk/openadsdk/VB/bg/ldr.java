package com.bytedance.sdk.openadsdk.VB.bg;

/* JADX INFO: loaded from: classes4.dex */
public class ldr extends com.bytedance.sdk.component.bg.zx<org.json.JSONObject, org.json.JSONObject> {
    private final com.bytedance.sdk.openadsdk.core.aGH IL;
    private final java.lang.String bg;

    public ldr(java.lang.String str, com.bytedance.sdk.openadsdk.core.aGH agh) {
        this.IL = agh;
        this.bg = str;
    }

    public static void bg(com.bytedance.sdk.component.bg.VzQ vzQ, com.bytedance.sdk.openadsdk.core.aGH agh) {
        vzQ.bg("appInfo", new com.bytedance.sdk.openadsdk.VB.bg.ldr("appInfo", agh));
        vzQ.bg("adInfo", new com.bytedance.sdk.openadsdk.VB.bg.ldr("adInfo", agh));
        vzQ.bg("sendLog", new com.bytedance.sdk.openadsdk.VB.bg.ldr("sendLog", agh));
        vzQ.bg("playable_style", new com.bytedance.sdk.openadsdk.VB.bg.ldr("playable_style", agh));
        vzQ.bg("getTemplateInfo", new com.bytedance.sdk.openadsdk.VB.bg.ldr("getTemplateInfo", agh));
        vzQ.bg("getTeMaiAds", new com.bytedance.sdk.openadsdk.VB.bg.ldr("getTeMaiAds", agh));
        vzQ.bg(com.ironsource.y8.h.o, new com.bytedance.sdk.openadsdk.VB.bg.ldr(com.ironsource.y8.h.o, agh));
        vzQ.bg("getScreenSize", new com.bytedance.sdk.openadsdk.VB.bg.ldr("getScreenSize", agh));
        vzQ.bg("getCloseButtonInfo", new com.bytedance.sdk.openadsdk.VB.bg.ldr("getCloseButtonInfo", agh));
        vzQ.bg("getVolume", new com.bytedance.sdk.openadsdk.VB.bg.ldr("getVolume", agh));
        vzQ.bg("removeLoading", new com.bytedance.sdk.openadsdk.VB.bg.ldr("removeLoading", agh));
        vzQ.bg("sendReward", new com.bytedance.sdk.openadsdk.VB.bg.ldr("sendReward", agh));
        vzQ.bg("subscribe_app_ad", new com.bytedance.sdk.openadsdk.VB.bg.ldr("subscribe_app_ad", agh));
        vzQ.bg("download_app_ad", new com.bytedance.sdk.openadsdk.VB.bg.ldr("download_app_ad", agh));
        vzQ.bg("cancel_download_app_ad", new com.bytedance.sdk.openadsdk.VB.bg.ldr("cancel_download_app_ad", agh));
        vzQ.bg("unsubscribe_app_ad", new com.bytedance.sdk.openadsdk.VB.bg.ldr("unsubscribe_app_ad", agh));
        vzQ.bg("landscape_click", new com.bytedance.sdk.openadsdk.VB.bg.ldr("landscape_click", agh));
        vzQ.bg("clickEvent", new com.bytedance.sdk.openadsdk.VB.bg.ldr("clickEvent", agh));
        vzQ.bg("renderDidFinish", new com.bytedance.sdk.openadsdk.VB.bg.ldr("renderDidFinish", agh));
        vzQ.bg("dynamicTrack", new com.bytedance.sdk.openadsdk.VB.bg.ldr("dynamicTrack", agh));
        vzQ.bg("skipVideo", new com.bytedance.sdk.openadsdk.VB.bg.ldr("skipVideo", agh));
        vzQ.bg("muteVideo", new com.bytedance.sdk.openadsdk.VB.bg.ldr("muteVideo", agh));
        vzQ.bg("changeVideoState", new com.bytedance.sdk.openadsdk.VB.bg.ldr("changeVideoState", agh));
        vzQ.bg("getCurrentVideoState", new com.bytedance.sdk.openadsdk.VB.bg.ldr("getCurrentVideoState", agh));
        vzQ.bg("send_temai_product_ids", new com.bytedance.sdk.openadsdk.VB.bg.ldr("send_temai_product_ids", agh));
        vzQ.bg("getMaterialMeta", new com.bytedance.sdk.openadsdk.VB.bg.ldr("getMaterialMeta", agh));
        vzQ.bg("endcard_load", new com.bytedance.sdk.openadsdk.VB.bg.ldr("endcard_load", agh));
        vzQ.bg("pauseWebView", new com.bytedance.sdk.openadsdk.VB.bg.ldr("pauseWebView", agh));
        vzQ.bg("pauseWebViewTimers", new com.bytedance.sdk.openadsdk.VB.bg.ldr("pauseWebViewTimers", agh));
        vzQ.bg("webview_time_track", new com.bytedance.sdk.openadsdk.VB.bg.ldr("webview_time_track", agh));
        vzQ.bg("openPrivacy", new com.bytedance.sdk.openadsdk.VB.bg.ldr("openPrivacy", agh));
        vzQ.bg("openAdLandPageLinks", new com.bytedance.sdk.openadsdk.VB.bg.ldr("openAdLandPageLinks", agh));
        vzQ.bg("getNativeSiteCustomData", new com.bytedance.sdk.openadsdk.VB.bg.ldr("getNativeSiteCustomData", agh));
        vzQ.bg("close", new com.bytedance.sdk.openadsdk.VB.bg.ldr("close", agh));
    }

    @Override // com.bytedance.sdk.component.bg.zx
    public org.json.JSONObject bg(org.json.JSONObject jSONObject, com.bytedance.sdk.component.bg.ldr ldrVar) throws java.lang.Exception {
        com.bytedance.sdk.openadsdk.core.aGH.IL il = new com.bytedance.sdk.openadsdk.core.aGH.IL();
        il.bg = androidx.core.app.NotificationCompat.CATEGORY_CALL;
        il.bX = this.bg;
        il.eqN = jSONObject;
        return this.IL.bg(il, 3);
    }
}
