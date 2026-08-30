package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
final class FloatArrayList extends androidx.datastore.preferences.protobuf.AbstractProtobufList<java.lang.Float> implements androidx.datastore.preferences.protobuf.Internal.FloatList, java.util.RandomAccess, androidx.datastore.preferences.protobuf.PrimitiveNonBoxingCollection {
    private static final androidx.datastore.preferences.protobuf.FloatArrayList EMPTY_LIST = new androidx.datastore.preferences.protobuf.FloatArrayList(new float[0], 0, false);
    private float[] array;
    private int size;

    public static androidx.datastore.preferences.protobuf.FloatArrayList emptyList() {
        return EMPTY_LIST;
    }

    FloatArrayList() {
        this(new float[10], 0, true);
    }

    private FloatArrayList(float[] other, int size, boolean isMutable) {
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
        float[] fArr = this.array;
        java.lang.System.arraycopy(fArr, toIndex, fArr, fromIndex, this.size - toIndex);
        this.size -= toIndex - fromIndex;
        this.modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof androidx.datastore.preferences.protobuf.FloatArrayList)) {
            return super.equals(o);
        }
        androidx.datastore.preferences.protobuf.FloatArrayList floatArrayList = (androidx.datastore.preferences.protobuf.FloatArrayList) o;
        if (this.size != floatArrayList.size) {
            return false;
        }
        float[] fArr = floatArrayList.array;
        for (int i = 0; i < this.size; i++) {
            if (java.lang.Float.floatToIntBits(this.array[i]) != java.lang.Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.size; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + java.lang.Float.floatToIntBits(this.array[i]);
        }
        return iFloatToIntBits;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public androidx.datastore.preferences.protobuf.Internal.ProtobufList<java.lang.Float> mutableCopyWithCapacity2(int capacity) {
        if (capacity < this.size) {
            throw new java.lang.IllegalArgumentException();
        }
        return new androidx.datastore.preferences.protobuf.FloatArrayList(java.util.Arrays.copyOf(this.array, capacity), this.size, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Float get(int index) {
        return java.lang.Float.valueOf(getFloat(index));
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.FloatList
    public float getFloat(int index) {
        ensureIndexInRange(index);
        return this.array[index];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(java.lang.Object element) {
        if (!(element instanceof java.lang.Float)) {
            return -1;
        }
        float fFloatValue = ((java.lang.Float) element).floatValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.array[i] == fFloatValue) {
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
    public java.lang.Float set(int index, java.lang.Float element) {
        return java.lang.Float.valueOf(setFloat(index, element.floatValue()));
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.FloatList
    public float setFloat(int index, float element) {
        ensureIsMutable();
        ensureIndexInRange(index);
        float[] fArr = this.array;
        float f = fArr[index];
        fArr[index] = element;
        return f;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(java.lang.Float element) {
        addFloat(element.floatValue());
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int index, java.lang.Float element) {
        addFloat(index, element.floatValue());
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.FloatList
    public void addFloat(float element) {
        ensureIsMutable();
        int i = this.size;
        float[] fArr = this.array;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            java.lang.System.arraycopy(fArr, 0, fArr2, 0, i);
            this.array = fArr2;
        }
        float[] fArr3 = this.array;
        int i2 = this.size;
        this.size = i2 + 1;
        fArr3[i2] = element;
    }

    private void addFloat(int index, float element) {
        int i;
        ensureIsMutable();
        if (index < 0 || index > (i = this.size)) {
            throw new java.lang.IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(index));
        }
        float[] fArr = this.array;
        if (i < fArr.length) {
            java.lang.System.arraycopy(fArr, index, fArr, index + 1, i - index);
        } else {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            java.lang.System.arraycopy(fArr, 0, fArr2, 0, index);
            java.lang.System.arraycopy(this.array, index, fArr2, index + 1, this.size - index);
            this.array = fArr2;
        }
        this.array[index] = element;
        this.size++;
        this.modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection<? extends java.lang.Float> collection) {
        ensureIsMutable();
        androidx.datastore.preferences.protobuf.Internal.checkNotNull(collection);
        if (!(collection instanceof androidx.datastore.preferences.protobuf.FloatArrayList)) {
            return super.addAll(collection);
        }
        androidx.datastore.preferences.protobuf.FloatArrayList floatArrayList = (androidx.datastore.preferences.protobuf.FloatArrayList) collection;
        int i = floatArrayList.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.array;
        if (i3 > fArr.length) {
            this.array = java.util.Arrays.copyOf(fArr, i3);
        }
        java.lang.System.arraycopy(floatArrayList.array, 0, this.array, this.size, floatArrayList.size);
        this.size = i3;
        this.modCount++;
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public java.lang.Float remove(int index) {
        ensureIsMutable();
        ensureIndexInRange(index);
        float[] fArr = this.array;
        float f = fArr[index];
        int i = this.size;
        if (index < i - 1) {
            java.lang.System.arraycopy(fArr, index + 1, fArr, index, (i - index) - 1);
        }
        this.size--;
        this.modCount++;
        return java.lang.Float.valueOf(f);
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
