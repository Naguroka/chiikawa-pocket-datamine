package com.five_corp.ad.internal.movie.partialcache;

/* JADX INFO: loaded from: classes4.dex */
public final class p1 implements com.five_corp.ad.internal.movie.partialcache.w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.movie.partialcache.u1 f2018a;

    public p1(com.five_corp.ad.internal.movie.partialcache.u1 u1Var) {
        this.f2018a = u1Var;
    }

    @Override // com.five_corp.ad.internal.movie.partialcache.w1
    public final void a(java.lang.Object obj) {
        com.five_corp.ad.internal.util.g gVar;
        com.five_corp.ad.internal.movie.partialcache.v1 v1Var = (com.five_corp.ad.internal.movie.partialcache.v1) obj;
        com.five_corp.ad.internal.movie.partialcache.u1 u1Var = this.f2018a;
        v1Var.c = new com.five_corp.ad.internal.movie.partialcache.m1(u1Var.f2023a);
        v1Var.b = new com.five_corp.ad.internal.util.c();
        com.five_corp.ad.internal.cache.o oVar = u1Var.b;
        com.five_corp.ad.internal.context.l lVar = u1Var.c;
        com.five_corp.ad.internal.http.movcache.h hVar = u1Var.d;
        com.five_corp.ad.internal.movie.partialcache.C1467f c1467f = new com.five_corp.ad.internal.movie.partialcache.C1467f(oVar, lVar, u1Var, hVar);
        v1Var.f2024a = c1467f;
        if (oVar.d()) {
            com.five_corp.ad.internal.util.f fVarB = oVar.b();
            if (fVarB.f2085a) {
                java.lang.Integer num = (java.lang.Integer) fVarB.c;
                int iIntValue = num.intValue();
                if (iIntValue < 0) {
                    com.five_corp.ad.internal.t tVar = com.five_corp.ad.internal.t.t3;
                    java.util.Locale locale = java.util.Locale.US;
                    gVar = new com.five_corp.ad.internal.util.g(false, new com.five_corp.ad.internal.s(tVar, "Ots: " + lVar.b.c + ", Requested offset: 0, Downloaded file size: " + num, null, null));
                } else {
                    synchronized (c1467f.f2003a) {
                        c1467f.g = true;
                        c1467f.h = 0;
                        c1467f.i = iIntValue;
                    }
                    u1Var.a(new com.five_corp.ad.internal.movie.partialcache.q1());
                    gVar = new com.five_corp.ad.internal.util.g(true, null);
                }
            } else {
                gVar = new com.five_corp.ad.internal.util.g(false, fVarB.b);
            }
        } else {
            synchronized (c1467f.f2003a) {
                c1467f.h = 0;
            }
            hVar.f1931a.post(new com.five_corp.ad.internal.http.movcache.c(hVar, lVar, c1467f));
            gVar = new com.five_corp.ad.internal.util.g(true, null);
        }
        if (gVar.f2085a) {
            return;
        }
        com.five_corp.ad.internal.s sVar = gVar.b;
        if (v1Var.d == 3) {
            return;
        }
        v1Var.d = 3;
        u1Var.e.a(sVar);
    }
}
