package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ForwardingIterator<T> extends com.google.common.collect.ForwardingObject implements java.util.Iterator<T> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingObject
    public abstract java.util.Iterator<T> delegate();

    protected ForwardingIterator() {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return delegate().hasNext();
    }

    @com.google.common.collect.ParametricNullness
    public T next() {
        return delegate().next();
    }

    public void remove() {
        delegate().remove();
    }
}
