package com.google.common.primitives;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.primitives.ElementTypesAreNonnullByDefault
public final class UnsignedBytes {
    public static final byte MAX_POWER_OF_TWO = -128;
    public static final byte MAX_VALUE = -1;
    private static final int UNSIGNED_MASK = 255;

    private static byte flip(byte b) {
        return (byte) (b ^ 128);
    }

    public static int toInt(byte value) {
        return value & 255;
    }

    private UnsignedBytes() {
    }

    public static byte checkedCast(long value) {
        com.google.common.base.Preconditions.checkArgument((value >> 8) == 0, "out of range: %s", value);
        return (byte) value;
    }

    public static byte saturatedCast(long value) {
        if (value > toInt((byte) -1)) {
            return (byte) -1;
        }
        if (value < 0) {
            return (byte) 0;
        }
        return (byte) value;
    }

    public static int compare(byte a2, byte b) {
        return toInt(a2) - toInt(b);
    }

    public static byte min(byte... array) {
        com.google.common.base.Preconditions.checkArgument(array.length > 0);
        int i = toInt(array[0]);
        for (int i2 = 1; i2 < array.length; i2++) {
            int i3 = toInt(array[i2]);
            if (i3 < i) {
                i = i3;
            }
        }
        return (byte) i;
    }

    public static byte max(byte... array) {
        com.google.common.base.Preconditions.checkArgument(array.length > 0);
        int i = toInt(array[0]);
        for (int i2 = 1; i2 < array.length; i2++) {
            int i3 = toInt(array[i2]);
            if (i3 > i) {
                i = i3;
            }
        }
        return (byte) i;
    }

    public static java.lang.String toString(byte x) {
        return toString(x, 10);
    }

    public static java.lang.String toString(byte x, int radix) {
        com.google.common.base.Preconditions.checkArgument(radix >= 2 && radix <= 36, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", radix);
        return java.lang.Integer.toString(toInt(x), radix);
    }

    public static byte parseUnsignedByte(java.lang.String string) {
        return parseUnsignedByte(string, 10);
    }

    public static byte parseUnsignedByte(java.lang.String string, int radix) {
        int i = java.lang.Integer.parseInt((java.lang.String) com.google.common.base.Preconditions.checkNotNull(string), radix);
        if ((i >> 8) == 0) {
            return (byte) i;
        }
        throw new java.lang.NumberFormatException("out of range: " + i);
    }

    public static java.lang.String join(java.lang.String separator, byte... array) {
        com.google.common.base.Preconditions.checkNotNull(separator);
        if (array.length == 0) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(array.length * (separator.length() + 3));
        sb.append(toInt(array[0]));
        for (int i = 1; i < array.length; i++) {
            sb.append(separator).append(toString(array[i]));
        }
        return sb.toString();
    }

    public static java.util.Comparator<byte[]> lexicographicalComparator() {
        return com.google.common.primitives.UnsignedBytes.LexicographicalComparatorHolder.BEST_COMPARATOR;
    }

    static java.util.Comparator<byte[]> lexicographicalComparatorJavaImpl() {
        return com.google.common.primitives.UnsignedBytes.LexicographicalComparatorHolder.PureJavaComparator.INSTANCE;
    }

    static class LexicographicalComparatorHolder {
        static final java.lang.String UNSAFE_COMPARATOR_NAME = com.google.common.primitives.UnsignedBytes.LexicographicalComparatorHolder.class.getName() + "$UnsafeComparator";
        static final java.util.Comparator<byte[]> BEST_COMPARATOR = getBestComparator();

        LexicographicalComparatorHolder() {
        }

        enum UnsafeComparator implements java.util.Comparator<byte[]> {
            INSTANCE;

            static final boolean BIG_ENDIAN = java.nio.ByteOrder.nativeOrder().equals(java.nio.ByteOrder.BIG_ENDIAN);
            static final int BYTE_ARRAY_BASE_OFFSET;
            static final sun.misc.Unsafe theUnsafe;

            @Override // java.lang.Enum
            public java.lang.String toString() {
                return "UnsignedBytes.lexicographicalComparator() (sun.misc.Unsafe version)";
            }

            static {
                sun.misc.Unsafe unsafe = getUnsafe();
                theUnsafe = unsafe;
                int iArrayBaseOffset = unsafe.arrayBaseOffset(byte[].class);
                BYTE_ARRAY_BASE_OFFSET = iArrayBaseOffset;
                if (!"64".equals(java.lang.System.getProperty("sun.arch.data.model")) || iArrayBaseOffset % 8 != 0 || unsafe.arrayIndexScale(byte[].class) != 1) {
                    throw new java.lang.Error();
                }
            }

            private static sun.misc.Unsafe getUnsafe() {
                try {
                    try {
                        return sun.misc.Unsafe.getUnsafe();
                    } catch (java.security.PrivilegedActionException e) {
                        throw new java.lang.RuntimeException("Could not initialize intrinsics", e.getCause());
                    }
                } catch (java.lang.SecurityException unused) {
                    return (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new java.security.PrivilegedExceptionAction<sun.misc.Unsafe>() { // from class: com.google.common.primitives.UnsignedBytes.LexicographicalComparatorHolder.UnsafeComparator.1
                        @Override // java.security.PrivilegedExceptionAction
                        public sun.misc.Unsafe run() throws java.lang.Exception {
                            for (java.lang.reflect.Field field : sun.misc.Unsafe.class.getDeclaredFields()) {
                                field.setAccessible(true);
                                java.lang.Object obj = field.get(null);
                                if (sun.misc.Unsafe.class.isInstance(obj)) {
                                    return (sun.misc.Unsafe) sun.misc.Unsafe.class.cast(obj);
                                }
                            }
                            throw new java.lang.NoSuchFieldError("the Unsafe");
                        }
                    });
                }
            }

            @Override // java.util.Comparator
            public int compare(byte[] left, byte[] right) {
                int iMin = java.lang.Math.min(left.length, right.length);
                int i = iMin & (-8);
                int i2 = 0;
                while (i2 < i) {
                    sun.misc.Unsafe unsafe = theUnsafe;
                    int i3 = BYTE_ARRAY_BASE_OFFSET;
                    long j = i2;
                    long j2 = unsafe.getLong(left, ((long) i3) + j);
                    long j3 = unsafe.getLong(right, ((long) i3) + j);
                    if (j2 != j3) {
                        if (BIG_ENDIAN) {
                            return com.google.common.primitives.UnsignedLongs.compare(j2, j3);
                        }
                        int iNumberOfTrailingZeros = java.lang.Long.numberOfTrailingZeros(j2 ^ j3) & (-8);
                        return ((int) ((j2 >>> iNumberOfTrailingZeros) & 255)) - ((int) ((j3 >>> iNumberOfTrailingZeros) & 255));
                    }
                    i2 += 8;
                }
                while (i2 < iMin) {
                    int iCompare = com.google.common.primitives.UnsignedBytes.compare(left[i2], right[i2]);
                    if (iCompare != 0) {
                        return iCompare;
                    }
                    i2++;
                }
                return left.length - right.length;
            }
        }

        enum PureJavaComparator implements java.util.Comparator<byte[]> {
            INSTANCE;

            @Override // java.lang.Enum
            public java.lang.String toString() {
                return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
            }

            @Override // java.util.Comparator
            public int compare(byte[] left, byte[] right) {
                int iMin = java.lang.Math.min(left.length, right.length);
                for (int i = 0; i < iMin; i++) {
                    int iCompare = com.google.common.primitives.UnsignedBytes.compare(left[i], right[i]);
                    if (iCompare != 0) {
                        return iCompare;
                    }
                }
                return left.length - right.length;
            }
        }

        static java.util.Comparator<byte[]> getBestComparator() {
            try {
                return (java.util.Comparator) ((java.lang.Object[]) java.util.Objects.requireNonNull(java.lang.Class.forName(UNSAFE_COMPARATOR_NAME).getEnumConstants()))[0];
            } catch (java.lang.Throwable unused) {
                return com.google.common.primitives.UnsignedBytes.lexicographicalComparatorJavaImpl();
            }
        }
    }

    public static void sort(byte[] array) {
        com.google.common.base.Preconditions.checkNotNull(array);
        sort(array, 0, array.length);
    }

    public static void sort(byte[] array, int fromIndex, int toIndex) {
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

    public static void sortDescending(byte[] array) {
        com.google.common.base.Preconditions.checkNotNull(array);
        sortDescending(array, 0, array.length);
    }

    public static void sortDescending(byte[] array, int fromIndex, int toIndex) {
        com.google.common.base.Preconditions.checkNotNull(array);
        com.google.common.base.Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        for (int i = fromIndex; i < toIndex; i++) {
            array[i] = (byte) (array[i] ^ 127);
        }
        java.util.Arrays.sort(array, fromIndex, toIndex);
        while (fromIndex < toIndex) {
            array[fromIndex] = (byte) (array[fromIndex] ^ 127);
            fromIndex++;
        }
    }
}
