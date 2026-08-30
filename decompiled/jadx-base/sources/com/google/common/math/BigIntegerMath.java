package com.google.common.math;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.math.ElementTypesAreNonnullByDefault
public final class BigIntegerMath {
    static final int SQRT2_PRECOMPUTE_THRESHOLD = 256;
    static final java.math.BigInteger SQRT2_PRECOMPUTED_BITS = new java.math.BigInteger("16a09e667f3bcc908b2fb1366ea957d3e3adec17512775099da2f590b0667322a", 16);
    private static final double LN_10 = java.lang.Math.log(10.0d);
    private static final double LN_2 = java.lang.Math.log(2.0d);

    public static java.math.BigInteger ceilingPowerOfTwo(java.math.BigInteger x) {
        return java.math.BigInteger.ZERO.setBit(log2(x, java.math.RoundingMode.CEILING));
    }

    public static java.math.BigInteger floorPowerOfTwo(java.math.BigInteger x) {
        return java.math.BigInteger.ZERO.setBit(log2(x, java.math.RoundingMode.FLOOR));
    }

    public static boolean isPowerOfTwo(java.math.BigInteger x) {
        com.google.common.base.Preconditions.checkNotNull(x);
        return x.signum() > 0 && x.getLowestSetBit() == x.bitLength() - 1;
    }

    public static int log2(java.math.BigInteger x, java.math.RoundingMode mode) {
        com.google.common.math.MathPreconditions.checkPositive("x", (java.math.BigInteger) com.google.common.base.Preconditions.checkNotNull(x));
        int iBitLength = x.bitLength() - 1;
        switch (com.google.common.math.BigIntegerMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode[mode.ordinal()]) {
            case 1:
                com.google.common.math.MathPreconditions.checkRoundingUnnecessary(isPowerOfTwo(x));
            case 2:
            case 3:
                return iBitLength;
            case 4:
            case 5:
                return isPowerOfTwo(x) ? iBitLength : iBitLength + 1;
            case 6:
            case 7:
            case 8:
                if (iBitLength < 256) {
                    return x.compareTo(SQRT2_PRECOMPUTED_BITS.shiftRight(256 - iBitLength)) <= 0 ? iBitLength : iBitLength + 1;
                }
                return x.pow(2).bitLength() + (-1) < (iBitLength * 2) + 1 ? iBitLength : iBitLength + 1;
            default:
                throw new java.lang.AssertionError();
        }
    }

    /* JADX INFO: renamed from: com.google.common.math.BigIntegerMath$1, reason: invalid class name */
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
                $SwitchMap$java$math$RoundingMode[java.math.RoundingMode.DOWN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[java.math.RoundingMode.FLOOR.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[java.math.RoundingMode.UP.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[java.math.RoundingMode.CEILING.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[java.math.RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[java.math.RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[java.math.RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
        }
    }

    public static int log10(java.math.BigInteger x, java.math.RoundingMode mode) {
        int iCompareTo;
        com.google.common.math.MathPreconditions.checkPositive("x", x);
        if (fitsInLong(x)) {
            return com.google.common.math.LongMath.log10(x.longValue(), mode);
        }
        int iLog2 = (int) ((((double) log2(x, java.math.RoundingMode.FLOOR)) * LN_2) / LN_10);
        java.math.BigInteger bigIntegerPow = java.math.BigInteger.TEN.pow(iLog2);
        int iCompareTo2 = bigIntegerPow.compareTo(x);
        if (iCompareTo2 > 0) {
            do {
                iLog2--;
                bigIntegerPow = bigIntegerPow.divide(java.math.BigInteger.TEN);
                iCompareTo = bigIntegerPow.compareTo(x);
            } while (iCompareTo > 0);
        } else {
            java.math.BigInteger bigIntegerMultiply = java.math.BigInteger.TEN.multiply(bigIntegerPow);
            int i = iCompareTo2;
            int iCompareTo3 = bigIntegerMultiply.compareTo(x);
            while (iCompareTo3 <= 0) {
                iLog2++;
                java.math.BigInteger bigIntegerMultiply2 = java.math.BigInteger.TEN.multiply(bigIntegerMultiply);
                int iCompareTo4 = bigIntegerMultiply2.compareTo(x);
                java.math.BigInteger bigInteger = bigIntegerMultiply;
                bigIntegerMultiply = bigIntegerMultiply2;
                bigIntegerPow = bigInteger;
                i = iCompareTo3;
                iCompareTo3 = iCompareTo4;
            }
            iCompareTo = i;
        }
        switch (com.google.common.math.BigIntegerMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode[mode.ordinal()]) {
            case 1:
                com.google.common.math.MathPreconditions.checkRoundingUnnecessary(iCompareTo == 0);
            case 2:
            case 3:
                return iLog2;
            case 4:
            case 5:
                return bigIntegerPow.equals(x) ? iLog2 : iLog2 + 1;
            case 6:
            case 7:
            case 8:
                return x.pow(2).compareTo(bigIntegerPow.pow(2).multiply(java.math.BigInteger.TEN)) <= 0 ? iLog2 : iLog2 + 1;
            default:
                throw new java.lang.AssertionError();
        }
    }

    public static java.math.BigInteger sqrt(java.math.BigInteger x, java.math.RoundingMode mode) {
        com.google.common.math.MathPreconditions.checkNonNegative("x", x);
        if (fitsInLong(x)) {
            return java.math.BigInteger.valueOf(com.google.common.math.LongMath.sqrt(x.longValue(), mode));
        }
        java.math.BigInteger bigIntegerSqrtFloor = sqrtFloor(x);
        switch (com.google.common.math.BigIntegerMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode[mode.ordinal()]) {
            case 1:
                com.google.common.math.MathPreconditions.checkRoundingUnnecessary(bigIntegerSqrtFloor.pow(2).equals(x));
            case 2:
            case 3:
                return bigIntegerSqrtFloor;
            case 4:
            case 5:
                int iIntValue = bigIntegerSqrtFloor.intValue();
                return iIntValue * iIntValue == x.intValue() && bigIntegerSqrtFloor.pow(2).equals(x) ? bigIntegerSqrtFloor : bigIntegerSqrtFloor.add(java.math.BigInteger.ONE);
            case 6:
            case 7:
            case 8:
                return bigIntegerSqrtFloor.pow(2).add(bigIntegerSqrtFloor).compareTo(x) >= 0 ? bigIntegerSqrtFloor : bigIntegerSqrtFloor.add(java.math.BigInteger.ONE);
            default:
                throw new java.lang.AssertionError();
        }
    }

    private static java.math.BigInteger sqrtFloor(java.math.BigInteger x) {
        java.math.BigInteger bigIntegerShiftLeft;
        int iLog2 = log2(x, java.math.RoundingMode.FLOOR);
        if (iLog2 < 1023) {
            bigIntegerShiftLeft = sqrtApproxWithDoubles(x);
        } else {
            int i = (iLog2 - 52) & (-2);
            bigIntegerShiftLeft = sqrtApproxWithDoubles(x.shiftRight(i)).shiftLeft(i >> 1);
        }
        java.math.BigInteger bigIntegerShiftRight = bigIntegerShiftLeft.add(x.divide(bigIntegerShiftLeft)).shiftRight(1);
        if (bigIntegerShiftLeft.equals(bigIntegerShiftRight)) {
            return bigIntegerShiftLeft;
        }
        while (true) {
            java.math.BigInteger bigIntegerShiftRight2 = bigIntegerShiftRight.add(x.divide(bigIntegerShiftRight)).shiftRight(1);
            if (bigIntegerShiftRight2.compareTo(bigIntegerShiftRight) >= 0) {
                return bigIntegerShiftRight;
            }
            bigIntegerShiftRight = bigIntegerShiftRight2;
        }
    }

    private static java.math.BigInteger sqrtApproxWithDoubles(java.math.BigInteger x) {
        return com.google.common.math.DoubleMath.roundToBigInteger(java.lang.Math.sqrt(com.google.common.math.DoubleUtils.bigToDouble(x)), java.math.RoundingMode.HALF_EVEN);
    }

    public static double roundToDouble(java.math.BigInteger x, java.math.RoundingMode mode) {
        return com.google.common.math.BigIntegerMath.BigIntegerToDoubleRounder.INSTANCE.roundToDouble(x, mode);
    }

    private static class BigIntegerToDoubleRounder extends com.google.common.math.ToDoubleRounder<java.math.BigInteger> {
        static final com.google.common.math.BigIntegerMath.BigIntegerToDoubleRounder INSTANCE = new com.google.common.math.BigIntegerMath.BigIntegerToDoubleRounder();

        private BigIntegerToDoubleRounder() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.math.ToDoubleRounder
        public double roundToDoubleArbitrarily(java.math.BigInteger bigInteger) {
            return com.google.common.math.DoubleUtils.bigToDouble(bigInteger);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.math.ToDoubleRounder
        public int sign(java.math.BigInteger bigInteger) {
            return bigInteger.signum();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.math.ToDoubleRounder
        public java.math.BigInteger toX(double d, java.math.RoundingMode mode) {
            return com.google.common.math.DoubleMath.roundToBigInteger(d, mode);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.math.ToDoubleRounder
        public java.math.BigInteger minus(java.math.BigInteger a2, java.math.BigInteger b) {
            return a2.subtract(b);
        }
    }

    public static java.math.BigInteger divide(java.math.BigInteger p, java.math.BigInteger q, java.math.RoundingMode mode) {
        return new java.math.BigDecimal(p).divide(new java.math.BigDecimal(q), 0, mode).toBigIntegerExact();
    }

    public static java.math.BigInteger factorial(int n) {
        com.google.common.math.MathPreconditions.checkNonNegative(com.json.zb.q, n);
        if (n < com.google.common.math.LongMath.factorials.length) {
            return java.math.BigInteger.valueOf(com.google.common.math.LongMath.factorials[n]);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(com.google.common.math.IntMath.divide(com.google.common.math.IntMath.log2(n, java.math.RoundingMode.CEILING) * n, 64, java.math.RoundingMode.CEILING));
        int length = com.google.common.math.LongMath.factorials.length;
        long j = com.google.common.math.LongMath.factorials[length - 1];
        int iNumberOfTrailingZeros = java.lang.Long.numberOfTrailingZeros(j);
        long j2 = j >> iNumberOfTrailingZeros;
        int iLog2 = com.google.common.math.LongMath.log2(j2, java.math.RoundingMode.FLOOR) + 1;
        long j3 = length;
        int iLog3 = com.google.common.math.LongMath.log2(j3, java.math.RoundingMode.FLOOR) + 1;
        int i = 1 << (iLog3 - 1);
        while (j3 <= n) {
            if ((j3 & ((long) i)) != 0) {
                i <<= 1;
                iLog3++;
            }
            int iNumberOfTrailingZeros2 = java.lang.Long.numberOfTrailingZeros(j3);
            long j4 = j3 >> iNumberOfTrailingZeros2;
            iNumberOfTrailingZeros += iNumberOfTrailingZeros2;
            if ((iLog3 - iNumberOfTrailingZeros2) + iLog2 >= 64) {
                arrayList.add(java.math.BigInteger.valueOf(j2));
                j2 = 1;
            }
            j2 *= j4;
            iLog2 = com.google.common.math.LongMath.log2(j2, java.math.RoundingMode.FLOOR) + 1;
            j3++;
        }
        if (j2 > 1) {
            arrayList.add(java.math.BigInteger.valueOf(j2));
        }
        return listProduct(arrayList).shiftLeft(iNumberOfTrailingZeros);
    }

    static java.math.BigInteger listProduct(java.util.List<java.math.BigInteger> nums) {
        return listProduct(nums, 0, nums.size());
    }

    static java.math.BigInteger listProduct(java.util.List<java.math.BigInteger> nums, int start, int end) {
        int i = end - start;
        if (i == 0) {
            return java.math.BigInteger.ONE;
        }
        if (i == 1) {
            return nums.get(start);
        }
        if (i == 2) {
            return nums.get(start).multiply(nums.get(start + 1));
        }
        if (i == 3) {
            return nums.get(start).multiply(nums.get(start + 1)).multiply(nums.get(start + 2));
        }
        int i2 = (end + start) >>> 1;
        return listProduct(nums, start, i2).multiply(listProduct(nums, i2, end));
    }

    public static java.math.BigInteger binomial(int n, int k) {
        com.google.common.math.MathPreconditions.checkNonNegative(com.json.zb.q, n);
        com.google.common.math.MathPreconditions.checkNonNegative("k", k);
        int i = 1;
        com.google.common.base.Preconditions.checkArgument(k <= n, "k (%s) > n (%s)", k, n);
        if (k > (n >> 1)) {
            k = n - k;
        }
        if (k < com.google.common.math.LongMath.biggestBinomials.length && n <= com.google.common.math.LongMath.biggestBinomials[k]) {
            return java.math.BigInteger.valueOf(com.google.common.math.LongMath.binomial(n, k));
        }
        java.math.BigInteger bigIntegerDivide = java.math.BigInteger.ONE;
        long j = n;
        int iLog2 = com.google.common.math.LongMath.log2(j, java.math.RoundingMode.CEILING);
        long j2 = 1;
        while (true) {
            int i2 = iLog2;
            while (i < k) {
                int i3 = n - i;
                i++;
                i2 += iLog2;
                if (i2 >= 63) {
                    bigIntegerDivide = bigIntegerDivide.multiply(java.math.BigInteger.valueOf(j)).divide(java.math.BigInteger.valueOf(j2));
                    j = i3;
                    j2 = i;
                } else {
                    j *= (long) i3;
                    j2 *= (long) i;
                }
            }
            return bigIntegerDivide.multiply(java.math.BigInteger.valueOf(j)).divide(java.math.BigInteger.valueOf(j2));
        }
    }

    static boolean fitsInLong(java.math.BigInteger x) {
        return x.bitLength() <= 63;
    }

    private BigIntegerMath() {
    }
}
