package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzghm extends com.google.android.gms.internal.ads.zzget {
    private final com.google.android.gms.internal.ads.zzghr zza;
    private final com.google.android.gms.internal.ads.zzgvo zzb;

    @javax.annotation.Nullable
    private final java.lang.Integer zzc;

    private zzghm(com.google.android.gms.internal.ads.zzghr zzghrVar, com.google.android.gms.internal.ads.zzgvo zzgvoVar, @javax.annotation.Nullable java.lang.Integer num) {
        this.zza = zzghrVar;
        this.zzb = zzgvoVar;
        this.zzc = num;
    }

    public static com.google.android.gms.internal.ads.zzghm zza(com.google.android.gms.internal.ads.zzghr zzghrVar, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzgvo zzgvoVarZzb;
        if (zzghrVar.zzc() == com.google.android.gms.internal.ads.zzghp.zzb) {
            if (num != null) {
                throw new java.security.GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            zzgvoVarZzb = com.google.android.gms.internal.ads.zzgml.zza;
        } else {
            if (zzghrVar.zzc() != com.google.android.gms.internal.ads.zzghp.zza) {
                throw new java.security.GeneralSecurityException("Unknown Variant: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(zzghrVar.zzc()))));
            }
            if (num == null) {
                throw new java.security.GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            zzgvoVarZzb = com.google.android.gms.internal.ads.zzgml.zzb(num.intValue());
        }
        return new com.google.android.gms.internal.ads.zzghm(zzghrVar, zzgvoVarZzb, num);
    }

    public final com.google.android.gms.internal.ads.zzghr zzb() {
        return this.zza;
    }

    public final com.google.android.gms.internal.ads.zzgvo zzc() {
        return this.zzb;
    }

    public final java.lang.Integer zzd() {
        return this.zzc;
    }
}
