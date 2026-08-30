package com.bytedance.sdk.openadsdk.VzQ.bg.bg;

/* JADX INFO: loaded from: classes4.dex */
public class bX {
    public static boolean bg() {
        return com.bytedance.sdk.openadsdk.Fy.bg.bg("deeplink_utils_new", 0) == 1;
    }

    public static boolean bg(android.content.Context context, java.lang.String str, com.bytedance.sdk.openadsdk.core.model.tuV tuv, int i, java.util.Map<java.lang.String, java.lang.Object> map, boolean z) {
        java.lang.String strBg = com.bytedance.sdk.openadsdk.utils.ayS.bg(tuv);
        int i2 = 1;
        com.bytedance.sdk.openadsdk.core.eqN.bg(tuv, strBg, 1, null);
        android.content.Intent intentBg = bg(context, str);
        if (android.text.TextUtils.isEmpty(str) || intentBg == null) {
            com.bytedance.sdk.openadsdk.core.eqN.bg(tuv, strBg, -2, tuv.Dt().eqN());
            return false;
        }
        boolean zKg = com.bytedance.sdk.openadsdk.utils.ayS.Kg(context);
        if (map == null) {
            map = new java.util.HashMap<>();
        }
        if (tuv != null && tuv.OLh() == 0) {
            map.put("auto_click", java.lang.Boolean.valueOf(!tuv.eqN()));
        }
        map.put("can_query_install", java.lang.Integer.valueOf(zKg ? 1 : 0));
        map.put("url", str);
        if (zKg) {
            com.bytedance.sdk.openadsdk.utils.ayS.IL IL = com.bytedance.sdk.openadsdk.utils.ayS.IL(context, intentBg);
            if (IL.IL > 0) {
                try {
                    bg(context, tuv, map);
                    map.put("matched_count", java.lang.Integer.valueOf(IL.IL));
                    if (IL.bg != null) {
                        intentBg.setComponent(IL.bg);
                    }
                } catch (java.lang.Throwable th) {
                    com.bytedance.sdk.component.utils.PX.bg("DeepLinkUtils", th.getMessage());
                }
            } else {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("intent", intentBg.toString());
                    jSONObject.put("can_query_install", 1);
                } catch (java.lang.Exception unused) {
                }
                com.bytedance.sdk.openadsdk.core.eqN.bg(tuv, strBg, -3, jSONObject);
                return false;
            }
        }
        if (com.bytedance.sdk.openadsdk.core.VzQ.eqN().Kg()) {
            com.bytedance.sdk.openadsdk.utils.ayS.bg(tuv, strBg);
        }
        try {
            com.bytedance.sdk.openadsdk.eqN.bX.bg(tuv, strBg, "open_url_app", map);
            context.startActivity(intentBg);
            com.bytedance.sdk.openadsdk.eqN.PX.bg().bg(map).bg(tuv, strBg);
            com.bytedance.sdk.openadsdk.eqN.bX.bg("dp_start_act_success", tuv, strBg, map);
            return true;
        } catch (java.lang.Throwable th2) {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("exception", th2.getMessage());
                jSONObject2.put("intent", intentBg.toString());
                if (!zKg) {
                    i2 = 0;
                }
                jSONObject2.put("can_query_install", i2);
            } catch (java.lang.Exception unused2) {
            }
            com.bytedance.sdk.openadsdk.core.eqN.bg(tuv, strBg, -4, jSONObject2);
            if (zKg && !com.bytedance.sdk.openadsdk.core.VzQ.eqN().Kg()) {
                com.bytedance.sdk.openadsdk.core.VJ.bg(context, tuv.GvG(), tuv, i, strBg, z);
            }
            return false;
        }
    }

    private static android.content.Intent bg(android.content.Context context, java.lang.String str) {
        try {
            android.net.Uri uri = android.net.Uri.parse(str);
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
            intent.setData(uri);
            if (!(context instanceof android.app.Activity)) {
                intent.addFlags(268435456);
            }
            return intent;
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("DeepLinkUtils", th.getMessage());
            return null;
        }
    }

    private static void bg(android.content.Context context, com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.util.Map<java.lang.String, java.lang.Object> map) {
        if (tuv != null && tuv.OLh() == 0) {
            map.put("auto_click", java.lang.Boolean.valueOf(!tuv.eqN()));
        }
        map.put("can_query_install", java.lang.Integer.valueOf(com.bytedance.sdk.openadsdk.utils.ayS.Kg(context) ? 1 : 0));
    }
}
