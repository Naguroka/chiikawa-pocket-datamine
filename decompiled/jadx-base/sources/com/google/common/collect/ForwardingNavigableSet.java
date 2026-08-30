package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ForwardingNavigableSet<E> extends com.google.common.collect.ForwardingSortedSet<E> implements java.util.NavigableSet<E> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public abstract java.util.NavigableSet<E> delegate();

    protected ForwardingNavigableSet() {
    }

    @Override // java.util.NavigableSet
    @javax.annotation.CheckForNull
    public E lower(@com.google.common.collect.ParametricNullness E e) {
        return delegate().lower(e);
    }

    @javax.annotation.CheckForNull
    protected E standardLower(@com.google.common.collect.ParametricNullness E e) {
        return (E) com.google.common.collect.Iterators.getNext(headSet(e, false).descendingIterator(), null);
    }

    @Override // java.util.NavigableSet
    @javax.annotation.CheckForNull
    public E floor(@com.google.common.collect.ParametricNullness E e) {
        return delegate().floor(e);
    }

    @javax.annotation.CheckForNull
    protected E standardFloor(@com.google.common.collect.ParametricNullness E e) {
        return (E) com.google.common.collect.Iterators.getNext(headSet(e, true).descendingIterator(), null);
    }

    @Override // java.util.NavigableSet
    @javax.annotation.CheckForNull
    public E ceiling(@com.google.common.collect.ParametricNullness E e) {
        return delegate().ceiling(e);
    }

    @javax.annotation.CheckForNull
    protected E standardCeiling(@com.google.common.collect.ParametricNullness E e) {
        return (E) com.google.common.collect.Iterators.getNext(tailSet(e, true).iterator(), null);
    }

    @Override // java.util.NavigableSet
    @javax.annotation.CheckForNull
    public E higher(@com.google.common.collect.ParametricNullness E e) {
        return delegate().higher(e);
    }

    @javax.annotation.CheckForNull
    protected E standardHigher(@com.google.common.collect.ParametricNullness E e) {
        return (E) com.google.common.collect.Iterators.getNext(tailSet(e, false).iterator(), null);
    }

    @Override // java.util.NavigableSet
    @javax.annotation.CheckForNull
    public E pollFirst() {
        return delegate().pollFirst();
    }

    @javax.annotation.CheckForNull
    protected E standardPollFirst() {
        return (E) com.google.common.collect.Iterators.pollNext(iterator());
    }

    @Override // java.util.NavigableSet
    @javax.annotation.CheckForNull
    public E pollLast() {
        return delegate().pollLast();
    }

    @javax.annotation.CheckForNull
    protected E standardPollLast() {
        return (E) com.google.common.collect.Iterators.pollNext(descendingIterator());
    }

    @com.google.common.collect.ParametricNullness
    protected E standardFirst() {
        return iterator().next();
    }

    @com.google.common.collect.ParametricNullness
    protected E standardLast() {
        return descendingIterator().next();
    }

    @Override // java.util.NavigableSet
    public java.util.NavigableSet<E> descendingSet() {
        return delegate().descendingSet();
    }

    protected class StandardDescendingSet extends com.google.common.collect.Sets.DescendingSet<E> {
        public StandardDescendingSet(final com.google.common.collect.ForwardingNavigableSet this$0) {
            super(this$0);
        }
    }

    @Override // java.util.NavigableSet
    public java.util.Iterator<E> descendingIterator() {
        return delegate().descendingIterator();
    }

    @Override // java.util.NavigableSet
    public java.util.NavigableSet<E> subSet(@com.google.common.collect.ParametricNullness E fromElement, boolean fromInclusive, @com.google.common.collect.ParametricNullness E toElement, boolean toInclusive) {
        return delegate().subSet(fromElement, fromInclusive, toElement, toInclusive);
    }

    protected java.util.NavigableSet<E> standardSubSet(@com.google.common.collect.ParametricNullness E fromElement, boolean fromInclusive, @com.google.common.collect.ParametricNullness E toElement, boolean toInclusive) {
        return tailSet(fromElement, fromInclusive).headSet(toElement, toInclusive);
    }

    @Override // com.google.common.collect.ForwardingSortedSet
    protected java.util.SortedSet<E> standardSubSet(@com.google.common.collect.ParametricNullness E fromElement, @com.google.common.collect.ParametricNullness E toElement) {
        return subSet(fromElement, true, toElement, false);
    }

    @Override // java.util.NavigableSet
    public java.util.NavigableSet<E> headSet(@com.google.common.collect.ParametricNullness E toElement, boolean inclusive) {
        return delegate().headSet(toElement, inclusive);
    }

    protected java.util.SortedSet<E> standardHeadSet(@com.google.common.collect.ParametricNullness E toElement) {
        return headSet(toElement, false);
    }

    @Override // java.util.NavigableSet
    public java.util.NavigableSet<E> tailSet(@com.google.common.collect.ParametricNullness E fromElement, boolean inclusive) {
        return delegate().tailSet(fromElement, inclusive);
    }

    protected java.util.SortedSet<E> standardTailSet(@com.google.common.collect.ParametricNullness E fromElement) {
        return tailSet(fromElement, true);
    }
}
