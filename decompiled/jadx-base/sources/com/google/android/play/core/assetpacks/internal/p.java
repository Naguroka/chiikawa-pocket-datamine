package com.google.android.play.core.assetpacks.internal;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class p implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.tasks.TaskCompletionSource f2249a;

    p() {
        this.f2249a = null;
    }

    public p(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.f2249a = taskCompletionSource;
    }

    protected abstract void a();

    final com.google.android.gms.tasks.TaskCompletionSource b() {
        return this.f2249a;
    }

    public final void c(java.lang.Exception exc) {
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = this.f2249a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (java.lang.Exception e) {
            c(e);
        }
    }
}
