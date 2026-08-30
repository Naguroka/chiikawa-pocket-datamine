package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public final class Iterables {
    private Iterables() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> java.lang.Iterable<T> unmodifiableIterable(final java.lang.Iterable<? extends T> iterable) {
        com.google.common.base.Preconditions.checkNotNull(iterable);
        return ((iterable instanceof com.google.common.collect.Iterables.UnmodifiableIterable) || (iterable instanceof com.google.common.collect.ImmutableCollection)) ? iterable : new com.google.common.collect.Iterables.UnmodifiableIterable(iterable);
    }

    @java.lang.Deprecated
    public static <E> java.lang.Iterable<E> unmodifiableIterable(com.google.common.collect.ImmutableCollection<E> iterable) {
        return (java.lang.Iterable) com.google.common.base.Preconditions.checkNotNull(iterable);
    }

    private static final class UnmodifiableIterable<T> extends com.google.common.collect.FluentIterable<T> {
        private final java.lang.Iterable<? extends T> iterable;

        private UnmodifiableIterable(java.lang.Iterable<? extends T> iterable) {
            this.iterable = iterable;
        }

        @Override // java.lang.Iterable
        public java.util.Iterator<T> iterator() {
            return com.google.common.collect.Iterators.unmodifiableIterator(this.iterable.iterator());
        }

        @Override // com.google.common.collect.FluentIterable
        public java.lang.String toString() {
            return this.iterable.toString();
        }
    }

    public static int size(java.lang.Iterable<?> iterable) {
        if (iterable instanceof java.util.Collection) {
            return ((java.util.Collection) iterable).size();
        }
        return com.google.common.collect.Iterators.size(iterable.iterator());
    }

    public static boolean contains(java.lang.Iterable<? extends java.lang.Object> iterable, @javax.annotation.CheckForNull java.lang.Object element) {
        if (iterable instanceof java.util.Collection) {
            return com.google.common.collect.Collections2.safeContains((java.util.Collection) iterable, element);
        }
        return com.google.common.collect.Iterators.contains(iterable.iterator(), element);
    }

    public static boolean removeAll(java.lang.Iterable<?> removeFrom, java.util.Collection<?> elementsToRemove) {
        if (removeFrom instanceof java.util.Collection) {
            return ((java.util.Collection) removeFrom).removeAll((java.util.Collection) com.google.common.base.Preconditions.checkNotNull(elementsToRemove));
        }
        return com.google.common.collect.Iterators.removeAll(removeFrom.iterator(), elementsToRemove);
    }

    public static boolean retainAll(java.lang.Iterable<?> removeFrom, java.util.Collection<?> elementsToRetain) {
        if (removeFrom instanceof java.util.Collection) {
            return ((java.util.Collection) removeFrom).retainAll((java.util.Collection) com.google.common.base.Preconditions.checkNotNull(elementsToRetain));
        }
        return com.google.common.collect.Iterators.retainAll(removeFrom.iterator(), elementsToRetain);
    }

    public static <T> boolean removeIf(java.lang.Iterable<T> removeFrom, com.google.common.base.Predicate<? super T> predicate) {
        if ((removeFrom instanceof java.util.RandomAccess) && (removeFrom instanceof java.util.List)) {
            return removeIfFromRandomAccessList((java.util.List) removeFrom, (com.google.common.base.Predicate) com.google.common.base.Preconditions.checkNotNull(predicate));
        }
        return com.google.common.collect.Iterators.removeIf(removeFrom.iterator(), predicate);
    }

    private static <T> boolean removeIfFromRandomAccessList(java.util.List<T> list, com.google.common.base.Predicate<? super T> predicate) {
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            T t = list.get(i);
            if (!predicate.apply(t)) {
                if (i > i2) {
                    try {
                        list.set(i2, t);
                    } catch (java.lang.IllegalArgumentException unused) {
                        slowRemoveIfForRemainingElements(list, predicate, i2, i);
                        return true;
                    } catch (java.lang.UnsupportedOperationException unused2) {
                        slowRemoveIfForRemainingElements(list, predicate, i2, i);
                        return true;
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
        return i != i2;
    }

    private static <T> void slowRemoveIfForRemainingElements(java.util.List<T> list, com.google.common.base.Predicate<? super T> predicate, int to, int from) {
        for (int size = list.size() - 1; size > from; size--) {
            if (predicate.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i = from - 1; i >= to; i--) {
            list.remove(i);
        }
    }

    @javax.annotation.CheckForNull
    static <T> T removeFirstMatching(java.lang.Iterable<T> removeFrom, com.google.common.base.Predicate<? super T> predicate) {
        com.google.common.base.Preconditions.checkNotNull(predicate);
        java.util.Iterator<T> it = removeFrom.iterator();
        while (it.hasNext()) {
            T next = it.next();
            if (predicate.apply(next)) {
                it.remove();
                return next;
            }
        }
        return null;
    }

    public static boolean elementsEqual(java.lang.Iterable<?> iterable1, java.lang.Iterable<?> iterable2) {
        if ((iterable1 instanceof java.util.Collection) && (iterable2 instanceof java.util.Collection) && ((java.util.Collection) iterable1).size() != ((java.util.Collection) iterable2).size()) {
            return false;
        }
        return com.google.common.collect.Iterators.elementsEqual(iterable1.iterator(), iterable2.iterator());
    }

    public static java.lang.String toString(java.lang.Iterable<?> iterable) {
        return com.google.common.collect.Iterators.toString(iterable.iterator());
    }

    @com.google.common.collect.ParametricNullness
    public static <T> T getOnlyElement(java.lang.Iterable<T> iterable) {
        return (T) com.google.common.collect.Iterators.getOnlyElement(iterable.iterator());
    }

    @com.google.common.collect.ParametricNullness
    public static <T> T getOnlyElement(java.lang.Iterable<? extends T> iterable, @com.google.common.collect.ParametricNullness T t) {
        return (T) com.google.common.collect.Iterators.getOnlyElement(iterable.iterator(), t);
    }

    public static <T> T[] toArray(java.lang.Iterable<? extends T> iterable, java.lang.Class<T> cls) {
        return (T[]) toArray(iterable, com.google.common.collect.ObjectArrays.newArray(cls, 0));
    }

    static <T> T[] toArray(java.lang.Iterable<? extends T> iterable, T[] tArr) {
        return (T[]) castOrCopyToCollection(iterable).toArray(tArr);
    }

    static java.lang.Object[] toArray(java.lang.Iterable<?> iterable) {
        return castOrCopyToCollection(iterable).toArray();
    }

    private static <E> java.util.Collection<E> castOrCopyToCollection(java.lang.Iterable<E> iterable) {
        if (iterable instanceof java.util.Collection) {
            return (java.util.Collection) iterable;
        }
        return com.google.common.collect.Lists.newArrayList(iterable.iterator());
    }

    public static <T> boolean addAll(java.util.Collection<T> addTo, java.lang.Iterable<? extends T> elementsToAdd) {
        if (elementsToAdd instanceof java.util.Collection) {
            return addTo.addAll((java.util.Collection) elementsToAdd);
        }
        return com.google.common.collect.Iterators.addAll(addTo, ((java.lang.Iterable) com.google.common.base.Preconditions.checkNotNull(elementsToAdd)).iterator());
    }

    public static int frequency(java.lang.Iterable<?> iterable, @javax.annotation.CheckForNull java.lang.Object obj) {
        if (iterable instanceof com.google.common.collect.Multiset) {
            return ((com.google.common.collect.Multiset) iterable).count(obj);
        }
        if (iterable instanceof java.util.Set) {
            return ((java.util.Set) iterable).contains(obj) ? 1 : 0;
        }
        return com.google.common.collect.Iterators.frequency(iterable.iterator(), obj);
    }

    public static <T> java.lang.Iterable<T> cycle(final java.lang.Iterable<T> iterable) {
        com.google.common.base.Preconditions.checkNotNull(iterable);
        return new com.google.common.collect.FluentIterable<T>() { // from class: com.google.common.collect.Iterables.1
            @Override // java.lang.Iterable
            public java.util.Iterator<T> iterator() {
                return com.google.common.collect.Iterators.cycle(iterable);
            }

            @Override // com.google.common.collect.FluentIterable
            public java.lang.String toString() {
                return iterable.toString() + " (cycled)";
            }
        };
    }

    @java.lang.SafeVarargs
    public static <T> java.lang.Iterable<T> cycle(T... elements) {
        return cycle(com.google.common.collect.Lists.newArrayList(elements));
    }

    public static <T> java.lang.Iterable<T> concat(java.lang.Iterable<? extends T> a2, java.lang.Iterable<? extends T> b) {
        return com.google.common.collect.FluentIterable.concat(a2, b);
    }

    public static <T> java.lang.Iterable<T> concat(java.lang.Iterable<? extends T> a2, java.lang.Iterable<? extends T> b, java.lang.Iterable<? extends T> c) {
        return com.google.common.collect.FluentIterable.concat(a2, b, c);
    }

    public static <T> java.lang.Iterable<T> concat(java.lang.Iterable<? extends T> a2, java.lang.Iterable<? extends T> b, java.lang.Iterable<? extends T> c, java.lang.Iterable<? extends T> d) {
        return com.google.common.collect.FluentIterable.concat(a2, b, c, d);
    }

    @java.lang.SafeVarargs
    public static <T> java.lang.Iterable<T> concat(java.lang.Iterable<? extends T>... inputs) {
        return com.google.common.collect.FluentIterable.concat(inputs);
    }

    public static <T> java.lang.Iterable<T> concat(java.lang.Iterable<? extends java.lang.Iterable<? extends T>> inputs) {
        return com.google.common.collect.FluentIterable.concat(inputs);
    }

    public static <T> java.lang.Iterable<java.util.List<T>> partition(final java.lang.Iterable<T> iterable, final int size) {
        com.google.common.base.Preconditions.checkNotNull(iterable);
        com.google.common.base.Preconditions.checkArgument(size > 0);
        return new com.google.common.collect.FluentIterable<java.util.List<T>>() { // from class: com.google.common.collect.Iterables.2
            @Override // java.lang.Iterable
            public java.util.Iterator<java.util.List<T>> iterator() {
                return com.google.common.collect.Iterators.partition(iterable.iterator(), size);
            }
        };
    }

    public static <T> java.lang.Iterable<java.util.List<T>> paddedPartition(final java.lang.Iterable<T> iterable, final int size) {
        com.google.common.base.Preconditions.checkNotNull(iterable);
        com.google.common.base.Preconditions.checkArgument(size > 0);
        return new com.google.common.collect.FluentIterable<java.util.List<T>>() { // from class: com.google.common.collect.Iterables.3
            @Override // java.lang.Iterable
            public java.util.Iterator<java.util.List<T>> iterator() {
                return com.google.common.collect.Iterators.paddedPartition(iterable.iterator(), size);
            }
        };
    }

    public static <T> java.lang.Iterable<T> filter(final java.lang.Iterable<T> unfiltered, final com.google.common.base.Predicate<? super T> retainIfTrue) {
        com.google.common.base.Preconditions.checkNotNull(unfiltered);
        com.google.common.base.Preconditions.checkNotNull(retainIfTrue);
        return new com.google.common.collect.FluentIterable<T>() { // from class: com.google.common.collect.Iterables.4
            @Override // java.lang.Iterable
            public java.util.Iterator<T> iterator() {
                return com.google.common.collect.Iterators.filter(unfiltered.iterator(), retainIfTrue);
            }
        };
    }

    public static <T> java.lang.Iterable<T> filter(final java.lang.Iterable<?> unfiltered, final java.lang.Class<T> desiredType) {
        com.google.common.base.Preconditions.checkNotNull(unfiltered);
        com.google.common.base.Preconditions.checkNotNull(desiredType);
        return filter(unfiltered, com.google.common.base.Predicates.instanceOf(desiredType));
    }

    public static <T> boolean any(java.lang.Iterable<T> iterable, com.google.common.base.Predicate<? super T> predicate) {
        return com.google.common.collect.Iterators.any(iterable.iterator(), predicate);
    }

    public static <T> boolean all(java.lang.Iterable<T> iterable, com.google.common.base.Predicate<? super T> predicate) {
        return com.google.common.collect.Iterators.all(iterable.iterator(), predicate);
    }

    @com.google.common.collect.ParametricNullness
    public static <T> T find(java.lang.Iterable<T> iterable, com.google.common.base.Predicate<? super T> predicate) {
        return (T) com.google.common.collect.Iterators.find(iterable.iterator(), predicate);
    }

    @javax.annotation.CheckForNull
    public static <T> T find(java.lang.Iterable<? extends T> iterable, com.google.common.base.Predicate<? super T> predicate, @javax.annotation.CheckForNull T t) {
        return (T) com.google.common.collect.Iterators.find(iterable.iterator(), predicate, t);
    }

    public static <T> com.google.common.base.Optional<T> tryFind(java.lang.Iterable<T> iterable, com.google.common.base.Predicate<? super T> predicate) {
        return com.google.common.collect.Iterators.tryFind(iterable.iterator(), predicate);
    }

    public static <T> int indexOf(java.lang.Iterable<T> iterable, com.google.common.base.Predicate<? super T> predicate) {
        return com.google.common.collect.Iterators.indexOf(iterable.iterator(), predicate);
    }

    public static <F, T> java.lang.Iterable<T> transform(final java.lang.Iterable<F> fromIterable, final com.google.common.base.Function<? super F, ? extends T> function) {
        com.google.common.base.Preconditions.checkNotNull(fromIterable);
        com.google.common.base.Preconditions.checkNotNull(function);
        return new com.google.common.collect.FluentIterable<T>() { // from class: com.google.common.collect.Iterables.5
            @Override // java.lang.Iterable
            public java.util.Iterator<T> iterator() {
                return com.google.common.collect.Iterators.transform(fromIterable.iterator(), function);
            }
        };
    }

    @com.google.common.collect.ParametricNullness
    public static <T> T get(java.lang.Iterable<T> iterable, int i) {
        com.google.common.base.Preconditions.checkNotNull(iterable);
        if (iterable instanceof java.util.List) {
            return (T) ((java.util.List) iterable).get(i);
        }
        return (T) com.google.common.collect.Iterators.get(iterable.iterator(), i);
    }

    @com.google.common.collect.ParametricNullness
    public static <T> T get(java.lang.Iterable<? extends T> iterable, int i, @com.google.common.collect.ParametricNullness T t) {
        com.google.common.base.Preconditions.checkNotNull(iterable);
        com.google.common.collect.Iterators.checkNonnegative(i);
        if (iterable instanceof java.util.List) {
            java.util.List listCast = com.google.common.collect.Lists.cast(iterable);
            return i < listCast.size() ? (T) listCast.get(i) : t;
        }
        java.util.Iterator<? extends T> it = iterable.iterator();
        com.google.common.collect.Iterators.advance(it, i);
        return (T) com.google.common.collect.Iterators.getNext(it, t);
    }

    @com.google.common.collect.ParametricNullness
    public static <T> T getFirst(java.lang.Iterable<? extends T> iterable, @com.google.common.collect.ParametricNullness T t) {
        return (T) com.google.common.collect.Iterators.getNext(iterable.iterator(), t);
    }

    @com.google.common.collect.ParametricNullness
    public static <T> T getLast(java.lang.Iterable<T> iterable) {
        if (iterable instanceof java.util.List) {
            java.util.List list = (java.util.List) iterable;
            if (list.isEmpty()) {
                throw new java.util.NoSuchElementException();
            }
            return (T) getLastInNonemptyList(list);
        }
        return (T) com.google.common.collect.Iterators.getLast(iterable.iterator());
    }

    @com.google.common.collect.ParametricNullness
    public static <T> T getLast(java.lang.Iterable<? extends T> iterable, @com.google.common.collect.ParametricNullness T t) {
        if (iterable instanceof java.util.Collection) {
            if (((java.util.Collection) iterable).isEmpty()) {
                return t;
            }
            if (iterable instanceof java.util.List) {
                return (T) getLastInNonemptyList(com.google.common.collect.Lists.cast(iterable));
            }
        }
        return (T) com.google.common.collect.Iterators.getLast(iterable.iterator(), t);
    }

    @com.google.common.collect.ParametricNullness
    private static <T> T getLastInNonemptyList(java.util.List<T> list) {
        return list.get(list.size() - 1);
    }

    public static <T> java.lang.Iterable<T> skip(final java.lang.Iterable<T> iterable, final int numberToSkip) {
        com.google.common.base.Preconditions.checkNotNull(iterable);
        com.google.common.base.Preconditions.checkArgument(numberToSkip >= 0, "number to skip cannot be negative");
        return new com.google.common.collect.FluentIterable<T>() { // from class: com.google.common.collect.Iterables.6
            @Override // java.lang.Iterable
            public java.util.Iterator<T> iterator() {
                java.lang.Iterable iterable2 = iterable;
                if (iterable2 instanceof java.util.List) {
                    java.util.List list = (java.util.List) iterable2;
                    return list.subList(java.lang.Math.min(list.size(), numberToSkip), list.size()).iterator();
                }
                final java.util.Iterator<T> it = iterable2.iterator();
                com.google.common.collect.Iterators.advance(it, numberToSkip);
                return new java.util.Iterator<T>(this) { // from class: com.google.common.collect.Iterables.6.1
                    boolean atStart = true;

                    @Override // java.util.Iterator
                    public boolean hasNext() {
                        return it.hasNext();
                    }

                    @Override // java.util.Iterator
                    @com.google.common.collect.ParametricNullness
                    public T next() {
                        T t = (T) it.next();
                        this.atStart = false;
                        return t;
                    }

                    @Override // java.util.Iterator
                    public void remove() {
                        com.google.common.collect.CollectPreconditions.checkRemove(!this.atStart);
                        it.remove();
                    }
                };
            }
        };
    }

    public static <T> java.lang.Iterable<T> limit(final java.lang.Iterable<T> iterable, final int limitSize) {
        com.google.common.base.Preconditions.checkNotNull(iterable);
        com.google.common.base.Preconditions.checkArgument(limitSize >= 0, "limit is negative");
        return new com.google.common.collect.FluentIterable<T>() { // from class: com.google.common.collect.Iterables.7
            @Override // java.lang.Iterable
            public java.util.Iterator<T> iterator() {
                return com.google.common.collect.Iterators.limit(iterable.iterator(), limitSize);
            }
        };
    }

    public static <T> java.lang.Iterable<T> consumingIterable(final java.lang.Iterable<T> iterable) {
        com.google.common.base.Preconditions.checkNotNull(iterable);
        return new com.google.common.collect.FluentIterable<T>() { // from class: com.google.common.collect.Iterables.8
            @Override // com.google.common.collect.FluentIterable
            public java.lang.String toString() {
                return "Iterables.consumingIterable(...)";
            }

            @Override // java.lang.Iterable
            public java.util.Iterator<T> iterator() {
                java.lang.Iterable iterable2 = iterable;
                if (iterable2 instanceof java.util.Queue) {
                    return new com.google.common.collect.ConsumingQueueIterator((java.util.Queue) iterable);
                }
                return com.google.common.collect.Iterators.consumingIterator(iterable2.iterator());
            }
        };
    }

    public static boolean isEmpty(java.lang.Iterable<?> iterable) {
        if (iterable instanceof java.util.Collection) {
            return ((java.util.Collection) iterable).isEmpty();
        }
        return !iterable.iterator().hasNext();
    }

    public static <T> java.lang.Iterable<T> mergeSorted(final java.lang.Iterable<? extends java.lang.Iterable<? extends T>> iterables, final java.util.Comparator<? super T> comparator) {
        com.google.common.base.Preconditions.checkNotNull(iterables, "iterables");
        com.google.common.base.Preconditions.checkNotNull(comparator, "comparator");
        return new com.google.common.collect.Iterables.UnmodifiableIterable(new com.google.common.collect.FluentIterable<T>() { // from class: com.google.common.collect.Iterables.9
            @Override // java.lang.Iterable
            public java.util.Iterator<T> iterator() {
                return com.google.common.collect.Iterators.mergeSorted(com.google.common.collect.Iterables.transform(iterables, new com.google.common.collect.FluentIterable$2$$ExternalSyntheticLambda0()), comparator);
            }
        });
    }
}
