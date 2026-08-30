package com.google.common.primitives;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.primitives.ElementTypesAreNonnullByDefault
public final class UnsignedLongs {
    public static final long MAX_VALUE = -1;

    private static long flip(long a2) {
        return a2 ^ Long.MIN_VALUE;
    }

    private UnsignedLongs() {
    }

    public static int compare(long a2, long b) {
        return com.google.common.primitives.Longs.compare(flip(a2), flip(b));
    }

    public static long min(long... array) {
        com.google.common.base.Preconditions.checkArgument(array.length > 0);
        long jFlip = flip(array[0]);
        for (int i = 1; i < array.length; i++) {
            long jFlip2 = flip(array[i]);
            if (jFlip2 < jFlip) {
                jFlip = jFlip2;
            }
        }
        return flip(jFlip);
    }

    public static long max(long... array) {
        com.google.common.base.Preconditions.checkArgument(array.length > 0);
        long jFlip = flip(array[0]);
        for (int i = 1; i < array.length; i++) {
            long jFlip2 = flip(array[i]);
            if (jFlip2 > jFlip) {
                jFlip = jFlip2;
            }
        }
        return flip(jFlip);
    }

    public static java.lang.String join(java.lang.String separator, long... array) {
        com.google.common.base.Preconditions.checkNotNull(separator);
        if (array.length == 0) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(array.length * 5);
        sb.append(toString(array[0]));
        for (int i = 1; i < array.length; i++) {
            sb.append(separator).append(toString(array[i]));
        }
        return sb.toString();
    }

    public static java.util.Comparator<long[]> lexicographicalComparator() {
        return com.google.common.primitives.UnsignedLongs.LexicographicalComparator.INSTANCE;
    }

    enum LexicographicalComparator implements java.util.Comparator<long[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public java.lang.String toString() {
            return "UnsignedLongs.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(long[] left, long[] right) {
            int iMin = java.lang.Math.min(left.length, right.length);
            for (int i = 0; i < iMin; i++) {
                long j = left[i];
                long j2 = right[i];
                if (j != j2) {
                    return com.google.common.primitives.UnsignedLongs.compare(j, j2);
                }
            }
            return left.length - right.length;
        }
    }

    public static void sort(long[] array) {
        com.google.common.base.Preconditions.checkNotNull(array);
        sort(array, 0, array.length);
    }

    public static void sort(long[] array, int fromIndex, int toIndex) {
        com.google.common.base.Preconditions.checkNotNull(array);
        com.google.common.base.Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        for (int i = fromIndex; i < toIndex; i++) {
            array[i] = flip(array[i]);
        }
        java.util.Arrays.sort(array, fromIndex, toIndex);
        while (fromIndex < toIndex) {
            array[fromIndex] = flip(array[fromIndex]);
            fromIndex++;
        }
    }

    public static void sortDescending(long[] array) {
        com.google.common.base.Preconditions.checkNotNull(array);
        sortDescending(array, 0, array.length);
    }

    public static void sortDescending(long[] array, int fromIndex, int toIndex) {
        com.google.common.base.Preconditions.checkNotNull(array);
        com.google.common.base.Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        for (int i = fromIndex; i < toIndex; i++) {
            array[i] = Long.MAX_VALUE ^ array[i];
        }
        java.util.Arrays.sort(array, fromIndex, toIndex);
        while (fromIndex < toIndex) {
            array[fromIndex] = array[fromIndex] ^ Long.MAX_VALUE;
            fromIndex++;
        }
    }

    public static long divide(long dividend, long divisor) {
        if (divisor < 0) {
            return compare(dividend, divisor) < 0 ? 0L : 1L;
        }
        if (dividend >= 0) {
            return dividend / divisor;
        }
        long j = ((dividend >>> 1) / divisor) << 1;
        return j + ((long) (compare(dividend - (j * divisor), divisor) < 0 ? 0 : 1));
    }

    public static long remainder(long dividend, long divisor) {
        if (divisor < 0) {
            return compare(dividend, divisor) < 0 ? dividend : dividend - divisor;
        }
        if (dividend >= 0) {
            return dividend % divisor;
        }
        long j = dividend - ((((dividend >>> 1) / divisor) << 1) * divisor);
        if (compare(j, divisor) < 0) {
            divisor = 0;
        }
        return j - divisor;
    }

    public static long parseUnsignedLong(java.lang.String string) {
        return parseUnsignedLong(string, 10);
    }

    public static long parseUnsignedLong(java.lang.String string, int radix) {
        com.google.common.base.Preconditions.checkNotNull(string);
        if (string.length() == 0) {
            throw new java.lang.NumberFormatException("empty string");
        }
        if (radix < 2 || radix > 36) {
            throw new java.lang.NumberFormatException("illegal radix: " + radix);
        }
        int i = com.google.common.primitives.UnsignedLongs.ParseOverflowDetection.maxSafeDigits[radix] - 1;
        long j = 0;
        for (int i2 = 0; i2 < string.length(); i2++) {
            int iDigit = java.lang.Character.digit(string.charAt(i2), radix);
            if (iDigit == -1) {
                throw new java.lang.NumberFormatException(string);
            }
            if (i2 > i && com.google.common.primitives.UnsignedLongs.ParseOverflowDetection.overflowInParse(j, iDigit, radix)) {
                throw new java.lang.NumberFormatException("Too large for unsigned long: " + string);
            }
            j = (j * ((long) radix)) + ((long) iDigit);
        }
        return j;
    }

    public static long decode(java.lang.String stringValue) {
        com.google.common.primitives.ParseRequest parseRequestFromString = com.google.common.primitives.ParseRequest.fromString(stringValue);
        try {
            return parseUnsignedLong(parseRequestFromString.rawValue, parseRequestFromString.radix);
        } catch (java.lang.NumberFormatException e) {
            java.lang.NumberFormatException numberFormatException = new java.lang.NumberFormatException("Error parsing value: " + stringValue);
            numberFormatException.initCause(e);
            throw numberFormatException;
        }
    }

    private static final class ParseOverflowDetection {
        static final long[] maxValueDivs = new long[37];
        static final int[] maxValueMods = new int[37];
        static final int[] maxSafeDigits = new int[37];

        private ParseOverflowDetection() {
        }

        static {
            java.math.BigInteger bigInteger = new java.math.BigInteger("10000000000000000", 16);
            for (int i = 2; i <= 36; i++) {
                long j = i;
                maxValueDivs[i] = com.google.common.primitives.UnsignedLongs.divide(-1L, j);
                maxValueMods[i] = (int) com.google.common.primitives.UnsignedLongs.remainder(-1L, j);
                maxSafeDigits[i] = bigInteger.toString(i).length() - 1;
            }
        }

        static boolean overflowInParse(long current, int digit, int radix) {
            if (current < 0) {
                return true;
            }
            long j = maxValueDivs[radix];
            if (current < j) {
                return false;
            }
            return current > j || digit > maxValueMods[radix];
        }
    }

    public static java.lang.String toString(long x) {
        return toString(x, 10);
    }

    public static java.lang.String toString(long x, int radix) {
        long jDivide;
        com.google.common.base.Preconditions.checkArgument(radix >= 2 && radix <= 36, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", radix);
        if (x == 0) {
            return "0";
        }
        if (x > 0) {
            return java.lang.Long.toString(x, radix);
        }
        int i = 64;
        char[] cArr = new char[64];
        int i2 = radix - 1;
        if ((radix & i2) == 0) {
            int iNumberOfTrailingZeros = java.lang.Integer.numberOfTrailingZeros(radix);
            do {
                i--;
                cArr[i] = java.lang.Character.forDigit(((int) x) & i2, radix);
                x >>>= iNumberOfTrailingZeros;
            } while (x != 0);
        } else {
            if ((radix & 1) == 0) {
                jDivide = (x >>> 1) / ((long) (radix >>> 1));
            } else {
                jDivide = divide(x, radix);
            }
            long j = radix;
            int i3 = 63;
            cArr[63] = java.lang.Character.forDigit((int) (x - (jDivide * j)), radix);
            while (jDivide > 0) {
                i3--;
                cArr[i3] = java.lang.Character.forDigit((int) (jDivide % j), radix);
                jDivide /= j;
            }
            i = i3;
        }
        return new java.lang.String(cArr, i, 64 - i);
    }
}
