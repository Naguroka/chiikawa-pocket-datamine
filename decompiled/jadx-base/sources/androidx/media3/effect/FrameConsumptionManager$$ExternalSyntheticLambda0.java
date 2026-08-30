package androidx.media3.effect;

/* JADX INFO: compiled from: D8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class FrameConsumptionManager$$ExternalSyntheticLambda0 implements androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task {
    public final /* synthetic */ androidx.media3.effect.GlShaderProgram f$0;

    @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task
    public final void run() {
        this.f$0.signalEndOfCurrentInputStream();
    }
}
