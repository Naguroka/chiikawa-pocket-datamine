package com.google.android.material.shape;

/* JADX INFO: loaded from: classes5.dex */
public class EdgeTreatment {
    boolean forceIntersection() {
        return false;
    }

    @java.lang.Deprecated
    public void getEdgePath(float f, float f2, com.google.android.material.shape.ShapePath shapePath) {
        getEdgePath(f, f / 2.0f, f2, shapePath);
    }

    public void getEdgePath(float f, float f2, float f3, com.google.android.material.shape.ShapePath shapePath) {
        shapePath.lineTo(f, 0.0f);
    }
}
