package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class RegularImmutableSortedSet<E> extends com.google.common.collect.ImmutableSortedSet<E> {
    static final com.google.common.collect.RegularImmutableSortedSet<java.lang.Comparable> NATURAL_EMPTY_SET = new com.google.common.collect.RegularImmutableSortedSet<>(com.google.common.collect.ImmutableList.of(), com.google.common.collect.Ordering.natural());
    final transient com.google.common.collect.ImmutableList<E> elements;

    RegularImmutableSortedSet(com.google.common.collect.ImmutableList<E> elements, java.util.Comparator<? super E> comparator) {
        super(comparator);
        this.elements = elements;
    }

    @Override // com.google.common.collect.ImmutableCollection
    @javax.annotation.CheckForNull
    java.lang.Object[] internalArray() {
        return this.elements.internalArray();
    }

    @Override // com.google.common.collect.ImmutableCollection
    int internalArrayStart() {
        return this.elements.internalArrayStart();
    }

    @Override // com.google.common.collect.ImmutableCollection
    int internalArrayEnd() {
        return this.elements.internalArrayEnd();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public com.google.common.collect.UnmodifiableIterator<E> iterator() {
        return this.elements.iterator();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public com.google.common.collect.UnmodifiableIterator<E> descendingIterator() {
        return this.elements.reverse().iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.elements.size();
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@javax.annotation.CheckForNull java.lang.Object o) {
        if (o == null) {
            return false;
        }
        try {
            return unsafeBinarySearch(o) >= 0;
        } catch (java.lang.ClassCastException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(java.util.Collection<?> targets) {
        if (targets instanceof com.google.common.collect.Multiset) {
            targets = ((com.google.common.collect.Multiset) targets).elementSet();
        }
        if (!com.google.common.collect.SortedIterables.hasSameComparator(comparator(), targets) || targets.size() <= 1) {
            return super.containsAll(targets);
        }
        com.google.common.collect.UnmodifiableIterator<E> it = iterator();
        java.util.Iterator<?> it2 = targets.iterator();
        if (!it.hasNext()) {
            return false;
        }
        java.lang.Object next = it2.next();
        E next2 = it.next();
        while (true) {
            try {
                int iUnsafeCompare = unsafeCompare(next2, next);
                if (iUnsafeCompare < 0) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    next2 = it.next();
                } else if (iUnsafeCompare == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (iUnsafeCompare > 0) {
                    return false;
                }
            } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            }
        }
    }

    private int unsafeBinarySearch(java.lang.Object key) throws java.lang.ClassCastException {
        return java.util.Collections.binarySearch(this.elements, key, unsafeComparator());
    }

    @Override // com.google.common.collect.ImmutableCollection
    boolean isPartialView() {
        return this.elements.isPartialView();
    }

    @Override // com.google.common.collect.ImmutableCollection
    int copyIntoArray(java.lang.Object[] dst, int offset) {
        return this.elements.copyIntoArray(dst, offset);
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof java.util.Set)) {
            return false;
        }
        java.util.Set set = (java.util.Set) object;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (com.google.common.collect.SortedIterables.hasSameComparator(this.comparator, set)) {
            java.util.Iterator<E> it = set.iterator();
            try {
                com.google.common.collect.UnmodifiableIterator<E> it2 = iterator();
                while (it2.hasNext()) {
                    E next = it2.next();
                    E next2 = it.next();
                    if (next2 == null || unsafeCompare(next, next2) != 0) {
                        return false;
                    }
                }
                return true;
            } catch (java.lang.ClassCastException | java.util.NoSuchElementException unused) {
                return false;
            }
        }
        return containsAll(set);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public E first() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException();
        }
        return this.elements.get(0);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public E last() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException();
        }
        return this.elements.get(size() - 1);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @javax.annotation.CheckForNull
    public E lower(E element) {
        int iHeadIndex = headIndex(element, false) - 1;
        if (iHeadIndex == -1) {
            return null;
        }
        return this.elements.get(iHeadIndex);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @javax.annotation.CheckForNull
    public E floor(E element) {
        int iHeadIndex = headIndex(element, true) - 1;
        if (iHeadIndex == -1) {
            return null;
        }
        return this.elements.get(iHeadIndex);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @javax.annotation.CheckForNull
    public E ceiling(E element) {
        int iTailIndex = tailIndex(element, true);
        if (iTailIndex == size()) {
            return null;
        }
        return this.elements.get(iTailIndex);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @javax.annotation.CheckForNull
    public E higher(E element) {
        int iTailIndex = tailIndex(element, false);
        if (iTailIndex == size()) {
            return null;
        }
        return this.elements.get(iTailIndex);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    com.google.common.collect.ImmutableSortedSet<E> headSetImpl(E toElement, boolean inclusive) {
        return getSubSet(0, headIndex(toElement, inclusive));
    }

    int headIndex(E toElement, boolean inclusive) {
        int iBinarySearch = java.util.Collections.binarySearch(this.elements, com.google.common.base.Preconditions.checkNotNull(toElement), comparator());
        if (iBinarySearch >= 0) {
            return inclusive ? iBinarySearch + 1 : iBinarySearch;
        }
        return ~iBinarySearch;
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    com.google.common.collect.ImmutableSortedSet<E> subSetImpl(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive) {
        return tailSetImpl(fromElement, fromInclusive).headSetImpl(toElement, toInclusive);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    com.google.common.collect.ImmutableSortedSet<E> tailSetImpl(E fromElement, boolean inclusive) {
        return getSubSet(tailIndex(fromElement, inclusive), size());
    }

    int tailIndex(E fromElement, boolean inclusive) {
        int iBinarySearch = java.util.Collections.binarySearch(this.elements, com.google.common.base.Preconditions.checkNotNull(fromElement), comparator());
        if (iBinarySearch >= 0) {
            return inclusive ? iBinarySearch : iBinarySearch + 1;
        }
        return ~iBinarySearch;
    }

    java.util.Comparator<java.lang.Object> unsafeComparator() {
        return this.comparator;
    }

    com.google.common.collect.RegularImmutableSortedSet<E> getSubSet(int newFromIndex, int newToIndex) {
        if (newFromIndex == 0 && newToIndex == size()) {
            return this;
        }
        if (newFromIndex < newToIndex) {
            return new com.google.common.collect.RegularImmutableSortedSet<>(this.elements.subList(newFromIndex, newToIndex), this.comparator);
        }
        return emptySet(this.comparator);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    int indexOf(@javax.annotation.CheckForNull java.lang.Object target) {
        if (target == null) {
            return -1;
        }
        try {
            int iBinarySearch = java.util.Collections.binarySearch(this.elements, target, unsafeComparator());
            if (iBinarySearch >= 0) {
                return iBinarySearch;
            }
            return -1;
        } catch (java.lang.ClassCastException unused) {
            return -1;
        }
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public com.google.common.collect.ImmutableList<E> asList() {
        return this.elements;
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    com.google.common.collect.ImmutableSortedSet<E> createDescendingSet() {
        java.util.Comparator comparatorReverseOrder = java.util.Collections.reverseOrder(this.comparator);
        if (isEmpty()) {
            return emptySet(comparatorReverseOrder);
        }
        return new com.google.common.collect.RegularImmutableSortedSet(this.elements.reverse(), comparatorReverseOrder);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    java.lang.Object writeReplace() {
        return super.writeReplace();
    }
}
