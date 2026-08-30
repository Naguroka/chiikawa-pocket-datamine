package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class RegularContiguousSet<C extends java.lang.Comparable> extends com.google.common.collect.ContiguousSet<C> {
    private static final long serialVersionUID = 0;
    private final com.google.common.collect.Range<C> range;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection
    boolean isPartialView() {
        return false;
    }

    RegularContiguousSet(com.google.common.collect.Range<C> range, com.google.common.collect.DiscreteDomain<C> domain) {
        super(domain);
        this.range = range;
    }

    private com.google.common.collect.ContiguousSet<C> intersectionInCurrentDomain(com.google.common.collect.Range<C> other) {
        if (this.range.isConnected(other)) {
            return com.google.common.collect.ContiguousSet.create(this.range.intersection(other), this.domain);
        }
        return new com.google.common.collect.EmptyContiguousSet(this.domain);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    public com.google.common.collect.ContiguousSet<C> headSetImpl(C toElement, boolean inclusive) {
        return intersectionInCurrentDomain(com.google.common.collect.Range.upTo(toElement, com.google.common.collect.BoundType.forBoolean(inclusive)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    public com.google.common.collect.ContiguousSet<C> subSetImpl(C fromElement, boolean fromInclusive, C toElement, boolean toInclusive) {
        if (fromElement.compareTo(toElement) == 0 && !fromInclusive && !toInclusive) {
            return new com.google.common.collect.EmptyContiguousSet(this.domain);
        }
        return intersectionInCurrentDomain(com.google.common.collect.Range.range(fromElement, com.google.common.collect.BoundType.forBoolean(fromInclusive), toElement, com.google.common.collect.BoundType.forBoolean(toInclusive)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    public com.google.common.collect.ContiguousSet<C> tailSetImpl(C fromElement, boolean inclusive) {
        return intersectionInCurrentDomain(com.google.common.collect.Range.downTo(fromElement, com.google.common.collect.BoundType.forBoolean(inclusive)));
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    int indexOf(@javax.annotation.CheckForNull java.lang.Object target) {
        if (contains(target)) {
            return (int) this.domain.distance(first(), (java.lang.Comparable) java.util.Objects.requireNonNull(target));
        }
        return -1;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public com.google.common.collect.UnmodifiableIterator<C> iterator() {
        return new com.google.common.collect.AbstractSequentialIterator<C>(first()) { // from class: com.google.common.collect.RegularContiguousSet.1
            final C last;

            {
                this.last = (C) com.google.common.collect.RegularContiguousSet.this.last();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.AbstractSequentialIterator
            @javax.annotation.CheckForNull
            public C computeNext(C c) {
                if (com.google.common.collect.RegularContiguousSet.equalsOrThrow(c, this.last)) {
                    return null;
                }
                return (C) com.google.common.collect.RegularContiguousSet.this.domain.next(c);
            }
        };
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public com.google.common.collect.UnmodifiableIterator<C> descendingIterator() {
        return new com.google.common.collect.AbstractSequentialIterator<C>(last()) { // from class: com.google.common.collect.RegularContiguousSet.2
            final C first;

            {
                this.first = (C) com.google.common.collect.RegularContiguousSet.this.first();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.AbstractSequentialIterator
            @javax.annotation.CheckForNull
            public C computeNext(C c) {
                if (com.google.common.collect.RegularContiguousSet.equalsOrThrow(c, this.first)) {
                    return null;
                }
                return (C) com.google.common.collect.RegularContiguousSet.this.domain.previous(c);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean equalsOrThrow(java.lang.Comparable<?> left, @javax.annotation.CheckForNull java.lang.Comparable<?> right) {
        return right != null && com.google.common.collect.Range.compareOrThrow(left, right) == 0;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public C first() {
        return (C) java.util.Objects.requireNonNull(this.range.lowerBound.leastValueAbove(this.domain));
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public C last() {
        return (C) java.util.Objects.requireNonNull(this.range.upperBound.greatestValueBelow(this.domain));
    }

    @Override // com.google.common.collect.ImmutableSet
    com.google.common.collect.ImmutableList<C> createAsList() {
        if (this.domain.supportsFastOffset) {
            return new com.google.common.collect.ImmutableAsList<C>() { // from class: com.google.common.collect.RegularContiguousSet.3
                /* JADX INFO: Access modifiers changed from: package-private */
                @Override // com.google.common.collect.ImmutableAsList
                public com.google.common.collect.ImmutableSortedSet<C> delegateCollection() {
                    return com.google.common.collect.RegularContiguousSet.this;
                }

                @Override // java.util.List
                public C get(int i) {
                    com.google.common.base.Preconditions.checkElementIndex(i, size());
                    return (C) com.google.common.collect.RegularContiguousSet.this.domain.offset(com.google.common.collect.RegularContiguousSet.this.first(), i);
                }

                @Override // com.google.common.collect.ImmutableAsList, com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
                java.lang.Object writeReplace() {
                    return super.writeReplace();
                }
            };
        }
        return super.createAsList();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        long jDistance = this.domain.distance(first(), last());
        if (jDistance >= 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return ((int) jDistance) + 1;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@javax.annotation.CheckForNull java.lang.Object object) {
        if (object == null) {
            return false;
        }
        try {
            return this.range.contains((java.lang.Comparable) object);
        } catch (java.lang.ClassCastException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(java.util.Collection<?> targets) {
        return com.google.common.collect.Collections2.containsAllImpl(this, targets);
    }

    @Override // com.google.common.collect.ContiguousSet
    public com.google.common.collect.ContiguousSet<C> intersection(com.google.common.collect.ContiguousSet<C> other) {
        com.google.common.base.Preconditions.checkNotNull(other);
        com.google.common.base.Preconditions.checkArgument(this.domain.equals(other.domain));
        if (other.isEmpty()) {
            return other;
        }
        java.lang.Comparable comparable = (java.lang.Comparable) com.google.common.collect.Ordering.natural().max(first(), other.first());
        java.lang.Comparable comparable2 = (java.lang.Comparable) com.google.common.collect.Ordering.natural().min(last(), other.last());
        if (comparable.compareTo(comparable2) <= 0) {
            return com.google.common.collect.ContiguousSet.create(com.google.common.collect.Range.closed(comparable, comparable2), this.domain);
        }
        return new com.google.common.collect.EmptyContiguousSet(this.domain);
    }

    @Override // com.google.common.collect.ContiguousSet
    public com.google.common.collect.Range<C> range() {
        return range(com.google.common.collect.BoundType.CLOSED, com.google.common.collect.BoundType.CLOSED);
    }

    @Override // com.google.common.collect.ContiguousSet
    public com.google.common.collect.Range<C> range(com.google.common.collect.BoundType lowerBoundType, com.google.common.collect.BoundType upperBoundType) {
        return com.google.common.collect.Range.create(this.range.lowerBound.withLowerBoundType(lowerBoundType, this.domain), this.range.upperBound.withUpperBoundType(upperBoundType, this.domain));
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof com.google.common.collect.RegularContiguousSet) {
            com.google.common.collect.RegularContiguousSet regularContiguousSet = (com.google.common.collect.RegularContiguousSet) object;
            if (this.domain.equals(regularContiguousSet.domain)) {
                return first().equals(regularContiguousSet.first()) && last().equals(regularContiguousSet.last());
            }
        }
        return super.equals(object);
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
        return com.google.common.collect.Sets.hashCodeImpl(this);
    }

    private static final class SerializedForm<C extends java.lang.Comparable> implements java.io.Serializable {
        final com.google.common.collect.DiscreteDomain<C> domain;
        final com.google.common.collect.Range<C> range;

        private SerializedForm(com.google.common.collect.Range<C> range, com.google.common.collect.DiscreteDomain<C> domain) {
            this.range = range;
            this.domain = domain;
        }

        private java.lang.Object readResolve() {
            return new com.google.common.collect.RegularContiguousSet(this.range, this.domain);
        }
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    java.lang.Object writeReplace() {
        return new com.google.common.collect.RegularContiguousSet.SerializedForm(this.range, this.domain);
    }

    private void readObject(java.io.ObjectInputStream stream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use SerializedForm");
    }
}
