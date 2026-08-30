package com.android.billingclient.api;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzav implements java.util.concurrent.ThreadFactory {
    private final java.util.concurrent.ThreadFactory zza;
    private final java.util.concurrent.atomic.AtomicInteger zzb;

    zzav(com.android.billingclient.api.BillingClientImpl billingClientImpl) {
        java.util.Objects.requireNonNull(billingClientImpl);
        this.zza = java.util.concurrent.Executors.defaultThreadFactory();
        this.zzb = new java.util.concurrent.atomic.AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.util.concurrent.atomic.AtomicInteger atomicInteger = this.zzb;
        java.lang.Thread threadNewThread = this.zza.newThread(runnable);
        threadNewThread.setName("PlayBillingLibrary-" + atomicInteger.getAndIncrement());
        return threadNewThread;
    }
}
