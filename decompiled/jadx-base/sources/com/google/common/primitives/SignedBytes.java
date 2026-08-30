package com.google.common.primitives;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.primitives.ElementTypesAreNonnullByDefault
public final class SignedBytes {
    public static final byte MAX_POWER_OF_TWO = 64;

    public static int compare(byte a2, byte b) {
        return a2 - b;
    }

    public static byte saturatedCast(long value) {
        if (value > 127) {
            return (byte) 127;
        }
        if (value < -128) {
            return (byte) -128;
        }
        return (byte) value;
    }

    private SignedBytes() {
    }

    public static byte checkedCast(long value) {
        byte b = (byte) value;
        com.google.common.base.Preconditions.checkArgument(((long) b) == value, "Out of range: %s", value);
        return b;
    }

    public static byte min(byte... array) {
        com.google.common.base.Preconditions.checkArgument(array.length > 0);
        byte b = array[0];
        for (int i = 1; i < array.length; i++) {
            byte b2 = array[i];
            if (b2 < b) {
                b = b2;
            }
        }
        return b;
    }

    public static byte max(byte... array) {
        com.google.common.base.Preconditions.checkArgument(array.length > 0);
        byte b = array[0];
        for (int i = 1; i < array.length; i++) {
            byte b2 = array[i];
            if (b2 > b) {
                b = b2;
            }
        }
        return b;
    }

    public static java.lang.String join(java.lang.String separator, byte... array) {
        com.google.common.base.Preconditions.checkNotNull(separator);
        if (array.length == 0) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(array.length * 5);
        sb.append((int) array[0]);
        for (int i = 1; i < array.length; i++) {
            sb.append(separator).append((int) array[i]);
        }
        return sb.toString();
    }

    public static java.util.Comparator<byte[]> lexicographicalComparator() {
        return com.google.common.primitives.SignedBytes.LexicographicalComparator.INSTANCE;
    }

    private enum LexicographicalComparator implements java.util.Comparator<byte[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public java.lang.String toString() {
            return "SignedBytes.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(byte[] left, byte[] right) {
            int iMin = java.lang.Math.min(left.length, right.length);
            for (int i = 0; i < iMin; i++) {
                int iCompare = com.google.common.primitives.SignedBytes.compare(left[i], right[i]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return left.length - right.length;
        }
    }

    public static void sortDescending(byte[] array) {
        com.google.common.base.Preconditions.checkNotNull(array);
        sortDescending(array, 0, array.length);
    }

    public static void sortDescending(byte[] array, int fromIndex, int toIndex) {
        com.google.common.base.Preconditions.checkNotNull(array);
        com.google.common.base.Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        java.util.Arrays.sort(array, fromIndex, toIndex);
        com.google.common.primitives.Bytes.reverse(array, fromIndex, toIndex);
    }
}
