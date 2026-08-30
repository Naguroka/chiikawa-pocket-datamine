package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class t implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.tasks.TaskCompletionSource f2339a;

    t() {
        this.f2339a = null;
    }

    public t(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.f2339a = taskCompletionSource;
    }

    public void a(java.lang.Exception exc) {
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = this.f2339a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    protected abstract void b();

    final com.google.android.gms.tasks.TaskCompletionSource c() {
        return this.f2339a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (java.lang.Exception e) {
            a(e);
        }
    }
}
