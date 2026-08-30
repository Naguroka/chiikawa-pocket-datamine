package com.google.common.primitives;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.primitives.ElementTypesAreNonnullByDefault
public final class Longs {
    public static final int BYTES = 8;
    public static final long MAX_POWER_OF_TWO = 4611686018427387904L;

    public static int compare(long a2, long b) {
        if (a2 < b) {
            return -1;
        }
        return a2 > b ? 1 : 0;
    }

    public static long fromBytes(byte b1, byte b2, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8) {
        return ((((long) b2) & 255) << 48) | ((((long) b1) & 255) << 56) | ((((long) b3) & 255) << 40) | ((((long) b4) & 255) << 32) | ((((long) b5) & 255) << 24) | ((((long) b6) & 255) << 16) | ((((long) b7) & 255) << 8) | (((long) b8) & 255);
    }

    public static int hashCode(long value) {
        return (int) (value ^ (value >>> 32));
    }

    private Longs() {
    }

    public static boolean contains(long[] array, long target) {
        for (long j : array) {
            if (j == target) {
                return true;
            }
        }
        return false;
    }

    public static int indexOf(long[] array, long target) {
        return indexOf(array, target, 0, array.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indexOf(long[] array, long target, int start, int end) {
        while (start < end) {
            if (array[start] == target) {
                return start;
            }
            start++;
        }
        return -1;
    }

    public static int indexOf(long[] array, long[] target) {
        com.google.common.base.Preconditions.checkNotNull(array, "array");
        com.google.common.base.Preconditions.checkNotNull(target, androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET);
        if (target.length == 0) {
            return 0;
        }
        for (int i = 0; i < (array.length - target.length) + 1; i++) {
            for (int i2 = 0; i2 < target.length; i2++) {
                if (array[i + i2] != target[i2]) {
                }
            }
            return i;
        }
        return -1;
    }

    public static int lastIndexOf(long[] array, long target) {
        return lastIndexOf(array, target, 0, array.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lastIndexOf(long[] array, long target, int start, int end) {
        for (int i = end - 1; i >= start; i--) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static long min(long... array) {
        com.google.common.base.Preconditions.checkArgument(array.length > 0);
        long j = array[0];
        for (int i = 1; i < array.length; i++) {
            long j2 = array[i];
            if (j2 < j) {
                j = j2;
            }
        }
        return j;
    }

    public static long max(long... array) {
        com.google.common.base.Preconditions.checkArgument(array.length > 0);
        long j = array[0];
        for (int i = 1; i < array.length; i++) {
            long j2 = array[i];
            if (j2 > j) {
                j = j2;
            }
        }
        return j;
    }

    public static long constrainToRange(long value, long min, long max) {
        com.google.common.base.Preconditions.checkArgument(min <= max, "min (%s) must be less than or equal to max (%s)", min, max);
        return java.lang.Math.min(java.lang.Math.max(value, min), max);
    }

    public static long[] concat(long[]... arrays) {
        long length = 0;
        for (long[] jArr : arrays) {
            length += (long) jArr.length;
        }
        long[] jArr2 = new long[checkNoOverflow(length)];
        int length2 = 0;
        for (long[] jArr3 : arrays) {
            java.lang.System.arraycopy(jArr3, 0, jArr2, length2, jArr3.length);
            length2 += jArr3.length;
        }
        return jArr2;
    }

    private static int checkNoOverflow(long result) {
        int i = (int) result;
        com.google.common.base.Preconditions.checkArgument(result == ((long) i), "the total number of elements (%s) in the arrays must fit in an int", result);
        return i;
    }

    public static byte[] toByteArray(long value) {
        byte[] bArr = new byte[8];
        for (int i = 7; i >= 0; i--) {
            bArr[i] = (byte) (255 & value);
            value >>= 8;
        }
        return bArr;
    }

    public static long fromByteArray(byte[] bytes) {
        com.google.common.base.Preconditions.checkArgument(bytes.length >= 8, "array too small: %s < %s", bytes.length, 8);
        return fromBytes(bytes[0], bytes[1], bytes[2], bytes[3], bytes[4], bytes[5], bytes[6], bytes[7]);
    }

    static final class AsciiDigits {
        private static final byte[] asciiDigits;

        private AsciiDigits() {
        }

        static {
            byte[] bArr = new byte[128];
            java.util.Arrays.fill(bArr, (byte) -1);
            for (int i = 0; i < 10; i++) {
                bArr[i + 48] = (byte) i;
            }
            for (int i2 = 0; i2 < 26; i2++) {
                byte b = (byte) (i2 + 10);
                bArr[i2 + 65] = b;
                bArr[i2 + 97] = b;
            }
            asciiDigits = bArr;
        }

        static int digit(char c) {
            if (c < 128) {
                return asciiDigits[c];
            }
            return -1;
        }
    }

    @javax.annotation.CheckForNull
    public static java.lang.Long tryParse(java.lang.String string) {
        return tryParse(string, 10);
    }

    @javax.annotation.CheckForNull
    public static java.lang.Long tryParse(java.lang.String string, int radix) {
        if (((java.lang.String) com.google.common.base.Preconditions.checkNotNull(string)).isEmpty()) {
            return null;
        }
        if (radix < 2 || radix > 36) {
            throw new java.lang.IllegalArgumentException("radix must be between MIN_RADIX and MAX_RADIX but was " + radix);
        }
        int i = string.charAt(0) == '-' ? 1 : 0;
        if (i == string.length()) {
            return null;
        }
        int i2 = i + 1;
        int iDigit = com.google.common.primitives.Longs.AsciiDigits.digit(string.charAt(i));
        if (iDigit < 0 || iDigit >= radix) {
            return null;
        }
        long j = -iDigit;
        long j2 = radix;
        long j3 = Long.MIN_VALUE / j2;
        while (i2 < string.length()) {
            int i3 = i2 + 1;
            int iDigit2 = com.google.common.primitives.Longs.AsciiDigits.digit(string.charAt(i2));
            if (iDigit2 < 0 || iDigit2 >= radix || j < j3) {
                return null;
            }
            long j4 = j * j2;
            long j5 = iDigit2;
            if (j4 < j5 - Long.MIN_VALUE) {
                return null;
            }
            j = j4 - j5;
            i2 = i3;
        }
        if (i != 0) {
            return java.lang.Long.valueOf(j);
        }
        if (j == Long.MIN_VALUE) {
            return null;
        }
        return java.lang.Long.valueOf(-j);
    }

    private static final class LongConverter extends com.google.common.base.Converter<java.lang.String, java.lang.Long> implements java.io.Serializable {
        static final com.google.common.base.Converter<java.lang.String, java.lang.Long> INSTANCE = new com.google.common.primitives.Longs.LongConverter();
        private static final long serialVersionUID = 1;

        public java.lang.String toString() {
            return "Longs.stringConverter()";
        }

        private LongConverter() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        public java.lang.Long doForward(java.lang.String value) {
            return java.lang.Long.decode(value);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        public java.lang.String doBackward(java.lang.Long value) {
            return value.toString();
        }

        private java.lang.Object readResolve() {
            return INSTANCE;
        }
    }

    public static com.google.common.base.Converter<java.lang.String, java.lang.Long> stringConverter() {
        return com.google.common.primitives.Longs.LongConverter.INSTANCE;
    }

    public static long[] ensureCapacity(long[] array, int minLength, int padding) {
        com.google.common.base.Preconditions.checkArgument(minLength >= 0, "Invalid minLength: %s", minLength);
        com.google.common.base.Preconditions.checkArgument(padding >= 0, "Invalid padding: %s", padding);
        return array.length < minLength ? java.util.Arrays.copyOf(array, minLength + padding) : array;
    }

    public static java.lang.String join(java.lang.String separator, long... array) {
        com.google.common.base.Preconditions.checkNotNull(separator);
        if (array.length == 0) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(array.length * 10);
        sb.append(array[0]);
        for (int i = 1; i < array.length; i++) {
            sb.append(separator).append(array[i]);
        }
        return sb.toString();
    }

    public static java.util.Comparator<long[]> lexicographicalComparator() {
        return com.google.common.primitives.Longs.LexicographicalComparator.INSTANCE;
    }

    private enum LexicographicalComparator implements java.util.Comparator<long[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public java.lang.String toString() {
            return "Longs.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(long[] left, long[] right) {
            int iMin = java.lang.Math.min(left.length, right.length);
            for (int i = 0; i < iMin; i++) {
                int iCompare = com.google.common.primitives.Longs.compare(left[i], right[i]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return left.length - right.length;
        }
    }

    public static void sortDescending(long[] array) {
        com.google.common.base.Preconditions.checkNotNull(array);
        sortDescending(array, 0, array.length);
    }

    public static void sortDescending(long[] array, int fromIndex, int toIndex) {
        com.google.common.base.Preconditions.checkNotNull(array);
        com.google.common.base.Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        java.util.Arrays.sort(array, fromIndex, toIndex);
        reverse(array, fromIndex, toIndex);
    }

    public static void reverse(long[] array) {
        com.google.common.base.Preconditions.checkNotNull(array);
        reverse(array, 0, array.length);
    }

    public static void reverse(long[] array, int fromIndex, int toIndex) {
        com.google.common.base.Preconditions.checkNotNull(array);
        com.google.common.base.Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        for (int i = toIndex - 1; fromIndex < i; i--) {
            long j = array[fromIndex];
            array[fromIndex] = array[i];
            array[i] = j;
            fromIndex++;
        }
    }

    public static void rotate(long[] array, int distance) {
        rotate(array, distance, 0, array.length);
    }

    public static void rotate(long[] array, int distance, int fromIndex, int toIndex) {
        com.google.common.base.Preconditions.checkNotNull(array);
        com.google.common.base.Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        if (array.length <= 1) {
            return;
        }
        int i = toIndex - fromIndex;
        int i2 = (-distance) % i;
        if (i2 < 0) {
            i2 += i;
        }
        int i3 = i2 + fromIndex;
        if (i3 == fromIndex) {
            return;
        }
        reverse(array, fromIndex, i3);
        reverse(array, i3, toIndex);
        reverse(array, fromIndex, toIndex);
    }

    public static long[] toArray(java.util.Collection<? extends java.lang.Number> collection) {
        if (collection instanceof com.google.common.primitives.Longs.LongArrayAsList) {
            return ((com.google.common.primitives.Longs.LongArrayAsList) collection).toLongArray();
        }
        java.lang.Object[] array = collection.toArray();
        int length = array.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = ((java.lang.Number) com.google.common.base.Preconditions.checkNotNull(array[i])).longValue();
        }
        return jArr;
    }

    public static java.util.List<java.lang.Long> asList(long... backingArray) {
        if (backingArray.length == 0) {
            return java.util.Collections.emptyList();
        }
        return new com.google.common.primitives.Longs.LongArrayAsList(backingArray);
    }

    private static class LongArrayAsList extends java.util.AbstractList<java.lang.Long> implements java.util.RandomAccess, java.io.Serializable {
        private static final long serialVersionUID = 0;
        final long[] array;
        final int end;
        final int start;

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        LongArrayAsList(long[] array) {
            this(array, 0, array.length);
        }

        LongArrayAsList(long[] array, int start, int end) {
            this.array = array;
            this.start = start;
            this.end = end;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public java.lang.Long get(int index) {
            com.google.common.base.Preconditions.checkElementIndex(index, size());
            return java.lang.Long.valueOf(this.array[this.start + index]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object target) {
            return (target instanceof java.lang.Long) && com.google.common.primitives.Longs.indexOf(this.array, ((java.lang.Long) target).longValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@javax.annotation.CheckForNull java.lang.Object target) {
            int iIndexOf;
            if (!(target instanceof java.lang.Long) || (iIndexOf = com.google.common.primitives.Longs.indexOf(this.array, ((java.lang.Long) target).longValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iIndexOf - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@javax.annotation.CheckForNull java.lang.Object target) {
            int iLastIndexOf;
            if (!(target instanceof java.lang.Long) || (iLastIndexOf = com.google.common.primitives.Longs.lastIndexOf(this.array, ((java.lang.Long) target).longValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iLastIndexOf - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public java.lang.Long set(int index, java.lang.Long element) {
            com.google.common.base.Preconditions.checkElementIndex(index, size());
            long[] jArr = this.array;
            int i = this.start;
            long j = jArr[i + index];
            jArr[i + index] = ((java.lang.Long) com.google.common.base.Preconditions.checkNotNull(element)).longValue();
            return java.lang.Long.valueOf(j);
        }

        @Override // java.util.AbstractList, java.util.List
        public java.util.List<java.lang.Long> subList(int fromIndex, int toIndex) {
            com.google.common.base.Preconditions.checkPositionIndexes(fromIndex, toIndex, size());
            if (fromIndex == toIndex) {
                return java.util.Collections.emptyList();
            }
            long[] jArr = this.array;
            int i = this.start;
            return new com.google.common.primitives.Longs.LongArrayAsList(jArr, fromIndex + i, i + toIndex);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
            if (object == this) {
                return true;
            }
            if (object instanceof com.google.common.primitives.Longs.LongArrayAsList) {
                com.google.common.primitives.Longs.LongArrayAsList longArrayAsList = (com.google.common.primitives.Longs.LongArrayAsList) object;
                int size = size();
                if (longArrayAsList.size() != size) {
                    return false;
                }
                for (int i = 0; i < size; i++) {
                    if (this.array[this.start + i] != longArrayAsList.array[longArrayAsList.start + i]) {
                        return false;
                    }
                }
                return true;
            }
            return super.equals(object);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode = 1;
            for (int i = this.start; i < this.end; i++) {
                iHashCode = (iHashCode * 31) + com.google.common.primitives.Longs.hashCode(this.array[i]);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractCollection
        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(size() * 10);
            sb.append('[').append(this.array[this.start]);
            int i = this.start;
            while (true) {
                i++;
                if (i < this.end) {
                    sb.append(", ").append(this.array[i]);
                } else {
                    return sb.append(']').toString();
                }
            }
        }

        long[] toLongArray() {
            return java.util.Arrays.copyOfRange(this.array, this.start, this.end);
        }
    }
}
