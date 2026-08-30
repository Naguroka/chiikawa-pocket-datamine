package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgow extends com.google.android.gms.internal.ads.zzgoz {
    private final int zza;
    private final int zzb;
    private final com.google.android.gms.internal.ads.zzgou zzc;
    private final com.google.android.gms.internal.ads.zzgot zzd;

    /* synthetic */ zzgow(int i, int i2, com.google.android.gms.internal.ads.zzgou zzgouVar, com.google.android.gms.internal.ads.zzgot zzgotVar, com.google.android.gms.internal.ads.zzgov zzgovVar) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = zzgouVar;
        this.zzd = zzgotVar;
    }

    public static com.google.android.gms.internal.ads.zzgos zze() {
        return new com.google.android.gms.internal.ads.zzgos(null);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.zzgow)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzgow zzgowVar = (com.google.android.gms.internal.ads.zzgow) obj;
        return zzgowVar.zza == this.zza && zzgowVar.zzd() == zzd() && zzgowVar.zzc == this.zzc && zzgowVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return java.util.Objects.hash(com.google.android.gms.internal.ads.zzgow.class, java.lang.Integer.valueOf(this.zza), java.lang.Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final java.lang.String toString() {
        com.google.android.gms.internal.ads.zzgot zzgotVar = this.zzd;
        return "HMAC Parameters (variant: " + java.lang.String.valueOf(this.zzc) + ", hashType: " + java.lang.String.valueOf(zzgotVar) + ", " + this.zzb + "-byte tags, and " + this.zza + "-byte key)";
    }

    @Override // com.google.android.gms.internal.ads.zzgek
    public final boolean zza() {
        return this.zzc != com.google.android.gms.internal.ads.zzgou.zzd;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        com.google.android.gms.internal.ads.zzgou zzgouVar = this.zzc;
        if (zzgouVar == com.google.android.gms.internal.ads.zzgou.zzd) {
            return this.zzb;
        }
        if (zzgouVar == com.google.android.gms.internal.ads.zzgou.zza || zzgouVar == com.google.android.gms.internal.ads.zzgou.zzb || zzgouVar == com.google.android.gms.internal.ads.zzgou.zzc) {
            return this.zzb + 5;
        }
        throw new java.lang.IllegalStateException("Unknown variant");
    }

    public final com.google.android.gms.internal.ads.zzgot zzf() {
        return this.zzd;
    }

    public final com.google.android.gms.internal.ads.zzgou zzg() {
        return this.zzc;
    }
}
