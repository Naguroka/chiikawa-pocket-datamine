package com.bytedance.sdk.openadsdk.core.VB.ldr;

/* JADX INFO: loaded from: classes4.dex */
public class bg {
    private java.lang.String IL;
    private java.lang.String bX;
    private java.lang.String bg;
    private java.lang.String eqN;
    private java.lang.String zx;

    public java.lang.String bg() {
        return this.bg;
    }

    public com.bytedance.sdk.openadsdk.core.VB.ldr.bg bg(java.lang.String str) {
        this.bg = str;
        return this;
    }

    public java.lang.String IL() {
        return this.IL;
    }

    public com.bytedance.sdk.openadsdk.core.VB.ldr.bg IL(java.lang.String str) {
        this.IL = str;
        return this;
    }

    public java.lang.String bX() {
        return this.bX;
    }

    public com.bytedance.sdk.openadsdk.core.VB.ldr.bg bX(java.lang.String str) {
        this.bX = str;
        return this;
    }

    public java.lang.String eqN() {
        return this.eqN;
    }

    public com.bytedance.sdk.openadsdk.core.VB.ldr.bg eqN(java.lang.String str) {
        this.eqN = str;
        return this;
    }

    public java.lang.String zx() {
        return this.zx;
    }

    public com.bytedance.sdk.openadsdk.core.VB.ldr.bg zx(java.lang.String str) {
        this.zx = str;
        return this;
    }

    public org.json.JSONObject bg(com.bytedance.sdk.openadsdk.core.VB.ldr.bg bgVar) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("id", this.bg);
            jSONObject.put("md5", this.IL);
            jSONObject.put("url", this.bX);
            if (bgVar != null) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("id", bgVar.bg());
                jSONObject2.put("md5", bgVar.IL());
                jSONObject2.put("url", bgVar.bX());
                jSONObject.put("overlay", jSONObject2);
            }
            return jSONObject;
        } catch (org.json.JSONException unused) {
            return null;
        }
    }
}
