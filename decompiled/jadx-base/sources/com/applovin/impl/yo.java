package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
abstract class yo implements java.util.Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final java.util.Iterator f1549a;

    abstract java.lang.Object a(java.lang.Object obj);

    yo(java.util.Iterator it) {
        this.f1549a = (java.util.Iterator) com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(it);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1549a.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        return a(this.f1549a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f1549a.remove();
    }
}
