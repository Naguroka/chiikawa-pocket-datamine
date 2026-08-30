package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgdf extends com.google.android.gms.internal.ads.zzgbx {

    @javax.annotation.CheckForNull
    private com.google.common.util.concurrent.ListenableFuture zza;

    @javax.annotation.CheckForNull
    private java.util.concurrent.ScheduledFuture zzb;

    static com.google.common.util.concurrent.ListenableFuture zzf(com.google.common.util.concurrent.ListenableFuture listenableFuture, long j, java.util.concurrent.TimeUnit timeUnit, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        com.google.android.gms.internal.ads.zzgdf zzgdfVar = new com.google.android.gms.internal.ads.zzgdf(listenableFuture);
        com.google.android.gms.internal.ads.zzgdc zzgdcVar = new com.google.android.gms.internal.ads.zzgdc(zzgdfVar);
        zzgdfVar.zzb = scheduledExecutorService.schedule(zzgdcVar, j, timeUnit);
        listenableFuture.addListener(zzgdcVar, com.google.android.gms.internal.ads.zzgbv.INSTANCE);
        return zzgdfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    @javax.annotation.CheckForNull
    protected final java.lang.String zza() {
        com.google.common.util.concurrent.ListenableFuture listenableFuture = this.zza;
        java.util.concurrent.ScheduledFuture scheduledFuture = this.zzb;
        if (listenableFuture == null) {
            return null;
        }
        java.lang.String str = "inputFuture=[" + listenableFuture.toString() + com.ironsource.y8.i.e;
        if (scheduledFuture == null) {
            return str;
        }
        long delay = scheduledFuture.getDelay(java.util.concurrent.TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return str;
        }
        return str + ", remaining delay=[" + delay + " ms]";
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    protected final void zzb() {
        zzr(this.zza);
        java.util.concurrent.ScheduledFuture scheduledFuture = this.zzb;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zza = null;
        this.zzb = null;
    }

    private zzgdf(com.google.common.util.concurrent.ListenableFuture listenableFuture) {
        listenableFuture.getClass();
        this.zza = listenableFuture;
    }
}
