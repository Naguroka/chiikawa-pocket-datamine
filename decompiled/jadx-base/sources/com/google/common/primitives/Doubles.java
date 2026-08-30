package com.google.common.primitives;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.primitives.ElementTypesAreNonnullByDefault
public final class Doubles extends com.google.common.primitives.DoublesMethodsForWeb {
    public static final int BYTES = 8;
    static final java.util.regex.Pattern FLOATING_POINT_PATTERN = fpPattern();

    public static boolean isFinite(double value) {
        return Double.NEGATIVE_INFINITY < value && value < Double.POSITIVE_INFINITY;
    }

    private Doubles() {
    }

    public static int hashCode(double value) {
        return java.lang.Double.valueOf(value).hashCode();
    }

    public static int compare(double a2, double b) {
        return java.lang.Double.compare(a2, b);
    }

    public static boolean contains(double[] array, double target) {
        for (double d : array) {
            if (d == target) {
                return true;
            }
        }
        return false;
    }

    public static int indexOf(double[] array, double target) {
        return indexOf(array, target, 0, array.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indexOf(double[] array, double target, int start, int end) {
        while (start < end) {
            if (array[start] == target) {
                return start;
            }
            start++;
        }
        return -1;
    }

    public static int indexOf(double[] array, double[] target) {
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

    public static int lastIndexOf(double[] array, double target) {
        return lastIndexOf(array, target, 0, array.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lastIndexOf(double[] array, double target, int start, int end) {
        for (int i = end - 1; i >= start; i--) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static double min(double... array) {
        com.google.common.base.Preconditions.checkArgument(array.length > 0);
        double dMin = array[0];
        for (int i = 1; i < array.length; i++) {
            dMin = java.lang.Math.min(dMin, array[i]);
        }
        return dMin;
    }

    public static double max(double... array) {
        com.google.common.base.Preconditions.checkArgument(array.length > 0);
        double dMax = array[0];
        for (int i = 1; i < array.length; i++) {
            dMax = java.lang.Math.max(dMax, array[i]);
        }
        return dMax;
    }

    public static double constrainToRange(double value, double min, double max) {
        if (min <= max) {
            return java.lang.Math.min(java.lang.Math.max(value, min), max);
        }
        throw new java.lang.IllegalArgumentException(com.google.common.base.Strings.lenientFormat("min (%s) must be less than or equal to max (%s)", java.lang.Double.valueOf(min), java.lang.Double.valueOf(max)));
    }

    public static double[] concat(double[]... arrays) {
        int length = 0;
        for (double[] dArr : arrays) {
            length += dArr.length;
        }
        double[] dArr2 = new double[length];
        int length2 = 0;
        for (double[] dArr3 : arrays) {
            java.lang.System.arraycopy(dArr3, 0, dArr2, length2, dArr3.length);
            length2 += dArr3.length;
        }
        return dArr2;
    }

    private static final class DoubleConverter extends com.google.common.base.Converter<java.lang.String, java.lang.Double> implements java.io.Serializable {
        static final com.google.common.base.Converter<java.lang.String, java.lang.Double> INSTANCE = new com.google.common.primitives.Doubles.DoubleConverter();
        private static final long serialVersionUID = 1;

        public java.lang.String toString() {
            return "Doubles.stringConverter()";
        }

        private DoubleConverter() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        public java.lang.Double doForward(java.lang.String value) {
            return java.lang.Double.valueOf(value);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        public java.lang.String doBackward(java.lang.Double value) {
            return value.toString();
        }

        private java.lang.Object readResolve() {
            return INSTANCE;
        }
    }

    public static com.google.common.base.Converter<java.lang.String, java.lang.Double> stringConverter() {
        return com.google.common.primitives.Doubles.DoubleConverter.INSTANCE;
    }

    public static double[] ensureCapacity(double[] array, int minLength, int padding) {
        com.google.common.base.Preconditions.checkArgument(minLength >= 0, "Invalid minLength: %s", minLength);
        com.google.common.base.Preconditions.checkArgument(padding >= 0, "Invalid padding: %s", padding);
        return array.length < minLength ? java.util.Arrays.copyOf(array, minLength + padding) : array;
    }

    public static java.lang.String join(java.lang.String separator, double... array) {
        com.google.common.base.Preconditions.checkNotNull(separator);
        if (array.length == 0) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(array.length * 12);
        sb.append(array[0]);
        for (int i = 1; i < array.length; i++) {
            sb.append(separator).append(array[i]);
        }
        return sb.toString();
    }

    public static java.util.Comparator<double[]> lexicographicalComparator() {
        return com.google.common.primitives.Doubles.LexicographicalComparator.INSTANCE;
    }

    private enum LexicographicalComparator implements java.util.Comparator<double[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public java.lang.String toString() {
            return "Doubles.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(double[] left, double[] right) {
            int iMin = java.lang.Math.min(left.length, right.length);
            for (int i = 0; i < iMin; i++) {
                int iCompare = java.lang.Double.compare(left[i], right[i]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return left.length - right.length;
        }
    }

    public static void sortDescending(double[] array) {
        com.google.common.base.Preconditions.checkNotNull(array);
        sortDescending(array, 0, array.length);
    }

    public static void sortDescending(double[] array, int fromIndex, int toIndex) {
        com.google.common.base.Preconditions.checkNotNull(array);
        com.google.common.base.Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        java.util.Arrays.sort(array, fromIndex, toIndex);
        reverse(array, fromIndex, toIndex);
    }

    public static void reverse(double[] array) {
        com.google.common.base.Preconditions.checkNotNull(array);
        reverse(array, 0, array.length);
    }

    public static void reverse(double[] array, int fromIndex, int toIndex) {
        com.google.common.base.Preconditions.checkNotNull(array);
        com.google.common.base.Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        for (int i = toIndex - 1; fromIndex < i; i--) {
            double d = array[fromIndex];
            array[fromIndex] = array[i];
            array[i] = d;
            fromIndex++;
        }
    }

    public static void rotate(double[] array, int distance) {
        rotate(array, distance, 0, array.length);
    }

    public static void rotate(double[] array, int distance, int fromIndex, int toIndex) {
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

    public static double[] toArray(java.util.Collection<? extends java.lang.Number> collection) {
        if (collection instanceof com.google.common.primitives.Doubles.DoubleArrayAsList) {
            return ((com.google.common.primitives.Doubles.DoubleArrayAsList) collection).toDoubleArray();
        }
        java.lang.Object[] array = collection.toArray();
        int length = array.length;
        double[] dArr = new double[length];
        for (int i = 0; i < length; i++) {
            dArr[i] = ((java.lang.Number) com.google.common.base.Preconditions.checkNotNull(array[i])).doubleValue();
        }
        return dArr;
    }

    public static java.util.List<java.lang.Double> asList(double... backingArray) {
        if (backingArray.length == 0) {
            return java.util.Collections.emptyList();
        }
        return new com.google.common.primitives.Doubles.DoubleArrayAsList(backingArray);
    }

    private static class DoubleArrayAsList extends java.util.AbstractList<java.lang.Double> implements java.util.RandomAccess, java.io.Serializable {
        private static final long serialVersionUID = 0;
        final double[] array;
        final int end;
        final int start;

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        DoubleArrayAsList(double[] array) {
            this(array, 0, array.length);
        }

        DoubleArrayAsList(double[] array, int start, int end) {
            this.array = array;
            this.start = start;
            this.end = end;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public java.lang.Double get(int index) {
            com.google.common.base.Preconditions.checkElementIndex(index, size());
            return java.lang.Double.valueOf(this.array[this.start + index]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object target) {
            return (target instanceof java.lang.Double) && com.google.common.primitives.Doubles.indexOf(this.array, ((java.lang.Double) target).doubleValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@javax.annotation.CheckForNull java.lang.Object target) {
            int iIndexOf;
            if (!(target instanceof java.lang.Double) || (iIndexOf = com.google.common.primitives.Doubles.indexOf(this.array, ((java.lang.Double) target).doubleValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iIndexOf - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@javax.annotation.CheckForNull java.lang.Object target) {
            int iLastIndexOf;
            if (!(target instanceof java.lang.Double) || (iLastIndexOf = com.google.common.primitives.Doubles.lastIndexOf(this.array, ((java.lang.Double) target).doubleValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iLastIndexOf - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public java.lang.Double set(int index, java.lang.Double element) {
            com.google.common.base.Preconditions.checkElementIndex(index, size());
            double[] dArr = this.array;
            int i = this.start;
            double d = dArr[i + index];
            dArr[i + index] = ((java.lang.Double) com.google.common.base.Preconditions.checkNotNull(element)).doubleValue();
            return java.lang.Double.valueOf(d);
        }

        @Override // java.util.AbstractList, java.util.List
        public java.util.List<java.lang.Double> subList(int fromIndex, int toIndex) {
            com.google.common.base.Preconditions.checkPositionIndexes(fromIndex, toIndex, size());
            if (fromIndex == toIndex) {
                return java.util.Collections.emptyList();
            }
            double[] dArr = this.array;
            int i = this.start;
            return new com.google.common.primitives.Doubles.DoubleArrayAsList(dArr, fromIndex + i, i + toIndex);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
            if (object == this) {
                return true;
            }
            if (object instanceof com.google.common.primitives.Doubles.DoubleArrayAsList) {
                com.google.common.primitives.Doubles.DoubleArrayAsList doubleArrayAsList = (com.google.common.primitives.Doubles.DoubleArrayAsList) object;
                int size = size();
                if (doubleArrayAsList.size() != size) {
                    return false;
                }
                for (int i = 0; i < size; i++) {
                    if (this.array[this.start + i] != doubleArrayAsList.array[doubleArrayAsList.start + i]) {
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
                iHashCode = (iHashCode * 31) + com.google.common.primitives.Doubles.hashCode(this.array[i]);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractCollection
        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(size() * 12);
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

        double[] toDoubleArray() {
            return java.util.Arrays.copyOfRange(this.array, this.start, this.end);
        }
    }

    private static java.util.regex.Pattern fpPattern() {
        return java.util.regex.Pattern.compile("[+-]?(?:NaN|Infinity|(?:\\d+#(?:\\.\\d*#)?|\\.\\d+#)(?:[eE][+-]?\\d+#)?[fFdD]?|0[xX](?:[0-9a-fA-F]+#(?:\\.[0-9a-fA-F]*#)?|\\.[0-9a-fA-F]+#)[pP][+-]?\\d+#[fFdD]?)".replace("#", "+"));
    }

    @javax.annotation.CheckForNull
    public static java.lang.Double tryParse(java.lang.String string) {
        if (!FLOATING_POINT_PATTERN.matcher(string).matches()) {
            return null;
        }
        try {
            return java.lang.Double.valueOf(java.lang.Double.parseDouble(string));
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }
}
