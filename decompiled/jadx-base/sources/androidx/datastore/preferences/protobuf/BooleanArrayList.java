package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
final class BooleanArrayList extends androidx.datastore.preferences.protobuf.AbstractProtobufList<java.lang.Boolean> implements androidx.datastore.preferences.protobuf.Internal.BooleanList, java.util.RandomAccess, androidx.datastore.preferences.protobuf.PrimitiveNonBoxingCollection {
    private static final androidx.datastore.preferences.protobuf.BooleanArrayList EMPTY_LIST = new androidx.datastore.preferences.protobuf.BooleanArrayList(new boolean[0], 0, false);
    private boolean[] array;
    private int size;

    public static androidx.datastore.preferences.protobuf.BooleanArrayList emptyList() {
        return EMPTY_LIST;
    }

    BooleanArrayList() {
        this(new boolean[10], 0, true);
    }

    private BooleanArrayList(boolean[] other, int size, boolean isMutable) {
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
        boolean[] zArr = this.array;
        java.lang.System.arraycopy(zArr, toIndex, zArr, fromIndex, this.size - toIndex);
        this.size -= toIndex - fromIndex;
        this.modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof androidx.datastore.preferences.protobuf.BooleanArrayList)) {
            return super.equals(o);
        }
        androidx.datastore.preferences.protobuf.BooleanArrayList booleanArrayList = (androidx.datastore.preferences.protobuf.BooleanArrayList) o;
        if (this.size != booleanArrayList.size) {
            return false;
        }
        boolean[] zArr = booleanArrayList.array;
        for (int i = 0; i < this.size; i++) {
            if (this.array[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iHashBoolean = 1;
        for (int i = 0; i < this.size; i++) {
            iHashBoolean = (iHashBoolean * 31) + androidx.datastore.preferences.protobuf.Internal.hashBoolean(this.array[i]);
        }
        return iHashBoolean;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public androidx.datastore.preferences.protobuf.Internal.ProtobufList<java.lang.Boolean> mutableCopyWithCapacity2(int capacity) {
        if (capacity < this.size) {
            throw new java.lang.IllegalArgumentException();
        }
        return new androidx.datastore.preferences.protobuf.BooleanArrayList(java.util.Arrays.copyOf(this.array, capacity), this.size, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Boolean get(int index) {
        return java.lang.Boolean.valueOf(getBoolean(index));
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.BooleanList
    public boolean getBoolean(int index) {
        ensureIndexInRange(index);
        return this.array[index];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(java.lang.Object element) {
        if (!(element instanceof java.lang.Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((java.lang.Boolean) element).booleanValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.array[i] == zBooleanValue) {
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
    public java.lang.Boolean set(int index, java.lang.Boolean element) {
        return java.lang.Boolean.valueOf(setBoolean(index, element.booleanValue()));
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.BooleanList
    public boolean setBoolean(int index, boolean element) {
        ensureIsMutable();
        ensureIndexInRange(index);
        boolean[] zArr = this.array;
        boolean z = zArr[index];
        zArr[index] = element;
        return z;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(java.lang.Boolean element) {
        addBoolean(element.booleanValue());
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int index, java.lang.Boolean element) {
        addBoolean(index, element.booleanValue());
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.BooleanList
    public void addBoolean(boolean element) {
        ensureIsMutable();
        int i = this.size;
        boolean[] zArr = this.array;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
            java.lang.System.arraycopy(zArr, 0, zArr2, 0, i);
            this.array = zArr2;
        }
        boolean[] zArr3 = this.array;
        int i2 = this.size;
        this.size = i2 + 1;
        zArr3[i2] = element;
    }

    private void addBoolean(int index, boolean element) {
        int i;
        ensureIsMutable();
        if (index < 0 || index > (i = this.size)) {
            throw new java.lang.IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(index));
        }
        boolean[] zArr = this.array;
        if (i < zArr.length) {
            java.lang.System.arraycopy(zArr, index, zArr, index + 1, i - index);
        } else {
            boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
            java.lang.System.arraycopy(zArr, 0, zArr2, 0, index);
            java.lang.System.arraycopy(this.array, index, zArr2, index + 1, this.size - index);
            this.array = zArr2;
        }
        this.array[index] = element;
        this.size++;
        this.modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection<? extends java.lang.Boolean> collection) {
        ensureIsMutable();
        androidx.datastore.preferences.protobuf.Internal.checkNotNull(collection);
        if (!(collection instanceof androidx.datastore.preferences.protobuf.BooleanArrayList)) {
            return super.addAll(collection);
        }
        androidx.datastore.preferences.protobuf.BooleanArrayList booleanArrayList = (androidx.datastore.preferences.protobuf.BooleanArrayList) collection;
        int i = booleanArrayList.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.array;
        if (i3 > zArr.length) {
            this.array = java.util.Arrays.copyOf(zArr, i3);
        }
        java.lang.System.arraycopy(booleanArrayList.array, 0, this.array, this.size, booleanArrayList.size);
        this.size = i3;
        this.modCount++;
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public java.lang.Boolean remove(int index) {
        ensureIsMutable();
        ensureIndexInRange(index);
        boolean[] zArr = this.array;
        boolean z = zArr[index];
        int i = this.size;
        if (index < i - 1) {
            java.lang.System.arraycopy(zArr, index + 1, zArr, index, (i - index) - 1);
        }
        this.size--;
        this.modCount++;
        return java.lang.Boolean.valueOf(z);
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
