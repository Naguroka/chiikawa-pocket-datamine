package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public interface ListMultimap<K, V> extends com.google.common.collect.Multimap<K, V> {
    java.util.Map<K, java.util.Collection<V>> asMap();

    boolean equals(@javax.annotation.CheckForNull java.lang.Object obj);

    @Override // 
    java.util.List<V> get(@com.google.common.collect.ParametricNullness K key);

    @Override // 
    java.util.List<V> removeAll(@javax.annotation.CheckForNull java.lang.Object key);

    @Override // 
    java.util.List<V> replaceValues(@com.google.common.collect.ParametricNullness K key, java.lang.Iterable<? extends V> values);
}
