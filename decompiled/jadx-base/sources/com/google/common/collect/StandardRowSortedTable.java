package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
class StandardRowSortedTable<R, C, V> extends com.google.common.collect.StandardTable<R, C, V> implements com.google.common.collect.RowSortedTable<R, C, V> {
    private static final long serialVersionUID = 0;

    StandardRowSortedTable(java.util.SortedMap<R, java.util.Map<C, V>> backingMap, com.google.common.base.Supplier<? extends java.util.Map<C, V>> factory) {
        super(backingMap, factory);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.util.SortedMap<R, java.util.Map<C, V>> sortedBackingMap() {
        return (java.util.SortedMap) this.backingMap;
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public java.util.SortedSet<R> rowKeySet() {
        return (java.util.SortedSet) rowMap().keySet();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.Table
    public java.util.SortedMap<R, java.util.Map<C, V>> rowMap() {
        return (java.util.SortedMap) super.rowMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.StandardTable
    public java.util.SortedMap<R, java.util.Map<C, V>> createRowMap() {
        return new com.google.common.collect.StandardRowSortedTable.RowSortedMap();
    }

    private class RowSortedMap extends com.google.common.collect.StandardTable<R, C, V>.RowMap implements java.util.SortedMap<R, java.util.Map<C, V>> {
        private RowSortedMap() {
            super();
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public java.util.SortedSet<R> keySet() {
            return (java.util.SortedSet) super.keySet();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public java.util.SortedSet<R> createKeySet() {
            return new com.google.common.collect.Maps.SortedKeySet(this);
        }

        @Override // java.util.SortedMap
        @javax.annotation.CheckForNull
        public java.util.Comparator<? super R> comparator() {
            return com.google.common.collect.StandardRowSortedTable.this.sortedBackingMap().comparator();
        }

        @Override // java.util.SortedMap
        public R firstKey() {
            return (R) com.google.common.collect.StandardRowSortedTable.this.sortedBackingMap().firstKey();
        }

        @Override // java.util.SortedMap
        public R lastKey() {
            return (R) com.google.common.collect.StandardRowSortedTable.this.sortedBackingMap().lastKey();
        }

        @Override // java.util.SortedMap
        public java.util.SortedMap<R, java.util.Map<C, V>> headMap(R toKey) {
            com.google.common.base.Preconditions.checkNotNull(toKey);
            return new com.google.common.collect.StandardRowSortedTable(com.google.common.collect.StandardRowSortedTable.this.sortedBackingMap().headMap(toKey), com.google.common.collect.StandardRowSortedTable.this.factory).rowMap();
        }

        @Override // java.util.SortedMap
        public java.util.SortedMap<R, java.util.Map<C, V>> subMap(R fromKey, R toKey) {
            com.google.common.base.Preconditions.checkNotNull(fromKey);
            com.google.common.base.Preconditions.checkNotNull(toKey);
            return new com.google.common.collect.StandardRowSortedTable(com.google.common.collect.StandardRowSortedTable.this.sortedBackingMap().subMap(fromKey, toKey), com.google.common.collect.StandardRowSortedTable.this.factory).rowMap();
        }

        @Override // java.util.SortedMap
        public java.util.SortedMap<R, java.util.Map<C, V>> tailMap(R fromKey) {
            com.google.common.base.Preconditions.checkNotNull(fromKey);
            return new com.google.common.collect.StandardRowSortedTable(com.google.common.collect.StandardRowSortedTable.this.sortedBackingMap().tailMap(fromKey), com.google.common.collect.StandardRowSortedTable.this.factory).rowMap();
        }
    }
}
