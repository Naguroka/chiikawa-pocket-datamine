package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.errorprone.annotations.DoNotMock("Use ImmutableRangeMap or TreeRangeMap")
@com.google.common.collect.ElementTypesAreNonnullByDefault
public interface RangeMap<K extends java.lang.Comparable, V> {
    java.util.Map<com.google.common.collect.Range<K>, V> asDescendingMapOfRanges();

    java.util.Map<com.google.common.collect.Range<K>, V> asMapOfRanges();

    void clear();

    boolean equals(@javax.annotation.CheckForNull java.lang.Object o);

    @javax.annotation.CheckForNull
    V get(K key);

    @javax.annotation.CheckForNull
    java.util.Map.Entry<com.google.common.collect.Range<K>, V> getEntry(K key);

    int hashCode();

    void put(com.google.common.collect.Range<K> range, V value);

    void putAll(com.google.common.collect.RangeMap<K, ? extends V> rangeMap);

    void putCoalescing(com.google.common.collect.Range<K> range, V value);

    void remove(com.google.common.collect.Range<K> range);

    com.google.common.collect.Range<K> span();

    com.google.common.collect.RangeMap<K, V> subRangeMap(com.google.common.collect.Range<K> range);

    java.lang.String toString();
}
