package com.bytedance.sdk.openadsdk.VzQ.bg.bg;

/* JADX INFO: loaded from: classes4.dex */
public class bg extends com.bytedance.sdk.openadsdk.VzQ.bg.bg.eqN {
    public bg(android.content.Context context, com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str) {
        super(context, tuv, str);
    }

    @Override // com.bytedance.sdk.openadsdk.VzQ.bg.bg.eqN, com.bytedance.sdk.openadsdk.VzQ.bg.bg.ldr
    public boolean bg() {
        java.util.HashMap map;
        if (this.bg == null) {
            return false;
        }
        if (this.IL == null || this.IL.OLh() != 0) {
            map = null;
        } else {
            map = new java.util.HashMap();
            map.put("dpl_probability_jump", java.lang.Boolean.valueOf(this.ldr >= 11));
        }
        return bg(this.IL, this.bg.bX(), bX(), this.bX, map);
    }

    public static boolean bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, android.content.Context context, java.lang.String str2, java.util.Map<java.lang.String, java.lang.Object> map) {
        android.content.Intent intentBg;
        if (tuv != null && tuv.FFy() == 0) {
            return false;
        }
        try {
            if (android.text.TextUtils.isEmpty(str) || (intentBg = com.bytedance.sdk.openadsdk.utils.ayS.bg(context, str)) == null) {
                return false;
            }
            intentBg.putExtra("START_ONLY_FOR_ANDROID", true);
            if (!(context instanceof android.app.Activity)) {
                intentBg.addFlags(268435456);
            }
            context.startActivity(intentBg);
            if (map == null) {
                map = new java.util.HashMap<>();
            }
            bg(tuv, map);
            com.bytedance.sdk.openadsdk.eqN.bX.bg(tuv, str2, "click_open", map);
            return true;
        } catch (java.lang.Throwable unused) {
        }
        return false;
    }

    private static void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.util.Map<java.lang.String, java.lang.Object> map) {
        if (map == null) {
            return;
        }
        if (tuv != null && tuv.OLh() == 0) {
            map.put("auto_click", java.lang.Boolean.valueOf((tuv == null || tuv.eqN()) ? false : true));
        }
        map.put("can_query_install", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.VzQ.bg.bg.eqN
    public boolean IL() {
        com.bytedance.sdk.openadsdk.core.eqN.bg(this.IL, this.bX, 1, null);
        if (this.IL.Dt() != null) {
            java.util.HashMap map = new java.util.HashMap();
            if (this.IL != null && this.IL.OLh() == 0) {
                map.put("dpl_probability_jump", java.lang.Boolean.valueOf(this.ldr >= 11));
            }
            if (bg(this.IL.Dt().bg(), bX(), this.bX, this.IL, map)) {
                return true;
            }
            if (!this.eqN || this.zx.get()) {
                this.eqN = true;
                bg(this.IL, map);
                com.bytedance.sdk.openadsdk.eqN.bX.bg(this.IL, this.bX, "open_fallback_url", map);
            }
        } else {
            com.bytedance.sdk.openadsdk.core.eqN.bg(this.IL, this.bX, -1, null);
        }
        return false;
    }

    public static boolean bg(java.lang.String str, android.content.Context context, java.lang.String str2, com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.util.Map<java.lang.String, java.lang.Object> map) {
        android.content.Intent intent = null;
        try {
            if (!android.text.TextUtils.isEmpty(str)) {
                android.net.Uri uri = android.net.Uri.parse(str);
                android.content.Intent intent2 = new android.content.Intent("android.intent.action.VIEW");
                try {
                    intent2.setData(uri);
                    if (!(context instanceof android.app.Activity)) {
                        intent2.addFlags(268435456);
                    }
                    if (map == null) {
                        map = new java.util.HashMap<>();
                    }
                    bg(tuv, map);
                    map.put("url", str);
                    com.bytedance.sdk.openadsdk.eqN.bX.bg(tuv, str2, "open_url_app", map);
                    context.startActivity(intent2);
                    com.bytedance.sdk.openadsdk.eqN.PX.bg().bg(map).bg(tuv, str2);
                    com.bytedance.sdk.openadsdk.eqN.bX.bg("dp_start_act_success", tuv, str2, map);
                    return true;
                } catch (java.lang.Throwable th) {
                    th = th;
                    intent = intent2;
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    try {
                        jSONObject.put("exception", th.getMessage());
                        if (intent != null) {
                            jSONObject.put("intent", intent.toString());
                        }
                        jSONObject.put("can_query_install", 0);
                    } catch (java.lang.Exception unused) {
                    }
                    com.bytedance.sdk.openadsdk.core.eqN.bg(tuv, str2, -4, jSONObject);
                    return false;
                }
            }
            com.bytedance.sdk.openadsdk.core.eqN.bg(tuv, str2, -2, null);
            return false;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }
}
