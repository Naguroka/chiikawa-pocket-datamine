package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzffo implements com.google.android.gms.internal.ads.zzher {
    private final com.google.android.gms.internal.ads.zzhfj zza;

    public zzffo(com.google.android.gms.internal.ads.zzhfj zzhfjVar) {
        this.zza = zzhfjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        java.util.concurrent.ThreadFactory threadFactory = (java.util.concurrent.ThreadFactory) this.zza.zzb();
        com.google.android.gms.internal.ads.zzfqv.zza();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = java.util.concurrent.Executors.unconfigurableScheduledExecutorService(java.util.concurrent.Executors.newScheduledThreadPool(1, threadFactory));
        com.google.android.gms.internal.ads.zzhez.zzb(scheduledExecutorServiceUnconfigurableScheduledExecutorService);
        return scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }
}
