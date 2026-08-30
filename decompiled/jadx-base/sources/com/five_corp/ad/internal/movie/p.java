package com.five_corp.ad.internal.movie;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements com.five_corp.ad.internal.movie.partialcache.w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.movie.x f1984a;

    public p(com.five_corp.ad.internal.movie.x xVar) {
        this.f1984a = xVar;
    }

    @Override // com.five_corp.ad.internal.movie.partialcache.w1
    public final void a(java.lang.Object obj) {
        com.five_corp.ad.internal.movie.x xVar = this.f1984a;
        int i = xVar.o;
        if (i != 1) {
            com.five_corp.ad.internal.movie.w.a(i);
            return;
        }
        xVar.o = 2;
        try {
            com.five_corp.ad.internal.movie.partialcache.u1 u1Var = xVar.g;
            if (u1Var.g != null) {
                u1Var.b(new com.five_corp.ad.internal.movie.partialcache.t1(u1Var));
            }
            u1Var.h = new com.five_corp.ad.internal.movie.partialcache.v1();
            u1Var.g = new android.os.Handler(u1Var.f);
            com.five_corp.ad.internal.movie.partialcache.u1 u1Var2 = this.f1984a.g;
            u1Var2.getClass();
            u1Var2.a(new com.five_corp.ad.internal.movie.partialcache.p1(u1Var2));
        } catch (java.lang.Throwable th) {
            this.f1984a.a(new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.v0, null, th, null));
        }
    }
}
