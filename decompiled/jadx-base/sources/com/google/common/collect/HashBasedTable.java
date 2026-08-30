package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public class HashBasedTable<R, C, V> extends com.google.common.collect.StandardTable<R, C, V> {
    private static final long serialVersionUID = 0;

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ java.util.Set cellSet() {
        return super.cellSet();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.StandardTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ java.util.Map column(java.lang.Object columnKey) {
        return super.column(columnKey);
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ java.util.Set columnKeySet() {
        return super.columnKeySet();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ java.util.Map columnMap() {
        return super.columnMap();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean contains(@javax.annotation.CheckForNull java.lang.Object rowKey, @javax.annotation.CheckForNull java.lang.Object columnKey) {
        return super.contains(rowKey, columnKey);
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean containsColumn(@javax.annotation.CheckForNull java.lang.Object columnKey) {
        return super.containsColumn(columnKey);
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean containsRow(@javax.annotation.CheckForNull java.lang.Object rowKey) {
        return super.containsRow(rowKey);
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean containsValue(@javax.annotation.CheckForNull java.lang.Object value) {
        return super.containsValue(value);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @javax.annotation.CheckForNull
    public /* bridge */ /* synthetic */ java.lang.Object get(@javax.annotation.CheckForNull java.lang.Object rowKey, @javax.annotation.CheckForNull java.lang.Object columnKey) {
        return super.get(rowKey, columnKey);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @javax.annotation.CheckForNull
    public /* bridge */ /* synthetic */ java.lang.Object put(java.lang.Object rowKey, java.lang.Object columnKey, java.lang.Object value) {
        return super.put(rowKey, columnKey, value);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ void putAll(com.google.common.collect.Table table) {
        super.putAll(table);
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @javax.annotation.CheckForNull
    public /* bridge */ /* synthetic */ java.lang.Object remove(@javax.annotation.CheckForNull java.lang.Object rowKey, @javax.annotation.CheckForNull java.lang.Object columnKey) {
        return super.remove(rowKey, columnKey);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.StandardTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ java.util.Map row(java.lang.Object rowKey) {
        return super.row(rowKey);
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ java.util.Set rowKeySet() {
        return super.rowKeySet();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ java.util.Map rowMap() {
        return super.rowMap();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // com.google.common.collect.AbstractTable
    public /* bridge */ /* synthetic */ java.lang.String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ java.util.Collection values() {
        return super.values();
    }

    private static class Factory<C, V> implements com.google.common.base.Supplier<java.util.Map<C, V>>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        final int expectedSize;

        Factory(int expectedSize) {
            this.expectedSize = expectedSize;
        }

        @Override // com.google.common.base.Supplier
        public java.util.Map<C, V> get() {
            return com.google.common.collect.Maps.newLinkedHashMapWithExpectedSize(this.expectedSize);
        }
    }

    public static <R, C, V> com.google.common.collect.HashBasedTable<R, C, V> create() {
        return new com.google.common.collect.HashBasedTable<>(new java.util.LinkedHashMap(), new com.google.common.collect.HashBasedTable.Factory(0));
    }

    public static <R, C, V> com.google.common.collect.HashBasedTable<R, C, V> create(int expectedRows, int expectedCellsPerRow) {
        com.google.common.collect.CollectPreconditions.checkNonnegative(expectedCellsPerRow, "expectedCellsPerRow");
        return new com.google.common.collect.HashBasedTable<>(com.google.common.collect.Maps.newLinkedHashMapWithExpectedSize(expectedRows), new com.google.common.collect.HashBasedTable.Factory(expectedCellsPerRow));
    }

    public static <R, C, V> com.google.common.collect.HashBasedTable<R, C, V> create(com.google.common.collect.Table<? extends R, ? extends C, ? extends V> table) {
        com.google.common.collect.HashBasedTable<R, C, V> hashBasedTableCreate = create();
        hashBasedTableCreate.putAll(table);
        return hashBasedTableCreate;
    }

    HashBasedTable(java.util.Map<R, java.util.Map<C, V>> backingMap, com.google.common.collect.HashBasedTable.Factory<C, V> factory) {
        super(backingMap, factory);
    }
}
