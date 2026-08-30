package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzcu extends com.google.android.gms.internal.play_billing.zzcw {
    public static com.google.android.gms.internal.play_billing.zzcz zza(java.lang.Object obj) {
        return new com.google.android.gms.internal.play_billing.zzcx(obj);
    }

    public static com.google.android.gms.internal.play_billing.zzcz zzb(com.google.android.gms.internal.play_billing.zzcz zzczVar, long j, java.util.concurrent.TimeUnit timeUnit, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        return zzczVar.isDone() ? zzczVar : com.google.android.gms.internal.play_billing.zzde.zzs(zzczVar, 28500L, timeUnit, scheduledExecutorService);
    }

    public static void zzc(com.google.android.gms.internal.play_billing.zzcz zzczVar, com.google.android.gms.internal.play_billing.zzcs zzcsVar, java.util.concurrent.Executor executor) {
        zzczVar.zzb(new com.google.android.gms.internal.play_billing.zzct(zzczVar, zzcsVar), executor);
    }
}
