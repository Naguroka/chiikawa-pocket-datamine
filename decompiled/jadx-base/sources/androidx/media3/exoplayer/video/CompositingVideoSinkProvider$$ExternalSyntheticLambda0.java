package androidx.media3.exoplayer.video;

/* JADX INFO: compiled from: D8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CompositingVideoSinkProvider$$ExternalSyntheticLambda0 implements java.util.concurrent.Executor {
    public final /* synthetic */ androidx.media3.common.util.HandlerWrapper f$0;

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.f$0.post(runnable);
    }
}
