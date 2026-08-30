package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
abstract class c extends com.applovin.impl.qp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f661a;
    private int b;

    protected abstract java.lang.Object a(int i);

    protected c(int i, int i2) {
        com.applovin.exoplayer2.common.base.Preconditions.checkPositionIndex(i2, i);
        this.f661a = i;
        this.b = i2;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.b < this.f661a;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final java.lang.Object next() {
        if (hasNext()) {
            int i = this.b;
            this.b = i + 1;
            return a(i);
        }
        throw new java.util.NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b > 0;
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        if (hasPrevious()) {
            int i = this.b - 1;
            this.b = i;
            return a(i);
        }
        throw new java.util.NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b - 1;
    }
}
