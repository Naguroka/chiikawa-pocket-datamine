package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
final class LongArrayList extends androidx.datastore.preferences.protobuf.AbstractProtobufList<java.lang.Long> implements androidx.datastore.preferences.protobuf.Internal.LongList, java.util.RandomAccess, androidx.datastore.preferences.protobuf.PrimitiveNonBoxingCollection {
    private static final androidx.datastore.preferences.protobuf.LongArrayList EMPTY_LIST = new androidx.datastore.preferences.protobuf.LongArrayList(new long[0], 0, false);
    private long[] array;
    private int size;

    public static androidx.datastore.preferences.protobuf.LongArrayList emptyList() {
        return EMPTY_LIST;
    }

    LongArrayList() {
        this(new long[10], 0, true);
    }

    private LongArrayList(long[] other, int size, boolean isMutable) {
        super(isMutable);
        this.array = other;
        this.size = size;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int fromIndex, int toIndex) {
        ensureIsMutable();
        if (toIndex < fromIndex) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.array;
        java.lang.System.arraycopy(jArr, toIndex, jArr, fromIndex, this.size - toIndex);
        this.size -= toIndex - fromIndex;
        this.modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof androidx.datastore.preferences.protobuf.LongArrayList)) {
            return super.equals(o);
        }
        androidx.datastore.preferences.protobuf.LongArrayList longArrayList = (androidx.datastore.preferences.protobuf.LongArrayList) o;
        if (this.size != longArrayList.size) {
            return false;
        }
        long[] jArr = longArrayList.array;
        for (int i = 0; i < this.size; i++) {
            if (this.array[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iHashLong = 1;
        for (int i = 0; i < this.size; i++) {
            iHashLong = (iHashLong * 31) + androidx.datastore.preferences.protobuf.Internal.hashLong(this.array[i]);
        }
        return iHashLong;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public androidx.datastore.preferences.protobuf.Internal.ProtobufList<java.lang.Long> mutableCopyWithCapacity2(int capacity) {
        if (capacity < this.size) {
            throw new java.lang.IllegalArgumentException();
        }
        return new androidx.datastore.preferences.protobuf.LongArrayList(java.util.Arrays.copyOf(this.array, capacity), this.size, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Long get(int index) {
        return java.lang.Long.valueOf(getLong(index));
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.LongList
    public long getLong(int index) {
        ensureIndexInRange(index);
        return this.array[index];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(java.lang.Object element) {
        if (!(element instanceof java.lang.Long)) {
            return -1;
        }
        long jLongValue = ((java.lang.Long) element).longValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.array[i] == jLongValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(java.lang.Object element) {
        return indexOf(element) != -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public java.lang.Long set(int index, java.lang.Long element) {
        return java.lang.Long.valueOf(setLong(index, element.longValue()));
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.LongList
    public long setLong(int index, long element) {
        ensureIsMutable();
        ensureIndexInRange(index);
        long[] jArr = this.array;
        long j = jArr[index];
        jArr[index] = element;
        return j;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(java.lang.Long element) {
        addLong(element.longValue());
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int index, java.lang.Long element) {
        addLong(index, element.longValue());
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.LongList
    public void addLong(long element) {
        ensureIsMutable();
        int i = this.size;
        long[] jArr = this.array;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            java.lang.System.arraycopy(jArr, 0, jArr2, 0, i);
            this.array = jArr2;
        }
        long[] jArr3 = this.array;
        int i2 = this.size;
        this.size = i2 + 1;
        jArr3[i2] = element;
    }

    private void addLong(int index, long element) {
        int i;
        ensureIsMutable();
        if (index < 0 || index > (i = this.size)) {
            throw new java.lang.IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(index));
        }
        long[] jArr = this.array;
        if (i < jArr.length) {
            java.lang.System.arraycopy(jArr, index, jArr, index + 1, i - index);
        } else {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            java.lang.System.arraycopy(jArr, 0, jArr2, 0, index);
            java.lang.System.arraycopy(this.array, index, jArr2, index + 1, this.size - index);
            this.array = jArr2;
        }
        this.array[index] = element;
        this.size++;
        this.modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection<? extends java.lang.Long> collection) {
        ensureIsMutable();
        androidx.datastore.preferences.protobuf.Internal.checkNotNull(collection);
        if (!(collection instanceof androidx.datastore.preferences.protobuf.LongArrayList)) {
            return super.addAll(collection);
        }
        androidx.datastore.preferences.protobuf.LongArrayList longArrayList = (androidx.datastore.preferences.protobuf.LongArrayList) collection;
        int i = longArrayList.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.array;
        if (i3 > jArr.length) {
            this.array = java.util.Arrays.copyOf(jArr, i3);
        }
        java.lang.System.arraycopy(longArrayList.array, 0, this.array, this.size, longArrayList.size);
        this.size = i3;
        this.modCount++;
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public java.lang.Long remove(int index) {
        ensureIsMutable();
        ensureIndexInRange(index);
        long[] jArr = this.array;
        long j = jArr[index];
        int i = this.size;
        if (index < i - 1) {
            java.lang.System.arraycopy(jArr, index + 1, jArr, index, (i - index) - 1);
        }
        this.size--;
        this.modCount++;
        return java.lang.Long.valueOf(j);
    }

    private void ensureIndexInRange(int index) {
        if (index < 0 || index >= this.size) {
            throw new java.lang.IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(index));
        }
    }

    private java.lang.String makeOutOfBoundsExceptionMessage(int index) {
        return "Index:" + index + ", Size:" + this.size;
    }
}
