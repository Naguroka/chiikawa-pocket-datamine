package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
public interface GlEffect extends androidx.media3.common.Effect {
    default boolean isNoOp(int i, int i2) {
        return false;
    }

    androidx.media3.effect.GlShaderProgram toGlShaderProgram(android.content.Context context, boolean z) throws androidx.media3.common.VideoFrameProcessingException;
}
