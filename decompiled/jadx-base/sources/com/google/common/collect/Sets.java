package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public final class Sets {
    private Sets() {
    }

    static abstract class ImprovedAbstractSet<E> extends java.util.AbstractSet<E> {
        ImprovedAbstractSet() {
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(java.util.Collection<?> c) {
            return com.google.common.collect.Sets.removeAllImpl(this, c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(java.util.Collection<?> c) {
            return super.retainAll((java.util.Collection) com.google.common.base.Preconditions.checkNotNull(c));
        }
    }

    public static <E extends java.lang.Enum<E>> com.google.common.collect.ImmutableSet<E> immutableEnumSet(E anElement, E... otherElements) {
        return com.google.common.collect.ImmutableEnumSet.asImmutable(java.util.EnumSet.of((java.lang.Enum) anElement, (java.lang.Enum[]) otherElements));
    }

    public static <E extends java.lang.Enum<E>> com.google.common.collect.ImmutableSet<E> immutableEnumSet(java.lang.Iterable<E> elements) {
        if (elements instanceof com.google.common.collect.ImmutableEnumSet) {
            return (com.google.common.collect.ImmutableEnumSet) elements;
        }
        if (elements instanceof java.util.Collection) {
            java.util.Collection collection = (java.util.Collection) elements;
            if (collection.isEmpty()) {
                return com.google.common.collect.ImmutableSet.of();
            }
            return com.google.common.collect.ImmutableEnumSet.asImmutable(java.util.EnumSet.copyOf(collection));
        }
        java.util.Iterator<E> it = elements.iterator();
        if (it.hasNext()) {
            java.util.EnumSet enumSetOf = java.util.EnumSet.of((java.lang.Enum) it.next());
            com.google.common.collect.Iterators.addAll(enumSetOf, it);
            return com.google.common.collect.ImmutableEnumSet.asImmutable(enumSetOf);
        }
        return com.google.common.collect.ImmutableSet.of();
    }

    static <E extends java.lang.Enum<E>> java.util.stream.Collector<E, ?, com.google.common.collect.ImmutableSet<E>> toImmutableEnumSet() {
        return com.google.common.collect.CollectCollectors.toImmutableEnumSet();
    }

    public static <E extends java.lang.Enum<E>> java.util.EnumSet<E> newEnumSet(java.lang.Iterable<E> iterable, java.lang.Class<E> elementType) {
        java.util.EnumSet<E> enumSetNoneOf = java.util.EnumSet.noneOf(elementType);
        com.google.common.collect.Iterables.addAll(enumSetNoneOf, iterable);
        return enumSetNoneOf;
    }

    public static <E> java.util.HashSet<E> newHashSet() {
        return new java.util.HashSet<>();
    }

    public static <E> java.util.HashSet<E> newHashSet(E... elements) {
        java.util.HashSet<E> hashSetNewHashSetWithExpectedSize = newHashSetWithExpectedSize(elements.length);
        java.util.Collections.addAll(hashSetNewHashSetWithExpectedSize, elements);
        return hashSetNewHashSetWithExpectedSize;
    }

    public static <E> java.util.HashSet<E> newHashSet(java.lang.Iterable<? extends E> elements) {
        if (elements instanceof java.util.Collection) {
            return new java.util.HashSet<>((java.util.Collection) elements);
        }
        return newHashSet(elements.iterator());
    }

    public static <E> java.util.HashSet<E> newHashSet(java.util.Iterator<? extends E> elements) {
        java.util.HashSet<E> hashSetNewHashSet = newHashSet();
        com.google.common.collect.Iterators.addAll(hashSetNewHashSet, elements);
        return hashSetNewHashSet;
    }

    public static <E> java.util.HashSet<E> newHashSetWithExpectedSize(int expectedSize) {
        return new java.util.HashSet<>(com.google.common.collect.Maps.capacity(expectedSize));
    }

    public static <E> java.util.Set<E> newConcurrentHashSet() {
        return java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());
    }

    public static <E> java.util.Set<E> newConcurrentHashSet(java.lang.Iterable<? extends E> elements) {
        java.util.Set<E> setNewConcurrentHashSet = newConcurrentHashSet();
        com.google.common.collect.Iterables.addAll(setNewConcurrentHashSet, elements);
        return setNewConcurrentHashSet;
    }

    public static <E> java.util.LinkedHashSet<E> newLinkedHashSet() {
        return new java.util.LinkedHashSet<>();
    }

    public static <E> java.util.LinkedHashSet<E> newLinkedHashSet(java.lang.Iterable<? extends E> elements) {
        if (elements instanceof java.util.Collection) {
            return new java.util.LinkedHashSet<>((java.util.Collection) elements);
        }
        java.util.LinkedHashSet<E> linkedHashSetNewLinkedHashSet = newLinkedHashSet();
        com.google.common.collect.Iterables.addAll(linkedHashSetNewLinkedHashSet, elements);
        return linkedHashSetNewLinkedHashSet;
    }

    public static <E> java.util.LinkedHashSet<E> newLinkedHashSetWithExpectedSize(int expectedSize) {
        return new java.util.LinkedHashSet<>(com.google.common.collect.Maps.capacity(expectedSize));
    }

    public static <E extends java.lang.Comparable> java.util.TreeSet<E> newTreeSet() {
        return new java.util.TreeSet<>();
    }

    public static <E extends java.lang.Comparable> java.util.TreeSet<E> newTreeSet(java.lang.Iterable<? extends E> elements) {
        java.util.TreeSet<E> treeSetNewTreeSet = newTreeSet();
        com.google.common.collect.Iterables.addAll(treeSetNewTreeSet, elements);
        return treeSetNewTreeSet;
    }

    public static <E> java.util.TreeSet<E> newTreeSet(java.util.Comparator<? super E> comparator) {
        return new java.util.TreeSet<>((java.util.Comparator) com.google.common.base.Preconditions.checkNotNull(comparator));
    }

    public static <E> java.util.Set<E> newIdentityHashSet() {
        return java.util.Collections.newSetFromMap(com.google.common.collect.Maps.newIdentityHashMap());
    }

    public static <E> java.util.concurrent.CopyOnWriteArraySet<E> newCopyOnWriteArraySet() {
        return new java.util.concurrent.CopyOnWriteArraySet<>();
    }

    public static <E> java.util.concurrent.CopyOnWriteArraySet<E> newCopyOnWriteArraySet(java.lang.Iterable<? extends E> elements) {
        java.util.Collection collectionNewArrayList;
        if (elements instanceof java.util.Collection) {
            collectionNewArrayList = (java.util.Collection) elements;
        } else {
            collectionNewArrayList = com.google.common.collect.Lists.newArrayList(elements);
        }
        return new java.util.concurrent.CopyOnWriteArraySet<>(collectionNewArrayList);
    }

    public static <E extends java.lang.Enum<E>> java.util.EnumSet<E> complementOf(java.util.Collection<E> collection) {
        if (collection instanceof java.util.EnumSet) {
            return java.util.EnumSet.complementOf((java.util.EnumSet) collection);
        }
        com.google.common.base.Preconditions.checkArgument(!collection.isEmpty(), "collection is empty; use the other version of this method");
        return makeComplementByHand(collection, collection.iterator().next().getDeclaringClass());
    }

    public static <E extends java.lang.Enum<E>> java.util.EnumSet<E> complementOf(java.util.Collection<E> collection, java.lang.Class<E> type) {
        com.google.common.base.Preconditions.checkNotNull(collection);
        if (collection instanceof java.util.EnumSet) {
            return java.util.EnumSet.complementOf((java.util.EnumSet) collection);
        }
        return makeComplementByHand(collection, type);
    }

    private static <E extends java.lang.Enum<E>> java.util.EnumSet<E> makeComplementByHand(java.util.Collection<E> collection, java.lang.Class<E> type) {
        java.util.EnumSet<E> enumSetAllOf = java.util.EnumSet.allOf(type);
        enumSetAllOf.removeAll(collection);
        return enumSetAllOf;
    }

    @java.lang.Deprecated
    public static <E> java.util.Set<E> newSetFromMap(java.util.Map<E, java.lang.Boolean> map) {
        return java.util.Collections.newSetFromMap(map);
    }

    public static abstract class SetView<E> extends java.util.AbstractSet<E> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public abstract com.google.common.collect.UnmodifiableIterator<E> iterator();

        private SetView() {
        }

        public com.google.common.collect.ImmutableSet<E> immutableCopy() {
            return com.google.common.collect.ImmutableSet.copyOf((java.util.Collection) this);
        }

        public <S extends java.util.Set<E>> S copyInto(S set) {
            set.addAll(this);
            return set;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @java.lang.Deprecated
        public final boolean add(@com.google.common.collect.ParametricNullness E e) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @java.lang.Deprecated
        public final boolean remove(@javax.annotation.CheckForNull java.lang.Object object) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @java.lang.Deprecated
        public final boolean addAll(java.util.Collection<? extends E> newElements) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @java.lang.Deprecated
        public final boolean removeAll(java.util.Collection<?> oldElements) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @java.lang.Deprecated
        public final boolean retainAll(java.util.Collection<?> elementsToKeep) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @java.lang.Deprecated
        public final void clear() {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    public static <E> com.google.common.collect.Sets.SetView<E> union(final java.util.Set<? extends E> set1, final java.util.Set<? extends E> set2) {
        com.google.common.base.Preconditions.checkNotNull(set1, "set1");
        com.google.common.base.Preconditions.checkNotNull(set2, "set2");
        return new com.google.common.collect.Sets.SetView<E>() { // from class: com.google.common.collect.Sets.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                int size = set1.size();
                java.util.Iterator<E> it = set2.iterator();
                while (it.hasNext()) {
                    if (!set1.contains(it.next())) {
                        size++;
                    }
                }
                return size;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean isEmpty() {
                return set1.isEmpty() && set2.isEmpty();
            }

            @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public com.google.common.collect.UnmodifiableIterator<E> iterator() {
                return new com.google.common.collect.AbstractIterator<E>() { // from class: com.google.common.collect.Sets.1.1
                    final java.util.Iterator<? extends E> itr1;
                    final java.util.Iterator<? extends E> itr2;

                    {
                        this.itr1 = set1.iterator();
                        this.itr2 = set2.iterator();
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    @javax.annotation.CheckForNull
                    protected E computeNext() {
                        if (this.itr1.hasNext()) {
                            return this.itr1.next();
                        }
                        while (this.itr2.hasNext()) {
                            E next = this.itr2.next();
                            if (!set1.contains(next)) {
                                return next;
                            }
                        }
                        return endOfData();
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@javax.annotation.CheckForNull java.lang.Object object) {
                return set1.contains(object) || set2.contains(object);
            }

            @Override // com.google.common.collect.Sets.SetView
            public <S extends java.util.Set<E>> S copyInto(S set) {
                set.addAll(set1);
                set.addAll(set2);
                return set;
            }

            @Override // com.google.common.collect.Sets.SetView
            public com.google.common.collect.ImmutableSet<E> immutableCopy() {
                return new com.google.common.collect.ImmutableSet.Builder().addAll((java.lang.Iterable) set1).addAll((java.lang.Iterable) set2).build();
            }
        };
    }

    public static <E> com.google.common.collect.Sets.SetView<E> intersection(final java.util.Set<E> set1, final java.util.Set<?> set2) {
        com.google.common.base.Preconditions.checkNotNull(set1, "set1");
        com.google.common.base.Preconditions.checkNotNull(set2, "set2");
        return new com.google.common.collect.Sets.SetView<E>() { // from class: com.google.common.collect.Sets.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public com.google.common.collect.UnmodifiableIterator<E> iterator() {
                return new com.google.common.collect.AbstractIterator<E>() { // from class: com.google.common.collect.Sets.2.1
                    final java.util.Iterator<E> itr;

                    {
                        this.itr = set1.iterator();
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    @javax.annotation.CheckForNull
                    protected E computeNext() {
                        while (this.itr.hasNext()) {
                            E next = this.itr.next();
                            if (set2.contains(next)) {
                                return next;
                            }
                        }
                        return endOfData();
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                java.util.Iterator<E> it = set1.iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (set2.contains(it.next())) {
                        i++;
                    }
                }
                return i;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean isEmpty() {
                return java.util.Collections.disjoint(set2, set1);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@javax.annotation.CheckForNull java.lang.Object object) {
                return set1.contains(object) && set2.contains(object);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean containsAll(java.util.Collection<?> collection) {
                return set1.containsAll(collection) && set2.containsAll(collection);
            }
        };
    }

    public static <E> com.google.common.collect.Sets.SetView<E> difference(final java.util.Set<E> set1, final java.util.Set<?> set2) {
        com.google.common.base.Preconditions.checkNotNull(set1, "set1");
        com.google.common.base.Preconditions.checkNotNull(set2, "set2");
        return new com.google.common.collect.Sets.SetView<E>() { // from class: com.google.common.collect.Sets.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public com.google.common.collect.UnmodifiableIterator<E> iterator() {
                return new com.google.common.collect.AbstractIterator<E>() { // from class: com.google.common.collect.Sets.3.1
                    final java.util.Iterator<E> itr;

                    {
                        this.itr = set1.iterator();
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    @javax.annotation.CheckForNull
                    protected E computeNext() {
                        while (this.itr.hasNext()) {
                            E next = this.itr.next();
                            if (!set2.contains(next)) {
                                return next;
                            }
                        }
                        return endOfData();
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                java.util.Iterator<E> it = set1.iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (!set2.contains(it.next())) {
                        i++;
                    }
                }
                return i;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean isEmpty() {
                return set2.containsAll(set1);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@javax.annotation.CheckForNull java.lang.Object element) {
                return set1.contains(element) && !set2.contains(element);
            }
        };
    }

    public static <E> com.google.common.collect.Sets.SetView<E> symmetricDifference(final java.util.Set<? extends E> set1, final java.util.Set<? extends E> set2) {
        com.google.common.base.Preconditions.checkNotNull(set1, "set1");
        com.google.common.base.Preconditions.checkNotNull(set2, "set2");
        return new com.google.common.collect.Sets.SetView<E>() { // from class: com.google.common.collect.Sets.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public com.google.common.collect.UnmodifiableIterator<E> iterator() {
                final java.util.Iterator<E> it = set1.iterator();
                final java.util.Iterator<E> it2 = set2.iterator();
                return new com.google.common.collect.AbstractIterator<E>() { // from class: com.google.common.collect.Sets.4.1
                    @Override // com.google.common.collect.AbstractIterator
                    @javax.annotation.CheckForNull
                    public E computeNext() {
                        while (it.hasNext()) {
                            E e = (E) it.next();
                            if (!set2.contains(e)) {
                                return e;
                            }
                        }
                        while (it2.hasNext()) {
                            E e2 = (E) it2.next();
                            if (!set1.contains(e2)) {
                                return e2;
                            }
                        }
                        return endOfData();
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                java.util.Iterator<E> it = set1.iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (!set2.contains(it.next())) {
                        i++;
                    }
                }
                java.util.Iterator<E> it2 = set2.iterator();
                while (it2.hasNext()) {
                    if (!set1.contains(it2.next())) {
                        i++;
                    }
                }
                return i;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean isEmpty() {
                return set1.equals(set2);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@javax.annotation.CheckForNull java.lang.Object element) {
                return set2.contains(element) ^ set1.contains(element);
            }
        };
    }

    public static <E> java.util.Set<E> filter(java.util.Set<E> unfiltered, com.google.common.base.Predicate<? super E> predicate) {
        if (unfiltered instanceof java.util.SortedSet) {
            return filter((java.util.SortedSet) unfiltered, (com.google.common.base.Predicate) predicate);
        }
        if (unfiltered instanceof com.google.common.collect.Sets.FilteredSet) {
            com.google.common.collect.Sets.FilteredSet filteredSet = (com.google.common.collect.Sets.FilteredSet) unfiltered;
            return new com.google.common.collect.Sets.FilteredSet((java.util.Set) filteredSet.unfiltered, com.google.common.base.Predicates.and(filteredSet.predicate, predicate));
        }
        return new com.google.common.collect.Sets.FilteredSet((java.util.Set) com.google.common.base.Preconditions.checkNotNull(unfiltered), (com.google.common.base.Predicate) com.google.common.base.Preconditions.checkNotNull(predicate));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> java.util.SortedSet<E> filter(java.util.SortedSet<E> unfiltered, com.google.common.base.Predicate<? super E> predicate) {
        if (unfiltered instanceof com.google.common.collect.Sets.FilteredSet) {
            com.google.common.collect.Sets.FilteredSet filteredSet = (com.google.common.collect.Sets.FilteredSet) unfiltered;
            return new com.google.common.collect.Sets.FilteredSortedSet((java.util.SortedSet) filteredSet.unfiltered, com.google.common.base.Predicates.and(filteredSet.predicate, predicate));
        }
        return new com.google.common.collect.Sets.FilteredSortedSet((java.util.SortedSet) com.google.common.base.Preconditions.checkNotNull(unfiltered), (com.google.common.base.Predicate) com.google.common.base.Preconditions.checkNotNull(predicate));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> java.util.NavigableSet<E> filter(java.util.NavigableSet<E> unfiltered, com.google.common.base.Predicate<? super E> predicate) {
        if (unfiltered instanceof com.google.common.collect.Sets.FilteredSet) {
            com.google.common.collect.Sets.FilteredSet filteredSet = (com.google.common.collect.Sets.FilteredSet) unfiltered;
            return new com.google.common.collect.Sets.FilteredNavigableSet((java.util.NavigableSet) filteredSet.unfiltered, com.google.common.base.Predicates.and(filteredSet.predicate, predicate));
        }
        return new com.google.common.collect.Sets.FilteredNavigableSet((java.util.NavigableSet) com.google.common.base.Preconditions.checkNotNull(unfiltered), (com.google.common.base.Predicate) com.google.common.base.Preconditions.checkNotNull(predicate));
    }

    private static class FilteredSet<E> extends com.google.common.collect.Collections2.FilteredCollection<E> implements java.util.Set<E> {
        FilteredSet(java.util.Set<E> unfiltered, com.google.common.base.Predicate<? super E> predicate) {
            super(unfiltered, predicate);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
            return com.google.common.collect.Sets.equalsImpl(this, object);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return com.google.common.collect.Sets.hashCodeImpl(this);
        }
    }

    private static class FilteredSortedSet<E> extends com.google.common.collect.Sets.FilteredSet<E> implements java.util.SortedSet<E> {
        FilteredSortedSet(java.util.SortedSet<E> unfiltered, com.google.common.base.Predicate<? super E> predicate) {
            super(unfiltered, predicate);
        }

        @Override // java.util.SortedSet
        @javax.annotation.CheckForNull
        public java.util.Comparator<? super E> comparator() {
            return ((java.util.SortedSet) this.unfiltered).comparator();
        }

        @Override // java.util.SortedSet
        public java.util.SortedSet<E> subSet(@com.google.common.collect.ParametricNullness E fromElement, @com.google.common.collect.ParametricNullness E toElement) {
            return new com.google.common.collect.Sets.FilteredSortedSet(((java.util.SortedSet) this.unfiltered).subSet(fromElement, toElement), this.predicate);
        }

        @Override // java.util.SortedSet
        public java.util.SortedSet<E> headSet(@com.google.common.collect.ParametricNullness E toElement) {
            return new com.google.common.collect.Sets.FilteredSortedSet(((java.util.SortedSet) this.unfiltered).headSet(toElement), this.predicate);
        }

        @Override // java.util.SortedSet
        public java.util.SortedSet<E> tailSet(@com.google.common.collect.ParametricNullness E fromElement) {
            return new com.google.common.collect.Sets.FilteredSortedSet(((java.util.SortedSet) this.unfiltered).tailSet(fromElement), this.predicate);
        }

        @Override // java.util.SortedSet
        @com.google.common.collect.ParametricNullness
        public E first() {
            return (E) com.google.common.collect.Iterators.find(this.unfiltered.iterator(), this.predicate);
        }

        @com.google.common.collect.ParametricNullness
        public E last() {
            java.util.SortedSet sortedSetHeadSet = (java.util.SortedSet) this.unfiltered;
            while (true) {
                E e = (java.lang.Object) sortedSetHeadSet.last();
                if (this.predicate.apply(e)) {
                    return e;
                }
                sortedSetHeadSet = sortedSetHeadSet.headSet(e);
            }
        }
    }

    private static class FilteredNavigableSet<E> extends com.google.common.collect.Sets.FilteredSortedSet<E> implements java.util.NavigableSet<E> {
        FilteredNavigableSet(java.util.NavigableSet<E> unfiltered, com.google.common.base.Predicate<? super E> predicate) {
            super(unfiltered, predicate);
        }

        java.util.NavigableSet<E> unfiltered() {
            return (java.util.NavigableSet) this.unfiltered;
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public E lower(@com.google.common.collect.ParametricNullness E e) {
            return (E) com.google.common.collect.Iterators.find(unfiltered().headSet(e, false).descendingIterator(), this.predicate, null);
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public E floor(@com.google.common.collect.ParametricNullness E e) {
            return (E) com.google.common.collect.Iterators.find(unfiltered().headSet(e, true).descendingIterator(), this.predicate, null);
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public E ceiling(@com.google.common.collect.ParametricNullness E e) {
            return (E) com.google.common.collect.Iterables.find(unfiltered().tailSet(e, true), this.predicate, null);
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public E higher(@com.google.common.collect.ParametricNullness E e) {
            return (E) com.google.common.collect.Iterables.find(unfiltered().tailSet(e, false), this.predicate, null);
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public E pollFirst() {
            return (E) com.google.common.collect.Iterables.removeFirstMatching(unfiltered(), this.predicate);
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public E pollLast() {
            return (E) com.google.common.collect.Iterables.removeFirstMatching(unfiltered().descendingSet(), this.predicate);
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<E> descendingSet() {
            return com.google.common.collect.Sets.filter((java.util.NavigableSet) unfiltered().descendingSet(), (com.google.common.base.Predicate) this.predicate);
        }

        @Override // java.util.NavigableSet
        public java.util.Iterator<E> descendingIterator() {
            return com.google.common.collect.Iterators.filter(unfiltered().descendingIterator(), this.predicate);
        }

        @Override // com.google.common.collect.Sets.FilteredSortedSet, java.util.SortedSet
        @com.google.common.collect.ParametricNullness
        public E last() {
            return (E) com.google.common.collect.Iterators.find(unfiltered().descendingIterator(), this.predicate);
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<E> subSet(@com.google.common.collect.ParametricNullness E fromElement, boolean fromInclusive, @com.google.common.collect.ParametricNullness E toElement, boolean toInclusive) {
            return com.google.common.collect.Sets.filter((java.util.NavigableSet) unfiltered().subSet(fromElement, fromInclusive, toElement, toInclusive), (com.google.common.base.Predicate) this.predicate);
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<E> headSet(@com.google.common.collect.ParametricNullness E toElement, boolean inclusive) {
            return com.google.common.collect.Sets.filter((java.util.NavigableSet) unfiltered().headSet(toElement, inclusive), (com.google.common.base.Predicate) this.predicate);
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<E> tailSet(@com.google.common.collect.ParametricNullness E fromElement, boolean inclusive) {
            return com.google.common.collect.Sets.filter((java.util.NavigableSet) unfiltered().tailSet(fromElement, inclusive), (com.google.common.base.Predicate) this.predicate);
        }
    }

    public static <B> java.util.Set<java.util.List<B>> cartesianProduct(java.util.List<? extends java.util.Set<? extends B>> sets) {
        return com.google.common.collect.Sets.CartesianSet.create(sets);
    }

    @java.lang.SafeVarargs
    public static <B> java.util.Set<java.util.List<B>> cartesianProduct(java.util.Set<? extends B>... sets) {
        return cartesianProduct(java.util.Arrays.asList(sets));
    }

    private static final class CartesianSet<E> extends com.google.common.collect.ForwardingCollection<java.util.List<E>> implements java.util.Set<java.util.List<E>> {
        private final transient com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableSet<E>> axes;
        private final transient com.google.common.collect.CartesianList<E> delegate;

        static <E> java.util.Set<java.util.List<E>> create(java.util.List<? extends java.util.Set<? extends E>> sets) {
            com.google.common.collect.ImmutableList.Builder builder = new com.google.common.collect.ImmutableList.Builder(sets.size());
            java.util.Iterator<? extends java.util.Set<? extends E>> it = sets.iterator();
            while (it.hasNext()) {
                com.google.common.collect.ImmutableSet immutableSetCopyOf = com.google.common.collect.ImmutableSet.copyOf((java.util.Collection) it.next());
                if (immutableSetCopyOf.isEmpty()) {
                    return com.google.common.collect.ImmutableSet.of();
                }
                builder.add(immutableSetCopyOf);
            }
            final com.google.common.collect.ImmutableList<E> immutableListBuild = builder.build();
            return new com.google.common.collect.Sets.CartesianSet(immutableListBuild, new com.google.common.collect.CartesianList(new com.google.common.collect.ImmutableList<java.util.List<E>>() { // from class: com.google.common.collect.Sets.CartesianSet.1
                @Override // com.google.common.collect.ImmutableCollection
                boolean isPartialView() {
                    return true;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public int size() {
                    return immutableListBuild.size();
                }

                @Override // java.util.List
                public java.util.List<E> get(int i) {
                    return ((com.google.common.collect.ImmutableSet) immutableListBuild.get(i)).asList();
                }

                @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
                java.lang.Object writeReplace() {
                    return super.writeReplace();
                }
            }));
        }

        private CartesianSet(com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableSet<E>> axes, com.google.common.collect.CartesianList<E> delegate) {
            this.axes = axes;
            this.delegate = delegate;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public java.util.Collection<java.util.List<E>> delegate() {
            return this.delegate;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object object) {
            if (!(object instanceof java.util.List)) {
                return false;
            }
            java.util.List list = (java.util.List) object;
            if (list.size() != this.axes.size()) {
                return false;
            }
            java.util.Iterator<E> it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (!this.axes.get(i).contains(it.next())) {
                    return false;
                }
                i++;
            }
            return true;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
            if (object instanceof com.google.common.collect.Sets.CartesianSet) {
                return this.axes.equals(((com.google.common.collect.Sets.CartesianSet) object).axes);
            }
            if (!(object instanceof java.util.Set)) {
                return false;
            }
            java.util.Set set = (java.util.Set) object;
            return size() == set.size() && containsAll(set);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            int i = 1;
            int size = size() - 1;
            for (int i2 = 0; i2 < this.axes.size(); i2++) {
                size = ~(~(size * 31));
            }
            com.google.common.collect.UnmodifiableIterator<com.google.common.collect.ImmutableSet<E>> it = this.axes.iterator();
            while (it.hasNext()) {
                com.google.common.collect.ImmutableSet<E> next = it.next();
                i = ~(~((i * 31) + ((size() / next.size()) * next.hashCode())));
            }
            return ~(~(i + size));
        }
    }

    public static <E> java.util.Set<java.util.Set<E>> powerSet(java.util.Set<E> set) {
        return new com.google.common.collect.Sets.PowerSet(set);
    }

    private static final class SubSet<E> extends java.util.AbstractSet<E> {
        private final com.google.common.collect.ImmutableMap<E, java.lang.Integer> inputSet;
        private final int mask;

        SubSet(com.google.common.collect.ImmutableMap<E, java.lang.Integer> inputSet, int mask) {
            this.inputSet = inputSet;
            this.mask = mask;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<E> iterator() {
            return new com.google.common.collect.UnmodifiableIterator<E>() { // from class: com.google.common.collect.Sets.SubSet.1
                final com.google.common.collect.ImmutableList<E> elements;
                int remainingSetBits;

                {
                    this.elements = com.google.common.collect.Sets.SubSet.this.inputSet.keySet().asList();
                    this.remainingSetBits = com.google.common.collect.Sets.SubSet.this.mask;
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return this.remainingSetBits != 0;
                }

                @Override // java.util.Iterator
                public E next() {
                    int iNumberOfTrailingZeros = java.lang.Integer.numberOfTrailingZeros(this.remainingSetBits);
                    if (iNumberOfTrailingZeros == 32) {
                        throw new java.util.NoSuchElementException();
                    }
                    this.remainingSetBits &= ~(1 << iNumberOfTrailingZeros);
                    return this.elements.get(iNumberOfTrailingZeros);
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return java.lang.Integer.bitCount(this.mask);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object o) {
            java.lang.Integer num = this.inputSet.get(o);
            if (num != null) {
                if (((1 << num.intValue()) & this.mask) != 0) {
                    return true;
                }
            }
            return false;
        }
    }

    private static final class PowerSet<E> extends java.util.AbstractSet<java.util.Set<E>> {
        final com.google.common.collect.ImmutableMap<E, java.lang.Integer> inputSet;

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return false;
        }

        PowerSet(java.util.Set<E> input) {
            com.google.common.base.Preconditions.checkArgument(input.size() <= 30, "Too many elements to create power set: %s > 30", input.size());
            this.inputSet = com.google.common.collect.Maps.indexMap(input);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return 1 << this.inputSet.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<java.util.Set<E>> iterator() {
            return new com.google.common.collect.AbstractIndexedListIterator<java.util.Set<E>>(size()) { // from class: com.google.common.collect.Sets.PowerSet.1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractIndexedListIterator
                public java.util.Set<E> get(final int setBits) {
                    return new com.google.common.collect.Sets.SubSet(com.google.common.collect.Sets.PowerSet.this.inputSet, setBits);
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object obj) {
            if (!(obj instanceof java.util.Set)) {
                return false;
            }
            return this.inputSet.keySet().containsAll((java.util.Set) obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
            if (obj instanceof com.google.common.collect.Sets.PowerSet) {
                return this.inputSet.keySet().equals(((com.google.common.collect.Sets.PowerSet) obj).inputSet.keySet());
            }
            return super.equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return this.inputSet.keySet().hashCode() << (this.inputSet.size() - 1);
        }

        @Override // java.util.AbstractCollection
        public java.lang.String toString() {
            return "powerSet(" + this.inputSet + ")";
        }
    }

    public static <E> java.util.Set<java.util.Set<E>> combinations(java.util.Set<E> set, final int size) {
        com.google.common.collect.ImmutableMap immutableMapIndexMap = com.google.common.collect.Maps.indexMap(set);
        com.google.common.collect.CollectPreconditions.checkNonnegative(size, "size");
        com.google.common.base.Preconditions.checkArgument(size <= immutableMapIndexMap.size(), "size (%s) must be <= set.size() (%s)", size, immutableMapIndexMap.size());
        if (size == 0) {
            return com.google.common.collect.ImmutableSet.of(com.google.common.collect.ImmutableSet.of());
        }
        if (size == immutableMapIndexMap.size()) {
            return com.google.common.collect.ImmutableSet.of(immutableMapIndexMap.keySet());
        }
        return new com.google.common.collect.Sets.AnonymousClass5(size, immutableMapIndexMap);
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: com.google.common.collect.Sets$5, reason: invalid class name */
    class AnonymousClass5<E> extends java.util.AbstractSet<java.util.Set<E>> {
        final /* synthetic */ com.google.common.collect.ImmutableMap val$index;
        final /* synthetic */ int val$size;

        AnonymousClass5(final int val$size, final com.google.common.collect.ImmutableMap val$index) {
            this.val$size = val$size;
            this.val$index = val$index;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object o) {
            if (!(o instanceof java.util.Set)) {
                return false;
            }
            java.util.Set set = (java.util.Set) o;
            return set.size() == this.val$size && this.val$index.keySet().containsAll(set);
        }

        /* JADX INFO: renamed from: com.google.common.collect.Sets$5$1, reason: invalid class name */
        class AnonymousClass1 extends com.google.common.collect.AbstractIterator<java.util.Set<E>> {
            final java.util.BitSet bits;

            AnonymousClass1() {
                this.bits = new java.util.BitSet(com.google.common.collect.Sets.AnonymousClass5.this.val$index.size());
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.AbstractIterator
            @javax.annotation.CheckForNull
            public java.util.Set<E> computeNext() {
                if (this.bits.isEmpty()) {
                    this.bits.set(0, com.google.common.collect.Sets.AnonymousClass5.this.val$size);
                } else {
                    int iNextSetBit = this.bits.nextSetBit(0);
                    int iNextClearBit = this.bits.nextClearBit(iNextSetBit);
                    if (iNextClearBit == com.google.common.collect.Sets.AnonymousClass5.this.val$index.size()) {
                        return endOfData();
                    }
                    int i = (iNextClearBit - iNextSetBit) - 1;
                    this.bits.set(0, i);
                    this.bits.clear(i, iNextClearBit);
                    this.bits.set(iNextClearBit);
                }
                final java.util.BitSet bitSet = (java.util.BitSet) this.bits.clone();
                return new java.util.AbstractSet<E>() { // from class: com.google.common.collect.Sets.5.1.1
                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                    public boolean contains(@javax.annotation.CheckForNull java.lang.Object o) {
                        java.lang.Integer num = (java.lang.Integer) com.google.common.collect.Sets.AnonymousClass5.this.val$index.get(o);
                        return num != null && bitSet.get(num.intValue());
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                    public java.util.Iterator<E> iterator() {
                        return new com.google.common.collect.AbstractIterator<E>() { // from class: com.google.common.collect.Sets.5.1.1.1
                            int i = -1;

                            @Override // com.google.common.collect.AbstractIterator
                            @javax.annotation.CheckForNull
                            protected E computeNext() {
                                int iNextSetBit2 = bitSet.nextSetBit(this.i + 1);
                                this.i = iNextSetBit2;
                                if (iNextSetBit2 == -1) {
                                    return endOfData();
                                }
                                return com.google.common.collect.Sets.AnonymousClass5.this.val$index.keySet().asList().get(this.i);
                            }
                        };
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                    public int size() {
                        return com.google.common.collect.Sets.AnonymousClass5.this.val$size;
                    }
                };
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<java.util.Set<E>> iterator() {
            return new com.google.common.collect.Sets.AnonymousClass5.AnonymousClass1();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return com.google.common.math.IntMath.binomial(this.val$index.size(), this.val$size);
        }

        @Override // java.util.AbstractCollection
        public java.lang.String toString() {
            return "Sets.combinations(" + this.val$index.keySet() + ", " + this.val$size + ")";
        }
    }

    static int hashCodeImpl(java.util.Set<?> s) {
        java.util.Iterator<?> it = s.iterator();
        int i = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    static boolean equalsImpl(java.util.Set<?> s, @javax.annotation.CheckForNull java.lang.Object object) {
        if (s == object) {
            return true;
        }
        if (object instanceof java.util.Set) {
            java.util.Set set = (java.util.Set) object;
            try {
                return s.size() == set.size() && s.containsAll(set);
            } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            }
        }
        return false;
    }

    public static <E> java.util.NavigableSet<E> unmodifiableNavigableSet(java.util.NavigableSet<E> set) {
        return ((set instanceof com.google.common.collect.ImmutableCollection) || (set instanceof com.google.common.collect.Sets.UnmodifiableNavigableSet)) ? set : new com.google.common.collect.Sets.UnmodifiableNavigableSet(set);
    }

    static final class UnmodifiableNavigableSet<E> extends com.google.common.collect.ForwardingSortedSet<E> implements java.util.NavigableSet<E>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final java.util.NavigableSet<E> delegate;

        @javax.annotation.CheckForNull
        @com.google.errorprone.annotations.concurrent.LazyInit
        private transient com.google.common.collect.Sets.UnmodifiableNavigableSet<E> descendingSet;
        private final java.util.SortedSet<E> unmodifiableDelegate;

        UnmodifiableNavigableSet(java.util.NavigableSet<E> delegate) {
            this.delegate = (java.util.NavigableSet) com.google.common.base.Preconditions.checkNotNull(delegate);
            this.unmodifiableDelegate = java.util.Collections.unmodifiableSortedSet(delegate);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public java.util.SortedSet<E> delegate() {
            return this.unmodifiableDelegate;
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public E lower(@com.google.common.collect.ParametricNullness E e) {
            return this.delegate.lower(e);
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public E floor(@com.google.common.collect.ParametricNullness E e) {
            return this.delegate.floor(e);
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public E ceiling(@com.google.common.collect.ParametricNullness E e) {
            return this.delegate.ceiling(e);
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public E higher(@com.google.common.collect.ParametricNullness E e) {
            return this.delegate.higher(e);
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public E pollFirst() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public E pollLast() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<E> descendingSet() {
            com.google.common.collect.Sets.UnmodifiableNavigableSet<E> unmodifiableNavigableSet = this.descendingSet;
            if (unmodifiableNavigableSet != null) {
                return unmodifiableNavigableSet;
            }
            com.google.common.collect.Sets.UnmodifiableNavigableSet<E> unmodifiableNavigableSet2 = new com.google.common.collect.Sets.UnmodifiableNavigableSet<>(this.delegate.descendingSet());
            this.descendingSet = unmodifiableNavigableSet2;
            unmodifiableNavigableSet2.descendingSet = this;
            return unmodifiableNavigableSet2;
        }

        @Override // java.util.NavigableSet
        public java.util.Iterator<E> descendingIterator() {
            return com.google.common.collect.Iterators.unmodifiableIterator(this.delegate.descendingIterator());
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<E> subSet(@com.google.common.collect.ParametricNullness E fromElement, boolean fromInclusive, @com.google.common.collect.ParametricNullness E toElement, boolean toInclusive) {
            return com.google.common.collect.Sets.unmodifiableNavigableSet(this.delegate.subSet(fromElement, fromInclusive, toElement, toInclusive));
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<E> headSet(@com.google.common.collect.ParametricNullness E toElement, boolean inclusive) {
            return com.google.common.collect.Sets.unmodifiableNavigableSet(this.delegate.headSet(toElement, inclusive));
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<E> tailSet(@com.google.common.collect.ParametricNullness E fromElement, boolean inclusive) {
            return com.google.common.collect.Sets.unmodifiableNavigableSet(this.delegate.tailSet(fromElement, inclusive));
        }
    }

    public static <E> java.util.NavigableSet<E> synchronizedNavigableSet(java.util.NavigableSet<E> navigableSet) {
        return com.google.common.collect.Synchronized.navigableSet(navigableSet);
    }

    static boolean removeAllImpl(java.util.Set<?> set, java.util.Iterator<?> iterator) {
        boolean zRemove = false;
        while (iterator.hasNext()) {
            zRemove |= set.remove(iterator.next());
        }
        return zRemove;
    }

    static boolean removeAllImpl(java.util.Set<?> set, java.util.Collection<?> collection) {
        com.google.common.base.Preconditions.checkNotNull(collection);
        if (collection instanceof com.google.common.collect.Multiset) {
            collection = ((com.google.common.collect.Multiset) collection).elementSet();
        }
        if ((collection instanceof java.util.Set) && collection.size() > set.size()) {
            return com.google.common.collect.Iterators.removeAll(set.iterator(), collection);
        }
        return removeAllImpl(set, collection.iterator());
    }

    static class DescendingSet<E> extends com.google.common.collect.ForwardingNavigableSet<E> {
        private final java.util.NavigableSet<E> forward;

        DescendingSet(java.util.NavigableSet<E> forward) {
            this.forward = forward;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public java.util.NavigableSet<E> delegate() {
            return this.forward;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        @javax.annotation.CheckForNull
        public E lower(@com.google.common.collect.ParametricNullness E e) {
            return this.forward.higher(e);
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        @javax.annotation.CheckForNull
        public E floor(@com.google.common.collect.ParametricNullness E e) {
            return this.forward.ceiling(e);
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        @javax.annotation.CheckForNull
        public E ceiling(@com.google.common.collect.ParametricNullness E e) {
            return this.forward.floor(e);
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        @javax.annotation.CheckForNull
        public E higher(@com.google.common.collect.ParametricNullness E e) {
            return this.forward.lower(e);
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        @javax.annotation.CheckForNull
        public E pollFirst() {
            return this.forward.pollLast();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        @javax.annotation.CheckForNull
        public E pollLast() {
            return this.forward.pollFirst();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public java.util.NavigableSet<E> descendingSet() {
            return this.forward;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public java.util.Iterator<E> descendingIterator() {
            return this.forward.iterator();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public java.util.NavigableSet<E> subSet(@com.google.common.collect.ParametricNullness E fromElement, boolean fromInclusive, @com.google.common.collect.ParametricNullness E toElement, boolean toInclusive) {
            return this.forward.subSet(toElement, toInclusive, fromElement, fromInclusive).descendingSet();
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public java.util.SortedSet<E> subSet(@com.google.common.collect.ParametricNullness E fromElement, @com.google.common.collect.ParametricNullness E toElement) {
            return standardSubSet(fromElement, toElement);
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public java.util.NavigableSet<E> headSet(@com.google.common.collect.ParametricNullness E toElement, boolean inclusive) {
            return this.forward.tailSet(toElement, inclusive).descendingSet();
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public java.util.SortedSet<E> headSet(@com.google.common.collect.ParametricNullness E toElement) {
            return standardHeadSet(toElement);
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public java.util.NavigableSet<E> tailSet(@com.google.common.collect.ParametricNullness E fromElement, boolean inclusive) {
            return this.forward.headSet(fromElement, inclusive).descendingSet();
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public java.util.SortedSet<E> tailSet(@com.google.common.collect.ParametricNullness E fromElement) {
            return standardTailSet(fromElement);
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public java.util.Comparator<? super E> comparator() {
            java.util.Comparator<? super E> comparator = this.forward.comparator();
            if (comparator == null) {
                return com.google.common.collect.Ordering.natural().reverse();
            }
            return reverse(comparator);
        }

        private static <T> com.google.common.collect.Ordering<T> reverse(java.util.Comparator<T> forward) {
            return com.google.common.collect.Ordering.from(forward).reverse();
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        @com.google.common.collect.ParametricNullness
        public E first() {
            return this.forward.last();
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        @com.google.common.collect.ParametricNullness
        public E last() {
            return this.forward.first();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<E> iterator() {
            return this.forward.descendingIterator();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public java.lang.Object[] toArray() {
            return standardToArray();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) standardToArray(tArr);
        }

        @Override // com.google.common.collect.ForwardingObject
        public java.lang.String toString() {
            return standardToString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K extends java.lang.Comparable<? super K>> java.util.NavigableSet<K> subSet(java.util.NavigableSet<K> set, com.google.common.collect.Range<K> range) {
        if (set.comparator() != null && set.comparator() != com.google.common.collect.Ordering.natural() && range.hasLowerBound() && range.hasUpperBound()) {
            com.google.common.base.Preconditions.checkArgument(set.comparator().compare(range.lowerEndpoint(), range.upperEndpoint()) <= 0, "set is using a custom comparator which is inconsistent with the natural ordering.");
        }
        if (range.hasLowerBound() && range.hasUpperBound()) {
            return set.subSet(range.lowerEndpoint(), range.lowerBoundType() == com.google.common.collect.BoundType.CLOSED, range.upperEndpoint(), range.upperBoundType() == com.google.common.collect.BoundType.CLOSED);
        }
        if (range.hasLowerBound()) {
            return set.tailSet(range.lowerEndpoint(), range.lowerBoundType() == com.google.common.collect.BoundType.CLOSED);
        }
        if (range.hasUpperBound()) {
            return set.headSet(range.upperEndpoint(), range.upperBoundType() == com.google.common.collect.BoundType.CLOSED);
        }
        return (java.util.NavigableSet) com.google.common.base.Preconditions.checkNotNull(set);
    }
}
