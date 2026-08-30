package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class FilteredEntrySetMultimap<K, V> extends com.google.common.collect.FilteredEntryMultimap<K, V> implements com.google.common.collect.FilteredSetMultimap<K, V> {
    FilteredEntrySetMultimap(com.google.common.collect.SetMultimap<K, V> unfiltered, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> predicate) {
        super(unfiltered, predicate);
    }

    @Override // com.google.common.collect.FilteredEntryMultimap, com.google.common.collect.FilteredMultimap
    public com.google.common.collect.SetMultimap<K, V> unfiltered() {
        return (com.google.common.collect.SetMultimap) this.unfiltered;
    }

    @Override // com.google.common.collect.FilteredEntryMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.Set<V> get(@com.google.common.collect.ParametricNullness K key) {
        return (java.util.Set) super.get((java.lang.Object) key);
    }

    @Override // com.google.common.collect.FilteredEntryMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.Set<V> removeAll(@javax.annotation.CheckForNull java.lang.Object key) {
        return (java.util.Set) super.removeAll(key);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.Set<V> replaceValues(@com.google.common.collect.ParametricNullness K key, java.lang.Iterable<? extends V> values) {
        return (java.util.Set) super.replaceValues((java.lang.Object) key, (java.lang.Iterable) values);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.FilteredEntryMultimap, com.google.common.collect.AbstractMultimap
    public java.util.Set<java.util.Map.Entry<K, V>> createEntries() {
        return com.google.common.collect.Sets.filter(unfiltered().entries(), entryPredicate());
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public java.util.Set<java.util.Map.Entry<K, V>> entries() {
        return (java.util.Set) super.entries();
    }
}
