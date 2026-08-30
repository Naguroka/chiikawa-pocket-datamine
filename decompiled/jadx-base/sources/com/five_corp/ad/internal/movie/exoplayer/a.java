package com.five_corp.ad.internal.movie.exoplayer;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements com.five_corp.ad.internal.movie.G, com.five_corp.ad.internal.movie.exoplayer.b, com.five_corp.ad.internal.movie.exoplayer.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.five_corp.ad.internal.movie.exoplayer.m f1966a;
    public final android.os.Handler b = new android.os.Handler(android.os.Looper.getMainLooper());
    public final com.five_corp.ad.internal.movie.F c;

    public a(com.five_corp.ad.internal.movie.exoplayer.o oVar, com.five_corp.ad.internal.movie.F f) {
        this.c = f;
        oVar.a(this);
        this.f1966a = new com.five_corp.ad.internal.movie.exoplayer.f(oVar, this, 0, true);
    }

    @Override // com.five_corp.ad.internal.movie.G
    public final int a() {
        return this.f1966a.b();
    }

    @Override // com.five_corp.ad.internal.movie.G
    public final void b() {
        this.b.post(new java.lang.Runnable() { // from class: com.five_corp.ad.internal.movie.exoplayer.a$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.c();
            }
        });
    }

    public final /* synthetic */ void c() {
        this.f1966a = this.f1966a.a();
    }

    public final /* synthetic */ void d() {
        this.f1966a = this.f1966a.c();
    }

    public final /* synthetic */ void e() {
        this.f1966a = this.f1966a.d();
    }

    public final /* synthetic */ void f() {
        this.f1966a = this.f1966a.e();
    }

    public final /* synthetic */ void g() {
        this.f1966a = this.f1966a.f();
    }

    public final /* synthetic */ void h() {
        this.f1966a = this.f1966a.g();
    }

    public final /* synthetic */ void i() {
        this.f1966a = this.f1966a.h();
    }

    public final /* synthetic */ void j() {
        this.f1966a = this.f1966a.i();
    }

    public final void k() {
        this.b.post(new java.lang.Runnable() { // from class: com.five_corp.ad.internal.movie.exoplayer.a$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.d();
            }
        });
    }

    public final void l() {
        this.b.post(new java.lang.Runnable() { // from class: com.five_corp.ad.internal.movie.exoplayer.a$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.e();
            }
        });
    }

    public final void m() {
        this.b.post(new java.lang.Runnable() { // from class: com.five_corp.ad.internal.movie.exoplayer.a$$ExternalSyntheticLambda17
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.f();
            }
        });
    }

    public final void n() {
        android.os.Handler handler = this.b;
        final com.five_corp.ad.internal.movie.F f = this.c;
        java.util.Objects.requireNonNull(f);
        handler.post(new java.lang.Runnable() { // from class: com.five_corp.ad.internal.movie.exoplayer.a$$ExternalSyntheticLambda16
            @Override // java.lang.Runnable
            public final void run() {
                f.a();
            }
        });
    }

    public final void o() {
        android.os.Handler handler = this.b;
        final com.five_corp.ad.internal.movie.F f = this.c;
        java.util.Objects.requireNonNull(f);
        handler.post(new java.lang.Runnable() { // from class: com.five_corp.ad.internal.movie.exoplayer.a$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                f.b();
            }
        });
    }

    @Override // com.five_corp.ad.internal.movie.G
    public final void pause() {
        this.b.post(new java.lang.Runnable() { // from class: com.five_corp.ad.internal.movie.exoplayer.a$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.g();
            }
        });
    }

    @Override // com.five_corp.ad.internal.movie.G
    public final void prepare() {
        this.b.post(new java.lang.Runnable() { // from class: com.five_corp.ad.internal.movie.exoplayer.a$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.h();
            }
        });
    }

    @Override // com.five_corp.ad.internal.movie.G
    public final void release() {
        this.b.post(new java.lang.Runnable() { // from class: com.five_corp.ad.internal.movie.exoplayer.a$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.i();
            }
        });
    }

    @Override // com.five_corp.ad.internal.movie.G
    public final void start() {
        this.b.post(new java.lang.Runnable() { // from class: com.five_corp.ad.internal.movie.exoplayer.a$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.j();
            }
        });
    }

    public final /* synthetic */ void a(com.five_corp.ad.internal.s sVar) {
        this.f1966a = this.f1966a.a(sVar);
    }

    public final /* synthetic */ void b(int i) {
        ((com.five_corp.ad.internal.view.G) this.c).b(i);
    }

    public final void c(int i) {
        com.five_corp.ad.f fVar = (com.five_corp.ad.f) ((com.five_corp.ad.internal.view.G) this.c).d;
        fVar.o.p(i, fVar.t);
    }

    public final /* synthetic */ void d(int i) {
        ((com.five_corp.ad.internal.view.G) this.c).c(i);
    }

    public final void e(int i) {
        com.five_corp.ad.f fVar = (com.five_corp.ad.f) ((com.five_corp.ad.internal.view.G) this.c).d;
        fVar.s.a();
        fVar.o.u(i, fVar.t);
    }

    public final void f(final int i) {
        this.b.post(new java.lang.Runnable() { // from class: com.five_corp.ad.internal.movie.exoplayer.a$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(i);
            }
        });
    }

    public final void g(final int i) {
        this.b.post(new java.lang.Runnable() { // from class: com.five_corp.ad.internal.movie.exoplayer.a$$ExternalSyntheticLambda15
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(i);
            }
        });
    }

    public final void h(final int i) {
        this.b.post(new java.lang.Runnable() { // from class: com.five_corp.ad.internal.movie.exoplayer.a$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.c(i);
            }
        });
    }

    public final void i(final int i) {
        this.b.post(new java.lang.Runnable() { // from class: com.five_corp.ad.internal.movie.exoplayer.a$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.d(i);
            }
        });
    }

    public final void j(final int i) {
        this.b.post(new java.lang.Runnable() { // from class: com.five_corp.ad.internal.movie.exoplayer.a$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.e(i);
            }
        });
    }

    public final /* synthetic */ void a(int i) {
        ((com.five_corp.ad.internal.view.G) this.c).a(i);
    }

    public final /* synthetic */ void b(boolean z) {
        this.f1966a.a(z);
    }

    public final void a(int i, com.five_corp.ad.internal.s sVar) {
        ((com.five_corp.ad.internal.view.G) this.c).a(sVar);
    }

    public final void b(final com.five_corp.ad.internal.s sVar) {
        this.b.post(new java.lang.Runnable() { // from class: com.five_corp.ad.internal.movie.exoplayer.a$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(sVar);
            }
        });
    }

    @Override // com.five_corp.ad.internal.movie.G
    public final void a(final boolean z) {
        this.b.post(new java.lang.Runnable() { // from class: com.five_corp.ad.internal.movie.exoplayer.a$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(z);
            }
        });
    }

    public final void b(final int i, final com.five_corp.ad.internal.s sVar) {
        this.b.post(new java.lang.Runnable() { // from class: com.five_corp.ad.internal.movie.exoplayer.a$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(i, sVar);
            }
        });
    }
}
