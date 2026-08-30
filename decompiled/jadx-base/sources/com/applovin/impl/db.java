package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class db extends com.applovin.impl.bb implements java.util.List, java.util.RandomAccess {
    private static final com.applovin.impl.qp b = new com.applovin.impl.db.b(com.applovin.impl.mi.f, 0);

    public static com.applovin.impl.db.a f() {
        return new com.applovin.impl.db.a();
    }

    public static com.applovin.impl.db h() {
        return com.applovin.impl.mi.f;
    }

    @Override // com.applovin.impl.bb
    public final com.applovin.impl.db a() {
        return this;
    }

    @Override // java.util.List
    public final void add(int i, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List
    public final java.lang.Object remove(int i) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List
    public final java.lang.Object set(int i, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    public static com.applovin.impl.db c(java.lang.Object[] objArr) {
        if (objArr.length == 0) {
            return h();
        }
        return b((java.lang.Object[]) objArr.clone());
    }

    static com.applovin.impl.db a(java.lang.Object[] objArr) {
        return b(objArr, objArr.length);
    }

    static com.applovin.impl.db b(java.lang.Object[] objArr, int i) {
        if (i == 0) {
            return h();
        }
        return new com.applovin.impl.mi(objArr, i);
    }

    db() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public com.applovin.impl.pp iterator() {
        return listIterator();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public com.applovin.impl.qp listIterator() {
        return listIterator(0);
    }

    static class b extends com.applovin.impl.c {
        private final com.applovin.impl.db c;

        b(com.applovin.impl.db dbVar, int i) {
            super(dbVar.size(), i);
            this.c = dbVar;
        }

        @Override // com.applovin.impl.c
        protected java.lang.Object a(int i) {
            return this.c.get(i);
        }
    }

    @Override // java.util.List
    public int indexOf(java.lang.Object obj) {
        if (obj == null) {
            return -1;
        }
        return com.applovin.impl.hc.b(this, obj);
    }

    @Override // java.util.List
    public int lastIndexOf(java.lang.Object obj) {
        if (obj == null) {
            return -1;
        }
        return com.applovin.impl.hc.d(this, obj);
    }

    @Override // com.applovin.impl.bb, java.util.AbstractCollection, java.util.Collection
    public boolean contains(java.lang.Object obj) {
        return indexOf(obj) >= 0;
    }

    class c extends com.applovin.impl.db {
        final transient int c;
        final transient int d;

        @Override // com.applovin.impl.bb
        boolean e() {
            return true;
        }

        @Override // com.applovin.impl.db, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            return super.iterator();
        }

        @Override // com.applovin.impl.db, java.util.List
        public /* bridge */ /* synthetic */ java.util.ListIterator listIterator() {
            return super.listIterator();
        }

        c(int i, int i2) {
            this.c = i;
            this.d = i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.d;
        }

        @Override // com.applovin.impl.bb
        java.lang.Object[] b() {
            return com.applovin.impl.db.this.b();
        }

        @Override // com.applovin.impl.bb
        int d() {
            return com.applovin.impl.db.this.d() + this.c;
        }

        @Override // com.applovin.impl.bb
        int c() {
            return com.applovin.impl.db.this.d() + this.c + this.d;
        }

        @Override // java.util.List
        public java.lang.Object get(int i) {
            com.applovin.exoplayer2.common.base.Preconditions.checkElementIndex(i, this.d);
            return com.applovin.impl.db.this.get(i + this.c);
        }

        @Override // com.applovin.impl.db, java.util.List
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.db subList(int i, int i2) {
            com.applovin.exoplayer2.common.base.Preconditions.checkPositionIndexes(i, i2, this.d);
            com.applovin.impl.db dbVar = com.applovin.impl.db.this;
            int i3 = this.c;
            return dbVar.subList(i + i3, i2 + i3);
        }

        @Override // com.applovin.impl.db, java.util.List
        public /* bridge */ /* synthetic */ java.util.ListIterator listIterator(int i) {
            return super.listIterator(i);
        }
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(java.lang.Object obj) {
        return com.applovin.impl.hc.a(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~((i * 31) + get(i2).hashCode()));
        }
        return i;
    }

    private static com.applovin.impl.db b(java.lang.Object... objArr) {
        return a(com.applovin.impl.fg.a(objArr));
    }

    com.applovin.impl.db b(int i, int i2) {
        return new com.applovin.impl.db.c(i, i2 - i);
    }

    public static final class a extends com.applovin.impl.bb.a {
        public a() {
            this(4);
        }

        public com.applovin.impl.db.a b(java.lang.Object obj) {
            super.a(obj);
            return this;
        }

        public com.applovin.impl.db a() {
            this.c = true;
            return com.applovin.impl.db.b(this.f641a, this.b);
        }

        a(int i) {
            super(i);
        }
    }

    @Override // com.applovin.impl.bb
    int a(java.lang.Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    public static com.applovin.impl.db a(java.util.Collection collection) {
        if (collection instanceof com.applovin.impl.bb) {
            com.applovin.impl.db dbVarA = ((com.applovin.impl.bb) collection).a();
            return dbVarA.e() ? a(dbVarA.toArray()) : dbVarA;
        }
        return b(collection.toArray());
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.applovin.impl.qp listIterator(int i) {
        com.applovin.exoplayer2.common.base.Preconditions.checkPositionIndex(i, size());
        if (isEmpty()) {
            return b;
        }
        return new com.applovin.impl.db.b(this, i);
    }

    public static com.applovin.impl.db a(java.lang.Object obj) {
        return b(obj);
    }

    public static com.applovin.impl.db a(java.lang.Object obj, java.lang.Object obj2) {
        return b(obj, obj2);
    }

    public static com.applovin.impl.db a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        return b(obj, obj2, obj3, obj4, obj5);
    }

    public static com.applovin.impl.db a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6) {
        return b(obj, obj2, obj3, obj4, obj5, obj6);
    }

    public static com.applovin.impl.db a(java.util.Comparator comparator, java.lang.Iterable iterable) {
        com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(comparator);
        java.lang.Object[] objArrC = com.applovin.impl.vb.c(iterable);
        com.applovin.impl.fg.a(objArrC);
        java.util.Arrays.sort(objArrC, comparator);
        return a(objArrC);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: a */
    public com.applovin.impl.db subList(int i, int i2) {
        com.applovin.exoplayer2.common.base.Preconditions.checkPositionIndexes(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return h();
        }
        return b(i, i2);
    }
}
