package com.five_corp.ad.internal.http.movcache;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements com.five_corp.ad.internal.http.client.b, com.five_corp.ad.internal.storage.p, com.five_corp.ad.internal.cache.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.five_corp.ad.internal.ad.w f1935a;
    public final com.five_corp.ad.internal.cache.o b;
    public final com.five_corp.ad.internal.http.connection.c c;
    public final com.five_corp.ad.internal.http.movcache.h d;
    public final int e;
    public final com.five_corp.ad.internal.http.movcache.m f;
    public int k;
    public int l;
    public int m;
    public boolean n;
    public final java.lang.Object g = new java.lang.Object();
    public com.five_corp.ad.internal.http.client.a h = null;
    public com.five_corp.ad.internal.storage.q i = null;
    public java.util.ArrayList j = new java.util.ArrayList();
    public boolean o = false;
    public int q = 0;
    public boolean p = false;

    public n(com.five_corp.ad.internal.ad.w wVar, com.five_corp.ad.internal.cache.o oVar, int i, com.five_corp.ad.internal.http.connection.c cVar, com.five_corp.ad.internal.http.movcache.h hVar, int i2) {
        this.f1935a = wVar;
        this.b = oVar;
        this.c = cVar;
        this.d = hVar;
        this.e = i2;
        this.k = i;
        boolean zD = oVar.d();
        this.n = zD;
        this.m = zD ? 4 : 1;
        this.f = new com.five_corp.ad.internal.http.movcache.m(this);
    }

    @Override // com.five_corp.ad.internal.http.client.b
    public final void a() {
        com.five_corp.ad.internal.storage.q qVar;
        synchronized (this.g) {
            this.h = null;
            qVar = this.i;
            this.i = null;
            if (this.m == 2) {
                this.m = 1;
            }
        }
        if (qVar != null) {
            qVar.d.post(new com.five_corp.ad.internal.storage.o(qVar));
        }
        com.five_corp.ad.internal.http.movcache.h hVar = this.d;
        hVar.f1931a.post(new com.five_corp.ad.internal.http.movcache.f(hVar, this));
    }

    @Override // com.five_corp.ad.internal.storage.p
    public final void b(com.five_corp.ad.internal.s sVar) {
        g();
    }

    @Override // com.five_corp.ad.internal.http.client.b
    public final void c(com.five_corp.ad.internal.s sVar) {
        com.five_corp.ad.internal.storage.q qVar;
        synchronized (this.g) {
            this.h = null;
            qVar = this.i;
            this.i = null;
        }
        if (qVar != null) {
            qVar.d.post(new com.five_corp.ad.internal.storage.o(qVar));
        }
        j();
        com.five_corp.ad.internal.http.movcache.h hVar = this.d;
        hVar.f1931a.post(new com.five_corp.ad.internal.http.movcache.f(hVar, this));
    }

    @Override // com.five_corp.ad.internal.http.client.b
    public final void d() {
        synchronized (this.g) {
            this.o = true;
            this.l = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    public final long e() {
        java.util.ArrayList<com.five_corp.ad.internal.http.movcache.i> arrayList;
        int i;
        long j;
        synchronized (this.g) {
            arrayList = this.j;
            i = this.q;
        }
        int iA = 1;
        for (com.five_corp.ad.internal.http.movcache.i iVar : arrayList) {
            if (iVar.e()) {
                if (com.five_corp.ad.internal.http.b.a(iA) - com.five_corp.ad.internal.http.b.a(iVar.a()) < 0) {
                    iA = iVar.a();
                }
            }
        }
        int iA2 = com.five_corp.ad.e.a(iA);
        if (iA2 == 0) {
            j = androidx.media3.common.C.DEFAULT_SEEK_FORWARD_INCREMENT_MS;
        } else if (iA2 == 1) {
            j = 1000;
        } else if (iA2 != 2) {
            j = androidx.media3.common.C.DEFAULT_SEEK_FORWARD_INCREMENT_MS;
        } else {
            j = 200;
        }
        return j << java.lang.Math.min(i, 10);
    }

    public final int f() {
        java.util.ArrayList<com.five_corp.ad.internal.http.movcache.i> arrayList;
        synchronized (this.g) {
            arrayList = this.j;
        }
        int iA = 1;
        for (com.five_corp.ad.internal.http.movcache.i iVar : arrayList) {
            if (iVar.e()) {
                if (com.five_corp.ad.internal.http.b.a(iA) - com.five_corp.ad.internal.http.b.a(iVar.a()) < 0) {
                    iA = iVar.a();
                }
            }
        }
        return iA;
    }

    public final void g() {
        com.five_corp.ad.internal.http.client.a aVar;
        j();
        synchronized (this.g) {
            aVar = this.h;
        }
        if (aVar != null) {
            aVar.a();
        }
    }

    public final boolean h() {
        synchronized (this.g) {
            if (this.m == 4) {
                return false;
            }
            java.util.Iterator it = this.j.iterator();
            while (it.hasNext()) {
                if (((com.five_corp.ad.internal.http.movcache.i) it.next()).e()) {
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean i() {
        boolean z;
        synchronized (this.g) {
            z = true;
            if (this.m != 1) {
                z = false;
            }
        }
        return z;
    }

    public final void j() {
        synchronized (this.g) {
            this.m = 5;
        }
    }

    public final void k() {
        synchronized (this.g) {
            if (this.m == 3) {
                this.m = 1;
                com.five_corp.ad.internal.http.movcache.h hVar = this.d;
                hVar.f1931a.post(new com.five_corp.ad.internal.http.movcache.e(hVar));
            }
        }
    }

    @Override // com.five_corp.ad.internal.cache.n
    public final void b() {
        com.five_corp.ad.internal.http.movcache.h hVar = this.d;
        hVar.f1931a.post(new com.five_corp.ad.internal.http.movcache.f(hVar, this));
    }

    @Override // com.five_corp.ad.internal.cache.n
    public final void a(com.five_corp.ad.internal.s sVar) {
        j();
        com.five_corp.ad.internal.http.movcache.h hVar = this.d;
        hVar.f1931a.post(new com.five_corp.ad.internal.http.movcache.f(hVar, this));
    }

    @Override // com.five_corp.ad.internal.http.client.b
    public final void c() {
        synchronized (this.g) {
            if (this.m != 2) {
                return;
            }
            com.five_corp.ad.internal.storage.q qVar = this.i;
            int i = this.k;
            boolean z = this.o;
            boolean z2 = this.p;
            java.util.ArrayList<com.five_corp.ad.internal.http.movcache.i> arrayList = this.j;
            if (z) {
                this.m = 4;
                this.n = true;
                this.h = null;
                this.i = null;
            }
            if (z) {
                if (qVar != null) {
                    qVar.d.post(new com.five_corp.ad.internal.storage.o(qVar));
                }
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((com.five_corp.ad.internal.http.movcache.i) it.next()).b();
                }
                com.five_corp.ad.internal.cache.o oVar = this.b;
                oVar.b.post(new com.five_corp.ad.internal.cache.j(oVar, this));
                return;
            }
            for (com.five_corp.ad.internal.http.movcache.i iVar : arrayList) {
                if (iVar.e() && iVar.a(i)) {
                    com.five_corp.ad.internal.http.client.a aVar = new com.five_corp.ad.internal.http.client.a(this.f1935a, this, this.c);
                    synchronized (this.g) {
                        this.h = aVar;
                    }
                    aVar.b(i, z2 ? 0 : this.e);
                    return;
                }
            }
            synchronized (this.g) {
                this.m = 3;
                this.h = null;
                this.i = null;
            }
            if (qVar != null) {
                qVar.d.post(new com.five_corp.ad.internal.storage.o(qVar));
            }
            java.util.Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((com.five_corp.ad.internal.http.movcache.i) it2.next()).c();
            }
            com.five_corp.ad.internal.http.movcache.h hVar = this.d;
            hVar.f1931a.post(new com.five_corp.ad.internal.http.movcache.f(hVar, this));
        }
    }

    @Override // com.five_corp.ad.internal.http.client.b
    public final void a(int i) {
        synchronized (this.g) {
            if (this.k >= i) {
                this.o = true;
            } else {
                com.five_corp.ad.internal.t tVar = com.five_corp.ad.internal.t.d;
                g();
            }
        }
    }

    @Override // com.five_corp.ad.internal.http.client.b
    public final void a(byte[] bArr, int i) {
        synchronized (this.g) {
            int i2 = this.l;
            int i3 = this.k;
            int i4 = i2 + i;
            this.l = i4;
            if (i4 <= i3) {
                return;
            }
            com.five_corp.ad.internal.storage.q qVar = this.i;
            this.k = i4;
            java.util.ArrayList arrayList = this.j;
            if (qVar == null) {
                com.five_corp.ad.internal.util.f fVarA = this.b.a(i3, this);
                if (!fVarA.f2085a) {
                    c(fVarA.b);
                    return;
                }
                qVar = (com.five_corp.ad.internal.storage.q) fVarA.c;
                synchronized (this.g) {
                    this.i = qVar;
                }
            }
            int i5 = i3 - i2;
            int i6 = i - i5;
            qVar.d.post(new com.five_corp.ad.internal.storage.m(qVar, bArr, i5, i6));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((com.five_corp.ad.internal.http.movcache.i) it.next()).a(bArr, i5, i6, i3);
            }
        }
    }

    @Override // com.five_corp.ad.internal.http.client.b
    public final void a(int i, int i2, int i3) {
        com.five_corp.ad.internal.s sVar;
        synchronized (this.g) {
            sVar = this.k < i ? new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.N2, null, null, null) : null;
            boolean z = true;
            if (i2 + 1 != i3) {
                z = false;
            }
            this.o = z;
            this.l = i;
        }
        if (sVar != null) {
            g();
        }
    }
}
