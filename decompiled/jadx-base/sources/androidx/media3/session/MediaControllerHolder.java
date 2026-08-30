package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
class MediaControllerHolder<T extends androidx.media3.session.MediaController> extends com.google.common.util.concurrent.AbstractFuture<T> implements androidx.media3.session.MediaController.ConnectionCallback {
    private boolean accepted;
    private T controller;
    private final android.os.Handler handler;

    public MediaControllerHolder(android.os.Looper looper) {
        this.handler = new android.os.Handler(looper);
    }

    public void setController(final T t) {
        this.controller = t;
        maybeSetFutureResult();
        addListener(new java.lang.Runnable() { // from class: androidx.media3.session.MediaControllerHolder$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m235x80bd5aa4(t);
            }
        }, new java.util.concurrent.Executor() { // from class: androidx.media3.session.MediaControllerHolder$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Executor
            public final void execute(java.lang.Runnable runnable) {
                this.f$0.m236xf63780e5(runnable);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$setController$0$androidx-media3-session-MediaControllerHolder, reason: not valid java name */
    /* synthetic */ void m235x80bd5aa4(androidx.media3.session.MediaController mediaController) {
        if (isCancelled()) {
            mediaController.release();
        }
    }

    /* JADX INFO: renamed from: lambda$setController$1$androidx-media3-session-MediaControllerHolder, reason: not valid java name */
    /* synthetic */ void m236xf63780e5(java.lang.Runnable runnable) {
        androidx.media3.common.util.Util.postOrRun(this.handler, runnable);
    }

    @Override // androidx.media3.session.MediaController.ConnectionCallback
    public void onAccepted() {
        this.accepted = true;
        maybeSetFutureResult();
    }

    @Override // androidx.media3.session.MediaController.ConnectionCallback
    public void onRejected() {
        maybeSetException();
    }

    private void maybeSetFutureResult() {
        T t = this.controller;
        if (t == null || !this.accepted) {
            return;
        }
        set(t);
    }

    private void maybeSetException() {
        setException(new java.lang.SecurityException("Session rejected the connection request."));
    }
}
