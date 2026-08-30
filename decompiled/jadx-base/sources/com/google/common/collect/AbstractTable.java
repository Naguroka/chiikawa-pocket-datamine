package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
abstract class AbstractTable<R, C, V> implements com.google.common.collect.Table<R, C, V> {

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.util.Set<com.google.common.collect.Table.Cell<R, C, V>> cellSet;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.util.Collection<V> values;

    abstract java.util.Iterator<com.google.common.collect.Table.Cell<R, C, V>> cellIterator();

    AbstractTable() {
    }

    @Override // com.google.common.collect.Table
    public boolean containsRow(@javax.annotation.CheckForNull java.lang.Object rowKey) {
        return com.google.common.collect.Maps.safeContainsKey(rowMap(), rowKey);
    }

    @Override // com.google.common.collect.Table
    public boolean containsColumn(@javax.annotation.CheckForNull java.lang.Object columnKey) {
        return com.google.common.collect.Maps.safeContainsKey(columnMap(), columnKey);
    }

    @Override // com.google.common.collect.Table
    public java.util.Set<R> rowKeySet() {
        return rowMap().keySet();
    }

    @Override // com.google.common.collect.Table
    public java.util.Set<C> columnKeySet() {
        return columnMap().keySet();
    }

    @Override // com.google.common.collect.Table
    public boolean containsValue(@javax.annotation.CheckForNull java.lang.Object value) {
        java.util.Iterator<java.util.Map<C, V>> it = rowMap().values().iterator();
        while (it.hasNext()) {
            if (it.next().containsValue(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.common.collect.Table
    public boolean contains(@javax.annotation.CheckForNull java.lang.Object rowKey, @javax.annotation.CheckForNull java.lang.Object columnKey) {
        java.util.Map map = (java.util.Map) com.google.common.collect.Maps.safeGet(rowMap(), rowKey);
        return map != null && com.google.common.collect.Maps.safeContainsKey(map, columnKey);
    }

    @Override // com.google.common.collect.Table
    @javax.annotation.CheckForNull
    public V get(@javax.annotation.CheckForNull java.lang.Object obj, @javax.annotation.CheckForNull java.lang.Object obj2) {
        java.util.Map map = (java.util.Map) com.google.common.collect.Maps.safeGet(rowMap(), obj);
        if (map == null) {
            return null;
        }
        return (V) com.google.common.collect.Maps.safeGet(map, obj2);
    }

    @Override // com.google.common.collect.Table
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // com.google.common.collect.Table
    public void clear() {
        com.google.common.collect.Iterators.clear(cellSet().iterator());
    }

    @Override // com.google.common.collect.Table
    @javax.annotation.CheckForNull
    public V remove(@javax.annotation.CheckForNull java.lang.Object obj, @javax.annotation.CheckForNull java.lang.Object obj2) {
        java.util.Map map = (java.util.Map) com.google.common.collect.Maps.safeGet(rowMap(), obj);
        if (map == null) {
            return null;
        }
        return (V) com.google.common.collect.Maps.safeRemove(map, obj2);
    }

    @Override // com.google.common.collect.Table
    @javax.annotation.CheckForNull
    public V put(@com.google.common.collect.ParametricNullness R rowKey, @com.google.common.collect.ParametricNullness C columnKey, @com.google.common.collect.ParametricNullness V value) {
        return row(rowKey).put(columnKey, value);
    }

    @Override // com.google.common.collect.Table
    public void putAll(com.google.common.collect.Table<? extends R, ? extends C, ? extends V> table) {
        for (com.google.common.collect.Table.Cell<? extends R, ? extends C, ? extends V> cell : table.cellSet()) {
            put(cell.getRowKey(), cell.getColumnKey(), cell.getValue());
        }
    }

    @Override // com.google.common.collect.Table
    public java.util.Set<com.google.common.collect.Table.Cell<R, C, V>> cellSet() {
        java.util.Set<com.google.common.collect.Table.Cell<R, C, V>> set = this.cellSet;
        if (set != null) {
            return set;
        }
        java.util.Set<com.google.common.collect.Table.Cell<R, C, V>> setCreateCellSet = createCellSet();
        this.cellSet = setCreateCellSet;
        return setCreateCellSet;
    }

    java.util.Set<com.google.common.collect.Table.Cell<R, C, V>> createCellSet() {
        return new com.google.common.collect.AbstractTable.CellSet();
    }

    class CellSet extends java.util.AbstractSet<com.google.common.collect.Table.Cell<R, C, V>> {
        CellSet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object o) {
            if (!(o instanceof com.google.common.collect.Table.Cell)) {
                return false;
            }
            com.google.common.collect.Table.Cell cell = (com.google.common.collect.Table.Cell) o;
            java.util.Map map = (java.util.Map) com.google.common.collect.Maps.safeGet(com.google.common.collect.AbstractTable.this.rowMap(), cell.getRowKey());
            return map != null && com.google.common.collect.Collections2.safeContains(map.entrySet(), com.google.common.collect.Maps.immutableEntry(cell.getColumnKey(), cell.getValue()));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@javax.annotation.CheckForNull java.lang.Object o) {
            if (!(o instanceof com.google.common.collect.Table.Cell)) {
                return false;
            }
            com.google.common.collect.Table.Cell cell = (com.google.common.collect.Table.Cell) o;
            java.util.Map map = (java.util.Map) com.google.common.collect.Maps.safeGet(com.google.common.collect.AbstractTable.this.rowMap(), cell.getRowKey());
            return map != null && com.google.common.collect.Collections2.safeRemove(map.entrySet(), com.google.common.collect.Maps.immutableEntry(cell.getColumnKey(), cell.getValue()));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            com.google.common.collect.AbstractTable.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<com.google.common.collect.Table.Cell<R, C, V>> iterator() {
            return com.google.common.collect.AbstractTable.this.cellIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return com.google.common.collect.AbstractTable.this.size();
        }
    }

    @Override // com.google.common.collect.Table
    public java.util.Collection<V> values() {
        java.util.Collection<V> collection = this.values;
        if (collection != null) {
            return collection;
        }
        java.util.Collection<V> collectionCreateValues = createValues();
        this.values = collectionCreateValues;
        return collectionCreateValues;
    }

    java.util.Collection<V> createValues() {
        return new com.google.common.collect.AbstractTable.Values();
    }

    java.util.Iterator<V> valuesIterator() {
        return new com.google.common.collect.TransformedIterator<com.google.common.collect.Table.Cell<R, C, V>, V>(this, cellSet().iterator()) { // from class: com.google.common.collect.AbstractTable.1
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.TransformedIterator
            @com.google.common.collect.ParametricNullness
            public V transform(com.google.common.collect.Table.Cell<R, C, V> cell) {
                return cell.getValue();
            }
        };
    }

    class Values extends java.util.AbstractCollection<V> {
        Values() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<V> iterator() {
            return com.google.common.collect.AbstractTable.this.valuesIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object o) {
            return com.google.common.collect.AbstractTable.this.containsValue(o);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            com.google.common.collect.AbstractTable.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return com.google.common.collect.AbstractTable.this.size();
        }
    }

    @Override // com.google.common.collect.Table
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        return com.google.common.collect.Tables.equalsImpl(this, obj);
    }

    @Override // com.google.common.collect.Table
    public int hashCode() {
        return cellSet().hashCode();
    }

    public java.lang.String toString() {
        return rowMap().toString();
    }
}
