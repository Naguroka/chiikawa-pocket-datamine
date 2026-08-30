package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class xb implements com.applovin.impl.j8 {
    private com.applovin.impl.l8 b;
    private int c;
    private int d;
    private int e;
    private com.applovin.impl.mf g;
    private com.applovin.impl.k8 h;
    private com.applovin.impl.dl i;
    private com.applovin.impl.of j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.ah f1499a = new com.applovin.impl.ah(6);
    private long f = -1;

    private int c(com.applovin.impl.k8 k8Var) {
        this.f1499a.d(2);
        k8Var.c(this.f1499a.c(), 0, 2);
        return this.f1499a.C();
    }

    private void b(com.applovin.impl.k8 k8Var) {
        this.f1499a.d(2);
        k8Var.c(this.f1499a.c(), 0, 2);
        k8Var.c(this.f1499a.C() - 2);
    }

    private void d(com.applovin.impl.k8 k8Var) {
        this.f1499a.d(2);
        k8Var.d(this.f1499a.c(), 0, 2);
        int iC = this.f1499a.C();
        this.d = iC;
        if (iC == 65498) {
            if (this.f != -1) {
                this.c = 4;
                return;
            } else {
                b();
                return;
            }
        }
        if ((iC < 65488 || iC > 65497) && iC != 65281) {
            this.c = 1;
        }
    }

    private void f(com.applovin.impl.k8 k8Var) {
        this.f1499a.d(2);
        k8Var.d(this.f1499a.c(), 0, 2);
        this.e = this.f1499a.C() - 2;
        this.c = 2;
    }

    private void e(com.applovin.impl.k8 k8Var) {
        java.lang.String strT;
        if (this.d == 65505) {
            com.applovin.impl.ah ahVar = new com.applovin.impl.ah(this.e);
            k8Var.d(ahVar.c(), 0, this.e);
            if (this.g == null && "http://ns.adobe.com/xap/1.0/".equals(ahVar.t()) && (strT = ahVar.t()) != null) {
                com.applovin.impl.mf mfVarA = a(strT, k8Var.a());
                this.g = mfVarA;
                if (mfVarA != null) {
                    this.f = mfVarA.d;
                }
            }
        } else {
            k8Var.a(this.e);
        }
        this.c = 0;
    }

    private void g(com.applovin.impl.k8 k8Var) {
        if (!k8Var.b(this.f1499a.c(), 0, 1, true)) {
            b();
            return;
        }
        k8Var.b();
        if (this.j == null) {
            this.j = new com.applovin.impl.of();
        }
        com.applovin.impl.dl dlVar = new com.applovin.impl.dl(k8Var, this.f);
        this.i = dlVar;
        if (this.j.a(dlVar)) {
            this.j.a(new com.applovin.impl.el(this.f, (com.applovin.impl.l8) com.applovin.impl.b1.a(this.b)));
            c();
        } else {
            b();
        }
    }

    private static com.applovin.impl.mf a(java.lang.String str, long j) {
        com.applovin.impl.lf lfVarA;
        if (j == -1 || (lfVarA = com.applovin.impl.hs.a(str)) == null) {
            return null;
        }
        return lfVarA.a(j);
    }

    @Override // com.applovin.impl.j8
    public void a(com.applovin.impl.l8 l8Var) {
        this.b = l8Var;
    }

    private void c() {
        a((com.applovin.impl.af.b) com.applovin.impl.b1.a(this.g));
        this.c = 5;
    }

    private void b() {
        a(new com.applovin.impl.af.b[0]);
        ((com.applovin.impl.l8) com.applovin.impl.b1.a(this.b)).c();
        this.b.a(new com.applovin.impl.ij.b(androidx.media3.common.C.TIME_UNSET));
        this.c = 6;
    }

    private void a(com.applovin.impl.af.b... bVarArr) {
        ((com.applovin.impl.l8) com.applovin.impl.b1.a(this.b)).a(1024, 4).a(new com.applovin.impl.e9.b().b(androidx.media3.common.MimeTypes.IMAGE_JPEG).a(new com.applovin.impl.af(bVarArr)).a());
    }

    @Override // com.applovin.impl.j8
    public int a(com.applovin.impl.k8 k8Var, com.applovin.impl.th thVar) {
        int i = this.c;
        if (i == 0) {
            d(k8Var);
            return 0;
        }
        if (i == 1) {
            f(k8Var);
            return 0;
        }
        if (i == 2) {
            e(k8Var);
            return 0;
        }
        if (i == 4) {
            long jF = k8Var.f();
            long j = this.f;
            if (jF != j) {
                thVar.f1364a = j;
                return 1;
            }
            g(k8Var);
            return 0;
        }
        if (i != 5) {
            if (i == 6) {
                return -1;
            }
            throw new java.lang.IllegalStateException();
        }
        if (this.i == null || k8Var != this.h) {
            this.h = k8Var;
            this.i = new com.applovin.impl.dl(k8Var, this.f);
        }
        int iA = ((com.applovin.impl.of) com.applovin.impl.b1.a(this.j)).a(this.i, thVar);
        if (iA == 1) {
            thVar.f1364a += this.f;
        }
        return iA;
    }

    @Override // com.applovin.impl.j8
    public void a() {
        com.applovin.impl.of ofVar = this.j;
        if (ofVar != null) {
            ofVar.a();
        }
    }

    @Override // com.applovin.impl.j8
    public void a(long j, long j2) {
        if (j == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            ((com.applovin.impl.of) com.applovin.impl.b1.a(this.j)).a(j, j2);
        }
    }

    @Override // com.applovin.impl.j8
    public boolean a(com.applovin.impl.k8 k8Var) {
        if (c(k8Var) != 65496) {
            return false;
        }
        int iC = c(k8Var);
        this.d = iC;
        if (iC == 65504) {
            b(k8Var);
            this.d = c(k8Var);
        }
        if (this.d != 65505) {
            return false;
        }
        k8Var.c(2);
        this.f1499a.d(6);
        k8Var.c(this.f1499a.c(), 0, 6);
        return this.f1499a.y() == 1165519206 && this.f1499a.C() == 0;
    }
}
