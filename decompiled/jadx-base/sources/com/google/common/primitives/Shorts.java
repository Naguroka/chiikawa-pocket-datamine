package com.google.common.primitives;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.primitives.ElementTypesAreNonnullByDefault
public final class Shorts extends com.google.common.primitives.ShortsMethodsForWeb {
    public static final int BYTES = 2;
    public static final short MAX_POWER_OF_TWO = 16384;

    public static int compare(short a2, short b) {
        return a2 - b;
    }

    public static short fromBytes(byte b1, byte b2) {
        return (short) ((b1 << 8) | (b2 & 255));
    }

    public static int hashCode(short value) {
        return value;
    }

    public static short saturatedCast(long value) {
        if (value > 32767) {
            return kotlin.jvm.internal.ShortCompanionObject.MAX_VALUE;
        }
        return value < -32768 ? kotlin.jvm.internal.ShortCompanionObject.MIN_VALUE : (short) value;
    }

    public static byte[] toByteArray(short value) {
        return new byte[]{(byte) (value >> 8), (byte) value};
    }

    private Shorts() {
    }

    public static short checkedCast(long value) {
        short s = (short) value;
        com.google.common.base.Preconditions.checkArgument(((long) s) == value, "Out of range: %s", value);
        return s;
    }

    public static boolean contains(short[] array, short target) {
        for (short s : array) {
            if (s == target) {
                return true;
            }
        }
        return false;
    }

    public static int indexOf(short[] array, short target) {
        return indexOf(array, target, 0, array.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indexOf(short[] array, short target, int start, int end) {
        while (start < end) {
            if (array[start] == target) {
                return start;
            }
            start++;
        }
        return -1;
    }

    public static int indexOf(short[] array, short[] target) {
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

    public static int lastIndexOf(short[] array, short target) {
        return lastIndexOf(array, target, 0, array.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lastIndexOf(short[] array, short target, int start, int end) {
        for (int i = end - 1; i >= start; i--) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static short min(short... array) {
        com.google.common.base.Preconditions.checkArgument(array.length > 0);
        short s = array[0];
        for (int i = 1; i < array.length; i++) {
            short s2 = array[i];
            if (s2 < s) {
                s = s2;
            }
        }
        return s;
    }

    public static short max(short... array) {
        com.google.common.base.Preconditions.checkArgument(array.length > 0);
        short s = array[0];
        for (int i = 1; i < array.length; i++) {
            short s2 = array[i];
            if (s2 > s) {
                s = s2;
            }
        }
        return s;
    }

    public static short constrainToRange(short value, short min, short max) {
        com.google.common.base.Preconditions.checkArgument(min <= max, "min (%s) must be less than or equal to max (%s)", (int) min, (int) max);
        if (value < min) {
            return min;
        }
        return value < max ? value : max;
    }

    public static short[] concat(short[]... arrays) {
        int length = 0;
        for (short[] sArr : arrays) {
            length += sArr.length;
        }
        short[] sArr2 = new short[length];
        int length2 = 0;
        for (short[] sArr3 : arrays) {
            java.lang.System.arraycopy(sArr3, 0, sArr2, length2, sArr3.length);
            length2 += sArr3.length;
        }
        return sArr2;
    }

    public static short fromByteArray(byte[] bytes) {
        com.google.common.base.Preconditions.checkArgument(bytes.length >= 2, "array too small: %s < %s", bytes.length, 2);
        return fromBytes(bytes[0], bytes[1]);
    }

    private static final class ShortConverter extends com.google.common.base.Converter<java.lang.String, java.lang.Short> implements java.io.Serializable {
        static final com.google.common.base.Converter<java.lang.String, java.lang.Short> INSTANCE = new com.google.common.primitives.Shorts.ShortConverter();
        private static final long serialVersionUID = 1;

        public java.lang.String toString() {
            return "Shorts.stringConverter()";
        }

        private ShortConverter() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        public java.lang.Short doForward(java.lang.String value) {
            return java.lang.Short.decode(value);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        public java.lang.String doBackward(java.lang.Short value) {
            return value.toString();
        }

        private java.lang.Object readResolve() {
            return INSTANCE;
        }
    }

    public static com.google.common.base.Converter<java.lang.String, java.lang.Short> stringConverter() {
        return com.google.common.primitives.Shorts.ShortConverter.INSTANCE;
    }

    public static short[] ensureCapacity(short[] array, int minLength, int padding) {
        com.google.common.base.Preconditions.checkArgument(minLength >= 0, "Invalid minLength: %s", minLength);
        com.google.common.base.Preconditions.checkArgument(padding >= 0, "Invalid padding: %s", padding);
        return array.length < minLength ? java.util.Arrays.copyOf(array, minLength + padding) : array;
    }

    public static java.lang.String join(java.lang.String separator, short... array) {
        com.google.common.base.Preconditions.checkNotNull(separator);
        if (array.length == 0) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(array.length * 6);
        sb.append((int) array[0]);
        for (int i = 1; i < array.length; i++) {
            sb.append(separator).append((int) array[i]);
        }
        return sb.toString();
    }

    public static java.util.Comparator<short[]> lexicographicalComparator() {
        return com.google.common.primitives.Shorts.LexicographicalComparator.INSTANCE;
    }

    private enum LexicographicalComparator implements java.util.Comparator<short[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public java.lang.String toString() {
            return "Shorts.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(short[] left, short[] right) {
            int iMin = java.lang.Math.min(left.length, right.length);
            for (int i = 0; i < iMin; i++) {
                int iCompare = com.google.common.primitives.Shorts.compare(left[i], right[i]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return left.length - right.length;
        }
    }

    public static void sortDescending(short[] array) {
        com.google.common.base.Preconditions.checkNotNull(array);
        sortDescending(array, 0, array.length);
    }

    public static void sortDescending(short[] array, int fromIndex, int toIndex) {
        com.google.common.base.Preconditions.checkNotNull(array);
        com.google.common.base.Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        java.util.Arrays.sort(array, fromIndex, toIndex);
        reverse(array, fromIndex, toIndex);
    }

    public static void reverse(short[] array) {
        com.google.common.base.Preconditions.checkNotNull(array);
        reverse(array, 0, array.length);
    }

    public static void reverse(short[] array, int fromIndex, int toIndex) {
        com.google.common.base.Preconditions.checkNotNull(array);
        com.google.common.base.Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        for (int i = toIndex - 1; fromIndex < i; i--) {
            short s = array[fromIndex];
            array[fromIndex] = array[i];
            array[i] = s;
            fromIndex++;
        }
    }

    public static void rotate(short[] array, int distance) {
        rotate(array, distance, 0, array.length);
    }

    public static void rotate(short[] array, int distance, int fromIndex, int toIndex) {
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

    public static short[] toArray(java.util.Collection<? extends java.lang.Number> collection) {
        if (collection instanceof com.google.common.primitives.Shorts.ShortArrayAsList) {
            return ((com.google.common.primitives.Shorts.ShortArrayAsList) collection).toShortArray();
        }
        java.lang.Object[] array = collection.toArray();
        int length = array.length;
        short[] sArr = new short[length];
        for (int i = 0; i < length; i++) {
            sArr[i] = ((java.lang.Number) com.google.common.base.Preconditions.checkNotNull(array[i])).shortValue();
        }
        return sArr;
    }

    public static java.util.List<java.lang.Short> asList(short... backingArray) {
        if (backingArray.length == 0) {
            return java.util.Collections.emptyList();
        }
        return new com.google.common.primitives.Shorts.ShortArrayAsList(backingArray);
    }

    private static class ShortArrayAsList extends java.util.AbstractList<java.lang.Short> implements java.util.RandomAccess, java.io.Serializable {
        private static final long serialVersionUID = 0;
        final short[] array;
        final int end;
        final int start;

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        ShortArrayAsList(short[] array) {
            this(array, 0, array.length);
        }

        ShortArrayAsList(short[] array, int start, int end) {
            this.array = array;
            this.start = start;
            this.end = end;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public java.lang.Short get(int index) {
            com.google.common.base.Preconditions.checkElementIndex(index, size());
            return java.lang.Short.valueOf(this.array[this.start + index]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object target) {
            return (target instanceof java.lang.Short) && com.google.common.primitives.Shorts.indexOf(this.array, ((java.lang.Short) target).shortValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@javax.annotation.CheckForNull java.lang.Object target) {
            int iIndexOf;
            if (!(target instanceof java.lang.Short) || (iIndexOf = com.google.common.primitives.Shorts.indexOf(this.array, ((java.lang.Short) target).shortValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iIndexOf - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@javax.annotation.CheckForNull java.lang.Object target) {
            int iLastIndexOf;
            if (!(target instanceof java.lang.Short) || (iLastIndexOf = com.google.common.primitives.Shorts.lastIndexOf(this.array, ((java.lang.Short) target).shortValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iLastIndexOf - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public java.lang.Short set(int index, java.lang.Short element) {
            com.google.common.base.Preconditions.checkElementIndex(index, size());
            short[] sArr = this.array;
            int i = this.start;
            short s = sArr[i + index];
            sArr[i + index] = ((java.lang.Short) com.google.common.base.Preconditions.checkNotNull(element)).shortValue();
            return java.lang.Short.valueOf(s);
        }

        @Override // java.util.AbstractList, java.util.List
        public java.util.List<java.lang.Short> subList(int fromIndex, int toIndex) {
            com.google.common.base.Preconditions.checkPositionIndexes(fromIndex, toIndex, size());
            if (fromIndex == toIndex) {
                return java.util.Collections.emptyList();
            }
            short[] sArr = this.array;
            int i = this.start;
            return new com.google.common.primitives.Shorts.ShortArrayAsList(sArr, fromIndex + i, i + toIndex);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
            if (object == this) {
                return true;
            }
            if (object instanceof com.google.common.primitives.Shorts.ShortArrayAsList) {
                com.google.common.primitives.Shorts.ShortArrayAsList shortArrayAsList = (com.google.common.primitives.Shorts.ShortArrayAsList) object;
                int size = size();
                if (shortArrayAsList.size() != size) {
                    return false;
                }
                for (int i = 0; i < size; i++) {
                    if (this.array[this.start + i] != shortArrayAsList.array[shortArrayAsList.start + i]) {
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
                iHashCode = (iHashCode * 31) + com.google.common.primitives.Shorts.hashCode(this.array[i]);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractCollection
        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(size() * 6);
            sb.append('[').append((int) this.array[this.start]);
            int i = this.start;
            while (true) {
                i++;
                if (i < this.end) {
                    sb.append(", ").append((int) this.array[i]);
                } else {
                    return sb.append(']').toString();
                }
            }
        }

        short[] toShortArray() {
            return java.util.Arrays.copyOfRange(this.array, this.start, this.end);
        }
    }
}
