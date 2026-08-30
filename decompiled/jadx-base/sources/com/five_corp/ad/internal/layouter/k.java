package com.five_corp.ad.internal.layouter;

/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.five_corp.ad.internal.util.h f1945a = new com.five_corp.ad.internal.util.h();
    public com.five_corp.ad.internal.layouter.i b;

    public k(com.five_corp.ad.internal.layouter.i iVar) {
        this.b = iVar;
    }

    public final com.five_corp.ad.internal.layouter.i a(com.five_corp.ad.internal.layouter.j jVar) {
        this.f1945a.f2086a.add(new java.lang.ref.WeakReference(jVar));
        return this.b;
    }

    public final void a(com.five_corp.ad.internal.layouter.i iVar) {
        if (this.b.equals(iVar)) {
            return;
        }
        this.b = iVar;
        com.five_corp.ad.internal.util.h hVar = this.f1945a;
        hVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        hVar.a((java.util.AbstractCollection) arrayList);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.five_corp.ad.internal.layouter.j) it.next()).a(iVar);
        }
    }
}
