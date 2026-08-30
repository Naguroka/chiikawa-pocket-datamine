package com.bytedance.sdk.openadsdk.VB.bg;

/* JADX INFO: loaded from: classes4.dex */
public class eqN extends com.bytedance.sdk.component.bg.zx<org.json.JSONObject, org.json.JSONObject> {
    private org.json.JSONObject bg;

    public eqN(org.json.JSONObject jSONObject) {
        this.bg = jSONObject;
    }

    public static void bg(com.bytedance.sdk.component.bg.VzQ vzQ, org.json.JSONObject jSONObject) {
        vzQ.bg("getData", new com.bytedance.sdk.openadsdk.VB.bg.eqN(jSONObject));
    }

    @Override // com.bytedance.sdk.component.bg.zx
    public org.json.JSONObject bg(org.json.JSONObject jSONObject, com.bytedance.sdk.component.bg.ldr ldrVar) throws java.lang.Exception {
        return com.bytedance.sdk.openadsdk.core.Kg.bg.IL.bg(this.bg, jSONObject);
    }
}
