package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgnv {

    @javax.annotation.Nullable
    private com.google.android.gms.internal.ads.zzgof zza = null;

    @javax.annotation.Nullable
    private com.google.android.gms.internal.ads.zzgvp zzb = null;

    @javax.annotation.Nullable
    private java.lang.Integer zzc = null;

    private zzgnv() {
    }

    /* synthetic */ zzgnv(com.google.android.gms.internal.ads.zzgnw zzgnwVar) {
    }

    public final com.google.android.gms.internal.ads.zzgnv zza(com.google.android.gms.internal.ads.zzgvp zzgvpVar) throws java.security.GeneralSecurityException {
        this.zzb = zzgvpVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzgnv zzb(@javax.annotation.Nullable java.lang.Integer num) {
        this.zzc = num;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzgnv zzc(com.google.android.gms.internal.ads.zzgof zzgofVar) {
        this.zza = zzgofVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzgnx zzd() throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzgvp zzgvpVar;
        com.google.android.gms.internal.ads.zzgvo zzgvoVarZza;
        com.google.android.gms.internal.ads.zzgof zzgofVar = this.zza;
        if (zzgofVar == null || (zzgvpVar = this.zzb) == null) {
            throw new java.security.GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzgofVar.zzc() != zzgvpVar.zza()) {
            throw new java.security.GeneralSecurityException("Key size mismatch");
        }
        if (zzgofVar.zza() && this.zzc == null) {
            throw new java.security.GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new java.security.GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzf() == com.google.android.gms.internal.ads.zzgod.zzd) {
            zzgvoVarZza = com.google.android.gms.internal.ads.zzgml.zza;
        } else if (this.zza.zzf() == com.google.android.gms.internal.ads.zzgod.zzc || this.zza.zzf() == com.google.android.gms.internal.ads.zzgod.zzb) {
            zzgvoVarZza = com.google.android.gms.internal.ads.zzgml.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzf() != com.google.android.gms.internal.ads.zzgod.zza) {
                throw new java.lang.IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.zza.zzf()))));
            }
            zzgvoVarZza = com.google.android.gms.internal.ads.zzgml.zzb(this.zzc.intValue());
        }
        return new com.google.android.gms.internal.ads.zzgnx(this.zza, this.zzb, zzgvoVarZza, this.zzc, null);
    }
}
