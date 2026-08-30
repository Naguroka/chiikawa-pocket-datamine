package androidx.collection;

/* JADX INFO: loaded from: classes.dex */
public final class ArraySet<E> implements java.util.Collection<E>, java.util.Set<E> {
    private static final int BASE_SIZE = 4;
    private static final int CACHE_SIZE = 10;
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "ArraySet";
    private static java.lang.Object[] sBaseCache;
    private static int sBaseCacheSize;
    private static java.lang.Object[] sTwiceBaseCache;
    private static int sTwiceBaseCacheSize;
    java.lang.Object[] mArray;
    private int[] mHashes;
    int mSize;
    private static final java.lang.Object sBaseCacheLock = new java.lang.Object();
    private static final java.lang.Object sTwiceBaseCacheLock = new java.lang.Object();

    private int binarySearch(int i) {
        try {
            return androidx.collection.ContainerHelpers.binarySearch(this.mHashes, this.mSize, i);
        } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    private int indexOf(java.lang.Object obj, int i) {
        int i2 = this.mSize;
        if (i2 == 0) {
            return -1;
        }
        int iBinarySearch = binarySearch(i);
        if (iBinarySearch < 0 || obj.equals(this.mArray[iBinarySearch])) {
            return iBinarySearch;
        }
        int i3 = iBinarySearch + 1;
        while (i3 < i2 && this.mHashes[i3] == i) {
            if (obj.equals(this.mArray[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iBinarySearch - 1; i4 >= 0 && this.mHashes[i4] == i; i4--) {
            if (obj.equals(this.mArray[i4])) {
                return i4;
            }
        }
        return ~i3;
    }

    private int indexOfNull() {
        int i = this.mSize;
        if (i == 0) {
            return -1;
        }
        int iBinarySearch = binarySearch(0);
        if (iBinarySearch < 0 || this.mArray[iBinarySearch] == null) {
            return iBinarySearch;
        }
        int i2 = iBinarySearch + 1;
        while (i2 < i && this.mHashes[i2] == 0) {
            if (this.mArray[i2] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iBinarySearch - 1; i3 >= 0 && this.mHashes[i3] == 0; i3--) {
            if (this.mArray[i3] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    private void allocArrays(int i) {
        if (i == 8) {
            synchronized (sTwiceBaseCacheLock) {
                java.lang.Object[] objArr = sTwiceBaseCache;
                if (objArr != null) {
                    try {
                        this.mArray = objArr;
                        sTwiceBaseCache = (java.lang.Object[]) objArr[0];
                        int[] iArr = (int[]) objArr[1];
                        this.mHashes = iArr;
                        if (iArr != null) {
                            objArr[1] = null;
                            objArr[0] = null;
                            sTwiceBaseCacheSize--;
                            return;
                        }
                    } catch (java.lang.ClassCastException unused) {
                    }
                    java.lang.System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr[0] + " [1]=" + objArr[1]);
                    sTwiceBaseCache = null;
                    sTwiceBaseCacheSize = 0;
                }
            }
        } else if (i == 4) {
            synchronized (sBaseCacheLock) {
                java.lang.Object[] objArr2 = sBaseCache;
                if (objArr2 != null) {
                    try {
                        this.mArray = objArr2;
                        sBaseCache = (java.lang.Object[]) objArr2[0];
                        int[] iArr2 = (int[]) objArr2[1];
                        this.mHashes = iArr2;
                        if (iArr2 != null) {
                            objArr2[1] = null;
                            objArr2[0] = null;
                            sBaseCacheSize--;
                            return;
                        }
                    } catch (java.lang.ClassCastException unused2) {
                    }
                    java.lang.System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr2[0] + " [1]=" + objArr2[1]);
                    sBaseCache = null;
                    sBaseCacheSize = 0;
                }
            }
        }
        this.mHashes = new int[i];
        this.mArray = new java.lang.Object[i];
    }

    private static void freeArrays(int[] iArr, java.lang.Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (sTwiceBaseCacheLock) {
                if (sTwiceBaseCacheSize < 10) {
                    objArr[0] = sTwiceBaseCache;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    sTwiceBaseCache = objArr;
                    sTwiceBaseCacheSize++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (sBaseCacheLock) {
                if (sBaseCacheSize < 10) {
                    objArr[0] = sBaseCache;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    sBaseCache = objArr;
                    sBaseCacheSize++;
                }
            }
        }
    }

    public ArraySet() {
        this(0);
    }

    public ArraySet(int i) {
        if (i == 0) {
            this.mHashes = androidx.collection.ContainerHelpers.EMPTY_INTS;
            this.mArray = androidx.collection.ContainerHelpers.EMPTY_OBJECTS;
        } else {
            allocArrays(i);
        }
        this.mSize = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ArraySet(androidx.collection.ArraySet<E> arraySet) {
        this();
        if (arraySet != 0) {
            addAll((androidx.collection.ArraySet) arraySet);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ArraySet(java.util.Collection<E> collection) {
        this();
        if (collection != 0) {
            addAll(collection);
        }
    }

    public ArraySet(E[] eArr) {
        this();
        if (eArr != null) {
            for (E e : eArr) {
                add(e);
            }
        }
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i = this.mSize;
        if (i != 0) {
            int[] iArr = this.mHashes;
            java.lang.Object[] objArr = this.mArray;
            this.mHashes = androidx.collection.ContainerHelpers.EMPTY_INTS;
            this.mArray = androidx.collection.ContainerHelpers.EMPTY_OBJECTS;
            this.mSize = 0;
            freeArrays(iArr, objArr, i);
        }
        if (this.mSize != 0) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    public void ensureCapacity(int i) {
        int i2 = this.mSize;
        int[] iArr = this.mHashes;
        if (iArr.length < i) {
            java.lang.Object[] objArr = this.mArray;
            allocArrays(i);
            int i3 = this.mSize;
            if (i3 > 0) {
                java.lang.System.arraycopy(iArr, 0, this.mHashes, 0, i3);
                java.lang.System.arraycopy(objArr, 0, this.mArray, 0, this.mSize);
            }
            freeArrays(iArr, objArr, this.mSize);
        }
        if (this.mSize != i2) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object obj) {
        return indexOf(obj) >= 0;
    }

    public int indexOf(java.lang.Object obj) {
        return obj == null ? indexOfNull() : indexOf(obj, obj.hashCode());
    }

    public E valueAt(int i) {
        return (E) this.mArray[i];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.mSize <= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e) {
        int i;
        int iIndexOf;
        int i2 = this.mSize;
        if (e == null) {
            iIndexOf = indexOfNull();
            i = 0;
        } else {
            int iHashCode = e.hashCode();
            i = iHashCode;
            iIndexOf = indexOf(e, iHashCode);
        }
        if (iIndexOf >= 0) {
            return false;
        }
        int i3 = ~iIndexOf;
        int[] iArr = this.mHashes;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            java.lang.Object[] objArr = this.mArray;
            allocArrays(i4);
            if (i2 != this.mSize) {
                throw new java.util.ConcurrentModificationException();
            }
            int[] iArr2 = this.mHashes;
            if (iArr2.length > 0) {
                java.lang.System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                java.lang.System.arraycopy(objArr, 0, this.mArray, 0, objArr.length);
            }
            freeArrays(iArr, objArr, i2);
        }
        if (i3 < i2) {
            int[] iArr3 = this.mHashes;
            int i5 = i3 + 1;
            int i6 = i2 - i3;
            java.lang.System.arraycopy(iArr3, i3, iArr3, i5, i6);
            java.lang.Object[] objArr2 = this.mArray;
            java.lang.System.arraycopy(objArr2, i3, objArr2, i5, i6);
        }
        int i7 = this.mSize;
        if (i2 == i7) {
            int[] iArr4 = this.mHashes;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.mArray[i3] = e;
                this.mSize = i7 + 1;
                return true;
            }
        }
        throw new java.util.ConcurrentModificationException();
    }

    public void addAll(androidx.collection.ArraySet<? extends E> arraySet) {
        int i = arraySet.mSize;
        ensureCapacity(this.mSize + i);
        if (this.mSize != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                add(arraySet.valueAt(i2));
            }
        } else if (i > 0) {
            java.lang.System.arraycopy(arraySet.mHashes, 0, this.mHashes, 0, i);
            java.lang.System.arraycopy(arraySet.mArray, 0, this.mArray, 0, i);
            if (this.mSize != 0) {
                throw new java.util.ConcurrentModificationException();
            }
            this.mSize = i;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(java.lang.Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public E removeAt(int i) {
        int i2 = this.mSize;
        java.lang.Object[] objArr = this.mArray;
        E e = (E) objArr[i];
        if (i2 <= 1) {
            clear();
        } else {
            int i3 = i2 - 1;
            int[] iArr = this.mHashes;
            if (iArr.length > 8 && i2 < iArr.length / 3) {
                allocArrays(i2 > 8 ? i2 + (i2 >> 1) : 8);
                if (i > 0) {
                    java.lang.System.arraycopy(iArr, 0, this.mHashes, 0, i);
                    java.lang.System.arraycopy(objArr, 0, this.mArray, 0, i);
                }
                if (i < i3) {
                    int i4 = i + 1;
                    int i5 = i3 - i;
                    java.lang.System.arraycopy(iArr, i4, this.mHashes, i, i5);
                    java.lang.System.arraycopy(objArr, i4, this.mArray, i, i5);
                }
            } else {
                if (i < i3) {
                    int i6 = i + 1;
                    int i7 = i3 - i;
                    java.lang.System.arraycopy(iArr, i6, iArr, i, i7);
                    java.lang.Object[] objArr2 = this.mArray;
                    java.lang.System.arraycopy(objArr2, i6, objArr2, i, i7);
                }
                this.mArray[i3] = null;
            }
            if (i2 != this.mSize) {
                throw new java.util.ConcurrentModificationException();
            }
            this.mSize = i3;
        }
        return e;
    }

    public boolean removeAll(androidx.collection.ArraySet<? extends E> arraySet) {
        int i = arraySet.mSize;
        int i2 = this.mSize;
        for (int i3 = 0; i3 < i; i3++) {
            remove(arraySet.valueAt(i3));
        }
        return i2 != this.mSize;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.mSize;
    }

    @Override // java.util.Collection, java.util.Set
    public java.lang.Object[] toArray() {
        int i = this.mSize;
        java.lang.Object[] objArr = new java.lang.Object[i];
        java.lang.System.arraycopy(this.mArray, 0, objArr, 0, i);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.mSize) {
            tArr = (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance(tArr.getClass().getComponentType(), this.mSize));
        }
        java.lang.System.arraycopy(this.mArray, 0, tArr, 0, this.mSize);
        int length = tArr.length;
        int i = this.mSize;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof java.util.Set) {
            java.util.Set set = (java.util.Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i = 0; i < this.mSize; i++) {
                try {
                    if (!set.contains(valueAt(i))) {
                        return false;
                    }
                } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.mHashes;
        int i = this.mSize;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public java.lang.String toString() {
        if (isEmpty()) {
            return com.applovin.impl.sdk.utils.JsonUtils.EMPTY_JSON;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(this.mSize * 14);
        sb.append('{');
        for (int i = 0; i < this.mSize; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            E eValueAt = valueAt(i);
            if (eValueAt != this) {
                sb.append(eValueAt);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator<E> iterator() {
        return new androidx.collection.ArraySet.ElementIterator();
    }

    private class ElementIterator extends androidx.collection.IndexBasedArrayIterator<E> {
        ElementIterator() {
            super(androidx.collection.ArraySet.this.mSize);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        protected E elementAt(int i) {
            return (E) androidx.collection.ArraySet.this.valueAt(i);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        protected void removeAt(int i) {
            androidx.collection.ArraySet.this.removeAt(i);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(java.util.Collection<?> collection) {
        java.util.Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(java.util.Collection<? extends E> collection) {
        ensureCapacity(this.mSize + collection.size());
        java.util.Iterator<? extends E> it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(java.util.Collection<?> collection) {
        java.util.Iterator<?> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(java.util.Collection<?> collection) {
        boolean z = false;
        for (int i = this.mSize - 1; i >= 0; i--) {
            if (!collection.contains(this.mArray[i])) {
                removeAt(i);
                z = true;
            }
        }
        return z;
    }
}
