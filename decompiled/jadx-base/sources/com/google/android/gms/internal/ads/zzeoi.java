package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzeoi {
    public final com.google.common.util.concurrent.ListenableFuture zza;
    private final long zzb;
    private final com.google.android.gms.common.util.Clock zzc;

    public zzeoi(com.google.common.util.concurrent.ListenableFuture listenableFuture, long j, com.google.android.gms.common.util.Clock clock) {
        this.zza = listenableFuture;
        this.zzc = clock;
        this.zzb = clock.elapsedRealtime() + j;
    }

    public final boolean zza() {
        return this.zzb < this.zzc.elapsedRealtime();
    }
}
