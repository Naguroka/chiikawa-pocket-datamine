package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ForwardingDeque<E> extends com.google.common.collect.ForwardingQueue<E> implements java.util.Deque<E> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public abstract java.util.Deque<E> delegate();

    protected ForwardingDeque() {
    }

    @Override // java.util.Deque
    public void addFirst(@com.google.common.collect.ParametricNullness E e) {
        delegate().addFirst(e);
    }

    @Override // java.util.Deque
    public void addLast(@com.google.common.collect.ParametricNullness E e) {
        delegate().addLast(e);
    }

    @Override // java.util.Deque
    public java.util.Iterator<E> descendingIterator() {
        return delegate().descendingIterator();
    }

    @Override // java.util.Deque
    @com.google.common.collect.ParametricNullness
    public E getFirst() {
        return delegate().getFirst();
    }

    @Override // java.util.Deque
    @com.google.common.collect.ParametricNullness
    public E getLast() {
        return delegate().getLast();
    }

    @Override // java.util.Deque
    public boolean offerFirst(@com.google.common.collect.ParametricNullness E e) {
        return delegate().offerFirst(e);
    }

    @Override // java.util.Deque
    public boolean offerLast(@com.google.common.collect.ParametricNullness E e) {
        return delegate().offerLast(e);
    }

    @Override // java.util.Deque
    @javax.annotation.CheckForNull
    public E peekFirst() {
        return delegate().peekFirst();
    }

    @Override // java.util.Deque
    @javax.annotation.CheckForNull
    public E peekLast() {
        return delegate().peekLast();
    }

    @Override // java.util.Deque
    @javax.annotation.CheckForNull
    public E pollFirst() {
        return delegate().pollFirst();
    }

    @Override // java.util.Deque
    @javax.annotation.CheckForNull
    public E pollLast() {
        return delegate().pollLast();
    }

    @Override // java.util.Deque
    @com.google.common.collect.ParametricNullness
    public E pop() {
        return delegate().pop();
    }

    @Override // java.util.Deque
    public void push(@com.google.common.collect.ParametricNullness E e) {
        delegate().push(e);
    }

    @Override // java.util.Deque
    @com.google.common.collect.ParametricNullness
    public E removeFirst() {
        return delegate().removeFirst();
    }

    @Override // java.util.Deque
    @com.google.common.collect.ParametricNullness
    public E removeLast() {
        return delegate().removeLast();
    }

    @Override // java.util.Deque
    public boolean removeFirstOccurrence(@javax.annotation.CheckForNull java.lang.Object o) {
        return delegate().removeFirstOccurrence(o);
    }

    @Override // java.util.Deque
    public boolean removeLastOccurrence(@javax.annotation.CheckForNull java.lang.Object o) {
        return delegate().removeLastOccurrence(o);
    }
}
