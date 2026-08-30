package com.five_corp.ad.internal.soundstate;

/* JADX INFO: loaded from: classes4.dex */
public final class c {
    public com.five_corp.ad.internal.soundstate.a b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f2047a = new java.lang.Object();
    public final com.five_corp.ad.internal.util.h c = new com.five_corp.ad.internal.util.h();

    public c(com.five_corp.ad.internal.soundstate.d dVar) {
        this.b = new com.five_corp.ad.internal.soundstate.a(dVar);
    }

    public final void a(boolean z) {
        com.five_corp.ad.internal.soundstate.a aVar;
        java.util.ArrayList arrayList;
        synchronized (this.f2047a) {
            com.five_corp.ad.internal.soundstate.a aVar2 = this.b;
            aVar = new com.five_corp.ad.internal.soundstate.a(aVar2.f2046a, z ? 2 : 3, aVar2.c, aVar2.d);
            this.b = aVar;
            com.five_corp.ad.internal.util.h hVar = this.c;
            hVar.getClass();
            arrayList = new java.util.ArrayList();
            hVar.a((java.util.AbstractCollection) arrayList);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.five_corp.ad.f) ((com.five_corp.ad.internal.soundstate.b) it.next())).b(aVar);
        }
    }

    public final com.five_corp.ad.internal.soundstate.a a() {
        com.five_corp.ad.internal.soundstate.a aVar;
        synchronized (this.f2047a) {
            aVar = this.b;
        }
        return aVar;
    }

    public final void a(com.five_corp.ad.internal.media_config.c cVar) {
        com.five_corp.ad.internal.soundstate.a aVar;
        java.util.ArrayList arrayList;
        synchronized (this.f2047a) {
            com.five_corp.ad.internal.soundstate.a aVar2 = this.b;
            aVar = new com.five_corp.ad.internal.soundstate.a(aVar2.f2046a, aVar2.b, cVar.e, aVar2.d);
            this.b = aVar;
            com.five_corp.ad.internal.util.h hVar = this.c;
            hVar.getClass();
            arrayList = new java.util.ArrayList();
            hVar.a((java.util.AbstractCollection) arrayList);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.five_corp.ad.f) ((com.five_corp.ad.internal.soundstate.b) it.next())).b(aVar);
        }
    }

    public final com.five_corp.ad.internal.soundstate.a a(com.five_corp.ad.internal.soundstate.b bVar) {
        com.five_corp.ad.internal.soundstate.a aVar;
        synchronized (this.f2047a) {
            this.c.f2086a.add(new java.lang.ref.WeakReference(bVar));
            aVar = this.b;
        }
        return aVar;
    }
}
