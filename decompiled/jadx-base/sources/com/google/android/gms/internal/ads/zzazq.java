package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzazq extends com.google.android.gms.internal.ads.zzazl {
    private java.security.MessageDigest zzb;

    @Override // com.google.android.gms.internal.ads.zzazl
    public final byte[] zzb(java.lang.String str) {
        byte[] bArr;
        byte[] bArrArray;
        java.lang.String[] strArrSplit = str.split(" ");
        int length = strArrSplit.length;
        int i = 4;
        if (length == 1) {
            int iZza = com.google.android.gms.internal.ads.zzazp.zza(strArrSplit[0]);
            java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(4);
            byteBufferAllocate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocate.putInt(iZza);
            bArrArray = byteBufferAllocate.array();
        } else {
            if (length < 5) {
                bArr = new byte[length + length];
                for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                    int iZza2 = com.google.android.gms.internal.ads.zzazp.zza(strArrSplit[i2]);
                    int i3 = (iZza2 >> 16) ^ ((char) iZza2);
                    int i4 = i2 + i2;
                    bArr[i4] = (byte) i3;
                    bArr[i4 + 1] = (byte) (i3 >> 8);
                }
            } else {
                bArr = new byte[length];
                for (int i5 = 0; i5 < strArrSplit.length; i5++) {
                    int iZza3 = com.google.android.gms.internal.ads.zzazp.zza(strArrSplit[i5]);
                    bArr[i5] = (byte) ((iZza3 >> 24) ^ (((iZza3 & 255) ^ ((iZza3 >> 8) & 255)) ^ ((iZza3 >> 16) & 255)));
                }
            }
            bArrArray = bArr;
        }
        this.zzb = zza();
        synchronized (this.zza) {
            java.security.MessageDigest messageDigest = this.zzb;
            if (messageDigest == null) {
                return new byte[0];
            }
            messageDigest.reset();
            this.zzb.update(bArrArray);
            byte[] bArrDigest = this.zzb.digest();
            int length2 = bArrDigest.length;
            if (length2 <= 4) {
                i = length2;
            }
            byte[] bArr2 = new byte[i];
            java.lang.System.arraycopy(bArrDigest, 0, bArr2, 0, i);
            return bArr2;
        }
    }
}
