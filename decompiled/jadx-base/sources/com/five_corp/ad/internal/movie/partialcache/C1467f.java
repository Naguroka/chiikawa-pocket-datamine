package com.five_corp.ad.internal.movie.partialcache;

/* JADX INFO: renamed from: com.five_corp.ad.internal.movie.partialcache.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1467f implements com.five_corp.ad.internal.movie.partialcache.InterfaceC1465e, com.five_corp.ad.internal.http.movcache.k, com.five_corp.ad.internal.storage.j {
    public final com.five_corp.ad.internal.cache.o b;
    public final com.five_corp.ad.internal.context.l c;
    public final com.five_corp.ad.internal.movie.partialcache.InterfaceC1463d d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f2003a = new java.lang.Object();
    public com.five_corp.ad.internal.storage.k e = null;
    public boolean f = false;
    public boolean g = false;
    public int h = 0;
    public int i = 0;
    public boolean j = true;
    public boolean k = false;
    public boolean l = false;
    public com.five_corp.ad.internal.http.movcache.m m = null;

    public C1467f(com.five_corp.ad.internal.cache.o oVar, com.five_corp.ad.internal.context.l lVar, com.five_corp.ad.internal.movie.partialcache.u1 u1Var, com.five_corp.ad.internal.http.movcache.h hVar) {
        this.b = oVar;
        this.c = lVar;
        this.d = u1Var;
    }

    public final int a() {
        int iMin;
        synchronized (this.f2003a) {
            iMin = java.lang.Math.min(this.i - this.h, 8192);
        }
        return iMin;
    }

    public final void b() {
        int i;
        int i2;
        synchronized (this.f2003a) {
            if (this.k) {
                return;
            }
            if (this.f) {
                if (!this.g && (i = this.h) >= (i2 = this.i)) {
                    if (i == i2) {
                        this.j = false;
                        return;
                    }
                    com.five_corp.ad.internal.t tVar = com.five_corp.ad.internal.t.q3;
                    java.util.Locale locale = java.util.Locale.US;
                    com.five_corp.ad.internal.s sVar = new com.five_corp.ad.internal.s(tVar, "Ots: " + this.c.b.c + ", Current offset: " + i + ", Downloaded file size: " + this.i, null, null);
                    com.five_corp.ad.internal.movie.partialcache.u1 u1Var = (com.five_corp.ad.internal.movie.partialcache.u1) this.d;
                    u1Var.getClass();
                    u1Var.b(new com.five_corp.ad.internal.movie.partialcache.s1(u1Var, sVar));
                    return;
                }
                this.j = true;
                com.five_corp.ad.internal.storage.k kVar = this.e;
                kVar.d.post(new com.five_corp.ad.internal.storage.g(kVar, a()));
            }
        }
    }

    public final void c() {
        int i;
        int i2;
        synchronized (this.f2003a) {
            if (!this.f && !this.k) {
                boolean z = true;
                this.f = true;
                com.five_corp.ad.internal.s sVar = null;
                if (this.g || (i = this.h) < (i2 = this.i)) {
                    this.j = true;
                    com.five_corp.ad.internal.util.f fVarA = this.b.a(this.h, this);
                    if (fVarA.f2085a) {
                        this.e = (com.five_corp.ad.internal.storage.k) fVarA.c;
                    } else {
                        sVar = fVarA.b;
                    }
                } else if (i == i2) {
                    this.j = false;
                } else {
                    com.five_corp.ad.internal.t tVar = com.five_corp.ad.internal.t.o3;
                    java.util.Locale locale = java.util.Locale.US;
                    sVar = new com.five_corp.ad.internal.s(tVar, "Ots: " + this.c.b.c + ", Current offset: " + i + ", Downloaded file size: " + i2, null, null);
                }
                boolean z2 = this.j;
                if (!this.l || !this.f) {
                    z = false;
                }
                if (z) {
                    this.l = false;
                }
                if (sVar != null) {
                    com.five_corp.ad.internal.movie.partialcache.u1 u1Var = (com.five_corp.ad.internal.movie.partialcache.u1) this.d;
                    u1Var.getClass();
                    u1Var.b(new com.five_corp.ad.internal.movie.partialcache.s1(u1Var, sVar));
                } else {
                    if (z) {
                        this.m.f1934a.k();
                    }
                    if (z2) {
                        b();
                    }
                }
            }
        }
    }

    public final void d() {
        synchronized (this.f2003a) {
            this.f = false;
            com.five_corp.ad.internal.storage.k kVar = this.e;
            if (kVar != null) {
                kVar.d.post(new com.five_corp.ad.internal.storage.i(kVar));
                this.e = null;
            }
        }
    }

    public final void a(com.five_corp.ad.internal.storage.k kVar, byte[] bArr, int i) {
        synchronized (this.f2003a) {
            if (this.e == kVar) {
                int i2 = this.h;
                com.five_corp.ad.internal.s sVar = null;
                if (i < 0) {
                    com.five_corp.ad.internal.t tVar = com.five_corp.ad.internal.t.w3;
                    java.util.Locale locale = java.util.Locale.US;
                    sVar = new com.five_corp.ad.internal.s(tVar, "Ots: " + this.c.b.c + ", Current offset: " + i2 + ", Downloaded file size: " + this.i + ", length: " + i, null, null);
                } else {
                    int i3 = i2 + i;
                    this.h = i3;
                    if (this.g && i2 == this.i) {
                        this.k = true;
                    } else {
                        int i4 = this.i;
                        if (i2 > i4) {
                            com.five_corp.ad.internal.t tVar2 = com.five_corp.ad.internal.t.p3;
                            java.util.Locale locale2 = java.util.Locale.US;
                            sVar = new com.five_corp.ad.internal.s(tVar2, "Ots: " + this.c.b.c + ", Current offset: " + i3 + ", Downloaded file size: " + i4, null, null);
                        }
                    }
                }
                if (sVar != null) {
                    com.five_corp.ad.internal.movie.partialcache.u1 u1Var = (com.five_corp.ad.internal.movie.partialcache.u1) this.d;
                    u1Var.getClass();
                    u1Var.b(new com.five_corp.ad.internal.movie.partialcache.s1(u1Var, sVar));
                } else if (i > 0) {
                    com.five_corp.ad.internal.movie.partialcache.u1 u1Var2 = (com.five_corp.ad.internal.movie.partialcache.u1) this.d;
                    u1Var2.getClass();
                    u1Var2.a(new com.five_corp.ad.internal.movie.partialcache.r1(u1Var2, this, i, 0, i2, bArr));
                }
            }
        }
        b();
    }
}
