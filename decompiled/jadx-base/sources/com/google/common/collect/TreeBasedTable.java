package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public class TreeBasedTable<R, C, V> extends com.google.common.collect.StandardRowSortedTable<R, C, V> {
    private static final long serialVersionUID = 0;
    private final java.util.Comparator<? super C> columnComparator;

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

    private static class Factory<C, V> implements com.google.common.base.Supplier<java.util.TreeMap<C, V>>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        final java.util.Comparator<? super C> comparator;

        Factory(java.util.Comparator<? super C> comparator) {
            this.comparator = comparator;
        }

        @Override // com.google.common.base.Supplier
        public java.util.TreeMap<C, V> get() {
            return new java.util.TreeMap<>(this.comparator);
        }
    }

    public static <R extends java.lang.Comparable, C extends java.lang.Comparable, V> com.google.common.collect.TreeBasedTable<R, C, V> create() {
        return new com.google.common.collect.TreeBasedTable<>(com.google.common.collect.Ordering.natural(), com.google.common.collect.Ordering.natural());
    }

    public static <R, C, V> com.google.common.collect.TreeBasedTable<R, C, V> create(java.util.Comparator<? super R> rowComparator, java.util.Comparator<? super C> columnComparator) {
        com.google.common.base.Preconditions.checkNotNull(rowComparator);
        com.google.common.base.Preconditions.checkNotNull(columnComparator);
        return new com.google.common.collect.TreeBasedTable<>(rowComparator, columnComparator);
    }

    public static <R, C, V> com.google.common.collect.TreeBasedTable<R, C, V> create(com.google.common.collect.TreeBasedTable<R, C, ? extends V> table) {
        com.google.common.collect.TreeBasedTable<R, C, V> treeBasedTable = new com.google.common.collect.TreeBasedTable<>(table.rowComparator(), table.columnComparator());
        treeBasedTable.putAll(table);
        return treeBasedTable;
    }

    TreeBasedTable(java.util.Comparator<? super R> rowComparator, java.util.Comparator<? super C> columnComparator) {
        super(new java.util.TreeMap(rowComparator), new com.google.common.collect.TreeBasedTable.Factory(columnComparator));
        this.columnComparator = columnComparator;
    }

    @java.lang.Deprecated
    public java.util.Comparator<? super R> rowComparator() {
        return (java.util.Comparator) java.util.Objects.requireNonNull(rowKeySet().comparator());
    }

    @java.lang.Deprecated
    public java.util.Comparator<? super C> columnComparator() {
        return this.columnComparator;
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.Table
    public java.util.SortedMap<C, V> row(R rowKey) {
        return new com.google.common.collect.TreeBasedTable.TreeRow(this, rowKey);
    }

    private class TreeRow extends com.google.common.collect.StandardTable<R, C, V>.Row implements java.util.SortedMap<C, V> {

        @javax.annotation.CheckForNull
        final C lowerBound;

        @javax.annotation.CheckForNull
        final C upperBound;

        @javax.annotation.CheckForNull
        transient java.util.SortedMap<C, V> wholeRow;

        TreeRow(final com.google.common.collect.TreeBasedTable this$0, R rowKey) {
            this(rowKey, null, null);
        }

        TreeRow(@javax.annotation.CheckForNull R rowKey, @javax.annotation.CheckForNull C lowerBound, C upperBound) {
            super(rowKey);
            this.lowerBound = lowerBound;
            this.upperBound = upperBound;
            com.google.common.base.Preconditions.checkArgument(lowerBound == null || upperBound == null || compare(lowerBound, upperBound) <= 0);
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public java.util.SortedSet<C> keySet() {
            return new com.google.common.collect.Maps.SortedKeySet(this);
        }

        @Override // java.util.SortedMap
        public java.util.Comparator<? super C> comparator() {
            return com.google.common.collect.TreeBasedTable.this.columnComparator();
        }

        int compare(java.lang.Object a2, java.lang.Object b) {
            return comparator().compare(a2, b);
        }

        boolean rangeContains(@javax.annotation.CheckForNull java.lang.Object o) {
            C c;
            C c2;
            return o != null && ((c = this.lowerBound) == null || compare(c, o) <= 0) && ((c2 = this.upperBound) == null || compare(c2, o) > 0);
        }

        @Override // java.util.SortedMap
        public java.util.SortedMap<C, V> subMap(C fromKey, C toKey) {
            com.google.common.base.Preconditions.checkArgument(rangeContains(com.google.common.base.Preconditions.checkNotNull(fromKey)) && rangeContains(com.google.common.base.Preconditions.checkNotNull(toKey)));
            return new com.google.common.collect.TreeBasedTable.TreeRow(this.rowKey, fromKey, toKey);
        }

        @Override // java.util.SortedMap
        public java.util.SortedMap<C, V> headMap(C toKey) {
            com.google.common.base.Preconditions.checkArgument(rangeContains(com.google.common.base.Preconditions.checkNotNull(toKey)));
            return new com.google.common.collect.TreeBasedTable.TreeRow(this.rowKey, this.lowerBound, toKey);
        }

        @Override // java.util.SortedMap
        public java.util.SortedMap<C, V> tailMap(C fromKey) {
            com.google.common.base.Preconditions.checkArgument(rangeContains(com.google.common.base.Preconditions.checkNotNull(fromKey)));
            return new com.google.common.collect.TreeBasedTable.TreeRow(this.rowKey, fromKey, this.upperBound);
        }

        @Override // java.util.SortedMap
        public C firstKey() {
            updateBackingRowMapField();
            if (this.backingRowMap == null) {
                throw new java.util.NoSuchElementException();
            }
            return (C) ((java.util.SortedMap) this.backingRowMap).firstKey();
        }

        @Override // java.util.SortedMap
        public C lastKey() {
            updateBackingRowMapField();
            if (this.backingRowMap == null) {
                throw new java.util.NoSuchElementException();
            }
            return (C) ((java.util.SortedMap) this.backingRowMap).lastKey();
        }

        void updateWholeRowField() {
            java.util.SortedMap<C, V> sortedMap = this.wholeRow;
            if (sortedMap == null || (sortedMap.isEmpty() && com.google.common.collect.TreeBasedTable.this.backingMap.containsKey(this.rowKey))) {
                this.wholeRow = (java.util.SortedMap) com.google.common.collect.TreeBasedTable.this.backingMap.get(this.rowKey);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.StandardTable.Row
        @javax.annotation.CheckForNull
        public java.util.SortedMap<C, V> computeBackingRowMap() {
            updateWholeRowField();
            java.util.SortedMap<C, V> sortedMapTailMap = this.wholeRow;
            if (sortedMapTailMap == null) {
                return null;
            }
            C c = this.lowerBound;
            if (c != null) {
                sortedMapTailMap = sortedMapTailMap.tailMap(c);
            }
            C c2 = this.upperBound;
            return c2 != null ? sortedMapTailMap.headMap(c2) : sortedMapTailMap;
        }

        @Override // com.google.common.collect.StandardTable.Row
        void maintainEmptyInvariant() {
            updateWholeRowField();
            java.util.SortedMap<C, V> sortedMap = this.wholeRow;
            if (sortedMap == null || !sortedMap.isEmpty()) {
                return;
            }
            com.google.common.collect.TreeBasedTable.this.backingMap.remove(this.rowKey);
            this.wholeRow = null;
            this.backingRowMap = null;
        }

        @Override // com.google.common.collect.StandardTable.Row, java.util.AbstractMap, java.util.Map
        public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object key) {
            return rangeContains(key) && super.containsKey(key);
        }

        @Override // com.google.common.collect.StandardTable.Row, java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public V put(C c, V v) {
            com.google.common.base.Preconditions.checkArgument(rangeContains(com.google.common.base.Preconditions.checkNotNull(c)));
            return (V) super.put(c, v);
        }
    }

    @Override // com.google.common.collect.StandardRowSortedTable, com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public java.util.SortedSet<R> rowKeySet() {
        return super.rowKeySet();
    }

    @Override // com.google.common.collect.StandardRowSortedTable, com.google.common.collect.StandardTable, com.google.common.collect.Table
    public java.util.SortedMap<R, java.util.Map<C, V>> rowMap() {
        return super.rowMap();
    }

    @Override // com.google.common.collect.StandardTable
    java.util.Iterator<C> createColumnKeyIterator() {
        final java.util.Comparator<? super C> comparatorColumnComparator = columnComparator();
        final com.google.common.collect.UnmodifiableIterator unmodifiableIteratorMergeSorted = com.google.common.collect.Iterators.mergeSorted(com.google.common.collect.Iterables.transform(this.backingMap.values(), new com.google.common.base.Function() { // from class: com.google.common.collect.TreeBasedTable$$ExternalSyntheticLambda0
            @Override // com.google.common.base.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return ((java.util.Map) obj).keySet().iterator();
            }
        }), comparatorColumnComparator);
        return new com.google.common.collect.AbstractIterator<C>(this) { // from class: com.google.common.collect.TreeBasedTable.1

            @javax.annotation.CheckForNull
            C lastValue;

            @Override // com.google.common.collect.AbstractIterator
            @javax.annotation.CheckForNull
            protected C computeNext() {
                while (unmodifiableIteratorMergeSorted.hasNext()) {
                    C c = (C) unmodifiableIteratorMergeSorted.next();
                    C c2 = this.lastValue;
                    if (!(c2 != null && comparatorColumnComparator.compare(c, c2) == 0)) {
                        this.lastValue = c;
                        return c;
                    }
                }
                this.lastValue = null;
                return endOfData();
            }
        };
    }
}
