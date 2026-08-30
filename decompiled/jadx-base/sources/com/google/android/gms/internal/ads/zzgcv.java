package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
class zzgcv extends com.google.android.gms.internal.ads.zzgbb {
    private final java.util.concurrent.ExecutorService zza;

    zzgcv(java.util.concurrent.ExecutorService executorService) {
        executorService.getClass();
        this.zza = executorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
        return this.zza.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.zza.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.zza.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.zza.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.zza.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.List shutdownNow() {
        return this.zza.shutdownNow();
    }

    public final java.lang.String toString() {
        java.util.concurrent.ExecutorService executorService = this.zza;
        return super.toString() + com.ironsource.y8.i.d + java.lang.String.valueOf(executorService) + com.ironsource.y8.i.e;
    }
}
