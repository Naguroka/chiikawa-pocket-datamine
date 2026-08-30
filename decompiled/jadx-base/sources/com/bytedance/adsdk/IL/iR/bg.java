package com.bytedance.adsdk.IL.iR;

/* JADX INFO: loaded from: classes3.dex */
public class bg<T> {
    public T IL;
    public android.graphics.PointF Kg;
    private float Lq;
    private float PX;
    private int Ta;
    private float VB;
    public android.graphics.PointF WR;
    public final android.view.animation.Interpolator bX;
    public final T bg;
    private final com.bytedance.adsdk.IL.iR eo;
    public final android.view.animation.Interpolator eqN;
    public java.lang.Float iR;
    public final float ldr;
    private float vb;
    private int yDt;
    public final android.view.animation.Interpolator zx;

    public bg(com.bytedance.adsdk.IL.iR iRVar, T t, T t2, android.view.animation.Interpolator interpolator, float f, java.lang.Float f2) {
        this.VB = -3987645.8f;
        this.PX = -3987645.8f;
        this.Ta = 784923401;
        this.yDt = 784923401;
        this.Lq = Float.MIN_VALUE;
        this.vb = Float.MIN_VALUE;
        this.Kg = null;
        this.WR = null;
        this.eo = iRVar;
        this.bg = t;
        this.IL = t2;
        this.bX = interpolator;
        this.eqN = null;
        this.zx = null;
        this.ldr = f;
        this.iR = f2;
    }

    public bg(com.bytedance.adsdk.IL.iR iRVar, T t, T t2, android.view.animation.Interpolator interpolator, android.view.animation.Interpolator interpolator2, float f, java.lang.Float f2) {
        this.VB = -3987645.8f;
        this.PX = -3987645.8f;
        this.Ta = 784923401;
        this.yDt = 784923401;
        this.Lq = Float.MIN_VALUE;
        this.vb = Float.MIN_VALUE;
        this.Kg = null;
        this.WR = null;
        this.eo = iRVar;
        this.bg = t;
        this.IL = t2;
        this.bX = null;
        this.eqN = interpolator;
        this.zx = interpolator2;
        this.ldr = f;
        this.iR = f2;
    }

    protected bg(com.bytedance.adsdk.IL.iR iRVar, T t, T t2, android.view.animation.Interpolator interpolator, android.view.animation.Interpolator interpolator2, android.view.animation.Interpolator interpolator3, float f, java.lang.Float f2) {
        this.VB = -3987645.8f;
        this.PX = -3987645.8f;
        this.Ta = 784923401;
        this.yDt = 784923401;
        this.Lq = Float.MIN_VALUE;
        this.vb = Float.MIN_VALUE;
        this.Kg = null;
        this.WR = null;
        this.eo = iRVar;
        this.bg = t;
        this.IL = t2;
        this.bX = interpolator;
        this.eqN = interpolator2;
        this.zx = interpolator3;
        this.ldr = f;
        this.iR = f2;
    }

    public bg(T t) {
        this.VB = -3987645.8f;
        this.PX = -3987645.8f;
        this.Ta = 784923401;
        this.yDt = 784923401;
        this.Lq = Float.MIN_VALUE;
        this.vb = Float.MIN_VALUE;
        this.Kg = null;
        this.WR = null;
        this.eo = null;
        this.bg = t;
        this.IL = t;
        this.bX = null;
        this.eqN = null;
        this.zx = null;
        this.ldr = Float.MIN_VALUE;
        this.iR = java.lang.Float.valueOf(Float.MAX_VALUE);
    }

    private bg(T t, T t2) {
        this.VB = -3987645.8f;
        this.PX = -3987645.8f;
        this.Ta = 784923401;
        this.yDt = 784923401;
        this.Lq = Float.MIN_VALUE;
        this.vb = Float.MIN_VALUE;
        this.Kg = null;
        this.WR = null;
        this.eo = null;
        this.bg = t;
        this.IL = t2;
        this.bX = null;
        this.eqN = null;
        this.zx = null;
        this.ldr = Float.MIN_VALUE;
        this.iR = java.lang.Float.valueOf(Float.MAX_VALUE);
    }

    public com.bytedance.adsdk.IL.iR.bg<T> bg(T t, T t2) {
        return new com.bytedance.adsdk.IL.iR.bg<>(t, t2);
    }

    public float bX() {
        com.bytedance.adsdk.IL.iR iRVar = this.eo;
        if (iRVar == null) {
            return 0.0f;
        }
        if (this.Lq == Float.MIN_VALUE) {
            this.Lq = (this.ldr - iRVar.ldr()) / this.eo.xxp();
        }
        return this.Lq;
    }

    public float eqN() {
        if (this.eo == null) {
            return 1.0f;
        }
        if (this.vb == Float.MIN_VALUE) {
            if (this.iR == null) {
                this.vb = 1.0f;
            } else {
                this.vb = bX() + ((this.iR.floatValue() - this.ldr) / this.eo.xxp());
            }
        }
        return this.vb;
    }

    public boolean zx() {
        return this.bX == null && this.eqN == null && this.zx == null;
    }

    public boolean bg(float f) {
        return f >= bX() && f < eqN();
    }

    public float ldr() {
        if (this.VB == -3987645.8f) {
            this.VB = ((java.lang.Float) this.bg).floatValue();
        }
        return this.VB;
    }

    public float iR() {
        if (this.PX == -3987645.8f) {
            this.PX = ((java.lang.Float) this.IL).floatValue();
        }
        return this.PX;
    }

    public int Kg() {
        if (this.Ta == 784923401) {
            this.Ta = ((java.lang.Integer) this.bg).intValue();
        }
        return this.Ta;
    }

    public int WR() {
        if (this.yDt == 784923401) {
            this.yDt = ((java.lang.Integer) this.IL).intValue();
        }
        return this.yDt;
    }

    public java.lang.String toString() {
        return "Keyframe{startValue=" + this.bg + ", endValue=" + this.IL + ", startFrame=" + this.ldr + ", endFrame=" + this.iR + ", interpolator=" + this.bX + '}';
    }
}
