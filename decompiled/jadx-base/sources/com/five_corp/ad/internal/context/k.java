package com.five_corp.ad.internal.context;

/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.five_corp.ad.internal.util.h f1889a = new com.five_corp.ad.internal.util.h();

    public final synchronized com.five_corp.ad.internal.context.j a(com.five_corp.ad.internal.ad.a aVar) {
        com.five_corp.ad.internal.util.h hVar = this.f1889a;
        hVar.getClass();
        java.util.ArrayList<com.five_corp.ad.internal.context.j> arrayList = new java.util.ArrayList();
        hVar.a((java.util.AbstractCollection) arrayList);
        for (com.five_corp.ad.internal.context.j jVar : arrayList) {
            if (jVar.a() && jVar.f1888a.c.equals(aVar.c)) {
                return null;
            }
        }
        com.five_corp.ad.internal.context.j jVar2 = new com.five_corp.ad.internal.context.j(aVar);
        this.f1889a.f2086a.add(new java.lang.ref.WeakReference(jVar2));
        return jVar2;
    }
}
