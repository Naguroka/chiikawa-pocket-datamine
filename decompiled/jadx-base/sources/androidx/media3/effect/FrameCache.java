package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
public final class FrameCache implements androidx.media3.effect.GlEffect {
    public final int capacity;

    public FrameCache(int i) {
        androidx.media3.common.util.Assertions.checkArgument(i > 0 && i < 9);
        this.capacity = i;
    }

    @Override // androidx.media3.effect.GlEffect
    public androidx.media3.effect.GlShaderProgram toGlShaderProgram(android.content.Context context, boolean z) throws androidx.media3.common.VideoFrameProcessingException {
        return new androidx.media3.effect.FrameCacheGlShaderProgram(context, this.capacity, z);
    }
}
