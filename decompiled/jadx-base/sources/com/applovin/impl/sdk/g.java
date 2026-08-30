package com.applovin.impl.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f1288a;
    private final java.util.Map b = new java.util.HashMap();
    private final java.lang.Object c = new java.lang.Object();
    private final java.util.Map d = new java.util.HashMap();
    private final java.lang.Object e = new java.lang.Object();

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.String f1289a;
        private final java.lang.String b;
        private final java.lang.String c;
        private final java.lang.String d;
        private final java.lang.String e;
        private final java.lang.String f;
        private final java.lang.String g;
        private final int h;
        private long i;
        private final java.util.ArrayDeque j;

        public java.lang.String b() {
            return this.d;
        }

        public java.lang.String c() {
            return this.c;
        }

        public java.lang.String d() {
            return this.e;
        }

        public java.lang.String e() {
            return this.f;
        }

        public java.lang.String f() {
            return this.g;
        }

        public java.lang.String g() {
            return this.b;
        }

        public int h() {
            return this.h;
        }

        public com.applovin.impl.sdk.g.c i() {
            return (com.applovin.impl.sdk.g.c) this.j.getLast();
        }

        public java.lang.String toString() {
            return "AdInfo{state='" + i() + "', adUnitId='" + this.f1289a + "', format='" + this.b + "', adapterName='" + this.c + "', adapterClass='" + this.d + "', adapterVersion='" + this.e + "', bCode='" + this.f + "', creativeId='" + this.g + "', updated=" + this.i + '}';
        }

        public java.lang.String a() {
            return this.f1289a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(com.applovin.impl.sdk.g.c cVar) {
            this.i = java.lang.System.currentTimeMillis();
            this.j.add(cVar);
        }

        private b(com.applovin.impl.fe feVar, com.applovin.impl.sdk.g.c cVar) {
            this.j = new java.util.ArrayDeque();
            this.f1289a = feVar.getAdUnitId();
            this.b = feVar.getFormat().getLabel();
            this.c = feVar.c();
            this.d = feVar.b();
            this.e = feVar.z();
            this.f = feVar.B();
            this.g = feVar.getCreativeId();
            this.h = feVar.hashCode();
            a(cVar);
        }
    }

    public enum c {
        LOAD("load"),
        SHOW(com.json.j5.v),
        HIDE("hide"),
        CLICK(com.json.z8.CLICK),
        DESTROY("destroy"),
        SHOW_ERROR("show_error");

        public static final java.util.Set i = new java.util.HashSet(java.util.Arrays.asList(values()));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.String f1290a;

        c(java.lang.String str) {
            this.f1290a = str;
        }

        @Override // java.lang.Enum
        public java.lang.String toString() {
            return this.f1290a;
        }
    }

    public interface d {
        void a(com.applovin.impl.sdk.g.b bVar);
    }

    g(com.applovin.impl.sdk.j jVar) {
        this.f1288a = jVar;
        a();
    }

    public void a(com.applovin.impl.fe feVar, com.applovin.impl.sdk.g.c cVar) {
        synchronized (this.e) {
            int iHashCode = feVar.hashCode();
            com.applovin.impl.sdk.g.b bVar = (com.applovin.impl.sdk.g.b) this.d.get(java.lang.Integer.valueOf(iHashCode));
            if (bVar == null) {
                if (cVar == com.applovin.impl.sdk.g.c.DESTROY) {
                    return;
                }
                bVar = new com.applovin.impl.sdk.g.b(feVar, cVar);
                this.d.put(java.lang.Integer.valueOf(iHashCode), bVar);
            } else if (bVar.i() == cVar) {
                return;
            } else {
                bVar.a(cVar);
            }
            if (cVar == com.applovin.impl.sdk.g.c.DESTROY) {
                this.d.remove(java.lang.Integer.valueOf(iHashCode));
            }
            a(bVar, cVar);
        }
    }

    public void a() {
        synchronized (this.c) {
            for (com.applovin.impl.sdk.g.c cVar : com.applovin.impl.sdk.g.c.values()) {
                this.b.put(cVar, new java.util.HashSet());
            }
        }
    }

    public void a(com.applovin.impl.sdk.g.d dVar, java.util.Set set) {
        synchronized (this.c) {
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                a((com.applovin.impl.sdk.g.c) it.next()).add(dVar);
            }
        }
    }

    public void a(com.applovin.impl.sdk.g.d dVar) {
        synchronized (this.c) {
            java.util.Iterator it = this.b.keySet().iterator();
            while (it.hasNext()) {
                a((com.applovin.impl.sdk.g.c) it.next()).remove(dVar);
            }
        }
    }

    private java.util.Set a(com.applovin.impl.sdk.g.c cVar) {
        synchronized (this.c) {
            java.util.Set set = (java.util.Set) this.b.get(cVar);
            if (com.applovin.impl.p6.a(set)) {
                return set;
            }
            return new java.util.HashSet();
        }
    }

    private void a(com.applovin.impl.sdk.g.b bVar, com.applovin.impl.sdk.g.c cVar) {
        synchronized (this.c) {
            java.util.Iterator it = a(cVar).iterator();
            while (it.hasNext()) {
                ((com.applovin.impl.sdk.g.d) it.next()).a(bVar);
            }
        }
    }
}
