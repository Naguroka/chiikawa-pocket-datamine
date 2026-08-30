package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
interface FilteredSetMultimap<K, V> extends com.google.common.collect.FilteredMultimap<K, V>, com.google.common.collect.SetMultimap<K, V> {
    @Override // com.google.common.collect.FilteredMultimap
    com.google.common.collect.SetMultimap<K, V> unfiltered();
}
