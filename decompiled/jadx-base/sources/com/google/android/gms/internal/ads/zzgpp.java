package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgpp {
    public static byte[] zza(byte[] bArr) {
        if (bArr.length != 16) {
            throw new java.lang.IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (i < 16) {
            int i2 = i + 1;
            byte b = bArr[i];
            byte b2 = (byte) ((b + b) & 254);
            bArr2[i] = b2;
            if (i < 15) {
                bArr2[i] = (byte) (((bArr[i2] >> 7) & 1) | b2);
            }
            i = i2;
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }
}
