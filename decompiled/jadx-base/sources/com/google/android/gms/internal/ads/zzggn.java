package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzggn {

    @javax.annotation.Nullable
    private java.lang.Integer zza = null;
    private com.google.android.gms.internal.ads.zzggo zzb = com.google.android.gms.internal.ads.zzggo.zzc;

    private zzggn() {
    }

    /* synthetic */ zzggn(com.google.android.gms.internal.ads.zzggp zzggpVar) {
    }

    public final com.google.android.gms.internal.ads.zzggn zzb(com.google.android.gms.internal.ads.zzggo zzggoVar) {
        this.zzb = zzggoVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzggq zzc() throws java.security.GeneralSecurityException {
        java.lang.Integer num = this.zza;
        if (num == null) {
            throw new java.security.GeneralSecurityException("Key size is not set");
        }
        if (this.zzb != null) {
            return new com.google.android.gms.internal.ads.zzggq(num.intValue(), this.zzb, null);
        }
        throw new java.security.GeneralSecurityException("Variant is not set");
    }

    public final com.google.android.gms.internal.ads.zzggn zza(int i) throws java.security.GeneralSecurityException {
        if (i != 16 && i != 32) {
            throw new java.security.InvalidAlgorithmParameterException(java.lang.String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", java.lang.Integer.valueOf(i)));
        }
        this.zza = java.lang.Integer.valueOf(i);
        return this;
    }
}
