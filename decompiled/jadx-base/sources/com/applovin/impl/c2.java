package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c2 implements com.applovin.impl.ae {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.ArrayList f663a = new java.util.ArrayList(1);
    private final java.util.HashSet b = new java.util.HashSet(1);
    private final com.applovin.impl.be.a c = new com.applovin.impl.be.a();
    private final com.applovin.impl.z6.a d = new com.applovin.impl.z6.a();
    private android.os.Looper e;
    private com.applovin.impl.fo f;

    protected abstract void a(com.applovin.impl.xo xoVar);

    protected void e() {
    }

    protected void f() {
    }

    protected abstract void h();

    protected final com.applovin.impl.be.a b(com.applovin.impl.ae.a aVar) {
        return this.c.a(0, aVar, 0L);
    }

    protected final boolean g() {
        return !this.b.isEmpty();
    }

    @Override // com.applovin.impl.ae
    public final void a(android.os.Handler handler, com.applovin.impl.z6 z6Var) {
        com.applovin.impl.b1.a(handler);
        com.applovin.impl.b1.a(z6Var);
        this.d.a(handler, z6Var);
    }

    @Override // com.applovin.impl.ae
    public final void c(com.applovin.impl.ae.b bVar) {
        this.f663a.remove(bVar);
        if (this.f663a.isEmpty()) {
            this.e = null;
            this.f = null;
            this.b.clear();
            h();
            return;
        }
        a(bVar);
    }

    @Override // com.applovin.impl.ae
    public final void b(com.applovin.impl.ae.b bVar) {
        com.applovin.impl.b1.a(this.e);
        boolean zIsEmpty = this.b.isEmpty();
        this.b.add(bVar);
        if (zIsEmpty) {
            f();
        }
    }

    @Override // com.applovin.impl.ae
    public final void a(android.os.Handler handler, com.applovin.impl.be beVar) {
        com.applovin.impl.b1.a(handler);
        com.applovin.impl.b1.a(beVar);
        this.c.a(handler, beVar);
    }

    protected final com.applovin.impl.z6.a a(int i, com.applovin.impl.ae.a aVar) {
        return this.d.a(i, aVar);
    }

    protected final com.applovin.impl.z6.a a(com.applovin.impl.ae.a aVar) {
        return this.d.a(0, aVar);
    }

    protected final com.applovin.impl.be.a a(int i, com.applovin.impl.ae.a aVar, long j) {
        return this.c.a(i, aVar, j);
    }

    @Override // com.applovin.impl.ae
    public final void a(com.applovin.impl.ae.b bVar) {
        boolean z = !this.b.isEmpty();
        this.b.remove(bVar);
        if (z && this.b.isEmpty()) {
            e();
        }
    }

    @Override // com.applovin.impl.ae
    public final void a(com.applovin.impl.ae.b bVar, com.applovin.impl.xo xoVar) {
        android.os.Looper looperMyLooper = android.os.Looper.myLooper();
        android.os.Looper looper = this.e;
        com.applovin.impl.b1.a(looper == null || looper == looperMyLooper);
        com.applovin.impl.fo foVar = this.f;
        this.f663a.add(bVar);
        if (this.e == null) {
            this.e = looperMyLooper;
            this.b.add(bVar);
            a(xoVar);
        } else if (foVar != null) {
            b(bVar);
            bVar.a(this, foVar);
        }
    }

    protected final void a(com.applovin.impl.fo foVar) {
        this.f = foVar;
        java.util.Iterator it = this.f663a.iterator();
        while (it.hasNext()) {
            ((com.applovin.impl.ae.b) it.next()).a(this, foVar);
        }
    }

    @Override // com.applovin.impl.ae
    public final void a(com.applovin.impl.z6 z6Var) {
        this.d.e(z6Var);
    }

    @Override // com.applovin.impl.ae
    public final void a(com.applovin.impl.be beVar) {
        this.c.a(beVar);
    }
}
