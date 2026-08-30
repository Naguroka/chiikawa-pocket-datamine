package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public class zzo implements com.google.android.gms.internal.play_billing.zzcz {
    static final com.google.android.gms.internal.play_billing.zzd zzb;
    public static final /* synthetic */ int zzf = 0;
    private static final java.lang.Object zzh;
    volatile java.lang.Object zzc;
    volatile com.google.android.gms.internal.play_billing.zzh zzd;
    volatile com.google.android.gms.internal.play_billing.zzm zze;
    static final boolean zza = java.lang.Boolean.parseBoolean(java.lang.System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final java.util.logging.Logger zzg = java.util.logging.Logger.getLogger(com.google.android.gms.internal.play_billing.zzo.class.getName());

    static {
        com.google.android.gms.internal.play_billing.zzd zzlVar;
        try {
            zzlVar = new com.google.android.gms.internal.play_billing.zzj(java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.play_billing.zzm.class, java.lang.Thread.class, "zzb"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.play_billing.zzm.class, com.google.android.gms.internal.play_billing.zzm.class, "zzc"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.play_billing.zzo.class, com.google.android.gms.internal.play_billing.zzm.class, "zze"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.play_billing.zzo.class, com.google.android.gms.internal.play_billing.zzh.class, "zzd"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.play_billing.zzo.class, java.lang.Object.class, "zzc"));
            th = null;
        } catch (java.lang.Throwable th) {
            th = th;
            zzlVar = new com.google.android.gms.internal.play_billing.zzl();
        }
        java.lang.Throwable th2 = th;
        zzb = zzlVar;
        if (th2 != null) {
            zzg.logp(java.util.logging.Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        zzh = new java.lang.Object();
    }

    protected zzo() {
    }

    static void zzc(com.google.android.gms.internal.play_billing.zzo zzoVar) {
        com.google.android.gms.internal.play_billing.zzm zzmVar;
        com.google.android.gms.internal.play_billing.zzd zzdVar;
        com.google.android.gms.internal.play_billing.zzh zzhVar;
        do {
            zzmVar = zzoVar.zze;
            zzdVar = zzb;
        } while (!zzdVar.zze(zzoVar, zzmVar, com.google.android.gms.internal.play_billing.zzm.zza));
        while (zzmVar != null) {
            java.lang.Thread thread = zzmVar.zzb;
            if (thread != null) {
                zzmVar.zzb = null;
                java.util.concurrent.locks.LockSupport.unpark(thread);
            }
            zzmVar = zzmVar.zzc;
        }
        do {
            zzhVar = zzoVar.zzd;
        } while (!zzdVar.zzc(zzoVar, zzhVar, com.google.android.gms.internal.play_billing.zzh.zza));
        com.google.android.gms.internal.play_billing.zzh zzhVar2 = null;
        while (zzhVar != null) {
            com.google.android.gms.internal.play_billing.zzh zzhVar3 = zzhVar.zzd;
            zzhVar.zzd = zzhVar2;
            zzhVar2 = zzhVar;
            zzhVar = zzhVar3;
        }
        while (zzhVar2 != null) {
            java.lang.Runnable runnable = zzhVar2.zzb;
            com.google.android.gms.internal.play_billing.zzh zzhVar4 = zzhVar2.zzd;
            if (runnable instanceof com.google.android.gms.internal.play_billing.zzk) {
                com.google.android.gms.internal.play_billing.zzo zzoVar2 = ((com.google.android.gms.internal.play_billing.zzk) runnable).zza;
                throw null;
            }
            zzf(runnable, zzhVar2.zzc);
            zzhVar2 = zzhVar4;
        }
    }

    private final void zze(java.lang.StringBuilder sb) {
        V v;
        boolean z = false;
        while (true) {
            try {
                try {
                    v = get();
                    break;
                } catch (java.lang.InterruptedException unused) {
                    z = true;
                } catch (java.lang.Throwable th) {
                    if (z) {
                        java.lang.Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (java.util.concurrent.CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (java.lang.RuntimeException e) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (java.util.concurrent.ExecutionException e2) {
                sb.append("FAILURE, cause=[");
                sb.append(e2.getCause());
                sb.append(com.ironsource.y8.i.e);
                return;
            }
        }
        if (z) {
            java.lang.Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        sb.append(v == this ? "this future" : java.lang.String.valueOf(v));
        sb.append(com.ironsource.y8.i.e);
    }

    private static void zzf(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        try {
            executor.execute(runnable);
        } catch (java.lang.RuntimeException e) {
            zzg.logp(java.util.logging.Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", "RuntimeException while executing runnable " + java.lang.String.valueOf(runnable) + " with executor " + java.lang.String.valueOf(executor), (java.lang.Throwable) e);
        }
    }

    private final void zzg(com.google.android.gms.internal.play_billing.zzm zzmVar) {
        zzmVar.zzb = null;
        while (true) {
            com.google.android.gms.internal.play_billing.zzm zzmVar2 = this.zze;
            if (zzmVar2 != com.google.android.gms.internal.play_billing.zzm.zza) {
                com.google.android.gms.internal.play_billing.zzm zzmVar3 = null;
                while (zzmVar2 != null) {
                    com.google.android.gms.internal.play_billing.zzm zzmVar4 = zzmVar2.zzc;
                    if (zzmVar2.zzb != null) {
                        zzmVar3 = zzmVar2;
                    } else if (zzmVar3 != null) {
                        zzmVar3.zzc = zzmVar4;
                        if (zzmVar3.zzb == null) {
                        }
                    } else if (!zzb.zze(this, zzmVar2, zzmVar4)) {
                    }
                    zzmVar2 = zzmVar4;
                }
                return;
            }
            return;
        }
    }

    private static final java.lang.Object zzh(java.lang.Object obj) throws java.util.concurrent.ExecutionException {
        if (obj instanceof com.google.android.gms.internal.play_billing.zze) {
            java.lang.Throwable th = ((com.google.android.gms.internal.play_billing.zze) obj).zzc;
            java.util.concurrent.CancellationException cancellationException = new java.util.concurrent.CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof com.google.android.gms.internal.play_billing.zzg) {
            throw new java.util.concurrent.ExecutionException(((com.google.android.gms.internal.play_billing.zzg) obj).zza);
        }
        if (obj == zzh) {
            return null;
        }
        return obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        com.google.android.gms.internal.play_billing.zze zzeVar;
        java.lang.Object obj = this.zzc;
        if ((obj instanceof com.google.android.gms.internal.play_billing.zzk) | (obj == null)) {
            if (zza) {
                zzeVar = new com.google.android.gms.internal.play_billing.zze(z, new java.util.concurrent.CancellationException("Future.cancel() was called."));
            } else {
                zzeVar = z ? com.google.android.gms.internal.play_billing.zze.zza : com.google.android.gms.internal.play_billing.zze.zzb;
            }
            while (!zzb.zzd(this, obj, zzeVar)) {
                obj = this.zzc;
                if (!(obj instanceof com.google.android.gms.internal.play_billing.zzk)) {
                }
            }
            zzc(this);
            if (!(obj instanceof com.google.android.gms.internal.play_billing.zzk)) {
                return true;
            }
            com.google.android.gms.internal.play_billing.zzcz zzczVar = ((com.google.android.gms.internal.play_billing.zzk) obj).zzb;
            throw null;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        java.lang.Object obj;
        if (java.lang.Thread.interrupted()) {
            throw new java.lang.InterruptedException();
        }
        java.lang.Object obj2 = this.zzc;
        if ((obj2 != null) && (!(obj2 instanceof com.google.android.gms.internal.play_billing.zzk))) {
            return zzh(obj2);
        }
        com.google.android.gms.internal.play_billing.zzm zzmVar = this.zze;
        com.google.android.gms.internal.play_billing.zzm zzmVar2 = com.google.android.gms.internal.play_billing.zzm.zza;
        if (zzmVar != zzmVar2) {
            com.google.android.gms.internal.play_billing.zzm zzmVar3 = new com.google.android.gms.internal.play_billing.zzm();
            do {
                com.google.android.gms.internal.play_billing.zzd zzdVar = zzb;
                zzdVar.zza(zzmVar3, zzmVar);
                if (zzdVar.zze(this, zzmVar, zzmVar3)) {
                    do {
                        java.util.concurrent.locks.LockSupport.park(this);
                        if (java.lang.Thread.interrupted()) {
                            zzg(zzmVar3);
                            throw new java.lang.InterruptedException();
                        }
                        obj = this.zzc;
                    } while (!((obj != null) & (!(obj instanceof com.google.android.gms.internal.play_billing.zzk))));
                    return zzh(obj);
                }
                zzmVar = this.zze;
            } while (zzmVar != zzmVar2);
        }
        return zzh(this.zzc);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.zzc instanceof com.google.android.gms.internal.play_billing.zze;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        java.lang.Object obj = this.zzc;
        return (obj != null) & (!(obj instanceof com.google.android.gms.internal.play_billing.zzk));
    }

    public final java.lang.String toString() {
        java.lang.String strConcat;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.zzc instanceof com.google.android.gms.internal.play_billing.zze) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            zze(sb);
        } else {
            try {
                strConcat = zza();
            } catch (java.lang.RuntimeException e) {
                strConcat = "Exception thrown from implementation: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(e.getClass())));
            }
            if (strConcat != null && !strConcat.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strConcat);
                sb.append(com.ironsource.y8.i.e);
            } else if (isDone()) {
                zze(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append(com.ironsource.y8.i.e);
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected java.lang.String zza() {
        java.lang.Object obj = this.zzc;
        if (obj instanceof com.google.android.gms.internal.play_billing.zzk) {
            com.google.android.gms.internal.play_billing.zzcz zzczVar = ((com.google.android.gms.internal.play_billing.zzk) obj).zzb;
            return "setFuture=[null]";
        }
        if (!(this instanceof java.util.concurrent.ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((java.util.concurrent.ScheduledFuture) this).getDelay(java.util.concurrent.TimeUnit.MILLISECONDS) + " ms]";
    }

    protected boolean zzd(java.lang.Object obj) {
        if (obj == null) {
            obj = zzh;
        }
        if (!zzb.zzd(this, null, obj)) {
            return false;
        }
        zzc(this);
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcz
    public final void zzb(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        executor.getClass();
        com.google.android.gms.internal.play_billing.zzh zzhVar = this.zzd;
        com.google.android.gms.internal.play_billing.zzh zzhVar2 = com.google.android.gms.internal.play_billing.zzh.zza;
        if (zzhVar != zzhVar2) {
            com.google.android.gms.internal.play_billing.zzh zzhVar3 = new com.google.android.gms.internal.play_billing.zzh(runnable, executor);
            do {
                zzhVar3.zzd = zzhVar;
                if (zzb.zzc(this, zzhVar, zzhVar3)) {
                    return;
                } else {
                    zzhVar = this.zzd;
                }
            } while (zzhVar != zzhVar2);
        }
        zzf(runnable, executor);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x008e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0092  */
    /* JADX WARN: Code duplicated, block: B:48:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a6 A[EDGE_INSN: B:55:0x00a6->B:56:0x00ac BREAK  A[LOOP:0: B:21:0x0041->B:85:?]] */
    /* JADX WARN: Code duplicated, block: B:59:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:63:0x0102  */
    /* JADX WARN: Code duplicated, block: B:68:0x010a  */
    /* JADX WARN: Code duplicated, block: B:70:0x0121  */
    /* JADX WARN: Code duplicated, block: B:73:0x012d  */
    /* JADX WARN: Code duplicated, block: B:77:0x014d  */
    /* JADX WARN: Code duplicated, block: B:79:0x0159  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00a6 -> B:56:0x00ac). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long r19, java.util.concurrent.TimeUnit r21) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException, java.util.concurrent.ExecutionException {
        /*
            Method dump skipped, instruction units count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzo.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }
}
