package com.google.common.math;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.math.ElementTypesAreNonnullByDefault
final class DoubleUtils {
    static final int EXPONENT_BIAS = 1023;
    static final long EXPONENT_MASK = 9218868437227405312L;
    static final long IMPLICIT_BIT = 4503599627370496L;
    static final long ONE_BITS = 4607182418800017408L;
    static final int SIGNIFICAND_BITS = 52;
    static final long SIGNIFICAND_MASK = 4503599627370495L;
    static final long SIGN_MASK = Long.MIN_VALUE;

    private DoubleUtils() {
    }

    static double nextDown(double d) {
        return -java.lang.Math.nextUp(-d);
    }

    static long getSignificand(double d) {
        com.google.common.base.Preconditions.checkArgument(isFinite(d), "not a normal value");
        int exponent = java.lang.Math.getExponent(d);
        long jDoubleToRawLongBits = java.lang.Double.doubleToRawLongBits(d) & SIGNIFICAND_MASK;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | IMPLICIT_BIT;
    }

    static boolean isFinite(double d) {
        return java.lang.Math.getExponent(d) <= 1023;
    }

    static boolean isNormal(double d) {
        return java.lang.Math.getExponent(d) >= -1022;
    }

    static double scaleNormalize(double x) {
        return java.lang.Double.longBitsToDouble((java.lang.Double.doubleToRawLongBits(x) & SIGNIFICAND_MASK) | ONE_BITS);
    }

    static double bigToDouble(java.math.BigInteger x) {
        java.math.BigInteger bigIntegerAbs = x.abs();
        boolean z = true;
        int iBitLength = bigIntegerAbs.bitLength() - 1;
        if (iBitLength < 63) {
            return x.longValue();
        }
        if (iBitLength > 1023) {
            return ((double) x.signum()) * Double.POSITIVE_INFINITY;
        }
        int i = (iBitLength - 52) - 1;
        long jLongValue = bigIntegerAbs.shiftRight(i).longValue();
        long j = (jLongValue >> 1) & SIGNIFICAND_MASK;
        if ((jLongValue & 1) == 0 || ((j & 1) == 0 && bigIntegerAbs.getLowestSetBit() >= i)) {
            z = false;
        }
        if (z) {
            j++;
        }
        return java.lang.Double.longBitsToDouble(((((long) (iBitLength + 1023)) << 52) + j) | (((long) x.signum()) & Long.MIN_VALUE));
    }

    static double ensureNonNegative(double value) {
        com.google.common.base.Preconditions.checkArgument(!java.lang.Double.isNaN(value));
        return java.lang.Math.max(value, 0.0d);
    }
}
