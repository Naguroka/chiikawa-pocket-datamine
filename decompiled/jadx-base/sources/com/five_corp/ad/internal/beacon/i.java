package com.five_corp.ad.internal.beacon;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f1852a;

    public i(com.five_corp.ad.internal.ad.a aVar, com.five_corp.ad.internal.logger.a aVar2, com.five_corp.ad.internal.beacon.j jVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new com.five_corp.ad.internal.beacon.d(aVar2, aVar.C.b, new com.five_corp.ad.internal.beacon.f(jVar), aVar.c));
        arrayList.add(new com.five_corp.ad.internal.beacon.d(aVar2, aVar.D.b, new com.five_corp.ad.internal.beacon.g(jVar), aVar.c));
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.addAll(aVar.a());
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.five_corp.ad.internal.beacon.d(aVar2, (com.five_corp.ad.internal.ad.beacon.a) it.next(), new com.five_corp.ad.internal.beacon.h(jVar), aVar.c));
        }
        this.f1852a = arrayList;
    }

    public final void a() {
        for (com.five_corp.ad.internal.beacon.d dVar : this.f1852a) {
            if (!dVar.f) {
                com.five_corp.ad.internal.ad.beacon.a aVar = dVar.b;
                if (aVar.f1791a == 1 && dVar.e) {
                    if (aVar.b == 2) {
                        dVar.d = 0L;
                    }
                    dVar.e = false;
                }
            }
        }
    }
}
