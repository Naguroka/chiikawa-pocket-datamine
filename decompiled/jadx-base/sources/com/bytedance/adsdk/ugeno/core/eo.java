package com.bytedance.adsdk.ugeno.core;

/* JADX INFO: loaded from: classes3.dex */
public class eo {
    private int IL;
    private org.json.JSONObject bX;
    private com.bytedance.adsdk.ugeno.IL.bX bg;
    private com.bytedance.adsdk.ugeno.core.eo eqN;
    private com.bytedance.adsdk.ugeno.core.eo zx;

    public com.bytedance.adsdk.ugeno.IL.bX bg() {
        return this.bg;
    }

    public void bg(com.bytedance.adsdk.ugeno.IL.bX bXVar) {
        this.bg = bXVar;
    }

    public int IL() {
        return this.IL;
    }

    public void bg(int i) {
        this.IL = i;
    }

    public org.json.JSONObject bX() {
        return this.bX;
    }

    public void bg(org.json.JSONObject jSONObject) {
        this.bX = jSONObject;
    }

    public com.bytedance.adsdk.ugeno.core.eo eqN() {
        return this.eqN;
    }

    public void bg(com.bytedance.adsdk.ugeno.core.eo eoVar) {
        this.eqN = eoVar;
    }

    public void IL(com.bytedance.adsdk.ugeno.core.eo eoVar) {
        this.zx = eoVar;
    }

    public java.lang.String toString() {
        return "UGenEvent{mWidget=" + this.bg + ", mEventType=" + this.IL + ", mEvent=" + this.bX + '}';
    }
}
