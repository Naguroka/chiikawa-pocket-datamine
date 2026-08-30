package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgfl {

    @javax.annotation.Nullable
    private com.google.android.gms.internal.ads.zzgfu zza = null;

    @javax.annotation.Nullable
    private com.google.android.gms.internal.ads.zzgvp zzb = null;

    @javax.annotation.Nullable
    private java.lang.Integer zzc = null;

    private zzgfl() {
    }

    /* synthetic */ zzgfl(com.google.android.gms.internal.ads.zzgfm zzgfmVar) {
    }

    public final com.google.android.gms.internal.ads.zzgfl zza(@javax.annotation.Nullable java.lang.Integer num) {
        this.zzc = num;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzgfl zzb(com.google.android.gms.internal.ads.zzgvp zzgvpVar) {
        this.zzb = zzgvpVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzgfl zzc(com.google.android.gms.internal.ads.zzgfu zzgfuVar) {
        this.zza = zzgfuVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzgfn zzd() throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzgvp zzgvpVar;
        com.google.android.gms.internal.ads.zzgvo zzgvoVarZzb;
        com.google.android.gms.internal.ads.zzgfu zzgfuVar = this.zza;
        if (zzgfuVar == null || (zzgvpVar = this.zzb) == null) {
            throw new java.security.GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzgfuVar.zzc() != zzgvpVar.zza()) {
            throw new java.security.GeneralSecurityException("Key size mismatch");
        }
        if (zzgfuVar.zza() && this.zzc == null) {
            throw new java.security.GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new java.security.GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zze() == com.google.android.gms.internal.ads.zzgfs.zzc) {
            zzgvoVarZzb = com.google.android.gms.internal.ads.zzgml.zza;
        } else if (this.zza.zze() == com.google.android.gms.internal.ads.zzgfs.zzb) {
            zzgvoVarZzb = com.google.android.gms.internal.ads.zzgml.zza(this.zzc.intValue());
        } else {
            if (this.zza.zze() != com.google.android.gms.internal.ads.zzgfs.zza) {
                throw new java.lang.IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.zza.zze()))));
            }
            zzgvoVarZzb = com.google.android.gms.internal.ads.zzgml.zzb(this.zzc.intValue());
        }
        return new com.google.android.gms.internal.ads.zzgfn(this.zza, this.zzb, zzgvoVarZzb, this.zzc, null);
    }
}
