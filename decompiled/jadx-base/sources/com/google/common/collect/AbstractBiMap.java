package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
abstract class AbstractBiMap<K, V> extends com.google.common.collect.ForwardingMap<K, V> implements com.google.common.collect.BiMap<K, V>, java.io.Serializable {
    private static final long serialVersionUID = 0;
    private transient java.util.Map<K, V> delegate;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.util.Set<java.util.Map.Entry<K, V>> entrySet;
    transient com.google.common.collect.AbstractBiMap<V, K> inverse;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.util.Set<K> keySet;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.util.Set<V> valueSet;

    @com.google.common.collect.ParametricNullness
    K checkKey(@com.google.common.collect.ParametricNullness K key) {
        return key;
    }

    @com.google.common.collect.ParametricNullness
    V checkValue(@com.google.common.collect.ParametricNullness V value) {
        return value;
    }

    AbstractBiMap(java.util.Map<K, V> forward, java.util.Map<V, K> backward) {
        setDelegates(forward, backward);
    }

    private AbstractBiMap(java.util.Map<K, V> backward, com.google.common.collect.AbstractBiMap<V, K> forward) {
        this.delegate = backward;
        this.inverse = forward;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public java.util.Map<K, V> delegate() {
        return this.delegate;
    }

    void setDelegates(java.util.Map<K, V> forward, java.util.Map<V, K> backward) {
        com.google.common.base.Preconditions.checkState(this.delegate == null);
        com.google.common.base.Preconditions.checkState(this.inverse == null);
        com.google.common.base.Preconditions.checkArgument(forward.isEmpty());
        com.google.common.base.Preconditions.checkArgument(backward.isEmpty());
        com.google.common.base.Preconditions.checkArgument(forward != backward);
        this.delegate = forward;
        this.inverse = makeInverse(backward);
    }

    com.google.common.collect.AbstractBiMap<V, K> makeInverse(java.util.Map<V, K> backward) {
        return new com.google.common.collect.AbstractBiMap.Inverse(backward, this);
    }

    void setInverse(com.google.common.collect.AbstractBiMap<V, K> inverse) {
        this.inverse = inverse;
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public boolean containsValue(@javax.annotation.CheckForNull java.lang.Object value) {
        return this.inverse.containsKey(value);
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    @javax.annotation.CheckForNull
    public V put(@com.google.common.collect.ParametricNullness K key, @com.google.common.collect.ParametricNullness V value) {
        return putInBothMaps(key, value, false);
    }

    @Override // com.google.common.collect.BiMap
    @javax.annotation.CheckForNull
    public V forcePut(@com.google.common.collect.ParametricNullness K key, @com.google.common.collect.ParametricNullness V value) {
        return putInBothMaps(key, value, true);
    }

    @javax.annotation.CheckForNull
    private V putInBothMaps(@com.google.common.collect.ParametricNullness K key, @com.google.common.collect.ParametricNullness V value, boolean force) {
        checkKey(key);
        checkValue(value);
        boolean zContainsKey = containsKey(key);
        if (zContainsKey && com.google.common.base.Objects.equal(value, get(key))) {
            return value;
        }
        if (force) {
            inverse().remove(value);
        } else {
            com.google.common.base.Preconditions.checkArgument(!containsValue(value), "value already present: %s", value);
        }
        V vPut = this.delegate.put(key, value);
        updateInverseMap(key, zContainsKey, vPut, value);
        return vPut;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void updateInverseMap(@com.google.common.collect.ParametricNullness K key, boolean containedKey, @javax.annotation.CheckForNull V oldValue, @com.google.common.collect.ParametricNullness V newValue) {
        if (containedKey) {
            removeFromInverseMap(com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(oldValue));
        }
        this.inverse.delegate.put(newValue, key);
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    @javax.annotation.CheckForNull
    public V remove(@javax.annotation.CheckForNull java.lang.Object key) {
        if (containsKey(key)) {
            return removeFromBothMaps(key);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @com.google.common.collect.ParametricNullness
    public V removeFromBothMaps(@javax.annotation.CheckForNull java.lang.Object obj) {
        V v = (V) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(this.delegate.remove(obj));
        removeFromInverseMap(v);
        return v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFromInverseMap(@com.google.common.collect.ParametricNullness V oldValue) {
        this.inverse.delegate.remove(oldValue);
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    public void putAll(java.util.Map<? extends K, ? extends V> map) {
        for (java.util.Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public void clear() {
        this.delegate.clear();
        this.inverse.delegate.clear();
    }

    @Override // com.google.common.collect.BiMap
    public com.google.common.collect.BiMap<V, K> inverse() {
        return this.inverse;
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public java.util.Set<K> keySet() {
        java.util.Set<K> set = this.keySet;
        if (set != null) {
            return set;
        }
        com.google.common.collect.AbstractBiMap.KeySet keySet = new com.google.common.collect.AbstractBiMap.KeySet();
        this.keySet = keySet;
        return keySet;
    }

    private class KeySet extends com.google.common.collect.ForwardingSet<K> {
        private KeySet() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public java.util.Set<K> delegate() {
            return com.google.common.collect.AbstractBiMap.this.delegate.keySet();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public void clear() {
            com.google.common.collect.AbstractBiMap.this.clear();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean remove(@javax.annotation.CheckForNull java.lang.Object key) {
            if (!contains(key)) {
                return false;
            }
            com.google.common.collect.AbstractBiMap.this.removeFromBothMaps(key);
            return true;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean removeAll(java.util.Collection<?> keysToRemove) {
            return standardRemoveAll(keysToRemove);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean retainAll(java.util.Collection<?> keysToRetain) {
            return standardRetainAll(keysToRetain);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<K> iterator() {
            return com.google.common.collect.Maps.keyIterator(com.google.common.collect.AbstractBiMap.this.entrySet().iterator());
        }
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    public java.util.Set<V> values() {
        java.util.Set<V> set = this.valueSet;
        if (set != null) {
            return set;
        }
        com.google.common.collect.AbstractBiMap.ValueSet valueSet = new com.google.common.collect.AbstractBiMap.ValueSet();
        this.valueSet = valueSet;
        return valueSet;
    }

    private class ValueSet extends com.google.common.collect.ForwardingSet<V> {
        final java.util.Set<V> valuesDelegate;

        private ValueSet() {
            this.valuesDelegate = com.google.common.collect.AbstractBiMap.this.inverse.keySet();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public java.util.Set<V> delegate() {
            return this.valuesDelegate;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<V> iterator() {
            return com.google.common.collect.Maps.valueIterator(com.google.common.collect.AbstractBiMap.this.entrySet().iterator());
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public java.lang.Object[] toArray() {
            return standardToArray();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) standardToArray(tArr);
        }

        @Override // com.google.common.collect.ForwardingObject
        public java.lang.String toString() {
            return standardToString();
        }
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        java.util.Set<java.util.Map.Entry<K, V>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        com.google.common.collect.AbstractBiMap.EntrySet entrySet = new com.google.common.collect.AbstractBiMap.EntrySet();
        this.entrySet = entrySet;
        return entrySet;
    }

    class BiMapEntry extends com.google.common.collect.ForwardingMapEntry<K, V> {
        private final java.util.Map.Entry<K, V> delegate;

        BiMapEntry(java.util.Map.Entry<K, V> delegate) {
            this.delegate = delegate;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
        public java.util.Map.Entry<K, V> delegate() {
            return this.delegate;
        }

        @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
        public V setValue(V value) {
            com.google.common.collect.AbstractBiMap.this.checkValue(value);
            com.google.common.base.Preconditions.checkState(com.google.common.collect.AbstractBiMap.this.entrySet().contains(this), "entry no longer in map");
            if (com.google.common.base.Objects.equal(value, getValue())) {
                return value;
            }
            com.google.common.base.Preconditions.checkArgument(!com.google.common.collect.AbstractBiMap.this.containsValue(value), "value already present: %s", value);
            V value2 = this.delegate.setValue(value);
            com.google.common.base.Preconditions.checkState(com.google.common.base.Objects.equal(value, com.google.common.collect.AbstractBiMap.this.get(getKey())), "entry no longer in map");
            com.google.common.collect.AbstractBiMap.this.updateInverseMap(getKey(), true, value2, value);
            return value2;
        }
    }

    java.util.Iterator<java.util.Map.Entry<K, V>> entrySetIterator() {
        final java.util.Iterator<java.util.Map.Entry<K, V>> it = this.delegate.entrySet().iterator();
        return new java.util.Iterator<java.util.Map.Entry<K, V>>() { // from class: com.google.common.collect.AbstractBiMap.1

            @javax.annotation.CheckForNull
            java.util.Map.Entry<K, V> entry;

            @Override // java.util.Iterator
            public boolean hasNext() {
                return it.hasNext();
            }

            @Override // java.util.Iterator
            public java.util.Map.Entry<K, V> next() {
                this.entry = (java.util.Map.Entry) it.next();
                return new com.google.common.collect.AbstractBiMap.BiMapEntry(this.entry);
            }

            @Override // java.util.Iterator
            public void remove() {
                java.util.Map.Entry<K, V> entry = this.entry;
                if (entry == null) {
                    throw new java.lang.IllegalStateException("no calls to next() since the last call to remove()");
                }
                V value = entry.getValue();
                it.remove();
                com.google.common.collect.AbstractBiMap.this.removeFromInverseMap(value);
                this.entry = null;
            }
        };
    }

    private class EntrySet extends com.google.common.collect.ForwardingSet<java.util.Map.Entry<K, V>> {
        final java.util.Set<java.util.Map.Entry<K, V>> esDelegate;

        private EntrySet() {
            this.esDelegate = com.google.common.collect.AbstractBiMap.this.delegate.entrySet();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public java.util.Set<java.util.Map.Entry<K, V>> delegate() {
            return this.esDelegate;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public void clear() {
            com.google.common.collect.AbstractBiMap.this.clear();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean remove(@javax.annotation.CheckForNull java.lang.Object object) {
            if (!this.esDelegate.contains(object) || !(object instanceof java.util.Map.Entry)) {
                return false;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) object;
            ((com.google.common.collect.AbstractBiMap) com.google.common.collect.AbstractBiMap.this.inverse).delegate.remove(entry.getValue());
            this.esDelegate.remove(entry);
            return true;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
            return com.google.common.collect.AbstractBiMap.this.entrySetIterator();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public java.lang.Object[] toArray() {
            return standardToArray();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) standardToArray(tArr);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object o) {
            return com.google.common.collect.Maps.containsEntryImpl(delegate(), o);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean containsAll(java.util.Collection<?> c) {
            return standardContainsAll(c);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean removeAll(java.util.Collection<?> c) {
            return standardRemoveAll(c);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean retainAll(java.util.Collection<?> c) {
            return standardRetainAll(c);
        }
    }

    static class Inverse<K, V> extends com.google.common.collect.AbstractBiMap<K, V> {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ java.lang.Object delegate() {
            return super.delegate();
        }

        @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
        public /* bridge */ /* synthetic */ java.util.Collection values() {
            return super.values();
        }

        Inverse(java.util.Map<K, V> backward, com.google.common.collect.AbstractBiMap<V, K> forward) {
            super(backward, forward);
        }

        @Override // com.google.common.collect.AbstractBiMap
        @com.google.common.collect.ParametricNullness
        K checkKey(@com.google.common.collect.ParametricNullness K key) {
            return this.inverse.checkValue(key);
        }

        @Override // com.google.common.collect.AbstractBiMap
        @com.google.common.collect.ParametricNullness
        V checkValue(@com.google.common.collect.ParametricNullness V value) {
            return this.inverse.checkKey(value);
        }

        private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
            stream.defaultWriteObject();
            stream.writeObject(inverse());
        }

        private void readObject(java.io.ObjectInputStream stream) throws java.lang.ClassNotFoundException, java.io.IOException {
            stream.defaultReadObject();
            setInverse((com.google.common.collect.AbstractBiMap) java.util.Objects.requireNonNull(stream.readObject()));
        }

        java.lang.Object readResolve() {
            return inverse().inverse();
        }
    }
}
