package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
abstract class zzgjx {
    int[] zza;
    private final int zzb;

    public zzgjx(byte[] bArr, int i) throws java.security.InvalidKeyException {
        if (bArr.length != 32) {
            throw new java.security.InvalidKeyException("The key length in bytes must be 32.");
        }
        this.zza = com.google.android.gms.internal.ads.zzgjv.zze(bArr);
        this.zzb = i;
    }

    abstract int zza();

    abstract int[] zzb(int[] iArr, int i);

    final java.nio.ByteBuffer zzc(byte[] bArr, int i) {
        int[] iArrZzb = zzb(com.google.android.gms.internal.ads.zzgjv.zze(bArr), i);
        int[] iArr = (int[]) iArrZzb.clone();
        com.google.android.gms.internal.ads.zzgjv.zzc(iArr);
        for (int i2 = 0; i2 < 16; i2++) {
            iArrZzb[i2] = iArrZzb[i2] + iArr[i2];
        }
        java.nio.ByteBuffer byteBufferOrder = java.nio.ByteBuffer.allocate(64).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrZzb, 0, 16);
        return byteBufferOrder;
    }

    public final byte[] zzd(byte[] bArr, java.nio.ByteBuffer byteBuffer) throws java.security.GeneralSecurityException {
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(byteBuffer.remaining());
        if (bArr.length != zza()) {
            throw new java.security.GeneralSecurityException("The nonce length (in bytes) must be " + zza());
        }
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining / 64;
        int i2 = 0;
        while (true) {
            int i3 = i + 1;
            if (i2 >= i3) {
                return byteBufferAllocate.array();
            }
            java.nio.ByteBuffer byteBufferZzc = zzc(bArr, this.zzb + i2);
            if (i2 == i3 - 1) {
                com.google.android.gms.internal.ads.zzguo.zza(byteBufferAllocate, byteBuffer, byteBufferZzc, iRemaining % 64);
            } else {
                com.google.android.gms.internal.ads.zzguo.zza(byteBufferAllocate, byteBuffer, byteBufferZzc, 64);
            }
            i2++;
        }
    }
}
