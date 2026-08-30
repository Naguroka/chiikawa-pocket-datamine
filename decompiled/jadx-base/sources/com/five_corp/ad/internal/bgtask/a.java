package com.five_corp.ad.internal.bgtask;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f1853a = new java.lang.Object();
    public final java.util.ArrayList b = new java.util.ArrayList();
    public final com.five_corp.ad.internal.logger.a c;

    public a(com.five_corp.ad.internal.logger.a aVar) {
        this.c = aVar;
    }

    public final void a(com.five_corp.ad.internal.bgtask.g gVar) {
        synchronized (this.f1853a) {
            this.b.add(gVar);
        }
    }

    public final com.five_corp.ad.internal.bgtask.g a(long j) {
        com.five_corp.ad.internal.bgtask.g gVar = null;
        for (com.five_corp.ad.internal.bgtask.g gVar2 : this.b) {
            if (gVar2.c <= j) {
                if (gVar != null) {
                    if (com.five_corp.ad.internal.bgtask.l.a(gVar2.f1858a.f1860a) < com.five_corp.ad.internal.bgtask.l.a(gVar.f1858a.f1860a)) {
                    }
                }
                gVar = gVar2;
            }
        }
        if (gVar != null) {
            this.b.remove(gVar);
        }
        return gVar;
    }
}
