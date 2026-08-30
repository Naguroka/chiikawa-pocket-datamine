package com.five_corp.ad.internal.cache;

/* JADX INFO: loaded from: classes4.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.five_corp.ad.internal.storage.e f1874a;
    public final com.five_corp.ad.internal.util.h b = new com.five_corp.ad.internal.util.h();

    public p(com.five_corp.ad.internal.storage.e eVar) {
        this.f1874a = eVar;
    }

    public final synchronized void a(java.util.HashSet hashSet) {
        java.util.HashSet hashSet2 = new java.util.HashSet();
        hashSet2.addAll(hashSet);
        com.five_corp.ad.internal.util.h hVar = this.b;
        hVar.getClass();
        java.util.ArrayList<com.five_corp.ad.internal.cache.q> arrayList = new java.util.ArrayList();
        hVar.a((java.util.AbstractCollection) arrayList);
        for (com.five_corp.ad.internal.cache.q qVar : arrayList) {
            if (qVar.b) {
                hashSet2.addAll(qVar.f1875a.keySet());
            }
        }
        this.f1874a.a(hashSet2);
    }
}
