package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ForwardingSortedMap<K, V> extends com.google.common.collect.ForwardingMap<K, V> implements java.util.SortedMap<K, V> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public abstract java.util.SortedMap<K, V> delegate();

    protected ForwardingSortedMap() {
    }

    @Override // java.util.SortedMap
    @javax.annotation.CheckForNull
    public java.util.Comparator<? super K> comparator() {
        return delegate().comparator();
    }

    @Override // java.util.SortedMap
    @com.google.common.collect.ParametricNullness
    public K firstKey() {
        return delegate().firstKey();
    }

    @Override // java.util.SortedMap
    public java.util.SortedMap<K, V> headMap(@com.google.common.collect.ParametricNullness K toKey) {
        return delegate().headMap(toKey);
    }

    @Override // java.util.SortedMap
    @com.google.common.collect.ParametricNullness
    public K lastKey() {
        return delegate().lastKey();
    }

    @Override // java.util.SortedMap
    public java.util.SortedMap<K, V> subMap(@com.google.common.collect.ParametricNullness K fromKey, @com.google.common.collect.ParametricNullness K toKey) {
        return delegate().subMap(fromKey, toKey);
    }

    @Override // java.util.SortedMap
    public java.util.SortedMap<K, V> tailMap(@com.google.common.collect.ParametricNullness K fromKey) {
        return delegate().tailMap(fromKey);
    }

    protected class StandardKeySet extends com.google.common.collect.Maps.SortedKeySet<K, V> {
        public StandardKeySet(final com.google.common.collect.ForwardingSortedMap this$0) {
            super(this$0);
        }
    }

    static int unsafeCompare(@javax.annotation.CheckForNull java.util.Comparator<?> comparator, @javax.annotation.CheckForNull java.lang.Object o1, @javax.annotation.CheckForNull java.lang.Object o2) {
        if (comparator == null) {
            return ((java.lang.Comparable) o1).compareTo(o2);
        }
        return comparator.compare(o1, o2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ForwardingMap
    protected boolean standardContainsKey(@javax.annotation.CheckForNull java.lang.Object key) {
        try {
            return unsafeCompare(comparator(), tailMap(key).firstKey(), key) == 0;
        } catch (java.lang.ClassCastException | java.lang.NullPointerException | java.util.NoSuchElementException unused) {
            return false;
        }
    }

    protected java.util.SortedMap<K, V> standardSubMap(K fromKey, K toKey) {
        com.google.common.base.Preconditions.checkArgument(unsafeCompare(comparator(), fromKey, toKey) <= 0, "fromKey must be <= toKey");
        return tailMap(fromKey).headMap(toKey);
    }
}
