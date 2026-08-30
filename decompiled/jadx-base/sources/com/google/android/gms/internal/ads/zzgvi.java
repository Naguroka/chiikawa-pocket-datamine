package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgvi implements com.google.android.gms.internal.ads.zzgpy {
    private static final java.lang.ThreadLocal zza = new com.google.android.gms.internal.ads.zzgvh();
    private final javax.crypto.SecretKey zzb;
    private final byte[] zzc;
    private final byte[] zzd;

    public zzgvi(byte[] bArr) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzgvm.zza(bArr.length);
        javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(bArr, "AES");
        this.zzb = secretKeySpec;
        javax.crypto.Cipher cipherZzb = zzb();
        cipherZzb.init(1, secretKeySpec);
        byte[] bArrZza = com.google.android.gms.internal.ads.zzgpp.zza(cipherZzb.doFinal(new byte[16]));
        this.zzc = bArrZza;
        this.zzd = com.google.android.gms.internal.ads.zzgpp.zza(bArrZza);
    }

    private static javax.crypto.Cipher zzb() throws java.security.GeneralSecurityException {
        if (com.google.android.gms.internal.ads.zzgks.zza(1)) {
            return (javax.crypto.Cipher) zza.get();
        }
        throw new java.security.GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    private static void zzc(byte[] bArr, byte[] bArr2, int i, byte[] bArr3) {
        for (int i2 = 0; i2 < 16; i2++) {
            bArr3[i2] = (byte) (bArr[i2] ^ bArr2[i2 + i]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgpy
    public final byte[] zza(byte[] bArr, int i) throws java.security.GeneralSecurityException {
        byte[] bArrZzc;
        if (i > 16) {
            throw new java.security.InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        javax.crypto.SecretKey secretKey = this.zzb;
        javax.crypto.Cipher cipherZzb = zzb();
        cipherZzb.init(1, secretKey);
        int length = bArr.length;
        int i2 = length != 0 ? 1 + ((length - 1) >> 4) : 1;
        int i3 = i2 - 1;
        int i4 = i3 * 16;
        if (i2 * 16 == length) {
            bArrZzc = com.google.android.gms.internal.ads.zzguo.zzc(bArr, i4, this.zzc, 0, 16);
        } else {
            byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(bArr, i4, length);
            int length2 = bArrCopyOfRange.length;
            if (length2 >= 16) {
                throw new java.lang.IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] bArrCopyOf = java.util.Arrays.copyOf(bArrCopyOfRange, 16);
            bArrCopyOf[length2] = -128;
            byte[] bArr2 = this.zzd;
            if (bArrCopyOf.length != 16) {
                throw new java.lang.IllegalArgumentException("The lengths of x and y should match.");
            }
            bArrZzc = com.google.android.gms.internal.ads.zzguo.zzc(bArrCopyOf, 0, bArr2, 0, 16);
        }
        byte[] bArr3 = new byte[16];
        byte[] bArr4 = new byte[16];
        for (int i5 = 0; i5 < i3; i5++) {
            zzc(bArr3, bArr, i5 * 16, bArr4);
            if (cipherZzb.doFinal(bArr4, 0, 16, bArr3) != 16) {
                throw new java.lang.IllegalStateException("Cipher didn't write full block");
            }
        }
        zzc(bArr3, bArrZzc, 0, bArr4);
        if (cipherZzb.doFinal(bArr4, 0, 16, bArr3) == 16) {
            return i == 16 ? bArr3 : java.util.Arrays.copyOf(bArr3, i);
        }
        throw new java.lang.IllegalStateException("Cipher didn't write full block");
    }
}
