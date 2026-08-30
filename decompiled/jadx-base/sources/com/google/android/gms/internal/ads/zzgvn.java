package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgvn implements com.google.android.gms.internal.ads.zzgdn {
    private final com.google.android.gms.internal.ads.zzgkb zza;
    private final byte[] zzb;

    private zzgvn(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        this.zza = new com.google.android.gms.internal.ads.zzgkb(bArr);
        this.zzb = bArr2;
    }

    public static com.google.android.gms.internal.ads.zzgdn zzb(com.google.android.gms.internal.ads.zzgil zzgilVar) throws java.security.GeneralSecurityException {
        return new com.google.android.gms.internal.ads.zzgvn(zzgilVar.zzd().zzd(com.google.android.gms.internal.ads.zzgdw.zza()), zzgilVar.zzc().zzc());
    }

    private final byte[] zzc(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        int length = bArr.length;
        if (length < 40) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        }
        return this.zza.zzb(java.nio.ByteBuffer.wrap(bArr, 24, length - 24), java.util.Arrays.copyOf(bArr, 24), bArr2);
    }

    @Override // com.google.android.gms.internal.ads.zzgdn
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        if (bArr3.length == 0) {
            return zzc(bArr, bArr2);
        }
        if (!com.google.android.gms.internal.ads.zzgnu.zzc(bArr3, bArr)) {
            throw new java.security.GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = this.zzb;
        return zzc(java.util.Arrays.copyOfRange(bArr, bArr4.length, bArr.length), bArr2);
    }
}
