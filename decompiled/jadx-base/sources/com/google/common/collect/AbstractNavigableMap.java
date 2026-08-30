package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
abstract class AbstractNavigableMap<K, V> extends com.google.common.collect.Maps.IteratorBasedAbstractMap<K, V> implements java.util.NavigableMap<K, V> {
    abstract java.util.Iterator<java.util.Map.Entry<K, V>> descendingEntryIterator();

    @Override // java.util.AbstractMap, java.util.Map
    @javax.annotation.CheckForNull
    public abstract V get(@javax.annotation.CheckForNull java.lang.Object key);

    AbstractNavigableMap() {
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public java.util.Map.Entry<K, V> firstEntry() {
        return (java.util.Map.Entry) com.google.common.collect.Iterators.getNext(entryIterator(), null);
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public java.util.Map.Entry<K, V> lastEntry() {
        return (java.util.Map.Entry) com.google.common.collect.Iterators.getNext(descendingEntryIterator(), null);
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public java.util.Map.Entry<K, V> pollFirstEntry() {
        return (java.util.Map.Entry) com.google.common.collect.Iterators.pollNext(entryIterator());
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public java.util.Map.Entry<K, V> pollLastEntry() {
        return (java.util.Map.Entry) com.google.common.collect.Iterators.pollNext(descendingEntryIterator());
    }

    @Override // java.util.SortedMap
    @com.google.common.collect.ParametricNullness
    public K firstKey() {
        java.util.Map.Entry<K, V> entryFirstEntry = firstEntry();
        if (entryFirstEntry == null) {
            throw new java.util.NoSuchElementException();
        }
        return entryFirstEntry.getKey();
    }

    @Override // java.util.SortedMap
    @com.google.common.collect.ParametricNullness
    public K lastKey() {
        java.util.Map.Entry<K, V> entryLastEntry = lastEntry();
        if (entryLastEntry == null) {
            throw new java.util.NoSuchElementException();
        }
        return entryLastEntry.getKey();
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public java.util.Map.Entry<K, V> lowerEntry(@com.google.common.collect.ParametricNullness K key) {
        return headMap(key, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public java.util.Map.Entry<K, V> floorEntry(@com.google.common.collect.ParametricNullness K key) {
        return headMap(key, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public java.util.Map.Entry<K, V> ceilingEntry(@com.google.common.collect.ParametricNullness K key) {
        return tailMap(key, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public java.util.Map.Entry<K, V> higherEntry(@com.google.common.collect.ParametricNullness K key) {
        return tailMap(key, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public K lowerKey(@com.google.common.collect.ParametricNullness K k) {
        return (K) com.google.common.collect.Maps.keyOrNull(lowerEntry(k));
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public K floorKey(@com.google.common.collect.ParametricNullness K k) {
        return (K) com.google.common.collect.Maps.keyOrNull(floorEntry(k));
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public K ceilingKey(@com.google.common.collect.ParametricNullness K k) {
        return (K) com.google.common.collect.Maps.keyOrNull(ceilingEntry(k));
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public K higherKey(@com.google.common.collect.ParametricNullness K k) {
        return (K) com.google.common.collect.Maps.keyOrNull(higherEntry(k));
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public java.util.SortedMap<K, V> subMap(@com.google.common.collect.ParametricNullness K fromKey, @com.google.common.collect.ParametricNullness K toKey) {
        return subMap(fromKey, true, toKey, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public java.util.SortedMap<K, V> headMap(@com.google.common.collect.ParametricNullness K toKey) {
        return headMap(toKey, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public java.util.SortedMap<K, V> tailMap(@com.google.common.collect.ParametricNullness K fromKey) {
        return tailMap(fromKey, true);
    }

    @Override // java.util.NavigableMap
    public java.util.NavigableSet<K> navigableKeySet() {
        return new com.google.common.collect.Maps.NavigableKeySet(this);
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public java.util.Set<K> keySet() {
        return navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public java.util.NavigableSet<K> descendingKeySet() {
        return descendingMap().navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public java.util.NavigableMap<K, V> descendingMap() {
        return new com.google.common.collect.AbstractNavigableMap.DescendingMap();
    }

    private final class DescendingMap extends com.google.common.collect.Maps.DescendingMap<K, V> {
        private DescendingMap() {
        }

        @Override // com.google.common.collect.Maps.DescendingMap
        java.util.NavigableMap<K, V> forward() {
            return com.google.common.collect.AbstractNavigableMap.this;
        }

        @Override // com.google.common.collect.Maps.DescendingMap
        java.util.Iterator<java.util.Map.Entry<K, V>> entryIterator() {
            return com.google.common.collect.AbstractNavigableMap.this.descendingEntryIterator();
        }
    }
}
