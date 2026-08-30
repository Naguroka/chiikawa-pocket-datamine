package com.google.android.gms.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.2.1 */
/* JADX INFO: loaded from: classes5.dex */
public class TaskCompletionSource<TResult> {
    private final com.google.android.gms.tasks.zzw zza = new com.google.android.gms.tasks.zzw();

    public TaskCompletionSource() {
    }

    public TaskCompletionSource(com.google.android.gms.tasks.CancellationToken cancellationToken) {
        cancellationToken.onCanceledRequested(new com.google.android.gms.tasks.zzs(this));
    }

    public com.google.android.gms.tasks.Task<TResult> getTask() {
        return this.zza;
    }

    public void setException(java.lang.Exception exc) {
        this.zza.zza(exc);
    }

    public void setResult(TResult tresult) {
        this.zza.zzb(tresult);
    }

    public boolean trySetException(java.lang.Exception exc) {
        return this.zza.zzd(exc);
    }

    public boolean trySetResult(TResult tresult) {
        return this.zza.zze(tresult);
    }
}
