package androidx.media3.session;

/* JADX INFO: compiled from: D8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class MediaControllerImplBase$$ExternalSyntheticLambda44 implements java.lang.Runnable {
    public final /* synthetic */ androidx.media3.session.MediaController f$0;

    public /* synthetic */ MediaControllerImplBase$$ExternalSyntheticLambda44(androidx.media3.session.MediaController mediaController) {
        this.f$0 = mediaController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f$0.release();
    }
}
