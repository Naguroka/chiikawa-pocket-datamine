package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class q2 implements com.applovin.impl.zh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.n8 f1171a;
    private com.applovin.impl.j8 b;
    private com.applovin.impl.k8 c;

    public q2(com.applovin.impl.n8 n8Var) {
        this.f1171a = n8Var;
    }

    @Override // com.applovin.impl.zh
    public void a(com.applovin.impl.f5 f5Var, android.net.Uri uri, java.util.Map map, long j, long j2, com.applovin.impl.l8 l8Var) throws com.applovin.impl.rp {
        com.applovin.impl.a6 a6Var = new com.applovin.impl.a6(f5Var, j, j2);
        this.c = a6Var;
        if (this.b != null) {
            return;
        }
        com.applovin.impl.j8[] j8VarArrA = this.f1171a.a(uri, map);
        if (j8VarArrA.length == 1) {
            this.b = j8VarArrA[0];
        } else {
            for (com.applovin.impl.j8 j8Var : j8VarArrA) {
                try {
                    if (j8Var.a(a6Var)) {
                        this.b = j8Var;
                        com.applovin.impl.b1.b(true);
                        a6Var.b();
                        break;
                    }
                    com.applovin.impl.b1.b(this.b != null || a6Var.f() == j);
                    a6Var.b();
                } catch (java.io.EOFException unused) {
                    com.applovin.impl.b1.b(this.b != null || a6Var.f() == j);
                    a6Var.b();
                } catch (java.lang.Throwable th) {
                    com.applovin.impl.b1.b(this.b != null || a6Var.f() == j);
                    a6Var.b();
                    throw th;
                }
            }
            if (this.b == null) {
                throw new com.applovin.impl.rp("None of the available extractors (" + com.applovin.impl.xp.b(j8VarArrA) + ") could read the stream.", (android.net.Uri) com.applovin.impl.b1.a(uri));
            }
        }
        this.b.a(l8Var);
    }

    @Override // com.applovin.impl.zh
    public void c() {
        com.applovin.impl.j8 j8Var = this.b;
        if (j8Var instanceof com.applovin.impl.nf) {
            ((com.applovin.impl.nf) j8Var).c();
        }
    }

    @Override // com.applovin.impl.zh
    public long b() {
        com.applovin.impl.k8 k8Var = this.c;
        if (k8Var != null) {
            return k8Var.f();
        }
        return -1L;
    }

    @Override // com.applovin.impl.zh
    public int a(com.applovin.impl.th thVar) {
        return ((com.applovin.impl.j8) com.applovin.impl.b1.a(this.b)).a((com.applovin.impl.k8) com.applovin.impl.b1.a(this.c), thVar);
    }

    @Override // com.applovin.impl.zh
    public void a() {
        com.applovin.impl.j8 j8Var = this.b;
        if (j8Var != null) {
            j8Var.a();
            this.b = null;
        }
        this.c = null;
    }

    @Override // com.applovin.impl.zh
    public void a(long j, long j2) {
        ((com.applovin.impl.j8) com.applovin.impl.b1.a(this.b)).a(j, j2);
    }
}
