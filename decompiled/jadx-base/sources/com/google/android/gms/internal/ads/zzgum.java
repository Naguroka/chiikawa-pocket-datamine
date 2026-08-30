package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgum implements com.google.android.gms.internal.ads.zzgdn {
    private static final java.lang.ThreadLocal zza = new com.google.android.gms.internal.ads.zzguk();
    private static final java.lang.ThreadLocal zzb = new com.google.android.gms.internal.ads.zzgul();
    private final byte[] zzc;
    private final byte[] zzd;
    private final byte[] zze;
    private final javax.crypto.spec.SecretKeySpec zzf;
    private final int zzg;

    private zzgum(byte[] bArr, int i, byte[] bArr2) throws java.security.GeneralSecurityException {
        if (!com.google.android.gms.internal.ads.zzgks.zza(1)) {
            throw new java.security.GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i != 12 && i != 16) {
            throw new java.lang.IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.zzg = i;
        com.google.android.gms.internal.ads.zzgvm.zza(bArr.length);
        javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(bArr, "AES");
        this.zzf = secretKeySpec;
        javax.crypto.Cipher cipher = (javax.crypto.Cipher) zza.get();
        cipher.init(1, secretKeySpec);
        byte[] bArrZzd = zzd(cipher.doFinal(new byte[16]));
        this.zzc = bArrZzd;
        this.zzd = zzd(bArrZzd);
        this.zze = bArr2;
    }

    public static com.google.android.gms.internal.ads.zzgdn zzb(com.google.android.gms.internal.ads.zzgfn zzgfnVar) throws java.security.GeneralSecurityException {
        if (com.google.android.gms.internal.ads.zzgks.zza(1)) {
            return new com.google.android.gms.internal.ads.zzgum(zzgfnVar.zzd().zzd(com.google.android.gms.internal.ads.zzgdw.zza()), zzgfnVar.zzb().zzb(), zzgfnVar.zzc().zzc());
        }
        throw new java.security.GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
    }

    private static void zzc(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
    }

    private static byte[] zzd(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (i < 15) {
            byte b = bArr[i];
            int i2 = i + 1;
            bArr2[i] = (byte) (((b + b) ^ ((bArr[i2] & 255) >>> 7)) & 255);
            i = i2;
        }
        byte b2 = bArr[15];
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (b2 + b2));
        return bArr2;
    }

    private final byte[] zze(javax.crypto.Cipher cipher, int i, byte[] bArr, int i2, int i3) throws javax.crypto.BadPaddingException, javax.crypto.IllegalBlockSizeException, javax.crypto.ShortBufferException {
        int length;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i;
        if (i3 == 0) {
            zzc(bArr2, this.zzc);
            return cipher.doFinal(bArr2);
        }
        byte[] bArr3 = new byte[16];
        cipher.doFinal(bArr2, 0, 16, bArr3);
        int i4 = 0;
        while (true) {
            byte[] bArr4 = bArr2;
            bArr2 = bArr3;
            bArr3 = bArr4;
            if (i3 - i4 <= 16) {
                break;
            }
            for (int i5 = 0; i5 < 16; i5++) {
                bArr2[i5] = (byte) (bArr[(i2 + i4) + i5] ^ bArr2[i5]);
            }
            cipher.doFinal(bArr2, 0, 16, bArr3);
            i4 += 16;
        }
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(bArr, i4 + i2, i2 + i3);
        if (bArrCopyOfRange.length == 16) {
            zzc(bArrCopyOfRange, this.zzc);
        } else {
            byte[] bArrCopyOf = java.util.Arrays.copyOf(this.zzd, 16);
            int i6 = 0;
            while (true) {
                length = bArrCopyOfRange.length;
                if (i6 >= length) {
                    break;
                }
                bArrCopyOf[i6] = (byte) (bArrCopyOf[i6] ^ bArrCopyOfRange[i6]);
                i6++;
            }
            bArrCopyOf[length] = (byte) (bArrCopyOf[length] ^ 128);
            bArrCopyOfRange = bArrCopyOf;
        }
        zzc(bArr2, bArrCopyOfRange);
        cipher.doFinal(bArr2, 0, 16, bArr3);
        return bArr3;
    }

    @Override // com.google.android.gms.internal.ads.zzgdn
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        byte[] bArr3 = this.zze;
        int length = bArr.length;
        int length2 = ((length - bArr3.length) - this.zzg) - 16;
        if (length2 < 0) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        }
        if (!com.google.android.gms.internal.ads.zzgnu.zzc(bArr3, bArr)) {
            throw new java.security.GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        javax.crypto.Cipher cipher = (javax.crypto.Cipher) zza.get();
        cipher.init(1, this.zzf);
        byte[] bArrZze = zze(cipher, 0, bArr, this.zze.length, this.zzg);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr4 = bArr2;
        byte[] bArrZze2 = zze(cipher, 1, bArr4, 0, bArr4.length);
        byte[] bArrZze3 = zze(cipher, 2, bArr, this.zze.length + this.zzg, length2);
        int i = length - 16;
        byte b = 0;
        for (int i2 = 0; i2 < 16; i2++) {
            b = (byte) (b | (((bArr[i + i2] ^ bArrZze2[i2]) ^ bArrZze[i2]) ^ bArrZze3[i2]));
        }
        if (b != 0) {
            throw new javax.crypto.AEADBadTagException("tag mismatch");
        }
        javax.crypto.Cipher cipher2 = (javax.crypto.Cipher) zzb.get();
        cipher2.init(1, this.zzf, new javax.crypto.spec.IvParameterSpec(bArrZze));
        return cipher2.doFinal(bArr, this.zze.length + this.zzg, length2);
    }
}
