package com.bytedance.sdk.openadsdk.core.model;

/* JADX INFO: loaded from: classes4.dex */
public class bX {
    private int iR;
    private java.lang.String bg = "";
    private java.lang.String IL = "";
    private java.lang.String bX = "";
    private java.lang.String eqN = "";
    private double zx = -1.0d;
    private int ldr = -1;

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

    public java.lang.String bX() {
        return this.bX;
    }

    public void bX(java.lang.String str) {
        this.bX = str;
    }

    public double eqN() {
        return this.zx;
    }

    public void bg(double d) {
        if (d < 1.0d || d > 5.0d) {
            this.zx = -1.0d;
        } else {
            this.zx = d;
        }
    }

    public int zx() {
        return this.ldr;
    }

    public void bg(int i) {
        if (i <= 0) {
            this.ldr = -1;
        } else {
            this.ldr = i;
        }
    }

    public int ldr() {
        return this.iR;
    }

    public void IL(int i) {
        this.iR = i;
    }

    public java.lang.String iR() {
        return this.eqN;
    }

    public void eqN(java.lang.String str) {
        this.eqN = str;
    }

    public org.json.JSONObject Kg() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("app_name", IL());
            jSONObject.put("app_size", ldr());
            jSONObject.put("comment_num", zx());
            jSONObject.put("download_url", bg());
            jSONObject.put(com.ironsource.y8.h.V, bX());
            jSONObject.put(com.google.firebase.analytics.FirebaseAnalytics.Param.SCORE, eqN());
            jSONObject.put("app_category", iR());
        } catch (java.lang.Exception e) {
            com.bytedance.sdk.component.utils.PX.IL(e.toString());
        }
        return jSONObject;
    }
}
