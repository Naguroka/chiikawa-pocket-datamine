package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ForwardingConcurrentMap<K, V> extends com.google.common.collect.ForwardingMap<K, V> implements java.util.concurrent.ConcurrentMap<K, V> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public abstract java.util.concurrent.ConcurrentMap<K, V> delegate();

    protected ForwardingConcurrentMap() {
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @javax.annotation.CheckForNull
    public V putIfAbsent(K key, V value) {
        return delegate().putIfAbsent(key, value);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean remove(@javax.annotation.CheckForNull java.lang.Object key, @javax.annotation.CheckForNull java.lang.Object value) {
        return delegate().remove(key, value);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @javax.annotation.CheckForNull
    public V replace(K key, V value) {
        return delegate().replace(key, value);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(K key, V oldValue, V newValue) {
        return delegate().replace(key, oldValue, newValue);
    }
}
