package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzggc {

    @javax.annotation.Nullable
    private java.lang.Integer zza = null;

    @javax.annotation.Nullable
    private java.lang.Integer zzb = null;

    @javax.annotation.Nullable
    private java.lang.Integer zzc = null;
    private com.google.android.gms.internal.ads.zzggd zzd = com.google.android.gms.internal.ads.zzggd.zzc;

    private zzggc() {
    }

    /* synthetic */ zzggc(com.google.android.gms.internal.ads.zzgge zzggeVar) {
    }

    public final com.google.android.gms.internal.ads.zzggc zza(int i) throws java.security.GeneralSecurityException {
        this.zzb = 12;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzggc zzc(int i) throws java.security.GeneralSecurityException {
        this.zzc = 16;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzggc zzd(com.google.android.gms.internal.ads.zzggd zzggdVar) {
        this.zzd = zzggdVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzggf zze() throws java.security.GeneralSecurityException {
        java.lang.Integer num = this.zza;
        if (num == null) {
            throw new java.security.GeneralSecurityException("Key size is not set");
        }
        if (this.zzd == null) {
            throw new java.security.GeneralSecurityException("Variant is not set");
        }
        if (this.zzb == null) {
            throw new java.security.GeneralSecurityException("IV size is not set");
        }
        if (this.zzc == null) {
            throw new java.security.GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = num.intValue();
        this.zzb.intValue();
        this.zzc.intValue();
        return new com.google.android.gms.internal.ads.zzggf(iIntValue, 12, 16, this.zzd, null);
    }

    public final com.google.android.gms.internal.ads.zzggc zzb(int i) throws java.security.GeneralSecurityException {
        if (i != 16 && i != 24 && i != 32) {
            throw new java.security.InvalidAlgorithmParameterException(java.lang.String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", java.lang.Integer.valueOf(i)));
        }
        this.zza = java.lang.Integer.valueOf(i);
        return this;
    }
}
