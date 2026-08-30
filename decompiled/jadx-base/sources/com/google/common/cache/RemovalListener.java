package com.google.common.cache;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.cache.ElementTypesAreNonnullByDefault
public interface RemovalListener<K, V> {
    void onRemoval(com.google.common.cache.RemovalNotification<K, V> notification);
}
