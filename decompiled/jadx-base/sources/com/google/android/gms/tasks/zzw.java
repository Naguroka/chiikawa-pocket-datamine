package com.google.android.gms.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.2.1 */
/* JADX INFO: loaded from: classes5.dex */
final class zzw<TResult> extends com.google.android.gms.tasks.Task<TResult> {
    private final java.lang.Object zza = new java.lang.Object();
    private final com.google.android.gms.tasks.zzr zzb = new com.google.android.gms.tasks.zzr();
    private boolean zzc;
    private volatile boolean zzd;
    private java.lang.Object zze;
    private java.lang.Exception zzf;

    zzw() {
    }

    private final void zzf() {
        com.google.android.gms.common.internal.Preconditions.checkState(this.zzc, "Task is not yet complete");
    }

    private final void zzg() {
        if (this.zzd) {
            throw new java.util.concurrent.CancellationException("Task is already canceled.");
        }
    }

    private final void zzh() {
        if (this.zzc) {
            throw com.google.android.gms.tasks.DuplicateTaskCompletionException.of(this);
        }
    }

    private final void zzi() {
        synchronized (this.zza) {
            if (this.zzc) {
                this.zzb.zzb(this);
            }
        }
    }

    @Override // com.google.android.gms.tasks.Task
    public final com.google.android.gms.tasks.Task<TResult> addOnCanceledListener(android.app.Activity activity, com.google.android.gms.tasks.OnCanceledListener onCanceledListener) {
        com.google.android.gms.tasks.zzh zzhVar = new com.google.android.gms.tasks.zzh(com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD, onCanceledListener);
        this.zzb.zza(zzhVar);
        com.google.android.gms.tasks.zzv.zza(activity).zzb(zzhVar);
        zzi();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final com.google.android.gms.tasks.Task<TResult> addOnCompleteListener(android.app.Activity activity, com.google.android.gms.tasks.OnCompleteListener<TResult> onCompleteListener) {
        com.google.android.gms.tasks.zzj zzjVar = new com.google.android.gms.tasks.zzj(com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD, onCompleteListener);
        this.zzb.zza(zzjVar);
        com.google.android.gms.tasks.zzv.zza(activity).zzb(zzjVar);
        zzi();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final com.google.android.gms.tasks.Task<TResult> addOnFailureListener(android.app.Activity activity, com.google.android.gms.tasks.OnFailureListener onFailureListener) {
        com.google.android.gms.tasks.zzl zzlVar = new com.google.android.gms.tasks.zzl(com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD, onFailureListener);
        this.zzb.zza(zzlVar);
        com.google.android.gms.tasks.zzv.zza(activity).zzb(zzlVar);
        zzi();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final com.google.android.gms.tasks.Task<TResult> addOnSuccessListener(android.app.Activity activity, com.google.android.gms.tasks.OnSuccessListener<? super TResult> onSuccessListener) {
        com.google.android.gms.tasks.zzn zznVar = new com.google.android.gms.tasks.zzn(com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD, onSuccessListener);
        this.zzb.zza(zznVar);
        com.google.android.gms.tasks.zzv.zza(activity).zzb(zznVar);
        zzi();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final <TContinuationResult> com.google.android.gms.tasks.Task<TContinuationResult> continueWith(com.google.android.gms.tasks.Continuation<TResult, TContinuationResult> continuation) {
        return continueWith(com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public final <TContinuationResult> com.google.android.gms.tasks.Task<TContinuationResult> continueWithTask(com.google.android.gms.tasks.Continuation<TResult, com.google.android.gms.tasks.Task<TContinuationResult>> continuation) {
        return continueWithTask(com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public final java.lang.Exception getException() {
        java.lang.Exception exc;
        synchronized (this.zza) {
            exc = this.zzf;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    public final TResult getResult() {
        TResult tresult;
        synchronized (this.zza) {
            zzf();
            zzg();
            java.lang.Exception exc = this.zzf;
            if (exc != null) {
                throw new com.google.android.gms.tasks.RuntimeExecutionException(exc);
            }
            tresult = (TResult) this.zze;
        }
        return tresult;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isCanceled() {
        return this.zzd;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isComplete() {
        boolean z;
        synchronized (this.zza) {
            z = this.zzc;
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isSuccessful() {
        boolean z;
        synchronized (this.zza) {
            z = false;
            if (this.zzc && !this.zzd && this.zzf == null) {
                z = true;
            }
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    public final <TContinuationResult> com.google.android.gms.tasks.Task<TContinuationResult> onSuccessTask(com.google.android.gms.tasks.SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        java.util.concurrent.Executor executor = com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD;
        com.google.android.gms.tasks.zzw zzwVar = new com.google.android.gms.tasks.zzw();
        this.zzb.zza(new com.google.android.gms.tasks.zzp(executor, successContinuation, zzwVar));
        zzi();
        return zzwVar;
    }

    public final void zza(java.lang.Exception exc) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(exc, "Exception must not be null");
        synchronized (this.zza) {
            zzh();
            this.zzc = true;
            this.zzf = exc;
        }
        this.zzb.zzb(this);
    }

    public final void zzb(java.lang.Object obj) {
        synchronized (this.zza) {
            zzh();
            this.zzc = true;
            this.zze = obj;
        }
        this.zzb.zzb(this);
    }

    public final boolean zzc() {
        synchronized (this.zza) {
            if (this.zzc) {
                return false;
            }
            this.zzc = true;
            this.zzd = true;
            this.zzb.zzb(this);
            return true;
        }
    }

    public final boolean zzd(java.lang.Exception exc) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(exc, "Exception must not be null");
        synchronized (this.zza) {
            if (this.zzc) {
                return false;
            }
            this.zzc = true;
            this.zzf = exc;
            this.zzb.zzb(this);
            return true;
        }
    }

    public final boolean zze(java.lang.Object obj) {
        synchronized (this.zza) {
            if (this.zzc) {
                return false;
            }
            this.zzc = true;
            this.zze = obj;
            this.zzb.zzb(this);
            return true;
        }
    }

    @Override // com.google.android.gms.tasks.Task
    public final <TContinuationResult> com.google.android.gms.tasks.Task<TContinuationResult> continueWith(java.util.concurrent.Executor executor, com.google.android.gms.tasks.Continuation<TResult, TContinuationResult> continuation) {
        com.google.android.gms.tasks.zzw zzwVar = new com.google.android.gms.tasks.zzw();
        this.zzb.zza(new com.google.android.gms.tasks.zzd(executor, continuation, zzwVar));
        zzi();
        return zzwVar;
    }

    @Override // com.google.android.gms.tasks.Task
    public final <TContinuationResult> com.google.android.gms.tasks.Task<TContinuationResult> continueWithTask(java.util.concurrent.Executor executor, com.google.android.gms.tasks.Continuation<TResult, com.google.android.gms.tasks.Task<TContinuationResult>> continuation) {
        com.google.android.gms.tasks.zzw zzwVar = new com.google.android.gms.tasks.zzw();
        this.zzb.zza(new com.google.android.gms.tasks.zzf(executor, continuation, zzwVar));
        zzi();
        return zzwVar;
    }

    @Override // com.google.android.gms.tasks.Task
    public final com.google.android.gms.tasks.Task<TResult> addOnCanceledListener(com.google.android.gms.tasks.OnCanceledListener onCanceledListener) {
        addOnCanceledListener(com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD, onCanceledListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final com.google.android.gms.tasks.Task<TResult> addOnCompleteListener(com.google.android.gms.tasks.OnCompleteListener<TResult> onCompleteListener) {
        this.zzb.zza(new com.google.android.gms.tasks.zzj(com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD, onCompleteListener));
        zzi();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final com.google.android.gms.tasks.Task<TResult> addOnFailureListener(com.google.android.gms.tasks.OnFailureListener onFailureListener) {
        addOnFailureListener(com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD, onFailureListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final com.google.android.gms.tasks.Task<TResult> addOnSuccessListener(com.google.android.gms.tasks.OnSuccessListener<? super TResult> onSuccessListener) {
        addOnSuccessListener(com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD, onSuccessListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final <TContinuationResult> com.google.android.gms.tasks.Task<TContinuationResult> onSuccessTask(java.util.concurrent.Executor executor, com.google.android.gms.tasks.SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        com.google.android.gms.tasks.zzw zzwVar = new com.google.android.gms.tasks.zzw();
        this.zzb.zza(new com.google.android.gms.tasks.zzp(executor, successContinuation, zzwVar));
        zzi();
        return zzwVar;
    }

    @Override // com.google.android.gms.tasks.Task
    public final com.google.android.gms.tasks.Task<TResult> addOnCanceledListener(java.util.concurrent.Executor executor, com.google.android.gms.tasks.OnCanceledListener onCanceledListener) {
        this.zzb.zza(new com.google.android.gms.tasks.zzh(executor, onCanceledListener));
        zzi();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final com.google.android.gms.tasks.Task<TResult> addOnFailureListener(java.util.concurrent.Executor executor, com.google.android.gms.tasks.OnFailureListener onFailureListener) {
        this.zzb.zza(new com.google.android.gms.tasks.zzl(executor, onFailureListener));
        zzi();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final com.google.android.gms.tasks.Task<TResult> addOnSuccessListener(java.util.concurrent.Executor executor, com.google.android.gms.tasks.OnSuccessListener<? super TResult> onSuccessListener) {
        this.zzb.zza(new com.google.android.gms.tasks.zzn(executor, onSuccessListener));
        zzi();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final <X extends java.lang.Throwable> TResult getResult(java.lang.Class<X> cls) throws java.lang.Throwable {
        TResult tresult;
        synchronized (this.zza) {
            zzf();
            zzg();
            if (!cls.isInstance(this.zzf)) {
                java.lang.Exception exc = this.zzf;
                if (exc == null) {
                    tresult = (TResult) this.zze;
                } else {
                    throw new com.google.android.gms.tasks.RuntimeExecutionException(exc);
                }
            } else {
                throw cls.cast(this.zzf);
            }
        }
        return tresult;
    }

    @Override // com.google.android.gms.tasks.Task
    public final com.google.android.gms.tasks.Task<TResult> addOnCompleteListener(java.util.concurrent.Executor executor, com.google.android.gms.tasks.OnCompleteListener<TResult> onCompleteListener) {
        this.zzb.zza(new com.google.android.gms.tasks.zzj(executor, onCompleteListener));
        zzi();
        return this;
    }
}
