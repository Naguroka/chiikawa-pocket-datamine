package com.five_corp.ad.internal.movie;

/* JADX INFO: loaded from: classes4.dex */
public final class t implements com.five_corp.ad.internal.movie.partialcache.w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f2036a;
    public final /* synthetic */ com.five_corp.ad.internal.movie.x b;

    public t(com.five_corp.ad.internal.movie.x xVar, boolean z) {
        this.b = xVar;
        this.f2036a = z;
    }

    @Override // com.five_corp.ad.internal.movie.partialcache.w1
    public final void a(java.lang.Object obj) {
        com.five_corp.ad.internal.movie.partialcache.C1459b c1459b = (com.five_corp.ad.internal.movie.partialcache.C1459b) obj;
        com.five_corp.ad.internal.movie.x xVar = this.b;
        if (xVar.o != 13) {
            boolean z = c1459b.f2001a;
            boolean z2 = this.f2036a;
            if (z == z2) {
                return;
            }
            c1459b.f2001a = z2;
            if (z2) {
                com.five_corp.ad.internal.movie.partialcache.audio.c cVar = xVar.i;
                int iA = com.five_corp.ad.e.a(cVar.d);
                if (iA == 6) {
                    cVar.d = 3;
                    return;
                }
                if (iA != 7) {
                    return;
                }
                cVar.d = 5;
                long jB = c1459b.d.b(c1459b.b);
                com.five_corp.ad.internal.movie.partialcache.C1471h c1471h = cVar.c.h;
                c1471h.c = true;
                c1471h.d = jB;
                c1471h.e = 0L;
                c1471h.b = true;
                c1459b.c.a();
                return;
            }
            com.five_corp.ad.internal.movie.partialcache.audio.c cVar2 = xVar.i;
            int iA2 = com.five_corp.ad.e.a(cVar2.d);
            if (iA2 == 2) {
                cVar2.d = 7;
                return;
            }
            if (iA2 == 3) {
                cVar2.d = 8;
                cVar2.c.h.c = false;
                c1459b.c.b();
                com.five_corp.ad.internal.movie.x xVar2 = cVar2.c;
                xVar2.getClass();
                xVar2.n.post(new com.five_corp.ad.internal.movie.RunnableC1455l(xVar2, new com.five_corp.ad.internal.movie.n(xVar2)));
                return;
            }
            if (iA2 == 4) {
                cVar2.d = 8;
                cVar2.c.h.c = false;
                c1459b.c.b();
            } else {
                if (iA2 != 5) {
                    return;
                }
                cVar2.d = 8;
                c1459b.c.b();
            }
        }
    }
}
