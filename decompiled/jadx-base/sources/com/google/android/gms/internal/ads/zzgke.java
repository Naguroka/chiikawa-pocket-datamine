package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgke implements com.google.android.gms.internal.ads.zzgdn {
    private final byte[] zza;
    private final int zzb;
    private final com.google.android.gms.internal.ads.zzgpy zzc;

    private zzgke(byte[] bArr, com.google.android.gms.internal.ads.zzgvo zzgvoVar, int i) throws java.security.GeneralSecurityException {
        this.zzc = new com.google.android.gms.internal.ads.zzgvi(bArr);
        this.zza = zzgvoVar.zzc();
        this.zzb = i;
    }

    public static com.google.android.gms.internal.ads.zzgdn zzb(com.google.android.gms.internal.ads.zzgif zzgifVar) throws java.security.GeneralSecurityException {
        return new com.google.android.gms.internal.ads.zzgke(zzgifVar.zzd().zzd(com.google.android.gms.internal.ads.zzgdw.zza()), zzgifVar.zzc(), zzgifVar.zzb().zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzgdn
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        if (bArr == null) {
            throw new java.lang.NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.zza;
        int i = this.zzb;
        int length = bArr.length;
        if (length < bArr3.length + i + 28) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        }
        if (!com.google.android.gms.internal.ads.zzgnu.zzc(bArr3, bArr)) {
            throw new java.security.GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = this.zza;
        int i2 = this.zzb;
        int length2 = bArr4.length;
        int i3 = i2 + length2;
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(bArr, length2, i3);
        byte[] bArr5 = {0, 1, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        byte[] bArr6 = {0, 2, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int length3 = bArrCopyOfRange.length;
        if (length3 > 12 || length3 < 8) {
            throw new java.security.GeneralSecurityException("invalid salt size");
        }
        java.lang.System.arraycopy(bArrCopyOfRange, 0, bArr5, 4, length3);
        java.lang.System.arraycopy(bArrCopyOfRange, 0, bArr6, 4, length3);
        byte[] bArr7 = new byte[32];
        java.lang.System.arraycopy(this.zzc.zza(bArr5, 16), 0, bArr7, 0, 16);
        java.lang.System.arraycopy(this.zzc.zza(bArr6, 16), 0, bArr7, 16, 16);
        if (!com.google.android.gms.internal.ads.zzgks.zza(2)) {
            throw new java.security.GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        javax.crypto.SecretKey secretKeyZzc = com.google.android.gms.internal.ads.zzgjd.zzc(bArr7);
        int i4 = i3 + 12;
        byte[] bArrCopyOfRange2 = java.util.Arrays.copyOfRange(bArr, i3, i4);
        if (bArrCopyOfRange2.length != 12) {
            throw new java.security.GeneralSecurityException("iv is wrong size");
        }
        if (length < i4 + 16) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        }
        java.security.spec.AlgorithmParameterSpec algorithmParameterSpecZza = com.google.android.gms.internal.ads.zzgjd.zza(bArrCopyOfRange2, 0, 12);
        javax.crypto.Cipher cipherZzb = com.google.android.gms.internal.ads.zzgjd.zzb();
        cipherZzb.init(2, secretKeyZzc, algorithmParameterSpecZza);
        if (bArr2 != null && bArr2.length != 0) {
            cipherZzb.updateAAD(bArr2);
        }
        return cipherZzb.doFinal(bArr, i4, length - i4);
    }
}
