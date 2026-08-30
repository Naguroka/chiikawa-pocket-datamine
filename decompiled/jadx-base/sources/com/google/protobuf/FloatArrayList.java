package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
final class FloatArrayList extends com.google.protobuf.AbstractProtobufList<java.lang.Float> implements com.google.protobuf.Internal.FloatList, java.util.RandomAccess, com.google.protobuf.PrimitiveNonBoxingCollection {
    private static final com.google.protobuf.FloatArrayList EMPTY_LIST;
    private float[] array;
    private int size;

    static {
        com.google.protobuf.FloatArrayList floatArrayList = new com.google.protobuf.FloatArrayList(new float[0], 0);
        EMPTY_LIST = floatArrayList;
        floatArrayList.makeImmutable();
    }

    public static com.google.protobuf.FloatArrayList emptyList() {
        return EMPTY_LIST;
    }

    FloatArrayList() {
        this(new float[10], 0);
    }

    private FloatArrayList(float[] fArr, int i) {
        this.array = fArr;
        this.size = i;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i, int i2) {
        ensureIsMutable();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.array;
        java.lang.System.arraycopy(fArr, i2, fArr, i, this.size - i2);
        this.size -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.protobuf.FloatArrayList)) {
            return super.equals(obj);
        }
        com.google.protobuf.FloatArrayList floatArrayList = (com.google.protobuf.FloatArrayList) obj;
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

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.size; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + java.lang.Float.floatToIntBits(this.array[i]);
        }
        return iFloatToIntBits;
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public com.google.protobuf.Internal.ProtobufList<java.lang.Float> mutableCopyWithCapacity2(int i) {
        if (i < this.size) {
            throw new java.lang.IllegalArgumentException();
        }
        return new com.google.protobuf.FloatArrayList(java.util.Arrays.copyOf(this.array, i), this.size);
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Float get(int i) {
        return java.lang.Float.valueOf(getFloat(i));
    }

    @Override // com.google.protobuf.Internal.FloatList
    public float getFloat(int i) {
        ensureIndexInRange(i);
        return this.array[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Float)) {
            return -1;
        }
        float fFloatValue = ((java.lang.Float) obj).floatValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.array[i] == fFloatValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public java.lang.Float set(int i, java.lang.Float f) {
        return java.lang.Float.valueOf(setFloat(i, f.floatValue()));
    }

    @Override // com.google.protobuf.Internal.FloatList
    public float setFloat(int i, float f) {
        ensureIsMutable();
        ensureIndexInRange(i);
        float[] fArr = this.array;
        float f2 = fArr[i];
        fArr[i] = f;
        return f2;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(java.lang.Float f) {
        addFloat(f.floatValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int i, java.lang.Float f) {
        addFloat(i, f.floatValue());
    }

    @Override // com.google.protobuf.Internal.FloatList
    public void addFloat(float f) {
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
        fArr3[i2] = f;
    }

    private void addFloat(int i, float f) {
        int i2;
        ensureIsMutable();
        if (i < 0 || i > (i2 = this.size)) {
            throw new java.lang.IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i));
        }
        float[] fArr = this.array;
        if (i2 < fArr.length) {
            java.lang.System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[((i2 * 3) / 2) + 1];
            java.lang.System.arraycopy(fArr, 0, fArr2, 0, i);
            java.lang.System.arraycopy(this.array, i, fArr2, i + 1, this.size - i);
            this.array = fArr2;
        }
        this.array[i] = f;
        this.size++;
        this.modCount++;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection<? extends java.lang.Float> collection) {
        ensureIsMutable();
        com.google.protobuf.Internal.checkNotNull(collection);
        if (!(collection instanceof com.google.protobuf.FloatArrayList)) {
            return super.addAll(collection);
        }
        com.google.protobuf.FloatArrayList floatArrayList = (com.google.protobuf.FloatArrayList) collection;
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

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public java.lang.Float remove(int i) {
        ensureIsMutable();
        ensureIndexInRange(i);
        float[] fArr = this.array;
        float f = fArr[i];
        int i2 = this.size;
        if (i < i2 - 1) {
            java.lang.System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.size--;
        this.modCount++;
        return java.lang.Float.valueOf(f);
    }

    private void ensureIndexInRange(int i) {
        if (i < 0 || i >= this.size) {
            throw new java.lang.IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i));
        }
    }

    private java.lang.String makeOutOfBoundsExceptionMessage(int i) {
        return "Index:" + i + ", Size:" + this.size;
    }
}
