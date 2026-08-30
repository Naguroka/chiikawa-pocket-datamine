package com.google.common.primitives;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.primitives.ElementTypesAreNonnullByDefault
public final class Floats extends com.google.common.primitives.FloatsMethodsForWeb {
    public static final int BYTES = 4;

    public static boolean isFinite(float value) {
        return Float.NEGATIVE_INFINITY < value && value < Float.POSITIVE_INFINITY;
    }

    private Floats() {
    }

    public static int hashCode(float value) {
        return java.lang.Float.valueOf(value).hashCode();
    }

    public static int compare(float a2, float b) {
        return java.lang.Float.compare(a2, b);
    }

    public static boolean contains(float[] array, float target) {
        for (float f : array) {
            if (f == target) {
                return true;
            }
        }
        return false;
    }

    public static int indexOf(float[] array, float target) {
        return indexOf(array, target, 0, array.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indexOf(float[] array, float target, int start, int end) {
        while (start < end) {
            if (array[start] == target) {
                return start;
            }
            start++;
        }
        return -1;
    }

    public static int indexOf(float[] array, float[] target) {
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

    public static int lastIndexOf(float[] array, float target) {
        return lastIndexOf(array, target, 0, array.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lastIndexOf(float[] array, float target, int start, int end) {
        for (int i = end - 1; i >= start; i--) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static float min(float... array) {
        com.google.common.base.Preconditions.checkArgument(array.length > 0);
        float fMin = array[0];
        for (int i = 1; i < array.length; i++) {
            fMin = java.lang.Math.min(fMin, array[i]);
        }
        return fMin;
    }

    public static float max(float... array) {
        com.google.common.base.Preconditions.checkArgument(array.length > 0);
        float fMax = array[0];
        for (int i = 1; i < array.length; i++) {
            fMax = java.lang.Math.max(fMax, array[i]);
        }
        return fMax;
    }

    public static float constrainToRange(float value, float min, float max) {
        if (min <= max) {
            return java.lang.Math.min(java.lang.Math.max(value, min), max);
        }
        throw new java.lang.IllegalArgumentException(com.google.common.base.Strings.lenientFormat("min (%s) must be less than or equal to max (%s)", java.lang.Float.valueOf(min), java.lang.Float.valueOf(max)));
    }

    public static float[] concat(float[]... arrays) {
        int length = 0;
        for (float[] fArr : arrays) {
            length += fArr.length;
        }
        float[] fArr2 = new float[length];
        int length2 = 0;
        for (float[] fArr3 : arrays) {
            java.lang.System.arraycopy(fArr3, 0, fArr2, length2, fArr3.length);
            length2 += fArr3.length;
        }
        return fArr2;
    }

    private static final class FloatConverter extends com.google.common.base.Converter<java.lang.String, java.lang.Float> implements java.io.Serializable {
        static final com.google.common.base.Converter<java.lang.String, java.lang.Float> INSTANCE = new com.google.common.primitives.Floats.FloatConverter();
        private static final long serialVersionUID = 1;

        public java.lang.String toString() {
            return "Floats.stringConverter()";
        }

        private FloatConverter() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        public java.lang.Float doForward(java.lang.String value) {
            return java.lang.Float.valueOf(value);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        public java.lang.String doBackward(java.lang.Float value) {
            return value.toString();
        }

        private java.lang.Object readResolve() {
            return INSTANCE;
        }
    }

    public static com.google.common.base.Converter<java.lang.String, java.lang.Float> stringConverter() {
        return com.google.common.primitives.Floats.FloatConverter.INSTANCE;
    }

    public static float[] ensureCapacity(float[] array, int minLength, int padding) {
        com.google.common.base.Preconditions.checkArgument(minLength >= 0, "Invalid minLength: %s", minLength);
        com.google.common.base.Preconditions.checkArgument(padding >= 0, "Invalid padding: %s", padding);
        return array.length < minLength ? java.util.Arrays.copyOf(array, minLength + padding) : array;
    }

    public static java.lang.String join(java.lang.String separator, float... array) {
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

    public static java.util.Comparator<float[]> lexicographicalComparator() {
        return com.google.common.primitives.Floats.LexicographicalComparator.INSTANCE;
    }

    private enum LexicographicalComparator implements java.util.Comparator<float[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public java.lang.String toString() {
            return "Floats.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(float[] left, float[] right) {
            int iMin = java.lang.Math.min(left.length, right.length);
            for (int i = 0; i < iMin; i++) {
                int iCompare = java.lang.Float.compare(left[i], right[i]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return left.length - right.length;
        }
    }

    public static void sortDescending(float[] array) {
        com.google.common.base.Preconditions.checkNotNull(array);
        sortDescending(array, 0, array.length);
    }

    public static void sortDescending(float[] array, int fromIndex, int toIndex) {
        com.google.common.base.Preconditions.checkNotNull(array);
        com.google.common.base.Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        java.util.Arrays.sort(array, fromIndex, toIndex);
        reverse(array, fromIndex, toIndex);
    }

    public static void reverse(float[] array) {
        com.google.common.base.Preconditions.checkNotNull(array);
        reverse(array, 0, array.length);
    }

    public static void reverse(float[] array, int fromIndex, int toIndex) {
        com.google.common.base.Preconditions.checkNotNull(array);
        com.google.common.base.Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        for (int i = toIndex - 1; fromIndex < i; i--) {
            float f = array[fromIndex];
            array[fromIndex] = array[i];
            array[i] = f;
            fromIndex++;
        }
    }

    public static void rotate(float[] array, int distance) {
        rotate(array, distance, 0, array.length);
    }

    public static void rotate(float[] array, int distance, int fromIndex, int toIndex) {
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

    public static float[] toArray(java.util.Collection<? extends java.lang.Number> collection) {
        if (collection instanceof com.google.common.primitives.Floats.FloatArrayAsList) {
            return ((com.google.common.primitives.Floats.FloatArrayAsList) collection).toFloatArray();
        }
        java.lang.Object[] array = collection.toArray();
        int length = array.length;
        float[] fArr = new float[length];
        for (int i = 0; i < length; i++) {
            fArr[i] = ((java.lang.Number) com.google.common.base.Preconditions.checkNotNull(array[i])).floatValue();
        }
        return fArr;
    }

    public static java.util.List<java.lang.Float> asList(float... backingArray) {
        if (backingArray.length == 0) {
            return java.util.Collections.emptyList();
        }
        return new com.google.common.primitives.Floats.FloatArrayAsList(backingArray);
    }

    private static class FloatArrayAsList extends java.util.AbstractList<java.lang.Float> implements java.util.RandomAccess, java.io.Serializable {
        private static final long serialVersionUID = 0;
        final float[] array;
        final int end;
        final int start;

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        FloatArrayAsList(float[] array) {
            this(array, 0, array.length);
        }

        FloatArrayAsList(float[] array, int start, int end) {
            this.array = array;
            this.start = start;
            this.end = end;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public java.lang.Float get(int index) {
            com.google.common.base.Preconditions.checkElementIndex(index, size());
            return java.lang.Float.valueOf(this.array[this.start + index]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object target) {
            return (target instanceof java.lang.Float) && com.google.common.primitives.Floats.indexOf(this.array, ((java.lang.Float) target).floatValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@javax.annotation.CheckForNull java.lang.Object target) {
            int iIndexOf;
            if (!(target instanceof java.lang.Float) || (iIndexOf = com.google.common.primitives.Floats.indexOf(this.array, ((java.lang.Float) target).floatValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iIndexOf - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@javax.annotation.CheckForNull java.lang.Object target) {
            int iLastIndexOf;
            if (!(target instanceof java.lang.Float) || (iLastIndexOf = com.google.common.primitives.Floats.lastIndexOf(this.array, ((java.lang.Float) target).floatValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iLastIndexOf - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public java.lang.Float set(int index, java.lang.Float element) {
            com.google.common.base.Preconditions.checkElementIndex(index, size());
            float[] fArr = this.array;
            int i = this.start;
            float f = fArr[i + index];
            fArr[i + index] = ((java.lang.Float) com.google.common.base.Preconditions.checkNotNull(element)).floatValue();
            return java.lang.Float.valueOf(f);
        }

        @Override // java.util.AbstractList, java.util.List
        public java.util.List<java.lang.Float> subList(int fromIndex, int toIndex) {
            com.google.common.base.Preconditions.checkPositionIndexes(fromIndex, toIndex, size());
            if (fromIndex == toIndex) {
                return java.util.Collections.emptyList();
            }
            float[] fArr = this.array;
            int i = this.start;
            return new com.google.common.primitives.Floats.FloatArrayAsList(fArr, fromIndex + i, i + toIndex);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
            if (object == this) {
                return true;
            }
            if (object instanceof com.google.common.primitives.Floats.FloatArrayAsList) {
                com.google.common.primitives.Floats.FloatArrayAsList floatArrayAsList = (com.google.common.primitives.Floats.FloatArrayAsList) object;
                int size = size();
                if (floatArrayAsList.size() != size) {
                    return false;
                }
                for (int i = 0; i < size; i++) {
                    if (this.array[this.start + i] != floatArrayAsList.array[floatArrayAsList.start + i]) {
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
                iHashCode = (iHashCode * 31) + com.google.common.primitives.Floats.hashCode(this.array[i]);
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

        float[] toFloatArray() {
            return java.util.Arrays.copyOfRange(this.array, this.start, this.end);
        }
    }

    @javax.annotation.CheckForNull
    public static java.lang.Float tryParse(java.lang.String string) {
        if (!com.google.common.primitives.Doubles.FLOATING_POINT_PATTERN.matcher(string).matches()) {
            return null;
        }
        try {
            return java.lang.Float.valueOf(java.lang.Float.parseFloat(string));
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }
}
