package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzggr extends com.google.android.gms.internal.ads.zzget {
    private final com.google.android.gms.internal.ads.zzggw zza;
    private final com.google.android.gms.internal.ads.zzgvp zzb;
    private final com.google.android.gms.internal.ads.zzgvo zzc;

    @javax.annotation.Nullable
    private final java.lang.Integer zzd;

    private zzggr(com.google.android.gms.internal.ads.zzggw zzggwVar, com.google.android.gms.internal.ads.zzgvp zzgvpVar, com.google.android.gms.internal.ads.zzgvo zzgvoVar, @javax.annotation.Nullable java.lang.Integer num) {
        this.zza = zzggwVar;
        this.zzb = zzgvpVar;
        this.zzc = zzgvoVar;
        this.zzd = num;
    }

    public static com.google.android.gms.internal.ads.zzggr zza(com.google.android.gms.internal.ads.zzggv zzggvVar, com.google.android.gms.internal.ads.zzgvp zzgvpVar, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzgvo zzgvoVarZzb;
        com.google.android.gms.internal.ads.zzggv zzggvVar2 = com.google.android.gms.internal.ads.zzggv.zzc;
        if (zzggvVar != zzggvVar2 && num == null) {
            throw new java.security.GeneralSecurityException("For given Variant " + zzggvVar.toString() + " the value of idRequirement must be non-null");
        }
        if (zzggvVar == zzggvVar2 && num != null) {
            throw new java.security.GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzgvpVar.zza() != 32) {
            throw new java.security.GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + zzgvpVar.zza());
        }
        com.google.android.gms.internal.ads.zzggw zzggwVarZzc = com.google.android.gms.internal.ads.zzggw.zzc(zzggvVar);
        if (zzggwVarZzc.zzb() == zzggvVar2) {
            zzgvoVarZzb = com.google.android.gms.internal.ads.zzgml.zza;
        } else if (zzggwVarZzc.zzb() == com.google.android.gms.internal.ads.zzggv.zzb) {
            zzgvoVarZzb = com.google.android.gms.internal.ads.zzgml.zza(num.intValue());
        } else {
            if (zzggwVarZzc.zzb() != com.google.android.gms.internal.ads.zzggv.zza) {
                throw new java.lang.IllegalStateException("Unknown Variant: ".concat(zzggwVarZzc.zzb().toString()));
            }
            zzgvoVarZzb = com.google.android.gms.internal.ads.zzgml.zzb(num.intValue());
        }
        return new com.google.android.gms.internal.ads.zzggr(zzggwVarZzc, zzgvpVar, zzgvoVarZzb, num);
    }

    public final com.google.android.gms.internal.ads.zzggw zzb() {
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
