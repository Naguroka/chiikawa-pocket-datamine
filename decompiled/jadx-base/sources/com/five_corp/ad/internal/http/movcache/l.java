package com.five_corp.ad.internal.http.movcache;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements com.five_corp.ad.internal.http.movcache.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.five_corp.ad.internal.http.a f1933a;
    public final java.lang.ref.WeakReference b;

    public l(com.five_corp.ad.internal.context.l lVar, com.five_corp.ad.internal.http.movcache.k kVar) {
        this.f1933a = com.five_corp.ad.internal.http.a.a(lVar);
        this.b = new java.lang.ref.WeakReference(kVar);
    }

    @Override // com.five_corp.ad.internal.http.movcache.i
    public final int a() {
        return this.f1933a.c;
    }

    @Override // com.five_corp.ad.internal.http.movcache.i
    public final void b() {
        com.five_corp.ad.internal.http.movcache.k kVar = (com.five_corp.ad.internal.http.movcache.k) this.b.get();
        if (kVar != null) {
            com.five_corp.ad.internal.movie.partialcache.C1467f c1467f = (com.five_corp.ad.internal.movie.partialcache.C1467f) kVar;
            synchronized (c1467f.f2003a) {
                c1467f.g = true;
                if (c1467f.h == c1467f.i) {
                    c1467f.k = true;
                }
            }
        }
    }

    @Override // com.five_corp.ad.internal.http.movcache.i
    public final void c() {
        com.five_corp.ad.internal.http.movcache.k kVar = (com.five_corp.ad.internal.http.movcache.k) this.b.get();
        if (kVar != null) {
            com.five_corp.ad.internal.movie.partialcache.C1467f c1467f = (com.five_corp.ad.internal.movie.partialcache.C1467f) kVar;
            synchronized (c1467f.f2003a) {
                c1467f.l = true;
            }
        }
    }

    @Override // com.five_corp.ad.internal.http.movcache.i
    public final boolean d() {
        com.five_corp.ad.internal.http.a aVar = this.f1933a;
        com.five_corp.ad.internal.context.l lVar = (com.five_corp.ad.internal.context.l) aVar.b.get();
        com.five_corp.ad.internal.ad.a aVar2 = lVar != null ? lVar.b : (com.five_corp.ad.internal.ad.a) aVar.f1906a.get();
        if (aVar2 == null || !this.f1933a.a()) {
            return false;
        }
        return !aVar2.b();
    }

    @Override // com.five_corp.ad.internal.http.movcache.i
    public final boolean e() {
        return this.f1933a.a();
    }

    @Override // com.five_corp.ad.internal.http.movcache.i
    public final boolean a(int i) {
        boolean z;
        com.five_corp.ad.internal.http.movcache.k kVar = (com.five_corp.ad.internal.http.movcache.k) this.b.get();
        if (kVar == null) {
            return false;
        }
        com.five_corp.ad.internal.movie.partialcache.C1467f c1467f = (com.five_corp.ad.internal.movie.partialcache.C1467f) kVar;
        synchronized (c1467f.f2003a) {
            z = c1467f.f;
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:25:0x00db  */
    @Override // com.five_corp.ad.internal.http.movcache.i
    public final void a(byte[] bArr, int i, int i2, int i3) {
        com.five_corp.ad.internal.s sVar;
        com.five_corp.ad.internal.http.movcache.k kVar = (com.five_corp.ad.internal.http.movcache.k) this.b.get();
        if (kVar != null) {
            com.five_corp.ad.internal.movie.partialcache.C1467f c1467f = (com.five_corp.ad.internal.movie.partialcache.C1467f) kVar;
            synchronized (c1467f.f2003a) {
                com.five_corp.ad.internal.s sVar2 = null;
                try {
                    if (i2 < 0) {
                        com.five_corp.ad.internal.t tVar = com.five_corp.ad.internal.t.v3;
                        java.util.Locale locale = java.util.Locale.US;
                        sVar = new com.five_corp.ad.internal.s(tVar, "Ots: " + c1467f.c.b.c + ", Downloaded file size: " + c1467f.i + ", offsetFromStartByteInclusive: " + i + ", size: " + i2 + ", offsetFromResourceFileHead: " + i3, null, null);
                    } else {
                        int i4 = c1467f.i;
                        if (i4 > i3) {
                            com.five_corp.ad.internal.t tVar2 = com.five_corp.ad.internal.t.r3;
                            java.util.Locale locale2 = java.util.Locale.US;
                            sVar = new com.five_corp.ad.internal.s(tVar2, "Ots: " + c1467f.c.b.c + ", Downloaded file size: " + i4 + ", Received data offset: " + i3, null, null);
                        } else {
                            if (c1467f.f && !c1467f.j) {
                                int i5 = c1467f.h;
                                if (i5 != i3) {
                                    com.five_corp.ad.internal.t tVar3 = com.five_corp.ad.internal.t.s3;
                                    java.util.Locale locale3 = java.util.Locale.US;
                                    sVar2 = new com.five_corp.ad.internal.s(tVar3, "Ots: " + c1467f.c.b.c + ", Current offset: " + i5 + ", Received data offset: " + i3, null, null);
                                } else {
                                    int i6 = i3 + i2;
                                    c1467f.i = i6;
                                    c1467f.h = i6;
                                }
                            }
                            c1467f.i = i3 + i2;
                            return;
                        }
                        if (sVar2 != null) {
                            com.five_corp.ad.internal.movie.partialcache.u1 u1Var = (com.five_corp.ad.internal.movie.partialcache.u1) c1467f.d;
                            u1Var.getClass();
                            u1Var.b(new com.five_corp.ad.internal.movie.partialcache.s1(u1Var, sVar2));
                        } else {
                            com.five_corp.ad.internal.movie.partialcache.u1 u1Var2 = (com.five_corp.ad.internal.movie.partialcache.u1) c1467f.d;
                            u1Var2.getClass();
                            u1Var2.a(new com.five_corp.ad.internal.movie.partialcache.r1(u1Var2, c1467f, i2, i, i3, bArr));
                        }
                    }
                    sVar2 = sVar;
                    if (sVar2 != null) {
                        com.five_corp.ad.internal.movie.partialcache.u1 u1Var3 = (com.five_corp.ad.internal.movie.partialcache.u1) c1467f.d;
                        u1Var3.getClass();
                        u1Var3.b(new com.five_corp.ad.internal.movie.partialcache.s1(u1Var3, sVar2));
                    } else {
                        com.five_corp.ad.internal.movie.partialcache.u1 u1Var4 = (com.five_corp.ad.internal.movie.partialcache.u1) c1467f.d;
                        u1Var4.getClass();
                        u1Var4.a(new com.five_corp.ad.internal.movie.partialcache.r1(u1Var4, c1467f, i2, i, i3, bArr));
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.five_corp.ad.internal.http.movcache.i
    public final void a(int i, boolean z, com.five_corp.ad.internal.http.movcache.m mVar, boolean z2) {
        int i2;
        com.five_corp.ad.internal.http.movcache.k kVar = (com.five_corp.ad.internal.http.movcache.k) this.b.get();
        if (kVar != null) {
            com.five_corp.ad.internal.movie.partialcache.C1467f c1467f = (com.five_corp.ad.internal.movie.partialcache.C1467f) kVar;
            synchronized (c1467f.f2003a) {
                i2 = c1467f.h;
                c1467f.g = z;
                c1467f.i = i;
                c1467f.l = z2;
                c1467f.m = mVar;
            }
            if (z && i2 > i) {
                com.five_corp.ad.internal.movie.partialcache.InterfaceC1463d interfaceC1463d = c1467f.d;
                com.five_corp.ad.internal.t tVar = com.five_corp.ad.internal.t.u3;
                java.util.Locale locale = java.util.Locale.US;
                com.five_corp.ad.internal.s sVar = new com.five_corp.ad.internal.s(tVar, "Ots: " + c1467f.c.b.c + ", Requested offset: " + i2 + ", Downloaded file size: " + i, null, null);
                com.five_corp.ad.internal.movie.partialcache.u1 u1Var = (com.five_corp.ad.internal.movie.partialcache.u1) interfaceC1463d;
                u1Var.getClass();
                u1Var.b(new com.five_corp.ad.internal.movie.partialcache.s1(u1Var, sVar));
                return;
            }
            ((com.five_corp.ad.internal.movie.partialcache.u1) c1467f.d).a(new com.five_corp.ad.internal.movie.partialcache.q1());
        }
    }
}
