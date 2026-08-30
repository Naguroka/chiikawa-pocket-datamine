package com.google.android.material.shape;

/* JADX INFO: loaded from: classes5.dex */
public class CornerTreatment {
    @java.lang.Deprecated
    public void getCornerPath(float f, float f2, com.google.android.material.shape.ShapePath shapePath) {
    }

    public void getCornerPath(com.google.android.material.shape.ShapePath shapePath, float f, float f2, float f3) {
        getCornerPath(f, f2, shapePath);
    }

    public void getCornerPath(com.google.android.material.shape.ShapePath shapePath, float f, float f2, android.graphics.RectF rectF, com.google.android.material.shape.CornerSize cornerSize) {
        getCornerPath(shapePath, f, f2, cornerSize.getCornerSize(rectF));
    }
}
