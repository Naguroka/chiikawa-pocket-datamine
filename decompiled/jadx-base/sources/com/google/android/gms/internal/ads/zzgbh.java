package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
abstract class zzgbh extends com.google.android.gms.internal.ads.zzgbm {
    private static final com.google.android.gms.internal.ads.zzgcq zza = new com.google.android.gms.internal.ads.zzgcq(com.google.android.gms.internal.ads.zzgbh.class);

    @javax.annotation.CheckForNull
    private com.google.android.gms.internal.ads.zzfxi zzb;
    private final boolean zzc;
    private final boolean zzf;

    zzgbh(com.google.android.gms.internal.ads.zzfxi zzfxiVar, boolean z, boolean z2) {
        super(zzfxiVar.size());
        zzfxiVar.getClass();
        this.zzb = zzfxiVar;
        this.zzc = z;
        this.zzf = z2;
    }

    private final void zzG(int i, java.util.concurrent.Future future) {
        try {
            zzf(i, com.google.android.gms.internal.ads.zzgdk.zza(future));
        } catch (java.util.concurrent.ExecutionException e) {
            zzI(e.getCause());
        } catch (java.lang.Throwable th) {
            zzI(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzH, reason: merged with bridge method [inline-methods] */
    public final void zzx(@javax.annotation.CheckForNull com.google.android.gms.internal.ads.zzfxi zzfxiVar) {
        int iZzA = zzA();
        int i = 0;
        com.google.android.gms.internal.ads.zzfun.zzm(iZzA >= 0, "Less than 0 remaining futures");
        if (iZzA == 0) {
            if (zzfxiVar != null) {
                com.google.android.gms.internal.ads.zzfzt it = zzfxiVar.iterator();
                while (it.hasNext()) {
                    java.util.concurrent.Future future = (java.util.concurrent.Future) it.next();
                    if (!future.isCancelled()) {
                        zzG(i, future);
                    }
                    i++;
                }
            }
            zzF();
            zzu();
            zzy(2);
        }
    }

    private static void zzJ(java.lang.Throwable th) {
        zza.zza().logp(java.util.logging.Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof java.lang.Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzK, reason: merged with bridge method [inline-methods] */
    public final void zzw(int i, com.google.common.util.concurrent.ListenableFuture listenableFuture) {
        try {
            if (listenableFuture.isCancelled()) {
                this.zzb = null;
                cancel(false);
            } else {
                zzG(i, listenableFuture);
            }
        } finally {
            zzx(null);
        }
    }

    private static boolean zzL(java.util.Set set, java.lang.Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    @javax.annotation.CheckForNull
    protected final java.lang.String zza() {
        com.google.android.gms.internal.ads.zzfxi zzfxiVar = this.zzb;
        return zzfxiVar != null ? "futures=".concat(zzfxiVar.toString()) : super.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    protected final void zzb() {
        com.google.android.gms.internal.ads.zzfxi zzfxiVar = this.zzb;
        zzy(1);
        if ((zzfxiVar != null) && isCancelled()) {
            boolean zZzt = zzt();
            com.google.android.gms.internal.ads.zzfzt it = zzfxiVar.iterator();
            while (it.hasNext()) {
                ((java.util.concurrent.Future) it.next()).cancel(zZzt);
            }
        }
    }

    abstract void zzf(int i, java.lang.Object obj);

    abstract void zzu();

    final void zzv() {
        java.util.Objects.requireNonNull(this.zzb);
        if (this.zzb.isEmpty()) {
            zzu();
            return;
        }
        if (!this.zzc) {
            final com.google.android.gms.internal.ads.zzfxi zzfxiVar = this.zzf ? this.zzb : null;
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzgbg
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzx(zzfxiVar);
                }
            };
            com.google.android.gms.internal.ads.zzfzt it = this.zzb.iterator();
            while (it.hasNext()) {
                com.google.common.util.concurrent.ListenableFuture listenableFuture = (com.google.common.util.concurrent.ListenableFuture) it.next();
                if (listenableFuture.isDone()) {
                    zzx(zzfxiVar);
                } else {
                    listenableFuture.addListener(runnable, com.google.android.gms.internal.ads.zzgbv.INSTANCE);
                }
            }
            return;
        }
        com.google.android.gms.internal.ads.zzfzt it2 = this.zzb.iterator();
        final int i = 0;
        while (it2.hasNext()) {
            final com.google.common.util.concurrent.ListenableFuture listenableFuture2 = (com.google.common.util.concurrent.ListenableFuture) it2.next();
            int i2 = i + 1;
            if (listenableFuture2.isDone()) {
                zzw(i, listenableFuture2);
            } else {
                listenableFuture2.addListener(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzgbf
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzw(i, listenableFuture2);
                    }
                }, com.google.android.gms.internal.ads.zzgbv.INSTANCE);
            }
            i = i2;
        }
    }

    void zzy(int i) {
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgbm
    final void zze(java.util.Set set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        zzL(set, (java.lang.Throwable) java.util.Objects.requireNonNull(zzl()));
    }

    private final void zzI(java.lang.Throwable th) {
        th.getClass();
        if (this.zzc && !zzd(th) && zzL(zzC(), th)) {
            zzJ(th);
        } else if (th instanceof java.lang.Error) {
            zzJ(th);
        }
    }
}
