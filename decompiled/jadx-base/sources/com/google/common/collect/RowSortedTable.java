package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public interface RowSortedTable<R, C, V> extends com.google.common.collect.Table<R, C, V> {
    @Override // com.google.common.collect.Table
    java.util.SortedSet<R> rowKeySet();

    @Override // com.google.common.collect.Table
    java.util.SortedMap<R, java.util.Map<C, V>> rowMap();
}
