package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ImmutableMultimap<K, V> extends com.google.common.collect.BaseImmutableMultimap<K, V> implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    final transient com.google.common.collect.ImmutableMap<K, ? extends com.google.common.collect.ImmutableCollection<V>> map;
    final transient int size;

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public abstract com.google.common.collect.ImmutableCollection<V> get(K key);

    public abstract com.google.common.collect.ImmutableMultimap<V, K> inverse();

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean containsEntry(@javax.annotation.CheckForNull java.lang.Object key, @javax.annotation.CheckForNull java.lang.Object value) {
        return super.containsEntry(key, value);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
        return super.equals(object);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.AbstractMultimap
    public /* bridge */ /* synthetic */ java.lang.String toString() {
        return super.toString();
    }

    public static <K, V> com.google.common.collect.ImmutableMultimap<K, V> of() {
        return com.google.common.collect.ImmutableListMultimap.of();
    }

    public static <K, V> com.google.common.collect.ImmutableMultimap<K, V> of(K k1, V v1) {
        return com.google.common.collect.ImmutableListMultimap.of((java.lang.Object) k1, (java.lang.Object) v1);
    }

    public static <K, V> com.google.common.collect.ImmutableMultimap<K, V> of(K k1, V v1, K k2, V v2) {
        return com.google.common.collect.ImmutableListMultimap.of((java.lang.Object) k1, (java.lang.Object) v1, (java.lang.Object) k2, (java.lang.Object) v2);
    }

    public static <K, V> com.google.common.collect.ImmutableMultimap<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3) {
        return com.google.common.collect.ImmutableListMultimap.of((java.lang.Object) k1, (java.lang.Object) v1, (java.lang.Object) k2, (java.lang.Object) v2, (java.lang.Object) k3, (java.lang.Object) v3);
    }

    public static <K, V> com.google.common.collect.ImmutableMultimap<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4) {
        return com.google.common.collect.ImmutableListMultimap.of((java.lang.Object) k1, (java.lang.Object) v1, (java.lang.Object) k2, (java.lang.Object) v2, (java.lang.Object) k3, (java.lang.Object) v3, (java.lang.Object) k4, (java.lang.Object) v4);
    }

    public static <K, V> com.google.common.collect.ImmutableMultimap<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        return com.google.common.collect.ImmutableListMultimap.of((java.lang.Object) k1, (java.lang.Object) v1, (java.lang.Object) k2, (java.lang.Object) v2, (java.lang.Object) k3, (java.lang.Object) v3, (java.lang.Object) k4, (java.lang.Object) v4, (java.lang.Object) k5, (java.lang.Object) v5);
    }

    public static <K, V> com.google.common.collect.ImmutableMultimap.Builder<K, V> builder() {
        return new com.google.common.collect.ImmutableMultimap.Builder<>();
    }

    @com.google.errorprone.annotations.DoNotMock
    public static class Builder<K, V> {
        final java.util.Map<K, java.util.Collection<V>> builderMap = com.google.common.collect.Platform.preservesInsertionOrderOnPutsMap();

        @javax.annotation.CheckForNull
        java.util.Comparator<? super K> keyComparator;

        @javax.annotation.CheckForNull
        java.util.Comparator<? super V> valueComparator;

        java.util.Collection<V> newMutableValueCollection() {
            return new java.util.ArrayList();
        }

        public com.google.common.collect.ImmutableMultimap.Builder<K, V> put(K key, V value) {
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(key, value);
            java.util.Collection<V> collection = this.builderMap.get(key);
            if (collection == null) {
                java.util.Map<K, java.util.Collection<V>> map = this.builderMap;
                java.util.Collection<V> collectionNewMutableValueCollection = newMutableValueCollection();
                map.put(key, collectionNewMutableValueCollection);
                collection = collectionNewMutableValueCollection;
            }
            collection.add(value);
            return this;
        }

        public com.google.common.collect.ImmutableMultimap.Builder<K, V> put(java.util.Map.Entry<? extends K, ? extends V> entry) {
            return put(entry.getKey(), entry.getValue());
        }

        public com.google.common.collect.ImmutableMultimap.Builder<K, V> putAll(java.lang.Iterable<? extends java.util.Map.Entry<? extends K, ? extends V>> entries) {
            java.util.Iterator<? extends java.util.Map.Entry<? extends K, ? extends V>> it = entries.iterator();
            while (it.hasNext()) {
                put(it.next());
            }
            return this;
        }

        public com.google.common.collect.ImmutableMultimap.Builder<K, V> putAll(K key, java.lang.Iterable<? extends V> values) {
            if (key == null) {
                throw new java.lang.NullPointerException("null key in entry: null=" + com.google.common.collect.Iterables.toString(values));
            }
            java.util.Collection<V> collection = this.builderMap.get(key);
            if (collection != null) {
                for (V v : values) {
                    com.google.common.collect.CollectPreconditions.checkEntryNotNull(key, v);
                    collection.add(v);
                }
                return this;
            }
            java.util.Iterator<? extends V> it = values.iterator();
            if (!it.hasNext()) {
                return this;
            }
            java.util.Collection<V> collectionNewMutableValueCollection = newMutableValueCollection();
            while (it.hasNext()) {
                V next = it.next();
                com.google.common.collect.CollectPreconditions.checkEntryNotNull(key, next);
                collectionNewMutableValueCollection.add(next);
            }
            this.builderMap.put(key, collectionNewMutableValueCollection);
            return this;
        }

        public com.google.common.collect.ImmutableMultimap.Builder<K, V> putAll(K key, V... values) {
            return putAll(key, java.util.Arrays.asList(values));
        }

        public com.google.common.collect.ImmutableMultimap.Builder<K, V> putAll(com.google.common.collect.Multimap<? extends K, ? extends V> multimap) {
            for (java.util.Map.Entry<? extends K, java.util.Collection<? extends V>> entry : multimap.asMap().entrySet()) {
                putAll(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public com.google.common.collect.ImmutableMultimap.Builder<K, V> orderKeysBy(java.util.Comparator<? super K> keyComparator) {
            this.keyComparator = (java.util.Comparator) com.google.common.base.Preconditions.checkNotNull(keyComparator);
            return this;
        }

        public com.google.common.collect.ImmutableMultimap.Builder<K, V> orderValuesBy(java.util.Comparator<? super V> valueComparator) {
            this.valueComparator = (java.util.Comparator) com.google.common.base.Preconditions.checkNotNull(valueComparator);
            return this;
        }

        com.google.common.collect.ImmutableMultimap.Builder<K, V> combine(com.google.common.collect.ImmutableMultimap.Builder<K, V> other) {
            for (java.util.Map.Entry<K, java.util.Collection<V>> entry : other.builderMap.entrySet()) {
                putAll(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public com.google.common.collect.ImmutableMultimap<K, V> build() {
            java.util.Collection collectionEntrySet = this.builderMap.entrySet();
            java.util.Comparator<? super K> comparator = this.keyComparator;
            if (comparator != null) {
                collectionEntrySet = com.google.common.collect.Ordering.from(comparator).onKeys().immutableSortedCopy(collectionEntrySet);
            }
            return com.google.common.collect.ImmutableListMultimap.fromMapEntries(collectionEntrySet, this.valueComparator);
        }
    }

    public static <K, V> com.google.common.collect.ImmutableMultimap<K, V> copyOf(com.google.common.collect.Multimap<? extends K, ? extends V> multimap) {
        if (multimap instanceof com.google.common.collect.ImmutableMultimap) {
            com.google.common.collect.ImmutableMultimap<K, V> immutableMultimap = (com.google.common.collect.ImmutableMultimap) multimap;
            if (!immutableMultimap.isPartialView()) {
                return immutableMultimap;
            }
        }
        return com.google.common.collect.ImmutableListMultimap.copyOf((com.google.common.collect.Multimap) multimap);
    }

    public static <K, V> com.google.common.collect.ImmutableMultimap<K, V> copyOf(java.lang.Iterable<? extends java.util.Map.Entry<? extends K, ? extends V>> entries) {
        return com.google.common.collect.ImmutableListMultimap.copyOf((java.lang.Iterable) entries);
    }

    static class FieldSettersHolder {
        static final com.google.common.collect.Serialization.FieldSetter<com.google.common.collect.ImmutableMultimap> MAP_FIELD_SETTER = com.google.common.collect.Serialization.getFieldSetter(com.google.common.collect.ImmutableMultimap.class, "map");
        static final com.google.common.collect.Serialization.FieldSetter<com.google.common.collect.ImmutableMultimap> SIZE_FIELD_SETTER = com.google.common.collect.Serialization.getFieldSetter(com.google.common.collect.ImmutableMultimap.class, "size");

        FieldSettersHolder() {
        }
    }

    ImmutableMultimap(com.google.common.collect.ImmutableMap<K, ? extends com.google.common.collect.ImmutableCollection<V>> map, int size) {
        this.map = map;
        this.size = size;
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @java.lang.Deprecated
    public com.google.common.collect.ImmutableCollection<V> removeAll(@javax.annotation.CheckForNull java.lang.Object key) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @java.lang.Deprecated
    public com.google.common.collect.ImmutableCollection<V> replaceValues(K key, java.lang.Iterable<? extends V> values) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.Multimap
    @java.lang.Deprecated
    public final void clear() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @java.lang.Deprecated
    public final boolean put(K key, V value) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @java.lang.Deprecated
    public final boolean putAll(K key, java.lang.Iterable<? extends V> values) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @java.lang.Deprecated
    public final boolean putAll(com.google.common.collect.Multimap<? extends K, ? extends V> multimap) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @java.lang.Deprecated
    public final boolean remove(@javax.annotation.CheckForNull java.lang.Object key, @javax.annotation.CheckForNull java.lang.Object value) {
        throw new java.lang.UnsupportedOperationException();
    }

    boolean isPartialView() {
        return this.map.isPartialView();
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object key) {
        return this.map.containsKey(key);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public boolean containsValue(@javax.annotation.CheckForNull java.lang.Object value) {
        return value != null && super.containsValue(value);
    }

    @Override // com.google.common.collect.Multimap
    public int size() {
        return this.size;
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public com.google.common.collect.ImmutableSet<K> keySet() {
        return this.map.keySet();
    }

    @Override // com.google.common.collect.AbstractMultimap
    java.util.Set<K> createKeySet() {
        throw new java.lang.AssertionError("unreachable");
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public com.google.common.collect.ImmutableMap<K, java.util.Collection<V>> asMap() {
        return this.map;
    }

    @Override // com.google.common.collect.AbstractMultimap
    java.util.Map<K, java.util.Collection<V>> createAsMap() {
        throw new java.lang.AssertionError("should never be called");
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public com.google.common.collect.ImmutableCollection<java.util.Map.Entry<K, V>> entries() {
        return (com.google.common.collect.ImmutableCollection) super.entries();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMultimap
    public com.google.common.collect.ImmutableCollection<java.util.Map.Entry<K, V>> createEntries() {
        return new com.google.common.collect.ImmutableMultimap.EntryCollection(this);
    }

    private static class EntryCollection<K, V> extends com.google.common.collect.ImmutableCollection<java.util.Map.Entry<K, V>> {
        private static final long serialVersionUID = 0;
        final com.google.common.collect.ImmutableMultimap<K, V> multimap;

        EntryCollection(com.google.common.collect.ImmutableMultimap<K, V> multimap) {
            this.multimap = multimap;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K, V>> iterator() {
            return this.multimap.entryIterator();
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean isPartialView() {
            return this.multimap.isPartialView();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.multimap.size();
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object object) {
            if (!(object instanceof java.util.Map.Entry)) {
                return false;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) object;
            return this.multimap.containsEntry(entry.getKey(), entry.getValue());
        }

        @Override // com.google.common.collect.ImmutableCollection
        java.lang.Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMultimap
    public com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K, V>> entryIterator() {
        return new com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K, V>>() { // from class: com.google.common.collect.ImmutableMultimap.1
            final java.util.Iterator<? extends java.util.Map.Entry<K, ? extends com.google.common.collect.ImmutableCollection<V>>> asMapItr;

            @javax.annotation.CheckForNull
            K currentKey = null;
            java.util.Iterator<V> valueItr = com.google.common.collect.Iterators.emptyIterator();

            {
                this.asMapItr = com.google.common.collect.ImmutableMultimap.this.map.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.valueItr.hasNext() || this.asMapItr.hasNext();
            }

            @Override // java.util.Iterator
            public java.util.Map.Entry<K, V> next() {
                if (!this.valueItr.hasNext()) {
                    java.util.Map.Entry<K, ? extends com.google.common.collect.ImmutableCollection<V>> next = this.asMapItr.next();
                    this.currentKey = next.getKey();
                    this.valueItr = next.getValue().iterator();
                }
                return com.google.common.collect.Maps.immutableEntry(java.util.Objects.requireNonNull(this.currentKey), this.valueItr.next());
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public com.google.common.collect.ImmutableMultiset<K> keys() {
        return (com.google.common.collect.ImmutableMultiset) super.keys();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMultimap
    public com.google.common.collect.ImmutableMultiset<K> createKeys() {
        return new com.google.common.collect.ImmutableMultimap.Keys();
    }

    class Keys extends com.google.common.collect.ImmutableMultiset<K> {
        @Override // com.google.common.collect.ImmutableCollection
        boolean isPartialView() {
            return true;
        }

        Keys() {
        }

        @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object object) {
            return com.google.common.collect.ImmutableMultimap.this.containsKey(object);
        }

        @Override // com.google.common.collect.Multiset
        public int count(@javax.annotation.CheckForNull java.lang.Object element) {
            com.google.common.collect.ImmutableCollection<V> immutableCollection = com.google.common.collect.ImmutableMultimap.this.map.get(element);
            if (immutableCollection == null) {
                return 0;
            }
            return immutableCollection.size();
        }

        @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
        public com.google.common.collect.ImmutableSet<K> elementSet() {
            return com.google.common.collect.ImmutableMultimap.this.keySet();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
        public int size() {
            return com.google.common.collect.ImmutableMultimap.this.size();
        }

        @Override // com.google.common.collect.ImmutableMultiset
        com.google.common.collect.Multiset.Entry<K> getEntry(int index) {
            java.util.Map.Entry<K, ? extends com.google.common.collect.ImmutableCollection<V>> entry = com.google.common.collect.ImmutableMultimap.this.map.entrySet().asList().get(index);
            return com.google.common.collect.Multisets.immutableEntry(entry.getKey(), entry.getValue().size());
        }

        @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
        java.lang.Object writeReplace() {
            return new com.google.common.collect.ImmutableMultimap.KeysSerializedForm(com.google.common.collect.ImmutableMultimap.this);
        }

        private void readObject(java.io.ObjectInputStream stream) throws java.io.InvalidObjectException {
            throw new java.io.InvalidObjectException("Use KeysSerializedForm");
        }
    }

    private static final class KeysSerializedForm implements java.io.Serializable {
        final com.google.common.collect.ImmutableMultimap<?, ?> multimap;

        KeysSerializedForm(com.google.common.collect.ImmutableMultimap<?, ?> multimap) {
            this.multimap = multimap;
        }

        java.lang.Object readResolve() {
            return this.multimap.keys();
        }
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public com.google.common.collect.ImmutableCollection<V> values() {
        return (com.google.common.collect.ImmutableCollection) super.values();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMultimap
    public com.google.common.collect.ImmutableCollection<V> createValues() {
        return new com.google.common.collect.ImmutableMultimap.Values(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMultimap
    public com.google.common.collect.UnmodifiableIterator<V> valueIterator() {
        return new com.google.common.collect.UnmodifiableIterator<V>() { // from class: com.google.common.collect.ImmutableMultimap.2
            java.util.Iterator<? extends com.google.common.collect.ImmutableCollection<V>> valueCollectionItr;
            java.util.Iterator<V> valueItr = com.google.common.collect.Iterators.emptyIterator();

            {
                this.valueCollectionItr = com.google.common.collect.ImmutableMultimap.this.map.values().iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.valueItr.hasNext() || this.valueCollectionItr.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                if (!this.valueItr.hasNext()) {
                    this.valueItr = this.valueCollectionItr.next().iterator();
                }
                return this.valueItr.next();
            }
        };
    }

    private static final class Values<K, V> extends com.google.common.collect.ImmutableCollection<V> {
        private static final long serialVersionUID = 0;
        private final transient com.google.common.collect.ImmutableMultimap<K, V> multimap;

        @Override // com.google.common.collect.ImmutableCollection
        boolean isPartialView() {
            return true;
        }

        Values(com.google.common.collect.ImmutableMultimap<K, V> multimap) {
            this.multimap = multimap;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object object) {
            return this.multimap.containsValue(object);
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public com.google.common.collect.UnmodifiableIterator<V> iterator() {
            return this.multimap.valueIterator();
        }

        @Override // com.google.common.collect.ImmutableCollection
        int copyIntoArray(java.lang.Object[] dst, int offset) {
            com.google.common.collect.UnmodifiableIterator<? extends com.google.common.collect.ImmutableCollection<V>> it = this.multimap.map.values().iterator();
            while (it.hasNext()) {
                offset = it.next().copyIntoArray(dst, offset);
            }
            return offset;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.multimap.size();
        }

        @Override // com.google.common.collect.ImmutableCollection
        java.lang.Object writeReplace() {
            return super.writeReplace();
        }
    }
}
