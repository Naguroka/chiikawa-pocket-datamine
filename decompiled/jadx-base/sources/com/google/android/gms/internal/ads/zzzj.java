package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzzj {
    private boolean zzc;
    private int zze;
    private com.google.android.gms.internal.ads.zzzi zza = new com.google.android.gms.internal.ads.zzzi();
    private com.google.android.gms.internal.ads.zzzi zzb = new com.google.android.gms.internal.ads.zzzi();
    private long zzd = androidx.media3.common.C.TIME_UNSET;

    public final float zza() {
        if (this.zza.zzf()) {
            return (float) (1.0E9d / this.zza.zza());
        }
        return -1.0f;
    }

    public final int zzb() {
        return this.zze;
    }

    public final long zzc() {
        return this.zza.zzf() ? this.zza.zza() : androidx.media3.common.C.TIME_UNSET;
    }

    public final long zzd() {
        return this.zza.zzf() ? this.zza.zzb() : androidx.media3.common.C.TIME_UNSET;
    }

    public final void zze(long j) {
        this.zza.zzc(j);
        if (this.zza.zzf()) {
            this.zzc = false;
        } else if (this.zzd != androidx.media3.common.C.TIME_UNSET) {
            if (!this.zzc || this.zzb.zze()) {
                this.zzb.zzd();
                this.zzb.zzc(this.zzd);
            }
            this.zzc = true;
            this.zzb.zzc(j);
        }
        if (this.zzc && this.zzb.zzf()) {
            com.google.android.gms.internal.ads.zzzi zzziVar = this.zza;
            this.zza = this.zzb;
            this.zzb = zzziVar;
            this.zzc = false;
        }
        this.zzd = j;
        this.zze = this.zza.zzf() ? 0 : this.zze + 1;
    }

    public final void zzf() {
        this.zza.zzd();
        this.zzb.zzd();
        this.zzc = false;
        this.zzd = androidx.media3.common.C.TIME_UNSET;
        this.zze = 0;
    }

    public final boolean zzg() {
        return this.zza.zzf();
    }
}
