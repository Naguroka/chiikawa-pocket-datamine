package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzesd implements com.google.android.gms.internal.ads.zzetr {
    private final com.google.android.gms.internal.ads.zzetr zza;
    private final long zzb;
    private final java.util.concurrent.ScheduledExecutorService zzc;

    public zzesd(com.google.android.gms.internal.ads.zzetr zzetrVar, long j, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzetrVar;
        this.zzb = j;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        com.google.common.util.concurrent.ListenableFuture listenableFutureZzb = this.zza.zzb();
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcr)).booleanValue()) {
            timeUnit = java.util.concurrent.TimeUnit.MICROSECONDS;
        }
        long j = this.zzb;
        if (j > 0) {
            listenableFutureZzb = com.google.android.gms.internal.ads.zzgch.zzo(listenableFutureZzb, j, timeUnit, this.zzc);
        }
        return com.google.android.gms.internal.ads.zzgch.zzf(listenableFutureZzb, java.lang.Throwable.class, new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzesc
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return this.zza.zzc((java.lang.Throwable) obj);
            }
        }, com.google.android.gms.internal.ads.zzbzw.zzg);
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(java.lang.Throwable th) throws java.lang.Exception {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcq)).booleanValue()) {
            com.google.android.gms.internal.ads.zzetr zzetrVar = this.zza;
            com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "OptionalSignalTimeout:" + zzetrVar.zza());
        }
        return com.google.android.gms.internal.ads.zzgch.zzh(null);
    }
}
