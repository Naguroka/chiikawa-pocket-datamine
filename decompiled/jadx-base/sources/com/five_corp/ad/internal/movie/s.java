package com.five_corp.ad.internal.movie;

/* JADX INFO: loaded from: classes4.dex */
public final class s implements com.five_corp.ad.internal.movie.partialcache.w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.movie.x f2035a;

    public s(com.five_corp.ad.internal.movie.x xVar) {
        this.f2035a = xVar;
    }

    @Override // com.five_corp.ad.internal.movie.partialcache.w1
    public final void a(java.lang.Object obj) {
        com.five_corp.ad.internal.movie.partialcache.C1459b c1459b = (com.five_corp.ad.internal.movie.partialcache.C1459b) obj;
        int iA = com.five_corp.ad.e.a(this.f2035a.o);
        if (iA == 5 || iA == 6 || iA == 7 || iA == 8) {
            com.five_corp.ad.internal.movie.x xVar = this.f2035a;
            xVar.f2039a.post(new com.five_corp.ad.internal.movie.RunnableC1449f(xVar));
            com.five_corp.ad.internal.movie.x xVar2 = this.f2035a;
            xVar2.o = 5;
            xVar2.h.a();
            com.five_corp.ad.internal.view.D d = this.f2035a.e;
            d.e.post(new com.five_corp.ad.internal.view.y(d));
            this.f2035a.i.a(c1459b);
            this.f2035a.k.getClass();
            com.five_corp.ad.internal.movie.partialcache.video.d.a(c1459b);
            return;
        }
        if (iA != 10) {
            return;
        }
        com.five_corp.ad.internal.movie.x xVar3 = this.f2035a;
        xVar3.f2039a.post(new com.five_corp.ad.internal.movie.RunnableC1449f(xVar3));
        com.five_corp.ad.internal.movie.x xVar4 = this.f2035a;
        xVar4.o = 12;
        java.lang.Object obj2 = xVar4.q;
        if (obj2 != null) {
            xVar4.n.removeCallbacksAndMessages(obj2);
            xVar4.q = null;
        }
    }
}
