package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gb extends com.applovin.impl.b2 implements java.io.Serializable {
    final transient com.applovin.impl.fb d;
    final transient int f;

    @Override // com.applovin.impl.h
    java.util.Map b() {
        throw new java.lang.AssertionError("should never be called");
    }

    @Override // com.applovin.impl.h
    java.util.Set c() {
        throw new java.lang.AssertionError("unreachable");
    }

    @Override // com.applovin.impl.tf
    public void clear() {
        throw new java.lang.UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.applovin.impl.h
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public com.applovin.impl.bb d() {
        return new com.applovin.impl.gb.c(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.applovin.impl.h
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public com.applovin.impl.pp f() {
        return new com.applovin.impl.gb.a();
    }

    @Override // com.applovin.impl.tf
    public boolean put(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.applovin.impl.h
    public /* bridge */ /* synthetic */ boolean equals(java.lang.Object obj) {
        return super.equals(obj);
    }

    @Override // com.applovin.impl.h
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.applovin.impl.h
    public /* bridge */ /* synthetic */ java.lang.String toString() {
        return super.toString();
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        java.util.Map f816a = com.applovin.impl.mh.a();
        java.util.Comparator b;
        java.util.Comparator c;

        java.util.Collection b() {
            return new java.util.ArrayList();
        }

        public com.applovin.impl.gb a() {
            java.util.Collection collectionEntrySet = this.f816a.entrySet();
            java.util.Comparator comparator = this.b;
            if (comparator != null) {
                collectionEntrySet = com.applovin.impl.vg.a(comparator).b().a(collectionEntrySet);
            }
            return com.applovin.impl.eb.a(collectionEntrySet, this.c);
        }

        public com.applovin.impl.gb.b a(java.lang.Object obj, java.lang.Iterable iterable) {
            if (obj != null) {
                java.util.Collection collection = (java.util.Collection) this.f816a.get(obj);
                if (collection != null) {
                    for (java.lang.Object obj2 : iterable) {
                        com.applovin.impl.p3.a(obj, obj2);
                        collection.add(obj2);
                    }
                    return this;
                }
                java.util.Iterator it = iterable.iterator();
                if (!it.hasNext()) {
                    return this;
                }
                java.util.Collection collectionB = b();
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    com.applovin.impl.p3.a(obj, next);
                    collectionB.add(next);
                }
                this.f816a.put(obj, collectionB);
                return this;
            }
            throw new java.lang.NullPointerException("null key in entry: null=" + com.applovin.impl.vb.d(iterable));
        }

        public com.applovin.impl.gb.b a(java.lang.Object obj, java.lang.Object... objArr) {
            return a(obj, java.util.Arrays.asList(objArr));
        }
    }

    gb(com.applovin.impl.fb fbVar, int i) {
        this.d = fbVar;
        this.f = i;
    }

    @Override // com.applovin.impl.tf
    public int size() {
        return this.f;
    }

    @Override // com.applovin.impl.h, com.applovin.impl.tf
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public com.applovin.impl.fb a() {
        return this.d;
    }

    @Override // com.applovin.impl.h
    public boolean a(java.lang.Object obj) {
        return obj != null && super.a(obj);
    }

    @Override // com.applovin.impl.h, com.applovin.impl.tf
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public com.applovin.impl.bb values() {
        return (com.applovin.impl.bb) super.values();
    }

    class a extends com.applovin.impl.pp {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        java.util.Iterator f815a;
        java.util.Iterator b = com.applovin.impl.wb.a();

        a() {
            this.f815a = com.applovin.impl.gb.this.d.values().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.b.hasNext() || this.f815a.hasNext();
        }

        @Override // java.util.Iterator
        public java.lang.Object next() {
            if (!this.b.hasNext()) {
                this.b = ((com.applovin.impl.bb) this.f815a.next()).iterator();
            }
            return this.b.next();
        }
    }

    private static final class c extends com.applovin.impl.bb {
        private final transient com.applovin.impl.gb b;

        c(com.applovin.impl.gb gbVar) {
            this.b = gbVar;
        }

        @Override // com.applovin.impl.bb, java.util.AbstractCollection, java.util.Collection
        public boolean contains(java.lang.Object obj) {
            return this.b.a(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public com.applovin.impl.pp iterator() {
            return this.b.f();
        }

        @Override // com.applovin.impl.bb
        int a(java.lang.Object[] objArr, int i) {
            com.applovin.impl.pp it = this.b.d.values().iterator();
            while (it.hasNext()) {
                i = ((com.applovin.impl.bb) it.next()).a(objArr, i);
            }
            return i;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.b.size();
        }
    }
}
