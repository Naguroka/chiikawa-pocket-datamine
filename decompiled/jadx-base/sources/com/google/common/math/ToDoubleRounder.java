package com.google.common.math;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.math.ElementTypesAreNonnullByDefault
abstract class ToDoubleRounder<X extends java.lang.Number & java.lang.Comparable<X>> {
    abstract X minus(X a2, X b);

    abstract double roundToDoubleArbitrarily(X x);

    abstract int sign(X x);

    abstract X toX(double d, java.math.RoundingMode mode);

    ToDoubleRounder() {
    }

    final double roundToDouble(X x, java.math.RoundingMode mode) {
        java.lang.Number x2;
        double dNextUp;
        com.google.common.base.Preconditions.checkNotNull(x, "x");
        com.google.common.base.Preconditions.checkNotNull(mode, com.ironsource.y8.a.t);
        double dRoundToDoubleArbitrarily = roundToDoubleArbitrarily(x);
        if (java.lang.Double.isInfinite(dRoundToDoubleArbitrarily)) {
            switch (com.google.common.math.ToDoubleRounder.AnonymousClass1.$SwitchMap$java$math$RoundingMode[mode.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    return ((double) sign(x)) * Double.MAX_VALUE;
                case 5:
                    return dRoundToDoubleArbitrarily == Double.POSITIVE_INFINITY ? Double.MAX_VALUE : Double.NEGATIVE_INFINITY;
                case 6:
                    return dRoundToDoubleArbitrarily == Double.POSITIVE_INFINITY ? Double.POSITIVE_INFINITY : -1.7976931348623157E308d;
                case 7:
                    return dRoundToDoubleArbitrarily;
                case 8:
                    throw new java.lang.ArithmeticException(x + " cannot be represented precisely as a double");
            }
        }
        java.lang.Number x3 = toX(dRoundToDoubleArbitrarily, java.math.RoundingMode.UNNECESSARY);
        int iCompareTo = ((java.lang.Comparable) x).compareTo(x3);
        switch (com.google.common.math.ToDoubleRounder.AnonymousClass1.$SwitchMap$java$math$RoundingMode[mode.ordinal()]) {
            case 1:
                if (sign(x) >= 0) {
                    return iCompareTo >= 0 ? dRoundToDoubleArbitrarily : com.google.common.math.DoubleUtils.nextDown(dRoundToDoubleArbitrarily);
                }
                return iCompareTo <= 0 ? dRoundToDoubleArbitrarily : java.lang.Math.nextUp(dRoundToDoubleArbitrarily);
            case 2:
            case 3:
            case 4:
                if (iCompareTo >= 0) {
                    dNextUp = java.lang.Math.nextUp(dRoundToDoubleArbitrarily);
                    if (dNextUp == Double.POSITIVE_INFINITY) {
                        return dRoundToDoubleArbitrarily;
                    }
                    x2 = toX(dNextUp, java.math.RoundingMode.CEILING);
                } else {
                    double dNextDown = com.google.common.math.DoubleUtils.nextDown(dRoundToDoubleArbitrarily);
                    if (dNextDown == Double.NEGATIVE_INFINITY) {
                        return dRoundToDoubleArbitrarily;
                    }
                    java.lang.Number x4 = toX(dNextDown, java.math.RoundingMode.FLOOR);
                    x2 = x3;
                    x3 = x4;
                    dNextUp = dRoundToDoubleArbitrarily;
                    dRoundToDoubleArbitrarily = dNextDown;
                }
                int iCompareTo2 = ((java.lang.Comparable) minus(x, x3)).compareTo(minus(x2, x));
                if (iCompareTo2 < 0) {
                    return dRoundToDoubleArbitrarily;
                }
                if (iCompareTo2 > 0) {
                    return dNextUp;
                }
                int i = com.google.common.math.ToDoubleRounder.AnonymousClass1.$SwitchMap$java$math$RoundingMode[mode.ordinal()];
                if (i == 2) {
                    return (java.lang.Double.doubleToRawLongBits(dRoundToDoubleArbitrarily) & 1) == 0 ? dRoundToDoubleArbitrarily : dNextUp;
                }
                if (i == 3) {
                    return sign(x) >= 0 ? dRoundToDoubleArbitrarily : dNextUp;
                }
                if (i == 4) {
                    return sign(x) >= 0 ? dNextUp : dRoundToDoubleArbitrarily;
                }
                throw new java.lang.AssertionError("impossible");
            case 5:
                return iCompareTo >= 0 ? dRoundToDoubleArbitrarily : com.google.common.math.DoubleUtils.nextDown(dRoundToDoubleArbitrarily);
            case 6:
                return iCompareTo <= 0 ? dRoundToDoubleArbitrarily : java.lang.Math.nextUp(dRoundToDoubleArbitrarily);
            case 7:
                if (sign(x) >= 0) {
                    return iCompareTo <= 0 ? dRoundToDoubleArbitrarily : java.lang.Math.nextUp(dRoundToDoubleArbitrarily);
                }
                return iCompareTo >= 0 ? dRoundToDoubleArbitrarily : com.google.common.math.DoubleUtils.nextDown(dRoundToDoubleArbitrarily);
            case 8:
                com.google.common.math.MathPreconditions.checkRoundingUnnecessary(iCompareTo == 0);
                return dRoundToDoubleArbitrarily;
            default:
                throw new java.lang.AssertionError("impossible");
        }
    }

    /* JADX INFO: renamed from: com.google.common.math.ToDoubleRounder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$math$RoundingMode;

        static {
            int[] iArr = new int[java.math.RoundingMode.values().length];
            $SwitchMap$java$math$RoundingMode = iArr;
            try {
                iArr[java.math.RoundingMode.DOWN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[java.math.RoundingMode.HALF_EVEN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[java.math.RoundingMode.HALF_DOWN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[java.math.RoundingMode.HALF_UP.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[java.math.RoundingMode.FLOOR.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[java.math.RoundingMode.CEILING.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[java.math.RoundingMode.UP.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[java.math.RoundingMode.UNNECESSARY.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
        }
    }
}
