package com.five_corp.ad.internal.cache;

/* JADX INFO: loaded from: classes4.dex */
public final class t implements com.five_corp.ad.internal.cache.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f1877a;
    public final /* synthetic */ java.util.Collection b;
    public final /* synthetic */ com.five_corp.ad.internal.cache.w c;

    public t(com.five_corp.ad.internal.cache.w wVar, java.util.ArrayList arrayList, java.util.List list) {
        this.c = wVar;
        this.f1877a = arrayList;
        this.b = list;
    }

    @Override // com.five_corp.ad.internal.cache.r
    public final com.five_corp.ad.internal.cache.x a(com.five_corp.ad.internal.cache.x xVar) {
        java.util.ArrayList<com.five_corp.ad.internal.ad.a> arrayList = new java.util.ArrayList(xVar.f1881a.f1843a);
        java.util.HashMap map = new java.util.HashMap(xVar.f1881a.b);
        this.f1877a.clear();
        for (com.five_corp.ad.internal.ad.a aVar : arrayList) {
            if (this.b.contains(aVar.e)) {
                this.f1877a.add(aVar);
            }
        }
        arrayList.removeAll(this.f1877a);
        java.util.Iterator it = this.b.iterator();
        while (it.hasNext()) {
            map.remove((com.five_corp.ad.internal.ad.f) it.next());
        }
        com.five_corp.ad.internal.C1434b c1434b = new com.five_corp.ad.internal.C1434b(arrayList, map, xVar.f1881a.c);
        com.five_corp.ad.internal.media_config.a aVar2 = xVar.b;
        this.c.f.getClass();
        return new com.five_corp.ad.internal.cache.x(c1434b, aVar2, java.lang.System.currentTimeMillis());
    }
}
