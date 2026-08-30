package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgag {
    static {
        java.lang.Math.log(2.0d);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0067  */
    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    public static int zza(double d, java.math.RoundingMode roundingMode) {
        boolean zZzd;
        boolean z = false;
        com.google.android.gms.internal.ads.zzfun.zzf(d > 0.0d && com.google.android.gms.internal.ads.zzgah.zzb(d), "x must be positive and finite");
        int exponent = java.lang.Math.getExponent(d);
        if (java.lang.Math.getExponent(d) < -1022) {
            return zza(d * 4.503599627370496E15d, roundingMode) - 52;
        }
        switch (com.google.android.gms.internal.ads.zzgaf.zza[roundingMode.ordinal()]) {
            case 1:
                com.google.android.gms.internal.ads.zzgam.zzb(zzd(d));
                return exponent;
            case 2:
                return exponent;
            case 3:
                z = !zzd(d);
                if (z) {
                    return exponent + 1;
                }
                return exponent;
            case 4:
                z = exponent < 0;
                zZzd = zzd(d);
                z &= !zZzd;
                if (z) {
                    return exponent + 1;
                }
                return exponent;
            case 5:
                z = exponent >= 0;
                zZzd = zzd(d);
                z &= !zZzd;
                if (z) {
                    return exponent + 1;
                }
                return exponent;
            case 6:
            case 7:
            case 8:
                double dLongBitsToDouble = java.lang.Double.longBitsToDouble((java.lang.Double.doubleToRawLongBits(d) & 4503599627370495L) | 4607182418800017408L);
                if (dLongBitsToDouble * dLongBitsToDouble > 2.0d) {
                    z = true;
                }
                if (z) {
                    return exponent + 1;
                }
                return exponent;
            default:
                throw new java.lang.AssertionError();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x007d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0088  */
    /* JADX WARN: Code duplicated, block: B:41:0x008a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0092  */
    /* JADX WARN: Code duplicated, block: B:48:0x0096  */
    /* JADX WARN: Code duplicated, block: B:50:0x0098  */
    /* JADX WARN: Instruction removed from duplicated block: B:50:0x0098, please report this as an issue */
    public static long zzb(double d, java.math.RoundingMode roundingMode) {
        double dRint;
        long j;
        long j2;
        boolean z;
        if (!com.google.android.gms.internal.ads.zzgah.zzb(d)) {
            throw new java.lang.ArithmeticException("input is infinite or NaN");
        }
        switch (com.google.android.gms.internal.ads.zzgaf.zza[roundingMode.ordinal()]) {
            case 1:
                com.google.android.gms.internal.ads.zzgam.zzb(zzc(d));
                dRint = d;
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new java.lang.ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + java.lang.String.valueOf(roundingMode));
            case 2:
                if (d >= 0.0d || zzc(d)) {
                    dRint = d;
                } else {
                    j = (long) d;
                    j2 = -1;
                    dRint = j + j2;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new java.lang.ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + java.lang.String.valueOf(roundingMode));
            case 3:
                if (d <= 0.0d || zzc(d)) {
                    dRint = d;
                } else {
                    j = (long) d;
                    j2 = 1;
                    dRint = j + j2;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new java.lang.ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + java.lang.String.valueOf(roundingMode));
            case 4:
                dRint = d;
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new java.lang.ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + java.lang.String.valueOf(roundingMode));
            case 5:
                if (zzc(d)) {
                    dRint = d;
                } else {
                    j = (long) d;
                    j2 = d > 0.0d ? 1 : -1;
                    dRint = j + j2;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new java.lang.ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + java.lang.String.valueOf(roundingMode));
            case 6:
                dRint = java.lang.Math.rint(d);
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new java.lang.ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + java.lang.String.valueOf(roundingMode));
            case 7:
                dRint = java.lang.Math.rint(d);
                if (java.lang.Math.abs(d - dRint) == 0.5d) {
                    dRint = d + java.lang.Math.copySign(0.5d, d);
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new java.lang.ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + java.lang.String.valueOf(roundingMode));
            case 8:
                dRint = java.lang.Math.rint(d);
                if (java.lang.Math.abs(d - dRint) == 0.5d) {
                    dRint = d;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new java.lang.ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + java.lang.String.valueOf(roundingMode));
            default:
                throw new java.lang.AssertionError();
        }
    }

    public static boolean zzc(double d) {
        if (com.google.android.gms.internal.ads.zzgah.zzb(d)) {
            return d == 0.0d || 52 - java.lang.Long.numberOfTrailingZeros(com.google.android.gms.internal.ads.zzgah.zza(d)) <= java.lang.Math.getExponent(d);
        }
        return false;
    }

    public static boolean zzd(double d) {
        if (d > 0.0d && com.google.android.gms.internal.ads.zzgah.zzb(d)) {
            long jZza = com.google.android.gms.internal.ads.zzgah.zza(d);
            if ((jZza & ((-1) + jZza)) == 0) {
                return true;
            }
        }
        return false;
    }
}
