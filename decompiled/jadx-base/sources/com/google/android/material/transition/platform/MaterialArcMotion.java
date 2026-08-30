package com.google.android.material.transition.platform;

/* JADX INFO: loaded from: classes5.dex */
public final class MaterialArcMotion extends android.transition.PathMotion {
    @Override // android.transition.PathMotion
    public android.graphics.Path getPath(float f, float f2, float f3, float f4) {
        android.graphics.Path path = new android.graphics.Path();
        path.moveTo(f, f2);
        android.graphics.PointF controlPoint = getControlPoint(f, f2, f3, f4);
        path.quadTo(controlPoint.x, controlPoint.y, f3, f4);
        return path;
    }

    private static android.graphics.PointF getControlPoint(float f, float f2, float f3, float f4) {
        if (f2 > f4) {
            return new android.graphics.PointF(f3, f2);
        }
        return new android.graphics.PointF(f, f4);
    }
}
