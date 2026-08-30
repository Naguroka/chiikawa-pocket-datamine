package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzemb implements com.google.android.gms.internal.ads.zzetr {
    private final com.google.common.util.concurrent.ListenableFuture zza;
    private final java.util.concurrent.Executor zzb;
    private final java.util.concurrent.ScheduledExecutorService zzc;

    zzemb(com.google.common.util.concurrent.ListenableFuture listenableFuture, java.util.concurrent.Executor executor, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.zza = listenableFuture;
        this.zzb = executor;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 6;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        com.google.common.util.concurrent.ListenableFuture listenableFutureZzn = com.google.android.gms.internal.ads.zzgch.zzn(this.zza, new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzelz
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzgch.zzh(new com.google.android.gms.internal.ads.zzemc((java.lang.String) obj));
            }
        }, this.zzb);
        if (((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzmp)).intValue() > 0) {
            listenableFutureZzn = com.google.android.gms.internal.ads.zzgch.zzo(listenableFutureZzn, ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzmp)).intValue(), java.util.concurrent.TimeUnit.MILLISECONDS, this.zzc);
        }
        return com.google.android.gms.internal.ads.zzgch.zzf(listenableFutureZzn, java.lang.Throwable.class, new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzema
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return ((java.lang.Throwable) obj) instanceof java.util.concurrent.TimeoutException ? com.google.android.gms.internal.ads.zzgch.zzh(new com.google.android.gms.internal.ads.zzemc(java.lang.Integer.toString(17))) : com.google.android.gms.internal.ads.zzgch.zzh(new com.google.android.gms.internal.ads.zzemc(null));
            }
        }, this.zzb);
    }
}
