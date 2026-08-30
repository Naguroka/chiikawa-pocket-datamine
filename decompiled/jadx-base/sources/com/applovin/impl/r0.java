package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class r0 implements com.applovin.impl.qh.e, com.applovin.impl.q1, com.applovin.impl.wq, com.applovin.impl.be, com.applovin.impl.y1.a, com.applovin.impl.z6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.l3 f1204a;
    private final com.applovin.impl.fo.b b;
    private final com.applovin.impl.fo.d c;
    private final com.applovin.impl.r0.a d;
    private final android.util.SparseArray f;
    private com.applovin.impl.gc g;
    private com.applovin.impl.qh h;
    private com.applovin.impl.ia i;
    private boolean j;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.applovin.impl.s0 s0Var, com.applovin.impl.a9 a9Var) {
    }

    public r0(com.applovin.impl.l3 l3Var) {
        this.f1204a = (com.applovin.impl.l3) com.applovin.impl.b1.a(l3Var);
        this.g = new com.applovin.impl.gc(com.applovin.impl.xp.d(), l3Var, new com.applovin.impl.gc.b() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda36
            @Override // com.applovin.impl.gc.b
            public final void a(java.lang.Object obj, com.applovin.impl.a9 a9Var) {
                com.applovin.impl.r0.a((com.applovin.impl.s0) obj, a9Var);
            }
        });
        com.applovin.impl.fo.b bVar = new com.applovin.impl.fo.b();
        this.b = bVar;
        this.c = new com.applovin.impl.fo.d();
        this.d = new com.applovin.impl.r0.a(bVar);
        this.f = new android.util.SparseArray();
    }

    public void i() {
        final com.applovin.impl.s0.a aVarC = c();
        this.f.put(com.json.mediationsdk.logger.IronSourceError.ERROR_IS_SHOW_CALLED_DURING_SHOW, aVarC);
        a(aVarC, com.json.mediationsdk.logger.IronSourceError.ERROR_IS_SHOW_CALLED_DURING_SHOW, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda3
            @Override // com.applovin.impl.gc.a
            public final void a(java.lang.Object obj) {
                ((com.applovin.impl.s0) obj).d(aVarC);
            }
        });
        ((com.applovin.impl.ia) com.applovin.impl.b1.b(this.i)).a(new java.lang.Runnable() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.g();
            }
        });
    }

    public final void h() {
        if (this.j) {
            return;
        }
        final com.applovin.impl.s0.a aVarC = c();
        this.j = true;
        a(aVarC, -1, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda41
            @Override // com.applovin.impl.gc.a
            public final void a(java.lang.Object obj) {
                ((com.applovin.impl.s0) obj).a(aVarC);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(com.applovin.impl.s0.a aVar, com.applovin.impl.m5 m5Var, com.applovin.impl.s0 s0Var) {
        s0Var.b(aVar, m5Var);
        s0Var.a(aVar, 1, m5Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        this.g.b();
    }

    protected final com.applovin.impl.s0.a c() {
        return a(this.d.a());
    }

    private com.applovin.impl.s0.a a(com.applovin.impl.ae.a aVar) {
        com.applovin.impl.b1.a(this.h);
        com.applovin.impl.fo foVarA = aVar == null ? null : this.d.a(aVar);
        if (aVar != null && foVarA != null) {
            return a(foVarA, foVarA.a(aVar.f1504a, this.b).c, aVar);
        }
        int iT = this.h.t();
        com.applovin.impl.fo foVarN = this.h.n();
        if (iT >= foVarN.b()) {
            foVarN = com.applovin.impl.fo.f792a;
        }
        return a(foVarN, iT, (com.applovin.impl.ae.a) null);
    }

    private com.applovin.impl.s0.a e() {
        return a(this.d.c());
    }

    private com.applovin.impl.s0.a d() {
        return a(this.d.b());
    }

    private com.applovin.impl.s0.a f(int i, com.applovin.impl.ae.a aVar) {
        com.applovin.impl.b1.a(this.h);
        if (aVar != null) {
            if (this.d.a(aVar) != null) {
                return a(aVar);
            }
            return a(com.applovin.impl.fo.f792a, i, aVar);
        }
        com.applovin.impl.fo foVarN = this.h.n();
        if (i >= foVarN.b()) {
            foVarN = com.applovin.impl.fo.f792a;
        }
        return a(foVarN, i, (com.applovin.impl.ae.a) null);
    }

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.fo.b f1205a;
        private com.applovin.impl.db b = com.applovin.impl.db.h();
        private com.applovin.impl.fb c = com.applovin.impl.fb.h();
        private com.applovin.impl.ae.a d;
        private com.applovin.impl.ae.a e;
        private com.applovin.impl.ae.a f;

        public a(com.applovin.impl.fo.b bVar) {
            this.f1205a = bVar;
        }

        public com.applovin.impl.ae.a c() {
            return this.e;
        }

        public com.applovin.impl.ae.a d() {
            return this.f;
        }

        public com.applovin.impl.ae.a b() {
            if (this.b.isEmpty()) {
                return null;
            }
            return (com.applovin.impl.ae.a) com.applovin.impl.vb.b(this.b);
        }

        private void a(com.applovin.impl.fb.a aVar, com.applovin.impl.ae.a aVar2, com.applovin.impl.fo foVar) {
            if (aVar2 == null) {
                return;
            }
            if (foVar.a(aVar2.f1504a) != -1) {
                aVar.a(aVar2, foVar);
                return;
            }
            com.applovin.impl.fo foVar2 = (com.applovin.impl.fo) this.c.get(aVar2);
            if (foVar2 != null) {
                aVar.a(aVar2, foVar2);
            }
        }

        public void b(com.applovin.impl.qh qhVar) {
            this.d = a(qhVar, this.b, this.e, this.f1205a);
            a(qhVar.n());
        }

        private static com.applovin.impl.ae.a a(com.applovin.impl.qh qhVar, com.applovin.impl.db dbVar, com.applovin.impl.ae.a aVar, com.applovin.impl.fo.b bVar) {
            com.applovin.impl.fo foVarN = qhVar.n();
            int iV = qhVar.v();
            java.lang.Object objB = foVarN.c() ? null : foVarN.b(iV);
            int iA = (qhVar.d() || foVarN.c()) ? -1 : foVarN.a(iV, bVar).a(com.applovin.impl.t2.a(qhVar.getCurrentPosition()) - bVar.e());
            for (int i = 0; i < dbVar.size(); i++) {
                com.applovin.impl.ae.a aVar2 = (com.applovin.impl.ae.a) dbVar.get(i);
                if (a(aVar2, objB, qhVar.d(), qhVar.E(), qhVar.f(), iA)) {
                    return aVar2;
                }
            }
            if (dbVar.isEmpty() && aVar != null) {
                if (a(aVar, objB, qhVar.d(), qhVar.E(), qhVar.f(), iA)) {
                    return aVar;
                }
            }
            return null;
        }

        public com.applovin.impl.ae.a a() {
            return this.d;
        }

        public com.applovin.impl.fo a(com.applovin.impl.ae.a aVar) {
            return (com.applovin.impl.fo) this.c.get(aVar);
        }

        private static boolean a(com.applovin.impl.ae.a aVar, java.lang.Object obj, boolean z, int i, int i2, int i3) {
            if (aVar.f1504a.equals(obj)) {
                return (z && aVar.b == i && aVar.c == i2) || (!z && aVar.b == -1 && aVar.e == i3);
            }
            return false;
        }

        public void a(com.applovin.impl.qh qhVar) {
            this.d = a(qhVar, this.b, this.e, this.f1205a);
        }

        public void a(java.util.List list, com.applovin.impl.ae.a aVar, com.applovin.impl.qh qhVar) {
            this.b = com.applovin.impl.db.a((java.util.Collection) list);
            if (!list.isEmpty()) {
                this.e = (com.applovin.impl.ae.a) list.get(0);
                this.f = (com.applovin.impl.ae.a) com.applovin.impl.b1.a(aVar);
            }
            if (this.d == null) {
                this.d = a(qhVar, this.b, this.e, this.f1205a);
            }
            a(qhVar.n());
        }

        private void a(com.applovin.impl.fo foVar) {
            com.applovin.impl.fb.a aVarA = com.applovin.impl.fb.a();
            if (this.b.isEmpty()) {
                a(aVarA, this.e, foVar);
                if (!com.applovin.exoplayer2.common.base.Objects.equal(this.f, this.e)) {
                    a(aVarA, this.f, foVar);
                }
                if (!com.applovin.exoplayer2.common.base.Objects.equal(this.d, this.e) && !com.applovin.exoplayer2.common.base.Objects.equal(this.d, this.f)) {
                    a(aVarA, this.d, foVar);
                }
            } else {
                for (int i = 0; i < this.b.size(); i++) {
                    a(aVarA, (com.applovin.impl.ae.a) this.b.get(i), foVar);
                }
                if (!this.b.contains(this.d)) {
                    a(aVarA, this.d, foVar);
                }
            }
            this.c = aVarA.a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0062  */
    protected final com.applovin.impl.s0.a a(com.applovin.impl.fo foVar, int i, com.applovin.impl.ae.a aVar) {
        long jB;
        com.applovin.impl.ae.a aVar2 = foVar.c() ? null : aVar;
        long jC = this.f1204a.c();
        boolean z = foVar.equals(this.h.n()) && i == this.h.t();
        if (aVar2 == null || !aVar2.a()) {
            if (z) {
                jB = this.h.g();
            } else if (foVar.c()) {
                jB = 0;
            } else {
                jB = foVar.a(i, this.c).b();
            }
        } else if (z && this.h.E() == aVar2.b && this.h.f() == aVar2.c) {
            jB = this.h.getCurrentPosition();
        } else {
            jB = 0;
        }
        return new com.applovin.impl.s0.a(jC, foVar, i, aVar2, jB, this.h.n(), this.h.t(), this.d.a(), this.h.getCurrentPosition(), this.h.h());
    }

    private com.applovin.impl.s0.a f() {
        return a(this.d.d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.applovin.impl.s0.a aVar, java.lang.String str, long j, long j2, com.applovin.impl.s0 s0Var) {
        s0Var.a(aVar, str, j);
        s0Var.b(aVar, str, j2, j);
        s0Var.a(aVar, 1, str, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.applovin.impl.s0.a aVar, com.applovin.impl.m5 m5Var, com.applovin.impl.s0 s0Var) {
        s0Var.c(aVar, m5Var);
        s0Var.b(aVar, 1, m5Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.applovin.impl.s0.a aVar, com.applovin.impl.e9 e9Var, com.applovin.impl.p5 p5Var, com.applovin.impl.s0 s0Var) {
        s0Var.b(aVar, e9Var);
        s0Var.b(aVar, e9Var, p5Var);
        s0Var.a(aVar, 1, e9Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(com.applovin.impl.s0.a aVar, com.applovin.impl.m5 m5Var, com.applovin.impl.s0 s0Var) {
        s0Var.a(aVar, m5Var);
        s0Var.a(aVar, 2, m5Var);
    }

    @Override // com.applovin.impl.z6
    public final void d(int i, com.applovin.impl.ae.a aVar) {
        final com.applovin.impl.s0.a aVarF = f(i, aVar);
        a(aVarF, 1031, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda27
            @Override // com.applovin.impl.gc.a
            public final void a(java.lang.Object obj) {
                ((com.applovin.impl.s0) obj).b(aVarF);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(com.applovin.impl.s0.a aVar, com.applovin.impl.m5 m5Var, com.applovin.impl.s0 s0Var) {
        s0Var.d(aVar, m5Var);
        s0Var.b(aVar, 2, m5Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(com.applovin.impl.s0.a aVar, java.lang.String str, long j, long j2, com.applovin.impl.s0 s0Var) {
        s0Var.b(aVar, str, j);
        s0Var.a(aVar, str, j2, j);
        s0Var.a(aVar, 2, str, j);
    }

    @Override // com.applovin.impl.qh.e, com.applovin.impl.qh.c
    public void d(final boolean z) {
        final com.applovin.impl.s0.a aVarC = c();
        a(aVarC, 7, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda2
            @Override // com.applovin.impl.gc.a
            public final void a(java.lang.Object obj) {
                ((com.applovin.impl.s0) obj).b(aVarC, z);
            }
        });
    }

    @Override // com.applovin.impl.q1
    public final void c(final java.lang.Exception exc) {
        final com.applovin.impl.s0.a aVarF = f();
        a(aVarF, com.json.mediationsdk.logger.IronSourceError.ERROR_IS_LOAD_DURING_SHOW, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda0
            @Override // com.applovin.impl.gc.a
            public final void a(java.lang.Object obj) {
                ((com.applovin.impl.s0) obj).a(aVarF, exc);
            }
        });
    }

    @Override // com.applovin.impl.q1
    public final void c(final com.applovin.impl.m5 m5Var) {
        final com.applovin.impl.s0.a aVarE = e();
        a(aVarE, 1014, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda42
            @Override // com.applovin.impl.gc.a
            public final void a(java.lang.Object obj) {
                com.applovin.impl.r0.a(aVarE, m5Var, (com.applovin.impl.s0) obj);
            }
        });
    }

    @Override // com.applovin.impl.wq
    public final void d(final com.applovin.impl.m5 m5Var) {
        final com.applovin.impl.s0.a aVarF = f();
        a(aVarF, 1020, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda48
            @Override // com.applovin.impl.gc.a
            public final void a(java.lang.Object obj) {
                com.applovin.impl.r0.d(aVarF, m5Var, (com.applovin.impl.s0) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(com.applovin.impl.s0.a aVar, com.applovin.impl.e9 e9Var, com.applovin.impl.p5 p5Var, com.applovin.impl.s0 s0Var) {
        s0Var.a(aVar, e9Var);
        s0Var.a(aVar, e9Var, p5Var);
        s0Var.a(aVar, 2, e9Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.applovin.impl.s0.a aVar, int i, com.applovin.impl.s0 s0Var) {
        s0Var.f(aVar);
        s0Var.b(aVar, i);
    }

    @Override // com.applovin.impl.q1
    public final void b(final java.lang.String str) {
        final com.applovin.impl.s0.a aVarF = f();
        a(aVarF, 1013, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda37
            @Override // com.applovin.impl.gc.a
            public final void a(java.lang.Object obj) {
                ((com.applovin.impl.s0) obj).b(aVarF, str);
            }
        });
    }

    @Override // com.applovin.impl.q1
    public final void b(final com.applovin.impl.e9 e9Var, final com.applovin.impl.p5 p5Var) {
        final com.applovin.impl.s0.a aVarF = f();
        a(aVarF, 1010, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda11
            @Override // com.applovin.impl.gc.a
            public final void a(java.lang.Object obj) {
                com.applovin.impl.r0.a(aVarF, e9Var, p5Var, (com.applovin.impl.s0) obj);
            }
        });
    }

    @Override // com.applovin.impl.z6
    public final void c(int i, com.applovin.impl.ae.a aVar) {
        final com.applovin.impl.s0.a aVarF = f(i, aVar);
        a(aVarF, com.json.mediationsdk.logger.IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda1
            @Override // com.applovin.impl.gc.a
            public final void a(java.lang.Object obj) {
                ((com.applovin.impl.s0) obj).c(aVarF);
            }
        });
    }

    @Override // com.applovin.impl.q1
    public final void b(final int i, final long j, final long j2) {
        final com.applovin.impl.s0.a aVarF = f();
        a(aVarF, 1012, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda17
            @Override // com.applovin.impl.gc.a
            public final void a(java.lang.Object obj) {
                ((com.applovin.impl.s0) obj).a(aVarF, i, j, j2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.applovin.impl.s0.a aVar, boolean z, com.applovin.impl.s0 s0Var) {
        s0Var.c(aVar, z);
        s0Var.e(aVar, z);
    }

    @Override // com.applovin.impl.qh.e, com.applovin.impl.qh.c
    public final void c(final boolean z) {
        final com.applovin.impl.s0.a aVarC = c();
        a(aVarC, 3, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda23
            @Override // com.applovin.impl.gc.a
            public final void a(java.lang.Object obj) {
                com.applovin.impl.r0.a(aVarC, z, (com.applovin.impl.s0) obj);
            }
        });
    }

    @Override // com.applovin.impl.z6
    public final void b(int i, com.applovin.impl.ae.a aVar) {
        final com.applovin.impl.s0.a aVarF = f(i, aVar);
        a(aVarF, com.json.mediationsdk.logger.IronSourceError.ERROR_IS_LOAD_FAILED_NO_CANDIDATES, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda43
            @Override // com.applovin.impl.gc.a
            public final void a(java.lang.Object obj) {
                ((com.applovin.impl.s0) obj).g(aVarF);
            }
        });
    }

    @Override // com.applovin.impl.be
    public final void c(int i, com.applovin.impl.ae.a aVar, final com.applovin.impl.mc mcVar, final com.applovin.impl.td tdVar) {
        final com.applovin.impl.s0.a aVarF = f(i, aVar);
        a(aVarF, 1001, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda24
            @Override // com.applovin.impl.gc.a
            public final void a(java.lang.Object obj) {
                ((com.applovin.impl.s0) obj).c(aVarF, mcVar, tdVar);
            }
        });
    }

    @Override // com.applovin.impl.be
    public final void b(int i, com.applovin.impl.ae.a aVar, final com.applovin.impl.mc mcVar, final com.applovin.impl.td tdVar) {
        final com.applovin.impl.s0.a aVarF = f(i, aVar);
        a(aVarF, 1000, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda45
            @Override // com.applovin.impl.gc.a
            public final void a(java.lang.Object obj) {
                ((com.applovin.impl.s0) obj).a(aVarF, mcVar, tdVar);
            }
        });
    }

    @Override // com.applovin.impl.qh.e, com.applovin.impl.qh.c
    public final void c(final int i) {
        final com.applovin.impl.s0.a aVarC = c();
        a(aVarC, 8, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda26
            @Override // com.applovin.impl.gc.a
            public final void a(java.lang.Object obj) {
                ((com.applovin.impl.s0) obj).f(aVarC, i);
            }
        });
    }

    @Override // com.applovin.impl.qh.e, com.applovin.impl.qh.c
    public final void b(final int i) {
        final com.applovin.impl.s0.a aVarC = c();
        a(aVarC, 4, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda51
            @Override // com.applovin.impl.gc.a
            public final void a(java.lang.Object obj) {
                ((com.applovin.impl.s0) obj).c(aVarC, i);
            }
        });
    }

    @Override // com.applovin.impl.qh.c
    public final void b(final boolean z, final int i) {
        final com.applovin.impl.s0.a aVarC = c();
        a(aVarC, -1, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda14
            @Override // com.applovin.impl.gc.a
            public final void a(java.lang.Object obj) {
                ((com.applovin.impl.s0) obj).a(aVarC, z, i);
            }
        });
    }

    @Override // com.applovin.impl.qh.c
    public final void b() {
        final com.applovin.impl.s0.a aVarC = c();
        a(aVarC, -1, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda20
            @Override // com.applovin.impl.gc.a
            public final void a(java.lang.Object obj) {
                ((com.applovin.impl.s0) obj).e(aVarC);
            }
        });
    }

    @Override // com.applovin.impl.qh.e, com.applovin.impl.qh.c
    public final void b(final boolean z) {
        final com.applovin.impl.s0.a aVarC = c();
        a(aVarC, 9, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda47
            @Override // com.applovin.impl.gc.a
            public final void a(java.lang.Object obj) {
                ((com.applovin.impl.s0) obj).a(aVarC, z);
            }
        });
    }

    @Override // com.applovin.impl.wq
    public final void b(final java.lang.Exception exc) {
        final com.applovin.impl.s0.a aVarF = f();
        a(aVarF, com.json.mediationsdk.logger.IronSourceError.ERROR_RV_SHOW_EXCEPTION, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda10
            @Override // com.applovin.impl.gc.a
            public final void a(java.lang.Object obj) {
                ((com.applovin.impl.s0) obj).b(aVarF, exc);
            }
        });
    }

    @Override // com.applovin.impl.wq
    public final void b(final java.lang.String str, final long j, final long j2) {
        final com.applovin.impl.s0.a aVarF = f();
        a(aVarF, 1021, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda13
            @Override // com.applovin.impl.gc.a
            public final void a(java.lang.Object obj) {
                com.applovin.impl.r0.b(aVarF, str, j2, j, (com.applovin.impl.s0) obj);
            }
        });
    }

    @Override // com.applovin.impl.wq
    public final void b(final com.applovin.impl.m5 m5Var) {
        final com.applovin.impl.s0.a aVarE = e();
        a(aVarE, 1025, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda40
            @Override // com.applovin.impl.gc.a
            public final void a(java.lang.Object obj) {
                com.applovin.impl.r0.c(aVarE, m5Var, (com.applovin.impl.s0) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.applovin.impl.s0.a aVar, int i, com.applovin.impl.qh.f fVar, com.applovin.impl.qh.f fVar2, com.applovin.impl.s0 s0Var) {
        s0Var.a(aVar, i);
        s0Var.a(aVar, fVar, fVar2, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.applovin.impl.s0.a aVar, com.applovin.impl.xq xqVar, com.applovin.impl.s0 s0Var) {
        s0Var.a(aVar, xqVar);
        s0Var.a(aVar, xqVar.f1516a, xqVar.b, xqVar.c, xqVar.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.qh qhVar, com.applovin.impl.s0 s0Var, com.applovin.impl.a9 a9Var) {
        s0Var.a(qhVar, new com.applovin.impl.s0.b(a9Var, this.f));
    }

    @Override // com.applovin.impl.q1
    public final void a(final java.lang.String str, final long j, final long j2) {
        final com.applovin.impl.s0.a aVarF = f();
        a(aVarF, 1009, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda31
            @Override // com.applovin.impl.gc.a
            public final void a(java.lang.Object obj) {
                com.applovin.impl.r0.a(aVarF, str, j2, j, (com.applovin.impl.s0) obj);
            }
        });
    }

    @Override // com.applovin.impl.q1
    public final void a(final com.applovin.impl.m5 m5Var) {
        final com.applovin.impl.s0.a aVarF = f();
        a(aVarF, 1008, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda8
            @Override // com.applovin.impl.gc.a
            public final void a(java.lang.Object obj) {
                com.applovin.impl.r0.b(aVarF, m5Var, (com.applovin.impl.s0) obj);
            }
        });
    }

    @Override // com.applovin.impl.q1
    public final void a(final long j) {
        final com.applovin.impl.s0.a aVarF = f();
        a(aVarF, 1011, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda28
            @Override // com.applovin.impl.gc.a
            public final void a(java.lang.Object obj) {
                ((com.applovin.impl.s0) obj).a(aVarF, j);
            }
        });
    }

    @Override // com.applovin.impl.q1
    public final void a(final java.lang.Exception exc) {
        final com.applovin.impl.s0.a aVarF = f();
        a(aVarF, 1018, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda53
            @Override // com.applovin.impl.gc.a
            public final void a(java.lang.Object obj) {
                ((com.applovin.impl.s0) obj).d(aVarF, exc);
            }
        });
    }

    @Override // com.applovin.impl.qh.e, com.applovin.impl.qh.c
    public void a(final com.applovin.impl.qh.b bVar) {
        final com.applovin.impl.s0.a aVarC = c();
        a(aVarC, 13, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda18
            @Override // com.applovin.impl.gc.a
            public final void a(java.lang.Object obj) {
                ((com.applovin.impl.s0) obj).a(aVarC, bVar);
            }
        });
    }

    @Override // com.applovin.impl.y1.a
    public final void a(final int i, final long j, final long j2) {
        final com.applovin.impl.s0.a aVarD = d();
        a(aVarD, 1006, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda38
            @Override // com.applovin.impl.gc.a
            public final void a(java.lang.Object obj) {
                ((com.applovin.impl.s0) obj).b(aVarD, i, j, j2);
            }
        });
    }

    @Override // com.applovin.impl.be
    public final void a(int i, com.applovin.impl.ae.a aVar, final com.applovin.impl.td tdVar) {
        final com.applovin.impl.s0.a aVarF = f(i, aVar);
        a(aVarF, 1004, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda46
            @Override // com.applovin.impl.gc.a
            public final void a(java.lang.Object obj) {
                ((com.applovin.impl.s0) obj).a(aVarF, tdVar);
            }
        });
    }

    @Override // com.applovin.impl.z6
    public final void a(int i, com.applovin.impl.ae.a aVar) {
        final com.applovin.impl.s0.a aVarF = f(i, aVar);
        a(aVarF, com.json.mediationsdk.logger.IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda55
            @Override // com.applovin.impl.gc.a
            public final void a(java.lang.Object obj) {
                ((com.applovin.impl.s0) obj).h(aVarF);
            }
        });
    }

    @Override // com.applovin.impl.z6
    public final void a(int i, com.applovin.impl.ae.a aVar, final int i2) {
        final com.applovin.impl.s0.a aVarF = f(i, aVar);
        a(aVarF, 1030, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda33
            @Override // com.applovin.impl.gc.a
            public final void a(java.lang.Object obj) {
                com.applovin.impl.r0.a(aVarF, i2, (com.applovin.impl.s0) obj);
            }
        });
    }

    @Override // com.applovin.impl.z6
    public final void a(int i, com.applovin.impl.ae.a aVar, final java.lang.Exception exc) {
        final com.applovin.impl.s0.a aVarF = f(i, aVar);
        a(aVarF, 1032, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda29
            @Override // com.applovin.impl.gc.a
            public final void a(java.lang.Object obj) {
                ((com.applovin.impl.s0) obj).c(aVarF, exc);
            }
        });
    }

    @Override // com.applovin.impl.wq
    public final void a(final int i, final long j) {
        final com.applovin.impl.s0.a aVarE = e();
        a(aVarE, 1023, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda7
            @Override // com.applovin.impl.gc.a
            public final void a(java.lang.Object obj) {
                ((com.applovin.impl.s0) obj).a(aVarE, i, j);
            }
        });
    }

    @Override // com.applovin.impl.be
    public final void a(int i, com.applovin.impl.ae.a aVar, final com.applovin.impl.mc mcVar, final com.applovin.impl.td tdVar) {
        final com.applovin.impl.s0.a aVarF = f(i, aVar);
        a(aVarF, 1002, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda15
            @Override // com.applovin.impl.gc.a
            public final void a(java.lang.Object obj) {
                ((com.applovin.impl.s0) obj).b(aVarF, mcVar, tdVar);
            }
        });
    }

    @Override // com.applovin.impl.be
    public final void a(int i, com.applovin.impl.ae.a aVar, final com.applovin.impl.mc mcVar, final com.applovin.impl.td tdVar, final java.io.IOException iOException, final boolean z) {
        final com.applovin.impl.s0.a aVarF = f(i, aVar);
        a(aVarF, 1003, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda25
            @Override // com.applovin.impl.gc.a
            public final void a(java.lang.Object obj) {
                ((com.applovin.impl.s0) obj).a(aVarF, mcVar, tdVar, iOException, z);
            }
        });
    }

    @Override // com.applovin.impl.qh.e, com.applovin.impl.qh.c
    public final void a(final com.applovin.impl.sd sdVar, final int i) {
        final com.applovin.impl.s0.a aVarC = c();
        a(aVarC, 1, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda54
            @Override // com.applovin.impl.gc.a
            public final void a(java.lang.Object obj) {
                ((com.applovin.impl.s0) obj).a(aVarC, sdVar, i);
            }
        });
    }

    @Override // com.applovin.impl.qh.e, com.applovin.impl.qh.c
    public void a(final com.applovin.impl.ud udVar) {
        final com.applovin.impl.s0.a aVarC = c();
        a(aVarC, 14, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda22
            @Override // com.applovin.impl.gc.a
            public final void a(java.lang.Object obj) {
                ((com.applovin.impl.s0) obj).a(aVarC, udVar);
            }
        });
    }

    @Override // com.applovin.impl.qh.e
    public final void a(final com.applovin.impl.af afVar) {
        final com.applovin.impl.s0.a aVarC = c();
        a(aVarC, 1007, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda34
            @Override // com.applovin.impl.gc.a
            public final void a(java.lang.Object obj) {
                ((com.applovin.impl.s0) obj).a(aVarC, afVar);
            }
        });
    }

    @Override // com.applovin.impl.qh.e, com.applovin.impl.qh.c
    public final void a(final boolean z, final int i) {
        final com.applovin.impl.s0.a aVarC = c();
        a(aVarC, 5, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda56
            @Override // com.applovin.impl.gc.a
            public final void a(java.lang.Object obj) {
                ((com.applovin.impl.s0) obj).b(aVarC, z, i);
            }
        });
    }

    @Override // com.applovin.impl.qh.e, com.applovin.impl.qh.c
    public final void a(final com.applovin.impl.ph phVar) {
        final com.applovin.impl.s0.a aVarC = c();
        a(aVarC, 12, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda52
            @Override // com.applovin.impl.gc.a
            public final void a(java.lang.Object obj) {
                ((com.applovin.impl.s0) obj).a(aVarC, phVar);
            }
        });
    }

    @Override // com.applovin.impl.qh.e, com.applovin.impl.qh.c
    public final void a(final int i) {
        final com.applovin.impl.s0.a aVarC = c();
        a(aVarC, 6, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda30
            @Override // com.applovin.impl.gc.a
            public final void a(java.lang.Object obj) {
                ((com.applovin.impl.s0) obj).e(aVarC, i);
            }
        });
    }

    @Override // com.applovin.impl.qh.e, com.applovin.impl.qh.c
    public final void a(final com.applovin.impl.nh nhVar) {
        com.applovin.impl.xd xdVar;
        final com.applovin.impl.s0.a aVarA = (!(nhVar instanceof com.applovin.impl.z7) || (xdVar = ((com.applovin.impl.z7) nhVar).j) == null) ? null : a(new com.applovin.impl.ae.a(xdVar));
        if (aVarA == null) {
            aVarA = c();
        }
        a(aVarA, 10, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda6
            @Override // com.applovin.impl.gc.a
            public final void a(java.lang.Object obj) {
                ((com.applovin.impl.s0) obj).a(aVarA, nhVar);
            }
        });
    }

    @Override // com.applovin.impl.qh.e, com.applovin.impl.qh.c
    public final void a(final com.applovin.impl.qh.f fVar, final com.applovin.impl.qh.f fVar2, final int i) {
        if (i == 1) {
            this.j = false;
        }
        this.d.a((com.applovin.impl.qh) com.applovin.impl.b1.a(this.h));
        final com.applovin.impl.s0.a aVarC = c();
        a(aVarC, 11, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda49
            @Override // com.applovin.impl.gc.a
            public final void a(java.lang.Object obj) {
                com.applovin.impl.r0.a(aVarC, i, fVar, fVar2, (com.applovin.impl.s0) obj);
            }
        });
    }

    @Override // com.applovin.impl.wq
    public final void a(final java.lang.Object obj, final long j) {
        final com.applovin.impl.s0.a aVarF = f();
        a(aVarF, 1027, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda35
            @Override // com.applovin.impl.gc.a
            public final void a(java.lang.Object obj2) {
                ((com.applovin.impl.s0) obj2).a(aVarF, obj, j);
            }
        });
    }

    @Override // com.applovin.impl.qh.e, com.applovin.impl.q1
    public final void a(final boolean z) {
        final com.applovin.impl.s0.a aVarF = f();
        a(aVarF, 1017, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda19
            @Override // com.applovin.impl.gc.a
            public final void a(java.lang.Object obj) {
                ((com.applovin.impl.s0) obj).d(aVarF, z);
            }
        });
    }

    @Override // com.applovin.impl.qh.e
    public void a(final int i, final int i2) {
        final com.applovin.impl.s0.a aVarF = f();
        a(aVarF, 1029, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda32
            @Override // com.applovin.impl.gc.a
            public final void a(java.lang.Object obj) {
                ((com.applovin.impl.s0) obj).a(aVarF, i, i2);
            }
        });
    }

    @Override // com.applovin.impl.qh.e, com.applovin.impl.qh.c
    public final void a(com.applovin.impl.fo foVar, final int i) {
        this.d.b((com.applovin.impl.qh) com.applovin.impl.b1.a(this.h));
        final com.applovin.impl.s0.a aVarC = c();
        a(aVarC, 0, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda16
            @Override // com.applovin.impl.gc.a
            public final void a(java.lang.Object obj) {
                ((com.applovin.impl.s0) obj).d(aVarC, i);
            }
        });
    }

    @Override // com.applovin.impl.qh.e, com.applovin.impl.qh.c
    public final void a(final com.applovin.impl.po poVar, final com.applovin.impl.to toVar) {
        final com.applovin.impl.s0.a aVarC = c();
        a(aVarC, 2, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda9
            @Override // com.applovin.impl.gc.a
            public final void a(java.lang.Object obj) {
                ((com.applovin.impl.s0) obj).a(aVarC, poVar, toVar);
            }
        });
    }

    @Override // com.applovin.impl.wq
    public final void a(final java.lang.String str) {
        final com.applovin.impl.s0.a aVarF = f();
        a(aVarF, 1024, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda5
            @Override // com.applovin.impl.gc.a
            public final void a(java.lang.Object obj) {
                ((com.applovin.impl.s0) obj).a(aVarF, str);
            }
        });
    }

    @Override // com.applovin.impl.wq
    public final void a(final long j, final int i) {
        final com.applovin.impl.s0.a aVarE = e();
        a(aVarE, 1026, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda39
            @Override // com.applovin.impl.gc.a
            public final void a(java.lang.Object obj) {
                ((com.applovin.impl.s0) obj).a(aVarE, j, i);
            }
        });
    }

    @Override // com.applovin.impl.wq
    public final void a(final com.applovin.impl.e9 e9Var, final com.applovin.impl.p5 p5Var) {
        final com.applovin.impl.s0.a aVarF = f();
        a(aVarF, 1022, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda50
            @Override // com.applovin.impl.gc.a
            public final void a(java.lang.Object obj) {
                com.applovin.impl.r0.b(aVarF, e9Var, p5Var, (com.applovin.impl.s0) obj);
            }
        });
    }

    @Override // com.applovin.impl.qh.e
    public final void a(final com.applovin.impl.xq xqVar) {
        final com.applovin.impl.s0.a aVarF = f();
        a(aVarF, 1028, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda21
            @Override // com.applovin.impl.gc.a
            public final void a(java.lang.Object obj) {
                com.applovin.impl.r0.a(aVarF, xqVar, (com.applovin.impl.s0) obj);
            }
        });
    }

    @Override // com.applovin.impl.qh.e
    public final void a(final float f) {
        final com.applovin.impl.s0.a aVarF = f();
        a(aVarF, 1019, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda44
            @Override // com.applovin.impl.gc.a
            public final void a(java.lang.Object obj) {
                ((com.applovin.impl.s0) obj).a(aVarF, f);
            }
        });
    }

    protected final void a(com.applovin.impl.s0.a aVar, int i, com.applovin.impl.gc.a aVar2) {
        this.f.put(i, aVar);
        this.g.b(i, aVar2);
    }

    public void a(final com.applovin.impl.qh qhVar, android.os.Looper looper) {
        com.applovin.impl.b1.b(this.h == null || this.d.b.isEmpty());
        this.h = (com.applovin.impl.qh) com.applovin.impl.b1.a(qhVar);
        this.i = this.f1204a.a(looper, null);
        this.g = this.g.a(looper, new com.applovin.impl.gc.b() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda12
            @Override // com.applovin.impl.gc.b
            public final void a(java.lang.Object obj, com.applovin.impl.a9 a9Var) {
                this.f$0.a(qhVar, (com.applovin.impl.s0) obj, a9Var);
            }
        });
    }

    public final void a(java.util.List list, com.applovin.impl.ae.a aVar) {
        this.d.a(list, aVar, (com.applovin.impl.qh) com.applovin.impl.b1.a(this.h));
    }
}
