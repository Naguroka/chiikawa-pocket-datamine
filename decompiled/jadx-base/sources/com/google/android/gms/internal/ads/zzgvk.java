package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgvk implements com.google.android.gms.internal.ads.zzgpy {
    private final java.lang.ThreadLocal zza;
    private final java.lang.String zzb;
    private final java.security.Key zzc;
    private final int zzd;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    public zzgvk(java.lang.String str, java.security.Key key) throws java.security.GeneralSecurityException {
        byte b;
        int i;
        com.google.android.gms.internal.ads.zzgvj zzgvjVar = new com.google.android.gms.internal.ads.zzgvj(this);
        this.zza = zzgvjVar;
        if (!com.google.android.gms.internal.ads.zzgks.zza(2)) {
            throw new java.security.GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.zzb = str;
        this.zzc = key;
        if (key.getEncoded().length < 16) {
            throw new java.security.InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        switch (str) {
            case "HMACSHA1":
                b = 0;
                break;
            case "HMACSHA224":
                b = 1;
                break;
            case "HMACSHA256":
                b = 2;
                break;
            case "HMACSHA384":
                b = 3;
                break;
            case "HMACSHA512":
                b = 4;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            i = 20;
        } else if (b == 1) {
            i = 28;
        } else if (b == 2) {
            i = 32;
        } else if (b == 3) {
            i = 48;
        } else {
            if (b != 4) {
                throw new java.security.NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
            }
            i = 64;
        }
        this.zzd = i;
        zzgvjVar.get();
    }

    @Override // com.google.android.gms.internal.ads.zzgpy
    public final byte[] zza(byte[] bArr, int i) throws java.security.GeneralSecurityException {
        if (i > this.zzd) {
            throw new java.security.InvalidAlgorithmParameterException("tag size too big");
        }
        ((javax.crypto.Mac) this.zza.get()).update(bArr);
        return java.util.Arrays.copyOf(((javax.crypto.Mac) this.zza.get()).doFinal(), i);
    }
}
