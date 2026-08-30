package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgcw extends com.google.android.gms.internal.ads.zzgcb implements com.google.android.gms.internal.ads.zzgcr {
    private final java.util.concurrent.ScheduledFuture zza;

    public zzgcw(com.google.common.util.concurrent.ListenableFuture listenableFuture, java.util.concurrent.ScheduledFuture scheduledFuture) {
        super(listenableFuture);
        this.zza = scheduledFuture;
    }

    @Override // com.google.android.gms.internal.ads.zzgca, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean zCancel = zzb().cancel(z);
        if (zCancel) {
            this.zza.cancel(z);
        }
        return zCancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.util.concurrent.Delayed delayed) {
        return this.zza.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(java.util.concurrent.TimeUnit timeUnit) {
        return this.zza.getDelay(timeUnit);
    }
}
