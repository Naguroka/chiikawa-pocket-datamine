package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgaj {
    public static int zza(int i, int i2) {
        long j = ((long) i) + ((long) i2);
        int i3 = (int) j;
        if (j == i3) {
            return i3;
        }
        throw new java.lang.ArithmeticException("overflow: checkedAdd(" + i + ", " + i2 + ")");
    }

    public static int zzc(int i, java.math.RoundingMode roundingMode) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("x (0) must be > 0");
        }
        switch (com.google.android.gms.internal.ads.zzgai.zza[roundingMode.ordinal()]) {
            case 1:
                com.google.android.gms.internal.ads.zzgam.zzb(((i + (-1)) & i) == 0);
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - java.lang.Integer.numberOfLeadingZeros(i - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = java.lang.Integer.numberOfLeadingZeros(i);
                return (31 - iNumberOfLeadingZeros) + ((((-1257966797) >>> iNumberOfLeadingZeros) - i) >>> 31);
            default:
                throw new java.lang.AssertionError();
        }
        return 31 - java.lang.Integer.numberOfLeadingZeros(i);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004b  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
    
        if (r3 != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zzb(int i, int i2, java.math.RoundingMode roundingMode) {
        roundingMode.getClass();
        if (i2 == 0) {
            throw new java.lang.ArithmeticException("/ by zero");
        }
        int i3 = i / i2;
        int i4 = i - (i2 * i3);
        if (i4 != 0) {
            boolean z = true;
            int i5 = ((i ^ i2) >> 31) | 1;
            switch (com.google.android.gms.internal.ads.zzgai.zza[roundingMode.ordinal()]) {
                case 1:
                    com.google.android.gms.internal.ads.zzgam.zzb(false);
                case 2:
                    return i3;
                case 3:
                    if (i5 >= 0) {
                        z = false;
                    }
                    break;
                case 4:
                    return i3 + i5;
                case 5:
                    if (i5 <= 0) {
                        z = false;
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    int iAbs = java.lang.Math.abs(i4);
                    int iAbs2 = iAbs - (java.lang.Math.abs(i2) - iAbs);
                    if (iAbs2 != 0) {
                        if (iAbs2 <= 0) {
                            z = false;
                        }
                    } else if (roundingMode != java.math.RoundingMode.HALF_UP) {
                        if (((roundingMode == java.math.RoundingMode.HALF_EVEN ? 1 : 0) & i3 & 1) == 0) {
                            z = false;
                        }
                    }
                    break;
                default:
                    throw new java.lang.AssertionError();
            }
        }
        return i3;
    }
}
