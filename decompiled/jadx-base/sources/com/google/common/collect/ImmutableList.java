package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ImmutableList<E> extends com.google.common.collect.ImmutableCollection<E> implements java.util.List<E>, java.util.RandomAccess {
    private static final com.google.common.collect.UnmodifiableListIterator<java.lang.Object> EMPTY_ITR = new com.google.common.collect.ImmutableList.Itr(com.google.common.collect.RegularImmutableList.EMPTY, 0);
    private static final long serialVersionUID = -889275714;

    @Override // com.google.common.collect.ImmutableCollection
    @java.lang.Deprecated
    public final com.google.common.collect.ImmutableList<E> asList() {
        return this;
    }

    static <E> java.util.stream.Collector<E, ?, com.google.common.collect.ImmutableList<E>> toImmutableList() {
        return com.google.common.collect.CollectCollectors.toImmutableList();
    }

    public static <E> com.google.common.collect.ImmutableList<E> of() {
        return (com.google.common.collect.ImmutableList<E>) com.google.common.collect.RegularImmutableList.EMPTY;
    }

    public static <E> com.google.common.collect.ImmutableList<E> of(E element) {
        return construct(element);
    }

    public static <E> com.google.common.collect.ImmutableList<E> of(E e1, E e2) {
        return construct(e1, e2);
    }

    public static <E> com.google.common.collect.ImmutableList<E> of(E e1, E e2, E e3) {
        return construct(e1, e2, e3);
    }

    public static <E> com.google.common.collect.ImmutableList<E> of(E e1, E e2, E e3, E e4) {
        return construct(e1, e2, e3, e4);
    }

    public static <E> com.google.common.collect.ImmutableList<E> of(E e1, E e2, E e3, E e4, E e5) {
        return construct(e1, e2, e3, e4, e5);
    }

    public static <E> com.google.common.collect.ImmutableList<E> of(E e1, E e2, E e3, E e4, E e5, E e6) {
        return construct(e1, e2, e3, e4, e5, e6);
    }

    public static <E> com.google.common.collect.ImmutableList<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E e7) {
        return construct(e1, e2, e3, e4, e5, e6, e7);
    }

    public static <E> com.google.common.collect.ImmutableList<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8) {
        return construct(e1, e2, e3, e4, e5, e6, e7, e8);
    }

    public static <E> com.google.common.collect.ImmutableList<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9) {
        return construct(e1, e2, e3, e4, e5, e6, e7, e8, e9);
    }

    public static <E> com.google.common.collect.ImmutableList<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10) {
        return construct(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10);
    }

    public static <E> com.google.common.collect.ImmutableList<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11) {
        return construct(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11);
    }

    @java.lang.SafeVarargs
    public static <E> com.google.common.collect.ImmutableList<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11, E e12, E... others) {
        com.google.common.base.Preconditions.checkArgument(others.length <= 2147483635, "the total number of elements must fit in an int");
        java.lang.Object[] objArr = new java.lang.Object[others.length + 12];
        objArr[0] = e1;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        objArr[6] = e7;
        objArr[7] = e8;
        objArr[8] = e9;
        objArr[9] = e10;
        objArr[10] = e11;
        objArr[11] = e12;
        java.lang.System.arraycopy(others, 0, objArr, 12, others.length);
        return construct(objArr);
    }

    public static <E> com.google.common.collect.ImmutableList<E> copyOf(java.lang.Iterable<? extends E> elements) {
        com.google.common.base.Preconditions.checkNotNull(elements);
        if (elements instanceof java.util.Collection) {
            return copyOf((java.util.Collection) elements);
        }
        return copyOf(elements.iterator());
    }

    public static <E> com.google.common.collect.ImmutableList<E> copyOf(java.util.Collection<? extends E> elements) {
        if (elements instanceof com.google.common.collect.ImmutableCollection) {
            com.google.common.collect.ImmutableList<E> immutableListAsList = ((com.google.common.collect.ImmutableCollection) elements).asList();
            return immutableListAsList.isPartialView() ? asImmutableList(immutableListAsList.toArray()) : immutableListAsList;
        }
        return construct(elements.toArray());
    }

    public static <E> com.google.common.collect.ImmutableList<E> copyOf(java.util.Iterator<? extends E> elements) {
        if (!elements.hasNext()) {
            return of();
        }
        E next = elements.next();
        if (!elements.hasNext()) {
            return of((java.lang.Object) next);
        }
        return new com.google.common.collect.ImmutableList.Builder().add((java.lang.Object) next).addAll((java.util.Iterator) elements).build();
    }

    public static <E> com.google.common.collect.ImmutableList<E> copyOf(E[] elements) {
        if (elements.length == 0) {
            return of();
        }
        return construct((java.lang.Object[]) elements.clone());
    }

    public static <E extends java.lang.Comparable<? super E>> com.google.common.collect.ImmutableList<E> sortedCopyOf(java.lang.Iterable<? extends E> elements) {
        java.lang.Comparable[] comparableArr = (java.lang.Comparable[]) com.google.common.collect.Iterables.toArray(elements, new java.lang.Comparable[0]);
        com.google.common.collect.ObjectArrays.checkElementsNotNull(comparableArr);
        java.util.Arrays.sort(comparableArr);
        return asImmutableList(comparableArr);
    }

    public static <E> com.google.common.collect.ImmutableList<E> sortedCopyOf(java.util.Comparator<? super E> comparator, java.lang.Iterable<? extends E> elements) {
        com.google.common.base.Preconditions.checkNotNull(comparator);
        java.lang.Object[] array = com.google.common.collect.Iterables.toArray(elements);
        com.google.common.collect.ObjectArrays.checkElementsNotNull(array);
        java.util.Arrays.sort(array, comparator);
        return asImmutableList(array);
    }

    private static <E> com.google.common.collect.ImmutableList<E> construct(java.lang.Object... elements) {
        return asImmutableList(com.google.common.collect.ObjectArrays.checkElementsNotNull(elements));
    }

    static <E> com.google.common.collect.ImmutableList<E> asImmutableList(java.lang.Object[] elements) {
        return asImmutableList(elements, elements.length);
    }

    static <E> com.google.common.collect.ImmutableList<E> asImmutableList(java.lang.Object[] elements, int length) {
        if (length == 0) {
            return of();
        }
        return new com.google.common.collect.RegularImmutableList(elements, length);
    }

    ImmutableList() {
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public com.google.common.collect.UnmodifiableIterator<E> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public com.google.common.collect.UnmodifiableListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public com.google.common.collect.UnmodifiableListIterator<E> listIterator(int i) {
        com.google.common.base.Preconditions.checkPositionIndex(i, size());
        if (isEmpty()) {
            return (com.google.common.collect.UnmodifiableListIterator<E>) EMPTY_ITR;
        }
        return new com.google.common.collect.ImmutableList.Itr(this, i);
    }

    static class Itr<E> extends com.google.common.collect.AbstractIndexedListIterator<E> {
        private final com.google.common.collect.ImmutableList<E> list;

        Itr(com.google.common.collect.ImmutableList<E> list, int index) {
            super(list.size(), index);
            this.list = list;
        }

        @Override // com.google.common.collect.AbstractIndexedListIterator
        protected E get(int index) {
            return this.list.get(index);
        }
    }

    @Override // java.util.List
    public int indexOf(@javax.annotation.CheckForNull java.lang.Object object) {
        if (object == null) {
            return -1;
        }
        return com.google.common.collect.Lists.indexOfImpl(this, object);
    }

    @Override // java.util.List
    public int lastIndexOf(@javax.annotation.CheckForNull java.lang.Object object) {
        if (object == null) {
            return -1;
        }
        return com.google.common.collect.Lists.lastIndexOfImpl(this, object);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@javax.annotation.CheckForNull java.lang.Object object) {
        return indexOf(object) >= 0;
    }

    @Override // java.util.List
    public com.google.common.collect.ImmutableList<E> subList(int fromIndex, int toIndex) {
        com.google.common.base.Preconditions.checkPositionIndexes(fromIndex, toIndex, size());
        int i = toIndex - fromIndex;
        if (i == size()) {
            return this;
        }
        if (i == 0) {
            return of();
        }
        return subListUnchecked(fromIndex, toIndex);
    }

    com.google.common.collect.ImmutableList<E> subListUnchecked(int fromIndex, int toIndex) {
        return new com.google.common.collect.ImmutableList.SubList(fromIndex, toIndex - fromIndex);
    }

    class SubList extends com.google.common.collect.ImmutableList<E> {
        final transient int length;
        final transient int offset;

        @Override // com.google.common.collect.ImmutableCollection
        boolean isPartialView() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ java.util.ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ java.util.ListIterator listIterator(int index) {
            return super.listIterator(index);
        }

        SubList(int offset, int length) {
            this.offset = offset;
            this.length = length;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.length;
        }

        @Override // com.google.common.collect.ImmutableCollection
        @javax.annotation.CheckForNull
        java.lang.Object[] internalArray() {
            return com.google.common.collect.ImmutableList.this.internalArray();
        }

        @Override // com.google.common.collect.ImmutableCollection
        int internalArrayStart() {
            return com.google.common.collect.ImmutableList.this.internalArrayStart() + this.offset;
        }

        @Override // com.google.common.collect.ImmutableCollection
        int internalArrayEnd() {
            return com.google.common.collect.ImmutableList.this.internalArrayStart() + this.offset + this.length;
        }

        @Override // java.util.List
        public E get(int index) {
            com.google.common.base.Preconditions.checkElementIndex(index, this.length);
            return com.google.common.collect.ImmutableList.this.get(index + this.offset);
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public com.google.common.collect.ImmutableList<E> subList(int fromIndex, int toIndex) {
            com.google.common.base.Preconditions.checkPositionIndexes(fromIndex, toIndex, this.length);
            com.google.common.collect.ImmutableList immutableList = com.google.common.collect.ImmutableList.this;
            int i = this.offset;
            return immutableList.subList(fromIndex + i, toIndex + i);
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        java.lang.Object writeReplace() {
            return super.writeReplace();
        }
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final boolean addAll(int index, java.util.Collection<? extends E> newElements) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final E set(int index, E element) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final void add(int index, E element) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final E remove(int index) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection
    int copyIntoArray(java.lang.Object[] dst, int offset) {
        int size = size();
        for (int i = 0; i < size; i++) {
            dst[offset + i] = get(i);
        }
        return offset + size;
    }

    public com.google.common.collect.ImmutableList<E> reverse() {
        return size() <= 1 ? this : new com.google.common.collect.ImmutableList.ReverseImmutableList(this);
    }

    private static class ReverseImmutableList<E> extends com.google.common.collect.ImmutableList<E> {
        private final transient com.google.common.collect.ImmutableList<E> forwardList;

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ java.util.ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ java.util.ListIterator listIterator(int index) {
            return super.listIterator(index);
        }

        ReverseImmutableList(com.google.common.collect.ImmutableList<E> backingList) {
            this.forwardList = backingList;
        }

        private int reverseIndex(int index) {
            return (size() - 1) - index;
        }

        private int reversePosition(int index) {
            return size() - index;
        }

        @Override // com.google.common.collect.ImmutableList
        public com.google.common.collect.ImmutableList<E> reverse() {
            return this.forwardList;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object object) {
            return this.forwardList.contains(object);
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int indexOf(@javax.annotation.CheckForNull java.lang.Object object) {
            int iLastIndexOf = this.forwardList.lastIndexOf(object);
            if (iLastIndexOf >= 0) {
                return reverseIndex(iLastIndexOf);
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int lastIndexOf(@javax.annotation.CheckForNull java.lang.Object object) {
            int iIndexOf = this.forwardList.indexOf(object);
            if (iIndexOf >= 0) {
                return reverseIndex(iIndexOf);
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public com.google.common.collect.ImmutableList<E> subList(int fromIndex, int toIndex) {
            com.google.common.base.Preconditions.checkPositionIndexes(fromIndex, toIndex, size());
            return this.forwardList.subList(reversePosition(toIndex), reversePosition(fromIndex)).reverse();
        }

        @Override // java.util.List
        public E get(int index) {
            com.google.common.base.Preconditions.checkElementIndex(index, size());
            return this.forwardList.get(reverseIndex(index));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.forwardList.size();
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean isPartialView() {
            return this.forwardList.isPartialView();
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        java.lang.Object writeReplace() {
            return super.writeReplace();
        }
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        return com.google.common.collect.Lists.equalsImpl(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~((i * 31) + get(i2).hashCode()));
        }
        return i;
    }

    static class SerializedForm implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        final java.lang.Object[] elements;

        SerializedForm(java.lang.Object[] elements) {
            this.elements = elements;
        }

        java.lang.Object readResolve() {
            return com.google.common.collect.ImmutableList.copyOf(this.elements);
        }
    }

    private void readObject(java.io.ObjectInputStream stream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.ImmutableCollection
    java.lang.Object writeReplace() {
        return new com.google.common.collect.ImmutableList.SerializedForm(toArray());
    }

    public static <E> com.google.common.collect.ImmutableList.Builder<E> builder() {
        return new com.google.common.collect.ImmutableList.Builder<>();
    }

    public static <E> com.google.common.collect.ImmutableList.Builder<E> builderWithExpectedSize(int expectedSize) {
        com.google.common.collect.CollectPreconditions.checkNonnegative(expectedSize, "expectedSize");
        return new com.google.common.collect.ImmutableList.Builder<>(expectedSize);
    }

    public static final class Builder<E> extends com.google.common.collect.ImmutableCollection.ArrayBasedBuilder<E> {
        public Builder() {
            this(4);
        }

        Builder(int capacity) {
            super(capacity);
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        public com.google.common.collect.ImmutableList.Builder<E> add(E element) {
            super.add((java.lang.Object) element);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        public com.google.common.collect.ImmutableList.Builder<E> add(E... elements) {
            super.add((java.lang.Object[]) elements);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        public com.google.common.collect.ImmutableList.Builder<E> addAll(java.lang.Iterable<? extends E> elements) {
            super.addAll((java.lang.Iterable) elements);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public com.google.common.collect.ImmutableList.Builder<E> addAll(java.util.Iterator<? extends E> elements) {
            super.addAll((java.util.Iterator) elements);
            return this;
        }

        com.google.common.collect.ImmutableList.Builder<E> combine(com.google.common.collect.ImmutableList.Builder<E> other) {
            addAll(other.contents, other.size);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public com.google.common.collect.ImmutableList<E> build() {
            this.forceCopy = true;
            return com.google.common.collect.ImmutableList.asImmutableList(this.contents, this.size);
        }
    }
}
