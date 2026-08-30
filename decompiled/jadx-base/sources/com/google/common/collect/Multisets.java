package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public final class Multisets {
    private Multisets() {
    }

    static <T, E, M extends com.google.common.collect.Multiset<E>> java.util.stream.Collector<T, ?, M> toMultiset(java.util.function.Function<? super T, E> elementFunction, java.util.function.ToIntFunction<? super T> countFunction, java.util.function.Supplier<M> multisetSupplier) {
        return com.google.common.collect.CollectCollectors.toMultiset(elementFunction, countFunction, multisetSupplier);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> com.google.common.collect.Multiset<E> unmodifiableMultiset(com.google.common.collect.Multiset<? extends E> multiset) {
        return ((multiset instanceof com.google.common.collect.Multisets.UnmodifiableMultiset) || (multiset instanceof com.google.common.collect.ImmutableMultiset)) ? multiset : new com.google.common.collect.Multisets.UnmodifiableMultiset((com.google.common.collect.Multiset) com.google.common.base.Preconditions.checkNotNull(multiset));
    }

    @java.lang.Deprecated
    public static <E> com.google.common.collect.Multiset<E> unmodifiableMultiset(com.google.common.collect.ImmutableMultiset<E> multiset) {
        return (com.google.common.collect.Multiset) com.google.common.base.Preconditions.checkNotNull(multiset);
    }

    static class UnmodifiableMultiset<E> extends com.google.common.collect.ForwardingMultiset<E> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        final com.google.common.collect.Multiset<? extends E> delegate;

        @javax.annotation.CheckForNull
        @com.google.errorprone.annotations.concurrent.LazyInit
        transient java.util.Set<E> elementSet;

        @javax.annotation.CheckForNull
        @com.google.errorprone.annotations.concurrent.LazyInit
        transient java.util.Set<com.google.common.collect.Multiset.Entry<E>> entrySet;

        UnmodifiableMultiset(com.google.common.collect.Multiset<? extends E> delegate) {
            this.delegate = delegate;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public com.google.common.collect.Multiset<E> delegate() {
            return this.delegate;
        }

        java.util.Set<E> createElementSet() {
            return java.util.Collections.unmodifiableSet(this.delegate.elementSet());
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public java.util.Set<E> elementSet() {
            java.util.Set<E> set = this.elementSet;
            if (set != null) {
                return set;
            }
            java.util.Set<E> setCreateElementSet = createElementSet();
            this.elementSet = setCreateElementSet;
            return setCreateElementSet;
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public java.util.Set<com.google.common.collect.Multiset.Entry<E>> entrySet() {
            java.util.Set<com.google.common.collect.Multiset.Entry<E>> set = this.entrySet;
            if (set != null) {
                return set;
            }
            java.util.Set<com.google.common.collect.Multiset.Entry<E>> setUnmodifiableSet = java.util.Collections.unmodifiableSet(this.delegate.entrySet());
            this.entrySet = setUnmodifiableSet;
            return setUnmodifiableSet;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<E> iterator() {
            return com.google.common.collect.Iterators.unmodifiableIterator(this.delegate.iterator());
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
        public boolean add(@com.google.common.collect.ParametricNullness E element) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public int add(@com.google.common.collect.ParametricNullness E element, int occurrences) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public boolean addAll(java.util.Collection<? extends E> elementsToAdd) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean remove(@javax.annotation.CheckForNull java.lang.Object element) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public int remove(@javax.annotation.CheckForNull java.lang.Object element, int occurrences) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean removeAll(java.util.Collection<?> elementsToRemove) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean retainAll(java.util.Collection<?> elementsToRetain) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public void clear() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public int setCount(@com.google.common.collect.ParametricNullness E element, int count) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public boolean setCount(@com.google.common.collect.ParametricNullness E element, int oldCount, int newCount) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    public static <E> com.google.common.collect.SortedMultiset<E> unmodifiableSortedMultiset(com.google.common.collect.SortedMultiset<E> sortedMultiset) {
        return new com.google.common.collect.UnmodifiableSortedMultiset((com.google.common.collect.SortedMultiset) com.google.common.base.Preconditions.checkNotNull(sortedMultiset));
    }

    public static <E> com.google.common.collect.Multiset.Entry<E> immutableEntry(@com.google.common.collect.ParametricNullness E e, int n) {
        return new com.google.common.collect.Multisets.ImmutableEntry(e, n);
    }

    static class ImmutableEntry<E> extends com.google.common.collect.Multisets.AbstractEntry<E> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final int count;

        @com.google.common.collect.ParametricNullness
        private final E element;

        @javax.annotation.CheckForNull
        public com.google.common.collect.Multisets.ImmutableEntry<E> nextInBucket() {
            return null;
        }

        ImmutableEntry(@com.google.common.collect.ParametricNullness E element, int count) {
            this.element = element;
            this.count = count;
            com.google.common.collect.CollectPreconditions.checkNonnegative(count, "count");
        }

        @Override // com.google.common.collect.Multiset.Entry
        @com.google.common.collect.ParametricNullness
        public final E getElement() {
            return this.element;
        }

        @Override // com.google.common.collect.Multiset.Entry
        public final int getCount() {
            return this.count;
        }
    }

    public static <E> com.google.common.collect.Multiset<E> filter(com.google.common.collect.Multiset<E> unfiltered, com.google.common.base.Predicate<? super E> predicate) {
        if (unfiltered instanceof com.google.common.collect.Multisets.FilteredMultiset) {
            com.google.common.collect.Multisets.FilteredMultiset filteredMultiset = (com.google.common.collect.Multisets.FilteredMultiset) unfiltered;
            return new com.google.common.collect.Multisets.FilteredMultiset(filteredMultiset.unfiltered, com.google.common.base.Predicates.and(filteredMultiset.predicate, predicate));
        }
        return new com.google.common.collect.Multisets.FilteredMultiset(unfiltered, predicate);
    }

    private static final class FilteredMultiset<E> extends com.google.common.collect.Multisets.ViewMultiset<E> {
        final com.google.common.base.Predicate<? super E> predicate;
        final com.google.common.collect.Multiset<E> unfiltered;

        FilteredMultiset(com.google.common.collect.Multiset<E> unfiltered, com.google.common.base.Predicate<? super E> predicate) {
            super();
            this.unfiltered = (com.google.common.collect.Multiset) com.google.common.base.Preconditions.checkNotNull(unfiltered);
            this.predicate = (com.google.common.base.Predicate) com.google.common.base.Preconditions.checkNotNull(predicate);
        }

        @Override // com.google.common.collect.Multisets.ViewMultiset, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
        public com.google.common.collect.UnmodifiableIterator<E> iterator() {
            return com.google.common.collect.Iterators.filter(this.unfiltered.iterator(), this.predicate);
        }

        @Override // com.google.common.collect.AbstractMultiset
        java.util.Set<E> createElementSet() {
            return com.google.common.collect.Sets.filter(this.unfiltered.elementSet(), this.predicate);
        }

        @Override // com.google.common.collect.AbstractMultiset
        java.util.Iterator<E> elementIterator() {
            throw new java.lang.AssertionError("should never be called");
        }

        @Override // com.google.common.collect.AbstractMultiset
        java.util.Set<com.google.common.collect.Multiset.Entry<E>> createEntrySet() {
            return com.google.common.collect.Sets.filter(this.unfiltered.entrySet(), new com.google.common.base.Predicate<com.google.common.collect.Multiset.Entry<E>>() { // from class: com.google.common.collect.Multisets.FilteredMultiset.1
                @Override // com.google.common.base.Predicate
                public boolean apply(com.google.common.collect.Multiset.Entry<E> entry) {
                    return com.google.common.collect.Multisets.FilteredMultiset.this.predicate.apply(entry.getElement());
                }
            });
        }

        @Override // com.google.common.collect.AbstractMultiset
        java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> entryIterator() {
            throw new java.lang.AssertionError("should never be called");
        }

        @Override // com.google.common.collect.Multiset
        public int count(@javax.annotation.CheckForNull java.lang.Object element) {
            int iCount = this.unfiltered.count(element);
            if (iCount <= 0 || !this.predicate.apply(element)) {
                return 0;
            }
            return iCount;
        }

        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public int add(@com.google.common.collect.ParametricNullness E element, int occurrences) {
            com.google.common.base.Preconditions.checkArgument(this.predicate.apply(element), "Element %s does not match predicate %s", element, this.predicate);
            return this.unfiltered.add(element, occurrences);
        }

        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public int remove(@javax.annotation.CheckForNull java.lang.Object element, int occurrences) {
            com.google.common.collect.CollectPreconditions.checkNonnegative(occurrences, "occurrences");
            if (occurrences == 0) {
                return count(element);
            }
            if (contains(element)) {
                return this.unfiltered.remove(element, occurrences);
            }
            return 0;
        }
    }

    static int inferDistinctElements(java.lang.Iterable<?> elements) {
        if (elements instanceof com.google.common.collect.Multiset) {
            return ((com.google.common.collect.Multiset) elements).elementSet().size();
        }
        return 11;
    }

    public static <E> com.google.common.collect.Multiset<E> union(final com.google.common.collect.Multiset<? extends E> multiset1, final com.google.common.collect.Multiset<? extends E> multiset2) {
        com.google.common.base.Preconditions.checkNotNull(multiset1);
        com.google.common.base.Preconditions.checkNotNull(multiset2);
        return new com.google.common.collect.Multisets.ViewMultiset<E>() { // from class: com.google.common.collect.Multisets.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
            public boolean contains(@javax.annotation.CheckForNull java.lang.Object element) {
                return multiset1.contains(element) || multiset2.contains(element);
            }

            @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
            public boolean isEmpty() {
                return multiset1.isEmpty() && multiset2.isEmpty();
            }

            @Override // com.google.common.collect.Multiset
            public int count(@javax.annotation.CheckForNull java.lang.Object element) {
                return java.lang.Math.max(multiset1.count(element), multiset2.count(element));
            }

            @Override // com.google.common.collect.AbstractMultiset
            java.util.Set<E> createElementSet() {
                return com.google.common.collect.Sets.union(multiset1.elementSet(), multiset2.elementSet());
            }

            @Override // com.google.common.collect.AbstractMultiset
            java.util.Iterator<E> elementIterator() {
                throw new java.lang.AssertionError("should never be called");
            }

            @Override // com.google.common.collect.AbstractMultiset
            java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> entryIterator() {
                final java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> it = multiset1.entrySet().iterator();
                final java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> it2 = multiset2.entrySet().iterator();
                return new com.google.common.collect.AbstractIterator<com.google.common.collect.Multiset.Entry<E>>() { // from class: com.google.common.collect.Multisets.1.1
                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.google.common.collect.AbstractIterator
                    @javax.annotation.CheckForNull
                    public com.google.common.collect.Multiset.Entry<E> computeNext() {
                        if (it.hasNext()) {
                            com.google.common.collect.Multiset.Entry entry = (com.google.common.collect.Multiset.Entry) it.next();
                            java.lang.Object element = entry.getElement();
                            return com.google.common.collect.Multisets.immutableEntry(element, java.lang.Math.max(entry.getCount(), multiset2.count(element)));
                        }
                        while (it2.hasNext()) {
                            com.google.common.collect.Multiset.Entry entry2 = (com.google.common.collect.Multiset.Entry) it2.next();
                            java.lang.Object element2 = entry2.getElement();
                            if (!multiset1.contains(element2)) {
                                return com.google.common.collect.Multisets.immutableEntry(element2, entry2.getCount());
                            }
                        }
                        return endOfData();
                    }
                };
            }
        };
    }

    public static <E> com.google.common.collect.Multiset<E> intersection(final com.google.common.collect.Multiset<E> multiset1, final com.google.common.collect.Multiset<?> multiset2) {
        com.google.common.base.Preconditions.checkNotNull(multiset1);
        com.google.common.base.Preconditions.checkNotNull(multiset2);
        return new com.google.common.collect.Multisets.ViewMultiset<E>() { // from class: com.google.common.collect.Multisets.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.google.common.collect.Multiset
            public int count(@javax.annotation.CheckForNull java.lang.Object element) {
                int iCount = multiset1.count(element);
                if (iCount == 0) {
                    return 0;
                }
                return java.lang.Math.min(iCount, multiset2.count(element));
            }

            @Override // com.google.common.collect.AbstractMultiset
            java.util.Set<E> createElementSet() {
                return com.google.common.collect.Sets.intersection(multiset1.elementSet(), multiset2.elementSet());
            }

            @Override // com.google.common.collect.AbstractMultiset
            java.util.Iterator<E> elementIterator() {
                throw new java.lang.AssertionError("should never be called");
            }

            @Override // com.google.common.collect.AbstractMultiset
            java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> entryIterator() {
                final java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> it = multiset1.entrySet().iterator();
                return new com.google.common.collect.AbstractIterator<com.google.common.collect.Multiset.Entry<E>>() { // from class: com.google.common.collect.Multisets.2.1
                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.google.common.collect.AbstractIterator
                    @javax.annotation.CheckForNull
                    public com.google.common.collect.Multiset.Entry<E> computeNext() {
                        while (it.hasNext()) {
                            com.google.common.collect.Multiset.Entry entry = (com.google.common.collect.Multiset.Entry) it.next();
                            java.lang.Object element = entry.getElement();
                            int iMin = java.lang.Math.min(entry.getCount(), multiset2.count(element));
                            if (iMin > 0) {
                                return com.google.common.collect.Multisets.immutableEntry(element, iMin);
                            }
                        }
                        return endOfData();
                    }
                };
            }
        };
    }

    public static <E> com.google.common.collect.Multiset<E> sum(final com.google.common.collect.Multiset<? extends E> multiset1, final com.google.common.collect.Multiset<? extends E> multiset2) {
        com.google.common.base.Preconditions.checkNotNull(multiset1);
        com.google.common.base.Preconditions.checkNotNull(multiset2);
        return new com.google.common.collect.Multisets.ViewMultiset<E>() { // from class: com.google.common.collect.Multisets.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
            public boolean contains(@javax.annotation.CheckForNull java.lang.Object element) {
                return multiset1.contains(element) || multiset2.contains(element);
            }

            @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
            public boolean isEmpty() {
                return multiset1.isEmpty() && multiset2.isEmpty();
            }

            @Override // com.google.common.collect.Multisets.ViewMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
            public int size() {
                return com.google.common.math.IntMath.saturatedAdd(multiset1.size(), multiset2.size());
            }

            @Override // com.google.common.collect.Multiset
            public int count(@javax.annotation.CheckForNull java.lang.Object element) {
                return multiset1.count(element) + multiset2.count(element);
            }

            @Override // com.google.common.collect.AbstractMultiset
            java.util.Set<E> createElementSet() {
                return com.google.common.collect.Sets.union(multiset1.elementSet(), multiset2.elementSet());
            }

            @Override // com.google.common.collect.AbstractMultiset
            java.util.Iterator<E> elementIterator() {
                throw new java.lang.AssertionError("should never be called");
            }

            @Override // com.google.common.collect.AbstractMultiset
            java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> entryIterator() {
                final java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> it = multiset1.entrySet().iterator();
                final java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> it2 = multiset2.entrySet().iterator();
                return new com.google.common.collect.AbstractIterator<com.google.common.collect.Multiset.Entry<E>>() { // from class: com.google.common.collect.Multisets.3.1
                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.google.common.collect.AbstractIterator
                    @javax.annotation.CheckForNull
                    public com.google.common.collect.Multiset.Entry<E> computeNext() {
                        if (it.hasNext()) {
                            com.google.common.collect.Multiset.Entry entry = (com.google.common.collect.Multiset.Entry) it.next();
                            java.lang.Object element = entry.getElement();
                            return com.google.common.collect.Multisets.immutableEntry(element, entry.getCount() + multiset2.count(element));
                        }
                        while (it2.hasNext()) {
                            com.google.common.collect.Multiset.Entry entry2 = (com.google.common.collect.Multiset.Entry) it2.next();
                            java.lang.Object element2 = entry2.getElement();
                            if (!multiset1.contains(element2)) {
                                return com.google.common.collect.Multisets.immutableEntry(element2, entry2.getCount());
                            }
                        }
                        return endOfData();
                    }
                };
            }
        };
    }

    public static <E> com.google.common.collect.Multiset<E> difference(final com.google.common.collect.Multiset<E> multiset1, final com.google.common.collect.Multiset<?> multiset2) {
        com.google.common.base.Preconditions.checkNotNull(multiset1);
        com.google.common.base.Preconditions.checkNotNull(multiset2);
        return new com.google.common.collect.Multisets.ViewMultiset<E>() { // from class: com.google.common.collect.Multisets.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.google.common.collect.Multiset
            public int count(@javax.annotation.CheckForNull java.lang.Object element) {
                int iCount = multiset1.count(element);
                if (iCount == 0) {
                    return 0;
                }
                return java.lang.Math.max(0, iCount - multiset2.count(element));
            }

            @Override // com.google.common.collect.Multisets.ViewMultiset, com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
            public void clear() {
                throw new java.lang.UnsupportedOperationException();
            }

            @Override // com.google.common.collect.AbstractMultiset
            java.util.Iterator<E> elementIterator() {
                final java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> it = multiset1.entrySet().iterator();
                return new com.google.common.collect.AbstractIterator<E>() { // from class: com.google.common.collect.Multisets.4.1
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // com.google.common.collect.AbstractIterator
                    @javax.annotation.CheckForNull
                    protected E computeNext() {
                        while (it.hasNext()) {
                            com.google.common.collect.Multiset.Entry entry = (com.google.common.collect.Multiset.Entry) it.next();
                            E e = (E) entry.getElement();
                            if (entry.getCount() > multiset2.count(e)) {
                                return e;
                            }
                        }
                        return endOfData();
                    }
                };
            }

            @Override // com.google.common.collect.AbstractMultiset
            java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> entryIterator() {
                final java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> it = multiset1.entrySet().iterator();
                return new com.google.common.collect.AbstractIterator<com.google.common.collect.Multiset.Entry<E>>() { // from class: com.google.common.collect.Multisets.4.2
                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.google.common.collect.AbstractIterator
                    @javax.annotation.CheckForNull
                    public com.google.common.collect.Multiset.Entry<E> computeNext() {
                        while (it.hasNext()) {
                            com.google.common.collect.Multiset.Entry entry = (com.google.common.collect.Multiset.Entry) it.next();
                            java.lang.Object element = entry.getElement();
                            int count = entry.getCount() - multiset2.count(element);
                            if (count > 0) {
                                return com.google.common.collect.Multisets.immutableEntry(element, count);
                            }
                        }
                        return endOfData();
                    }
                };
            }

            @Override // com.google.common.collect.Multisets.ViewMultiset, com.google.common.collect.AbstractMultiset
            int distinctElements() {
                return com.google.common.collect.Iterators.size(entryIterator());
            }
        };
    }

    public static boolean containsOccurrences(com.google.common.collect.Multiset<?> superMultiset, com.google.common.collect.Multiset<?> subMultiset) {
        com.google.common.base.Preconditions.checkNotNull(superMultiset);
        com.google.common.base.Preconditions.checkNotNull(subMultiset);
        for (com.google.common.collect.Multiset.Entry<?> entry : subMultiset.entrySet()) {
            if (superMultiset.count(entry.getElement()) < entry.getCount()) {
                return false;
            }
        }
        return true;
    }

    public static boolean retainOccurrences(com.google.common.collect.Multiset<?> multisetToModify, com.google.common.collect.Multiset<?> multisetToRetain) {
        return retainOccurrencesImpl(multisetToModify, multisetToRetain);
    }

    private static <E> boolean retainOccurrencesImpl(com.google.common.collect.Multiset<E> multisetToModify, com.google.common.collect.Multiset<?> occurrencesToRetain) {
        com.google.common.base.Preconditions.checkNotNull(multisetToModify);
        com.google.common.base.Preconditions.checkNotNull(occurrencesToRetain);
        java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> it = multisetToModify.entrySet().iterator();
        boolean z = false;
        while (it.hasNext()) {
            com.google.common.collect.Multiset.Entry<E> next = it.next();
            int iCount = occurrencesToRetain.count(next.getElement());
            if (iCount == 0) {
                it.remove();
            } else if (iCount < next.getCount()) {
                multisetToModify.setCount(next.getElement(), iCount);
            }
            z = true;
        }
        return z;
    }

    public static boolean removeOccurrences(com.google.common.collect.Multiset<?> multisetToModify, java.lang.Iterable<?> occurrencesToRemove) {
        if (occurrencesToRemove instanceof com.google.common.collect.Multiset) {
            return removeOccurrences(multisetToModify, (com.google.common.collect.Multiset<?>) occurrencesToRemove);
        }
        com.google.common.base.Preconditions.checkNotNull(multisetToModify);
        com.google.common.base.Preconditions.checkNotNull(occurrencesToRemove);
        java.util.Iterator<?> it = occurrencesToRemove.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= multisetToModify.remove(it.next());
        }
        return zRemove;
    }

    public static boolean removeOccurrences(com.google.common.collect.Multiset<?> multisetToModify, com.google.common.collect.Multiset<?> occurrencesToRemove) {
        com.google.common.base.Preconditions.checkNotNull(multisetToModify);
        com.google.common.base.Preconditions.checkNotNull(occurrencesToRemove);
        java.util.Iterator<com.google.common.collect.Multiset.Entry<?>> it = multisetToModify.entrySet().iterator();
        boolean z = false;
        while (it.hasNext()) {
            com.google.common.collect.Multiset.Entry<?> next = it.next();
            int iCount = occurrencesToRemove.count(next.getElement());
            if (iCount >= next.getCount()) {
                it.remove();
            } else if (iCount > 0) {
                multisetToModify.remove(next.getElement(), iCount);
            }
            z = true;
        }
        return z;
    }

    static abstract class AbstractEntry<E> implements com.google.common.collect.Multiset.Entry<E> {
        AbstractEntry() {
        }

        @Override // com.google.common.collect.Multiset.Entry
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
            if (!(object instanceof com.google.common.collect.Multiset.Entry)) {
                return false;
            }
            com.google.common.collect.Multiset.Entry entry = (com.google.common.collect.Multiset.Entry) object;
            return getCount() == entry.getCount() && com.google.common.base.Objects.equal(getElement(), entry.getElement());
        }

        @Override // com.google.common.collect.Multiset.Entry
        public int hashCode() {
            E element = getElement();
            return (element == null ? 0 : element.hashCode()) ^ getCount();
        }

        @Override // com.google.common.collect.Multiset.Entry
        public java.lang.String toString() {
            java.lang.String strValueOf = java.lang.String.valueOf(getElement());
            int count = getCount();
            return count == 1 ? strValueOf : strValueOf + " x " + count;
        }
    }

    static boolean equalsImpl(com.google.common.collect.Multiset<?> multiset, @javax.annotation.CheckForNull java.lang.Object object) {
        if (object == multiset) {
            return true;
        }
        if (object instanceof com.google.common.collect.Multiset) {
            com.google.common.collect.Multiset multiset2 = (com.google.common.collect.Multiset) object;
            if (multiset.size() == multiset2.size() && multiset.entrySet().size() == multiset2.entrySet().size()) {
                for (com.google.common.collect.Multiset.Entry entry : multiset2.entrySet()) {
                    if (multiset.count(entry.getElement()) != entry.getCount()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    static <E> boolean addAllImpl(com.google.common.collect.Multiset<E> self, java.util.Collection<? extends E> elements) {
        com.google.common.base.Preconditions.checkNotNull(self);
        com.google.common.base.Preconditions.checkNotNull(elements);
        if (elements instanceof com.google.common.collect.Multiset) {
            return addAllImpl((com.google.common.collect.Multiset) self, cast(elements));
        }
        if (elements.isEmpty()) {
            return false;
        }
        return com.google.common.collect.Iterators.addAll(self, elements.iterator());
    }

    private static <E> boolean addAllImpl(com.google.common.collect.Multiset<E> self, com.google.common.collect.Multiset<? extends E> elements) {
        if (elements instanceof com.google.common.collect.AbstractMapBasedMultiset) {
            return addAllImpl((com.google.common.collect.Multiset) self, (com.google.common.collect.AbstractMapBasedMultiset) elements);
        }
        if (elements.isEmpty()) {
            return false;
        }
        for (com.google.common.collect.Multiset.Entry<? extends E> entry : elements.entrySet()) {
            self.add(entry.getElement(), entry.getCount());
        }
        return true;
    }

    private static <E> boolean addAllImpl(com.google.common.collect.Multiset<E> self, com.google.common.collect.AbstractMapBasedMultiset<? extends E> elements) {
        if (elements.isEmpty()) {
            return false;
        }
        elements.addTo(self);
        return true;
    }

    static boolean removeAllImpl(com.google.common.collect.Multiset<?> self, java.util.Collection<?> elementsToRemove) {
        if (elementsToRemove instanceof com.google.common.collect.Multiset) {
            elementsToRemove = ((com.google.common.collect.Multiset) elementsToRemove).elementSet();
        }
        return self.elementSet().removeAll(elementsToRemove);
    }

    static boolean retainAllImpl(com.google.common.collect.Multiset<?> self, java.util.Collection<?> elementsToRetain) {
        com.google.common.base.Preconditions.checkNotNull(elementsToRetain);
        if (elementsToRetain instanceof com.google.common.collect.Multiset) {
            elementsToRetain = ((com.google.common.collect.Multiset) elementsToRetain).elementSet();
        }
        return self.elementSet().retainAll(elementsToRetain);
    }

    static <E> int setCountImpl(com.google.common.collect.Multiset<E> self, @com.google.common.collect.ParametricNullness E element, int count) {
        com.google.common.collect.CollectPreconditions.checkNonnegative(count, "count");
        int iCount = self.count(element);
        int i = count - iCount;
        if (i > 0) {
            self.add(element, i);
        } else if (i < 0) {
            self.remove(element, -i);
        }
        return iCount;
    }

    static <E> boolean setCountImpl(com.google.common.collect.Multiset<E> self, @com.google.common.collect.ParametricNullness E element, int oldCount, int newCount) {
        com.google.common.collect.CollectPreconditions.checkNonnegative(oldCount, "oldCount");
        com.google.common.collect.CollectPreconditions.checkNonnegative(newCount, "newCount");
        if (self.count(element) != oldCount) {
            return false;
        }
        self.setCount(element, newCount);
        return true;
    }

    static <E> java.util.Iterator<E> elementIterator(java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> entryIterator) {
        return new com.google.common.collect.TransformedIterator<com.google.common.collect.Multiset.Entry<E>, E>(entryIterator) { // from class: com.google.common.collect.Multisets.5
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.TransformedIterator
            @com.google.common.collect.ParametricNullness
            public E transform(com.google.common.collect.Multiset.Entry<E> entry) {
                return entry.getElement();
            }
        };
    }

    static abstract class ElementSet<E> extends com.google.common.collect.Sets.ImprovedAbstractSet<E> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public abstract java.util.Iterator<E> iterator();

        abstract com.google.common.collect.Multiset<E> multiset();

        ElementSet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            multiset().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object o) {
            return multiset().contains(o);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(java.util.Collection<?> c) {
            return multiset().containsAll(c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return multiset().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@javax.annotation.CheckForNull java.lang.Object o) {
            return multiset().remove(o, Integer.MAX_VALUE) > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return multiset().entrySet().size();
        }
    }

    static abstract class EntrySet<E> extends com.google.common.collect.Sets.ImprovedAbstractSet<com.google.common.collect.Multiset.Entry<E>> {
        abstract com.google.common.collect.Multiset<E> multiset();

        EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object o) {
            if (!(o instanceof com.google.common.collect.Multiset.Entry)) {
                return false;
            }
            com.google.common.collect.Multiset.Entry entry = (com.google.common.collect.Multiset.Entry) o;
            return entry.getCount() > 0 && multiset().count(entry.getElement()) == entry.getCount();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@javax.annotation.CheckForNull java.lang.Object obj) {
            if (obj instanceof com.google.common.collect.Multiset.Entry) {
                com.google.common.collect.Multiset.Entry entry = (com.google.common.collect.Multiset.Entry) obj;
                java.lang.Object element = entry.getElement();
                int count = entry.getCount();
                if (count != 0) {
                    return multiset().setCount(element, count, 0);
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            multiset().clear();
        }
    }

    static <E> java.util.Iterator<E> iteratorImpl(com.google.common.collect.Multiset<E> multiset) {
        return new com.google.common.collect.Multisets.MultisetIteratorImpl(multiset, multiset.entrySet().iterator());
    }

    static final class MultisetIteratorImpl<E> implements java.util.Iterator<E> {
        private boolean canRemove;

        @javax.annotation.CheckForNull
        private com.google.common.collect.Multiset.Entry<E> currentEntry;
        private final java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> entryIterator;
        private int laterCount;
        private final com.google.common.collect.Multiset<E> multiset;
        private int totalCount;

        MultisetIteratorImpl(com.google.common.collect.Multiset<E> multiset, java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> entryIterator) {
            this.multiset = multiset;
            this.entryIterator = entryIterator;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.laterCount > 0 || this.entryIterator.hasNext();
        }

        @Override // java.util.Iterator
        @com.google.common.collect.ParametricNullness
        public E next() {
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            if (this.laterCount == 0) {
                com.google.common.collect.Multiset.Entry<E> next = this.entryIterator.next();
                this.currentEntry = next;
                int count = next.getCount();
                this.laterCount = count;
                this.totalCount = count;
            }
            this.laterCount--;
            this.canRemove = true;
            return (E) ((com.google.common.collect.Multiset.Entry) java.util.Objects.requireNonNull(this.currentEntry)).getElement();
        }

        @Override // java.util.Iterator
        public void remove() {
            com.google.common.collect.CollectPreconditions.checkRemove(this.canRemove);
            if (this.totalCount == 1) {
                this.entryIterator.remove();
            } else {
                this.multiset.remove(((com.google.common.collect.Multiset.Entry) java.util.Objects.requireNonNull(this.currentEntry)).getElement());
            }
            this.totalCount--;
            this.canRemove = false;
        }
    }

    static int linearTimeSizeImpl(com.google.common.collect.Multiset<?> multiset) {
        java.util.Iterator<com.google.common.collect.Multiset.Entry<?>> it = multiset.entrySet().iterator();
        long count = 0;
        while (it.hasNext()) {
            count += (long) it.next().getCount();
        }
        return com.google.common.primitives.Ints.saturatedCast(count);
    }

    static <T> com.google.common.collect.Multiset<T> cast(java.lang.Iterable<T> iterable) {
        return (com.google.common.collect.Multiset) iterable;
    }

    public static <E> com.google.common.collect.ImmutableMultiset<E> copyHighestCountFirst(com.google.common.collect.Multiset<E> multiset) {
        com.google.common.collect.Multiset.Entry[] entryArr = (com.google.common.collect.Multiset.Entry[]) multiset.entrySet().toArray(new com.google.common.collect.Multiset.Entry[0]);
        java.util.Arrays.sort(entryArr, com.google.common.collect.Multisets.DecreasingCount.INSTANCE);
        return com.google.common.collect.ImmutableMultiset.copyFromEntries(java.util.Arrays.asList(entryArr));
    }

    private static final class DecreasingCount implements java.util.Comparator<com.google.common.collect.Multiset.Entry<?>> {
        static final java.util.Comparator<com.google.common.collect.Multiset.Entry<?>> INSTANCE = new com.google.common.collect.Multisets.DecreasingCount();

        private DecreasingCount() {
        }

        @Override // java.util.Comparator
        public int compare(com.google.common.collect.Multiset.Entry<?> entry1, com.google.common.collect.Multiset.Entry<?> entry2) {
            return entry2.getCount() - entry1.getCount();
        }
    }

    private static abstract class ViewMultiset<E> extends com.google.common.collect.AbstractMultiset<E> {
        private ViewMultiset() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
        public int size() {
            return com.google.common.collect.Multisets.linearTimeSizeImpl(this);
        }

        @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            elementSet().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
        public java.util.Iterator<E> iterator() {
            return com.google.common.collect.Multisets.iteratorImpl(this);
        }

        @Override // com.google.common.collect.AbstractMultiset
        int distinctElements() {
            return elementSet().size();
        }
    }
}
