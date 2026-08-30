package com.bytedance.adsdk.IL;

/* JADX INFO: loaded from: classes3.dex */
class xxp implements android.view.animation.Interpolator {
    private final float[] IL;
    private final float[] bg;

    xxp(android.graphics.Path path) {
        android.graphics.PathMeasure pathMeasure = new android.graphics.PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i = ((int) (length / 0.002f)) + 1;
        this.bg = new float[i];
        this.IL = new float[i];
        float[] fArr = new float[2];
        for (int i2 = 0; i2 < i; i2++) {
            pathMeasure.getPosTan((i2 * length) / (i - 1), fArr, null);
            this.bg[i2] = fArr[0];
            this.IL[i2] = fArr[1];
        }
    }

    xxp(float f, float f2, float f3, float f4) {
        this(bg(f, f2, f3, f4));
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int length = this.bg.length - 1;
        int i = 0;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.bg[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.bg;
        float f2 = fArr[length];
        float f3 = fArr[i];
        float f4 = f2 - f3;
        if (f4 == 0.0f) {
            return this.IL[i];
        }
        float f5 = (f - f3) / f4;
        float[] fArr2 = this.IL;
        float f6 = fArr2[i];
        return f6 + (f5 * (fArr2[length] - f6));
    }

    private static android.graphics.Path bg(float f, float f2, float f3, float f4) {
        android.graphics.Path path = new android.graphics.Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        return path;
    }
}
