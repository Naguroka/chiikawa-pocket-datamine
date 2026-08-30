package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class UnmodifiableIterator<E> implements java.util.Iterator<E> {
    protected UnmodifiableIterator() {
    }

    @Override // java.util.Iterator
    @java.lang.Deprecated
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
