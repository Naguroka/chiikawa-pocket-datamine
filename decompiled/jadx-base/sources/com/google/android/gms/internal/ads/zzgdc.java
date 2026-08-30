package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgdc implements java.lang.Runnable {

    @javax.annotation.CheckForNull
    com.google.android.gms.internal.ads.zzgdf zza;

    zzgdc(com.google.android.gms.internal.ads.zzgdf zzgdfVar) {
        this.zza = zzgdfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.common.util.concurrent.ListenableFuture listenableFuture;
        com.google.android.gms.internal.ads.zzgdf zzgdfVar = this.zza;
        if (zzgdfVar == null || (listenableFuture = zzgdfVar.zza) == null) {
            return;
        }
        this.zza = null;
        if (listenableFuture.isDone()) {
            zzgdfVar.zzs(listenableFuture);
            return;
        }
        try {
            java.util.concurrent.ScheduledFuture scheduledFuture = zzgdfVar.zzb;
            zzgdfVar.zzb = null;
            java.lang.String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = java.lang.Math.abs(scheduledFuture.getDelay(java.util.concurrent.TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                } catch (java.lang.Throwable th) {
                    zzgdfVar.zzd(new com.google.android.gms.internal.ads.zzgdd(str, null));
                    throw th;
                }
            }
            zzgdfVar.zzd(new com.google.android.gms.internal.ads.zzgdd(str + ": " + listenableFuture.toString(), null));
            listenableFuture.cancel(true);
        } catch (java.lang.Throwable th2) {
            listenableFuture.cancel(true);
            throw th2;
        }
    }
}
