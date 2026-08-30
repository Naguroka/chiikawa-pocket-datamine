package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b4 extends com.applovin.impl.c2 {
    private final java.util.HashMap g = new java.util.HashMap();
    private android.os.Handler h;
    private com.applovin.impl.xo i;

    protected int a(java.lang.Object obj, int i) {
        return i;
    }

    protected long a(java.lang.Object obj, long j) {
        return j;
    }

    protected abstract com.applovin.impl.ae.a a(java.lang.Object obj, com.applovin.impl.ae.a aVar);

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract void a(java.lang.Object obj, com.applovin.impl.ae aeVar, com.applovin.impl.fo foVar);

    protected b4() {
    }

    @Override // com.applovin.impl.c2
    protected void f() {
        for (com.applovin.impl.b4.b bVar : this.g.values()) {
            bVar.f637a.b(bVar.b);
        }
    }

    @Override // com.applovin.impl.c2
    protected void e() {
        for (com.applovin.impl.b4.b bVar : this.g.values()) {
            bVar.f637a.a(bVar.b);
        }
    }

    @Override // com.applovin.impl.c2
    protected void h() {
        for (com.applovin.impl.b4.b bVar : this.g.values()) {
            bVar.f637a.c(bVar.b);
            bVar.f637a.a((com.applovin.impl.be) bVar.c);
            bVar.f637a.a((com.applovin.impl.z6) bVar.c);
        }
        this.g.clear();
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.applovin.impl.ae f637a;
        public final com.applovin.impl.ae.b b;
        public final com.applovin.impl.b4.a c;

        public b(com.applovin.impl.ae aeVar, com.applovin.impl.ae.b bVar, com.applovin.impl.b4.a aVar) {
            this.f637a = aeVar;
            this.b = bVar;
            this.c = aVar;
        }
    }

    private final class a implements com.applovin.impl.be, com.applovin.impl.z6 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.Object f636a;
        private com.applovin.impl.be.a b;
        private com.applovin.impl.z6.a c;

        public a(java.lang.Object obj) {
            this.b = com.applovin.impl.b4.this.b((com.applovin.impl.ae.a) null);
            this.c = com.applovin.impl.b4.this.a((com.applovin.impl.ae.a) null);
            this.f636a = obj;
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
            com.applovin.impl.ae.a aVarA;
            if (aVar != null) {
                aVarA = com.applovin.impl.b4.this.a(this.f636a, aVar);
                if (aVarA == null) {
                    return false;
                }
            } else {
                aVarA = null;
            }
            int iA = com.applovin.impl.b4.this.a(this.f636a, i);
            com.applovin.impl.be.a aVar2 = this.b;
            if (aVar2.f644a != iA || !com.applovin.impl.xp.a(aVar2.b, aVarA)) {
                this.b = com.applovin.impl.b4.this.a(iA, aVarA, 0L);
            }
            com.applovin.impl.z6.a aVar3 = this.c;
            if (aVar3.f1563a == iA && com.applovin.impl.xp.a(aVar3.b, aVarA)) {
                return true;
            }
            this.c = com.applovin.impl.b4.this.a(iA, aVarA);
            return true;
        }

        private com.applovin.impl.td a(com.applovin.impl.td tdVar) {
            long jA = com.applovin.impl.b4.this.a(this.f636a, tdVar.f);
            long jA2 = com.applovin.impl.b4.this.a(this.f636a, tdVar.g);
            return (jA == tdVar.f && jA2 == tdVar.g) ? tdVar : new com.applovin.impl.td(tdVar.f1361a, tdVar.b, tdVar.c, tdVar.d, tdVar.e, jA, jA2);
        }

        @Override // com.applovin.impl.be
        public void c(int i, com.applovin.impl.ae.a aVar, com.applovin.impl.mc mcVar, com.applovin.impl.td tdVar) {
            if (f(i, aVar)) {
                this.b.b(mcVar, a(tdVar));
            }
        }

        @Override // com.applovin.impl.be
        public void b(int i, com.applovin.impl.ae.a aVar, com.applovin.impl.mc mcVar, com.applovin.impl.td tdVar) {
            if (f(i, aVar)) {
                this.b.c(mcVar, a(tdVar));
            }
        }

        @Override // com.applovin.impl.be
        public void a(int i, com.applovin.impl.ae.a aVar, com.applovin.impl.td tdVar) {
            if (f(i, aVar)) {
                this.b.a(a(tdVar));
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
                this.b.a(mcVar, a(tdVar));
            }
        }

        @Override // com.applovin.impl.be
        public void a(int i, com.applovin.impl.ae.a aVar, com.applovin.impl.mc mcVar, com.applovin.impl.td tdVar, java.io.IOException iOException, boolean z) {
            if (f(i, aVar)) {
                this.b.a(mcVar, a(tdVar), iOException, z);
            }
        }
    }

    protected final void a(final java.lang.Object obj, com.applovin.impl.ae aeVar) {
        com.applovin.impl.b1.a(!this.g.containsKey(obj));
        com.applovin.impl.ae.b bVar = new com.applovin.impl.ae.b() { // from class: com.applovin.impl.b4$$ExternalSyntheticLambda0
            @Override // com.applovin.impl.ae.b
            public final void a(com.applovin.impl.ae aeVar2, com.applovin.impl.fo foVar) {
                this.f$0.a(obj, aeVar2, foVar);
            }
        };
        com.applovin.impl.b4.a aVar = new com.applovin.impl.b4.a(obj);
        this.g.put(obj, new com.applovin.impl.b4.b(aeVar, bVar, aVar));
        aeVar.a((android.os.Handler) com.applovin.impl.b1.a(this.h), (com.applovin.impl.be) aVar);
        aeVar.a((android.os.Handler) com.applovin.impl.b1.a(this.h), (com.applovin.impl.z6) aVar);
        aeVar.a(bVar, this.i);
        if (g()) {
            return;
        }
        aeVar.a(bVar);
    }

    @Override // com.applovin.impl.c2
    protected void a(com.applovin.impl.xo xoVar) {
        this.i = xoVar;
        this.h = com.applovin.impl.xp.a();
    }
}
