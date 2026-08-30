package com.five_corp.ad.internal.hub;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.five_corp.ad.internal.util.e f1936a = new com.five_corp.ad.internal.util.e();

    public final void a() {
        java.util.ArrayList arrayList;
        com.five_corp.ad.internal.util.e eVar = this.f1936a;
        synchronized (eVar.b) {
            com.five_corp.ad.internal.util.h hVar = eVar.f2084a;
            hVar.getClass();
            arrayList = new java.util.ArrayList();
            hVar.a((java.util.AbstractCollection) arrayList);
        }
        java.util.Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new java.lang.ClassCastException();
        }
    }
}
