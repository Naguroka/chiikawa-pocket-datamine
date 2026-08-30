package com.bytedance.sdk.openadsdk.core.iR;

/* JADX INFO: loaded from: classes4.dex */
public class bX {
    public static void bg(java.lang.String str, long j) {
        org.json.JSONObject jSONObjectIL = IL(str, j);
        com.bytedance.sdk.component.iR.IL.eqN eqnIL = com.bytedance.sdk.openadsdk.xxp.bX.bg().IL().IL();
        eqnIL.IL(com.bytedance.sdk.openadsdk.utils.ayS.eqN("/api/ad/union/sdk/stats/"));
        eqnIL.eqN(jSONObjectIL.toString());
        eqnIL.bg(6);
        eqnIL.bg("uploadFrequentEvent");
        eqnIL.bg(new com.bytedance.sdk.component.iR.bg.bg() { // from class: com.bytedance.sdk.openadsdk.core.iR.bX.1
            @Override // com.bytedance.sdk.component.iR.bg.bg
            public void bg(com.bytedance.sdk.component.iR.IL.bX bXVar, com.bytedance.sdk.component.iR.IL il) {
            }

            @Override // com.bytedance.sdk.component.iR.bg.bg
            public void bg(com.bytedance.sdk.component.iR.IL.bX bXVar, java.io.IOException iOException) {
                iOException.getMessage();
            }
        });
    }

    private static org.json.JSONObject IL(java.lang.String str, long j) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("type", "over_freq");
            jSONObject.put("rit", str);
            jSONObject.put("ad_sdk_version", com.bytedance.sdk.openadsdk.BuildConfig.VERSION_NAME);
            jSONObject.put(com.ironsource.aa.a.d, j);
        } catch (org.json.JSONException unused) {
        }
        return jSONObject;
    }
}
