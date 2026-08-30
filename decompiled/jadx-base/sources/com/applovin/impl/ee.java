package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class ee {
    private final com.applovin.impl.ee.d d;
    private final com.applovin.impl.be.a e;
    private final com.applovin.impl.z6.a f;
    private final java.util.HashMap g;
    private final java.util.Set h;
    private boolean j;
    private com.applovin.impl.xo k;
    private com.applovin.impl.wj i = new com.applovin.impl.wj.a(0);
    private final java.util.IdentityHashMap b = new java.util.IdentityHashMap();
    private final java.util.Map c = new java.util.HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f754a = new java.util.ArrayList();

    public interface d {
        void a();
    }

    public ee(com.applovin.impl.ee.d dVar, com.applovin.impl.r0 r0Var, android.os.Handler handler) {
        this.d = dVar;
        com.applovin.impl.be.a aVar = new com.applovin.impl.be.a();
        this.e = aVar;
        com.applovin.impl.z6.a aVar2 = new com.applovin.impl.z6.a();
        this.f = aVar2;
        this.g = new java.util.HashMap();
        this.h = new java.util.HashSet();
        if (r0Var != null) {
            aVar.a(handler, r0Var);
            aVar2.a(handler, r0Var);
        }
    }

    public boolean d() {
        return this.j;
    }

    public int c() {
        return this.f754a.size();
    }

    public com.applovin.impl.fo a(int i, java.util.List list, com.applovin.impl.wj wjVar) {
        if (!list.isEmpty()) {
            this.i = wjVar;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                com.applovin.impl.ee.c cVar = (com.applovin.impl.ee.c) list.get(i2 - i);
                if (i2 > 0) {
                    com.applovin.impl.ee.c cVar2 = (com.applovin.impl.ee.c) this.f754a.get(i2 - 1);
                    cVar.a(cVar2.d + cVar2.f757a.i().b());
                } else {
                    cVar.a(0);
                }
                a(i2, cVar.f757a.i().b());
                this.f754a.add(i2, cVar);
                this.c.put(cVar.b, cVar);
                if (this.j) {
                    d(cVar);
                    if (this.b.isEmpty()) {
                        this.h.add(cVar);
                    } else {
                        a(cVar);
                    }
                }
            }
        }
        return a();
    }

    public void e() {
        for (com.applovin.impl.ee.b bVar : this.g.values()) {
            try {
                bVar.f756a.c(bVar.b);
            } catch (java.lang.RuntimeException e) {
                com.applovin.impl.oc.a("MediaSourceList", "Failed to release child source.", e);
            }
            bVar.f756a.a((com.applovin.impl.be) bVar.c);
            bVar.f756a.a((com.applovin.impl.z6) bVar.c);
        }
        this.g.clear();
        this.h.clear();
        this.j = false;
    }

    private void b() {
        java.util.Iterator it = this.h.iterator();
        while (it.hasNext()) {
            com.applovin.impl.ee.c cVar = (com.applovin.impl.ee.c) it.next();
            if (cVar.c.isEmpty()) {
                a(cVar);
                it.remove();
            }
        }
    }

    static final class c implements com.applovin.impl.de {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.applovin.impl.wc f757a;
        public int d;
        public boolean e;
        public final java.util.List c = new java.util.ArrayList();
        public final java.lang.Object b = new java.lang.Object();

        public c(com.applovin.impl.ae aeVar, boolean z) {
            this.f757a = new com.applovin.impl.wc(aeVar, z);
        }

        @Override // com.applovin.impl.de
        public java.lang.Object a() {
            return this.b;
        }

        @Override // com.applovin.impl.de
        public com.applovin.impl.fo b() {
            return this.f757a.i();
        }

        public void a(int i) {
            this.d = i;
            this.e = false;
            this.c.clear();
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.applovin.impl.ae f756a;
        public final com.applovin.impl.ae.b b;
        public final com.applovin.impl.ee.a c;

        public b(com.applovin.impl.ae aeVar, com.applovin.impl.ae.b bVar, com.applovin.impl.ee.a aVar) {
            this.f756a = aeVar;
            this.b = bVar;
            this.c = aVar;
        }
    }

    private final class a implements com.applovin.impl.be, com.applovin.impl.z6 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.ee.c f755a;
        private com.applovin.impl.be.a b;
        private com.applovin.impl.z6.a c;

        public a(com.applovin.impl.ee.c cVar) {
            this.b = com.applovin.impl.ee.this.e;
            this.c = com.applovin.impl.ee.this.f;
            this.f755a = cVar;
        }

        @Override // com.applovin.impl.be
        public void a(int i, com.applovin.impl.ae.a aVar, com.applovin.impl.td tdVar) {
            if (f(i, aVar)) {
                this.b.a(tdVar);
            }
        }

        @Override // com.applovin.impl.z6
        public void d(int i, com.applovin.impl.ae.a aVar) {
            if (f(i, aVar)) {
                this.c.a();
            }
        }

        @Override // com.applovin.impl.z6
        public void c(int i, com.applovin.impl.ae.a aVar) {
            if (f(i, aVar)) {
                this.c.c();
            }
        }

        @Override // com.applovin.impl.z6
        public void b(int i, com.applovin.impl.ae.a aVar) {
            if (f(i, aVar)) {
                this.c.d();
            }
        }

        private boolean f(int i, com.applovin.impl.ae.a aVar) {
            com.applovin.impl.ae.a aVarB;
            if (aVar != null) {
                aVarB = com.applovin.impl.ee.b(this.f755a, aVar);
                if (aVarB == null) {
                    return false;
                }
            } else {
                aVarB = null;
            }
            int iB = com.applovin.impl.ee.b(this.f755a, i);
            com.applovin.impl.be.a aVar2 = this.b;
            if (aVar2.f644a != iB || !com.applovin.impl.xp.a(aVar2.b, aVarB)) {
                this.b = com.applovin.impl.ee.this.e.a(iB, aVarB, 0L);
            }
            com.applovin.impl.z6.a aVar3 = this.c;
            if (aVar3.f1563a == iB && com.applovin.impl.xp.a(aVar3.b, aVarB)) {
                return true;
            }
            this.c = com.applovin.impl.ee.this.f.a(iB, aVarB);
            return true;
        }

        @Override // com.applovin.impl.be
        public void c(int i, com.applovin.impl.ae.a aVar, com.applovin.impl.mc mcVar, com.applovin.impl.td tdVar) {
            if (f(i, aVar)) {
                this.b.b(mcVar, tdVar);
            }
        }

        @Override // com.applovin.impl.be
        public void b(int i, com.applovin.impl.ae.a aVar, com.applovin.impl.mc mcVar, com.applovin.impl.td tdVar) {
            if (f(i, aVar)) {
                this.b.c(mcVar, tdVar);
            }
        }

        @Override // com.applovin.impl.z6
        public void a(int i, com.applovin.impl.ae.a aVar) {
            if (f(i, aVar)) {
                this.c.b();
            }
        }

        @Override // com.applovin.impl.z6
        public void a(int i, com.applovin.impl.ae.a aVar, int i2) {
            if (f(i, aVar)) {
                this.c.a(i2);
            }
        }

        @Override // com.applovin.impl.z6
        public void a(int i, com.applovin.impl.ae.a aVar, java.lang.Exception exc) {
            if (f(i, aVar)) {
                this.c.a(exc);
            }
        }

        @Override // com.applovin.impl.be
        public void a(int i, com.applovin.impl.ae.a aVar, com.applovin.impl.mc mcVar, com.applovin.impl.td tdVar) {
            if (f(i, aVar)) {
                this.b.a(mcVar, tdVar);
            }
        }

        @Override // com.applovin.impl.be
        public void a(int i, com.applovin.impl.ae.a aVar, com.applovin.impl.mc mcVar, com.applovin.impl.td tdVar, java.io.IOException iOException, boolean z) {
            if (f(i, aVar)) {
                this.b.a(mcVar, tdVar, iOException, z);
            }
        }
    }

    private void d(com.applovin.impl.ee.c cVar) {
        com.applovin.impl.wc wcVar = cVar.f757a;
        com.applovin.impl.ae.b bVar = new com.applovin.impl.ae.b() { // from class: com.applovin.impl.ee$$ExternalSyntheticLambda0
            @Override // com.applovin.impl.ae.b
            public final void a(com.applovin.impl.ae aeVar, com.applovin.impl.fo foVar) {
                this.f$0.a(aeVar, foVar);
            }
        };
        com.applovin.impl.ee.a aVar = new com.applovin.impl.ee.a(cVar);
        this.g.put(cVar, new com.applovin.impl.ee.b(wcVar, bVar, aVar));
        wcVar.a(com.applovin.impl.xp.b(), (com.applovin.impl.be) aVar);
        wcVar.a(com.applovin.impl.xp.b(), (com.applovin.impl.z6) aVar);
        wcVar.a(bVar, this.k);
    }

    private void c(com.applovin.impl.ee.c cVar) {
        if (cVar.e && cVar.c.isEmpty()) {
            com.applovin.impl.ee.b bVar = (com.applovin.impl.ee.b) com.applovin.impl.b1.a((com.applovin.impl.ee.b) this.g.remove(cVar));
            bVar.f756a.c(bVar.b);
            bVar.f756a.a((com.applovin.impl.be) bVar.c);
            bVar.f756a.a((com.applovin.impl.z6) bVar.c);
            this.h.remove(cVar);
        }
    }

    private void a(int i, int i2) {
        while (i < this.f754a.size()) {
            ((com.applovin.impl.ee.c) this.f754a.get(i)).d += i2;
            i++;
        }
    }

    private void b(com.applovin.impl.ee.c cVar) {
        this.h.add(cVar);
        com.applovin.impl.ee.b bVar = (com.applovin.impl.ee.b) this.g.get(cVar);
        if (bVar != null) {
            bVar.f756a.b(bVar.b);
        }
    }

    public com.applovin.impl.vd a(com.applovin.impl.ae.a aVar, com.applovin.impl.n0 n0Var, long j) {
        java.lang.Object objB = b(aVar.f1504a);
        com.applovin.impl.ae.a aVarB = aVar.b(a(aVar.f1504a));
        com.applovin.impl.ee.c cVar = (com.applovin.impl.ee.c) com.applovin.impl.b1.a((com.applovin.impl.ee.c) this.c.get(objB));
        b(cVar);
        cVar.c.add(aVarB);
        com.applovin.impl.vc vcVarA = cVar.f757a.a(aVarB, n0Var, j);
        this.b.put(vcVarA, cVar);
        b();
        return vcVarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.applovin.impl.ae.a b(com.applovin.impl.ee.c cVar, com.applovin.impl.ae.a aVar) {
        for (int i = 0; i < cVar.c.size(); i++) {
            if (((com.applovin.impl.ae.a) cVar.c.get(i)).d == aVar.d) {
                return aVar.b(a(cVar, aVar.f1504a));
            }
        }
        return null;
    }

    public com.applovin.impl.fo a() {
        if (this.f754a.isEmpty()) {
            return com.applovin.impl.fo.f792a;
        }
        int iB = 0;
        for (int i = 0; i < this.f754a.size(); i++) {
            com.applovin.impl.ee.c cVar = (com.applovin.impl.ee.c) this.f754a.get(i);
            cVar.d = iB;
            iB += cVar.f757a.i().b();
        }
        return new com.applovin.impl.sh(this.f754a, this.i);
    }

    private static java.lang.Object b(java.lang.Object obj) {
        return com.applovin.impl.b.d(obj);
    }

    private void a(com.applovin.impl.ee.c cVar) {
        com.applovin.impl.ee.b bVar = (com.applovin.impl.ee.b) this.g.get(cVar);
        if (bVar != null) {
            bVar.f756a.a(bVar.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(com.applovin.impl.ee.c cVar, int i) {
        return i + cVar.d;
    }

    private static java.lang.Object a(java.lang.Object obj) {
        return com.applovin.impl.b.c(obj);
    }

    private void b(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            com.applovin.impl.ee.c cVar = (com.applovin.impl.ee.c) this.f754a.remove(i3);
            this.c.remove(cVar.b);
            a(i3, -cVar.f757a.i().b());
            cVar.e = true;
            if (this.j) {
                c(cVar);
            }
        }
    }

    private static java.lang.Object a(com.applovin.impl.ee.c cVar, java.lang.Object obj) {
        return com.applovin.impl.b.a(cVar.b, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.ae aeVar, com.applovin.impl.fo foVar) {
        this.d.a();
    }

    public void a(com.applovin.impl.xo xoVar) {
        com.applovin.impl.b1.b(!this.j);
        this.k = xoVar;
        for (int i = 0; i < this.f754a.size(); i++) {
            com.applovin.impl.ee.c cVar = (com.applovin.impl.ee.c) this.f754a.get(i);
            d(cVar);
            this.h.add(cVar);
        }
        this.j = true;
    }

    public void a(com.applovin.impl.vd vdVar) {
        com.applovin.impl.ee.c cVar = (com.applovin.impl.ee.c) com.applovin.impl.b1.a((com.applovin.impl.ee.c) this.b.remove(vdVar));
        cVar.f757a.a(vdVar);
        cVar.c.remove(((com.applovin.impl.vc) vdVar).f1425a);
        if (!this.b.isEmpty()) {
            b();
        }
        c(cVar);
    }

    public com.applovin.impl.fo a(int i, int i2, com.applovin.impl.wj wjVar) {
        com.applovin.impl.b1.a(i >= 0 && i <= i2 && i2 <= c());
        this.i = wjVar;
        b(i, i2);
        return a();
    }

    public com.applovin.impl.fo a(java.util.List list, com.applovin.impl.wj wjVar) {
        b(0, this.f754a.size());
        return a(this.f754a.size(), list, wjVar);
    }

    public com.applovin.impl.fo a(com.applovin.impl.wj wjVar) {
        int iC = c();
        if (wjVar.a() != iC) {
            wjVar = wjVar.d().b(0, iC);
        }
        this.i = wjVar;
        return a();
    }
}
