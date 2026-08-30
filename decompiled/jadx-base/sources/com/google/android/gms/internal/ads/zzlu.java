package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzlu {
    public final long zza;
    public final com.google.android.gms.internal.ads.zzbq zzb;
    public final int zzc;
    public final com.google.android.gms.internal.ads.zzug zzd;
    public final long zze;
    public final com.google.android.gms.internal.ads.zzbq zzf;
    public final int zzg;
    public final com.google.android.gms.internal.ads.zzug zzh;
    public final long zzi;
    public final long zzj;

    public zzlu(long j, com.google.android.gms.internal.ads.zzbq zzbqVar, int i, com.google.android.gms.internal.ads.zzug zzugVar, long j2, com.google.android.gms.internal.ads.zzbq zzbqVar2, int i2, com.google.android.gms.internal.ads.zzug zzugVar2, long j3, long j4) {
        this.zza = j;
        this.zzb = zzbqVar;
        this.zzc = i;
        this.zzd = zzugVar;
        this.zze = j2;
        this.zzf = zzbqVar2;
        this.zzg = i2;
        this.zzh = zzugVar2;
        this.zzi = j3;
        this.zzj = j4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzlu zzluVar = (com.google.android.gms.internal.ads.zzlu) obj;
            if (this.zza == zzluVar.zza && this.zzc == zzluVar.zzc && this.zze == zzluVar.zze && this.zzg == zzluVar.zzg && this.zzi == zzluVar.zzi && this.zzj == zzluVar.zzj && com.google.android.gms.internal.ads.zzfuk.zza(this.zzb, zzluVar.zzb) && com.google.android.gms.internal.ads.zzfuk.zza(this.zzd, zzluVar.zzd) && com.google.android.gms.internal.ads.zzfuk.zza(this.zzf, zzluVar.zzf) && com.google.android.gms.internal.ads.zzfuk.zza(this.zzh, zzluVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Long.valueOf(this.zza), this.zzb, java.lang.Integer.valueOf(this.zzc), this.zzd, java.lang.Long.valueOf(this.zze), this.zzf, java.lang.Integer.valueOf(this.zzg), this.zzh, java.lang.Long.valueOf(this.zzi), java.lang.Long.valueOf(this.zzj)});
    }
}
