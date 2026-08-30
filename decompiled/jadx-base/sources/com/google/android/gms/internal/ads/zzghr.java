package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzghr extends com.google.android.gms.internal.ads.zzgeu {
    private final com.google.android.gms.internal.ads.zzghp zza;
    private final java.lang.String zzb;
    private final com.google.android.gms.internal.ads.zzgho zzc;
    private final com.google.android.gms.internal.ads.zzgeu zzd;

    /* synthetic */ zzghr(com.google.android.gms.internal.ads.zzghp zzghpVar, java.lang.String str, com.google.android.gms.internal.ads.zzgho zzghoVar, com.google.android.gms.internal.ads.zzgeu zzgeuVar, com.google.android.gms.internal.ads.zzghq zzghqVar) {
        this.zza = zzghpVar;
        this.zzb = str;
        this.zzc = zzghoVar;
        this.zzd = zzgeuVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.zzghr)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzghr zzghrVar = (com.google.android.gms.internal.ads.zzghr) obj;
        return zzghrVar.zzc.equals(this.zzc) && zzghrVar.zzd.equals(this.zzd) && zzghrVar.zzb.equals(this.zzb) && zzghrVar.zza.equals(this.zza);
    }

    public final int hashCode() {
        return java.util.Objects.hash(com.google.android.gms.internal.ads.zzghr.class, this.zzb, this.zzc, this.zzd, this.zza);
    }

    public final java.lang.String toString() {
        com.google.android.gms.internal.ads.zzghp zzghpVar = this.zza;
        com.google.android.gms.internal.ads.zzgeu zzgeuVar = this.zzd;
        return "LegacyKmsEnvelopeAead Parameters (kekUri: " + this.zzb + ", dekParsingStrategy: " + java.lang.String.valueOf(this.zzc) + ", dekParametersForNewKeys: " + java.lang.String.valueOf(zzgeuVar) + ", variant: " + java.lang.String.valueOf(zzghpVar) + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzgek
    public final boolean zza() {
        return this.zza != com.google.android.gms.internal.ads.zzghp.zzb;
    }

    public final com.google.android.gms.internal.ads.zzgeu zzb() {
        return this.zzd;
    }

    public final com.google.android.gms.internal.ads.zzghp zzc() {
        return this.zza;
    }

    public final java.lang.String zzd() {
        return this.zzb;
    }
}
