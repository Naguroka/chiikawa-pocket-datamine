package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgkk implements com.google.android.gms.internal.ads.zzgdn {
    private final byte[] zza;
    private final byte[] zzb;

    private zzgkk(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        if (!com.google.android.gms.internal.ads.zzgks.zza(1)) {
            throw new java.security.GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (!zzc()) {
            throw new java.security.GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
        }
        if (bArr.length != 32) {
            throw new java.security.InvalidKeyException("The key length in bytes must be 32.");
        }
        this.zza = bArr;
        this.zzb = bArr2;
    }

    public static com.google.android.gms.internal.ads.zzgdn zzb(com.google.android.gms.internal.ads.zzgil zzgilVar) throws java.security.GeneralSecurityException {
        return new com.google.android.gms.internal.ads.zzgkk(zzgilVar.zzd().zzd(com.google.android.gms.internal.ads.zzgdw.zza()), zzgilVar.zzc().zzc());
    }

    public static boolean zzc() {
        return com.google.android.gms.internal.ads.zzgjp.zzc() != null;
    }

    @Override // com.google.android.gms.internal.ads.zzgdn
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        if (bArr == null) {
            throw new java.lang.NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.zzb;
        int length = bArr.length;
        if (length < bArr3.length + 40) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        }
        if (!com.google.android.gms.internal.ads.zzgnu.zzc(bArr3, bArr)) {
            throw new java.security.GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[24];
        java.lang.System.arraycopy(bArr, this.zzb.length, bArr4, 0, 24);
        int[] iArrZzd = com.google.android.gms.internal.ads.zzgjv.zzd(com.google.android.gms.internal.ads.zzgjv.zze(this.zza), com.google.android.gms.internal.ads.zzgjv.zze(bArr4));
        java.nio.ByteBuffer byteBufferOrder = java.nio.ByteBuffer.allocate(iArrZzd.length * 4).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrZzd);
        javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(byteBufferOrder.array(), "ChaCha20");
        byte[] bArr5 = new byte[12];
        java.lang.System.arraycopy(bArr4, 16, bArr5, 4, 8);
        javax.crypto.spec.IvParameterSpec ivParameterSpec = new javax.crypto.spec.IvParameterSpec(bArr5);
        javax.crypto.Cipher cipherZzc = com.google.android.gms.internal.ads.zzgjp.zzc();
        cipherZzc.init(2, secretKeySpec, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipherZzc.updateAAD(bArr2);
        }
        int length2 = this.zzb.length;
        return cipherZzc.doFinal(bArr, length2 + 24, (length - length2) - 24);
    }
}
