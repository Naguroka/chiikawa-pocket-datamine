package androidx.media3.effect;

/* JADX INFO: compiled from: D8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DefaultVideoCompositor$$ExternalSyntheticLambda1 implements androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task {
    public final /* synthetic */ androidx.media3.effect.DefaultVideoCompositor f$0;

    public /* synthetic */ DefaultVideoCompositor$$ExternalSyntheticLambda1(androidx.media3.effect.DefaultVideoCompositor defaultVideoCompositor) {
        this.f$0 = defaultVideoCompositor;
    }

    @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task
    public final void run() throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException {
        this.f$0.maybeComposite();
    }
}
