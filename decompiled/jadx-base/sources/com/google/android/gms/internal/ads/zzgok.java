package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgok {

    @javax.annotation.Nullable
    private com.google.android.gms.internal.ads.zzgow zza = null;

    @javax.annotation.Nullable
    private com.google.android.gms.internal.ads.zzgvp zzb = null;

    @javax.annotation.Nullable
    private java.lang.Integer zzc = null;

    private zzgok() {
    }

    /* synthetic */ zzgok(com.google.android.gms.internal.ads.zzgol zzgolVar) {
    }

    public final com.google.android.gms.internal.ads.zzgok zza(@javax.annotation.Nullable java.lang.Integer num) {
        this.zzc = num;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzgok zzb(com.google.android.gms.internal.ads.zzgvp zzgvpVar) {
        this.zzb = zzgvpVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzgok zzc(com.google.android.gms.internal.ads.zzgow zzgowVar) {
        this.zza = zzgowVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzgom zzd() throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzgvp zzgvpVar;
        com.google.android.gms.internal.ads.zzgvo zzgvoVarZza;
        com.google.android.gms.internal.ads.zzgow zzgowVar = this.zza;
        if (zzgowVar == null || (zzgvpVar = this.zzb) == null) {
            throw new java.security.GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzgowVar.zzc() != zzgvpVar.zza()) {
            throw new java.security.GeneralSecurityException("Key size mismatch");
        }
        if (zzgowVar.zza() && this.zzc == null) {
            throw new java.security.GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new java.security.GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzg() == com.google.android.gms.internal.ads.zzgou.zzd) {
            zzgvoVarZza = com.google.android.gms.internal.ads.zzgml.zza;
        } else if (this.zza.zzg() == com.google.android.gms.internal.ads.zzgou.zzc || this.zza.zzg() == com.google.android.gms.internal.ads.zzgou.zzb) {
            zzgvoVarZza = com.google.android.gms.internal.ads.zzgml.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzg() != com.google.android.gms.internal.ads.zzgou.zza) {
                throw new java.lang.IllegalStateException("Unknown HmacParameters.Variant: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.zza.zzg()))));
            }
            zzgvoVarZza = com.google.android.gms.internal.ads.zzgml.zzb(this.zzc.intValue());
        }
        return new com.google.android.gms.internal.ads.zzgom(this.zza, this.zzb, zzgvoVarZza, this.zzc, null);
    }
}
