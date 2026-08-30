package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class wg implements android.hardware.SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f1467a = new float[16];
    private final float[] b = new float[16];
    private final float[] c = new float[16];
    private final float[] d = new float[3];
    private final android.view.Display f;
    private final com.applovin.impl.wg.a[] g;
    private boolean h;

    public interface a {
        void a(float[] fArr, float f);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i) {
    }

    public wg(android.view.Display display, com.applovin.impl.wg.a... aVarArr) {
        this.f = display;
        this.g = aVarArr;
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        android.hardware.SensorManager.getRotationMatrixFromVector(this.f1467a, sensorEvent.values);
        a(this.f1467a, this.f.getRotation());
        float fA = a(this.f1467a);
        c(this.f1467a);
        b(this.f1467a);
        a(this.f1467a, fA);
    }

    private void b(float[] fArr) {
        if (!this.h) {
            com.applovin.impl.j9.a(this.c, fArr);
            this.h = true;
        }
        float[] fArr2 = this.b;
        java.lang.System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        android.opengl.Matrix.multiplyMM(fArr, 0, this.b, 0, this.c, 0);
    }

    private float a(float[] fArr) {
        android.hardware.SensorManager.remapCoordinateSystem(fArr, 1, org.objectweb.asm.Opcodes.LXOR, this.b);
        android.hardware.SensorManager.getOrientation(this.b, this.d);
        return this.d[2];
    }

    private static void c(float[] fArr) {
        android.opengl.Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
    }

    private void a(float[] fArr, float f) {
        for (com.applovin.impl.wg.a aVar : this.g) {
            aVar.a(fArr, f);
        }
    }

    private void a(float[] fArr, int i) {
        if (i != 0) {
            int i2 = 129;
            int i3 = 1;
            if (i == 1) {
                i3 = 129;
                i2 = 2;
            } else if (i == 2) {
                i3 = 130;
            } else {
                if (i != 3) {
                    throw new java.lang.IllegalStateException();
                }
                i2 = 130;
            }
            float[] fArr2 = this.b;
            java.lang.System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            android.hardware.SensorManager.remapCoordinateSystem(this.b, i2, i3, fArr);
        }
    }
}
