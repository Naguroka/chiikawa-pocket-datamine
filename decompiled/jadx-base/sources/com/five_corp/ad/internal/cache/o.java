package com.five_corp.ad.internal.cache;

/* JADX INFO: loaded from: classes4.dex */
public final class o {
    public final android.os.Handler b;
    public final com.five_corp.ad.internal.storage.a c;
    public final com.five_corp.ad.internal.storage.a d;
    public boolean e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f1873a = new java.lang.Object();
    public boolean f = false;
    public java.util.List g = new java.util.ArrayList();
    public com.five_corp.ad.internal.cache.i h = null;
    public java.lang.ref.WeakReference i = null;

    public o(android.os.Handler handler, com.five_corp.ad.internal.storage.a aVar, com.five_corp.ad.internal.storage.a aVar2, boolean z) {
        this.b = handler;
        this.c = aVar;
        this.d = aVar2;
        this.e = z;
    }

    public final void a() {
        synchronized (this.f1873a) {
            if (this.f) {
                return;
            }
            this.f = true;
            this.b.post(new com.five_corp.ad.internal.cache.l(this));
        }
    }

    public final com.five_corp.ad.internal.util.f b() {
        synchronized (this.f1873a) {
            if (this.f) {
                return new com.five_corp.ad.internal.util.f(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.W5, null, null, null), null);
            }
            com.five_corp.ad.internal.storage.a aVar = this.c;
            com.five_corp.ad.internal.util.f fVarB = ((com.five_corp.ad.internal.storage.c) aVar.f2050a).b(aVar.b);
            if (!fVarB.f2085a) {
                return new com.five_corp.ad.internal.util.f(false, fVarB.b, null);
            }
            if (!((java.lang.Boolean) fVarB.c).booleanValue()) {
                return new com.five_corp.ad.internal.util.f(true, null, 0);
            }
            return ((com.five_corp.ad.internal.storage.c) aVar.f2050a).c(aVar.b);
        }
    }

    public final java.lang.String c() {
        com.five_corp.ad.internal.storage.a aVar = this.c;
        com.five_corp.ad.internal.storage.b bVar = aVar.f2050a;
        java.lang.String str = aVar.b;
        com.five_corp.ad.internal.storage.c cVar = (com.five_corp.ad.internal.storage.c) bVar;
        cVar.getClass();
        return new java.io.File(cVar.f2051a, str).getAbsolutePath();
    }

    public final boolean d() {
        boolean z;
        synchronized (this.f1873a) {
            z = !this.f && this.e;
        }
        return z;
    }

    public final com.five_corp.ad.internal.util.g e() {
        synchronized (this.f1873a) {
            if (this.f) {
                return new com.five_corp.ad.internal.util.g(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.X5, null, null, null));
            }
            com.five_corp.ad.internal.storage.a aVar = this.c;
            return ((com.five_corp.ad.internal.storage.c) aVar.f2050a).d(aVar.b);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.five_corp.ad.internal.cache.o.class != obj.getClass()) {
            return false;
        }
        return ((com.five_corp.ad.internal.cache.o) obj).c.b.equals(this.c.b);
    }

    public final int hashCode() {
        return this.c.b.hashCode();
    }

    public final com.five_corp.ad.internal.util.f a(int i, com.five_corp.ad.internal.movie.partialcache.C1467f c1467f) {
        synchronized (this.f1873a) {
            if (this.f) {
                return new com.five_corp.ad.internal.util.f(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.Q5, null, null, null), null);
            }
            java.lang.ref.WeakReference weakReference = this.i;
            com.five_corp.ad.internal.storage.q qVar = weakReference != null ? (com.five_corp.ad.internal.storage.q) weakReference.get() : null;
            if (qVar != null) {
                qVar.d.post(new com.five_corp.ad.internal.storage.n(qVar));
            }
            com.five_corp.ad.internal.storage.a aVar = this.c;
            return new com.five_corp.ad.internal.util.f(true, null, new com.five_corp.ad.internal.storage.k(i, aVar.b, aVar.f2050a, this.b, c1467f));
        }
    }

    public final com.five_corp.ad.internal.util.f a(int i, com.five_corp.ad.internal.storage.p pVar) {
        com.five_corp.ad.internal.storage.a aVar = this.c;
        com.five_corp.ad.internal.storage.q qVar = new com.five_corp.ad.internal.storage.q(i, aVar.b, aVar.f2050a, this.b, pVar, aVar.c);
        synchronized (this.f1873a) {
            if (this.f) {
                return new com.five_corp.ad.internal.util.f(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.R5, null, null, null), null);
            }
            this.i = new java.lang.ref.WeakReference(qVar);
            return new com.five_corp.ad.internal.util.f(true, null, qVar);
        }
    }

    public final void a(com.five_corp.ad.internal.cache.m mVar) {
        synchronized (this.f1873a) {
            this.g.add(mVar);
            if (this.e || this.f) {
                this.b.post(new com.five_corp.ad.internal.cache.k(this));
            }
        }
    }
}
