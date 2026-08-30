package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
class ImmutableEntry<K, V> extends com.google.common.collect.AbstractMapEntry<K, V> implements java.io.Serializable {
    private static final long serialVersionUID = 0;

    @com.google.common.collect.ParametricNullness
    final K key;

    @com.google.common.collect.ParametricNullness
    final V value;

    ImmutableEntry(@com.google.common.collect.ParametricNullness K key, @com.google.common.collect.ParametricNullness V value) {
        this.key = key;
        this.value = value;
    }

    @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
    @com.google.common.collect.ParametricNullness
    public final K getKey() {
        return this.key;
    }

    @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
    @com.google.common.collect.ParametricNullness
    public final V getValue() {
        return this.value;
    }

    @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
    @com.google.common.collect.ParametricNullness
    public final V setValue(@com.google.common.collect.ParametricNullness V value) {
        throw new java.lang.UnsupportedOperationException();
    }
}
