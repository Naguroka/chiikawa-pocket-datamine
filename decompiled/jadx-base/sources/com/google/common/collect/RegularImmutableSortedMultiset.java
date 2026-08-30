package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class RegularImmutableSortedMultiset<E> extends com.google.common.collect.ImmutableSortedMultiset<E> {
    private final transient long[] cumulativeCounts;
    final transient com.google.common.collect.RegularImmutableSortedSet<E> elementSet;
    private final transient int length;
    private final transient int offset;
    private static final long[] ZERO_CUMULATIVE_COUNTS = {0};
    static final com.google.common.collect.ImmutableSortedMultiset<java.lang.Comparable> NATURAL_EMPTY_MULTISET = new com.google.common.collect.RegularImmutableSortedMultiset(com.google.common.collect.Ordering.natural());

    RegularImmutableSortedMultiset(java.util.Comparator<? super E> comparator) {
        this.elementSet = com.google.common.collect.ImmutableSortedSet.emptySet(comparator);
        this.cumulativeCounts = ZERO_CUMULATIVE_COUNTS;
        this.offset = 0;
        this.length = 0;
    }

    RegularImmutableSortedMultiset(com.google.common.collect.RegularImmutableSortedSet<E> elementSet, long[] cumulativeCounts, int offset, int length) {
        this.elementSet = elementSet;
        this.cumulativeCounts = cumulativeCounts;
        this.offset = offset;
        this.length = length;
    }

    private int getCount(int index) {
        long[] jArr = this.cumulativeCounts;
        int i = this.offset;
        return (int) (jArr[(i + index) + 1] - jArr[i + index]);
    }

    @Override // com.google.common.collect.ImmutableMultiset
    com.google.common.collect.Multiset.Entry<E> getEntry(int index) {
        return com.google.common.collect.Multisets.immutableEntry(this.elementSet.asList().get(index), getCount(index));
    }

    @Override // com.google.common.collect.SortedMultiset
    @javax.annotation.CheckForNull
    public com.google.common.collect.Multiset.Entry<E> firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return getEntry(0);
    }

    @Override // com.google.common.collect.SortedMultiset
    @javax.annotation.CheckForNull
    public com.google.common.collect.Multiset.Entry<E> lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return getEntry(this.length - 1);
    }

    @Override // com.google.common.collect.Multiset
    public int count(@javax.annotation.CheckForNull java.lang.Object element) {
        int iIndexOf = this.elementSet.indexOf(element);
        if (iIndexOf >= 0) {
            return getCount(iIndexOf);
        }
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public int size() {
        long[] jArr = this.cumulativeCounts;
        int i = this.offset;
        return com.google.common.primitives.Ints.saturatedCast(jArr[this.length + i] - jArr[i]);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    public com.google.common.collect.ImmutableSortedSet<E> elementSet() {
        return this.elementSet;
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    public com.google.common.collect.ImmutableSortedMultiset<E> headMultiset(E upperBound, com.google.common.collect.BoundType boundType) {
        return getSubMultiset(0, this.elementSet.headIndex(upperBound, com.google.common.base.Preconditions.checkNotNull(boundType) == com.google.common.collect.BoundType.CLOSED));
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    public com.google.common.collect.ImmutableSortedMultiset<E> tailMultiset(E lowerBound, com.google.common.collect.BoundType boundType) {
        return getSubMultiset(this.elementSet.tailIndex(lowerBound, com.google.common.base.Preconditions.checkNotNull(boundType) == com.google.common.collect.BoundType.CLOSED), this.length);
    }

    com.google.common.collect.ImmutableSortedMultiset<E> getSubMultiset(int from, int to) {
        com.google.common.base.Preconditions.checkPositionIndexes(from, to, this.length);
        if (from == to) {
            return emptyMultiset(comparator());
        }
        return (from == 0 && to == this.length) ? this : new com.google.common.collect.RegularImmutableSortedMultiset(this.elementSet.getSubSet(from, to), this.cumulativeCounts, this.offset + from, to - from);
    }

    @Override // com.google.common.collect.ImmutableCollection
    boolean isPartialView() {
        return this.offset > 0 || this.length < this.cumulativeCounts.length - 1;
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    java.lang.Object writeReplace() {
        return super.writeReplace();
    }
}
