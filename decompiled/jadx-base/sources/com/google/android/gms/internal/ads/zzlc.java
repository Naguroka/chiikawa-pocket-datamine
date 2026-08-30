package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzlc {
    private final java.lang.Object zza;
    private android.os.Looper zzb;
    private android.os.HandlerThread zzc;
    private int zzd;

    public zzlc() {
        throw null;
    }

    public zzlc(android.os.Looper looper) {
        this.zza = new java.lang.Object();
        this.zzb = null;
        this.zzc = null;
        this.zzd = 0;
    }

    public final android.os.Looper zza() {
        android.os.Looper looper;
        synchronized (this.zza) {
            if (this.zzb == null) {
                boolean z = false;
                if (this.zzd == 0 && this.zzc == null) {
                    z = true;
                }
                com.google.android.gms.internal.ads.zzcw.zzf(z);
                android.os.HandlerThread handlerThread = new android.os.HandlerThread("ExoPlayer:Playback", -16);
                this.zzc = handlerThread;
                handlerThread.start();
                this.zzb = this.zzc.getLooper();
            }
            this.zzd++;
            looper = this.zzb;
        }
        return looper;
    }

    public final void zzb() {
        android.os.HandlerThread handlerThread;
        synchronized (this.zza) {
            com.google.android.gms.internal.ads.zzcw.zzf(this.zzd > 0);
            int i = this.zzd - 1;
            this.zzd = i;
            if (i == 0 && (handlerThread = this.zzc) != null) {
                handlerThread.quit();
                this.zzc = null;
                this.zzb = null;
            }
        }
    }
}
