package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bb extends java.util.AbstractCollection implements java.io.Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.Object[] f640a = new java.lang.Object[0];

    abstract int a(java.lang.Object[] objArr, int i);

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    java.lang.Object[] b() {
        return null;
    }

    int c() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean contains(java.lang.Object obj);

    int d() {
        throw new java.lang.UnsupportedOperationException();
    }

    abstract boolean e();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public abstract com.applovin.impl.pp iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    bb() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final java.lang.Object[] toArray() {
        return toArray(f640a);
    }

    public com.applovin.impl.db a() {
        return isEmpty() ? com.applovin.impl.db.h() : com.applovin.impl.db.a(toArray());
    }

    public static abstract class b {
        b() {
        }

        static int a(int i, int i2) {
            if (i2 < 0) {
                throw new java.lang.AssertionError("cannot store more than MAX_VALUE elements");
            }
            int iHighestOneBit = i + (i >> 1) + 1;
            if (iHighestOneBit < i2) {
                iHighestOneBit = java.lang.Integer.highestOneBit(i2 - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                return Integer.MAX_VALUE;
            }
            return iHighestOneBit;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(objArr);
        int size = size();
        if (objArr.length < size) {
            java.lang.Object[] objArrB = b();
            if (objArrB != null) {
                return com.applovin.impl.mh.a(objArrB, d(), c(), objArr);
            }
            objArr = com.applovin.impl.fg.b(objArr, size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        a(objArr, 0);
        return objArr;
    }

    static abstract class a extends com.applovin.impl.bb.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        java.lang.Object[] f641a;
        int b;
        boolean c;

        a(int i) {
            com.applovin.impl.p3.a(i, "initialCapacity");
            this.f641a = new java.lang.Object[i];
            this.b = 0;
        }

        public com.applovin.impl.bb.a a(java.lang.Object obj) {
            com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(obj);
            a(this.b + 1);
            java.lang.Object[] objArr = this.f641a;
            int i = this.b;
            this.b = i + 1;
            objArr[i] = obj;
            return this;
        }

        private void a(int i) {
            java.lang.Object[] objArr = this.f641a;
            if (objArr.length < i) {
                this.f641a = java.util.Arrays.copyOf(objArr, com.applovin.impl.bb.b.a(objArr.length, i));
                this.c = false;
            } else if (this.c) {
                this.f641a = (java.lang.Object[]) objArr.clone();
                this.c = false;
            }
        }
    }
}
