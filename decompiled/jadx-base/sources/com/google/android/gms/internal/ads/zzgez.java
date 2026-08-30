package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgez {

    @javax.annotation.Nullable
    private com.google.android.gms.internal.ads.zzgfk zza = null;

    @javax.annotation.Nullable
    private com.google.android.gms.internal.ads.zzgvp zzb = null;

    @javax.annotation.Nullable
    private com.google.android.gms.internal.ads.zzgvp zzc = null;

    @javax.annotation.Nullable
    private java.lang.Integer zzd = null;

    private zzgez() {
    }

    /* synthetic */ zzgez(com.google.android.gms.internal.ads.zzgfa zzgfaVar) {
    }

    public final com.google.android.gms.internal.ads.zzgez zza(com.google.android.gms.internal.ads.zzgvp zzgvpVar) {
        this.zzb = zzgvpVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzgez zzb(com.google.android.gms.internal.ads.zzgvp zzgvpVar) {
        this.zzc = zzgvpVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzgez zzc(@javax.annotation.Nullable java.lang.Integer num) {
        this.zzd = num;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzgez zzd(com.google.android.gms.internal.ads.zzgfk zzgfkVar) {
        this.zza = zzgfkVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzgfb zze() throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzgvo zzgvoVarZzb;
        com.google.android.gms.internal.ads.zzgfk zzgfkVar = this.zza;
        if (zzgfkVar == null) {
            throw new java.security.GeneralSecurityException("Cannot build without parameters");
        }
        com.google.android.gms.internal.ads.zzgvp zzgvpVar = this.zzb;
        if (zzgvpVar == null || this.zzc == null) {
            throw new java.security.GeneralSecurityException("Cannot build without key material");
        }
        if (zzgfkVar.zzb() != zzgvpVar.zza()) {
            throw new java.security.GeneralSecurityException("AES key size mismatch");
        }
        if (zzgfkVar.zzc() != this.zzc.zza()) {
            throw new java.security.GeneralSecurityException("HMAC key size mismatch");
        }
        if (this.zza.zza() && this.zzd == null) {
            throw new java.security.GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzd != null) {
            throw new java.security.GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzh() == com.google.android.gms.internal.ads.zzgfi.zzc) {
            zzgvoVarZzb = com.google.android.gms.internal.ads.zzgml.zza;
        } else if (this.zza.zzh() == com.google.android.gms.internal.ads.zzgfi.zzb) {
            zzgvoVarZzb = com.google.android.gms.internal.ads.zzgml.zza(this.zzd.intValue());
        } else {
            if (this.zza.zzh() != com.google.android.gms.internal.ads.zzgfi.zza) {
                throw new java.lang.IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.zza.zzh()))));
            }
            zzgvoVarZzb = com.google.android.gms.internal.ads.zzgml.zzb(this.zzd.intValue());
        }
        return new com.google.android.gms.internal.ads.zzgfb(this.zza, this.zzb, this.zzc, zzgvoVarZzb, this.zzd, null);
    }
}
