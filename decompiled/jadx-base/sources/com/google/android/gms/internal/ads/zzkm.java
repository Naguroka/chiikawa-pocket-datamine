package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzkm {
    public final com.google.android.gms.internal.ads.zzug zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;

    zzkm(com.google.android.gms.internal.ads.zzug zzugVar, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = true;
        com.google.android.gms.internal.ads.zzcw.zzd(!z4 || z2);
        if (z3 && !z2) {
            z5 = false;
        }
        com.google.android.gms.internal.ads.zzcw.zzd(z5);
        this.zza = zzugVar;
        this.zzb = j;
        this.zzc = j2;
        this.zzd = j3;
        this.zze = j4;
        this.zzf = false;
        this.zzg = z2;
        this.zzh = z3;
        this.zzi = z4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzkm zzkmVar = (com.google.android.gms.internal.ads.zzkm) obj;
            if (this.zzb == zzkmVar.zzb && this.zzc == zzkmVar.zzc && this.zzd == zzkmVar.zzd && this.zze == zzkmVar.zze && this.zzg == zzkmVar.zzg && this.zzh == zzkmVar.zzh && this.zzi == zzkmVar.zzi && java.util.Objects.equals(this.zza, zzkmVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() + com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        long j = this.zze;
        long j2 = this.zzd;
        return (((((((((((((iHashCode * 31) + ((int) this.zzb)) * 31) + ((int) this.zzc)) * 31) + ((int) j2)) * 31) + ((int) j)) * 961) + (this.zzg ? 1 : 0)) * 31) + (this.zzh ? 1 : 0)) * 31) + (this.zzi ? 1 : 0);
    }

    public final com.google.android.gms.internal.ads.zzkm zza(long j) {
        return j == this.zzc ? this : new com.google.android.gms.internal.ads.zzkm(this.zza, this.zzb, j, this.zzd, this.zze, false, this.zzg, this.zzh, this.zzi);
    }

    public final com.google.android.gms.internal.ads.zzkm zzb(long j) {
        return j == this.zzb ? this : new com.google.android.gms.internal.ads.zzkm(this.zza, j, this.zzc, this.zzd, this.zze, false, this.zzg, this.zzh, this.zzi);
    }
}
