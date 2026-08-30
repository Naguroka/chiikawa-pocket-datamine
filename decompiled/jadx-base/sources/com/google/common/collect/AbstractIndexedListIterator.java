package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
abstract class AbstractIndexedListIterator<E> extends com.google.common.collect.UnmodifiableListIterator<E> {
    private int position;
    private final int size;

    @com.google.common.collect.ParametricNullness
    protected abstract E get(int index);

    protected AbstractIndexedListIterator(int size) {
        this(size, 0);
    }

    protected AbstractIndexedListIterator(int size, int position) {
        com.google.common.base.Preconditions.checkPositionIndex(position, size);
        this.size = size;
        this.position = position;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.position < this.size;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    @com.google.common.collect.ParametricNullness
    public final E next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        int i = this.position;
        this.position = i + 1;
        return get(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.position;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.position > 0;
    }

    @Override // java.util.ListIterator
    @com.google.common.collect.ParametricNullness
    public final E previous() {
        if (!hasPrevious()) {
            throw new java.util.NoSuchElementException();
        }
        int i = this.position - 1;
        this.position = i;
        return get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.position - 1;
    }
}
