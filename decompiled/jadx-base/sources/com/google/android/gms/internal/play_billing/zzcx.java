package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzcx implements com.google.android.gms.internal.play_billing.zzcz {
    private static final com.google.android.gms.internal.play_billing.zzcy zza = new com.google.android.gms.internal.play_billing.zzcy(com.google.android.gms.internal.play_billing.zzcx.class);
    private final java.lang.Object zzb;

    zzcx(java.lang.Object obj) {
        this.zzb = obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() {
        return this.zzb;
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.ExecutionException {
        timeUnit.getClass();
        return this.zzb;
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
        java.lang.Object obj = this.zzb;
        return super.toString() + "[status=SUCCESS, result=[" + obj.toString() + "]]";
    }

    @Override // com.google.android.gms.internal.play_billing.zzcz
    public final void zzb(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        com.google.android.gms.internal.play_billing.zzbg.zzc(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (java.lang.Exception e) {
            zza.zza().logp(java.util.logging.Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", "RuntimeException while executing runnable " + runnable.toString() + " with executor " + java.lang.String.valueOf(executor), (java.lang.Throwable) e);
        }
    }
}
