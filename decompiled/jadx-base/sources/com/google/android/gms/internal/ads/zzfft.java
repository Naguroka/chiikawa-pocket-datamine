package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfft implements com.google.common.util.concurrent.ListenableFuture {
    private final java.lang.Object zza;
    private final java.lang.String zzb;
    private final com.google.common.util.concurrent.ListenableFuture zzc;

    public zzfft(java.lang.Object obj, java.lang.String str, com.google.common.util.concurrent.ListenableFuture listenableFuture) {
        this.zza = obj;
        this.zzb = str;
        this.zzc = listenableFuture;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        this.zzc.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.zzc.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        return this.zzc.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.zzc.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.zzc.isDone();
    }

    public final java.lang.String toString() {
        return this.zzb + "@" + java.lang.System.identityHashCode(this);
    }

    public final java.lang.Object zza() {
        return this.zza;
    }

    public final java.lang.String zzb() {
        return this.zzb;
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        return this.zzc.get(j, timeUnit);
    }
}
