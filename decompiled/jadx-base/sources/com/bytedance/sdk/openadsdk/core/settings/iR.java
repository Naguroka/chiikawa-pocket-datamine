package com.bytedance.sdk.openadsdk.core.settings;

/* JADX INFO: loaded from: classes4.dex */
public class iR {
    public java.lang.String bX;
    public boolean eqN;
    public boolean ldr;
    public boolean zx;
    public static final com.bytedance.sdk.openadsdk.core.settings.iR bg = new com.bytedance.sdk.openadsdk.core.settings.iR(null);
    public static java.lang.String IL = "";

    public iR(java.lang.String str) {
        this.bX = "https://sf19-static.i18n-pglstatp.com/obj/ad-pattern-sg/3p_monitor.9db44671.js";
        this.eqN = true;
        this.zx = true;
        this.ldr = true;
        try {
            org.json.JSONObject jSONObjectOptJSONObject = new org.json.JSONObject(str).optJSONObject("performance_js");
            java.lang.String strOptString = jSONObjectOptJSONObject.optString("url", "https://sf19-static.i18n-pglstatp.com/obj/ad-pattern-sg/3p_monitor.9db44671.js");
            if (!android.text.TextUtils.isEmpty(strOptString)) {
                this.bX = strOptString;
            }
            org.json.JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("execute_time");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                arrayList.add(jSONArrayOptJSONArray.optString(i));
            }
            this.eqN = arrayList.contains("load_finish");
            this.ldr = arrayList.contains("load_fail");
            this.zx = arrayList.contains("load");
        } catch (java.lang.Exception unused) {
        }
    }
}
