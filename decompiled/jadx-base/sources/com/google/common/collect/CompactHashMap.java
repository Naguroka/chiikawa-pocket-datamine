package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
class CompactHashMap<K, V> extends java.util.AbstractMap<K, V> implements java.io.Serializable {
    static final double HASH_FLOODING_FPP = 0.001d;
    private static final int MAX_HASH_BUCKET_LENGTH = 9;
    private static final java.lang.Object NOT_FOUND = new java.lang.Object();

    @javax.annotation.CheckForNull
    transient int[] entries;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.util.Set<java.util.Map.Entry<K, V>> entrySetView;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.util.Set<K> keySetView;

    @javax.annotation.CheckForNull
    transient java.lang.Object[] keys;
    private transient int metadata;
    private transient int size;

    @javax.annotation.CheckForNull
    private transient java.lang.Object table;

    @javax.annotation.CheckForNull
    transient java.lang.Object[] values;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.util.Collection<V> valuesView;

    void accessEntry(int index) {
    }

    int adjustAfterRemove(int indexBeforeRemove, int indexRemoved) {
        return indexBeforeRemove - 1;
    }

    static /* synthetic */ int access$1210(com.google.common.collect.CompactHashMap compactHashMap) {
        int i = compactHashMap.size;
        compactHashMap.size = i - 1;
        return i;
    }

    public static <K, V> com.google.common.collect.CompactHashMap<K, V> create() {
        return new com.google.common.collect.CompactHashMap<>();
    }

    public static <K, V> com.google.common.collect.CompactHashMap<K, V> createWithExpectedSize(int expectedSize) {
        return new com.google.common.collect.CompactHashMap<>(expectedSize);
    }

    CompactHashMap() {
        init(3);
    }

    CompactHashMap(int expectedSize) {
        init(expectedSize);
    }

    void init(int expectedSize) {
        com.google.common.base.Preconditions.checkArgument(expectedSize >= 0, "Expected size must be >= 0");
        this.metadata = com.google.common.primitives.Ints.constrainToRange(expectedSize, 1, kotlinx.coroutines.internal.LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
    }

    boolean needsAllocArrays() {
        return this.table == null;
    }

    int allocArrays() {
        com.google.common.base.Preconditions.checkState(needsAllocArrays(), "Arrays already allocated");
        int i = this.metadata;
        int iTableSize = com.google.common.collect.CompactHashing.tableSize(i);
        this.table = com.google.common.collect.CompactHashing.createTable(iTableSize);
        setHashTableMask(iTableSize - 1);
        this.entries = new int[i];
        this.keys = new java.lang.Object[i];
        this.values = new java.lang.Object[i];
        return i;
    }

    @javax.annotation.CheckForNull
    java.util.Map<K, V> delegateOrNull() {
        java.lang.Object obj = this.table;
        if (obj instanceof java.util.Map) {
            return (java.util.Map) obj;
        }
        return null;
    }

    java.util.Map<K, V> createHashFloodingResistantDelegate(int tableSize) {
        return new java.util.LinkedHashMap(tableSize, 1.0f);
    }

    java.util.Map<K, V> convertToHashFloodingResistantImplementation() {
        java.util.Map<K, V> mapCreateHashFloodingResistantDelegate = createHashFloodingResistantDelegate(hashTableMask() + 1);
        int iFirstEntryIndex = firstEntryIndex();
        while (iFirstEntryIndex >= 0) {
            mapCreateHashFloodingResistantDelegate.put(key(iFirstEntryIndex), value(iFirstEntryIndex));
            iFirstEntryIndex = getSuccessor(iFirstEntryIndex);
        }
        this.table = mapCreateHashFloodingResistantDelegate;
        this.entries = null;
        this.keys = null;
        this.values = null;
        incrementModCount();
        return mapCreateHashFloodingResistantDelegate;
    }

    private void setHashTableMask(int mask) {
        this.metadata = com.google.common.collect.CompactHashing.maskCombine(this.metadata, 32 - java.lang.Integer.numberOfLeadingZeros(mask), 31);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int hashTableMask() {
        return (1 << (this.metadata & 31)) - 1;
    }

    void incrementModCount() {
        this.metadata += 32;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @javax.annotation.CheckForNull
    public V put(@com.google.common.collect.ParametricNullness K k, @com.google.common.collect.ParametricNullness V v) {
        int iResizeTable;
        int i;
        if (needsAllocArrays()) {
            allocArrays();
        }
        java.util.Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            return mapDelegateOrNull.put(k, v);
        }
        int[] iArrRequireEntries = requireEntries();
        java.lang.Object[] objArrRequireKeys = requireKeys();
        java.lang.Object[] objArrRequireValues = requireValues();
        int i2 = this.size;
        int i3 = i2 + 1;
        int iSmearedHash = com.google.common.collect.Hashing.smearedHash(k);
        int iHashTableMask = hashTableMask();
        int i4 = iSmearedHash & iHashTableMask;
        int iTableGet = com.google.common.collect.CompactHashing.tableGet(requireTable(), i4);
        if (iTableGet != 0) {
            int hashPrefix = com.google.common.collect.CompactHashing.getHashPrefix(iSmearedHash, iHashTableMask);
            int i5 = 0;
            while (true) {
                int i6 = iTableGet - 1;
                int i7 = iArrRequireEntries[i6];
                if (com.google.common.collect.CompactHashing.getHashPrefix(i7, iHashTableMask) == hashPrefix && com.google.common.base.Objects.equal(k, objArrRequireKeys[i6])) {
                    V v2 = (V) objArrRequireValues[i6];
                    objArrRequireValues[i6] = v;
                    accessEntry(i6);
                    return v2;
                }
                int next = com.google.common.collect.CompactHashing.getNext(i7, iHashTableMask);
                i5++;
                if (next != 0) {
                    iTableGet = next;
                } else {
                    if (i5 >= 9) {
                        return convertToHashFloodingResistantImplementation().put(k, v);
                    }
                    if (i3 > iHashTableMask) {
                        iResizeTable = resizeTable(iHashTableMask, com.google.common.collect.CompactHashing.newCapacity(iHashTableMask), iSmearedHash, i2);
                        i = iResizeTable;
                    } else {
                        iArrRequireEntries[i6] = com.google.common.collect.CompactHashing.maskCombine(i7, i3, iHashTableMask);
                        i = iHashTableMask;
                    }
                }
            }
        } else if (i3 > iHashTableMask) {
            iResizeTable = resizeTable(iHashTableMask, com.google.common.collect.CompactHashing.newCapacity(iHashTableMask), iSmearedHash, i2);
            i = iResizeTable;
        } else {
            com.google.common.collect.CompactHashing.tableSet(requireTable(), i4, i3);
            i = iHashTableMask;
        }
        resizeMeMaybe(i3);
        insertEntry(i2, k, v, iSmearedHash, i);
        this.size = i3;
        incrementModCount();
        return null;
    }

    void insertEntry(int entryIndex, @com.google.common.collect.ParametricNullness K key, @com.google.common.collect.ParametricNullness V value, int hash, int mask) {
        setEntry(entryIndex, com.google.common.collect.CompactHashing.maskCombine(hash, 0, mask));
        setKey(entryIndex, key);
        setValue(entryIndex, value);
    }

    private void resizeMeMaybe(int newSize) {
        int iMin;
        int length = requireEntries().length;
        if (newSize <= length || (iMin = java.lang.Math.min(kotlinx.coroutines.internal.LockFreeTaskQueueCore.MAX_CAPACITY_MASK, (java.lang.Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        resizeEntries(iMin);
    }

    void resizeEntries(int newCapacity) {
        this.entries = java.util.Arrays.copyOf(requireEntries(), newCapacity);
        this.keys = java.util.Arrays.copyOf(requireKeys(), newCapacity);
        this.values = java.util.Arrays.copyOf(requireValues(), newCapacity);
    }

    private int resizeTable(int oldMask, int newCapacity, int targetHash, int targetEntryIndex) {
        java.lang.Object objCreateTable = com.google.common.collect.CompactHashing.createTable(newCapacity);
        int i = newCapacity - 1;
        if (targetEntryIndex != 0) {
            com.google.common.collect.CompactHashing.tableSet(objCreateTable, targetHash & i, targetEntryIndex + 1);
        }
        java.lang.Object objRequireTable = requireTable();
        int[] iArrRequireEntries = requireEntries();
        for (int i2 = 0; i2 <= oldMask; i2++) {
            int iTableGet = com.google.common.collect.CompactHashing.tableGet(objRequireTable, i2);
            while (iTableGet != 0) {
                int i3 = iTableGet - 1;
                int i4 = iArrRequireEntries[i3];
                int hashPrefix = com.google.common.collect.CompactHashing.getHashPrefix(i4, oldMask) | i2;
                int i5 = hashPrefix & i;
                int iTableGet2 = com.google.common.collect.CompactHashing.tableGet(objCreateTable, i5);
                com.google.common.collect.CompactHashing.tableSet(objCreateTable, i5, iTableGet);
                iArrRequireEntries[i3] = com.google.common.collect.CompactHashing.maskCombine(hashPrefix, iTableGet2, i);
                iTableGet = com.google.common.collect.CompactHashing.getNext(i4, oldMask);
            }
        }
        this.table = objCreateTable;
        setHashTableMask(i);
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int indexOf(@javax.annotation.CheckForNull java.lang.Object key) {
        if (needsAllocArrays()) {
            return -1;
        }
        int iSmearedHash = com.google.common.collect.Hashing.smearedHash(key);
        int iHashTableMask = hashTableMask();
        int iTableGet = com.google.common.collect.CompactHashing.tableGet(requireTable(), iSmearedHash & iHashTableMask);
        if (iTableGet == 0) {
            return -1;
        }
        int hashPrefix = com.google.common.collect.CompactHashing.getHashPrefix(iSmearedHash, iHashTableMask);
        do {
            int i = iTableGet - 1;
            int iEntry = entry(i);
            if (com.google.common.collect.CompactHashing.getHashPrefix(iEntry, iHashTableMask) == hashPrefix && com.google.common.base.Objects.equal(key, key(i))) {
                return i;
            }
            iTableGet = com.google.common.collect.CompactHashing.getNext(iEntry, iHashTableMask);
        } while (iTableGet != 0);
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object key) {
        java.util.Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            return mapDelegateOrNull.containsKey(key);
        }
        return indexOf(key) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @javax.annotation.CheckForNull
    public V get(@javax.annotation.CheckForNull java.lang.Object key) {
        java.util.Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            return mapDelegateOrNull.get(key);
        }
        int iIndexOf = indexOf(key);
        if (iIndexOf == -1) {
            return null;
        }
        accessEntry(iIndexOf);
        return value(iIndexOf);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @javax.annotation.CheckForNull
    public V remove(@javax.annotation.CheckForNull java.lang.Object obj) {
        java.util.Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            return mapDelegateOrNull.remove(obj);
        }
        V v = (V) removeHelper(obj);
        if (v == NOT_FOUND) {
            return null;
        }
        return v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.Object removeHelper(@javax.annotation.CheckForNull java.lang.Object key) {
        if (needsAllocArrays()) {
            return NOT_FOUND;
        }
        int iHashTableMask = hashTableMask();
        int iRemove = com.google.common.collect.CompactHashing.remove(key, null, iHashTableMask, requireTable(), requireEntries(), requireKeys(), null);
        if (iRemove == -1) {
            return NOT_FOUND;
        }
        V vValue = value(iRemove);
        moveLastEntry(iRemove, iHashTableMask);
        this.size--;
        incrementModCount();
        return vValue;
    }

    void moveLastEntry(int dstIndex, int mask) {
        java.lang.Object objRequireTable = requireTable();
        int[] iArrRequireEntries = requireEntries();
        java.lang.Object[] objArrRequireKeys = requireKeys();
        java.lang.Object[] objArrRequireValues = requireValues();
        int size = size() - 1;
        if (dstIndex < size) {
            java.lang.Object obj = objArrRequireKeys[size];
            objArrRequireKeys[dstIndex] = obj;
            objArrRequireValues[dstIndex] = objArrRequireValues[size];
            objArrRequireKeys[size] = null;
            objArrRequireValues[size] = null;
            iArrRequireEntries[dstIndex] = iArrRequireEntries[size];
            iArrRequireEntries[size] = 0;
            int iSmearedHash = com.google.common.collect.Hashing.smearedHash(obj) & mask;
            int iTableGet = com.google.common.collect.CompactHashing.tableGet(objRequireTable, iSmearedHash);
            int i = size + 1;
            if (iTableGet == i) {
                com.google.common.collect.CompactHashing.tableSet(objRequireTable, iSmearedHash, dstIndex + 1);
                return;
            }
            while (true) {
                int i2 = iTableGet - 1;
                int i3 = iArrRequireEntries[i2];
                int next = com.google.common.collect.CompactHashing.getNext(i3, mask);
                if (next == i) {
                    iArrRequireEntries[i2] = com.google.common.collect.CompactHashing.maskCombine(i3, dstIndex + 1, mask);
                    return;
                }
                iTableGet = next;
            }
        } else {
            objArrRequireKeys[dstIndex] = null;
            objArrRequireValues[dstIndex] = null;
            iArrRequireEntries[dstIndex] = 0;
        }
    }

    int firstEntryIndex() {
        return isEmpty() ? -1 : 0;
    }

    int getSuccessor(int entryIndex) {
        int i = entryIndex + 1;
        if (i < this.size) {
            return i;
        }
        return -1;
    }

    private abstract class Itr<T> implements java.util.Iterator<T> {
        int currentIndex;
        int expectedMetadata;
        int indexToRemove;

        @com.google.common.collect.ParametricNullness
        abstract T getOutput(int entry);

        private Itr() {
            this.expectedMetadata = com.google.common.collect.CompactHashMap.this.metadata;
            this.currentIndex = com.google.common.collect.CompactHashMap.this.firstEntryIndex();
            this.indexToRemove = -1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.currentIndex >= 0;
        }

        @Override // java.util.Iterator
        @com.google.common.collect.ParametricNullness
        public T next() {
            checkForConcurrentModification();
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            int i = this.currentIndex;
            this.indexToRemove = i;
            T output = getOutput(i);
            this.currentIndex = com.google.common.collect.CompactHashMap.this.getSuccessor(this.currentIndex);
            return output;
        }

        @Override // java.util.Iterator
        public void remove() {
            checkForConcurrentModification();
            com.google.common.collect.CollectPreconditions.checkRemove(this.indexToRemove >= 0);
            incrementExpectedModCount();
            com.google.common.collect.CompactHashMap compactHashMap = com.google.common.collect.CompactHashMap.this;
            compactHashMap.remove(compactHashMap.key(this.indexToRemove));
            this.currentIndex = com.google.common.collect.CompactHashMap.this.adjustAfterRemove(this.currentIndex, this.indexToRemove);
            this.indexToRemove = -1;
        }

        void incrementExpectedModCount() {
            this.expectedMetadata += 32;
        }

        private void checkForConcurrentModification() {
            if (com.google.common.collect.CompactHashMap.this.metadata != this.expectedMetadata) {
                throw new java.util.ConcurrentModificationException();
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set<K> keySet() {
        java.util.Set<K> set = this.keySetView;
        if (set != null) {
            return set;
        }
        java.util.Set<K> setCreateKeySet = createKeySet();
        this.keySetView = setCreateKeySet;
        return setCreateKeySet;
    }

    java.util.Set<K> createKeySet() {
        return new com.google.common.collect.CompactHashMap.KeySetView();
    }

    class KeySetView extends java.util.AbstractSet<K> {
        KeySetView() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return com.google.common.collect.CompactHashMap.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object o) {
            return com.google.common.collect.CompactHashMap.this.containsKey(o);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@javax.annotation.CheckForNull java.lang.Object o) {
            java.util.Map<K, V> mapDelegateOrNull = com.google.common.collect.CompactHashMap.this.delegateOrNull();
            if (mapDelegateOrNull != null) {
                return mapDelegateOrNull.keySet().remove(o);
            }
            return com.google.common.collect.CompactHashMap.this.removeHelper(o) != com.google.common.collect.CompactHashMap.NOT_FOUND;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<K> iterator() {
            return com.google.common.collect.CompactHashMap.this.keySetIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            com.google.common.collect.CompactHashMap.this.clear();
        }
    }

    java.util.Iterator<K> keySetIterator() {
        java.util.Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            return mapDelegateOrNull.keySet().iterator();
        }
        return new com.google.common.collect.CompactHashMap<K, V>.Itr<K>() { // from class: com.google.common.collect.CompactHashMap.1
            @Override // com.google.common.collect.CompactHashMap.Itr
            @com.google.common.collect.ParametricNullness
            K getOutput(int i) {
                return (K) com.google.common.collect.CompactHashMap.this.key(i);
            }
        };
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        java.util.Set<java.util.Map.Entry<K, V>> set = this.entrySetView;
        if (set != null) {
            return set;
        }
        java.util.Set<java.util.Map.Entry<K, V>> setCreateEntrySet = createEntrySet();
        this.entrySetView = setCreateEntrySet;
        return setCreateEntrySet;
    }

    java.util.Set<java.util.Map.Entry<K, V>> createEntrySet() {
        return new com.google.common.collect.CompactHashMap.EntrySetView();
    }

    class EntrySetView extends java.util.AbstractSet<java.util.Map.Entry<K, V>> {
        EntrySetView() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return com.google.common.collect.CompactHashMap.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            com.google.common.collect.CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
            return com.google.common.collect.CompactHashMap.this.entrySetIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object o) {
            java.util.Map<K, V> mapDelegateOrNull = com.google.common.collect.CompactHashMap.this.delegateOrNull();
            if (mapDelegateOrNull != null) {
                return mapDelegateOrNull.entrySet().contains(o);
            }
            if (!(o instanceof java.util.Map.Entry)) {
                return false;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) o;
            int iIndexOf = com.google.common.collect.CompactHashMap.this.indexOf(entry.getKey());
            return iIndexOf != -1 && com.google.common.base.Objects.equal(com.google.common.collect.CompactHashMap.this.value(iIndexOf), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@javax.annotation.CheckForNull java.lang.Object o) {
            java.util.Map<K, V> mapDelegateOrNull = com.google.common.collect.CompactHashMap.this.delegateOrNull();
            if (mapDelegateOrNull != null) {
                return mapDelegateOrNull.entrySet().remove(o);
            }
            if (!(o instanceof java.util.Map.Entry)) {
                return false;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) o;
            if (com.google.common.collect.CompactHashMap.this.needsAllocArrays()) {
                return false;
            }
            int iHashTableMask = com.google.common.collect.CompactHashMap.this.hashTableMask();
            int iRemove = com.google.common.collect.CompactHashing.remove(entry.getKey(), entry.getValue(), iHashTableMask, com.google.common.collect.CompactHashMap.this.requireTable(), com.google.common.collect.CompactHashMap.this.requireEntries(), com.google.common.collect.CompactHashMap.this.requireKeys(), com.google.common.collect.CompactHashMap.this.requireValues());
            if (iRemove == -1) {
                return false;
            }
            com.google.common.collect.CompactHashMap.this.moveLastEntry(iRemove, iHashTableMask);
            com.google.common.collect.CompactHashMap.access$1210(com.google.common.collect.CompactHashMap.this);
            com.google.common.collect.CompactHashMap.this.incrementModCount();
            return true;
        }
    }

    java.util.Iterator<java.util.Map.Entry<K, V>> entrySetIterator() {
        java.util.Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            return mapDelegateOrNull.entrySet().iterator();
        }
        return new com.google.common.collect.CompactHashMap<K, V>.Itr<java.util.Map.Entry<K, V>>() { // from class: com.google.common.collect.CompactHashMap.2
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.CompactHashMap.Itr
            public java.util.Map.Entry<K, V> getOutput(int entry) {
                return new com.google.common.collect.CompactHashMap.MapEntry(entry);
            }
        };
    }

    final class MapEntry extends com.google.common.collect.AbstractMapEntry<K, V> {

        @com.google.common.collect.ParametricNullness
        private final K key;
        private int lastKnownIndex;

        MapEntry(int i) {
            this.key = (K) com.google.common.collect.CompactHashMap.this.key(i);
            this.lastKnownIndex = i;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @com.google.common.collect.ParametricNullness
        public K getKey() {
            return this.key;
        }

        private void updateLastKnownIndex() {
            int i = this.lastKnownIndex;
            if (i == -1 || i >= com.google.common.collect.CompactHashMap.this.size() || !com.google.common.base.Objects.equal(this.key, com.google.common.collect.CompactHashMap.this.key(this.lastKnownIndex))) {
                this.lastKnownIndex = com.google.common.collect.CompactHashMap.this.indexOf(this.key);
            }
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @com.google.common.collect.ParametricNullness
        public V getValue() {
            java.util.Map<K, V> mapDelegateOrNull = com.google.common.collect.CompactHashMap.this.delegateOrNull();
            if (mapDelegateOrNull != null) {
                return (V) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(mapDelegateOrNull.get(this.key));
            }
            updateLastKnownIndex();
            int i = this.lastKnownIndex;
            return i == -1 ? (V) com.google.common.collect.NullnessCasts.unsafeNull() : (V) com.google.common.collect.CompactHashMap.this.value(i);
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @com.google.common.collect.ParametricNullness
        public V setValue(@com.google.common.collect.ParametricNullness V v) {
            java.util.Map<K, V> mapDelegateOrNull = com.google.common.collect.CompactHashMap.this.delegateOrNull();
            if (mapDelegateOrNull != null) {
                return (V) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(mapDelegateOrNull.put(this.key, v));
            }
            updateLastKnownIndex();
            int i = this.lastKnownIndex;
            if (i != -1) {
                V v2 = (V) com.google.common.collect.CompactHashMap.this.value(i);
                com.google.common.collect.CompactHashMap.this.setValue(this.lastKnownIndex, v);
                return v2;
            }
            com.google.common.collect.CompactHashMap.this.put(this.key, v);
            return (V) com.google.common.collect.NullnessCasts.unsafeNull();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        java.util.Map<K, V> mapDelegateOrNull = delegateOrNull();
        return mapDelegateOrNull != null ? mapDelegateOrNull.size() : this.size;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@javax.annotation.CheckForNull java.lang.Object value) {
        java.util.Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            return mapDelegateOrNull.containsValue(value);
        }
        for (int i = 0; i < this.size; i++) {
            if (com.google.common.base.Objects.equal(value, value(i))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Collection<V> values() {
        java.util.Collection<V> collection = this.valuesView;
        if (collection != null) {
            return collection;
        }
        java.util.Collection<V> collectionCreateValues = createValues();
        this.valuesView = collectionCreateValues;
        return collectionCreateValues;
    }

    java.util.Collection<V> createValues() {
        return new com.google.common.collect.CompactHashMap.ValuesView();
    }

    class ValuesView extends java.util.AbstractCollection<V> {
        ValuesView() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return com.google.common.collect.CompactHashMap.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            com.google.common.collect.CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<V> iterator() {
            return com.google.common.collect.CompactHashMap.this.valuesIterator();
        }
    }

    java.util.Iterator<V> valuesIterator() {
        java.util.Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            return mapDelegateOrNull.values().iterator();
        }
        return new com.google.common.collect.CompactHashMap<K, V>.Itr<V>() { // from class: com.google.common.collect.CompactHashMap.3
            @Override // com.google.common.collect.CompactHashMap.Itr
            @com.google.common.collect.ParametricNullness
            V getOutput(int i) {
                return (V) com.google.common.collect.CompactHashMap.this.value(i);
            }
        };
    }

    public void trimToSize() {
        if (needsAllocArrays()) {
            return;
        }
        java.util.Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            java.util.Map<K, V> mapCreateHashFloodingResistantDelegate = createHashFloodingResistantDelegate(size());
            mapCreateHashFloodingResistantDelegate.putAll(mapDelegateOrNull);
            this.table = mapCreateHashFloodingResistantDelegate;
            return;
        }
        int i = this.size;
        if (i < requireEntries().length) {
            resizeEntries(i);
        }
        int iTableSize = com.google.common.collect.CompactHashing.tableSize(i);
        int iHashTableMask = hashTableMask();
        if (iTableSize < iHashTableMask) {
            resizeTable(iHashTableMask, iTableSize, 0, 0);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (needsAllocArrays()) {
            return;
        }
        incrementModCount();
        java.util.Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            this.metadata = com.google.common.primitives.Ints.constrainToRange(size(), 3, kotlinx.coroutines.internal.LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
            mapDelegateOrNull.clear();
            this.table = null;
            this.size = 0;
            return;
        }
        java.util.Arrays.fill(requireKeys(), 0, this.size, (java.lang.Object) null);
        java.util.Arrays.fill(requireValues(), 0, this.size, (java.lang.Object) null);
        com.google.common.collect.CompactHashing.tableClear(requireTable());
        java.util.Arrays.fill(requireEntries(), 0, this.size, 0);
        this.size = 0;
    }

    private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
        stream.defaultWriteObject();
        stream.writeInt(size());
        java.util.Iterator<java.util.Map.Entry<K, V>> itEntrySetIterator = entrySetIterator();
        while (itEntrySetIterator.hasNext()) {
            java.util.Map.Entry<K, V> next = itEntrySetIterator.next();
            stream.writeObject(next.getKey());
            stream.writeObject(next.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(java.io.ObjectInputStream stream) throws java.lang.ClassNotFoundException, java.io.IOException {
        stream.defaultReadObject();
        int i = stream.readInt();
        if (i < 0) {
            throw new java.io.InvalidObjectException("Invalid size: " + i);
        }
        init(i);
        for (int i2 = 0; i2 < i; i2++) {
            put(stream.readObject(), stream.readObject());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.Object requireTable() {
        return java.util.Objects.requireNonNull(this.table);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] requireEntries() {
        return (int[]) java.util.Objects.requireNonNull(this.entries);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.Object[] requireKeys() {
        return (java.lang.Object[]) java.util.Objects.requireNonNull(this.keys);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.Object[] requireValues() {
        return (java.lang.Object[]) java.util.Objects.requireNonNull(this.values);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public K key(int i) {
        return (K) requireKeys()[i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V value(int i) {
        return (V) requireValues()[i];
    }

    private int entry(int i) {
        return requireEntries()[i];
    }

    private void setKey(int i, K key) {
        requireKeys()[i] = key;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(int i, V value) {
        requireValues()[i] = value;
    }

    private void setEntry(int i, int value) {
        requireEntries()[i] = value;
    }
}
