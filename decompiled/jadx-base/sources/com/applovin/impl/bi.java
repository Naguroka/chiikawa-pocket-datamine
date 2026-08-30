package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class bi extends com.applovin.impl.c2 implements com.applovin.impl.ai.b {
    private final com.applovin.impl.sd g;
    private final com.applovin.impl.sd.g h;
    private final com.applovin.impl.h5.a i;
    private final com.applovin.impl.zh.a j;
    private final com.applovin.impl.a7 k;
    private final com.applovin.impl.lc l;
    private final int m;
    private boolean n;
    private long o;
    private boolean p;
    private boolean q;
    private com.applovin.impl.xo r;

    @Override // com.applovin.impl.ae
    public void b() {
    }

    public static final class b implements com.applovin.impl.ce {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.h5.a f647a;
        private com.applovin.impl.zh.a b;
        private com.applovin.impl.b7 c;
        private com.applovin.impl.lc d;
        private int e;
        private java.lang.String f;
        private java.lang.Object g;

        public b(com.applovin.impl.h5.a aVar) {
            this(aVar, new com.applovin.impl.b6());
        }

        public b(com.applovin.impl.h5.a aVar, final com.applovin.impl.n8 n8Var) {
            this(aVar, new com.applovin.impl.zh.a() { // from class: com.applovin.impl.bi$b$$ExternalSyntheticLambda0
                @Override // com.applovin.impl.zh.a
                public final com.applovin.impl.zh a() {
                    return com.applovin.impl.bi.b.a(n8Var);
                }
            });
        }

        public com.applovin.impl.bi a(com.applovin.impl.sd sdVar) {
            com.applovin.impl.b1.a(sdVar.b);
            com.applovin.impl.sd.g gVar = sdVar.b;
            boolean z = gVar.g == null && this.g != null;
            boolean z2 = gVar.e == null && this.f != null;
            if (z && z2) {
                sdVar = sdVar.a().a(this.g).a(this.f).a();
            } else if (z) {
                sdVar = sdVar.a().a(this.g).a();
            } else if (z2) {
                sdVar = sdVar.a().a(this.f).a();
            }
            com.applovin.impl.sd sdVar2 = sdVar;
            return new com.applovin.impl.bi(sdVar2, this.f647a, this.b, this.c.a(sdVar2), this.d, this.e, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ com.applovin.impl.zh a(com.applovin.impl.n8 n8Var) {
            return new com.applovin.impl.q2(n8Var);
        }

        public b(com.applovin.impl.h5.a aVar, com.applovin.impl.zh.a aVar2) {
            this.f647a = aVar;
            this.b = aVar2;
            this.c = new com.applovin.impl.y5();
            this.d = new com.applovin.impl.f6();
            this.e = 1048576;
        }
    }

    private bi(com.applovin.impl.sd sdVar, com.applovin.impl.h5.a aVar, com.applovin.impl.zh.a aVar2, com.applovin.impl.a7 a7Var, com.applovin.impl.lc lcVar, int i) {
        this.h = (com.applovin.impl.sd.g) com.applovin.impl.b1.a(sdVar.b);
        this.g = sdVar;
        this.i = aVar;
        this.j = aVar2;
        this.k = a7Var;
        this.l = lcVar;
        this.m = i;
        this.n = true;
        this.o = androidx.media3.common.C.TIME_UNSET;
    }

    @Override // com.applovin.impl.ae
    public com.applovin.impl.vd a(com.applovin.impl.ae.a aVar, com.applovin.impl.n0 n0Var, long j) {
        com.applovin.impl.h5 h5VarA = this.i.a();
        com.applovin.impl.xo xoVar = this.r;
        if (xoVar != null) {
            h5VarA.a(xoVar);
        }
        return new com.applovin.impl.ai(this.h.f1256a, h5VarA, this.j.a(), this.k, a(aVar), this.l, b(aVar), this, n0Var, this.h.e, this.m);
    }

    @Override // com.applovin.impl.c2
    protected void h() {
        this.k.a();
    }

    /* synthetic */ bi(com.applovin.impl.sd sdVar, com.applovin.impl.h5.a aVar, com.applovin.impl.zh.a aVar2, com.applovin.impl.a7 a7Var, com.applovin.impl.lc lcVar, int i, com.applovin.impl.bi.a aVar3) {
        this(sdVar, aVar, aVar2, a7Var, lcVar, i);
    }

    private void i() {
        com.applovin.impl.fo gkVar = new com.applovin.impl.gk(this.o, this.p, false, this.q, null, this.g);
        if (this.n) {
            gkVar = new com.applovin.impl.bi.a(gkVar);
        }
        a(gkVar);
    }

    class a extends com.applovin.impl.h9 {
        a(com.applovin.impl.fo foVar) {
            super(foVar);
        }

        @Override // com.applovin.impl.h9, com.applovin.impl.fo
        public com.applovin.impl.fo.b a(int i, com.applovin.impl.fo.b bVar, boolean z) {
            super.a(i, bVar, z);
            bVar.g = true;
            return bVar;
        }

        @Override // com.applovin.impl.h9, com.applovin.impl.fo
        public com.applovin.impl.fo.d a(int i, com.applovin.impl.fo.d dVar, long j) {
            super.a(i, dVar, j);
            dVar.m = true;
            return dVar;
        }
    }

    @Override // com.applovin.impl.ae
    public com.applovin.impl.sd a() {
        return this.g;
    }

    @Override // com.applovin.impl.ai.b
    public void a(long j, boolean z, boolean z2) {
        if (j == androidx.media3.common.C.TIME_UNSET) {
            j = this.o;
        }
        if (!this.n && this.o == j && this.p == z && this.q == z2) {
            return;
        }
        this.o = j;
        this.p = z;
        this.q = z2;
        this.n = false;
        i();
    }

    @Override // com.applovin.impl.c2
    protected void a(com.applovin.impl.xo xoVar) {
        this.r = xoVar;
        this.k.b();
        i();
    }

    @Override // com.applovin.impl.ae
    public void a(com.applovin.impl.vd vdVar) {
        ((com.applovin.impl.ai) vdVar).t();
    }
}
