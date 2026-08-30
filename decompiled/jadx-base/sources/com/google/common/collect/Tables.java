package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public final class Tables {
    private static final com.google.common.base.Function<? extends java.util.Map<?, ?>, ? extends java.util.Map<?, ?>> UNMODIFIABLE_WRAPPER = new com.google.common.base.Function<java.util.Map<java.lang.Object, java.lang.Object>, java.util.Map<java.lang.Object, java.lang.Object>>() { // from class: com.google.common.collect.Tables.1
        @Override // com.google.common.base.Function
        public java.util.Map<java.lang.Object, java.lang.Object> apply(java.util.Map<java.lang.Object, java.lang.Object> input) {
            return java.util.Collections.unmodifiableMap(input);
        }
    };

    private Tables() {
    }

    static <T, R, C, V, I extends com.google.common.collect.Table<R, C, V>> java.util.stream.Collector<T, ?, I> toTable(java.util.function.Function<? super T, ? extends R> rowFunction, java.util.function.Function<? super T, ? extends C> columnFunction, java.util.function.Function<? super T, ? extends V> valueFunction, java.util.function.Supplier<I> tableSupplier) {
        return com.google.common.collect.TableCollectors.toTable(rowFunction, columnFunction, valueFunction, tableSupplier);
    }

    static <T, R, C, V, I extends com.google.common.collect.Table<R, C, V>> java.util.stream.Collector<T, ?, I> toTable(java.util.function.Function<? super T, ? extends R> rowFunction, java.util.function.Function<? super T, ? extends C> columnFunction, java.util.function.Function<? super T, ? extends V> valueFunction, java.util.function.BinaryOperator<V> mergeFunction, java.util.function.Supplier<I> tableSupplier) {
        return com.google.common.collect.TableCollectors.toTable(rowFunction, columnFunction, valueFunction, mergeFunction, tableSupplier);
    }

    public static <R, C, V> com.google.common.collect.Table.Cell<R, C, V> immutableCell(@com.google.common.collect.ParametricNullness R rowKey, @com.google.common.collect.ParametricNullness C columnKey, @com.google.common.collect.ParametricNullness V value) {
        return new com.google.common.collect.Tables.ImmutableCell(rowKey, columnKey, value);
    }

    static final class ImmutableCell<R, C, V> extends com.google.common.collect.Tables.AbstractCell<R, C, V> implements java.io.Serializable {
        private static final long serialVersionUID = 0;

        @com.google.common.collect.ParametricNullness
        private final C columnKey;

        @com.google.common.collect.ParametricNullness
        private final R rowKey;

        @com.google.common.collect.ParametricNullness
        private final V value;

        ImmutableCell(@com.google.common.collect.ParametricNullness R rowKey, @com.google.common.collect.ParametricNullness C columnKey, @com.google.common.collect.ParametricNullness V value) {
            this.rowKey = rowKey;
            this.columnKey = columnKey;
            this.value = value;
        }

        @Override // com.google.common.collect.Table.Cell
        @com.google.common.collect.ParametricNullness
        public R getRowKey() {
            return this.rowKey;
        }

        @Override // com.google.common.collect.Table.Cell
        @com.google.common.collect.ParametricNullness
        public C getColumnKey() {
            return this.columnKey;
        }

        @Override // com.google.common.collect.Table.Cell
        @com.google.common.collect.ParametricNullness
        public V getValue() {
            return this.value;
        }
    }

    static abstract class AbstractCell<R, C, V> implements com.google.common.collect.Table.Cell<R, C, V> {
        AbstractCell() {
        }

        @Override // com.google.common.collect.Table.Cell
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.google.common.collect.Table.Cell)) {
                return false;
            }
            com.google.common.collect.Table.Cell cell = (com.google.common.collect.Table.Cell) obj;
            return com.google.common.base.Objects.equal(getRowKey(), cell.getRowKey()) && com.google.common.base.Objects.equal(getColumnKey(), cell.getColumnKey()) && com.google.common.base.Objects.equal(getValue(), cell.getValue());
        }

        @Override // com.google.common.collect.Table.Cell
        public int hashCode() {
            return com.google.common.base.Objects.hashCode(getRowKey(), getColumnKey(), getValue());
        }

        public java.lang.String toString() {
            return "(" + getRowKey() + "," + getColumnKey() + ")=" + getValue();
        }
    }

    public static <R, C, V> com.google.common.collect.Table<C, R, V> transpose(com.google.common.collect.Table<R, C, V> table) {
        if (table instanceof com.google.common.collect.Tables.TransposeTable) {
            return ((com.google.common.collect.Tables.TransposeTable) table).original;
        }
        return new com.google.common.collect.Tables.TransposeTable(table);
    }

    private static class TransposeTable<C, R, V> extends com.google.common.collect.AbstractTable<C, R, V> {
        private static final com.google.common.base.Function TRANSPOSE_CELL = new com.google.common.base.Function<com.google.common.collect.Table.Cell<?, ?, ?>, com.google.common.collect.Table.Cell<?, ?, ?>>() { // from class: com.google.common.collect.Tables.TransposeTable.1
            @Override // com.google.common.base.Function
            public com.google.common.collect.Table.Cell<?, ?, ?> apply(com.google.common.collect.Table.Cell<?, ?, ?> cell) {
                return com.google.common.collect.Tables.immutableCell(cell.getColumnKey(), cell.getRowKey(), cell.getValue());
            }
        };
        final com.google.common.collect.Table<R, C, V> original;

        TransposeTable(com.google.common.collect.Table<R, C, V> original) {
            this.original = (com.google.common.collect.Table) com.google.common.base.Preconditions.checkNotNull(original);
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public void clear() {
            this.original.clear();
        }

        @Override // com.google.common.collect.Table
        public java.util.Map<C, V> column(@com.google.common.collect.ParametricNullness R columnKey) {
            return this.original.row(columnKey);
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public java.util.Set<R> columnKeySet() {
            return this.original.rowKeySet();
        }

        @Override // com.google.common.collect.Table
        public java.util.Map<R, java.util.Map<C, V>> columnMap() {
            return this.original.rowMap();
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object rowKey, @javax.annotation.CheckForNull java.lang.Object columnKey) {
            return this.original.contains(columnKey, rowKey);
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public boolean containsColumn(@javax.annotation.CheckForNull java.lang.Object columnKey) {
            return this.original.containsRow(columnKey);
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public boolean containsRow(@javax.annotation.CheckForNull java.lang.Object rowKey) {
            return this.original.containsColumn(rowKey);
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public boolean containsValue(@javax.annotation.CheckForNull java.lang.Object value) {
            return this.original.containsValue(value);
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        @javax.annotation.CheckForNull
        public V get(@javax.annotation.CheckForNull java.lang.Object rowKey, @javax.annotation.CheckForNull java.lang.Object columnKey) {
            return this.original.get(columnKey, rowKey);
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        @javax.annotation.CheckForNull
        public V put(@com.google.common.collect.ParametricNullness C rowKey, @com.google.common.collect.ParametricNullness R columnKey, @com.google.common.collect.ParametricNullness V value) {
            return this.original.put(columnKey, rowKey, value);
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public void putAll(com.google.common.collect.Table<? extends C, ? extends R, ? extends V> table) {
            this.original.putAll(com.google.common.collect.Tables.transpose(table));
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        @javax.annotation.CheckForNull
        public V remove(@javax.annotation.CheckForNull java.lang.Object rowKey, @javax.annotation.CheckForNull java.lang.Object columnKey) {
            return this.original.remove(columnKey, rowKey);
        }

        @Override // com.google.common.collect.Table
        public java.util.Map<R, V> row(@com.google.common.collect.ParametricNullness C rowKey) {
            return this.original.column(rowKey);
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public java.util.Set<C> rowKeySet() {
            return this.original.columnKeySet();
        }

        @Override // com.google.common.collect.Table
        public java.util.Map<C, java.util.Map<R, V>> rowMap() {
            return this.original.columnMap();
        }

        @Override // com.google.common.collect.Table
        public int size() {
            return this.original.size();
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public java.util.Collection<V> values() {
            return this.original.values();
        }

        @Override // com.google.common.collect.AbstractTable
        java.util.Iterator<com.google.common.collect.Table.Cell<C, R, V>> cellIterator() {
            return com.google.common.collect.Iterators.transform(this.original.cellSet().iterator(), TRANSPOSE_CELL);
        }
    }

    public static <R, C, V> com.google.common.collect.Table<R, C, V> newCustomTable(java.util.Map<R, java.util.Map<C, V>> backingMap, com.google.common.base.Supplier<? extends java.util.Map<C, V>> factory) {
        com.google.common.base.Preconditions.checkArgument(backingMap.isEmpty());
        com.google.common.base.Preconditions.checkNotNull(factory);
        return new com.google.common.collect.StandardTable(backingMap, factory);
    }

    public static <R, C, V1, V2> com.google.common.collect.Table<R, C, V2> transformValues(com.google.common.collect.Table<R, C, V1> fromTable, com.google.common.base.Function<? super V1, V2> function) {
        return new com.google.common.collect.Tables.TransformedTable(fromTable, function);
    }

    private static class TransformedTable<R, C, V1, V2> extends com.google.common.collect.AbstractTable<R, C, V2> {
        final com.google.common.collect.Table<R, C, V1> fromTable;
        final com.google.common.base.Function<? super V1, V2> function;

        TransformedTable(com.google.common.collect.Table<R, C, V1> fromTable, com.google.common.base.Function<? super V1, V2> function) {
            this.fromTable = (com.google.common.collect.Table) com.google.common.base.Preconditions.checkNotNull(fromTable);
            this.function = (com.google.common.base.Function) com.google.common.base.Preconditions.checkNotNull(function);
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object rowKey, @javax.annotation.CheckForNull java.lang.Object columnKey) {
            return this.fromTable.contains(rowKey, columnKey);
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        @javax.annotation.CheckForNull
        public V2 get(@javax.annotation.CheckForNull java.lang.Object obj, @javax.annotation.CheckForNull java.lang.Object obj2) {
            if (contains(obj, obj2)) {
                return this.function.apply((java.lang.Object) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(this.fromTable.get(obj, obj2)));
            }
            return null;
        }

        @Override // com.google.common.collect.Table
        public int size() {
            return this.fromTable.size();
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public void clear() {
            this.fromTable.clear();
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        @javax.annotation.CheckForNull
        public V2 put(@com.google.common.collect.ParametricNullness R rowKey, @com.google.common.collect.ParametricNullness C columnKey, @com.google.common.collect.ParametricNullness V2 value) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public void putAll(com.google.common.collect.Table<? extends R, ? extends C, ? extends V2> table) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        @javax.annotation.CheckForNull
        public V2 remove(@javax.annotation.CheckForNull java.lang.Object obj, @javax.annotation.CheckForNull java.lang.Object obj2) {
            if (contains(obj, obj2)) {
                return this.function.apply((java.lang.Object) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(this.fromTable.remove(obj, obj2)));
            }
            return null;
        }

        @Override // com.google.common.collect.Table
        public java.util.Map<C, V2> row(@com.google.common.collect.ParametricNullness R rowKey) {
            return com.google.common.collect.Maps.transformValues(this.fromTable.row(rowKey), this.function);
        }

        @Override // com.google.common.collect.Table
        public java.util.Map<R, V2> column(@com.google.common.collect.ParametricNullness C columnKey) {
            return com.google.common.collect.Maps.transformValues(this.fromTable.column(columnKey), this.function);
        }

        com.google.common.base.Function<com.google.common.collect.Table.Cell<R, C, V1>, com.google.common.collect.Table.Cell<R, C, V2>> cellFunction() {
            return new com.google.common.base.Function<com.google.common.collect.Table.Cell<R, C, V1>, com.google.common.collect.Table.Cell<R, C, V2>>() { // from class: com.google.common.collect.Tables.TransformedTable.1
                @Override // com.google.common.base.Function
                public com.google.common.collect.Table.Cell<R, C, V2> apply(com.google.common.collect.Table.Cell<R, C, V1> cell) {
                    return com.google.common.collect.Tables.immutableCell(cell.getRowKey(), cell.getColumnKey(), com.google.common.collect.Tables.TransformedTable.this.function.apply(cell.getValue()));
                }
            };
        }

        @Override // com.google.common.collect.AbstractTable
        java.util.Iterator<com.google.common.collect.Table.Cell<R, C, V2>> cellIterator() {
            return com.google.common.collect.Iterators.transform(this.fromTable.cellSet().iterator(), cellFunction());
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public java.util.Set<R> rowKeySet() {
            return this.fromTable.rowKeySet();
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public java.util.Set<C> columnKeySet() {
            return this.fromTable.columnKeySet();
        }

        @Override // com.google.common.collect.AbstractTable
        java.util.Collection<V2> createValues() {
            return com.google.common.collect.Collections2.transform(this.fromTable.values(), this.function);
        }

        @Override // com.google.common.collect.Table
        public java.util.Map<R, java.util.Map<C, V2>> rowMap() {
            return com.google.common.collect.Maps.transformValues(this.fromTable.rowMap(), new com.google.common.base.Function<java.util.Map<C, V1>, java.util.Map<C, V2>>() { // from class: com.google.common.collect.Tables.TransformedTable.2
                @Override // com.google.common.base.Function
                public java.util.Map<C, V2> apply(java.util.Map<C, V1> row) {
                    return com.google.common.collect.Maps.transformValues(row, com.google.common.collect.Tables.TransformedTable.this.function);
                }
            });
        }

        @Override // com.google.common.collect.Table
        public java.util.Map<C, java.util.Map<R, V2>> columnMap() {
            return com.google.common.collect.Maps.transformValues(this.fromTable.columnMap(), new com.google.common.base.Function<java.util.Map<R, V1>, java.util.Map<R, V2>>() { // from class: com.google.common.collect.Tables.TransformedTable.3
                @Override // com.google.common.base.Function
                public java.util.Map<R, V2> apply(java.util.Map<R, V1> column) {
                    return com.google.common.collect.Maps.transformValues(column, com.google.common.collect.Tables.TransformedTable.this.function);
                }
            });
        }
    }

    public static <R, C, V> com.google.common.collect.Table<R, C, V> unmodifiableTable(com.google.common.collect.Table<? extends R, ? extends C, ? extends V> table) {
        return new com.google.common.collect.Tables.UnmodifiableTable(table);
    }

    private static class UnmodifiableTable<R, C, V> extends com.google.common.collect.ForwardingTable<R, C, V> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        final com.google.common.collect.Table<? extends R, ? extends C, ? extends V> delegate;

        UnmodifiableTable(com.google.common.collect.Table<? extends R, ? extends C, ? extends V> delegate) {
            this.delegate = (com.google.common.collect.Table) com.google.common.base.Preconditions.checkNotNull(delegate);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.ForwardingObject
        public com.google.common.collect.Table<R, C, V> delegate() {
            return this.delegate;
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public java.util.Set<com.google.common.collect.Table.Cell<R, C, V>> cellSet() {
            return java.util.Collections.unmodifiableSet(super.cellSet());
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public void clear() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public java.util.Map<R, V> column(@com.google.common.collect.ParametricNullness C columnKey) {
            return java.util.Collections.unmodifiableMap(super.column(columnKey));
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public java.util.Set<C> columnKeySet() {
            return java.util.Collections.unmodifiableSet(super.columnKeySet());
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public java.util.Map<C, java.util.Map<R, V>> columnMap() {
            return java.util.Collections.unmodifiableMap(com.google.common.collect.Maps.transformValues(super.columnMap(), com.google.common.collect.Tables.unmodifiableWrapper()));
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        @javax.annotation.CheckForNull
        public V put(@com.google.common.collect.ParametricNullness R rowKey, @com.google.common.collect.ParametricNullness C columnKey, @com.google.common.collect.ParametricNullness V value) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public void putAll(com.google.common.collect.Table<? extends R, ? extends C, ? extends V> table) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        @javax.annotation.CheckForNull
        public V remove(@javax.annotation.CheckForNull java.lang.Object rowKey, @javax.annotation.CheckForNull java.lang.Object columnKey) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public java.util.Map<C, V> row(@com.google.common.collect.ParametricNullness R rowKey) {
            return java.util.Collections.unmodifiableMap(super.row(rowKey));
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public java.util.Set<R> rowKeySet() {
            return java.util.Collections.unmodifiableSet(super.rowKeySet());
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public java.util.Map<R, java.util.Map<C, V>> rowMap() {
            return java.util.Collections.unmodifiableMap(com.google.common.collect.Maps.transformValues(super.rowMap(), com.google.common.collect.Tables.unmodifiableWrapper()));
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public java.util.Collection<V> values() {
            return java.util.Collections.unmodifiableCollection(super.values());
        }
    }

    public static <R, C, V> com.google.common.collect.RowSortedTable<R, C, V> unmodifiableRowSortedTable(com.google.common.collect.RowSortedTable<R, ? extends C, ? extends V> table) {
        return new com.google.common.collect.Tables.UnmodifiableRowSortedMap(table);
    }

    private static final class UnmodifiableRowSortedMap<R, C, V> extends com.google.common.collect.Tables.UnmodifiableTable<R, C, V> implements com.google.common.collect.RowSortedTable<R, C, V> {
        private static final long serialVersionUID = 0;

        public UnmodifiableRowSortedMap(com.google.common.collect.RowSortedTable<R, ? extends C, ? extends V> delegate) {
            super(delegate);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.Tables.UnmodifiableTable, com.google.common.collect.ForwardingTable, com.google.common.collect.ForwardingObject
        public com.google.common.collect.RowSortedTable<R, C, V> delegate() {
            return (com.google.common.collect.RowSortedTable) super.delegate();
        }

        @Override // com.google.common.collect.Tables.UnmodifiableTable, com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public java.util.SortedMap<R, java.util.Map<C, V>> rowMap() {
            return java.util.Collections.unmodifiableSortedMap(com.google.common.collect.Maps.transformValues((java.util.SortedMap) delegate().rowMap(), com.google.common.collect.Tables.unmodifiableWrapper()));
        }

        @Override // com.google.common.collect.Tables.UnmodifiableTable, com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public java.util.SortedSet<R> rowKeySet() {
            return java.util.Collections.unmodifiableSortedSet(delegate().rowKeySet());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> com.google.common.base.Function<java.util.Map<K, V>, java.util.Map<K, V>> unmodifiableWrapper() {
        return (com.google.common.base.Function<java.util.Map<K, V>, java.util.Map<K, V>>) UNMODIFIABLE_WRAPPER;
    }

    public static <R, C, V> com.google.common.collect.Table<R, C, V> synchronizedTable(com.google.common.collect.Table<R, C, V> table) {
        return com.google.common.collect.Synchronized.table(table, null);
    }

    static boolean equalsImpl(com.google.common.collect.Table<?, ?, ?> table, @javax.annotation.CheckForNull java.lang.Object obj) {
        if (obj == table) {
            return true;
        }
        if (obj instanceof com.google.common.collect.Table) {
            return table.cellSet().equals(((com.google.common.collect.Table) obj).cellSet());
        }
        return false;
    }
}
