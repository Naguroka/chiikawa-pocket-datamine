package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzil extends com.google.android.gms.measurement.internal.zzjr {
    private static final java.util.concurrent.atomic.AtomicLong zza = new java.util.concurrent.atomic.AtomicLong(Long.MIN_VALUE);
    private com.google.android.gms.measurement.internal.zzik zzb;
    private com.google.android.gms.measurement.internal.zzik zzc;
    private final java.util.concurrent.PriorityBlockingQueue zzd;
    private final java.util.concurrent.BlockingQueue zze;
    private final java.lang.Thread.UncaughtExceptionHandler zzf;
    private final java.lang.Thread.UncaughtExceptionHandler zzg;
    private final java.lang.Object zzh;
    private final java.util.concurrent.Semaphore zzi;
    private volatile boolean zzj;

    zzil(com.google.android.gms.measurement.internal.zzio zzioVar) {
        super(zzioVar);
        this.zzh = new java.lang.Object();
        this.zzi = new java.util.concurrent.Semaphore(2);
        this.zzd = new java.util.concurrent.PriorityBlockingQueue();
        this.zze = new java.util.concurrent.LinkedBlockingQueue();
        this.zzf = new com.google.android.gms.measurement.internal.zzii(this, "Thread death: Uncaught exception on worker thread");
        this.zzg = new com.google.android.gms.measurement.internal.zzii(this, "Thread death: Uncaught exception on network thread");
    }

    static /* bridge */ /* synthetic */ boolean zzs(com.google.android.gms.measurement.internal.zzil zzilVar) {
        boolean z = zzilVar.zzj;
        return false;
    }

    private final void zzz(com.google.android.gms.measurement.internal.zzij zzijVar) {
        synchronized (this.zzh) {
            java.util.concurrent.PriorityBlockingQueue priorityBlockingQueue = this.zzd;
            priorityBlockingQueue.add(zzijVar);
            com.google.android.gms.measurement.internal.zzik zzikVar = this.zzb;
            if (zzikVar == null) {
                com.google.android.gms.measurement.internal.zzik zzikVar2 = new com.google.android.gms.measurement.internal.zzik(this, "Measurement Worker", priorityBlockingQueue);
                this.zzb = zzikVar2;
                zzikVar2.setUncaughtExceptionHandler(this.zzf);
                this.zzb.start();
            } else {
                zzikVar.zza();
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzjq
    public final void zzaY() {
        if (java.lang.Thread.currentThread() != this.zzc) {
            throw new java.lang.IllegalStateException("Call expected from network thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzjr
    protected final boolean zzc() {
        return false;
    }

    final java.lang.Object zze(java.util.concurrent.atomic.AtomicReference atomicReference, long j, java.lang.String str, java.lang.Runnable runnable) {
        synchronized (atomicReference) {
            this.zzu.zzaX().zzq(runnable);
            try {
                atomicReference.wait(j);
            } catch (java.lang.InterruptedException unused) {
                this.zzu.zzaW().zzk().zza("Interrupted waiting for " + str);
                return null;
            }
        }
        java.lang.Object obj = atomicReference.get();
        if (obj == null) {
            this.zzu.zzaW().zzk().zza("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final java.util.concurrent.Future zzf(java.util.concurrent.Callable callable) throws java.lang.IllegalStateException {
        zzv();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(callable);
        com.google.android.gms.measurement.internal.zzij zzijVar = new com.google.android.gms.measurement.internal.zzij(this, callable, false, "Task exception on worker thread");
        if (java.lang.Thread.currentThread() == this.zzb) {
            if (!this.zzd.isEmpty()) {
                this.zzu.zzaW().zzk().zza("Callable skipped the worker queue.");
            }
            zzijVar.run();
        } else {
            zzz(zzijVar);
        }
        return zzijVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzjq
    public final void zzg() {
        if (java.lang.Thread.currentThread() != this.zzb) {
            throw new java.lang.IllegalStateException("Call expected from worker thread");
        }
    }

    public final java.util.concurrent.Future zzh(java.util.concurrent.Callable callable) throws java.lang.IllegalStateException {
        zzv();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(callable);
        com.google.android.gms.measurement.internal.zzij zzijVar = new com.google.android.gms.measurement.internal.zzij(this, callable, true, "Task exception on worker thread");
        if (java.lang.Thread.currentThread() == this.zzb) {
            zzijVar.run();
        } else {
            zzz(zzijVar);
        }
        return zzijVar;
    }

    public final void zzn() {
        if (java.lang.Thread.currentThread() == this.zzb) {
            throw new java.lang.IllegalStateException("Call not expected from worker thread");
        }
    }

    public final void zzp(java.lang.Runnable runnable) throws java.lang.IllegalStateException {
        zzv();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(runnable);
        com.google.android.gms.measurement.internal.zzij zzijVar = new com.google.android.gms.measurement.internal.zzij(this, runnable, false, "Task exception on network thread");
        synchronized (this.zzh) {
            java.util.concurrent.BlockingQueue blockingQueue = this.zze;
            blockingQueue.add(zzijVar);
            com.google.android.gms.measurement.internal.zzik zzikVar = this.zzc;
            if (zzikVar == null) {
                com.google.android.gms.measurement.internal.zzik zzikVar2 = new com.google.android.gms.measurement.internal.zzik(this, "Measurement Network", blockingQueue);
                this.zzc = zzikVar2;
                zzikVar2.setUncaughtExceptionHandler(this.zzg);
                this.zzc.start();
            } else {
                zzikVar.zza();
            }
        }
    }

    public final void zzq(java.lang.Runnable runnable) throws java.lang.IllegalStateException {
        zzv();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(runnable);
        zzz(new com.google.android.gms.measurement.internal.zzij(this, runnable, false, "Task exception on worker thread"));
    }

    public final void zzr(java.lang.Runnable runnable) throws java.lang.IllegalStateException {
        zzv();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(runnable);
        zzz(new com.google.android.gms.measurement.internal.zzij(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean zzt() {
        return java.lang.Thread.currentThread() == this.zzc;
    }

    public final boolean zzu() {
        return java.lang.Thread.currentThread() == this.zzb;
    }
}
