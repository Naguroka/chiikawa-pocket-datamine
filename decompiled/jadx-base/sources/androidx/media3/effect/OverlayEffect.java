package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
public final class OverlayEffect implements androidx.media3.effect.GlEffect {
    private final com.google.common.collect.ImmutableList<androidx.media3.effect.TextureOverlay> overlays;

    public OverlayEffect(com.google.common.collect.ImmutableList<androidx.media3.effect.TextureOverlay> immutableList) {
        this.overlays = immutableList;
    }

    @Override // androidx.media3.effect.GlEffect
    public androidx.media3.effect.BaseGlShaderProgram toGlShaderProgram(android.content.Context context, boolean z) throws androidx.media3.common.VideoFrameProcessingException {
        return new androidx.media3.effect.OverlayShaderProgram(context, z, this.overlays);
    }
}
