package com.google.common.primitives;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.primitives.ElementTypesAreNonnullByDefault
public final class Ints extends com.google.common.primitives.IntsMethodsForWeb {
    public static final int BYTES = 4;
    public static final int MAX_POWER_OF_TWO = 1073741824;

    public static int compare(int a2, int b) {
        if (a2 < b) {
            return -1;
        }
        return a2 > b ? 1 : 0;
    }

    public static int fromBytes(byte b1, byte b2, byte b3, byte b4) {
        return (b1 << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    public static int hashCode(int value) {
        return value;
    }

    public static int saturatedCast(long value) {
        if (value > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (value < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) value;
    }

    public static byte[] toByteArray(int value) {
        return new byte[]{(byte) (value >> 24), (byte) (value >> 16), (byte) (value >> 8), (byte) value};
    }

    private Ints() {
    }

    public static int checkedCast(long value) {
        int i = (int) value;
        com.google.common.base.Preconditions.checkArgument(((long) i) == value, "Out of range: %s", value);
        return i;
    }

    public static boolean contains(int[] array, int target) {
        for (int i : array) {
            if (i == target) {
                return true;
            }
        }
        return false;
    }

    public static int indexOf(int[] array, int target) {
        return indexOf(array, target, 0, array.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indexOf(int[] array, int target, int start, int end) {
        while (start < end) {
            if (array[start] == target) {
                return start;
            }
            start++;
        }
        return -1;
    }

    public static int indexOf(int[] array, int[] target) {
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

    public static int lastIndexOf(int[] array, int target) {
        return lastIndexOf(array, target, 0, array.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lastIndexOf(int[] array, int target, int start, int end) {
        for (int i = end - 1; i >= start; i--) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int min(int... array) {
        com.google.common.base.Preconditions.checkArgument(array.length > 0);
        int i = array[0];
        for (int i2 = 1; i2 < array.length; i2++) {
            int i3 = array[i2];
            if (i3 < i) {
                i = i3;
            }
        }
        return i;
    }

    public static int max(int... array) {
        com.google.common.base.Preconditions.checkArgument(array.length > 0);
        int i = array[0];
        for (int i2 = 1; i2 < array.length; i2++) {
            int i3 = array[i2];
            if (i3 > i) {
                i = i3;
            }
        }
        return i;
    }

    public static int constrainToRange(int value, int min, int max) {
        com.google.common.base.Preconditions.checkArgument(min <= max, "min (%s) must be less than or equal to max (%s)", min, max);
        return java.lang.Math.min(java.lang.Math.max(value, min), max);
    }

    public static int[] concat(int[]... arrays) {
        int length = 0;
        for (int[] iArr : arrays) {
            length += iArr.length;
        }
        int[] iArr2 = new int[length];
        int length2 = 0;
        for (int[] iArr3 : arrays) {
            java.lang.System.arraycopy(iArr3, 0, iArr2, length2, iArr3.length);
            length2 += iArr3.length;
        }
        return iArr2;
    }

    public static int fromByteArray(byte[] bytes) {
        com.google.common.base.Preconditions.checkArgument(bytes.length >= 4, "array too small: %s < %s", bytes.length, 4);
        return fromBytes(bytes[0], bytes[1], bytes[2], bytes[3]);
    }

    private static final class IntConverter extends com.google.common.base.Converter<java.lang.String, java.lang.Integer> implements java.io.Serializable {
        static final com.google.common.base.Converter<java.lang.String, java.lang.Integer> INSTANCE = new com.google.common.primitives.Ints.IntConverter();
        private static final long serialVersionUID = 1;

        public java.lang.String toString() {
            return "Ints.stringConverter()";
        }

        private IntConverter() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        public java.lang.Integer doForward(java.lang.String value) {
            return java.lang.Integer.decode(value);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        public java.lang.String doBackward(java.lang.Integer value) {
            return value.toString();
        }

        private java.lang.Object readResolve() {
            return INSTANCE;
        }
    }

    public static com.google.common.base.Converter<java.lang.String, java.lang.Integer> stringConverter() {
        return com.google.common.primitives.Ints.IntConverter.INSTANCE;
    }

    public static int[] ensureCapacity(int[] array, int minLength, int padding) {
        com.google.common.base.Preconditions.checkArgument(minLength >= 0, "Invalid minLength: %s", minLength);
        com.google.common.base.Preconditions.checkArgument(padding >= 0, "Invalid padding: %s", padding);
        return array.length < minLength ? java.util.Arrays.copyOf(array, minLength + padding) : array;
    }

    public static java.lang.String join(java.lang.String separator, int... array) {
        com.google.common.base.Preconditions.checkNotNull(separator);
        if (array.length == 0) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(array.length * 5);
        sb.append(array[0]);
        for (int i = 1; i < array.length; i++) {
            sb.append(separator).append(array[i]);
        }
        return sb.toString();
    }

    public static java.util.Comparator<int[]> lexicographicalComparator() {
        return com.google.common.primitives.Ints.LexicographicalComparator.INSTANCE;
    }

    private enum LexicographicalComparator implements java.util.Comparator<int[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public java.lang.String toString() {
            return "Ints.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(int[] left, int[] right) {
            int iMin = java.lang.Math.min(left.length, right.length);
            for (int i = 0; i < iMin; i++) {
                int iCompare = com.google.common.primitives.Ints.compare(left[i], right[i]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return left.length - right.length;
        }
    }

    public static void sortDescending(int[] array) {
        com.google.common.base.Preconditions.checkNotNull(array);
        sortDescending(array, 0, array.length);
    }

    public static void sortDescending(int[] array, int fromIndex, int toIndex) {
        com.google.common.base.Preconditions.checkNotNull(array);
        com.google.common.base.Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        java.util.Arrays.sort(array, fromIndex, toIndex);
        reverse(array, fromIndex, toIndex);
    }

    public static void reverse(int[] array) {
        com.google.common.base.Preconditions.checkNotNull(array);
        reverse(array, 0, array.length);
    }

    public static void reverse(int[] array, int fromIndex, int toIndex) {
        com.google.common.base.Preconditions.checkNotNull(array);
        com.google.common.base.Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        for (int i = toIndex - 1; fromIndex < i; i--) {
            int i2 = array[fromIndex];
            array[fromIndex] = array[i];
            array[i] = i2;
            fromIndex++;
        }
    }

    public static void rotate(int[] array, int distance) {
        rotate(array, distance, 0, array.length);
    }

    public static void rotate(int[] array, int distance, int fromIndex, int toIndex) {
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

    public static int[] toArray(java.util.Collection<? extends java.lang.Number> collection) {
        if (collection instanceof com.google.common.primitives.Ints.IntArrayAsList) {
            return ((com.google.common.primitives.Ints.IntArrayAsList) collection).toIntArray();
        }
        java.lang.Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = ((java.lang.Number) com.google.common.base.Preconditions.checkNotNull(array[i])).intValue();
        }
        return iArr;
    }

    public static java.util.List<java.lang.Integer> asList(int... backingArray) {
        if (backingArray.length == 0) {
            return java.util.Collections.emptyList();
        }
        return new com.google.common.primitives.Ints.IntArrayAsList(backingArray);
    }

    private static class IntArrayAsList extends java.util.AbstractList<java.lang.Integer> implements java.util.RandomAccess, java.io.Serializable {
        private static final long serialVersionUID = 0;
        final int[] array;
        final int end;
        final int start;

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        IntArrayAsList(int[] array) {
            this(array, 0, array.length);
        }

        IntArrayAsList(int[] array, int start, int end) {
            this.array = array;
            this.start = start;
            this.end = end;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public java.lang.Integer get(int index) {
            com.google.common.base.Preconditions.checkElementIndex(index, size());
            return java.lang.Integer.valueOf(this.array[this.start + index]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object target) {
            return (target instanceof java.lang.Integer) && com.google.common.primitives.Ints.indexOf(this.array, ((java.lang.Integer) target).intValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@javax.annotation.CheckForNull java.lang.Object target) {
            int iIndexOf;
            if (!(target instanceof java.lang.Integer) || (iIndexOf = com.google.common.primitives.Ints.indexOf(this.array, ((java.lang.Integer) target).intValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iIndexOf - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@javax.annotation.CheckForNull java.lang.Object target) {
            int iLastIndexOf;
            if (!(target instanceof java.lang.Integer) || (iLastIndexOf = com.google.common.primitives.Ints.lastIndexOf(this.array, ((java.lang.Integer) target).intValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iLastIndexOf - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public java.lang.Integer set(int index, java.lang.Integer element) {
            com.google.common.base.Preconditions.checkElementIndex(index, size());
            int[] iArr = this.array;
            int i = this.start;
            int i2 = iArr[i + index];
            iArr[i + index] = ((java.lang.Integer) com.google.common.base.Preconditions.checkNotNull(element)).intValue();
            return java.lang.Integer.valueOf(i2);
        }

        @Override // java.util.AbstractList, java.util.List
        public java.util.List<java.lang.Integer> subList(int fromIndex, int toIndex) {
            com.google.common.base.Preconditions.checkPositionIndexes(fromIndex, toIndex, size());
            if (fromIndex == toIndex) {
                return java.util.Collections.emptyList();
            }
            int[] iArr = this.array;
            int i = this.start;
            return new com.google.common.primitives.Ints.IntArrayAsList(iArr, fromIndex + i, i + toIndex);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
            if (object == this) {
                return true;
            }
            if (object instanceof com.google.common.primitives.Ints.IntArrayAsList) {
                com.google.common.primitives.Ints.IntArrayAsList intArrayAsList = (com.google.common.primitives.Ints.IntArrayAsList) object;
                int size = size();
                if (intArrayAsList.size() != size) {
                    return false;
                }
                for (int i = 0; i < size; i++) {
                    if (this.array[this.start + i] != intArrayAsList.array[intArrayAsList.start + i]) {
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
                iHashCode = (iHashCode * 31) + com.google.common.primitives.Ints.hashCode(this.array[i]);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractCollection
        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(size() * 5);
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

        int[] toIntArray() {
            return java.util.Arrays.copyOfRange(this.array, this.start, this.end);
        }
    }

    @javax.annotation.CheckForNull
    public static java.lang.Integer tryParse(java.lang.String string) {
        return tryParse(string, 10);
    }

    @javax.annotation.CheckForNull
    public static java.lang.Integer tryParse(java.lang.String string, int radix) {
        java.lang.Long lTryParse = com.google.common.primitives.Longs.tryParse(string, radix);
        if (lTryParse == null || lTryParse.longValue() != lTryParse.intValue()) {
            return null;
        }
        return java.lang.Integer.valueOf(lTryParse.intValue());
    }
}
