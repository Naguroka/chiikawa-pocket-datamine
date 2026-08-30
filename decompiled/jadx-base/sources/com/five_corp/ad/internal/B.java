package com.five_corp.ad.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class B {
    public final com.five_corp.ad.internal.D b;
    public final com.five_corp.ad.internal.G c;
    public final com.five_corp.ad.internal.E d;
    public final com.five_corp.ad.internal.soundstate.c e;
    public final com.five_corp.ad.internal.time.a f;
    public final com.five_corp.ad.internal.context.l g;
    public final boolean i;
    public final java.util.EnumMap h = new java.util.EnumMap(com.five_corp.ad.internal.ad.beacon.e.class);
    public boolean k = false;
    public boolean l = false;
    public boolean m = false;
    public boolean n = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.os.Handler f1780a = new android.os.Handler(android.os.Looper.getMainLooper());
    public int j = 1;

    public B(com.five_corp.ad.internal.D d, com.five_corp.ad.internal.G g, com.five_corp.ad.internal.E e, com.five_corp.ad.internal.soundstate.c cVar, com.five_corp.ad.internal.time.a aVar, com.five_corp.ad.internal.context.l lVar, boolean z) {
        this.b = d;
        this.c = g;
        this.d = e;
        this.e = cVar;
        this.f = aVar;
        this.g = lVar;
        this.i = z;
    }

    public final com.five_corp.ad.internal.beacon.a a(long j, double d, boolean z) {
        com.five_corp.ad.internal.beacon.a aVar = new com.five_corp.ad.internal.beacon.a(this.g, 3, this.e.a(), j, d);
        aVar.m = z;
        return aVar;
    }

    public final void b() {
        if (this.i && !this.n) {
            com.five_corp.ad.internal.D d = this.b;
            com.five_corp.ad.FiveAdViewEventListener fiveAdViewEventListener = (com.five_corp.ad.FiveAdViewEventListener) d.c.get();
            if (fiveAdViewEventListener != null) {
                fiveAdViewEventListener.onFiveAdClick(d.f1782a);
            }
            com.five_corp.ad.internal.InterfaceC1440h interfaceC1440h = (com.five_corp.ad.internal.InterfaceC1440h) d.d.get();
            if (interfaceC1440h != null) {
                interfaceC1440h.d();
            }
        }
        a(com.five_corp.ad.internal.ad.beacon.e.CLICK_BEACON);
    }

    public final void c(long j, double d) {
        com.five_corp.ad.internal.context.l lVar = this.g;
        this.f.getClass();
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        synchronized (lVar) {
            lVar.k = jCurrentTimeMillis;
        }
        a(1, j, d, this.g.b.C.b, null);
        a(com.five_corp.ad.internal.ad.beacon.e.IMPRESSION);
        if (this.n) {
            return;
        }
        com.five_corp.ad.internal.D d2 = this.b;
        com.five_corp.ad.FiveAdViewEventListener fiveAdViewEventListener = (com.five_corp.ad.FiveAdViewEventListener) d2.c.get();
        if (fiveAdViewEventListener != null) {
            fiveAdViewEventListener.onFiveAdImpression(d2.f1782a);
        }
        com.five_corp.ad.internal.InterfaceC1440h interfaceC1440h = (com.five_corp.ad.internal.InterfaceC1440h) d2.d.get();
        if (interfaceC1440h != null) {
            interfaceC1440h.e();
        }
    }

    public final void d(long j, double d) {
        a(7, j, d, null, null);
        a(com.five_corp.ad.internal.ad.beacon.e.PAUSE);
        if (this.n) {
            return;
        }
        com.five_corp.ad.internal.D d2 = this.b;
        com.five_corp.ad.FiveAdViewEventListener fiveAdViewEventListener = (com.five_corp.ad.FiveAdViewEventListener) d2.c.get();
        if (fiveAdViewEventListener != null) {
            fiveAdViewEventListener.onFiveAdPause(d2.f1782a);
        }
        com.five_corp.ad.internal.InterfaceC1440h interfaceC1440h = (com.five_corp.ad.internal.InterfaceC1440h) d2.d.get();
        if (interfaceC1440h != null) {
            interfaceC1440h.c();
        }
    }

    public final void e(long j, double d) {
        a(18, j, d, null, null);
        if (this.n) {
            return;
        }
        com.five_corp.ad.internal.D d2 = this.b;
        com.five_corp.ad.FiveAdViewEventListener fiveAdViewEventListener = (com.five_corp.ad.FiveAdViewEventListener) d2.c.get();
        if (fiveAdViewEventListener != null) {
            fiveAdViewEventListener.onFiveAdRecover(d2.f1782a);
        }
    }

    public final void f(long j, double d) {
        a(6, j, d, null, null);
        a(com.five_corp.ad.internal.ad.beacon.e.CLOSE);
        com.five_corp.ad.internal.D d2 = this.b;
        com.five_corp.ad.FiveAdViewEventListener fiveAdViewEventListener = (com.five_corp.ad.FiveAdViewEventListener) d2.c.get();
        if (fiveAdViewEventListener != null) {
            fiveAdViewEventListener.onFiveAdClose(d2.f1782a);
        }
        com.five_corp.ad.internal.q qVar = (com.five_corp.ad.internal.q) this.b.f.get();
        if (qVar != null) {
            qVar.a();
        }
    }

    public final void g(long j, double d) {
        a(9, j, d, null, null);
        a(com.five_corp.ad.internal.ad.beacon.e.REWIND);
        if (!this.n) {
            com.five_corp.ad.internal.D d2 = this.b;
            com.five_corp.ad.FiveAdViewEventListener fiveAdViewEventListener = (com.five_corp.ad.FiveAdViewEventListener) d2.c.get();
            if (fiveAdViewEventListener != null) {
                fiveAdViewEventListener.onFiveAdReplay(d2.f1782a);
            }
            com.five_corp.ad.internal.InterfaceC1440h interfaceC1440h = (com.five_corp.ad.internal.InterfaceC1440h) d2.d.get();
            if (interfaceC1440h != null) {
                interfaceC1440h.a();
            }
        }
        this.j = 3;
    }

    public final void h(long j, double d) {
        int iA = com.five_corp.ad.e.a(this.j);
        if (iA != 0) {
            if (iA == 1) {
                a(8, j, d, null, null);
                a(com.five_corp.ad.internal.ad.beacon.e.RESUME);
                if (!this.n) {
                    com.five_corp.ad.internal.D d2 = this.b;
                    com.five_corp.ad.FiveAdViewEventListener fiveAdViewEventListener = (com.five_corp.ad.FiveAdViewEventListener) d2.c.get();
                    if (fiveAdViewEventListener != null) {
                        fiveAdViewEventListener.onFiveAdResume(d2.f1782a);
                    }
                    com.five_corp.ad.internal.InterfaceC1440h interfaceC1440h = (com.five_corp.ad.internal.InterfaceC1440h) d2.d.get();
                    if (interfaceC1440h != null) {
                        interfaceC1440h.a();
                    }
                }
            }
        } else if (!this.n) {
            com.five_corp.ad.internal.D d3 = this.b;
            com.five_corp.ad.FiveAdViewEventListener fiveAdViewEventListener2 = (com.five_corp.ad.FiveAdViewEventListener) d3.c.get();
            if (fiveAdViewEventListener2 != null) {
                fiveAdViewEventListener2.onFiveAdStart(d3.f1782a);
            }
            com.five_corp.ad.internal.InterfaceC1440h interfaceC1440h2 = (com.five_corp.ad.internal.InterfaceC1440h) d3.d.get();
            if (interfaceC1440h2 != null) {
                interfaceC1440h2.a();
            }
        }
        this.j = 2;
    }

    public final void i(long j, double d) {
        if (this.n || this.m) {
            return;
        }
        this.m = true;
        a(19, j, d, null, null);
        com.five_corp.ad.internal.z zVar = (com.five_corp.ad.internal.z) this.b.e.get();
        if (zVar != null) {
            zVar.a();
        }
    }

    public final void j(long j, double d) {
        a(17, j, d, null, null);
        if (this.n) {
            return;
        }
        com.five_corp.ad.internal.D d2 = this.b;
        com.five_corp.ad.FiveAdViewEventListener fiveAdViewEventListener = (com.five_corp.ad.FiveAdViewEventListener) d2.c.get();
        if (fiveAdViewEventListener != null) {
            fiveAdViewEventListener.onFiveAdStall(d2.f1782a);
        }
    }

    public final void k(long j, double d) {
        if (!this.k) {
            this.k = true;
            a(2, j, d, null, null);
            a(com.five_corp.ad.internal.ad.beacon.e.VT_100);
        }
        if (this.n) {
            return;
        }
        com.five_corp.ad.internal.D d2 = this.b;
        com.five_corp.ad.FiveAdViewEventListener fiveAdViewEventListener = (com.five_corp.ad.FiveAdViewEventListener) d2.c.get();
        if (fiveAdViewEventListener != null) {
            fiveAdViewEventListener.onFiveAdViewThrough(d2.f1782a);
        }
        com.five_corp.ad.internal.InterfaceC1440h interfaceC1440h = (com.five_corp.ad.internal.InterfaceC1440h) d2.d.get();
        if (interfaceC1440h != null) {
            interfaceC1440h.b();
        }
    }

    public final void l(final long j, final double d) {
        this.f1780a.post(new java.lang.Runnable() { // from class: com.five_corp.ad.internal.B$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(j, d);
            }
        });
    }

    public final void m(final long j, final double d) {
        this.f1780a.post(new java.lang.Runnable() { // from class: com.five_corp.ad.internal.B$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(j, d);
            }
        });
    }

    public final void n(final long j, final double d) {
        this.f1780a.post(new java.lang.Runnable() { // from class: com.five_corp.ad.internal.B$$ExternalSyntheticLambda15
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.c(j, d);
            }
        });
    }

    public final void o(final long j, final double d) {
        this.f1780a.post(new java.lang.Runnable() { // from class: com.five_corp.ad.internal.B$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.d(j, d);
            }
        });
    }

    public final void p(final long j, final double d) {
        this.f1780a.post(new java.lang.Runnable() { // from class: com.five_corp.ad.internal.B$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.e(j, d);
            }
        });
    }

    public final void q(final long j, final double d) {
        this.f1780a.post(new java.lang.Runnable() { // from class: com.five_corp.ad.internal.B$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.f(j, d);
            }
        });
    }

    public final void r(final long j, final double d) {
        this.f1780a.post(new java.lang.Runnable() { // from class: com.five_corp.ad.internal.B$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.g(j, d);
            }
        });
    }

    public final void s(final long j, final double d) {
        this.f1780a.post(new java.lang.Runnable() { // from class: com.five_corp.ad.internal.B$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.h(j, d);
            }
        });
    }

    public final void t(final long j, final double d) {
        this.f1780a.post(new java.lang.Runnable() { // from class: com.five_corp.ad.internal.B$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.i(j, d);
            }
        });
    }

    public final void u(final long j, final double d) {
        this.f1780a.post(new java.lang.Runnable() { // from class: com.five_corp.ad.internal.B$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.j(j, d);
            }
        });
    }

    public final void v(final long j, final double d) {
        this.f1780a.post(new java.lang.Runnable() { // from class: com.five_corp.ad.internal.B$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.k(j, d);
            }
        });
    }

    public final void a() {
        if (this.i || this.n) {
            return;
        }
        com.five_corp.ad.internal.D d = this.b;
        com.five_corp.ad.FiveAdViewEventListener fiveAdViewEventListener = (com.five_corp.ad.FiveAdViewEventListener) d.c.get();
        if (fiveAdViewEventListener != null) {
            fiveAdViewEventListener.onFiveAdClick(d.f1782a);
        }
        com.five_corp.ad.internal.InterfaceC1440h interfaceC1440h = (com.five_corp.ad.internal.InterfaceC1440h) d.d.get();
        if (interfaceC1440h != null) {
            interfaceC1440h.d();
        }
    }

    public final void a(long j, double d) {
        a(6, j, d, null, null);
        a(com.five_corp.ad.internal.ad.beacon.e.CLOSE);
    }

    public final void b(long j, double d) {
        a(6, j, d, null, null);
        a(com.five_corp.ad.internal.ad.beacon.e.CLOSE);
        com.five_corp.ad.internal.D d2 = this.b;
        com.five_corp.ad.FiveAdViewEventListener fiveAdViewEventListener = (com.five_corp.ad.FiveAdViewEventListener) d2.c.get();
        if (fiveAdViewEventListener != null) {
            fiveAdViewEventListener.onFiveAdClose(d2.f1782a);
        }
    }

    public final void d() {
        this.f1780a.post(new java.lang.Runnable() { // from class: com.five_corp.ad.internal.B$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b();
            }
        });
    }

    public final void e() {
        android.os.Handler handler = this.f1780a;
        final com.five_corp.ad.internal.D d = this.b;
        java.util.Objects.requireNonNull(d);
        handler.post(new java.lang.Runnable() { // from class: com.five_corp.ad.internal.B$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                d.a();
            }
        });
    }

    public final void a(com.five_corp.ad.internal.s sVar, long j) {
        long j2;
        com.five_corp.ad.internal.G g = this.c;
        com.five_corp.ad.internal.context.l lVar = this.g;
        com.five_corp.ad.internal.ad.a aVar = lVar.b;
        com.five_corp.ad.internal.context.i iVar = lVar.d.f1896a;
        com.five_corp.ad.internal.context.h hVar = lVar.f;
        com.five_corp.ad.internal.soundstate.a aVarA = this.e.a();
        com.five_corp.ad.internal.context.l lVar2 = this.g;
        synchronized (lVar2) {
            j2 = lVar2.k;
        }
        g.a(new com.five_corp.ad.internal.beacon.b(aVar, iVar, hVar, sVar, aVarA, j, java.lang.Long.valueOf(j2), this.g.i));
        a(com.five_corp.ad.internal.ad.beacon.e.ERROR);
        if (this.n) {
            return;
        }
        com.five_corp.ad.internal.D d = this.b;
        com.five_corp.ad.FiveAdErrorCode fiveAdErrorCodeA = sVar.a();
        com.five_corp.ad.FiveAdViewEventListener fiveAdViewEventListener = (com.five_corp.ad.FiveAdViewEventListener) d.c.get();
        if (fiveAdViewEventListener != null) {
            fiveAdViewEventListener.onFiveAdViewError(d.f1782a, fiveAdErrorCodeA);
        }
        com.five_corp.ad.internal.InterfaceC1440h interfaceC1440h = (com.five_corp.ad.internal.InterfaceC1440h) d.d.get();
        if (interfaceC1440h != null) {
            interfaceC1440h.a(fiveAdErrorCodeA);
        }
        this.n = true;
    }

    public final void b(final com.five_corp.ad.internal.s sVar, final long j) {
        this.f1780a.post(new java.lang.Runnable() { // from class: com.five_corp.ad.internal.B$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(sVar, j);
            }
        });
    }

    public final void f() {
        android.os.Handler handler = this.f1780a;
        final com.five_corp.ad.internal.D d = this.b;
        java.util.Objects.requireNonNull(d);
        handler.post(new java.lang.Runnable() { // from class: com.five_corp.ad.internal.B$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                d.b();
            }
        });
    }

    public final void c() {
        this.f1780a.post(new java.lang.Runnable() { // from class: com.five_corp.ad.internal.B$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a();
            }
        });
    }

    public final void a(int i, long j, double d, com.five_corp.ad.internal.ad.beacon.a aVar, java.util.Map map) {
        com.five_corp.ad.internal.beacon.a aVar2 = new com.five_corp.ad.internal.beacon.a(this.g, i, this.e.a(), j, d);
        aVar2.k = aVar;
        aVar2.l = map;
        this.c.a(aVar2);
    }

    public final void a(com.five_corp.ad.internal.ad.beacon.e eVar) {
        java.util.List<com.five_corp.ad.internal.ad.beacon.d> list = this.g.b.A;
        if (list == null) {
            return;
        }
        for (com.five_corp.ad.internal.ad.beacon.d dVar : list) {
            if (dVar.f1792a == eVar) {
                java.lang.String str = dVar.b;
                if (eVar.b) {
                    com.five_corp.ad.internal.G g = this.c;
                    g.e.a(new com.five_corp.ad.internal.bgtask.k(str, g.c));
                } else {
                    java.util.Set hashSet = (java.util.Set) this.h.get(eVar);
                    if (hashSet == null) {
                        hashSet = new java.util.HashSet();
                        this.h.put(eVar, hashSet);
                    }
                    if (hashSet.add(str)) {
                        com.five_corp.ad.internal.G g2 = this.c;
                        g2.e.a(new com.five_corp.ad.internal.bgtask.k(str, g2.c));
                    }
                }
            }
        }
    }
}
