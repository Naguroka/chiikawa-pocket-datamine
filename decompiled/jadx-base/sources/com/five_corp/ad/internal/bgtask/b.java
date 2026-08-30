package com.five_corp.ad.internal.bgtask;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.five_corp.ad.internal.bgtask.a f1854a;
    public final java.util.ArrayList b;

    public b(int i, com.five_corp.ad.internal.time.a aVar, com.five_corp.ad.internal.logger.a aVar2) {
        this.f1854a = new com.five_corp.ad.internal.bgtask.a(aVar2);
        this.b = new java.util.ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.b.add(new com.five_corp.ad.internal.bgtask.e(i2, this.f1854a, aVar));
        }
    }

    public final void a(com.five_corp.ad.internal.bgtask.m mVar) {
        com.five_corp.ad.internal.bgtask.a aVar = this.f1854a;
        aVar.getClass();
        aVar.a(new com.five_corp.ad.internal.bgtask.g(mVar, aVar.c));
        for (com.five_corp.ad.internal.bgtask.e eVar : this.b) {
            eVar.d.post(new com.five_corp.ad.internal.bgtask.c(eVar));
        }
    }

    public final void a() {
        com.five_corp.ad.internal.bgtask.a aVar = this.f1854a;
        synchronized (aVar.f1853a) {
            java.util.Iterator it = aVar.b.iterator();
            while (it.hasNext()) {
                ((com.five_corp.ad.internal.bgtask.g) it.next()).c = 0L;
            }
        }
        for (com.five_corp.ad.internal.bgtask.e eVar : this.b) {
            eVar.d.post(new com.five_corp.ad.internal.bgtask.c(eVar));
        }
    }
}
