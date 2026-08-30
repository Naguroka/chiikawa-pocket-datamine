package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ImmutableSortedMultiset<E> extends com.google.common.collect.ImmutableMultiset<E> implements com.google.common.collect.SortedMultiset<E> {
    private static final long serialVersionUID = 912559;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    transient com.google.common.collect.ImmutableSortedMultiset<E> descendingMultiset;

    static /* synthetic */ int lambda$toImmutableSortedMultiset$0(java.lang.Object obj) {
        return 1;
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    public abstract com.google.common.collect.ImmutableSortedSet<E> elementSet();

    public abstract com.google.common.collect.ImmutableSortedMultiset<E> headMultiset(E upperBound, com.google.common.collect.BoundType boundType);

    public abstract com.google.common.collect.ImmutableSortedMultiset<E> tailMultiset(E lowerBound, com.google.common.collect.BoundType boundType);

    static <E> java.util.stream.Collector<E, ?, com.google.common.collect.ImmutableSortedMultiset<E>> toImmutableSortedMultiset(java.util.Comparator<? super E> comparator) {
        return toImmutableSortedMultiset(comparator, java.util.function.Function.identity(), new java.util.function.ToIntFunction() { // from class: com.google.common.collect.ImmutableSortedMultiset$$ExternalSyntheticLambda0
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(java.lang.Object obj) {
                return com.google.common.collect.ImmutableSortedMultiset.lambda$toImmutableSortedMultiset$0(obj);
            }
        });
    }

    static <T, E> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableSortedMultiset<E>> toImmutableSortedMultiset(final java.util.Comparator<? super E> comparator, final java.util.function.Function<? super T, ? extends E> elementFunction, final java.util.function.ToIntFunction<? super T> countFunction) {
        com.google.common.base.Preconditions.checkNotNull(comparator);
        com.google.common.base.Preconditions.checkNotNull(elementFunction);
        com.google.common.base.Preconditions.checkNotNull(countFunction);
        return java.util.stream.Collector.of(new java.util.function.Supplier() { // from class: com.google.common.collect.ImmutableSortedMultiset$$ExternalSyntheticLambda1
            @Override // java.util.function.Supplier
            public final java.lang.Object get() {
                return com.google.common.collect.TreeMultiset.create(comparator);
            }
        }, new java.util.function.BiConsumer() { // from class: com.google.common.collect.ImmutableSortedMultiset$$ExternalSyntheticLambda2
            @Override // java.util.function.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.common.collect.ImmutableSortedMultiset.mapAndAdd(obj2, (com.google.common.collect.Multiset) obj, elementFunction, countFunction);
            }
        }, new java.util.function.BinaryOperator() { // from class: com.google.common.collect.ImmutableSortedMultiset$$ExternalSyntheticLambda3
            @Override // java.util.function.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return com.google.common.collect.ImmutableSortedMultiset.lambda$toImmutableSortedMultiset$3((com.google.common.collect.Multiset) obj, (com.google.common.collect.Multiset) obj2);
            }
        }, new java.util.function.Function() { // from class: com.google.common.collect.ImmutableSortedMultiset$$ExternalSyntheticLambda4
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.common.collect.ImmutableSortedMultiset.copyOfSortedEntries(comparator, ((com.google.common.collect.Multiset) obj).entrySet());
            }
        }, new java.util.stream.Collector.Characteristics[0]);
    }

    static /* synthetic */ com.google.common.collect.Multiset lambda$toImmutableSortedMultiset$3(com.google.common.collect.Multiset multiset, com.google.common.collect.Multiset multiset2) {
        multiset.addAll(multiset2);
        return multiset;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static <T, E> void mapAndAdd(T t, com.google.common.collect.Multiset<E> multiset, java.util.function.Function<? super T, ? extends E> elementFunction, java.util.function.ToIntFunction<? super T> countFunction) {
        multiset.add(com.google.common.base.Preconditions.checkNotNull(elementFunction.apply(t)), countFunction.applyAsInt(t));
    }

    public static <E> com.google.common.collect.ImmutableSortedMultiset<E> of() {
        return (com.google.common.collect.ImmutableSortedMultiset<E>) com.google.common.collect.RegularImmutableSortedMultiset.NATURAL_EMPTY_MULTISET;
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static com.google.common.collect.ImmutableSortedMultiset of(java.lang.Comparable element) {
        return new com.google.common.collect.RegularImmutableSortedMultiset((com.google.common.collect.RegularImmutableSortedSet) com.google.common.collect.ImmutableSortedSet.of(element), new long[]{0, 1}, 0, 1);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static com.google.common.collect.ImmutableSortedMultiset of(java.lang.Comparable e1, java.lang.Comparable e2) {
        return copyOf(com.google.common.collect.Ordering.natural(), java.util.Arrays.asList(e1, e2));
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static com.google.common.collect.ImmutableSortedMultiset of(java.lang.Comparable e1, java.lang.Comparable e2, java.lang.Comparable e3) {
        return copyOf(com.google.common.collect.Ordering.natural(), java.util.Arrays.asList(e1, e2, e3));
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static com.google.common.collect.ImmutableSortedMultiset of(java.lang.Comparable e1, java.lang.Comparable e2, java.lang.Comparable e3, java.lang.Comparable e4) {
        return copyOf(com.google.common.collect.Ordering.natural(), java.util.Arrays.asList(e1, e2, e3, e4));
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static com.google.common.collect.ImmutableSortedMultiset of(java.lang.Comparable e1, java.lang.Comparable e2, java.lang.Comparable e3, java.lang.Comparable e4, java.lang.Comparable e5) {
        return copyOf(com.google.common.collect.Ordering.natural(), java.util.Arrays.asList(e1, e2, e3, e4, e5));
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;TE;[TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static com.google.common.collect.ImmutableSortedMultiset of(java.lang.Comparable e1, java.lang.Comparable e2, java.lang.Comparable e3, java.lang.Comparable e4, java.lang.Comparable e5, java.lang.Comparable e6, java.lang.Comparable... remaining) {
        java.util.ArrayList arrayListNewArrayListWithCapacity = com.google.common.collect.Lists.newArrayListWithCapacity(remaining.length + 6);
        java.util.Collections.addAll(arrayListNewArrayListWithCapacity, e1, e2, e3, e4, e5, e6);
        java.util.Collections.addAll(arrayListNewArrayListWithCapacity, remaining);
        return copyOf(com.google.common.collect.Ordering.natural(), arrayListNewArrayListWithCapacity);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>([TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static com.google.common.collect.ImmutableSortedMultiset copyOf(java.lang.Comparable[] elements) {
        return copyOf(com.google.common.collect.Ordering.natural(), java.util.Arrays.asList(elements));
    }

    public static <E> com.google.common.collect.ImmutableSortedMultiset<E> copyOf(java.lang.Iterable<? extends E> elements) {
        return copyOf(com.google.common.collect.Ordering.natural(), elements);
    }

    public static <E> com.google.common.collect.ImmutableSortedMultiset<E> copyOf(java.util.Iterator<? extends E> elements) {
        return copyOf(com.google.common.collect.Ordering.natural(), elements);
    }

    public static <E> com.google.common.collect.ImmutableSortedMultiset<E> copyOf(java.util.Comparator<? super E> comparator, java.util.Iterator<? extends E> elements) {
        com.google.common.base.Preconditions.checkNotNull(comparator);
        return new com.google.common.collect.ImmutableSortedMultiset.Builder(comparator).addAll((java.util.Iterator) elements).build();
    }

    public static <E> com.google.common.collect.ImmutableSortedMultiset<E> copyOf(java.util.Comparator<? super E> comparator, java.lang.Iterable<? extends E> elements) {
        if (elements instanceof com.google.common.collect.ImmutableSortedMultiset) {
            com.google.common.collect.ImmutableSortedMultiset<E> immutableSortedMultiset = (com.google.common.collect.ImmutableSortedMultiset) elements;
            if (comparator.equals(immutableSortedMultiset.comparator())) {
                return immutableSortedMultiset.isPartialView() ? copyOfSortedEntries(comparator, immutableSortedMultiset.entrySet().asList()) : immutableSortedMultiset;
            }
        }
        return new com.google.common.collect.ImmutableSortedMultiset.Builder(comparator).addAll((java.lang.Iterable) elements).build();
    }

    public static <E> com.google.common.collect.ImmutableSortedMultiset<E> copyOfSorted(com.google.common.collect.SortedMultiset<E> sortedMultiset) {
        return copyOfSortedEntries(sortedMultiset.comparator(), com.google.common.collect.Lists.newArrayList(sortedMultiset.entrySet()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> com.google.common.collect.ImmutableSortedMultiset<E> copyOfSortedEntries(java.util.Comparator<? super E> comparator, java.util.Collection<com.google.common.collect.Multiset.Entry<E>> entries) {
        if (entries.isEmpty()) {
            return emptyMultiset(comparator);
        }
        com.google.common.collect.ImmutableList.Builder builder = new com.google.common.collect.ImmutableList.Builder(entries.size());
        long[] jArr = new long[entries.size() + 1];
        int i = 0;
        for (com.google.common.collect.Multiset.Entry<E> entry : entries) {
            builder.add((java.lang.Object) entry.getElement());
            int i2 = i + 1;
            jArr[i2] = jArr[i] + ((long) entry.getCount());
            i = i2;
        }
        return new com.google.common.collect.RegularImmutableSortedMultiset(new com.google.common.collect.RegularImmutableSortedSet(builder.build(), comparator), jArr, 0, entries.size());
    }

    static <E> com.google.common.collect.ImmutableSortedMultiset<E> emptyMultiset(java.util.Comparator<? super E> comparator) {
        if (com.google.common.collect.Ordering.natural().equals(comparator)) {
            return (com.google.common.collect.ImmutableSortedMultiset<E>) com.google.common.collect.RegularImmutableSortedMultiset.NATURAL_EMPTY_MULTISET;
        }
        return new com.google.common.collect.RegularImmutableSortedMultiset(comparator);
    }

    ImmutableSortedMultiset() {
    }

    @Override // com.google.common.collect.SortedMultiset, com.google.common.collect.SortedIterable
    public final java.util.Comparator<? super E> comparator() {
        return elementSet().comparator();
    }

    @Override // com.google.common.collect.SortedMultiset
    public com.google.common.collect.ImmutableSortedMultiset<E> descendingMultiset() {
        com.google.common.collect.ImmutableSortedMultiset<E> descendingImmutableSortedMultiset = this.descendingMultiset;
        if (descendingImmutableSortedMultiset == null) {
            if (isEmpty()) {
                descendingImmutableSortedMultiset = emptyMultiset(com.google.common.collect.Ordering.from(comparator()).reverse());
            } else {
                descendingImmutableSortedMultiset = new com.google.common.collect.DescendingImmutableSortedMultiset<>(this);
            }
            this.descendingMultiset = descendingImmutableSortedMultiset;
        }
        return descendingImmutableSortedMultiset;
    }

    @Override // com.google.common.collect.SortedMultiset
    @javax.annotation.CheckForNull
    @java.lang.Deprecated
    public final com.google.common.collect.Multiset.Entry<E> pollFirstEntry() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.SortedMultiset
    @javax.annotation.CheckForNull
    @java.lang.Deprecated
    public final com.google.common.collect.Multiset.Entry<E> pollLastEntry() {
        throw new java.lang.UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.SortedMultiset
    public com.google.common.collect.ImmutableSortedMultiset<E> subMultiset(E lowerBound, com.google.common.collect.BoundType lowerBoundType, E upperBound, com.google.common.collect.BoundType upperBoundType) {
        com.google.common.base.Preconditions.checkArgument(comparator().compare(lowerBound, upperBound) <= 0, "Expected lowerBound <= upperBound but %s > %s", lowerBound, upperBound);
        return tailMultiset((java.lang.Object) lowerBound, lowerBoundType).headMultiset((java.lang.Object) upperBound, upperBoundType);
    }

    public static <E> com.google.common.collect.ImmutableSortedMultiset.Builder<E> orderedBy(java.util.Comparator<E> comparator) {
        return new com.google.common.collect.ImmutableSortedMultiset.Builder<>(comparator);
    }

    public static <E extends java.lang.Comparable<?>> com.google.common.collect.ImmutableSortedMultiset.Builder<E> reverseOrder() {
        return new com.google.common.collect.ImmutableSortedMultiset.Builder<>(com.google.common.collect.Ordering.natural().reverse());
    }

    public static <E extends java.lang.Comparable<?>> com.google.common.collect.ImmutableSortedMultiset.Builder<E> naturalOrder() {
        return new com.google.common.collect.ImmutableSortedMultiset.Builder<>(com.google.common.collect.Ordering.natural());
    }

    public static class Builder<E> extends com.google.common.collect.ImmutableMultiset.Builder<E> {
        private final java.util.Comparator<? super E> comparator;
        private int[] counts;
        E[] elements;
        private boolean forceCopyElements;
        private int length;

        public Builder(java.util.Comparator<? super E> comparator) {
            super(true);
            this.comparator = (java.util.Comparator) com.google.common.base.Preconditions.checkNotNull(comparator);
            this.elements = (E[]) new java.lang.Object[4];
            this.counts = new int[4];
        }

        private void maintenance() {
            int i = this.length;
            E[] eArr = this.elements;
            if (i == eArr.length) {
                dedupAndCoalesce(true);
            } else if (this.forceCopyElements) {
                this.elements = (E[]) java.util.Arrays.copyOf(eArr, eArr.length);
            }
            this.forceCopyElements = false;
        }

        private void dedupAndCoalesce(boolean z) {
            int i = this.length;
            if (i == 0) {
                return;
            }
            java.lang.Object[] objArr = (E[]) java.util.Arrays.copyOf(this.elements, i);
            java.util.Arrays.sort(objArr, this.comparator);
            int i2 = 1;
            for (int i3 = 1; i3 < objArr.length; i3++) {
                if (this.comparator.compare((java.lang.Object) objArr[i2 - 1], (java.lang.Object) objArr[i3]) < 0) {
                    objArr[i2] = objArr[i3];
                    i2++;
                }
            }
            java.util.Arrays.fill(objArr, i2, this.length, (java.lang.Object) null);
            if (z) {
                int i4 = i2 * 4;
                int i5 = this.length;
                if (i4 > i5 * 3) {
                    objArr = (E[]) java.util.Arrays.copyOf(objArr, com.google.common.math.IntMath.saturatedAdd(i5, (i5 / 2) + 1));
                }
            }
            int[] iArr = new int[objArr.length];
            for (int i6 = 0; i6 < this.length; i6++) {
                int iBinarySearch = java.util.Arrays.binarySearch(objArr, 0, i2, this.elements[i6], this.comparator);
                int i7 = this.counts[i6];
                if (i7 >= 0) {
                    iArr[iBinarySearch] = iArr[iBinarySearch] + i7;
                } else {
                    iArr[iBinarySearch] = ~i7;
                }
            }
            this.elements = (E[]) objArr;
            this.counts = iArr;
            this.length = i2;
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder, com.google.common.collect.ImmutableCollection.Builder
        public com.google.common.collect.ImmutableSortedMultiset.Builder<E> add(E element) {
            return addCopies((java.lang.Object) element, 1);
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder, com.google.common.collect.ImmutableCollection.Builder
        public com.google.common.collect.ImmutableSortedMultiset.Builder<E> add(E... elements) {
            for (E e : elements) {
                add((java.lang.Object) e);
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder
        public com.google.common.collect.ImmutableSortedMultiset.Builder<E> addCopies(E element, int occurrences) {
            com.google.common.base.Preconditions.checkNotNull(element);
            com.google.common.collect.CollectPreconditions.checkNonnegative(occurrences, "occurrences");
            if (occurrences == 0) {
                return this;
            }
            maintenance();
            E[] eArr = this.elements;
            int i = this.length;
            eArr[i] = element;
            this.counts[i] = occurrences;
            this.length = i + 1;
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder
        public com.google.common.collect.ImmutableSortedMultiset.Builder<E> setCount(E element, int count) {
            com.google.common.base.Preconditions.checkNotNull(element);
            com.google.common.collect.CollectPreconditions.checkNonnegative(count, "count");
            maintenance();
            E[] eArr = this.elements;
            int i = this.length;
            eArr[i] = element;
            this.counts[i] = ~count;
            this.length = i + 1;
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder, com.google.common.collect.ImmutableCollection.Builder
        public com.google.common.collect.ImmutableSortedMultiset.Builder<E> addAll(java.lang.Iterable<? extends E> elements) {
            if (elements instanceof com.google.common.collect.Multiset) {
                for (com.google.common.collect.Multiset.Entry<E> entry : ((com.google.common.collect.Multiset) elements).entrySet()) {
                    addCopies((java.lang.Object) entry.getElement(), entry.getCount());
                }
            } else {
                java.util.Iterator<? extends E> it = elements.iterator();
                while (it.hasNext()) {
                    add((java.lang.Object) it.next());
                }
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder, com.google.common.collect.ImmutableCollection.Builder
        public com.google.common.collect.ImmutableSortedMultiset.Builder<E> addAll(java.util.Iterator<? extends E> elements) {
            while (elements.hasNext()) {
                add((java.lang.Object) elements.next());
            }
            return this;
        }

        private void dedupAndCoalesceAndDeleteEmpty() {
            dedupAndCoalesce(false);
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = this.length;
                if (i < i3) {
                    int[] iArr = this.counts;
                    int i4 = iArr[i];
                    if (i4 > 0) {
                        E[] eArr = this.elements;
                        eArr[i2] = eArr[i];
                        iArr[i2] = i4;
                        i2++;
                    }
                    i++;
                } else {
                    java.util.Arrays.fill(this.elements, i2, i3, (java.lang.Object) null);
                    java.util.Arrays.fill(this.counts, i2, this.length, 0);
                    this.length = i2;
                    return;
                }
            }
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder, com.google.common.collect.ImmutableCollection.Builder
        public com.google.common.collect.ImmutableSortedMultiset<E> build() {
            dedupAndCoalesceAndDeleteEmpty();
            int i = this.length;
            if (i == 0) {
                return com.google.common.collect.ImmutableSortedMultiset.emptyMultiset(this.comparator);
            }
            com.google.common.collect.RegularImmutableSortedSet regularImmutableSortedSet = (com.google.common.collect.RegularImmutableSortedSet) com.google.common.collect.ImmutableSortedSet.construct(this.comparator, i, this.elements);
            long[] jArr = new long[this.length + 1];
            int i2 = 0;
            while (i2 < this.length) {
                int i3 = i2 + 1;
                jArr[i3] = jArr[i2] + ((long) this.counts[i2]);
                i2 = i3;
            }
            this.forceCopyElements = true;
            return new com.google.common.collect.RegularImmutableSortedMultiset(regularImmutableSortedSet, jArr, 0, this.length);
        }
    }

    private static final class SerializedForm<E> implements java.io.Serializable {
        final java.util.Comparator<? super E> comparator;
        final int[] counts;
        final E[] elements;

        SerializedForm(com.google.common.collect.SortedMultiset<E> sortedMultiset) {
            this.comparator = sortedMultiset.comparator();
            int size = sortedMultiset.entrySet().size();
            this.elements = (E[]) new java.lang.Object[size];
            this.counts = new int[size];
            int i = 0;
            for (com.google.common.collect.Multiset.Entry<E> entry : sortedMultiset.entrySet()) {
                this.elements[i] = entry.getElement();
                this.counts[i] = entry.getCount();
                i++;
            }
        }

        java.lang.Object readResolve() {
            int length = this.elements.length;
            com.google.common.collect.ImmutableSortedMultiset.Builder builder = new com.google.common.collect.ImmutableSortedMultiset.Builder(this.comparator);
            for (int i = 0; i < length; i++) {
                builder.addCopies((java.lang.Object) this.elements[i], this.counts[i]);
            }
            return builder.build();
        }
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    java.lang.Object writeReplace() {
        return new com.google.common.collect.ImmutableSortedMultiset.SerializedForm(this);
    }

    private void readObject(java.io.ObjectInputStream stream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use SerializedForm");
    }

    @java.lang.Deprecated
    static <E> java.util.stream.Collector<E, ?, com.google.common.collect.ImmutableMultiset<E>> toImmutableMultiset() {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    static <T, E> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableMultiset<E>> toImmutableMultiset(java.util.function.Function<? super T, ? extends E> elementFunction, java.util.function.ToIntFunction<? super T> countFunction) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static <E> com.google.common.collect.ImmutableSortedMultiset.Builder<E> builder() {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static <E> com.google.common.collect.ImmutableSortedMultiset<E> of(E element) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static <E> com.google.common.collect.ImmutableSortedMultiset<E> of(E e1, E e2) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static <E> com.google.common.collect.ImmutableSortedMultiset<E> of(E e1, E e2, E e3) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static <E> com.google.common.collect.ImmutableSortedMultiset<E> of(E e1, E e2, E e3, E e4) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static <E> com.google.common.collect.ImmutableSortedMultiset<E> of(E e1, E e2, E e3, E e4, E e5) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static <E> com.google.common.collect.ImmutableSortedMultiset<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E... remaining) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static <Z> com.google.common.collect.ImmutableSortedMultiset<Z> copyOf(Z[] elements) {
        throw new java.lang.UnsupportedOperationException();
    }
}
