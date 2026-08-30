package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
abstract class h implements com.applovin.impl.tf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient java.util.Set f834a;
    private transient java.util.Collection b;
    private transient java.util.Map c;

    h() {
    }

    abstract java.util.Map b();

    abstract java.util.Set c();

    abstract java.util.Collection d();

    abstract java.util.Iterator f();

    public java.util.Set e() {
        java.util.Set set = this.f834a;
        if (set != null) {
            return set;
        }
        java.util.Set setC = c();
        this.f834a = setC;
        return setC;
    }

    @Override // com.applovin.impl.tf
    public java.util.Collection values() {
        java.util.Collection collection = this.b;
        if (collection != null) {
            return collection;
        }
        java.util.Collection collectionD = d();
        this.b = collectionD;
        return collectionD;
    }

    class a extends java.util.AbstractCollection {
        a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public java.util.Iterator iterator() {
            return com.applovin.impl.h.this.f();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return com.applovin.impl.h.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(java.lang.Object obj) {
            return com.applovin.impl.h.this.a(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            com.applovin.impl.h.this.clear();
        }
    }

    @Override // com.applovin.impl.tf
    public java.util.Map a() {
        java.util.Map map = this.c;
        if (map != null) {
            return map;
        }
        java.util.Map mapB = b();
        this.c = mapB;
        return mapB;
    }

    public boolean equals(java.lang.Object obj) {
        return com.applovin.impl.wf.a(this, obj);
    }

    public int hashCode() {
        return a().hashCode();
    }

    public java.lang.String toString() {
        return a().toString();
    }

    public boolean a(java.lang.Object obj) {
        java.util.Iterator it = a().values().iterator();
        while (it.hasNext()) {
            if (((java.util.Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }
}
