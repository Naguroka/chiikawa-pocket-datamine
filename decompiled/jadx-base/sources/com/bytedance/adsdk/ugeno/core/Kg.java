package com.bytedance.adsdk.ugeno.core;

/* JADX INFO: loaded from: classes3.dex */
public class Kg {
    private org.json.JSONObject IL;
    private org.json.JSONObject bX;
    private android.content.Context bg;
    private java.util.Map<java.lang.String, java.lang.Object> eqN;

    public void bg(android.content.Context context) {
        this.bg = context;
    }

    public void bg(org.json.JSONObject jSONObject) {
        this.IL = jSONObject;
    }

    public org.json.JSONObject bg() {
        return this.bX;
    }

    public void IL(org.json.JSONObject jSONObject) {
        this.bX = jSONObject;
    }

    public java.util.Map<java.lang.String, java.lang.Object> IL() {
        return this.eqN;
    }

    public void bg(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.eqN = map;
    }
}
