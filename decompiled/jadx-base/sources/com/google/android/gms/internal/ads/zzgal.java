package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgal {
    public static long zza(long j, long j2) {
        long j3 = j + j2;
        if (((j ^ j2) < 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new java.lang.ArithmeticException("overflow: checkedAdd(" + j + ", " + j2 + ")");
    }

    public static long zzc(long j, long j2) {
        com.google.android.gms.internal.ads.zzgam.zza(androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, j);
        com.google.android.gms.internal.ads.zzgam.zza("b", j2);
        if (j == 0) {
            return j2;
        }
        if (j2 == 0) {
            return j;
        }
        int iNumberOfTrailingZeros = java.lang.Long.numberOfTrailingZeros(j);
        long jNumberOfTrailingZeros = j >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = java.lang.Long.numberOfTrailingZeros(j2);
        long j3 = j2 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j3) {
            long j4 = jNumberOfTrailingZeros - j3;
            long j5 = (j4 >> 63) & j4;
            long j6 = (j4 - j5) - j5;
            jNumberOfTrailingZeros = j6 >> java.lang.Long.numberOfTrailingZeros(j6);
            j3 += j5;
        }
        return jNumberOfTrailingZeros << java.lang.Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    public static long zzd(long j, long j2) {
        int iNumberOfLeadingZeros = java.lang.Long.numberOfLeadingZeros(j) + java.lang.Long.numberOfLeadingZeros(~j) + java.lang.Long.numberOfLeadingZeros(j2) + java.lang.Long.numberOfLeadingZeros(~j2);
        if (iNumberOfLeadingZeros > 65) {
            return j * j2;
        }
        long j3 = ((j ^ j2) >>> 63) + Long.MAX_VALUE;
        if ((iNumberOfLeadingZeros < 64) || ((j2 == Long.MIN_VALUE) & (j < 0))) {
            return j3;
        }
        long j4 = j * j2;
        return (j == 0 || j4 / j == j2) ? j4 : j3;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0050  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
    
        if (r9 != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long zzb(long j, long j2, java.math.RoundingMode roundingMode) {
        roundingMode.getClass();
        long j3 = j / j2;
        long j4 = j - (j2 * j3);
        if (j4 != 0) {
            boolean z = true;
            int i = ((int) ((j ^ j2) >> 63)) | 1;
            switch (com.google.android.gms.internal.ads.zzgak.zza[roundingMode.ordinal()]) {
                case 1:
                    com.google.android.gms.internal.ads.zzgam.zzb(false);
                case 2:
                    return j3;
                case 3:
                    if (i >= 0) {
                        z = false;
                    }
                    break;
                case 4:
                    return j3 + ((long) i);
                case 5:
                    if (i <= 0) {
                        z = false;
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    long jAbs = java.lang.Math.abs(j4);
                    long jAbs2 = jAbs - (java.lang.Math.abs(j2) - jAbs);
                    if (jAbs2 != 0 ? jAbs2 <= 0 : roundingMode != java.math.RoundingMode.HALF_UP && (roundingMode != java.math.RoundingMode.HALF_EVEN || (1 & j3) == 0)) {
                        z = false;
                    }
                    break;
                default:
                    throw new java.lang.AssertionError();
            }
        }
        return j3;
    }
}
