package com.google.common.primitives;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.primitives.ElementTypesAreNonnullByDefault
public final class Booleans {
    public static int compare(boolean a2, boolean b) {
        if (a2 == b) {
            return 0;
        }
        return a2 ? 1 : -1;
    }

    public static int hashCode(boolean value) {
        return value ? 1231 : 1237;
    }

    private Booleans() {
    }

    private enum BooleanComparator implements java.util.Comparator<java.lang.Boolean> {
        TRUE_FIRST(1, "Booleans.trueFirst()"),
        FALSE_FIRST(-1, "Booleans.falseFirst()");

        private final java.lang.String toString;
        private final int trueValue;

        BooleanComparator(int trueValue, java.lang.String toString) {
            this.trueValue = trueValue;
            this.toString = toString;
        }

        @Override // java.util.Comparator
        public int compare(java.lang.Boolean a2, java.lang.Boolean b) {
            return (b.booleanValue() ? this.trueValue : 0) - (a2.booleanValue() ? this.trueValue : 0);
        }

        @Override // java.lang.Enum
        public java.lang.String toString() {
            return this.toString;
        }
    }

    public static java.util.Comparator<java.lang.Boolean> trueFirst() {
        return com.google.common.primitives.Booleans.BooleanComparator.TRUE_FIRST;
    }

    public static java.util.Comparator<java.lang.Boolean> falseFirst() {
        return com.google.common.primitives.Booleans.BooleanComparator.FALSE_FIRST;
    }

    public static boolean contains(boolean[] array, boolean target) {
        for (boolean z : array) {
            if (z == target) {
                return true;
            }
        }
        return false;
    }

    public static int indexOf(boolean[] array, boolean target) {
        return indexOf(array, target, 0, array.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indexOf(boolean[] array, boolean target, int start, int end) {
        while (start < end) {
            if (array[start] == target) {
                return start;
            }
            start++;
        }
        return -1;
    }

    public static int indexOf(boolean[] array, boolean[] target) {
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

    public static int lastIndexOf(boolean[] array, boolean target) {
        return lastIndexOf(array, target, 0, array.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lastIndexOf(boolean[] array, boolean target, int start, int end) {
        for (int i = end - 1; i >= start; i--) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static boolean[] concat(boolean[]... arrays) {
        int length = 0;
        for (boolean[] zArr : arrays) {
            length += zArr.length;
        }
        boolean[] zArr2 = new boolean[length];
        int length2 = 0;
        for (boolean[] zArr3 : arrays) {
            java.lang.System.arraycopy(zArr3, 0, zArr2, length2, zArr3.length);
            length2 += zArr3.length;
        }
        return zArr2;
    }

    public static boolean[] ensureCapacity(boolean[] array, int minLength, int padding) {
        com.google.common.base.Preconditions.checkArgument(minLength >= 0, "Invalid minLength: %s", minLength);
        com.google.common.base.Preconditions.checkArgument(padding >= 0, "Invalid padding: %s", padding);
        return array.length < minLength ? java.util.Arrays.copyOf(array, minLength + padding) : array;
    }

    public static java.lang.String join(java.lang.String separator, boolean... array) {
        com.google.common.base.Preconditions.checkNotNull(separator);
        if (array.length == 0) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(array.length * 7);
        sb.append(array[0]);
        for (int i = 1; i < array.length; i++) {
            sb.append(separator).append(array[i]);
        }
        return sb.toString();
    }

    public static java.util.Comparator<boolean[]> lexicographicalComparator() {
        return com.google.common.primitives.Booleans.LexicographicalComparator.INSTANCE;
    }

    private enum LexicographicalComparator implements java.util.Comparator<boolean[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public java.lang.String toString() {
            return "Booleans.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(boolean[] left, boolean[] right) {
            int iMin = java.lang.Math.min(left.length, right.length);
            for (int i = 0; i < iMin; i++) {
                int iCompare = com.google.common.primitives.Booleans.compare(left[i], right[i]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return left.length - right.length;
        }
    }

    public static boolean[] toArray(java.util.Collection<java.lang.Boolean> collection) {
        if (collection instanceof com.google.common.primitives.Booleans.BooleanArrayAsList) {
            return ((com.google.common.primitives.Booleans.BooleanArrayAsList) collection).toBooleanArray();
        }
        java.lang.Object[] array = collection.toArray();
        int length = array.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = ((java.lang.Boolean) com.google.common.base.Preconditions.checkNotNull(array[i])).booleanValue();
        }
        return zArr;
    }

    public static java.util.List<java.lang.Boolean> asList(boolean... backingArray) {
        if (backingArray.length == 0) {
            return java.util.Collections.emptyList();
        }
        return new com.google.common.primitives.Booleans.BooleanArrayAsList(backingArray);
    }

    private static class BooleanArrayAsList extends java.util.AbstractList<java.lang.Boolean> implements java.util.RandomAccess, java.io.Serializable {
        private static final long serialVersionUID = 0;
        final boolean[] array;
        final int end;
        final int start;

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        BooleanArrayAsList(boolean[] array) {
            this(array, 0, array.length);
        }

        BooleanArrayAsList(boolean[] array, int start, int end) {
            this.array = array;
            this.start = start;
            this.end = end;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public java.lang.Boolean get(int index) {
            com.google.common.base.Preconditions.checkElementIndex(index, size());
            return java.lang.Boolean.valueOf(this.array[this.start + index]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object target) {
            return (target instanceof java.lang.Boolean) && com.google.common.primitives.Booleans.indexOf(this.array, ((java.lang.Boolean) target).booleanValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@javax.annotation.CheckForNull java.lang.Object target) {
            int iIndexOf;
            if (!(target instanceof java.lang.Boolean) || (iIndexOf = com.google.common.primitives.Booleans.indexOf(this.array, ((java.lang.Boolean) target).booleanValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iIndexOf - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@javax.annotation.CheckForNull java.lang.Object target) {
            int iLastIndexOf;
            if (!(target instanceof java.lang.Boolean) || (iLastIndexOf = com.google.common.primitives.Booleans.lastIndexOf(this.array, ((java.lang.Boolean) target).booleanValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iLastIndexOf - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public java.lang.Boolean set(int index, java.lang.Boolean element) {
            com.google.common.base.Preconditions.checkElementIndex(index, size());
            boolean[] zArr = this.array;
            int i = this.start;
            boolean z = zArr[i + index];
            zArr[i + index] = ((java.lang.Boolean) com.google.common.base.Preconditions.checkNotNull(element)).booleanValue();
            return java.lang.Boolean.valueOf(z);
        }

        @Override // java.util.AbstractList, java.util.List
        public java.util.List<java.lang.Boolean> subList(int fromIndex, int toIndex) {
            com.google.common.base.Preconditions.checkPositionIndexes(fromIndex, toIndex, size());
            if (fromIndex == toIndex) {
                return java.util.Collections.emptyList();
            }
            boolean[] zArr = this.array;
            int i = this.start;
            return new com.google.common.primitives.Booleans.BooleanArrayAsList(zArr, fromIndex + i, i + toIndex);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
            if (object == this) {
                return true;
            }
            if (object instanceof com.google.common.primitives.Booleans.BooleanArrayAsList) {
                com.google.common.primitives.Booleans.BooleanArrayAsList booleanArrayAsList = (com.google.common.primitives.Booleans.BooleanArrayAsList) object;
                int size = size();
                if (booleanArrayAsList.size() != size) {
                    return false;
                }
                for (int i = 0; i < size; i++) {
                    if (this.array[this.start + i] != booleanArrayAsList.array[booleanArrayAsList.start + i]) {
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
                iHashCode = (iHashCode * 31) + com.google.common.primitives.Booleans.hashCode(this.array[i]);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractCollection
        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(size() * 7);
            sb.append(this.array[this.start] ? "[true" : "[false");
            int i = this.start;
            while (true) {
                i++;
                if (i < this.end) {
                    sb.append(this.array[i] ? ", true" : ", false");
                } else {
                    return sb.append(']').toString();
                }
            }
        }

        boolean[] toBooleanArray() {
            return java.util.Arrays.copyOfRange(this.array, this.start, this.end);
        }
    }

    public static int countTrue(boolean... values) {
        int i = 0;
        for (boolean z : values) {
            if (z) {
                i++;
            }
        }
        return i;
    }

    public static void reverse(boolean[] array) {
        com.google.common.base.Preconditions.checkNotNull(array);
        reverse(array, 0, array.length);
    }

    public static void reverse(boolean[] array, int fromIndex, int toIndex) {
        com.google.common.base.Preconditions.checkNotNull(array);
        com.google.common.base.Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        for (int i = toIndex - 1; fromIndex < i; i--) {
            boolean z = array[fromIndex];
            array[fromIndex] = array[i];
            array[i] = z;
            fromIndex++;
        }
    }

    public static void rotate(boolean[] array, int distance) {
        rotate(array, distance, 0, array.length);
    }

    public static void rotate(boolean[] array, int distance, int fromIndex, int toIndex) {
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
}
