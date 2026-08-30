package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
final class IntArrayList extends androidx.datastore.preferences.protobuf.AbstractProtobufList<java.lang.Integer> implements androidx.datastore.preferences.protobuf.Internal.IntList, java.util.RandomAccess, androidx.datastore.preferences.protobuf.PrimitiveNonBoxingCollection {
    private static final androidx.datastore.preferences.protobuf.IntArrayList EMPTY_LIST = new androidx.datastore.preferences.protobuf.IntArrayList(new int[0], 0, false);
    private int[] array;
    private int size;

    public static androidx.datastore.preferences.protobuf.IntArrayList emptyList() {
        return EMPTY_LIST;
    }

    IntArrayList() {
        this(new int[10], 0, true);
    }

    private IntArrayList(int[] other, int size, boolean isMutable) {
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
        int[] iArr = this.array;
        java.lang.System.arraycopy(iArr, toIndex, iArr, fromIndex, this.size - toIndex);
        this.size -= toIndex - fromIndex;
        this.modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof androidx.datastore.preferences.protobuf.IntArrayList)) {
            return super.equals(o);
        }
        androidx.datastore.preferences.protobuf.IntArrayList intArrayList = (androidx.datastore.preferences.protobuf.IntArrayList) o;
        if (this.size != intArrayList.size) {
            return false;
        }
        int[] iArr = intArrayList.array;
        for (int i = 0; i < this.size; i++) {
            if (this.array[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + this.array[i2];
        }
        return i;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public androidx.datastore.preferences.protobuf.Internal.ProtobufList<java.lang.Integer> mutableCopyWithCapacity2(int capacity) {
        if (capacity < this.size) {
            throw new java.lang.IllegalArgumentException();
        }
        return new androidx.datastore.preferences.protobuf.IntArrayList(java.util.Arrays.copyOf(this.array, capacity), this.size, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Integer get(int index) {
        return java.lang.Integer.valueOf(getInt(index));
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.IntList
    public int getInt(int index) {
        ensureIndexInRange(index);
        return this.array[index];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(java.lang.Object element) {
        if (!(element instanceof java.lang.Integer)) {
            return -1;
        }
        int iIntValue = ((java.lang.Integer) element).intValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.array[i] == iIntValue) {
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
    public java.lang.Integer set(int index, java.lang.Integer element) {
        return java.lang.Integer.valueOf(setInt(index, element.intValue()));
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.IntList
    public int setInt(int index, int element) {
        ensureIsMutable();
        ensureIndexInRange(index);
        int[] iArr = this.array;
        int i = iArr[index];
        iArr[index] = element;
        return i;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(java.lang.Integer element) {
        addInt(element.intValue());
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int index, java.lang.Integer element) {
        addInt(index, element.intValue());
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.IntList
    public void addInt(int element) {
        ensureIsMutable();
        int i = this.size;
        int[] iArr = this.array;
        if (i == iArr.length) {
            int[] iArr2 = new int[((i * 3) / 2) + 1];
            java.lang.System.arraycopy(iArr, 0, iArr2, 0, i);
            this.array = iArr2;
        }
        int[] iArr3 = this.array;
        int i2 = this.size;
        this.size = i2 + 1;
        iArr3[i2] = element;
    }

    private void addInt(int index, int element) {
        int i;
        ensureIsMutable();
        if (index < 0 || index > (i = this.size)) {
            throw new java.lang.IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(index));
        }
        int[] iArr = this.array;
        if (i < iArr.length) {
            java.lang.System.arraycopy(iArr, index, iArr, index + 1, i - index);
        } else {
            int[] iArr2 = new int[((i * 3) / 2) + 1];
            java.lang.System.arraycopy(iArr, 0, iArr2, 0, index);
            java.lang.System.arraycopy(this.array, index, iArr2, index + 1, this.size - index);
            this.array = iArr2;
        }
        this.array[index] = element;
        this.size++;
        this.modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection<? extends java.lang.Integer> collection) {
        ensureIsMutable();
        androidx.datastore.preferences.protobuf.Internal.checkNotNull(collection);
        if (!(collection instanceof androidx.datastore.preferences.protobuf.IntArrayList)) {
            return super.addAll(collection);
        }
        androidx.datastore.preferences.protobuf.IntArrayList intArrayList = (androidx.datastore.preferences.protobuf.IntArrayList) collection;
        int i = intArrayList.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.array;
        if (i3 > iArr.length) {
            this.array = java.util.Arrays.copyOf(iArr, i3);
        }
        java.lang.System.arraycopy(intArrayList.array, 0, this.array, this.size, intArrayList.size);
        this.size = i3;
        this.modCount++;
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public java.lang.Integer remove(int index) {
        ensureIsMutable();
        ensureIndexInRange(index);
        int[] iArr = this.array;
        int i = iArr[index];
        int i2 = this.size;
        if (index < i2 - 1) {
            java.lang.System.arraycopy(iArr, index + 1, iArr, index, (i2 - index) - 1);
        }
        this.size--;
        this.modCount++;
        return java.lang.Integer.valueOf(i);
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
