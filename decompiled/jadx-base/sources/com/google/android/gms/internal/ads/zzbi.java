package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbi {
    public final java.lang.Object zza;
    public final int zzb;
    public final com.google.android.gms.internal.ads.zzar zzc;
    public final java.lang.Object zzd;
    public final int zze;
    public final long zzf;
    public final long zzg;
    public final int zzh;
    public final int zzi;

    static {
        java.lang.Integer.toString(0, 36);
        java.lang.Integer.toString(1, 36);
        java.lang.Integer.toString(2, 36);
        java.lang.Integer.toString(3, 36);
        java.lang.Integer.toString(4, 36);
        java.lang.Integer.toString(5, 36);
        java.lang.Integer.toString(6, 36);
    }

    public zzbi(java.lang.Object obj, int i, com.google.android.gms.internal.ads.zzar zzarVar, java.lang.Object obj2, int i2, long j, long j2, int i3, int i4) {
        this.zza = obj;
        this.zzb = i;
        this.zzc = zzarVar;
        this.zzd = obj2;
        this.zze = i2;
        this.zzf = j;
        this.zzg = j2;
        this.zzh = i3;
        this.zzi = i4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzbi zzbiVar = (com.google.android.gms.internal.ads.zzbi) obj;
            if (this.zzb == zzbiVar.zzb && this.zze == zzbiVar.zze && this.zzf == zzbiVar.zzf && this.zzg == zzbiVar.zzg && this.zzh == zzbiVar.zzh && this.zzi == zzbiVar.zzi && com.google.android.gms.internal.ads.zzfuk.zza(this.zzc, zzbiVar.zzc) && com.google.android.gms.internal.ads.zzfuk.zza(this.zza, zzbiVar.zza) && com.google.android.gms.internal.ads.zzfuk.zza(this.zzd, zzbiVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.zza, java.lang.Integer.valueOf(this.zzb), this.zzc, this.zzd, java.lang.Integer.valueOf(this.zze), java.lang.Long.valueOf(this.zzf), java.lang.Long.valueOf(this.zzg), java.lang.Integer.valueOf(this.zzh), java.lang.Integer.valueOf(this.zzi)});
    }
}
