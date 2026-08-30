package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
public final class FrameDropEffect implements androidx.media3.effect.GlEffect {
    private final float inputFrameRate;
    private final float targetFrameRate;

    public static androidx.media3.effect.FrameDropEffect createDefaultFrameDropEffect(float f) {
        return new androidx.media3.effect.FrameDropEffect(-3.4028235E38f, f);
    }

    public static androidx.media3.effect.FrameDropEffect createSimpleFrameDropEffect(float f, float f2) {
        return new androidx.media3.effect.FrameDropEffect(f, f2);
    }

    @Override // androidx.media3.effect.GlEffect
    public androidx.media3.effect.GlShaderProgram toGlShaderProgram(android.content.Context context, boolean z) throws androidx.media3.common.VideoFrameProcessingException {
        if (this.inputFrameRate == -3.4028235E38f) {
            return new androidx.media3.effect.DefaultFrameDroppingShaderProgram(context, z, this.targetFrameRate);
        }
        return new androidx.media3.effect.SimpleFrameDroppingShaderProgram(this.inputFrameRate, this.targetFrameRate);
    }

    private FrameDropEffect(float f, float f2) {
        this.inputFrameRate = f;
        this.targetFrameRate = f2;
    }
}
