package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ImmutableSet<E> extends com.google.common.collect.ImmutableCollection<E> implements java.util.Set<E> {
    private static final int CUTOFF = 751619276;
    private static final double DESIRED_LOAD_FACTOR = 0.7d;
    static final int MAX_TABLE_SIZE = 1073741824;
    private static final long serialVersionUID = 912559;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.collect.ImmutableList<E> asList;

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean shouldTrim(int actualUnique, int expectedUnique) {
        return actualUnique < (expectedUnique >> 1) + (expectedUnique >> 2);
    }

    boolean isHashCodeFast() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public abstract com.google.common.collect.UnmodifiableIterator<E> iterator();

    static <E> java.util.stream.Collector<E, ?, com.google.common.collect.ImmutableSet<E>> toImmutableSet() {
        return com.google.common.collect.CollectCollectors.toImmutableSet();
    }

    public static <E> com.google.common.collect.ImmutableSet<E> of() {
        return com.google.common.collect.RegularImmutableSet.EMPTY;
    }

    public static <E> com.google.common.collect.ImmutableSet<E> of(E element) {
        return new com.google.common.collect.SingletonImmutableSet(element);
    }

    public static <E> com.google.common.collect.ImmutableSet<E> of(E e1, E e2) {
        return construct(2, e1, e2);
    }

    public static <E> com.google.common.collect.ImmutableSet<E> of(E e1, E e2, E e3) {
        return construct(3, e1, e2, e3);
    }

    public static <E> com.google.common.collect.ImmutableSet<E> of(E e1, E e2, E e3, E e4) {
        return construct(4, e1, e2, e3, e4);
    }

    public static <E> com.google.common.collect.ImmutableSet<E> of(E e1, E e2, E e3, E e4, E e5) {
        return construct(5, e1, e2, e3, e4, e5);
    }

    @java.lang.SafeVarargs
    public static <E> com.google.common.collect.ImmutableSet<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E... others) {
        com.google.common.base.Preconditions.checkArgument(others.length <= 2147483641, "the total number of elements must fit in an int");
        int length = others.length + 6;
        java.lang.Object[] objArr = new java.lang.Object[length];
        objArr[0] = e1;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        java.lang.System.arraycopy(others, 0, objArr, 6, others.length);
        return construct(length, objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> com.google.common.collect.ImmutableSet<E> construct(int n, java.lang.Object... elements) {
        if (n == 0) {
            return of();
        }
        if (n == 1) {
            return of(java.util.Objects.requireNonNull(elements[0]));
        }
        int iChooseTableSize = chooseTableSize(n);
        java.lang.Object[] objArr = new java.lang.Object[iChooseTableSize];
        int i = iChooseTableSize - 1;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < n; i4++) {
            java.lang.Object objCheckElementNotNull = com.google.common.collect.ObjectArrays.checkElementNotNull(elements[i4], i4);
            int iHashCode = objCheckElementNotNull.hashCode();
            int iSmear = com.google.common.collect.Hashing.smear(iHashCode);
            while (true) {
                int i5 = iSmear & i;
                java.lang.Object obj = objArr[i5];
                if (obj == null) {
                    elements[i3] = objCheckElementNotNull;
                    objArr[i5] = objCheckElementNotNull;
                    i2 += iHashCode;
                    i3++;
                    break;
                }
                if (obj.equals(objCheckElementNotNull)) {
                    break;
                }
                iSmear++;
            }
        }
        java.util.Arrays.fill(elements, i3, n, (java.lang.Object) null);
        if (i3 == 1) {
            return new com.google.common.collect.SingletonImmutableSet(java.util.Objects.requireNonNull(elements[0]));
        }
        if (chooseTableSize(i3) < iChooseTableSize / 2) {
            return construct(i3, elements);
        }
        if (shouldTrim(i3, elements.length)) {
            elements = java.util.Arrays.copyOf(elements, i3);
        }
        return new com.google.common.collect.RegularImmutableSet(elements, i2, objArr, i, i3);
    }

    static int chooseTableSize(int setSize) {
        int iMax = java.lang.Math.max(setSize, 2);
        if (iMax < CUTOFF) {
            int iHighestOneBit = java.lang.Integer.highestOneBit(iMax - 1) << 1;
            while (((double) iHighestOneBit) * DESIRED_LOAD_FACTOR < iMax) {
                iHighestOneBit <<= 1;
            }
            return iHighestOneBit;
        }
        com.google.common.base.Preconditions.checkArgument(iMax < 1073741824, "collection too large");
        return 1073741824;
    }

    public static <E> com.google.common.collect.ImmutableSet<E> copyOf(java.util.Collection<? extends E> elements) {
        if ((elements instanceof com.google.common.collect.ImmutableSet) && !(elements instanceof java.util.SortedSet)) {
            com.google.common.collect.ImmutableSet<E> immutableSet = (com.google.common.collect.ImmutableSet) elements;
            if (!immutableSet.isPartialView()) {
                return immutableSet;
            }
        }
        java.lang.Object[] array = elements.toArray();
        return construct(array.length, array);
    }

    public static <E> com.google.common.collect.ImmutableSet<E> copyOf(java.lang.Iterable<? extends E> elements) {
        if (elements instanceof java.util.Collection) {
            return copyOf((java.util.Collection) elements);
        }
        return copyOf(elements.iterator());
    }

    public static <E> com.google.common.collect.ImmutableSet<E> copyOf(java.util.Iterator<? extends E> elements) {
        if (!elements.hasNext()) {
            return of();
        }
        E next = elements.next();
        if (!elements.hasNext()) {
            return of((java.lang.Object) next);
        }
        return new com.google.common.collect.ImmutableSet.Builder().add((java.lang.Object) next).addAll((java.util.Iterator) elements).build();
    }

    public static <E> com.google.common.collect.ImmutableSet<E> copyOf(E[] elements) {
        int length = elements.length;
        if (length == 0) {
            return of();
        }
        if (length == 1) {
            return of((java.lang.Object) elements[0]);
        }
        return construct(elements.length, (java.lang.Object[]) elements.clone());
    }

    ImmutableSet() {
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
        if (object == this) {
            return true;
        }
        if ((object instanceof com.google.common.collect.ImmutableSet) && isHashCodeFast() && ((com.google.common.collect.ImmutableSet) object).isHashCodeFast() && hashCode() != object.hashCode()) {
            return false;
        }
        return com.google.common.collect.Sets.equalsImpl(this, object);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return com.google.common.collect.Sets.hashCodeImpl(this);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public com.google.common.collect.ImmutableList<E> asList() {
        com.google.common.collect.ImmutableList<E> immutableList = this.asList;
        if (immutableList != null) {
            return immutableList;
        }
        com.google.common.collect.ImmutableList<E> immutableListCreateAsList = createAsList();
        this.asList = immutableListCreateAsList;
        return immutableListCreateAsList;
    }

    com.google.common.collect.ImmutableList<E> createAsList() {
        return com.google.common.collect.ImmutableList.asImmutableList(toArray());
    }

    private static class SerializedForm implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        final java.lang.Object[] elements;

        SerializedForm(java.lang.Object[] elements) {
            this.elements = elements;
        }

        java.lang.Object readResolve() {
            return com.google.common.collect.ImmutableSet.copyOf(this.elements);
        }
    }

    @Override // com.google.common.collect.ImmutableCollection
    java.lang.Object writeReplace() {
        return new com.google.common.collect.ImmutableSet.SerializedForm(toArray());
    }

    private void readObject(java.io.ObjectInputStream stream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use SerializedForm");
    }

    public static <E> com.google.common.collect.ImmutableSet.Builder<E> builder() {
        return new com.google.common.collect.ImmutableSet.Builder<>();
    }

    public static <E> com.google.common.collect.ImmutableSet.Builder<E> builderWithExpectedSize(int expectedSize) {
        com.google.common.collect.CollectPreconditions.checkNonnegative(expectedSize, "expectedSize");
        return new com.google.common.collect.ImmutableSet.Builder<>(expectedSize);
    }

    public static class Builder<E> extends com.google.common.collect.ImmutableCollection.ArrayBasedBuilder<E> {
        private int hashCode;

        @javax.annotation.CheckForNull
        java.lang.Object[] hashTable;

        public Builder() {
            super(4);
        }

        Builder(int capacity) {
            super(capacity);
            this.hashTable = new java.lang.Object[com.google.common.collect.ImmutableSet.chooseTableSize(capacity)];
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        public com.google.common.collect.ImmutableSet.Builder<E> add(E element) {
            com.google.common.base.Preconditions.checkNotNull(element);
            if (this.hashTable != null && com.google.common.collect.ImmutableSet.chooseTableSize(this.size) <= this.hashTable.length) {
                addDeduping(element);
                return this;
            }
            this.hashTable = null;
            super.add((java.lang.Object) element);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        public com.google.common.collect.ImmutableSet.Builder<E> add(E... elements) {
            if (this.hashTable != null) {
                for (E e : elements) {
                    add((java.lang.Object) e);
                }
            } else {
                super.add((java.lang.Object[]) elements);
            }
            return this;
        }

        private void addDeduping(E element) {
            java.util.Objects.requireNonNull(this.hashTable);
            int length = this.hashTable.length - 1;
            int iHashCode = element.hashCode();
            int iSmear = com.google.common.collect.Hashing.smear(iHashCode);
            while (true) {
                int i = iSmear & length;
                java.lang.Object[] objArr = this.hashTable;
                java.lang.Object obj = objArr[i];
                if (obj == null) {
                    objArr[i] = element;
                    this.hashCode += iHashCode;
                    super.add((java.lang.Object) element);
                    return;
                } else if (obj.equals(element)) {
                    return;
                } else {
                    iSmear = i + 1;
                }
            }
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        public com.google.common.collect.ImmutableSet.Builder<E> addAll(java.lang.Iterable<? extends E> elements) {
            com.google.common.base.Preconditions.checkNotNull(elements);
            if (this.hashTable != null) {
                java.util.Iterator<? extends E> it = elements.iterator();
                while (it.hasNext()) {
                    add((java.lang.Object) it.next());
                }
            } else {
                super.addAll((java.lang.Iterable) elements);
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public com.google.common.collect.ImmutableSet.Builder<E> addAll(java.util.Iterator<? extends E> elements) {
            com.google.common.base.Preconditions.checkNotNull(elements);
            while (elements.hasNext()) {
                add((java.lang.Object) elements.next());
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        com.google.common.collect.ImmutableSet.Builder<E> combine(com.google.common.collect.ImmutableSet.Builder<E> other) {
            if (this.hashTable != null) {
                for (int i = 0; i < other.size; i++) {
                    add(java.util.Objects.requireNonNull(other.contents[i]));
                }
            } else {
                addAll(other.contents, other.size);
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public com.google.common.collect.ImmutableSet<E> build() {
            com.google.common.collect.ImmutableSet<E> immutableSetConstruct;
            int i = this.size;
            if (i == 0) {
                return com.google.common.collect.ImmutableSet.of();
            }
            if (i == 1) {
                return com.google.common.collect.ImmutableSet.of(java.util.Objects.requireNonNull(this.contents[0]));
            }
            if (this.hashTable == null || com.google.common.collect.ImmutableSet.chooseTableSize(this.size) != this.hashTable.length) {
                immutableSetConstruct = com.google.common.collect.ImmutableSet.construct(this.size, this.contents);
                this.size = immutableSetConstruct.size();
            } else {
                java.lang.Object[] objArrCopyOf = com.google.common.collect.ImmutableSet.shouldTrim(this.size, this.contents.length) ? java.util.Arrays.copyOf(this.contents, this.size) : this.contents;
                int i2 = this.hashCode;
                java.lang.Object[] objArr = this.hashTable;
                immutableSetConstruct = new com.google.common.collect.RegularImmutableSet<>(objArrCopyOf, i2, objArr, objArr.length - 1, this.size);
            }
            this.forceCopy = true;
            this.hashTable = null;
            return immutableSetConstruct;
        }
    }
}
