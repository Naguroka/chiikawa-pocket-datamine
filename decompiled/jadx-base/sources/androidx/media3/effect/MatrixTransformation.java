package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
public interface MatrixTransformation extends androidx.media3.effect.GlMatrixTransformation {
    android.graphics.Matrix getMatrix(long j);

    @Override // androidx.media3.effect.GlMatrixTransformation
    default float[] getGlMatrixArray(long j) {
        return androidx.media3.effect.MatrixUtils.getGlMatrixArray(getMatrix(j));
    }
}
