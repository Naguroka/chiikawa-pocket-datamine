package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ImmutableTable<R, C, V> extends com.google.common.collect.AbstractTable<R, C, V> implements java.io.Serializable {
    private static final long serialVersionUID = 912559;

    @Override // com.google.common.collect.Table
    public abstract com.google.common.collect.ImmutableMap<C, java.util.Map<R, V>> columnMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractTable
    public abstract com.google.common.collect.ImmutableSet<com.google.common.collect.Table.Cell<R, C, V>> createCellSet();

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractTable
    public abstract com.google.common.collect.ImmutableCollection<V> createValues();

    @Override // com.google.common.collect.Table
    public abstract com.google.common.collect.ImmutableMap<R, java.util.Map<C, V>> rowMap();

    abstract java.lang.Object writeReplace();

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean containsColumn(@javax.annotation.CheckForNull java.lang.Object columnKey) {
        return super.containsColumn(columnKey);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean containsRow(@javax.annotation.CheckForNull java.lang.Object rowKey) {
        return super.containsRow(rowKey);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @javax.annotation.CheckForNull
    public /* bridge */ /* synthetic */ java.lang.Object get(@javax.annotation.CheckForNull java.lang.Object rowKey, @javax.annotation.CheckForNull java.lang.Object columnKey) {
        return super.get(rowKey, columnKey);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.AbstractTable
    public /* bridge */ /* synthetic */ java.lang.String toString() {
        return super.toString();
    }

    static <T, R, C, V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableTable<R, C, V>> toImmutableTable(java.util.function.Function<? super T, ? extends R> rowFunction, java.util.function.Function<? super T, ? extends C> columnFunction, java.util.function.Function<? super T, ? extends V> valueFunction) {
        return com.google.common.collect.TableCollectors.toImmutableTable(rowFunction, columnFunction, valueFunction);
    }

    static <T, R, C, V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableTable<R, C, V>> toImmutableTable(java.util.function.Function<? super T, ? extends R> rowFunction, java.util.function.Function<? super T, ? extends C> columnFunction, java.util.function.Function<? super T, ? extends V> valueFunction, java.util.function.BinaryOperator<V> mergeFunction) {
        return com.google.common.collect.TableCollectors.toImmutableTable(rowFunction, columnFunction, valueFunction, mergeFunction);
    }

    public static <R, C, V> com.google.common.collect.ImmutableTable<R, C, V> of() {
        return (com.google.common.collect.ImmutableTable<R, C, V>) com.google.common.collect.SparseImmutableTable.EMPTY;
    }

    public static <R, C, V> com.google.common.collect.ImmutableTable<R, C, V> of(R rowKey, C columnKey, V value) {
        return new com.google.common.collect.SingletonImmutableTable(rowKey, columnKey, value);
    }

    public static <R, C, V> com.google.common.collect.ImmutableTable<R, C, V> copyOf(com.google.common.collect.Table<? extends R, ? extends C, ? extends V> table) {
        if (table instanceof com.google.common.collect.ImmutableTable) {
            return (com.google.common.collect.ImmutableTable) table;
        }
        return copyOf(table.cellSet());
    }

    static <R, C, V> com.google.common.collect.ImmutableTable<R, C, V> copyOf(java.lang.Iterable<? extends com.google.common.collect.Table.Cell<? extends R, ? extends C, ? extends V>> cells) {
        com.google.common.collect.ImmutableTable.Builder builder = builder();
        java.util.Iterator<? extends com.google.common.collect.Table.Cell<? extends R, ? extends C, ? extends V>> it = cells.iterator();
        while (it.hasNext()) {
            builder.put(it.next());
        }
        return builder.build();
    }

    public static <R, C, V> com.google.common.collect.ImmutableTable.Builder<R, C, V> builder() {
        return new com.google.common.collect.ImmutableTable.Builder<>();
    }

    static <R, C, V> com.google.common.collect.Table.Cell<R, C, V> cellOf(R rowKey, C columnKey, V value) {
        return com.google.common.collect.Tables.immutableCell(com.google.common.base.Preconditions.checkNotNull(rowKey, "rowKey"), com.google.common.base.Preconditions.checkNotNull(columnKey, "columnKey"), com.google.common.base.Preconditions.checkNotNull(value, "value"));
    }

    @com.google.errorprone.annotations.DoNotMock
    public static final class Builder<R, C, V> {
        private final java.util.List<com.google.common.collect.Table.Cell<R, C, V>> cells = com.google.common.collect.Lists.newArrayList();

        @javax.annotation.CheckForNull
        private java.util.Comparator<? super C> columnComparator;

        @javax.annotation.CheckForNull
        private java.util.Comparator<? super R> rowComparator;

        public com.google.common.collect.ImmutableTable.Builder<R, C, V> orderRowsBy(java.util.Comparator<? super R> rowComparator) {
            this.rowComparator = (java.util.Comparator) com.google.common.base.Preconditions.checkNotNull(rowComparator, "rowComparator");
            return this;
        }

        public com.google.common.collect.ImmutableTable.Builder<R, C, V> orderColumnsBy(java.util.Comparator<? super C> columnComparator) {
            this.columnComparator = (java.util.Comparator) com.google.common.base.Preconditions.checkNotNull(columnComparator, "columnComparator");
            return this;
        }

        public com.google.common.collect.ImmutableTable.Builder<R, C, V> put(R rowKey, C columnKey, V value) {
            this.cells.add(com.google.common.collect.ImmutableTable.cellOf(rowKey, columnKey, value));
            return this;
        }

        public com.google.common.collect.ImmutableTable.Builder<R, C, V> put(com.google.common.collect.Table.Cell<? extends R, ? extends C, ? extends V> cell) {
            if (cell instanceof com.google.common.collect.Tables.ImmutableCell) {
                com.google.common.base.Preconditions.checkNotNull(cell.getRowKey(), "row");
                com.google.common.base.Preconditions.checkNotNull(cell.getColumnKey(), "column");
                com.google.common.base.Preconditions.checkNotNull(cell.getValue(), "value");
                this.cells.add(cell);
            } else {
                put(cell.getRowKey(), cell.getColumnKey(), cell.getValue());
            }
            return this;
        }

        public com.google.common.collect.ImmutableTable.Builder<R, C, V> putAll(com.google.common.collect.Table<? extends R, ? extends C, ? extends V> table) {
            java.util.Iterator<com.google.common.collect.Table.Cell<? extends R, ? extends C, ? extends V>> it = table.cellSet().iterator();
            while (it.hasNext()) {
                put(it.next());
            }
            return this;
        }

        com.google.common.collect.ImmutableTable.Builder<R, C, V> combine(com.google.common.collect.ImmutableTable.Builder<R, C, V> other) {
            this.cells.addAll(other.cells);
            return this;
        }

        public com.google.common.collect.ImmutableTable<R, C, V> build() {
            return buildOrThrow();
        }

        public com.google.common.collect.ImmutableTable<R, C, V> buildOrThrow() {
            int size = this.cells.size();
            if (size == 0) {
                return com.google.common.collect.ImmutableTable.of();
            }
            if (size == 1) {
                return new com.google.common.collect.SingletonImmutableTable((com.google.common.collect.Table.Cell) com.google.common.collect.Iterables.getOnlyElement(this.cells));
            }
            return com.google.common.collect.RegularImmutableTable.forCells(this.cells, this.rowComparator, this.columnComparator);
        }
    }

    ImmutableTable() {
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public com.google.common.collect.ImmutableSet<com.google.common.collect.Table.Cell<R, C, V>> cellSet() {
        return (com.google.common.collect.ImmutableSet) super.cellSet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractTable
    public final com.google.common.collect.UnmodifiableIterator<com.google.common.collect.Table.Cell<R, C, V>> cellIterator() {
        throw new java.lang.AssertionError("should never be called");
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public com.google.common.collect.ImmutableCollection<V> values() {
        return (com.google.common.collect.ImmutableCollection) super.values();
    }

    @Override // com.google.common.collect.AbstractTable
    final java.util.Iterator<V> valuesIterator() {
        throw new java.lang.AssertionError("should never be called");
    }

    @Override // com.google.common.collect.Table
    public com.google.common.collect.ImmutableMap<R, V> column(C columnKey) {
        com.google.common.base.Preconditions.checkNotNull(columnKey, "columnKey");
        return (com.google.common.collect.ImmutableMap) com.google.common.base.MoreObjects.firstNonNull((com.google.common.collect.ImmutableMap) columnMap().get(columnKey), com.google.common.collect.ImmutableMap.of());
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public com.google.common.collect.ImmutableSet<C> columnKeySet() {
        return columnMap().keySet();
    }

    @Override // com.google.common.collect.Table
    public com.google.common.collect.ImmutableMap<C, V> row(R rowKey) {
        com.google.common.base.Preconditions.checkNotNull(rowKey, "rowKey");
        return (com.google.common.collect.ImmutableMap) com.google.common.base.MoreObjects.firstNonNull((com.google.common.collect.ImmutableMap) rowMap().get(rowKey), com.google.common.collect.ImmutableMap.of());
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public com.google.common.collect.ImmutableSet<R> rowKeySet() {
        return rowMap().keySet();
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean contains(@javax.annotation.CheckForNull java.lang.Object rowKey, @javax.annotation.CheckForNull java.lang.Object columnKey) {
        return get(rowKey, columnKey) != null;
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean containsValue(@javax.annotation.CheckForNull java.lang.Object value) {
        return values().contains(value);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @java.lang.Deprecated
    public final void clear() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @javax.annotation.CheckForNull
    @java.lang.Deprecated
    public final V put(R rowKey, C columnKey, V value) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @java.lang.Deprecated
    public final void putAll(com.google.common.collect.Table<? extends R, ? extends C, ? extends V> table) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @javax.annotation.CheckForNull
    @java.lang.Deprecated
    public final V remove(@javax.annotation.CheckForNull java.lang.Object rowKey, @javax.annotation.CheckForNull java.lang.Object columnKey) {
        throw new java.lang.UnsupportedOperationException();
    }

    static final class SerializedForm implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final int[] cellColumnIndices;
        private final int[] cellRowIndices;
        private final java.lang.Object[] cellValues;
        private final java.lang.Object[] columnKeys;
        private final java.lang.Object[] rowKeys;

        private SerializedForm(java.lang.Object[] rowKeys, java.lang.Object[] columnKeys, java.lang.Object[] cellValues, int[] cellRowIndices, int[] cellColumnIndices) {
            this.rowKeys = rowKeys;
            this.columnKeys = columnKeys;
            this.cellValues = cellValues;
            this.cellRowIndices = cellRowIndices;
            this.cellColumnIndices = cellColumnIndices;
        }

        static com.google.common.collect.ImmutableTable.SerializedForm create(com.google.common.collect.ImmutableTable<?, ?, ?> table, int[] cellRowIndices, int[] cellColumnIndices) {
            return new com.google.common.collect.ImmutableTable.SerializedForm(table.rowKeySet().toArray(), table.columnKeySet().toArray(), table.values().toArray(), cellRowIndices, cellColumnIndices);
        }

        java.lang.Object readResolve() {
            java.lang.Object[] objArr = this.cellValues;
            if (objArr.length == 0) {
                return com.google.common.collect.ImmutableTable.of();
            }
            int i = 0;
            if (objArr.length == 1) {
                return com.google.common.collect.ImmutableTable.of(this.rowKeys[0], this.columnKeys[0], objArr[0]);
            }
            com.google.common.collect.ImmutableList.Builder builder = new com.google.common.collect.ImmutableList.Builder(this.cellValues.length);
            while (true) {
                java.lang.Object[] objArr2 = this.cellValues;
                if (i < objArr2.length) {
                    builder.add(com.google.common.collect.ImmutableTable.cellOf(this.rowKeys[this.cellRowIndices[i]], this.columnKeys[this.cellColumnIndices[i]], objArr2[i]));
                    i++;
                } else {
                    return com.google.common.collect.RegularImmutableTable.forOrderedComponents(builder.build(), com.google.common.collect.ImmutableSet.copyOf(this.rowKeys), com.google.common.collect.ImmutableSet.copyOf(this.columnKeys));
                }
            }
        }
    }

    private void readObject(java.io.ObjectInputStream stream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use SerializedForm");
    }
}
