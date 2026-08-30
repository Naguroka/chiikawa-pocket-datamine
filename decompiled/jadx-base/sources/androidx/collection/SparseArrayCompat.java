package androidx.collection;

/* JADX INFO: loaded from: classes.dex */
public class SparseArrayCompat<E> implements java.lang.Cloneable {
    private static final java.lang.Object DELETED = new java.lang.Object();
    private boolean mGarbage;
    private int[] mKeys;
    private int mSize;
    private java.lang.Object[] mValues;

    public SparseArrayCompat() {
        this(10);
    }

    public SparseArrayCompat(int i) {
        this.mGarbage = false;
        if (i == 0) {
            this.mKeys = androidx.collection.ContainerHelpers.EMPTY_INTS;
            this.mValues = androidx.collection.ContainerHelpers.EMPTY_OBJECTS;
        } else {
            int iIdealIntArraySize = androidx.collection.ContainerHelpers.idealIntArraySize(i);
            this.mKeys = new int[iIdealIntArraySize];
            this.mValues = new java.lang.Object[iIdealIntArraySize];
        }
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public androidx.collection.SparseArrayCompat<E> m12clone() {
        try {
            androidx.collection.SparseArrayCompat<E> sparseArrayCompat = (androidx.collection.SparseArrayCompat) super.clone();
            sparseArrayCompat.mKeys = (int[]) this.mKeys.clone();
            sparseArrayCompat.mValues = (java.lang.Object[]) this.mValues.clone();
            return sparseArrayCompat;
        } catch (java.lang.CloneNotSupportedException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    public E get(int i) {
        return get(i, null);
    }

    public E get(int i, E e) {
        E e2;
        int iBinarySearch = androidx.collection.ContainerHelpers.binarySearch(this.mKeys, this.mSize, i);
        return (iBinarySearch < 0 || (e2 = (E) this.mValues[iBinarySearch]) == DELETED) ? e : e2;
    }

    @java.lang.Deprecated
    public void delete(int i) {
        remove(i);
    }

    public void remove(int i) {
        int iBinarySearch = androidx.collection.ContainerHelpers.binarySearch(this.mKeys, this.mSize, i);
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

    public boolean remove(int i, java.lang.Object obj) {
        int iIndexOfKey = indexOfKey(i);
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

    public void removeAtRange(int i, int i2) {
        int iMin = java.lang.Math.min(this.mSize, i2 + i);
        while (i < iMin) {
            removeAt(i);
            i++;
        }
    }

    public E replace(int i, E e) {
        int iIndexOfKey = indexOfKey(i);
        if (iIndexOfKey < 0) {
            return null;
        }
        java.lang.Object[] objArr = this.mValues;
        E e2 = (E) objArr[iIndexOfKey];
        objArr[iIndexOfKey] = e;
        return e2;
    }

    public boolean replace(int i, E e, E e2) {
        int iIndexOfKey = indexOfKey(i);
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
        int[] iArr = this.mKeys;
        java.lang.Object[] objArr = this.mValues;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            java.lang.Object obj = objArr[i3];
            if (obj != DELETED) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.mGarbage = false;
        this.mSize = i2;
    }

    public void put(int i, E e) {
        int iBinarySearch = androidx.collection.ContainerHelpers.binarySearch(this.mKeys, this.mSize, i);
        if (iBinarySearch >= 0) {
            this.mValues[iBinarySearch] = e;
            return;
        }
        int i2 = ~iBinarySearch;
        int i3 = this.mSize;
        if (i2 < i3) {
            java.lang.Object[] objArr = this.mValues;
            if (objArr[i2] == DELETED) {
                this.mKeys[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.mGarbage && i3 >= this.mKeys.length) {
            gc();
            i2 = ~androidx.collection.ContainerHelpers.binarySearch(this.mKeys, this.mSize, i);
        }
        int i4 = this.mSize;
        if (i4 >= this.mKeys.length) {
            int iIdealIntArraySize = androidx.collection.ContainerHelpers.idealIntArraySize(i4 + 1);
            int[] iArr = new int[iIdealIntArraySize];
            java.lang.Object[] objArr2 = new java.lang.Object[iIdealIntArraySize];
            int[] iArr2 = this.mKeys;
            java.lang.System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            java.lang.Object[] objArr3 = this.mValues;
            java.lang.System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.mKeys = iArr;
            this.mValues = objArr2;
        }
        int i5 = this.mSize;
        if (i5 - i2 != 0) {
            int[] iArr3 = this.mKeys;
            int i6 = i2 + 1;
            java.lang.System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            java.lang.Object[] objArr4 = this.mValues;
            java.lang.System.arraycopy(objArr4, i2, objArr4, i6, this.mSize - i2);
        }
        this.mKeys[i2] = i;
        this.mValues[i2] = e;
        this.mSize++;
    }

    public void putAll(androidx.collection.SparseArrayCompat<? extends E> sparseArrayCompat) {
        int size = sparseArrayCompat.size();
        for (int i = 0; i < size; i++) {
            put(sparseArrayCompat.keyAt(i), sparseArrayCompat.valueAt(i));
        }
    }

    public E putIfAbsent(int i, E e) {
        E e2 = get(i);
        if (e2 == null) {
            put(i, e);
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

    public int keyAt(int i) {
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

    public int indexOfKey(int i) {
        if (this.mGarbage) {
            gc();
        }
        return androidx.collection.ContainerHelpers.binarySearch(this.mKeys, this.mSize, i);
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

    public boolean containsKey(int i) {
        return indexOfKey(i) >= 0;
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

    public void append(int i, E e) {
        int i2 = this.mSize;
        if (i2 != 0 && i <= this.mKeys[i2 - 1]) {
            put(i, e);
            return;
        }
        if (this.mGarbage && i2 >= this.mKeys.length) {
            gc();
        }
        int i3 = this.mSize;
        if (i3 >= this.mKeys.length) {
            int iIdealIntArraySize = androidx.collection.ContainerHelpers.idealIntArraySize(i3 + 1);
            int[] iArr = new int[iIdealIntArraySize];
            java.lang.Object[] objArr = new java.lang.Object[iIdealIntArraySize];
            int[] iArr2 = this.mKeys;
            java.lang.System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            java.lang.Object[] objArr2 = this.mValues;
            java.lang.System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.mKeys = iArr;
            this.mValues = objArr;
        }
        this.mKeys[i3] = i;
        this.mValues[i3] = e;
        this.mSize = i3 + 1;
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
