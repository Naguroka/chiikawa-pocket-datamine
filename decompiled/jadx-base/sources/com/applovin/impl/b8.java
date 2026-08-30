package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class b8 extends com.applovin.impl.d2 {
    private com.applovin.impl.jj A;
    private com.applovin.impl.wj B;
    private boolean C;
    private com.applovin.impl.qh.b D;
    private com.applovin.impl.ud E;
    private com.applovin.impl.ud F;
    private com.applovin.impl.oh G;
    private int H;
    private int I;
    private long J;
    final com.applovin.impl.wo b;
    final com.applovin.impl.qh.b c;
    private final com.applovin.impl.qi[] d;
    private final com.applovin.impl.vo e;
    private final com.applovin.impl.ia f;
    private final com.applovin.impl.d8.f g;
    private final com.applovin.impl.d8 h;
    private final com.applovin.impl.gc i;
    private final java.util.concurrent.CopyOnWriteArraySet j;
    private final com.applovin.impl.fo.b k;
    private final java.util.List l;
    private final boolean m;
    private final com.applovin.impl.ce n;
    private final com.applovin.impl.r0 o;
    private final android.os.Looper p;
    private final com.applovin.impl.y1 q;
    private final long r;
    private final long s;
    private final com.applovin.impl.l3 t;
    private int u;
    private boolean v;
    private int w;
    private int x;
    private boolean y;
    private int z;

    private com.applovin.impl.fo R() {
        return new com.applovin.impl.sh(this.l, this.B);
    }

    @Override // com.applovin.impl.qh
    public com.applovin.impl.to A() {
        return new com.applovin.impl.to(this.G.i.c);
    }

    @Override // com.applovin.impl.qh
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public com.applovin.impl.db x() {
        return com.applovin.impl.db.h();
    }

    @Override // com.applovin.impl.qh
    public void a(android.view.SurfaceView surfaceView) {
    }

    @Override // com.applovin.impl.qh
    public void a(android.view.TextureView textureView) {
    }

    @Override // com.applovin.impl.qh
    public void b(android.view.SurfaceView surfaceView) {
    }

    @Override // com.applovin.impl.qh
    public void b(android.view.TextureView textureView) {
    }

    @Override // com.applovin.impl.qh
    public long q() {
        return androidx.media3.common.C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS;
    }

    @Override // com.applovin.impl.qh
    public com.applovin.impl.xq z() {
        return com.applovin.impl.xq.f;
    }

    public b8(com.applovin.impl.qi[] qiVarArr, com.applovin.impl.vo voVar, com.applovin.impl.ce ceVar, com.applovin.impl.kc kcVar, com.applovin.impl.y1 y1Var, com.applovin.impl.r0 r0Var, boolean z, com.applovin.impl.jj jjVar, long j, long j2, com.applovin.impl.jc jcVar, long j3, boolean z2, com.applovin.impl.l3 l3Var, android.os.Looper looper, com.applovin.impl.qh qhVar, com.applovin.impl.qh.b bVar) {
        com.applovin.impl.oc.c("ExoPlayerImpl", "Init " + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " [ExoPlayerLib/2.15.1] [" + com.applovin.impl.xp.e + com.ironsource.y8.i.e);
        com.applovin.impl.b1.b(qiVarArr.length > 0);
        this.d = (com.applovin.impl.qi[]) com.applovin.impl.b1.a(qiVarArr);
        this.e = (com.applovin.impl.vo) com.applovin.impl.b1.a(voVar);
        this.n = ceVar;
        this.q = y1Var;
        this.o = r0Var;
        this.m = z;
        this.A = jjVar;
        this.r = j;
        this.s = j2;
        this.C = z2;
        this.p = looper;
        this.t = l3Var;
        this.u = 0;
        final com.applovin.impl.qh qhVar2 = qhVar != null ? qhVar : this;
        this.i = new com.applovin.impl.gc(looper, l3Var, new com.applovin.impl.gc.b() { // from class: com.applovin.impl.b8$$ExternalSyntheticLambda6
            @Override // com.applovin.impl.gc.b
            public final void a(java.lang.Object obj, com.applovin.impl.a9 a9Var) {
                com.applovin.impl.b8.a(qhVar2, (com.applovin.impl.qh.c) obj, a9Var);
            }
        });
        this.j = new java.util.concurrent.CopyOnWriteArraySet();
        this.l = new java.util.ArrayList();
        this.B = new com.applovin.impl.wj.a(0);
        com.applovin.impl.wo woVar = new com.applovin.impl.wo(new com.applovin.impl.si[qiVarArr.length], new com.applovin.impl.g8[qiVarArr.length], null);
        this.b = woVar;
        this.k = new com.applovin.impl.fo.b();
        com.applovin.impl.qh.b bVarA = new com.applovin.impl.qh.b.a().a(1, 2, 12, 13, 14, 15, 16, 17, 18, 19).a(28, voVar.b()).a(bVar).a();
        this.c = bVarA;
        this.D = new com.applovin.impl.qh.b.a().a(bVarA).a(3).a(9).a();
        com.applovin.impl.ud udVar = com.applovin.impl.ud.H;
        this.E = udVar;
        this.F = udVar;
        this.H = -1;
        this.f = l3Var.a(looper, null);
        com.applovin.impl.d8.f fVar = new com.applovin.impl.d8.f() { // from class: com.applovin.impl.b8$$ExternalSyntheticLambda7
            @Override // com.applovin.impl.d8.f
            public final void a(com.applovin.impl.d8.e eVar) {
                this.f$0.c(eVar);
            }
        };
        this.g = fVar;
        this.G = com.applovin.impl.oh.a(woVar);
        if (r0Var != null) {
            r0Var.a(qhVar2, looper);
            b((com.applovin.impl.qh.e) r0Var);
            y1Var.a(new android.os.Handler(looper), r0Var);
        }
        this.h = new com.applovin.impl.d8(qiVarArr, voVar, woVar, kcVar, y1Var, this.u, this.v, r0Var, jjVar, jcVar, j3, z2, looper, l3Var, fVar);
    }

    public void c(long j) {
        this.h.a(j);
    }

    public boolean S() {
        return this.G.p;
    }

    @Override // com.applovin.impl.qh
    public android.os.Looper p() {
        return this.p;
    }

    @Override // com.applovin.impl.qh
    public void b(com.applovin.impl.qh.e eVar) {
        a((com.applovin.impl.qh.c) eVar);
    }

    public void a(com.applovin.impl.a8 a8Var) {
        this.j.add(a8Var);
    }

    @Override // com.applovin.impl.qh
    public com.applovin.impl.qh.b i() {
        return this.D;
    }

    @Override // com.applovin.impl.qh
    public int o() {
        return this.G.e;
    }

    @Override // com.applovin.impl.qh
    public int j() {
        return this.G.m;
    }

    @Override // com.applovin.impl.qh
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public com.applovin.impl.z7 c() {
        return this.G.f;
    }

    @Override // com.applovin.impl.qh
    public boolean l() {
        return this.G.l;
    }

    @Override // com.applovin.impl.qh
    public int m() {
        return this.u;
    }

    public void a(com.applovin.impl.qh.c cVar) {
        this.i.a(cVar);
    }

    @Override // com.applovin.impl.qh
    public boolean r() {
        return this.v;
    }

    @Override // com.applovin.impl.qh
    public long F() {
        return this.r;
    }

    @Override // com.applovin.impl.qh
    public long e() {
        return this.s;
    }

    public void W() {
        com.applovin.impl.oc.c("ExoPlayerImpl", "Release " + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " [ExoPlayerLib/2.15.1] [" + com.applovin.impl.xp.e + "] [" + com.applovin.impl.e8.a() + com.ironsource.y8.i.e);
        if (!this.h.x()) {
            this.i.b(10, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.b8$$ExternalSyntheticLambda12
                @Override // com.applovin.impl.gc.a
                public final void a(java.lang.Object obj) {
                    com.applovin.impl.b8.c((com.applovin.impl.qh.c) obj);
                }
            });
        }
        this.i.b();
        this.f.a((java.lang.Object) null);
        com.applovin.impl.r0 r0Var = this.o;
        if (r0Var != null) {
            this.q.a(r0Var);
        }
        com.applovin.impl.oh ohVarA = this.G.a(1);
        this.G = ohVarA;
        com.applovin.impl.oh ohVarA2 = ohVarA.a(ohVarA.b);
        this.G = ohVarA2;
        ohVarA2.q = ohVarA2.s;
        this.G.r = 0L;
    }

    @Override // com.applovin.impl.qh
    public int v() {
        if (this.G.f1125a.c()) {
            return this.I;
        }
        com.applovin.impl.oh ohVar = this.G;
        return ohVar.f1125a.a(ohVar.b.f1504a);
    }

    @Override // com.applovin.impl.qh
    public int t() {
        int iU = U();
        if (iU == -1) {
            return 0;
        }
        return iU;
    }

    @Override // com.applovin.impl.qh
    public long getDuration() {
        if (d()) {
            com.applovin.impl.oh ohVar = this.G;
            com.applovin.impl.ae.a aVar = ohVar.b;
            ohVar.f1125a.a(aVar.f1504a, this.k);
            return com.applovin.impl.t2.b(this.k.a(aVar.b, aVar.c));
        }
        return G();
    }

    @Override // com.applovin.impl.qh
    public long getCurrentPosition() {
        return com.applovin.impl.t2.b(a(this.G));
    }

    @Override // com.applovin.impl.qh
    public long h() {
        return com.applovin.impl.t2.b(this.G.r);
    }

    @Override // com.applovin.impl.qh
    public int E() {
        if (d()) {
            return this.G.b.b;
        }
        return -1;
    }

    @Override // com.applovin.impl.qh
    public int f() {
        if (d()) {
            return this.G.b.c;
        }
        return -1;
    }

    @Override // com.applovin.impl.qh
    public long g() {
        if (d()) {
            com.applovin.impl.oh ohVar = this.G;
            ohVar.f1125a.a(ohVar.b.f1504a, this.k);
            com.applovin.impl.oh ohVar2 = this.G;
            if (ohVar2.c == androidx.media3.common.C.TIME_UNSET) {
                return ohVar2.f1125a.a(t(), this.f701a).b();
            }
            return this.k.d() + com.applovin.impl.t2.b(this.G.c);
        }
        return getCurrentPosition();
    }

    @Override // com.applovin.impl.qh
    public long s() {
        if (this.G.f1125a.c()) {
            return this.J;
        }
        com.applovin.impl.oh ohVar = this.G;
        if (ohVar.k.d != ohVar.b.d) {
            return ohVar.f1125a.a(t(), this.f701a).d();
        }
        long j = ohVar.q;
        if (this.G.k.a()) {
            com.applovin.impl.oh ohVar2 = this.G;
            com.applovin.impl.fo.b bVarA = ohVar2.f1125a.a(ohVar2.k.f1504a, this.k);
            long jB = bVarA.b(this.G.k.b);
            j = jB == Long.MIN_VALUE ? bVarA.d : jB;
        }
        com.applovin.impl.oh ohVar3 = this.G;
        return com.applovin.impl.t2.b(a(ohVar3.f1125a, ohVar3.k, j));
    }

    @Override // com.applovin.impl.qh
    public com.applovin.impl.po k() {
        return this.G.h;
    }

    @Override // com.applovin.impl.qh
    public com.applovin.impl.ud C() {
        return this.E;
    }

    @Override // com.applovin.impl.qh
    public com.applovin.impl.fo n() {
        return this.G.f1125a;
    }

    private int U() {
        if (this.G.f1125a.c()) {
            return this.H;
        }
        com.applovin.impl.oh ohVar = this.G;
        return ohVar.f1125a.a(ohVar.b.f1504a, this.k).c;
    }

    private com.applovin.impl.qh.f d(long j) {
        com.applovin.impl.sd sdVar;
        java.lang.Object obj;
        int iA;
        java.lang.Object obj2;
        int iT = t();
        if (this.G.f1125a.c()) {
            sdVar = null;
            obj = null;
            iA = -1;
            obj2 = null;
        } else {
            com.applovin.impl.oh ohVar = this.G;
            java.lang.Object obj3 = ohVar.b.f1504a;
            ohVar.f1125a.a(obj3, this.k);
            iA = this.G.f1125a.a(obj3);
            obj = obj3;
            obj2 = this.G.f1125a.a(iT, this.f701a).f794a;
            sdVar = this.f701a.c;
        }
        long jB = com.applovin.impl.t2.b(j);
        long jB2 = this.G.b.a() ? com.applovin.impl.t2.b(b(this.G)) : jB;
        com.applovin.impl.ae.a aVar = this.G.b;
        return new com.applovin.impl.qh.f(obj2, iT, sdVar, obj, iA, jB, jB2, aVar.b, aVar.c);
    }

    private void X() {
        com.applovin.impl.qh.b bVar = this.D;
        com.applovin.impl.qh.b bVarA = a(this.c);
        this.D = bVarA;
        if (bVarA.equals(bVar)) {
            return;
        }
        this.i.a(13, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.b8$$ExternalSyntheticLambda8
            @Override // com.applovin.impl.gc.a
            public final void a(java.lang.Object obj) {
                this.f$0.d((com.applovin.impl.qh.c) obj);
            }
        });
    }

    private static long b(com.applovin.impl.oh ohVar) {
        com.applovin.impl.fo.d dVar = new com.applovin.impl.fo.d();
        com.applovin.impl.fo.b bVar = new com.applovin.impl.fo.b();
        ohVar.f1125a.a(ohVar.b.f1504a, bVar);
        if (ohVar.c == androidx.media3.common.C.TIME_UNSET) {
            return ohVar.f1125a.a(bVar.c, dVar).c();
        }
        return bVar.e() + ohVar.c;
    }

    private static final class a implements com.applovin.impl.de {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.Object f638a;
        private com.applovin.impl.fo b;

        public a(java.lang.Object obj, com.applovin.impl.fo foVar) {
            this.f638a = obj;
            this.b = foVar;
        }

        @Override // com.applovin.impl.de
        public com.applovin.impl.fo b() {
            return this.b;
        }

        @Override // com.applovin.impl.de
        public java.lang.Object a() {
            return this.f638a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(com.applovin.impl.oh ohVar, com.applovin.impl.qh.c cVar) {
        cVar.b(ohVar.e);
    }

    private android.util.Pair a(com.applovin.impl.oh ohVar, com.applovin.impl.oh ohVar2, boolean z, int i, boolean z2) {
        com.applovin.impl.fo foVar = ohVar2.f1125a;
        com.applovin.impl.fo foVar2 = ohVar.f1125a;
        if (foVar2.c() && foVar.c()) {
            return new android.util.Pair(java.lang.Boolean.FALSE, -1);
        }
        int i2 = 3;
        if (foVar2.c() != foVar.c()) {
            return new android.util.Pair(java.lang.Boolean.TRUE, 3);
        }
        if (foVar.a(foVar.a(ohVar2.b.f1504a, this.k).c, this.f701a).f794a.equals(foVar2.a(foVar2.a(ohVar.b.f1504a, this.k).c, this.f701a).f794a)) {
            if (z && i == 0 && ohVar2.b.d < ohVar.b.d) {
                return new android.util.Pair(java.lang.Boolean.TRUE, 0);
            }
            return new android.util.Pair(java.lang.Boolean.FALSE, -1);
        }
        if (z && i == 0) {
            i2 = 1;
        } else if (z && i == 1) {
            i2 = 2;
        } else if (!z2) {
            throw new java.lang.IllegalStateException();
        }
        return new android.util.Pair(java.lang.Boolean.TRUE, java.lang.Integer.valueOf(i2));
    }

    private static boolean c(com.applovin.impl.oh ohVar) {
        return ohVar.e == 3 && ohVar.l && ohVar.m == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(com.applovin.impl.oh ohVar, com.applovin.impl.qh.c cVar) {
        cVar.a(ohVar.n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(com.applovin.impl.oh ohVar, com.applovin.impl.qh.c cVar) {
        cVar.a(ohVar.m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g(com.applovin.impl.oh ohVar, com.applovin.impl.qh.c cVar) {
        cVar.d(c(ohVar));
    }

    public void e(com.applovin.impl.qh.c cVar) {
        this.i.b(cVar);
    }

    @Override // com.applovin.impl.qh
    public boolean d() {
        return this.G.b.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(final com.applovin.impl.d8.e eVar) {
        this.f.a(new java.lang.Runnable() { // from class: com.applovin.impl.b8$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(eVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.applovin.impl.qh.c cVar) {
        cVar.a(this.E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(com.applovin.impl.qh.c cVar) {
        cVar.a(com.applovin.impl.z7.a(new com.applovin.impl.f8(1), 1003));
    }

    private long a(com.applovin.impl.oh ohVar) {
        if (ohVar.f1125a.c()) {
            return com.applovin.impl.t2.a(this.J);
        }
        if (ohVar.b.a()) {
            return ohVar.s;
        }
        return a(ohVar.f1125a, ohVar.b, ohVar.s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(com.applovin.impl.qh.c cVar) {
        cVar.a(this.D);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(com.applovin.impl.oh ohVar, com.applovin.impl.qh.c cVar) {
        cVar.a(ohVar.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(com.applovin.impl.oh ohVar, com.applovin.impl.qh.c cVar) {
        cVar.e(ohVar.g);
        cVar.c(ohVar.g);
    }

    private android.util.Pair a(com.applovin.impl.fo foVar, com.applovin.impl.fo foVar2) {
        long jG = g();
        if (!foVar.c() && !foVar2.c()) {
            android.util.Pair pairA = foVar.a(this.f701a, this.k, t(), com.applovin.impl.t2.a(jG));
            java.lang.Object obj = ((android.util.Pair) com.applovin.impl.xp.a(pairA)).first;
            if (foVar2.a(obj) != -1) {
                return pairA;
            }
            java.lang.Object objA = com.applovin.impl.d8.a(this.f701a, this.k, this.u, this.v, obj, foVar, foVar2);
            if (objA != null) {
                foVar2.a(objA, this.k);
                int i = this.k.c;
                return a(foVar2, i, foVar2.a(i, this.f701a).b());
            }
            return a(foVar2, -1, androidx.media3.common.C.TIME_UNSET);
        }
        boolean z = !foVar.c() && foVar2.c();
        int iU = z ? -1 : U();
        if (z) {
            jG = -9223372036854775807L;
        }
        return a(foVar2, iU, jG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(com.applovin.impl.oh ohVar, com.applovin.impl.qh.c cVar) {
        cVar.b(ohVar.l, ohVar.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(com.applovin.impl.oh ohVar, int i, com.applovin.impl.qh.c cVar) {
        cVar.a(ohVar.f1125a, i);
    }

    @Override // com.applovin.impl.qh
    public void b() {
        com.applovin.impl.oh ohVar = this.G;
        if (ohVar.e != 1) {
            return;
        }
        com.applovin.impl.oh ohVarA = ohVar.a((com.applovin.impl.z7) null);
        com.applovin.impl.oh ohVarA2 = ohVarA.a(ohVarA.f1125a.c() ? 4 : 2);
        this.w++;
        this.h.v();
        a(ohVarA2, 1, 1, false, false, 5, androidx.media3.common.C.TIME_UNSET, -1);
    }

    private android.util.Pair a(com.applovin.impl.fo foVar, int i, long j) {
        if (foVar.c()) {
            this.H = i;
            if (j == androidx.media3.common.C.TIME_UNSET) {
                j = 0;
            }
            this.J = j;
            this.I = 0;
            return null;
        }
        if (i == -1 || i >= foVar.b()) {
            i = foVar.a(this.v);
            j = foVar.a(i, this.f701a).b();
        }
        return foVar.a(this.f701a, this.k, i, com.applovin.impl.t2.a(j));
    }

    private void b(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            this.l.remove(i3);
        }
        this.B = this.B.a(i, i2);
    }

    @Override // com.applovin.impl.qh
    public com.applovin.impl.ph a() {
        return this.G.n;
    }

    @Override // com.applovin.impl.qh
    public void b(final boolean z) {
        if (this.v != z) {
            this.v = z;
            this.h.f(z);
            this.i.a(9, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.b8$$ExternalSyntheticLambda13
                @Override // com.applovin.impl.gc.a
                public final void a(java.lang.Object obj) {
                    ((com.applovin.impl.qh.c) obj).b(z);
                }
            });
            X();
            this.i.a();
        }
    }

    private com.applovin.impl.qh.f a(int i, com.applovin.impl.oh ohVar, int i2) {
        int i3;
        java.lang.Object obj;
        com.applovin.impl.sd sdVar;
        java.lang.Object obj2;
        int i4;
        long jB;
        long jA;
        long jB2;
        long j;
        com.applovin.impl.fo.b bVar = new com.applovin.impl.fo.b();
        if (ohVar.f1125a.c()) {
            i3 = i2;
            obj = null;
            sdVar = null;
            obj2 = null;
            i4 = -1;
        } else {
            java.lang.Object obj3 = ohVar.b.f1504a;
            ohVar.f1125a.a(obj3, bVar);
            int i5 = bVar.c;
            int iA = ohVar.f1125a.a(obj3);
            java.lang.Object obj4 = ohVar.f1125a.a(i5, this.f701a).f794a;
            sdVar = this.f701a.c;
            obj2 = obj3;
            i4 = iA;
            obj = obj4;
            i3 = i5;
        }
        if (i == 0) {
            jB = bVar.f + bVar.d;
            if (ohVar.b.a()) {
                com.applovin.impl.ae.a aVar = ohVar.b;
                jA = bVar.a(aVar.b, aVar.c);
                jB2 = b(ohVar);
                long j2 = jB2;
                j = jA;
                jB = j2;
            } else {
                if (ohVar.b.e != -1 && this.G.b.a()) {
                    jB = b(this.G);
                }
                j = jB;
            }
        } else if (ohVar.b.a()) {
            jA = ohVar.s;
            jB2 = b(ohVar);
            long j3 = jB2;
            j = jA;
            jB = j3;
        } else {
            jB = bVar.f + ohVar.s;
            j = jB;
        }
        long jB3 = com.applovin.impl.t2.b(j);
        long jB4 = com.applovin.impl.t2.b(jB);
        com.applovin.impl.ae.a aVar2 = ohVar.b;
        return new com.applovin.impl.qh.f(obj, i3, sdVar, obj2, i4, jB3, jB4, aVar2.b, aVar2.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(com.applovin.impl.d8.e eVar) {
        long j;
        boolean z;
        long jA;
        int i = this.w - eVar.c;
        this.w = i;
        boolean z2 = true;
        if (eVar.d) {
            this.x = eVar.e;
            this.y = true;
        }
        if (eVar.f) {
            this.z = eVar.g;
        }
        if (i == 0) {
            com.applovin.impl.fo foVar = eVar.b.f1125a;
            if (!this.G.f1125a.c() && foVar.c()) {
                this.H = -1;
                this.J = 0L;
                this.I = 0;
            }
            if (!foVar.c()) {
                java.util.List listD = ((com.applovin.impl.sh) foVar).d();
                com.applovin.impl.b1.b(listD.size() == this.l.size());
                for (int i2 = 0; i2 < listD.size(); i2++) {
                    ((com.applovin.impl.b8.a) this.l.get(i2)).b = (com.applovin.impl.fo) listD.get(i2);
                }
            }
            if (this.y) {
                if (eVar.b.b.equals(this.G.b) && eVar.b.d == this.G.s) {
                    z2 = false;
                }
                if (z2) {
                    if (!foVar.c() && !eVar.b.b.a()) {
                        com.applovin.impl.oh ohVar = eVar.b;
                        jA = a(foVar, ohVar.b, ohVar.d);
                    } else {
                        jA = eVar.b.d;
                    }
                    j = jA;
                } else {
                    j = -9223372036854775807L;
                }
                z = z2;
            } else {
                j = -9223372036854775807L;
                z = false;
            }
            this.y = false;
            a(eVar.b, 1, this.z, false, z, this.x, j, -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.applovin.impl.qh qhVar, com.applovin.impl.qh.c cVar, com.applovin.impl.a9 a9Var) {
        cVar.a(qhVar, new com.applovin.impl.qh.d(a9Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(int i, com.applovin.impl.qh.f fVar, com.applovin.impl.qh.f fVar2, com.applovin.impl.qh.c cVar) {
        cVar.e(i);
        cVar.a(fVar, fVar2, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.applovin.impl.oh ohVar, com.applovin.impl.qh.c cVar) {
        cVar.b(ohVar.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.applovin.impl.oh ohVar, com.applovin.impl.to toVar, com.applovin.impl.qh.c cVar) {
        cVar.a(ohVar.h, toVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.applovin.impl.oh ohVar, int i, com.applovin.impl.qh.c cVar) {
        cVar.a(ohVar.l, i);
    }

    private com.applovin.impl.oh a(com.applovin.impl.oh ohVar, com.applovin.impl.fo foVar, android.util.Pair pair) {
        com.applovin.impl.oh ohVarA;
        long jA;
        com.applovin.impl.b1.a(foVar.c() || pair != null);
        com.applovin.impl.fo foVar2 = ohVar.f1125a;
        com.applovin.impl.oh ohVarA2 = ohVar.a(foVar);
        if (foVar.c()) {
            com.applovin.impl.ae.a aVarA = com.applovin.impl.oh.a();
            long jA2 = com.applovin.impl.t2.a(this.J);
            com.applovin.impl.oh ohVarA3 = ohVarA2.a(aVarA, jA2, jA2, jA2, 0L, com.applovin.impl.po.d, this.b, com.applovin.impl.db.h()).a(aVarA);
            ohVarA3.q = ohVarA3.s;
            return ohVarA3;
        }
        java.lang.Object obj = ohVarA2.b.f1504a;
        boolean z = !obj.equals(((android.util.Pair) com.applovin.impl.xp.a(pair)).first);
        com.applovin.impl.ae.a aVar = z ? new com.applovin.impl.ae.a(pair.first) : ohVarA2.b;
        long jLongValue = ((java.lang.Long) pair.second).longValue();
        long jA3 = com.applovin.impl.t2.a(g());
        if (!foVar2.c()) {
            jA3 -= foVar2.a(obj, this.k).e();
        }
        if (z || jLongValue < jA3) {
            com.applovin.impl.b1.b(!aVar.a());
            com.applovin.impl.oh ohVarA4 = ohVarA2.a(r0, jLongValue, jLongValue, jLongValue, 0L, z ? com.applovin.impl.po.d : ohVarA2.h, z ? this.b : ohVarA2.i, z ? com.applovin.impl.db.h() : ohVarA2.j).a(aVar);
            ohVarA4.q = jLongValue;
            return ohVarA4;
        }
        if (jLongValue == jA3) {
            int iA = foVar.a(ohVarA2.k.f1504a);
            if (iA != -1 && foVar.a(iA, this.k).c == foVar.a(aVar.f1504a, this.k).c) {
                return ohVarA2;
            }
            foVar.a(aVar.f1504a, this.k);
            if (aVar.a()) {
                jA = this.k.a(aVar.b, aVar.c);
            } else {
                jA = this.k.d;
            }
            ohVarA = ohVarA2.a(aVar, ohVarA2.s, ohVarA2.s, ohVarA2.d, jA - ohVarA2.s, ohVarA2.h, ohVarA2.i, ohVarA2.j).a(aVar);
            ohVarA.q = jA;
        } else {
            com.applovin.impl.b1.b(!aVar.a());
            long jMax = java.lang.Math.max(0L, ohVarA2.r - (jLongValue - jA3));
            long j = ohVarA2.q;
            if (ohVarA2.k.equals(ohVarA2.b)) {
                j = jLongValue + jMax;
            }
            ohVarA = ohVarA2.a(aVar, jLongValue, jLongValue, jLongValue, jMax, ohVarA2.h, ohVarA2.i, ohVarA2.j);
            ohVarA.q = j;
        }
        return ohVarA;
    }

    public void a(com.applovin.impl.af afVar) {
        com.applovin.impl.ud udVarA = this.E.a().a(afVar).a();
        if (udVarA.equals(this.E)) {
            return;
        }
        this.E = udVarA;
        this.i.b(14, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.b8$$ExternalSyntheticLambda9
            @Override // com.applovin.impl.gc.a
            public final void a(java.lang.Object obj) {
                this.f$0.b((com.applovin.impl.qh.c) obj);
            }
        });
    }

    private long a(com.applovin.impl.fo foVar, com.applovin.impl.ae.a aVar, long j) {
        foVar.a(aVar.f1504a, this.k);
        return j + this.k.e();
    }

    @Override // com.applovin.impl.qh
    public void a(com.applovin.impl.qh.e eVar) {
        e(eVar);
    }

    private com.applovin.impl.oh a(int i, int i2) {
        com.applovin.impl.b1.a(i >= 0 && i2 >= i && i2 <= this.l.size());
        int iT = t();
        com.applovin.impl.fo foVarN = n();
        int size = this.l.size();
        this.w++;
        b(i, i2);
        com.applovin.impl.fo foVarR = R();
        com.applovin.impl.oh ohVarA = a(this.G, foVarR, a(foVarN, foVarR));
        int i3 = ohVarA.e;
        if (i3 != 1 && i3 != 4 && i < i2 && i2 == size && iT >= ohVarA.f1125a.b()) {
            ohVarA = ohVarA.a(4);
        }
        this.h.b(i, i2, this.B);
        return ohVarA;
    }

    @Override // com.applovin.impl.qh
    public void a(int i, long j) {
        com.applovin.impl.fo foVar = this.G.f1125a;
        if (i >= 0 && (foVar.c() || i < foVar.b())) {
            this.w++;
            if (d()) {
                com.applovin.impl.oc.d("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                com.applovin.impl.d8.e eVar = new com.applovin.impl.d8.e(this.G);
                eVar.a(1);
                this.g.a(eVar);
                return;
            }
            int i2 = o() != 1 ? 2 : 1;
            int iT = t();
            com.applovin.impl.oh ohVarA = a(this.G.a(i2), foVar, a(foVar, i, j));
            this.h.a(foVar, i, com.applovin.impl.t2.a(j));
            a(ohVarA, 0, 1, true, true, 1, a(ohVarA), iT);
            return;
        }
        throw new com.applovin.impl.ab(foVar, i, j);
    }

    public void a(com.applovin.impl.ae aeVar) {
        a(java.util.Collections.singletonList(aeVar));
    }

    public void a(java.util.List list) {
        a(list, true);
    }

    public void a(java.util.List list, boolean z) {
        a(list, -1, androidx.media3.common.C.TIME_UNSET, z);
    }

    private void a(java.util.List list, int i, long j, boolean z) {
        int i2;
        long j2;
        int iU = U();
        long currentPosition = getCurrentPosition();
        this.w++;
        if (!this.l.isEmpty()) {
            b(0, this.l.size());
        }
        java.util.List listA = a(0, list);
        com.applovin.impl.fo foVarR = R();
        if (!foVarR.c() && i >= foVarR.b()) {
            throw new com.applovin.impl.ab(foVarR, i, j);
        }
        if (z) {
            int iA = foVarR.a(this.v);
            j2 = androidx.media3.common.C.TIME_UNSET;
            i2 = iA;
        } else if (i == -1) {
            i2 = iU;
            j2 = currentPosition;
        } else {
            i2 = i;
            j2 = j;
        }
        com.applovin.impl.oh ohVarA = a(this.G, foVarR, a(foVarR, i2, j2));
        int i3 = ohVarA.e;
        if (i2 != -1 && i3 != 1) {
            i3 = (foVarR.c() || i2 >= foVarR.b()) ? 4 : 2;
        }
        com.applovin.impl.oh ohVarA2 = ohVarA.a(i3);
        this.h.a(listA, i2, com.applovin.impl.t2.a(j2), this.B);
        a(ohVarA2, 0, 1, false, (this.G.b.f1504a.equals(ohVarA2.b.f1504a) || this.G.f1125a.c()) ? false : true, 4, a(ohVarA2), -1);
    }

    @Override // com.applovin.impl.qh
    public void a(boolean z) {
        a(z, 0, 1);
    }

    public void a(boolean z, int i, int i2) {
        com.applovin.impl.oh ohVar = this.G;
        if (ohVar.l == z && ohVar.m == i) {
            return;
        }
        this.w++;
        com.applovin.impl.oh ohVarA = ohVar.a(z, i);
        this.h.a(z, i);
        a(ohVarA, 0, i2, false, false, 5, androidx.media3.common.C.TIME_UNSET, -1);
    }

    @Override // com.applovin.impl.qh
    public void a(final int i) {
        if (this.u != i) {
            this.u = i;
            this.h.a(i);
            this.i.a(8, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.b8$$ExternalSyntheticLambda10
                @Override // com.applovin.impl.gc.a
                public final void a(java.lang.Object obj) {
                    ((com.applovin.impl.qh.c) obj).c(i);
                }
            });
            X();
            this.i.a();
        }
    }

    public void a(boolean z, com.applovin.impl.z7 z7Var) {
        com.applovin.impl.oh ohVarA;
        if (z) {
            ohVarA = a(0, this.l.size()).a((com.applovin.impl.z7) null);
        } else {
            com.applovin.impl.oh ohVar = this.G;
            ohVarA = ohVar.a(ohVar.b);
            ohVarA.q = ohVarA.s;
            ohVarA.r = 0L;
        }
        com.applovin.impl.oh ohVarA2 = ohVarA.a(1);
        if (z7Var != null) {
            ohVarA2 = ohVarA2.a(z7Var);
        }
        com.applovin.impl.oh ohVar2 = ohVarA2;
        this.w++;
        this.h.G();
        a(ohVar2, 0, 1, false, ohVar2.f1125a.c() && !this.G.f1125a.c(), 4, a(ohVar2), -1);
    }

    private void a(final com.applovin.impl.oh ohVar, final int i, final int i2, boolean z, boolean z2, final int i3, long j, int i4) {
        com.applovin.impl.oh ohVar2 = this.G;
        this.G = ohVar;
        android.util.Pair pairA = a(ohVar, ohVar2, z2, i3, !ohVar2.f1125a.equals(ohVar.f1125a));
        boolean zBooleanValue = ((java.lang.Boolean) pairA.first).booleanValue();
        final int iIntValue = ((java.lang.Integer) pairA.second).intValue();
        com.applovin.impl.ud udVarA = this.E;
        final com.applovin.impl.sd sdVar = null;
        if (zBooleanValue) {
            if (!ohVar.f1125a.c()) {
                sdVar = ohVar.f1125a.a(ohVar.f1125a.a(ohVar.b.f1504a, this.k).c, this.f701a).c;
            }
            udVarA = sdVar != null ? sdVar.d : com.applovin.impl.ud.H;
        }
        if (!ohVar2.j.equals(ohVar.j)) {
            udVarA = udVarA.a().a(ohVar.j).a();
        }
        boolean z3 = !udVarA.equals(this.E);
        this.E = udVarA;
        if (!ohVar2.f1125a.equals(ohVar.f1125a)) {
            this.i.a(0, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.b8$$ExternalSyntheticLambda0
                @Override // com.applovin.impl.gc.a
                public final void a(java.lang.Object obj) {
                    com.applovin.impl.b8.b(ohVar, i, (com.applovin.impl.qh.c) obj);
                }
            });
        }
        if (z2) {
            final com.applovin.impl.qh.f fVarA = a(i3, ohVar2, i4);
            final com.applovin.impl.qh.f fVarD = d(j);
            this.i.a(11, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.b8$$ExternalSyntheticLambda19
                @Override // com.applovin.impl.gc.a
                public final void a(java.lang.Object obj) {
                    com.applovin.impl.b8.a(i3, fVarA, fVarD, (com.applovin.impl.qh.c) obj);
                }
            });
        }
        if (zBooleanValue) {
            this.i.a(1, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.b8$$ExternalSyntheticLambda20
                @Override // com.applovin.impl.gc.a
                public final void a(java.lang.Object obj) {
                    ((com.applovin.impl.qh.c) obj).a(sdVar, iIntValue);
                }
            });
        }
        if (ohVar2.f != ohVar.f) {
            this.i.a(10, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.b8$$ExternalSyntheticLambda21
                @Override // com.applovin.impl.gc.a
                public final void a(java.lang.Object obj) {
                    com.applovin.impl.b8.a(ohVar, (com.applovin.impl.qh.c) obj);
                }
            });
            if (ohVar.f != null) {
                this.i.a(10, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.b8$$ExternalSyntheticLambda22
                    @Override // com.applovin.impl.gc.a
                    public final void a(java.lang.Object obj) {
                        com.applovin.impl.b8.b(ohVar, (com.applovin.impl.qh.c) obj);
                    }
                });
            }
        }
        com.applovin.impl.wo woVar = ohVar2.i;
        com.applovin.impl.wo woVar2 = ohVar.i;
        if (woVar != woVar2) {
            this.e.a(woVar2.d);
            final com.applovin.impl.to toVar = new com.applovin.impl.to(ohVar.i.c);
            this.i.a(2, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.b8$$ExternalSyntheticLambda1
                @Override // com.applovin.impl.gc.a
                public final void a(java.lang.Object obj) {
                    com.applovin.impl.b8.a(ohVar, toVar, (com.applovin.impl.qh.c) obj);
                }
            });
        }
        if (z3) {
            final com.applovin.impl.ud udVar = this.E;
            this.i.a(14, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.b8$$ExternalSyntheticLambda2
                @Override // com.applovin.impl.gc.a
                public final void a(java.lang.Object obj) {
                    ((com.applovin.impl.qh.c) obj).a(udVar);
                }
            });
        }
        if (ohVar2.g != ohVar.g) {
            this.i.a(3, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.b8$$ExternalSyntheticLambda3
                @Override // com.applovin.impl.gc.a
                public final void a(java.lang.Object obj) {
                    com.applovin.impl.b8.c(ohVar, (com.applovin.impl.qh.c) obj);
                }
            });
        }
        if (ohVar2.e != ohVar.e || ohVar2.l != ohVar.l) {
            this.i.a(-1, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.b8$$ExternalSyntheticLambda4
                @Override // com.applovin.impl.gc.a
                public final void a(java.lang.Object obj) {
                    com.applovin.impl.b8.d(ohVar, (com.applovin.impl.qh.c) obj);
                }
            });
        }
        if (ohVar2.e != ohVar.e) {
            this.i.a(4, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.b8$$ExternalSyntheticLambda5
                @Override // com.applovin.impl.gc.a
                public final void a(java.lang.Object obj) {
                    com.applovin.impl.b8.e(ohVar, (com.applovin.impl.qh.c) obj);
                }
            });
        }
        if (ohVar2.l != ohVar.l) {
            this.i.a(5, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.b8$$ExternalSyntheticLambda11
                @Override // com.applovin.impl.gc.a
                public final void a(java.lang.Object obj) {
                    com.applovin.impl.b8.a(ohVar, i2, (com.applovin.impl.qh.c) obj);
                }
            });
        }
        if (ohVar2.m != ohVar.m) {
            this.i.a(6, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.b8$$ExternalSyntheticLambda15
                @Override // com.applovin.impl.gc.a
                public final void a(java.lang.Object obj) {
                    com.applovin.impl.b8.f(ohVar, (com.applovin.impl.qh.c) obj);
                }
            });
        }
        if (c(ohVar2) != c(ohVar)) {
            this.i.a(7, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.b8$$ExternalSyntheticLambda16
                @Override // com.applovin.impl.gc.a
                public final void a(java.lang.Object obj) {
                    com.applovin.impl.b8.g(ohVar, (com.applovin.impl.qh.c) obj);
                }
            });
        }
        if (!ohVar2.n.equals(ohVar.n)) {
            this.i.a(12, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.b8$$ExternalSyntheticLambda17
                @Override // com.applovin.impl.gc.a
                public final void a(java.lang.Object obj) {
                    com.applovin.impl.b8.h(ohVar, (com.applovin.impl.qh.c) obj);
                }
            });
        }
        if (z) {
            this.i.a(-1, new com.applovin.impl.gc.a() { // from class: com.applovin.impl.b8$$ExternalSyntheticLambda18
                @Override // com.applovin.impl.gc.a
                public final void a(java.lang.Object obj) {
                    ((com.applovin.impl.qh.c) obj).b();
                }
            });
        }
        X();
        this.i.a();
        if (ohVar2.o != ohVar.o) {
            java.util.Iterator it = this.j.iterator();
            while (it.hasNext()) {
                ((com.applovin.impl.a8) it.next()).f(ohVar.o);
            }
        }
        if (ohVar2.p != ohVar.p) {
            java.util.Iterator it2 = this.j.iterator();
            while (it2.hasNext()) {
                ((com.applovin.impl.a8) it2.next()).g(ohVar.p);
            }
        }
    }

    public com.applovin.impl.rh a(com.applovin.impl.rh.b bVar) {
        return new com.applovin.impl.rh(this.h, bVar, this.G.f1125a, t(), this.t, this.h.g());
    }

    private java.util.List a(int i, java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            com.applovin.impl.ee.c cVar = new com.applovin.impl.ee.c((com.applovin.impl.ae) list.get(i2), this.m);
            arrayList.add(cVar);
            this.l.add(i2 + i, new com.applovin.impl.b8.a(cVar.b, cVar.f757a.i()));
        }
        this.B = this.B.b(i, arrayList.size());
        return arrayList;
    }
}
