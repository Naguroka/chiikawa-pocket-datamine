package com.google.common.math;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.math.ElementTypesAreNonnullByDefault
final class MathPreconditions {
    static int checkPositive(java.lang.String role, int x) {
        if (x > 0) {
            return x;
        }
        throw new java.lang.IllegalArgumentException(role + " (" + x + ") must be > 0");
    }

    static long checkPositive(java.lang.String role, long x) {
        if (x > 0) {
            return x;
        }
        throw new java.lang.IllegalArgumentException(role + " (" + x + ") must be > 0");
    }

    static java.math.BigInteger checkPositive(java.lang.String role, java.math.BigInteger x) {
        if (x.signum() > 0) {
            return x;
        }
        throw new java.lang.IllegalArgumentException(role + " (" + x + ") must be > 0");
    }

    static int checkNonNegative(java.lang.String role, int x) {
        if (x >= 0) {
            return x;
        }
        throw new java.lang.IllegalArgumentException(role + " (" + x + ") must be >= 0");
    }

    static long checkNonNegative(java.lang.String role, long x) {
        if (x >= 0) {
            return x;
        }
        throw new java.lang.IllegalArgumentException(role + " (" + x + ") must be >= 0");
    }

    static java.math.BigInteger checkNonNegative(java.lang.String role, java.math.BigInteger x) {
        if (x.signum() >= 0) {
            return x;
        }
        throw new java.lang.IllegalArgumentException(role + " (" + x + ") must be >= 0");
    }

    static double checkNonNegative(java.lang.String role, double x) {
        if (x >= 0.0d) {
            return x;
        }
        throw new java.lang.IllegalArgumentException(role + " (" + x + ") must be >= 0");
    }

    static void checkRoundingUnnecessary(boolean condition) {
        if (!condition) {
            throw new java.lang.ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    static void checkInRangeForRoundingInputs(boolean condition, double input, java.math.RoundingMode mode) {
        if (!condition) {
            throw new java.lang.ArithmeticException("rounded value is out of range for input " + input + " and rounding mode " + mode);
        }
    }

    static void checkNoOverflow(boolean condition, java.lang.String methodName, int a2, int b) {
        if (!condition) {
            throw new java.lang.ArithmeticException("overflow: " + methodName + "(" + a2 + ", " + b + ")");
        }
    }

    static void checkNoOverflow(boolean condition, java.lang.String methodName, long a2, long b) {
        if (!condition) {
            throw new java.lang.ArithmeticException("overflow: " + methodName + "(" + a2 + ", " + b + ")");
        }
    }

    private MathPreconditions() {
    }
}
