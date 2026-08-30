package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgoc {

    @javax.annotation.Nullable
    private java.lang.Integer zza = null;

    @javax.annotation.Nullable
    private java.lang.Integer zzb = null;
    private com.google.android.gms.internal.ads.zzgod zzc = com.google.android.gms.internal.ads.zzgod.zzd;

    private zzgoc() {
    }

    /* synthetic */ zzgoc(com.google.android.gms.internal.ads.zzgoe zzgoeVar) {
    }

    public final com.google.android.gms.internal.ads.zzgoc zzc(com.google.android.gms.internal.ads.zzgod zzgodVar) {
        this.zzc = zzgodVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzgof zzd() throws java.security.GeneralSecurityException {
        java.lang.Integer num = this.zza;
        if (num == null) {
            throw new java.security.GeneralSecurityException("key size not set");
        }
        if (this.zzb == null) {
            throw new java.security.GeneralSecurityException("tag size not set");
        }
        if (this.zzc != null) {
            return new com.google.android.gms.internal.ads.zzgof(num.intValue(), this.zzb.intValue(), this.zzc, null);
        }
        throw new java.security.GeneralSecurityException("variant not set");
    }

    public final com.google.android.gms.internal.ads.zzgoc zza(int i) throws java.security.GeneralSecurityException {
        if (i != 16 && i != 32) {
            throw new java.security.InvalidAlgorithmParameterException(java.lang.String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", java.lang.Integer.valueOf(i * 8)));
        }
        this.zza = java.lang.Integer.valueOf(i);
        return this;
    }

    public final com.google.android.gms.internal.ads.zzgoc zzb(int i) throws java.security.GeneralSecurityException {
        if (i >= 10 && i <= 16) {
            this.zzb = java.lang.Integer.valueOf(i);
            return this;
        }
        throw new java.security.GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i);
    }
}
