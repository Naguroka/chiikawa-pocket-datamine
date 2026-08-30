package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgbz extends com.google.android.gms.internal.ads.zzgby {
    private final com.google.common.util.concurrent.ListenableFuture zza;

    @Override // com.google.android.gms.internal.ads.zzgax, com.google.common.util.concurrent.ListenableFuture
    public final void addListener(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        this.zza.addListener(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzgax, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.zza.cancel(z);
    }

    @Override // com.google.android.gms.internal.ads.zzgax, java.util.concurrent.Future
    public final java.lang.Object get() throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        return this.zza.get();
    }

    @Override // com.google.android.gms.internal.ads.zzgax, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    @Override // com.google.android.gms.internal.ads.zzgax, java.util.concurrent.Future
    public final boolean isDone() {
        return this.zza.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final java.lang.String toString() {
        return this.zza.toString();
    }

    zzgbz(com.google.common.util.concurrent.ListenableFuture listenableFuture) {
        listenableFuture.getClass();
        this.zza = listenableFuture;
    }

    @Override // com.google.android.gms.internal.ads.zzgax, java.util.concurrent.Future
    public final java.lang.Object get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        return this.zza.get(j, timeUnit);
    }
}
