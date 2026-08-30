package com.google.android.gms.ads.internal.util.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zza implements java.util.concurrent.ThreadFactory {
    final /* synthetic */ java.lang.String zza;
    private final java.util.concurrent.atomic.AtomicInteger zzb = new java.util.concurrent.atomic.AtomicInteger(1);

    zza(java.lang.String str) {
        this.zza = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        return new java.lang.Thread(runnable, "AdWorker(" + this.zza + ") #" + this.zzb.getAndIncrement());
    }
}
