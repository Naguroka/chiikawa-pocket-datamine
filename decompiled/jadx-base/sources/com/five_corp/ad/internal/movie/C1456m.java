package com.five_corp.ad.internal.movie;

/* JADX INFO: renamed from: com.five_corp.ad.internal.movie.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1456m implements com.five_corp.ad.internal.movie.partialcache.w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.movie.x f1981a;

    public C1456m(com.five_corp.ad.internal.movie.x xVar) {
        this.f1981a = xVar;
    }

    @Override // com.five_corp.ad.internal.movie.partialcache.w1
    public final void a(java.lang.Object obj) {
        com.five_corp.ad.internal.movie.partialcache.C1459b c1459b = (com.five_corp.ad.internal.movie.partialcache.C1459b) obj;
        com.five_corp.ad.internal.movie.x xVar = this.f1981a;
        int i = xVar.o;
        if (i == 4) {
            xVar.k.getClass();
            com.five_corp.ad.internal.movie.partialcache.video.d.a(c1459b);
            com.five_corp.ad.internal.movie.x xVar2 = this.f1981a;
            xVar2.o = 5;
            com.five_corp.ad.internal.view.D d = xVar2.e;
            d.e.post(new com.five_corp.ad.internal.view.w(d));
            com.five_corp.ad.internal.movie.x xVar3 = this.f1981a;
            xVar3.f2039a.post(new com.five_corp.ad.internal.movie.RunnableC1444a(xVar3));
            return;
        }
        if (i == 7) {
            xVar.o = 8;
            com.five_corp.ad.internal.movie.partialcache.audio.c cVar = xVar.i;
            int iA = com.five_corp.ad.e.a(cVar.d);
            if (iA == 0) {
                cVar.d = 2;
                com.five_corp.ad.internal.movie.x xVar4 = cVar.c;
                xVar4.getClass();
                xVar4.n.post(new com.five_corp.ad.internal.movie.RunnableC1455l(xVar4, new com.five_corp.ad.internal.movie.n(xVar4)));
                return;
            }
            if (iA != 2) {
                if (iA != 6) {
                    return;
                }
                cVar.d = 8;
                com.five_corp.ad.internal.movie.x xVar5 = cVar.c;
                xVar5.getClass();
                xVar5.n.post(new com.five_corp.ad.internal.movie.RunnableC1455l(xVar5, new com.five_corp.ad.internal.movie.n(xVar5)));
                return;
            }
            cVar.d = 4;
            long jB = c1459b.d.b(c1459b.b);
            com.five_corp.ad.internal.movie.partialcache.C1471h c1471h = cVar.c.h;
            c1471h.c = true;
            c1471h.d = jB;
            c1471h.e = 0L;
            c1471h.b = true;
            c1459b.c.a();
        }
    }
}
