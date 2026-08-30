package com.five_corp.ad.internal.cache;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.cache.n f1870a;
    public final /* synthetic */ com.five_corp.ad.internal.cache.o b;

    public j(com.five_corp.ad.internal.cache.o oVar, com.five_corp.ad.internal.cache.n nVar) {
        this.b = oVar;
        this.f1870a = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        synchronized (this.b.f1873a) {
            com.five_corp.ad.internal.cache.o oVar = this.b;
            if (oVar.f) {
                this.f1870a.a(new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.S5, null, null, null));
                return;
            }
            com.five_corp.ad.internal.storage.a aVar = oVar.d;
            com.five_corp.ad.internal.util.g gVarA = ((com.five_corp.ad.internal.storage.c) aVar.f2050a).a(aVar.b, new byte[0]);
            if (!gVarA.f2085a) {
                this.f1870a.a(gVarA.b);
                return;
            }
            synchronized (this.b.f1873a) {
                z = !this.b.g.isEmpty();
                this.b.e = true;
            }
            this.f1870a.b();
            if (z) {
                com.five_corp.ad.internal.cache.o oVar2 = this.b;
                oVar2.b.post(new com.five_corp.ad.internal.cache.k(oVar2));
            }
        }
    }
}
