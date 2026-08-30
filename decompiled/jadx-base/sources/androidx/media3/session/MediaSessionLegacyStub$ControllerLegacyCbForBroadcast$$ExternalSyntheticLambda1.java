package androidx.media3.session;

/* JADX INFO: compiled from: D8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class MediaSessionLegacyStub$ControllerLegacyCbForBroadcast$$ExternalSyntheticLambda1 implements java.util.concurrent.Executor {
    public final /* synthetic */ android.os.Handler f$0;

    public /* synthetic */ MediaSessionLegacyStub$ControllerLegacyCbForBroadcast$$ExternalSyntheticLambda1(android.os.Handler handler) {
        this.f$0 = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.f$0.post(runnable);
    }
}
