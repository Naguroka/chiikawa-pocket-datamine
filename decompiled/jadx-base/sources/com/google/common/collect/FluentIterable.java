package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class FluentIterable<E> implements java.lang.Iterable<E> {
    private final com.google.common.base.Optional<java.lang.Iterable<E>> iterableDelegate;

    protected FluentIterable() {
        this.iterableDelegate = com.google.common.base.Optional.absent();
    }

    FluentIterable(java.lang.Iterable<E> iterable) {
        this.iterableDelegate = com.google.common.base.Optional.of(iterable);
    }

    private java.lang.Iterable<E> getDelegate() {
        return this.iterableDelegate.or(this);
    }

    public static <E> com.google.common.collect.FluentIterable<E> from(final java.lang.Iterable<E> iterable) {
        if (iterable instanceof com.google.common.collect.FluentIterable) {
            return (com.google.common.collect.FluentIterable) iterable;
        }
        return new com.google.common.collect.FluentIterable<E>(iterable) { // from class: com.google.common.collect.FluentIterable.1
            @Override // java.lang.Iterable
            public java.util.Iterator<E> iterator() {
                return iterable.iterator();
            }
        };
    }

    public static <E> com.google.common.collect.FluentIterable<E> from(E[] elements) {
        return from(java.util.Arrays.asList(elements));
    }

    @java.lang.Deprecated
    public static <E> com.google.common.collect.FluentIterable<E> from(com.google.common.collect.FluentIterable<E> iterable) {
        return (com.google.common.collect.FluentIterable) com.google.common.base.Preconditions.checkNotNull(iterable);
    }

    public static <T> com.google.common.collect.FluentIterable<T> concat(java.lang.Iterable<? extends T> a2, java.lang.Iterable<? extends T> b) {
        return concatNoDefensiveCopy(a2, b);
    }

    public static <T> com.google.common.collect.FluentIterable<T> concat(java.lang.Iterable<? extends T> a2, java.lang.Iterable<? extends T> b, java.lang.Iterable<? extends T> c) {
        return concatNoDefensiveCopy(a2, b, c);
    }

    public static <T> com.google.common.collect.FluentIterable<T> concat(java.lang.Iterable<? extends T> a2, java.lang.Iterable<? extends T> b, java.lang.Iterable<? extends T> c, java.lang.Iterable<? extends T> d) {
        return concatNoDefensiveCopy(a2, b, c, d);
    }

    public static <T> com.google.common.collect.FluentIterable<T> concat(java.lang.Iterable<? extends T>... inputs) {
        return concatNoDefensiveCopy((java.lang.Iterable[]) java.util.Arrays.copyOf(inputs, inputs.length));
    }

    public static <T> com.google.common.collect.FluentIterable<T> concat(final java.lang.Iterable<? extends java.lang.Iterable<? extends T>> inputs) {
        com.google.common.base.Preconditions.checkNotNull(inputs);
        return new com.google.common.collect.FluentIterable<T>() { // from class: com.google.common.collect.FluentIterable.2
            @Override // java.lang.Iterable
            public java.util.Iterator<T> iterator() {
                return com.google.common.collect.Iterators.concat(com.google.common.collect.Iterators.transform(inputs.iterator(), new com.google.common.collect.FluentIterable$2$$ExternalSyntheticLambda0()));
            }
        };
    }

    private static <T> com.google.common.collect.FluentIterable<T> concatNoDefensiveCopy(final java.lang.Iterable<? extends T>... inputs) {
        for (java.lang.Iterable<? extends T> iterable : inputs) {
            com.google.common.base.Preconditions.checkNotNull(iterable);
        }
        return new com.google.common.collect.FluentIterable<T>() { // from class: com.google.common.collect.FluentIterable.3
            @Override // java.lang.Iterable
            public java.util.Iterator<T> iterator() {
                return com.google.common.collect.Iterators.concat(new com.google.common.collect.AbstractIndexedListIterator<java.util.Iterator<? extends T>>(inputs.length) { // from class: com.google.common.collect.FluentIterable.3.1
                    @Override // com.google.common.collect.AbstractIndexedListIterator
                    public java.util.Iterator<? extends T> get(int i) {
                        return inputs[i].iterator();
                    }
                });
            }
        };
    }

    public static <E> com.google.common.collect.FluentIterable<E> of() {
        return from(java.util.Collections.emptyList());
    }

    public static <E> com.google.common.collect.FluentIterable<E> of(@com.google.common.collect.ParametricNullness E element, E... elements) {
        return from(com.google.common.collect.Lists.asList(element, elements));
    }

    public java.lang.String toString() {
        return com.google.common.collect.Iterables.toString(getDelegate());
    }

    public final int size() {
        return com.google.common.collect.Iterables.size(getDelegate());
    }

    public final boolean contains(@javax.annotation.CheckForNull java.lang.Object target) {
        return com.google.common.collect.Iterables.contains(getDelegate(), target);
    }

    public final com.google.common.collect.FluentIterable<E> cycle() {
        return from(com.google.common.collect.Iterables.cycle(getDelegate()));
    }

    public final com.google.common.collect.FluentIterable<E> append(java.lang.Iterable<? extends E> other) {
        return concat(getDelegate(), other);
    }

    public final com.google.common.collect.FluentIterable<E> append(E... elements) {
        return concat(getDelegate(), java.util.Arrays.asList(elements));
    }

    public final com.google.common.collect.FluentIterable<E> filter(com.google.common.base.Predicate<? super E> predicate) {
        return from(com.google.common.collect.Iterables.filter(getDelegate(), predicate));
    }

    public final <T> com.google.common.collect.FluentIterable<T> filter(java.lang.Class<T> type) {
        return from(com.google.common.collect.Iterables.filter((java.lang.Iterable<?>) getDelegate(), (java.lang.Class) type));
    }

    public final boolean anyMatch(com.google.common.base.Predicate<? super E> predicate) {
        return com.google.common.collect.Iterables.any(getDelegate(), predicate);
    }

    public final boolean allMatch(com.google.common.base.Predicate<? super E> predicate) {
        return com.google.common.collect.Iterables.all(getDelegate(), predicate);
    }

    public final com.google.common.base.Optional<E> firstMatch(com.google.common.base.Predicate<? super E> predicate) {
        return com.google.common.collect.Iterables.tryFind(getDelegate(), predicate);
    }

    public final <T> com.google.common.collect.FluentIterable<T> transform(com.google.common.base.Function<? super E, T> function) {
        return from(com.google.common.collect.Iterables.transform(getDelegate(), function));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> com.google.common.collect.FluentIterable<T> transformAndConcat(com.google.common.base.Function<? super E, ? extends java.lang.Iterable<? extends T>> function) {
        return concat(transform(function));
    }

    public final com.google.common.base.Optional<E> first() {
        java.util.Iterator<E> it = getDelegate().iterator();
        return it.hasNext() ? com.google.common.base.Optional.of(it.next()) : com.google.common.base.Optional.absent();
    }

    public final com.google.common.base.Optional<E> last() {
        E next;
        java.lang.Iterable<E> delegate = getDelegate();
        if (delegate instanceof java.util.List) {
            java.util.List list = (java.util.List) delegate;
            if (list.isEmpty()) {
                return com.google.common.base.Optional.absent();
            }
            return com.google.common.base.Optional.of(list.get(list.size() - 1));
        }
        java.util.Iterator<E> it = delegate.iterator();
        if (!it.hasNext()) {
            return com.google.common.base.Optional.absent();
        }
        if (delegate instanceof java.util.SortedSet) {
            return com.google.common.base.Optional.of(((java.util.SortedSet) delegate).last());
        }
        do {
            next = it.next();
        } while (it.hasNext());
        return com.google.common.base.Optional.of(next);
    }

    public final com.google.common.collect.FluentIterable<E> skip(int numberToSkip) {
        return from(com.google.common.collect.Iterables.skip(getDelegate(), numberToSkip));
    }

    public final com.google.common.collect.FluentIterable<E> limit(int maxSize) {
        return from(com.google.common.collect.Iterables.limit(getDelegate(), maxSize));
    }

    public final boolean isEmpty() {
        return !getDelegate().iterator().hasNext();
    }

    public final com.google.common.collect.ImmutableList<E> toList() {
        return com.google.common.collect.ImmutableList.copyOf(getDelegate());
    }

    public final com.google.common.collect.ImmutableList<E> toSortedList(java.util.Comparator<? super E> comparator) {
        return com.google.common.collect.Ordering.from(comparator).immutableSortedCopy(getDelegate());
    }

    public final com.google.common.collect.ImmutableSet<E> toSet() {
        return com.google.common.collect.ImmutableSet.copyOf(getDelegate());
    }

    public final com.google.common.collect.ImmutableSortedSet<E> toSortedSet(java.util.Comparator<? super E> comparator) {
        return com.google.common.collect.ImmutableSortedSet.copyOf(comparator, getDelegate());
    }

    public final com.google.common.collect.ImmutableMultiset<E> toMultiset() {
        return com.google.common.collect.ImmutableMultiset.copyOf(getDelegate());
    }

    public final <V> com.google.common.collect.ImmutableMap<E, V> toMap(com.google.common.base.Function<? super E, V> valueFunction) {
        return com.google.common.collect.Maps.toMap(getDelegate(), valueFunction);
    }

    public final <K> com.google.common.collect.ImmutableListMultimap<K, E> index(com.google.common.base.Function<? super E, K> keyFunction) {
        return com.google.common.collect.Multimaps.index(getDelegate(), keyFunction);
    }

    public final <K> com.google.common.collect.ImmutableMap<K, E> uniqueIndex(com.google.common.base.Function<? super E, K> keyFunction) {
        return com.google.common.collect.Maps.uniqueIndex(getDelegate(), keyFunction);
    }

    public final E[] toArray(java.lang.Class<E> cls) {
        return (E[]) com.google.common.collect.Iterables.toArray(getDelegate(), cls);
    }

    public final <C extends java.util.Collection<? super E>> C copyInto(C collection) {
        com.google.common.base.Preconditions.checkNotNull(collection);
        java.lang.Iterable<E> delegate = getDelegate();
        if (delegate instanceof java.util.Collection) {
            collection.addAll((java.util.Collection) delegate);
        } else {
            java.util.Iterator<E> it = delegate.iterator();
            while (it.hasNext()) {
                collection.add(it.next());
            }
        }
        return collection;
    }

    public final java.lang.String join(com.google.common.base.Joiner joiner) {
        return joiner.join(this);
    }

    @com.google.common.collect.ParametricNullness
    public final E get(int i) {
        return (E) com.google.common.collect.Iterables.get(getDelegate(), i);
    }

    private static class FromIterableFunction<E> implements com.google.common.base.Function<java.lang.Iterable<E>, com.google.common.collect.FluentIterable<E>> {
        private FromIterableFunction() {
        }

        @Override // com.google.common.base.Function
        public com.google.common.collect.FluentIterable<E> apply(java.lang.Iterable<E> fromObject) {
            return com.google.common.collect.FluentIterable.from(fromObject);
        }
    }
}
