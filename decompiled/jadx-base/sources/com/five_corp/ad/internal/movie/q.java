package com.five_corp.ad.internal.movie;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements com.five_corp.ad.internal.movie.partialcache.w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.movie.x f2033a;

    public q(com.five_corp.ad.internal.movie.x xVar) {
        this.f2033a = xVar;
    }

    @Override // com.five_corp.ad.internal.movie.partialcache.w1
    public final void a(java.lang.Object obj) {
        com.five_corp.ad.internal.movie.partialcache.C1459b c1459b = (com.five_corp.ad.internal.movie.partialcache.C1459b) obj;
        com.five_corp.ad.internal.movie.x xVar = this.f2033a;
        xVar.getClass();
        try {
            c1459b.b = 0L;
            xVar.n.removeCallbacksAndMessages(null);
            xVar.o = 1;
            xVar.h.a();
            com.five_corp.ad.internal.movie.partialcache.audio.c cVar = xVar.i;
            switch (com.five_corp.ad.e.a(cVar.d)) {
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    c1459b.c.b();
                    c1459b.c = null;
                    cVar.d = 1;
                    break;
            }
            xVar.k.getClass();
            com.five_corp.ad.internal.movie.partialcache.video.f fVar = c1459b.e;
            if (fVar != null) {
                fVar.a();
                c1459b.e = null;
            }
            com.five_corp.ad.internal.movie.partialcache.u1 u1Var = xVar.g;
            if (u1Var.g != null) {
                u1Var.b(new com.five_corp.ad.internal.movie.partialcache.t1(u1Var));
            }
            xVar.j.a();
            xVar.l.a();
        } catch (java.lang.Throwable th) {
            xVar.a(new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.w0, null, th, null));
        }
        this.f2033a.prepare();
    }
}
