package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ForwardingQueue<E> extends com.google.common.collect.ForwardingCollection<E> implements java.util.Queue<E> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public abstract java.util.Queue<E> delegate();

    protected ForwardingQueue() {
    }

    public boolean offer(@com.google.common.collect.ParametricNullness E o) {
        return delegate().offer(o);
    }

    @Override // java.util.Queue
    @javax.annotation.CheckForNull
    public E poll() {
        return delegate().poll();
    }

    @Override // java.util.Queue
    @com.google.common.collect.ParametricNullness
    public E remove() {
        return delegate().remove();
    }

    @Override // java.util.Queue
    @javax.annotation.CheckForNull
    public E peek() {
        return delegate().peek();
    }

    @Override // java.util.Queue
    @com.google.common.collect.ParametricNullness
    public E element() {
        return delegate().element();
    }

    protected boolean standardOffer(@com.google.common.collect.ParametricNullness E e) {
        try {
            return add(e);
        } catch (java.lang.IllegalStateException unused) {
            return false;
        }
    }

    @javax.annotation.CheckForNull
    protected E standardPeek() {
        try {
            return element();
        } catch (java.util.NoSuchElementException unused) {
            return null;
        }
    }

    @javax.annotation.CheckForNull
    protected E standardPoll() {
        try {
            return remove();
        } catch (java.util.NoSuchElementException unused) {
            return null;
        }
    }
}
