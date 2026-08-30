package com.bytedance.sdk.openadsdk.core;

/* JADX INFO: loaded from: classes4.dex */
public class tuV {
    public static void bg(android.content.Context context, boolean z, org.json.JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, int i, android.webkit.WebView webView, com.bytedance.sdk.openadsdk.core.widget.ldr ldrVar) {
        int iOptInt = jSONObject.optInt("landingStyle");
        java.lang.String strOptString = jSONObject.optString("url");
        java.lang.String strOptString2 = jSONObject.optString("fallback_url");
        try {
            jSONObject.put("is_activity", z);
        } catch (org.json.JSONException unused) {
        }
        boolean z2 = true;
        com.bytedance.sdk.openadsdk.eqN.bX.bg(tuv, str, 1, jSONObject);
        if (android.text.TextUtils.isEmpty(strOptString)) {
            return;
        }
        if (iOptInt == 0) {
            if (webView != null) {
                webView.loadUrl(strOptString);
                com.bytedance.sdk.openadsdk.eqN.bX.bg(tuv, str, 2, (org.json.JSONObject) null);
            } else {
                com.bytedance.sdk.openadsdk.eqN.bX.bg(tuv, str, -1, (org.json.JSONObject) null);
            }
        } else if (iOptInt == 1 || iOptInt == 8) {
            com.bytedance.sdk.openadsdk.yDt.bg.IL il = new com.bytedance.sdk.openadsdk.yDt.bg.IL();
            il.bg(com.bytedance.sdk.openadsdk.eqN.IL.bg.IL);
            il.bg(tuv);
            il.IL(str);
            il.bg(-1);
            il.bg(false);
            il.IL(tuv.jz());
            com.bytedance.sdk.openadsdk.eqN.bX.bg(il);
            com.bytedance.sdk.openadsdk.utils.Fy.bg(context, strOptString, tuv, com.bytedance.sdk.openadsdk.eqN.IL.bg.IL);
        } else if (iOptInt == 2) {
            if (!com.bytedance.sdk.openadsdk.utils.Fy.IL(context, strOptString, tuv, str)) {
                com.bytedance.sdk.openadsdk.yDt.bg.IL il2 = new com.bytedance.sdk.openadsdk.yDt.bg.IL();
                il2.bg(com.bytedance.sdk.openadsdk.eqN.IL.bg.IL);
                il2.bg(tuv);
                il2.IL(str);
                il2.bg(-1);
                il2.bg(false);
                il2.IL(tuv.jz());
                com.bytedance.sdk.openadsdk.eqN.bX.bg(il2);
                java.util.HashMap map = new java.util.HashMap();
                map.put("deeplink_url", strOptString);
                map.put("fallback_url", strOptString2);
                map.put("jsb_deeplink", 1);
                com.bytedance.sdk.openadsdk.eqN.bX.bg(tuv, str, "open_fallback_url", map);
                com.bytedance.sdk.openadsdk.utils.Fy.bg(context, strOptString2, tuv, com.bytedance.sdk.openadsdk.eqN.IL.bg.IL);
            }
        } else if (iOptInt != 3) {
            z2 = false;
        } else if (com.bytedance.sdk.openadsdk.core.VJ.IL(context, strOptString, tuv, i, str, false)) {
            com.bytedance.sdk.openadsdk.eqN.bX.bg(tuv, str, 3, (org.json.JSONObject) null);
        } else {
            com.bytedance.sdk.openadsdk.eqN.bX.bg(tuv, str, -2, (org.json.JSONObject) null);
        }
        if (ldrVar == null || !z2) {
            return;
        }
        ldrVar.bg();
    }
}
