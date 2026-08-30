package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ImmutableSortedSet<E> extends com.google.common.collect.ImmutableSet<E> implements java.util.NavigableSet<E>, com.google.common.collect.SortedIterable<E> {
    private static final long serialVersionUID = 912559;
    final transient java.util.Comparator<? super E> comparator;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    transient com.google.common.collect.ImmutableSortedSet<E> descendingSet;

    abstract com.google.common.collect.ImmutableSortedSet<E> createDescendingSet();

    @Override // java.util.NavigableSet
    public abstract com.google.common.collect.UnmodifiableIterator<E> descendingIterator();

    abstract com.google.common.collect.ImmutableSortedSet<E> headSetImpl(E toElement, boolean inclusive);

    abstract int indexOf(@javax.annotation.CheckForNull java.lang.Object target);

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public abstract com.google.common.collect.UnmodifiableIterator<E> iterator();

    abstract com.google.common.collect.ImmutableSortedSet<E> subSetImpl(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive);

    abstract com.google.common.collect.ImmutableSortedSet<E> tailSetImpl(E fromElement, boolean inclusive);

    static <E> java.util.stream.Collector<E, ?, com.google.common.collect.ImmutableSortedSet<E>> toImmutableSortedSet(java.util.Comparator<? super E> comparator) {
        return com.google.common.collect.CollectCollectors.toImmutableSortedSet(comparator);
    }

    static <E> com.google.common.collect.RegularImmutableSortedSet<E> emptySet(java.util.Comparator<? super E> comparator) {
        if (com.google.common.collect.Ordering.natural().equals(comparator)) {
            return (com.google.common.collect.RegularImmutableSortedSet<E>) com.google.common.collect.RegularImmutableSortedSet.NATURAL_EMPTY_SET;
        }
        return new com.google.common.collect.RegularImmutableSortedSet<>(com.google.common.collect.ImmutableList.of(), comparator);
    }

    public static <E> com.google.common.collect.ImmutableSortedSet<E> of() {
        return com.google.common.collect.RegularImmutableSortedSet.NATURAL_EMPTY_SET;
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    public static com.google.common.collect.ImmutableSortedSet of(java.lang.Comparable element) {
        return new com.google.common.collect.RegularImmutableSortedSet(com.google.common.collect.ImmutableList.of(element), com.google.common.collect.Ordering.natural());
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    public static com.google.common.collect.ImmutableSortedSet of(java.lang.Comparable e1, java.lang.Comparable e2) {
        return construct(com.google.common.collect.Ordering.natural(), 2, e1, e2);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    public static com.google.common.collect.ImmutableSortedSet of(java.lang.Comparable e1, java.lang.Comparable e2, java.lang.Comparable e3) {
        return construct(com.google.common.collect.Ordering.natural(), 3, e1, e2, e3);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    public static com.google.common.collect.ImmutableSortedSet of(java.lang.Comparable e1, java.lang.Comparable e2, java.lang.Comparable e3, java.lang.Comparable e4) {
        return construct(com.google.common.collect.Ordering.natural(), 4, e1, e2, e3, e4);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    public static com.google.common.collect.ImmutableSortedSet of(java.lang.Comparable e1, java.lang.Comparable e2, java.lang.Comparable e3, java.lang.Comparable e4, java.lang.Comparable e5) {
        return construct(com.google.common.collect.Ordering.natural(), 5, e1, e2, e3, e4, e5);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;TE;[TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    public static com.google.common.collect.ImmutableSortedSet of(java.lang.Comparable e1, java.lang.Comparable e2, java.lang.Comparable e3, java.lang.Comparable e4, java.lang.Comparable e5, java.lang.Comparable e6, java.lang.Comparable... remaining) {
        int length = remaining.length + 6;
        java.lang.Comparable[] comparableArr = new java.lang.Comparable[length];
        comparableArr[0] = e1;
        comparableArr[1] = e2;
        comparableArr[2] = e3;
        comparableArr[3] = e4;
        comparableArr[4] = e5;
        comparableArr[5] = e6;
        java.lang.System.arraycopy(remaining, 0, comparableArr, 6, remaining.length);
        return construct(com.google.common.collect.Ordering.natural(), length, comparableArr);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>([TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    public static com.google.common.collect.ImmutableSortedSet copyOf(java.lang.Comparable[] elements) {
        return construct(com.google.common.collect.Ordering.natural(), elements.length, (java.lang.Comparable[]) elements.clone());
    }

    public static <E> com.google.common.collect.ImmutableSortedSet<E> copyOf(java.lang.Iterable<? extends E> elements) {
        return copyOf(com.google.common.collect.Ordering.natural(), elements);
    }

    public static <E> com.google.common.collect.ImmutableSortedSet<E> copyOf(java.util.Collection<? extends E> elements) {
        return copyOf((java.util.Comparator) com.google.common.collect.Ordering.natural(), (java.util.Collection) elements);
    }

    public static <E> com.google.common.collect.ImmutableSortedSet<E> copyOf(java.util.Iterator<? extends E> elements) {
        return copyOf(com.google.common.collect.Ordering.natural(), elements);
    }

    public static <E> com.google.common.collect.ImmutableSortedSet<E> copyOf(java.util.Comparator<? super E> comparator, java.util.Iterator<? extends E> elements) {
        return new com.google.common.collect.ImmutableSortedSet.Builder(comparator).addAll((java.util.Iterator) elements).build();
    }

    public static <E> com.google.common.collect.ImmutableSortedSet<E> copyOf(java.util.Comparator<? super E> comparator, java.lang.Iterable<? extends E> elements) {
        com.google.common.base.Preconditions.checkNotNull(comparator);
        if (com.google.common.collect.SortedIterables.hasSameComparator(comparator, elements) && (elements instanceof com.google.common.collect.ImmutableSortedSet)) {
            com.google.common.collect.ImmutableSortedSet<E> immutableSortedSet = (com.google.common.collect.ImmutableSortedSet) elements;
            if (!immutableSortedSet.isPartialView()) {
                return immutableSortedSet;
            }
        }
        java.lang.Object[] array = com.google.common.collect.Iterables.toArray(elements);
        return construct(comparator, array.length, array);
    }

    public static <E> com.google.common.collect.ImmutableSortedSet<E> copyOf(java.util.Comparator<? super E> comparator, java.util.Collection<? extends E> elements) {
        return copyOf((java.util.Comparator) comparator, (java.lang.Iterable) elements);
    }

    public static <E> com.google.common.collect.ImmutableSortedSet<E> copyOfSorted(java.util.SortedSet<E> sortedSet) {
        java.util.Comparator comparator = com.google.common.collect.SortedIterables.comparator(sortedSet);
        com.google.common.collect.ImmutableList immutableListCopyOf = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) sortedSet);
        if (immutableListCopyOf.isEmpty()) {
            return emptySet(comparator);
        }
        return new com.google.common.collect.RegularImmutableSortedSet(immutableListCopyOf, comparator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <E> com.google.common.collect.ImmutableSortedSet<E> construct(java.util.Comparator<? super E> comparator, int i, E... eArr) {
        if (i == 0) {
            return emptySet(comparator);
        }
        com.google.common.collect.ObjectArrays.checkElementsNotNull(eArr, i);
        java.util.Arrays.sort(eArr, 0, i, comparator);
        int i2 = 1;
        for (int i3 = 1; i3 < i; i3++) {
            android.R r = (java.lang.Object) eArr[i3];
            if (comparator.compare(r, (java.lang.Object) eArr[i2 - 1]) != 0) {
                eArr[i2] = r;
                i2++;
            }
        }
        java.util.Arrays.fill(eArr, i2, i, (java.lang.Object) null);
        if (i2 < eArr.length / 2) {
            eArr = (E[]) java.util.Arrays.copyOf(eArr, i2);
        }
        return new com.google.common.collect.RegularImmutableSortedSet(com.google.common.collect.ImmutableList.asImmutableList(eArr, i2), comparator);
    }

    public static <E> com.google.common.collect.ImmutableSortedSet.Builder<E> orderedBy(java.util.Comparator<E> comparator) {
        return new com.google.common.collect.ImmutableSortedSet.Builder<>(comparator);
    }

    public static <E extends java.lang.Comparable<?>> com.google.common.collect.ImmutableSortedSet.Builder<E> reverseOrder() {
        return new com.google.common.collect.ImmutableSortedSet.Builder<>(java.util.Collections.reverseOrder());
    }

    public static <E extends java.lang.Comparable<?>> com.google.common.collect.ImmutableSortedSet.Builder<E> naturalOrder() {
        return new com.google.common.collect.ImmutableSortedSet.Builder<>(com.google.common.collect.Ordering.natural());
    }

    public static final class Builder<E> extends com.google.common.collect.ImmutableSet.Builder<E> {
        private final java.util.Comparator<? super E> comparator;

        public Builder(java.util.Comparator<? super E> comparator) {
            this.comparator = (java.util.Comparator) com.google.common.base.Preconditions.checkNotNull(comparator);
        }

        @Override // com.google.common.collect.ImmutableSet.Builder, com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        public com.google.common.collect.ImmutableSortedSet.Builder<E> add(E element) {
            super.add((java.lang.Object) element);
            return this;
        }

        @Override // com.google.common.collect.ImmutableSet.Builder, com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        public com.google.common.collect.ImmutableSortedSet.Builder<E> add(E... elements) {
            super.add((java.lang.Object[]) elements);
            return this;
        }

        @Override // com.google.common.collect.ImmutableSet.Builder, com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        public com.google.common.collect.ImmutableSortedSet.Builder<E> addAll(java.lang.Iterable<? extends E> elements) {
            super.addAll((java.lang.Iterable) elements);
            return this;
        }

        @Override // com.google.common.collect.ImmutableSet.Builder, com.google.common.collect.ImmutableCollection.Builder
        public com.google.common.collect.ImmutableSortedSet.Builder<E> addAll(java.util.Iterator<? extends E> elements) {
            super.addAll((java.util.Iterator) elements);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableSet.Builder
        public com.google.common.collect.ImmutableSortedSet.Builder<E> combine(com.google.common.collect.ImmutableSet.Builder<E> builder) {
            super.combine((com.google.common.collect.ImmutableSet.Builder) builder);
            return this;
        }

        @Override // com.google.common.collect.ImmutableSet.Builder, com.google.common.collect.ImmutableCollection.Builder
        public com.google.common.collect.ImmutableSortedSet<E> build() {
            com.google.common.collect.ImmutableSortedSet<E> immutableSortedSetConstruct = com.google.common.collect.ImmutableSortedSet.construct(this.comparator, this.size, this.contents);
            this.size = immutableSortedSetConstruct.size();
            this.forceCopy = true;
            return immutableSortedSetConstruct;
        }
    }

    int unsafeCompare(java.lang.Object a2, @javax.annotation.CheckForNull java.lang.Object b) {
        return unsafeCompare(this.comparator, a2, b);
    }

    static int unsafeCompare(java.util.Comparator<?> comparator, java.lang.Object a2, @javax.annotation.CheckForNull java.lang.Object b) {
        return comparator.compare(a2, b);
    }

    ImmutableSortedSet(java.util.Comparator<? super E> comparator) {
        this.comparator = comparator;
    }

    @Override // java.util.SortedSet, com.google.common.collect.SortedIterable
    public java.util.Comparator<? super E> comparator() {
        return this.comparator;
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public com.google.common.collect.ImmutableSortedSet<E> headSet(E toElement) {
        return headSet((java.lang.Object) toElement, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    public com.google.common.collect.ImmutableSortedSet<E> headSet(E toElement, boolean inclusive) {
        return headSetImpl(com.google.common.base.Preconditions.checkNotNull(toElement), inclusive);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public com.google.common.collect.ImmutableSortedSet<E> subSet(E fromElement, E toElement) {
        return subSet((java.lang.Object) fromElement, true, (java.lang.Object) toElement, false);
    }

    @Override // java.util.NavigableSet
    public com.google.common.collect.ImmutableSortedSet<E> subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive) {
        com.google.common.base.Preconditions.checkNotNull(fromElement);
        com.google.common.base.Preconditions.checkNotNull(toElement);
        com.google.common.base.Preconditions.checkArgument(this.comparator.compare(fromElement, toElement) <= 0);
        return subSetImpl(fromElement, fromInclusive, toElement, toInclusive);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public com.google.common.collect.ImmutableSortedSet<E> tailSet(E fromElement) {
        return tailSet((java.lang.Object) fromElement, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    public com.google.common.collect.ImmutableSortedSet<E> tailSet(E fromElement, boolean inclusive) {
        return tailSetImpl(com.google.common.base.Preconditions.checkNotNull(fromElement), inclusive);
    }

    @javax.annotation.CheckForNull
    public E lower(E e) {
        return (E) com.google.common.collect.Iterators.getNext(headSet((java.lang.Object) e, false).descendingIterator(), null);
    }

    @javax.annotation.CheckForNull
    public E floor(E e) {
        return (E) com.google.common.collect.Iterators.getNext(headSet((java.lang.Object) e, true).descendingIterator(), null);
    }

    @javax.annotation.CheckForNull
    public E ceiling(E e) {
        return (E) com.google.common.collect.Iterables.getFirst(tailSet((java.lang.Object) e, true), null);
    }

    @javax.annotation.CheckForNull
    public E higher(E e) {
        return (E) com.google.common.collect.Iterables.getFirst(tailSet((java.lang.Object) e, false), null);
    }

    public E first() {
        return iterator().next();
    }

    public E last() {
        return descendingIterator().next();
    }

    @Override // java.util.NavigableSet
    @javax.annotation.CheckForNull
    @java.lang.Deprecated
    public final E pollFirst() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @javax.annotation.CheckForNull
    @java.lang.Deprecated
    public final E pollLast() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public com.google.common.collect.ImmutableSortedSet<E> descendingSet() {
        com.google.common.collect.ImmutableSortedSet<E> immutableSortedSet = this.descendingSet;
        if (immutableSortedSet != null) {
            return immutableSortedSet;
        }
        com.google.common.collect.ImmutableSortedSet<E> immutableSortedSetCreateDescendingSet = createDescendingSet();
        this.descendingSet = immutableSortedSetCreateDescendingSet;
        immutableSortedSetCreateDescendingSet.descendingSet = this;
        return immutableSortedSetCreateDescendingSet;
    }

    private static class SerializedForm<E> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        final java.util.Comparator<? super E> comparator;
        final java.lang.Object[] elements;

        public SerializedForm(java.util.Comparator<? super E> comparator, java.lang.Object[] elements) {
            this.comparator = comparator;
            this.elements = elements;
        }

        /* JADX WARN: Multi-variable type inference failed */
        java.lang.Object readResolve() {
            return new com.google.common.collect.ImmutableSortedSet.Builder(this.comparator).add(this.elements).build();
        }
    }

    private void readObject(java.io.ObjectInputStream unused) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    java.lang.Object writeReplace() {
        return new com.google.common.collect.ImmutableSortedSet.SerializedForm(this.comparator, toArray());
    }

    @java.lang.Deprecated
    static <E> java.util.stream.Collector<E, ?, com.google.common.collect.ImmutableSet<E>> toImmutableSet() {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static <E> com.google.common.collect.ImmutableSortedSet.Builder<E> builder() {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static <E> com.google.common.collect.ImmutableSortedSet.Builder<E> builderWithExpectedSize(int expectedSize) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static <E> com.google.common.collect.ImmutableSortedSet<E> of(E element) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static <E> com.google.common.collect.ImmutableSortedSet<E> of(E e1, E e2) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static <E> com.google.common.collect.ImmutableSortedSet<E> of(E e1, E e2, E e3) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static <E> com.google.common.collect.ImmutableSortedSet<E> of(E e1, E e2, E e3, E e4) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static <E> com.google.common.collect.ImmutableSortedSet<E> of(E e1, E e2, E e3, E e4, E e5) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static <E> com.google.common.collect.ImmutableSortedSet<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E... remaining) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static <Z> com.google.common.collect.ImmutableSortedSet<Z> copyOf(Z[] elements) {
        throw new java.lang.UnsupportedOperationException();
    }
}
