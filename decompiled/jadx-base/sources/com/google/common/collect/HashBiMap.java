package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public final class HashBiMap<K, V> extends java.util.AbstractMap<K, V> implements com.google.common.collect.BiMap<K, V>, java.io.Serializable {
    private static final int ABSENT = -1;
    private static final int ENDPOINT = -2;

    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.util.Set<java.util.Map.Entry<K, V>> entrySet;
    private transient int firstInInsertionOrder;
    private transient int[] hashTableKToV;
    private transient int[] hashTableVToK;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.collect.BiMap<V, K> inverse;

    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.util.Set<K> keySet;
    transient K[] keys;
    private transient int lastInInsertionOrder;
    transient int modCount;
    private transient int[] nextInBucketKToV;
    private transient int[] nextInBucketVToK;
    private transient int[] nextInInsertionOrder;
    private transient int[] prevInInsertionOrder;
    transient int size;

    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.util.Set<V> valueSet;
    transient V[] values;

    public static <K, V> com.google.common.collect.HashBiMap<K, V> create() {
        return create(16);
    }

    public static <K, V> com.google.common.collect.HashBiMap<K, V> create(int expectedSize) {
        return new com.google.common.collect.HashBiMap<>(expectedSize);
    }

    public static <K, V> com.google.common.collect.HashBiMap<K, V> create(java.util.Map<? extends K, ? extends V> map) {
        com.google.common.collect.HashBiMap<K, V> hashBiMapCreate = create(map.size());
        hashBiMapCreate.putAll(map);
        return hashBiMapCreate;
    }

    private HashBiMap(int expectedSize) {
        init(expectedSize);
    }

    void init(int i) {
        com.google.common.collect.CollectPreconditions.checkNonnegative(i, "expectedSize");
        int iClosedTableSize = com.google.common.collect.Hashing.closedTableSize(i, 1.0d);
        this.size = 0;
        this.keys = (K[]) new java.lang.Object[i];
        this.values = (V[]) new java.lang.Object[i];
        this.hashTableKToV = createFilledWithAbsent(iClosedTableSize);
        this.hashTableVToK = createFilledWithAbsent(iClosedTableSize);
        this.nextInBucketKToV = createFilledWithAbsent(i);
        this.nextInBucketVToK = createFilledWithAbsent(i);
        this.firstInInsertionOrder = -2;
        this.lastInInsertionOrder = -2;
        this.prevInInsertionOrder = createFilledWithAbsent(i);
        this.nextInInsertionOrder = createFilledWithAbsent(i);
    }

    private static int[] createFilledWithAbsent(int size) {
        int[] iArr = new int[size];
        java.util.Arrays.fill(iArr, -1);
        return iArr;
    }

    private static int[] expandAndFillWithAbsent(int[] array, int newSize) {
        int length = array.length;
        int[] iArrCopyOf = java.util.Arrays.copyOf(array, newSize);
        java.util.Arrays.fill(iArrCopyOf, length, newSize, -1);
        return iArrCopyOf;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.size;
    }

    private void ensureCapacity(int i) {
        int[] iArr = this.nextInBucketKToV;
        if (iArr.length < i) {
            int iExpandedCapacity = com.google.common.collect.ImmutableCollection.Builder.expandedCapacity(iArr.length, i);
            this.keys = (K[]) java.util.Arrays.copyOf(this.keys, iExpandedCapacity);
            this.values = (V[]) java.util.Arrays.copyOf(this.values, iExpandedCapacity);
            this.nextInBucketKToV = expandAndFillWithAbsent(this.nextInBucketKToV, iExpandedCapacity);
            this.nextInBucketVToK = expandAndFillWithAbsent(this.nextInBucketVToK, iExpandedCapacity);
            this.prevInInsertionOrder = expandAndFillWithAbsent(this.prevInInsertionOrder, iExpandedCapacity);
            this.nextInInsertionOrder = expandAndFillWithAbsent(this.nextInInsertionOrder, iExpandedCapacity);
        }
        if (this.hashTableKToV.length < i) {
            int iClosedTableSize = com.google.common.collect.Hashing.closedTableSize(i, 1.0d);
            this.hashTableKToV = createFilledWithAbsent(iClosedTableSize);
            this.hashTableVToK = createFilledWithAbsent(iClosedTableSize);
            for (int i2 = 0; i2 < this.size; i2++) {
                int iBucket = bucket(com.google.common.collect.Hashing.smearedHash(this.keys[i2]));
                int[] iArr2 = this.nextInBucketKToV;
                int[] iArr3 = this.hashTableKToV;
                iArr2[i2] = iArr3[iBucket];
                iArr3[iBucket] = i2;
                int iBucket2 = bucket(com.google.common.collect.Hashing.smearedHash(this.values[i2]));
                int[] iArr4 = this.nextInBucketVToK;
                int[] iArr5 = this.hashTableVToK;
                iArr4[i2] = iArr5[iBucket2];
                iArr5[iBucket2] = i2;
            }
        }
    }

    private int bucket(int hash) {
        return hash & (this.hashTableKToV.length - 1);
    }

    int findEntryByKey(@javax.annotation.CheckForNull java.lang.Object key) {
        return findEntryByKey(key, com.google.common.collect.Hashing.smearedHash(key));
    }

    int findEntryByKey(@javax.annotation.CheckForNull java.lang.Object key, int keyHash) {
        return findEntry(key, keyHash, this.hashTableKToV, this.nextInBucketKToV, this.keys);
    }

    int findEntryByValue(@javax.annotation.CheckForNull java.lang.Object value) {
        return findEntryByValue(value, com.google.common.collect.Hashing.smearedHash(value));
    }

    int findEntryByValue(@javax.annotation.CheckForNull java.lang.Object value, int valueHash) {
        return findEntry(value, valueHash, this.hashTableVToK, this.nextInBucketVToK, this.values);
    }

    int findEntry(@javax.annotation.CheckForNull java.lang.Object o, int oHash, int[] hashTable, int[] nextInBucket, java.lang.Object[] array) {
        int i = hashTable[bucket(oHash)];
        while (i != -1) {
            if (com.google.common.base.Objects.equal(array[i], o)) {
                return i;
            }
            i = nextInBucket[i];
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object key) {
        return findEntryByKey(key) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@javax.annotation.CheckForNull java.lang.Object value) {
        return findEntryByValue(value) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @javax.annotation.CheckForNull
    public V get(@javax.annotation.CheckForNull java.lang.Object key) {
        int iFindEntryByKey = findEntryByKey(key);
        if (iFindEntryByKey == -1) {
            return null;
        }
        return this.values[iFindEntryByKey];
    }

    @javax.annotation.CheckForNull
    K getInverse(@javax.annotation.CheckForNull java.lang.Object value) {
        int iFindEntryByValue = findEntryByValue(value);
        if (iFindEntryByValue == -1) {
            return null;
        }
        return this.keys[iFindEntryByValue];
    }

    @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
    @javax.annotation.CheckForNull
    public V put(@com.google.common.collect.ParametricNullness K key, @com.google.common.collect.ParametricNullness V value) {
        return put(key, value, false);
    }

    @javax.annotation.CheckForNull
    V put(@com.google.common.collect.ParametricNullness K key, @com.google.common.collect.ParametricNullness V value, boolean force) {
        int iSmearedHash = com.google.common.collect.Hashing.smearedHash(key);
        int iFindEntryByKey = findEntryByKey(key, iSmearedHash);
        if (iFindEntryByKey != -1) {
            V v = this.values[iFindEntryByKey];
            if (com.google.common.base.Objects.equal(v, value)) {
                return value;
            }
            replaceValueInEntry(iFindEntryByKey, value, force);
            return v;
        }
        int iSmearedHash2 = com.google.common.collect.Hashing.smearedHash(value);
        int iFindEntryByValue = findEntryByValue(value, iSmearedHash2);
        if (!force) {
            com.google.common.base.Preconditions.checkArgument(iFindEntryByValue == -1, "Value already present: %s", value);
        } else if (iFindEntryByValue != -1) {
            removeEntryValueHashKnown(iFindEntryByValue, iSmearedHash2);
        }
        ensureCapacity(this.size + 1);
        K[] kArr = this.keys;
        int i = this.size;
        kArr[i] = key;
        this.values[i] = value;
        insertIntoTableKToV(i, iSmearedHash);
        insertIntoTableVToK(this.size, iSmearedHash2);
        setSucceeds(this.lastInInsertionOrder, this.size);
        setSucceeds(this.size, -2);
        this.size++;
        this.modCount++;
        return null;
    }

    @Override // com.google.common.collect.BiMap
    @javax.annotation.CheckForNull
    public V forcePut(@com.google.common.collect.ParametricNullness K key, @com.google.common.collect.ParametricNullness V value) {
        return put(key, value, true);
    }

    @javax.annotation.CheckForNull
    K putInverse(@com.google.common.collect.ParametricNullness V value, @com.google.common.collect.ParametricNullness K key, boolean force) {
        int iSmearedHash = com.google.common.collect.Hashing.smearedHash(value);
        int iFindEntryByValue = findEntryByValue(value, iSmearedHash);
        if (iFindEntryByValue != -1) {
            K k = this.keys[iFindEntryByValue];
            if (com.google.common.base.Objects.equal(k, key)) {
                return key;
            }
            replaceKeyInEntry(iFindEntryByValue, key, force);
            return k;
        }
        int i = this.lastInInsertionOrder;
        int iSmearedHash2 = com.google.common.collect.Hashing.smearedHash(key);
        int iFindEntryByKey = findEntryByKey(key, iSmearedHash2);
        if (!force) {
            com.google.common.base.Preconditions.checkArgument(iFindEntryByKey == -1, "Key already present: %s", key);
        } else if (iFindEntryByKey != -1) {
            i = this.prevInInsertionOrder[iFindEntryByKey];
            removeEntryKeyHashKnown(iFindEntryByKey, iSmearedHash2);
        }
        ensureCapacity(this.size + 1);
        K[] kArr = this.keys;
        int i2 = this.size;
        kArr[i2] = key;
        this.values[i2] = value;
        insertIntoTableKToV(i2, iSmearedHash2);
        insertIntoTableVToK(this.size, iSmearedHash);
        int i3 = i == -2 ? this.firstInInsertionOrder : this.nextInInsertionOrder[i];
        setSucceeds(i, this.size);
        setSucceeds(this.size, i3);
        this.size++;
        this.modCount++;
        return null;
    }

    private void setSucceeds(int prev, int next) {
        if (prev == -2) {
            this.firstInInsertionOrder = next;
        } else {
            this.nextInInsertionOrder[prev] = next;
        }
        if (next == -2) {
            this.lastInInsertionOrder = prev;
        } else {
            this.prevInInsertionOrder[next] = prev;
        }
    }

    private void insertIntoTableKToV(int entry, int keyHash) {
        com.google.common.base.Preconditions.checkArgument(entry != -1);
        int iBucket = bucket(keyHash);
        int[] iArr = this.nextInBucketKToV;
        int[] iArr2 = this.hashTableKToV;
        iArr[entry] = iArr2[iBucket];
        iArr2[iBucket] = entry;
    }

    private void insertIntoTableVToK(int entry, int valueHash) {
        com.google.common.base.Preconditions.checkArgument(entry != -1);
        int iBucket = bucket(valueHash);
        int[] iArr = this.nextInBucketVToK;
        int[] iArr2 = this.hashTableVToK;
        iArr[entry] = iArr2[iBucket];
        iArr2[iBucket] = entry;
    }

    private void deleteFromTableKToV(int entry, int keyHash) {
        com.google.common.base.Preconditions.checkArgument(entry != -1);
        int iBucket = bucket(keyHash);
        int[] iArr = this.hashTableKToV;
        int i = iArr[iBucket];
        if (i == entry) {
            int[] iArr2 = this.nextInBucketKToV;
            iArr[iBucket] = iArr2[entry];
            iArr2[entry] = -1;
            return;
        }
        int i2 = this.nextInBucketKToV[i];
        while (true) {
            int i3 = i;
            i = i2;
            if (i == -1) {
                throw new java.lang.AssertionError("Expected to find entry with key " + this.keys[entry]);
            }
            if (i != entry) {
                i2 = this.nextInBucketKToV[i];
            } else {
                int[] iArr3 = this.nextInBucketKToV;
                iArr3[i3] = iArr3[entry];
                iArr3[entry] = -1;
                return;
            }
        }
    }

    private void deleteFromTableVToK(int entry, int valueHash) {
        com.google.common.base.Preconditions.checkArgument(entry != -1);
        int iBucket = bucket(valueHash);
        int[] iArr = this.hashTableVToK;
        int i = iArr[iBucket];
        if (i == entry) {
            int[] iArr2 = this.nextInBucketVToK;
            iArr[iBucket] = iArr2[entry];
            iArr2[entry] = -1;
            return;
        }
        int i2 = this.nextInBucketVToK[i];
        while (true) {
            int i3 = i;
            i = i2;
            if (i == -1) {
                throw new java.lang.AssertionError("Expected to find entry with value " + this.values[entry]);
            }
            if (i != entry) {
                i2 = this.nextInBucketVToK[i];
            } else {
                int[] iArr3 = this.nextInBucketVToK;
                iArr3[i3] = iArr3[entry];
                iArr3[entry] = -1;
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void replaceValueInEntry(int entry, @com.google.common.collect.ParametricNullness V newValue, boolean force) {
        com.google.common.base.Preconditions.checkArgument(entry != -1);
        int iSmearedHash = com.google.common.collect.Hashing.smearedHash(newValue);
        int iFindEntryByValue = findEntryByValue(newValue, iSmearedHash);
        if (iFindEntryByValue != -1) {
            if (force) {
                removeEntryValueHashKnown(iFindEntryByValue, iSmearedHash);
                if (entry == this.size) {
                    entry = iFindEntryByValue;
                }
            } else {
                throw new java.lang.IllegalArgumentException("Value already present in map: " + newValue);
            }
        }
        deleteFromTableVToK(entry, com.google.common.collect.Hashing.smearedHash(this.values[entry]));
        this.values[entry] = newValue;
        insertIntoTableVToK(entry, iSmearedHash);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void replaceKeyInEntry(int entry, @com.google.common.collect.ParametricNullness K newKey, boolean force) {
        int i;
        com.google.common.base.Preconditions.checkArgument(entry != -1);
        int iSmearedHash = com.google.common.collect.Hashing.smearedHash(newKey);
        int iFindEntryByKey = findEntryByKey(newKey, iSmearedHash);
        int i2 = this.lastInInsertionOrder;
        if (iFindEntryByKey == -1) {
            i = -2;
        } else if (force) {
            i2 = this.prevInInsertionOrder[iFindEntryByKey];
            i = this.nextInInsertionOrder[iFindEntryByKey];
            removeEntryKeyHashKnown(iFindEntryByKey, iSmearedHash);
            if (entry == this.size) {
                entry = iFindEntryByKey;
            }
        } else {
            throw new java.lang.IllegalArgumentException("Key already present in map: " + newKey);
        }
        if (i2 == entry) {
            i2 = this.prevInInsertionOrder[entry];
        } else if (i2 == this.size) {
            i2 = iFindEntryByKey;
        }
        if (i == entry) {
            iFindEntryByKey = this.nextInInsertionOrder[entry];
        } else if (i != this.size) {
            iFindEntryByKey = i;
        }
        setSucceeds(this.prevInInsertionOrder[entry], this.nextInInsertionOrder[entry]);
        deleteFromTableKToV(entry, com.google.common.collect.Hashing.smearedHash(this.keys[entry]));
        this.keys[entry] = newKey;
        insertIntoTableKToV(entry, com.google.common.collect.Hashing.smearedHash(newKey));
        setSucceeds(i2, entry);
        setSucceeds(entry, iFindEntryByKey);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @javax.annotation.CheckForNull
    public V remove(@javax.annotation.CheckForNull java.lang.Object key) {
        int iSmearedHash = com.google.common.collect.Hashing.smearedHash(key);
        int iFindEntryByKey = findEntryByKey(key, iSmearedHash);
        if (iFindEntryByKey == -1) {
            return null;
        }
        V v = this.values[iFindEntryByKey];
        removeEntryKeyHashKnown(iFindEntryByKey, iSmearedHash);
        return v;
    }

    @javax.annotation.CheckForNull
    K removeInverse(@javax.annotation.CheckForNull java.lang.Object value) {
        int iSmearedHash = com.google.common.collect.Hashing.smearedHash(value);
        int iFindEntryByValue = findEntryByValue(value, iSmearedHash);
        if (iFindEntryByValue == -1) {
            return null;
        }
        K k = this.keys[iFindEntryByValue];
        removeEntryValueHashKnown(iFindEntryByValue, iSmearedHash);
        return k;
    }

    void removeEntry(int entry) {
        removeEntryKeyHashKnown(entry, com.google.common.collect.Hashing.smearedHash(this.keys[entry]));
    }

    private void removeEntry(int entry, int keyHash, int valueHash) {
        com.google.common.base.Preconditions.checkArgument(entry != -1);
        deleteFromTableKToV(entry, keyHash);
        deleteFromTableVToK(entry, valueHash);
        setSucceeds(this.prevInInsertionOrder[entry], this.nextInInsertionOrder[entry]);
        moveEntryToIndex(this.size - 1, entry);
        K[] kArr = this.keys;
        int i = this.size;
        kArr[i - 1] = null;
        this.values[i - 1] = null;
        this.size = i - 1;
        this.modCount++;
    }

    void removeEntryKeyHashKnown(int entry, int keyHash) {
        removeEntry(entry, keyHash, com.google.common.collect.Hashing.smearedHash(this.values[entry]));
    }

    void removeEntryValueHashKnown(int entry, int valueHash) {
        removeEntry(entry, com.google.common.collect.Hashing.smearedHash(this.keys[entry]), valueHash);
    }

    private void moveEntryToIndex(int src, int dest) {
        int i;
        int i2;
        if (src == dest) {
            return;
        }
        int i3 = this.prevInInsertionOrder[src];
        int i4 = this.nextInInsertionOrder[src];
        setSucceeds(i3, dest);
        setSucceeds(dest, i4);
        K[] kArr = this.keys;
        K k = kArr[src];
        V[] vArr = this.values;
        V v = vArr[src];
        kArr[dest] = k;
        vArr[dest] = v;
        int iBucket = bucket(com.google.common.collect.Hashing.smearedHash(k));
        int[] iArr = this.hashTableKToV;
        int i5 = iArr[iBucket];
        if (i5 == src) {
            iArr[iBucket] = dest;
        } else {
            int i6 = this.nextInBucketKToV[i5];
            while (true) {
                i = i5;
                i5 = i6;
                if (i5 == src) {
                    break;
                } else {
                    i6 = this.nextInBucketKToV[i5];
                }
            }
            this.nextInBucketKToV[i] = dest;
        }
        int[] iArr2 = this.nextInBucketKToV;
        iArr2[dest] = iArr2[src];
        iArr2[src] = -1;
        int iBucket2 = bucket(com.google.common.collect.Hashing.smearedHash(v));
        int[] iArr3 = this.hashTableVToK;
        int i7 = iArr3[iBucket2];
        if (i7 == src) {
            iArr3[iBucket2] = dest;
        } else {
            int i8 = this.nextInBucketVToK[i7];
            while (true) {
                i2 = i7;
                i7 = i8;
                if (i7 == src) {
                    break;
                } else {
                    i8 = this.nextInBucketVToK[i7];
                }
            }
            this.nextInBucketVToK[i2] = dest;
        }
        int[] iArr4 = this.nextInBucketVToK;
        iArr4[dest] = iArr4[src];
        iArr4[src] = -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        java.util.Arrays.fill(this.keys, 0, this.size, (java.lang.Object) null);
        java.util.Arrays.fill(this.values, 0, this.size, (java.lang.Object) null);
        java.util.Arrays.fill(this.hashTableKToV, -1);
        java.util.Arrays.fill(this.hashTableVToK, -1);
        java.util.Arrays.fill(this.nextInBucketKToV, 0, this.size, -1);
        java.util.Arrays.fill(this.nextInBucketVToK, 0, this.size, -1);
        java.util.Arrays.fill(this.prevInInsertionOrder, 0, this.size, -1);
        java.util.Arrays.fill(this.nextInInsertionOrder, 0, this.size, -1);
        this.size = 0;
        this.firstInInsertionOrder = -2;
        this.lastInInsertionOrder = -2;
        this.modCount++;
    }

    static abstract class View<K, V, T> extends java.util.AbstractSet<T> {
        final com.google.common.collect.HashBiMap<K, V> biMap;

        @com.google.common.collect.ParametricNullness
        abstract T forEntry(int entry);

        View(com.google.common.collect.HashBiMap<K, V> biMap) {
            this.biMap = biMap;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<T> iterator() {
            return new java.util.Iterator<T>() { // from class: com.google.common.collect.HashBiMap.View.1
                private int expectedModCount;
                private int index;
                private int indexToRemove = -1;
                private int remaining;

                {
                    this.index = ((com.google.common.collect.HashBiMap) com.google.common.collect.HashBiMap.View.this.biMap).firstInInsertionOrder;
                    this.expectedModCount = com.google.common.collect.HashBiMap.View.this.biMap.modCount;
                    this.remaining = com.google.common.collect.HashBiMap.View.this.biMap.size;
                }

                private void checkForComodification() {
                    if (com.google.common.collect.HashBiMap.View.this.biMap.modCount != this.expectedModCount) {
                        throw new java.util.ConcurrentModificationException();
                    }
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    checkForComodification();
                    return this.index != -2 && this.remaining > 0;
                }

                @Override // java.util.Iterator
                @com.google.common.collect.ParametricNullness
                public T next() {
                    if (!hasNext()) {
                        throw new java.util.NoSuchElementException();
                    }
                    T t = (T) com.google.common.collect.HashBiMap.View.this.forEntry(this.index);
                    this.indexToRemove = this.index;
                    this.index = ((com.google.common.collect.HashBiMap) com.google.common.collect.HashBiMap.View.this.biMap).nextInInsertionOrder[this.index];
                    this.remaining--;
                    return t;
                }

                @Override // java.util.Iterator
                public void remove() {
                    checkForComodification();
                    com.google.common.collect.CollectPreconditions.checkRemove(this.indexToRemove != -1);
                    com.google.common.collect.HashBiMap.View.this.biMap.removeEntry(this.indexToRemove);
                    if (this.index == com.google.common.collect.HashBiMap.View.this.biMap.size) {
                        this.index = this.indexToRemove;
                    }
                    this.indexToRemove = -1;
                    this.expectedModCount = com.google.common.collect.HashBiMap.View.this.biMap.modCount;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.biMap.size;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.biMap.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set<K> keySet() {
        java.util.Set<K> set = this.keySet;
        if (set != null) {
            return set;
        }
        com.google.common.collect.HashBiMap.KeySet keySet = new com.google.common.collect.HashBiMap.KeySet();
        this.keySet = keySet;
        return keySet;
    }

    final class KeySet extends com.google.common.collect.HashBiMap.View<K, V, K> {
        KeySet() {
            super(com.google.common.collect.HashBiMap.this);
        }

        @Override // com.google.common.collect.HashBiMap.View
        @com.google.common.collect.ParametricNullness
        K forEntry(int i) {
            return (K) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(com.google.common.collect.HashBiMap.this.keys[i]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object o) {
            return com.google.common.collect.HashBiMap.this.containsKey(o);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@javax.annotation.CheckForNull java.lang.Object o) {
            int iSmearedHash = com.google.common.collect.Hashing.smearedHash(o);
            int iFindEntryByKey = com.google.common.collect.HashBiMap.this.findEntryByKey(o, iSmearedHash);
            if (iFindEntryByKey == -1) {
                return false;
            }
            com.google.common.collect.HashBiMap.this.removeEntryKeyHashKnown(iFindEntryByKey, iSmearedHash);
            return true;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
    public java.util.Set<V> values() {
        java.util.Set<V> set = this.valueSet;
        if (set != null) {
            return set;
        }
        com.google.common.collect.HashBiMap.ValueSet valueSet = new com.google.common.collect.HashBiMap.ValueSet();
        this.valueSet = valueSet;
        return valueSet;
    }

    final class ValueSet extends com.google.common.collect.HashBiMap.View<K, V, V> {
        ValueSet() {
            super(com.google.common.collect.HashBiMap.this);
        }

        @Override // com.google.common.collect.HashBiMap.View
        @com.google.common.collect.ParametricNullness
        V forEntry(int i) {
            return (V) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(com.google.common.collect.HashBiMap.this.values[i]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object o) {
            return com.google.common.collect.HashBiMap.this.containsValue(o);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@javax.annotation.CheckForNull java.lang.Object o) {
            int iSmearedHash = com.google.common.collect.Hashing.smearedHash(o);
            int iFindEntryByValue = com.google.common.collect.HashBiMap.this.findEntryByValue(o, iSmearedHash);
            if (iFindEntryByValue == -1) {
                return false;
            }
            com.google.common.collect.HashBiMap.this.removeEntryValueHashKnown(iFindEntryByValue, iSmearedHash);
            return true;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        java.util.Set<java.util.Map.Entry<K, V>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        com.google.common.collect.HashBiMap.EntrySet entrySet = new com.google.common.collect.HashBiMap.EntrySet();
        this.entrySet = entrySet;
        return entrySet;
    }

    final class EntrySet extends com.google.common.collect.HashBiMap.View<K, V, java.util.Map.Entry<K, V>> {
        EntrySet() {
            super(com.google.common.collect.HashBiMap.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object o) {
            if (!(o instanceof java.util.Map.Entry)) {
                return false;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) o;
            java.lang.Object key = entry.getKey();
            java.lang.Object value = entry.getValue();
            int iFindEntryByKey = com.google.common.collect.HashBiMap.this.findEntryByKey(key);
            return iFindEntryByKey != -1 && com.google.common.base.Objects.equal(value, com.google.common.collect.HashBiMap.this.values[iFindEntryByKey]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@javax.annotation.CheckForNull java.lang.Object o) {
            if (!(o instanceof java.util.Map.Entry)) {
                return false;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) o;
            java.lang.Object key = entry.getKey();
            java.lang.Object value = entry.getValue();
            int iSmearedHash = com.google.common.collect.Hashing.smearedHash(key);
            int iFindEntryByKey = com.google.common.collect.HashBiMap.this.findEntryByKey(key, iSmearedHash);
            if (iFindEntryByKey == -1 || !com.google.common.base.Objects.equal(value, com.google.common.collect.HashBiMap.this.values[iFindEntryByKey])) {
                return false;
            }
            com.google.common.collect.HashBiMap.this.removeEntryKeyHashKnown(iFindEntryByKey, iSmearedHash);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.HashBiMap.View
        public java.util.Map.Entry<K, V> forEntry(int entry) {
            return new com.google.common.collect.HashBiMap.EntryForKey(entry);
        }
    }

    final class EntryForKey extends com.google.common.collect.AbstractMapEntry<K, V> {
        int index;

        @com.google.common.collect.ParametricNullness
        final K key;

        EntryForKey(int i) {
            this.key = (K) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(com.google.common.collect.HashBiMap.this.keys[i]);
            this.index = i;
        }

        void updateIndex() {
            int i = this.index;
            if (i == -1 || i > com.google.common.collect.HashBiMap.this.size || !com.google.common.base.Objects.equal(com.google.common.collect.HashBiMap.this.keys[this.index], this.key)) {
                this.index = com.google.common.collect.HashBiMap.this.findEntryByKey(this.key);
            }
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @com.google.common.collect.ParametricNullness
        public K getKey() {
            return this.key;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @com.google.common.collect.ParametricNullness
        public V getValue() {
            updateIndex();
            return this.index == -1 ? (V) com.google.common.collect.NullnessCasts.unsafeNull() : (V) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(com.google.common.collect.HashBiMap.this.values[this.index]);
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @com.google.common.collect.ParametricNullness
        public V setValue(@com.google.common.collect.ParametricNullness V v) {
            updateIndex();
            if (this.index == -1) {
                com.google.common.collect.HashBiMap.this.put(this.key, v);
                return (V) com.google.common.collect.NullnessCasts.unsafeNull();
            }
            V v2 = (V) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(com.google.common.collect.HashBiMap.this.values[this.index]);
            if (com.google.common.base.Objects.equal(v2, v)) {
                return v;
            }
            com.google.common.collect.HashBiMap.this.replaceValueInEntry(this.index, v, false);
            return v2;
        }
    }

    @Override // com.google.common.collect.BiMap
    public com.google.common.collect.BiMap<V, K> inverse() {
        com.google.common.collect.BiMap<V, K> biMap = this.inverse;
        if (biMap != null) {
            return biMap;
        }
        com.google.common.collect.HashBiMap.Inverse inverse = new com.google.common.collect.HashBiMap.Inverse(this);
        this.inverse = inverse;
        return inverse;
    }

    static class Inverse<K, V> extends java.util.AbstractMap<V, K> implements com.google.common.collect.BiMap<V, K>, java.io.Serializable {
        private final com.google.common.collect.HashBiMap<K, V> forward;
        private transient java.util.Set<java.util.Map.Entry<V, K>> inverseEntrySet;

        Inverse(com.google.common.collect.HashBiMap<K, V> forward) {
            this.forward = forward;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.forward.size;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object key) {
            return this.forward.containsValue(key);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public K get(@javax.annotation.CheckForNull java.lang.Object key) {
            return this.forward.getInverse(key);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsValue(@javax.annotation.CheckForNull java.lang.Object value) {
            return this.forward.containsKey(value);
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        @javax.annotation.CheckForNull
        public K put(@com.google.common.collect.ParametricNullness V value, @com.google.common.collect.ParametricNullness K key) {
            return this.forward.putInverse(value, key, false);
        }

        @Override // com.google.common.collect.BiMap
        @javax.annotation.CheckForNull
        public K forcePut(@com.google.common.collect.ParametricNullness V value, @com.google.common.collect.ParametricNullness K key) {
            return this.forward.putInverse(value, key, true);
        }

        @Override // com.google.common.collect.BiMap
        public com.google.common.collect.BiMap<K, V> inverse() {
            return this.forward;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public K remove(@javax.annotation.CheckForNull java.lang.Object value) {
            return this.forward.removeInverse(value);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            this.forward.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public java.util.Set<V> keySet() {
            return this.forward.values();
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        public java.util.Set<K> values() {
            return this.forward.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public java.util.Set<java.util.Map.Entry<V, K>> entrySet() {
            java.util.Set<java.util.Map.Entry<V, K>> set = this.inverseEntrySet;
            if (set != null) {
                return set;
            }
            com.google.common.collect.HashBiMap.InverseEntrySet inverseEntrySet = new com.google.common.collect.HashBiMap.InverseEntrySet(this.forward);
            this.inverseEntrySet = inverseEntrySet;
            return inverseEntrySet;
        }

        private void readObject(java.io.ObjectInputStream in) throws java.lang.ClassNotFoundException, java.io.IOException {
            in.defaultReadObject();
            ((com.google.common.collect.HashBiMap) this.forward).inverse = this;
        }
    }

    static class InverseEntrySet<K, V> extends com.google.common.collect.HashBiMap.View<K, V, java.util.Map.Entry<V, K>> {
        InverseEntrySet(com.google.common.collect.HashBiMap<K, V> biMap) {
            super(biMap);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object o) {
            if (!(o instanceof java.util.Map.Entry)) {
                return false;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) o;
            java.lang.Object key = entry.getKey();
            java.lang.Object value = entry.getValue();
            int iFindEntryByValue = this.biMap.findEntryByValue(key);
            return iFindEntryByValue != -1 && com.google.common.base.Objects.equal(this.biMap.keys[iFindEntryByValue], value);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@javax.annotation.CheckForNull java.lang.Object o) {
            if (!(o instanceof java.util.Map.Entry)) {
                return false;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) o;
            java.lang.Object key = entry.getKey();
            java.lang.Object value = entry.getValue();
            int iSmearedHash = com.google.common.collect.Hashing.smearedHash(key);
            int iFindEntryByValue = this.biMap.findEntryByValue(key, iSmearedHash);
            if (iFindEntryByValue == -1 || !com.google.common.base.Objects.equal(this.biMap.keys[iFindEntryByValue], value)) {
                return false;
            }
            this.biMap.removeEntryValueHashKnown(iFindEntryByValue, iSmearedHash);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.HashBiMap.View
        public java.util.Map.Entry<V, K> forEntry(int entry) {
            return new com.google.common.collect.HashBiMap.EntryForValue(this.biMap, entry);
        }
    }

    static final class EntryForValue<K, V> extends com.google.common.collect.AbstractMapEntry<V, K> {
        final com.google.common.collect.HashBiMap<K, V> biMap;
        int index;

        @com.google.common.collect.ParametricNullness
        final V value;

        EntryForValue(com.google.common.collect.HashBiMap<K, V> hashBiMap, int i) {
            this.biMap = hashBiMap;
            this.value = (V) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(hashBiMap.values[i]);
            this.index = i;
        }

        private void updateIndex() {
            int i = this.index;
            if (i == -1 || i > this.biMap.size || !com.google.common.base.Objects.equal(this.value, this.biMap.values[this.index])) {
                this.index = this.biMap.findEntryByValue(this.value);
            }
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @com.google.common.collect.ParametricNullness
        public V getKey() {
            return this.value;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @com.google.common.collect.ParametricNullness
        public K getValue() {
            updateIndex();
            return this.index == -1 ? (K) com.google.common.collect.NullnessCasts.unsafeNull() : (K) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(this.biMap.keys[this.index]);
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @com.google.common.collect.ParametricNullness
        public K setValue(@com.google.common.collect.ParametricNullness K k) {
            updateIndex();
            if (this.index == -1) {
                this.biMap.putInverse(this.value, k, false);
                return (K) com.google.common.collect.NullnessCasts.unsafeNull();
            }
            K k2 = (K) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(this.biMap.keys[this.index]);
            if (com.google.common.base.Objects.equal(k2, k)) {
                return k;
            }
            this.biMap.replaceKeyInEntry(this.index, k, false);
            return k2;
        }
    }

    private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
        stream.defaultWriteObject();
        com.google.common.collect.Serialization.writeMap(this, stream);
    }

    private void readObject(java.io.ObjectInputStream stream) throws java.lang.ClassNotFoundException, java.io.IOException {
        stream.defaultReadObject();
        int count = com.google.common.collect.Serialization.readCount(stream);
        init(16);
        com.google.common.collect.Serialization.populateMap(this, stream, count);
    }
}
