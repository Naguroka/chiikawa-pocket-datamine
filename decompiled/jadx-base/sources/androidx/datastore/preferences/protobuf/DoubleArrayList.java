package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
final class DoubleArrayList extends androidx.datastore.preferences.protobuf.AbstractProtobufList<java.lang.Double> implements androidx.datastore.preferences.protobuf.Internal.DoubleList, java.util.RandomAccess, androidx.datastore.preferences.protobuf.PrimitiveNonBoxingCollection {
    private static final androidx.datastore.preferences.protobuf.DoubleArrayList EMPTY_LIST = new androidx.datastore.preferences.protobuf.DoubleArrayList(new double[0], 0, false);
    private double[] array;
    private int size;

    public static androidx.datastore.preferences.protobuf.DoubleArrayList emptyList() {
        return EMPTY_LIST;
    }

    DoubleArrayList() {
        this(new double[10], 0, true);
    }

    private DoubleArrayList(double[] other, int size, boolean isMutable) {
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
        double[] dArr = this.array;
        java.lang.System.arraycopy(dArr, toIndex, dArr, fromIndex, this.size - toIndex);
        this.size -= toIndex - fromIndex;
        this.modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof androidx.datastore.preferences.protobuf.DoubleArrayList)) {
            return super.equals(o);
        }
        androidx.datastore.preferences.protobuf.DoubleArrayList doubleArrayList = (androidx.datastore.preferences.protobuf.DoubleArrayList) o;
        if (this.size != doubleArrayList.size) {
            return false;
        }
        double[] dArr = doubleArrayList.array;
        for (int i = 0; i < this.size; i++) {
            if (java.lang.Double.doubleToLongBits(this.array[i]) != java.lang.Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iHashLong = 1;
        for (int i = 0; i < this.size; i++) {
            iHashLong = (iHashLong * 31) + androidx.datastore.preferences.protobuf.Internal.hashLong(java.lang.Double.doubleToLongBits(this.array[i]));
        }
        return iHashLong;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public androidx.datastore.preferences.protobuf.Internal.ProtobufList<java.lang.Double> mutableCopyWithCapacity2(int capacity) {
        if (capacity < this.size) {
            throw new java.lang.IllegalArgumentException();
        }
        return new androidx.datastore.preferences.protobuf.DoubleArrayList(java.util.Arrays.copyOf(this.array, capacity), this.size, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Double get(int index) {
        return java.lang.Double.valueOf(getDouble(index));
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.DoubleList
    public double getDouble(int index) {
        ensureIndexInRange(index);
        return this.array[index];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(java.lang.Object element) {
        if (!(element instanceof java.lang.Double)) {
            return -1;
        }
        double dDoubleValue = ((java.lang.Double) element).doubleValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.array[i] == dDoubleValue) {
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
    public java.lang.Double set(int index, java.lang.Double element) {
        return java.lang.Double.valueOf(setDouble(index, element.doubleValue()));
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.DoubleList
    public double setDouble(int index, double element) {
        ensureIsMutable();
        ensureIndexInRange(index);
        double[] dArr = this.array;
        double d = dArr[index];
        dArr[index] = element;
        return d;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(java.lang.Double element) {
        addDouble(element.doubleValue());
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int index, java.lang.Double element) {
        addDouble(index, element.doubleValue());
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.DoubleList
    public void addDouble(double element) {
        ensureIsMutable();
        int i = this.size;
        double[] dArr = this.array;
        if (i == dArr.length) {
            double[] dArr2 = new double[((i * 3) / 2) + 1];
            java.lang.System.arraycopy(dArr, 0, dArr2, 0, i);
            this.array = dArr2;
        }
        double[] dArr3 = this.array;
        int i2 = this.size;
        this.size = i2 + 1;
        dArr3[i2] = element;
    }

    private void addDouble(int index, double element) {
        int i;
        ensureIsMutable();
        if (index < 0 || index > (i = this.size)) {
            throw new java.lang.IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(index));
        }
        double[] dArr = this.array;
        if (i < dArr.length) {
            java.lang.System.arraycopy(dArr, index, dArr, index + 1, i - index);
        } else {
            double[] dArr2 = new double[((i * 3) / 2) + 1];
            java.lang.System.arraycopy(dArr, 0, dArr2, 0, index);
            java.lang.System.arraycopy(this.array, index, dArr2, index + 1, this.size - index);
            this.array = dArr2;
        }
        this.array[index] = element;
        this.size++;
        this.modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection<? extends java.lang.Double> collection) {
        ensureIsMutable();
        androidx.datastore.preferences.protobuf.Internal.checkNotNull(collection);
        if (!(collection instanceof androidx.datastore.preferences.protobuf.DoubleArrayList)) {
            return super.addAll(collection);
        }
        androidx.datastore.preferences.protobuf.DoubleArrayList doubleArrayList = (androidx.datastore.preferences.protobuf.DoubleArrayList) collection;
        int i = doubleArrayList.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.array;
        if (i3 > dArr.length) {
            this.array = java.util.Arrays.copyOf(dArr, i3);
        }
        java.lang.System.arraycopy(doubleArrayList.array, 0, this.array, this.size, doubleArrayList.size);
        this.size = i3;
        this.modCount++;
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public java.lang.Double remove(int index) {
        ensureIsMutable();
        ensureIndexInRange(index);
        double[] dArr = this.array;
        double d = dArr[index];
        int i = this.size;
        if (index < i - 1) {
            java.lang.System.arraycopy(dArr, index + 1, dArr, index, (i - index) - 1);
        }
        this.size--;
        this.modCount++;
        return java.lang.Double.valueOf(d);
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
