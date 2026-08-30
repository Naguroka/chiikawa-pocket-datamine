package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgcl implements com.google.common.util.concurrent.ListenableFuture {
    static final com.google.common.util.concurrent.ListenableFuture zza = new com.google.android.gms.internal.ads.zzgcl(null);
    private static final com.google.android.gms.internal.ads.zzgcq zzb = new com.google.android.gms.internal.ads.zzgcq(com.google.android.gms.internal.ads.zzgcl.class);
    private final java.lang.Object zzc;

    zzgcl(java.lang.Object obj) {
        this.zzc = obj;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        com.google.android.gms.internal.ads.zzfun.zzc(runnable, "Runnable was null.");
        com.google.android.gms.internal.ads.zzfun.zzc(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (java.lang.Exception e) {
            zzb.zza().logp(java.util.logging.Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", "RuntimeException while executing runnable " + java.lang.String.valueOf(runnable) + " with executor " + java.lang.String.valueOf(executor), (java.lang.Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() {
        return this.zzc;
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.ExecutionException {
        timeUnit.getClass();
        return this.zzc;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.zzc;
        return super.toString() + "[status=SUCCESS, result=[" + java.lang.String.valueOf(obj) + "]]";
    }
}
