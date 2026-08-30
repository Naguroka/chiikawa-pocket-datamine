package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
abstract class zzgjz {
    private final com.google.android.gms.internal.ads.zzgjx zza;
    private final com.google.android.gms.internal.ads.zzgjx zzb;

    public zzgjz(byte[] bArr) throws java.security.GeneralSecurityException {
        if (!com.google.android.gms.internal.ads.zzgks.zza(1)) {
            throw new java.security.GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.zza = zza(bArr, 1);
        this.zzb = zza(bArr, 0);
    }

    abstract com.google.android.gms.internal.ads.zzgjx zza(byte[] bArr, int i) throws java.security.InvalidKeyException;

    public final byte[] zzb(java.nio.ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        if (byteBuffer.remaining() < 16) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        }
        int iPosition = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            byte[] bArr4 = new byte[32];
            this.zzb.zzc(bArr, 0).get(bArr4);
            int length = bArr2.length;
            int i = length & 15;
            int i2 = i == 0 ? length : (length + 16) - i;
            int iRemaining = byteBuffer.remaining();
            int i3 = iRemaining % 16;
            int i4 = (i3 == 0 ? iRemaining : (iRemaining + 16) - i3) + i2;
            java.nio.ByteBuffer byteBufferOrder = java.nio.ByteBuffer.allocate(i4 + 16).order(java.nio.ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put(bArr2);
            byteBufferOrder.position(i2);
            byteBufferOrder.put(byteBuffer);
            byteBufferOrder.position(i4);
            byteBufferOrder.putLong(length);
            byteBufferOrder.putLong(iRemaining);
            if (!java.security.MessageDigest.isEqual(com.google.android.gms.internal.ads.zzgkd.zza(bArr4, byteBufferOrder.array()), bArr3)) {
                throw new java.security.GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(iPosition);
            return this.zza.zzd(bArr, byteBuffer);
        } catch (java.security.GeneralSecurityException e) {
            throw new javax.crypto.AEADBadTagException(e.toString());
        }
    }
}
