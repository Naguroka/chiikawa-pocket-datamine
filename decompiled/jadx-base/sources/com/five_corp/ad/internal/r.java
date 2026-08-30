package com.five_corp.ad.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.five_corp.ad.internal.cache.w f2044a;

    public r(com.five_corp.ad.internal.cache.w wVar) {
        this.f2044a = wVar;
    }

    public final void a(com.five_corp.ad.internal.ad.w wVar) {
        com.five_corp.ad.internal.cache.w wVar2 = this.f2044a;
        com.five_corp.ad.internal.cache.x xVarB = wVar2.f1880a.b();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.five_corp.ad.internal.ad.a aVar : xVarB.f1881a.f1843a) {
            java.util.Iterator it = aVar.G.iterator();
            while (it.hasNext()) {
                if (((com.five_corp.ad.internal.ad.w) it.next()).equals(wVar)) {
                    arrayList.add(aVar.e);
                    break;
                }
            }
        }
        java.util.ArrayList<com.five_corp.ad.internal.ad.a> arrayList2 = new java.util.ArrayList();
        wVar2.f1880a.a(new com.five_corp.ad.internal.cache.t(wVar2, arrayList2, arrayList));
        for (com.five_corp.ad.internal.ad.a aVar2 : arrayList2) {
            com.five_corp.ad.internal.w wVar3 = (com.five_corp.ad.internal.w) wVar2.b;
            wVar3.getClass();
            wVar3.a(aVar2.c + ".response.json");
        }
    }
}
