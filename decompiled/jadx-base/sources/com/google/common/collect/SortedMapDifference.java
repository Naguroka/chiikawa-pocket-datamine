package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public interface SortedMapDifference<K, V> extends com.google.common.collect.MapDifference<K, V> {
    @Override // com.google.common.collect.MapDifference
    java.util.SortedMap<K, com.google.common.collect.MapDifference.ValueDifference<V>> entriesDiffering();

    @Override // com.google.common.collect.MapDifference
    java.util.SortedMap<K, V> entriesInCommon();

    @Override // com.google.common.collect.MapDifference
    java.util.SortedMap<K, V> entriesOnlyOnLeft();

    @Override // com.google.common.collect.MapDifference
    java.util.SortedMap<K, V> entriesOnlyOnRight();
}
