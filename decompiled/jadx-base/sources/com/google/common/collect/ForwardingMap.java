package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ForwardingMap<K, V> extends com.google.common.collect.ForwardingObject implements java.util.Map<K, V> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingObject
    public abstract java.util.Map<K, V> delegate();

    protected ForwardingMap() {
    }

    public int size() {
        return delegate().size();
    }

    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    @javax.annotation.CheckForNull
    public V remove(@javax.annotation.CheckForNull java.lang.Object key) {
        return delegate().remove(key);
    }

    public void clear() {
        delegate().clear();
    }

    public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object key) {
        return delegate().containsKey(key);
    }

    public boolean containsValue(@javax.annotation.CheckForNull java.lang.Object value) {
        return delegate().containsValue(value);
    }

    @javax.annotation.CheckForNull
    public V get(@javax.annotation.CheckForNull java.lang.Object key) {
        return delegate().get(key);
    }

    @javax.annotation.CheckForNull
    public V put(@com.google.common.collect.ParametricNullness K key, @com.google.common.collect.ParametricNullness V value) {
        return delegate().put(key, value);
    }

    public void putAll(java.util.Map<? extends K, ? extends V> map) {
        delegate().putAll(map);
    }

    public java.util.Set<K> keySet() {
        return delegate().keySet();
    }

    public java.util.Collection<V> values() {
        return delegate().values();
    }

    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        return delegate().entrySet();
    }

    public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
        return object == this || delegate().equals(object);
    }

    public int hashCode() {
        return delegate().hashCode();
    }

    protected void standardPutAll(java.util.Map<? extends K, ? extends V> map) {
        com.google.common.collect.Maps.putAllImpl(this, map);
    }

    @javax.annotation.CheckForNull
    protected V standardRemove(@javax.annotation.CheckForNull java.lang.Object key) {
        java.util.Iterator<java.util.Map.Entry<K, V>> it = entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry<K, V> next = it.next();
            if (com.google.common.base.Objects.equal(next.getKey(), key)) {
                V value = next.getValue();
                it.remove();
                return value;
            }
        }
        return null;
    }

    protected void standardClear() {
        com.google.common.collect.Iterators.clear(entrySet().iterator());
    }

    protected class StandardKeySet extends com.google.common.collect.Maps.KeySet<K, V> {
        public StandardKeySet(final com.google.common.collect.ForwardingMap this$0) {
            super(this$0);
        }
    }

    protected boolean standardContainsKey(@javax.annotation.CheckForNull java.lang.Object key) {
        return com.google.common.collect.Maps.containsKeyImpl(this, key);
    }

    protected class StandardValues extends com.google.common.collect.Maps.Values<K, V> {
        public StandardValues(final com.google.common.collect.ForwardingMap this$0) {
            super(this$0);
        }
    }

    protected boolean standardContainsValue(@javax.annotation.CheckForNull java.lang.Object value) {
        return com.google.common.collect.Maps.containsValueImpl(this, value);
    }

    protected abstract class StandardEntrySet extends com.google.common.collect.Maps.EntrySet<K, V> {
        protected StandardEntrySet() {
        }

        @Override // com.google.common.collect.Maps.EntrySet
        java.util.Map<K, V> map() {
            return com.google.common.collect.ForwardingMap.this;
        }
    }

    protected boolean standardIsEmpty() {
        return !entrySet().iterator().hasNext();
    }

    protected boolean standardEquals(@javax.annotation.CheckForNull java.lang.Object object) {
        return com.google.common.collect.Maps.equalsImpl(this, object);
    }

    protected int standardHashCode() {
        return com.google.common.collect.Sets.hashCodeImpl(entrySet());
    }

    protected java.lang.String standardToString() {
        return com.google.common.collect.Maps.toStringImpl(this);
    }
}
