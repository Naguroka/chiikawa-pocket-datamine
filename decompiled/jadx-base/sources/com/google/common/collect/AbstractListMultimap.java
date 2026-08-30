package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
abstract class AbstractListMultimap<K, V> extends com.google.common.collect.AbstractMapBasedMultimap<K, V> implements com.google.common.collect.ListMultimap<K, V> {
    private static final long serialVersionUID = 6588350623831699109L;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public abstract java.util.List<V> createCollection();

    protected AbstractListMultimap(java.util.Map<K, java.util.Collection<V>> map) {
        super(map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public java.util.List<V> createUnmodifiableEmptyCollection() {
        return java.util.Collections.emptyList();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    <E> java.util.Collection<E> unmodifiableCollectionSubclass(java.util.Collection<E> collection) {
        return java.util.Collections.unmodifiableList((java.util.List) collection);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    java.util.Collection<V> wrapCollection(@com.google.common.collect.ParametricNullness K key, java.util.Collection<V> collection) {
        return wrapList(key, (java.util.List) collection, null);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.List<V> get(@com.google.common.collect.ParametricNullness K key) {
        return (java.util.List) super.get((java.lang.Object) key);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.List<V> removeAll(@javax.annotation.CheckForNull java.lang.Object key) {
        return (java.util.List) super.removeAll(key);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.List<V> replaceValues(@com.google.common.collect.ParametricNullness K key, java.lang.Iterable<? extends V> values) {
        return (java.util.List) super.replaceValues((java.lang.Object) key, (java.lang.Iterable) values);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public boolean put(@com.google.common.collect.ParametricNullness K key, @com.google.common.collect.ParametricNullness V value) {
        return super.put(key, value);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.Map<K, java.util.Collection<V>> asMap() {
        return super.asMap();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
        return super.equals(object);
    }
}
