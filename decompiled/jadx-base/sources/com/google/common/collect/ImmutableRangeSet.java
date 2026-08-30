package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public final class ImmutableRangeSet<C extends java.lang.Comparable> extends com.google.common.collect.AbstractRangeSet<C> implements java.io.Serializable {

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.collect.ImmutableRangeSet<C> complement;
    private final transient com.google.common.collect.ImmutableList<com.google.common.collect.Range<C>> ranges;
    private static final com.google.common.collect.ImmutableRangeSet<java.lang.Comparable<?>> EMPTY = new com.google.common.collect.ImmutableRangeSet<>(com.google.common.collect.ImmutableList.of());
    private static final com.google.common.collect.ImmutableRangeSet<java.lang.Comparable<?>> ALL = new com.google.common.collect.ImmutableRangeSet<>(com.google.common.collect.ImmutableList.of(com.google.common.collect.Range.all()));

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean contains(java.lang.Comparable value) {
        return super.contains(value);
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean enclosesAll(com.google.common.collect.RangeSet other) {
        return super.enclosesAll(other);
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean enclosesAll(java.lang.Iterable ranges) {
        return super.enclosesAll(ranges);
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        return super.equals(obj);
    }

    static <E extends java.lang.Comparable<? super E>> java.util.stream.Collector<com.google.common.collect.Range<E>, ?, com.google.common.collect.ImmutableRangeSet<E>> toImmutableRangeSet() {
        return com.google.common.collect.CollectCollectors.toImmutableRangeSet();
    }

    public static <C extends java.lang.Comparable> com.google.common.collect.ImmutableRangeSet<C> of() {
        return EMPTY;
    }

    public static <C extends java.lang.Comparable> com.google.common.collect.ImmutableRangeSet<C> of(com.google.common.collect.Range<C> range) {
        com.google.common.base.Preconditions.checkNotNull(range);
        if (range.isEmpty()) {
            return of();
        }
        if (range.equals(com.google.common.collect.Range.all())) {
            return all();
        }
        return new com.google.common.collect.ImmutableRangeSet<>(com.google.common.collect.ImmutableList.of(range));
    }

    static <C extends java.lang.Comparable> com.google.common.collect.ImmutableRangeSet<C> all() {
        return ALL;
    }

    public static <C extends java.lang.Comparable> com.google.common.collect.ImmutableRangeSet<C> copyOf(com.google.common.collect.RangeSet<C> rangeSet) {
        com.google.common.base.Preconditions.checkNotNull(rangeSet);
        if (rangeSet.isEmpty()) {
            return of();
        }
        if (rangeSet.encloses(com.google.common.collect.Range.all())) {
            return all();
        }
        if (rangeSet instanceof com.google.common.collect.ImmutableRangeSet) {
            com.google.common.collect.ImmutableRangeSet<C> immutableRangeSet = (com.google.common.collect.ImmutableRangeSet) rangeSet;
            if (!immutableRangeSet.isPartialView()) {
                return immutableRangeSet;
            }
        }
        return new com.google.common.collect.ImmutableRangeSet<>(com.google.common.collect.ImmutableList.copyOf((java.util.Collection) rangeSet.asRanges()));
    }

    public static <C extends java.lang.Comparable<?>> com.google.common.collect.ImmutableRangeSet<C> copyOf(java.lang.Iterable<com.google.common.collect.Range<C>> ranges) {
        return new com.google.common.collect.ImmutableRangeSet.Builder().addAll(ranges).build();
    }

    public static <C extends java.lang.Comparable<?>> com.google.common.collect.ImmutableRangeSet<C> unionOf(java.lang.Iterable<com.google.common.collect.Range<C>> ranges) {
        return copyOf(com.google.common.collect.TreeRangeSet.create(ranges));
    }

    ImmutableRangeSet(com.google.common.collect.ImmutableList<com.google.common.collect.Range<C>> ranges) {
        this.ranges = ranges;
    }

    private ImmutableRangeSet(com.google.common.collect.ImmutableList<com.google.common.collect.Range<C>> ranges, com.google.common.collect.ImmutableRangeSet<C> complement) {
        this.ranges = ranges;
        this.complement = complement;
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public boolean intersects(com.google.common.collect.Range<C> otherRange) {
        int iBinarySearch = com.google.common.collect.SortedLists.binarySearch(this.ranges, com.google.common.collect.Range.lowerBoundFn(), otherRange.lowerBound, com.google.common.collect.Ordering.natural(), com.google.common.collect.SortedLists.KeyPresentBehavior.ANY_PRESENT, com.google.common.collect.SortedLists.KeyAbsentBehavior.NEXT_HIGHER);
        if (iBinarySearch < this.ranges.size() && this.ranges.get(iBinarySearch).isConnected(otherRange) && !this.ranges.get(iBinarySearch).intersection(otherRange).isEmpty()) {
            return true;
        }
        if (iBinarySearch > 0) {
            int i = iBinarySearch - 1;
            if (this.ranges.get(i).isConnected(otherRange) && !this.ranges.get(i).intersection(otherRange).isEmpty()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public boolean encloses(com.google.common.collect.Range<C> otherRange) {
        int iBinarySearch = com.google.common.collect.SortedLists.binarySearch(this.ranges, com.google.common.collect.Range.lowerBoundFn(), otherRange.lowerBound, com.google.common.collect.Ordering.natural(), com.google.common.collect.SortedLists.KeyPresentBehavior.ANY_PRESENT, com.google.common.collect.SortedLists.KeyAbsentBehavior.NEXT_LOWER);
        return iBinarySearch != -1 && this.ranges.get(iBinarySearch).encloses(otherRange);
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    @javax.annotation.CheckForNull
    public com.google.common.collect.Range<C> rangeContaining(C value) {
        int iBinarySearch = com.google.common.collect.SortedLists.binarySearch(this.ranges, com.google.common.collect.Range.lowerBoundFn(), com.google.common.collect.Cut.belowValue(value), com.google.common.collect.Ordering.natural(), com.google.common.collect.SortedLists.KeyPresentBehavior.ANY_PRESENT, com.google.common.collect.SortedLists.KeyAbsentBehavior.NEXT_LOWER);
        if (iBinarySearch == -1) {
            return null;
        }
        com.google.common.collect.Range<C> range = this.ranges.get(iBinarySearch);
        if (range.contains(value)) {
            return range;
        }
        return null;
    }

    @Override // com.google.common.collect.RangeSet
    public com.google.common.collect.Range<C> span() {
        if (this.ranges.isEmpty()) {
            throw new java.util.NoSuchElementException();
        }
        com.google.common.collect.Cut<C> cut = this.ranges.get(0).lowerBound;
        com.google.common.collect.ImmutableList<com.google.common.collect.Range<C>> immutableList = this.ranges;
        return com.google.common.collect.Range.create(cut, immutableList.get(immutableList.size() - 1).upperBound);
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public boolean isEmpty() {
        return this.ranges.isEmpty();
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    @java.lang.Deprecated
    public void add(com.google.common.collect.Range<C> range) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    @java.lang.Deprecated
    public void addAll(com.google.common.collect.RangeSet<C> other) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    @java.lang.Deprecated
    public void addAll(java.lang.Iterable<com.google.common.collect.Range<C>> other) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    @java.lang.Deprecated
    public void remove(com.google.common.collect.Range<C> range) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    @java.lang.Deprecated
    public void removeAll(com.google.common.collect.RangeSet<C> other) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    @java.lang.Deprecated
    public void removeAll(java.lang.Iterable<com.google.common.collect.Range<C>> other) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.RangeSet
    public com.google.common.collect.ImmutableSet<com.google.common.collect.Range<C>> asRanges() {
        if (this.ranges.isEmpty()) {
            return com.google.common.collect.ImmutableSet.of();
        }
        return new com.google.common.collect.RegularImmutableSortedSet(this.ranges, com.google.common.collect.Range.rangeLexOrdering());
    }

    @Override // com.google.common.collect.RangeSet
    public com.google.common.collect.ImmutableSet<com.google.common.collect.Range<C>> asDescendingSetOfRanges() {
        if (this.ranges.isEmpty()) {
            return com.google.common.collect.ImmutableSet.of();
        }
        return new com.google.common.collect.RegularImmutableSortedSet(this.ranges.reverse(), com.google.common.collect.Range.rangeLexOrdering().reverse());
    }

    private final class ComplementRanges extends com.google.common.collect.ImmutableList<com.google.common.collect.Range<C>> {
        private final boolean positiveBoundedAbove;
        private final boolean positiveBoundedBelow;
        private final int size;

        @Override // com.google.common.collect.ImmutableCollection
        boolean isPartialView() {
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        ComplementRanges() {
            boolean zHasLowerBound = ((com.google.common.collect.Range) com.google.common.collect.ImmutableRangeSet.this.ranges.get(0)).hasLowerBound();
            this.positiveBoundedBelow = zHasLowerBound;
            boolean zHasUpperBound = ((com.google.common.collect.Range) com.google.common.collect.Iterables.getLast(com.google.common.collect.ImmutableRangeSet.this.ranges)).hasUpperBound();
            this.positiveBoundedAbove = zHasUpperBound;
            int size = com.google.common.collect.ImmutableRangeSet.this.ranges.size() - 1;
            size = zHasLowerBound ? size + 1 : size;
            this.size = zHasUpperBound ? size + 1 : size;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.size;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public com.google.common.collect.Range<C> get(int i) {
            com.google.common.collect.Cut<C> cutBelowAll;
            com.google.common.collect.Cut<C> cutAboveAll;
            com.google.common.base.Preconditions.checkElementIndex(i, this.size);
            if (!this.positiveBoundedBelow) {
                cutBelowAll = ((com.google.common.collect.Range) com.google.common.collect.ImmutableRangeSet.this.ranges.get(i)).upperBound;
            } else {
                cutBelowAll = i == 0 ? com.google.common.collect.Cut.belowAll() : ((com.google.common.collect.Range) com.google.common.collect.ImmutableRangeSet.this.ranges.get(i - 1)).upperBound;
            }
            if (!this.positiveBoundedAbove || i != this.size - 1) {
                cutAboveAll = ((com.google.common.collect.Range) com.google.common.collect.ImmutableRangeSet.this.ranges.get(i + (!this.positiveBoundedBelow ? 1 : 0))).lowerBound;
            } else {
                cutAboveAll = com.google.common.collect.Cut.aboveAll();
            }
            return com.google.common.collect.Range.create(cutBelowAll, cutAboveAll);
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        java.lang.Object writeReplace() {
            return super.writeReplace();
        }
    }

    @Override // com.google.common.collect.RangeSet
    public com.google.common.collect.ImmutableRangeSet<C> complement() {
        com.google.common.collect.ImmutableRangeSet<C> immutableRangeSet = this.complement;
        if (immutableRangeSet != null) {
            return immutableRangeSet;
        }
        if (this.ranges.isEmpty()) {
            com.google.common.collect.ImmutableRangeSet<C> immutableRangeSetAll = all();
            this.complement = immutableRangeSetAll;
            return immutableRangeSetAll;
        }
        if (this.ranges.size() == 1 && this.ranges.get(0).equals(com.google.common.collect.Range.all())) {
            com.google.common.collect.ImmutableRangeSet<C> immutableRangeSetOf = of();
            this.complement = immutableRangeSetOf;
            return immutableRangeSetOf;
        }
        com.google.common.collect.ImmutableRangeSet<C> immutableRangeSet2 = new com.google.common.collect.ImmutableRangeSet<>(new com.google.common.collect.ImmutableRangeSet.ComplementRanges(), this);
        this.complement = immutableRangeSet2;
        return immutableRangeSet2;
    }

    public com.google.common.collect.ImmutableRangeSet<C> union(com.google.common.collect.RangeSet<C> other) {
        return unionOf(com.google.common.collect.Iterables.concat(asRanges(), other.asRanges()));
    }

    public com.google.common.collect.ImmutableRangeSet<C> intersection(com.google.common.collect.RangeSet<C> other) {
        com.google.common.collect.TreeRangeSet treeRangeSetCreate = com.google.common.collect.TreeRangeSet.create(this);
        treeRangeSetCreate.removeAll(other.complement());
        return copyOf(treeRangeSetCreate);
    }

    public com.google.common.collect.ImmutableRangeSet<C> difference(com.google.common.collect.RangeSet<C> other) {
        com.google.common.collect.TreeRangeSet treeRangeSetCreate = com.google.common.collect.TreeRangeSet.create(this);
        treeRangeSetCreate.removeAll(other);
        return copyOf(treeRangeSetCreate);
    }

    private com.google.common.collect.ImmutableList<com.google.common.collect.Range<C>> intersectRanges(final com.google.common.collect.Range<C> range) {
        int size;
        if (this.ranges.isEmpty() || range.isEmpty()) {
            return com.google.common.collect.ImmutableList.of();
        }
        if (range.encloses(span())) {
            return this.ranges;
        }
        final int iBinarySearch = range.hasLowerBound() ? com.google.common.collect.SortedLists.binarySearch(this.ranges, (com.google.common.base.Function<? super E, com.google.common.collect.Cut<C>>) com.google.common.collect.Range.upperBoundFn(), range.lowerBound, com.google.common.collect.SortedLists.KeyPresentBehavior.FIRST_AFTER, com.google.common.collect.SortedLists.KeyAbsentBehavior.NEXT_HIGHER) : 0;
        if (range.hasUpperBound()) {
            size = com.google.common.collect.SortedLists.binarySearch(this.ranges, (com.google.common.base.Function<? super E, com.google.common.collect.Cut<C>>) com.google.common.collect.Range.lowerBoundFn(), range.upperBound, com.google.common.collect.SortedLists.KeyPresentBehavior.FIRST_PRESENT, com.google.common.collect.SortedLists.KeyAbsentBehavior.NEXT_HIGHER);
        } else {
            size = this.ranges.size();
        }
        final int i = size - iBinarySearch;
        if (i == 0) {
            return com.google.common.collect.ImmutableList.of();
        }
        return (com.google.common.collect.ImmutableList<com.google.common.collect.Range<C>>) new com.google.common.collect.ImmutableList<com.google.common.collect.Range<C>>() { // from class: com.google.common.collect.ImmutableRangeSet.1
            @Override // com.google.common.collect.ImmutableCollection
            boolean isPartialView() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return i;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.List
            public com.google.common.collect.Range<C> get(int index) {
                com.google.common.base.Preconditions.checkElementIndex(index, i);
                return (index == 0 || index == i + (-1)) ? ((com.google.common.collect.Range) com.google.common.collect.ImmutableRangeSet.this.ranges.get(index + iBinarySearch)).intersection(range) : (com.google.common.collect.Range) com.google.common.collect.ImmutableRangeSet.this.ranges.get(index + iBinarySearch);
            }

            @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
            java.lang.Object writeReplace() {
                return super.writeReplace();
            }
        };
    }

    @Override // com.google.common.collect.RangeSet
    public com.google.common.collect.ImmutableRangeSet<C> subRangeSet(com.google.common.collect.Range<C> range) {
        if (!isEmpty()) {
            com.google.common.collect.Range<C> rangeSpan = span();
            if (range.encloses(rangeSpan)) {
                return this;
            }
            if (range.isConnected(rangeSpan)) {
                return new com.google.common.collect.ImmutableRangeSet<>(intersectRanges(range));
            }
        }
        return of();
    }

    public com.google.common.collect.ImmutableSortedSet<C> asSet(com.google.common.collect.DiscreteDomain<C> domain) {
        com.google.common.base.Preconditions.checkNotNull(domain);
        if (isEmpty()) {
            return com.google.common.collect.ImmutableSortedSet.of();
        }
        com.google.common.collect.Range<C> rangeCanonical = span().canonical(domain);
        if (!rangeCanonical.hasLowerBound()) {
            throw new java.lang.IllegalArgumentException("Neither the DiscreteDomain nor this range set are bounded below");
        }
        if (!rangeCanonical.hasUpperBound()) {
            try {
                domain.maxValue();
            } catch (java.util.NoSuchElementException unused) {
                throw new java.lang.IllegalArgumentException("Neither the DiscreteDomain nor this range set are bounded above");
            }
        }
        return new com.google.common.collect.ImmutableRangeSet.AsSet(domain);
    }

    private final class AsSet extends com.google.common.collect.ImmutableSortedSet<C> {
        private final com.google.common.collect.DiscreteDomain<C> domain;

        @javax.annotation.CheckForNull
        @com.google.errorprone.annotations.concurrent.LazyInit
        private transient java.lang.Integer size;

        AsSet(com.google.common.collect.DiscreteDomain<C> domain) {
            super(com.google.common.collect.Ordering.natural());
            this.domain = domain;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            java.lang.Integer numValueOf = this.size;
            if (numValueOf == null) {
                com.google.common.collect.UnmodifiableIterator it = com.google.common.collect.ImmutableRangeSet.this.ranges.iterator();
                long size = 0;
                while (it.hasNext()) {
                    size += (long) com.google.common.collect.ContiguousSet.create((com.google.common.collect.Range) it.next(), this.domain).size();
                    if (size >= 2147483647L) {
                        break;
                    }
                }
                numValueOf = java.lang.Integer.valueOf(com.google.common.primitives.Ints.saturatedCast(size));
                this.size = numValueOf;
            }
            return numValueOf.intValue();
        }

        @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public com.google.common.collect.UnmodifiableIterator<C> iterator() {
            return new com.google.common.collect.AbstractIterator<C>() { // from class: com.google.common.collect.ImmutableRangeSet.AsSet.1
                java.util.Iterator<C> elemItr = com.google.common.collect.Iterators.emptyIterator();
                final java.util.Iterator<com.google.common.collect.Range<C>> rangeItr;

                {
                    this.rangeItr = com.google.common.collect.ImmutableRangeSet.this.ranges.iterator();
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractIterator
                @javax.annotation.CheckForNull
                public C computeNext() {
                    while (!this.elemItr.hasNext()) {
                        if (this.rangeItr.hasNext()) {
                            this.elemItr = com.google.common.collect.ContiguousSet.create(this.rangeItr.next(), com.google.common.collect.ImmutableRangeSet.AsSet.this.domain).iterator();
                        } else {
                            return (C) endOfData();
                        }
                    }
                    return this.elemItr.next();
                }
            };
        }

        @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
        public com.google.common.collect.UnmodifiableIterator<C> descendingIterator() {
            return new com.google.common.collect.AbstractIterator<C>() { // from class: com.google.common.collect.ImmutableRangeSet.AsSet.2
                java.util.Iterator<C> elemItr = com.google.common.collect.Iterators.emptyIterator();
                final java.util.Iterator<com.google.common.collect.Range<C>> rangeItr;

                {
                    this.rangeItr = com.google.common.collect.ImmutableRangeSet.this.ranges.reverse().iterator();
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractIterator
                @javax.annotation.CheckForNull
                public C computeNext() {
                    while (!this.elemItr.hasNext()) {
                        if (this.rangeItr.hasNext()) {
                            this.elemItr = com.google.common.collect.ContiguousSet.create(this.rangeItr.next(), com.google.common.collect.ImmutableRangeSet.AsSet.this.domain).descendingIterator();
                        } else {
                            return (C) endOfData();
                        }
                    }
                    return this.elemItr.next();
                }
            };
        }

        com.google.common.collect.ImmutableSortedSet<C> subSet(com.google.common.collect.Range<C> range) {
            return com.google.common.collect.ImmutableRangeSet.this.subRangeSet((com.google.common.collect.Range) range).asSet(this.domain);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableSortedSet
        public com.google.common.collect.ImmutableSortedSet<C> headSetImpl(C toElement, boolean inclusive) {
            return subSet(com.google.common.collect.Range.upTo(toElement, com.google.common.collect.BoundType.forBoolean(inclusive)));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableSortedSet
        public com.google.common.collect.ImmutableSortedSet<C> subSetImpl(C fromElement, boolean fromInclusive, C toElement, boolean toInclusive) {
            if (!fromInclusive && !toInclusive && com.google.common.collect.Range.compareOrThrow(fromElement, toElement) == 0) {
                return com.google.common.collect.ImmutableSortedSet.of();
            }
            return subSet(com.google.common.collect.Range.range(fromElement, com.google.common.collect.BoundType.forBoolean(fromInclusive), toElement, com.google.common.collect.BoundType.forBoolean(toInclusive)));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableSortedSet
        public com.google.common.collect.ImmutableSortedSet<C> tailSetImpl(C fromElement, boolean inclusive) {
            return subSet(com.google.common.collect.Range.downTo(fromElement, com.google.common.collect.BoundType.forBoolean(inclusive)));
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object o) {
            if (o == null) {
                return false;
            }
            try {
                return com.google.common.collect.ImmutableRangeSet.this.contains((java.lang.Comparable) o);
            } catch (java.lang.ClassCastException unused) {
                return false;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableSortedSet
        int indexOf(@javax.annotation.CheckForNull java.lang.Object target) {
            if (!contains(target)) {
                return -1;
            }
            java.lang.Comparable comparable = (java.lang.Comparable) java.util.Objects.requireNonNull(target);
            com.google.common.collect.UnmodifiableIterator it = com.google.common.collect.ImmutableRangeSet.this.ranges.iterator();
            long size = 0;
            while (it.hasNext()) {
                com.google.common.collect.Range range = (com.google.common.collect.Range) it.next();
                if (range.contains(comparable)) {
                    return com.google.common.primitives.Ints.saturatedCast(size + ((long) com.google.common.collect.ContiguousSet.create(range, this.domain).indexOf(comparable)));
                }
                size += (long) com.google.common.collect.ContiguousSet.create(range, this.domain).size();
            }
            throw new java.lang.AssertionError("impossible");
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        com.google.common.collect.ImmutableSortedSet<C> createDescendingSet() {
            return new com.google.common.collect.DescendingImmutableSortedSet(this);
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean isPartialView() {
            return com.google.common.collect.ImmutableRangeSet.this.ranges.isPartialView();
        }

        @Override // java.util.AbstractCollection
        public java.lang.String toString() {
            return com.google.common.collect.ImmutableRangeSet.this.ranges.toString();
        }

        @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        java.lang.Object writeReplace() {
            return new com.google.common.collect.ImmutableRangeSet.AsSetSerializedForm(com.google.common.collect.ImmutableRangeSet.this.ranges, this.domain);
        }

        private void readObject(java.io.ObjectInputStream stream) throws java.io.InvalidObjectException {
            throw new java.io.InvalidObjectException("Use SerializedForm");
        }
    }

    private static class AsSetSerializedForm<C extends java.lang.Comparable> implements java.io.Serializable {
        private final com.google.common.collect.DiscreteDomain<C> domain;
        private final com.google.common.collect.ImmutableList<com.google.common.collect.Range<C>> ranges;

        AsSetSerializedForm(com.google.common.collect.ImmutableList<com.google.common.collect.Range<C>> ranges, com.google.common.collect.DiscreteDomain<C> domain) {
            this.ranges = ranges;
            this.domain = domain;
        }

        java.lang.Object readResolve() {
            return new com.google.common.collect.ImmutableRangeSet(this.ranges).asSet(this.domain);
        }
    }

    boolean isPartialView() {
        return this.ranges.isPartialView();
    }

    public static <C extends java.lang.Comparable<?>> com.google.common.collect.ImmutableRangeSet.Builder<C> builder() {
        return new com.google.common.collect.ImmutableRangeSet.Builder<>();
    }

    public static class Builder<C extends java.lang.Comparable<?>> {
        private final java.util.List<com.google.common.collect.Range<C>> ranges = com.google.common.collect.Lists.newArrayList();

        public com.google.common.collect.ImmutableRangeSet.Builder<C> add(com.google.common.collect.Range<C> range) {
            com.google.common.base.Preconditions.checkArgument(!range.isEmpty(), "range must not be empty, but was %s", range);
            this.ranges.add(range);
            return this;
        }

        public com.google.common.collect.ImmutableRangeSet.Builder<C> addAll(com.google.common.collect.RangeSet<C> ranges) {
            return addAll(ranges.asRanges());
        }

        public com.google.common.collect.ImmutableRangeSet.Builder<C> addAll(java.lang.Iterable<com.google.common.collect.Range<C>> ranges) {
            java.util.Iterator<com.google.common.collect.Range<C>> it = ranges.iterator();
            while (it.hasNext()) {
                add(it.next());
            }
            return this;
        }

        com.google.common.collect.ImmutableRangeSet.Builder<C> combine(com.google.common.collect.ImmutableRangeSet.Builder<C> builder) {
            addAll(builder.ranges);
            return this;
        }

        public com.google.common.collect.ImmutableRangeSet<C> build() {
            com.google.common.collect.ImmutableList.Builder builder = new com.google.common.collect.ImmutableList.Builder(this.ranges.size());
            java.util.Collections.sort(this.ranges, com.google.common.collect.Range.rangeLexOrdering());
            com.google.common.collect.PeekingIterator peekingIterator = com.google.common.collect.Iterators.peekingIterator(this.ranges.iterator());
            while (peekingIterator.hasNext()) {
                com.google.common.collect.Range rangeSpan = (com.google.common.collect.Range) peekingIterator.next();
                while (peekingIterator.hasNext()) {
                    com.google.common.collect.Range<C> range = (com.google.common.collect.Range) peekingIterator.peek();
                    if (!rangeSpan.isConnected(range)) {
                        break;
                    }
                    com.google.common.base.Preconditions.checkArgument(rangeSpan.intersection(range).isEmpty(), "Overlapping ranges not permitted but found %s overlapping %s", rangeSpan, range);
                    rangeSpan = rangeSpan.span((com.google.common.collect.Range) peekingIterator.next());
                }
                builder.add(rangeSpan);
            }
            com.google.common.collect.ImmutableList immutableListBuild = builder.build();
            if (immutableListBuild.isEmpty()) {
                return com.google.common.collect.ImmutableRangeSet.of();
            }
            if (immutableListBuild.size() == 1 && ((com.google.common.collect.Range) com.google.common.collect.Iterables.getOnlyElement(immutableListBuild)).equals(com.google.common.collect.Range.all())) {
                return com.google.common.collect.ImmutableRangeSet.all();
            }
            return new com.google.common.collect.ImmutableRangeSet<>(immutableListBuild);
        }
    }

    private static final class SerializedForm<C extends java.lang.Comparable> implements java.io.Serializable {
        private final com.google.common.collect.ImmutableList<com.google.common.collect.Range<C>> ranges;

        SerializedForm(com.google.common.collect.ImmutableList<com.google.common.collect.Range<C>> ranges) {
            this.ranges = ranges;
        }

        java.lang.Object readResolve() {
            if (this.ranges.isEmpty()) {
                return com.google.common.collect.ImmutableRangeSet.of();
            }
            if (this.ranges.equals(com.google.common.collect.ImmutableList.of(com.google.common.collect.Range.all()))) {
                return com.google.common.collect.ImmutableRangeSet.all();
            }
            return new com.google.common.collect.ImmutableRangeSet(this.ranges);
        }
    }

    java.lang.Object writeReplace() {
        return new com.google.common.collect.ImmutableRangeSet.SerializedForm(this.ranges);
    }

    private void readObject(java.io.ObjectInputStream stream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use SerializedForm");
    }
}
