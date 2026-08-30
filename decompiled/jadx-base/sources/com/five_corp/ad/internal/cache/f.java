package com.five_corp.ad.internal.cache;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.five_corp.ad.internal.cache.q f1866a;
    public final android.os.Handler b = new android.os.Handler(android.os.Looper.getMainLooper());

    public f(com.five_corp.ad.internal.cache.q qVar) {
        this.f1866a = qVar;
    }

    public final com.five_corp.ad.internal.cache.b a(android.content.Context context, com.five_corp.ad.internal.ad.w wVar) {
        com.five_corp.ad.internal.cache.b bVar = new com.five_corp.ad.internal.cache.b(context, this, wVar);
        bVar.f1863a.a(bVar.b, new com.five_corp.ad.internal.cache.a(bVar));
        return bVar;
    }

    public final void a(com.five_corp.ad.internal.ad.w wVar, com.five_corp.ad.internal.cache.e eVar) {
        com.five_corp.ad.internal.util.f fVar;
        com.five_corp.ad.internal.cache.o oVar = (com.five_corp.ad.internal.cache.o) this.f1866a.f1875a.get(wVar);
        if (oVar == null) {
            this.b.post(new com.five_corp.ad.internal.cache.c(eVar));
            return;
        }
        java.lang.String str = wVar.f1835a;
        android.os.Handler handler = this.b;
        synchronized (oVar.f1873a) {
            if (oVar.f) {
                fVar = new com.five_corp.ad.internal.util.f(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.V5, null, null, null), null);
            } else {
                if (oVar.h == null) {
                    oVar.h = new com.five_corp.ad.internal.cache.i(oVar, str, handler);
                }
                fVar = new com.five_corp.ad.internal.util.f(true, null, oVar.h);
            }
        }
        if (fVar.f2085a) {
            ((com.five_corp.ad.internal.cache.i) fVar.c).a(eVar);
        } else {
            this.b.post(new com.five_corp.ad.internal.cache.d(eVar, fVar));
        }
    }
}
