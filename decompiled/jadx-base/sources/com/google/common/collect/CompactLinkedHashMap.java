package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
class CompactLinkedHashMap<K, V> extends com.google.common.collect.CompactHashMap<K, V> {
    private static final int ENDPOINT = -2;
    private final boolean accessOrder;
    private transient int firstEntry;
    private transient int lastEntry;

    @javax.annotation.CheckForNull
    transient long[] links;

    public static <K, V> com.google.common.collect.CompactLinkedHashMap<K, V> create() {
        return new com.google.common.collect.CompactLinkedHashMap<>();
    }

    public static <K, V> com.google.common.collect.CompactLinkedHashMap<K, V> createWithExpectedSize(int expectedSize) {
        return new com.google.common.collect.CompactLinkedHashMap<>(expectedSize);
    }

    CompactLinkedHashMap() {
        this(3);
    }

    CompactLinkedHashMap(int expectedSize) {
        this(expectedSize, false);
    }

    CompactLinkedHashMap(int expectedSize, boolean accessOrder) {
        super(expectedSize);
        this.accessOrder = accessOrder;
    }

    @Override // com.google.common.collect.CompactHashMap
    void init(int expectedSize) {
        super.init(expectedSize);
        this.firstEntry = -2;
        this.lastEntry = -2;
    }

    @Override // com.google.common.collect.CompactHashMap
    int allocArrays() {
        int iAllocArrays = super.allocArrays();
        this.links = new long[iAllocArrays];
        return iAllocArrays;
    }

    @Override // com.google.common.collect.CompactHashMap
    java.util.Map<K, V> createHashFloodingResistantDelegate(int tableSize) {
        return new java.util.LinkedHashMap(tableSize, 1.0f, this.accessOrder);
    }

    @Override // com.google.common.collect.CompactHashMap
    java.util.Map<K, V> convertToHashFloodingResistantImplementation() {
        java.util.Map<K, V> mapConvertToHashFloodingResistantImplementation = super.convertToHashFloodingResistantImplementation();
        this.links = null;
        return mapConvertToHashFloodingResistantImplementation;
    }

    private int getPredecessor(int entry) {
        return ((int) (link(entry) >>> 32)) - 1;
    }

    @Override // com.google.common.collect.CompactHashMap
    int getSuccessor(int entry) {
        return ((int) link(entry)) - 1;
    }

    private void setSuccessor(int entry, int succ) {
        setLink(entry, (link(entry) & (-4294967296L)) | (((long) (succ + 1)) & androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE));
    }

    private void setPredecessor(int entry, int pred) {
        setLink(entry, (link(entry) & androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE) | (((long) (pred + 1)) << 32));
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

    @Override // com.google.common.collect.CompactHashMap
    void insertEntry(int entryIndex, @com.google.common.collect.ParametricNullness K key, @com.google.common.collect.ParametricNullness V value, int hash, int mask) {
        super.insertEntry(entryIndex, key, value, hash, mask);
        setSucceeds(this.lastEntry, entryIndex);
        setSucceeds(entryIndex, -2);
    }

    @Override // com.google.common.collect.CompactHashMap
    void accessEntry(int index) {
        if (this.accessOrder) {
            setSucceeds(getPredecessor(index), getSuccessor(index));
            setSucceeds(this.lastEntry, index);
            setSucceeds(index, -2);
            incrementModCount();
        }
    }

    @Override // com.google.common.collect.CompactHashMap
    void moveLastEntry(int dstIndex, int mask) {
        int size = size() - 1;
        super.moveLastEntry(dstIndex, mask);
        setSucceeds(getPredecessor(dstIndex), getSuccessor(dstIndex));
        if (dstIndex < size) {
            setSucceeds(getPredecessor(size), dstIndex);
            setSucceeds(dstIndex, getSuccessor(size));
        }
        setLink(size, 0L);
    }

    @Override // com.google.common.collect.CompactHashMap
    void resizeEntries(int newCapacity) {
        super.resizeEntries(newCapacity);
        this.links = java.util.Arrays.copyOf(requireLinks(), newCapacity);
    }

    @Override // com.google.common.collect.CompactHashMap
    int firstEntryIndex() {
        return this.firstEntry;
    }

    @Override // com.google.common.collect.CompactHashMap
    int adjustAfterRemove(int indexBeforeRemove, int indexRemoved) {
        return indexBeforeRemove >= size() ? indexRemoved : indexBeforeRemove;
    }

    @Override // com.google.common.collect.CompactHashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        if (needsAllocArrays()) {
            return;
        }
        this.firstEntry = -2;
        this.lastEntry = -2;
        long[] jArr = this.links;
        if (jArr != null) {
            java.util.Arrays.fill(jArr, 0, size(), 0L);
        }
        super.clear();
    }

    private long[] requireLinks() {
        return (long[]) java.util.Objects.requireNonNull(this.links);
    }

    private long link(int i) {
        return requireLinks()[i];
    }

    private void setLink(int i, long value) {
        requireLinks()[i] = value;
    }
}
