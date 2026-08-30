package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgfg {

    @javax.annotation.Nullable
    private java.lang.Integer zza = null;

    @javax.annotation.Nullable
    private java.lang.Integer zzb = null;

    @javax.annotation.Nullable
    private java.lang.Integer zzc = null;

    @javax.annotation.Nullable
    private java.lang.Integer zzd = null;
    private com.google.android.gms.internal.ads.zzgfh zze = null;
    private com.google.android.gms.internal.ads.zzgfi zzf = com.google.android.gms.internal.ads.zzgfi.zzc;

    private zzgfg() {
    }

    /* synthetic */ zzgfg(com.google.android.gms.internal.ads.zzgfj zzgfjVar) {
    }

    public final com.google.android.gms.internal.ads.zzgfg zzb(com.google.android.gms.internal.ads.zzgfh zzgfhVar) {
        this.zze = zzgfhVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzgfg zzf(com.google.android.gms.internal.ads.zzgfi zzgfiVar) {
        this.zzf = zzgfiVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzgfk zzg() throws java.security.GeneralSecurityException {
        if (this.zza == null) {
            throw new java.security.GeneralSecurityException("AES key size is not set");
        }
        if (this.zzb == null) {
            throw new java.security.GeneralSecurityException("HMAC key size is not set");
        }
        if (this.zzc == null) {
            throw new java.security.GeneralSecurityException("iv size is not set");
        }
        java.lang.Integer num = this.zzd;
        if (num == null) {
            throw new java.security.GeneralSecurityException("tag size is not set");
        }
        if (this.zze == null) {
            throw new java.security.GeneralSecurityException("hash type is not set");
        }
        if (this.zzf == null) {
            throw new java.security.GeneralSecurityException("variant is not set");
        }
        int iIntValue = num.intValue();
        com.google.android.gms.internal.ads.zzgfh zzgfhVar = this.zze;
        if (zzgfhVar == com.google.android.gms.internal.ads.zzgfh.zza) {
            if (iIntValue > 20) {
                throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", java.lang.Integer.valueOf(iIntValue)));
            }
        } else if (zzgfhVar == com.google.android.gms.internal.ads.zzgfh.zzb) {
            if (iIntValue > 28) {
                throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", java.lang.Integer.valueOf(iIntValue)));
            }
        } else if (zzgfhVar == com.google.android.gms.internal.ads.zzgfh.zzc) {
            if (iIntValue > 32) {
                throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", java.lang.Integer.valueOf(iIntValue)));
            }
        } else if (zzgfhVar == com.google.android.gms.internal.ads.zzgfh.zzd) {
            if (iIntValue > 48) {
                throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", java.lang.Integer.valueOf(iIntValue)));
            }
        } else {
            if (zzgfhVar != com.google.android.gms.internal.ads.zzgfh.zze) {
                throw new java.security.GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", java.lang.Integer.valueOf(iIntValue)));
            }
        }
        return new com.google.android.gms.internal.ads.zzgfk(this.zza.intValue(), this.zzb.intValue(), this.zzc.intValue(), this.zzd.intValue(), this.zzf, this.zze, null);
    }

    public final com.google.android.gms.internal.ads.zzgfg zza(int i) throws java.security.GeneralSecurityException {
        if (i != 16 && i != 24 && i != 32) {
            throw new java.security.InvalidAlgorithmParameterException(java.lang.String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", java.lang.Integer.valueOf(i)));
        }
        this.zza = java.lang.Integer.valueOf(i);
        return this;
    }

    public final com.google.android.gms.internal.ads.zzgfg zze(int i) throws java.security.GeneralSecurityException {
        if (i < 10) {
            throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; must be at least 10 bytes", java.lang.Integer.valueOf(i)));
        }
        this.zzd = java.lang.Integer.valueOf(i);
        return this;
    }

    public final com.google.android.gms.internal.ads.zzgfg zzc(int i) throws java.security.GeneralSecurityException {
        if (i < 16) {
            throw new java.security.InvalidAlgorithmParameterException(java.lang.String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", java.lang.Integer.valueOf(i)));
        }
        this.zzb = java.lang.Integer.valueOf(i);
        return this;
    }

    public final com.google.android.gms.internal.ads.zzgfg zzd(int i) throws java.security.GeneralSecurityException {
        if (i < 12 || i > 16) {
            throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", java.lang.Integer.valueOf(i)));
        }
        this.zzc = java.lang.Integer.valueOf(i);
        return this;
    }
}
