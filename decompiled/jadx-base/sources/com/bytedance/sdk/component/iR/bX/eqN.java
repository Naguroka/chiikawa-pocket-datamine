package com.bytedance.sdk.component.iR.bX;

/* JADX INFO: loaded from: classes3.dex */
public class eqN {
    public boolean bg = false;
    public boolean IL = true;
    public java.util.Map<java.lang.String, java.lang.Integer> bX = null;
    public java.util.Map<java.lang.String, java.lang.String> eqN = null;
    public int zx = 10;
    public int ldr = 1;
    public int iR = 1;
    public int Kg = 10;
    public int WR = 1;
    public int eo = 1;
    public int VB = 900;
    public int PX = 120;
    public java.lang.String Ta = null;
    public int yDt = 0;
    public long Lq = 0;

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(" localEnable: ");
        sb.append(this.bg);
        sb.append(" probeEnable: ").append(this.IL);
        java.lang.StringBuilder sbAppend = sb.append(" hostFilter: ");
        java.util.Map<java.lang.String, java.lang.Integer> map = this.bX;
        sbAppend.append(map != null ? map.size() : 0);
        java.lang.StringBuilder sbAppend2 = sb.append(" hostMap: ");
        java.util.Map<java.lang.String, java.lang.String> map2 = this.eqN;
        sbAppend2.append(map2 != null ? map2.size() : 0);
        sb.append(" reqTo: ").append(this.zx).append("#").append(this.ldr).append("#").append(this.iR);
        sb.append(" reqErr: ").append(this.Kg).append("#").append(this.WR).append("#").append(this.eo);
        sb.append(" updateInterval: ").append(this.VB);
        sb.append(" updateRandom: ").append(this.PX);
        sb.append(" httpBlack: ").append(this.Ta);
        return sb.toString();
    }
}
