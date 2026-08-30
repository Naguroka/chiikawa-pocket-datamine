package com.five_corp.ad.internal.movie;

/* JADX INFO: loaded from: classes4.dex */
public final class x implements com.five_corp.ad.internal.movie.G, com.five_corp.ad.internal.movie.partialcache.InterfaceC1469g, com.five_corp.ad.internal.movie.L, com.five_corp.ad.internal.movie.partialcache.video.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.os.Handler f2039a;
    public final com.five_corp.ad.internal.movie.F b;
    public final long c;
    public final com.five_corp.ad.internal.ad.q d;
    public final com.five_corp.ad.internal.view.D e;
    public final com.five_corp.ad.internal.movie.M f;
    public final com.five_corp.ad.internal.movie.partialcache.u1 g;
    public final com.five_corp.ad.internal.movie.partialcache.C1471h h;
    public final com.five_corp.ad.internal.movie.partialcache.audio.c i;
    public final com.five_corp.ad.internal.movie.partialcache.audio.d j;
    public final com.five_corp.ad.internal.movie.partialcache.video.d k;
    public final com.five_corp.ad.internal.movie.partialcache.video.e l;
    public final com.five_corp.ad.internal.movie.partialcache.C1459b m;
    public final android.os.Handler n;
    public int o;
    public long p;
    public java.lang.Object q;

    public x(com.five_corp.ad.internal.movie.F f, com.five_corp.ad.internal.cache.o oVar, com.five_corp.ad.internal.context.l lVar, com.five_corp.ad.internal.http.movcache.h hVar, com.five_corp.ad.internal.view.D d, android.view.TextureView textureView, android.os.Looper looper, com.five_corp.ad.internal.logger.a aVar) {
        java.lang.System.identityHashCode(this);
        this.f2039a = new android.os.Handler(android.os.Looper.getMainLooper());
        this.o = 1;
        this.q = null;
        android.os.Handler handler = new android.os.Handler(looper);
        this.n = handler;
        this.b = f;
        this.c = a(lVar.b.h);
        this.d = lVar.b.i;
        this.e = d;
        d.a();
        com.five_corp.ad.internal.movie.M m = new com.five_corp.ad.internal.movie.M(textureView, aVar);
        this.f = m;
        m.a(this, handler);
        this.g = new com.five_corp.ad.internal.movie.partialcache.u1(aVar, oVar, lVar, hVar, this, looper);
        this.h = new com.five_corp.ad.internal.movie.partialcache.C1471h(this);
        com.five_corp.ad.internal.movie.partialcache.audio.d dVar = new com.five_corp.ad.internal.movie.partialcache.audio.d();
        this.j = dVar;
        com.five_corp.ad.internal.movie.partialcache.video.e eVar = new com.five_corp.ad.internal.movie.partialcache.video.e();
        this.l = eVar;
        com.five_corp.ad.internal.movie.partialcache.C1459b c1459b = new com.five_corp.ad.internal.movie.partialcache.C1459b(dVar, eVar);
        this.m = c1459b;
        this.i = new com.five_corp.ad.internal.movie.partialcache.audio.c(handler.getLooper(), c1459b, this);
        this.k = new com.five_corp.ad.internal.movie.partialcache.video.d(handler.getLooper(), c1459b, this);
    }

    public static void a(com.five_corp.ad.internal.movie.x xVar, com.five_corp.ad.internal.movie.partialcache.C1459b c1459b) {
        xVar.getClass();
        if (xVar.a(c1459b.b + xVar.c)) {
            java.lang.Object obj = xVar.q;
            if (obj != null) {
                xVar.n.removeCallbacksAndMessages(obj);
                xVar.q = null;
            }
            int i = xVar.o;
            if (i == 11) {
                xVar.o = 6;
                xVar.f.b();
                com.five_corp.ad.internal.view.D d = xVar.e;
                d.e.post(new com.five_corp.ad.internal.view.B(d));
                xVar.f2039a.post(new com.five_corp.ad.internal.movie.RunnableC1447d(xVar));
                return;
            }
            if (i == 12) {
                xVar.o = 5;
                com.five_corp.ad.internal.view.D d2 = xVar.e;
                d2.e.post(new com.five_corp.ad.internal.view.B(d2));
                xVar.f2039a.post(new com.five_corp.ad.internal.movie.RunnableC1447d(xVar));
            }
        }
    }

    @Override // com.five_corp.ad.internal.movie.G
    public final void b() {
        this.n.post(new com.five_corp.ad.internal.movie.RunnableC1455l(this, new com.five_corp.ad.internal.movie.q(this)));
    }

    @Override // com.five_corp.ad.internal.movie.L
    public final void c() {
        int iA = com.five_corp.ad.e.a(this.o);
        if (iA == 3) {
            this.o = 3;
        } else {
            if (iA != 6 && iA != 7 && iA != 8) {
                return;
            }
            this.o = 6;
            this.h.a();
            com.five_corp.ad.internal.view.D d = this.e;
            d.e.post(new com.five_corp.ad.internal.view.y(d));
            this.i.a(this.m);
        }
        com.five_corp.ad.internal.movie.partialcache.video.d dVar = this.k;
        com.five_corp.ad.internal.movie.partialcache.C1459b c1459b = this.m;
        dVar.getClass();
        com.five_corp.ad.internal.movie.partialcache.video.d.a(c1459b);
    }

    @Override // com.five_corp.ad.internal.movie.G
    public final void pause() {
        this.n.post(new com.five_corp.ad.internal.movie.RunnableC1455l(this, new com.five_corp.ad.internal.movie.s(this)));
    }

    @Override // com.five_corp.ad.internal.movie.G
    public final void prepare() {
        this.n.post(new com.five_corp.ad.internal.movie.RunnableC1455l(this, new com.five_corp.ad.internal.movie.p(this)));
    }

    @Override // com.five_corp.ad.internal.movie.G
    public final void release() {
    }

    @Override // com.five_corp.ad.internal.movie.G
    public final void start() {
        this.n.post(new com.five_corp.ad.internal.movie.RunnableC1455l(this, new com.five_corp.ad.internal.movie.r(this)));
    }

    public final boolean a(long j) {
        boolean z;
        boolean z2;
        while (true) {
            com.five_corp.ad.internal.movie.partialcache.audio.d dVar = this.j;
            if (!dVar.c || dVar.d || dVar.e >= j) {
                z = true;
                break;
            }
            com.five_corp.ad.internal.movie.partialcache.x1 x1VarA = this.g.a();
            if (x1VarA == null) {
                z = false;
                break;
            }
            this.j.a(x1VarA);
        }
        while (true) {
            com.five_corp.ad.internal.movie.partialcache.video.e eVar = this.l;
            if (eVar.e || eVar.f >= j) {
                z2 = true;
                break;
            }
            com.five_corp.ad.internal.movie.partialcache.x1 x1VarB = this.g.b();
            if (x1VarB == null) {
                z2 = false;
                break;
            }
            this.l.a(x1VarB);
        }
        return z && z2;
    }

    @Override // com.five_corp.ad.internal.movie.G
    public final int a() {
        return (int) (this.m.b / 1000);
    }

    public static long a(com.five_corp.ad.internal.ad.u uVar) {
        return uVar == null ? androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor.DEFAULT_MAX_SILENCE_TO_KEEP_DURATION_US : uVar.f1833a * 1000;
    }

    public final void a(com.five_corp.ad.internal.s sVar) {
        this.n.postAtFrontOfQueue(new com.five_corp.ad.internal.movie.o(this, new com.five_corp.ad.internal.movie.C1454k(this, sVar)));
    }

    @Override // com.five_corp.ad.internal.movie.L
    public final void a(android.view.Surface surface) {
        int i = this.o;
        if (i == 3) {
            com.five_corp.ad.internal.movie.partialcache.video.d dVar = this.k;
            com.five_corp.ad.internal.movie.partialcache.C1459b c1459b = this.m;
            dVar.getClass();
            c1459b.f.c();
            c1459b.e.a(surface, c1459b.b);
            this.o = 4;
            return;
        }
        if (i == 6) {
            com.five_corp.ad.internal.movie.partialcache.video.d dVar2 = this.k;
            com.five_corp.ad.internal.movie.partialcache.C1459b c1459b2 = this.m;
            dVar2.getClass();
            c1459b2.f.c();
            c1459b2.e.a(surface, c1459b2.b);
            this.o = 7;
        }
    }

    @Override // com.five_corp.ad.internal.movie.G
    public final void a(boolean z) {
        this.n.post(new com.five_corp.ad.internal.movie.RunnableC1455l(this, new com.five_corp.ad.internal.movie.t(this, z)));
    }
}
