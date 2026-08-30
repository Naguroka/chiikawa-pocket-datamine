package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcro {
    private final java.util.concurrent.Executor zza;
    private final java.util.concurrent.ScheduledExecutorService zzb;
    private final com.google.common.util.concurrent.ListenableFuture zzc;
    private volatile boolean zzd = true;

    public zzcro(java.util.concurrent.Executor executor, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.common.util.concurrent.ListenableFuture listenableFuture) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = listenableFuture;
    }

    static /* bridge */ /* synthetic */ void zzb(final com.google.android.gms.internal.ads.zzcro zzcroVar, java.util.List list, final com.google.android.gms.internal.ads.zzgcd zzgcdVar) {
        if (list == null || list.isEmpty()) {
            zzcroVar.zza.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcrj
                @Override // java.lang.Runnable
                public final void run() {
                    zzgcdVar.zza(new com.google.android.gms.internal.ads.zzdvy(3));
                }
            });
            return;
        }
        com.google.common.util.concurrent.ListenableFuture listenableFutureZzh = com.google.android.gms.internal.ads.zzgch.zzh(null);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            final com.google.common.util.concurrent.ListenableFuture listenableFuture = (com.google.common.util.concurrent.ListenableFuture) it.next();
            listenableFutureZzh = com.google.android.gms.internal.ads.zzgch.zzn(com.google.android.gms.internal.ads.zzgch.zzf(listenableFutureZzh, java.lang.Throwable.class, new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzcrk
                @Override // com.google.android.gms.internal.ads.zzgbo
                public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                    zzgcdVar.zza((java.lang.Throwable) obj);
                    return com.google.android.gms.internal.ads.zzgch.zzh(null);
                }
            }, zzcroVar.zza), new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzcrl
                @Override // com.google.android.gms.internal.ads.zzgbo
                public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                    return this.zza.zza(zzgcdVar, listenableFuture, (com.google.android.gms.internal.ads.zzcqz) obj);
                }
            }, zzcroVar.zza);
        }
        com.google.android.gms.internal.ads.zzgch.zzr(listenableFutureZzh, new com.google.android.gms.internal.ads.zzcrn(zzcroVar, zzgcdVar), zzcroVar.zza);
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(com.google.android.gms.internal.ads.zzgcd zzgcdVar, com.google.common.util.concurrent.ListenableFuture listenableFuture, com.google.android.gms.internal.ads.zzcqz zzcqzVar) throws java.lang.Exception {
        if (zzcqzVar != null) {
            zzgcdVar.zzb(zzcqzVar);
        }
        return com.google.android.gms.internal.ads.zzgch.zzo(listenableFuture, ((java.lang.Long) com.google.android.gms.internal.ads.zzbey.zza.zze()).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS, this.zzb);
    }

    final /* synthetic */ void zzd() {
        this.zzd = false;
    }

    public final void zze(com.google.android.gms.internal.ads.zzgcd zzgcdVar) {
        com.google.android.gms.internal.ads.zzgch.zzr(this.zzc, new com.google.android.gms.internal.ads.zzcrm(this, zzgcdVar), this.zza);
    }

    public final boolean zzf() {
        return this.zzd;
    }
}
