package com.google.android.play.core.review.internal;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzj implements java.lang.Runnable {
    private final com.google.android.gms.tasks.TaskCompletionSource zza;

    zzj() {
        this.zza = null;
    }

    public zzj(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            zza();
        } catch (java.lang.Exception e) {
            zzc(e);
        }
    }

    protected abstract void zza();

    final com.google.android.gms.tasks.TaskCompletionSource zzb() {
        return this.zza;
    }

    public final void zzc(java.lang.Exception exc) {
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = this.zza;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }
}
