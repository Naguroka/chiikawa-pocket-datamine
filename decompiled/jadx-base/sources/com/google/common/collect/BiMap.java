package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public interface BiMap<K, V> extends java.util.Map<K, V> {
    @javax.annotation.CheckForNull
    V forcePut(@com.google.common.collect.ParametricNullness K key, @com.google.common.collect.ParametricNullness V value);

    com.google.common.collect.BiMap<V, K> inverse();

    @javax.annotation.CheckForNull
    V put(@com.google.common.collect.ParametricNullness K key, @com.google.common.collect.ParametricNullness V value);

    void putAll(java.util.Map<? extends K, ? extends V> map);

    @Override // com.google.common.collect.BiMap
    java.util.Set<V> values();
}
