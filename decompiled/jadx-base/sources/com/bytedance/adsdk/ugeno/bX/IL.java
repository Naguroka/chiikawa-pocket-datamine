package com.bytedance.adsdk.ugeno.bX;

/* JADX INFO: loaded from: classes3.dex */
public class IL {
    public static java.lang.String bg(java.lang.String str, org.json.JSONObject jSONObject) {
        com.bytedance.adsdk.ugeno.bX.bg bgVarBX;
        com.bytedance.adsdk.ugeno.bX.bg.InterfaceC0085bg interfaceC0085bgBg;
        if (!android.text.TextUtils.isEmpty(str) && jSONObject != null) {
            try {
                return (!str.startsWith("${") || !str.endsWith("}") || (bgVarBX = com.bytedance.adsdk.ugeno.eqN.bg().bX()) == null || (interfaceC0085bgBg = bgVarBX.bg(str.substring(2, str.length() + (-1)))) == null) ? str : (java.lang.String) interfaceC0085bgBg.bg(jSONObject);
            } catch (java.lang.Throwable unused) {
            }
        }
        return str;
    }
}
