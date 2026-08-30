package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
abstract class AbstractMapEntry<K, V> implements java.util.Map.Entry<K, V> {
    @Override // java.util.Map.Entry
    @com.google.common.collect.ParametricNullness
    public abstract K getKey();

    @Override // java.util.Map.Entry
    @com.google.common.collect.ParametricNullness
    public abstract V getValue();

    AbstractMapEntry() {
    }

    @Override // java.util.Map.Entry
    @com.google.common.collect.ParametricNullness
    public V setValue(@com.google.common.collect.ParametricNullness V value) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map.Entry
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
        if (!(object instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) object;
        return com.google.common.base.Objects.equal(getKey(), entry.getKey()) && com.google.common.base.Objects.equal(getValue(), entry.getValue());
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        K key = getKey();
        V value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    public java.lang.String toString() {
        return getKey() + com.ironsource.y8.i.b + getValue();
    }
}
