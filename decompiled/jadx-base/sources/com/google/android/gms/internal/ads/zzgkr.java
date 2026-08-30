package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgkr implements com.google.android.gms.internal.ads.zzgdn {
    private static final byte[] zza = com.google.android.gms.internal.ads.zzgvf.zza("7a806c");
    private static final byte[] zzb = com.google.android.gms.internal.ads.zzgvf.zza("46bb91c3c5");
    private static final byte[] zzc = com.google.android.gms.internal.ads.zzgvf.zza("36864200e0eaf5284d884a0e77d31646");
    private static final byte[] zzd = com.google.android.gms.internal.ads.zzgvf.zza("bae8e37fc83441b16034566b");
    private static final byte[] zze = com.google.android.gms.internal.ads.zzgvf.zza("af60eb711bd85bc1e4d3e0a462e074eea428a8");
    private static final java.lang.ThreadLocal zzf = new com.google.android.gms.internal.ads.zzgkq();
    private final javax.crypto.SecretKey zzg;
    private final byte[] zzh;

    private zzgkr(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        this.zzh = bArr2;
        com.google.android.gms.internal.ads.zzgvm.zza(bArr.length);
        this.zzg = new javax.crypto.spec.SecretKeySpec(bArr, "AES");
    }

    public static com.google.android.gms.internal.ads.zzgdn zzb(com.google.android.gms.internal.ads.zzggi zzggiVar) throws java.security.GeneralSecurityException {
        return new com.google.android.gms.internal.ads.zzgkr(zzggiVar.zzd().zzd(com.google.android.gms.internal.ads.zzgdw.zza()), zzggiVar.zzc().zzc());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzd(javax.crypto.Cipher cipher) {
        try {
            byte[] bArr = zzd;
            cipher.init(2, new javax.crypto.spec.SecretKeySpec(zzc, "AES"), new javax.crypto.spec.GCMParameterSpec(128, bArr, 0, bArr.length));
            cipher.updateAAD(zzb);
            byte[] bArr2 = zze;
            return java.security.MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), zza);
        } catch (java.security.GeneralSecurityException unused) {
            return false;
        }
    }

    private final byte[] zze(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        javax.crypto.Cipher cipher = (javax.crypto.Cipher) zzf.get();
        if (cipher == null) {
            throw new java.security.GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.");
        }
        int length = bArr.length;
        if (length < 28) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        }
        cipher.init(2, this.zzg, new javax.crypto.spec.GCMParameterSpec(128, bArr, 0, 12));
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, 12, length - 12);
    }

    @Override // com.google.android.gms.internal.ads.zzgdn
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        byte[] bArr3 = this.zzh;
        if (bArr3.length == 0) {
            return zze(bArr, bArr2);
        }
        if (!com.google.android.gms.internal.ads.zzgnu.zzc(bArr3, bArr)) {
            throw new java.security.GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = this.zzh;
        return zze(java.util.Arrays.copyOfRange(bArr, bArr4.length, bArr.length), bArr2);
    }
}
