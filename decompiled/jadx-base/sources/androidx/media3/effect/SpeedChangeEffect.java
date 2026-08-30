package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
public final class SpeedChangeEffect implements androidx.media3.effect.GlEffect {
    private final androidx.media3.common.audio.SpeedProvider speedProvider;

    public SpeedChangeEffect(final float f) {
        androidx.media3.common.util.Assertions.checkArgument(f > 0.0f);
        this.speedProvider = new androidx.media3.common.audio.SpeedProvider() { // from class: androidx.media3.effect.SpeedChangeEffect.1
            @Override // androidx.media3.common.audio.SpeedProvider
            public long getNextSpeedChangeTimeUs(long j) {
                return androidx.media3.common.C.TIME_UNSET;
            }

            @Override // androidx.media3.common.audio.SpeedProvider
            public float getSpeed(long j) {
                return f;
            }
        };
    }

    public SpeedChangeEffect(androidx.media3.common.audio.SpeedProvider speedProvider) {
        this.speedProvider = speedProvider;
    }

    @Override // androidx.media3.effect.GlEffect
    public androidx.media3.effect.GlShaderProgram toGlShaderProgram(android.content.Context context, boolean z) {
        return new androidx.media3.effect.SpeedChangeShaderProgram(this.speedProvider);
    }

    @Override // androidx.media3.effect.GlEffect
    public boolean isNoOp(int i, int i2) {
        return this.speedProvider.getSpeed(0L) == 1.0f && this.speedProvider.getNextSpeedChangeTimeUs(0L) == androidx.media3.common.C.TIME_UNSET;
    }

    @Override // androidx.media3.common.Effect
    public long getDurationAfterEffectApplied(long j) {
        return androidx.media3.common.util.SpeedProviderUtil.getDurationAfterSpeedProviderApplied(this.speedProvider, j);
    }
}
