package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfez implements java.util.concurrent.ThreadFactory {
    private final java.util.concurrent.atomic.AtomicInteger zza = new java.util.concurrent.atomic.AtomicInteger(1);

    zzfez() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        return new java.lang.Thread(runnable, "AdWorker(NG) #" + this.zza.getAndIncrement());
    }
}
