package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class ye {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f1539a = java.util.Collections.synchronizedList(new java.util.ArrayList());

    public interface a {
        void a(com.applovin.impl.fe feVar);
    }

    public void a(com.applovin.impl.ye.a aVar) {
        this.f1539a.add(aVar);
    }

    public void a(com.applovin.impl.fe feVar) {
        java.util.Iterator it = new java.util.ArrayList(this.f1539a).iterator();
        while (it.hasNext()) {
            ((com.applovin.impl.ye.a) it.next()).a(feVar);
        }
    }

    public void b(com.applovin.impl.ye.a aVar) {
        this.f1539a.remove(aVar);
    }
}
