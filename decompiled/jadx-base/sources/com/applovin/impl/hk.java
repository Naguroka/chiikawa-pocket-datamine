package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class hk extends com.applovin.impl.hb {
    final transient java.lang.Object c;
    private transient int d;

    @Override // com.applovin.impl.bb
    boolean e() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public java.lang.String toString() {
        return com.ironsource.y8.i.d + this.c.toString() + ']';
    }

    hk(java.lang.Object obj) {
        this.c = com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(obj);
    }

    @Override // com.applovin.impl.bb, java.util.AbstractCollection, java.util.Collection
    public boolean contains(java.lang.Object obj) {
        return this.c.equals(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public com.applovin.impl.pp iterator() {
        return com.applovin.impl.wb.a(this.c);
    }

    @Override // com.applovin.impl.hb
    com.applovin.impl.db f() {
        return com.applovin.impl.db.a(this.c);
    }

    @Override // com.applovin.impl.bb
    int a(java.lang.Object[] objArr, int i) {
        objArr[i] = this.c;
        return i + 1;
    }

    @Override // com.applovin.impl.hb, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.c.hashCode();
        this.d = iHashCode;
        return iHashCode;
    }

    hk(java.lang.Object obj, int i) {
        this.c = obj;
        this.d = i;
    }

    @Override // com.applovin.impl.hb
    boolean g() {
        return this.d != 0;
    }
}
