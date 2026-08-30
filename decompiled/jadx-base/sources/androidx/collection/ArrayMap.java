package androidx.collection;

/* JADX INFO: loaded from: classes.dex */
public class ArrayMap<K, V> extends androidx.collection.SimpleArrayMap<K, V> implements java.util.Map<K, V> {
    androidx.collection.ArrayMap<K, V>.EntrySet mEntrySet;
    androidx.collection.ArrayMap<K, V>.KeySet mKeySet;
    androidx.collection.ArrayMap<K, V>.ValueCollection mValues;

    public ArrayMap() {
    }

    public ArrayMap(int i) {
        super(i);
    }

    public ArrayMap(androidx.collection.SimpleArrayMap simpleArrayMap) {
        super(simpleArrayMap);
    }

    public boolean containsAll(java.util.Collection<?> collection) {
        java.util.Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public void putAll(java.util.Map<? extends K, ? extends V> map) {
        ensureCapacity(this.mSize + map.size());
        for (java.util.Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public boolean removeAll(java.util.Collection<?> collection) {
        int i = this.mSize;
        java.util.Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i != this.mSize;
    }

    public boolean retainAll(java.util.Collection<?> collection) {
        int i = this.mSize;
        for (int i2 = this.mSize - 1; i2 >= 0; i2--) {
            if (!collection.contains(keyAt(i2))) {
                removeAt(i2);
            }
        }
        return i != this.mSize;
    }

    @Override // java.util.Map
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        androidx.collection.ArrayMap<K, V>.EntrySet entrySet = this.mEntrySet;
        if (entrySet != null) {
            return entrySet;
        }
        androidx.collection.ArrayMap<K, V>.EntrySet entrySet2 = new androidx.collection.ArrayMap.EntrySet();
        this.mEntrySet = entrySet2;
        return entrySet2;
    }

    @Override // java.util.Map
    public java.util.Set<K> keySet() {
        androidx.collection.ArrayMap<K, V>.KeySet keySet = this.mKeySet;
        if (keySet != null) {
            return keySet;
        }
        androidx.collection.ArrayMap<K, V>.KeySet keySet2 = new androidx.collection.ArrayMap.KeySet();
        this.mKeySet = keySet2;
        return keySet2;
    }

    @Override // java.util.Map
    public java.util.Collection<V> values() {
        androidx.collection.ArrayMap<K, V>.ValueCollection valueCollection = this.mValues;
        if (valueCollection != null) {
            return valueCollection;
        }
        androidx.collection.ArrayMap<K, V>.ValueCollection valueCollection2 = new androidx.collection.ArrayMap.ValueCollection();
        this.mValues = valueCollection2;
        return valueCollection2;
    }

    final class EntrySet extends java.util.AbstractSet<java.util.Map.Entry<K, V>> {
        EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
            return new androidx.collection.ArrayMap.MapIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return androidx.collection.ArrayMap.this.mSize;
        }
    }

    final class KeySet implements java.util.Set<K> {
        KeySet() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(java.util.Collection<? extends K> collection) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            androidx.collection.ArrayMap.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(java.lang.Object obj) {
            return androidx.collection.ArrayMap.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(java.util.Collection<?> collection) {
            return androidx.collection.ArrayMap.this.containsAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return androidx.collection.ArrayMap.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<K> iterator() {
            return new androidx.collection.ArrayMap.KeyIterator();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(java.lang.Object obj) {
            int iIndexOfKey = androidx.collection.ArrayMap.this.indexOfKey(obj);
            if (iIndexOfKey < 0) {
                return false;
            }
            androidx.collection.ArrayMap.this.removeAt(iIndexOfKey);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(java.util.Collection<?> collection) {
            return androidx.collection.ArrayMap.this.removeAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(java.util.Collection<?> collection) {
            return androidx.collection.ArrayMap.this.retainAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return androidx.collection.ArrayMap.this.mSize;
        }

        @Override // java.util.Set, java.util.Collection
        public java.lang.Object[] toArray() {
            int i = androidx.collection.ArrayMap.this.mSize;
            java.lang.Object[] objArr = new java.lang.Object[i];
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = androidx.collection.ArrayMap.this.keyAt(i2);
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) androidx.collection.ArrayMap.this.toArrayHelper(tArr, 0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(java.lang.Object obj) {
            return androidx.collection.ArrayMap.equalsSetHelper(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int i = androidx.collection.ArrayMap.this.mSize - 1; i >= 0; i--) {
                K kKeyAt = androidx.collection.ArrayMap.this.keyAt(i);
                iHashCode += kKeyAt == null ? 0 : kKeyAt.hashCode();
            }
            return iHashCode;
        }
    }

    final class ValueCollection implements java.util.Collection<V> {
        ValueCollection() {
        }

        @Override // java.util.Collection
        public boolean add(V v) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(java.util.Collection<? extends V> collection) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            androidx.collection.ArrayMap.this.clear();
        }

        @Override // java.util.Collection
        public boolean contains(java.lang.Object obj) {
            return androidx.collection.ArrayMap.this.indexOfValue(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(java.util.Collection<?> collection) {
            java.util.Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return androidx.collection.ArrayMap.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public java.util.Iterator<V> iterator() {
            return new androidx.collection.ArrayMap.ValueIterator();
        }

        @Override // java.util.Collection
        public boolean remove(java.lang.Object obj) {
            int iIndexOfValue = androidx.collection.ArrayMap.this.indexOfValue(obj);
            if (iIndexOfValue < 0) {
                return false;
            }
            androidx.collection.ArrayMap.this.removeAt(iIndexOfValue);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(java.util.Collection<?> collection) {
            int i = androidx.collection.ArrayMap.this.mSize;
            int i2 = 0;
            boolean z = false;
            while (i2 < i) {
                if (collection.contains(androidx.collection.ArrayMap.this.valueAt(i2))) {
                    androidx.collection.ArrayMap.this.removeAt(i2);
                    i2--;
                    i--;
                    z = true;
                }
                i2++;
            }
            return z;
        }

        @Override // java.util.Collection
        public boolean retainAll(java.util.Collection<?> collection) {
            int i = androidx.collection.ArrayMap.this.mSize;
            int i2 = 0;
            boolean z = false;
            while (i2 < i) {
                if (!collection.contains(androidx.collection.ArrayMap.this.valueAt(i2))) {
                    androidx.collection.ArrayMap.this.removeAt(i2);
                    i2--;
                    i--;
                    z = true;
                }
                i2++;
            }
            return z;
        }

        @Override // java.util.Collection
        public int size() {
            return androidx.collection.ArrayMap.this.mSize;
        }

        @Override // java.util.Collection
        public java.lang.Object[] toArray() {
            int i = androidx.collection.ArrayMap.this.mSize;
            java.lang.Object[] objArr = new java.lang.Object[i];
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = androidx.collection.ArrayMap.this.valueAt(i2);
            }
            return objArr;
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) androidx.collection.ArrayMap.this.toArrayHelper(tArr, 1);
        }
    }

    final class KeyIterator extends androidx.collection.IndexBasedArrayIterator<K> {
        KeyIterator() {
            super(androidx.collection.ArrayMap.this.mSize);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        protected K elementAt(int i) {
            return androidx.collection.ArrayMap.this.keyAt(i);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        protected void removeAt(int i) {
            androidx.collection.ArrayMap.this.removeAt(i);
        }
    }

    final class ValueIterator extends androidx.collection.IndexBasedArrayIterator<V> {
        ValueIterator() {
            super(androidx.collection.ArrayMap.this.mSize);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        protected V elementAt(int i) {
            return androidx.collection.ArrayMap.this.valueAt(i);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        protected void removeAt(int i) {
            androidx.collection.ArrayMap.this.removeAt(i);
        }
    }

    final class MapIterator implements java.util.Iterator<java.util.Map.Entry<K, V>>, java.util.Map.Entry<K, V> {
        int mEnd;
        boolean mEntryValid;
        int mIndex = -1;

        MapIterator() {
            this.mEnd = androidx.collection.ArrayMap.this.mSize - 1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.mIndex < this.mEnd;
        }

        @Override // java.util.Iterator
        public java.util.Map.Entry<K, V> next() {
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            this.mIndex++;
            this.mEntryValid = true;
            return this;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.mEntryValid) {
                throw new java.lang.IllegalStateException();
            }
            androidx.collection.ArrayMap.this.removeAt(this.mIndex);
            this.mIndex--;
            this.mEnd--;
            this.mEntryValid = false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (!this.mEntryValid) {
                throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            return androidx.collection.ArrayMap.this.keyAt(this.mIndex);
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (!this.mEntryValid) {
                throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            return androidx.collection.ArrayMap.this.valueAt(this.mIndex);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            if (!this.mEntryValid) {
                throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            return androidx.collection.ArrayMap.this.setValueAt(this.mIndex, v);
        }

        @Override // java.util.Map.Entry
        public boolean equals(java.lang.Object obj) {
            if (!this.mEntryValid) {
                throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof java.util.Map.Entry)) {
                return false;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            return androidx.collection.ContainerHelpers.equal(entry.getKey(), androidx.collection.ArrayMap.this.keyAt(this.mIndex)) && androidx.collection.ContainerHelpers.equal(entry.getValue(), androidx.collection.ArrayMap.this.valueAt(this.mIndex));
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.mEntryValid) {
                throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            K kKeyAt = androidx.collection.ArrayMap.this.keyAt(this.mIndex);
            V vValueAt = androidx.collection.ArrayMap.this.valueAt(this.mIndex);
            return (kKeyAt == null ? 0 : kKeyAt.hashCode()) ^ (vValueAt != null ? vValueAt.hashCode() : 0);
        }

        public java.lang.String toString() {
            return getKey() + com.ironsource.y8.i.b + getValue();
        }
    }

    <T> T[] toArrayHelper(T[] tArr, int i) {
        int i2 = this.mSize;
        if (tArr.length < i2) {
            tArr = (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance(tArr.getClass().getComponentType(), i2));
        }
        for (int i3 = 0; i3 < i2; i3++) {
            tArr[i3] = this.mArray[(i3 << 1) + i];
        }
        if (tArr.length > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }

    static <T> boolean equalsSetHelper(java.util.Set<T> set, java.lang.Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof java.util.Set) {
            java.util.Set set2 = (java.util.Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            }
        }
        return false;
    }
}
