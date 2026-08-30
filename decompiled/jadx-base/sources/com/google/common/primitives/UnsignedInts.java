package com.google.common.primitives;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.primitives.ElementTypesAreNonnullByDefault
public final class UnsignedInts {
    static final long INT_MASK = 4294967295L;

    static int flip(int value) {
        return value ^ Integer.MIN_VALUE;
    }

    public static int saturatedCast(long value) {
        if (value <= 0) {
            return 0;
        }
        if (value >= 4294967296L) {
            return -1;
        }
        return (int) value;
    }

    public static long toLong(int value) {
        return ((long) value) & 4294967295L;
    }

    private UnsignedInts() {
    }

    public static int compare(int a2, int b) {
        return com.google.common.primitives.Ints.compare(flip(a2), flip(b));
    }

    public static int checkedCast(long value) {
        com.google.common.base.Preconditions.checkArgument((value >> 32) == 0, "out of range: %s", value);
        return (int) value;
    }

    public static int min(int... array) {
        com.google.common.base.Preconditions.checkArgument(array.length > 0);
        int iFlip = flip(array[0]);
        for (int i = 1; i < array.length; i++) {
            int iFlip2 = flip(array[i]);
            if (iFlip2 < iFlip) {
                iFlip = iFlip2;
            }
        }
        return flip(iFlip);
    }

    public static int max(int... array) {
        com.google.common.base.Preconditions.checkArgument(array.length > 0);
        int iFlip = flip(array[0]);
        for (int i = 1; i < array.length; i++) {
            int iFlip2 = flip(array[i]);
            if (iFlip2 > iFlip) {
                iFlip = iFlip2;
            }
        }
        return flip(iFlip);
    }

    public static java.lang.String join(java.lang.String separator, int... array) {
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

    public static java.util.Comparator<int[]> lexicographicalComparator() {
        return com.google.common.primitives.UnsignedInts.LexicographicalComparator.INSTANCE;
    }

    enum LexicographicalComparator implements java.util.Comparator<int[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public java.lang.String toString() {
            return "UnsignedInts.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(int[] left, int[] right) {
            int iMin = java.lang.Math.min(left.length, right.length);
            for (int i = 0; i < iMin; i++) {
                int i2 = left[i];
                int i3 = right[i];
                if (i2 != i3) {
                    return com.google.common.primitives.UnsignedInts.compare(i2, i3);
                }
            }
            return left.length - right.length;
        }
    }

    public static void sort(int[] array) {
        com.google.common.base.Preconditions.checkNotNull(array);
        sort(array, 0, array.length);
    }

    public static void sort(int[] array, int fromIndex, int toIndex) {
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

    public static void sortDescending(int[] array) {
        com.google.common.base.Preconditions.checkNotNull(array);
        sortDescending(array, 0, array.length);
    }

    public static void sortDescending(int[] array, int fromIndex, int toIndex) {
        com.google.common.base.Preconditions.checkNotNull(array);
        com.google.common.base.Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        for (int i = fromIndex; i < toIndex; i++) {
            array[i] = Integer.MAX_VALUE ^ array[i];
        }
        java.util.Arrays.sort(array, fromIndex, toIndex);
        while (fromIndex < toIndex) {
            array[fromIndex] = array[fromIndex] ^ Integer.MAX_VALUE;
            fromIndex++;
        }
    }

    public static int divide(int dividend, int divisor) {
        return (int) (toLong(dividend) / toLong(divisor));
    }

    public static int remainder(int dividend, int divisor) {
        return (int) (toLong(dividend) % toLong(divisor));
    }

    public static int decode(java.lang.String stringValue) {
        com.google.common.primitives.ParseRequest parseRequestFromString = com.google.common.primitives.ParseRequest.fromString(stringValue);
        try {
            return parseUnsignedInt(parseRequestFromString.rawValue, parseRequestFromString.radix);
        } catch (java.lang.NumberFormatException e) {
            java.lang.NumberFormatException numberFormatException = new java.lang.NumberFormatException("Error parsing value: " + stringValue);
            numberFormatException.initCause(e);
            throw numberFormatException;
        }
    }

    public static int parseUnsignedInt(java.lang.String s) {
        return parseUnsignedInt(s, 10);
    }

    public static int parseUnsignedInt(java.lang.String string, int radix) {
        com.google.common.base.Preconditions.checkNotNull(string);
        long j = java.lang.Long.parseLong(string, radix);
        if ((4294967295L & j) == j) {
            return (int) j;
        }
        throw new java.lang.NumberFormatException("Input " + string + " in base " + radix + " is not in the range of an unsigned integer");
    }

    public static java.lang.String toString(int x) {
        return toString(x, 10);
    }

    public static java.lang.String toString(int x, int radix) {
        return java.lang.Long.toString(((long) x) & 4294967295L, radix);
    }
}
