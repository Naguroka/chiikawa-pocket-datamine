package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzguj implements com.google.android.gms.internal.ads.zzgvg {
    private static final java.lang.ThreadLocal zza = new com.google.android.gms.internal.ads.zzgui();
    private final javax.crypto.spec.SecretKeySpec zzb;
    private final int zzc;
    private final int zzd;

    public zzguj(byte[] bArr, int i) throws java.security.GeneralSecurityException {
        if (!com.google.android.gms.internal.ads.zzgks.zza(2)) {
            throw new java.security.GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        com.google.android.gms.internal.ads.zzgvm.zza(bArr.length);
        this.zzb = new javax.crypto.spec.SecretKeySpec(bArr, "AES");
        int blockSize = ((javax.crypto.Cipher) zza.get()).getBlockSize();
        this.zzd = blockSize;
        if (i > blockSize) {
            throw new java.security.GeneralSecurityException("invalid IV size");
        }
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgvg
    public final byte[] zza(byte[] bArr) throws java.security.GeneralSecurityException {
        int length = bArr.length;
        int i = this.zzc;
        if (length < i) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr2 = new byte[i];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, i);
        int i2 = this.zzc;
        int i3 = length - i2;
        byte[] bArr3 = new byte[i3];
        javax.crypto.Cipher cipher = (javax.crypto.Cipher) zza.get();
        byte[] bArr4 = new byte[this.zzd];
        java.lang.System.arraycopy(bArr2, 0, bArr4, 0, this.zzc);
        cipher.init(2, this.zzb, new javax.crypto.spec.IvParameterSpec(bArr4));
        if (cipher.doFinal(bArr, i2, i3, bArr3, 0) == i3) {
            return bArr3;
        }
        throw new java.security.GeneralSecurityException("stored output's length does not match input's length");
    }
}
