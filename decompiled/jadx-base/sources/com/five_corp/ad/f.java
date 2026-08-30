package com.five_corp.ad;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements com.five_corp.ad.internal.view.I, com.five_corp.ad.internal.n, com.five_corp.ad.internal.system.d, com.five_corp.ad.internal.beacon.j, com.five_corp.ad.internal.soundstate.b, com.five_corp.ad.internal.fullscreen.b, com.five_corp.ad.internal.layouter.d, com.five_corp.ad.internal.fullscreen.d, com.five_corp.ad.AdActivity.Callback, com.five_corp.ad.internal.ad.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f1777a;
    public final com.five_corp.ad.j b;
    public final com.five_corp.ad.internal.view.C1519l c;
    public final android.os.Handler d;
    public final com.five_corp.ad.internal.http.auxcache.i e;
    public final com.five_corp.ad.internal.o f;
    public final com.five_corp.ad.internal.system.b g;
    public final com.five_corp.ad.internal.view.J h;
    public final com.five_corp.ad.internal.viewability.a i;
    public final com.five_corp.ad.internal.context.l l;
    public final com.five_corp.ad.internal.soundstate.c n;
    public final com.five_corp.ad.internal.B o;
    public final com.five_corp.ad.internal.handler.a p;
    public final com.five_corp.ad.internal.ad.o q;
    public final com.five_corp.ad.internal.beacon.i s;
    public final com.five_corp.ad.internal.layouter.k w;
    public final com.five_corp.ad.internal.logger.a x;
    public final com.five_corp.ad.c y;
    public boolean j = false;
    public long k = Long.MAX_VALUE;
    public final java.lang.Object m = new java.lang.Object();
    public boolean r = false;
    public double t = 0.0d;
    public int u = 1;
    public com.five_corp.ad.internal.fullscreen.e v = null;

    public f(android.content.Context context, com.five_corp.ad.j jVar, android.widget.FrameLayout frameLayout, com.five_corp.ad.internal.D d, com.five_corp.ad.internal.soundstate.c cVar, com.five_corp.ad.internal.context.l lVar, com.five_corp.ad.c cVar2) {
        this.f1777a = context;
        this.b = jVar;
        this.l = lVar;
        this.y = cVar2;
        com.five_corp.ad.internal.logger.a aVar = jVar.f2119a;
        this.x = aVar;
        this.e = jVar.x;
        com.five_corp.ad.internal.o oVar = new com.five_corp.ad.internal.o(this);
        this.f = oVar;
        com.five_corp.ad.internal.system.b bVar = jVar.w;
        this.g = bVar;
        this.d = new android.os.Handler(android.os.Looper.getMainLooper());
        this.n = cVar;
        cVar.a(lVar.d.c);
        com.five_corp.ad.internal.soundstate.a aVarA = cVar.a(this);
        com.five_corp.ad.internal.layouter.k kVar = new com.five_corp.ad.internal.layouter.k(com.five_corp.ad.internal.layouter.i.a(0, lVar.b.g.intValue(), false, aVarA.a(), false));
        this.w = kVar;
        com.five_corp.ad.internal.view.J jA = com.five_corp.ad.internal.view.J.a(context, lVar, oVar, this, aVar, jVar.t, jVar.y);
        this.h = jA;
        jA.a(aVarA.a());
        com.five_corp.ad.internal.viewability.a aVar2 = new com.five_corp.ad.internal.viewability.a(context, lVar, jA);
        this.i = aVar2;
        this.s = new com.five_corp.ad.internal.beacon.i(lVar.b, aVar, this);
        if (frameLayout == null || lVar.e.b == null) {
            this.c = null;
        } else {
            com.five_corp.ad.internal.view.C1519l c1519l = new com.five_corp.ad.internal.view.C1519l(context, aVar, jA, this, lVar, lVar.c, aVar2, lVar.e.b, kVar);
            this.c = c1519l;
            frameLayout.addView(c1519l);
            c1519l.a();
            aVar2.a(c1519l);
        }
        com.five_corp.ad.internal.B b = new com.five_corp.ad.internal.B(d, jVar.q, jVar.b, cVar, jVar.u, lVar, jVar.B.get());
        this.o = b;
        com.five_corp.ad.internal.ad.a aVar3 = lVar.b;
        this.p = new com.five_corp.ad.internal.handler.a(context, b, aVar3.j, aVar);
        this.q = new com.five_corp.ad.internal.ad.o(context, lVar.f, aVar3.s, aVar3.k, jVar.s, this);
        bVar.a(oVar);
    }

    public static boolean a(android.content.Context context) {
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService("activity");
        if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
            java.lang.String packageName = context.getPackageName();
            for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.importance == 100 && runningAppProcessInfo.processName.equals(packageName)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.five_corp.ad.internal.layouter.d
    public final void b() {
        int currentPositionMs = this.h.getCurrentPositionMs();
        a(currentPositionMs);
        this.o.q(currentPositionMs, this.t);
    }

    @Override // com.five_corp.ad.internal.layouter.d
    public final void c() {
        this.h.g();
    }

    @Override // com.five_corp.ad.internal.layouter.d
    public final void d() {
        r();
    }

    @Override // com.five_corp.ad.internal.layouter.d
    public final void e() {
        k();
    }

    @Override // com.five_corp.ad.internal.layouter.d
    public final void f() {
        int currentPositionMs = this.h.getCurrentPositionMs();
        this.h.f();
        this.o.r(currentPositionMs, this.t);
    }

    @Override // com.five_corp.ad.internal.layouter.d
    public final void g() {
        this.x.a(4, "PLAY_IN_FULLSCREEN feature is currently not supported (AdController).");
        o();
    }

    public final void h() {
        com.five_corp.ad.internal.system.b bVar = this.g;
        com.five_corp.ad.internal.o oVar = this.f;
        com.five_corp.ad.internal.util.h hVar = bVar.f2066a;
        hVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.ref.WeakReference weakReference : hVar.f2086a) {
            java.lang.Object obj = weakReference.get();
            if (obj != null && obj != oVar) {
                arrayList.add(weakReference);
            }
        }
        hVar.f2086a = arrayList;
        this.h.e();
        com.five_corp.ad.internal.view.C1519l c1519l = this.c;
        android.view.ViewGroup viewGroup = c1519l != null ? (android.view.ViewGroup) c1519l.getParent() : null;
        com.five_corp.ad.internal.view.M.a(this.c);
        if (viewGroup != null) {
            viewGroup.requestLayout();
        }
        com.five_corp.ad.internal.context.l lVar = this.l;
        com.five_corp.ad.internal.context.j jVar = lVar.f1890a;
        synchronized (jVar) {
            jVar.b = false;
        }
        lVar.g.b = false;
    }

    public final void i() {
        if (this.v == null) {
            return;
        }
        int currentPositionMs = this.h.getCurrentPositionMs();
        h();
        com.five_corp.ad.internal.fullscreen.e eVar = this.v;
        if (!eVar.m.getAndSet(true)) {
            eVar.g.removeAllViews();
            eVar.k = null;
            eVar.l = null;
            eVar.f1903a.finish();
        }
        this.v = null;
        this.o.m(currentPositionMs, this.t);
    }

    public final void j() {
        if (this.v == null) {
            return;
        }
        int currentPositionMs = this.h.getCurrentPositionMs();
        a(currentPositionMs);
        com.five_corp.ad.internal.fullscreen.e eVar = this.v;
        if (!eVar.m.getAndSet(true)) {
            eVar.g.removeAllViews();
            eVar.k = null;
            eVar.l = null;
            eVar.f1903a.finish();
        }
        this.v = null;
        long j = currentPositionMs;
        this.o.m(j, this.t);
        if (this.l.f == com.five_corp.ad.internal.context.h.VIDEO_REWARD) {
            this.o.t(j, this.t);
        }
    }

    public final void k() {
        int iA;
        com.five_corp.ad.internal.B b = this.o;
        long currentPositionMs = this.h.getCurrentPositionMs();
        double d = this.t;
        com.five_corp.ad.internal.E e = b.d;
        com.five_corp.ad.internal.beacon.a aVar = new com.five_corp.ad.internal.beacon.a(b.g, 20, b.e.a(), currentPositionMs, d);
        aVar.m = false;
        java.lang.String strA = e.a(aVar);
        com.five_corp.ad.internal.ad.o oVar = this.q;
        com.five_corp.ad.internal.ad.m mVar = oVar.c;
        if (mVar == null || (iA = com.five_corp.ad.e.a(mVar.f1828a.f1826a)) == 0) {
            oVar.a(oVar.d);
        } else {
            if (iA != 1) {
                return;
            }
            oVar.b(strA);
        }
    }

    public final void l() {
        android.content.Context context = this.f1777a;
        if (com.five_corp.ad.internal.fullscreen.c.f1902a == null) {
            com.five_corp.ad.internal.fullscreen.c.f1902a = new com.five_corp.ad.internal.fullscreen.a();
        }
        com.five_corp.ad.internal.fullscreen.c.f1902a.a(context, this);
    }

    public final void m() {
        this.h.d();
        if (!this.r) {
            if (!this.j) {
                com.five_corp.ad.internal.http.auxcache.i iVar = this.e;
                iVar.f1915a.post(new com.five_corp.ad.internal.http.auxcache.c(iVar, this.l));
                this.j = true;
            }
            if (this.l.b.o != null) {
                this.k = this.l.b.o.longValue() + android.os.SystemClock.uptimeMillis();
            }
        }
        com.five_corp.ad.internal.system.m mVar = this.b.v;
        synchronized (mVar.f2074a) {
            com.five_corp.ad.internal.util.h hVar = mVar.d;
            hVar.getClass();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            hVar.a((java.util.AbstractCollection) arrayList);
            if (!arrayList.contains(this)) {
                mVar.d.f2086a.add(new java.lang.ref.WeakReference(this));
                if (mVar.e == null) {
                    java.util.Timer timer = new java.util.Timer();
                    mVar.e = timer;
                    com.five_corp.ad.internal.system.k kVar = new com.five_corp.ad.internal.system.k(mVar);
                    long j = mVar.c;
                    timer.schedule(kVar, j, j);
                }
            }
        }
    }

    public final void n() {
        this.k = Long.MAX_VALUE;
        this.h.e();
        com.five_corp.ad.internal.system.m mVar = this.b.v;
        synchronized (mVar.f2074a) {
            com.five_corp.ad.internal.util.h hVar = mVar.d;
            hVar.getClass();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.ref.WeakReference weakReference : hVar.f2086a) {
                java.lang.Object obj = weakReference.get();
                if (obj != null && obj != this) {
                    arrayList.add(weakReference);
                }
            }
            hVar.f2086a = arrayList;
            if (mVar.e != null) {
                com.five_corp.ad.internal.util.h hVar2 = mVar.d;
                hVar2.getClass();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                hVar2.a((java.util.AbstractCollection) arrayList2);
                if (arrayList2.isEmpty()) {
                    mVar.e.cancel();
                    mVar.e = null;
                }
            }
        }
        this.d.post(new java.lang.Runnable() { // from class: com.five_corp.ad.f$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.p();
            }
        });
    }

    public final void o() {
        int currentPositionMs = this.h.getCurrentPositionMs();
        try {
            this.p.a(currentPositionMs, this.t);
        } catch (java.lang.Exception e) {
            a(currentPositionMs, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.f4, null, e, null));
        }
    }

    @Override // com.five_corp.ad.AdActivity.Callback
    public final void onAdActivityBackPressed() {
        try {
            if (this.h.c()) {
                j();
            }
        } catch (java.lang.Exception e) {
            this.x.a(e);
        }
    }

    @Override // com.five_corp.ad.AdActivity.Callback
    public final void onAdActivityDestroy() {
        try {
            if (this.v != null) {
                int currentPositionMs = this.h.getCurrentPositionMs();
                a(currentPositionMs);
                com.five_corp.ad.internal.fullscreen.e eVar = this.v;
                if (!eVar.m.getAndSet(true)) {
                    eVar.g.removeAllViews();
                    eVar.k = null;
                    eVar.l = null;
                    eVar.f1903a.finish();
                }
                this.v = null;
                this.o.l(currentPositionMs, this.t);
            }
            this.o.e();
        } catch (java.lang.Exception e) {
            this.x.a(e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00c1 A[PHI: r15
  0x00c1: PHI (r15v1 java.util.Iterator) = (r15v0 java.util.Iterator), (r15v0 java.util.Iterator), (r15v4 java.util.Iterator), (r15v4 java.util.Iterator) binds: [B:45:0x00bf, B:42:0x00b6, B:35:0x00a2, B:32:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:52:0x00db  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e3 A[PHI: r15
  0x00e3: PHI (r15v3 java.util.Iterator) = (r15v0 java.util.Iterator), (r15v0 java.util.Iterator), (r15v4 java.util.Iterator), (r15v4 java.util.Iterator) binds: [B:45:0x00bf, B:42:0x00b6, B:35:0x00a2, B:32:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ee  */
    public final void p() {
        com.five_corp.ad.internal.viewability.b bVar;
        java.util.Iterator it;
        long j;
        com.five_corp.ad.internal.ad.beacon.a aVar;
        if (!this.r) {
            if (android.os.SystemClock.uptimeMillis() > this.k) {
                a(0, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.c4, null, null, null));
                return;
            }
            return;
        }
        com.five_corp.ad.internal.viewability.a aVar2 = this.i;
        synchronized (aVar2.g) {
            if (aVar2.h) {
                com.five_corp.ad.internal.util.h hVar = aVar2.i;
                hVar.getClass();
                java.util.HashSet hashSet = new java.util.HashSet();
                hVar.a((java.util.AbstractCollection) hashSet);
                bVar = aVar2.f != null ? new com.five_corp.ad.internal.viewability.b(aVar2.a(hashSet, aVar2.e), aVar2.a(hashSet, aVar2.f)) : new com.five_corp.ad.internal.viewability.b(aVar2.a(hashSet, aVar2.e), aVar2.a(hashSet, aVar2.e));
            } else {
                bVar = new com.five_corp.ad.internal.viewability.b(0.0d, 0.0d);
            }
        }
        this.t = java.lang.Math.max(this.t, bVar.f2115a);
        com.five_corp.ad.internal.beacon.i iVar = this.s;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Iterator it2 = iVar.f1852a.iterator();
        while (it2.hasNext()) {
            com.five_corp.ad.internal.beacon.d dVar = (com.five_corp.ad.internal.beacon.d) it2.next();
            if (!dVar.f) {
                com.five_corp.ad.internal.ad.beacon.a aVar3 = dVar.b;
                if (aVar3.f1791a != 2) {
                    continue;
                } else {
                    com.five_corp.ad.internal.ad.beacon.j jVar = aVar3.d;
                    int iA = com.five_corp.ad.e.a(jVar.f1796a);
                    if (iA == 0) {
                        it = it2;
                        double d = bVar.f2115a;
                        double d2 = jVar.b;
                        if (d2 > 0.0d ? d >= java.lang.Math.min(d2, 0.99d) : d > 0.0d) {
                            if (dVar.e) {
                                dVar.d += jCurrentTimeMillis - dVar.c;
                            } else {
                                dVar.e = true;
                            }
                            j = dVar.d;
                            aVar = dVar.b;
                            if (j >= aVar.c) {
                                dVar.f = true;
                                dVar.g.a(j, aVar);
                            }
                        } else if (dVar.e) {
                            if (dVar.b.b == 2) {
                                dVar.d = 0L;
                            }
                            dVar.e = false;
                        }
                    } else {
                        if (iA != 1) {
                            throw new java.lang.RuntimeException();
                        }
                        it = it2;
                        double d3 = bVar.b;
                        double d4 = jVar.b;
                        if (d4 > 0.0d ? d3 >= java.lang.Math.min(d4, 0.99d) : d3 > 0.0d) {
                            if (dVar.e) {
                                dVar.d += jCurrentTimeMillis - dVar.c;
                            } else {
                                dVar.e = true;
                            }
                            j = dVar.d;
                            aVar = dVar.b;
                            if (j >= aVar.c) {
                                dVar.f = true;
                                dVar.g.a(j, aVar);
                            }
                        } else if (dVar.e) {
                            if (dVar.b.b == 2) {
                                dVar.d = 0L;
                            }
                            dVar.e = false;
                        }
                    }
                    dVar.c = jCurrentTimeMillis;
                    it2 = it;
                }
            }
        }
        this.h.a(bVar);
    }

    public final boolean q() {
        int i;
        synchronized (this.m) {
            i = this.u;
        }
        if (i != 1) {
            a(0, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.d4, null, null, null));
            return false;
        }
        this.d.post(new java.lang.Runnable() { // from class: com.five_corp.ad.f$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.l();
            }
        });
        return true;
    }

    public final void r() {
        com.five_corp.ad.internal.soundstate.a aVar;
        java.util.ArrayList arrayList;
        com.five_corp.ad.internal.soundstate.c cVar = this.n;
        boolean z = !cVar.a().a();
        synchronized (cVar.f2047a) {
            com.five_corp.ad.internal.soundstate.a aVar2 = cVar.b;
            aVar = new com.five_corp.ad.internal.soundstate.a(z ? 2 : 3, aVar2.b, aVar2.c, aVar2.d);
            cVar.b = aVar;
            com.five_corp.ad.internal.util.h hVar = cVar.c;
            hVar.getClass();
            arrayList = new java.util.ArrayList();
            hVar.a((java.util.AbstractCollection) arrayList);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.five_corp.ad.f) ((com.five_corp.ad.internal.soundstate.b) it.next())).b(aVar);
        }
    }

    public final void a(int i) {
        int i2;
        synchronized (this.m) {
            i2 = this.u;
            if (i2 == 1 || i2 == 3) {
                this.u = 2;
            }
        }
        if (i2 != 1 && i2 != 3) {
            a(i, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.a4, "CurrentState: ".concat(com.five_corp.ad.d.a(i2)), null, null));
        } else {
            h();
            this.y.onAdControllerClose();
        }
    }

    public final void b(final com.five_corp.ad.internal.soundstate.a aVar) {
        this.d.post(new java.lang.Runnable() { // from class: com.five_corp.ad.f$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(aVar);
            }
        });
    }

    public final void a(com.five_corp.ad.internal.soundstate.a aVar) {
        boolean zA = aVar.a();
        this.h.a(zA);
        com.five_corp.ad.internal.layouter.k kVar = this.w;
        com.five_corp.ad.internal.layouter.i iVar = kVar.b;
        kVar.a(com.five_corp.ad.internal.layouter.i.a(iVar.f1944a, iVar.c, iVar.e, zA, iVar.g));
    }

    public final void b(java.lang.String str) {
        com.five_corp.ad.internal.B b = this.o;
        long currentPositionMs = this.h.getCurrentPositionMs();
        double d = this.t;
        b.getClass();
        b.a(15, currentPositionMs, d, null, java.util.Collections.singletonMap(androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_TO, str));
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str));
        intent.setFlags(268435456);
        this.f1777a.startActivity(intent);
    }

    @Override // com.five_corp.ad.internal.layouter.d
    public final void a(java.lang.String str) {
        b(str);
    }

    @Override // com.five_corp.ad.internal.layouter.d
    public final void a() {
        o();
    }

    @Override // com.five_corp.ad.internal.layouter.d
    public final void a(com.five_corp.ad.internal.s sVar) {
        a(this.h.getCurrentPositionMs(), sVar);
    }

    public final void a(int i, com.five_corp.ad.internal.s sVar) {
        synchronized (this.m) {
            if (this.u == 3) {
                return;
            }
            this.u = 3;
            this.o.b(sVar, i);
            this.d.post(new java.lang.Runnable() { // from class: com.five_corp.ad.f$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.i();
                }
            });
            this.y.onAdControllerError();
        }
    }
}
