package com.five_corp.ad.internal.movie;

/* JADX INFO: renamed from: com.five_corp.ad.internal.movie.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1454k implements com.five_corp.ad.internal.movie.partialcache.w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.s f1979a;
    public final /* synthetic */ com.five_corp.ad.internal.movie.x b;

    public C1454k(com.five_corp.ad.internal.movie.x xVar, com.five_corp.ad.internal.s sVar) {
        this.b = xVar;
        this.f1979a = sVar;
    }

    @Override // com.five_corp.ad.internal.movie.partialcache.w1
    public final void a(java.lang.Object obj) {
        com.five_corp.ad.internal.movie.partialcache.C1459b c1459b = (com.five_corp.ad.internal.movie.partialcache.C1459b) obj;
        com.five_corp.ad.internal.movie.x xVar = this.b;
        xVar.o = 13;
        xVar.h.a();
        com.five_corp.ad.internal.movie.partialcache.audio.c cVar = this.b.i;
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
        this.b.k.getClass();
        com.five_corp.ad.internal.movie.partialcache.video.f fVar = c1459b.e;
        if (fVar != null) {
            fVar.a();
            c1459b.e = null;
        }
        com.five_corp.ad.internal.movie.partialcache.u1 u1Var = this.b.g;
        if (u1Var.g != null) {
            u1Var.b(new com.five_corp.ad.internal.movie.partialcache.t1(u1Var));
        }
        this.b.j.a();
        this.b.l.a();
        this.b.f2039a.post(new com.five_corp.ad.internal.movie.RunnableC1453j(this));
    }
}
