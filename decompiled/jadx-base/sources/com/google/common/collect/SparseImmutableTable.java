package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.errorprone.annotations.Immutable(containerOf = {"R", "C", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED})
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class SparseImmutableTable<R, C, V> extends com.google.common.collect.RegularImmutableTable<R, C, V> {
    static final com.google.common.collect.ImmutableTable<java.lang.Object, java.lang.Object, java.lang.Object> EMPTY = new com.google.common.collect.SparseImmutableTable(com.google.common.collect.ImmutableList.of(), com.google.common.collect.ImmutableSet.of(), com.google.common.collect.ImmutableSet.of());
    private final int[] cellColumnInRowIndices;
    private final int[] cellRowIndices;
    private final com.google.common.collect.ImmutableMap<C, com.google.common.collect.ImmutableMap<R, V>> columnMap;
    private final com.google.common.collect.ImmutableMap<R, com.google.common.collect.ImmutableMap<C, V>> rowMap;

    /* JADX WARN: Multi-variable type inference failed */
    SparseImmutableTable(com.google.common.collect.ImmutableList<com.google.common.collect.Table.Cell<R, C, V>> immutableList, com.google.common.collect.ImmutableSet<R> immutableSet, com.google.common.collect.ImmutableSet<C> immutableSet2) {
        com.google.common.collect.ImmutableMap immutableMapIndexMap = com.google.common.collect.Maps.indexMap(immutableSet);
        java.util.LinkedHashMap linkedHashMapNewLinkedHashMap = com.google.common.collect.Maps.newLinkedHashMap();
        com.google.common.collect.UnmodifiableIterator<R> it = immutableSet.iterator();
        while (it.hasNext()) {
            linkedHashMapNewLinkedHashMap.put(it.next(), new java.util.LinkedHashMap());
        }
        java.util.LinkedHashMap linkedHashMapNewLinkedHashMap2 = com.google.common.collect.Maps.newLinkedHashMap();
        com.google.common.collect.UnmodifiableIterator<C> it2 = immutableSet2.iterator();
        while (it2.hasNext()) {
            linkedHashMapNewLinkedHashMap2.put(it2.next(), new java.util.LinkedHashMap());
        }
        int[] iArr = new int[immutableList.size()];
        int[] iArr2 = new int[immutableList.size()];
        for (int i = 0; i < immutableList.size(); i++) {
            com.google.common.collect.Table.Cell<R, C, V> cell = immutableList.get(i);
            R rowKey = cell.getRowKey();
            C columnKey = cell.getColumnKey();
            V value = cell.getValue();
            iArr[i] = ((java.lang.Integer) java.util.Objects.requireNonNull((java.lang.Integer) immutableMapIndexMap.get(rowKey))).intValue();
            java.util.Map map = (java.util.Map) java.util.Objects.requireNonNull((java.util.Map) linkedHashMapNewLinkedHashMap.get(rowKey));
            iArr2[i] = map.size();
            checkNoDuplicate(rowKey, columnKey, map.put(columnKey, value), value);
            ((java.util.Map) java.util.Objects.requireNonNull((java.util.Map) linkedHashMapNewLinkedHashMap2.get(columnKey))).put(rowKey, value);
        }
        this.cellRowIndices = iArr;
        this.cellColumnInRowIndices = iArr2;
        com.google.common.collect.ImmutableMap.Builder builder = new com.google.common.collect.ImmutableMap.Builder(linkedHashMapNewLinkedHashMap.size());
        for (java.util.Map.Entry entry : linkedHashMapNewLinkedHashMap.entrySet()) {
            builder.put(entry.getKey(), com.google.common.collect.ImmutableMap.copyOf((java.util.Map) entry.getValue()));
        }
        this.rowMap = builder.buildOrThrow();
        com.google.common.collect.ImmutableMap.Builder builder2 = new com.google.common.collect.ImmutableMap.Builder(linkedHashMapNewLinkedHashMap2.size());
        for (java.util.Map.Entry entry2 : linkedHashMapNewLinkedHashMap2.entrySet()) {
            builder2.put(entry2.getKey(), com.google.common.collect.ImmutableMap.copyOf((java.util.Map) entry2.getValue()));
        }
        this.columnMap = builder2.buildOrThrow();
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public com.google.common.collect.ImmutableMap<C, java.util.Map<R, V>> columnMap() {
        return com.google.common.collect.ImmutableMap.copyOf((java.util.Map) this.columnMap);
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public com.google.common.collect.ImmutableMap<R, java.util.Map<C, V>> rowMap() {
        return com.google.common.collect.ImmutableMap.copyOf((java.util.Map) this.rowMap);
    }

    @Override // com.google.common.collect.Table
    public int size() {
        return this.cellRowIndices.length;
    }

    @Override // com.google.common.collect.RegularImmutableTable
    com.google.common.collect.Table.Cell<R, C, V> getCell(int index) {
        java.util.Map.Entry<R, com.google.common.collect.ImmutableMap<C, V>> entry = this.rowMap.entrySet().asList().get(this.cellRowIndices[index]);
        com.google.common.collect.ImmutableMap<C, V> value = entry.getValue();
        java.util.Map.Entry<C, V> entry2 = value.entrySet().asList().get(this.cellColumnInRowIndices[index]);
        return cellOf(entry.getKey(), entry2.getKey(), entry2.getValue());
    }

    @Override // com.google.common.collect.RegularImmutableTable
    V getValue(int index) {
        com.google.common.collect.ImmutableMap<C, V> immutableMap = this.rowMap.values().asList().get(this.cellRowIndices[index]);
        return immutableMap.values().asList().get(this.cellColumnInRowIndices[index]);
    }

    @Override // com.google.common.collect.RegularImmutableTable, com.google.common.collect.ImmutableTable
    java.lang.Object writeReplace() {
        com.google.common.collect.ImmutableMap immutableMapIndexMap = com.google.common.collect.Maps.indexMap(columnKeySet());
        int[] iArr = new int[cellSet().size()];
        com.google.common.collect.UnmodifiableIterator<com.google.common.collect.Table.Cell<R, C, V>> it = cellSet().iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((java.lang.Integer) java.util.Objects.requireNonNull((java.lang.Integer) immutableMapIndexMap.get(it.next().getColumnKey()))).intValue();
            i++;
        }
        return com.google.common.collect.ImmutableTable.SerializedForm.create(this, this.cellRowIndices, iArr);
    }
}
