package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgjw extends com.google.android.gms.internal.ads.zzgjx {
    public zzgjw(byte[] bArr, int i) throws java.security.InvalidKeyException {
        super(bArr, i);
    }

    @Override // com.google.android.gms.internal.ads.zzgjx
    public final int zza() {
        return 12;
    }

    @Override // com.google.android.gms.internal.ads.zzgjx
    public final int[] zzb(int[] iArr, int i) {
        int length = iArr.length;
        if (length != 3) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", java.lang.Integer.valueOf(length * 32)));
        }
        int[] iArr2 = new int[16];
        com.google.android.gms.internal.ads.zzgjv.zzb(iArr2, this.zza);
        iArr2[12] = i;
        java.lang.System.arraycopy(iArr, 0, iArr2, 13, 3);
        return iArr2;
    }
}
