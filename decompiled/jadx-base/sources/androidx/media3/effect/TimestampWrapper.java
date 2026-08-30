package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
public final class TimestampWrapper implements androidx.media3.effect.GlEffect {
    public final long endTimeUs;
    public final androidx.media3.effect.GlEffect glEffect;
    public final long startTimeUs;

    public TimestampWrapper(androidx.media3.effect.GlEffect glEffect, long j, long j2) {
        androidx.media3.common.util.Assertions.checkArgument(j >= 0 && j2 >= 0, "startTimeUs and endTimeUs must be non-negative.");
        androidx.media3.common.util.Assertions.checkArgument(j2 > j, "endTimeUs should be after startTimeUs.");
        this.glEffect = glEffect;
        this.startTimeUs = j;
        this.endTimeUs = j2;
    }

    @Override // androidx.media3.effect.GlEffect
    public androidx.media3.effect.GlShaderProgram toGlShaderProgram(android.content.Context context, boolean z) throws androidx.media3.common.VideoFrameProcessingException {
        return new androidx.media3.effect.TimestampWrapperShaderProgram(context, z, this);
    }

    @Override // androidx.media3.effect.GlEffect
    public boolean isNoOp(int i, int i2) {
        return this.glEffect.isNoOp(i, i2);
    }
}
