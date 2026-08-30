package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgcz {
    public static com.google.android.gms.internal.ads.zzgcs zza(java.util.concurrent.ExecutorService executorService) {
        if (executorService instanceof com.google.android.gms.internal.ads.zzgcs) {
            return (com.google.android.gms.internal.ads.zzgcs) executorService;
        }
        return executorService instanceof java.util.concurrent.ScheduledExecutorService ? new com.google.android.gms.internal.ads.zzgcy((java.util.concurrent.ScheduledExecutorService) executorService) : new com.google.android.gms.internal.ads.zzgcv(executorService);
    }

    public static com.google.android.gms.internal.ads.zzgct zzb(java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        return new com.google.android.gms.internal.ads.zzgcy(scheduledExecutorService);
    }

    public static java.util.concurrent.Executor zzc() {
        return com.google.android.gms.internal.ads.zzgbv.INSTANCE;
    }

    static java.util.concurrent.Executor zzd(java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzgax zzgaxVar) {
        executor.getClass();
        return executor == com.google.android.gms.internal.ads.zzgbv.INSTANCE ? executor : new com.google.android.gms.internal.ads.zzgcu(executor, zzgaxVar);
    }
}
