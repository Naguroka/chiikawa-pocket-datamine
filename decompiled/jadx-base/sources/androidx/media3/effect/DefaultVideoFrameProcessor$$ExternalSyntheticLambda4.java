package androidx.media3.effect;

/* JADX INFO: compiled from: D8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DefaultVideoFrameProcessor$$ExternalSyntheticLambda4 implements androidx.media3.effect.GlShaderProgram.ErrorListener {
    public final /* synthetic */ androidx.media3.common.VideoFrameProcessor.Listener f$0;

    @Override // androidx.media3.effect.GlShaderProgram.ErrorListener
    public final void onError(androidx.media3.common.VideoFrameProcessingException videoFrameProcessingException) {
        this.f$0.onError(videoFrameProcessingException);
    }
}
