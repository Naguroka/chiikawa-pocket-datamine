package com.google.common.primitives;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.primitives.ElementTypesAreNonnullByDefault
@com.google.errorprone.annotations.Immutable
public final class ImmutableDoubleArray implements java.io.Serializable {
    private static final com.google.common.primitives.ImmutableDoubleArray EMPTY = new com.google.common.primitives.ImmutableDoubleArray(new double[0]);
    private final double[] array;
    private final int end;
    private final transient int start;

    public static com.google.common.primitives.ImmutableDoubleArray of() {
        return EMPTY;
    }

    public static com.google.common.primitives.ImmutableDoubleArray of(double e0) {
        return new com.google.common.primitives.ImmutableDoubleArray(new double[]{e0});
    }

    public static com.google.common.primitives.ImmutableDoubleArray of(double e0, double e1) {
        return new com.google.common.primitives.ImmutableDoubleArray(new double[]{e0, e1});
    }

    public static com.google.common.primitives.ImmutableDoubleArray of(double e0, double e1, double e2) {
        return new com.google.common.primitives.ImmutableDoubleArray(new double[]{e0, e1, e2});
    }

    public static com.google.common.primitives.ImmutableDoubleArray of(double e0, double e1, double e2, double e3) {
        return new com.google.common.primitives.ImmutableDoubleArray(new double[]{e0, e1, e2, e3});
    }

    public static com.google.common.primitives.ImmutableDoubleArray of(double e0, double e1, double e2, double e3, double e4) {
        return new com.google.common.primitives.ImmutableDoubleArray(new double[]{e0, e1, e2, e3, e4});
    }

    public static com.google.common.primitives.ImmutableDoubleArray of(double e0, double e1, double e2, double e3, double e4, double e5) {
        return new com.google.common.primitives.ImmutableDoubleArray(new double[]{e0, e1, e2, e3, e4, e5});
    }

    public static com.google.common.primitives.ImmutableDoubleArray of(double first, double... rest) {
        com.google.common.base.Preconditions.checkArgument(rest.length <= 2147483646, "the total number of elements must fit in an int");
        double[] dArr = new double[rest.length + 1];
        dArr[0] = first;
        java.lang.System.arraycopy(rest, 0, dArr, 1, rest.length);
        return new com.google.common.primitives.ImmutableDoubleArray(dArr);
    }

    public static com.google.common.primitives.ImmutableDoubleArray copyOf(double[] values) {
        if (values.length == 0) {
            return EMPTY;
        }
        return new com.google.common.primitives.ImmutableDoubleArray(java.util.Arrays.copyOf(values, values.length));
    }

    public static com.google.common.primitives.ImmutableDoubleArray copyOf(java.util.Collection<java.lang.Double> values) {
        return values.isEmpty() ? EMPTY : new com.google.common.primitives.ImmutableDoubleArray(com.google.common.primitives.Doubles.toArray(values));
    }

    public static com.google.common.primitives.ImmutableDoubleArray copyOf(java.lang.Iterable<java.lang.Double> values) {
        if (values instanceof java.util.Collection) {
            return copyOf((java.util.Collection<java.lang.Double>) values);
        }
        return builder().addAll(values).build();
    }

    public static com.google.common.primitives.ImmutableDoubleArray.Builder builder(int initialCapacity) {
        com.google.common.base.Preconditions.checkArgument(initialCapacity >= 0, "Invalid initialCapacity: %s", initialCapacity);
        return new com.google.common.primitives.ImmutableDoubleArray.Builder(initialCapacity);
    }

    public static com.google.common.primitives.ImmutableDoubleArray.Builder builder() {
        return new com.google.common.primitives.ImmutableDoubleArray.Builder(10);
    }

    public static final class Builder {
        private double[] array;
        private int count = 0;

        Builder(int initialCapacity) {
            this.array = new double[initialCapacity];
        }

        public com.google.common.primitives.ImmutableDoubleArray.Builder add(double value) {
            ensureRoomFor(1);
            double[] dArr = this.array;
            int i = this.count;
            dArr[i] = value;
            this.count = i + 1;
            return this;
        }

        public com.google.common.primitives.ImmutableDoubleArray.Builder addAll(double[] values) {
            ensureRoomFor(values.length);
            java.lang.System.arraycopy(values, 0, this.array, this.count, values.length);
            this.count += values.length;
            return this;
        }

        public com.google.common.primitives.ImmutableDoubleArray.Builder addAll(java.lang.Iterable<java.lang.Double> values) {
            if (values instanceof java.util.Collection) {
                return addAll((java.util.Collection<java.lang.Double>) values);
            }
            java.util.Iterator<java.lang.Double> it = values.iterator();
            while (it.hasNext()) {
                add(it.next().doubleValue());
            }
            return this;
        }

        public com.google.common.primitives.ImmutableDoubleArray.Builder addAll(java.util.Collection<java.lang.Double> values) {
            ensureRoomFor(values.size());
            for (java.lang.Double d : values) {
                double[] dArr = this.array;
                int i = this.count;
                this.count = i + 1;
                dArr[i] = d.doubleValue();
            }
            return this;
        }

        public com.google.common.primitives.ImmutableDoubleArray.Builder addAll(com.google.common.primitives.ImmutableDoubleArray values) {
            ensureRoomFor(values.length());
            java.lang.System.arraycopy(values.array, values.start, this.array, this.count, values.length());
            this.count += values.length();
            return this;
        }

        private void ensureRoomFor(int numberToAdd) {
            int i = this.count + numberToAdd;
            double[] dArr = this.array;
            if (i > dArr.length) {
                this.array = java.util.Arrays.copyOf(dArr, expandedCapacity(dArr.length, i));
            }
        }

        private static int expandedCapacity(int oldCapacity, int minCapacity) {
            if (minCapacity < 0) {
                throw new java.lang.AssertionError("cannot store more than MAX_VALUE elements");
            }
            int iHighestOneBit = oldCapacity + (oldCapacity >> 1) + 1;
            if (iHighestOneBit < minCapacity) {
                iHighestOneBit = java.lang.Integer.highestOneBit(minCapacity - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                return Integer.MAX_VALUE;
            }
            return iHighestOneBit;
        }

        public com.google.common.primitives.ImmutableDoubleArray build() {
            if (this.count == 0) {
                return com.google.common.primitives.ImmutableDoubleArray.EMPTY;
            }
            return new com.google.common.primitives.ImmutableDoubleArray(this.array, 0, this.count);
        }
    }

    private ImmutableDoubleArray(double[] array) {
        this(array, 0, array.length);
    }

    private ImmutableDoubleArray(double[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    public int length() {
        return this.end - this.start;
    }

    public boolean isEmpty() {
        return this.end == this.start;
    }

    public double get(int index) {
        com.google.common.base.Preconditions.checkElementIndex(index, length());
        return this.array[this.start + index];
    }

    public int indexOf(double target) {
        for (int i = this.start; i < this.end; i++) {
            if (areEqual(this.array[i], target)) {
                return i - this.start;
            }
        }
        return -1;
    }

    public int lastIndexOf(double target) {
        int i = this.end;
        do {
            i--;
            if (i < this.start) {
                return -1;
            }
        } while (!areEqual(this.array[i], target));
        return i - this.start;
    }

    public boolean contains(double target) {
        return indexOf(target) >= 0;
    }

    public double[] toArray() {
        return java.util.Arrays.copyOfRange(this.array, this.start, this.end);
    }

    public com.google.common.primitives.ImmutableDoubleArray subArray(int startIndex, int endIndex) {
        com.google.common.base.Preconditions.checkPositionIndexes(startIndex, endIndex, length());
        if (startIndex == endIndex) {
            return EMPTY;
        }
        double[] dArr = this.array;
        int i = this.start;
        return new com.google.common.primitives.ImmutableDoubleArray(dArr, startIndex + i, i + endIndex);
    }

    public java.util.List<java.lang.Double> asList() {
        return new com.google.common.primitives.ImmutableDoubleArray.AsList();
    }

    static class AsList extends java.util.AbstractList<java.lang.Double> implements java.util.RandomAccess, java.io.Serializable {
        private final com.google.common.primitives.ImmutableDoubleArray parent;

        private AsList(com.google.common.primitives.ImmutableDoubleArray parent) {
            this.parent = parent;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.parent.length();
        }

        @Override // java.util.AbstractList, java.util.List
        public java.lang.Double get(int index) {
            return java.lang.Double.valueOf(this.parent.get(index));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object target) {
            return indexOf(target) >= 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@javax.annotation.CheckForNull java.lang.Object target) {
            if (target instanceof java.lang.Double) {
                return this.parent.indexOf(((java.lang.Double) target).doubleValue());
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@javax.annotation.CheckForNull java.lang.Object target) {
            if (target instanceof java.lang.Double) {
                return this.parent.lastIndexOf(((java.lang.Double) target).doubleValue());
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public java.util.List<java.lang.Double> subList(int fromIndex, int toIndex) {
            return this.parent.subArray(fromIndex, toIndex).asList();
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
            if (object instanceof com.google.common.primitives.ImmutableDoubleArray.AsList) {
                return this.parent.equals(((com.google.common.primitives.ImmutableDoubleArray.AsList) object).parent);
            }
            if (!(object instanceof java.util.List)) {
                return false;
            }
            java.util.List list = (java.util.List) object;
            if (size() != list.size()) {
                return false;
            }
            int i = this.parent.start;
            for (java.lang.Object obj : list) {
                if (obj instanceof java.lang.Double) {
                    int i2 = i + 1;
                    if (com.google.common.primitives.ImmutableDoubleArray.areEqual(this.parent.array[i], ((java.lang.Double) obj).doubleValue())) {
                        i = i2;
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            return this.parent.hashCode();
        }

        @Override // java.util.AbstractCollection
        public java.lang.String toString() {
            return this.parent.toString();
        }
    }

    public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof com.google.common.primitives.ImmutableDoubleArray)) {
            return false;
        }
        com.google.common.primitives.ImmutableDoubleArray immutableDoubleArray = (com.google.common.primitives.ImmutableDoubleArray) object;
        if (length() != immutableDoubleArray.length()) {
            return false;
        }
        for (int i = 0; i < length(); i++) {
            if (!areEqual(get(i), immutableDoubleArray.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean areEqual(double a2, double b) {
        return java.lang.Double.doubleToLongBits(a2) == java.lang.Double.doubleToLongBits(b);
    }

    public int hashCode() {
        int iHashCode = 1;
        for (int i = this.start; i < this.end; i++) {
            iHashCode = (iHashCode * 31) + com.google.common.primitives.Doubles.hashCode(this.array[i]);
        }
        return iHashCode;
    }

    public java.lang.String toString() {
        if (isEmpty()) {
            return okhttp3.HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length() * 5);
        sb.append('[').append(this.array[this.start]);
        int i = this.start;
        while (true) {
            i++;
            if (i < this.end) {
                sb.append(", ").append(this.array[i]);
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }

    public com.google.common.primitives.ImmutableDoubleArray trimmed() {
        return isPartialView() ? new com.google.common.primitives.ImmutableDoubleArray(toArray()) : this;
    }

    private boolean isPartialView() {
        return this.start > 0 || this.end < this.array.length;
    }

    java.lang.Object writeReplace() {
        return trimmed();
    }

    java.lang.Object readResolve() {
        return isEmpty() ? EMPTY : this;
    }
}
