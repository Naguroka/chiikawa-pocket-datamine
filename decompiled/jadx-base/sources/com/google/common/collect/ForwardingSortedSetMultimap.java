package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ForwardingSortedSetMultimap<K, V> extends com.google.common.collect.ForwardingSetMultimap<K, V> implements com.google.common.collect.SortedSetMultimap<K, V> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingSetMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
    public abstract com.google.common.collect.SortedSetMultimap<K, V> delegate();

    protected ForwardingSortedSetMultimap() {
    }

    @Override // com.google.common.collect.ForwardingSetMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.SortedSet<V> get(@com.google.common.collect.ParametricNullness K key) {
        return delegate().get((java.lang.Object) key);
    }

    @Override // com.google.common.collect.ForwardingSetMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.SortedSet<V> removeAll(@javax.annotation.CheckForNull java.lang.Object key) {
        return delegate().removeAll(key);
    }

    @Override // com.google.common.collect.ForwardingSetMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.SortedSet<V> replaceValues(@com.google.common.collect.ParametricNullness K key, java.lang.Iterable<? extends V> values) {
        return delegate().replaceValues((java.lang.Object) key, (java.lang.Iterable) values);
    }

    @Override // com.google.common.collect.SortedSetMultimap
    @javax.annotation.CheckForNull
    public java.util.Comparator<? super V> valueComparator() {
        return delegate().valueComparator();
    }
}
