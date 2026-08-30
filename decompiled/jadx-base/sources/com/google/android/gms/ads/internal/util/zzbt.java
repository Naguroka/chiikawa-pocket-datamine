package com.google.android.gms.ads.internal.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbt {
    private android.os.HandlerThread zza = null;
    private android.os.Handler zzb = null;
    private int zzc = 0;
    private final java.lang.Object zzd = new java.lang.Object();

    public final android.os.Handler zza() {
        return this.zzb;
    }

    public final android.os.Looper zzb() {
        android.os.Looper looper;
        synchronized (this.zzd) {
            if (this.zzc != 0) {
                com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zza, "Invalid state: handlerThread should already been initialized.");
            } else if (this.zza == null) {
                com.google.android.gms.ads.internal.util.zze.zza("Starting the looper thread.");
                android.os.HandlerThread handlerThread = new android.os.HandlerThread("LooperProvider");
                this.zza = handlerThread;
                handlerThread.start();
                this.zzb = new com.google.android.gms.internal.ads.zzfqw(this.zza.getLooper());
                com.google.android.gms.ads.internal.util.zze.zza("Looper thread started.");
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("Resuming the looper thread");
                this.zzd.notifyAll();
            }
            this.zzc++;
            looper = this.zza.getLooper();
        }
        return looper;
    }
}
