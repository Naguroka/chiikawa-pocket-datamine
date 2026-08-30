package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class DescendingImmutableSortedMultiset<E> extends com.google.common.collect.ImmutableSortedMultiset<E> {
    private final transient com.google.common.collect.ImmutableSortedMultiset<E> forward;

    DescendingImmutableSortedMultiset(com.google.common.collect.ImmutableSortedMultiset<E> forward) {
        this.forward = forward;
    }

    @Override // com.google.common.collect.Multiset
    public int count(@javax.annotation.CheckForNull java.lang.Object element) {
        return this.forward.count(element);
    }

    @Override // com.google.common.collect.SortedMultiset
    @javax.annotation.CheckForNull
    public com.google.common.collect.Multiset.Entry<E> firstEntry() {
        return this.forward.lastEntry();
    }

    @Override // com.google.common.collect.SortedMultiset
    @javax.annotation.CheckForNull
    public com.google.common.collect.Multiset.Entry<E> lastEntry() {
        return this.forward.firstEntry();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public int size() {
        return this.forward.size();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    public com.google.common.collect.ImmutableSortedSet<E> elementSet() {
        return this.forward.elementSet().descendingSet();
    }

    @Override // com.google.common.collect.ImmutableMultiset
    com.google.common.collect.Multiset.Entry<E> getEntry(int index) {
        return this.forward.entrySet().asList().reverse().get(index);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    public com.google.common.collect.ImmutableSortedMultiset<E> descendingMultiset() {
        return this.forward;
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    public com.google.common.collect.ImmutableSortedMultiset<E> headMultiset(E upperBound, com.google.common.collect.BoundType boundType) {
        return this.forward.tailMultiset((java.lang.Object) upperBound, boundType).descendingMultiset();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    public com.google.common.collect.ImmutableSortedMultiset<E> tailMultiset(E lowerBound, com.google.common.collect.BoundType boundType) {
        return this.forward.headMultiset((java.lang.Object) lowerBound, boundType).descendingMultiset();
    }

    @Override // com.google.common.collect.ImmutableCollection
    boolean isPartialView() {
        return this.forward.isPartialView();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    java.lang.Object writeReplace() {
        return super.writeReplace();
    }
}
