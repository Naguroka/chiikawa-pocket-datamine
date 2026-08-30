package com.five_corp.ad.internal.cache;

/* JADX INFO: loaded from: classes4.dex */
public final class u implements com.five_corp.ad.internal.cache.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f1878a;
    public final /* synthetic */ java.util.List b;
    public final /* synthetic */ java.util.List c;
    public final /* synthetic */ java.util.Map d;
    public final /* synthetic */ java.util.Map e;
    public final /* synthetic */ com.five_corp.ad.internal.media_config.a f;
    public final /* synthetic */ com.five_corp.ad.internal.cache.w g;

    public u(com.five_corp.ad.internal.cache.w wVar, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.util.List list, java.util.HashMap map, java.util.HashMap map2, com.five_corp.ad.internal.media_config.a aVar) {
        this.g = wVar;
        this.f1878a = arrayList;
        this.b = arrayList2;
        this.c = list;
        this.d = map;
        this.e = map2;
        this.f = aVar;
    }

    @Override // com.five_corp.ad.internal.cache.r
    public final com.five_corp.ad.internal.cache.x a(com.five_corp.ad.internal.cache.x xVar) {
        java.util.ArrayList<com.five_corp.ad.internal.ad.a> arrayList = new java.util.ArrayList(xVar.f1881a.f1843a);
        java.util.HashMap map = new java.util.HashMap(xVar.f1881a.b);
        this.f1878a.clear();
        for (com.five_corp.ad.internal.ad.a aVar : arrayList) {
            if (this.b.contains(aVar.e)) {
                this.f1878a.add(aVar);
            }
        }
        arrayList.removeAll(this.f1878a);
        arrayList.addAll(this.c);
        map.putAll(this.d);
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hashSet.add(((com.five_corp.ad.internal.ad.a) it.next()).e);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (com.five_corp.ad.internal.ad.f fVar : map.keySet()) {
            if (!hashSet.contains(fVar)) {
                arrayList2.add(fVar);
            }
        }
        java.util.Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            map.remove((com.five_corp.ad.internal.ad.f) it2.next());
        }
        com.five_corp.ad.internal.C1434b c1434b = new com.five_corp.ad.internal.C1434b(arrayList, map, this.e);
        com.five_corp.ad.internal.media_config.a aVar2 = this.f;
        this.g.f.getClass();
        return new com.five_corp.ad.internal.cache.x(c1434b, aVar2, java.lang.System.currentTimeMillis());
    }
}
