package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class oi extends com.applovin.impl.hb {
    static final com.applovin.impl.oi i = new com.applovin.impl.oi(new java.lang.Object[0], 0, null, 0, 0);
    final transient java.lang.Object[] c;
    final transient java.lang.Object[] d;
    private final transient int f;
    private final transient int g;
    private final transient int h;

    @Override // com.applovin.impl.bb
    int d() {
        return 0;
    }

    @Override // com.applovin.impl.bb
    boolean e() {
        return false;
    }

    @Override // com.applovin.impl.hb
    boolean g() {
        return true;
    }

    oi(java.lang.Object[] objArr, int i2, java.lang.Object[] objArr2, int i3, int i4) {
        this.c = objArr;
        this.d = objArr2;
        this.f = i3;
        this.g = i2;
        this.h = i4;
    }

    @Override // com.applovin.impl.bb, java.util.AbstractCollection, java.util.Collection
    public boolean contains(java.lang.Object obj) {
        java.lang.Object[] objArr = this.d;
        if (obj == null || objArr == null) {
            return false;
        }
        int iA = com.applovin.impl.ja.a(obj);
        while (true) {
            int i2 = iA & this.f;
            java.lang.Object obj2 = objArr[i2];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iA = i2 + 1;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.h;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public com.applovin.impl.pp iterator() {
        return a().iterator();
    }

    @Override // com.applovin.impl.bb
    java.lang.Object[] b() {
        return this.c;
    }

    @Override // com.applovin.impl.bb
    int c() {
        return this.h;
    }

    @Override // com.applovin.impl.bb
    int a(java.lang.Object[] objArr, int i2) {
        java.lang.System.arraycopy(this.c, 0, objArr, i2, this.h);
        return i2 + this.h;
    }

    @Override // com.applovin.impl.hb
    com.applovin.impl.db f() {
        return com.applovin.impl.db.b(this.c, this.h);
    }

    @Override // com.applovin.impl.hb, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.g;
    }
}
