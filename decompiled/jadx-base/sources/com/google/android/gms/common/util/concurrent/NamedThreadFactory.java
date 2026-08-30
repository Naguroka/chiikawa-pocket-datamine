package com.google.android.gms.common.util.concurrent;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class NamedThreadFactory implements java.util.concurrent.ThreadFactory {
    private final java.lang.String zza;
    private final java.util.concurrent.ThreadFactory zzb = java.util.concurrent.Executors.defaultThreadFactory();

    public NamedThreadFactory(java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "Name must not be null");
        this.zza = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.lang.Thread threadNewThread = this.zzb.newThread(new com.google.android.gms.common.util.concurrent.zza(runnable, 0));
        threadNewThread.setName(this.zza);
        return threadNewThread;
    }
}
