package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ForwardingListMultimap<K, V> extends com.google.common.collect.ForwardingMultimap<K, V> implements com.google.common.collect.ListMultimap<K, V> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
    public abstract com.google.common.collect.ListMultimap<K, V> delegate();

    protected ForwardingListMultimap() {
    }

    @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.List<V> get(@com.google.common.collect.ParametricNullness K key) {
        return delegate().get((java.lang.Object) key);
    }

    @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.List<V> removeAll(@javax.annotation.CheckForNull java.lang.Object key) {
        return delegate().removeAll(key);
    }

    @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.List<V> replaceValues(@com.google.common.collect.ParametricNullness K key, java.lang.Iterable<? extends V> values) {
        return delegate().replaceValues((java.lang.Object) key, (java.lang.Iterable) values);
    }
}
