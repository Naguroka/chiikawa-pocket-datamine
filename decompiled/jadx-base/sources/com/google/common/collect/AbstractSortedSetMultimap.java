package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
abstract class AbstractSortedSetMultimap<K, V> extends com.google.common.collect.AbstractSetMultimap<K, V> implements com.google.common.collect.SortedSetMultimap<K, V> {
    private static final long serialVersionUID = 430848587173315748L;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    public abstract java.util.SortedSet<V> createCollection();

    protected AbstractSortedSetMultimap(java.util.Map<K, java.util.Collection<V>> map) {
        super(map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    public java.util.SortedSet<V> createUnmodifiableEmptyCollection() {
        return (java.util.SortedSet<V>) unmodifiableCollectionSubclass((java.util.Collection) createCollection());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    public <E> java.util.SortedSet<E> unmodifiableCollectionSubclass(java.util.Collection<E> collection) {
        if (collection instanceof java.util.NavigableSet) {
            return com.google.common.collect.Sets.unmodifiableNavigableSet((java.util.NavigableSet) collection);
        }
        return java.util.Collections.unmodifiableSortedSet((java.util.SortedSet) collection);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    java.util.Collection<V> wrapCollection(@com.google.common.collect.ParametricNullness K key, java.util.Collection<V> collection) {
        if (collection instanceof java.util.NavigableSet) {
            return new com.google.common.collect.AbstractMapBasedMultimap.WrappedNavigableSet(key, (java.util.NavigableSet) collection, null);
        }
        return new com.google.common.collect.AbstractMapBasedMultimap.WrappedSortedSet(key, (java.util.SortedSet) collection, null);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.SortedSet<V> get(@com.google.common.collect.ParametricNullness K key) {
        return (java.util.SortedSet) super.get((java.lang.Object) key);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.SortedSet<V> removeAll(@javax.annotation.CheckForNull java.lang.Object key) {
        return (java.util.SortedSet) super.removeAll(key);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.SortedSet<V> replaceValues(@com.google.common.collect.ParametricNullness K key, java.lang.Iterable<? extends V> values) {
        return (java.util.SortedSet) super.replaceValues((java.lang.Object) key, (java.lang.Iterable) values);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.Map<K, java.util.Collection<V>> asMap() {
        return super.asMap();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public java.util.Collection<V> values() {
        return super.values();
    }
}
