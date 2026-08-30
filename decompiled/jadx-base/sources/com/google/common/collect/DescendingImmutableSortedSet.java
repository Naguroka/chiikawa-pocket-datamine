package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class DescendingImmutableSortedSet<E> extends com.google.common.collect.ImmutableSortedSet<E> {
    private final com.google.common.collect.ImmutableSortedSet<E> forward;

    DescendingImmutableSortedSet(com.google.common.collect.ImmutableSortedSet<E> forward) {
        super(com.google.common.collect.Ordering.from(forward.comparator()).reverse());
        this.forward = forward;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@javax.annotation.CheckForNull java.lang.Object object) {
        return this.forward.contains(object);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.forward.size();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public com.google.common.collect.UnmodifiableIterator<E> iterator() {
        return this.forward.descendingIterator();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    com.google.common.collect.ImmutableSortedSet<E> headSetImpl(E toElement, boolean inclusive) {
        return this.forward.tailSet((java.lang.Object) toElement, inclusive).descendingSet();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    com.google.common.collect.ImmutableSortedSet<E> subSetImpl(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive) {
        return this.forward.subSet((java.lang.Object) toElement, toInclusive, (java.lang.Object) fromElement, fromInclusive).descendingSet();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    com.google.common.collect.ImmutableSortedSet<E> tailSetImpl(E fromElement, boolean inclusive) {
        return this.forward.headSet((java.lang.Object) fromElement, inclusive).descendingSet();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public com.google.common.collect.ImmutableSortedSet<E> descendingSet() {
        return this.forward;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public com.google.common.collect.UnmodifiableIterator<E> descendingIterator() {
        return this.forward.iterator();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    com.google.common.collect.ImmutableSortedSet<E> createDescendingSet() {
        throw new java.lang.AssertionError("should never be called");
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @javax.annotation.CheckForNull
    public E lower(E element) {
        return this.forward.higher(element);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @javax.annotation.CheckForNull
    public E floor(E element) {
        return this.forward.ceiling(element);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @javax.annotation.CheckForNull
    public E ceiling(E element) {
        return this.forward.floor(element);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @javax.annotation.CheckForNull
    public E higher(E element) {
        return this.forward.lower(element);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    int indexOf(@javax.annotation.CheckForNull java.lang.Object target) {
        int iIndexOf = this.forward.indexOf(target);
        return iIndexOf == -1 ? iIndexOf : (size() - 1) - iIndexOf;
    }

    @Override // com.google.common.collect.ImmutableCollection
    boolean isPartialView() {
        return this.forward.isPartialView();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    java.lang.Object writeReplace() {
        return super.writeReplace();
    }
}
