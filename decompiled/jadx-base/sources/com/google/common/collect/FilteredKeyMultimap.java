package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
class FilteredKeyMultimap<K, V> extends com.google.common.collect.AbstractMultimap<K, V> implements com.google.common.collect.FilteredMultimap<K, V> {
    final com.google.common.base.Predicate<? super K> keyPredicate;
    final com.google.common.collect.Multimap<K, V> unfiltered;

    FilteredKeyMultimap(com.google.common.collect.Multimap<K, V> unfiltered, com.google.common.base.Predicate<? super K> keyPredicate) {
        this.unfiltered = (com.google.common.collect.Multimap) com.google.common.base.Preconditions.checkNotNull(unfiltered);
        this.keyPredicate = (com.google.common.base.Predicate) com.google.common.base.Preconditions.checkNotNull(keyPredicate);
    }

    public com.google.common.collect.Multimap<K, V> unfiltered() {
        return this.unfiltered;
    }

    @Override // com.google.common.collect.FilteredMultimap
    public com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> entryPredicate() {
        return com.google.common.collect.Maps.keyPredicateOnEntries(this.keyPredicate);
    }

    @Override // com.google.common.collect.Multimap
    public int size() {
        java.util.Iterator<java.util.Collection<V>> it = asMap().values().iterator();
        int size = 0;
        while (it.hasNext()) {
            size += it.next().size();
        }
        return size;
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object key) {
        if (this.unfiltered.containsKey(key)) {
            return this.keyPredicate.apply(key);
        }
        return false;
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.Collection<V> removeAll(@javax.annotation.CheckForNull java.lang.Object key) {
        return containsKey(key) ? this.unfiltered.removeAll(key) : unmodifiableEmptyCollection();
    }

    java.util.Collection<V> unmodifiableEmptyCollection() {
        if (this.unfiltered instanceof com.google.common.collect.SetMultimap) {
            return java.util.Collections.emptySet();
        }
        return java.util.Collections.emptyList();
    }

    @Override // com.google.common.collect.Multimap
    public void clear() {
        keySet().clear();
    }

    @Override // com.google.common.collect.AbstractMultimap
    java.util.Set<K> createKeySet() {
        return com.google.common.collect.Sets.filter(this.unfiltered.keySet(), this.keyPredicate);
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.Collection<V> get(@com.google.common.collect.ParametricNullness K key) {
        if (this.keyPredicate.apply(key)) {
            return this.unfiltered.get(key);
        }
        if (this.unfiltered instanceof com.google.common.collect.SetMultimap) {
            return new com.google.common.collect.FilteredKeyMultimap.AddRejectingSet(key);
        }
        return new com.google.common.collect.FilteredKeyMultimap.AddRejectingList(key);
    }

    static class AddRejectingSet<K, V> extends com.google.common.collect.ForwardingSet<V> {

        @com.google.common.collect.ParametricNullness
        final K key;

        AddRejectingSet(@com.google.common.collect.ParametricNullness K key) {
            this.key = key;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
        public boolean add(@com.google.common.collect.ParametricNullness V element) {
            throw new java.lang.IllegalArgumentException("Key does not satisfy predicate: " + this.key);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public boolean addAll(java.util.Collection<? extends V> collection) {
            com.google.common.base.Preconditions.checkNotNull(collection);
            throw new java.lang.IllegalArgumentException("Key does not satisfy predicate: " + this.key);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public java.util.Set<V> delegate() {
            return java.util.Collections.emptySet();
        }
    }

    static class AddRejectingList<K, V> extends com.google.common.collect.ForwardingList<V> {

        @com.google.common.collect.ParametricNullness
        final K key;

        AddRejectingList(@com.google.common.collect.ParametricNullness K key) {
            this.key = key;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
        public boolean add(@com.google.common.collect.ParametricNullness V v) {
            add(0, v);
            return true;
        }

        @Override // com.google.common.collect.ForwardingList, java.util.List
        public void add(int index, @com.google.common.collect.ParametricNullness V element) {
            com.google.common.base.Preconditions.checkPositionIndex(index, 0);
            throw new java.lang.IllegalArgumentException("Key does not satisfy predicate: " + this.key);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public boolean addAll(java.util.Collection<? extends V> collection) {
            addAll(0, collection);
            return true;
        }

        @Override // com.google.common.collect.ForwardingList, java.util.List
        public boolean addAll(int index, java.util.Collection<? extends V> elements) {
            com.google.common.base.Preconditions.checkNotNull(elements);
            com.google.common.base.Preconditions.checkPositionIndex(index, 0);
            throw new java.lang.IllegalArgumentException("Key does not satisfy predicate: " + this.key);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingList, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public java.util.List<V> delegate() {
            return java.util.Collections.emptyList();
        }
    }

    @Override // com.google.common.collect.AbstractMultimap
    java.util.Iterator<java.util.Map.Entry<K, V>> entryIterator() {
        throw new java.lang.AssertionError("should never be called");
    }

    @Override // com.google.common.collect.AbstractMultimap
    java.util.Collection<java.util.Map.Entry<K, V>> createEntries() {
        return new com.google.common.collect.FilteredKeyMultimap.Entries();
    }

    class Entries extends com.google.common.collect.ForwardingCollection<java.util.Map.Entry<K, V>> {
        Entries() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public java.util.Collection<java.util.Map.Entry<K, V>> delegate() {
            return com.google.common.collect.Collections2.filter(com.google.common.collect.FilteredKeyMultimap.this.unfiltered.entries(), com.google.common.collect.FilteredKeyMultimap.this.entryPredicate());
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean remove(@javax.annotation.CheckForNull java.lang.Object obj) {
            if (!(obj instanceof java.util.Map.Entry)) {
                return false;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            if (com.google.common.collect.FilteredKeyMultimap.this.unfiltered.containsKey(entry.getKey()) && com.google.common.collect.FilteredKeyMultimap.this.keyPredicate.apply((java.lang.Object) entry.getKey())) {
                return com.google.common.collect.FilteredKeyMultimap.this.unfiltered.remove(entry.getKey(), entry.getValue());
            }
            return false;
        }
    }

    @Override // com.google.common.collect.AbstractMultimap
    java.util.Collection<V> createValues() {
        return new com.google.common.collect.FilteredMultimapValues(this);
    }

    @Override // com.google.common.collect.AbstractMultimap
    java.util.Map<K, java.util.Collection<V>> createAsMap() {
        return com.google.common.collect.Maps.filterKeys(this.unfiltered.asMap(), this.keyPredicate);
    }

    @Override // com.google.common.collect.AbstractMultimap
    com.google.common.collect.Multiset<K> createKeys() {
        return com.google.common.collect.Multisets.filter(this.unfiltered.keys(), this.keyPredicate);
    }
}
