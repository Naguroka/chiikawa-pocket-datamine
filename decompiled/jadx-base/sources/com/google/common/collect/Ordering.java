package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class Ordering<T> implements java.util.Comparator<T> {
    static final int LEFT_IS_GREATER = 1;
    static final int RIGHT_IS_GREATER = -1;

    @Override // java.util.Comparator
    public abstract int compare(@com.google.common.collect.ParametricNullness T left, @com.google.common.collect.ParametricNullness T right);

    public static <C extends java.lang.Comparable> com.google.common.collect.Ordering<C> natural() {
        return com.google.common.collect.NaturalOrdering.INSTANCE;
    }

    public static <T> com.google.common.collect.Ordering<T> from(java.util.Comparator<T> comparator) {
        if (comparator instanceof com.google.common.collect.Ordering) {
            return (com.google.common.collect.Ordering) comparator;
        }
        return new com.google.common.collect.ComparatorOrdering(comparator);
    }

    @java.lang.Deprecated
    public static <T> com.google.common.collect.Ordering<T> from(com.google.common.collect.Ordering<T> ordering) {
        return (com.google.common.collect.Ordering) com.google.common.base.Preconditions.checkNotNull(ordering);
    }

    public static <T> com.google.common.collect.Ordering<T> explicit(java.util.List<T> valuesInOrder) {
        return new com.google.common.collect.ExplicitOrdering(valuesInOrder);
    }

    public static <T> com.google.common.collect.Ordering<T> explicit(T leastValue, T... remainingValuesInOrder) {
        return explicit(com.google.common.collect.Lists.asList(leastValue, remainingValuesInOrder));
    }

    public static com.google.common.collect.Ordering<java.lang.Object> allEqual() {
        return com.google.common.collect.AllEqualOrdering.INSTANCE;
    }

    public static com.google.common.collect.Ordering<java.lang.Object> usingToString() {
        return com.google.common.collect.UsingToStringOrdering.INSTANCE;
    }

    public static com.google.common.collect.Ordering<java.lang.Object> arbitrary() {
        return com.google.common.collect.Ordering.ArbitraryOrderingHolder.ARBITRARY_ORDERING;
    }

    private static class ArbitraryOrderingHolder {
        static final com.google.common.collect.Ordering<java.lang.Object> ARBITRARY_ORDERING = new com.google.common.collect.Ordering.ArbitraryOrdering();

        private ArbitraryOrderingHolder() {
        }
    }

    static class ArbitraryOrdering extends com.google.common.collect.Ordering<java.lang.Object> {
        private final java.util.concurrent.atomic.AtomicInteger counter = new java.util.concurrent.atomic.AtomicInteger(0);
        private final java.util.concurrent.ConcurrentMap<java.lang.Object, java.lang.Integer> uids = com.google.common.collect.Platform.tryWeakKeys(new com.google.common.collect.MapMaker()).makeMap();

        public java.lang.String toString() {
            return "Ordering.arbitrary()";
        }

        ArbitraryOrdering() {
        }

        private java.lang.Integer getUid(java.lang.Object obj) {
            java.lang.Integer num = this.uids.get(obj);
            if (num != null) {
                return num;
            }
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(this.counter.getAndIncrement());
            java.lang.Integer numPutIfAbsent = this.uids.putIfAbsent(obj, numValueOf);
            return numPutIfAbsent != null ? numPutIfAbsent : numValueOf;
        }

        @Override // com.google.common.collect.Ordering, java.util.Comparator
        public int compare(@javax.annotation.CheckForNull java.lang.Object left, @javax.annotation.CheckForNull java.lang.Object right) {
            if (left == right) {
                return 0;
            }
            if (left == null) {
                return -1;
            }
            if (right == null) {
                return 1;
            }
            int iIdentityHashCode = identityHashCode(left);
            int iIdentityHashCode2 = identityHashCode(right);
            if (iIdentityHashCode != iIdentityHashCode2) {
                return iIdentityHashCode < iIdentityHashCode2 ? -1 : 1;
            }
            int iCompareTo = getUid(left).compareTo(getUid(right));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            throw new java.lang.AssertionError();
        }

        int identityHashCode(java.lang.Object object) {
            return java.lang.System.identityHashCode(object);
        }
    }

    protected Ordering() {
    }

    public <S extends T> com.google.common.collect.Ordering<S> reverse() {
        return new com.google.common.collect.ReverseOrdering(this);
    }

    public <S extends T> com.google.common.collect.Ordering<S> nullsFirst() {
        return new com.google.common.collect.NullsFirstOrdering(this);
    }

    public <S extends T> com.google.common.collect.Ordering<S> nullsLast() {
        return new com.google.common.collect.NullsLastOrdering(this);
    }

    public <F> com.google.common.collect.Ordering<F> onResultOf(com.google.common.base.Function<F, ? extends T> function) {
        return new com.google.common.collect.ByFunctionOrdering(function, this);
    }

    <T2 extends T> com.google.common.collect.Ordering<java.util.Map.Entry<T2, ?>> onKeys() {
        return (com.google.common.collect.Ordering<java.util.Map.Entry<T2, ?>>) onResultOf(com.google.common.collect.Maps.keyFunction());
    }

    public <U extends T> com.google.common.collect.Ordering<U> compound(java.util.Comparator<? super U> secondaryComparator) {
        return new com.google.common.collect.CompoundOrdering(this, (java.util.Comparator) com.google.common.base.Preconditions.checkNotNull(secondaryComparator));
    }

    public static <T> com.google.common.collect.Ordering<T> compound(java.lang.Iterable<? extends java.util.Comparator<? super T>> comparators) {
        return new com.google.common.collect.CompoundOrdering(comparators);
    }

    public <S extends T> com.google.common.collect.Ordering<java.lang.Iterable<S>> lexicographical() {
        return new com.google.common.collect.LexicographicalOrdering(this);
    }

    @com.google.common.collect.ParametricNullness
    public <E extends T> E min(java.util.Iterator<E> it) {
        E next = it.next();
        while (it.hasNext()) {
            next = (E) min(next, it.next());
        }
        return next;
    }

    @com.google.common.collect.ParametricNullness
    public <E extends T> E min(java.lang.Iterable<E> iterable) {
        return (E) min(iterable.iterator());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @com.google.common.collect.ParametricNullness
    public <E extends T> E min(@com.google.common.collect.ParametricNullness E a2, @com.google.common.collect.ParametricNullness E b) {
        return compare(a2, b) <= 0 ? a2 : b;
    }

    @com.google.common.collect.ParametricNullness
    public <E extends T> E min(@com.google.common.collect.ParametricNullness E e, @com.google.common.collect.ParametricNullness E e2, @com.google.common.collect.ParametricNullness E e3, E... eArr) {
        E e4 = (E) min(min(e, e2), e3);
        for (E e5 : eArr) {
            e4 = (E) min(e4, e5);
        }
        return e4;
    }

    @com.google.common.collect.ParametricNullness
    public <E extends T> E max(java.util.Iterator<E> it) {
        E next = it.next();
        while (it.hasNext()) {
            next = (E) max(next, it.next());
        }
        return next;
    }

    @com.google.common.collect.ParametricNullness
    public <E extends T> E max(java.lang.Iterable<E> iterable) {
        return (E) max(iterable.iterator());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @com.google.common.collect.ParametricNullness
    public <E extends T> E max(@com.google.common.collect.ParametricNullness E a2, @com.google.common.collect.ParametricNullness E b) {
        return compare(a2, b) >= 0 ? a2 : b;
    }

    @com.google.common.collect.ParametricNullness
    public <E extends T> E max(@com.google.common.collect.ParametricNullness E e, @com.google.common.collect.ParametricNullness E e2, @com.google.common.collect.ParametricNullness E e3, E... eArr) {
        E e4 = (E) max(max(e, e2), e3);
        for (E e5 : eArr) {
            e4 = (E) max(e4, e5);
        }
        return e4;
    }

    public <E extends T> java.util.List<E> leastOf(java.lang.Iterable<E> iterable, int k) {
        if (iterable instanceof java.util.Collection) {
            java.util.Collection collection = (java.util.Collection) iterable;
            if (collection.size() <= ((long) k) * 2) {
                java.lang.Object[] array = collection.toArray();
                java.util.Arrays.sort(array, this);
                if (array.length > k) {
                    array = java.util.Arrays.copyOf(array, k);
                }
                return java.util.Collections.unmodifiableList(java.util.Arrays.asList(array));
            }
        }
        return leastOf(iterable.iterator(), k);
    }

    public <E extends T> java.util.List<E> leastOf(java.util.Iterator<E> iterator, int k) {
        com.google.common.base.Preconditions.checkNotNull(iterator);
        com.google.common.collect.CollectPreconditions.checkNonnegative(k, "k");
        if (k == 0 || !iterator.hasNext()) {
            return java.util.Collections.emptyList();
        }
        if (k >= 1073741823) {
            java.util.ArrayList arrayListNewArrayList = com.google.common.collect.Lists.newArrayList(iterator);
            java.util.Collections.sort(arrayListNewArrayList, this);
            if (arrayListNewArrayList.size() > k) {
                arrayListNewArrayList.subList(k, arrayListNewArrayList.size()).clear();
            }
            arrayListNewArrayList.trimToSize();
            return java.util.Collections.unmodifiableList(arrayListNewArrayList);
        }
        com.google.common.collect.TopKSelector topKSelectorLeast = com.google.common.collect.TopKSelector.least(k, this);
        topKSelectorLeast.offerAll(iterator);
        return topKSelectorLeast.topK();
    }

    public <E extends T> java.util.List<E> greatestOf(java.lang.Iterable<E> iterable, int k) {
        return reverse().leastOf(iterable, k);
    }

    public <E extends T> java.util.List<E> greatestOf(java.util.Iterator<E> iterator, int k) {
        return reverse().leastOf(iterator, k);
    }

    public <E extends T> java.util.List<E> sortedCopy(java.lang.Iterable<E> elements) {
        java.lang.Object[] array = com.google.common.collect.Iterables.toArray(elements);
        java.util.Arrays.sort(array, this);
        return com.google.common.collect.Lists.newArrayList(java.util.Arrays.asList(array));
    }

    public <E extends T> com.google.common.collect.ImmutableList<E> immutableSortedCopy(java.lang.Iterable<E> elements) {
        return com.google.common.collect.ImmutableList.sortedCopyOf(this, elements);
    }

    public boolean isOrdered(java.lang.Iterable<? extends T> iterable) {
        java.util.Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (compare(next, next2) > 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    public boolean isStrictlyOrdered(java.lang.Iterable<? extends T> iterable) {
        java.util.Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (compare(next, next2) >= 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    @java.lang.Deprecated
    public int binarySearch(java.util.List<? extends T> sortedList, @com.google.common.collect.ParametricNullness T key) {
        return java.util.Collections.binarySearch(sortedList, key, this);
    }

    static class IncomparableValueException extends java.lang.ClassCastException {
        private static final long serialVersionUID = 0;
        final java.lang.Object value;

        IncomparableValueException(java.lang.Object value) {
            super("Cannot compare value: " + value);
            this.value = value;
        }
    }
}
