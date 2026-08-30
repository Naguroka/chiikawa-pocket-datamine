package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
abstract class AbstractMultimap<K, V> implements com.google.common.collect.Multimap<K, V> {

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.util.Map<K, java.util.Collection<V>> asMap;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.util.Collection<java.util.Map.Entry<K, V>> entries;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.util.Set<K> keySet;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.collect.Multiset<K> keys;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.util.Collection<V> values;

    abstract java.util.Map<K, java.util.Collection<V>> createAsMap();

    abstract java.util.Collection<java.util.Map.Entry<K, V>> createEntries();

    abstract java.util.Set<K> createKeySet();

    abstract com.google.common.collect.Multiset<K> createKeys();

    abstract java.util.Collection<V> createValues();

    abstract java.util.Iterator<java.util.Map.Entry<K, V>> entryIterator();

    AbstractMultimap() {
    }

    @Override // com.google.common.collect.Multimap
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsValue(@javax.annotation.CheckForNull java.lang.Object value) {
        java.util.Iterator<java.util.Collection<V>> it = asMap().values().iterator();
        while (it.hasNext()) {
            if (it.next().contains(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsEntry(@javax.annotation.CheckForNull java.lang.Object key, @javax.annotation.CheckForNull java.lang.Object value) {
        java.util.Collection<V> collection = asMap().get(key);
        return collection != null && collection.contains(value);
    }

    @Override // com.google.common.collect.Multimap
    public boolean remove(@javax.annotation.CheckForNull java.lang.Object key, @javax.annotation.CheckForNull java.lang.Object value) {
        java.util.Collection<V> collection = asMap().get(key);
        return collection != null && collection.remove(value);
    }

    @Override // com.google.common.collect.Multimap
    public boolean put(@com.google.common.collect.ParametricNullness K key, @com.google.common.collect.ParametricNullness V value) {
        return get(key).add(value);
    }

    @Override // com.google.common.collect.Multimap
    public boolean putAll(@com.google.common.collect.ParametricNullness K key, java.lang.Iterable<? extends V> values) {
        com.google.common.base.Preconditions.checkNotNull(values);
        if (values instanceof java.util.Collection) {
            java.util.Collection<? extends V> collection = (java.util.Collection) values;
            return !collection.isEmpty() && get(key).addAll(collection);
        }
        java.util.Iterator<? extends V> it = values.iterator();
        return it.hasNext() && com.google.common.collect.Iterators.addAll(get(key), it);
    }

    @Override // com.google.common.collect.Multimap
    public boolean putAll(com.google.common.collect.Multimap<? extends K, ? extends V> multimap) {
        boolean zPut = false;
        for (java.util.Map.Entry<? extends K, ? extends V> entry : multimap.entries()) {
            zPut |= put(entry.getKey(), entry.getValue());
        }
        return zPut;
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.Collection<V> replaceValues(@com.google.common.collect.ParametricNullness K key, java.lang.Iterable<? extends V> values) {
        com.google.common.base.Preconditions.checkNotNull(values);
        java.util.Collection<V> collectionRemoveAll = removeAll(key);
        putAll(key, values);
        return collectionRemoveAll;
    }

    @Override // com.google.common.collect.Multimap
    public java.util.Collection<java.util.Map.Entry<K, V>> entries() {
        java.util.Collection<java.util.Map.Entry<K, V>> collection = this.entries;
        if (collection != null) {
            return collection;
        }
        java.util.Collection<java.util.Map.Entry<K, V>> collectionCreateEntries = createEntries();
        this.entries = collectionCreateEntries;
        return collectionCreateEntries;
    }

    class Entries extends com.google.common.collect.Multimaps.Entries<K, V> {
        Entries() {
        }

        @Override // com.google.common.collect.Multimaps.Entries
        com.google.common.collect.Multimap<K, V> multimap() {
            return com.google.common.collect.AbstractMultimap.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
            return com.google.common.collect.AbstractMultimap.this.entryIterator();
        }
    }

    class EntrySet extends com.google.common.collect.AbstractMultimap<K, V>.Entries implements java.util.Set<java.util.Map.Entry<K, V>> {
        EntrySet(final com.google.common.collect.AbstractMultimap this$0) {
            super();
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return com.google.common.collect.Sets.hashCodeImpl(this);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
            return com.google.common.collect.Sets.equalsImpl(this, obj);
        }
    }

    @Override // com.google.common.collect.Multimap
    public java.util.Set<K> keySet() {
        java.util.Set<K> set = this.keySet;
        if (set != null) {
            return set;
        }
        java.util.Set<K> setCreateKeySet = createKeySet();
        this.keySet = setCreateKeySet;
        return setCreateKeySet;
    }

    @Override // com.google.common.collect.Multimap
    public com.google.common.collect.Multiset<K> keys() {
        com.google.common.collect.Multiset<K> multiset = this.keys;
        if (multiset != null) {
            return multiset;
        }
        com.google.common.collect.Multiset<K> multisetCreateKeys = createKeys();
        this.keys = multisetCreateKeys;
        return multisetCreateKeys;
    }

    @Override // com.google.common.collect.Multimap
    public java.util.Collection<V> values() {
        java.util.Collection<V> collection = this.values;
        if (collection != null) {
            return collection;
        }
        java.util.Collection<V> collectionCreateValues = createValues();
        this.values = collectionCreateValues;
        return collectionCreateValues;
    }

    class Values extends java.util.AbstractCollection<V> {
        Values() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<V> iterator() {
            return com.google.common.collect.AbstractMultimap.this.valueIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return com.google.common.collect.AbstractMultimap.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object o) {
            return com.google.common.collect.AbstractMultimap.this.containsValue(o);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            com.google.common.collect.AbstractMultimap.this.clear();
        }
    }

    java.util.Iterator<V> valueIterator() {
        return com.google.common.collect.Maps.valueIterator(entries().iterator());
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.Map<K, java.util.Collection<V>> asMap() {
        java.util.Map<K, java.util.Collection<V>> map = this.asMap;
        if (map != null) {
            return map;
        }
        java.util.Map<K, java.util.Collection<V>> mapCreateAsMap = createAsMap();
        this.asMap = mapCreateAsMap;
        return mapCreateAsMap;
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
        return com.google.common.collect.Multimaps.equalsImpl(this, object);
    }

    @Override // com.google.common.collect.Multimap
    public int hashCode() {
        return asMap().hashCode();
    }

    public java.lang.String toString() {
        return asMap().toString();
    }
}
