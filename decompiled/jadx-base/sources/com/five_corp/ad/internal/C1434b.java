package com.five_corp.ad.internal;

/* JADX INFO: renamed from: com.five_corp.ad.internal.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1434b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List f1843a;
    public final java.util.Map b;
    public final java.util.Map c;

    public C1434b(java.util.ArrayList arrayList, java.util.Map map, java.util.Map map2) {
        this.f1843a = arrayList;
        this.b = map;
        this.c = map2;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007b  */
    public static com.five_corp.ad.internal.C1442j a(com.five_corp.ad.internal.ad.a aVar, com.five_corp.ad.internal.storage.e eVar) {
        int i;
        com.five_corp.ad.internal.cache.o oVarA = eVar.a(aVar.n);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.five_corp.ad.internal.ad.w wVar : aVar.G) {
            if (aVar.n != wVar) {
                arrayList.add(eVar.a(wVar));
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((com.five_corp.ad.internal.cache.o) it.next()).d()) {
                i = 1;
                return new com.five_corp.ad.internal.C1442j(aVar, i);
            }
        }
        if (oVarA.d()) {
            i = 4;
        } else {
            com.five_corp.ad.CreativeType creativeType = aVar.b;
            com.five_corp.ad.CreativeType creativeType2 = com.five_corp.ad.CreativeType.MOVIE;
            if (creativeType == creativeType2 && aVar.I == 3) {
                i = 3;
            } else {
                if (creativeType == creativeType2 && aVar.I == 2 && aVar.h != null) {
                    com.five_corp.ad.internal.util.f fVarB = oVarA.b();
                    if (fVarB.f2085a && ((java.lang.Integer) fVarB.c).intValue() >= aVar.h.b) {
                        i = 3;
                    }
                }
                i = 2;
            }
        }
        return new com.five_corp.ad.internal.C1442j(aVar, i);
    }
}
