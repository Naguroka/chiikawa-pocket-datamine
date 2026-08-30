package com.bytedance.adsdk.ugeno.bg;

/* JADX INFO: loaded from: classes3.dex */
public class IL {
    private long IL;
    private org.json.JSONObject Kg;
    private int bX;
    private java.util.Map<java.lang.String, java.util.TreeMap<java.lang.Float, java.lang.String>> bg;
    private java.lang.String eqN;
    private java.lang.String iR;
    private java.lang.String ldr;
    private long zx;

    public org.json.JSONObject bg() {
        return this.Kg;
    }

    public void bg(org.json.JSONObject jSONObject) {
        this.Kg = jSONObject;
    }

    public java.util.Map<java.lang.String, java.util.TreeMap<java.lang.Float, java.lang.String>> IL() {
        return this.bg;
    }

    public void bg(java.util.Map<java.lang.String, java.util.TreeMap<java.lang.Float, java.lang.String>> map) {
        this.bg = map;
    }

    public long bX() {
        return this.IL;
    }

    public void bg(long j) {
        this.IL = j;
    }

    public int eqN() {
        return this.bX;
    }

    public void bg(int i) {
        this.bX = i;
    }

    public java.lang.String zx() {
        return this.eqN;
    }

    public void bg(java.lang.String str) {
        this.eqN = str;
    }

    public long ldr() {
        return this.zx;
    }

    public void IL(long j) {
        this.zx = j;
    }

    public void IL(java.lang.String str) {
        this.ldr = str;
    }

    public java.lang.String iR() {
        return this.iR;
    }

    public void bX(java.lang.String str) {
        this.iR = str;
    }

    public java.lang.String toString() {
        return "AnimationModel{mKeyFramesMap=" + this.bg + ", mDuration=" + this.IL + ", mPlayCount=" + this.bX + ", mPlayDirection=" + this.eqN + ", mDelay=" + this.zx + ", mTransformOrigin='" + this.ldr + "', mTimingFunction='" + this.iR + "'}";
    }
}
