package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzcj<V> extends com.google.android.gms.internal.play_billing.zzck<V> {

    /* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
    final class zza {
        static final com.google.android.gms.internal.play_billing.zzcj.zza zza;
        static final com.google.android.gms.internal.play_billing.zzcj.zza zzb;
        final boolean zzc;
        final java.lang.Throwable zzd;

        static {
            if (com.google.android.gms.internal.play_billing.zzck.zzc) {
                zzb = null;
                zza = null;
            } else {
                zzb = new com.google.android.gms.internal.play_billing.zzcj.zza(false, null);
                zza = new com.google.android.gms.internal.play_billing.zzcj.zza(true, null);
            }
        }

        zza(boolean z, java.lang.Throwable th) {
            this.zzc = z;
            this.zzd = th;
        }
    }

    /* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
    final class zzb<V> implements java.lang.Runnable {
        final com.google.android.gms.internal.play_billing.zzcj<V> zza;
        final com.google.android.gms.internal.play_billing.zzcz<? extends V> zzb;

        zzb(com.google.android.gms.internal.play_billing.zzcj zzcjVar, com.google.android.gms.internal.play_billing.zzcz zzczVar) {
            this.zza = zzcjVar;
            this.zzb = zzczVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.zza.valueField != this) {
                return;
            }
            if (com.google.android.gms.internal.play_billing.zzck.zzq(this.zza, this, com.google.android.gms.internal.play_billing.zzcj.zzr(this.zzb))) {
                com.google.android.gms.internal.play_billing.zzcj.zzu(this.zza, false);
            }
        }
    }

    /* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
    final class zzc {
        static final com.google.android.gms.internal.play_billing.zzcj.zzc zza = new com.google.android.gms.internal.play_billing.zzcj.zzc(new java.lang.Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.android.gms.internal.play_billing.zzcj.zzc.1
            {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final java.lang.Throwable fillInStackTrace() {
                return this;
            }
        });
        static final com.google.android.gms.internal.play_billing.zzcj.zzc zzb = new com.google.android.gms.internal.play_billing.zzcj.zzc(new java.lang.Throwable("Failure.exception is unexpectedly null.") { // from class: com.google.android.gms.internal.play_billing.zzcj.zzc.2
            {
                super("Failure.exception is unexpectedly null.");
            }

            @Override // java.lang.Throwable
            public final java.lang.Throwable fillInStackTrace() {
                return this;
            }
        });
        final java.lang.Throwable zzc;

        zzc(java.lang.Throwable th) {
            th.getClass();
            this.zzc = th;
        }
    }

    /* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
    final class zzd {
        static final com.google.android.gms.internal.play_billing.zzcj.zzd zza = new com.google.android.gms.internal.play_billing.zzcj.zzd();
        com.google.android.gms.internal.play_billing.zzcj.zzd next;
        final java.lang.Runnable zzb;
        final java.util.concurrent.Executor zzc;

        zzd() {
            this.zzb = null;
            this.zzc = null;
        }

        zzd(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
            this.zzb = runnable;
            this.zzc = executor;
        }
    }

    /* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
    interface zze<V> extends com.google.android.gms.internal.play_billing.zzcz<V> {
    }

    protected zzcj() {
    }

    static java.lang.Object zzc(java.lang.Object obj) throws java.util.concurrent.ExecutionException {
        if (obj instanceof com.google.android.gms.internal.play_billing.zzcj.zza) {
            java.lang.Throwable th = ((com.google.android.gms.internal.play_billing.zzcj.zza) obj).zzd;
            java.util.concurrent.CancellationException cancellationException = new java.util.concurrent.CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (!(obj instanceof com.google.android.gms.internal.play_billing.zzcj.zzc)) {
            if (obj == zza) {
                return null;
            }
            return obj;
        }
        try {
            java.lang.Throwable th2 = ((com.google.android.gms.internal.play_billing.zzcj.zzc) obj).zzc;
            if (th2 != null) {
                throw new java.util.concurrent.ExecutionException(th2);
            }
            zzb.zza().logp(java.util.logging.Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "getDoneValue", "Failure.exception is unexpectedly null.");
            throw new java.util.concurrent.ExecutionException(com.google.android.gms.internal.play_billing.zzcj.zzc.zzb.zzc);
        } catch (java.lang.Error | java.lang.Exception e) {
            throw e;
        }
    }

    static boolean zzh(java.lang.Object obj) {
        return !(obj instanceof com.google.android.gms.internal.play_billing.zzcj.zzb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static java.lang.Object zzr(com.google.android.gms.internal.play_billing.zzcz zzczVar) {
        java.lang.Throwable thZze;
        if (zzczVar instanceof com.google.android.gms.internal.play_billing.zzcj.zze) {
            java.lang.Object zzaVar = ((com.google.android.gms.internal.play_billing.zzcj) zzczVar).valueField;
            if (zzaVar instanceof com.google.android.gms.internal.play_billing.zzcj.zza) {
                com.google.android.gms.internal.play_billing.zzcj.zza zzaVar2 = (com.google.android.gms.internal.play_billing.zzcj.zza) zzaVar;
                if (zzaVar2.zzc) {
                    java.lang.Throwable th = zzaVar2.zzd;
                    zzaVar = th != null ? new com.google.android.gms.internal.play_billing.zzcj.zza(false, th) : com.google.android.gms.internal.play_billing.zzcj.zza.zzb;
                }
            }
            return java.util.Objects.requireNonNull(zzaVar);
        }
        if ((zzczVar instanceof com.google.android.gms.internal.play_billing.zzdf) && (thZze = ((com.google.android.gms.internal.play_billing.zzdf) zzczVar).zze()) != null) {
            return new com.google.android.gms.internal.play_billing.zzcj.zzc(thZze);
        }
        boolean zIsCancelled = zzczVar.isCancelled();
        if ((!zzc) && zIsCancelled) {
            return java.util.Objects.requireNonNull(com.google.android.gms.internal.play_billing.zzcj.zza.zzb);
        }
        try {
            java.lang.Object objZzs = zzs(zzczVar);
            if (!zIsCancelled) {
                return objZzs == null ? zza : objZzs;
            }
            return new com.google.android.gms.internal.play_billing.zzcj.zza(false, new java.lang.IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + java.lang.String.valueOf(zzczVar)));
        } catch (java.lang.Error e) {
            e = e;
            return new com.google.android.gms.internal.play_billing.zzcj.zzc(e);
        } catch (java.util.concurrent.CancellationException e2) {
            return !zIsCancelled ? new com.google.android.gms.internal.play_billing.zzcj.zzc(new java.lang.IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(zzczVar))), e2)) : new com.google.android.gms.internal.play_billing.zzcj.zza(false, e2);
        } catch (java.util.concurrent.ExecutionException e3) {
            return zIsCancelled ? new com.google.android.gms.internal.play_billing.zzcj.zza(false, new java.lang.IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(zzczVar))), e3)) : new com.google.android.gms.internal.play_billing.zzcj.zzc(e3.getCause());
        } catch (java.lang.Exception e4) {
            e = e4;
            return new com.google.android.gms.internal.play_billing.zzcj.zzc(e);
        }
    }

    private static java.lang.Object zzs(java.util.concurrent.Future future) throws java.util.concurrent.ExecutionException {
        java.lang.Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (java.lang.InterruptedException unused) {
                z = true;
            } catch (java.lang.Throwable th) {
                if (z) {
                    java.lang.Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            java.lang.Thread.currentThread().interrupt();
        }
        return obj;
    }

    private final void zzt(java.lang.StringBuilder sb) {
        try {
            java.lang.Object objZzs = zzs(this);
            sb.append("SUCCESS, result=[");
            if (objZzs == null) {
                sb.append("null");
            } else if (objZzs == this) {
                sb.append("this future");
            } else {
                sb.append(objZzs.getClass().getName());
                sb.append("@");
                sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(objZzs)));
            }
            sb.append(com.ironsource.y8.i.e);
        } catch (java.util.concurrent.CancellationException unused) {
            sb.append("CANCELLED");
        } catch (java.util.concurrent.ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append(com.ironsource.y8.i.e);
        } catch (java.lang.Exception e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzu(com.google.android.gms.internal.play_billing.zzcj zzcjVar, boolean z) {
        com.google.android.gms.internal.play_billing.zzcj.zzd zzdVar = null;
        while (true) {
            zzcjVar.zzo();
            zzcjVar.zzg();
            com.google.android.gms.internal.play_billing.zzcj.zzd zzdVar2 = zzdVar;
            com.google.android.gms.internal.play_billing.zzcj.zzd zzdVarZzk = zzcjVar.zzk(com.google.android.gms.internal.play_billing.zzcj.zzd.zza);
            com.google.android.gms.internal.play_billing.zzcj.zzd zzdVar3 = zzdVar2;
            while (zzdVarZzk != null) {
                com.google.android.gms.internal.play_billing.zzcj.zzd zzdVar4 = zzdVarZzk.next;
                zzdVarZzk.next = zzdVar3;
                zzdVar3 = zzdVarZzk;
                zzdVarZzk = zzdVar4;
            }
            while (zzdVar3 != null) {
                java.lang.Runnable runnable = zzdVar3.zzb;
                com.google.android.gms.internal.play_billing.zzcj.zzd zzdVar5 = zzdVar3.next;
                java.lang.Runnable runnable2 = (java.lang.Runnable) java.util.Objects.requireNonNull(runnable);
                if (runnable2 instanceof com.google.android.gms.internal.play_billing.zzcj.zzb) {
                    com.google.android.gms.internal.play_billing.zzcj.zzb zzbVar = (com.google.android.gms.internal.play_billing.zzcj.zzb) runnable2;
                    zzcjVar = zzbVar.zza;
                    if (zzcjVar.valueField == zzbVar && zzq(zzcjVar, zzbVar, zzr(zzbVar.zzb))) {
                        zzdVar = zzdVar5;
                    }
                } else {
                    zzv(runnable2, (java.util.concurrent.Executor) java.util.Objects.requireNonNull(zzdVar3.zzc));
                }
                zzdVar3 = zzdVar5;
            }
            return;
        }
    }

    private static void zzv(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        try {
            executor.execute(runnable);
        } catch (java.lang.Exception e) {
            zzb.zza().logp(java.util.logging.Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + java.lang.String.valueOf(runnable) + " with executor " + java.lang.String.valueOf(executor), (java.lang.Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        java.lang.Object objRequireNonNull;
        java.lang.Object obj = this.valueField;
        if (!(obj instanceof com.google.android.gms.internal.play_billing.zzcj.zzb) && !(obj == null)) {
            return false;
        }
        if (zzc) {
            objRequireNonNull = new com.google.android.gms.internal.play_billing.zzcj.zza(z, new java.util.concurrent.CancellationException("Future.cancel() was called."));
        } else {
            objRequireNonNull = java.util.Objects.requireNonNull(z ? com.google.android.gms.internal.play_billing.zzcj.zza.zza : com.google.android.gms.internal.play_billing.zzcj.zza.zzb);
        }
        com.google.android.gms.internal.play_billing.zzcj<V> zzcjVar = this;
        boolean z2 = false;
        while (true) {
            if (zzq(zzcjVar, obj, objRequireNonNull)) {
                zzu(zzcjVar, z);
                if (obj instanceof com.google.android.gms.internal.play_billing.zzcj.zzb) {
                    com.google.android.gms.internal.play_billing.zzcz<? extends V> zzczVar = ((com.google.android.gms.internal.play_billing.zzcj.zzb) obj).zzb;
                    if (zzczVar instanceof com.google.android.gms.internal.play_billing.zzcj.zze) {
                        zzcjVar = (com.google.android.gms.internal.play_billing.zzcj) zzczVar;
                        obj = zzcjVar.valueField;
                        if ((obj == null) | (obj instanceof com.google.android.gms.internal.play_billing.zzcj.zzb)) {
                            z2 = true;
                        }
                    } else {
                        zzczVar.cancel(z);
                    }
                }
                return true;
            }
            obj = zzcjVar.valueField;
            if (zzh(obj)) {
                return z2;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        return zzl();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.valueField instanceof com.google.android.gms.internal.play_billing.zzcj.zza;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        java.lang.Object obj = this.valueField;
        return (obj != null) & zzh(obj);
    }

    public final java.lang.String toString() {
        java.lang.String strConcat;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append("[status=");
        if (this.valueField instanceof com.google.android.gms.internal.play_billing.zzcj.zza) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            zzt(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            java.lang.Object obj = this.valueField;
            if (obj instanceof com.google.android.gms.internal.play_billing.zzcj.zzb) {
                sb.append(", setFuture=[");
                com.google.android.gms.internal.play_billing.zzcz<? extends V> zzczVar = ((com.google.android.gms.internal.play_billing.zzcj.zzb) obj).zzb;
                try {
                    if (zzczVar == this) {
                        sb.append("this future");
                    } else {
                        sb.append(zzczVar);
                    }
                } catch (java.lang.Throwable th) {
                    com.google.android.gms.internal.play_billing.zzda.zza(th);
                    sb.append("Exception thrown from implementation: ");
                    sb.append(th.getClass());
                }
                sb.append(com.ironsource.y8.i.e);
            } else {
                try {
                    strConcat = zzd();
                    if (strConcat == null || strConcat.isEmpty()) {
                        strConcat = null;
                    }
                } catch (java.lang.Throwable th2) {
                    com.google.android.gms.internal.play_billing.zzda.zza(th2);
                    strConcat = "Exception thrown from implementation: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(th2.getClass())));
                }
                if (strConcat != null) {
                    sb.append(", info=[");
                    sb.append(strConcat);
                    sb.append(com.ironsource.y8.i.e);
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                zzt(sb);
            }
        }
        sb.append(com.ironsource.y8.i.e);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.play_billing.zzcz
    public final void zzb(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        com.google.android.gms.internal.play_billing.zzcj.zzd zzdVar;
        com.google.android.gms.internal.play_billing.zzbg.zzc(executor, "Executor was null.");
        if (!isDone() && (zzdVar = this.listenersField) != com.google.android.gms.internal.play_billing.zzcj.zzd.zza) {
            com.google.android.gms.internal.play_billing.zzcj.zzd zzdVar2 = new com.google.android.gms.internal.play_billing.zzcj.zzd(runnable, executor);
            do {
                zzdVar2.next = zzdVar;
                if (zzp(zzdVar, zzdVar2)) {
                    return;
                } else {
                    zzdVar = this.listenersField;
                }
            } while (zzdVar != com.google.android.gms.internal.play_billing.zzcj.zzd.zza);
        }
        zzv(runnable, executor);
    }

    protected java.lang.String zzd() {
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdf
    protected final java.lang.Throwable zze() {
        if (!(this instanceof com.google.android.gms.internal.play_billing.zzcj.zze)) {
            return null;
        }
        java.lang.Object obj = this.valueField;
        if (obj instanceof com.google.android.gms.internal.play_billing.zzcj.zzc) {
            return ((com.google.android.gms.internal.play_billing.zzcj.zzc) obj).zzc;
        }
        return null;
    }

    protected void zzg() {
    }

    protected final boolean zzi(java.lang.Throwable th) {
        if (!zzq(this, null, new com.google.android.gms.internal.play_billing.zzcj.zzc(th))) {
            return false;
        }
        zzu(this, false);
        return true;
    }

    protected final boolean zzj(com.google.android.gms.internal.play_billing.zzcz zzczVar) {
        com.google.android.gms.internal.play_billing.zzcj.zzc zzcVar;
        java.lang.Object obj = this.valueField;
        if (obj == null) {
            if (zzczVar.isDone()) {
                if (!zzq(this, null, zzr(zzczVar))) {
                    return false;
                }
                zzu(this, false);
                return true;
            }
            com.google.android.gms.internal.play_billing.zzcj.zzb zzbVar = new com.google.android.gms.internal.play_billing.zzcj.zzb(this, zzczVar);
            if (zzq(this, null, zzbVar)) {
                try {
                    zzczVar.zzb(zzbVar, com.google.android.gms.internal.play_billing.zzcp.INSTANCE);
                } catch (java.lang.Throwable th) {
                    try {
                        zzcVar = new com.google.android.gms.internal.play_billing.zzcj.zzc(th);
                    } catch (java.lang.Error | java.lang.Exception unused) {
                        zzcVar = com.google.android.gms.internal.play_billing.zzcj.zzc.zza;
                    }
                    zzq(this, zzbVar, zzcVar);
                }
                return true;
            }
            obj = this.valueField;
        }
        if (obj instanceof com.google.android.gms.internal.play_billing.zzcj.zza) {
            zzczVar.cancel(((com.google.android.gms.internal.play_billing.zzcj.zza) obj).zzc);
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        return zzm(j, timeUnit);
    }
}
