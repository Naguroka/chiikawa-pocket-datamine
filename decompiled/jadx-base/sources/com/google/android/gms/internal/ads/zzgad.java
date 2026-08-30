package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgad {
    static {
        new com.google.android.gms.internal.ads.zzgab();
    }

    public static java.io.InputStream zza(java.io.InputStream inputStream, long j) {
        return new com.google.android.gms.internal.ads.zzgac(inputStream, j);
    }

    private static byte[] zzc(java.util.Queue queue, int i) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) queue.remove();
        int length = bArr.length;
        if (length == i) {
            return bArr;
        }
        byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, i);
        int i2 = i - length;
        while (i2 > 0) {
            byte[] bArr2 = (byte[]) queue.remove();
            int iMin = java.lang.Math.min(i2, bArr2.length);
            java.lang.System.arraycopy(bArr2, 0, bArrCopyOf, i - i2, iMin);
            i2 -= iMin;
        }
        return bArrCopyOf;
    }

    public static byte[] zzb(java.io.InputStream inputStream) throws java.io.IOException {
        inputStream.getClass();
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque(20);
        int iHighestOneBit = java.lang.Integer.highestOneBit(0);
        int iMin = java.lang.Math.min(8192, java.lang.Math.max(128, iHighestOneBit + iHighestOneBit));
        int i = 0;
        while (i < 2147483639) {
            int iMin2 = java.lang.Math.min(iMin, 2147483639 - i);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i2 = 0;
            while (i2 < iMin2) {
                int i3 = inputStream.read(bArr, i2, iMin2 - i2);
                if (i3 == -1) {
                    return zzc(arrayDeque, i);
                }
                i2 += i3;
                i += i3;
            }
            iMin = com.google.android.gms.internal.ads.zzgaq.zze(((long) iMin) * ((long) (iMin < 4096 ? 4 : 2)));
        }
        if (inputStream.read() == -1) {
            return zzc(arrayDeque, 2147483639);
        }
        throw new java.lang.OutOfMemoryError("input is too large to fit in a byte array");
    }
}
