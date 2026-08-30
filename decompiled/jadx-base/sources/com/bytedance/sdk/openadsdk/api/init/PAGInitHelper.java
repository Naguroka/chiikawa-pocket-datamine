package com.bytedance.sdk.openadsdk.api.init;

/* JADX INFO: loaded from: classes4.dex */
public class PAGInitHelper {
    public static final java.util.List<com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback> CALLBACK_LIST = new java.util.ArrayList();
    public static float animationScale = 1.0f;

    public static void maybeAsyncInitTask(final android.content.Context context) {
        com.bytedance.sdk.openadsdk.core.act.bg.bg(context);
        com.bytedance.sdk.openadsdk.utils.Uq.bg();
        com.bytedance.sdk.openadsdk.utils.ZQc.bg(context);
        bg(context);
        com.bytedance.sdk.openadsdk.core.VzQ.zx();
        java.lang.String strBg = com.bytedance.sdk.openadsdk.core.PX.bg(context);
        com.bytedance.sdk.openadsdk.core.WR.bX.IL(strBg);
        com.bytedance.sdk.openadsdk.eqN.bg.eqN.bg(strBg, true);
        com.bytedance.sdk.component.adexpress.bg.IL.IL.bg();
        com.bytedance.sdk.openadsdk.core.Ta.bX.bg.bg().IL();
        initAnimationScale(context);
        com.bytedance.sdk.openadsdk.core.yDt.IL().postDelayed(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGInitHelper.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.yDt.bX.bg();
                com.bytedance.sdk.openadsdk.yDt.bX.bg("android_act", false, new com.bytedance.sdk.openadsdk.yDt.IL() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGInitHelper.1.1
                    @Override // com.bytedance.sdk.openadsdk.yDt.IL
                    public com.bytedance.sdk.openadsdk.yDt.bg.bX getLogStats() throws java.lang.Exception {
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        try {
                            jSONObject.put("act", com.bytedance.sdk.openadsdk.core.act.bg.IL(context));
                            jSONObject.put("api_available", com.bytedance.sdk.openadsdk.core.act.bg.IL());
                            jSONObject.put("act_signals_callback_available", com.bytedance.sdk.openadsdk.core.act.bg.bX());
                            jSONObject.put("act_event", com.bytedance.sdk.openadsdk.core.act.bg.bg());
                        } catch (java.lang.Throwable th) {
                            com.bytedance.sdk.component.utils.PX.bg("AsyncInitTask", "run: ", th);
                        }
                        return com.bytedance.sdk.openadsdk.yDt.bg.eqN.IL().bg("android_act").IL(jSONObject.toString());
                    }
                });
            }
        }, 10000L);
    }

    public static void initAnimationScale(android.content.Context context) {
        try {
            float f = android.provider.Settings.System.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
            animationScale = f;
            if (f <= 0.0f) {
                animationScale = 1.0f;
            }
        } catch (java.lang.Throwable unused) {
            animationScale = 1.0f;
        }
    }

    private static void bg(android.content.Context context) {
        com.bytedance.sdk.openadsdk.core.bX.bg(context).bg("uuid", com.bytedance.sdk.openadsdk.utils.rri.bg());
    }

    public static void initMemoryData() {
        com.bytedance.sdk.openadsdk.core.VzQ.eqN();
        com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("ttopenadsdk", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, 0);
        com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("sp_global_file", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, 0);
        com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("sp_global_privacy", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, 0);
        com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("sp_global_app_id", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, 0);
        com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("sp_global_icon_id", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, 0);
        com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg(com.bytedance.sdk.openadsdk.xxp.IL.bg, androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, 0);
        com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("tpl_fetch_model", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, 0);
        com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("tt_sp", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, 0);
        com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("tt_sdk_event_net_ad", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, 0);
        com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("tt_sdk_event_net_state", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, 0);
        com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("tt_sdk_event_net_trail", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, 0);
        com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("tt_sdk_event_db_ad", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, 0);
        com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("tt_sdk_event_db_state", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, 0);
        com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("tt_sdk_event_db_trail", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, 0);
    }

    public static void initAPM() {
        if (com.bytedance.sdk.openadsdk.common.zx.bg()) {
            return;
        }
        try {
            java.lang.String strEqN = com.bytedance.sdk.openadsdk.core.WR.IL().eqN();
            if (android.text.TextUtils.isEmpty(strEqN)) {
                return;
            }
            com.bytedance.sdk.openadsdk.ApmHelper.initApm(com.bytedance.sdk.openadsdk.core.VzQ.bg(), new com.bytedance.sdk.openadsdk.api.init.PAGConfig.Builder().appId(strEqN).build());
        } catch (java.lang.Exception unused) {
        }
    }
}
