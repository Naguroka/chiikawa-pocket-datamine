package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class EmptyContiguousSet<C extends java.lang.Comparable> extends com.google.common.collect.ContiguousSet<C> {
    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@javax.annotation.CheckForNull java.lang.Object object) {
        return false;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    public com.google.common.collect.ContiguousSet<C> headSetImpl(C toElement, boolean inclusive) {
        return this;
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    int indexOf(@javax.annotation.CheckForNull java.lang.Object target) {
        return -1;
    }

    @Override // com.google.common.collect.ContiguousSet
    public com.google.common.collect.ContiguousSet<C> intersection(com.google.common.collect.ContiguousSet<C> other) {
        return this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return true;
    }

    @Override // com.google.common.collect.ImmutableSet
    boolean isHashCodeFast() {
        return true;
    }

    @Override // com.google.common.collect.ImmutableCollection
    boolean isPartialView() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    public com.google.common.collect.ContiguousSet<C> subSetImpl(C fromElement, boolean fromInclusive, C toElement, boolean toInclusive) {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    public com.google.common.collect.ContiguousSet<C> tailSetImpl(C fromElement, boolean fromInclusive) {
        return this;
    }

    @Override // com.google.common.collect.ContiguousSet, java.util.AbstractCollection
    public java.lang.String toString() {
        return okhttp3.HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }

    EmptyContiguousSet(com.google.common.collect.DiscreteDomain<C> domain) {
        super(domain);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public C first() {
        throw new java.util.NoSuchElementException();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public C last() {
        throw new java.util.NoSuchElementException();
    }

    @Override // com.google.common.collect.ContiguousSet
    public com.google.common.collect.Range<C> range() {
        throw new java.util.NoSuchElementException();
    }

    @Override // com.google.common.collect.ContiguousSet
    public com.google.common.collect.Range<C> range(com.google.common.collect.BoundType lowerBoundType, com.google.common.collect.BoundType upperBoundType) {
        throw new java.util.NoSuchElementException();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public com.google.common.collect.UnmodifiableIterator<C> iterator() {
        return com.google.common.collect.Iterators.emptyIterator();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public com.google.common.collect.UnmodifiableIterator<C> descendingIterator() {
        return com.google.common.collect.Iterators.emptyIterator();
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public com.google.common.collect.ImmutableList<C> asList() {
        return com.google.common.collect.ImmutableList.of();
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
        if (object instanceof java.util.Set) {
            return ((java.util.Set) object).isEmpty();
        }
        return false;
    }

    private static final class SerializedForm<C extends java.lang.Comparable> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final com.google.common.collect.DiscreteDomain<C> domain;

        private SerializedForm(com.google.common.collect.DiscreteDomain<C> domain) {
            this.domain = domain;
        }

        private java.lang.Object readResolve() {
            return new com.google.common.collect.EmptyContiguousSet(this.domain);
        }
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    java.lang.Object writeReplace() {
        return new com.google.common.collect.EmptyContiguousSet.SerializedForm(this.domain);
    }

    private void readObject(java.io.ObjectInputStream stream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    com.google.common.collect.ImmutableSortedSet<C> createDescendingSet() {
        return com.google.common.collect.ImmutableSortedSet.emptySet(com.google.common.collect.Ordering.natural().reverse());
    }
}
