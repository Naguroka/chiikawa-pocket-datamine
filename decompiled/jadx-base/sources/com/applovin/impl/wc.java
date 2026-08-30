package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class wc extends com.applovin.impl.b4 {
    private final com.applovin.impl.ae j;
    private final boolean k;
    private final com.applovin.impl.fo.d l;
    private final com.applovin.impl.fo.b m;
    private com.applovin.impl.wc.a n;
    private com.applovin.impl.vc o;
    private boolean p;
    private boolean q;
    private boolean r;

    public static final class b extends com.applovin.impl.fo {
        private final com.applovin.impl.sd c;

        @Override // com.applovin.impl.fo
        public int a() {
            return 1;
        }

        @Override // com.applovin.impl.fo
        public int b() {
            return 1;
        }

        @Override // com.applovin.impl.fo
        public java.lang.Object b(int i) {
            return com.applovin.impl.wc.a.g;
        }

        public b(com.applovin.impl.sd sdVar) {
            this.c = sdVar;
        }

        @Override // com.applovin.impl.fo
        public int a(java.lang.Object obj) {
            return obj == com.applovin.impl.wc.a.g ? 0 : -1;
        }

        @Override // com.applovin.impl.fo
        public com.applovin.impl.fo.b a(int i, com.applovin.impl.fo.b bVar, boolean z) {
            bVar.a(z ? 0 : null, z ? com.applovin.impl.wc.a.g : null, 0, androidx.media3.common.C.TIME_UNSET, 0L, com.applovin.impl.u.h, true);
            return bVar;
        }

        @Override // com.applovin.impl.fo
        public com.applovin.impl.fo.d a(int i, com.applovin.impl.fo.d dVar, long j) {
            dVar.a(com.applovin.impl.fo.d.s, this.c, null, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET, false, true, null, 0L, androidx.media3.common.C.TIME_UNSET, 0, 0, 0L);
            dVar.m = true;
            return dVar;
        }
    }

    @Override // com.applovin.impl.ae
    public void b() {
    }

    public wc(com.applovin.impl.ae aeVar, boolean z) {
        this.j = aeVar;
        this.k = z && aeVar.c();
        this.l = new com.applovin.impl.fo.d();
        this.m = new com.applovin.impl.fo.b();
        com.applovin.impl.fo foVarD = aeVar.d();
        if (foVarD != null) {
            this.n = com.applovin.impl.wc.a.a(foVarD, (java.lang.Object) null, (java.lang.Object) null);
            this.r = true;
        } else {
            this.n = com.applovin.impl.wc.a.a(aeVar.a());
        }
    }

    public com.applovin.impl.fo i() {
        return this.n;
    }

    @Override // com.applovin.impl.ae
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.applovin.impl.vc a(com.applovin.impl.ae.a aVar, com.applovin.impl.n0 n0Var, long j) {
        com.applovin.impl.vc vcVar = new com.applovin.impl.vc(aVar, n0Var, j);
        vcVar.a(this.j);
        if (this.q) {
            vcVar.a(aVar.b(b(aVar.f1504a)));
        } else {
            this.o = vcVar;
            if (!this.p) {
                this.p = true;
                a((java.lang.Object) null, this.j);
            }
        }
        return vcVar;
    }

    @Override // com.applovin.impl.b4, com.applovin.impl.c2
    public void h() {
        this.q = false;
        this.p = false;
        super.h();
    }

    private static final class a extends com.applovin.impl.h9 {
        public static final java.lang.Object g = new java.lang.Object();
        private final java.lang.Object d;
        private final java.lang.Object f;

        private a(com.applovin.impl.fo foVar, java.lang.Object obj, java.lang.Object obj2) {
            super(foVar);
            this.d = obj;
            this.f = obj2;
        }

        @Override // com.applovin.impl.h9, com.applovin.impl.fo
        public java.lang.Object b(int i) {
            java.lang.Object objB = this.c.b(i);
            return com.applovin.impl.xp.a(objB, this.f) ? g : objB;
        }

        @Override // com.applovin.impl.h9, com.applovin.impl.fo
        public int a(java.lang.Object obj) {
            java.lang.Object obj2;
            com.applovin.impl.fo foVar = this.c;
            if (g.equals(obj) && (obj2 = this.f) != null) {
                obj = obj2;
            }
            return foVar.a(obj);
        }

        @Override // com.applovin.impl.h9, com.applovin.impl.fo
        public com.applovin.impl.fo.b a(int i, com.applovin.impl.fo.b bVar, boolean z) {
            this.c.a(i, bVar, z);
            if (com.applovin.impl.xp.a(bVar.b, this.f) && z) {
                bVar.b = g;
            }
            return bVar;
        }

        @Override // com.applovin.impl.h9, com.applovin.impl.fo
        public com.applovin.impl.fo.d a(int i, com.applovin.impl.fo.d dVar, long j) {
            this.c.a(i, dVar, j);
            if (com.applovin.impl.xp.a(dVar.f794a, this.d)) {
                dVar.f794a = com.applovin.impl.fo.d.s;
            }
            return dVar;
        }

        public static com.applovin.impl.wc.a a(com.applovin.impl.sd sdVar) {
            return new com.applovin.impl.wc.a(new com.applovin.impl.wc.b(sdVar), com.applovin.impl.fo.d.s, g);
        }

        public static com.applovin.impl.wc.a a(com.applovin.impl.fo foVar, java.lang.Object obj, java.lang.Object obj2) {
            return new com.applovin.impl.wc.a(foVar, obj, obj2);
        }

        public com.applovin.impl.wc.a a(com.applovin.impl.fo foVar) {
            return new com.applovin.impl.wc.a(foVar, this.d, this.f);
        }
    }

    private java.lang.Object a(java.lang.Object obj) {
        return (this.n.f == null || !this.n.f.equals(obj)) ? obj : com.applovin.impl.wc.a.g;
    }

    private java.lang.Object b(java.lang.Object obj) {
        return (this.n.f == null || !obj.equals(com.applovin.impl.wc.a.g)) ? obj : this.n.f;
    }

    @Override // com.applovin.impl.ae
    public com.applovin.impl.sd a() {
        return this.j.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.b4
    public com.applovin.impl.ae.a a(java.lang.Void r1, com.applovin.impl.ae.a aVar) {
        return aVar.b(a(aVar.f1504a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:19:0x0074  */
    /* JADX WARN: Code duplicated, block: B:30:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // com.applovin.impl.b4
    public void a(java.lang.Void r13, com.applovin.impl.ae aeVar, com.applovin.impl.fo foVar) {
        long j;
        com.applovin.impl.wc.a aVarA;
        com.applovin.impl.ae.a aVarB;
        com.applovin.impl.wc.a aVarA2;
        if (this.q) {
            this.n = this.n.a(foVar);
            com.applovin.impl.vc vcVar = this.o;
            if (vcVar != null) {
                a(vcVar.c());
            }
        } else if (foVar.c()) {
            if (this.r) {
                aVarA2 = this.n.a(foVar);
            } else {
                aVarA2 = com.applovin.impl.wc.a.a(foVar, com.applovin.impl.fo.d.s, com.applovin.impl.wc.a.g);
            }
            this.n = aVarA2;
        } else {
            foVar.a(0, this.l);
            long jC = this.l.c();
            java.lang.Object obj = this.l.f794a;
            com.applovin.impl.vc vcVar2 = this.o;
            if (vcVar2 != null) {
                long jD = vcVar2.d();
                this.n.a(this.o.f1425a.f1504a, this.m);
                long jE = this.m.e() + jD;
                if (jE != this.n.a(0, this.l).c()) {
                    j = jE;
                } else {
                    j = jC;
                }
            } else {
                j = jC;
            }
            android.util.Pair pairA = foVar.a(this.l, this.m, 0, j);
            java.lang.Object obj2 = pairA.first;
            long jLongValue = ((java.lang.Long) pairA.second).longValue();
            if (this.r) {
                aVarA = this.n.a(foVar);
            } else {
                aVarA = com.applovin.impl.wc.a.a(foVar, obj, obj2);
            }
            this.n = aVarA;
            com.applovin.impl.vc vcVar3 = this.o;
            if (vcVar3 != null) {
                a(jLongValue);
                com.applovin.impl.ae.a aVar = vcVar3.f1425a;
                aVarB = aVar.b(b(aVar.f1504a));
            }
            this.r = true;
            this.q = true;
            a((com.applovin.impl.fo) this.n);
            if (aVarB != null) {
                ((com.applovin.impl.vc) com.applovin.impl.b1.a(this.o)).a(aVarB);
            }
        }
        aVarB = null;
        this.r = true;
        this.q = true;
        a((com.applovin.impl.fo) this.n);
        if (aVarB != null) {
            ((com.applovin.impl.vc) com.applovin.impl.b1.a(this.o)).a(aVarB);
        }
    }

    @Override // com.applovin.impl.b4, com.applovin.impl.c2
    public void a(com.applovin.impl.xo xoVar) {
        super.a(xoVar);
        if (this.k) {
            return;
        }
        this.p = true;
        a((java.lang.Object) null, this.j);
    }

    @Override // com.applovin.impl.ae
    public void a(com.applovin.impl.vd vdVar) {
        ((com.applovin.impl.vc) vdVar).i();
        if (vdVar == this.o) {
            this.o = null;
        }
    }

    private void a(long j) {
        com.applovin.impl.vc vcVar = this.o;
        int iA = this.n.a(vcVar.f1425a.f1504a);
        if (iA == -1) {
            return;
        }
        long j2 = this.n.a(iA, this.m).d;
        if (j2 != androidx.media3.common.C.TIME_UNSET && j >= j2) {
            j = java.lang.Math.max(0L, j2 - 1);
        }
        vcVar.e(j);
    }
}
