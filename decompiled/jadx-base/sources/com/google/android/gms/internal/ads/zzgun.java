package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgun implements com.google.android.gms.internal.ads.zzgdn {
    private final javax.crypto.SecretKey zza;
    private final byte[] zzb;

    private zzgun(byte[] bArr, com.google.android.gms.internal.ads.zzgvo zzgvoVar) throws java.security.GeneralSecurityException {
        if (!com.google.android.gms.internal.ads.zzgks.zza(2)) {
            throw new java.security.GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.zza = com.google.android.gms.internal.ads.zzgjd.zzc(bArr);
        this.zzb = zzgvoVar.zzc();
    }

    public static com.google.android.gms.internal.ads.zzgdn zzb(com.google.android.gms.internal.ads.zzgfx zzgfxVar) throws java.security.GeneralSecurityException {
        return new com.google.android.gms.internal.ads.zzgun(zzgfxVar.zzd().zzd(com.google.android.gms.internal.ads.zzgdw.zza()), zzgfxVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzgdn
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        if (bArr == null) {
            throw new java.lang.NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.zzb;
        int length = bArr.length;
        if (length < bArr3.length + 28) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        }
        if (!com.google.android.gms.internal.ads.zzgnu.zzc(bArr3, bArr)) {
            throw new java.security.GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        java.security.spec.AlgorithmParameterSpec algorithmParameterSpecZza = com.google.android.gms.internal.ads.zzgjd.zza(bArr, this.zzb.length, 12);
        javax.crypto.SecretKey secretKey = this.zza;
        javax.crypto.Cipher cipherZzb = com.google.android.gms.internal.ads.zzgjd.zzb();
        cipherZzb.init(2, secretKey, algorithmParameterSpecZza);
        if (bArr2 != null && bArr2.length != 0) {
            cipherZzb.updateAAD(bArr2);
        }
        int length2 = this.zzb.length;
        return cipherZzb.doFinal(bArr, length2 + 12, (length - length2) - 12);
    }
}
