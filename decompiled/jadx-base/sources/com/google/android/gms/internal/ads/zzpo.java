package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzpo {
    private final com.google.android.gms.internal.ads.zzpn zza;
    private int zzb;
    private long zzc;
    private long zzd;
    private long zze;
    private long zzf;

    public zzpo(android.media.AudioTrack audioTrack) {
        this.zza = new com.google.android.gms.internal.ads.zzpn(audioTrack);
        zzh(0);
    }

    private final void zzh(int i) {
        this.zzb = i;
        long j = 10000;
        if (i == 0) {
            this.zze = 0L;
            this.zzf = -1L;
            this.zzc = java.lang.System.nanoTime() / 1000;
        } else {
            if (i == 1) {
                this.zzd = 10000L;
                return;
            }
            j = (i == 2 || i == 3) ? 10000000L : 500000L;
        }
        this.zzd = j;
    }

    public final long zza() {
        return this.zza.zza();
    }

    public final long zzb() {
        return this.zza.zzb();
    }

    public final void zzc() {
        if (this.zzb == 4) {
            zzh(0);
        }
    }

    public final void zzd() {
        zzh(4);
    }

    public final void zze() {
        zzh(0);
    }

    public final boolean zzf() {
        return this.zzb == 2;
    }

    public final boolean zzg(long j) {
        if (j - this.zze < this.zzd) {
            return false;
        }
        this.zze = j;
        boolean zZzc = this.zza.zzc();
        int i = this.zzb;
        if (i == 0) {
            if (!zZzc) {
                if (j - this.zzc <= 500000) {
                    return false;
                }
                zzh(3);
                return false;
            }
            if (this.zza.zzb() < this.zzc) {
                return false;
            }
            this.zzf = this.zza.zza();
            zzh(1);
            return true;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return zZzc;
                }
                if (!zZzc) {
                    return false;
                }
                zzh(0);
                return true;
            }
            if (!zZzc) {
                zzh(0);
                return false;
            }
        } else {
            if (!zZzc) {
                zzh(0);
                return false;
            }
            if (this.zza.zza() > this.zzf) {
                zzh(2);
                return true;
            }
        }
        return true;
    }
}
