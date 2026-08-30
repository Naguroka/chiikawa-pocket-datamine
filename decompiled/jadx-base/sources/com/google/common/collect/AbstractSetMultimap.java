package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
abstract class AbstractSetMultimap<K, V> extends com.google.common.collect.AbstractMapBasedMultimap<K, V> implements com.google.common.collect.SetMultimap<K, V> {
    private static final long serialVersionUID = 7431625294878419160L;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public abstract java.util.Set<V> createCollection();

    protected AbstractSetMultimap(java.util.Map<K, java.util.Collection<V>> map) {
        super(map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public java.util.Set<V> createUnmodifiableEmptyCollection() {
        return java.util.Collections.emptySet();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    <E> java.util.Collection<E> unmodifiableCollectionSubclass(java.util.Collection<E> collection) {
        return java.util.Collections.unmodifiableSet((java.util.Set) collection);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    java.util.Collection<V> wrapCollection(@com.google.common.collect.ParametricNullness K key, java.util.Collection<V> collection) {
        return new com.google.common.collect.AbstractMapBasedMultimap.WrappedSet(key, (java.util.Set) collection);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.Set<V> get(@com.google.common.collect.ParametricNullness K key) {
        return (java.util.Set) super.get((java.lang.Object) key);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public java.util.Set<java.util.Map.Entry<K, V>> entries() {
        return (java.util.Set) super.entries();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.Set<V> removeAll(@javax.annotation.CheckForNull java.lang.Object key) {
        return (java.util.Set) super.removeAll(key);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.Set<V> replaceValues(@com.google.common.collect.ParametricNullness K key, java.lang.Iterable<? extends V> values) {
        return (java.util.Set) super.replaceValues((java.lang.Object) key, (java.lang.Iterable) values);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.Map<K, java.util.Collection<V>> asMap() {
        return super.asMap();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public boolean put(@com.google.common.collect.ParametricNullness K key, @com.google.common.collect.ParametricNullness V value) {
        return super.put(key, value);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
        return super.equals(object);
    }
}
