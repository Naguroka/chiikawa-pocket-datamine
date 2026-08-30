package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzfgf {
    private static final com.google.common.util.concurrent.ListenableFuture zza = com.google.android.gms.internal.ads.zzgch.zzh(null);
    private final com.google.android.gms.internal.ads.zzgcs zzb;
    private final java.util.concurrent.ScheduledExecutorService zzc;
    private final com.google.android.gms.internal.ads.zzfgg zzd;

    public zzfgf(com.google.android.gms.internal.ads.zzgcs zzgcsVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.internal.ads.zzfgg zzfggVar) {
        this.zzb = zzgcsVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfggVar;
    }

    public final com.google.android.gms.internal.ads.zzffv zza(java.lang.Object obj, com.google.common.util.concurrent.ListenableFuture... listenableFutureArr) {
        return new com.google.android.gms.internal.ads.zzffv(this, obj, java.util.Arrays.asList(listenableFutureArr), null);
    }

    public final com.google.android.gms.internal.ads.zzfgd zzb(java.lang.Object obj, com.google.common.util.concurrent.ListenableFuture listenableFuture) {
        return new com.google.android.gms.internal.ads.zzfgd(this, obj, listenableFuture, java.util.Collections.singletonList(listenableFuture), listenableFuture);
    }

    protected abstract java.lang.String zzf(java.lang.Object obj);
}
