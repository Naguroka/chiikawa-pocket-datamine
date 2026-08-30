package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@javax.annotation.ParametersAreNonnullByDefault
public class zzcab implements com.google.common.util.concurrent.ListenableFuture {
    private final com.google.android.gms.internal.ads.zzgdb zza = com.google.android.gms.internal.ads.zzgdb.zze();

    private static final boolean zza(boolean z) {
        if (!z) {
            com.google.android.gms.ads.internal.zzv.zzp().zzv(new java.lang.IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return z;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        this.zza.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.zza.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        return this.zza.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.zza.isDone();
    }

    public final boolean zzc(java.lang.Object obj) {
        boolean zZzc = this.zza.zzc(obj);
        zza(zZzc);
        return zZzc;
    }

    public final boolean zzd(java.lang.Throwable th) {
        boolean zZzd = this.zza.zzd(th);
        zza(zZzd);
        return zZzd;
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        return this.zza.get(j, timeUnit);
    }
}
