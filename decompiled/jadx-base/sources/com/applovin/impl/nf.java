package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class nf implements com.applovin.impl.j8 {
    public static final com.applovin.impl.n8 u = new com.applovin.impl.n8() { // from class: com.applovin.impl.nf$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.n8
        public final com.applovin.impl.j8[] a() {
            return com.applovin.impl.nf.d();
        }
    };
    private static final com.applovin.impl.wa.a v = new com.applovin.impl.wa.a() { // from class: com.applovin.impl.nf$$ExternalSyntheticLambda1
        @Override // com.applovin.impl.wa.a
        public final boolean a(int i, int i2, int i3, int i4, int i5) {
            return com.applovin.impl.nf.a(i, i2, i3, i4, i5);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1095a;
    private final long b;
    private final com.applovin.impl.ah c;
    private final com.applovin.impl.sf.a d;
    private final com.applovin.impl.y9 e;
    private final com.applovin.impl.ya f;
    private final com.applovin.impl.qo g;
    private com.applovin.impl.l8 h;
    private com.applovin.impl.qo i;
    private com.applovin.impl.qo j;
    private int k;
    private com.applovin.impl.af l;
    private long m;
    private long n;
    private long o;
    private int p;
    private com.applovin.impl.lj q;
    private boolean r;
    private boolean s;
    private long t;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(int i, int i2, int i3, int i4, int i5) {
        return (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) || (i2 == 77 && i3 == 76 && i4 == 76 && (i5 == 84 || i == 2));
    }

    private static boolean a(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    @Override // com.applovin.impl.j8
    public void a() {
    }

    public nf() {
        this(0);
    }

    public void c() {
        this.r = true;
    }

    private int e(com.applovin.impl.k8 k8Var) throws com.applovin.impl.ch {
        if (this.k == 0) {
            try {
                b(k8Var, false);
            } catch (java.io.EOFException unused) {
                return -1;
            }
        }
        if (this.q == null) {
            com.applovin.impl.lj ljVarB = b(k8Var);
            this.q = ljVarB;
            this.h.a(ljVarB);
            this.j.a(new com.applovin.impl.e9.b().f(this.d.b).i(4096).c(this.d.e).n(this.d.d).e(this.e.f1535a).f(this.e.b).a((this.f1095a & 8) != 0 ? null : this.l).a());
            this.o = k8Var.f();
        } else if (this.o != 0) {
            long jF = k8Var.f();
            long j = this.o;
            if (jF < j) {
                k8Var.a((int) (j - jF));
            }
        }
        return f(k8Var);
    }

    private int f(com.applovin.impl.k8 k8Var) {
        if (this.p == 0) {
            k8Var.b();
            if (d(k8Var)) {
                return -1;
            }
            this.c.f(0);
            int iJ = this.c.j();
            if (a(iJ, this.k) && com.applovin.impl.sf.b(iJ) != -1) {
                this.d.a(iJ);
                if (this.m == androidx.media3.common.C.TIME_UNSET) {
                    this.m = this.q.a(k8Var.f());
                    if (this.b != androidx.media3.common.C.TIME_UNSET) {
                        this.m += this.b - this.q.a(0L);
                    }
                }
                com.applovin.impl.sf.a aVar = this.d;
                this.p = aVar.c;
                com.applovin.impl.lj ljVar = this.q;
                if (ljVar instanceof com.applovin.impl.mb) {
                    com.applovin.impl.mb mbVar = (com.applovin.impl.mb) ljVar;
                    mbVar.a(a(this.n + ((long) aVar.g)), k8Var.f() + ((long) this.d.c));
                    if (this.s && mbVar.c(this.t)) {
                        this.s = false;
                        this.j = this.i;
                    }
                }
            } else {
                k8Var.a(1);
                this.k = 0;
                return 0;
            }
        }
        int iA = this.j.a((com.applovin.impl.f5) k8Var, this.p, true);
        if (iA == -1) {
            return -1;
        }
        int i = this.p - iA;
        this.p = i;
        if (i > 0) {
            return 0;
        }
        this.j.a(a(this.n), 1, this.d.c, 0, null);
        this.n += (long) this.d.g;
        this.p = 0;
        return 0;
    }

    public nf(int i) {
        this(i, androidx.media3.common.C.TIME_UNSET);
    }

    private long a(long j) {
        return this.m + ((j * 1000000) / ((long) this.d.d));
    }

    private boolean d(com.applovin.impl.k8 k8Var) {
        com.applovin.impl.lj ljVar = this.q;
        if (ljVar != null) {
            long jC = ljVar.c();
            if (jC != -1 && k8Var.d() > jC - 4) {
                return true;
            }
        }
        try {
            return !k8Var.b(this.c.c(), 0, 4, true);
        } catch (java.io.EOFException unused) {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.applovin.impl.j8[] d() {
        return new com.applovin.impl.j8[]{new com.applovin.impl.nf()};
    }

    public nf(int i, long j) {
        this.f1095a = (i & 2) != 0 ? i | 1 : i;
        this.b = j;
        this.c = new com.applovin.impl.ah(10);
        this.d = new com.applovin.impl.sf.a();
        this.e = new com.applovin.impl.y9();
        this.m = androidx.media3.common.C.TIME_UNSET;
        this.f = new com.applovin.impl.ya();
        com.applovin.impl.h7 h7Var = new com.applovin.impl.h7();
        this.g = h7Var;
        this.j = h7Var;
    }

    private void b() {
        com.applovin.impl.b1.b(this.i);
        com.applovin.impl.xp.a(this.h);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0028  */
    private com.applovin.impl.lj c(com.applovin.impl.k8 k8Var) {
        int i;
        com.applovin.impl.ah ahVar = new com.applovin.impl.ah(this.d.c);
        k8Var.c(ahVar.c(), 0, this.d.c);
        com.applovin.impl.sf.a aVar = this.d;
        if ((aVar.f1337a & 1) != 0) {
            if (aVar.e != 1) {
                i = 36;
            } else {
                i = 21;
            }
        } else if (aVar.e != 1) {
            i = 21;
        } else {
            i = 13;
        }
        int i2 = i;
        int iA = a(ahVar, i2);
        if (iA != 1483304551 && iA != 1231971951) {
            if (iA == 1447187017) {
                com.applovin.impl.pq pqVarA = com.applovin.impl.pq.a(k8Var.a(), k8Var.f(), this.d, ahVar);
                k8Var.a(this.d.c);
                return pqVarA;
            }
            k8Var.b();
            return null;
        }
        com.applovin.impl.ds dsVarA = com.applovin.impl.ds.a(k8Var.a(), k8Var.f(), this.d, ahVar);
        if (dsVarA != null && !this.e.a()) {
            k8Var.b();
            k8Var.c(i2 + 141);
            k8Var.c(this.c.c(), 0, 3);
            this.c.f(0);
            this.e.a(this.c.z());
        }
        k8Var.a(this.d.c);
        return (dsVarA == null || dsVarA.b() || iA != 1231971951) ? dsVarA : a(k8Var, false);
    }

    private com.applovin.impl.lj a(com.applovin.impl.k8 k8Var, boolean z) {
        k8Var.c(this.c.c(), 0, 4);
        this.c.f(0);
        this.d.a(this.c.j());
        return new com.applovin.impl.p4(k8Var.a(), k8Var.f(), this.d, z);
    }

    private com.applovin.impl.lj b(com.applovin.impl.k8 k8Var) {
        long jA;
        long jC;
        com.applovin.impl.lj ljVarC = c(k8Var);
        com.applovin.impl.jf jfVarA = a(this.l, k8Var.f());
        if (this.r) {
            return new com.applovin.impl.lj.a();
        }
        if ((this.f1095a & 4) != 0) {
            if (jfVarA != null) {
                jA = jfVarA.d();
                jC = jfVarA.c();
            } else if (ljVarC != null) {
                jA = ljVarC.d();
                jC = ljVarC.c();
            } else {
                jA = a(this.l);
                jC = -1;
            }
            ljVarC = new com.applovin.impl.mb(jA, k8Var.f(), jC);
        } else if (jfVarA != null) {
            ljVarC = jfVarA;
        } else if (ljVarC == null) {
            ljVarC = null;
        }
        if (ljVarC == null || !(ljVarC.b() || (this.f1095a & 1) == 0)) {
            return a(k8Var, (this.f1095a & 2) != 0);
        }
        return ljVarC;
    }

    private boolean b(com.applovin.impl.k8 k8Var, boolean z) throws com.applovin.impl.ch, java.io.EOFException {
        int iD;
        int i;
        int iB;
        int i2 = z ? 32768 : 131072;
        k8Var.b();
        if (k8Var.f() == 0) {
            com.applovin.impl.af afVarA = this.f.a(k8Var, (this.f1095a & 8) == 0 ? null : v);
            this.l = afVarA;
            if (afVarA != null) {
                this.e.a(afVarA);
            }
            iD = (int) k8Var.d();
            if (!z) {
                k8Var.a(iD);
            }
            i = 0;
        } else {
            iD = 0;
            i = 0;
        }
        int i3 = i;
        int i4 = i3;
        while (true) {
            if (d(k8Var)) {
                if (i3 > 0) {
                    break;
                }
                throw new java.io.EOFException();
            }
            this.c.f(0);
            int iJ = this.c.j();
            if ((i == 0 || a(iJ, i)) && (iB = com.applovin.impl.sf.b(iJ)) != -1) {
                i3++;
                if (i3 != 1) {
                    if (i3 == 4) {
                        break;
                    }
                } else {
                    this.d.a(iJ);
                    i = iJ;
                }
                k8Var.c(iB - 4);
            } else {
                int i5 = i4 + 1;
                if (i4 == i2) {
                    if (z) {
                        return false;
                    }
                    throw com.applovin.impl.ch.a("Searched too many bytes.", null);
                }
                if (z) {
                    k8Var.b();
                    k8Var.c(iD + i5);
                } else {
                    k8Var.a(1);
                }
                i3 = 0;
                i4 = i5;
                i = 0;
            }
        }
        if (z) {
            k8Var.a(iD + i4);
        } else {
            k8Var.b();
        }
        this.k = i;
        return true;
    }

    private static long a(com.applovin.impl.af afVar) {
        if (afVar == null) {
            return androidx.media3.common.C.TIME_UNSET;
        }
        int iC = afVar.c();
        for (int i = 0; i < iC; i++) {
            com.applovin.impl.af.b bVarA = afVar.a(i);
            if (bVarA instanceof com.applovin.impl.zn) {
                com.applovin.impl.zn znVar = (com.applovin.impl.zn) bVarA;
                if (znVar.f1498a.equals("TLEN")) {
                    return com.applovin.impl.t2.a(java.lang.Long.parseLong(znVar.c));
                }
            }
        }
        return androidx.media3.common.C.TIME_UNSET;
    }

    private static int a(com.applovin.impl.ah ahVar, int i) {
        if (ahVar.e() >= i + 4) {
            ahVar.f(i);
            int iJ = ahVar.j();
            if (iJ == 1483304551 || iJ == 1231971951) {
                return iJ;
            }
        }
        if (ahVar.e() < 40) {
            return 0;
        }
        ahVar.f(36);
        return ahVar.j() == 1447187017 ? 1447187017 : 0;
    }

    @Override // com.applovin.impl.j8
    public void a(com.applovin.impl.l8 l8Var) {
        this.h = l8Var;
        com.applovin.impl.qo qoVarA = l8Var.a(0, 1);
        this.i = qoVarA;
        this.j = qoVarA;
        this.h.c();
    }

    private static com.applovin.impl.jf a(com.applovin.impl.af afVar, long j) {
        if (afVar == null) {
            return null;
        }
        int iC = afVar.c();
        for (int i = 0; i < iC; i++) {
            com.applovin.impl.af.b bVarA = afVar.a(i);
            if (bVarA instanceof com.applovin.impl.Cif) {
                return com.applovin.impl.jf.a(j, (com.applovin.impl.Cif) bVarA, a(afVar));
            }
        }
        return null;
    }

    @Override // com.applovin.impl.j8
    public int a(com.applovin.impl.k8 k8Var, com.applovin.impl.th thVar) throws com.applovin.impl.ch {
        b();
        int iE = e(k8Var);
        if (iE == -1 && (this.q instanceof com.applovin.impl.mb)) {
            long jA = a(this.n);
            if (this.q.d() != jA) {
                ((com.applovin.impl.mb) this.q).d(jA);
                this.h.a(this.q);
            }
        }
        return iE;
    }

    @Override // com.applovin.impl.j8
    public void a(long j, long j2) {
        this.k = 0;
        this.m = androidx.media3.common.C.TIME_UNSET;
        this.n = 0L;
        this.p = 0;
        this.t = j2;
        com.applovin.impl.lj ljVar = this.q;
        if (!(ljVar instanceof com.applovin.impl.mb) || ((com.applovin.impl.mb) ljVar).c(j2)) {
            return;
        }
        this.s = true;
        this.j = this.g;
    }

    @Override // com.applovin.impl.j8
    public boolean a(com.applovin.impl.k8 k8Var) {
        return b(k8Var, true);
    }
}
