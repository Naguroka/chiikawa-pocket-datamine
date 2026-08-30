package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgif extends com.google.android.gms.internal.ads.zzget {
    private final com.google.android.gms.internal.ads.zzgik zza;
    private final com.google.android.gms.internal.ads.zzgvp zzb;
    private final com.google.android.gms.internal.ads.zzgvo zzc;

    @javax.annotation.Nullable
    private final java.lang.Integer zzd;

    private zzgif(com.google.android.gms.internal.ads.zzgik zzgikVar, com.google.android.gms.internal.ads.zzgvp zzgvpVar, com.google.android.gms.internal.ads.zzgvo zzgvoVar, @javax.annotation.Nullable java.lang.Integer num) {
        this.zza = zzgikVar;
        this.zzb = zzgvpVar;
        this.zzc = zzgvoVar;
        this.zzd = num;
    }

    public static com.google.android.gms.internal.ads.zzgif zza(com.google.android.gms.internal.ads.zzgik zzgikVar, com.google.android.gms.internal.ads.zzgvp zzgvpVar, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzgvo zzgvoVarZzb;
        com.google.android.gms.internal.ads.zzgij zzgijVarZzc = zzgikVar.zzc();
        com.google.android.gms.internal.ads.zzgij zzgijVar = com.google.android.gms.internal.ads.zzgij.zzb;
        if (zzgijVarZzc != zzgijVar && num == null) {
            throw new java.security.GeneralSecurityException("For given Variant " + zzgikVar.zzc().toString() + " the value of idRequirement must be non-null");
        }
        if (zzgikVar.zzc() == zzgijVar && num != null) {
            throw new java.security.GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzgvpVar.zza() != 32) {
            throw new java.security.GeneralSecurityException("XAesGcmKey key must be constructed with key of length 32 bytes, not " + zzgvpVar.zza());
        }
        if (zzgikVar.zzc() == zzgijVar) {
            zzgvoVarZzb = com.google.android.gms.internal.ads.zzgml.zza;
        } else {
            if (zzgikVar.zzc() != com.google.android.gms.internal.ads.zzgij.zza) {
                throw new java.lang.IllegalStateException("Unknown Variant: ".concat(zzgikVar.zzc().toString()));
            }
            zzgvoVarZzb = com.google.android.gms.internal.ads.zzgml.zzb(num.intValue());
        }
        return new com.google.android.gms.internal.ads.zzgif(zzgikVar, zzgvpVar, zzgvoVarZzb, num);
    }

    public final com.google.android.gms.internal.ads.zzgik zzb() {
        return this.zza;
    }

    public final com.google.android.gms.internal.ads.zzgvo zzc() {
        return this.zzc;
    }

    public final com.google.android.gms.internal.ads.zzgvp zzd() {
        return this.zzb;
    }

    @javax.annotation.Nullable
    public final java.lang.Integer zze() {
        return this.zzd;
    }
}
