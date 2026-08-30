package com.five_corp.ad.internal.cache;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.cache.o f1872a;

    public l(com.five_corp.ad.internal.cache.o oVar) {
        this.f1872a = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.List list;
        com.five_corp.ad.internal.storage.q qVar;
        synchronized (this.f1872a.f1873a) {
            com.five_corp.ad.internal.cache.o oVar = this.f1872a;
            list = oVar.g;
            oVar.g = new java.util.ArrayList();
            java.lang.ref.WeakReference weakReference = this.f1872a.i;
            qVar = weakReference != null ? (com.five_corp.ad.internal.storage.q) weakReference.get() : null;
        }
        if (qVar != null) {
            qVar.a();
        }
        com.five_corp.ad.internal.storage.a aVar = this.f1872a.c;
        ((com.five_corp.ad.internal.storage.c) aVar.f2050a).a(aVar.b);
        com.five_corp.ad.internal.storage.a aVar2 = this.f1872a.d;
        ((com.five_corp.ad.internal.storage.c) aVar2.f2050a).a(aVar2.b);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((com.five_corp.ad.internal.cache.m) it.next()).a(new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.U5, null, null, null));
        }
    }
}
