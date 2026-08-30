package com.five_corp.ad.internal.movie;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements com.five_corp.ad.internal.movie.partialcache.w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.movie.x f2034a;

    public r(com.five_corp.ad.internal.movie.x xVar) {
        this.f2034a = xVar;
    }

    @Override // com.five_corp.ad.internal.movie.partialcache.w1
    public final void a(java.lang.Object obj) {
        com.five_corp.ad.internal.movie.x xVar = this.f2034a;
        int i = xVar.o;
        if (i != 12) {
            if (i == 5) {
                xVar.o = 6;
                xVar.f.b();
                com.five_corp.ad.internal.movie.x xVar2 = this.f2034a;
                xVar2.f2039a.post(new com.five_corp.ad.internal.movie.RunnableC1448e(xVar2));
                return;
            }
            return;
        }
        xVar.o = 11;
        com.five_corp.ad.internal.ad.q qVar = xVar.d;
        if (qVar != null && qVar.f1831a != null && xVar.q == null) {
            xVar.q = new java.lang.Object();
            xVar.p = xVar.d.f1831a.longValue() + android.os.SystemClock.uptimeMillis();
            if (xVar.q != null) {
                if (android.os.SystemClock.uptimeMillis() > xVar.p) {
                    xVar.a(new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.B0, null, null, null));
                } else {
                    xVar.n.postAtTime(new com.five_corp.ad.internal.movie.v(xVar), xVar.q, android.os.SystemClock.uptimeMillis() + 500);
                }
            }
        }
        com.five_corp.ad.internal.movie.x xVar3 = this.f2034a;
        xVar3.f2039a.post(new com.five_corp.ad.internal.movie.RunnableC1448e(xVar3));
    }
}
