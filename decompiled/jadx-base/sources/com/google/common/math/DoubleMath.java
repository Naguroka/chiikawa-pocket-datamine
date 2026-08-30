package com.google.common.math;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.math.ElementTypesAreNonnullByDefault
public final class DoubleMath {
    static final int MAX_FACTORIAL = 170;
    private static final double MAX_INT_AS_DOUBLE = 2.147483647E9d;
    private static final double MAX_LONG_AS_DOUBLE_PLUS_ONE = 9.223372036854776E18d;
    private static final double MIN_INT_AS_DOUBLE = -2.147483648E9d;
    private static final double MIN_LONG_AS_DOUBLE = -9.223372036854776E18d;
    private static final double LN_2 = java.lang.Math.log(2.0d);
    static final double[] everySixteenthFactorial = {1.0d, 2.0922789888E13d, 2.631308369336935E35d, 1.2413915592536073E61d, 1.2688693218588417E89d, 7.156945704626381E118d, 9.916779348709496E149d, 1.974506857221074E182d, 3.856204823625804E215d, 5.5502938327393044E249d, 4.7147236359920616E284d};

    static double roundIntermediate(double x, java.math.RoundingMode mode) {
        if (!com.google.common.math.DoubleUtils.isFinite(x)) {
            throw new java.lang.ArithmeticException("input is infinite or NaN");
        }
        switch (com.google.common.math.DoubleMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode[mode.ordinal()]) {
            case 1:
                com.google.common.math.MathPreconditions.checkRoundingUnnecessary(isMathematicalInteger(x));
                return x;
            case 2:
                return (x >= 0.0d || isMathematicalInteger(x)) ? x : ((long) x) - 1;
            case 3:
                return (x <= 0.0d || isMathematicalInteger(x)) ? x : ((long) x) + 1;
            case 4:
                return x;
            case 5:
                if (isMathematicalInteger(x)) {
                    return x;
                }
                return ((long) x) + ((long) (x > 0.0d ? 1 : -1));
            case 6:
                return java.lang.Math.rint(x);
            case 7:
                double dRint = java.lang.Math.rint(x);
                return java.lang.Math.abs(x - dRint) == 0.5d ? x + java.lang.Math.copySign(0.5d, x) : dRint;
            case 8:
                double dRint2 = java.lang.Math.rint(x);
                return java.lang.Math.abs(x - dRint2) == 0.5d ? x : dRint2;
            default:
                throw new java.lang.AssertionError();
        }
    }

    /* JADX INFO: renamed from: com.google.common.math.DoubleMath$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$math$RoundingMode;

        static {
            int[] iArr = new int[java.math.RoundingMode.values().length];
            $SwitchMap$java$math$RoundingMode = iArr;
            try {
                iArr[java.math.RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[java.math.RoundingMode.FLOOR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[java.math.RoundingMode.CEILING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[java.math.RoundingMode.DOWN.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[java.math.RoundingMode.UP.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[java.math.RoundingMode.HALF_EVEN.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[java.math.RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[java.math.RoundingMode.HALF_DOWN.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
        }
    }

    public static int roundToInt(double x, java.math.RoundingMode mode) {
        double dRoundIntermediate = roundIntermediate(x, mode);
        com.google.common.math.MathPreconditions.checkInRangeForRoundingInputs((dRoundIntermediate > -2.147483649E9d) & (dRoundIntermediate < 2.147483648E9d), x, mode);
        return (int) dRoundIntermediate;
    }

    public static long roundToLong(double x, java.math.RoundingMode mode) {
        double dRoundIntermediate = roundIntermediate(x, mode);
        com.google.common.math.MathPreconditions.checkInRangeForRoundingInputs((MIN_LONG_AS_DOUBLE - dRoundIntermediate < 1.0d) & (dRoundIntermediate < MAX_LONG_AS_DOUBLE_PLUS_ONE), x, mode);
        return (long) dRoundIntermediate;
    }

    public static java.math.BigInteger roundToBigInteger(double x, java.math.RoundingMode mode) {
        double dRoundIntermediate = roundIntermediate(x, mode);
        if ((MIN_LONG_AS_DOUBLE - dRoundIntermediate < 1.0d) & (dRoundIntermediate < MAX_LONG_AS_DOUBLE_PLUS_ONE)) {
            return java.math.BigInteger.valueOf((long) dRoundIntermediate);
        }
        java.math.BigInteger bigIntegerShiftLeft = java.math.BigInteger.valueOf(com.google.common.math.DoubleUtils.getSignificand(dRoundIntermediate)).shiftLeft(java.lang.Math.getExponent(dRoundIntermediate) - 52);
        return dRoundIntermediate < 0.0d ? bigIntegerShiftLeft.negate() : bigIntegerShiftLeft;
    }

    public static boolean isPowerOfTwo(double x) {
        if (x <= 0.0d || !com.google.common.math.DoubleUtils.isFinite(x)) {
            return false;
        }
        long significand = com.google.common.math.DoubleUtils.getSignificand(x);
        return (significand & (significand - 1)) == 0;
    }

    public static double log2(double x) {
        return java.lang.Math.log(x) / LN_2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x006a  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    public static int log2(double x, java.math.RoundingMode mode) {
        boolean zIsPowerOfTwo;
        boolean z = false;
        com.google.common.base.Preconditions.checkArgument(x > 0.0d && com.google.common.math.DoubleUtils.isFinite(x), "x must be positive and finite");
        int exponent = java.lang.Math.getExponent(x);
        if (!com.google.common.math.DoubleUtils.isNormal(x)) {
            return log2(x * 4.503599627370496E15d, mode) - 52;
        }
        switch (com.google.common.math.DoubleMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode[mode.ordinal()]) {
            case 1:
                com.google.common.math.MathPreconditions.checkRoundingUnnecessary(isPowerOfTwo(x));
                if (z) {
                    return exponent + 1;
                }
                return exponent;
            case 2:
                if (z) {
                    return exponent + 1;
                }
                return exponent;
            case 3:
                z = !isPowerOfTwo(x);
                if (z) {
                    return exponent + 1;
                }
                return exponent;
            case 4:
                z = exponent < 0;
                zIsPowerOfTwo = isPowerOfTwo(x);
                z &= !zIsPowerOfTwo;
                if (z) {
                    return exponent + 1;
                }
                return exponent;
            case 5:
                z = exponent >= 0;
                zIsPowerOfTwo = isPowerOfTwo(x);
                z &= !zIsPowerOfTwo;
                if (z) {
                    return exponent + 1;
                }
                return exponent;
            case 6:
            case 7:
            case 8:
                double dScaleNormalize = com.google.common.math.DoubleUtils.scaleNormalize(x);
                if (dScaleNormalize * dScaleNormalize > 2.0d) {
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

    public static boolean isMathematicalInteger(double x) {
        return com.google.common.math.DoubleUtils.isFinite(x) && (x == 0.0d || 52 - java.lang.Long.numberOfTrailingZeros(com.google.common.math.DoubleUtils.getSignificand(x)) <= java.lang.Math.getExponent(x));
    }

    public static double factorial(int n) {
        com.google.common.math.MathPreconditions.checkNonNegative(com.json.zb.q, n);
        if (n > 170) {
            return Double.POSITIVE_INFINITY;
        }
        double d = 1.0d;
        for (int i = (n & (-16)) + 1; i <= n; i++) {
            d *= (double) i;
        }
        return d * everySixteenthFactorial[n >> 4];
    }

    public static boolean fuzzyEquals(double a2, double b, double tolerance) {
        com.google.common.math.MathPreconditions.checkNonNegative("tolerance", tolerance);
        return java.lang.Math.copySign(a2 - b, 1.0d) <= tolerance || a2 == b || (java.lang.Double.isNaN(a2) && java.lang.Double.isNaN(b));
    }

    public static int fuzzyCompare(double a2, double b, double tolerance) {
        if (fuzzyEquals(a2, b, tolerance)) {
            return 0;
        }
        if (a2 < b) {
            return -1;
        }
        if (a2 > b) {
            return 1;
        }
        return com.google.common.primitives.Booleans.compare(java.lang.Double.isNaN(a2), java.lang.Double.isNaN(b));
    }

    @java.lang.Deprecated
    public static double mean(double... values) {
        com.google.common.base.Preconditions.checkArgument(values.length > 0, "Cannot take mean of 0 values");
        double dCheckFinite = checkFinite(values[0]);
        long j = 1;
        for (int i = 1; i < values.length; i++) {
            checkFinite(values[i]);
            j++;
            dCheckFinite += (values[i] - dCheckFinite) / j;
        }
        return dCheckFinite;
    }

    @java.lang.Deprecated
    public static double mean(int... values) {
        com.google.common.base.Preconditions.checkArgument(values.length > 0, "Cannot take mean of 0 values");
        long j = 0;
        for (int i : values) {
            j += (long) i;
        }
        return j / ((double) values.length);
    }

    @java.lang.Deprecated
    public static double mean(long... values) {
        com.google.common.base.Preconditions.checkArgument(values.length > 0, "Cannot take mean of 0 values");
        double d = values[0];
        long j = 1;
        for (int i = 1; i < values.length; i++) {
            j++;
            d += (values[i] - d) / j;
        }
        return d;
    }

    @java.lang.Deprecated
    public static double mean(java.lang.Iterable<? extends java.lang.Number> values) {
        return mean(values.iterator());
    }

    @java.lang.Deprecated
    public static double mean(java.util.Iterator<? extends java.lang.Number> values) {
        com.google.common.base.Preconditions.checkArgument(values.hasNext(), "Cannot take mean of 0 values");
        double dCheckFinite = checkFinite(values.next().doubleValue());
        long j = 1;
        while (values.hasNext()) {
            j++;
            dCheckFinite += (checkFinite(values.next().doubleValue()) - dCheckFinite) / j;
        }
        return dCheckFinite;
    }

    private static double checkFinite(double argument) {
        com.google.common.base.Preconditions.checkArgument(com.google.common.math.DoubleUtils.isFinite(argument));
        return argument;
    }

    private DoubleMath() {
    }
}
