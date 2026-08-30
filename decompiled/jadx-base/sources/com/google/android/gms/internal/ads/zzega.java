package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzega {
    private final java.util.concurrent.Executor zza;
    private final java.util.concurrent.ScheduledExecutorService zzb;
    private final com.google.android.gms.internal.ads.zzcrc zzc;
    private final com.google.android.gms.internal.ads.zzegq zzd;
    private final com.google.android.gms.internal.ads.zzfiv zze;
    private final com.google.android.gms.internal.ads.zzgdb zzf = com.google.android.gms.internal.ads.zzgdb.zze();
    private final java.util.concurrent.atomic.AtomicBoolean zzg = new java.util.concurrent.atomic.AtomicBoolean();
    private com.google.android.gms.internal.ads.zzegb zzh;
    private com.google.android.gms.internal.ads.zzfca zzi;

    zzega(java.util.concurrent.Executor executor, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.internal.ads.zzcrc zzcrcVar, com.google.android.gms.internal.ads.zzegq zzegqVar, com.google.android.gms.internal.ads.zzfiv zzfivVar) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = zzcrcVar;
        this.zzd = zzegqVar;
        this.zze = zzfivVar;
    }

    private final synchronized com.google.common.util.concurrent.ListenableFuture zzd(com.google.android.gms.internal.ads.zzfbo zzfboVar) {
        java.util.Iterator it = zzfboVar.zza.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.ads.zzecw zzecwVarZza = this.zzc.zza(zzfboVar.zzb, (java.lang.String) it.next());
            if (zzecwVarZza != null && zzecwVarZza.zzb(this.zzi, zzfboVar)) {
                return com.google.android.gms.internal.ads.zzgch.zzo(zzecwVarZza.zza(this.zzi, zzfboVar), zzfboVar.zzR, java.util.concurrent.TimeUnit.MILLISECONDS, this.zzb);
            }
        }
        return com.google.android.gms.internal.ads.zzgch.zzg(new com.google.android.gms.internal.ads.zzdvy(3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zze(com.google.android.gms.internal.ads.zzfbo zzfboVar) {
        com.google.common.util.concurrent.ListenableFuture listenableFutureZzd = zzd(zzfboVar);
        this.zzd.zzf(this.zzi, zzfboVar, listenableFutureZzd, this.zze);
        com.google.android.gms.internal.ads.zzgch.zzr(listenableFutureZzd, new com.google.android.gms.internal.ads.zzefz(this, zzfboVar), this.zza);
    }

    public final synchronized com.google.common.util.concurrent.ListenableFuture zzb(com.google.android.gms.internal.ads.zzfca zzfcaVar) {
        if (!this.zzg.getAndSet(true)) {
            if (zzfcaVar.zzb.zza.isEmpty()) {
                this.zzf.zzd(new com.google.android.gms.internal.ads.zzegu(3, com.google.android.gms.internal.ads.zzegx.zzc(zzfcaVar)));
            } else {
                this.zzi = zzfcaVar;
                this.zzh = new com.google.android.gms.internal.ads.zzegb(zzfcaVar, this.zzd, this.zzf);
                this.zzd.zzk(zzfcaVar.zzb.zza);
                com.google.android.gms.internal.ads.zzfbo zzfboVarZza = this.zzh.zza();
                while (zzfboVarZza != null) {
                    zze(zzfboVarZza);
                    zzfboVarZza = this.zzh.zza();
                }
            }
        }
        return this.zzf;
    }
}
