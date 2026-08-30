package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
public abstract class ForwardingBlockingQueue<E> extends com.google.common.collect.ForwardingQueue<E> implements java.util.concurrent.BlockingQueue<E> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public abstract java.util.concurrent.BlockingQueue<E> delegate();

    protected ForwardingBlockingQueue() {
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(java.util.Collection<? super E> c, int maxElements) {
        return delegate().drainTo(c, maxElements);
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(java.util.Collection<? super E> c) {
        return delegate().drainTo(c);
    }

    @Override // java.util.concurrent.BlockingQueue
    public boolean offer(E e, long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException {
        return delegate().offer(e, timeout, unit);
    }

    @Override // java.util.concurrent.BlockingQueue
    @javax.annotation.CheckForNull
    public E poll(long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException {
        return delegate().poll(timeout, unit);
    }

    @Override // java.util.concurrent.BlockingQueue
    public void put(E e) throws java.lang.InterruptedException {
        delegate().put(e);
    }

    @Override // java.util.concurrent.BlockingQueue
    public int remainingCapacity() {
        return delegate().remainingCapacity();
    }

    @Override // java.util.concurrent.BlockingQueue
    public E take() throws java.lang.InterruptedException {
        return delegate().take();
    }
}
