package com.bytedance.adsdk.IL.iR;

/* JADX INFO: loaded from: classes3.dex */
public class bX {
    private float IL;
    private float bg;

    public bX(float f, float f2) {
        this.bg = f;
        this.IL = f2;
    }

    public bX() {
        this(1.0f, 1.0f);
    }

    public float bg() {
        return this.bg;
    }

    public float IL() {
        return this.IL;
    }

    public void bg(float f, float f2) {
        this.bg = f;
        this.IL = f2;
    }

    public boolean IL(float f, float f2) {
        return this.bg == f && this.IL == f2;
    }

    public java.lang.String toString() {
        return bg() + "x" + IL();
    }
}
