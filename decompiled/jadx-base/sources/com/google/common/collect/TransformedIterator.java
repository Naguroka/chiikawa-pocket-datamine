package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
abstract class TransformedIterator<F, T> implements java.util.Iterator<T> {
    final java.util.Iterator<? extends F> backingIterator;

    @com.google.common.collect.ParametricNullness
    abstract T transform(@com.google.common.collect.ParametricNullness F from);

    TransformedIterator(java.util.Iterator<? extends F> backingIterator) {
        this.backingIterator = (java.util.Iterator) com.google.common.base.Preconditions.checkNotNull(backingIterator);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.backingIterator.hasNext();
    }

    @Override // java.util.Iterator
    @com.google.common.collect.ParametricNullness
    public final T next() {
        return transform(this.backingIterator.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.backingIterator.remove();
    }
}
