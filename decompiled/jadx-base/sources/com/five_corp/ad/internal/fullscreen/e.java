package com.five_corp.ad.internal.fullscreen;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements com.five_corp.ad.internal.layouter.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.five_corp.ad.AdActivity f1903a;
    public final android.view.View b;
    public final com.five_corp.ad.internal.context.l c;
    public final com.five_corp.ad.internal.ad.fullscreen.j d;
    public final com.five_corp.ad.internal.K e;
    public final com.five_corp.ad.internal.logger.a f;
    public final android.widget.FrameLayout g;
    public final android.os.Handler h;
    public final com.five_corp.ad.internal.fullscreen.d i;
    public final com.five_corp.ad.internal.viewability.a j;
    public com.five_corp.ad.internal.view.C1520m k;
    public com.five_corp.ad.internal.view.C1520m l;
    public final java.util.concurrent.atomic.AtomicBoolean m = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final com.five_corp.ad.internal.layouter.k n;

    public e(com.five_corp.ad.AdActivity adActivity, com.five_corp.ad.internal.view.J j, com.five_corp.ad.internal.context.l lVar, com.five_corp.ad.internal.ad.fullscreen.j jVar, com.five_corp.ad.f fVar, com.five_corp.ad.internal.K k, com.five_corp.ad.internal.logger.a aVar, com.five_corp.ad.internal.viewability.a aVar2, com.five_corp.ad.internal.layouter.k kVar) {
        this.f1903a = adActivity;
        this.b = j;
        this.c = lVar;
        this.d = jVar;
        this.i = fVar;
        this.e = k;
        this.f = aVar;
        this.j = aVar2;
        int iA = com.five_corp.ad.internal.view.M.a(jVar.d);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(adActivity);
        this.g = frameLayout;
        frameLayout.setBackgroundColor(iA);
        this.h = new android.os.Handler(android.os.Looper.getMainLooper());
        this.n = kVar;
    }

    public static int a(com.five_corp.ad.AdActivity adActivity, int i) {
        int rotation = ((android.view.WindowManager) adActivity.getSystemService("window")).getDefaultDisplay().getRotation();
        int iA = com.five_corp.ad.e.a(i);
        if (iA != 0) {
            if (iA == 1) {
                return rotation != 3 ? 0 : 8;
            }
            if (iA != 2) {
                return -1;
            }
            return rotation != 2 ? 1 : 9;
        }
        if (rotation == 1) {
            return 0;
        }
        if (rotation != 2) {
            return rotation != 3 ? 1 : 8;
        }
        return 9;
    }

    public final void b() {
        try {
            this.l.a();
            this.g.addView(this.l);
        } catch (java.lang.Exception e) {
            com.five_corp.ad.internal.s sVar = new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.R6, null, e, null);
            com.five_corp.ad.f fVar = (com.five_corp.ad.f) this.i;
            fVar.a(fVar.h.getCurrentPositionMs(), sVar);
        }
    }

    public final void c() {
        this.g.removeAllViews();
        this.l = null;
        this.k = new com.five_corp.ad.internal.view.C1520m(this.f1903a, this.e, this.f, this.b, this.c, new com.five_corp.ad.internal.layouter.g(this.d.b.f1817a), this, this.j, this.n);
        com.five_corp.ad.AdActivity adActivity = this.f1903a;
        com.five_corp.ad.internal.ad.fullscreen.j jVar = this.d;
        int i = jVar.f1819a;
        if (i == 0) {
            i = jVar.b.f1817a.f1818a;
        }
        this.f1903a.setRequestedOrientation(a(adActivity, i));
        this.h.post(new java.lang.Runnable() { // from class: com.five_corp.ad.internal.fullscreen.e$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a();
            }
        });
    }

    public final void d() {
        this.g.removeAllViews();
        this.k = null;
        this.l = new com.five_corp.ad.internal.view.C1520m(this.f1903a, this.e, this.f, this.b, this.c, new com.five_corp.ad.internal.layouter.g(this.d.c.f1820a), this, this.j, this.n);
        com.five_corp.ad.AdActivity adActivity = this.f1903a;
        com.five_corp.ad.internal.ad.fullscreen.j jVar = this.d;
        int i = jVar.f1819a;
        if (i == 0) {
            i = jVar.b.f1817a.f1818a;
        }
        this.f1903a.setRequestedOrientation(a(adActivity, i));
        this.h.post(new java.lang.Runnable() { // from class: com.five_corp.ad.internal.fullscreen.e$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b();
            }
        });
    }

    public final void a() {
        try {
            this.k.a();
            this.g.addView(this.k);
        } catch (java.lang.Exception e) {
            com.five_corp.ad.internal.s sVar = new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.Q6, null, e, null);
            com.five_corp.ad.f fVar = (com.five_corp.ad.f) this.i;
            fVar.a(fVar.h.getCurrentPositionMs(), sVar);
        }
    }
}
