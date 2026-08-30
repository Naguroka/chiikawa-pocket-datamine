package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wb {
    public static java.lang.String d(java.util.Iterator it) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(com.ironsource.y8.i.d);
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(it.next());
            z = false;
        }
        return sb.append(']').toString();
    }

    private enum c implements java.util.Iterator {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public java.lang.Object next() {
            throw new java.util.NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            com.applovin.impl.p3.a(false);
        }
    }

    public static boolean a(java.util.Collection collection, java.util.Iterator it) {
        com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(collection);
        com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(it);
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    public static java.lang.Object b(java.util.Iterator it) {
        java.lang.Object next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    static com.applovin.impl.qp b() {
        return com.applovin.impl.wb.b.f;
    }

    static java.lang.Object c(java.util.Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        java.lang.Object next = it.next();
        it.remove();
        return next;
    }

    static java.util.Iterator c() {
        return com.applovin.impl.wb.c.INSTANCE;
    }

    private static final class b extends com.applovin.impl.c {
        static final com.applovin.impl.qp f = new com.applovin.impl.wb.b(new java.lang.Object[0], 0, 0, 0);
        private final java.lang.Object[] c;
        private final int d;

        b(java.lang.Object[] objArr, int i, int i2, int i3) {
            super(i2, i3);
            this.c = objArr;
            this.d = i;
        }

        @Override // com.applovin.impl.c
        protected java.lang.Object a(int i) {
            return this.c[this.d + i];
        }
    }

    class a extends com.applovin.impl.pp {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f1462a;
        final /* synthetic */ java.lang.Object b;

        a(java.lang.Object obj) {
            this.b = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f1462a;
        }

        @Override // java.util.Iterator
        public java.lang.Object next() {
            if (!this.f1462a) {
                this.f1462a = true;
                return this.b;
            }
            throw new java.util.NoSuchElementException();
        }
    }

    static void a(java.util.Iterator it) {
        com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static boolean a(java.util.Iterator it, java.util.Iterator it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !com.applovin.exoplayer2.common.base.Objects.equal(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    public static java.lang.Object a(java.util.Iterator it, java.lang.Object obj) {
        return it.hasNext() ? it.next() : obj;
    }

    public static boolean a(java.util.Iterator it, java.util.Collection collection) {
        com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    static com.applovin.impl.pp a() {
        return b();
    }

    public static com.applovin.impl.pp a(java.lang.Object obj) {
        return new com.applovin.impl.wb.a(obj);
    }
}
