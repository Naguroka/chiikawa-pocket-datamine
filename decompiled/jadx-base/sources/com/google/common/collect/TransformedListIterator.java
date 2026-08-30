package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
abstract class TransformedListIterator<F, T> extends com.google.common.collect.TransformedIterator<F, T> implements java.util.ListIterator<T> {
    TransformedListIterator(java.util.ListIterator<? extends F> backingIterator) {
        super(backingIterator);
    }

    private java.util.ListIterator<? extends F> backingIterator() {
        return (java.util.ListIterator) this.backingIterator;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return backingIterator().hasPrevious();
    }

    @Override // java.util.ListIterator
    @com.google.common.collect.ParametricNullness
    public final T previous() {
        return transform(backingIterator().previous());
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return backingIterator().nextIndex();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return backingIterator().previousIndex();
    }

    public void set(@com.google.common.collect.ParametricNullness T element) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public void add(@com.google.common.collect.ParametricNullness T element) {
        throw new java.lang.UnsupportedOperationException();
    }
}
