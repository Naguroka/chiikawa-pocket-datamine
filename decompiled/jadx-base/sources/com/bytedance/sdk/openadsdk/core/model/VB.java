package com.bytedance.sdk.openadsdk.core.model;

/* JADX INFO: loaded from: classes4.dex */
public class VB {
    private java.lang.String IL;
    private int bX;
    private java.lang.String bg;

    public java.lang.String bg() {
        return this.bg;
    }

    public void bg(java.lang.String str) {
        this.bg = str;
    }

    public java.lang.String IL() {
        return this.IL;
    }

    public void IL(java.lang.String str) {
        this.IL = str;
    }

    public int bX() {
        return this.bX;
    }

    public void bg(int i) {
        this.bX = i;
    }

    public org.json.JSONObject eqN() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("u", this.bg);
            jSONObject.put("ft", this.bX);
            jSONObject.put("fu", this.IL);
            return jSONObject;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
