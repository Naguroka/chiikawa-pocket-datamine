package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class SortedMultisets {
    private SortedMultisets() {
    }

    static class ElementSet<E> extends com.google.common.collect.Multisets.ElementSet<E> implements java.util.SortedSet<E> {
        private final com.google.common.collect.SortedMultiset<E> multiset;

        ElementSet(com.google.common.collect.SortedMultiset<E> multiset) {
            this.multiset = multiset;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Multisets.ElementSet
        public final com.google.common.collect.SortedMultiset<E> multiset() {
            return this.multiset;
        }

        @Override // com.google.common.collect.Multisets.ElementSet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<E> iterator() {
            return com.google.common.collect.Multisets.elementIterator(multiset().entrySet().iterator());
        }

        @Override // java.util.SortedSet
        public java.util.Comparator<? super E> comparator() {
            return multiset().comparator();
        }

        @Override // java.util.SortedSet
        public java.util.SortedSet<E> subSet(@com.google.common.collect.ParametricNullness E fromElement, @com.google.common.collect.ParametricNullness E toElement) {
            return multiset().subMultiset(fromElement, com.google.common.collect.BoundType.CLOSED, toElement, com.google.common.collect.BoundType.OPEN).elementSet();
        }

        @Override // java.util.SortedSet
        public java.util.SortedSet<E> headSet(@com.google.common.collect.ParametricNullness E toElement) {
            return multiset().headMultiset(toElement, com.google.common.collect.BoundType.OPEN).elementSet();
        }

        @Override // java.util.SortedSet
        public java.util.SortedSet<E> tailSet(@com.google.common.collect.ParametricNullness E fromElement) {
            return multiset().tailMultiset(fromElement, com.google.common.collect.BoundType.CLOSED).elementSet();
        }

        @Override // java.util.SortedSet
        @com.google.common.collect.ParametricNullness
        public E first() {
            return (E) com.google.common.collect.SortedMultisets.getElementOrThrow(multiset().firstEntry());
        }

        @Override // java.util.SortedSet
        @com.google.common.collect.ParametricNullness
        public E last() {
            return (E) com.google.common.collect.SortedMultisets.getElementOrThrow(multiset().lastEntry());
        }
    }

    static class NavigableElementSet<E> extends com.google.common.collect.SortedMultisets.ElementSet<E> implements java.util.NavigableSet<E> {
        NavigableElementSet(com.google.common.collect.SortedMultiset<E> multiset) {
            super(multiset);
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public E lower(@com.google.common.collect.ParametricNullness E e) {
            return (E) com.google.common.collect.SortedMultisets.getElementOrNull(multiset().headMultiset(e, com.google.common.collect.BoundType.OPEN).lastEntry());
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public E floor(@com.google.common.collect.ParametricNullness E e) {
            return (E) com.google.common.collect.SortedMultisets.getElementOrNull(multiset().headMultiset(e, com.google.common.collect.BoundType.CLOSED).lastEntry());
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public E ceiling(@com.google.common.collect.ParametricNullness E e) {
            return (E) com.google.common.collect.SortedMultisets.getElementOrNull(multiset().tailMultiset(e, com.google.common.collect.BoundType.CLOSED).firstEntry());
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public E higher(@com.google.common.collect.ParametricNullness E e) {
            return (E) com.google.common.collect.SortedMultisets.getElementOrNull(multiset().tailMultiset(e, com.google.common.collect.BoundType.OPEN).firstEntry());
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<E> descendingSet() {
            return new com.google.common.collect.SortedMultisets.NavigableElementSet(multiset().descendingMultiset());
        }

        @Override // java.util.NavigableSet
        public java.util.Iterator<E> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public E pollFirst() {
            return (E) com.google.common.collect.SortedMultisets.getElementOrNull(multiset().pollFirstEntry());
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public E pollLast() {
            return (E) com.google.common.collect.SortedMultisets.getElementOrNull(multiset().pollLastEntry());
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<E> subSet(@com.google.common.collect.ParametricNullness E fromElement, boolean fromInclusive, @com.google.common.collect.ParametricNullness E toElement, boolean toInclusive) {
            return new com.google.common.collect.SortedMultisets.NavigableElementSet(multiset().subMultiset(fromElement, com.google.common.collect.BoundType.forBoolean(fromInclusive), toElement, com.google.common.collect.BoundType.forBoolean(toInclusive)));
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<E> headSet(@com.google.common.collect.ParametricNullness E toElement, boolean inclusive) {
            return new com.google.common.collect.SortedMultisets.NavigableElementSet(multiset().headMultiset(toElement, com.google.common.collect.BoundType.forBoolean(inclusive)));
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<E> tailSet(@com.google.common.collect.ParametricNullness E fromElement, boolean inclusive) {
            return new com.google.common.collect.SortedMultisets.NavigableElementSet(multiset().tailMultiset(fromElement, com.google.common.collect.BoundType.forBoolean(inclusive)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> E getElementOrThrow(@javax.annotation.CheckForNull com.google.common.collect.Multiset.Entry<E> entry) {
        if (entry == null) {
            throw new java.util.NoSuchElementException();
        }
        return entry.getElement();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @javax.annotation.CheckForNull
    public static <E> E getElementOrNull(@javax.annotation.CheckForNull com.google.common.collect.Multiset.Entry<E> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getElement();
    }
}
