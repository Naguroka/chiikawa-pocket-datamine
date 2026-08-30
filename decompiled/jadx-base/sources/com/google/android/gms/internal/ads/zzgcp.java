package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
abstract class zzgcp extends java.util.concurrent.atomic.AtomicReference implements java.lang.Runnable {
    private static final java.lang.Runnable zza = new com.google.android.gms.internal.ads.zzgcn(null);
    private static final java.lang.Runnable zzb = new com.google.android.gms.internal.ads.zzgcn(null);

    zzgcp() {
    }

    private final void zzc(java.lang.Thread thread) {
        java.lang.Runnable runnable = (java.lang.Runnable) get();
        com.google.android.gms.internal.ads.zzgcm zzgcmVar = null;
        boolean z = false;
        int i = 0;
        while (true) {
            if (!(runnable instanceof com.google.android.gms.internal.ads.zzgcm)) {
                if (runnable != zzb) {
                    break;
                }
            } else {
                zzgcmVar = (com.google.android.gms.internal.ads.zzgcm) runnable;
            }
            i++;
            if (i > 1000) {
                java.lang.Runnable runnable2 = zzb;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z = java.lang.Thread.interrupted() || z;
                    java.util.concurrent.locks.LockSupport.park(zzgcmVar);
                }
            } else {
                java.lang.Thread.yield();
            }
            runnable = (java.lang.Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
        java.lang.Object objZza = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean z = !zzg();
            if (z) {
                try {
                    objZza = zza();
                } catch (java.lang.Throwable th) {
                    try {
                        com.google.android.gms.internal.ads.zzgda.zza(th);
                        if (!compareAndSet(threadCurrentThread, zza)) {
                            zzc(threadCurrentThread);
                        }
                        zzd(th);
                        return;
                    } catch (java.lang.Throwable th2) {
                        if (!compareAndSet(threadCurrentThread, zza)) {
                            zzc(threadCurrentThread);
                        }
                        zze(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, zza)) {
                zzc(threadCurrentThread);
            }
            if (z) {
                zze(objZza);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.Runnable runnable = (java.lang.Runnable) get();
        if (runnable == zza) {
            str = "running=[DONE]";
        } else if (runnable instanceof com.google.android.gms.internal.ads.zzgcm) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof java.lang.Thread) {
            str = "running=[RUNNING ON " + ((java.lang.Thread) runnable).getName() + com.ironsource.y8.i.e;
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + zzb();
    }

    abstract java.lang.Object zza() throws java.lang.Exception;

    abstract java.lang.String zzb();

    abstract void zzd(java.lang.Throwable th);

    abstract void zze(java.lang.Object obj);

    abstract boolean zzg();

    final void zzh() {
        java.lang.Runnable runnable = (java.lang.Runnable) get();
        if (runnable instanceof java.lang.Thread) {
            com.google.android.gms.internal.ads.zzgcm zzgcmVar = new com.google.android.gms.internal.ads.zzgcm(this, null);
            super/*java.util.concurrent.locks.AbstractOwnableSynchronizer*/.setExclusiveOwnerThread(java.lang.Thread.currentThread());
            if (compareAndSet(runnable, zzgcmVar)) {
                try {
                    ((java.lang.Thread) runnable).interrupt();
                    if (((java.lang.Runnable) getAndSet(zza)) == zzb) {
                    }
                } finally {
                    if (((java.lang.Runnable) getAndSet(zza)) == zzb) {
                        java.util.concurrent.locks.LockSupport.unpark((java.lang.Thread) runnable);
                    }
                }
            }
        }
    }
}
