package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ForwardingListIterator<E> extends com.google.common.collect.ForwardingIterator<E> implements java.util.ListIterator<E> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingIterator, com.google.common.collect.ForwardingObject
    public abstract java.util.ListIterator<E> delegate();

    protected ForwardingListIterator() {
    }

    @Override // java.util.ListIterator
    public void add(@com.google.common.collect.ParametricNullness E element) {
        delegate().add(element);
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return delegate().hasPrevious();
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return delegate().nextIndex();
    }

    @Override // java.util.ListIterator
    @com.google.common.collect.ParametricNullness
    public E previous() {
        return delegate().previous();
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return delegate().previousIndex();
    }

    @Override // java.util.ListIterator
    public void set(@com.google.common.collect.ParametricNullness E element) {
        delegate().set(element);
    }
}
