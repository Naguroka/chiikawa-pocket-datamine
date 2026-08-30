package com.google.android.gms.common.util.concurrent;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class NumberedThreadFactory implements java.util.concurrent.ThreadFactory {
    private final java.lang.String zza;
    private final java.util.concurrent.atomic.AtomicInteger zzb = new java.util.concurrent.atomic.AtomicInteger();
    private final java.util.concurrent.ThreadFactory zzc = java.util.concurrent.Executors.defaultThreadFactory();

    public NumberedThreadFactory(java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "Name must not be null");
        this.zza = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.lang.Thread threadNewThread = this.zzc.newThread(new com.google.android.gms.common.util.concurrent.zza(runnable, 0));
        threadNewThread.setName(this.zza + com.ironsource.y8.i.d + this.zzb.getAndIncrement() + com.ironsource.y8.i.e);
        return threadNewThread;
    }
}
