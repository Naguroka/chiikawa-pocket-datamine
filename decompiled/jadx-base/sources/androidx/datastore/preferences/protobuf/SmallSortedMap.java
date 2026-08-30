package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
class SmallSortedMap<K extends java.lang.Comparable<K>, V> extends java.util.AbstractMap<K, V> {
    static final int DEFAULT_FIELD_MAP_ARRAY_SIZE = 16;
    private java.util.List<androidx.datastore.preferences.protobuf.SmallSortedMap<K, V>.Entry> entryList;
    private boolean isImmutable;
    private volatile androidx.datastore.preferences.protobuf.SmallSortedMap<K, V>.DescendingEntrySet lazyDescendingEntrySet;
    private volatile androidx.datastore.preferences.protobuf.SmallSortedMap<K, V>.EntrySet lazyEntrySet;
    private java.util.Map<K, V> overflowEntries;
    private java.util.Map<K, V> overflowEntriesDescending;

    static <FieldDescriptorType extends androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite<FieldDescriptorType>> androidx.datastore.preferences.protobuf.SmallSortedMap<FieldDescriptorType, java.lang.Object> newFieldMap() {
        return (androidx.datastore.preferences.protobuf.SmallSortedMap<FieldDescriptorType, java.lang.Object>) new androidx.datastore.preferences.protobuf.SmallSortedMap<FieldDescriptorType, java.lang.Object>() { // from class: androidx.datastore.preferences.protobuf.SmallSortedMap.1
            @Override // androidx.datastore.preferences.protobuf.SmallSortedMap, java.util.AbstractMap, java.util.Map
            public /* bridge */ /* synthetic */ java.lang.Object put(java.lang.Object key, java.lang.Object value) {
                return super.put((java.lang.Comparable) key, value);
            }

            @Override // androidx.datastore.preferences.protobuf.SmallSortedMap
            public void makeImmutable() {
                if (!isImmutable()) {
                    for (int i = 0; i < getNumArrayEntries(); i++) {
                        java.util.Map.Entry<FieldDescriptorType, java.lang.Object> arrayEntryAt = getArrayEntryAt(i);
                        if (((androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite) arrayEntryAt.getKey()).isRepeated()) {
                            arrayEntryAt.setValue(java.util.Collections.unmodifiableList((java.util.List) arrayEntryAt.getValue()));
                        }
                    }
                    for (java.util.Map.Entry<FieldDescriptorType, java.lang.Object> entry : getOverflowEntries()) {
                        if (((androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite) entry.getKey()).isRepeated()) {
                            entry.setValue(java.util.Collections.unmodifiableList((java.util.List) entry.getValue()));
                        }
                    }
                }
                super.makeImmutable();
            }
        };
    }

    static <K extends java.lang.Comparable<K>, V> androidx.datastore.preferences.protobuf.SmallSortedMap<K, V> newInstanceForTest() {
        return new androidx.datastore.preferences.protobuf.SmallSortedMap<>();
    }

    private SmallSortedMap() {
        this.entryList = java.util.Collections.emptyList();
        this.overflowEntries = java.util.Collections.emptyMap();
        this.overflowEntriesDescending = java.util.Collections.emptyMap();
    }

    public void makeImmutable() {
        java.util.Map<K, V> mapUnmodifiableMap;
        java.util.Map<K, V> mapUnmodifiableMap2;
        if (this.isImmutable) {
            return;
        }
        if (this.overflowEntries.isEmpty()) {
            mapUnmodifiableMap = java.util.Collections.emptyMap();
        } else {
            mapUnmodifiableMap = java.util.Collections.unmodifiableMap(this.overflowEntries);
        }
        this.overflowEntries = mapUnmodifiableMap;
        if (this.overflowEntriesDescending.isEmpty()) {
            mapUnmodifiableMap2 = java.util.Collections.emptyMap();
        } else {
            mapUnmodifiableMap2 = java.util.Collections.unmodifiableMap(this.overflowEntriesDescending);
        }
        this.overflowEntriesDescending = mapUnmodifiableMap2;
        this.isImmutable = true;
    }

    public boolean isImmutable() {
        return this.isImmutable;
    }

    public int getNumArrayEntries() {
        return this.entryList.size();
    }

    public java.util.Map.Entry<K, V> getArrayEntryAt(int index) {
        return this.entryList.get(index);
    }

    public int getNumOverflowEntries() {
        return this.overflowEntries.size();
    }

    public java.lang.Iterable<java.util.Map.Entry<K, V>> getOverflowEntries() {
        if (this.overflowEntries.isEmpty()) {
            return java.util.Collections.emptySet();
        }
        return this.overflowEntries.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.entryList.size() + this.overflowEntries.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(java.lang.Object o) {
        java.lang.Comparable comparable = (java.lang.Comparable) o;
        return binarySearchInArray(comparable) >= 0 || this.overflowEntries.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(java.lang.Object o) {
        java.lang.Comparable comparable = (java.lang.Comparable) o;
        int iBinarySearchInArray = binarySearchInArray(comparable);
        if (iBinarySearchInArray >= 0) {
            return this.entryList.get(iBinarySearchInArray).getValue();
        }
        return this.overflowEntries.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        checkMutable();
        int iBinarySearchInArray = binarySearchInArray(k);
        if (iBinarySearchInArray >= 0) {
            return this.entryList.get(iBinarySearchInArray).setValue(v);
        }
        ensureEntryArrayMutable();
        int i = -(iBinarySearchInArray + 1);
        if (i >= 16) {
            return getOverflowEntriesMutable().put(k, v);
        }
        if (this.entryList.size() == 16) {
            androidx.datastore.preferences.protobuf.SmallSortedMap<K, V>.Entry entryRemove = this.entryList.remove(15);
            getOverflowEntriesMutable().put(entryRemove.getKey(), entryRemove.getValue());
        }
        this.entryList.add(i, new androidx.datastore.preferences.protobuf.SmallSortedMap.Entry(k, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        checkMutable();
        if (!this.entryList.isEmpty()) {
            this.entryList.clear();
        }
        if (this.overflowEntries.isEmpty()) {
            return;
        }
        this.overflowEntries.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(java.lang.Object o) {
        checkMutable();
        java.lang.Comparable comparable = (java.lang.Comparable) o;
        int iBinarySearchInArray = binarySearchInArray(comparable);
        if (iBinarySearchInArray >= 0) {
            return removeArrayEntryAt(iBinarySearchInArray);
        }
        if (this.overflowEntries.isEmpty()) {
            return null;
        }
        return this.overflowEntries.remove(comparable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V removeArrayEntryAt(int index) {
        checkMutable();
        V value = this.entryList.remove(index).getValue();
        if (!this.overflowEntries.isEmpty()) {
            java.util.Iterator<java.util.Map.Entry<K, V>> it = getOverflowEntriesMutable().entrySet().iterator();
            this.entryList.add(new androidx.datastore.preferences.protobuf.SmallSortedMap.Entry(this, it.next()));
            it.remove();
        }
        return value;
    }

    private int binarySearchInArray(K key) {
        int size = this.entryList.size() - 1;
        if (size >= 0) {
            int iCompareTo = key.compareTo(this.entryList.get(size).getKey());
            if (iCompareTo > 0) {
                return -(size + 2);
            }
            if (iCompareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int iCompareTo2 = key.compareTo(this.entryList.get(i2).getKey());
            if (iCompareTo2 < 0) {
                size = i2 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i2;
                }
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        if (this.lazyEntrySet == null) {
            this.lazyEntrySet = new androidx.datastore.preferences.protobuf.SmallSortedMap.EntrySet();
        }
        return this.lazyEntrySet;
    }

    java.util.Set<java.util.Map.Entry<K, V>> descendingEntrySet() {
        if (this.lazyDescendingEntrySet == null) {
            this.lazyDescendingEntrySet = new androidx.datastore.preferences.protobuf.SmallSortedMap.DescendingEntrySet();
        }
        return this.lazyDescendingEntrySet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkMutable() {
        if (this.isImmutable) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    private java.util.SortedMap<K, V> getOverflowEntriesMutable() {
        checkMutable();
        if (this.overflowEntries.isEmpty() && !(this.overflowEntries instanceof java.util.TreeMap)) {
            java.util.TreeMap treeMap = new java.util.TreeMap();
            this.overflowEntries = treeMap;
            this.overflowEntriesDescending = treeMap.descendingMap();
        }
        return (java.util.SortedMap) this.overflowEntries;
    }

    private void ensureEntryArrayMutable() {
        checkMutable();
        if (!this.entryList.isEmpty() || (this.entryList instanceof java.util.ArrayList)) {
            return;
        }
        this.entryList = new java.util.ArrayList(16);
    }

    private class Entry implements java.util.Map.Entry<K, V>, java.lang.Comparable<androidx.datastore.preferences.protobuf.SmallSortedMap<K, V>.Entry> {
        private final K key;
        private V value;

        Entry(final androidx.datastore.preferences.protobuf.SmallSortedMap this$0, java.util.Map.Entry<K, V> copy) {
            this(copy.getKey(), copy.getValue());
        }

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.key;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.value;
        }

        @Override // java.lang.Comparable
        public int compareTo(androidx.datastore.preferences.protobuf.SmallSortedMap<K, V>.Entry other) {
            return getKey().compareTo(other.getKey());
        }

        @Override // java.util.Map.Entry
        public V setValue(V newValue) {
            androidx.datastore.preferences.protobuf.SmallSortedMap.this.checkMutable();
            V v = this.value;
            this.value = newValue;
            return v;
        }

        @Override // java.util.Map.Entry
        public boolean equals(java.lang.Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof java.util.Map.Entry)) {
                return false;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) o;
            return equals(this.key, entry.getKey()) && equals(this.value, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k = this.key;
            int iHashCode = k == null ? 0 : k.hashCode();
            V v = this.value;
            return iHashCode ^ (v != null ? v.hashCode() : 0);
        }

        public java.lang.String toString() {
            return this.key + com.ironsource.y8.i.b + this.value;
        }

        private boolean equals(java.lang.Object o1, java.lang.Object o2) {
            if (o1 == null) {
                return o2 == null;
            }
            return o1.equals(o2);
        }
    }

    private class EntrySet extends java.util.AbstractSet<java.util.Map.Entry<K, V>> {
        private EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
            return new androidx.datastore.preferences.protobuf.SmallSortedMap.EntryIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return androidx.datastore.preferences.protobuf.SmallSortedMap.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object o) {
            java.util.Map.Entry entry = (java.util.Map.Entry) o;
            java.lang.Object obj = androidx.datastore.preferences.protobuf.SmallSortedMap.this.get(entry.getKey());
            java.lang.Object value = entry.getValue();
            return obj == value || (obj != null && obj.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(java.util.Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            androidx.datastore.preferences.protobuf.SmallSortedMap.this.put((java.lang.Comparable) entry.getKey(), (java.lang.Object) entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object o) {
            java.util.Map.Entry entry = (java.util.Map.Entry) o;
            if (!contains(entry)) {
                return false;
            }
            androidx.datastore.preferences.protobuf.SmallSortedMap.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            androidx.datastore.preferences.protobuf.SmallSortedMap.this.clear();
        }
    }

    private class DescendingEntrySet extends androidx.datastore.preferences.protobuf.SmallSortedMap<K, V>.EntrySet {
        private DescendingEntrySet() {
            super();
        }

        @Override // androidx.datastore.preferences.protobuf.SmallSortedMap.EntrySet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
            return new androidx.datastore.preferences.protobuf.SmallSortedMap.DescendingEntryIterator();
        }
    }

    private class EntryIterator implements java.util.Iterator<java.util.Map.Entry<K, V>> {
        private java.util.Iterator<java.util.Map.Entry<K, V>> lazyOverflowIterator;
        private boolean nextCalledBeforeRemove;
        private int pos;

        private EntryIterator() {
            this.pos = -1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.pos + 1 >= androidx.datastore.preferences.protobuf.SmallSortedMap.this.entryList.size()) {
                return !androidx.datastore.preferences.protobuf.SmallSortedMap.this.overflowEntries.isEmpty() && getOverflowIterator().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        public java.util.Map.Entry<K, V> next() {
            this.nextCalledBeforeRemove = true;
            int i = this.pos + 1;
            this.pos = i;
            if (i < androidx.datastore.preferences.protobuf.SmallSortedMap.this.entryList.size()) {
                return (java.util.Map.Entry) androidx.datastore.preferences.protobuf.SmallSortedMap.this.entryList.get(this.pos);
            }
            return getOverflowIterator().next();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.nextCalledBeforeRemove) {
                throw new java.lang.IllegalStateException("remove() was called before next()");
            }
            this.nextCalledBeforeRemove = false;
            androidx.datastore.preferences.protobuf.SmallSortedMap.this.checkMutable();
            if (this.pos < androidx.datastore.preferences.protobuf.SmallSortedMap.this.entryList.size()) {
                androidx.datastore.preferences.protobuf.SmallSortedMap smallSortedMap = androidx.datastore.preferences.protobuf.SmallSortedMap.this;
                int i = this.pos;
                this.pos = i - 1;
                smallSortedMap.removeArrayEntryAt(i);
                return;
            }
            getOverflowIterator().remove();
        }

        private java.util.Iterator<java.util.Map.Entry<K, V>> getOverflowIterator() {
            if (this.lazyOverflowIterator == null) {
                this.lazyOverflowIterator = androidx.datastore.preferences.protobuf.SmallSortedMap.this.overflowEntries.entrySet().iterator();
            }
            return this.lazyOverflowIterator;
        }
    }

    private class DescendingEntryIterator implements java.util.Iterator<java.util.Map.Entry<K, V>> {
        private java.util.Iterator<java.util.Map.Entry<K, V>> lazyOverflowIterator;
        private int pos;

        private DescendingEntryIterator() {
            this.pos = androidx.datastore.preferences.protobuf.SmallSortedMap.this.entryList.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i = this.pos;
            return (i > 0 && i <= androidx.datastore.preferences.protobuf.SmallSortedMap.this.entryList.size()) || getOverflowIterator().hasNext();
        }

        @Override // java.util.Iterator
        public java.util.Map.Entry<K, V> next() {
            if (!getOverflowIterator().hasNext()) {
                java.util.List list = androidx.datastore.preferences.protobuf.SmallSortedMap.this.entryList;
                int i = this.pos - 1;
                this.pos = i;
                return (java.util.Map.Entry) list.get(i);
            }
            return getOverflowIterator().next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException();
        }

        private java.util.Iterator<java.util.Map.Entry<K, V>> getOverflowIterator() {
            if (this.lazyOverflowIterator == null) {
                this.lazyOverflowIterator = androidx.datastore.preferences.protobuf.SmallSortedMap.this.overflowEntriesDescending.entrySet().iterator();
            }
            return this.lazyOverflowIterator;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof androidx.datastore.preferences.protobuf.SmallSortedMap)) {
            return super.equals(o);
        }
        androidx.datastore.preferences.protobuf.SmallSortedMap smallSortedMap = (androidx.datastore.preferences.protobuf.SmallSortedMap) o;
        int size = size();
        if (size != smallSortedMap.size()) {
            return false;
        }
        int numArrayEntries = getNumArrayEntries();
        if (numArrayEntries != smallSortedMap.getNumArrayEntries()) {
            return entrySet().equals(smallSortedMap.entrySet());
        }
        for (int i = 0; i < numArrayEntries; i++) {
            if (!getArrayEntryAt(i).equals(smallSortedMap.getArrayEntryAt(i))) {
                return false;
            }
        }
        if (numArrayEntries != size) {
            return this.overflowEntries.equals(smallSortedMap.overflowEntries);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int numArrayEntries = getNumArrayEntries();
        int iHashCode = 0;
        for (int i = 0; i < numArrayEntries; i++) {
            iHashCode += this.entryList.get(i).hashCode();
        }
        return getNumOverflowEntries() > 0 ? iHashCode + this.overflowEntries.hashCode() : iHashCode;
    }
}
