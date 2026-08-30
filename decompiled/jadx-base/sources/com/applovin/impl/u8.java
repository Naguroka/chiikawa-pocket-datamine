package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class u8 implements com.applovin.impl.j8 {
    public static final com.applovin.impl.n8 o = new com.applovin.impl.n8() { // from class: com.applovin.impl.u8$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.n8
        public final com.applovin.impl.j8[] a() {
            return com.applovin.impl.u8.b();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f1388a;
    private final com.applovin.impl.ah b;
    private final boolean c;
    private final com.applovin.impl.v8.a d;
    private com.applovin.impl.l8 e;
    private com.applovin.impl.qo f;
    private int g;
    private com.applovin.impl.af h;
    private com.applovin.impl.z8 i;
    private int j;
    private int k;
    private com.applovin.impl.t8 l;
    private int m;
    private long n;

    @Override // com.applovin.impl.j8
    public void a() {
    }

    public u8() {
        this(0);
    }

    private void d(com.applovin.impl.k8 k8Var) {
        this.h = com.applovin.impl.w8.b(k8Var, !this.c);
        this.g = 1;
    }

    private void c(com.applovin.impl.k8 k8Var) {
        byte[] bArr = this.f1388a;
        k8Var.c(bArr, 0, bArr.length);
        k8Var.b();
        this.g = 2;
    }

    private void f(com.applovin.impl.k8 k8Var) throws com.applovin.impl.ch {
        com.applovin.impl.w8.d(k8Var);
        this.g = 3;
    }

    private void e(com.applovin.impl.k8 k8Var) {
        com.applovin.impl.w8.a aVar = new com.applovin.impl.w8.a(this.i);
        boolean zA = false;
        while (!zA) {
            zA = com.applovin.impl.w8.a(k8Var, aVar);
            this.i = (com.applovin.impl.z8) com.applovin.impl.xp.a(aVar.f1458a);
        }
        com.applovin.impl.b1.a(this.i);
        this.j = java.lang.Math.max(this.i.c, 6);
        ((com.applovin.impl.qo) com.applovin.impl.xp.a(this.f)).a(this.i.a(this.f1388a, this.h));
        this.g = 4;
    }

    private void b(com.applovin.impl.k8 k8Var) {
        this.k = com.applovin.impl.w8.b(k8Var);
        ((com.applovin.impl.l8) com.applovin.impl.xp.a(this.e)).a(b(k8Var.f(), k8Var.a()));
        this.g = 5;
    }

    public u8(int i) {
        this.f1388a = new byte[42];
        this.b = new com.applovin.impl.ah(new byte[32768], 0);
        this.c = (i & 1) != 0;
        this.d = new com.applovin.impl.v8.a();
        this.g = 0;
    }

    private long a(com.applovin.impl.ah ahVar, boolean z) {
        boolean zA;
        com.applovin.impl.b1.a(this.i);
        int iD = ahVar.d();
        while (iD <= ahVar.e() - 16) {
            ahVar.f(iD);
            if (com.applovin.impl.v8.a(ahVar, this.i, this.k, this.d)) {
                ahVar.f(iD);
                return this.d.f1423a;
            }
            iD++;
        }
        if (z) {
            while (iD <= ahVar.e() - this.j) {
                ahVar.f(iD);
                try {
                    zA = com.applovin.impl.v8.a(ahVar, this.i, this.k, this.d);
                } catch (java.lang.IndexOutOfBoundsException unused) {
                    zA = false;
                }
                if (ahVar.d() <= ahVar.e() && zA) {
                    ahVar.f(iD);
                    return this.d.f1423a;
                }
                iD++;
            }
            ahVar.f(ahVar.e());
            return -1L;
        }
        ahVar.f(iD);
        return -1L;
    }

    @Override // com.applovin.impl.j8
    public void a(com.applovin.impl.l8 l8Var) {
        this.e = l8Var;
        this.f = l8Var.a(0, 1);
        l8Var.c();
    }

    private com.applovin.impl.ij b(long j, long j2) {
        com.applovin.impl.b1.a(this.i);
        com.applovin.impl.z8 z8Var = this.i;
        if (z8Var.k != null) {
            return new com.applovin.impl.y8(z8Var, j);
        }
        if (j2 != -1 && z8Var.j > 0) {
            com.applovin.impl.t8 t8Var = new com.applovin.impl.t8(z8Var, this.k, j, j2);
            this.l = t8Var;
            return t8Var.a();
        }
        return new com.applovin.impl.ij.b(z8Var.b());
    }

    private void c() {
        ((com.applovin.impl.qo) com.applovin.impl.xp.a(this.f)).a((this.n * 1000000) / ((long) ((com.applovin.impl.z8) com.applovin.impl.xp.a(this.i)).e), 1, this.m, 0, null);
    }

    @Override // com.applovin.impl.j8
    public int a(com.applovin.impl.k8 k8Var, com.applovin.impl.th thVar) throws com.applovin.impl.ch {
        int i = this.g;
        if (i == 0) {
            d(k8Var);
            return 0;
        }
        if (i == 1) {
            c(k8Var);
            return 0;
        }
        if (i == 2) {
            f(k8Var);
            return 0;
        }
        if (i == 3) {
            e(k8Var);
            return 0;
        }
        if (i == 4) {
            b(k8Var);
            return 0;
        }
        if (i != 5) {
            throw new java.lang.IllegalStateException();
        }
        return b(k8Var, thVar);
    }

    private int b(com.applovin.impl.k8 k8Var, com.applovin.impl.th thVar) {
        boolean z;
        com.applovin.impl.b1.a(this.f);
        com.applovin.impl.b1.a(this.i);
        com.applovin.impl.t8 t8Var = this.l;
        if (t8Var != null && t8Var.b()) {
            return this.l.a(k8Var, thVar);
        }
        if (this.n == -1) {
            this.n = com.applovin.impl.v8.a(k8Var, this.i);
            return 0;
        }
        int iE = this.b.e();
        if (iE < 32768) {
            int iA = k8Var.a(this.b.c(), iE, 32768 - iE);
            z = iA == -1;
            if (!z) {
                this.b.e(iE + iA);
            } else if (this.b.a() == 0) {
                c();
                return -1;
            }
        } else {
            z = false;
        }
        int iD = this.b.d();
        int i = this.m;
        int i2 = this.j;
        if (i < i2) {
            com.applovin.impl.ah ahVar = this.b;
            ahVar.g(java.lang.Math.min(i2 - i, ahVar.a()));
        }
        long jA = a(this.b, z);
        int iD2 = this.b.d() - iD;
        this.b.f(iD);
        this.f.a(this.b, iD2);
        this.m += iD2;
        if (jA != -1) {
            c();
            this.m = 0;
            this.n = jA;
        }
        if (this.b.a() < 16) {
            int iA2 = this.b.a();
            java.lang.System.arraycopy(this.b.c(), this.b.d(), this.b.c(), 0, iA2);
            this.b.f(0);
            this.b.e(iA2);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.applovin.impl.j8[] b() {
        return new com.applovin.impl.j8[]{new com.applovin.impl.u8()};
    }

    @Override // com.applovin.impl.j8
    public void a(long j, long j2) {
        if (j == 0) {
            this.g = 0;
        } else {
            com.applovin.impl.t8 t8Var = this.l;
            if (t8Var != null) {
                t8Var.b(j2);
            }
        }
        this.n = j2 != 0 ? -1L : 0L;
        this.m = 0;
        this.b.d(0);
    }

    @Override // com.applovin.impl.j8
    public boolean a(com.applovin.impl.k8 k8Var) {
        com.applovin.impl.w8.a(k8Var, false);
        return com.applovin.impl.w8.a(k8Var);
    }
}
