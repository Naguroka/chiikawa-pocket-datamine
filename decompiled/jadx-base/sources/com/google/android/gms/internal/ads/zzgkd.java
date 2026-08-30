package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgkd {
    public static byte[] zza(byte[] bArr, byte[] bArr2) {
        long jZzb = zzb(bArr, 0, 0);
        long jZzb2 = zzb(bArr, 3, 2) & 67108611;
        long jZzb3 = zzb(bArr, 6, 4) & 67092735;
        long jZzb4 = zzb(bArr, 9, 6) & 66076671;
        long jZzb5 = zzb(bArr, 12, 8) & 1048575;
        int i = 17;
        byte[] bArr3 = new byte[17];
        long j = 0;
        int i2 = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        while (true) {
            int length = bArr2.length;
            if (i2 >= length) {
                long j6 = j + (j2 >> 26);
                long j7 = j6 & 67108863;
                long j8 = j3 + (j6 >> 26);
                long j9 = j8 & 67108863;
                long j10 = j4 + (j8 >> 26);
                long j11 = j10 & 67108863;
                long j12 = j5 + ((j10 >> 26) * 5);
                long j13 = j12 & 67108863;
                long j14 = j13 + 5;
                long j15 = (j2 & 67108863) + (j12 >> 26);
                long j16 = j15 + (j14 >> 26);
                long j17 = (j16 >> 26) + j7;
                long j18 = j9 + (j17 >> 26);
                long j19 = (j11 + (j18 >> 26)) - 67108864;
                long j20 = j19 >> 63;
                long j21 = ~j20;
                long j22 = (j15 & j20) | (j16 & 67108863 & j21);
                long j23 = (j7 & j20) | (j17 & 67108863 & j21);
                long j24 = (j9 & j20) | (j18 & 67108863 & j21);
                long j25 = (j11 & j20) | (j19 & j21);
                long jZzc = (((j20 & j13) | (j14 & 67108863 & j21) | (j22 << 26)) & androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE) + zzc(bArr, 16);
                long jZzc2 = (((j22 >> 6) | (j23 << 20)) & androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE) + zzc(bArr, 20);
                long jZzc3 = (((j23 >> 12) | (j24 << 14)) & androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE) + zzc(bArr, 24);
                long jZzc4 = (((j24 >> 18) | (j25 << 8)) & androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE) + zzc(bArr, 28);
                byte[] bArr4 = new byte[16];
                zzd(bArr4, jZzc & androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE, 0);
                long j26 = jZzc2 + (jZzc >> 32);
                zzd(bArr4, j26 & androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE, 4);
                long j27 = jZzc3 + (j26 >> 32);
                zzd(bArr4, j27 & androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE, 8);
                zzd(bArr4, (jZzc4 + (j27 >> 32)) & androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE, 12);
                return bArr4;
            }
            int iMin = java.lang.Math.min(16, length - i2);
            java.lang.System.arraycopy(bArr2, i2, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                java.util.Arrays.fill(bArr3, iMin + 1, i, (byte) 0);
            }
            long j28 = jZzb5 * 5;
            long j29 = jZzb4 * 5;
            long j30 = jZzb3 * 5;
            long jZzb6 = j5 + zzb(bArr3, 0, 0);
            long jZzb7 = j2 + zzb(bArr3, 3, 2);
            long jZzb8 = j + zzb(bArr3, 6, 4);
            long jZzb9 = j3 + zzb(bArr3, 9, 6);
            long jZzb10 = j4 + (zzb(bArr3, 12, 8) | ((long) (bArr3[16] << 24)));
            long j31 = jZzb7 * jZzb;
            long j32 = jZzb7 * jZzb2;
            long j33 = jZzb7 * jZzb3;
            long j34 = jZzb9 * jZzb;
            long j35 = jZzb7 * jZzb4;
            long j36 = jZzb10 * jZzb;
            long j37 = (jZzb6 * jZzb) + (jZzb7 * j28) + (jZzb8 * j29) + (jZzb9 * j30) + (jZzb2 * 5 * jZzb10);
            long j38 = (jZzb6 * jZzb2) + j31 + (jZzb8 * j28) + (jZzb9 * j29) + (j30 * jZzb10) + (j37 >> 26);
            long j39 = (jZzb6 * jZzb3) + j32 + (jZzb8 * jZzb) + (jZzb9 * j28) + (j29 * jZzb10) + (j38 >> 26);
            long j40 = (jZzb6 * jZzb4) + j33 + (jZzb8 * jZzb2) + j34 + (jZzb10 * j28) + (j39 >> 26);
            long j41 = (jZzb6 * jZzb5) + j35 + (jZzb8 * jZzb3) + (jZzb9 * jZzb2) + j36 + (j40 >> 26);
            long j42 = (j37 & 67108863) + ((j41 >> 26) * 5);
            j2 = (j38 & 67108863) + (j42 >> 26);
            i2 += 16;
            j = j39 & 67108863;
            j3 = j40 & 67108863;
            j4 = j41 & 67108863;
            i = 17;
            j5 = j42 & 67108863;
        }
    }

    private static long zzb(byte[] bArr, int i, int i2) {
        return (zzc(bArr, i) >> i2) & 67108863;
    }

    private static long zzc(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((long) (((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16))) & androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE;
    }

    private static void zzd(byte[] bArr, long j, int i) {
        for (int i2 = 0; i2 < 4; i2++) {
            bArr[i + i2] = (byte) (255 & j);
            j >>= 8;
        }
    }
}
