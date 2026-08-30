package com.google.common.cache;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.cache.ElementTypesAreNonnullByDefault
public interface Weigher<K, V> {
    int weigh(K key, V value);
}
