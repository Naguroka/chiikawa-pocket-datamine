package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgjp implements com.google.android.gms.internal.ads.zzgdn {
    private static final byte[] zza = com.google.android.gms.internal.ads.zzgvf.zza("808182838485868788898a8b8c8d8e8f909192939495969798999a9b9c9d9e9f");
    private static final byte[] zzb = com.google.android.gms.internal.ads.zzgvf.zza("070000004041424344454647");
    private static final byte[] zzc = com.google.android.gms.internal.ads.zzgvf.zza("a0784d7a4716f3feb4f64e7f4b39bf04");
    private static final java.lang.ThreadLocal zzd = new com.google.android.gms.internal.ads.zzgjo();
    private final javax.crypto.SecretKey zze;
    private final byte[] zzf;

    private zzgjp(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        if (!com.google.android.gms.internal.ads.zzgks.zza(1)) {
            throw new java.security.GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (!zze()) {
            throw new java.security.GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
        }
        if (bArr.length != 32) {
            throw new java.security.InvalidKeyException("The key length in bytes must be 32.");
        }
        this.zze = new javax.crypto.spec.SecretKeySpec(bArr, "ChaCha20");
        this.zzf = bArr2;
    }

    public static com.google.android.gms.internal.ads.zzgdn zzb(com.google.android.gms.internal.ads.zzggr zzggrVar) throws java.security.GeneralSecurityException {
        return new com.google.android.gms.internal.ads.zzgjp(zzggrVar.zzd().zzd(com.google.android.gms.internal.ads.zzgdw.zza()), zzggrVar.zzc().zzc());
    }

    @javax.annotation.Nullable
    static javax.crypto.Cipher zzc() {
        return (javax.crypto.Cipher) zzd.get();
    }

    public static boolean zze() {
        return zzd.get() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzf(javax.crypto.Cipher cipher) {
        try {
            javax.crypto.spec.IvParameterSpec ivParameterSpec = new javax.crypto.spec.IvParameterSpec(zzb);
            byte[] bArr = zza;
            cipher.init(2, new javax.crypto.spec.SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            byte[] bArr2 = zzc;
            if (cipher.doFinal(bArr2).length != 0) {
                return false;
            }
            cipher.init(2, new javax.crypto.spec.SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            return cipher.doFinal(bArr2).length == 0;
        } catch (java.security.GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgdn
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        if (bArr == null) {
            throw new java.lang.NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.zzf;
        int length = bArr.length;
        if (length < bArr3.length + 28) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        }
        if (!com.google.android.gms.internal.ads.zzgnu.zzc(bArr3, bArr)) {
            throw new java.security.GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[12];
        java.lang.System.arraycopy(bArr, this.zzf.length, bArr4, 0, 12);
        javax.crypto.spec.IvParameterSpec ivParameterSpec = new javax.crypto.spec.IvParameterSpec(bArr4);
        javax.crypto.Cipher cipher = (javax.crypto.Cipher) zzd.get();
        cipher.init(2, this.zze, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        int length2 = this.zzf.length;
        return cipher.doFinal(bArr, length2 + 12, (length - length2) - 12);
    }
}
