package androidx.collection;

/* JADX INFO: loaded from: classes.dex */
public class LongSparseArray<E> implements java.lang.Cloneable {
    private static final java.lang.Object DELETED = new java.lang.Object();
    private boolean mGarbage;
    private long[] mKeys;
    private int mSize;
    private java.lang.Object[] mValues;

    public LongSparseArray() {
        this(10);
    }

    public LongSparseArray(int i) {
        this.mGarbage = false;
        if (i == 0) {
            this.mKeys = androidx.collection.ContainerHelpers.EMPTY_LONGS;
            this.mValues = androidx.collection.ContainerHelpers.EMPTY_OBJECTS;
        } else {
            int iIdealLongArraySize = androidx.collection.ContainerHelpers.idealLongArraySize(i);
            this.mKeys = new long[iIdealLongArraySize];
            this.mValues = new java.lang.Object[iIdealLongArraySize];
        }
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public androidx.collection.LongSparseArray<E> m11clone() {
        try {
            androidx.collection.LongSparseArray<E> longSparseArray = (androidx.collection.LongSparseArray) super.clone();
            longSparseArray.mKeys = (long[]) this.mKeys.clone();
            longSparseArray.mValues = (java.lang.Object[]) this.mValues.clone();
            return longSparseArray;
        } catch (java.lang.CloneNotSupportedException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    public E get(long j) {
        return get(j, null);
    }

    public E get(long j, E e) {
        E e2;
        int iBinarySearch = androidx.collection.ContainerHelpers.binarySearch(this.mKeys, this.mSize, j);
        return (iBinarySearch < 0 || (e2 = (E) this.mValues[iBinarySearch]) == DELETED) ? e : e2;
    }

    @java.lang.Deprecated
    public void delete(long j) {
        remove(j);
    }

    public void remove(long j) {
        int iBinarySearch = androidx.collection.ContainerHelpers.binarySearch(this.mKeys, this.mSize, j);
        if (iBinarySearch >= 0) {
            java.lang.Object[] objArr = this.mValues;
            java.lang.Object obj = objArr[iBinarySearch];
            java.lang.Object obj2 = DELETED;
            if (obj != obj2) {
                objArr[iBinarySearch] = obj2;
                this.mGarbage = true;
            }
        }
    }

    public boolean remove(long j, java.lang.Object obj) {
        int iIndexOfKey = indexOfKey(j);
        if (iIndexOfKey < 0) {
            return false;
        }
        E eValueAt = valueAt(iIndexOfKey);
        if (obj != eValueAt && (obj == null || !obj.equals(eValueAt))) {
            return false;
        }
        removeAt(iIndexOfKey);
        return true;
    }

    public void removeAt(int i) {
        java.lang.Object[] objArr = this.mValues;
        java.lang.Object obj = objArr[i];
        java.lang.Object obj2 = DELETED;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.mGarbage = true;
        }
    }

    public E replace(long j, E e) {
        int iIndexOfKey = indexOfKey(j);
        if (iIndexOfKey < 0) {
            return null;
        }
        java.lang.Object[] objArr = this.mValues;
        E e2 = (E) objArr[iIndexOfKey];
        objArr[iIndexOfKey] = e;
        return e2;
    }

    public boolean replace(long j, E e, E e2) {
        int iIndexOfKey = indexOfKey(j);
        if (iIndexOfKey < 0) {
            return false;
        }
        java.lang.Object obj = this.mValues[iIndexOfKey];
        if (obj != e && (e == null || !e.equals(obj))) {
            return false;
        }
        this.mValues[iIndexOfKey] = e2;
        return true;
    }

    private void gc() {
        int i = this.mSize;
        long[] jArr = this.mKeys;
        java.lang.Object[] objArr = this.mValues;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            java.lang.Object obj = objArr[i3];
            if (obj != DELETED) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.mGarbage = false;
        this.mSize = i2;
    }

    public void put(long j, E e) {
        int iBinarySearch = androidx.collection.ContainerHelpers.binarySearch(this.mKeys, this.mSize, j);
        if (iBinarySearch >= 0) {
            this.mValues[iBinarySearch] = e;
            return;
        }
        int i = ~iBinarySearch;
        int i2 = this.mSize;
        if (i < i2) {
            java.lang.Object[] objArr = this.mValues;
            if (objArr[i] == DELETED) {
                this.mKeys[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.mGarbage && i2 >= this.mKeys.length) {
            gc();
            i = ~androidx.collection.ContainerHelpers.binarySearch(this.mKeys, this.mSize, j);
        }
        int i3 = this.mSize;
        if (i3 >= this.mKeys.length) {
            int iIdealLongArraySize = androidx.collection.ContainerHelpers.idealLongArraySize(i3 + 1);
            long[] jArr = new long[iIdealLongArraySize];
            java.lang.Object[] objArr2 = new java.lang.Object[iIdealLongArraySize];
            long[] jArr2 = this.mKeys;
            java.lang.System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            java.lang.Object[] objArr3 = this.mValues;
            java.lang.System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.mKeys = jArr;
            this.mValues = objArr2;
        }
        int i4 = this.mSize;
        if (i4 - i != 0) {
            long[] jArr3 = this.mKeys;
            int i5 = i + 1;
            java.lang.System.arraycopy(jArr3, i, jArr3, i5, i4 - i);
            java.lang.Object[] objArr4 = this.mValues;
            java.lang.System.arraycopy(objArr4, i, objArr4, i5, this.mSize - i);
        }
        this.mKeys[i] = j;
        this.mValues[i] = e;
        this.mSize++;
    }

    public void putAll(androidx.collection.LongSparseArray<? extends E> longSparseArray) {
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            put(longSparseArray.keyAt(i), longSparseArray.valueAt(i));
        }
    }

    public E putIfAbsent(long j, E e) {
        E e2 = get(j);
        if (e2 == null) {
            put(j, e);
        }
        return e2;
    }

    public int size() {
        if (this.mGarbage) {
            gc();
        }
        return this.mSize;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public long keyAt(int i) {
        if (this.mGarbage) {
            gc();
        }
        return this.mKeys[i];
    }

    public E valueAt(int i) {
        if (this.mGarbage) {
            gc();
        }
        return (E) this.mValues[i];
    }

    public void setValueAt(int i, E e) {
        if (this.mGarbage) {
            gc();
        }
        this.mValues[i] = e;
    }

    public int indexOfKey(long j) {
        if (this.mGarbage) {
            gc();
        }
        return androidx.collection.ContainerHelpers.binarySearch(this.mKeys, this.mSize, j);
    }

    public int indexOfValue(E e) {
        if (this.mGarbage) {
            gc();
        }
        for (int i = 0; i < this.mSize; i++) {
            if (this.mValues[i] == e) {
                return i;
            }
        }
        return -1;
    }

    public boolean containsKey(long j) {
        return indexOfKey(j) >= 0;
    }

    public boolean containsValue(E e) {
        return indexOfValue(e) >= 0;
    }

    public void clear() {
        int i = this.mSize;
        java.lang.Object[] objArr = this.mValues;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.mSize = 0;
        this.mGarbage = false;
    }

    public void append(long j, E e) {
        int i = this.mSize;
        if (i != 0 && j <= this.mKeys[i - 1]) {
            put(j, e);
            return;
        }
        if (this.mGarbage && i >= this.mKeys.length) {
            gc();
        }
        int i2 = this.mSize;
        if (i2 >= this.mKeys.length) {
            int iIdealLongArraySize = androidx.collection.ContainerHelpers.idealLongArraySize(i2 + 1);
            long[] jArr = new long[iIdealLongArraySize];
            java.lang.Object[] objArr = new java.lang.Object[iIdealLongArraySize];
            long[] jArr2 = this.mKeys;
            java.lang.System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            java.lang.Object[] objArr2 = this.mValues;
            java.lang.System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.mKeys = jArr;
            this.mValues = objArr;
        }
        this.mKeys[i2] = j;
        this.mValues[i2] = e;
        this.mSize = i2 + 1;
    }

    public java.lang.String toString() {
        if (size() <= 0) {
            return com.applovin.impl.sdk.utils.JsonUtils.EMPTY_JSON;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(this.mSize * 28);
        sb.append('{');
        for (int i = 0; i < this.mSize; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(keyAt(i));
            sb.append('=');
            E eValueAt = valueAt(i);
            if (eValueAt != this) {
                sb.append(eValueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
