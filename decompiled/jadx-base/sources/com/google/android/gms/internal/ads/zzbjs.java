package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbjs {
    private boolean zza = false;
    private boolean zzb = false;
    private float zzc = 0.0f;
    private final java.util.concurrent.atomic.AtomicBoolean zzd = new java.util.concurrent.atomic.AtomicBoolean(false);

    public final synchronized float zza() {
        return this.zzc;
    }

    public final synchronized void zzb(boolean z, float f) {
        this.zzb = z;
        this.zzc = f;
    }

    public final synchronized void zzc(boolean z) {
        this.zza = z;
        this.zzd.set(true);
    }

    public final synchronized boolean zzd() {
        return this.zzb;
    }

    public final synchronized boolean zze(boolean z) {
        if (!this.zzd.get()) {
            return z;
        }
        return this.zza;
    }
}
