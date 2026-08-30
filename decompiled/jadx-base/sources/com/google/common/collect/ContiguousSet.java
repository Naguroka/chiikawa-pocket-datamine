package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ContiguousSet<C extends java.lang.Comparable> extends com.google.common.collect.ImmutableSortedSet<C> {
    final com.google.common.collect.DiscreteDomain<C> domain;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableSortedSet
    public abstract com.google.common.collect.ContiguousSet<C> headSetImpl(C toElement, boolean inclusive);

    public abstract com.google.common.collect.ContiguousSet<C> intersection(com.google.common.collect.ContiguousSet<C> other);

    public abstract com.google.common.collect.Range<C> range();

    public abstract com.google.common.collect.Range<C> range(com.google.common.collect.BoundType lowerBoundType, com.google.common.collect.BoundType upperBoundType);

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableSortedSet
    public abstract com.google.common.collect.ContiguousSet<C> subSetImpl(C fromElement, boolean fromInclusive, C toElement, boolean toInclusive);

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableSortedSet
    public abstract com.google.common.collect.ContiguousSet<C> tailSetImpl(C fromElement, boolean inclusive);

    public static <C extends java.lang.Comparable> com.google.common.collect.ContiguousSet<C> create(com.google.common.collect.Range<C> range, com.google.common.collect.DiscreteDomain<C> domain) {
        com.google.common.base.Preconditions.checkNotNull(range);
        com.google.common.base.Preconditions.checkNotNull(domain);
        try {
            com.google.common.collect.Range<C> rangeIntersection = !range.hasLowerBound() ? range.intersection(com.google.common.collect.Range.atLeast(domain.minValue())) : range;
            if (!range.hasUpperBound()) {
                rangeIntersection = rangeIntersection.intersection(com.google.common.collect.Range.atMost(domain.maxValue()));
            }
            boolean z = true;
            if (!rangeIntersection.isEmpty() && com.google.common.collect.Range.compareOrThrow((java.lang.Comparable) java.util.Objects.requireNonNull(range.lowerBound.leastValueAbove(domain)), (java.lang.Comparable) java.util.Objects.requireNonNull(range.upperBound.greatestValueBelow(domain))) <= 0) {
                z = false;
            }
            if (z) {
                return new com.google.common.collect.EmptyContiguousSet(domain);
            }
            return new com.google.common.collect.RegularContiguousSet(rangeIntersection, domain);
        } catch (java.util.NoSuchElementException e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    public static com.google.common.collect.ContiguousSet<java.lang.Integer> closed(int lower, int upper) {
        return create(com.google.common.collect.Range.closed(java.lang.Integer.valueOf(lower), java.lang.Integer.valueOf(upper)), com.google.common.collect.DiscreteDomain.integers());
    }

    public static com.google.common.collect.ContiguousSet<java.lang.Long> closed(long lower, long upper) {
        return create(com.google.common.collect.Range.closed(java.lang.Long.valueOf(lower), java.lang.Long.valueOf(upper)), com.google.common.collect.DiscreteDomain.longs());
    }

    public static com.google.common.collect.ContiguousSet<java.lang.Integer> closedOpen(int lower, int upper) {
        return create(com.google.common.collect.Range.closedOpen(java.lang.Integer.valueOf(lower), java.lang.Integer.valueOf(upper)), com.google.common.collect.DiscreteDomain.integers());
    }

    public static com.google.common.collect.ContiguousSet<java.lang.Long> closedOpen(long lower, long upper) {
        return create(com.google.common.collect.Range.closedOpen(java.lang.Long.valueOf(lower), java.lang.Long.valueOf(upper)), com.google.common.collect.DiscreteDomain.longs());
    }

    ContiguousSet(com.google.common.collect.DiscreteDomain<C> domain) {
        super(com.google.common.collect.Ordering.natural());
        this.domain = domain;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public com.google.common.collect.ContiguousSet<C> headSet(C toElement) {
        return headSetImpl((java.lang.Comparable) com.google.common.base.Preconditions.checkNotNull(toElement), false);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public com.google.common.collect.ContiguousSet<C> headSet(C toElement, boolean inclusive) {
        return headSetImpl((java.lang.Comparable) com.google.common.base.Preconditions.checkNotNull(toElement), inclusive);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public com.google.common.collect.ContiguousSet<C> subSet(C fromElement, C toElement) {
        com.google.common.base.Preconditions.checkNotNull(fromElement);
        com.google.common.base.Preconditions.checkNotNull(toElement);
        com.google.common.base.Preconditions.checkArgument(comparator().compare(fromElement, toElement) <= 0);
        return subSetImpl((java.lang.Comparable) fromElement, true, (java.lang.Comparable) toElement, false);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public com.google.common.collect.ContiguousSet<C> subSet(C fromElement, boolean fromInclusive, C toElement, boolean toInclusive) {
        com.google.common.base.Preconditions.checkNotNull(fromElement);
        com.google.common.base.Preconditions.checkNotNull(toElement);
        com.google.common.base.Preconditions.checkArgument(comparator().compare(fromElement, toElement) <= 0);
        return subSetImpl((java.lang.Comparable) fromElement, fromInclusive, (java.lang.Comparable) toElement, toInclusive);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public com.google.common.collect.ContiguousSet<C> tailSet(C fromElement) {
        return tailSetImpl((java.lang.Comparable) com.google.common.base.Preconditions.checkNotNull(fromElement), true);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public com.google.common.collect.ContiguousSet<C> tailSet(C fromElement, boolean inclusive) {
        return tailSetImpl((java.lang.Comparable) com.google.common.base.Preconditions.checkNotNull(fromElement), inclusive);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    com.google.common.collect.ImmutableSortedSet<C> createDescendingSet() {
        return new com.google.common.collect.DescendingImmutableSortedSet(this);
    }

    @Override // java.util.AbstractCollection
    public java.lang.String toString() {
        return range().toString();
    }

    @java.lang.Deprecated
    public static <E> com.google.common.collect.ImmutableSortedSet.Builder<E> builder() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    java.lang.Object writeReplace() {
        return super.writeReplace();
    }
}
