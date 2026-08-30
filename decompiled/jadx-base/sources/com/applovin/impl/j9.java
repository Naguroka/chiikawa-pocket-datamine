package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class j9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f918a = new float[16];
    private final float[] b = new float[16];
    private final com.applovin.impl.eo c = new com.applovin.impl.eo();
    private boolean d;

    public static void a(float[] fArr, float[] fArr2) {
        android.opengl.Matrix.setIdentityM(fArr, 0);
        float f = fArr2[10];
        float f2 = fArr2[8];
        float fSqrt = (float) java.lang.Math.sqrt((f * f) + (f2 * f2));
        float f3 = fArr2[10] / fSqrt;
        fArr[0] = f3;
        float f4 = fArr2[8];
        fArr[2] = f4 / fSqrt;
        fArr[8] = (-f4) / fSqrt;
        fArr[10] = f3;
    }

    private static void b(float[] fArr, float[] fArr2) {
        float f = fArr2[0];
        float f2 = -fArr2[1];
        float f3 = -fArr2[2];
        float length = android.opengl.Matrix.length(f, f2, f3);
        if (length != 0.0f) {
            android.opengl.Matrix.setRotateM(fArr, 0, (float) java.lang.Math.toDegrees(length), f / length, f2 / length, f3 / length);
        } else {
            android.opengl.Matrix.setIdentityM(fArr, 0);
        }
    }

    public boolean a(float[] fArr, long j) {
        float[] fArr2 = (float[]) this.c.c(j);
        if (fArr2 == null) {
            return false;
        }
        b(this.b, fArr2);
        if (!this.d) {
            a(this.f918a, this.b);
            this.d = true;
        }
        android.opengl.Matrix.multiplyMM(fArr, 0, this.f918a, 0, this.b, 0);
        return true;
    }

    public void a() {
        this.c.a();
        this.d = false;
    }

    public void a(long j, float[] fArr) {
        this.c.a(j, fArr);
    }
}
