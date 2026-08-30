package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.errorprone.annotations.DoNotMock("Use ImmutableMultimap, HashMultimap, or another implementation")
@com.google.common.collect.ElementTypesAreNonnullByDefault
public interface Multimap<K, V> {
    java.util.Map<K, java.util.Collection<V>> asMap();

    void clear();

    boolean containsEntry(@javax.annotation.CheckForNull java.lang.Object key, @javax.annotation.CheckForNull java.lang.Object value);

    boolean containsKey(@javax.annotation.CheckForNull java.lang.Object key);

    boolean containsValue(@javax.annotation.CheckForNull java.lang.Object value);

    java.util.Collection<java.util.Map.Entry<K, V>> entries();

    boolean equals(@javax.annotation.CheckForNull java.lang.Object obj);

    java.util.Collection<V> get(@com.google.common.collect.ParametricNullness K key);

    int hashCode();

    boolean isEmpty();

    java.util.Set<K> keySet();

    com.google.common.collect.Multiset<K> keys();

    boolean put(@com.google.common.collect.ParametricNullness K key, @com.google.common.collect.ParametricNullness V value);

    boolean putAll(com.google.common.collect.Multimap<? extends K, ? extends V> multimap);

    boolean putAll(@com.google.common.collect.ParametricNullness K key, java.lang.Iterable<? extends V> values);

    boolean remove(@javax.annotation.CheckForNull java.lang.Object key, @javax.annotation.CheckForNull java.lang.Object value);

    java.util.Collection<V> removeAll(@javax.annotation.CheckForNull java.lang.Object key);

    java.util.Collection<V> replaceValues(@com.google.common.collect.ParametricNullness K key, java.lang.Iterable<? extends V> values);

    int size();

    java.util.Collection<V> values();
}
