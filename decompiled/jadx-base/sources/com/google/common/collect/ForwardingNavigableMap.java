package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ForwardingNavigableMap<K, V> extends com.google.common.collect.ForwardingSortedMap<K, V> implements java.util.NavigableMap<K, V> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingSortedMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public abstract java.util.NavigableMap<K, V> delegate();

    protected ForwardingNavigableMap() {
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public java.util.Map.Entry<K, V> lowerEntry(@com.google.common.collect.ParametricNullness K key) {
        return delegate().lowerEntry(key);
    }

    @javax.annotation.CheckForNull
    protected java.util.Map.Entry<K, V> standardLowerEntry(@com.google.common.collect.ParametricNullness K key) {
        return headMap(key, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public K lowerKey(@com.google.common.collect.ParametricNullness K key) {
        return delegate().lowerKey(key);
    }

    @javax.annotation.CheckForNull
    protected K standardLowerKey(@com.google.common.collect.ParametricNullness K k) {
        return (K) com.google.common.collect.Maps.keyOrNull(lowerEntry(k));
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public java.util.Map.Entry<K, V> floorEntry(@com.google.common.collect.ParametricNullness K key) {
        return delegate().floorEntry(key);
    }

    @javax.annotation.CheckForNull
    protected java.util.Map.Entry<K, V> standardFloorEntry(@com.google.common.collect.ParametricNullness K key) {
        return headMap(key, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public K floorKey(@com.google.common.collect.ParametricNullness K key) {
        return delegate().floorKey(key);
    }

    @javax.annotation.CheckForNull
    protected K standardFloorKey(@com.google.common.collect.ParametricNullness K k) {
        return (K) com.google.common.collect.Maps.keyOrNull(floorEntry(k));
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public java.util.Map.Entry<K, V> ceilingEntry(@com.google.common.collect.ParametricNullness K key) {
        return delegate().ceilingEntry(key);
    }

    @javax.annotation.CheckForNull
    protected java.util.Map.Entry<K, V> standardCeilingEntry(@com.google.common.collect.ParametricNullness K key) {
        return tailMap(key, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public K ceilingKey(@com.google.common.collect.ParametricNullness K key) {
        return delegate().ceilingKey(key);
    }

    @javax.annotation.CheckForNull
    protected K standardCeilingKey(@com.google.common.collect.ParametricNullness K k) {
        return (K) com.google.common.collect.Maps.keyOrNull(ceilingEntry(k));
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public java.util.Map.Entry<K, V> higherEntry(@com.google.common.collect.ParametricNullness K key) {
        return delegate().higherEntry(key);
    }

    @javax.annotation.CheckForNull
    protected java.util.Map.Entry<K, V> standardHigherEntry(@com.google.common.collect.ParametricNullness K key) {
        return tailMap(key, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public K higherKey(@com.google.common.collect.ParametricNullness K key) {
        return delegate().higherKey(key);
    }

    @javax.annotation.CheckForNull
    protected K standardHigherKey(@com.google.common.collect.ParametricNullness K k) {
        return (K) com.google.common.collect.Maps.keyOrNull(higherEntry(k));
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public java.util.Map.Entry<K, V> firstEntry() {
        return delegate().firstEntry();
    }

    @javax.annotation.CheckForNull
    protected java.util.Map.Entry<K, V> standardFirstEntry() {
        return (java.util.Map.Entry) com.google.common.collect.Iterables.getFirst(entrySet(), null);
    }

    protected K standardFirstKey() {
        java.util.Map.Entry<K, V> entryFirstEntry = firstEntry();
        if (entryFirstEntry == null) {
            throw new java.util.NoSuchElementException();
        }
        return entryFirstEntry.getKey();
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public java.util.Map.Entry<K, V> lastEntry() {
        return delegate().lastEntry();
    }

    @javax.annotation.CheckForNull
    protected java.util.Map.Entry<K, V> standardLastEntry() {
        return (java.util.Map.Entry) com.google.common.collect.Iterables.getFirst(descendingMap().entrySet(), null);
    }

    protected K standardLastKey() {
        java.util.Map.Entry<K, V> entryLastEntry = lastEntry();
        if (entryLastEntry == null) {
            throw new java.util.NoSuchElementException();
        }
        return entryLastEntry.getKey();
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public java.util.Map.Entry<K, V> pollFirstEntry() {
        return delegate().pollFirstEntry();
    }

    @javax.annotation.CheckForNull
    protected java.util.Map.Entry<K, V> standardPollFirstEntry() {
        return (java.util.Map.Entry) com.google.common.collect.Iterators.pollNext(entrySet().iterator());
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public java.util.Map.Entry<K, V> pollLastEntry() {
        return delegate().pollLastEntry();
    }

    @javax.annotation.CheckForNull
    protected java.util.Map.Entry<K, V> standardPollLastEntry() {
        return (java.util.Map.Entry) com.google.common.collect.Iterators.pollNext(descendingMap().entrySet().iterator());
    }

    @Override // java.util.NavigableMap
    public java.util.NavigableMap<K, V> descendingMap() {
        return delegate().descendingMap();
    }

    protected class StandardDescendingMap extends com.google.common.collect.Maps.DescendingMap<K, V> {
        public StandardDescendingMap() {
        }

        @Override // com.google.common.collect.Maps.DescendingMap
        java.util.NavigableMap<K, V> forward() {
            return com.google.common.collect.ForwardingNavigableMap.this;
        }

        @Override // com.google.common.collect.Maps.DescendingMap
        protected java.util.Iterator<java.util.Map.Entry<K, V>> entryIterator() {
            return new java.util.Iterator<java.util.Map.Entry<K, V>>() { // from class: com.google.common.collect.ForwardingNavigableMap.StandardDescendingMap.1

                @javax.annotation.CheckForNull
                private java.util.Map.Entry<K, V> nextOrNull;

                @javax.annotation.CheckForNull
                private java.util.Map.Entry<K, V> toRemove = null;

                {
                    this.nextOrNull = com.google.common.collect.ForwardingNavigableMap.StandardDescendingMap.this.forward().lastEntry();
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return this.nextOrNull != null;
                }

                @Override // java.util.Iterator
                public java.util.Map.Entry<K, V> next() {
                    java.util.Map.Entry<K, V> entry = this.nextOrNull;
                    if (entry == null) {
                        throw new java.util.NoSuchElementException();
                    }
                    this.toRemove = entry;
                    this.nextOrNull = com.google.common.collect.ForwardingNavigableMap.StandardDescendingMap.this.forward().lowerEntry(this.nextOrNull.getKey());
                    return entry;
                }

                @Override // java.util.Iterator
                public void remove() {
                    if (this.toRemove == null) {
                        throw new java.lang.IllegalStateException("no calls to next() since the last call to remove()");
                    }
                    com.google.common.collect.ForwardingNavigableMap.StandardDescendingMap.this.forward().remove(this.toRemove.getKey());
                    this.toRemove = null;
                }
            };
        }
    }

    @Override // java.util.NavigableMap
    public java.util.NavigableSet<K> navigableKeySet() {
        return delegate().navigableKeySet();
    }

    protected class StandardNavigableKeySet extends com.google.common.collect.Maps.NavigableKeySet<K, V> {
        public StandardNavigableKeySet(final com.google.common.collect.ForwardingNavigableMap this$0) {
            super(this$0);
        }
    }

    @Override // java.util.NavigableMap
    public java.util.NavigableSet<K> descendingKeySet() {
        return delegate().descendingKeySet();
    }

    protected java.util.NavigableSet<K> standardDescendingKeySet() {
        return descendingMap().navigableKeySet();
    }

    @Override // com.google.common.collect.ForwardingSortedMap
    protected java.util.SortedMap<K, V> standardSubMap(@com.google.common.collect.ParametricNullness K fromKey, @com.google.common.collect.ParametricNullness K toKey) {
        return subMap(fromKey, true, toKey, false);
    }

    @Override // java.util.NavigableMap
    public java.util.NavigableMap<K, V> subMap(@com.google.common.collect.ParametricNullness K fromKey, boolean fromInclusive, @com.google.common.collect.ParametricNullness K toKey, boolean toInclusive) {
        return delegate().subMap(fromKey, fromInclusive, toKey, toInclusive);
    }

    @Override // java.util.NavigableMap
    public java.util.NavigableMap<K, V> headMap(@com.google.common.collect.ParametricNullness K toKey, boolean inclusive) {
        return delegate().headMap(toKey, inclusive);
    }

    @Override // java.util.NavigableMap
    public java.util.NavigableMap<K, V> tailMap(@com.google.common.collect.ParametricNullness K fromKey, boolean inclusive) {
        return delegate().tailMap(fromKey, inclusive);
    }

    protected java.util.SortedMap<K, V> standardHeadMap(@com.google.common.collect.ParametricNullness K toKey) {
        return headMap(toKey, false);
    }

    protected java.util.SortedMap<K, V> standardTailMap(@com.google.common.collect.ParametricNullness K fromKey) {
        return tailMap(fromKey, true);
    }
}
