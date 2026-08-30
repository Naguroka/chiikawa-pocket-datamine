package com.google.common.primitives;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.primitives.ElementTypesAreNonnullByDefault
@com.google.errorprone.annotations.Immutable
public final class ImmutableIntArray implements java.io.Serializable {
    private static final com.google.common.primitives.ImmutableIntArray EMPTY = new com.google.common.primitives.ImmutableIntArray(new int[0]);
    private final int[] array;
    private final int end;
    private final transient int start;

    public static com.google.common.primitives.ImmutableIntArray of() {
        return EMPTY;
    }

    public static com.google.common.primitives.ImmutableIntArray of(int e0) {
        return new com.google.common.primitives.ImmutableIntArray(new int[]{e0});
    }

    public static com.google.common.primitives.ImmutableIntArray of(int e0, int e1) {
        return new com.google.common.primitives.ImmutableIntArray(new int[]{e0, e1});
    }

    public static com.google.common.primitives.ImmutableIntArray of(int e0, int e1, int e2) {
        return new com.google.common.primitives.ImmutableIntArray(new int[]{e0, e1, e2});
    }

    public static com.google.common.primitives.ImmutableIntArray of(int e0, int e1, int e2, int e3) {
        return new com.google.common.primitives.ImmutableIntArray(new int[]{e0, e1, e2, e3});
    }

    public static com.google.common.primitives.ImmutableIntArray of(int e0, int e1, int e2, int e3, int e4) {
        return new com.google.common.primitives.ImmutableIntArray(new int[]{e0, e1, e2, e3, e4});
    }

    public static com.google.common.primitives.ImmutableIntArray of(int e0, int e1, int e2, int e3, int e4, int e5) {
        return new com.google.common.primitives.ImmutableIntArray(new int[]{e0, e1, e2, e3, e4, e5});
    }

    public static com.google.common.primitives.ImmutableIntArray of(int first, int... rest) {
        com.google.common.base.Preconditions.checkArgument(rest.length <= 2147483646, "the total number of elements must fit in an int");
        int[] iArr = new int[rest.length + 1];
        iArr[0] = first;
        java.lang.System.arraycopy(rest, 0, iArr, 1, rest.length);
        return new com.google.common.primitives.ImmutableIntArray(iArr);
    }

    public static com.google.common.primitives.ImmutableIntArray copyOf(int[] values) {
        return values.length == 0 ? EMPTY : new com.google.common.primitives.ImmutableIntArray(java.util.Arrays.copyOf(values, values.length));
    }

    public static com.google.common.primitives.ImmutableIntArray copyOf(java.util.Collection<java.lang.Integer> values) {
        return values.isEmpty() ? EMPTY : new com.google.common.primitives.ImmutableIntArray(com.google.common.primitives.Ints.toArray(values));
    }

    public static com.google.common.primitives.ImmutableIntArray copyOf(java.lang.Iterable<java.lang.Integer> values) {
        if (values instanceof java.util.Collection) {
            return copyOf((java.util.Collection<java.lang.Integer>) values);
        }
        return builder().addAll(values).build();
    }

    public static com.google.common.primitives.ImmutableIntArray.Builder builder(int initialCapacity) {
        com.google.common.base.Preconditions.checkArgument(initialCapacity >= 0, "Invalid initialCapacity: %s", initialCapacity);
        return new com.google.common.primitives.ImmutableIntArray.Builder(initialCapacity);
    }

    public static com.google.common.primitives.ImmutableIntArray.Builder builder() {
        return new com.google.common.primitives.ImmutableIntArray.Builder(10);
    }

    public static final class Builder {
        private int[] array;
        private int count = 0;

        Builder(int initialCapacity) {
            this.array = new int[initialCapacity];
        }

        public com.google.common.primitives.ImmutableIntArray.Builder add(int value) {
            ensureRoomFor(1);
            int[] iArr = this.array;
            int i = this.count;
            iArr[i] = value;
            this.count = i + 1;
            return this;
        }

        public com.google.common.primitives.ImmutableIntArray.Builder addAll(int[] values) {
            ensureRoomFor(values.length);
            java.lang.System.arraycopy(values, 0, this.array, this.count, values.length);
            this.count += values.length;
            return this;
        }

        public com.google.common.primitives.ImmutableIntArray.Builder addAll(java.lang.Iterable<java.lang.Integer> values) {
            if (values instanceof java.util.Collection) {
                return addAll((java.util.Collection<java.lang.Integer>) values);
            }
            java.util.Iterator<java.lang.Integer> it = values.iterator();
            while (it.hasNext()) {
                add(it.next().intValue());
            }
            return this;
        }

        public com.google.common.primitives.ImmutableIntArray.Builder addAll(java.util.Collection<java.lang.Integer> values) {
            ensureRoomFor(values.size());
            for (java.lang.Integer num : values) {
                int[] iArr = this.array;
                int i = this.count;
                this.count = i + 1;
                iArr[i] = num.intValue();
            }
            return this;
        }

        public com.google.common.primitives.ImmutableIntArray.Builder addAll(com.google.common.primitives.ImmutableIntArray values) {
            ensureRoomFor(values.length());
            java.lang.System.arraycopy(values.array, values.start, this.array, this.count, values.length());
            this.count += values.length();
            return this;
        }

        private void ensureRoomFor(int numberToAdd) {
            int i = this.count + numberToAdd;
            int[] iArr = this.array;
            if (i > iArr.length) {
                this.array = java.util.Arrays.copyOf(iArr, expandedCapacity(iArr.length, i));
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

        public com.google.common.primitives.ImmutableIntArray build() {
            if (this.count == 0) {
                return com.google.common.primitives.ImmutableIntArray.EMPTY;
            }
            return new com.google.common.primitives.ImmutableIntArray(this.array, 0, this.count);
        }
    }

    private ImmutableIntArray(int[] array) {
        this(array, 0, array.length);
    }

    private ImmutableIntArray(int[] array, int start, int end) {
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

    public int get(int index) {
        com.google.common.base.Preconditions.checkElementIndex(index, length());
        return this.array[this.start + index];
    }

    public int indexOf(int target) {
        for (int i = this.start; i < this.end; i++) {
            if (this.array[i] == target) {
                return i - this.start;
            }
        }
        return -1;
    }

    public int lastIndexOf(int target) {
        int i;
        int i2 = this.end;
        do {
            i2--;
            i = this.start;
            if (i2 < i) {
                return -1;
            }
        } while (this.array[i2] != target);
        return i2 - i;
    }

    public boolean contains(int target) {
        return indexOf(target) >= 0;
    }

    public int[] toArray() {
        return java.util.Arrays.copyOfRange(this.array, this.start, this.end);
    }

    public com.google.common.primitives.ImmutableIntArray subArray(int startIndex, int endIndex) {
        com.google.common.base.Preconditions.checkPositionIndexes(startIndex, endIndex, length());
        if (startIndex == endIndex) {
            return EMPTY;
        }
        int[] iArr = this.array;
        int i = this.start;
        return new com.google.common.primitives.ImmutableIntArray(iArr, startIndex + i, i + endIndex);
    }

    public java.util.List<java.lang.Integer> asList() {
        return new com.google.common.primitives.ImmutableIntArray.AsList();
    }

    static class AsList extends java.util.AbstractList<java.lang.Integer> implements java.util.RandomAccess, java.io.Serializable {
        private final com.google.common.primitives.ImmutableIntArray parent;

        private AsList(com.google.common.primitives.ImmutableIntArray parent) {
            this.parent = parent;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.parent.length();
        }

        @Override // java.util.AbstractList, java.util.List
        public java.lang.Integer get(int index) {
            return java.lang.Integer.valueOf(this.parent.get(index));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object target) {
            return indexOf(target) >= 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@javax.annotation.CheckForNull java.lang.Object target) {
            if (target instanceof java.lang.Integer) {
                return this.parent.indexOf(((java.lang.Integer) target).intValue());
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@javax.annotation.CheckForNull java.lang.Object target) {
            if (target instanceof java.lang.Integer) {
                return this.parent.lastIndexOf(((java.lang.Integer) target).intValue());
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public java.util.List<java.lang.Integer> subList(int fromIndex, int toIndex) {
            return this.parent.subArray(fromIndex, toIndex).asList();
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
            if (object instanceof com.google.common.primitives.ImmutableIntArray.AsList) {
                return this.parent.equals(((com.google.common.primitives.ImmutableIntArray.AsList) object).parent);
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
                if (obj instanceof java.lang.Integer) {
                    int i2 = i + 1;
                    if (this.parent.array[i] == ((java.lang.Integer) obj).intValue()) {
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
        if (!(object instanceof com.google.common.primitives.ImmutableIntArray)) {
            return false;
        }
        com.google.common.primitives.ImmutableIntArray immutableIntArray = (com.google.common.primitives.ImmutableIntArray) object;
        if (length() != immutableIntArray.length()) {
            return false;
        }
        for (int i = 0; i < length(); i++) {
            if (get(i) != immutableIntArray.get(i)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int iHashCode = 1;
        for (int i = this.start; i < this.end; i++) {
            iHashCode = (iHashCode * 31) + com.google.common.primitives.Ints.hashCode(this.array[i]);
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

    public com.google.common.primitives.ImmutableIntArray trimmed() {
        return isPartialView() ? new com.google.common.primitives.ImmutableIntArray(toArray()) : this;
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
