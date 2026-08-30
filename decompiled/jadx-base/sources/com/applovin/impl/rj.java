package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class rj {
    public static java.util.Set b() {
        return java.util.Collections.newSetFromMap(com.applovin.impl.uc.b());
    }

    static abstract class b extends java.util.AbstractSet {
        b() {
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(java.util.Collection collection) {
            return com.applovin.impl.rj.a((java.util.Set) this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(java.util.Collection collection) {
            return super.retainAll((java.util.Collection) com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(collection));
        }
    }

    public static abstract class c extends java.util.AbstractSet {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(java.lang.Object obj) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean addAll(java.util.Collection collection) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(java.lang.Object obj) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(java.util.Collection collection) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(java.util.Collection collection) {
            throw new java.lang.UnsupportedOperationException();
        }

        private c() {
        }

        /* synthetic */ c(com.applovin.impl.qj qjVar) {
            this();
        }
    }

    class a extends com.applovin.impl.rj.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.util.Set f1227a;
        final /* synthetic */ java.util.Set b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(java.util.Set set, java.util.Set set2) {
            super(null);
            this.f1227a = set;
            this.b = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public com.applovin.impl.pp iterator() {
            return new com.applovin.impl.rj.a.C0050a();
        }

        /* JADX INFO: renamed from: com.applovin.impl.rj$a$a, reason: collision with other inner class name */
        class C0050a extends com.applovin.impl.d {
            final java.util.Iterator c;

            C0050a() {
                this.c = com.applovin.impl.rj.a.this.f1227a.iterator();
            }

            @Override // com.applovin.impl.d
            protected java.lang.Object a() {
                while (this.c.hasNext()) {
                    java.lang.Object next = this.c.next();
                    if (com.applovin.impl.rj.a.this.b.contains(next)) {
                        return next;
                    }
                }
                return b();
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            java.util.Iterator it = this.f1227a.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (this.b.contains(it.next())) {
                    i++;
                }
            }
            return i;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return java.util.Collections.disjoint(this.b, this.f1227a);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object obj) {
            return this.f1227a.contains(obj) && this.b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(java.util.Collection collection) {
            return this.f1227a.containsAll(collection) && this.b.containsAll(collection);
        }
    }

    static boolean a(java.util.Set set, java.lang.Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof java.util.Set) {
            java.util.Set set2 = (java.util.Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            }
        }
        return false;
    }

    static int a(java.util.Set set) {
        java.util.Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    public static com.applovin.impl.rj.c a(java.util.Set set, java.util.Set set2) {
        com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(set, "set1");
        com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(set2, "set2");
        return new com.applovin.impl.rj.a(set, set2);
    }

    static boolean a(java.util.Set set, java.util.Collection collection) {
        com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(collection);
        if ((collection instanceof java.util.Set) && collection.size() > set.size()) {
            return com.applovin.impl.wb.a(set.iterator(), collection);
        }
        return a(set, collection.iterator());
    }

    static boolean a(java.util.Set set, java.util.Iterator it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }

    public static java.util.HashSet a() {
        return new java.util.HashSet();
    }

    public static java.util.HashSet a(int i) {
        return new java.util.HashSet(com.applovin.impl.uc.a(i));
    }
}
