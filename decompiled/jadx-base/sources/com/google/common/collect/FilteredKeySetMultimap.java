package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class FilteredKeySetMultimap<K, V> extends com.google.common.collect.FilteredKeyMultimap<K, V> implements com.google.common.collect.FilteredSetMultimap<K, V> {
    FilteredKeySetMultimap(com.google.common.collect.SetMultimap<K, V> unfiltered, com.google.common.base.Predicate<? super K> keyPredicate) {
        super(unfiltered, keyPredicate);
    }

    @Override // com.google.common.collect.FilteredKeyMultimap, com.google.common.collect.FilteredMultimap
    public com.google.common.collect.SetMultimap<K, V> unfiltered() {
        return (com.google.common.collect.SetMultimap) this.unfiltered;
    }

    @Override // com.google.common.collect.FilteredKeyMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.Set<V> get(@com.google.common.collect.ParametricNullness K key) {
        return (java.util.Set) super.get((java.lang.Object) key);
    }

    @Override // com.google.common.collect.FilteredKeyMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.Set<V> removeAll(@javax.annotation.CheckForNull java.lang.Object key) {
        return (java.util.Set) super.removeAll(key);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.Set<V> replaceValues(@com.google.common.collect.ParametricNullness K key, java.lang.Iterable<? extends V> values) {
        return (java.util.Set) super.replaceValues((java.lang.Object) key, (java.lang.Iterable) values);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public java.util.Set<java.util.Map.Entry<K, V>> entries() {
        return (java.util.Set) super.entries();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.FilteredKeyMultimap, com.google.common.collect.AbstractMultimap
    public java.util.Set<java.util.Map.Entry<K, V>> createEntries() {
        return new com.google.common.collect.FilteredKeySetMultimap.EntrySet(this);
    }

    class EntrySet extends com.google.common.collect.FilteredKeyMultimap<K, V>.Entries implements java.util.Set<java.util.Map.Entry<K, V>> {
        EntrySet(final com.google.common.collect.FilteredKeySetMultimap this$0) {
            super();
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return com.google.common.collect.Sets.hashCodeImpl(this);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object o) {
            return com.google.common.collect.Sets.equalsImpl(this, o);
        }
    }
}
