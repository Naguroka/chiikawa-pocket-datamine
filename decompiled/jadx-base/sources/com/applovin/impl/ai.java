package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class ai implements com.applovin.impl.vd, com.applovin.impl.l8, com.applovin.impl.nc.b, com.applovin.impl.nc.f, com.applovin.impl.bj.d {
    private static final java.util.Map N = l();
    private static final com.applovin.impl.e9 O = new com.applovin.impl.e9.b().c("icy").f(androidx.media3.common.MimeTypes.APPLICATION_ICY).a();
    private boolean B;
    private boolean D;
    private boolean E;
    private int F;
    private long H;
    private boolean J;
    private int K;
    private boolean L;
    private boolean M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.net.Uri f619a;
    private final com.applovin.impl.h5 b;
    private final com.applovin.impl.a7 c;
    private final com.applovin.impl.lc d;
    private final com.applovin.impl.be.a f;
    private final com.applovin.impl.z6.a g;
    private final com.applovin.impl.ai.b h;
    private final com.applovin.impl.n0 i;
    private final java.lang.String j;
    private final long k;
    private final com.applovin.impl.zh m;
    private com.applovin.impl.vd.a r;
    private com.applovin.impl.ua s;
    private boolean v;
    private boolean w;
    private boolean x;
    private com.applovin.impl.ai.e y;
    private com.applovin.impl.ij z;
    private final com.applovin.impl.nc l = new com.applovin.impl.nc("ProgressiveMediaPeriod");
    private final com.applovin.impl.c4 n = new com.applovin.impl.c4();
    private final java.lang.Runnable o = new java.lang.Runnable() { // from class: com.applovin.impl.ai$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            this.f$0.r();
        }
    };
    private final java.lang.Runnable p = new java.lang.Runnable() { // from class: com.applovin.impl.ai$$ExternalSyntheticLambda1
        @Override // java.lang.Runnable
        public final void run() {
            this.f$0.q();
        }
    };
    private final android.os.Handler q = com.applovin.impl.xp.a();
    private com.applovin.impl.ai.d[] u = new com.applovin.impl.ai.d[0];
    private com.applovin.impl.bj[] t = new com.applovin.impl.bj[0];
    private long I = androidx.media3.common.C.TIME_UNSET;
    private long G = -1;
    private long A = androidx.media3.common.C.TIME_UNSET;
    private int C = 1;

    interface b {
        void a(long j, boolean z, boolean z2);
    }

    private static java.util.Map l() {
        java.util.HashMap map = new java.util.HashMap();
        map.put(androidx.media3.extractor.metadata.icy.IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_NAME, "1");
        return java.util.Collections.unmodifiableMap(map);
    }

    private void u() {
        com.applovin.impl.ai.a aVar = new com.applovin.impl.ai.a(this.f619a, this.b, this.m, this, this.n);
        if (this.w) {
            com.applovin.impl.b1.b(p());
            long j = this.A;
            if (j != androidx.media3.common.C.TIME_UNSET && this.I > j) {
                this.L = true;
                this.I = androidx.media3.common.C.TIME_UNSET;
                return;
            }
            aVar.a(((com.applovin.impl.ij) com.applovin.impl.b1.a(this.z)).b(this.I).f890a.b, this.I);
            for (com.applovin.impl.bj bjVar : this.t) {
                bjVar.c(this.I);
            }
            this.I = androidx.media3.common.C.TIME_UNSET;
        }
        this.K = m();
        this.f.c(new com.applovin.impl.mc(aVar.f620a, aVar.k, this.l.a(aVar, this, this.d.a(this.C))), 1, -1, null, 0, null, aVar.j, this.A);
    }

    @Override // com.applovin.impl.vd
    public void c(long j) {
    }

    public ai(android.net.Uri uri, com.applovin.impl.h5 h5Var, com.applovin.impl.zh zhVar, com.applovin.impl.a7 a7Var, com.applovin.impl.z6.a aVar, com.applovin.impl.lc lcVar, com.applovin.impl.be.a aVar2, com.applovin.impl.ai.b bVar, com.applovin.impl.n0 n0Var, java.lang.String str, int i) {
        this.f619a = uri;
        this.b = h5Var;
        this.c = a7Var;
        this.g = aVar;
        this.d = lcVar;
        this.f = aVar2;
        this.h = bVar;
        this.i = n0Var;
        this.j = str;
        this.k = i;
        this.m = zhVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q() {
        if (this.M) {
            return;
        }
        ((com.applovin.impl.vd.a) com.applovin.impl.b1.a(this.r)).a((com.applovin.impl.pj) this);
    }

    public void t() {
        if (this.w) {
            for (com.applovin.impl.bj bjVar : this.t) {
                bjVar.k();
            }
        }
        this.l.a(this);
        this.q.removeCallbacksAndMessages(null);
        this.r = null;
        this.M = true;
    }

    @Override // com.applovin.impl.vd
    public void f() throws java.io.IOException {
        s();
        if (this.L && !this.w) {
            throw com.applovin.impl.ch.a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.applovin.impl.vd
    public long g() {
        if (this.F == 0) {
            return Long.MIN_VALUE;
        }
        return e();
    }

    @Override // com.applovin.impl.vd
    public long h() {
        if (!this.E) {
            return androidx.media3.common.C.TIME_UNSET;
        }
        if (!this.L && m() <= this.K) {
            return androidx.media3.common.C.TIME_UNSET;
        }
        this.E = false;
        return this.H;
    }

    @Override // com.applovin.impl.vd
    public boolean b(long j) {
        if (this.L || this.l.c() || this.J) {
            return false;
        }
        if (this.w && this.F == 0) {
            return false;
        }
        boolean zE = this.n.e();
        if (this.l.d()) {
            return zE;
        }
        u();
        return true;
    }

    @Override // com.applovin.impl.vd
    public long e() {
        long jN;
        k();
        boolean[] zArr = this.y.b;
        if (this.L) {
            return Long.MIN_VALUE;
        }
        if (p()) {
            return this.I;
        }
        if (this.x) {
            int length = this.t.length;
            jN = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                if (zArr[i] && !this.t[i].i()) {
                    jN = java.lang.Math.min(jN, this.t[i].c());
                }
            }
        } else {
            jN = Long.MAX_VALUE;
        }
        if (jN == Long.MAX_VALUE) {
            jN = n();
        }
        return jN == Long.MIN_VALUE ? this.H : jN;
    }

    void s() throws java.io.IOException {
        this.l.a(this.d.a(this.C));
    }

    void d(int i) throws java.io.IOException {
        this.t[i].j();
        s();
    }

    private boolean v() {
        return this.E || p();
    }

    @Override // com.applovin.impl.vd
    public com.applovin.impl.po b() {
        k();
        return this.y.f623a;
    }

    com.applovin.impl.qo o() {
        return a(new com.applovin.impl.ai.d(0, true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        com.applovin.impl.af afVarA;
        if (this.M || this.w || !this.v || this.z == null) {
            return;
        }
        for (com.applovin.impl.bj bjVar : this.t) {
            if (bjVar.f() == null) {
                return;
            }
        }
        this.n.c();
        int length = this.t.length;
        com.applovin.impl.oo[] ooVarArr = new com.applovin.impl.oo[length];
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            com.applovin.impl.e9 e9VarA = (com.applovin.impl.e9) com.applovin.impl.b1.a(this.t[i].f());
            java.lang.String str = e9VarA.m;
            boolean zG = com.applovin.impl.hf.g(str);
            boolean z = zG || com.applovin.impl.hf.i(str);
            zArr[i] = z;
            this.x = z | this.x;
            com.applovin.impl.ua uaVar = this.s;
            if (uaVar != null) {
                if (zG || this.u[i].b) {
                    com.applovin.impl.af afVar = e9VarA.k;
                    if (afVar == null) {
                        afVarA = new com.applovin.impl.af(uaVar);
                    } else {
                        afVarA = afVar.a(uaVar);
                    }
                    e9VarA = e9VarA.a().a(afVarA).a();
                }
                if (zG && e9VarA.g == -1 && e9VarA.h == -1 && uaVar.f1395a != -1) {
                    e9VarA = e9VarA.a().b(uaVar.f1395a).a();
                }
            }
            ooVarArr[i] = new com.applovin.impl.oo(e9VarA.a(this.c.a(e9VarA)));
        }
        this.y = new com.applovin.impl.ai.e(new com.applovin.impl.po(ooVarArr), zArr);
        this.w = true;
        ((com.applovin.impl.vd.a) com.applovin.impl.b1.a(this.r)).a((com.applovin.impl.vd) this);
    }

    @Override // com.applovin.impl.l8
    public void c() {
        this.v = true;
        this.q.post(this.o);
    }

    @Override // com.applovin.impl.nc.f
    public void d() {
        for (com.applovin.impl.bj bjVar : this.t) {
            bjVar.l();
        }
        this.m.a();
    }

    private int m() {
        int iG = 0;
        for (com.applovin.impl.bj bjVar : this.t) {
            iG += bjVar.g();
        }
        return iG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long n() {
        long jMax = Long.MIN_VALUE;
        for (com.applovin.impl.bj bjVar : this.t) {
            jMax = java.lang.Math.max(jMax, bjVar.c());
        }
        return jMax;
    }

    private boolean p() {
        return this.I != androidx.media3.common.C.TIME_UNSET;
    }

    private void k() {
        com.applovin.impl.b1.b(this.w);
        com.applovin.impl.b1.a(this.y);
        com.applovin.impl.b1.a(this.z);
    }

    private final class c implements com.applovin.impl.cj {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f621a;

        public c(int i) {
            this.f621a = i;
        }

        @Override // com.applovin.impl.cj
        public boolean d() {
            return com.applovin.impl.ai.this.a(this.f621a);
        }

        @Override // com.applovin.impl.cj
        public void a() throws java.io.IOException {
            com.applovin.impl.ai.this.d(this.f621a);
        }

        @Override // com.applovin.impl.cj
        public int a(com.applovin.impl.f9 f9Var, com.applovin.impl.o5 o5Var, int i) {
            return com.applovin.impl.ai.this.a(this.f621a, f9Var, o5Var, i);
        }

        @Override // com.applovin.impl.cj
        public int a(long j) {
            return com.applovin.impl.ai.this.a(this.f621a, j);
        }
    }

    final class a implements com.applovin.impl.nc.e, com.applovin.impl.sa.a {
        private final android.net.Uri b;
        private final com.applovin.impl.fl c;
        private final com.applovin.impl.zh d;
        private final com.applovin.impl.l8 e;
        private final com.applovin.impl.c4 f;
        private volatile boolean h;
        private long j;
        private com.applovin.impl.qo m;
        private boolean n;
        private final com.applovin.impl.th g = new com.applovin.impl.th();
        private boolean i = true;
        private long l = -1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f620a = com.applovin.impl.mc.a();
        private com.applovin.impl.k5 k = a(0);

        public a(android.net.Uri uri, com.applovin.impl.h5 h5Var, com.applovin.impl.zh zhVar, com.applovin.impl.l8 l8Var, com.applovin.impl.c4 c4Var) {
            this.b = uri;
            this.c = new com.applovin.impl.fl(h5Var);
            this.d = zhVar;
            this.e = l8Var;
            this.f = c4Var;
        }

        @Override // com.applovin.impl.nc.e
        public void b() {
            this.h = true;
        }

        @Override // com.applovin.impl.nc.e
        public void a() {
            int iA = 0;
            while (iA == 0 && !this.h) {
                try {
                    long j = this.g.f1364a;
                    com.applovin.impl.k5 k5VarA = a(j);
                    this.k = k5VarA;
                    long jA = this.c.a(k5VarA);
                    this.l = jA;
                    if (jA != -1) {
                        this.l = jA + j;
                    }
                    com.applovin.impl.ai.this.s = com.applovin.impl.ua.a(this.c.e());
                    com.applovin.impl.f5 saVar = this.c;
                    if (com.applovin.impl.ai.this.s != null && com.applovin.impl.ai.this.s.g != -1) {
                        saVar = new com.applovin.impl.sa(this.c, com.applovin.impl.ai.this.s.g, this);
                        com.applovin.impl.qo qoVarO = com.applovin.impl.ai.this.o();
                        this.m = qoVarO;
                        qoVarO.a(com.applovin.impl.ai.O);
                    }
                    long jB = j;
                    this.d.a(saVar, this.b, this.c.e(), j, this.l, this.e);
                    if (com.applovin.impl.ai.this.s != null) {
                        this.d.c();
                    }
                    if (this.i) {
                        this.d.a(jB, this.j);
                        this.i = false;
                    }
                    while (true) {
                        long j2 = jB;
                        while (true) {
                            if (iA != 0 || this.h) {
                                break;
                            }
                            try {
                                this.f.a();
                                iA = this.d.a(this.g);
                                jB = this.d.b();
                                if (jB > com.applovin.impl.ai.this.k + j2) {
                                    this.f.c();
                                    com.applovin.impl.ai.this.q.post(com.applovin.impl.ai.this.p);
                                }
                            } catch (java.lang.InterruptedException unused) {
                                throw new java.io.InterruptedIOException();
                            }
                        }
                    }
                    if (iA == 1) {
                        iA = 0;
                    } else if (this.d.b() != -1) {
                        this.g.f1364a = this.d.b();
                    }
                    com.applovin.impl.xp.a((com.applovin.impl.h5) this.c);
                } catch (java.lang.Throwable th) {
                    if (iA != 1 && this.d.b() != -1) {
                        this.g.f1364a = this.d.b();
                    }
                    com.applovin.impl.xp.a((com.applovin.impl.h5) this.c);
                    throw th;
                }
            }
        }

        @Override // com.applovin.impl.sa.a
        public void a(com.applovin.impl.ah ahVar) {
            long jMax = !this.n ? this.j : java.lang.Math.max(com.applovin.impl.ai.this.n(), this.j);
            int iA = ahVar.a();
            com.applovin.impl.qo qoVar = (com.applovin.impl.qo) com.applovin.impl.b1.a(this.m);
            qoVar.a(ahVar, iA);
            qoVar.a(jMax, 1, iA, 0, null);
            this.n = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j, long j2) {
            this.g.f1364a = j;
            this.j = j2;
            this.i = true;
            this.n = false;
        }

        private com.applovin.impl.k5 a(long j) {
            return new com.applovin.impl.k5.b().a(this.b).a(j).a(com.applovin.impl.ai.this.j).a(6).a(com.applovin.impl.ai.N).a();
        }
    }

    private boolean a(com.applovin.impl.ai.a aVar, int i) {
        com.applovin.impl.ij ijVar;
        if (this.G == -1 && ((ijVar = this.z) == null || ijVar.d() == androidx.media3.common.C.TIME_UNSET)) {
            if (this.w && !v()) {
                this.J = true;
                return false;
            }
            this.E = this.w;
            this.H = 0L;
            this.K = 0;
            for (com.applovin.impl.bj bjVar : this.t) {
                bjVar.n();
            }
            aVar.a(0L, 0L);
            return true;
        }
        this.K = i;
        return true;
    }

    private static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.applovin.impl.po f623a;
        public final boolean[] b;
        public final boolean[] c;
        public final boolean[] d;

        public e(com.applovin.impl.po poVar, boolean[] zArr) {
            this.f623a = poVar;
            this.b = zArr;
            int i = poVar.f1153a;
            this.c = new boolean[i];
            this.d = new boolean[i];
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f622a;
        public final boolean b;

        public d(int i, boolean z) {
            this.f622a = i;
            this.b = z;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || com.applovin.impl.ai.d.class != obj.getClass()) {
                return false;
            }
            com.applovin.impl.ai.d dVar = (com.applovin.impl.ai.d) obj;
            return this.f622a == dVar.f622a && this.b == dVar.b;
        }

        public int hashCode() {
            return (this.f622a * 31) + (this.b ? 1 : 0);
        }
    }

    private void c(int i) {
        k();
        boolean[] zArr = this.y.b;
        if (this.J && zArr[i]) {
            if (this.t[i].a(false)) {
                return;
            }
            this.I = 0L;
            this.J = false;
            this.E = true;
            this.H = 0L;
            this.K = 0;
            for (com.applovin.impl.bj bjVar : this.t) {
                bjVar.n();
            }
            ((com.applovin.impl.vd.a) com.applovin.impl.b1.a(this.r)).a((com.applovin.impl.pj) this);
        }
    }

    private void a(com.applovin.impl.ai.a aVar) {
        if (this.G == -1) {
            this.G = aVar.l;
        }
    }

    private void b(int i) {
        k();
        com.applovin.impl.ai.e eVar = this.y;
        boolean[] zArr = eVar.d;
        if (zArr[i]) {
            return;
        }
        com.applovin.impl.e9 e9VarA = eVar.f623a.a(i).a(0);
        this.f.a(com.applovin.impl.hf.e(e9VarA.m), e9VarA, 0, (java.lang.Object) null, this.H);
        zArr[i] = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(com.applovin.impl.ij ijVar) {
        this.z = this.s == null ? ijVar : new com.applovin.impl.ij.b(androidx.media3.common.C.TIME_UNSET);
        this.A = ijVar.d();
        boolean z = this.G == -1 && ijVar.d() == androidx.media3.common.C.TIME_UNSET;
        this.B = z;
        this.C = z ? 7 : 1;
        this.h.a(this.A, ijVar.b(), this.B);
        if (this.w) {
            return;
        }
        r();
    }

    @Override // com.applovin.impl.vd
    public void a(long j, boolean z) {
        k();
        if (p()) {
            return;
        }
        boolean[] zArr = this.y.c;
        int length = this.t.length;
        for (int i = 0; i < length; i++) {
            this.t[i].b(j, z, zArr[i]);
        }
    }

    @Override // com.applovin.impl.vd
    public long a(long j, com.applovin.impl.jj jjVar) {
        k();
        if (!this.z.b()) {
            return 0L;
        }
        com.applovin.impl.ij.a aVarB = this.z.b(j);
        return jjVar.a(j, aVarB.f890a.f963a, aVarB.b.f963a);
    }

    @Override // com.applovin.impl.vd
    public boolean a() {
        return this.l.d() && this.n.d();
    }

    boolean a(int i) {
        return !v() && this.t[i].a(this.L);
    }

    @Override // com.applovin.impl.nc.b
    public void a(com.applovin.impl.ai.a aVar, long j, long j2, boolean z) {
        com.applovin.impl.fl flVar = aVar.c;
        com.applovin.impl.mc mcVar = new com.applovin.impl.mc(aVar.f620a, aVar.k, flVar.h(), flVar.i(), j, j2, flVar.g());
        this.d.a(aVar.f620a);
        this.f.a(mcVar, 1, -1, null, 0, null, aVar.j, this.A);
        if (z) {
            return;
        }
        a(aVar);
        for (com.applovin.impl.bj bjVar : this.t) {
            bjVar.n();
        }
        if (this.F > 0) {
            ((com.applovin.impl.vd.a) com.applovin.impl.b1.a(this.r)).a((com.applovin.impl.pj) this);
        }
    }

    @Override // com.applovin.impl.nc.b
    public void a(com.applovin.impl.ai.a aVar, long j, long j2) {
        com.applovin.impl.ij ijVar;
        if (this.A == androidx.media3.common.C.TIME_UNSET && (ijVar = this.z) != null) {
            boolean zB = ijVar.b();
            long jN = n();
            long j3 = jN == Long.MIN_VALUE ? 0L : jN + 10000;
            this.A = j3;
            this.h.a(j3, zB, this.B);
        }
        com.applovin.impl.fl flVar = aVar.c;
        com.applovin.impl.mc mcVar = new com.applovin.impl.mc(aVar.f620a, aVar.k, flVar.h(), flVar.i(), j, j2, flVar.g());
        this.d.a(aVar.f620a);
        this.f.b(mcVar, 1, -1, null, 0, null, aVar.j, this.A);
        a(aVar);
        this.L = true;
        ((com.applovin.impl.vd.a) com.applovin.impl.b1.a(this.r)).a((com.applovin.impl.pj) this);
    }

    @Override // com.applovin.impl.nc.b
    public com.applovin.impl.nc.c a(com.applovin.impl.ai.a aVar, long j, long j2, java.io.IOException iOException, int i) {
        com.applovin.impl.nc.c cVarA;
        a(aVar);
        com.applovin.impl.fl flVar = aVar.c;
        com.applovin.impl.mc mcVar = new com.applovin.impl.mc(aVar.f620a, aVar.k, flVar.h(), flVar.i(), j, j2, flVar.g());
        long jA = this.d.a(new com.applovin.impl.lc.a(mcVar, new com.applovin.impl.td(1, -1, null, 0, null, com.applovin.impl.t2.b(aVar.j), com.applovin.impl.t2.b(this.A)), iOException, i));
        if (jA == androidx.media3.common.C.TIME_UNSET) {
            cVarA = com.applovin.impl.nc.g;
        } else {
            int iM = m();
            boolean z = iM > this.K;
            if (a(aVar, iM)) {
                cVarA = com.applovin.impl.nc.a(z, jA);
            } else {
                cVarA = com.applovin.impl.nc.f;
            }
        }
        boolean z2 = !cVarA.a();
        this.f.a(mcVar, 1, -1, null, 0, null, aVar.j, this.A, iOException, z2);
        if (z2) {
            this.d.a(aVar.f620a);
        }
        return cVarA;
    }

    @Override // com.applovin.impl.bj.d
    public void a(com.applovin.impl.e9 e9Var) {
        this.q.post(this.o);
    }

    @Override // com.applovin.impl.vd
    public void a(com.applovin.impl.vd.a aVar, long j) {
        this.r = aVar;
        this.n.e();
        u();
    }

    private com.applovin.impl.qo a(com.applovin.impl.ai.d dVar) {
        int length = this.t.length;
        for (int i = 0; i < length; i++) {
            if (dVar.equals(this.u[i])) {
                return this.t[i];
            }
        }
        com.applovin.impl.bj bjVarA = com.applovin.impl.bj.a(this.i, this.q.getLooper(), this.c, this.g);
        bjVarA.a(this);
        int i2 = length + 1;
        com.applovin.impl.ai.d[] dVarArr = (com.applovin.impl.ai.d[]) java.util.Arrays.copyOf(this.u, i2);
        dVarArr[length] = dVar;
        this.u = (com.applovin.impl.ai.d[]) com.applovin.impl.xp.a((java.lang.Object[]) dVarArr);
        com.applovin.impl.bj[] bjVarArr = (com.applovin.impl.bj[]) java.util.Arrays.copyOf(this.t, i2);
        bjVarArr[length] = bjVarA;
        this.t = (com.applovin.impl.bj[]) com.applovin.impl.xp.a((java.lang.Object[]) bjVarArr);
        return bjVarA;
    }

    int a(int i, com.applovin.impl.f9 f9Var, com.applovin.impl.o5 o5Var, int i2) {
        if (v()) {
            return -3;
        }
        b(i);
        int iA = this.t[i].a(f9Var, o5Var, i2, this.L);
        if (iA == -3) {
            c(i);
        }
        return iA;
    }

    private boolean a(boolean[] zArr, long j) {
        int length = this.t.length;
        for (int i = 0; i < length; i++) {
            if (!this.t[i].b(j, false) && (zArr[i] || !this.x)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.applovin.impl.l8
    public void a(final com.applovin.impl.ij ijVar) {
        this.q.post(new java.lang.Runnable() { // from class: com.applovin.impl.ai$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(ijVar);
            }
        });
    }

    @Override // com.applovin.impl.vd
    public long a(long j) {
        k();
        boolean[] zArr = this.y.b;
        if (!this.z.b()) {
            j = 0;
        }
        int i = 0;
        this.E = false;
        this.H = j;
        if (p()) {
            this.I = j;
            return j;
        }
        if (this.C != 7 && a(zArr, j)) {
            return j;
        }
        this.J = false;
        this.I = j;
        this.L = false;
        if (this.l.d()) {
            com.applovin.impl.bj[] bjVarArr = this.t;
            int length = bjVarArr.length;
            while (i < length) {
                bjVarArr[i].b();
                i++;
            }
            this.l.a();
        } else {
            this.l.b();
            com.applovin.impl.bj[] bjVarArr2 = this.t;
            int length2 = bjVarArr2.length;
            while (i < length2) {
                bjVarArr2[i].n();
                i++;
            }
        }
        return j;
    }

    @Override // com.applovin.impl.vd
    public long a(com.applovin.impl.g8[] g8VarArr, boolean[] zArr, com.applovin.impl.cj[] cjVarArr, boolean[] zArr2, long j) {
        com.applovin.impl.g8 g8Var;
        k();
        com.applovin.impl.ai.e eVar = this.y;
        com.applovin.impl.po poVar = eVar.f623a;
        boolean[] zArr3 = eVar.c;
        int i = this.F;
        int i2 = 0;
        for (int i3 = 0; i3 < g8VarArr.length; i3++) {
            com.applovin.impl.cj cjVar = cjVarArr[i3];
            if (cjVar != null && (g8VarArr[i3] == null || !zArr[i3])) {
                int i4 = ((com.applovin.impl.ai.c) cjVar).f621a;
                com.applovin.impl.b1.b(zArr3[i4]);
                this.F--;
                zArr3[i4] = false;
                cjVarArr[i3] = null;
            }
        }
        boolean z = !this.D ? j == 0 : i != 0;
        for (int i5 = 0; i5 < g8VarArr.length; i5++) {
            if (cjVarArr[i5] == null && (g8Var = g8VarArr[i5]) != null) {
                com.applovin.impl.b1.b(g8Var.b() == 1);
                com.applovin.impl.b1.b(g8Var.b(0) == 0);
                int iA = poVar.a(g8Var.a());
                com.applovin.impl.b1.b(!zArr3[iA]);
                this.F++;
                zArr3[iA] = true;
                cjVarArr[i5] = new com.applovin.impl.ai.c(iA);
                zArr2[i5] = true;
                if (!z) {
                    com.applovin.impl.bj bjVar = this.t[iA];
                    z = (bjVar.b(j, true) || bjVar.e() == 0) ? false : true;
                }
            }
        }
        if (this.F == 0) {
            this.J = false;
            this.E = false;
            if (this.l.d()) {
                com.applovin.impl.bj[] bjVarArr = this.t;
                int length = bjVarArr.length;
                while (i2 < length) {
                    bjVarArr[i2].b();
                    i2++;
                }
                this.l.a();
            } else {
                com.applovin.impl.bj[] bjVarArr2 = this.t;
                int length2 = bjVarArr2.length;
                while (i2 < length2) {
                    bjVarArr2[i2].n();
                    i2++;
                }
            }
        } else if (z) {
            j = a(j);
            while (i2 < cjVarArr.length) {
                if (cjVarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.D = true;
        return j;
    }

    int a(int i, long j) {
        if (v()) {
            return 0;
        }
        b(i);
        com.applovin.impl.bj bjVar = this.t[i];
        int iA = bjVar.a(j, this.L);
        bjVar.f(iA);
        if (iA == 0) {
            c(i);
        }
        return iA;
    }

    @Override // com.applovin.impl.l8
    public com.applovin.impl.qo a(int i, int i2) {
        return a(new com.applovin.impl.ai.d(i, false));
    }
}
