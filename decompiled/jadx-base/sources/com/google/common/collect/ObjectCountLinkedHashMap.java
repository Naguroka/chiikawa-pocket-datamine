package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
class ObjectCountLinkedHashMap<K> extends com.google.common.collect.ObjectCountHashMap<K> {
    private static final int ENDPOINT = -2;
    private transient int firstEntry;
    private transient int lastEntry;
    transient long[] links;

    static <K> com.google.common.collect.ObjectCountLinkedHashMap<K> create() {
        return new com.google.common.collect.ObjectCountLinkedHashMap<>();
    }

    static <K> com.google.common.collect.ObjectCountLinkedHashMap<K> createWithExpectedSize(int expectedSize) {
        return new com.google.common.collect.ObjectCountLinkedHashMap<>(expectedSize);
    }

    ObjectCountLinkedHashMap() {
        this(3);
    }

    ObjectCountLinkedHashMap(int expectedSize) {
        this(expectedSize, 1.0f);
    }

    ObjectCountLinkedHashMap(int expectedSize, float loadFactor) {
        super(expectedSize, loadFactor);
    }

    ObjectCountLinkedHashMap(com.google.common.collect.ObjectCountHashMap<K> map) {
        init(map.size(), 1.0f);
        int iFirstIndex = map.firstIndex();
        while (iFirstIndex != -1) {
            put(map.getKey(iFirstIndex), map.getValue(iFirstIndex));
            iFirstIndex = map.nextIndex(iFirstIndex);
        }
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    void init(int expectedSize, float loadFactor) {
        super.init(expectedSize, loadFactor);
        this.firstEntry = -2;
        this.lastEntry = -2;
        long[] jArr = new long[expectedSize];
        this.links = jArr;
        java.util.Arrays.fill(jArr, -1L);
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    int firstIndex() {
        int i = this.firstEntry;
        if (i == -2) {
            return -1;
        }
        return i;
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    int nextIndex(int index) {
        int successor = getSuccessor(index);
        if (successor == -2) {
            return -1;
        }
        return successor;
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    int nextIndexAfterRemove(int oldNextIndex, int removedIndex) {
        return oldNextIndex == size() ? removedIndex : oldNextIndex;
    }

    private int getPredecessor(int entry) {
        return (int) (this.links[entry] >>> 32);
    }

    private int getSuccessor(int entry) {
        return (int) this.links[entry];
    }

    private void setSuccessor(int entry, int succ) {
        long[] jArr = this.links;
        jArr[entry] = (jArr[entry] & (-4294967296L)) | (((long) succ) & androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE);
    }

    private void setPredecessor(int entry, int pred) {
        long[] jArr = this.links;
        jArr[entry] = (jArr[entry] & androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE) | (((long) pred) << 32);
    }

    private void setSucceeds(int pred, int succ) {
        if (pred == -2) {
            this.firstEntry = succ;
        } else {
            setSuccessor(pred, succ);
        }
        if (succ == -2) {
            this.lastEntry = pred;
        } else {
            setPredecessor(succ, pred);
        }
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    void insertEntry(int entryIndex, @com.google.common.collect.ParametricNullness K key, int value, int hash) {
        super.insertEntry(entryIndex, key, value, hash);
        setSucceeds(this.lastEntry, entryIndex);
        setSucceeds(entryIndex, -2);
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    void moveLastEntry(int dstIndex) {
        int size = size() - 1;
        setSucceeds(getPredecessor(dstIndex), getSuccessor(dstIndex));
        if (dstIndex < size) {
            setSucceeds(getPredecessor(size), dstIndex);
            setSucceeds(dstIndex, getSuccessor(size));
        }
        super.moveLastEntry(dstIndex);
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    void resizeEntries(int newCapacity) {
        super.resizeEntries(newCapacity);
        long[] jArr = this.links;
        int length = jArr.length;
        long[] jArrCopyOf = java.util.Arrays.copyOf(jArr, newCapacity);
        this.links = jArrCopyOf;
        java.util.Arrays.fill(jArrCopyOf, length, newCapacity, -1L);
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public void clear() {
        super.clear();
        this.firstEntry = -2;
        this.lastEntry = -2;
    }
}
