package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzggg {

    @javax.annotation.Nullable
    private com.google.android.gms.internal.ads.zzggq zza = null;

    @javax.annotation.Nullable
    private com.google.android.gms.internal.ads.zzgvp zzb = null;

    @javax.annotation.Nullable
    private java.lang.Integer zzc = null;

    private zzggg() {
    }

    /* synthetic */ zzggg(com.google.android.gms.internal.ads.zzggh zzgghVar) {
    }

    public final com.google.android.gms.internal.ads.zzggg zza(@javax.annotation.Nullable java.lang.Integer num) {
        this.zzc = num;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzggg zzb(com.google.android.gms.internal.ads.zzgvp zzgvpVar) {
        this.zzb = zzgvpVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzggg zzc(com.google.android.gms.internal.ads.zzggq zzggqVar) {
        this.zza = zzggqVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzggi zzd() throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzgvp zzgvpVar;
        com.google.android.gms.internal.ads.zzgvo zzgvoVarZzb;
        com.google.android.gms.internal.ads.zzggq zzggqVar = this.zza;
        if (zzggqVar == null || (zzgvpVar = this.zzb) == null) {
            throw new java.security.GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzggqVar.zzb() != zzgvpVar.zza()) {
            throw new java.security.GeneralSecurityException("Key size mismatch");
        }
        if (zzggqVar.zza() && this.zzc == null) {
            throw new java.security.GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new java.security.GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzd() == com.google.android.gms.internal.ads.zzggo.zzc) {
            zzgvoVarZzb = com.google.android.gms.internal.ads.zzgml.zza;
        } else if (this.zza.zzd() == com.google.android.gms.internal.ads.zzggo.zzb) {
            zzgvoVarZzb = com.google.android.gms.internal.ads.zzgml.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzd() != com.google.android.gms.internal.ads.zzggo.zza) {
                throw new java.lang.IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.zza.zzd()))));
            }
            zzgvoVarZzb = com.google.android.gms.internal.ads.zzgml.zzb(this.zzc.intValue());
        }
        return new com.google.android.gms.internal.ads.zzggi(this.zza, this.zzb, zzgvoVarZzb, this.zzc, null);
    }
}
