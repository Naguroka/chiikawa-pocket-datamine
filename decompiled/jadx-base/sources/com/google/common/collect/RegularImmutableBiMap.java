package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class RegularImmutableBiMap<K, V> extends com.google.common.collect.ImmutableBiMap<K, V> {
    static final com.google.common.collect.RegularImmutableBiMap<java.lang.Object, java.lang.Object> EMPTY = new com.google.common.collect.RegularImmutableBiMap<>();
    final transient java.lang.Object[] alternatingKeysAndValues;
    private final transient com.google.common.collect.RegularImmutableBiMap<V, K> inverse;

    @javax.annotation.CheckForNull
    private final transient java.lang.Object keyHashTable;
    private final transient int keyOffset;
    private final transient int size;

    @Override // com.google.common.collect.ImmutableMap
    boolean isPartialView() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private RegularImmutableBiMap() {
        this.keyHashTable = null;
        this.alternatingKeysAndValues = new java.lang.Object[0];
        this.keyOffset = 0;
        this.size = 0;
        this.inverse = this;
    }

    RegularImmutableBiMap(java.lang.Object[] alternatingKeysAndValues, int size) {
        this.alternatingKeysAndValues = alternatingKeysAndValues;
        this.size = size;
        this.keyOffset = 0;
        int iChooseTableSize = size >= 2 ? com.google.common.collect.ImmutableSet.chooseTableSize(size) : 0;
        this.keyHashTable = com.google.common.collect.RegularImmutableMap.createHashTableOrThrow(alternatingKeysAndValues, size, iChooseTableSize, 0);
        this.inverse = new com.google.common.collect.RegularImmutableBiMap<>(com.google.common.collect.RegularImmutableMap.createHashTableOrThrow(alternatingKeysAndValues, size, iChooseTableSize, 1), alternatingKeysAndValues, size, this);
    }

    private RegularImmutableBiMap(@javax.annotation.CheckForNull java.lang.Object valueHashTable, java.lang.Object[] alternatingKeysAndValues, int size, com.google.common.collect.RegularImmutableBiMap<V, K> inverse) {
        this.keyHashTable = valueHashTable;
        this.alternatingKeysAndValues = alternatingKeysAndValues;
        this.keyOffset = 1;
        this.size = size;
        this.inverse = inverse;
    }

    @Override // java.util.Map
    public int size() {
        return this.size;
    }

    @Override // com.google.common.collect.ImmutableBiMap, com.google.common.collect.BiMap
    public com.google.common.collect.ImmutableBiMap<V, K> inverse() {
        return this.inverse;
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    @javax.annotation.CheckForNull
    public V get(@javax.annotation.CheckForNull java.lang.Object obj) {
        V v = (V) com.google.common.collect.RegularImmutableMap.get(this.keyHashTable, this.alternatingKeysAndValues, this.size, this.keyOffset, obj);
        if (v == null) {
            return null;
        }
        return v;
    }

    @Override // com.google.common.collect.ImmutableMap
    com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> createEntrySet() {
        return new com.google.common.collect.RegularImmutableMap.EntrySet(this, this.alternatingKeysAndValues, this.keyOffset, this.size);
    }

    @Override // com.google.common.collect.ImmutableMap
    com.google.common.collect.ImmutableSet<K> createKeySet() {
        return new com.google.common.collect.RegularImmutableMap.KeySet(this, new com.google.common.collect.RegularImmutableMap.KeysOrValuesAsList(this.alternatingKeysAndValues, this.keyOffset, this.size));
    }

    @Override // com.google.common.collect.ImmutableBiMap, com.google.common.collect.ImmutableMap
    java.lang.Object writeReplace() {
        return super.writeReplace();
    }
}
