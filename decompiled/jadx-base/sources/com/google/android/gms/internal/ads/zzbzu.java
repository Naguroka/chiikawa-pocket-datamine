package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbzu extends com.google.android.gms.internal.ads.zzgbb {
    private final java.util.concurrent.Executor zza;

    /* synthetic */ zzbzu(java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzbzv zzbzvVar) {
        this.zza = executor;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, java.util.concurrent.TimeUnit timeUnit) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.zza.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.List shutdownNow() {
        throw new java.lang.UnsupportedOperationException();
    }
}
