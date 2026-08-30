package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
public interface GlMatrixTransformation extends androidx.media3.effect.GlEffect {
    float[] getGlMatrixArray(long j);

    default androidx.media3.common.util.Size configure(int i, int i2) {
        return new androidx.media3.common.util.Size(i, i2);
    }

    @Override // androidx.media3.effect.GlEffect
    default androidx.media3.effect.BaseGlShaderProgram toGlShaderProgram(android.content.Context context, boolean z) throws androidx.media3.common.VideoFrameProcessingException {
        return androidx.media3.effect.DefaultShaderProgram.create(context, com.google.common.collect.ImmutableList.of(this), com.google.common.collect.ImmutableList.of(), z);
    }
}
