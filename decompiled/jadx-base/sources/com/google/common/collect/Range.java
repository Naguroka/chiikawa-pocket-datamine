package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.errorprone.annotations.Immutable(containerOf = {"C"})
@com.google.common.collect.ElementTypesAreNonnullByDefault
public final class Range<C extends java.lang.Comparable> extends com.google.common.collect.RangeGwtSerializationDependencies implements com.google.common.base.Predicate<C>, java.io.Serializable {
    private static final com.google.common.collect.Range<java.lang.Comparable> ALL = new com.google.common.collect.Range<>(com.google.common.collect.Cut.belowAll(), com.google.common.collect.Cut.aboveAll());
    private static final long serialVersionUID = 0;
    final com.google.common.collect.Cut<C> lowerBound;
    final com.google.common.collect.Cut<C> upperBound;

    static class LowerBoundFn implements com.google.common.base.Function<com.google.common.collect.Range, com.google.common.collect.Cut> {
        static final com.google.common.collect.Range.LowerBoundFn INSTANCE = new com.google.common.collect.Range.LowerBoundFn();

        LowerBoundFn() {
        }

        @Override // com.google.common.base.Function
        public com.google.common.collect.Cut apply(com.google.common.collect.Range range) {
            return range.lowerBound;
        }
    }

    static class UpperBoundFn implements com.google.common.base.Function<com.google.common.collect.Range, com.google.common.collect.Cut> {
        static final com.google.common.collect.Range.UpperBoundFn INSTANCE = new com.google.common.collect.Range.UpperBoundFn();

        UpperBoundFn() {
        }

        @Override // com.google.common.base.Function
        public com.google.common.collect.Cut apply(com.google.common.collect.Range range) {
            return range.upperBound;
        }
    }

    static <C extends java.lang.Comparable<?>> com.google.common.base.Function<com.google.common.collect.Range<C>, com.google.common.collect.Cut<C>> lowerBoundFn() {
        return com.google.common.collect.Range.LowerBoundFn.INSTANCE;
    }

    static <C extends java.lang.Comparable<?>> com.google.common.base.Function<com.google.common.collect.Range<C>, com.google.common.collect.Cut<C>> upperBoundFn() {
        return com.google.common.collect.Range.UpperBoundFn.INSTANCE;
    }

    static <C extends java.lang.Comparable<?>> com.google.common.collect.Ordering<com.google.common.collect.Range<C>> rangeLexOrdering() {
        return (com.google.common.collect.Ordering<com.google.common.collect.Range<C>>) com.google.common.collect.Range.RangeLexOrdering.INSTANCE;
    }

    static <C extends java.lang.Comparable<?>> com.google.common.collect.Range<C> create(com.google.common.collect.Cut<C> lowerBound, com.google.common.collect.Cut<C> upperBound) {
        return new com.google.common.collect.Range<>(lowerBound, upperBound);
    }

    public static <C extends java.lang.Comparable<?>> com.google.common.collect.Range<C> open(C lower, C upper) {
        return create(com.google.common.collect.Cut.aboveValue(lower), com.google.common.collect.Cut.belowValue(upper));
    }

    public static <C extends java.lang.Comparable<?>> com.google.common.collect.Range<C> closed(C lower, C upper) {
        return create(com.google.common.collect.Cut.belowValue(lower), com.google.common.collect.Cut.aboveValue(upper));
    }

    public static <C extends java.lang.Comparable<?>> com.google.common.collect.Range<C> closedOpen(C lower, C upper) {
        return create(com.google.common.collect.Cut.belowValue(lower), com.google.common.collect.Cut.belowValue(upper));
    }

    public static <C extends java.lang.Comparable<?>> com.google.common.collect.Range<C> openClosed(C lower, C upper) {
        return create(com.google.common.collect.Cut.aboveValue(lower), com.google.common.collect.Cut.aboveValue(upper));
    }

    public static <C extends java.lang.Comparable<?>> com.google.common.collect.Range<C> range(C lower, com.google.common.collect.BoundType lowerType, C upper, com.google.common.collect.BoundType upperType) {
        com.google.common.base.Preconditions.checkNotNull(lowerType);
        com.google.common.base.Preconditions.checkNotNull(upperType);
        return create(lowerType == com.google.common.collect.BoundType.OPEN ? com.google.common.collect.Cut.aboveValue(lower) : com.google.common.collect.Cut.belowValue(lower), upperType == com.google.common.collect.BoundType.OPEN ? com.google.common.collect.Cut.belowValue(upper) : com.google.common.collect.Cut.aboveValue(upper));
    }

    public static <C extends java.lang.Comparable<?>> com.google.common.collect.Range<C> lessThan(C endpoint) {
        return create(com.google.common.collect.Cut.belowAll(), com.google.common.collect.Cut.belowValue(endpoint));
    }

    public static <C extends java.lang.Comparable<?>> com.google.common.collect.Range<C> atMost(C endpoint) {
        return create(com.google.common.collect.Cut.belowAll(), com.google.common.collect.Cut.aboveValue(endpoint));
    }

    /* JADX INFO: renamed from: com.google.common.collect.Range$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$common$collect$BoundType;

        static {
            int[] iArr = new int[com.google.common.collect.BoundType.values().length];
            $SwitchMap$com$google$common$collect$BoundType = iArr;
            try {
                iArr[com.google.common.collect.BoundType.OPEN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$common$collect$BoundType[com.google.common.collect.BoundType.CLOSED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    public static <C extends java.lang.Comparable<?>> com.google.common.collect.Range<C> upTo(C endpoint, com.google.common.collect.BoundType boundType) {
        int i = com.google.common.collect.Range.AnonymousClass1.$SwitchMap$com$google$common$collect$BoundType[boundType.ordinal()];
        if (i == 1) {
            return lessThan(endpoint);
        }
        if (i == 2) {
            return atMost(endpoint);
        }
        throw new java.lang.AssertionError();
    }

    public static <C extends java.lang.Comparable<?>> com.google.common.collect.Range<C> greaterThan(C endpoint) {
        return create(com.google.common.collect.Cut.aboveValue(endpoint), com.google.common.collect.Cut.aboveAll());
    }

    public static <C extends java.lang.Comparable<?>> com.google.common.collect.Range<C> atLeast(C endpoint) {
        return create(com.google.common.collect.Cut.belowValue(endpoint), com.google.common.collect.Cut.aboveAll());
    }

    public static <C extends java.lang.Comparable<?>> com.google.common.collect.Range<C> downTo(C endpoint, com.google.common.collect.BoundType boundType) {
        int i = com.google.common.collect.Range.AnonymousClass1.$SwitchMap$com$google$common$collect$BoundType[boundType.ordinal()];
        if (i == 1) {
            return greaterThan(endpoint);
        }
        if (i == 2) {
            return atLeast(endpoint);
        }
        throw new java.lang.AssertionError();
    }

    public static <C extends java.lang.Comparable<?>> com.google.common.collect.Range<C> all() {
        return (com.google.common.collect.Range<C>) ALL;
    }

    public static <C extends java.lang.Comparable<?>> com.google.common.collect.Range<C> singleton(C value) {
        return closed(value, value);
    }

    public static <C extends java.lang.Comparable<?>> com.google.common.collect.Range<C> encloseAll(java.lang.Iterable<C> values) {
        com.google.common.base.Preconditions.checkNotNull(values);
        if (values instanceof java.util.SortedSet) {
            java.util.SortedSet sortedSet = (java.util.SortedSet) values;
            java.util.Comparator comparator = sortedSet.comparator();
            if (com.google.common.collect.Ordering.natural().equals(comparator) || comparator == null) {
                return closed((java.lang.Comparable) sortedSet.first(), (java.lang.Comparable) sortedSet.last());
            }
        }
        java.util.Iterator<C> it = values.iterator();
        java.lang.Comparable comparable = (java.lang.Comparable) com.google.common.base.Preconditions.checkNotNull(it.next());
        java.lang.Comparable comparable2 = comparable;
        while (it.hasNext()) {
            java.lang.Comparable comparable3 = (java.lang.Comparable) com.google.common.base.Preconditions.checkNotNull(it.next());
            comparable = (java.lang.Comparable) com.google.common.collect.Ordering.natural().min(comparable, comparable3);
            comparable2 = (java.lang.Comparable) com.google.common.collect.Ordering.natural().max(comparable2, comparable3);
        }
        return closed(comparable, comparable2);
    }

    private Range(com.google.common.collect.Cut<C> lowerBound, com.google.common.collect.Cut<C> upperBound) {
        this.lowerBound = (com.google.common.collect.Cut) com.google.common.base.Preconditions.checkNotNull(lowerBound);
        this.upperBound = (com.google.common.collect.Cut) com.google.common.base.Preconditions.checkNotNull(upperBound);
        if (lowerBound.compareTo((com.google.common.collect.Cut) upperBound) > 0 || lowerBound == com.google.common.collect.Cut.aboveAll() || upperBound == com.google.common.collect.Cut.belowAll()) {
            throw new java.lang.IllegalArgumentException("Invalid range: " + toString(lowerBound, upperBound));
        }
    }

    public boolean hasLowerBound() {
        return this.lowerBound != com.google.common.collect.Cut.belowAll();
    }

    public C lowerEndpoint() {
        return (C) this.lowerBound.endpoint();
    }

    public com.google.common.collect.BoundType lowerBoundType() {
        return this.lowerBound.typeAsLowerBound();
    }

    public boolean hasUpperBound() {
        return this.upperBound != com.google.common.collect.Cut.aboveAll();
    }

    public C upperEndpoint() {
        return (C) this.upperBound.endpoint();
    }

    public com.google.common.collect.BoundType upperBoundType() {
        return this.upperBound.typeAsUpperBound();
    }

    public boolean isEmpty() {
        return this.lowerBound.equals(this.upperBound);
    }

    public boolean contains(C value) {
        com.google.common.base.Preconditions.checkNotNull(value);
        return this.lowerBound.isLessThan(value) && !this.upperBound.isLessThan(value);
    }

    @Override // com.google.common.base.Predicate
    @java.lang.Deprecated
    public boolean apply(C input) {
        return contains(input);
    }

    public boolean containsAll(java.lang.Iterable<? extends C> values) {
        if (com.google.common.collect.Iterables.isEmpty(values)) {
            return true;
        }
        if (values instanceof java.util.SortedSet) {
            java.util.SortedSet sortedSet = (java.util.SortedSet) values;
            java.util.Comparator comparator = sortedSet.comparator();
            if (com.google.common.collect.Ordering.natural().equals(comparator) || comparator == null) {
                return contains((java.lang.Comparable) sortedSet.first()) && contains((java.lang.Comparable) sortedSet.last());
            }
        }
        java.util.Iterator<? extends C> it = values.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean encloses(com.google.common.collect.Range<C> other) {
        return this.lowerBound.compareTo((com.google.common.collect.Cut) other.lowerBound) <= 0 && this.upperBound.compareTo((com.google.common.collect.Cut) other.upperBound) >= 0;
    }

    public boolean isConnected(com.google.common.collect.Range<C> other) {
        return this.lowerBound.compareTo((com.google.common.collect.Cut) other.upperBound) <= 0 && other.lowerBound.compareTo((com.google.common.collect.Cut) this.upperBound) <= 0;
    }

    public com.google.common.collect.Range<C> intersection(com.google.common.collect.Range<C> connectedRange) {
        int iCompareTo = this.lowerBound.compareTo((com.google.common.collect.Cut) connectedRange.lowerBound);
        int iCompareTo2 = this.upperBound.compareTo((com.google.common.collect.Cut) connectedRange.upperBound);
        if (iCompareTo >= 0 && iCompareTo2 <= 0) {
            return this;
        }
        if (iCompareTo <= 0 && iCompareTo2 >= 0) {
            return connectedRange;
        }
        com.google.common.collect.Cut<C> cut = iCompareTo >= 0 ? this.lowerBound : connectedRange.lowerBound;
        com.google.common.collect.Cut<C> cut2 = iCompareTo2 <= 0 ? this.upperBound : connectedRange.upperBound;
        com.google.common.base.Preconditions.checkArgument(cut.compareTo((com.google.common.collect.Cut) cut2) <= 0, "intersection is undefined for disconnected ranges %s and %s", this, connectedRange);
        return create(cut, cut2);
    }

    public com.google.common.collect.Range<C> gap(com.google.common.collect.Range<C> otherRange) {
        if (this.lowerBound.compareTo((com.google.common.collect.Cut) otherRange.upperBound) < 0 && otherRange.lowerBound.compareTo((com.google.common.collect.Cut) this.upperBound) < 0) {
            throw new java.lang.IllegalArgumentException("Ranges have a nonempty intersection: " + this + ", " + otherRange);
        }
        boolean z = this.lowerBound.compareTo((com.google.common.collect.Cut) otherRange.lowerBound) < 0;
        com.google.common.collect.Range<C> range = z ? this : otherRange;
        if (!z) {
            otherRange = this;
        }
        return create(range.upperBound, otherRange.lowerBound);
    }

    public com.google.common.collect.Range<C> span(com.google.common.collect.Range<C> other) {
        int iCompareTo = this.lowerBound.compareTo((com.google.common.collect.Cut) other.lowerBound);
        int iCompareTo2 = this.upperBound.compareTo((com.google.common.collect.Cut) other.upperBound);
        if (iCompareTo <= 0 && iCompareTo2 >= 0) {
            return this;
        }
        if (iCompareTo < 0 || iCompareTo2 > 0) {
            return create(iCompareTo <= 0 ? this.lowerBound : other.lowerBound, iCompareTo2 >= 0 ? this.upperBound : other.upperBound);
        }
        return other;
    }

    public com.google.common.collect.Range<C> canonical(com.google.common.collect.DiscreteDomain<C> domain) {
        com.google.common.base.Preconditions.checkNotNull(domain);
        com.google.common.collect.Cut<C> cutCanonical = this.lowerBound.canonical(domain);
        com.google.common.collect.Cut<C> cutCanonical2 = this.upperBound.canonical(domain);
        return (cutCanonical == this.lowerBound && cutCanonical2 == this.upperBound) ? this : create(cutCanonical, cutCanonical2);
    }

    @Override // com.google.common.base.Predicate
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
        if (!(object instanceof com.google.common.collect.Range)) {
            return false;
        }
        com.google.common.collect.Range range = (com.google.common.collect.Range) object;
        return this.lowerBound.equals(range.lowerBound) && this.upperBound.equals(range.upperBound);
    }

    public int hashCode() {
        return (this.lowerBound.hashCode() * 31) + this.upperBound.hashCode();
    }

    public java.lang.String toString() {
        return toString(this.lowerBound, this.upperBound);
    }

    private static java.lang.String toString(com.google.common.collect.Cut<?> lowerBound, com.google.common.collect.Cut<?> upperBound) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(16);
        lowerBound.describeAsLowerBound(sb);
        sb.append("..");
        upperBound.describeAsUpperBound(sb);
        return sb.toString();
    }

    java.lang.Object readResolve() {
        return equals(ALL) ? all() : this;
    }

    static int compareOrThrow(java.lang.Comparable left, java.lang.Comparable right) {
        return left.compareTo(right);
    }

    private static class RangeLexOrdering extends com.google.common.collect.Ordering<com.google.common.collect.Range<?>> implements java.io.Serializable {
        static final com.google.common.collect.Ordering<com.google.common.collect.Range<?>> INSTANCE = new com.google.common.collect.Range.RangeLexOrdering();
        private static final long serialVersionUID = 0;

        private RangeLexOrdering() {
        }

        @Override // com.google.common.collect.Ordering, java.util.Comparator
        public int compare(com.google.common.collect.Range<?> left, com.google.common.collect.Range<?> right) {
            return com.google.common.collect.ComparisonChain.start().compare(left.lowerBound, right.lowerBound).compare(left.upperBound, right.upperBound).result();
        }
    }
}
