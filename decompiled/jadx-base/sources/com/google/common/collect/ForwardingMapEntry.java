package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ForwardingMapEntry<K, V> extends com.google.common.collect.ForwardingObject implements java.util.Map.Entry<K, V> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingObject
    public abstract java.util.Map.Entry<K, V> delegate();

    protected ForwardingMapEntry() {
    }

    @Override // java.util.Map.Entry
    @com.google.common.collect.ParametricNullness
    public K getKey() {
        return delegate().getKey();
    }

    @Override // java.util.Map.Entry
    @com.google.common.collect.ParametricNullness
    public V getValue() {
        return delegate().getValue();
    }

    @com.google.common.collect.ParametricNullness
    public V setValue(@com.google.common.collect.ParametricNullness V value) {
        return delegate().setValue(value);
    }

    @Override // java.util.Map.Entry
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
        return delegate().equals(object);
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return delegate().hashCode();
    }

    protected boolean standardEquals(@javax.annotation.CheckForNull java.lang.Object object) {
        if (!(object instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) object;
        return com.google.common.base.Objects.equal(getKey(), entry.getKey()) && com.google.common.base.Objects.equal(getValue(), entry.getValue());
    }

    protected int standardHashCode() {
        K key = getKey();
        V value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    protected java.lang.String standardToString() {
        return getKey() + com.ironsource.y8.i.b + getValue();
    }
}
