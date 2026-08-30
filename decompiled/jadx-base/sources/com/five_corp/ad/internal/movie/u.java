package com.five_corp.ad.internal.movie;

/* JADX INFO: loaded from: classes4.dex */
public final class u implements com.five_corp.ad.internal.movie.partialcache.w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f2037a;
    public final /* synthetic */ com.five_corp.ad.internal.movie.x b;

    public u(com.five_corp.ad.internal.movie.x xVar, long j) {
        this.b = xVar;
        this.f2037a = j;
    }

    @Override // com.five_corp.ad.internal.movie.partialcache.w1
    public final void a(java.lang.Object obj) {
        com.five_corp.ad.internal.movie.partialcache.video.e eVar;
        boolean z;
        com.five_corp.ad.internal.movie.partialcache.video.f fVar;
        com.five_corp.ad.internal.movie.partialcache.C1459b c1459b = (com.five_corp.ad.internal.movie.partialcache.C1459b) obj;
        com.five_corp.ad.internal.movie.x xVar = this.b;
        if (xVar.o != 9) {
            return;
        }
        xVar.a(this.f2037a + xVar.c);
        com.five_corp.ad.internal.movie.x xVar2 = this.b;
        long j = this.f2037a;
        com.five_corp.ad.internal.movie.partialcache.audio.d dVar = xVar2.j;
        boolean z2 = dVar.c;
        if ((z2 && dVar.d && j > dVar.e) || ((z = (eVar = xVar2.l).e) && j > eVar.f)) {
            xVar2.o = 10;
            xVar2.h.a();
            xVar2.i.a(c1459b);
            xVar2.k.getClass();
            com.five_corp.ad.internal.movie.partialcache.video.d.a(c1459b);
            com.five_corp.ad.internal.view.D d = xVar2.e;
            d.e.post(new com.five_corp.ad.internal.view.z(d));
            xVar2.f2039a.post(new com.five_corp.ad.internal.movie.RunnableC1445b(xVar2));
            return;
        }
        if ((z2 && !dVar.d && dVar.e < j) || (!z && eVar.f < j)) {
            xVar2.o = 11;
            com.five_corp.ad.internal.ad.q qVar = xVar2.d;
            if (qVar != null && qVar.f1831a != null && xVar2.q == null) {
                xVar2.q = new java.lang.Object();
                xVar2.p = xVar2.d.f1831a.longValue() + android.os.SystemClock.uptimeMillis();
                if (xVar2.q != null) {
                    if (android.os.SystemClock.uptimeMillis() > xVar2.p) {
                        xVar2.a(new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.B0, null, null, null));
                    } else {
                        xVar2.n.postAtTime(new com.five_corp.ad.internal.movie.v(xVar2), xVar2.q, android.os.SystemClock.uptimeMillis() + 500);
                    }
                }
            }
            xVar2.h.a();
            xVar2.i.a(c1459b);
            xVar2.k.getClass();
            com.five_corp.ad.internal.movie.partialcache.video.d.a(c1459b);
            com.five_corp.ad.internal.view.D d2 = xVar2.e;
            d2.e.post(new com.five_corp.ad.internal.view.A(d2));
            xVar2.f2039a.post(new com.five_corp.ad.internal.movie.RunnableC1446c(xVar2));
            return;
        }
        c1459b.b = j;
        com.five_corp.ad.internal.movie.partialcache.audio.c cVar = xVar2.i;
        if (cVar.d != 1) {
            c1459b.d.a(j);
        }
        if (cVar.d == 6) {
            c1459b.c.a(j);
        }
        com.five_corp.ad.internal.movie.partialcache.video.d dVar2 = this.b.k;
        long j2 = this.f2037a;
        dVar2.getClass();
        com.five_corp.ad.internal.movie.partialcache.video.f fVar2 = c1459b.e;
        if (fVar2 == null) {
            return;
        }
        com.five_corp.ad.internal.movie.partialcache.video.e eVar2 = c1459b.f;
        boolean z3 = eVar2.e && j2 > eVar2.f;
        fVar2.a(j2);
        c1459b.f.a(j2);
        if (!z3 || (fVar = c1459b.e) == null) {
            return;
        }
        fVar.a();
        c1459b.e = null;
    }
}
