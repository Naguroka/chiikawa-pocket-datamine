package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
public abstract class ForwardingBlockingDeque<E> extends com.google.common.collect.ForwardingDeque<E> implements java.util.concurrent.BlockingDeque<E> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingDeque, com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public abstract java.util.concurrent.BlockingDeque<E> delegate();

    protected ForwardingBlockingDeque() {
    }

    @Override // java.util.concurrent.BlockingQueue
    public int remainingCapacity() {
        return delegate().remainingCapacity();
    }

    @Override // java.util.concurrent.BlockingDeque
    public void putFirst(E e) throws java.lang.InterruptedException {
        delegate().putFirst(e);
    }

    @Override // java.util.concurrent.BlockingDeque
    public void putLast(E e) throws java.lang.InterruptedException {
        delegate().putLast(e);
    }

    @Override // java.util.concurrent.BlockingDeque
    public boolean offerFirst(E e, long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException {
        return delegate().offerFirst(e, timeout, unit);
    }

    @Override // java.util.concurrent.BlockingDeque
    public boolean offerLast(E e, long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException {
        return delegate().offerLast(e, timeout, unit);
    }

    @Override // java.util.concurrent.BlockingDeque
    public E takeFirst() throws java.lang.InterruptedException {
        return delegate().takeFirst();
    }

    @Override // java.util.concurrent.BlockingDeque
    public E takeLast() throws java.lang.InterruptedException {
        return delegate().takeLast();
    }

    @Override // java.util.concurrent.BlockingDeque
    @javax.annotation.CheckForNull
    public E pollFirst(long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException {
        return delegate().pollFirst(timeout, unit);
    }

    @Override // java.util.concurrent.BlockingDeque
    @javax.annotation.CheckForNull
    public E pollLast(long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException {
        return delegate().pollLast(timeout, unit);
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public void put(E e) throws java.lang.InterruptedException {
        delegate().put(e);
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public boolean offer(E e, long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException {
        return delegate().offer(e, timeout, unit);
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public E take() throws java.lang.InterruptedException {
        return delegate().take();
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    @javax.annotation.CheckForNull
    public E poll(long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException {
        return delegate().poll(timeout, unit);
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(java.util.Collection<? super E> c) {
        return delegate().drainTo(c);
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(java.util.Collection<? super E> c, int maxElements) {
        return delegate().drainTo(c, maxElements);
    }
}
