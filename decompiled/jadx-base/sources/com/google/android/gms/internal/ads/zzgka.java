package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgka extends com.google.android.gms.internal.ads.zzgjx {
    public zzgka(byte[] bArr, int i) throws java.security.InvalidKeyException {
        super(bArr, i);
    }

    @Override // com.google.android.gms.internal.ads.zzgjx
    final int zza() {
        return 24;
    }

    @Override // com.google.android.gms.internal.ads.zzgjx
    final int[] zzb(int[] iArr, int i) {
        int length = iArr.length;
        if (length != 6) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", java.lang.Integer.valueOf(length * 32)));
        }
        int[] iArr2 = new int[16];
        com.google.android.gms.internal.ads.zzgjv.zzb(iArr2, com.google.android.gms.internal.ads.zzgjv.zzd(this.zza, iArr));
        iArr2[12] = i;
        iArr2[13] = 0;
        iArr2[14] = iArr[4];
        iArr2[15] = iArr[5];
        return iArr2;
    }
}
