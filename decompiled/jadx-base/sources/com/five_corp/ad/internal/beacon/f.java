package com.five_corp.ad.internal.beacon;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements com.five_corp.ad.internal.beacon.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.beacon.j f1849a;

    public f(com.five_corp.ad.internal.beacon.j jVar) {
        this.f1849a = jVar;
    }

    @Override // com.five_corp.ad.internal.beacon.c
    public final void a(long j, com.five_corp.ad.internal.ad.beacon.a aVar) {
        int i;
        com.five_corp.ad.f fVar = (com.five_corp.ad.f) this.f1849a;
        synchronized (fVar.m) {
            i = fVar.u;
        }
        if (i != 1) {
            fVar.a(0, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.Y3, "CurrentState: ".concat(com.five_corp.ad.d.a(i)), null, null));
            return;
        }
        fVar.o.n(j, fVar.t);
        com.five_corp.ad.internal.cache.w wVar = fVar.b.j;
        com.five_corp.ad.internal.ad.a aVar2 = fVar.l.b;
        wVar.getClass();
        java.util.List listSingletonList = java.util.Collections.singletonList(aVar2.e);
        java.util.ArrayList<com.five_corp.ad.internal.ad.a> arrayList = new java.util.ArrayList();
        wVar.f1880a.a(new com.five_corp.ad.internal.cache.t(wVar, arrayList, listSingletonList));
        for (com.five_corp.ad.internal.ad.a aVar3 : arrayList) {
            com.five_corp.ad.internal.w wVar2 = (com.five_corp.ad.internal.w) wVar.b;
            wVar2.getClass();
            wVar2.a(aVar3.c + ".response.json");
        }
        fVar.b.r.a(3);
    }
}
