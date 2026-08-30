package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
class mi extends com.applovin.impl.db {
    static final com.applovin.impl.db f = new com.applovin.impl.mi(new java.lang.Object[0], 0);
    final transient java.lang.Object[] c;
    private final transient int d;

    @Override // com.applovin.impl.bb
    int d() {
        return 0;
    }

    @Override // com.applovin.impl.bb
    boolean e() {
        return false;
    }

    mi(java.lang.Object[] objArr, int i) {
        this.c = objArr;
        this.d = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.d;
    }

    @Override // com.applovin.impl.bb
    java.lang.Object[] b() {
        return this.c;
    }

    @Override // com.applovin.impl.bb
    int c() {
        return this.d;
    }

    @Override // com.applovin.impl.db, com.applovin.impl.bb
    int a(java.lang.Object[] objArr, int i) {
        java.lang.System.arraycopy(this.c, 0, objArr, i, this.d);
        return i + this.d;
    }

    @Override // java.util.List
    public java.lang.Object get(int i) {
        com.applovin.exoplayer2.common.base.Preconditions.checkElementIndex(i, this.d);
        return this.c[i];
    }
}
