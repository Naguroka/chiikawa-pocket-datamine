package androidx.media3.session;

/* JADX INFO: compiled from: D8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class MediaLibrarySessionImpl$$ExternalSyntheticLambda1 implements java.util.concurrent.Executor {
    public final /* synthetic */ androidx.media3.session.MediaLibrarySessionImpl f$0;

    public /* synthetic */ MediaLibrarySessionImpl$$ExternalSyntheticLambda1(androidx.media3.session.MediaLibrarySessionImpl mediaLibrarySessionImpl) {
        this.f$0 = mediaLibrarySessionImpl;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.f$0.postOrRunOnApplicationHandler(runnable);
    }
}
