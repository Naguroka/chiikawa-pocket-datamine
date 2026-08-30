package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public final class ArrayTable<R, C, V> extends com.google.common.collect.AbstractTable<R, C, V> implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    private final V[][] array;
    private final com.google.common.collect.ImmutableMap<C, java.lang.Integer> columnKeyToIndex;
    private final com.google.common.collect.ImmutableList<C> columnList;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.collect.ArrayTable<R, C, V>.ColumnMap columnMap;
    private final com.google.common.collect.ImmutableMap<R, java.lang.Integer> rowKeyToIndex;
    private final com.google.common.collect.ImmutableList<R> rowList;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.collect.ArrayTable<R, C, V>.RowMap rowMap;

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.AbstractTable
    public /* bridge */ /* synthetic */ java.lang.String toString() {
        return super.toString();
    }

    public static <R, C, V> com.google.common.collect.ArrayTable<R, C, V> create(java.lang.Iterable<? extends R> rowKeys, java.lang.Iterable<? extends C> columnKeys) {
        return new com.google.common.collect.ArrayTable<>(rowKeys, columnKeys);
    }

    public static <R, C, V> com.google.common.collect.ArrayTable<R, C, V> create(com.google.common.collect.Table<R, C, ? extends V> table) {
        if (table instanceof com.google.common.collect.ArrayTable) {
            return new com.google.common.collect.ArrayTable<>((com.google.common.collect.ArrayTable) table);
        }
        return new com.google.common.collect.ArrayTable<>(table);
    }

    private ArrayTable(java.lang.Iterable<? extends R> iterable, java.lang.Iterable<? extends C> iterable2) {
        com.google.common.collect.ImmutableList<R> immutableListCopyOf = com.google.common.collect.ImmutableList.copyOf(iterable);
        this.rowList = immutableListCopyOf;
        com.google.common.collect.ImmutableList<C> immutableListCopyOf2 = com.google.common.collect.ImmutableList.copyOf(iterable2);
        this.columnList = immutableListCopyOf2;
        com.google.common.base.Preconditions.checkArgument(immutableListCopyOf.isEmpty() == immutableListCopyOf2.isEmpty());
        this.rowKeyToIndex = com.google.common.collect.Maps.indexMap(immutableListCopyOf);
        this.columnKeyToIndex = com.google.common.collect.Maps.indexMap(immutableListCopyOf2);
        this.array = (V[][]) ((java.lang.Object[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Object.class, immutableListCopyOf.size(), immutableListCopyOf2.size()));
        eraseAll();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ArrayTable(com.google.common.collect.Table<R, C, ? extends V> table) {
        this(table.rowKeySet(), table.columnKeySet());
        putAll(table);
    }

    private ArrayTable(com.google.common.collect.ArrayTable<R, C, V> arrayTable) {
        com.google.common.collect.ImmutableList<R> immutableList = arrayTable.rowList;
        this.rowList = immutableList;
        com.google.common.collect.ImmutableList<C> immutableList2 = arrayTable.columnList;
        this.columnList = immutableList2;
        this.rowKeyToIndex = arrayTable.rowKeyToIndex;
        this.columnKeyToIndex = arrayTable.columnKeyToIndex;
        V[][] vArr = (V[][]) ((java.lang.Object[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Object.class, immutableList.size(), immutableList2.size()));
        this.array = vArr;
        for (int i = 0; i < this.rowList.size(); i++) {
            V[] vArr2 = arrayTable.array[i];
            java.lang.System.arraycopy(vArr2, 0, vArr[i], 0, vArr2.length);
        }
    }

    private static abstract class ArrayMap<K, V> extends com.google.common.collect.Maps.IteratorBasedAbstractMap<K, V> {
        private final com.google.common.collect.ImmutableMap<K, java.lang.Integer> keyIndex;

        abstract java.lang.String getKeyRole();

        @com.google.common.collect.ParametricNullness
        abstract V getValue(int index);

        @com.google.common.collect.ParametricNullness
        abstract V setValue(int index, @com.google.common.collect.ParametricNullness V newValue);

        private ArrayMap(com.google.common.collect.ImmutableMap<K, java.lang.Integer> keyIndex) {
            this.keyIndex = keyIndex;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public java.util.Set<K> keySet() {
            return this.keyIndex.keySet();
        }

        K getKey(int index) {
            return this.keyIndex.keySet().asList().get(index);
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.keyIndex.size();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return this.keyIndex.isEmpty();
        }

        java.util.Map.Entry<K, V> getEntry(final int index) {
            com.google.common.base.Preconditions.checkElementIndex(index, size());
            return new com.google.common.collect.AbstractMapEntry<K, V>() { // from class: com.google.common.collect.ArrayTable.ArrayMap.1
                @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                public K getKey() {
                    return (K) com.google.common.collect.ArrayTable.ArrayMap.this.getKey(index);
                }

                @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                @com.google.common.collect.ParametricNullness
                public V getValue() {
                    return (V) com.google.common.collect.ArrayTable.ArrayMap.this.getValue(index);
                }

                @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                @com.google.common.collect.ParametricNullness
                public V setValue(@com.google.common.collect.ParametricNullness V v) {
                    return (V) com.google.common.collect.ArrayTable.ArrayMap.this.setValue(index, v);
                }
            };
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        java.util.Iterator<java.util.Map.Entry<K, V>> entryIterator() {
            return new com.google.common.collect.AbstractIndexedListIterator<java.util.Map.Entry<K, V>>(size()) { // from class: com.google.common.collect.ArrayTable.ArrayMap.2
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractIndexedListIterator
                public java.util.Map.Entry<K, V> get(final int index) {
                    return com.google.common.collect.ArrayTable.ArrayMap.this.getEntry(index);
                }
            };
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object key) {
            return this.keyIndex.containsKey(key);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public V get(@javax.annotation.CheckForNull java.lang.Object key) {
            java.lang.Integer num = this.keyIndex.get(key);
            if (num == null) {
                return null;
            }
            return getValue(num.intValue());
        }

        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public V put(K key, @com.google.common.collect.ParametricNullness V value) {
            java.lang.Integer num = this.keyIndex.get(key);
            if (num == null) {
                throw new java.lang.IllegalArgumentException(getKeyRole() + " " + key + " not in " + this.keyIndex.keySet());
            }
            return setValue(num.intValue(), value);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public V remove(@javax.annotation.CheckForNull java.lang.Object key) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public void clear() {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    public com.google.common.collect.ImmutableList<R> rowKeyList() {
        return this.rowList;
    }

    public com.google.common.collect.ImmutableList<C> columnKeyList() {
        return this.columnList;
    }

    @javax.annotation.CheckForNull
    public V at(int rowIndex, int columnIndex) {
        com.google.common.base.Preconditions.checkElementIndex(rowIndex, this.rowList.size());
        com.google.common.base.Preconditions.checkElementIndex(columnIndex, this.columnList.size());
        return this.array[rowIndex][columnIndex];
    }

    @javax.annotation.CheckForNull
    public V set(int rowIndex, int columnIndex, @javax.annotation.CheckForNull V value) {
        com.google.common.base.Preconditions.checkElementIndex(rowIndex, this.rowList.size());
        com.google.common.base.Preconditions.checkElementIndex(columnIndex, this.columnList.size());
        V[] vArr = this.array[rowIndex];
        V v = vArr[columnIndex];
        vArr[columnIndex] = value;
        return v;
    }

    public V[][] toArray(java.lang.Class<V> cls) {
        V[][] vArr = (V[][]) ((java.lang.Object[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls, this.rowList.size(), this.columnList.size()));
        for (int i = 0; i < this.rowList.size(); i++) {
            V[] vArr2 = this.array[i];
            java.lang.System.arraycopy(vArr2, 0, vArr[i], 0, vArr2.length);
        }
        return vArr;
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @java.lang.Deprecated
    public void clear() {
        throw new java.lang.UnsupportedOperationException();
    }

    public void eraseAll() {
        for (V[] vArr : this.array) {
            java.util.Arrays.fill(vArr, (java.lang.Object) null);
        }
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean contains(@javax.annotation.CheckForNull java.lang.Object rowKey, @javax.annotation.CheckForNull java.lang.Object columnKey) {
        return containsRow(rowKey) && containsColumn(columnKey);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean containsColumn(@javax.annotation.CheckForNull java.lang.Object columnKey) {
        return this.columnKeyToIndex.containsKey(columnKey);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean containsRow(@javax.annotation.CheckForNull java.lang.Object rowKey) {
        return this.rowKeyToIndex.containsKey(rowKey);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean containsValue(@javax.annotation.CheckForNull java.lang.Object value) {
        for (V[] vArr : this.array) {
            for (V v : vArr) {
                if (com.google.common.base.Objects.equal(value, v)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @javax.annotation.CheckForNull
    public V get(@javax.annotation.CheckForNull java.lang.Object rowKey, @javax.annotation.CheckForNull java.lang.Object columnKey) {
        java.lang.Integer num = this.rowKeyToIndex.get(rowKey);
        java.lang.Integer num2 = this.columnKeyToIndex.get(columnKey);
        if (num == null || num2 == null) {
            return null;
        }
        return at(num.intValue(), num2.intValue());
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean isEmpty() {
        return this.rowList.isEmpty() || this.columnList.isEmpty();
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @javax.annotation.CheckForNull
    public V put(R rowKey, C columnKey, @javax.annotation.CheckForNull V value) {
        com.google.common.base.Preconditions.checkNotNull(rowKey);
        com.google.common.base.Preconditions.checkNotNull(columnKey);
        java.lang.Integer num = this.rowKeyToIndex.get(rowKey);
        com.google.common.base.Preconditions.checkArgument(num != null, "Row %s not in %s", rowKey, this.rowList);
        java.lang.Integer num2 = this.columnKeyToIndex.get(columnKey);
        com.google.common.base.Preconditions.checkArgument(num2 != null, "Column %s not in %s", columnKey, this.columnList);
        return set(num.intValue(), num2.intValue(), value);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public void putAll(com.google.common.collect.Table<? extends R, ? extends C, ? extends V> table) {
        super.putAll(table);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @javax.annotation.CheckForNull
    @java.lang.Deprecated
    public V remove(@javax.annotation.CheckForNull java.lang.Object rowKey, @javax.annotation.CheckForNull java.lang.Object columnKey) {
        throw new java.lang.UnsupportedOperationException();
    }

    @javax.annotation.CheckForNull
    public V erase(@javax.annotation.CheckForNull java.lang.Object rowKey, @javax.annotation.CheckForNull java.lang.Object columnKey) {
        java.lang.Integer num = this.rowKeyToIndex.get(rowKey);
        java.lang.Integer num2 = this.columnKeyToIndex.get(columnKey);
        if (num == null || num2 == null) {
            return null;
        }
        return set(num.intValue(), num2.intValue(), null);
    }

    @Override // com.google.common.collect.Table
    public int size() {
        return this.rowList.size() * this.columnList.size();
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public java.util.Set<com.google.common.collect.Table.Cell<R, C, V>> cellSet() {
        return super.cellSet();
    }

    @Override // com.google.common.collect.AbstractTable
    java.util.Iterator<com.google.common.collect.Table.Cell<R, C, V>> cellIterator() {
        return new com.google.common.collect.AbstractIndexedListIterator<com.google.common.collect.Table.Cell<R, C, V>>(size()) { // from class: com.google.common.collect.ArrayTable.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.AbstractIndexedListIterator
            public com.google.common.collect.Table.Cell<R, C, V> get(final int index) {
                return com.google.common.collect.ArrayTable.this.getCell(index);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.common.collect.Table.Cell<R, C, V> getCell(final int index) {
        return new com.google.common.collect.Tables.AbstractCell<R, C, V>(index) { // from class: com.google.common.collect.ArrayTable.2
            final int columnIndex;
            final int rowIndex;
            final /* synthetic */ int val$index;

            {
                this.val$index = index;
                this.rowIndex = index / com.google.common.collect.ArrayTable.this.columnList.size();
                this.columnIndex = index % com.google.common.collect.ArrayTable.this.columnList.size();
            }

            @Override // com.google.common.collect.Table.Cell
            public R getRowKey() {
                return (R) com.google.common.collect.ArrayTable.this.rowList.get(this.rowIndex);
            }

            @Override // com.google.common.collect.Table.Cell
            public C getColumnKey() {
                return (C) com.google.common.collect.ArrayTable.this.columnList.get(this.columnIndex);
            }

            @Override // com.google.common.collect.Table.Cell
            @javax.annotation.CheckForNull
            public V getValue() {
                return (V) com.google.common.collect.ArrayTable.this.at(this.rowIndex, this.columnIndex);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    @javax.annotation.CheckForNull
    public V getValue(int index) {
        return at(index / this.columnList.size(), index % this.columnList.size());
    }

    @Override // com.google.common.collect.Table
    public java.util.Map<R, V> column(C columnKey) {
        com.google.common.base.Preconditions.checkNotNull(columnKey);
        java.lang.Integer num = this.columnKeyToIndex.get(columnKey);
        if (num == null) {
            return java.util.Collections.emptyMap();
        }
        return new com.google.common.collect.ArrayTable.Column(num.intValue());
    }

    private class Column extends com.google.common.collect.ArrayTable.ArrayMap<R, V> {
        final int columnIndex;

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        java.lang.String getKeyRole() {
            return "Row";
        }

        Column(int columnIndex) {
            super(com.google.common.collect.ArrayTable.this.rowKeyToIndex);
            this.columnIndex = columnIndex;
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        @javax.annotation.CheckForNull
        V getValue(int i) {
            return (V) com.google.common.collect.ArrayTable.this.at(i, this.columnIndex);
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        @javax.annotation.CheckForNull
        V setValue(int i, @javax.annotation.CheckForNull V v) {
            return (V) com.google.common.collect.ArrayTable.this.set(i, this.columnIndex, v);
        }
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public com.google.common.collect.ImmutableSet<C> columnKeySet() {
        return this.columnKeyToIndex.keySet();
    }

    @Override // com.google.common.collect.Table
    public java.util.Map<C, java.util.Map<R, V>> columnMap() {
        com.google.common.collect.ArrayTable<R, C, V>.ColumnMap columnMap = this.columnMap;
        if (columnMap != null) {
            return columnMap;
        }
        com.google.common.collect.ArrayTable<R, C, V>.ColumnMap columnMap2 = new com.google.common.collect.ArrayTable.ColumnMap();
        this.columnMap = columnMap2;
        return columnMap2;
    }

    private class ColumnMap extends com.google.common.collect.ArrayTable.ArrayMap<C, java.util.Map<R, V>> {
        @Override // com.google.common.collect.ArrayTable.ArrayMap
        java.lang.String getKeyRole() {
            return "Column";
        }

        private ColumnMap() {
            super(com.google.common.collect.ArrayTable.this.columnKeyToIndex);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ArrayTable.ArrayMap
        public java.util.Map<R, V> getValue(int index) {
            return new com.google.common.collect.ArrayTable.Column(index);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ArrayTable.ArrayMap
        public java.util.Map<R, V> setValue(int index, java.util.Map<R, V> newValue) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap, java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public java.util.Map<R, V> put(C key, java.util.Map<R, V> value) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    @Override // com.google.common.collect.Table
    public java.util.Map<C, V> row(R rowKey) {
        com.google.common.base.Preconditions.checkNotNull(rowKey);
        java.lang.Integer num = this.rowKeyToIndex.get(rowKey);
        if (num == null) {
            return java.util.Collections.emptyMap();
        }
        return new com.google.common.collect.ArrayTable.Row(num.intValue());
    }

    private class Row extends com.google.common.collect.ArrayTable.ArrayMap<C, V> {
        final int rowIndex;

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        java.lang.String getKeyRole() {
            return "Column";
        }

        Row(int rowIndex) {
            super(com.google.common.collect.ArrayTable.this.columnKeyToIndex);
            this.rowIndex = rowIndex;
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        @javax.annotation.CheckForNull
        V getValue(int i) {
            return (V) com.google.common.collect.ArrayTable.this.at(this.rowIndex, i);
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        @javax.annotation.CheckForNull
        V setValue(int i, @javax.annotation.CheckForNull V v) {
            return (V) com.google.common.collect.ArrayTable.this.set(this.rowIndex, i, v);
        }
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public com.google.common.collect.ImmutableSet<R> rowKeySet() {
        return this.rowKeyToIndex.keySet();
    }

    @Override // com.google.common.collect.Table
    public java.util.Map<R, java.util.Map<C, V>> rowMap() {
        com.google.common.collect.ArrayTable<R, C, V>.RowMap rowMap = this.rowMap;
        if (rowMap != null) {
            return rowMap;
        }
        com.google.common.collect.ArrayTable<R, C, V>.RowMap rowMap2 = new com.google.common.collect.ArrayTable.RowMap();
        this.rowMap = rowMap2;
        return rowMap2;
    }

    private class RowMap extends com.google.common.collect.ArrayTable.ArrayMap<R, java.util.Map<C, V>> {
        @Override // com.google.common.collect.ArrayTable.ArrayMap
        java.lang.String getKeyRole() {
            return "Row";
        }

        private RowMap() {
            super(com.google.common.collect.ArrayTable.this.rowKeyToIndex);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ArrayTable.ArrayMap
        public java.util.Map<C, V> getValue(int index) {
            return new com.google.common.collect.ArrayTable.Row(index);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ArrayTable.ArrayMap
        public java.util.Map<C, V> setValue(int index, java.util.Map<C, V> newValue) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap, java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public java.util.Map<C, V> put(R key, java.util.Map<C, V> value) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public java.util.Collection<V> values() {
        return super.values();
    }

    @Override // com.google.common.collect.AbstractTable
    java.util.Iterator<V> valuesIterator() {
        return new com.google.common.collect.AbstractIndexedListIterator<V>(size()) { // from class: com.google.common.collect.ArrayTable.3
            @Override // com.google.common.collect.AbstractIndexedListIterator
            @javax.annotation.CheckForNull
            protected V get(int i) {
                return (V) com.google.common.collect.ArrayTable.this.getValue(i);
            }
        };
    }
}
