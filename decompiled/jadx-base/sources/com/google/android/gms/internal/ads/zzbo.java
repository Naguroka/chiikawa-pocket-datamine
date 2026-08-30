package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbo {
    public java.lang.Object zza;
    public java.lang.Object zzb;
    public int zzc;
    public long zzd;
    public long zze;
    public boolean zzf;
    public com.google.android.gms.internal.ads.zzb zzg = com.google.android.gms.internal.ads.zzb.zza;

    static {
        java.lang.Integer.toString(0, 36);
        java.lang.Integer.toString(1, 36);
        java.lang.Integer.toString(2, 36);
        java.lang.Integer.toString(3, 36);
        java.lang.Integer.toString(4, 36);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass().equals(obj.getClass())) {
            com.google.android.gms.internal.ads.zzbo zzboVar = (com.google.android.gms.internal.ads.zzbo) obj;
            if (java.util.Objects.equals(this.zza, zzboVar.zza) && java.util.Objects.equals(this.zzb, zzboVar.zzb) && this.zzc == zzboVar.zzc && this.zzd == zzboVar.zzd && this.zzf == zzboVar.zzf && java.util.Objects.equals(this.zzg, zzboVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int zza(int i) {
        return this.zzg.zza(i).zzb;
    }

    public final int zzb() {
        int i = this.zzg.zzb;
        return 0;
    }

    public final int zzc(long j) {
        return -1;
    }

    public final int zzd(long j) {
        this.zzg.zzb(-1);
        return -1;
    }

    public final int zze(int i) {
        return this.zzg.zza(i).zza(-1);
    }

    public final long zzf(int i, int i2) {
        com.google.android.gms.internal.ads.zza zzaVarZza = this.zzg.zza(i);
        return zzaVarZza.zzb != -1 ? zzaVarZza.zzf[i2] : androidx.media3.common.C.TIME_UNSET;
    }

    public final long zzg(int i) {
        long j = this.zzg.zza(i).zza;
        return 0L;
    }

    public final long zzh() {
        long j = this.zzg.zzc;
        return 0L;
    }

    public final com.google.android.gms.internal.ads.zzbo zzi(java.lang.Object obj, java.lang.Object obj2, int i, long j, long j2, com.google.android.gms.internal.ads.zzb zzbVar, boolean z) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = i;
        this.zzd = j;
        this.zze = 0L;
        this.zzg = zzbVar;
        this.zzf = z;
        return this;
    }

    public final boolean zzj(int i) {
        zzb();
        if (i != -1) {
            return false;
        }
        this.zzg.zzb(-1);
        return false;
    }

    public final boolean zzk(int i) {
        boolean z = this.zzg.zza(i).zzh;
        return false;
    }

    public final int hashCode() {
        java.lang.Object obj = this.zza;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        java.lang.Object obj2 = this.zzb;
        int iHashCode2 = ((((iHashCode + 217) * 31) + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.zzc;
        long j = this.zzd;
        return (((((iHashCode2 * 31) + ((int) (j ^ (j >>> 32)))) * 961) + (this.zzf ? 1 : 0)) * 31) + this.zzg.hashCode();
    }
}
