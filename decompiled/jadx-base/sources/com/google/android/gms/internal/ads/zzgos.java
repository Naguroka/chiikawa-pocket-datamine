package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgos {

    @javax.annotation.Nullable
    private java.lang.Integer zza = null;

    @javax.annotation.Nullable
    private java.lang.Integer zzb = null;
    private com.google.android.gms.internal.ads.zzgot zzc = null;
    private com.google.android.gms.internal.ads.zzgou zzd = com.google.android.gms.internal.ads.zzgou.zzd;

    private zzgos() {
    }

    /* synthetic */ zzgos(com.google.android.gms.internal.ads.zzgov zzgovVar) {
    }

    public final com.google.android.gms.internal.ads.zzgos zza(com.google.android.gms.internal.ads.zzgot zzgotVar) {
        this.zzc = zzgotVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzgos zzb(int i) throws java.security.GeneralSecurityException {
        this.zza = java.lang.Integer.valueOf(i);
        return this;
    }

    public final com.google.android.gms.internal.ads.zzgos zzc(int i) throws java.security.GeneralSecurityException {
        this.zzb = java.lang.Integer.valueOf(i);
        return this;
    }

    public final com.google.android.gms.internal.ads.zzgos zzd(com.google.android.gms.internal.ads.zzgou zzgouVar) {
        this.zzd = zzgouVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzgow zze() throws java.security.GeneralSecurityException {
        java.lang.Integer num = this.zza;
        if (num == null) {
            throw new java.security.GeneralSecurityException("key size is not set");
        }
        if (this.zzb == null) {
            throw new java.security.GeneralSecurityException("tag size is not set");
        }
        if (this.zzc == null) {
            throw new java.security.GeneralSecurityException("hash type is not set");
        }
        if (this.zzd == null) {
            throw new java.security.GeneralSecurityException("variant is not set");
        }
        if (num.intValue() < 16) {
            throw new java.security.InvalidAlgorithmParameterException(java.lang.String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.zza));
        }
        int iIntValue = this.zzb.intValue();
        com.google.android.gms.internal.ads.zzgot zzgotVar = this.zzc;
        if (iIntValue < 10) {
            throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; must be at least 10 bytes", java.lang.Integer.valueOf(iIntValue)));
        }
        if (zzgotVar == com.google.android.gms.internal.ads.zzgot.zza) {
            if (iIntValue > 20) {
                throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", java.lang.Integer.valueOf(iIntValue)));
            }
        } else if (zzgotVar == com.google.android.gms.internal.ads.zzgot.zzb) {
            if (iIntValue > 28) {
                throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", java.lang.Integer.valueOf(iIntValue)));
            }
        } else if (zzgotVar == com.google.android.gms.internal.ads.zzgot.zzc) {
            if (iIntValue > 32) {
                throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", java.lang.Integer.valueOf(iIntValue)));
            }
        } else if (zzgotVar == com.google.android.gms.internal.ads.zzgot.zzd) {
            if (iIntValue > 48) {
                throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", java.lang.Integer.valueOf(iIntValue)));
            }
        } else {
            if (zzgotVar != com.google.android.gms.internal.ads.zzgot.zze) {
                throw new java.security.GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", java.lang.Integer.valueOf(iIntValue)));
            }
        }
        return new com.google.android.gms.internal.ads.zzgow(this.zza.intValue(), this.zzb.intValue(), this.zzd, this.zzc, null);
    }
}
