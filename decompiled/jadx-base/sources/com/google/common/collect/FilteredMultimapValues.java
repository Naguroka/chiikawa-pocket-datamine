package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class FilteredMultimapValues<K, V> extends java.util.AbstractCollection<V> {
    private final com.google.common.collect.FilteredMultimap<K, V> multimap;

    FilteredMultimapValues(com.google.common.collect.FilteredMultimap<K, V> multimap) {
        this.multimap = (com.google.common.collect.FilteredMultimap) com.google.common.base.Preconditions.checkNotNull(multimap);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public java.util.Iterator<V> iterator() {
        return com.google.common.collect.Maps.valueIterator(this.multimap.entries().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(@javax.annotation.CheckForNull java.lang.Object o) {
        return this.multimap.containsValue(o);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.multimap.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(@javax.annotation.CheckForNull java.lang.Object o) {
        com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> predicateEntryPredicate = this.multimap.entryPredicate();
        java.util.Iterator<java.util.Map.Entry<K, V>> it = this.multimap.unfiltered().entries().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry<K, V> next = it.next();
            if (predicateEntryPredicate.apply(next) && com.google.common.base.Objects.equal(next.getValue(), o)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(java.util.Collection<?> c) {
        return com.google.common.collect.Iterables.removeIf(this.multimap.unfiltered().entries(), com.google.common.base.Predicates.and(this.multimap.entryPredicate(), com.google.common.collect.Maps.valuePredicateOnEntries(com.google.common.base.Predicates.in(c))));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(java.util.Collection<?> c) {
        return com.google.common.collect.Iterables.removeIf(this.multimap.unfiltered().entries(), com.google.common.base.Predicates.and(this.multimap.entryPredicate(), com.google.common.collect.Maps.valuePredicateOnEntries(com.google.common.base.Predicates.not(com.google.common.base.Predicates.in(c)))));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.multimap.clear();
    }
}
