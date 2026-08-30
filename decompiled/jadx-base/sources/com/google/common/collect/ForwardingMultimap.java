package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ForwardingMultimap<K, V> extends com.google.common.collect.ForwardingObject implements com.google.common.collect.Multimap<K, V> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingObject
    public abstract com.google.common.collect.Multimap<K, V> delegate();

    protected ForwardingMultimap() {
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.Map<K, java.util.Collection<V>> asMap() {
        return delegate().asMap();
    }

    @Override // com.google.common.collect.Multimap
    public void clear() {
        delegate().clear();
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsEntry(@javax.annotation.CheckForNull java.lang.Object key, @javax.annotation.CheckForNull java.lang.Object value) {
        return delegate().containsEntry(key, value);
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object key) {
        return delegate().containsKey(key);
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsValue(@javax.annotation.CheckForNull java.lang.Object value) {
        return delegate().containsValue(value);
    }

    @Override // com.google.common.collect.Multimap
    public java.util.Collection<java.util.Map.Entry<K, V>> entries() {
        return delegate().entries();
    }

    public java.util.Collection<V> get(@com.google.common.collect.ParametricNullness K key) {
        return delegate().get(key);
    }

    @Override // com.google.common.collect.Multimap
    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    @Override // com.google.common.collect.Multimap
    public com.google.common.collect.Multiset<K> keys() {
        return delegate().keys();
    }

    @Override // com.google.common.collect.Multimap
    public java.util.Set<K> keySet() {
        return delegate().keySet();
    }

    @Override // com.google.common.collect.Multimap
    public boolean put(@com.google.common.collect.ParametricNullness K key, @com.google.common.collect.ParametricNullness V value) {
        return delegate().put(key, value);
    }

    @Override // com.google.common.collect.Multimap
    public boolean putAll(@com.google.common.collect.ParametricNullness K key, java.lang.Iterable<? extends V> values) {
        return delegate().putAll(key, values);
    }

    @Override // com.google.common.collect.Multimap
    public boolean putAll(com.google.common.collect.Multimap<? extends K, ? extends V> multimap) {
        return delegate().putAll(multimap);
    }

    @Override // com.google.common.collect.Multimap
    public boolean remove(@javax.annotation.CheckForNull java.lang.Object key, @javax.annotation.CheckForNull java.lang.Object value) {
        return delegate().remove(key, value);
    }

    public java.util.Collection<V> removeAll(@javax.annotation.CheckForNull java.lang.Object key) {
        return delegate().removeAll(key);
    }

    public java.util.Collection<V> replaceValues(@com.google.common.collect.ParametricNullness K key, java.lang.Iterable<? extends V> values) {
        return delegate().replaceValues(key, values);
    }

    @Override // com.google.common.collect.Multimap
    public int size() {
        return delegate().size();
    }

    @Override // com.google.common.collect.Multimap
    public java.util.Collection<V> values() {
        return delegate().values();
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
        return object == this || delegate().equals(object);
    }

    @Override // com.google.common.collect.Multimap
    public int hashCode() {
        return delegate().hashCode();
    }
}
