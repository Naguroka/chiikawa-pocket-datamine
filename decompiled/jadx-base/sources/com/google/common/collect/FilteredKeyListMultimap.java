package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class FilteredKeyListMultimap<K, V> extends com.google.common.collect.FilteredKeyMultimap<K, V> implements com.google.common.collect.ListMultimap<K, V> {
    FilteredKeyListMultimap(com.google.common.collect.ListMultimap<K, V> unfiltered, com.google.common.base.Predicate<? super K> keyPredicate) {
        super(unfiltered, keyPredicate);
    }

    @Override // com.google.common.collect.FilteredKeyMultimap, com.google.common.collect.FilteredMultimap
    public com.google.common.collect.ListMultimap<K, V> unfiltered() {
        return (com.google.common.collect.ListMultimap) super.unfiltered();
    }

    @Override // com.google.common.collect.FilteredKeyMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.List<V> get(@com.google.common.collect.ParametricNullness K key) {
        return (java.util.List) super.get((java.lang.Object) key);
    }

    @Override // com.google.common.collect.FilteredKeyMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.List<V> removeAll(@javax.annotation.CheckForNull java.lang.Object key) {
        return (java.util.List) super.removeAll(key);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.List<V> replaceValues(@com.google.common.collect.ParametricNullness K key, java.lang.Iterable<? extends V> values) {
        return (java.util.List) super.replaceValues((java.lang.Object) key, (java.lang.Iterable) values);
    }
}
