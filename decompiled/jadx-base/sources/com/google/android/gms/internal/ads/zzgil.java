package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgil extends com.google.android.gms.internal.ads.zzget {
    private final com.google.android.gms.internal.ads.zzgir zza;
    private final com.google.android.gms.internal.ads.zzgvp zzb;
    private final com.google.android.gms.internal.ads.zzgvo zzc;

    @javax.annotation.Nullable
    private final java.lang.Integer zzd;

    private zzgil(com.google.android.gms.internal.ads.zzgir zzgirVar, com.google.android.gms.internal.ads.zzgvp zzgvpVar, com.google.android.gms.internal.ads.zzgvo zzgvoVar, @javax.annotation.Nullable java.lang.Integer num) {
        this.zza = zzgirVar;
        this.zzb = zzgvpVar;
        this.zzc = zzgvoVar;
        this.zzd = num;
    }

    public static com.google.android.gms.internal.ads.zzgil zza(com.google.android.gms.internal.ads.zzgiq zzgiqVar, com.google.android.gms.internal.ads.zzgvp zzgvpVar, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzgvo zzgvoVarZzb;
        com.google.android.gms.internal.ads.zzgiq zzgiqVar2 = com.google.android.gms.internal.ads.zzgiq.zzc;
        if (zzgiqVar != zzgiqVar2 && num == null) {
            throw new java.security.GeneralSecurityException("For given Variant " + zzgiqVar.toString() + " the value of idRequirement must be non-null");
        }
        if (zzgiqVar == zzgiqVar2 && num != null) {
            throw new java.security.GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzgvpVar.zza() != 32) {
            throw new java.security.GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + zzgvpVar.zza());
        }
        com.google.android.gms.internal.ads.zzgir zzgirVarZzc = com.google.android.gms.internal.ads.zzgir.zzc(zzgiqVar);
        if (zzgirVarZzc.zzb() == zzgiqVar2) {
            zzgvoVarZzb = com.google.android.gms.internal.ads.zzgml.zza;
        } else if (zzgirVarZzc.zzb() == com.google.android.gms.internal.ads.zzgiq.zzb) {
            zzgvoVarZzb = com.google.android.gms.internal.ads.zzgml.zza(num.intValue());
        } else {
            if (zzgirVarZzc.zzb() != com.google.android.gms.internal.ads.zzgiq.zza) {
                throw new java.lang.IllegalStateException("Unknown Variant: ".concat(zzgirVarZzc.zzb().toString()));
            }
            zzgvoVarZzb = com.google.android.gms.internal.ads.zzgml.zzb(num.intValue());
        }
        return new com.google.android.gms.internal.ads.zzgil(zzgirVarZzc, zzgvpVar, zzgvoVarZzb, num);
    }

    public final com.google.android.gms.internal.ads.zzgir zzb() {
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
