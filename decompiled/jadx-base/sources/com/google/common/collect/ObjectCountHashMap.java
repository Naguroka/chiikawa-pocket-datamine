package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
class ObjectCountHashMap<K> {
    static final float DEFAULT_LOAD_FACTOR = 1.0f;
    static final int DEFAULT_SIZE = 3;
    private static final long HASH_MASK = -4294967296L;
    private static final int MAXIMUM_CAPACITY = 1073741824;
    private static final long NEXT_MASK = 4294967295L;
    static final int UNSET = -1;
    transient long[] entries;
    transient java.lang.Object[] keys;
    private transient float loadFactor;
    transient int modCount;
    transient int size;
    private transient int[] table;
    private transient int threshold;
    transient int[] values;

    private static int getHash(long entry) {
        return (int) (entry >>> 32);
    }

    private static int getNext(long entry) {
        return (int) entry;
    }

    private static long swapNext(long entry, int newNext) {
        return (entry & HASH_MASK) | (4294967295L & ((long) newNext));
    }

    int nextIndexAfterRemove(int oldNextIndex, int removedIndex) {
        return oldNextIndex - 1;
    }

    static <K> com.google.common.collect.ObjectCountHashMap<K> create() {
        return new com.google.common.collect.ObjectCountHashMap<>();
    }

    static <K> com.google.common.collect.ObjectCountHashMap<K> createWithExpectedSize(int expectedSize) {
        return new com.google.common.collect.ObjectCountHashMap<>(expectedSize);
    }

    ObjectCountHashMap() {
        init(3, 1.0f);
    }

    ObjectCountHashMap(com.google.common.collect.ObjectCountHashMap<? extends K> map) {
        init(map.size(), 1.0f);
        int iFirstIndex = map.firstIndex();
        while (iFirstIndex != -1) {
            put(map.getKey(iFirstIndex), map.getValue(iFirstIndex));
            iFirstIndex = map.nextIndex(iFirstIndex);
        }
    }

    ObjectCountHashMap(int capacity) {
        this(capacity, 1.0f);
    }

    ObjectCountHashMap(int expectedSize, float loadFactor) {
        init(expectedSize, loadFactor);
    }

    void init(int expectedSize, float loadFactor) {
        com.google.common.base.Preconditions.checkArgument(expectedSize >= 0, "Initial capacity must be non-negative");
        com.google.common.base.Preconditions.checkArgument(loadFactor > 0.0f, "Illegal load factor");
        int iClosedTableSize = com.google.common.collect.Hashing.closedTableSize(expectedSize, loadFactor);
        this.table = newTable(iClosedTableSize);
        this.loadFactor = loadFactor;
        this.keys = new java.lang.Object[expectedSize];
        this.values = new int[expectedSize];
        this.entries = newEntries(expectedSize);
        this.threshold = java.lang.Math.max(1, (int) (iClosedTableSize * loadFactor));
    }

    private static int[] newTable(int size) {
        int[] iArr = new int[size];
        java.util.Arrays.fill(iArr, -1);
        return iArr;
    }

    private static long[] newEntries(int size) {
        long[] jArr = new long[size];
        java.util.Arrays.fill(jArr, -1L);
        return jArr;
    }

    private int hashTableMask() {
        return this.table.length - 1;
    }

    int firstIndex() {
        return this.size == 0 ? -1 : 0;
    }

    int nextIndex(int index) {
        int i = index + 1;
        if (i < this.size) {
            return i;
        }
        return -1;
    }

    int size() {
        return this.size;
    }

    @com.google.common.collect.ParametricNullness
    K getKey(int i) {
        com.google.common.base.Preconditions.checkElementIndex(i, this.size);
        return (K) this.keys[i];
    }

    int getValue(int index) {
        com.google.common.base.Preconditions.checkElementIndex(index, this.size);
        return this.values[index];
    }

    void setValue(int index, int newValue) {
        com.google.common.base.Preconditions.checkElementIndex(index, this.size);
        this.values[index] = newValue;
    }

    com.google.common.collect.Multiset.Entry<K> getEntry(int index) {
        com.google.common.base.Preconditions.checkElementIndex(index, this.size);
        return new com.google.common.collect.ObjectCountHashMap.MapEntry(index);
    }

    class MapEntry extends com.google.common.collect.Multisets.AbstractEntry<K> {

        @com.google.common.collect.ParametricNullness
        final K key;
        int lastKnownIndex;

        MapEntry(int i) {
            this.key = (K) com.google.common.collect.ObjectCountHashMap.this.keys[i];
            this.lastKnownIndex = i;
        }

        @Override // com.google.common.collect.Multiset.Entry
        @com.google.common.collect.ParametricNullness
        public K getElement() {
            return this.key;
        }

        void updateLastKnownIndex() {
            int i = this.lastKnownIndex;
            if (i == -1 || i >= com.google.common.collect.ObjectCountHashMap.this.size() || !com.google.common.base.Objects.equal(this.key, com.google.common.collect.ObjectCountHashMap.this.keys[this.lastKnownIndex])) {
                this.lastKnownIndex = com.google.common.collect.ObjectCountHashMap.this.indexOf(this.key);
            }
        }

        @Override // com.google.common.collect.Multiset.Entry
        public int getCount() {
            updateLastKnownIndex();
            if (this.lastKnownIndex == -1) {
                return 0;
            }
            return com.google.common.collect.ObjectCountHashMap.this.values[this.lastKnownIndex];
        }

        public int setCount(int count) {
            updateLastKnownIndex();
            if (this.lastKnownIndex == -1) {
                com.google.common.collect.ObjectCountHashMap.this.put(this.key, count);
                return 0;
            }
            int i = com.google.common.collect.ObjectCountHashMap.this.values[this.lastKnownIndex];
            com.google.common.collect.ObjectCountHashMap.this.values[this.lastKnownIndex] = count;
            return i;
        }
    }

    void ensureCapacity(int minCapacity) {
        if (minCapacity > this.entries.length) {
            resizeEntries(minCapacity);
        }
        if (minCapacity >= this.threshold) {
            resizeTable(java.lang.Math.max(2, java.lang.Integer.highestOneBit(minCapacity - 1) << 1));
        }
    }

    public int put(@com.google.common.collect.ParametricNullness K key, int value) {
        com.google.common.collect.CollectPreconditions.checkPositive(value, "count");
        long[] jArr = this.entries;
        java.lang.Object[] objArr = this.keys;
        int[] iArr = this.values;
        int iSmearedHash = com.google.common.collect.Hashing.smearedHash(key);
        int iHashTableMask = hashTableMask() & iSmearedHash;
        int i = this.size;
        int[] iArr2 = this.table;
        int i2 = iArr2[iHashTableMask];
        if (i2 == -1) {
            iArr2[iHashTableMask] = i;
        } else {
            while (true) {
                long j = jArr[i2];
                if (getHash(j) == iSmearedHash && com.google.common.base.Objects.equal(key, objArr[i2])) {
                    int i3 = iArr[i2];
                    iArr[i2] = value;
                    return i3;
                }
                int next = getNext(j);
                if (next == -1) {
                    jArr[i2] = swapNext(j, i);
                    break;
                }
                i2 = next;
            }
        }
        if (i == Integer.MAX_VALUE) {
            throw new java.lang.IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i4 = i + 1;
        resizeMeMaybe(i4);
        insertEntry(i, key, value, iSmearedHash);
        this.size = i4;
        if (i >= this.threshold) {
            resizeTable(this.table.length * 2);
        }
        this.modCount++;
        return 0;
    }

    void insertEntry(int entryIndex, @com.google.common.collect.ParametricNullness K key, int value, int hash) {
        this.entries[entryIndex] = (((long) hash) << 32) | 4294967295L;
        this.keys[entryIndex] = key;
        this.values[entryIndex] = value;
    }

    private void resizeMeMaybe(int newSize) {
        int length = this.entries.length;
        if (newSize > length) {
            int iMax = java.lang.Math.max(1, length >>> 1) + length;
            if (iMax < 0) {
                iMax = Integer.MAX_VALUE;
            }
            if (iMax != length) {
                resizeEntries(iMax);
            }
        }
    }

    void resizeEntries(int newCapacity) {
        this.keys = java.util.Arrays.copyOf(this.keys, newCapacity);
        this.values = java.util.Arrays.copyOf(this.values, newCapacity);
        long[] jArr = this.entries;
        int length = jArr.length;
        long[] jArrCopyOf = java.util.Arrays.copyOf(jArr, newCapacity);
        if (newCapacity > length) {
            java.util.Arrays.fill(jArrCopyOf, length, newCapacity, -1L);
        }
        this.entries = jArrCopyOf;
    }

    private void resizeTable(int newCapacity) {
        if (this.table.length >= 1073741824) {
            this.threshold = Integer.MAX_VALUE;
            return;
        }
        int i = ((int) (newCapacity * this.loadFactor)) + 1;
        int[] iArrNewTable = newTable(newCapacity);
        long[] jArr = this.entries;
        int length = iArrNewTable.length - 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            int hash = getHash(jArr[i2]);
            int i3 = hash & length;
            int i4 = iArrNewTable[i3];
            iArrNewTable[i3] = i2;
            jArr[i2] = (((long) hash) << 32) | (((long) i4) & 4294967295L);
        }
        this.threshold = i;
        this.table = iArrNewTable;
    }

    int indexOf(@javax.annotation.CheckForNull java.lang.Object key) {
        int iSmearedHash = com.google.common.collect.Hashing.smearedHash(key);
        int next = this.table[hashTableMask() & iSmearedHash];
        while (next != -1) {
            long j = this.entries[next];
            if (getHash(j) == iSmearedHash && com.google.common.base.Objects.equal(key, this.keys[next])) {
                return next;
            }
            next = getNext(j);
        }
        return -1;
    }

    public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object key) {
        return indexOf(key) != -1;
    }

    public int get(@javax.annotation.CheckForNull java.lang.Object key) {
        int iIndexOf = indexOf(key);
        if (iIndexOf == -1) {
            return 0;
        }
        return this.values[iIndexOf];
    }

    public int remove(@javax.annotation.CheckForNull java.lang.Object key) {
        return remove(key, com.google.common.collect.Hashing.smearedHash(key));
    }

    private int remove(@javax.annotation.CheckForNull java.lang.Object key, int hash) {
        int iHashTableMask = hashTableMask() & hash;
        int i = this.table[iHashTableMask];
        if (i == -1) {
            return 0;
        }
        int i2 = -1;
        while (true) {
            if (getHash(this.entries[i]) == hash && com.google.common.base.Objects.equal(key, this.keys[i])) {
                int i3 = this.values[i];
                if (i2 == -1) {
                    this.table[iHashTableMask] = getNext(this.entries[i]);
                } else {
                    long[] jArr = this.entries;
                    jArr[i2] = swapNext(jArr[i2], getNext(jArr[i]));
                }
                moveLastEntry(i);
                this.size--;
                this.modCount++;
                return i3;
            }
            int next = getNext(this.entries[i]);
            if (next == -1) {
                return 0;
            }
            i2 = i;
            i = next;
        }
    }

    int removeEntry(int entryIndex) {
        return remove(this.keys[entryIndex], getHash(this.entries[entryIndex]));
    }

    void moveLastEntry(int dstIndex) {
        int size = size() - 1;
        if (dstIndex < size) {
            java.lang.Object[] objArr = this.keys;
            objArr[dstIndex] = objArr[size];
            int[] iArr = this.values;
            iArr[dstIndex] = iArr[size];
            objArr[size] = null;
            iArr[size] = 0;
            long[] jArr = this.entries;
            long j = jArr[size];
            jArr[dstIndex] = j;
            jArr[size] = -1;
            int hash = getHash(j) & hashTableMask();
            int[] iArr2 = this.table;
            int i = iArr2[hash];
            if (i == size) {
                iArr2[hash] = dstIndex;
                return;
            }
            while (true) {
                long j2 = this.entries[i];
                int next = getNext(j2);
                if (next == size) {
                    this.entries[i] = swapNext(j2, dstIndex);
                    return;
                }
                i = next;
            }
        } else {
            this.keys[dstIndex] = null;
            this.values[dstIndex] = 0;
            this.entries[dstIndex] = -1;
        }
    }

    public void clear() {
        this.modCount++;
        java.util.Arrays.fill(this.keys, 0, this.size, (java.lang.Object) null);
        java.util.Arrays.fill(this.values, 0, this.size, 0);
        java.util.Arrays.fill(this.table, -1);
        java.util.Arrays.fill(this.entries, -1L);
        this.size = 0;
    }
}
