package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgcy extends com.google.android.gms.internal.ads.zzgcv implements com.google.android.gms.internal.ads.zzgct {
    final java.util.concurrent.ScheduledExecutorService zza;

    zzgcy(java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.zza = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ java.util.concurrent.ScheduledFuture schedule(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.zza;
        com.google.android.gms.internal.ads.zzgdi zzgdiVarZze = com.google.android.gms.internal.ads.zzgdi.zze(runnable, null);
        return new com.google.android.gms.internal.ads.zzgcw(zzgdiVarZze, scheduledExecutorService.schedule(zzgdiVarZze, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ java.util.concurrent.ScheduledFuture scheduleAtFixedRate(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        com.google.android.gms.internal.ads.zzgcx zzgcxVar = new com.google.android.gms.internal.ads.zzgcx(runnable);
        return new com.google.android.gms.internal.ads.zzgcw(zzgcxVar, this.zza.scheduleAtFixedRate(zzgcxVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ java.util.concurrent.ScheduledFuture scheduleWithFixedDelay(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        com.google.android.gms.internal.ads.zzgcx zzgcxVar = new com.google.android.gms.internal.ads.zzgcx(runnable);
        return new com.google.android.gms.internal.ads.zzgcw(zzgcxVar, this.zza.scheduleWithFixedDelay(zzgcxVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.zzgcr schedule(java.util.concurrent.Callable callable, long j, java.util.concurrent.TimeUnit timeUnit) {
        com.google.android.gms.internal.ads.zzgdi zzgdiVar = new com.google.android.gms.internal.ads.zzgdi(callable);
        return new com.google.android.gms.internal.ads.zzgcw(zzgdiVar, this.zza.schedule(zzgdiVar, j, timeUnit));
    }
}
