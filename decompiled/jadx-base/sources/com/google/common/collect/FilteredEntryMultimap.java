package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
class FilteredEntryMultimap<K, V> extends com.google.common.collect.AbstractMultimap<K, V> implements com.google.common.collect.FilteredMultimap<K, V> {
    final com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> predicate;
    final com.google.common.collect.Multimap<K, V> unfiltered;

    FilteredEntryMultimap(com.google.common.collect.Multimap<K, V> unfiltered, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> predicate) {
        this.unfiltered = (com.google.common.collect.Multimap) com.google.common.base.Preconditions.checkNotNull(unfiltered);
        this.predicate = (com.google.common.base.Predicate) com.google.common.base.Preconditions.checkNotNull(predicate);
    }

    @Override // com.google.common.collect.FilteredMultimap
    public com.google.common.collect.Multimap<K, V> unfiltered() {
        return this.unfiltered;
    }

    @Override // com.google.common.collect.FilteredMultimap
    public com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> entryPredicate() {
        return this.predicate;
    }

    @Override // com.google.common.collect.Multimap
    public int size() {
        return entries().size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean satisfies(@com.google.common.collect.ParametricNullness K key, @com.google.common.collect.ParametricNullness V value) {
        return this.predicate.apply(com.google.common.collect.Maps.immutableEntry(key, value));
    }

    final class ValuePredicate implements com.google.common.base.Predicate<V> {

        @com.google.common.collect.ParametricNullness
        private final K key;

        ValuePredicate(K key) {
            this.key = key;
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(@com.google.common.collect.ParametricNullness V value) {
            return com.google.common.collect.FilteredEntryMultimap.this.satisfies(this.key, value);
        }
    }

    static <E> java.util.Collection<E> filterCollection(java.util.Collection<E> collection, com.google.common.base.Predicate<? super E> predicate) {
        if (collection instanceof java.util.Set) {
            return com.google.common.collect.Sets.filter((java.util.Set) collection, predicate);
        }
        return com.google.common.collect.Collections2.filter(collection, predicate);
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object key) {
        return asMap().get(key) != null;
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.Collection<V> removeAll(@javax.annotation.CheckForNull java.lang.Object key) {
        return (java.util.Collection) com.google.common.base.MoreObjects.firstNonNull(asMap().remove(key), unmodifiableEmptyCollection());
    }

    java.util.Collection<V> unmodifiableEmptyCollection() {
        if (this.unfiltered instanceof com.google.common.collect.SetMultimap) {
            return java.util.Collections.emptySet();
        }
        return java.util.Collections.emptyList();
    }

    @Override // com.google.common.collect.Multimap
    public void clear() {
        entries().clear();
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.Collection<V> get(@com.google.common.collect.ParametricNullness K key) {
        return filterCollection(this.unfiltered.get(key), new com.google.common.collect.FilteredEntryMultimap.ValuePredicate(key));
    }

    @Override // com.google.common.collect.AbstractMultimap
    java.util.Collection<java.util.Map.Entry<K, V>> createEntries() {
        return filterCollection(this.unfiltered.entries(), this.predicate);
    }

    @Override // com.google.common.collect.AbstractMultimap
    java.util.Collection<V> createValues() {
        return new com.google.common.collect.FilteredMultimapValues(this);
    }

    @Override // com.google.common.collect.AbstractMultimap
    java.util.Iterator<java.util.Map.Entry<K, V>> entryIterator() {
        throw new java.lang.AssertionError("should never be called");
    }

    @Override // com.google.common.collect.AbstractMultimap
    java.util.Map<K, java.util.Collection<V>> createAsMap() {
        return new com.google.common.collect.FilteredEntryMultimap.AsMap();
    }

    @Override // com.google.common.collect.AbstractMultimap
    java.util.Set<K> createKeySet() {
        return asMap().keySet();
    }

    boolean removeEntriesIf(com.google.common.base.Predicate<? super java.util.Map.Entry<K, java.util.Collection<V>>> predicate) {
        java.util.Iterator<java.util.Map.Entry<K, java.util.Collection<V>>> it = this.unfiltered.asMap().entrySet().iterator();
        boolean z = false;
        while (it.hasNext()) {
            java.util.Map.Entry<K, java.util.Collection<V>> next = it.next();
            K key = next.getKey();
            java.util.Collection collectionFilterCollection = filterCollection(next.getValue(), new com.google.common.collect.FilteredEntryMultimap.ValuePredicate(key));
            if (!collectionFilterCollection.isEmpty() && predicate.apply(com.google.common.collect.Maps.immutableEntry(key, collectionFilterCollection))) {
                if (collectionFilterCollection.size() == next.getValue().size()) {
                    it.remove();
                } else {
                    collectionFilterCollection.clear();
                }
                z = true;
            }
        }
        return z;
    }

    class AsMap extends com.google.common.collect.Maps.ViewCachingAbstractMap<K, java.util.Collection<V>> {
        AsMap() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object key) {
            return get(key) != null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            com.google.common.collect.FilteredEntryMultimap.this.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public java.util.Collection<V> get(@javax.annotation.CheckForNull java.lang.Object key) {
            java.util.Collection<V> collection = com.google.common.collect.FilteredEntryMultimap.this.unfiltered.asMap().get(key);
            if (collection == null) {
                return null;
            }
            java.util.Collection<V> collectionFilterCollection = com.google.common.collect.FilteredEntryMultimap.filterCollection(collection, new com.google.common.collect.FilteredEntryMultimap.ValuePredicate(key));
            if (collectionFilterCollection.isEmpty()) {
                return null;
            }
            return collectionFilterCollection;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public java.util.Collection<V> remove(@javax.annotation.CheckForNull java.lang.Object key) {
            java.util.Collection<V> collection = com.google.common.collect.FilteredEntryMultimap.this.unfiltered.asMap().get(key);
            if (collection == null) {
                return null;
            }
            java.util.ArrayList arrayListNewArrayList = com.google.common.collect.Lists.newArrayList();
            java.util.Iterator<V> it = collection.iterator();
            while (it.hasNext()) {
                V next = it.next();
                if (com.google.common.collect.FilteredEntryMultimap.this.satisfies(key, next)) {
                    it.remove();
                    arrayListNewArrayList.add(next);
                }
            }
            if (arrayListNewArrayList.isEmpty()) {
                return null;
            }
            if (com.google.common.collect.FilteredEntryMultimap.this.unfiltered instanceof com.google.common.collect.SetMultimap) {
                return java.util.Collections.unmodifiableSet(com.google.common.collect.Sets.newLinkedHashSet(arrayListNewArrayList));
            }
            return java.util.Collections.unmodifiableList(arrayListNewArrayList);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        java.util.Set<K> createKeySet() {
            return new com.google.common.collect.Maps.KeySet<K, java.util.Collection<V>>() { // from class: com.google.common.collect.FilteredEntryMultimap.AsMap.1KeySetImpl
                @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean removeAll(java.util.Collection<?> c) {
                    return com.google.common.collect.FilteredEntryMultimap.this.removeEntriesIf(com.google.common.collect.Maps.keyPredicateOnEntries(com.google.common.base.Predicates.in(c)));
                }

                @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean retainAll(java.util.Collection<?> c) {
                    return com.google.common.collect.FilteredEntryMultimap.this.removeEntriesIf(com.google.common.collect.Maps.keyPredicateOnEntries(com.google.common.base.Predicates.not(com.google.common.base.Predicates.in(c))));
                }

                @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean remove(@javax.annotation.CheckForNull java.lang.Object o) {
                    return com.google.common.collect.FilteredEntryMultimap.AsMap.this.remove(o) != null;
                }
            };
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        java.util.Set<java.util.Map.Entry<K, java.util.Collection<V>>> createEntrySet() {
            return new com.google.common.collect.Maps.EntrySet<K, java.util.Collection<V>>() { // from class: com.google.common.collect.FilteredEntryMultimap.AsMap.1EntrySetImpl
                @Override // com.google.common.collect.Maps.EntrySet
                java.util.Map<K, java.util.Collection<V>> map() {
                    return com.google.common.collect.FilteredEntryMultimap.AsMap.this;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public java.util.Iterator<java.util.Map.Entry<K, java.util.Collection<V>>> iterator() {
                    return new com.google.common.collect.AbstractIterator<java.util.Map.Entry<K, java.util.Collection<V>>>() { // from class: com.google.common.collect.FilteredEntryMultimap.AsMap.1EntrySetImpl.1
                        final java.util.Iterator<java.util.Map.Entry<K, java.util.Collection<V>>> backingIterator;

                        {
                            this.backingIterator = com.google.common.collect.FilteredEntryMultimap.this.unfiltered.asMap().entrySet().iterator();
                        }

                        /* JADX INFO: Access modifiers changed from: protected */
                        @Override // com.google.common.collect.AbstractIterator
                        @javax.annotation.CheckForNull
                        public java.util.Map.Entry<K, java.util.Collection<V>> computeNext() {
                            while (this.backingIterator.hasNext()) {
                                java.util.Map.Entry<K, java.util.Collection<V>> next = this.backingIterator.next();
                                K key = next.getKey();
                                java.util.Collection collectionFilterCollection = com.google.common.collect.FilteredEntryMultimap.filterCollection(next.getValue(), new com.google.common.collect.FilteredEntryMultimap.ValuePredicate(key));
                                if (!collectionFilterCollection.isEmpty()) {
                                    return com.google.common.collect.Maps.immutableEntry(key, collectionFilterCollection);
                                }
                            }
                            return endOfData();
                        }
                    };
                }

                @Override // com.google.common.collect.Maps.EntrySet, com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean removeAll(java.util.Collection<?> c) {
                    return com.google.common.collect.FilteredEntryMultimap.this.removeEntriesIf(com.google.common.base.Predicates.in(c));
                }

                @Override // com.google.common.collect.Maps.EntrySet, com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean retainAll(java.util.Collection<?> c) {
                    return com.google.common.collect.FilteredEntryMultimap.this.removeEntriesIf(com.google.common.base.Predicates.not(com.google.common.base.Predicates.in(c)));
                }

                @Override // com.google.common.collect.Maps.EntrySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public int size() {
                    return com.google.common.collect.Iterators.size(iterator());
                }
            };
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        java.util.Collection<java.util.Collection<V>> createValues() {
            return new com.google.common.collect.Maps.Values<K, java.util.Collection<V>>() { // from class: com.google.common.collect.FilteredEntryMultimap.AsMap.1ValuesImpl
                @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
                public boolean remove(@javax.annotation.CheckForNull java.lang.Object o) {
                    if (!(o instanceof java.util.Collection)) {
                        return false;
                    }
                    java.util.Collection collection = (java.util.Collection) o;
                    java.util.Iterator<java.util.Map.Entry<K, java.util.Collection<V>>> it = com.google.common.collect.FilteredEntryMultimap.this.unfiltered.asMap().entrySet().iterator();
                    while (it.hasNext()) {
                        java.util.Map.Entry<K, java.util.Collection<V>> next = it.next();
                        java.util.Collection collectionFilterCollection = com.google.common.collect.FilteredEntryMultimap.filterCollection(next.getValue(), new com.google.common.collect.FilteredEntryMultimap.ValuePredicate(next.getKey()));
                        if (!collectionFilterCollection.isEmpty() && collection.equals(collectionFilterCollection)) {
                            if (collectionFilterCollection.size() == next.getValue().size()) {
                                it.remove();
                                return true;
                            }
                            collectionFilterCollection.clear();
                            return true;
                        }
                    }
                    return false;
                }

                @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
                public boolean removeAll(java.util.Collection<?> c) {
                    return com.google.common.collect.FilteredEntryMultimap.this.removeEntriesIf(com.google.common.collect.Maps.valuePredicateOnEntries(com.google.common.base.Predicates.in(c)));
                }

                @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
                public boolean retainAll(java.util.Collection<?> c) {
                    return com.google.common.collect.FilteredEntryMultimap.this.removeEntriesIf(com.google.common.collect.Maps.valuePredicateOnEntries(com.google.common.base.Predicates.not(com.google.common.base.Predicates.in(c))));
                }
            };
        }
    }

    @Override // com.google.common.collect.AbstractMultimap
    com.google.common.collect.Multiset<K> createKeys() {
        return new com.google.common.collect.FilteredEntryMultimap.Keys();
    }

    class Keys extends com.google.common.collect.Multimaps.Keys<K, V> {
        Keys() {
            super(com.google.common.collect.FilteredEntryMultimap.this);
        }

        @Override // com.google.common.collect.Multimaps.Keys, com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public int remove(@javax.annotation.CheckForNull java.lang.Object key, int occurrences) {
            com.google.common.collect.CollectPreconditions.checkNonnegative(occurrences, "occurrences");
            if (occurrences == 0) {
                return count(key);
            }
            java.util.Collection<V> collection = com.google.common.collect.FilteredEntryMultimap.this.unfiltered.asMap().get(key);
            int i = 0;
            if (collection == null) {
                return 0;
            }
            java.util.Iterator<V> it = collection.iterator();
            while (it.hasNext()) {
                if (com.google.common.collect.FilteredEntryMultimap.this.satisfies(key, it.next()) && (i = i + 1) <= occurrences) {
                    it.remove();
                }
            }
            return i;
        }

        /* JADX INFO: renamed from: com.google.common.collect.FilteredEntryMultimap$Keys$1, reason: invalid class name */
        class AnonymousClass1 extends com.google.common.collect.Multisets.EntrySet<K> {
            AnonymousClass1() {
            }

            @Override // com.google.common.collect.Multisets.EntrySet
            com.google.common.collect.Multiset<K> multiset() {
                return com.google.common.collect.FilteredEntryMultimap.Keys.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public java.util.Iterator<com.google.common.collect.Multiset.Entry<K>> iterator() {
                return com.google.common.collect.FilteredEntryMultimap.Keys.this.entryIterator();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return com.google.common.collect.FilteredEntryMultimap.this.keySet().size();
            }

            private boolean removeEntriesIf(final com.google.common.base.Predicate<? super com.google.common.collect.Multiset.Entry<K>> predicate) {
                return com.google.common.collect.FilteredEntryMultimap.this.removeEntriesIf(new com.google.common.base.Predicate() { // from class: com.google.common.collect.FilteredEntryMultimap$Keys$1$$ExternalSyntheticLambda0
                    @Override // com.google.common.base.Predicate
                    public final boolean apply(java.lang.Object obj) {
                        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                        return predicate.apply(com.google.common.collect.Multisets.immutableEntry(entry.getKey(), ((java.util.Collection) entry.getValue()).size()));
                    }
                });
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(java.util.Collection<?> c) {
                return removeEntriesIf(com.google.common.base.Predicates.in(c));
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(java.util.Collection<?> c) {
                return removeEntriesIf(com.google.common.base.Predicates.not(com.google.common.base.Predicates.in(c)));
            }
        }

        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public java.util.Set<com.google.common.collect.Multiset.Entry<K>> entrySet() {
            return new com.google.common.collect.FilteredEntryMultimap.Keys.AnonymousClass1();
        }
    }
}
