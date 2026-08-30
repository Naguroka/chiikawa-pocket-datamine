package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: loaded from: classes.dex */
public class VelocityMatrix {
    private static java.lang.String TAG = "VelocityMatrix";
    float mDRotate;
    float mDScaleX;
    float mDScaleY;
    float mDTranslateX;
    float mDTranslateY;
    float mRotate;

    public void clear() {
        this.mDRotate = 0.0f;
        this.mDTranslateY = 0.0f;
        this.mDTranslateX = 0.0f;
        this.mDScaleY = 0.0f;
        this.mDScaleX = 0.0f;
    }

    public void setRotationVelocity(androidx.constraintlayout.core.motion.utils.SplineSet splineSet, float f) {
        if (splineSet != null) {
            this.mDRotate = splineSet.getSlope(f);
            this.mRotate = splineSet.get(f);
        }
    }

    public void setTranslationVelocity(androidx.constraintlayout.core.motion.utils.SplineSet splineSet, androidx.constraintlayout.core.motion.utils.SplineSet splineSet2, float f) {
        if (splineSet != null) {
            this.mDTranslateX = splineSet.getSlope(f);
        }
        if (splineSet2 != null) {
            this.mDTranslateY = splineSet2.getSlope(f);
        }
    }

    public void setScaleVelocity(androidx.constraintlayout.core.motion.utils.SplineSet splineSet, androidx.constraintlayout.core.motion.utils.SplineSet splineSet2, float f) {
        if (splineSet != null) {
            this.mDScaleX = splineSet.getSlope(f);
        }
        if (splineSet2 != null) {
            this.mDScaleY = splineSet2.getSlope(f);
        }
    }

    public void setRotationVelocity(androidx.constraintlayout.core.motion.utils.KeyCycleOscillator keyCycleOscillator, float f) {
        if (keyCycleOscillator != null) {
            this.mDRotate = keyCycleOscillator.getSlope(f);
        }
    }

    public void setTranslationVelocity(androidx.constraintlayout.core.motion.utils.KeyCycleOscillator keyCycleOscillator, androidx.constraintlayout.core.motion.utils.KeyCycleOscillator keyCycleOscillator2, float f) {
        if (keyCycleOscillator != null) {
            this.mDTranslateX = keyCycleOscillator.getSlope(f);
        }
        if (keyCycleOscillator2 != null) {
            this.mDTranslateY = keyCycleOscillator2.getSlope(f);
        }
    }

    public void setScaleVelocity(androidx.constraintlayout.core.motion.utils.KeyCycleOscillator keyCycleOscillator, androidx.constraintlayout.core.motion.utils.KeyCycleOscillator keyCycleOscillator2, float f) {
        if (keyCycleOscillator != null) {
            this.mDScaleX = keyCycleOscillator.getSlope(f);
        }
        if (keyCycleOscillator2 != null) {
            this.mDScaleY = keyCycleOscillator2.getSlope(f);
        }
    }

    public void applyTransform(float f, float f2, int i, int i2, float[] fArr) {
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = (f - 0.5f) * 2.0f;
        float f6 = (f2 - 0.5f) * 2.0f;
        float f7 = f3 + this.mDTranslateX;
        float f8 = f4 + this.mDTranslateY;
        float f9 = f7 + (this.mDScaleX * f5);
        float f10 = f8 + (this.mDScaleY * f6);
        float radians = (float) java.lang.Math.toRadians(this.mRotate);
        float radians2 = (float) java.lang.Math.toRadians(this.mDRotate);
        double d = radians;
        double d2 = i2 * f6;
        float fSin = f9 + (((float) ((((double) ((-i) * f5)) * java.lang.Math.sin(d)) - (java.lang.Math.cos(d) * d2))) * radians2);
        float fCos = f10 + (radians2 * ((float) ((((double) (i * f5)) * java.lang.Math.cos(d)) - (d2 * java.lang.Math.sin(d)))));
        fArr[0] = fSin;
        fArr[1] = fCos;
    }
}
