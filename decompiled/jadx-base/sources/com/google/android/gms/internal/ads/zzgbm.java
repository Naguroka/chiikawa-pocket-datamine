package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
abstract class zzgbm extends com.google.android.gms.internal.ads.zzgax.zzi {
    private static final com.google.android.gms.internal.ads.zzgbi zzbe;
    private static final com.google.android.gms.internal.ads.zzgcq zzbf = new com.google.android.gms.internal.ads.zzgcq(com.google.android.gms.internal.ads.zzgbm.class);
    private volatile int remaining;

    @javax.annotation.CheckForNull
    private volatile java.util.Set<java.lang.Throwable> seenExceptions = null;

    static {
        com.google.android.gms.internal.ads.zzgbi zzgbkVar;
        java.lang.Throwable th;
        com.google.android.gms.internal.ads.zzgbl zzgblVar = null;
        try {
            zzgbkVar = new com.google.android.gms.internal.ads.zzgbj(java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.ads.zzgbm.class, java.util.Set.class, "seenExceptions"), java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(com.google.android.gms.internal.ads.zzgbm.class, "remaining"));
            th = null;
        } catch (java.lang.Throwable th2) {
            zzgbkVar = new com.google.android.gms.internal.ads.zzgbk(zzgblVar);
            th = th2;
        }
        zzbe = zzgbkVar;
        if (th != null) {
            zzbf.zza().logp(java.util.logging.Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    zzgbm(int i) {
        this.remaining = i;
    }

    final int zzA() {
        return zzbe.zza(this);
    }

    final java.util.Set zzC() {
        java.util.Set<java.lang.Throwable> set = this.seenExceptions;
        if (set != null) {
            return set;
        }
        java.util.Set setNewSetFromMap = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());
        zze(setNewSetFromMap);
        zzbe.zzb(this, null, setNewSetFromMap);
        return (java.util.Set) java.util.Objects.requireNonNull(this.seenExceptions);
    }

    final void zzF() {
        this.seenExceptions = null;
    }

    abstract void zze(java.util.Set set);
}
