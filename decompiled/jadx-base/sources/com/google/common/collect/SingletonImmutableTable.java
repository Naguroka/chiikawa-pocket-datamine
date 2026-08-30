package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
class SingletonImmutableTable<R, C, V> extends com.google.common.collect.ImmutableTable<R, C, V> {
    final C singleColumnKey;
    final R singleRowKey;
    final V singleValue;

    @Override // com.google.common.collect.Table
    public int size() {
        return 1;
    }

    SingletonImmutableTable(R r, C c, V v) {
        this.singleRowKey = (R) com.google.common.base.Preconditions.checkNotNull(r);
        this.singleColumnKey = (C) com.google.common.base.Preconditions.checkNotNull(c);
        this.singleValue = (V) com.google.common.base.Preconditions.checkNotNull(v);
    }

    SingletonImmutableTable(com.google.common.collect.Table.Cell<R, C, V> cell) {
        this(cell.getRowKey(), cell.getColumnKey(), cell.getValue());
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public com.google.common.collect.ImmutableMap<R, V> column(C columnKey) {
        com.google.common.base.Preconditions.checkNotNull(columnKey);
        if (containsColumn(columnKey)) {
            return com.google.common.collect.ImmutableMap.of(this.singleRowKey, (java.lang.Object) this.singleValue);
        }
        return com.google.common.collect.ImmutableMap.of();
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public com.google.common.collect.ImmutableMap<C, java.util.Map<R, V>> columnMap() {
        return com.google.common.collect.ImmutableMap.of(this.singleColumnKey, com.google.common.collect.ImmutableMap.of(this.singleRowKey, (java.lang.Object) this.singleValue));
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public com.google.common.collect.ImmutableMap<R, java.util.Map<C, V>> rowMap() {
        return com.google.common.collect.ImmutableMap.of(this.singleRowKey, com.google.common.collect.ImmutableMap.of(this.singleColumnKey, (java.lang.Object) this.singleValue));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable
    public com.google.common.collect.ImmutableSet<com.google.common.collect.Table.Cell<R, C, V>> createCellSet() {
        return com.google.common.collect.ImmutableSet.of(cellOf(this.singleRowKey, this.singleColumnKey, this.singleValue));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable
    public com.google.common.collect.ImmutableCollection<V> createValues() {
        return com.google.common.collect.ImmutableSet.of(this.singleValue);
    }

    @Override // com.google.common.collect.ImmutableTable
    java.lang.Object writeReplace() {
        return com.google.common.collect.ImmutableTable.SerializedForm.create(this, new int[]{0}, new int[]{0});
    }
}
