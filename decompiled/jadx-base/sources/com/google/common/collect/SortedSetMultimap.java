package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public interface SortedSetMultimap<K, V> extends com.google.common.collect.SetMultimap<K, V> {
    @Override // com.google.common.collect.SetMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    java.util.Map<K, java.util.Collection<V>> asMap();

    @Override // com.google.common.collect.SetMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    java.util.SortedSet<V> get(@com.google.common.collect.ParametricNullness K key);

    @Override // com.google.common.collect.SetMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    java.util.SortedSet<V> removeAll(@javax.annotation.CheckForNull java.lang.Object key);

    @Override // com.google.common.collect.SetMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    java.util.SortedSet<V> replaceValues(@com.google.common.collect.ParametricNullness K key, java.lang.Iterable<? extends V> values);

    @javax.annotation.CheckForNull
    java.util.Comparator<? super V> valueComparator();
}
