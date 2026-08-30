package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.errorprone.annotations.Immutable(containerOf = {"R", "C", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED})
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class DenseImmutableTable<R, C, V> extends com.google.common.collect.RegularImmutableTable<R, C, V> {
    private final int[] cellColumnIndices;
    private final int[] cellRowIndices;
    private final int[] columnCounts;
    private final com.google.common.collect.ImmutableMap<C, java.lang.Integer> columnKeyToIndex;
    private final com.google.common.collect.ImmutableMap<C, com.google.common.collect.ImmutableMap<R, V>> columnMap;
    private final int[] rowCounts;
    private final com.google.common.collect.ImmutableMap<R, java.lang.Integer> rowKeyToIndex;
    private final com.google.common.collect.ImmutableMap<R, com.google.common.collect.ImmutableMap<C, V>> rowMap;
    private final V[][] values;

    DenseImmutableTable(com.google.common.collect.ImmutableList<com.google.common.collect.Table.Cell<R, C, V>> immutableList, com.google.common.collect.ImmutableSet<R> immutableSet, com.google.common.collect.ImmutableSet<C> immutableSet2) {
        this.values = (V[][]) ((java.lang.Object[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Object.class, immutableSet.size(), immutableSet2.size()));
        com.google.common.collect.ImmutableMap<R, java.lang.Integer> immutableMapIndexMap = com.google.common.collect.Maps.indexMap(immutableSet);
        this.rowKeyToIndex = immutableMapIndexMap;
        com.google.common.collect.ImmutableMap<C, java.lang.Integer> immutableMapIndexMap2 = com.google.common.collect.Maps.indexMap(immutableSet2);
        this.columnKeyToIndex = immutableMapIndexMap2;
        this.rowCounts = new int[immutableMapIndexMap.size()];
        this.columnCounts = new int[immutableMapIndexMap2.size()];
        int[] iArr = new int[immutableList.size()];
        int[] iArr2 = new int[immutableList.size()];
        for (int i = 0; i < immutableList.size(); i++) {
            com.google.common.collect.Table.Cell<R, C, V> cell = immutableList.get(i);
            R rowKey = cell.getRowKey();
            C columnKey = cell.getColumnKey();
            int iIntValue = ((java.lang.Integer) java.util.Objects.requireNonNull(this.rowKeyToIndex.get(rowKey))).intValue();
            int iIntValue2 = ((java.lang.Integer) java.util.Objects.requireNonNull(this.columnKeyToIndex.get(columnKey))).intValue();
            checkNoDuplicate(rowKey, columnKey, this.values[iIntValue][iIntValue2], cell.getValue());
            this.values[iIntValue][iIntValue2] = cell.getValue();
            int[] iArr3 = this.rowCounts;
            iArr3[iIntValue] = iArr3[iIntValue] + 1;
            int[] iArr4 = this.columnCounts;
            iArr4[iIntValue2] = iArr4[iIntValue2] + 1;
            iArr[i] = iIntValue;
            iArr2[i] = iIntValue2;
        }
        this.cellRowIndices = iArr;
        this.cellColumnIndices = iArr2;
        this.rowMap = new com.google.common.collect.DenseImmutableTable.RowMap();
        this.columnMap = new com.google.common.collect.DenseImmutableTable.ColumnMap();
    }

    private static abstract class ImmutableArrayMap<K, V> extends com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap<K, V> {
        private final int size;

        @javax.annotation.CheckForNull
        abstract V getValue(int keyIndex);

        abstract com.google.common.collect.ImmutableMap<K, java.lang.Integer> keyToIndex();

        ImmutableArrayMap(int size) {
            this.size = size;
        }

        private boolean isFull() {
            return this.size == keyToIndex().size();
        }

        K getKey(int index) {
            return keyToIndex().keySet().asList().get(index);
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        com.google.common.collect.ImmutableSet<K> createKeySet() {
            return isFull() ? keyToIndex().keySet() : super.createKeySet();
        }

        @Override // java.util.Map
        public int size() {
            return this.size;
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        @javax.annotation.CheckForNull
        public V get(@javax.annotation.CheckForNull java.lang.Object key) {
            java.lang.Integer num = keyToIndex().get(key);
            if (num == null) {
                return null;
            }
            return getValue(num.intValue());
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap
        com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K, V>> entryIterator() {
            return new com.google.common.collect.AbstractIterator<java.util.Map.Entry<K, V>>() { // from class: com.google.common.collect.DenseImmutableTable.ImmutableArrayMap.1
                private int index = -1;
                private final int maxIndex;

                {
                    this.maxIndex = com.google.common.collect.DenseImmutableTable.ImmutableArrayMap.this.keyToIndex().size();
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractIterator
                @javax.annotation.CheckForNull
                public java.util.Map.Entry<K, V> computeNext() {
                    int i = this.index;
                    while (true) {
                        this.index = i + 1;
                        int i2 = this.index;
                        if (i2 < this.maxIndex) {
                            java.lang.Object value = com.google.common.collect.DenseImmutableTable.ImmutableArrayMap.this.getValue(i2);
                            if (value == null) {
                                i = this.index;
                            } else {
                                return com.google.common.collect.Maps.immutableEntry(com.google.common.collect.DenseImmutableTable.ImmutableArrayMap.this.getKey(this.index), value);
                            }
                        } else {
                            return endOfData();
                        }
                    }
                }
            };
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        java.lang.Object writeReplace() {
            return super.writeReplace();
        }
    }

    private final class Row extends com.google.common.collect.DenseImmutableTable.ImmutableArrayMap<C, V> {
        private final int rowIndex;

        @Override // com.google.common.collect.ImmutableMap
        boolean isPartialView() {
            return true;
        }

        Row(int rowIndex) {
            super(com.google.common.collect.DenseImmutableTable.this.rowCounts[rowIndex]);
            this.rowIndex = rowIndex;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        com.google.common.collect.ImmutableMap<C, java.lang.Integer> keyToIndex() {
            return com.google.common.collect.DenseImmutableTable.this.columnKeyToIndex;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        @javax.annotation.CheckForNull
        V getValue(int i) {
            return (V) com.google.common.collect.DenseImmutableTable.this.values[this.rowIndex][i];
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap, com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        java.lang.Object writeReplace() {
            return super.writeReplace();
        }
    }

    private final class Column extends com.google.common.collect.DenseImmutableTable.ImmutableArrayMap<R, V> {
        private final int columnIndex;

        @Override // com.google.common.collect.ImmutableMap
        boolean isPartialView() {
            return true;
        }

        Column(int columnIndex) {
            super(com.google.common.collect.DenseImmutableTable.this.columnCounts[columnIndex]);
            this.columnIndex = columnIndex;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        com.google.common.collect.ImmutableMap<R, java.lang.Integer> keyToIndex() {
            return com.google.common.collect.DenseImmutableTable.this.rowKeyToIndex;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        @javax.annotation.CheckForNull
        V getValue(int i) {
            return (V) com.google.common.collect.DenseImmutableTable.this.values[i][this.columnIndex];
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap, com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        java.lang.Object writeReplace() {
            return super.writeReplace();
        }
    }

    private final class RowMap extends com.google.common.collect.DenseImmutableTable.ImmutableArrayMap<R, com.google.common.collect.ImmutableMap<C, V>> {
        @Override // com.google.common.collect.ImmutableMap
        boolean isPartialView() {
            return false;
        }

        private RowMap() {
            super(com.google.common.collect.DenseImmutableTable.this.rowCounts.length);
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        com.google.common.collect.ImmutableMap<R, java.lang.Integer> keyToIndex() {
            return com.google.common.collect.DenseImmutableTable.this.rowKeyToIndex;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public com.google.common.collect.ImmutableMap<C, V> getValue(int keyIndex) {
            return new com.google.common.collect.DenseImmutableTable.Row(keyIndex);
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap, com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        java.lang.Object writeReplace() {
            return super.writeReplace();
        }
    }

    private final class ColumnMap extends com.google.common.collect.DenseImmutableTable.ImmutableArrayMap<C, com.google.common.collect.ImmutableMap<R, V>> {
        @Override // com.google.common.collect.ImmutableMap
        boolean isPartialView() {
            return false;
        }

        private ColumnMap() {
            super(com.google.common.collect.DenseImmutableTable.this.columnCounts.length);
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        com.google.common.collect.ImmutableMap<C, java.lang.Integer> keyToIndex() {
            return com.google.common.collect.DenseImmutableTable.this.columnKeyToIndex;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public com.google.common.collect.ImmutableMap<R, V> getValue(int keyIndex) {
            return new com.google.common.collect.DenseImmutableTable.Column(keyIndex);
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap, com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        java.lang.Object writeReplace() {
            return super.writeReplace();
        }
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public com.google.common.collect.ImmutableMap<C, java.util.Map<R, V>> columnMap() {
        return com.google.common.collect.ImmutableMap.copyOf((java.util.Map) this.columnMap);
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public com.google.common.collect.ImmutableMap<R, java.util.Map<C, V>> rowMap() {
        return com.google.common.collect.ImmutableMap.copyOf((java.util.Map) this.rowMap);
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @javax.annotation.CheckForNull
    public V get(@javax.annotation.CheckForNull java.lang.Object rowKey, @javax.annotation.CheckForNull java.lang.Object columnKey) {
        java.lang.Integer num = this.rowKeyToIndex.get(rowKey);
        java.lang.Integer num2 = this.columnKeyToIndex.get(columnKey);
        if (num == null || num2 == null) {
            return null;
        }
        return this.values[num.intValue()][num2.intValue()];
    }

    @Override // com.google.common.collect.Table
    public int size() {
        return this.cellRowIndices.length;
    }

    @Override // com.google.common.collect.RegularImmutableTable
    com.google.common.collect.Table.Cell<R, C, V> getCell(int index) {
        int i = this.cellRowIndices[index];
        int i2 = this.cellColumnIndices[index];
        return cellOf(rowKeySet().asList().get(i), columnKeySet().asList().get(i2), java.util.Objects.requireNonNull(this.values[i][i2]));
    }

    @Override // com.google.common.collect.RegularImmutableTable
    V getValue(int i) {
        return (V) java.util.Objects.requireNonNull(this.values[this.cellRowIndices[i]][this.cellColumnIndices[i]]);
    }

    @Override // com.google.common.collect.RegularImmutableTable, com.google.common.collect.ImmutableTable
    java.lang.Object writeReplace() {
        return com.google.common.collect.ImmutableTable.SerializedForm.create(this, this.cellRowIndices, this.cellColumnIndices);
    }
}
