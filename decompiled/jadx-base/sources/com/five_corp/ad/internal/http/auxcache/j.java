package com.five_corp.ad.internal.http.auxcache;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements com.five_corp.ad.internal.http.client.b, com.five_corp.ad.internal.storage.p, com.five_corp.ad.internal.cache.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.five_corp.ad.internal.ad.w f1916a;
    public final com.five_corp.ad.internal.cache.o b;
    public final java.util.ArrayList c;
    public final com.five_corp.ad.internal.http.connection.c d;
    public final com.five_corp.ad.internal.http.auxcache.i e;
    public final java.lang.Object f;
    public com.five_corp.ad.internal.http.client.a g;
    public com.five_corp.ad.internal.storage.q h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;

    public j(com.five_corp.ad.internal.ad.w wVar, com.five_corp.ad.internal.cache.o oVar, com.five_corp.ad.internal.http.auxcache.k kVar, com.five_corp.ad.internal.http.connection.c cVar, com.five_corp.ad.internal.http.auxcache.i iVar) {
        this.f1916a = wVar;
        this.b = oVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.c = arrayList;
        arrayList.add(kVar);
        this.d = cVar;
        this.e = iVar;
        this.f = new java.lang.Object();
        this.g = null;
        this.h = null;
        this.i = 0;
        this.j = false;
        this.k = false;
        this.l = false;
    }

    @Override // com.five_corp.ad.internal.http.client.b
    public final void a() {
        com.five_corp.ad.internal.storage.q qVar;
        synchronized (this.f) {
            this.g = null;
            qVar = this.h;
            this.h = null;
        }
        if (qVar != null) {
            qVar.d.post(new com.five_corp.ad.internal.storage.o(qVar));
        }
        e();
    }

    @Override // com.five_corp.ad.internal.storage.p
    public final void b(com.five_corp.ad.internal.s sVar) {
        d(sVar);
    }

    @Override // com.five_corp.ad.internal.http.client.b
    public final void c(com.five_corp.ad.internal.s sVar) {
        com.five_corp.ad.internal.storage.q qVar;
        synchronized (this.f) {
            this.g = null;
            qVar = this.h;
            this.h = null;
        }
        if (qVar != null) {
            qVar.d.post(new com.five_corp.ad.internal.storage.o(qVar));
        }
        e(sVar);
    }

    public final void d(com.five_corp.ad.internal.s sVar) {
        com.five_corp.ad.internal.http.client.a aVar;
        synchronized (this.f) {
            aVar = this.g;
        }
        e(sVar);
        if (aVar != null) {
            aVar.a();
        }
    }

    public final void e(com.five_corp.ad.internal.s sVar) {
        synchronized (this.f) {
            if (this.l) {
                return;
            }
            this.l = true;
            com.five_corp.ad.internal.http.auxcache.i iVar = this.e;
            iVar.f1915a.post(new com.five_corp.ad.internal.http.auxcache.g(iVar, this, sVar));
        }
    }

    @Override // com.five_corp.ad.internal.cache.n
    public final void b() {
        synchronized (this.f) {
            if (this.l) {
                return;
            }
            com.five_corp.ad.internal.http.auxcache.i iVar = this.e;
            iVar.f1915a.post(new com.five_corp.ad.internal.http.auxcache.e(iVar, this));
        }
    }

    @Override // com.five_corp.ad.internal.http.client.b
    public final void d() {
        com.five_corp.ad.internal.util.f fVarA = this.b.a(0, this);
        if (!fVarA.f2085a) {
            e(fVarA.b);
            return;
        }
        synchronized (this.f) {
            this.h = (com.five_corp.ad.internal.storage.q) fVarA.c;
            this.j = true;
        }
    }

    @Override // com.five_corp.ad.internal.cache.n
    public final void a(com.five_corp.ad.internal.s sVar) {
        d(sVar);
    }

    @Override // com.five_corp.ad.internal.http.client.b
    public final void c() {
        com.five_corp.ad.internal.storage.q qVar;
        boolean z;
        synchronized (this.f) {
            this.g = null;
            qVar = this.h;
            this.h = null;
            z = this.j;
        }
        if (qVar != null) {
            qVar.d.post(new com.five_corp.ad.internal.storage.o(qVar));
        }
        if (z) {
            com.five_corp.ad.internal.cache.o oVar = this.b;
            oVar.b.post(new com.five_corp.ad.internal.cache.j(oVar, this));
        } else {
            e();
        }
    }

    @Override // com.five_corp.ad.internal.http.client.b
    public final void a(int i) {
        synchronized (this.f) {
            if (this.i == i) {
                this.j = true;
            } else {
                e(new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.M2, null, null, null));
            }
        }
    }

    public final void e() {
        synchronized (this.f) {
            if (this.l) {
                return;
            }
            com.five_corp.ad.internal.http.auxcache.i iVar = this.e;
            iVar.f1915a.post(new com.five_corp.ad.internal.http.auxcache.f(iVar, this));
        }
    }

    @Override // com.five_corp.ad.internal.http.client.b
    public final void a(byte[] bArr, int i) {
        com.five_corp.ad.internal.storage.q qVar;
        synchronized (this.f) {
            qVar = this.h;
        }
        if (qVar == null) {
            d(new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.L2, null, null, null));
        } else {
            qVar.d.post(new com.five_corp.ad.internal.storage.m(qVar, bArr, 0, i));
        }
    }

    @Override // com.five_corp.ad.internal.http.client.b
    public final void a(int i, int i2, int i3) {
        com.five_corp.ad.internal.s sVar;
        synchronized (this.f) {
            sVar = this.i < i ? new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.K2, null, null, null) : null;
        }
        if (sVar != null) {
            d(sVar);
            return;
        }
        com.five_corp.ad.internal.util.f fVarA = this.b.a(i, this);
        if (!fVarA.f2085a) {
            e(fVarA.b);
            return;
        }
        synchronized (this.f) {
            this.h = (com.five_corp.ad.internal.storage.q) fVarA.c;
            boolean z = true;
            if (i2 + 1 != i3) {
                z = false;
            }
            this.j = z;
        }
    }
}
