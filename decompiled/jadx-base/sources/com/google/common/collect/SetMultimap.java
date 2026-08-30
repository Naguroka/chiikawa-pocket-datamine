package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public interface SetMultimap<K, V> extends com.google.common.collect.Multimap<K, V> {
    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    java.util.Map<K, java.util.Collection<V>> asMap();

    @Override // com.google.common.collect.Multimap
    java.util.Set<java.util.Map.Entry<K, V>> entries();

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    boolean equals(@javax.annotation.CheckForNull java.lang.Object obj);

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    java.util.Set<V> get(@com.google.common.collect.ParametricNullness K key);

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    java.util.Set<V> removeAll(@javax.annotation.CheckForNull java.lang.Object key);

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    java.util.Set<V> replaceValues(@com.google.common.collect.ParametricNullness K key, java.lang.Iterable<? extends V> values);
}
