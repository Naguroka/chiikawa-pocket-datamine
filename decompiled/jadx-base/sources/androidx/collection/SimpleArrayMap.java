package androidx.collection;

/* JADX INFO: loaded from: classes.dex */
public class SimpleArrayMap<K, V> {
    private static final int BASE_SIZE = 4;
    private static final int CACHE_SIZE = 10;
    private static final boolean CONCURRENT_MODIFICATION_EXCEPTIONS = true;
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "ArrayMap";
    static java.lang.Object[] mBaseCache;
    static int mBaseCacheSize;
    static java.lang.Object[] mTwiceBaseCache;
    static int mTwiceBaseCacheSize;
    java.lang.Object[] mArray;
    int[] mHashes;
    int mSize;

    private static int binarySearchHashes(int[] iArr, int i, int i2) {
        try {
            return androidx.collection.ContainerHelpers.binarySearch(iArr, i, i2);
        } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    int indexOf(java.lang.Object obj, int i) {
        int i2 = this.mSize;
        if (i2 == 0) {
            return -1;
        }
        int iBinarySearchHashes = binarySearchHashes(this.mHashes, i2, i);
        if (iBinarySearchHashes < 0 || obj.equals(this.mArray[iBinarySearchHashes << 1])) {
            return iBinarySearchHashes;
        }
        int i3 = iBinarySearchHashes + 1;
        while (i3 < i2 && this.mHashes[i3] == i) {
            if (obj.equals(this.mArray[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iBinarySearchHashes - 1; i4 >= 0 && this.mHashes[i4] == i; i4--) {
            if (obj.equals(this.mArray[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    int indexOfNull() {
        int i = this.mSize;
        if (i == 0) {
            return -1;
        }
        int iBinarySearchHashes = binarySearchHashes(this.mHashes, i, 0);
        if (iBinarySearchHashes < 0 || this.mArray[iBinarySearchHashes << 1] == null) {
            return iBinarySearchHashes;
        }
        int i2 = iBinarySearchHashes + 1;
        while (i2 < i && this.mHashes[i2] == 0) {
            if (this.mArray[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iBinarySearchHashes - 1; i3 >= 0 && this.mHashes[i3] == 0; i3--) {
            if (this.mArray[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    private void allocArrays(int i) {
        if (i == 8) {
            synchronized (androidx.collection.SimpleArrayMap.class) {
                java.lang.Object[] objArr = mTwiceBaseCache;
                if (objArr != null) {
                    this.mArray = objArr;
                    mTwiceBaseCache = (java.lang.Object[]) objArr[0];
                    this.mHashes = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    mTwiceBaseCacheSize--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (androidx.collection.SimpleArrayMap.class) {
                java.lang.Object[] objArr2 = mBaseCache;
                if (objArr2 != null) {
                    this.mArray = objArr2;
                    mBaseCache = (java.lang.Object[]) objArr2[0];
                    this.mHashes = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    mBaseCacheSize--;
                    return;
                }
            }
        }
        this.mHashes = new int[i];
        this.mArray = new java.lang.Object[i << 1];
    }

    private static void freeArrays(int[] iArr, java.lang.Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (androidx.collection.SimpleArrayMap.class) {
                if (mTwiceBaseCacheSize < 10) {
                    objArr[0] = mTwiceBaseCache;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    mTwiceBaseCache = objArr;
                    mTwiceBaseCacheSize++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (androidx.collection.SimpleArrayMap.class) {
                if (mBaseCacheSize < 10) {
                    objArr[0] = mBaseCache;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    mBaseCache = objArr;
                    mBaseCacheSize++;
                }
            }
        }
    }

    public SimpleArrayMap() {
        this.mHashes = androidx.collection.ContainerHelpers.EMPTY_INTS;
        this.mArray = androidx.collection.ContainerHelpers.EMPTY_OBJECTS;
        this.mSize = 0;
    }

    public SimpleArrayMap(int i) {
        if (i == 0) {
            this.mHashes = androidx.collection.ContainerHelpers.EMPTY_INTS;
            this.mArray = androidx.collection.ContainerHelpers.EMPTY_OBJECTS;
        } else {
            allocArrays(i);
        }
        this.mSize = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleArrayMap(androidx.collection.SimpleArrayMap<K, V> simpleArrayMap) {
        this();
        if (simpleArrayMap != 0) {
            putAll(simpleArrayMap);
        }
    }

    public void clear() {
        int i = this.mSize;
        if (i > 0) {
            int[] iArr = this.mHashes;
            java.lang.Object[] objArr = this.mArray;
            this.mHashes = androidx.collection.ContainerHelpers.EMPTY_INTS;
            this.mArray = androidx.collection.ContainerHelpers.EMPTY_OBJECTS;
            this.mSize = 0;
            freeArrays(iArr, objArr, i);
        }
        if (this.mSize > 0) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    public void ensureCapacity(int i) {
        int i2 = this.mSize;
        int[] iArr = this.mHashes;
        if (iArr.length < i) {
            java.lang.Object[] objArr = this.mArray;
            allocArrays(i);
            if (this.mSize > 0) {
                java.lang.System.arraycopy(iArr, 0, this.mHashes, 0, i2);
                java.lang.System.arraycopy(objArr, 0, this.mArray, 0, i2 << 1);
            }
            freeArrays(iArr, objArr, i2);
        }
        if (this.mSize != i2) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    public boolean containsKey(java.lang.Object obj) {
        return indexOfKey(obj) >= 0;
    }

    public int indexOfKey(java.lang.Object obj) {
        return obj == null ? indexOfNull() : indexOf(obj, obj.hashCode());
    }

    int indexOfValue(java.lang.Object obj) {
        int i = this.mSize * 2;
        java.lang.Object[] objArr = this.mArray;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public boolean containsValue(java.lang.Object obj) {
        return indexOfValue(obj) >= 0;
    }

    public V get(java.lang.Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(java.lang.Object obj, V v) {
        int iIndexOfKey = indexOfKey(obj);
        return iIndexOfKey >= 0 ? (V) this.mArray[(iIndexOfKey << 1) + 1] : v;
    }

    public K keyAt(int i) {
        return (K) this.mArray[i << 1];
    }

    public V valueAt(int i) {
        return (V) this.mArray[(i << 1) + 1];
    }

    public V setValueAt(int i, V v) {
        int i2 = (i << 1) + 1;
        java.lang.Object[] objArr = this.mArray;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    public boolean isEmpty() {
        return this.mSize <= 0;
    }

    public V put(K k, V v) {
        int i;
        int iIndexOf;
        int i2 = this.mSize;
        if (k == null) {
            iIndexOf = indexOfNull();
            i = 0;
        } else {
            int iHashCode = k.hashCode();
            i = iHashCode;
            iIndexOf = indexOf(k, iHashCode);
        }
        if (iIndexOf >= 0) {
            int i3 = (iIndexOf << 1) + 1;
            java.lang.Object[] objArr = this.mArray;
            V v2 = (V) objArr[i3];
            objArr[i3] = v;
            return v2;
        }
        int i4 = ~iIndexOf;
        int[] iArr = this.mHashes;
        if (i2 >= iArr.length) {
            int i5 = 8;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i5 = 4;
            }
            java.lang.Object[] objArr2 = this.mArray;
            allocArrays(i5);
            if (i2 != this.mSize) {
                throw new java.util.ConcurrentModificationException();
            }
            int[] iArr2 = this.mHashes;
            if (iArr2.length > 0) {
                java.lang.System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                java.lang.System.arraycopy(objArr2, 0, this.mArray, 0, objArr2.length);
            }
            freeArrays(iArr, objArr2, i2);
        }
        if (i4 < i2) {
            int[] iArr3 = this.mHashes;
            int i6 = i4 + 1;
            java.lang.System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            java.lang.Object[] objArr3 = this.mArray;
            java.lang.System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, (this.mSize - i4) << 1);
        }
        int i7 = this.mSize;
        if (i2 == i7) {
            int[] iArr4 = this.mHashes;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                java.lang.Object[] objArr4 = this.mArray;
                int i8 = i4 << 1;
                objArr4[i8] = k;
                objArr4[i8 + 1] = v;
                this.mSize = i7 + 1;
                return null;
            }
        }
        throw new java.util.ConcurrentModificationException();
    }

    public void putAll(androidx.collection.SimpleArrayMap<? extends K, ? extends V> simpleArrayMap) {
        int i = simpleArrayMap.mSize;
        ensureCapacity(this.mSize + i);
        if (this.mSize != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(simpleArrayMap.keyAt(i2), simpleArrayMap.valueAt(i2));
            }
        } else if (i > 0) {
            java.lang.System.arraycopy(simpleArrayMap.mHashes, 0, this.mHashes, 0, i);
            java.lang.System.arraycopy(simpleArrayMap.mArray, 0, this.mArray, 0, i << 1);
            this.mSize = i;
        }
    }

    public V putIfAbsent(K k, V v) {
        V v2 = get(k);
        return v2 == null ? put(k, v) : v2;
    }

    public V remove(java.lang.Object obj) {
        int iIndexOfKey = indexOfKey(obj);
        if (iIndexOfKey >= 0) {
            return removeAt(iIndexOfKey);
        }
        return null;
    }

    public boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        int iIndexOfKey = indexOfKey(obj);
        if (iIndexOfKey < 0) {
            return false;
        }
        V vValueAt = valueAt(iIndexOfKey);
        if (obj2 != vValueAt && (obj2 == null || !obj2.equals(vValueAt))) {
            return false;
        }
        removeAt(iIndexOfKey);
        return true;
    }

    public V removeAt(int i) {
        java.lang.Object[] objArr = this.mArray;
        int i2 = i << 1;
        V v = (V) objArr[i2 + 1];
        int i3 = this.mSize;
        if (i3 <= 1) {
            clear();
        } else {
            int i4 = i3 - 1;
            int[] iArr = this.mHashes;
            if (iArr.length > 8 && i3 < iArr.length / 3) {
                allocArrays(i3 > 8 ? i3 + (i3 >> 1) : 8);
                if (i3 != this.mSize) {
                    throw new java.util.ConcurrentModificationException();
                }
                if (i > 0) {
                    java.lang.System.arraycopy(iArr, 0, this.mHashes, 0, i);
                    java.lang.System.arraycopy(objArr, 0, this.mArray, 0, i2);
                }
                if (i < i4) {
                    int i5 = i + 1;
                    int i6 = i4 - i;
                    java.lang.System.arraycopy(iArr, i5, this.mHashes, i, i6);
                    java.lang.System.arraycopy(objArr, i5 << 1, this.mArray, i2, i6 << 1);
                }
            } else {
                if (i < i4) {
                    int i7 = i + 1;
                    int i8 = i4 - i;
                    java.lang.System.arraycopy(iArr, i7, iArr, i, i8);
                    java.lang.Object[] objArr2 = this.mArray;
                    java.lang.System.arraycopy(objArr2, i7 << 1, objArr2, i2, i8 << 1);
                }
                java.lang.Object[] objArr3 = this.mArray;
                int i9 = i4 << 1;
                objArr3[i9] = null;
                objArr3[i9 + 1] = null;
            }
            if (i3 != this.mSize) {
                throw new java.util.ConcurrentModificationException();
            }
            this.mSize = i4;
        }
        return v;
    }

    public V replace(K k, V v) {
        int iIndexOfKey = indexOfKey(k);
        if (iIndexOfKey >= 0) {
            return setValueAt(iIndexOfKey, v);
        }
        return null;
    }

    public boolean replace(K k, V v, V v2) {
        int iIndexOfKey = indexOfKey(k);
        if (iIndexOfKey < 0) {
            return false;
        }
        V vValueAt = valueAt(iIndexOfKey);
        if (vValueAt != v && (v == null || !v.equals(vValueAt))) {
            return false;
        }
        setValueAt(iIndexOfKey, v2);
        return true;
    }

    public int size() {
        return this.mSize;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof androidx.collection.SimpleArrayMap) {
                androidx.collection.SimpleArrayMap simpleArrayMap = (androidx.collection.SimpleArrayMap) obj;
                if (size() != simpleArrayMap.size()) {
                    return false;
                }
                for (int i = 0; i < this.mSize; i++) {
                    K kKeyAt = keyAt(i);
                    V vValueAt = valueAt(i);
                    java.lang.Object obj2 = simpleArrayMap.get(kKeyAt);
                    if (vValueAt == null) {
                        if (obj2 != null || !simpleArrayMap.containsKey(kKeyAt)) {
                            return false;
                        }
                    } else if (!vValueAt.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (obj instanceof java.util.Map) {
                java.util.Map map = (java.util.Map) obj;
                if (size() != map.size()) {
                    return false;
                }
                for (int i2 = 0; i2 < this.mSize; i2++) {
                    K kKeyAt2 = keyAt(i2);
                    V vValueAt2 = valueAt(i2);
                    java.lang.Object obj3 = map.get(kKeyAt2);
                    if (vValueAt2 == null) {
                        if (obj3 != null || !map.containsKey(kKeyAt2)) {
                            return false;
                        }
                    } else if (!vValueAt2.equals(obj3)) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
        }
    }

    public int hashCode() {
        int[] iArr = this.mHashes;
        java.lang.Object[] objArr = this.mArray;
        int i = this.mSize;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            java.lang.Object obj = objArr[i2];
            iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    public java.lang.String toString() {
        if (isEmpty()) {
            return com.applovin.impl.sdk.utils.JsonUtils.EMPTY_JSON;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(this.mSize * 28);
        sb.append('{');
        for (int i = 0; i < this.mSize; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            K kKeyAt = keyAt(i);
            if (kKeyAt != this) {
                sb.append(kKeyAt);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V vValueAt = valueAt(i);
            if (vValueAt != this) {
                sb.append(vValueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
