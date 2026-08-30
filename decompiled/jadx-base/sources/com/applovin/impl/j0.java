package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 implements com.applovin.impl.j8 {
    public static final com.applovin.impl.n8 m = new com.applovin.impl.n8() { // from class: com.applovin.impl.j0$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.n8
        public final com.applovin.impl.j8[] a() {
            return com.applovin.impl.j0.b();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f901a;
    private final com.applovin.impl.k0 b;
    private final com.applovin.impl.ah c;
    private final com.applovin.impl.ah d;
    private final com.applovin.impl.zg e;
    private com.applovin.impl.l8 f;
    private long g;
    private long h;
    private int i;
    private boolean j;
    private boolean k;
    private boolean l;

    @Override // com.applovin.impl.j8
    public void a() {
    }

    public j0() {
        this(0);
    }

    public j0(int i) {
        this.f901a = (i & 2) != 0 ? i | 1 : i;
        this.b = new com.applovin.impl.k0(true);
        this.c = new com.applovin.impl.ah(2048);
        this.i = -1;
        this.h = -1L;
        com.applovin.impl.ah ahVar = new com.applovin.impl.ah(10);
        this.d = ahVar;
        this.e = new com.applovin.impl.zg(ahVar.c());
    }

    private int c(com.applovin.impl.k8 k8Var) {
        int i = 0;
        while (true) {
            k8Var.c(this.d.c(), 0, 10);
            this.d.f(0);
            if (this.d.z() != 4801587) {
                break;
            }
            this.d.g(3);
            int iV = this.d.v();
            i += iV + 10;
            k8Var.c(iV);
        }
        k8Var.b();
        k8Var.c(i);
        if (this.h == -1) {
            this.h = i;
        }
        return i;
    }

    private void b(com.applovin.impl.k8 k8Var) throws com.applovin.impl.ch {
        if (this.j) {
            return;
        }
        this.i = -1;
        k8Var.b();
        long j = 0;
        if (k8Var.f() == 0) {
            c(k8Var);
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            try {
                if (k8Var.b(this.d.c(), 0, 2, true)) {
                    this.d.f(0);
                    if (!com.applovin.impl.k0.a(this.d.C())) {
                        break;
                    }
                    if (k8Var.b(this.d.c(), 0, 4, true)) {
                        this.e.c(14);
                        int iA = this.e.a(13);
                        if (iA > 6) {
                            j += (long) iA;
                            i2++;
                            if (i2 != 1000 && k8Var.a(iA - 6, true)) {
                            }
                        } else {
                            this.j = true;
                            throw com.applovin.impl.ch.a("Malformed ADTS stream", null);
                        }
                    }
                }
            } catch (java.io.EOFException unused) {
            }
            i = i2;
            break;
        }
        k8Var.b();
        if (i > 0) {
            this.i = (int) (j / ((long) i));
        } else {
            this.i = -1;
        }
        this.j = true;
    }

    private static int a(int i, long j) {
        return (int) ((((long) (i * 8)) * 1000000) / j);
    }

    private void b(long j, boolean z) {
        if (this.l) {
            return;
        }
        boolean z2 = (this.f901a & 1) != 0 && this.i > 0;
        if (z2 && this.b.d() == androidx.media3.common.C.TIME_UNSET && !z) {
            return;
        }
        if (z2 && this.b.d() != androidx.media3.common.C.TIME_UNSET) {
            this.f.a(a(j, (this.f901a & 2) != 0));
        } else {
            this.f.a(new com.applovin.impl.ij.b(androidx.media3.common.C.TIME_UNSET));
        }
        this.l = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.applovin.impl.j8[] b() {
        return new com.applovin.impl.j8[]{new com.applovin.impl.j0()};
    }

    private com.applovin.impl.ij a(long j, boolean z) {
        return new com.applovin.impl.o4(j, this.h, a(this.i, this.b.d()), this.i, z);
    }

    @Override // com.applovin.impl.j8
    public void a(com.applovin.impl.l8 l8Var) {
        this.f = l8Var;
        this.b.a(l8Var, new com.applovin.impl.dp.d(0, 1));
        l8Var.c();
    }

    @Override // com.applovin.impl.j8
    public int a(com.applovin.impl.k8 k8Var, com.applovin.impl.th thVar) throws com.applovin.impl.ch {
        com.applovin.impl.b1.b(this.f);
        long jA = k8Var.a();
        int i = this.f901a;
        if ((i & 2) != 0 || ((i & 1) != 0 && jA != -1)) {
            b(k8Var);
        }
        int iA = k8Var.a(this.c.c(), 0, 2048);
        boolean z = iA == -1;
        b(jA, z);
        if (z) {
            return -1;
        }
        this.c.f(0);
        this.c.e(iA);
        if (!this.k) {
            this.b.a(this.g, 4);
            this.k = true;
        }
        this.b.a(this.c);
        return 0;
    }

    @Override // com.applovin.impl.j8
    public void a(long j, long j2) {
        this.k = false;
        this.b.a();
        this.g = j2;
    }

    @Override // com.applovin.impl.j8
    public boolean a(com.applovin.impl.k8 k8Var) {
        int iC = c(k8Var);
        int i = iC;
        int i2 = 0;
        int i3 = 0;
        do {
            k8Var.c(this.d.c(), 0, 2);
            this.d.f(0);
            if (com.applovin.impl.k0.a(this.d.C())) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                k8Var.c(this.d.c(), 0, 4);
                this.e.c(14);
                int iA = this.e.a(13);
                if (iA <= 6) {
                    i++;
                    k8Var.b();
                    k8Var.c(i);
                } else {
                    k8Var.c(iA - 6);
                    i3 += iA;
                }
            } else {
                i++;
                k8Var.b();
                k8Var.c(i);
            }
            i2 = 0;
            i3 = 0;
        } while (i - iC < 8192);
        return false;
    }
}
