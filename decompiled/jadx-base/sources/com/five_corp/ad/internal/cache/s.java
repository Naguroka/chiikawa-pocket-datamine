package com.five_corp.ad.internal.cache;

/* JADX INFO: loaded from: classes4.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f1876a = new java.lang.Object();
    public com.five_corp.ad.internal.cache.x b;
    public final com.five_corp.ad.internal.util.h c;
    public final com.five_corp.ad.internal.util.h d;
    public final com.five_corp.ad.internal.hub.a e;

    public s(com.five_corp.ad.internal.cache.x xVar, com.five_corp.ad.internal.hub.a aVar) {
        this.b = xVar;
        com.five_corp.ad.internal.util.h hVar = new com.five_corp.ad.internal.util.h();
        this.c = hVar;
        hVar.a(xVar);
        this.d = new com.five_corp.ad.internal.util.h();
        this.e = aVar;
    }

    public final java.util.ArrayList a() {
        java.util.ArrayList arrayList;
        synchronized (this.f1876a) {
            com.five_corp.ad.internal.util.h hVar = this.c;
            hVar.getClass();
            arrayList = new java.util.ArrayList();
            hVar.a((java.util.AbstractCollection) arrayList);
        }
        return arrayList;
    }

    public final com.five_corp.ad.internal.cache.x b() {
        com.five_corp.ad.internal.cache.x xVar;
        synchronized (this.f1876a) {
            xVar = this.b;
        }
        return xVar;
    }

    public final void a(com.five_corp.ad.internal.cache.y yVar) {
        this.d.f2086a.add(new java.lang.ref.WeakReference(yVar));
    }

    public final void a(com.five_corp.ad.internal.cache.r rVar) {
        com.five_corp.ad.internal.cache.x xVar;
        com.five_corp.ad.internal.cache.x xVarA;
        java.util.ArrayList arrayList;
        synchronized (this.f1876a) {
            xVar = this.b;
            xVarA = rVar.a(xVar);
            this.b = xVarA;
            this.c.f2086a.add(new java.lang.ref.WeakReference(xVarA));
            com.five_corp.ad.internal.util.h hVar = this.d;
            hVar.getClass();
            arrayList = new java.util.ArrayList();
            hVar.a((java.util.AbstractCollection) arrayList);
        }
        com.five_corp.ad.internal.media_config.a aVar = xVar.b;
        com.five_corp.ad.internal.media_config.a aVar2 = xVarA.b;
        if (aVar == aVar2 || aVar2 == null) {
            return;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.five_corp.ad.internal.cache.y) it.next()).a(xVarA);
        }
        this.e.a();
    }
}
