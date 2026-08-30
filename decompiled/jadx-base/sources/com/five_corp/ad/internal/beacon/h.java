package com.five_corp.ad.internal.beacon;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements com.five_corp.ad.internal.beacon.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.beacon.j f1851a;

    public h(com.five_corp.ad.internal.beacon.j jVar) {
        this.f1851a = jVar;
    }

    @Override // com.five_corp.ad.internal.beacon.c
    public final void a(long j, com.five_corp.ad.internal.ad.beacon.a aVar) {
        com.five_corp.ad.internal.ad.beacon.f fVar;
        java.util.List<com.five_corp.ad.internal.ad.beacon.d> listEmptyList;
        com.five_corp.ad.f fVar2 = (com.five_corp.ad.f) this.f1851a;
        com.five_corp.ad.internal.B b = fVar2.o;
        double d = fVar2.t;
        java.util.List list = b.g.b.E;
        if (list == null) {
            fVar = null;
            break;
        }
        java.util.Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                fVar = null;
                break;
            }
            fVar = (com.five_corp.ad.internal.ad.beacon.f) it.next();
        } while (!aVar.equals(fVar.b));
        if (fVar != null) {
            b.a(fVar.f1794a, j, d, aVar, null);
        }
        com.five_corp.ad.internal.ad.a aVar2 = b.g.b;
        if (aVar2.A == null) {
            listEmptyList = java.util.Collections.emptyList();
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (com.five_corp.ad.internal.ad.beacon.d dVar : aVar2.A) {
                if (aVar.equals(dVar.c)) {
                    arrayList.add(dVar);
                }
            }
            listEmptyList = arrayList;
        }
        for (com.five_corp.ad.internal.ad.beacon.d dVar2 : listEmptyList) {
            com.five_corp.ad.internal.G g = b.c;
            g.e.a(new com.five_corp.ad.internal.bgtask.k(dVar2.b, g.c));
        }
    }
}
