package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public final class Collections2 {
    private Collections2() {
    }

    public static <E> java.util.Collection<E> filter(java.util.Collection<E> unfiltered, com.google.common.base.Predicate<? super E> predicate) {
        if (unfiltered instanceof com.google.common.collect.Collections2.FilteredCollection) {
            return ((com.google.common.collect.Collections2.FilteredCollection) unfiltered).createCombined(predicate);
        }
        return new com.google.common.collect.Collections2.FilteredCollection((java.util.Collection) com.google.common.base.Preconditions.checkNotNull(unfiltered), (com.google.common.base.Predicate) com.google.common.base.Preconditions.checkNotNull(predicate));
    }

    static boolean safeContains(java.util.Collection<?> collection, @javax.annotation.CheckForNull java.lang.Object object) {
        com.google.common.base.Preconditions.checkNotNull(collection);
        try {
            return collection.contains(object);
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            return false;
        }
    }

    static boolean safeRemove(java.util.Collection<?> collection, @javax.annotation.CheckForNull java.lang.Object object) {
        com.google.common.base.Preconditions.checkNotNull(collection);
        try {
            return collection.remove(object);
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            return false;
        }
    }

    static class FilteredCollection<E> extends java.util.AbstractCollection<E> {
        final com.google.common.base.Predicate<? super E> predicate;
        final java.util.Collection<E> unfiltered;

        FilteredCollection(java.util.Collection<E> unfiltered, com.google.common.base.Predicate<? super E> predicate) {
            this.unfiltered = unfiltered;
            this.predicate = predicate;
        }

        com.google.common.collect.Collections2.FilteredCollection<E> createCombined(com.google.common.base.Predicate<? super E> newPredicate) {
            return new com.google.common.collect.Collections2.FilteredCollection<>(this.unfiltered, com.google.common.base.Predicates.and(this.predicate, newPredicate));
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(@com.google.common.collect.ParametricNullness E element) {
            com.google.common.base.Preconditions.checkArgument(this.predicate.apply(element));
            return this.unfiltered.add(element);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(java.util.Collection<? extends E> collection) {
            java.util.Iterator<? extends E> it = collection.iterator();
            while (it.hasNext()) {
                com.google.common.base.Preconditions.checkArgument(this.predicate.apply(it.next()));
            }
            return this.unfiltered.addAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            com.google.common.collect.Iterables.removeIf(this.unfiltered, this.predicate);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object element) {
            if (com.google.common.collect.Collections2.safeContains(this.unfiltered, element)) {
                return this.predicate.apply(element);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(java.util.Collection<?> collection) {
            return com.google.common.collect.Collections2.containsAllImpl(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return !com.google.common.collect.Iterables.any(this.unfiltered, this.predicate);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<E> iterator() {
            return com.google.common.collect.Iterators.filter(this.unfiltered.iterator(), this.predicate);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(@javax.annotation.CheckForNull java.lang.Object element) {
            return contains(element) && this.unfiltered.remove(element);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(final java.util.Collection<?> collection) {
            java.util.Iterator<E> it = this.unfiltered.iterator();
            boolean z = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.predicate.apply(next) && collection.contains(next)) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(final java.util.Collection<?> collection) {
            java.util.Iterator<E> it = this.unfiltered.iterator();
            boolean z = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.predicate.apply(next) && !collection.contains(next)) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            java.util.Iterator<E> it = this.unfiltered.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (this.predicate.apply(it.next())) {
                    i++;
                }
            }
            return i;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public java.lang.Object[] toArray() {
            return com.google.common.collect.Lists.newArrayList(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) com.google.common.collect.Lists.newArrayList(iterator()).toArray(tArr);
        }
    }

    public static <F, T> java.util.Collection<T> transform(java.util.Collection<F> fromCollection, com.google.common.base.Function<? super F, T> function) {
        return new com.google.common.collect.Collections2.TransformedCollection(fromCollection, function);
    }

    static class TransformedCollection<F, T> extends java.util.AbstractCollection<T> {
        final java.util.Collection<F> fromCollection;
        final com.google.common.base.Function<? super F, ? extends T> function;

        TransformedCollection(java.util.Collection<F> fromCollection, com.google.common.base.Function<? super F, ? extends T> function) {
            this.fromCollection = (java.util.Collection) com.google.common.base.Preconditions.checkNotNull(fromCollection);
            this.function = (com.google.common.base.Function) com.google.common.base.Preconditions.checkNotNull(function);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.fromCollection.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.fromCollection.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<T> iterator() {
            return com.google.common.collect.Iterators.transform(this.fromCollection.iterator(), this.function);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.fromCollection.size();
        }
    }

    static boolean containsAllImpl(java.util.Collection<?> self, java.util.Collection<?> c) {
        java.util.Iterator<?> it = c.iterator();
        while (it.hasNext()) {
            if (!self.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    static java.lang.String toStringImpl(final java.util.Collection<?> collection) {
        java.lang.StringBuilder sbAppend = newStringBuilderForCollection(collection.size()).append('[');
        boolean z = true;
        for (java.lang.Object obj : collection) {
            if (!z) {
                sbAppend.append(", ");
            }
            if (obj == collection) {
                sbAppend.append("(this Collection)");
            } else {
                sbAppend.append(obj);
            }
            z = false;
        }
        return sbAppend.append(']').toString();
    }

    static java.lang.StringBuilder newStringBuilderForCollection(int size) {
        com.google.common.collect.CollectPreconditions.checkNonnegative(size, "size");
        return new java.lang.StringBuilder((int) java.lang.Math.min(((long) size) * 8, 1073741824L));
    }

    public static <E extends java.lang.Comparable<? super E>> java.util.Collection<java.util.List<E>> orderedPermutations(java.lang.Iterable<E> elements) {
        return orderedPermutations(elements, com.google.common.collect.Ordering.natural());
    }

    public static <E> java.util.Collection<java.util.List<E>> orderedPermutations(java.lang.Iterable<E> elements, java.util.Comparator<? super E> comparator) {
        return new com.google.common.collect.Collections2.OrderedPermutationCollection(elements, comparator);
    }

    private static final class OrderedPermutationCollection<E> extends java.util.AbstractCollection<java.util.List<E>> {
        final java.util.Comparator<? super E> comparator;
        final com.google.common.collect.ImmutableList<E> inputList;
        final int size;

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        OrderedPermutationCollection(java.lang.Iterable<E> input, java.util.Comparator<? super E> comparator) {
            com.google.common.collect.ImmutableList<E> immutableListSortedCopyOf = com.google.common.collect.ImmutableList.sortedCopyOf(comparator, input);
            this.inputList = immutableListSortedCopyOf;
            this.comparator = comparator;
            this.size = calculateSize(immutableListSortedCopyOf, comparator);
        }

        private static <E> int calculateSize(java.util.List<E> sortedInputList, java.util.Comparator<? super E> comparator) {
            int i = 1;
            int iSaturatedMultiply = 1;
            int i2 = 1;
            while (i < sortedInputList.size()) {
                if (comparator.compare(sortedInputList.get(i - 1), sortedInputList.get(i)) < 0) {
                    iSaturatedMultiply = com.google.common.math.IntMath.saturatedMultiply(iSaturatedMultiply, com.google.common.math.IntMath.binomial(i, i2));
                    if (iSaturatedMultiply == Integer.MAX_VALUE) {
                        return Integer.MAX_VALUE;
                    }
                    i2 = 0;
                }
                i++;
                i2++;
            }
            return com.google.common.math.IntMath.saturatedMultiply(iSaturatedMultiply, com.google.common.math.IntMath.binomial(i, i2));
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.size;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<java.util.List<E>> iterator() {
            return new com.google.common.collect.Collections2.OrderedPermutationIterator(this.inputList, this.comparator);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object obj) {
            if (!(obj instanceof java.util.List)) {
                return false;
            }
            return com.google.common.collect.Collections2.isPermutation(this.inputList, (java.util.List) obj);
        }

        @Override // java.util.AbstractCollection
        public java.lang.String toString() {
            return "orderedPermutationCollection(" + this.inputList + ")";
        }
    }

    private static final class OrderedPermutationIterator<E> extends com.google.common.collect.AbstractIterator<java.util.List<E>> {
        final java.util.Comparator<? super E> comparator;

        @javax.annotation.CheckForNull
        java.util.List<E> nextPermutation;

        OrderedPermutationIterator(java.util.List<E> list, java.util.Comparator<? super E> comparator) {
            this.nextPermutation = com.google.common.collect.Lists.newArrayList(list);
            this.comparator = comparator;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.AbstractIterator
        @javax.annotation.CheckForNull
        public java.util.List<E> computeNext() {
            java.util.List<E> list = this.nextPermutation;
            if (list == null) {
                return endOfData();
            }
            com.google.common.collect.ImmutableList immutableListCopyOf = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
            calculateNextPermutation();
            return immutableListCopyOf;
        }

        void calculateNextPermutation() {
            int iFindNextJ = findNextJ();
            if (iFindNextJ == -1) {
                this.nextPermutation = null;
                return;
            }
            java.util.Objects.requireNonNull(this.nextPermutation);
            java.util.Collections.swap(this.nextPermutation, iFindNextJ, findNextL(iFindNextJ));
            java.util.Collections.reverse(this.nextPermutation.subList(iFindNextJ + 1, this.nextPermutation.size()));
        }

        int findNextJ() {
            java.util.Objects.requireNonNull(this.nextPermutation);
            for (int size = this.nextPermutation.size() - 2; size >= 0; size--) {
                if (this.comparator.compare(this.nextPermutation.get(size), this.nextPermutation.get(size + 1)) < 0) {
                    return size;
                }
            }
            return -1;
        }

        int findNextL(int i) {
            java.util.Objects.requireNonNull(this.nextPermutation);
            E e = this.nextPermutation.get(i);
            for (int size = this.nextPermutation.size() - 1; size > i; size--) {
                if (this.comparator.compare(e, this.nextPermutation.get(size)) < 0) {
                    return size;
                }
            }
            throw new java.lang.AssertionError("this statement should be unreachable");
        }
    }

    public static <E> java.util.Collection<java.util.List<E>> permutations(java.util.Collection<E> elements) {
        return new com.google.common.collect.Collections2.PermutationCollection(com.google.common.collect.ImmutableList.copyOf((java.util.Collection) elements));
    }

    private static final class PermutationCollection<E> extends java.util.AbstractCollection<java.util.List<E>> {
        final com.google.common.collect.ImmutableList<E> inputList;

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        PermutationCollection(com.google.common.collect.ImmutableList<E> input) {
            this.inputList = input;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return com.google.common.math.IntMath.factorial(this.inputList.size());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<java.util.List<E>> iterator() {
            return new com.google.common.collect.Collections2.PermutationIterator(this.inputList);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object obj) {
            if (!(obj instanceof java.util.List)) {
                return false;
            }
            return com.google.common.collect.Collections2.isPermutation(this.inputList, (java.util.List) obj);
        }

        @Override // java.util.AbstractCollection
        public java.lang.String toString() {
            return "permutations(" + this.inputList + ")";
        }
    }

    private static class PermutationIterator<E> extends com.google.common.collect.AbstractIterator<java.util.List<E>> {
        final int[] c;
        int j;
        final java.util.List<E> list;
        final int[] o;

        PermutationIterator(java.util.List<E> list) {
            this.list = new java.util.ArrayList(list);
            int size = list.size();
            int[] iArr = new int[size];
            this.c = iArr;
            int[] iArr2 = new int[size];
            this.o = iArr2;
            java.util.Arrays.fill(iArr, 0);
            java.util.Arrays.fill(iArr2, 1);
            this.j = Integer.MAX_VALUE;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.AbstractIterator
        @javax.annotation.CheckForNull
        public java.util.List<E> computeNext() {
            if (this.j <= 0) {
                return endOfData();
            }
            com.google.common.collect.ImmutableList immutableListCopyOf = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) this.list);
            calculateNextPermutation();
            return immutableListCopyOf;
        }

        void calculateNextPermutation() {
            int size = this.list.size() - 1;
            this.j = size;
            if (size == -1) {
                return;
            }
            int i = 0;
            while (true) {
                int[] iArr = this.c;
                int i2 = this.j;
                int i3 = iArr[i2];
                int i4 = this.o[i2] + i3;
                if (i4 < 0) {
                    switchDirection();
                } else if (i4 != i2 + 1) {
                    java.util.Collections.swap(this.list, (i2 - i3) + i, (i2 - i4) + i);
                    this.c[this.j] = i4;
                    return;
                } else {
                    if (i2 == 0) {
                        return;
                    }
                    i++;
                    switchDirection();
                }
            }
        }

        void switchDirection() {
            int[] iArr = this.o;
            int i = this.j;
            iArr[i] = -iArr[i];
            this.j = i - 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isPermutation(java.util.List<?> first, java.util.List<?> second) {
        if (first.size() != second.size()) {
            return false;
        }
        com.google.common.collect.ObjectCountHashMap objectCountHashMapCounts = counts(first);
        com.google.common.collect.ObjectCountHashMap objectCountHashMapCounts2 = counts(second);
        if (first.size() != second.size()) {
            return false;
        }
        for (int i = 0; i < first.size(); i++) {
            if (objectCountHashMapCounts.getValue(i) != objectCountHashMapCounts2.get(objectCountHashMapCounts.getKey(i))) {
                return false;
            }
        }
        return true;
    }

    private static <E> com.google.common.collect.ObjectCountHashMap<E> counts(java.util.Collection<E> collection) {
        com.google.common.collect.ObjectCountHashMap<E> objectCountHashMap = new com.google.common.collect.ObjectCountHashMap<>();
        for (E e : collection) {
            objectCountHashMap.put(e, objectCountHashMap.get(e) + 1);
        }
        return objectCountHashMap;
    }
}
