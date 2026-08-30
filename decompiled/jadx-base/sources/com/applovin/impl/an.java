package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class an extends com.applovin.impl.yl {
    private final java.lang.ref.WeakReference h;
    private final java.lang.Object i;

    public static void a(long j, com.applovin.impl.fi fiVar, java.lang.Object obj, java.lang.String str, com.applovin.impl.sdk.j jVar) {
        if (j <= 0) {
            return;
        }
        jVar.i0().a(new com.applovin.impl.an(fiVar, obj, str, jVar), com.applovin.impl.tm.b.TIMEOUT, j);
    }

    protected an(com.applovin.impl.fi fiVar, java.lang.Object obj, java.lang.String str, com.applovin.impl.sdk.j jVar) {
        super(str, jVar);
        this.h = new java.lang.ref.WeakReference(fiVar);
        this.i = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.applovin.impl.fi fiVar = (com.applovin.impl.fi) this.h.get();
        if (fiVar == null || fiVar.c()) {
            return;
        }
        this.f1547a.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.f1547a.I().d(this.b, "Attempting to timeout pending task " + fiVar.b() + " with " + this.i);
        }
        fiVar.a(this.i);
    }
}
