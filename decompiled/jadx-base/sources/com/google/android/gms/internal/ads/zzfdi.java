package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfdi {
    private final java.util.Deque zza = new java.util.concurrent.LinkedBlockingDeque();
    private final java.util.concurrent.Callable zzb;
    private final com.google.android.gms.internal.ads.zzgcs zzc;

    public zzfdi(java.util.concurrent.Callable callable, com.google.android.gms.internal.ads.zzgcs zzgcsVar) {
        this.zzb = callable;
        this.zzc = zzgcsVar;
    }

    public final synchronized com.google.common.util.concurrent.ListenableFuture zza() {
        zzc(1);
        return (com.google.common.util.concurrent.ListenableFuture) this.zza.poll();
    }

    public final synchronized void zzb(com.google.common.util.concurrent.ListenableFuture listenableFuture) {
        this.zza.addFirst(listenableFuture);
    }

    public final synchronized void zzc(int i) {
        int size = i - this.zza.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.zza.add(this.zzc.zzb(this.zzb));
        }
    }
}
