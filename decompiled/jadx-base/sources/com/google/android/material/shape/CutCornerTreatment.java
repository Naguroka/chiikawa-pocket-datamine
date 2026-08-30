package com.google.android.material.shape;

/* JADX INFO: loaded from: classes5.dex */
public class CutCornerTreatment extends com.google.android.material.shape.CornerTreatment {
    float size;

    public CutCornerTreatment() {
        this.size = -1.0f;
    }

    @java.lang.Deprecated
    public CutCornerTreatment(float f) {
        this.size = f;
    }

    @Override // com.google.android.material.shape.CornerTreatment
    public void getCornerPath(com.google.android.material.shape.ShapePath shapePath, float f, float f2, float f3) {
        shapePath.reset(0.0f, f3 * f2, 180.0f, 180.0f - f);
        double d = f3;
        double d2 = f2;
        shapePath.lineTo((float) (java.lang.Math.sin(java.lang.Math.toRadians(f)) * d * d2), (float) (java.lang.Math.sin(java.lang.Math.toRadians(90.0f - f)) * d * d2));
    }
}
