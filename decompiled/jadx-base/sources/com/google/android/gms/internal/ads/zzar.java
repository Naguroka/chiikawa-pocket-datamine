package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzar {
    public final java.lang.String zza;
    public final com.google.android.gms.internal.ads.zzam zzb;
    public final com.google.android.gms.internal.ads.zzal zzc;
    public final com.google.android.gms.internal.ads.zzav zzd;
    public final com.google.android.gms.internal.ads.zzah zze;
    public final com.google.android.gms.internal.ads.zzao zzf;

    static {
        new com.google.android.gms.internal.ads.zzaf().zzc();
        java.lang.Integer.toString(0, 36);
        java.lang.Integer.toString(1, 36);
        java.lang.Integer.toString(2, 36);
        java.lang.Integer.toString(3, 36);
        java.lang.Integer.toString(4, 36);
        java.lang.Integer.toString(5, 36);
    }

    /* synthetic */ zzar(java.lang.String str, com.google.android.gms.internal.ads.zzai zzaiVar, com.google.android.gms.internal.ads.zzam zzamVar, com.google.android.gms.internal.ads.zzal zzalVar, com.google.android.gms.internal.ads.zzav zzavVar, com.google.android.gms.internal.ads.zzao zzaoVar, com.google.android.gms.internal.ads.zzaq zzaqVar) {
        this.zza = str;
        this.zzb = zzamVar;
        this.zzc = zzalVar;
        this.zzd = zzavVar;
        this.zze = zzaiVar;
        this.zzf = zzaoVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.zzar)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzar zzarVar = (com.google.android.gms.internal.ads.zzar) obj;
        return java.util.Objects.equals(this.zza, zzarVar.zza) && this.zze.equals(zzarVar.zze) && java.util.Objects.equals(this.zzb, zzarVar.zzb) && java.util.Objects.equals(this.zzc, zzarVar.zzc) && java.util.Objects.equals(this.zzd, zzarVar.zzd) && java.util.Objects.equals(this.zzf, zzarVar.zzf);
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() * 31;
        com.google.android.gms.internal.ads.zzam zzamVar = this.zzb;
        return (((((((iHashCode + (zzamVar != null ? zzamVar.hashCode() : 0)) * 31) + this.zzc.hashCode()) * 31) + this.zze.hashCode()) * 31) + this.zzd.hashCode()) * 31;
    }
}
