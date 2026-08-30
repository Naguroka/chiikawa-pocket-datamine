package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzguq implements com.google.android.gms.internal.ads.zzgdn {
    private final com.google.android.gms.internal.ads.zzgvg zza;
    private final com.google.android.gms.internal.ads.zzgej zzb;
    private final int zzc;
    private final byte[] zzd;

    private zzguq(com.google.android.gms.internal.ads.zzgvg zzgvgVar, com.google.android.gms.internal.ads.zzgej zzgejVar, int i, byte[] bArr) {
        this.zza = zzgvgVar;
        this.zzb = zzgejVar;
        this.zzc = i;
        this.zzd = bArr;
    }

    public static com.google.android.gms.internal.ads.zzgdn zzb(com.google.android.gms.internal.ads.zzgfb zzgfbVar) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzguj zzgujVar = new com.google.android.gms.internal.ads.zzguj(zzgfbVar.zzd().zzd(com.google.android.gms.internal.ads.zzgdw.zza()), zzgfbVar.zzb().zzd());
        java.lang.String strValueOf = java.lang.String.valueOf(java.lang.String.valueOf(zzgfbVar.zzb().zzg()));
        return new com.google.android.gms.internal.ads.zzguq(zzgujVar, new com.google.android.gms.internal.ads.zzgvl(new com.google.android.gms.internal.ads.zzgvk("HMAC".concat(strValueOf), new javax.crypto.spec.SecretKeySpec(zzgfbVar.zze().zzd(com.google.android.gms.internal.ads.zzgdw.zza()), "HMAC")), zzgfbVar.zzb().zze()), zzgfbVar.zzb().zze(), zzgfbVar.zzc().zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzgdn
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        byte[] bArr3 = this.zzd;
        int i = this.zzc;
        int length = bArr3.length;
        int length2 = bArr.length;
        if (length2 < i + length) {
            throw new java.security.GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!com.google.android.gms.internal.ads.zzgnu.zzc(bArr3, bArr)) {
            throw new java.security.GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(bArr, this.zzd.length, length2 - this.zzc);
        byte[] bArrCopyOfRange2 = java.util.Arrays.copyOfRange(bArr, length2 - this.zzc, length2);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        if (java.security.MessageDigest.isEqual(((com.google.android.gms.internal.ads.zzgvl) this.zzb).zzc(com.google.android.gms.internal.ads.zzguo.zzb(bArr2, bArrCopyOfRange, java.util.Arrays.copyOf(java.nio.ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8))), bArrCopyOfRange2)) {
            return this.zza.zza(bArrCopyOfRange);
        }
        throw new java.security.GeneralSecurityException("invalid MAC");
    }
}
