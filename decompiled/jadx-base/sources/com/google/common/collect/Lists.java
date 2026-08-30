package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public final class Lists {
    private Lists() {
    }

    public static <E> java.util.ArrayList<E> newArrayList() {
        return new java.util.ArrayList<>();
    }

    @java.lang.SafeVarargs
    public static <E> java.util.ArrayList<E> newArrayList(E... elements) {
        com.google.common.base.Preconditions.checkNotNull(elements);
        java.util.ArrayList<E> arrayList = new java.util.ArrayList<>(computeArrayListCapacity(elements.length));
        java.util.Collections.addAll(arrayList, elements);
        return arrayList;
    }

    public static <E> java.util.ArrayList<E> newArrayList(java.lang.Iterable<? extends E> elements) {
        com.google.common.base.Preconditions.checkNotNull(elements);
        if (elements instanceof java.util.Collection) {
            return new java.util.ArrayList<>((java.util.Collection) elements);
        }
        return newArrayList(elements.iterator());
    }

    public static <E> java.util.ArrayList<E> newArrayList(java.util.Iterator<? extends E> elements) {
        java.util.ArrayList<E> arrayListNewArrayList = newArrayList();
        com.google.common.collect.Iterators.addAll(arrayListNewArrayList, elements);
        return arrayListNewArrayList;
    }

    static int computeArrayListCapacity(int arraySize) {
        com.google.common.collect.CollectPreconditions.checkNonnegative(arraySize, "arraySize");
        return com.google.common.primitives.Ints.saturatedCast(((long) arraySize) + 5 + ((long) (arraySize / 10)));
    }

    public static <E> java.util.ArrayList<E> newArrayListWithCapacity(int initialArraySize) {
        com.google.common.collect.CollectPreconditions.checkNonnegative(initialArraySize, "initialArraySize");
        return new java.util.ArrayList<>(initialArraySize);
    }

    public static <E> java.util.ArrayList<E> newArrayListWithExpectedSize(int estimatedSize) {
        return new java.util.ArrayList<>(computeArrayListCapacity(estimatedSize));
    }

    public static <E> java.util.LinkedList<E> newLinkedList() {
        return new java.util.LinkedList<>();
    }

    public static <E> java.util.LinkedList<E> newLinkedList(java.lang.Iterable<? extends E> elements) {
        java.util.LinkedList<E> linkedListNewLinkedList = newLinkedList();
        com.google.common.collect.Iterables.addAll(linkedListNewLinkedList, elements);
        return linkedListNewLinkedList;
    }

    public static <E> java.util.concurrent.CopyOnWriteArrayList<E> newCopyOnWriteArrayList() {
        return new java.util.concurrent.CopyOnWriteArrayList<>();
    }

    public static <E> java.util.concurrent.CopyOnWriteArrayList<E> newCopyOnWriteArrayList(java.lang.Iterable<? extends E> elements) {
        java.util.Collection collectionNewArrayList;
        if (elements instanceof java.util.Collection) {
            collectionNewArrayList = (java.util.Collection) elements;
        } else {
            collectionNewArrayList = newArrayList(elements);
        }
        return new java.util.concurrent.CopyOnWriteArrayList<>(collectionNewArrayList);
    }

    public static <E> java.util.List<E> asList(@com.google.common.collect.ParametricNullness E first, E[] rest) {
        return new com.google.common.collect.Lists.OnePlusArrayList(first, rest);
    }

    public static <E> java.util.List<E> asList(@com.google.common.collect.ParametricNullness E first, @com.google.common.collect.ParametricNullness E second, E[] rest) {
        return new com.google.common.collect.Lists.TwoPlusArrayList(first, second, rest);
    }

    private static class OnePlusArrayList<E> extends java.util.AbstractList<E> implements java.io.Serializable, java.util.RandomAccess {
        private static final long serialVersionUID = 0;

        @com.google.common.collect.ParametricNullness
        final E first;
        final E[] rest;

        OnePlusArrayList(@com.google.common.collect.ParametricNullness E e, E[] eArr) {
            this.first = e;
            this.rest = (E[]) ((java.lang.Object[]) com.google.common.base.Preconditions.checkNotNull(eArr));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return com.google.common.math.IntMath.saturatedAdd(this.rest.length, 1);
        }

        @Override // java.util.AbstractList, java.util.List
        @com.google.common.collect.ParametricNullness
        public E get(int index) {
            com.google.common.base.Preconditions.checkElementIndex(index, size());
            return index == 0 ? this.first : this.rest[index - 1];
        }
    }

    private static class TwoPlusArrayList<E> extends java.util.AbstractList<E> implements java.io.Serializable, java.util.RandomAccess {
        private static final long serialVersionUID = 0;

        @com.google.common.collect.ParametricNullness
        final E first;
        final E[] rest;

        @com.google.common.collect.ParametricNullness
        final E second;

        TwoPlusArrayList(@com.google.common.collect.ParametricNullness E e, @com.google.common.collect.ParametricNullness E e2, E[] eArr) {
            this.first = e;
            this.second = e2;
            this.rest = (E[]) ((java.lang.Object[]) com.google.common.base.Preconditions.checkNotNull(eArr));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return com.google.common.math.IntMath.saturatedAdd(this.rest.length, 2);
        }

        @Override // java.util.AbstractList, java.util.List
        @com.google.common.collect.ParametricNullness
        public E get(int index) {
            if (index == 0) {
                return this.first;
            }
            if (index == 1) {
                return this.second;
            }
            com.google.common.base.Preconditions.checkElementIndex(index, size());
            return this.rest[index - 2];
        }
    }

    public static <B> java.util.List<java.util.List<B>> cartesianProduct(java.util.List<? extends java.util.List<? extends B>> lists) {
        return com.google.common.collect.CartesianList.create(lists);
    }

    @java.lang.SafeVarargs
    public static <B> java.util.List<java.util.List<B>> cartesianProduct(java.util.List<? extends B>... lists) {
        return cartesianProduct(java.util.Arrays.asList(lists));
    }

    public static <F, T> java.util.List<T> transform(java.util.List<F> fromList, com.google.common.base.Function<? super F, ? extends T> function) {
        if (fromList instanceof java.util.RandomAccess) {
            return new com.google.common.collect.Lists.TransformingRandomAccessList(fromList, function);
        }
        return new com.google.common.collect.Lists.TransformingSequentialList(fromList, function);
    }

    private static class TransformingSequentialList<F, T> extends java.util.AbstractSequentialList<T> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        final java.util.List<F> fromList;
        final com.google.common.base.Function<? super F, ? extends T> function;

        TransformingSequentialList(java.util.List<F> fromList, com.google.common.base.Function<? super F, ? extends T> function) {
            this.fromList = (java.util.List) com.google.common.base.Preconditions.checkNotNull(fromList);
            this.function = (com.google.common.base.Function) com.google.common.base.Preconditions.checkNotNull(function);
        }

        @Override // java.util.AbstractList
        protected void removeRange(int fromIndex, int toIndex) {
            this.fromList.subList(fromIndex, toIndex).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.fromList.size();
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public java.util.ListIterator<T> listIterator(final int index) {
            return new com.google.common.collect.TransformedListIterator<F, T>(this.fromList.listIterator(index)) { // from class: com.google.common.collect.Lists.TransformingSequentialList.1
                @Override // com.google.common.collect.TransformedIterator
                @com.google.common.collect.ParametricNullness
                T transform(@com.google.common.collect.ParametricNullness F from) {
                    return com.google.common.collect.Lists.TransformingSequentialList.this.function.apply(from);
                }
            };
        }
    }

    private static class TransformingRandomAccessList<F, T> extends java.util.AbstractList<T> implements java.util.RandomAccess, java.io.Serializable {
        private static final long serialVersionUID = 0;
        final java.util.List<F> fromList;
        final com.google.common.base.Function<? super F, ? extends T> function;

        TransformingRandomAccessList(java.util.List<F> fromList, com.google.common.base.Function<? super F, ? extends T> function) {
            this.fromList = (java.util.List) com.google.common.base.Preconditions.checkNotNull(fromList);
            this.function = (com.google.common.base.Function) com.google.common.base.Preconditions.checkNotNull(function);
        }

        @Override // java.util.AbstractList
        protected void removeRange(int fromIndex, int toIndex) {
            this.fromList.subList(fromIndex, toIndex).clear();
        }

        @Override // java.util.AbstractList, java.util.List
        @com.google.common.collect.ParametricNullness
        public T get(int i) {
            return this.function.apply(this.fromList.get(i));
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public java.util.Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public java.util.ListIterator<T> listIterator(int index) {
            return new com.google.common.collect.TransformedListIterator<F, T>(this.fromList.listIterator(index)) { // from class: com.google.common.collect.Lists.TransformingRandomAccessList.1
                @Override // com.google.common.collect.TransformedIterator
                T transform(F from) {
                    return com.google.common.collect.Lists.TransformingRandomAccessList.this.function.apply(from);
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.fromList.isEmpty();
        }

        @Override // java.util.AbstractList, java.util.List
        public T remove(int i) {
            return this.function.apply(this.fromList.remove(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.fromList.size();
        }
    }

    public static <T> java.util.List<java.util.List<T>> partition(java.util.List<T> list, int size) {
        com.google.common.base.Preconditions.checkNotNull(list);
        com.google.common.base.Preconditions.checkArgument(size > 0);
        if (list instanceof java.util.RandomAccess) {
            return new com.google.common.collect.Lists.RandomAccessPartition(list, size);
        }
        return new com.google.common.collect.Lists.Partition(list, size);
    }

    private static class Partition<T> extends java.util.AbstractList<java.util.List<T>> {
        final java.util.List<T> list;
        final int size;

        Partition(java.util.List<T> list, int size) {
            this.list = list;
            this.size = size;
        }

        @Override // java.util.AbstractList, java.util.List
        public java.util.List<T> get(int index) {
            com.google.common.base.Preconditions.checkElementIndex(index, size());
            int i = this.size;
            int i2 = index * i;
            return this.list.subList(i2, java.lang.Math.min(i + i2, this.list.size()));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return com.google.common.math.IntMath.divide(this.list.size(), this.size, java.math.RoundingMode.CEILING);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.list.isEmpty();
        }
    }

    private static class RandomAccessPartition<T> extends com.google.common.collect.Lists.Partition<T> implements java.util.RandomAccess {
        RandomAccessPartition(java.util.List<T> list, int size) {
            super(list, size);
        }
    }

    public static com.google.common.collect.ImmutableList<java.lang.Character> charactersOf(java.lang.String string) {
        return new com.google.common.collect.Lists.StringAsImmutableList((java.lang.String) com.google.common.base.Preconditions.checkNotNull(string));
    }

    public static java.util.List<java.lang.Character> charactersOf(java.lang.CharSequence sequence) {
        return new com.google.common.collect.Lists.CharSequenceAsList((java.lang.CharSequence) com.google.common.base.Preconditions.checkNotNull(sequence));
    }

    private static final class StringAsImmutableList extends com.google.common.collect.ImmutableList<java.lang.Character> {
        private final java.lang.String string;

        @Override // com.google.common.collect.ImmutableCollection
        boolean isPartialView() {
            return false;
        }

        StringAsImmutableList(java.lang.String string) {
            this.string = string;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int indexOf(@javax.annotation.CheckForNull java.lang.Object object) {
            if (object instanceof java.lang.Character) {
                return this.string.indexOf(((java.lang.Character) object).charValue());
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int lastIndexOf(@javax.annotation.CheckForNull java.lang.Object object) {
            if (object instanceof java.lang.Character) {
                return this.string.lastIndexOf(((java.lang.Character) object).charValue());
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public com.google.common.collect.ImmutableList<java.lang.Character> subList(int fromIndex, int toIndex) {
            com.google.common.base.Preconditions.checkPositionIndexes(fromIndex, toIndex, size());
            return com.google.common.collect.Lists.charactersOf(this.string.substring(fromIndex, toIndex));
        }

        @Override // java.util.List
        public java.lang.Character get(int index) {
            com.google.common.base.Preconditions.checkElementIndex(index, size());
            return java.lang.Character.valueOf(this.string.charAt(index));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.string.length();
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        java.lang.Object writeReplace() {
            return super.writeReplace();
        }
    }

    private static final class CharSequenceAsList extends java.util.AbstractList<java.lang.Character> {
        private final java.lang.CharSequence sequence;

        CharSequenceAsList(java.lang.CharSequence sequence) {
            this.sequence = sequence;
        }

        @Override // java.util.AbstractList, java.util.List
        public java.lang.Character get(int index) {
            com.google.common.base.Preconditions.checkElementIndex(index, size());
            return java.lang.Character.valueOf(this.sequence.charAt(index));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.sequence.length();
        }
    }

    public static <T> java.util.List<T> reverse(java.util.List<T> list) {
        if (list instanceof com.google.common.collect.ImmutableList) {
            return ((com.google.common.collect.ImmutableList) list).reverse();
        }
        if (list instanceof com.google.common.collect.Lists.ReverseList) {
            return ((com.google.common.collect.Lists.ReverseList) list).getForwardList();
        }
        if (list instanceof java.util.RandomAccess) {
            return new com.google.common.collect.Lists.RandomAccessReverseList(list);
        }
        return new com.google.common.collect.Lists.ReverseList(list);
    }

    private static class ReverseList<T> extends java.util.AbstractList<T> {
        private final java.util.List<T> forwardList;

        ReverseList(java.util.List<T> forwardList) {
            this.forwardList = (java.util.List) com.google.common.base.Preconditions.checkNotNull(forwardList);
        }

        java.util.List<T> getForwardList() {
            return this.forwardList;
        }

        private int reverseIndex(int index) {
            int size = size();
            com.google.common.base.Preconditions.checkElementIndex(index, size);
            return (size - 1) - index;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int reversePosition(int index) {
            int size = size();
            com.google.common.base.Preconditions.checkPositionIndex(index, size);
            return size - index;
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int index, @com.google.common.collect.ParametricNullness T element) {
            this.forwardList.add(reversePosition(index), element);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            this.forwardList.clear();
        }

        @Override // java.util.AbstractList, java.util.List
        @com.google.common.collect.ParametricNullness
        public T remove(int index) {
            return this.forwardList.remove(reverseIndex(index));
        }

        @Override // java.util.AbstractList
        protected void removeRange(int fromIndex, int toIndex) {
            subList(fromIndex, toIndex).clear();
        }

        @Override // java.util.AbstractList, java.util.List
        @com.google.common.collect.ParametricNullness
        public T set(int index, @com.google.common.collect.ParametricNullness T element) {
            return this.forwardList.set(reverseIndex(index), element);
        }

        @Override // java.util.AbstractList, java.util.List
        @com.google.common.collect.ParametricNullness
        public T get(int index) {
            return this.forwardList.get(reverseIndex(index));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.forwardList.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public java.util.List<T> subList(int fromIndex, int toIndex) {
            com.google.common.base.Preconditions.checkPositionIndexes(fromIndex, toIndex, size());
            return com.google.common.collect.Lists.reverse(this.forwardList.subList(reversePosition(toIndex), reversePosition(fromIndex)));
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public java.util.Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public java.util.ListIterator<T> listIterator(int index) {
            final java.util.ListIterator<T> listIterator = this.forwardList.listIterator(reversePosition(index));
            return new java.util.ListIterator<T>() { // from class: com.google.common.collect.Lists.ReverseList.1
                boolean canRemoveOrSet;

                @Override // java.util.ListIterator
                public void add(@com.google.common.collect.ParametricNullness T e) {
                    listIterator.add(e);
                    listIterator.previous();
                    this.canRemoveOrSet = false;
                }

                @Override // java.util.ListIterator, java.util.Iterator
                public boolean hasNext() {
                    return listIterator.hasPrevious();
                }

                @Override // java.util.ListIterator
                public boolean hasPrevious() {
                    return listIterator.hasNext();
                }

                @Override // java.util.ListIterator, java.util.Iterator
                @com.google.common.collect.ParametricNullness
                public T next() {
                    if (!hasNext()) {
                        throw new java.util.NoSuchElementException();
                    }
                    this.canRemoveOrSet = true;
                    return (T) listIterator.previous();
                }

                @Override // java.util.ListIterator
                public int nextIndex() {
                    return com.google.common.collect.Lists.ReverseList.this.reversePosition(listIterator.nextIndex());
                }

                @Override // java.util.ListIterator
                @com.google.common.collect.ParametricNullness
                public T previous() {
                    if (!hasPrevious()) {
                        throw new java.util.NoSuchElementException();
                    }
                    this.canRemoveOrSet = true;
                    return (T) listIterator.next();
                }

                @Override // java.util.ListIterator
                public int previousIndex() {
                    return nextIndex() - 1;
                }

                @Override // java.util.ListIterator, java.util.Iterator
                public void remove() {
                    com.google.common.collect.CollectPreconditions.checkRemove(this.canRemoveOrSet);
                    listIterator.remove();
                    this.canRemoveOrSet = false;
                }

                @Override // java.util.ListIterator
                public void set(@com.google.common.collect.ParametricNullness T e) {
                    com.google.common.base.Preconditions.checkState(this.canRemoveOrSet);
                    listIterator.set(e);
                }
            };
        }
    }

    private static class RandomAccessReverseList<T> extends com.google.common.collect.Lists.ReverseList<T> implements java.util.RandomAccess {
        RandomAccessReverseList(java.util.List<T> forwardList) {
            super(forwardList);
        }
    }

    static int hashCodeImpl(java.util.List<?> list) {
        java.util.Iterator<?> it = list.iterator();
        int i = 1;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            i = ~(~((i * 31) + (next == null ? 0 : next.hashCode())));
        }
        return i;
    }

    static boolean equalsImpl(java.util.List<?> thisList, @javax.annotation.CheckForNull java.lang.Object other) {
        if (other == com.google.common.base.Preconditions.checkNotNull(thisList)) {
            return true;
        }
        if (!(other instanceof java.util.List)) {
            return false;
        }
        java.util.List list = (java.util.List) other;
        int size = thisList.size();
        if (size != list.size()) {
            return false;
        }
        if (!(thisList instanceof java.util.RandomAccess) || !(list instanceof java.util.RandomAccess)) {
            return com.google.common.collect.Iterators.elementsEqual(thisList.iterator(), list.iterator());
        }
        for (int i = 0; i < size; i++) {
            if (!com.google.common.base.Objects.equal(thisList.get(i), list.get(i))) {
                return false;
            }
        }
        return true;
    }

    static <E> boolean addAllImpl(java.util.List<E> list, int index, java.lang.Iterable<? extends E> elements) {
        java.util.ListIterator<E> listIterator = list.listIterator(index);
        java.util.Iterator<? extends E> it = elements.iterator();
        boolean z = false;
        while (it.hasNext()) {
            listIterator.add(it.next());
            z = true;
        }
        return z;
    }

    static int indexOfImpl(java.util.List<?> list, @javax.annotation.CheckForNull java.lang.Object element) {
        if (list instanceof java.util.RandomAccess) {
            return indexOfRandomAccess(list, element);
        }
        java.util.ListIterator<?> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (com.google.common.base.Objects.equal(element, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    private static int indexOfRandomAccess(java.util.List<?> list, @javax.annotation.CheckForNull java.lang.Object element) {
        int size = list.size();
        int i = 0;
        if (element == null) {
            while (i < size) {
                if (list.get(i) == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        while (i < size) {
            if (element.equals(list.get(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    static int lastIndexOfImpl(java.util.List<?> list, @javax.annotation.CheckForNull java.lang.Object element) {
        if (list instanceof java.util.RandomAccess) {
            return lastIndexOfRandomAccess(list, element);
        }
        java.util.ListIterator<?> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (com.google.common.base.Objects.equal(element, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    private static int lastIndexOfRandomAccess(java.util.List<?> list, @javax.annotation.CheckForNull java.lang.Object element) {
        if (element == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (element.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    static <E> java.util.ListIterator<E> listIteratorImpl(java.util.List<E> list, int index) {
        return new com.google.common.collect.Lists.AbstractListWrapper(list).listIterator(index);
    }

    static <E> java.util.List<E> subListImpl(final java.util.List<E> list, int fromIndex, int toIndex) {
        java.util.List list2;
        if (list instanceof java.util.RandomAccess) {
            list2 = new com.google.common.collect.Lists.RandomAccessListWrapper<E>(list) { // from class: com.google.common.collect.Lists.1
                private static final long serialVersionUID = 0;

                @Override // java.util.AbstractList, java.util.List
                public java.util.ListIterator<E> listIterator(int index) {
                    return this.backingList.listIterator(index);
                }
            };
        } else {
            list2 = new com.google.common.collect.Lists.AbstractListWrapper<E>(list) { // from class: com.google.common.collect.Lists.2
                private static final long serialVersionUID = 0;

                @Override // java.util.AbstractList, java.util.List
                public java.util.ListIterator<E> listIterator(int index) {
                    return this.backingList.listIterator(index);
                }
            };
        }
        return list2.subList(fromIndex, toIndex);
    }

    private static class AbstractListWrapper<E> extends java.util.AbstractList<E> {
        final java.util.List<E> backingList;

        AbstractListWrapper(java.util.List<E> backingList) {
            this.backingList = (java.util.List) com.google.common.base.Preconditions.checkNotNull(backingList);
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int index, @com.google.common.collect.ParametricNullness E element) {
            this.backingList.add(index, element);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int index, java.util.Collection<? extends E> c) {
            return this.backingList.addAll(index, c);
        }

        @Override // java.util.AbstractList, java.util.List
        @com.google.common.collect.ParametricNullness
        public E get(int index) {
            return this.backingList.get(index);
        }

        @Override // java.util.AbstractList, java.util.List
        @com.google.common.collect.ParametricNullness
        public E remove(int index) {
            return this.backingList.remove(index);
        }

        @Override // java.util.AbstractList, java.util.List
        @com.google.common.collect.ParametricNullness
        public E set(int index, @com.google.common.collect.ParametricNullness E element) {
            return this.backingList.set(index, element);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object o) {
            return this.backingList.contains(o);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.backingList.size();
        }
    }

    private static class RandomAccessListWrapper<E> extends com.google.common.collect.Lists.AbstractListWrapper<E> implements java.util.RandomAccess {
        RandomAccessListWrapper(java.util.List<E> backingList) {
            super(backingList);
        }
    }

    static <T> java.util.List<T> cast(java.lang.Iterable<T> iterable) {
        return (java.util.List) iterable;
    }
}
