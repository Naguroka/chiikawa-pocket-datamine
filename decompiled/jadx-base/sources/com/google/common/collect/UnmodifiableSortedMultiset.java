package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class UnmodifiableSortedMultiset<E> extends com.google.common.collect.Multisets.UnmodifiableMultiset<E> implements com.google.common.collect.SortedMultiset<E> {
    private static final long serialVersionUID = 0;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.collect.UnmodifiableSortedMultiset<E> descendingMultiset;

    UnmodifiableSortedMultiset(com.google.common.collect.SortedMultiset<E> delegate) {
        super(delegate);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.Multisets.UnmodifiableMultiset, com.google.common.collect.ForwardingMultiset, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public com.google.common.collect.SortedMultiset<E> delegate() {
        return (com.google.common.collect.SortedMultiset) super.delegate();
    }

    @Override // com.google.common.collect.SortedMultiset, com.google.common.collect.SortedIterable
    public java.util.Comparator<? super E> comparator() {
        return delegate().comparator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.Multisets.UnmodifiableMultiset
    public java.util.NavigableSet<E> createElementSet() {
        return com.google.common.collect.Sets.unmodifiableNavigableSet(delegate().elementSet());
    }

    @Override // com.google.common.collect.Multisets.UnmodifiableMultiset, com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
    public java.util.NavigableSet<E> elementSet() {
        return (java.util.NavigableSet) super.elementSet();
    }

    @Override // com.google.common.collect.SortedMultiset
    public com.google.common.collect.SortedMultiset<E> descendingMultiset() {
        com.google.common.collect.UnmodifiableSortedMultiset<E> unmodifiableSortedMultiset = this.descendingMultiset;
        if (unmodifiableSortedMultiset != null) {
            return unmodifiableSortedMultiset;
        }
        com.google.common.collect.UnmodifiableSortedMultiset<E> unmodifiableSortedMultiset2 = new com.google.common.collect.UnmodifiableSortedMultiset<>(delegate().descendingMultiset());
        unmodifiableSortedMultiset2.descendingMultiset = this;
        this.descendingMultiset = unmodifiableSortedMultiset2;
        return unmodifiableSortedMultiset2;
    }

    @Override // com.google.common.collect.SortedMultiset
    @javax.annotation.CheckForNull
    public com.google.common.collect.Multiset.Entry<E> firstEntry() {
        return delegate().firstEntry();
    }

    @Override // com.google.common.collect.SortedMultiset
    @javax.annotation.CheckForNull
    public com.google.common.collect.Multiset.Entry<E> lastEntry() {
        return delegate().lastEntry();
    }

    @Override // com.google.common.collect.SortedMultiset
    @javax.annotation.CheckForNull
    public com.google.common.collect.Multiset.Entry<E> pollFirstEntry() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.SortedMultiset
    @javax.annotation.CheckForNull
    public com.google.common.collect.Multiset.Entry<E> pollLastEntry() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.SortedMultiset
    public com.google.common.collect.SortedMultiset<E> headMultiset(@com.google.common.collect.ParametricNullness E upperBound, com.google.common.collect.BoundType boundType) {
        return com.google.common.collect.Multisets.unmodifiableSortedMultiset(delegate().headMultiset(upperBound, boundType));
    }

    @Override // com.google.common.collect.SortedMultiset
    public com.google.common.collect.SortedMultiset<E> subMultiset(@com.google.common.collect.ParametricNullness E lowerBound, com.google.common.collect.BoundType lowerBoundType, @com.google.common.collect.ParametricNullness E upperBound, com.google.common.collect.BoundType upperBoundType) {
        return com.google.common.collect.Multisets.unmodifiableSortedMultiset(delegate().subMultiset(lowerBound, lowerBoundType, upperBound, upperBoundType));
    }

    @Override // com.google.common.collect.SortedMultiset
    public com.google.common.collect.SortedMultiset<E> tailMultiset(@com.google.common.collect.ParametricNullness E lowerBound, com.google.common.collect.BoundType boundType) {
        return com.google.common.collect.Multisets.unmodifiableSortedMultiset(delegate().tailMultiset(lowerBound, boundType));
    }
}
