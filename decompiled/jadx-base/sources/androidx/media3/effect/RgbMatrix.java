package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
public interface RgbMatrix extends androidx.media3.effect.GlEffect {
    float[] getMatrix(long j, boolean z);

    @Override // androidx.media3.effect.GlEffect
    default androidx.media3.effect.BaseGlShaderProgram toGlShaderProgram(android.content.Context context, boolean z) throws androidx.media3.common.VideoFrameProcessingException {
        return androidx.media3.effect.DefaultShaderProgram.create(context, com.google.common.collect.ImmutableList.of(), com.google.common.collect.ImmutableList.of(this), z);
    }
}
