package com.bytedance.adsdk.IL.bX;

/* JADX INFO: loaded from: classes3.dex */
public class IL {
    public java.lang.String IL;
    public int Kg;
    public android.graphics.PointF PX;
    public android.graphics.PointF Ta;
    public boolean VB;
    public int WR;
    public float bX;
    public java.lang.String bg;
    public float eo;
    public com.bytedance.adsdk.IL.bX.IL.bg eqN;
    public float iR;
    public float ldr;
    public int zx;

    public enum bg {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public IL(java.lang.String str, java.lang.String str2, float f, com.bytedance.adsdk.IL.bX.IL.bg bgVar, int i, float f2, float f3, int i2, int i3, float f4, boolean z, android.graphics.PointF pointF, android.graphics.PointF pointF2) {
        bg(str, str2, f, bgVar, i, f2, f3, i2, i3, f4, z, pointF, pointF2);
    }

    public IL() {
    }

    public void bg(java.lang.String str, java.lang.String str2, float f, com.bytedance.adsdk.IL.bX.IL.bg bgVar, int i, float f2, float f3, int i2, int i3, float f4, boolean z, android.graphics.PointF pointF, android.graphics.PointF pointF2) {
        this.bg = str;
        this.IL = str2;
        this.bX = f;
        this.eqN = bgVar;
        this.zx = i;
        this.ldr = f2;
        this.iR = f3;
        this.Kg = i2;
        this.WR = i3;
        this.eo = f4;
        this.VB = z;
        this.PX = pointF;
        this.Ta = pointF2;
    }

    public int hashCode() {
        int iHashCode = (((((int) ((((this.bg.hashCode() * 31) + this.IL.hashCode()) * 31) + this.bX)) * 31) + this.eqN.ordinal()) * 31) + this.zx;
        long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(this.ldr);
        return (((iHashCode * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.Kg;
    }
}
