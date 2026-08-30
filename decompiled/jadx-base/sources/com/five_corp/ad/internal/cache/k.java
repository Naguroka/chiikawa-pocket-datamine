package com.five_corp.ad.internal.cache;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.cache.o f1871a;

    public k(com.five_corp.ad.internal.cache.o oVar) {
        this.f1871a = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f1871a.f1873a) {
            com.five_corp.ad.internal.cache.o oVar = this.f1871a;
            java.util.List list = oVar.g;
            boolean z = oVar.f;
            if (list.isEmpty()) {
                return;
            }
            this.f1871a.g = new java.util.ArrayList();
            if (z) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((com.five_corp.ad.internal.cache.m) it.next()).a(new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.T5, null, null, null));
                }
            } else {
                java.lang.String strC = this.f1871a.c();
                java.util.Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((com.five_corp.ad.internal.cache.m) it2.next()).a(strC);
                }
            }
        }
    }
}
