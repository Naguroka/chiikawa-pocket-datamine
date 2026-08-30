package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeag {
    private long zza = 0;
    private int zzb = 0;
    private long zzc = 0;
    private long zzd = 0;
    private long zze = 0;
    private final java.lang.Object zzf = new java.lang.Object();
    private final java.lang.Object zzg = new java.lang.Object();
    private final java.lang.Object zzh = new java.lang.Object();
    private final java.lang.Object zzi = new java.lang.Object();
    private final java.lang.Object zzj = new java.lang.Object();

    public final int zza() {
        int i;
        synchronized (this.zzg) {
            i = this.zzb;
        }
        return i;
    }

    public final synchronized long zzb() {
        long j;
        synchronized (this.zzj) {
            j = this.zze;
        }
        return j;
    }

    public final synchronized long zzc() {
        long j;
        synchronized (this.zzi) {
            j = this.zzd;
        }
        return j;
    }

    public final synchronized long zzd() {
        long j;
        synchronized (this.zzf) {
            j = this.zza;
        }
        return j;
    }

    public final long zze() {
        long j;
        synchronized (this.zzh) {
            j = this.zzc;
        }
        return j;
    }

    public final synchronized void zzf(long j) {
        synchronized (this.zzj) {
            this.zze = j;
        }
    }

    public final synchronized void zzg(long j) {
        synchronized (this.zzi) {
            this.zzd = j;
        }
    }

    public final synchronized void zzh(long j) {
        synchronized (this.zzf) {
            this.zza = j;
        }
    }

    public final void zzi(int i) {
        synchronized (this.zzg) {
            this.zzb = i;
        }
    }

    public final void zzj(long j) {
        synchronized (this.zzh) {
            this.zzc = j;
        }
    }
}
