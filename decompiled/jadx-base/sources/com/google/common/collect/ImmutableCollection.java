package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.errorprone.annotations.DoNotMock("Use ImmutableList.of or another implementation")
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ImmutableCollection<E> extends java.util.AbstractCollection<E> implements java.io.Serializable {
    private static final java.lang.Object[] EMPTY_ARRAY = new java.lang.Object[0];
    private static final long serialVersionUID = 912559;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(@javax.annotation.CheckForNull java.lang.Object object);

    @javax.annotation.CheckForNull
    java.lang.Object[] internalArray() {
        return null;
    }

    abstract boolean isPartialView();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public abstract com.google.common.collect.UnmodifiableIterator<E> iterator();

    ImmutableCollection() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final java.lang.Object[] toArray() {
        return toArray(EMPTY_ARRAY);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        com.google.common.base.Preconditions.checkNotNull(tArr);
        int size = size();
        if (tArr.length < size) {
            java.lang.Object[] objArrInternalArray = internalArray();
            if (objArrInternalArray != null) {
                return (T[]) com.google.common.collect.Platform.copy(objArrInternalArray, internalArrayStart(), internalArrayEnd(), tArr);
            }
            tArr = (T[]) com.google.common.collect.ObjectArrays.newArray(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        copyIntoArray(tArr, 0);
        return tArr;
    }

    int internalArrayStart() {
        throw new java.lang.UnsupportedOperationException();
    }

    int internalArrayEnd() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean add(E e) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean remove(@javax.annotation.CheckForNull java.lang.Object object) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean addAll(java.util.Collection<? extends E> newElements) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean removeAll(java.util.Collection<?> oldElements) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean retainAll(java.util.Collection<?> elementsToKeep) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final void clear() {
        throw new java.lang.UnsupportedOperationException();
    }

    public com.google.common.collect.ImmutableList<E> asList() {
        return isEmpty() ? com.google.common.collect.ImmutableList.of() : com.google.common.collect.ImmutableList.asImmutableList(toArray());
    }

    int copyIntoArray(java.lang.Object[] dst, int offset) {
        com.google.common.collect.UnmodifiableIterator<E> it = iterator();
        while (it.hasNext()) {
            dst[offset] = it.next();
            offset++;
        }
        return offset;
    }

    java.lang.Object writeReplace() {
        return new com.google.common.collect.ImmutableList.SerializedForm(toArray());
    }

    private void readObject(java.io.ObjectInputStream stream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use SerializedForm");
    }

    @com.google.errorprone.annotations.DoNotMock
    public static abstract class Builder<E> {
        static final int DEFAULT_INITIAL_CAPACITY = 4;

        public abstract com.google.common.collect.ImmutableCollection.Builder<E> add(E element);

        public abstract com.google.common.collect.ImmutableCollection<E> build();

        static int expandedCapacity(int oldCapacity, int minCapacity) {
            if (minCapacity < 0) {
                throw new java.lang.AssertionError("cannot store more than MAX_VALUE elements");
            }
            int iHighestOneBit = oldCapacity + (oldCapacity >> 1) + 1;
            if (iHighestOneBit < minCapacity) {
                iHighestOneBit = java.lang.Integer.highestOneBit(minCapacity - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                return Integer.MAX_VALUE;
            }
            return iHighestOneBit;
        }

        Builder() {
        }

        public com.google.common.collect.ImmutableCollection.Builder<E> add(E... elements) {
            for (E e : elements) {
                add(e);
            }
            return this;
        }

        public com.google.common.collect.ImmutableCollection.Builder<E> addAll(java.lang.Iterable<? extends E> elements) {
            java.util.Iterator<? extends E> it = elements.iterator();
            while (it.hasNext()) {
                add(it.next());
            }
            return this;
        }

        public com.google.common.collect.ImmutableCollection.Builder<E> addAll(java.util.Iterator<? extends E> elements) {
            while (elements.hasNext()) {
                add(elements.next());
            }
            return this;
        }
    }

    static abstract class ArrayBasedBuilder<E> extends com.google.common.collect.ImmutableCollection.Builder<E> {
        java.lang.Object[] contents;
        boolean forceCopy;
        int size;

        ArrayBasedBuilder(int initialCapacity) {
            com.google.common.collect.CollectPreconditions.checkNonnegative(initialCapacity, "initialCapacity");
            this.contents = new java.lang.Object[initialCapacity];
            this.size = 0;
        }

        private void getReadyToExpandTo(int minCapacity) {
            java.lang.Object[] objArr = this.contents;
            if (objArr.length < minCapacity) {
                this.contents = java.util.Arrays.copyOf(objArr, expandedCapacity(objArr.length, minCapacity));
                this.forceCopy = false;
            } else if (this.forceCopy) {
                this.contents = (java.lang.Object[]) objArr.clone();
                this.forceCopy = false;
            }
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public com.google.common.collect.ImmutableCollection.ArrayBasedBuilder<E> add(E element) {
            com.google.common.base.Preconditions.checkNotNull(element);
            getReadyToExpandTo(this.size + 1);
            java.lang.Object[] objArr = this.contents;
            int i = this.size;
            this.size = i + 1;
            objArr[i] = element;
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public com.google.common.collect.ImmutableCollection.Builder<E> add(E... elements) {
            addAll(elements, elements.length);
            return this;
        }

        final void addAll(java.lang.Object[] elements, int n) {
            com.google.common.collect.ObjectArrays.checkElementsNotNull(elements, n);
            getReadyToExpandTo(this.size + n);
            java.lang.System.arraycopy(elements, 0, this.contents, this.size, n);
            this.size += n;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public com.google.common.collect.ImmutableCollection.Builder<E> addAll(java.lang.Iterable<? extends E> elements) {
            if (elements instanceof java.util.Collection) {
                java.util.Collection collection = (java.util.Collection) elements;
                getReadyToExpandTo(this.size + collection.size());
                if (collection instanceof com.google.common.collect.ImmutableCollection) {
                    this.size = ((com.google.common.collect.ImmutableCollection) collection).copyIntoArray(this.contents, this.size);
                    return this;
                }
            }
            super.addAll(elements);
            return this;
        }
    }
}
