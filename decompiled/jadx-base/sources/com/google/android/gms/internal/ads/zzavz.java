package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzavz implements java.util.concurrent.ThreadFactory {
    private final java.util.concurrent.ThreadFactory zza = java.util.concurrent.Executors.defaultThreadFactory();
    private final java.util.concurrent.atomic.AtomicInteger zzb = new java.util.concurrent.atomic.AtomicInteger(1);

    zzavz() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.util.concurrent.atomic.AtomicInteger atomicInteger = this.zzb;
        java.lang.Thread threadNewThread = this.zza.newThread(runnable);
        threadNewThread.setName("gads-" + atomicInteger.getAndIncrement());
        return threadNewThread;
    }
}
