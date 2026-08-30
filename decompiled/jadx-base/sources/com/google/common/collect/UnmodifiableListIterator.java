package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class UnmodifiableListIterator<E> extends com.google.common.collect.UnmodifiableIterator<E> implements java.util.ListIterator<E> {
    protected UnmodifiableListIterator() {
    }

    @Override // java.util.ListIterator
    @java.lang.Deprecated
    public final void add(@com.google.common.collect.ParametricNullness E e) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    @java.lang.Deprecated
    public final void set(@com.google.common.collect.ParametricNullness E e) {
        throw new java.lang.UnsupportedOperationException();
    }
}
