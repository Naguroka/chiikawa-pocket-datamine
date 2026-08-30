package com.google.android.material.animation;

/* JADX INFO: loaded from: classes5.dex */
public class MatrixEvaluator implements android.animation.TypeEvaluator<android.graphics.Matrix> {
    private final float[] tempStartValues = new float[9];
    private final float[] tempEndValues = new float[9];
    private final android.graphics.Matrix tempMatrix = new android.graphics.Matrix();

    @Override // android.animation.TypeEvaluator
    public android.graphics.Matrix evaluate(float f, android.graphics.Matrix matrix, android.graphics.Matrix matrix2) {
        matrix.getValues(this.tempStartValues);
        matrix2.getValues(this.tempEndValues);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.tempEndValues;
            float f2 = fArr[i];
            float f3 = this.tempStartValues[i];
            fArr[i] = f3 + ((f2 - f3) * f);
        }
        this.tempMatrix.setValues(this.tempEndValues);
        return this.tempMatrix;
    }
}
