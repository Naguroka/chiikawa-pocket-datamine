package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
class StandardTable<R, C, V> extends com.google.common.collect.AbstractTable<R, C, V> implements java.io.Serializable {
    private static final long serialVersionUID = 0;

    @com.google.common.collect.GwtTransient
    final java.util.Map<R, java.util.Map<C, V>> backingMap;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.util.Set<C> columnKeySet;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.collect.StandardTable<R, C, V>.ColumnMap columnMap;

    @com.google.common.collect.GwtTransient
    final com.google.common.base.Supplier<? extends java.util.Map<C, V>> factory;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.util.Map<R, java.util.Map<C, V>> rowMap;

    StandardTable(java.util.Map<R, java.util.Map<C, V>> backingMap, com.google.common.base.Supplier<? extends java.util.Map<C, V>> factory) {
        this.backingMap = backingMap;
        this.factory = factory;
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean contains(@javax.annotation.CheckForNull java.lang.Object rowKey, @javax.annotation.CheckForNull java.lang.Object columnKey) {
        return (rowKey == null || columnKey == null || !super.contains(rowKey, columnKey)) ? false : true;
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean containsColumn(@javax.annotation.CheckForNull java.lang.Object columnKey) {
        if (columnKey == null) {
            return false;
        }
        java.util.Iterator<java.util.Map<C, V>> it = this.backingMap.values().iterator();
        while (it.hasNext()) {
            if (com.google.common.collect.Maps.safeContainsKey(it.next(), columnKey)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean containsRow(@javax.annotation.CheckForNull java.lang.Object rowKey) {
        return rowKey != null && com.google.common.collect.Maps.safeContainsKey(this.backingMap, rowKey);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean containsValue(@javax.annotation.CheckForNull java.lang.Object value) {
        return value != null && super.containsValue(value);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @javax.annotation.CheckForNull
    public V get(@javax.annotation.CheckForNull java.lang.Object obj, @javax.annotation.CheckForNull java.lang.Object obj2) {
        if (obj == null || obj2 == null) {
            return null;
        }
        return (V) super.get(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean isEmpty() {
        return this.backingMap.isEmpty();
    }

    @Override // com.google.common.collect.Table
    public int size() {
        java.util.Iterator<java.util.Map<C, V>> it = this.backingMap.values().iterator();
        int size = 0;
        while (it.hasNext()) {
            size += it.next().size();
        }
        return size;
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public void clear() {
        this.backingMap.clear();
    }

    private java.util.Map<C, V> getOrCreate(R rowKey) {
        java.util.Map<C, V> map = this.backingMap.get(rowKey);
        if (map != null) {
            return map;
        }
        java.util.Map<C, V> map2 = this.factory.get();
        this.backingMap.put(rowKey, map2);
        return map2;
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @javax.annotation.CheckForNull
    public V put(R rowKey, C columnKey, V value) {
        com.google.common.base.Preconditions.checkNotNull(rowKey);
        com.google.common.base.Preconditions.checkNotNull(columnKey);
        com.google.common.base.Preconditions.checkNotNull(value);
        return getOrCreate(rowKey).put(columnKey, value);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @javax.annotation.CheckForNull
    public V remove(@javax.annotation.CheckForNull java.lang.Object obj, @javax.annotation.CheckForNull java.lang.Object obj2) {
        java.util.Map map;
        if (obj == null || obj2 == null || (map = (java.util.Map) com.google.common.collect.Maps.safeGet(this.backingMap, obj)) == null) {
            return null;
        }
        V v = (V) map.remove(obj2);
        if (map.isEmpty()) {
            this.backingMap.remove(obj);
        }
        return v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.util.Map<R, V> removeColumn(@javax.annotation.CheckForNull java.lang.Object obj) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator<java.util.Map.Entry<R, java.util.Map<C, V>>> it = this.backingMap.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry<R, java.util.Map<C, V>> next = it.next();
            V vRemove = next.getValue().remove(obj);
            if (vRemove != null) {
                linkedHashMap.put(next.getKey(), vRemove);
                if (next.getValue().isEmpty()) {
                    it.remove();
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean containsMapping(@javax.annotation.CheckForNull java.lang.Object rowKey, @javax.annotation.CheckForNull java.lang.Object columnKey, @javax.annotation.CheckForNull java.lang.Object value) {
        return value != null && value.equals(get(rowKey, columnKey));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean removeMapping(@javax.annotation.CheckForNull java.lang.Object rowKey, @javax.annotation.CheckForNull java.lang.Object columnKey, @javax.annotation.CheckForNull java.lang.Object value) {
        if (!containsMapping(rowKey, columnKey, value)) {
            return false;
        }
        remove(rowKey, columnKey);
        return true;
    }

    private abstract class TableSet<T> extends com.google.common.collect.Sets.ImprovedAbstractSet<T> {
        private TableSet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return com.google.common.collect.StandardTable.this.backingMap.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            com.google.common.collect.StandardTable.this.backingMap.clear();
        }
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public java.util.Set<com.google.common.collect.Table.Cell<R, C, V>> cellSet() {
        return super.cellSet();
    }

    @Override // com.google.common.collect.AbstractTable
    java.util.Iterator<com.google.common.collect.Table.Cell<R, C, V>> cellIterator() {
        return new com.google.common.collect.StandardTable.CellIterator();
    }

    private class CellIterator implements java.util.Iterator<com.google.common.collect.Table.Cell<R, C, V>> {
        java.util.Iterator<java.util.Map.Entry<C, V>> columnIterator;

        @javax.annotation.CheckForNull
        java.util.Map.Entry<R, java.util.Map<C, V>> rowEntry;
        final java.util.Iterator<java.util.Map.Entry<R, java.util.Map<C, V>>> rowIterator;

        private CellIterator() {
            this.rowIterator = com.google.common.collect.StandardTable.this.backingMap.entrySet().iterator();
            this.columnIterator = com.google.common.collect.Iterators.emptyModifiableIterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.rowIterator.hasNext() || this.columnIterator.hasNext();
        }

        @Override // java.util.Iterator
        public com.google.common.collect.Table.Cell<R, C, V> next() {
            if (!this.columnIterator.hasNext()) {
                java.util.Map.Entry<R, java.util.Map<C, V>> next = this.rowIterator.next();
                this.rowEntry = next;
                this.columnIterator = next.getValue().entrySet().iterator();
            }
            java.util.Objects.requireNonNull(this.rowEntry);
            java.util.Map.Entry<C, V> next2 = this.columnIterator.next();
            return com.google.common.collect.Tables.immutableCell(this.rowEntry.getKey(), next2.getKey(), next2.getValue());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.columnIterator.remove();
            if (((java.util.Map) ((java.util.Map.Entry) java.util.Objects.requireNonNull(this.rowEntry)).getValue()).isEmpty()) {
                this.rowIterator.remove();
                this.rowEntry = null;
            }
        }
    }

    @Override // com.google.common.collect.Table
    public java.util.Map<C, V> row(R rowKey) {
        return new com.google.common.collect.StandardTable.Row(rowKey);
    }

    class Row extends com.google.common.collect.Maps.IteratorBasedAbstractMap<C, V> {

        @javax.annotation.CheckForNull
        java.util.Map<C, V> backingRowMap;
        final R rowKey;

        Row(R r) {
            this.rowKey = (R) com.google.common.base.Preconditions.checkNotNull(r);
        }

        final void updateBackingRowMapField() {
            java.util.Map<C, V> map = this.backingRowMap;
            if (map == null || (map.isEmpty() && com.google.common.collect.StandardTable.this.backingMap.containsKey(this.rowKey))) {
                this.backingRowMap = computeBackingRowMap();
            }
        }

        @javax.annotation.CheckForNull
        java.util.Map<C, V> computeBackingRowMap() {
            return com.google.common.collect.StandardTable.this.backingMap.get(this.rowKey);
        }

        void maintainEmptyInvariant() {
            updateBackingRowMapField();
            java.util.Map<C, V> map = this.backingRowMap;
            if (map == null || !map.isEmpty()) {
                return;
            }
            com.google.common.collect.StandardTable.this.backingMap.remove(this.rowKey);
            this.backingRowMap = null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object key) {
            java.util.Map<C, V> map;
            updateBackingRowMapField();
            return (key == null || (map = this.backingRowMap) == null || !com.google.common.collect.Maps.safeContainsKey(map, key)) ? false : true;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public V get(@javax.annotation.CheckForNull java.lang.Object obj) {
            java.util.Map<C, V> map;
            updateBackingRowMapField();
            if (obj == null || (map = this.backingRowMap) == null) {
                return null;
            }
            return (V) com.google.common.collect.Maps.safeGet(map, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public V put(C c, V v) {
            com.google.common.base.Preconditions.checkNotNull(c);
            com.google.common.base.Preconditions.checkNotNull(v);
            java.util.Map<C, V> map = this.backingRowMap;
            if (map != null && !map.isEmpty()) {
                return this.backingRowMap.put(c, v);
            }
            return (V) com.google.common.collect.StandardTable.this.put(this.rowKey, c, v);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public V remove(@javax.annotation.CheckForNull java.lang.Object obj) {
            updateBackingRowMapField();
            java.util.Map<C, V> map = this.backingRowMap;
            if (map == null) {
                return null;
            }
            V v = (V) com.google.common.collect.Maps.safeRemove(map, obj);
            maintainEmptyInvariant();
            return v;
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public void clear() {
            updateBackingRowMapField();
            java.util.Map<C, V> map = this.backingRowMap;
            if (map != null) {
                map.clear();
            }
            maintainEmptyInvariant();
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
            updateBackingRowMapField();
            java.util.Map<C, V> map = this.backingRowMap;
            if (map == null) {
                return 0;
            }
            return map.size();
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        java.util.Iterator<java.util.Map.Entry<C, V>> entryIterator() {
            updateBackingRowMapField();
            java.util.Map<C, V> map = this.backingRowMap;
            if (map == null) {
                return com.google.common.collect.Iterators.emptyModifiableIterator();
            }
            final java.util.Iterator<java.util.Map.Entry<C, V>> it = map.entrySet().iterator();
            return new java.util.Iterator<java.util.Map.Entry<C, V>>() { // from class: com.google.common.collect.StandardTable.Row.1
                @Override // java.util.Iterator
                public boolean hasNext() {
                    return it.hasNext();
                }

                @Override // java.util.Iterator
                public java.util.Map.Entry<C, V> next() {
                    return com.google.common.collect.StandardTable.Row.this.wrapEntry((java.util.Map.Entry) it.next());
                }

                @Override // java.util.Iterator
                public void remove() {
                    it.remove();
                    com.google.common.collect.StandardTable.Row.this.maintainEmptyInvariant();
                }
            };
        }

        java.util.Map.Entry<C, V> wrapEntry(final java.util.Map.Entry<C, V> entry) {
            return new com.google.common.collect.ForwardingMapEntry<C, V>(this) { // from class: com.google.common.collect.StandardTable.Row.2
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
                public java.util.Map.Entry<C, V> delegate() {
                    return entry;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
                public V setValue(V v) {
                    return (V) super.setValue(com.google.common.base.Preconditions.checkNotNull(v));
                }

                @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
                public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
                    return standardEquals(object);
                }
            };
        }
    }

    @Override // com.google.common.collect.Table
    public java.util.Map<R, V> column(C columnKey) {
        return new com.google.common.collect.StandardTable.Column(columnKey);
    }

    private class Column extends com.google.common.collect.Maps.ViewCachingAbstractMap<R, V> {
        final C columnKey;

        Column(C c) {
            this.columnKey = (C) com.google.common.base.Preconditions.checkNotNull(c);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public V put(R r, V v) {
            return (V) com.google.common.collect.StandardTable.this.put(r, this.columnKey, v);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public V get(@javax.annotation.CheckForNull java.lang.Object obj) {
            return (V) com.google.common.collect.StandardTable.this.get(obj, this.columnKey);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object key) {
            return com.google.common.collect.StandardTable.this.contains(key, this.columnKey);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public V remove(@javax.annotation.CheckForNull java.lang.Object obj) {
            return (V) com.google.common.collect.StandardTable.this.remove(obj, this.columnKey);
        }

        boolean removeFromColumnIf(com.google.common.base.Predicate<? super java.util.Map.Entry<R, V>> predicate) {
            java.util.Iterator<java.util.Map.Entry<R, java.util.Map<C, V>>> it = com.google.common.collect.StandardTable.this.backingMap.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                java.util.Map.Entry<R, java.util.Map<C, V>> next = it.next();
                java.util.Map<C, V> value = next.getValue();
                V v = value.get(this.columnKey);
                if (v != null && predicate.apply(com.google.common.collect.Maps.immutableEntry(next.getKey(), v))) {
                    value.remove(this.columnKey);
                    if (value.isEmpty()) {
                        it.remove();
                    }
                    z = true;
                }
            }
            return z;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        java.util.Set<java.util.Map.Entry<R, V>> createEntrySet() {
            return new com.google.common.collect.StandardTable.Column.EntrySet();
        }

        private class EntrySet extends com.google.common.collect.Sets.ImprovedAbstractSet<java.util.Map.Entry<R, V>> {
            private EntrySet() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public java.util.Iterator<java.util.Map.Entry<R, V>> iterator() {
                return new com.google.common.collect.StandardTable.Column.EntrySetIterator();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                java.util.Iterator<java.util.Map<C, V>> it = com.google.common.collect.StandardTable.this.backingMap.values().iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (it.next().containsKey(com.google.common.collect.StandardTable.Column.this.columnKey)) {
                        i++;
                    }
                }
                return i;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean isEmpty() {
                return !com.google.common.collect.StandardTable.this.containsColumn(com.google.common.collect.StandardTable.Column.this.columnKey);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public void clear() {
                com.google.common.collect.StandardTable.Column.this.removeFromColumnIf(com.google.common.base.Predicates.alwaysTrue());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@javax.annotation.CheckForNull java.lang.Object o) {
                if (!(o instanceof java.util.Map.Entry)) {
                    return false;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) o;
                return com.google.common.collect.StandardTable.this.containsMapping(entry.getKey(), com.google.common.collect.StandardTable.Column.this.columnKey, entry.getValue());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@javax.annotation.CheckForNull java.lang.Object obj) {
                if (!(obj instanceof java.util.Map.Entry)) {
                    return false;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                return com.google.common.collect.StandardTable.this.removeMapping(entry.getKey(), com.google.common.collect.StandardTable.Column.this.columnKey, entry.getValue());
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(java.util.Collection<?> c) {
                return com.google.common.collect.StandardTable.Column.this.removeFromColumnIf(com.google.common.base.Predicates.not(com.google.common.base.Predicates.in(c)));
            }
        }

        private class EntrySetIterator extends com.google.common.collect.AbstractIterator<java.util.Map.Entry<R, V>> {
            final java.util.Iterator<java.util.Map.Entry<R, java.util.Map<C, V>>> iterator;

            private EntrySetIterator() {
                this.iterator = com.google.common.collect.StandardTable.this.backingMap.entrySet().iterator();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.AbstractIterator
            @javax.annotation.CheckForNull
            public java.util.Map.Entry<R, V> computeNext() {
                while (this.iterator.hasNext()) {
                    final java.util.Map.Entry<R, java.util.Map<C, V>> next = this.iterator.next();
                    if (next.getValue().containsKey(com.google.common.collect.StandardTable.Column.this.columnKey)) {
                        return new com.google.common.collect.AbstractMapEntry<R, V>() { // from class: com.google.common.collect.StandardTable.Column.EntrySetIterator.1EntryImpl
                            @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                            public R getKey() {
                                return (R) next.getKey();
                            }

                            @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                            public V getValue() {
                                return (V) ((java.util.Map) next.getValue()).get(com.google.common.collect.StandardTable.Column.this.columnKey);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                            public V setValue(V v) {
                                return (V) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(((java.util.Map) next.getValue()).put(com.google.common.collect.StandardTable.Column.this.columnKey, com.google.common.base.Preconditions.checkNotNull(v)));
                            }
                        };
                    }
                }
                return endOfData();
            }
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        java.util.Set<R> createKeySet() {
            return new com.google.common.collect.StandardTable.Column.KeySet();
        }

        private class KeySet extends com.google.common.collect.Maps.KeySet<R, V> {
            KeySet() {
                super(com.google.common.collect.StandardTable.Column.this);
            }

            @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@javax.annotation.CheckForNull java.lang.Object obj) {
                return com.google.common.collect.StandardTable.this.contains(obj, com.google.common.collect.StandardTable.Column.this.columnKey);
            }

            @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@javax.annotation.CheckForNull java.lang.Object obj) {
                return com.google.common.collect.StandardTable.this.remove(obj, com.google.common.collect.StandardTable.Column.this.columnKey) != null;
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(final java.util.Collection<?> c) {
                return com.google.common.collect.StandardTable.Column.this.removeFromColumnIf(com.google.common.collect.Maps.keyPredicateOnEntries(com.google.common.base.Predicates.not(com.google.common.base.Predicates.in(c))));
            }
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        java.util.Collection<V> createValues() {
            return new com.google.common.collect.StandardTable.Column.Values();
        }

        private class Values extends com.google.common.collect.Maps.Values<R, V> {
            Values() {
                super(com.google.common.collect.StandardTable.Column.this);
            }

            @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
            public boolean remove(@javax.annotation.CheckForNull java.lang.Object obj) {
                return obj != null && com.google.common.collect.StandardTable.Column.this.removeFromColumnIf(com.google.common.collect.Maps.valuePredicateOnEntries(com.google.common.base.Predicates.equalTo(obj)));
            }

            @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
            public boolean removeAll(final java.util.Collection<?> c) {
                return com.google.common.collect.StandardTable.Column.this.removeFromColumnIf(com.google.common.collect.Maps.valuePredicateOnEntries(com.google.common.base.Predicates.in(c)));
            }

            @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
            public boolean retainAll(final java.util.Collection<?> c) {
                return com.google.common.collect.StandardTable.Column.this.removeFromColumnIf(com.google.common.collect.Maps.valuePredicateOnEntries(com.google.common.base.Predicates.not(com.google.common.base.Predicates.in(c))));
            }
        }
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public java.util.Set<R> rowKeySet() {
        return rowMap().keySet();
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public java.util.Set<C> columnKeySet() {
        java.util.Set<C> set = this.columnKeySet;
        if (set != null) {
            return set;
        }
        com.google.common.collect.StandardTable.ColumnKeySet columnKeySet = new com.google.common.collect.StandardTable.ColumnKeySet();
        this.columnKeySet = columnKeySet;
        return columnKeySet;
    }

    private class ColumnKeySet extends com.google.common.collect.StandardTable<R, C, V>.TableSet<C> {
        private ColumnKeySet() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<C> iterator() {
            return com.google.common.collect.StandardTable.this.createColumnKeyIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return com.google.common.collect.Iterators.size(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@javax.annotation.CheckForNull java.lang.Object obj) {
            boolean z = false;
            if (obj == null) {
                return false;
            }
            java.util.Iterator<java.util.Map<C, V>> it = com.google.common.collect.StandardTable.this.backingMap.values().iterator();
            while (it.hasNext()) {
                java.util.Map<C, V> next = it.next();
                if (next.keySet().remove(obj)) {
                    if (next.isEmpty()) {
                        it.remove();
                    }
                    z = true;
                }
            }
            return z;
        }

        @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(java.util.Collection<?> c) {
            com.google.common.base.Preconditions.checkNotNull(c);
            java.util.Iterator<java.util.Map<C, V>> it = com.google.common.collect.StandardTable.this.backingMap.values().iterator();
            boolean z = false;
            while (it.hasNext()) {
                java.util.Map<C, V> next = it.next();
                if (com.google.common.collect.Iterators.removeAll(next.keySet().iterator(), c)) {
                    if (next.isEmpty()) {
                        it.remove();
                    }
                    z = true;
                }
            }
            return z;
        }

        @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(java.util.Collection<?> c) {
            com.google.common.base.Preconditions.checkNotNull(c);
            java.util.Iterator<java.util.Map<C, V>> it = com.google.common.collect.StandardTable.this.backingMap.values().iterator();
            boolean z = false;
            while (it.hasNext()) {
                java.util.Map<C, V> next = it.next();
                if (next.keySet().retainAll(c)) {
                    if (next.isEmpty()) {
                        it.remove();
                    }
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object obj) {
            return com.google.common.collect.StandardTable.this.containsColumn(obj);
        }
    }

    java.util.Iterator<C> createColumnKeyIterator() {
        return new com.google.common.collect.StandardTable.ColumnKeyIterator();
    }

    private class ColumnKeyIterator extends com.google.common.collect.AbstractIterator<C> {
        java.util.Iterator<java.util.Map.Entry<C, V>> entryIterator;
        final java.util.Iterator<java.util.Map<C, V>> mapIterator;
        final java.util.Map<C, V> seen;

        private ColumnKeyIterator() {
            this.seen = com.google.common.collect.StandardTable.this.factory.get();
            this.mapIterator = com.google.common.collect.StandardTable.this.backingMap.values().iterator();
            this.entryIterator = com.google.common.collect.Iterators.emptyIterator();
        }

        @Override // com.google.common.collect.AbstractIterator
        @javax.annotation.CheckForNull
        protected C computeNext() {
            while (true) {
                if (this.entryIterator.hasNext()) {
                    java.util.Map.Entry<C, V> next = this.entryIterator.next();
                    if (!this.seen.containsKey(next.getKey())) {
                        this.seen.put(next.getKey(), next.getValue());
                        return next.getKey();
                    }
                } else if (this.mapIterator.hasNext()) {
                    this.entryIterator = this.mapIterator.next().entrySet().iterator();
                } else {
                    return endOfData();
                }
            }
        }
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public java.util.Collection<V> values() {
        return super.values();
    }

    @Override // com.google.common.collect.Table
    public java.util.Map<R, java.util.Map<C, V>> rowMap() {
        java.util.Map<R, java.util.Map<C, V>> map = this.rowMap;
        if (map != null) {
            return map;
        }
        java.util.Map<R, java.util.Map<C, V>> mapCreateRowMap = createRowMap();
        this.rowMap = mapCreateRowMap;
        return mapCreateRowMap;
    }

    java.util.Map<R, java.util.Map<C, V>> createRowMap() {
        return new com.google.common.collect.StandardTable.RowMap();
    }

    class RowMap extends com.google.common.collect.Maps.ViewCachingAbstractMap<R, java.util.Map<C, V>> {
        RowMap() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object key) {
            return com.google.common.collect.StandardTable.this.containsRow(key);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public java.util.Map<C, V> get(@javax.annotation.CheckForNull java.lang.Object key) {
            if (com.google.common.collect.StandardTable.this.containsRow(key)) {
                return com.google.common.collect.StandardTable.this.row(java.util.Objects.requireNonNull(key));
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public java.util.Map<C, V> remove(@javax.annotation.CheckForNull java.lang.Object key) {
            if (key == null) {
                return null;
            }
            return com.google.common.collect.StandardTable.this.backingMap.remove(key);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        protected java.util.Set<java.util.Map.Entry<R, java.util.Map<C, V>>> createEntrySet() {
            return new com.google.common.collect.StandardTable.RowMap.EntrySet();
        }

        private final class EntrySet extends com.google.common.collect.StandardTable<R, C, V>.TableSet<java.util.Map.Entry<R, java.util.Map<C, V>>> {
            private EntrySet() {
                super();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public java.util.Iterator<java.util.Map.Entry<R, java.util.Map<C, V>>> iterator() {
                return com.google.common.collect.Maps.asMapEntryIterator(com.google.common.collect.StandardTable.this.backingMap.keySet(), new com.google.common.base.Function<R, java.util.Map<C, V>>() { // from class: com.google.common.collect.StandardTable.RowMap.EntrySet.1
                    @Override // com.google.common.base.Function
                    public java.util.Map<C, V> apply(R rowKey) {
                        return com.google.common.collect.StandardTable.this.row(rowKey);
                    }
                });
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return com.google.common.collect.StandardTable.this.backingMap.size();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@javax.annotation.CheckForNull java.lang.Object obj) {
                if (!(obj instanceof java.util.Map.Entry)) {
                    return false;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                return entry.getKey() != null && (entry.getValue() instanceof java.util.Map) && com.google.common.collect.Collections2.safeContains(com.google.common.collect.StandardTable.this.backingMap.entrySet(), entry);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@javax.annotation.CheckForNull java.lang.Object obj) {
                if (!(obj instanceof java.util.Map.Entry)) {
                    return false;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                return entry.getKey() != null && (entry.getValue() instanceof java.util.Map) && com.google.common.collect.StandardTable.this.backingMap.entrySet().remove(entry);
            }
        }
    }

    @Override // com.google.common.collect.Table
    public java.util.Map<C, java.util.Map<R, V>> columnMap() {
        com.google.common.collect.StandardTable<R, C, V>.ColumnMap columnMap = this.columnMap;
        if (columnMap != null) {
            return columnMap;
        }
        com.google.common.collect.StandardTable<R, C, V>.ColumnMap columnMap2 = new com.google.common.collect.StandardTable.ColumnMap();
        this.columnMap = columnMap2;
        return columnMap2;
    }

    private class ColumnMap extends com.google.common.collect.Maps.ViewCachingAbstractMap<C, java.util.Map<R, V>> {
        private ColumnMap() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public java.util.Map<R, V> get(@javax.annotation.CheckForNull java.lang.Object key) {
            if (com.google.common.collect.StandardTable.this.containsColumn(key)) {
                return com.google.common.collect.StandardTable.this.column(java.util.Objects.requireNonNull(key));
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object key) {
            return com.google.common.collect.StandardTable.this.containsColumn(key);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public java.util.Map<R, V> remove(@javax.annotation.CheckForNull java.lang.Object key) {
            if (com.google.common.collect.StandardTable.this.containsColumn(key)) {
                return com.google.common.collect.StandardTable.this.removeColumn(key);
            }
            return null;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public java.util.Set<java.util.Map.Entry<C, java.util.Map<R, V>>> createEntrySet() {
            return new com.google.common.collect.StandardTable.ColumnMap.ColumnMapEntrySet();
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public java.util.Set<C> keySet() {
            return com.google.common.collect.StandardTable.this.columnKeySet();
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        java.util.Collection<java.util.Map<R, V>> createValues() {
            return new com.google.common.collect.StandardTable.ColumnMap.ColumnMapValues();
        }

        private final class ColumnMapEntrySet extends com.google.common.collect.StandardTable<R, C, V>.TableSet<java.util.Map.Entry<C, java.util.Map<R, V>>> {
            private ColumnMapEntrySet() {
                super();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public java.util.Iterator<java.util.Map.Entry<C, java.util.Map<R, V>>> iterator() {
                return com.google.common.collect.Maps.asMapEntryIterator(com.google.common.collect.StandardTable.this.columnKeySet(), new com.google.common.base.Function<C, java.util.Map<R, V>>() { // from class: com.google.common.collect.StandardTable.ColumnMap.ColumnMapEntrySet.1
                    @Override // com.google.common.base.Function
                    public java.util.Map<R, V> apply(C columnKey) {
                        return com.google.common.collect.StandardTable.this.column(columnKey);
                    }
                });
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return com.google.common.collect.StandardTable.this.columnKeySet().size();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@javax.annotation.CheckForNull java.lang.Object obj) {
                if (!(obj instanceof java.util.Map.Entry)) {
                    return false;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                if (com.google.common.collect.StandardTable.this.containsColumn(entry.getKey())) {
                    return ((java.util.Map) java.util.Objects.requireNonNull(com.google.common.collect.StandardTable.ColumnMap.this.get(entry.getKey()))).equals(entry.getValue());
                }
                return false;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@javax.annotation.CheckForNull java.lang.Object obj) {
                if (!contains(obj) || !(obj instanceof java.util.Map.Entry)) {
                    return false;
                }
                com.google.common.collect.StandardTable.this.removeColumn(((java.util.Map.Entry) obj).getKey());
                return true;
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(java.util.Collection<?> c) {
                com.google.common.base.Preconditions.checkNotNull(c);
                return com.google.common.collect.Sets.removeAllImpl(this, c.iterator());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(java.util.Collection<?> c) {
                com.google.common.base.Preconditions.checkNotNull(c);
                boolean z = false;
                for (java.lang.Object obj : com.google.common.collect.Lists.newArrayList(com.google.common.collect.StandardTable.this.columnKeySet().iterator())) {
                    if (!c.contains(com.google.common.collect.Maps.immutableEntry(obj, com.google.common.collect.StandardTable.this.column(obj)))) {
                        com.google.common.collect.StandardTable.this.removeColumn(obj);
                        z = true;
                    }
                }
                return z;
            }
        }

        private class ColumnMapValues extends com.google.common.collect.Maps.Values<C, java.util.Map<R, V>> {
            ColumnMapValues() {
                super(com.google.common.collect.StandardTable.ColumnMap.this);
            }

            @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
            public boolean remove(@javax.annotation.CheckForNull java.lang.Object obj) {
                for (java.util.Map.Entry<C, java.util.Map<R, V>> entry : com.google.common.collect.StandardTable.ColumnMap.this.entrySet()) {
                    if (entry.getValue().equals(obj)) {
                        com.google.common.collect.StandardTable.this.removeColumn(entry.getKey());
                        return true;
                    }
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
            public boolean removeAll(java.util.Collection<?> c) {
                com.google.common.base.Preconditions.checkNotNull(c);
                boolean z = false;
                for (java.lang.Object obj : com.google.common.collect.Lists.newArrayList(com.google.common.collect.StandardTable.this.columnKeySet().iterator())) {
                    if (c.contains(com.google.common.collect.StandardTable.this.column(obj))) {
                        com.google.common.collect.StandardTable.this.removeColumn(obj);
                        z = true;
                    }
                }
                return z;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
            public boolean retainAll(java.util.Collection<?> c) {
                com.google.common.base.Preconditions.checkNotNull(c);
                boolean z = false;
                for (java.lang.Object obj : com.google.common.collect.Lists.newArrayList(com.google.common.collect.StandardTable.this.columnKeySet().iterator())) {
                    if (!c.contains(com.google.common.collect.StandardTable.this.column(obj))) {
                        com.google.common.collect.StandardTable.this.removeColumn(obj);
                        z = true;
                    }
                }
                return z;
            }
        }
    }
}
