package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class ck extends com.applovin.impl.d2 implements com.applovin.impl.qh {
    private int A;
    private int B;
    private com.applovin.impl.m5 C;
    private com.applovin.impl.m5 D;
    private int E;
    private com.applovin.impl.l1 F;
    private float G;
    private boolean H;
    private java.util.List I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private com.applovin.impl.q6 N;
    private com.applovin.impl.xq O;
    protected final com.applovin.impl.qi[] b;
    private final com.applovin.impl.c4 c;
    private final android.content.Context d;
    private final com.applovin.impl.b8 e;
    private final com.applovin.impl.ck.c f;
    private final com.applovin.impl.ck.d g;
    private final java.util.concurrent.CopyOnWriteArraySet h;
    private final com.applovin.impl.r0 i;
    private final com.applovin.impl.m1 j;
    private final com.applovin.impl.o1 k;
    private final com.applovin.impl.il l;
    private final com.applovin.impl.gr m;
    private final com.applovin.impl.cs n;
    private final long o;
    private com.applovin.impl.e9 p;
    private com.applovin.impl.e9 q;
    private android.media.AudioTrack r;
    private java.lang.Object s;
    private android.view.Surface t;
    private android.view.SurfaceHolder u;
    private com.applovin.impl.rk v;
    private boolean w;
    private android.view.TextureView x;
    private int y;
    private int z;

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(boolean z, int i) {
        return (!z || i == 1) ? 1 : 2;
    }

    static /* synthetic */ com.applovin.impl.uh k(com.applovin.impl.ck ckVar) {
        ckVar.getClass();
        return null;
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.content.Context f683a;
        private final com.applovin.impl.ti b;
        private com.applovin.impl.l3 c;
        private long d;
        private com.applovin.impl.vo e;
        private com.applovin.impl.ce f;
        private com.applovin.impl.kc g;
        private com.applovin.impl.y1 h;
        private com.applovin.impl.r0 i;
        private android.os.Looper j;
        private com.applovin.impl.l1 k;
        private boolean l;
        private int m;
        private boolean n;
        private boolean o;
        private int p;
        private int q;
        private boolean r;
        private com.applovin.impl.jj s;
        private long t;
        private long u;
        private com.applovin.impl.jc v;
        private long w;
        private long x;
        private boolean y;
        private boolean z;

        static /* synthetic */ com.applovin.impl.uh m(com.applovin.impl.ck.b bVar) {
            bVar.getClass();
            return null;
        }

        public b(android.content.Context context) {
            this(context, new com.applovin.impl.j6(context), new com.applovin.impl.b6());
        }

        public b(android.content.Context context, com.applovin.impl.ti tiVar, com.applovin.impl.n8 n8Var) {
            this(context, tiVar, new com.applovin.impl.l6(context), new com.applovin.impl.h6(context, n8Var), new com.applovin.impl.e6(), com.applovin.impl.s5.a(context), new com.applovin.impl.r0(com.applovin.impl.l3.f976a));
        }

        public b(android.content.Context context, com.applovin.impl.ti tiVar, com.applovin.impl.vo voVar, com.applovin.impl.ce ceVar, com.applovin.impl.kc kcVar, com.applovin.impl.y1 y1Var, com.applovin.impl.r0 r0Var) {
            this.f683a = context;
            this.b = tiVar;
            this.e = voVar;
            this.f = ceVar;
            this.g = kcVar;
            this.h = y1Var;
            this.i = r0Var;
            this.j = com.applovin.impl.xp.d();
            this.k = com.applovin.impl.l1.g;
            this.m = 0;
            this.p = 1;
            this.q = 0;
            this.r = true;
            this.s = com.applovin.impl.jj.g;
            this.t = 5000L;
            this.u = androidx.media3.common.C.DEFAULT_SEEK_FORWARD_INCREMENT_MS;
            this.v = new com.applovin.impl.d6.b().a();
            this.c = com.applovin.impl.l3.f976a;
            this.w = 500L;
            this.x = 2000L;
        }

        public com.applovin.impl.ck a() {
            com.applovin.impl.b1.b(!this.z);
            this.z = true;
            return new com.applovin.impl.ck(this);
        }
    }

    protected ck(com.applovin.impl.ck.b bVar) throws java.lang.Throwable {
        com.applovin.impl.ck ckVar;
        com.applovin.impl.c4 c4Var = new com.applovin.impl.c4();
        this.c = c4Var;
        try {
            android.content.Context applicationContext = bVar.f683a.getApplicationContext();
            this.d = applicationContext;
            com.applovin.impl.r0 r0Var = bVar.i;
            this.i = r0Var;
            com.applovin.impl.ck.b.m(bVar);
            this.F = bVar.k;
            this.y = bVar.p;
            this.z = bVar.q;
            this.H = bVar.o;
            this.o = bVar.x;
            com.applovin.impl.ck.c cVar = new com.applovin.impl.ck.c();
            this.f = cVar;
            com.applovin.impl.ck.d dVar = new com.applovin.impl.ck.d();
            this.g = dVar;
            this.h = new java.util.concurrent.CopyOnWriteArraySet();
            android.os.Handler handler = new android.os.Handler(bVar.j);
            com.applovin.impl.qi[] qiVarArrA = bVar.b.a(handler, cVar, cVar, cVar, cVar);
            this.b = qiVarArrA;
            this.G = 1.0f;
            if (com.applovin.impl.xp.f1515a < 21) {
                this.E = d(0);
            } else {
                this.E = com.applovin.impl.t2.a(applicationContext);
            }
            this.I = java.util.Collections.emptyList();
            this.J = true;
            try {
                com.applovin.impl.b8 b8Var = new com.applovin.impl.b8(qiVarArrA, bVar.e, bVar.f, bVar.g, bVar.h, r0Var, bVar.r, bVar.s, bVar.t, bVar.u, bVar.v, bVar.w, bVar.y, bVar.c, bVar.j, this, new com.applovin.impl.qh.b.a().a(20, 21, 22, 23, 24, 25, 26, 27).a());
                ckVar = this;
                try {
                    ckVar.e = b8Var;
                    b8Var.a((com.applovin.impl.qh.c) cVar);
                    b8Var.a((com.applovin.impl.a8) cVar);
                    if (bVar.d > 0) {
                        b8Var.c(bVar.d);
                    }
                    com.applovin.impl.m1 m1Var = new com.applovin.impl.m1(bVar.f683a, handler, cVar);
                    ckVar.j = m1Var;
                    m1Var.a(bVar.n);
                    com.applovin.impl.o1 o1Var = new com.applovin.impl.o1(bVar.f683a, handler, cVar);
                    ckVar.k = o1Var;
                    o1Var.b(bVar.l ? ckVar.F : null);
                    com.applovin.impl.il ilVar = new com.applovin.impl.il(bVar.f683a, handler, cVar);
                    ckVar.l = ilVar;
                    ilVar.a(com.applovin.impl.xp.e(ckVar.F.c));
                    com.applovin.impl.gr grVar = new com.applovin.impl.gr(bVar.f683a);
                    ckVar.m = grVar;
                    grVar.a(bVar.m != 0);
                    com.applovin.impl.cs csVar = new com.applovin.impl.cs(bVar.f683a);
                    ckVar.n = csVar;
                    csVar.a(bVar.m == 2);
                    ckVar.N = b(ilVar);
                    ckVar.O = com.applovin.impl.xq.f;
                    ckVar.a(1, 10, java.lang.Integer.valueOf(ckVar.E));
                    ckVar.a(2, 10, java.lang.Integer.valueOf(ckVar.E));
                    ckVar.a(1, 3, ckVar.F);
                    ckVar.a(2, 4, java.lang.Integer.valueOf(ckVar.y));
                    ckVar.a(2, 5, java.lang.Integer.valueOf(ckVar.z));
                    ckVar.a(1, 9, java.lang.Boolean.valueOf(ckVar.H));
                    ckVar.a(2, 7, dVar);
                    ckVar.a(6, 8, dVar);
                    c4Var.e();
                } catch (java.lang.Throwable th) {
                    th = th;
                    ckVar.c.e();
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                ckVar = this;
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            ckVar = this;
        }
    }

    public boolean S() {
        Z();
        return this.e.S();
    }

    @Override // com.applovin.impl.qh
    public com.applovin.impl.xq z() {
        return this.O;
    }

    public void R() {
        Z();
        W();
        a((java.lang.Object) null);
        a(0, 0);
    }

    public void c(android.view.SurfaceHolder surfaceHolder) {
        Z();
        if (surfaceHolder == null) {
            R();
            return;
        }
        W();
        this.w = true;
        this.u = surfaceHolder;
        surfaceHolder.addCallback(this.f);
        android.view.Surface surface = surfaceHolder.getSurface();
        if (surface != null && surface.isValid()) {
            a(surface);
            android.graphics.Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            a(surfaceFrame.width(), surfaceFrame.height());
        } else {
            a((java.lang.Object) null);
            a(0, 0);
        }
    }

    @Override // com.applovin.impl.qh
    public java.util.List x() {
        Z();
        return this.I;
    }

    @Override // com.applovin.impl.qh
    public android.os.Looper p() {
        return this.e.p();
    }

    @Override // com.applovin.impl.qh
    public int o() {
        Z();
        return this.e.o();
    }

    @Override // com.applovin.impl.qh
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public com.applovin.impl.z7 c() {
        Z();
        return this.e.c();
    }

    @Override // com.applovin.impl.qh
    public int j() {
        Z();
        return this.e.j();
    }

    @Override // com.applovin.impl.qh
    public com.applovin.impl.qh.b i() {
        Z();
        return this.e.i();
    }

    @Override // com.applovin.impl.qh
    public int m() {
        Z();
        return this.e.m();
    }

    @Override // com.applovin.impl.qh
    public boolean r() {
        Z();
        return this.e.r();
    }

    @Override // com.applovin.impl.qh
    public long F() {
        Z();
        return this.e.F();
    }

    @Override // com.applovin.impl.qh
    public long q() {
        Z();
        return this.e.q();
    }

    @Override // com.applovin.impl.qh
    public void b(com.applovin.impl.qh.e eVar) {
        com.applovin.impl.b1.a(eVar);
        this.h.add(eVar);
        a((com.applovin.impl.qh.c) eVar);
    }

    @Override // com.applovin.impl.qh
    public boolean l() {
        Z();
        return this.e.l();
    }

    public void V() {
        android.media.AudioTrack audioTrack;
        Z();
        if (com.applovin.impl.xp.f1515a < 21 && (audioTrack = this.r) != null) {
            audioTrack.release();
            this.r = null;
        }
        this.j.a(false);
        this.l.c();
        this.m.b(false);
        this.n.b(false);
        this.k.e();
        this.e.W();
        this.i.i();
        W();
        android.view.Surface surface = this.t;
        if (surface != null) {
            surface.release();
            this.t = null;
        }
        if (!this.L) {
            this.I = java.util.Collections.emptyList();
            this.M = true;
        } else {
            com.applovin.impl.c8.a(com.applovin.impl.b1.a((java.lang.Object) null));
            throw null;
        }
    }

    @Override // com.applovin.impl.qh
    public long e() {
        Z();
        return this.e.e();
    }

    @Override // com.applovin.impl.qh
    public com.applovin.impl.to A() {
        Z();
        return this.e.A();
    }

    @Override // com.applovin.impl.qh
    public com.applovin.impl.ud C() {
        return this.e.C();
    }

    @Override // com.applovin.impl.qh
    public com.applovin.impl.fo n() {
        Z();
        return this.e.n();
    }

    @Override // com.applovin.impl.qh
    public int v() {
        Z();
        return this.e.v();
    }

    @Override // com.applovin.impl.qh
    public int t() {
        Z();
        return this.e.t();
    }

    @Override // com.applovin.impl.qh
    public long getDuration() {
        Z();
        return this.e.getDuration();
    }

    @Override // com.applovin.impl.qh
    public long getCurrentPosition() {
        Z();
        return this.e.getCurrentPosition();
    }

    @Override // com.applovin.impl.qh
    public int E() {
        Z();
        return this.e.E();
    }

    @Override // com.applovin.impl.qh
    public com.applovin.impl.po k() {
        Z();
        return this.e.k();
    }

    @Override // com.applovin.impl.qh
    public long s() {
        Z();
        return this.e.s();
    }

    @Override // com.applovin.impl.qh
    public long h() {
        Z();
        return this.e.h();
    }

    @Override // com.applovin.impl.qh
    public int f() {
        Z();
        return this.e.f();
    }

    @Override // com.applovin.impl.qh
    public long g() {
        Z();
        return this.e.g();
    }

    private void W() {
        if (this.v != null) {
            this.e.a(this.g).a(10000).a((java.lang.Object) null).j();
            this.v.b(this.f);
            this.v = null;
        }
        android.view.TextureView textureView = this.x;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f) {
                com.applovin.impl.oc.d("SimpleExoPlayer", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.x.setSurfaceTextureListener(null);
            }
            this.x = null;
        }
        android.view.SurfaceHolder surfaceHolder = this.u;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f);
            this.u = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X() {
        a(1, 2, java.lang.Float.valueOf(this.G * this.k.d()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U() {
        this.i.a(this.H);
        java.util.Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((com.applovin.impl.qh.e) it.next()).a(this.H);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y() {
        int iO = o();
        if (iO != 1) {
            if (iO == 2 || iO == 3) {
                this.m.b(l() && !S());
                this.n.b(l());
                return;
            } else if (iO != 4) {
                throw new java.lang.IllegalStateException();
            }
        }
        this.m.b(false);
        this.n.b(false);
    }

    private void Z() {
        this.c.b();
        if (java.lang.Thread.currentThread() != p().getThread()) {
            java.lang.String strA = com.applovin.impl.xp.a("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", java.lang.Thread.currentThread().getName(), p().getThread().getName());
            if (!this.J) {
                com.applovin.impl.oc.c("SimpleExoPlayer", strA, this.K ? null : new java.lang.IllegalStateException());
                this.K = true;
                return;
            }
            throw new java.lang.IllegalStateException(strA);
        }
    }

    private final class c implements com.applovin.impl.wq, com.applovin.impl.q1, com.applovin.impl.ao, com.applovin.impl.ef, android.view.SurfaceHolder.Callback, android.view.TextureView.SurfaceTextureListener, com.applovin.impl.rk.b, com.applovin.impl.o1.b, com.applovin.impl.m1.b, com.applovin.impl.il.b, com.applovin.impl.qh.c, com.applovin.impl.a8 {
        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
        }

        private c() {
        }

        @Override // com.applovin.impl.q1
        public void a(java.lang.String str, long j, long j2) {
            com.applovin.impl.ck.this.i.a(str, j, j2);
        }

        @Override // com.applovin.impl.q1
        public void b(java.lang.String str) {
            com.applovin.impl.ck.this.i.b(str);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
            if (com.applovin.impl.ck.this.w) {
                com.applovin.impl.ck.this.a(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            com.applovin.impl.ck.this.a(i2, i3);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
            if (com.applovin.impl.ck.this.w) {
                com.applovin.impl.ck.this.a((java.lang.Object) null);
            }
            com.applovin.impl.ck.this.a(0, 0);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i, int i2) {
            com.applovin.impl.ck.this.a(surfaceTexture);
            com.applovin.impl.ck.this.a(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i, int i2) {
            com.applovin.impl.ck.this.a(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
            com.applovin.impl.ck.this.a((java.lang.Object) null);
            com.applovin.impl.ck.this.a(0, 0);
            return true;
        }

        @Override // com.applovin.impl.o1.b
        public void f(int i) {
            boolean zL = com.applovin.impl.ck.this.l();
            com.applovin.impl.ck.this.a(zL, i, com.applovin.impl.ck.b(zL, i));
        }

        @Override // com.applovin.impl.m1.b
        public void c() {
            com.applovin.impl.ck.this.a(false, -1, 3);
        }

        @Override // com.applovin.impl.il.b
        public void d(int i) {
            com.applovin.impl.q6 q6VarB = com.applovin.impl.ck.b(com.applovin.impl.ck.this.l);
            if (q6VarB.equals(com.applovin.impl.ck.this.N)) {
                return;
            }
            com.applovin.impl.ck.this.N = q6VarB;
            java.util.Iterator it = com.applovin.impl.ck.this.h.iterator();
            while (it.hasNext()) {
                ((com.applovin.impl.qh.e) it.next()).a(q6VarB);
            }
        }

        @Override // com.applovin.impl.a8
        public void g(boolean z) {
            com.applovin.impl.ck.this.Y();
        }

        @Override // com.applovin.impl.q1
        public void a(com.applovin.impl.m5 m5Var) {
            com.applovin.impl.ck.this.D = m5Var;
            com.applovin.impl.ck.this.i.a(m5Var);
        }

        @Override // com.applovin.impl.q1
        public void b(com.applovin.impl.e9 e9Var, com.applovin.impl.p5 p5Var) {
            com.applovin.impl.ck.this.q = e9Var;
            com.applovin.impl.ck.this.i.b(e9Var, p5Var);
        }

        @Override // com.applovin.impl.wq
        public void d(com.applovin.impl.m5 m5Var) {
            com.applovin.impl.ck.this.C = m5Var;
            com.applovin.impl.ck.this.i.d(m5Var);
        }

        @Override // com.applovin.impl.q1
        public void c(java.lang.Exception exc) {
            com.applovin.impl.ck.this.i.c(exc);
        }

        @Override // com.applovin.impl.q1
        public void a(long j) {
            com.applovin.impl.ck.this.i.a(j);
        }

        @Override // com.applovin.impl.q1
        public void b(int i, long j, long j2) {
            com.applovin.impl.ck.this.i.b(i, j, j2);
        }

        @Override // com.applovin.impl.q1
        public void c(com.applovin.impl.m5 m5Var) {
            com.applovin.impl.ck.this.i.c(m5Var);
            com.applovin.impl.ck.this.q = null;
            com.applovin.impl.ck.this.D = null;
        }

        @Override // com.applovin.impl.q1
        public void a(java.lang.Exception exc) {
            com.applovin.impl.ck.this.i.a(exc);
        }

        @Override // com.applovin.impl.qh.c
        public void b(int i) {
            com.applovin.impl.ck.this.Y();
        }

        @Override // com.applovin.impl.qh.c
        public void c(boolean z) {
            com.applovin.impl.ck.k(com.applovin.impl.ck.this);
        }

        @Override // com.applovin.impl.ao
        public void a(java.util.List list) {
            com.applovin.impl.ck.this.I = list;
            java.util.Iterator it = com.applovin.impl.ck.this.h.iterator();
            while (it.hasNext()) {
                ((com.applovin.impl.qh.e) it.next()).a(list);
            }
        }

        @Override // com.applovin.impl.wq
        public void b(java.lang.Exception exc) {
            com.applovin.impl.ck.this.i.b(exc);
        }

        @Override // com.applovin.impl.wq
        public void a(int i, long j) {
            com.applovin.impl.ck.this.i.a(i, j);
        }

        @Override // com.applovin.impl.wq
        public void b(java.lang.String str, long j, long j2) {
            com.applovin.impl.ck.this.i.b(str, j, j2);
        }

        @Override // com.applovin.impl.ef
        public void a(com.applovin.impl.af afVar) {
            com.applovin.impl.ck.this.i.a(afVar);
            com.applovin.impl.ck.this.e.a(afVar);
            java.util.Iterator it = com.applovin.impl.ck.this.h.iterator();
            while (it.hasNext()) {
                ((com.applovin.impl.qh.e) it.next()).a(afVar);
            }
        }

        @Override // com.applovin.impl.wq
        public void b(com.applovin.impl.m5 m5Var) {
            com.applovin.impl.ck.this.i.b(m5Var);
            com.applovin.impl.ck.this.p = null;
            com.applovin.impl.ck.this.C = null;
        }

        @Override // com.applovin.impl.rk.b
        public void b(android.view.Surface surface) {
            com.applovin.impl.ck.this.a(surface);
        }

        @Override // com.applovin.impl.qh.c
        public void a(boolean z, int i) {
            com.applovin.impl.ck.this.Y();
        }

        @Override // com.applovin.impl.wq
        public void a(java.lang.Object obj, long j) {
            com.applovin.impl.ck.this.i.a(obj, j);
            if (com.applovin.impl.ck.this.s == obj) {
                java.util.Iterator it = com.applovin.impl.ck.this.h.iterator();
                while (it.hasNext()) {
                    ((com.applovin.impl.qh.e) it.next()).a();
                }
            }
        }

        @Override // com.applovin.impl.o1.b
        public void b(float f) {
            com.applovin.impl.ck.this.X();
        }

        @Override // com.applovin.impl.q1
        public void a(boolean z) {
            if (com.applovin.impl.ck.this.H == z) {
                return;
            }
            com.applovin.impl.ck.this.H = z;
            com.applovin.impl.ck.this.U();
        }

        @Override // com.applovin.impl.il.b
        public void a(int i, boolean z) {
            java.util.Iterator it = com.applovin.impl.ck.this.h.iterator();
            while (it.hasNext()) {
                ((com.applovin.impl.qh.e) it.next()).b(i, z);
            }
        }

        @Override // com.applovin.impl.wq
        public void a(java.lang.String str) {
            com.applovin.impl.ck.this.i.a(str);
        }

        @Override // com.applovin.impl.wq
        public void a(long j, int i) {
            com.applovin.impl.ck.this.i.a(j, i);
        }

        @Override // com.applovin.impl.wq
        public void a(com.applovin.impl.e9 e9Var, com.applovin.impl.p5 p5Var) {
            com.applovin.impl.ck.this.p = e9Var;
            com.applovin.impl.ck.this.i.a(e9Var, p5Var);
        }

        @Override // com.applovin.impl.wq
        public void a(com.applovin.impl.xq xqVar) {
            com.applovin.impl.ck.this.O = xqVar;
            com.applovin.impl.ck.this.i.a(xqVar);
            java.util.Iterator it = com.applovin.impl.ck.this.h.iterator();
            while (it.hasNext()) {
                ((com.applovin.impl.qh.e) it.next()).a(xqVar);
            }
        }

        @Override // com.applovin.impl.rk.b
        public void a(android.view.Surface surface) {
            com.applovin.impl.ck.this.a((java.lang.Object) null);
        }
    }

    private int d(int i) {
        android.media.AudioTrack audioTrack = this.r;
        if (audioTrack != null && audioTrack.getAudioSessionId() != i) {
            this.r.release();
            this.r = null;
        }
        if (this.r == null) {
            this.r = new android.media.AudioTrack(3, 4000, 4, 2, 2, 0, i);
        }
        return this.r.getAudioSessionId();
    }

    @Override // com.applovin.impl.qh
    public void b(android.view.SurfaceView surfaceView) {
        Z();
        a(surfaceView == null ? null : surfaceView.getHolder());
    }

    private static final class d implements com.applovin.impl.uq, com.applovin.impl.v2, com.applovin.impl.rh.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.applovin.impl.uq f685a;
        private com.applovin.impl.v2 b;
        private com.applovin.impl.uq c;
        private com.applovin.impl.v2 d;

        private d() {
        }

        @Override // com.applovin.impl.rh.b
        public void a(int i, java.lang.Object obj) {
            if (i == 7) {
                this.f685a = (com.applovin.impl.uq) obj;
                return;
            }
            if (i == 8) {
                this.b = (com.applovin.impl.v2) obj;
                return;
            }
            if (i != 10000) {
                return;
            }
            com.applovin.impl.rk rkVar = (com.applovin.impl.rk) obj;
            if (rkVar == null) {
                this.c = null;
                this.d = null;
            } else {
                this.c = rkVar.getVideoFrameMetadataListener();
                this.d = rkVar.getCameraMotionListener();
            }
        }

        @Override // com.applovin.impl.v2
        public void a(long j, float[] fArr) {
            com.applovin.impl.v2 v2Var = this.d;
            if (v2Var != null) {
                v2Var.a(j, fArr);
            }
            com.applovin.impl.v2 v2Var2 = this.b;
            if (v2Var2 != null) {
                v2Var2.a(j, fArr);
            }
        }

        @Override // com.applovin.impl.v2
        public void a() {
            com.applovin.impl.v2 v2Var = this.d;
            if (v2Var != null) {
                v2Var.a();
            }
            com.applovin.impl.v2 v2Var2 = this.b;
            if (v2Var2 != null) {
                v2Var2.a();
            }
        }

        @Override // com.applovin.impl.uq
        public void a(long j, long j2, com.applovin.impl.e9 e9Var, android.media.MediaFormat mediaFormat) {
            com.applovin.impl.uq uqVar = this.c;
            if (uqVar != null) {
                uqVar.a(j, j2, e9Var, mediaFormat);
            }
            com.applovin.impl.uq uqVar2 = this.f685a;
            if (uqVar2 != null) {
                uqVar2.a(j, j2, e9Var, mediaFormat);
            }
        }
    }

    public void a(com.applovin.impl.qh.c cVar) {
        com.applovin.impl.b1.a(cVar);
        this.e.a(cVar);
    }

    @Override // com.applovin.impl.qh
    public void b(android.view.TextureView textureView) {
        Z();
        if (textureView == null || textureView != this.x) {
            return;
        }
        R();
    }

    public void a(android.view.SurfaceHolder surfaceHolder) {
        Z();
        if (surfaceHolder == null || surfaceHolder != this.u) {
            return;
        }
        R();
    }

    @Override // com.applovin.impl.qh
    public boolean d() {
        Z();
        return this.e.d();
    }

    @Override // com.applovin.impl.qh
    public void b() {
        Z();
        boolean zL = l();
        int iA = this.k.a(zL, 2);
        a(zL, iA, b(zL, iA));
        this.e.b();
    }

    @Override // com.applovin.impl.qh
    public com.applovin.impl.ph a() {
        Z();
        return this.e.a();
    }

    public void b(com.applovin.impl.qh.c cVar) {
        this.e.e(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, int i2) {
        if (i == this.A && i2 == this.B) {
            return;
        }
        this.A = i;
        this.B = i2;
        this.i.a(i, i2);
        java.util.Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((com.applovin.impl.qh.e) it.next()).a(i, i2);
        }
    }

    private void b(android.view.SurfaceHolder surfaceHolder) {
        this.w = false;
        this.u = surfaceHolder;
        surfaceHolder.addCallback(this.f);
        android.view.Surface surface = this.u.getSurface();
        if (surface != null && surface.isValid()) {
            android.graphics.Rect surfaceFrame = this.u.getSurfaceFrame();
            a(surfaceFrame.width(), surfaceFrame.height());
        } else {
            a(0, 0);
        }
    }

    @Override // com.applovin.impl.qh
    public void a(com.applovin.impl.qh.e eVar) {
        com.applovin.impl.b1.a(eVar);
        this.h.remove(eVar);
        b((com.applovin.impl.qh.c) eVar);
    }

    @Override // com.applovin.impl.qh
    public void b(boolean z) {
        Z();
        this.e.b(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.applovin.impl.q6 b(com.applovin.impl.il ilVar) {
        return new com.applovin.impl.q6(0, ilVar.b(), ilVar.a());
    }

    @Override // com.applovin.impl.qh
    public void a(int i, long j) {
        Z();
        this.i.h();
        this.e.a(i, j);
    }

    private void a(int i, int i2, java.lang.Object obj) {
        for (com.applovin.impl.qi qiVar : this.b) {
            if (qiVar.e() == i) {
                this.e.a(qiVar).a(i2).a(obj).j();
            }
        }
    }

    public void a(com.applovin.impl.ae aeVar) {
        Z();
        this.e.a(aeVar);
    }

    @Override // com.applovin.impl.qh
    public void a(boolean z) {
        Z();
        int iA = this.k.a(z, o());
        a(z, iA, b(z, iA));
    }

    @Override // com.applovin.impl.qh
    public void a(int i) {
        Z();
        this.e.a(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(android.graphics.SurfaceTexture surfaceTexture) {
        android.view.Surface surface = new android.view.Surface(surfaceTexture);
        a(surface);
        this.t = surface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(java.lang.Object obj) {
        boolean z;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.applovin.impl.qi[] qiVarArr = this.b;
        int length = qiVarArr.length;
        int i = 0;
        while (true) {
            z = true;
            if (i >= length) {
                break;
            }
            com.applovin.impl.qi qiVar = qiVarArr[i];
            if (qiVar.e() == 2) {
                arrayList.add(this.e.a(qiVar).a(1).a(obj).j());
            }
            i++;
        }
        java.lang.Object obj2 = this.s;
        if (obj2 == null || obj2 == obj) {
            z = false;
        } else {
            try {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((com.applovin.impl.rh) it.next()).a(this.o);
                }
            } catch (java.lang.InterruptedException unused) {
                java.lang.Thread.currentThread().interrupt();
            } catch (java.util.concurrent.TimeoutException unused2) {
            }
            z = false;
            java.lang.Object obj3 = this.s;
            android.view.Surface surface = this.t;
            if (obj3 == surface) {
                surface.release();
                this.t = null;
            }
        }
        this.s = obj;
        if (z) {
            this.e.a(false, com.applovin.impl.z7.a(new com.applovin.impl.f8(3), 1003));
        }
    }

    @Override // com.applovin.impl.qh
    public void a(android.view.SurfaceView surfaceView) {
        Z();
        if (surfaceView instanceof com.applovin.impl.tq) {
            W();
            a((java.lang.Object) surfaceView);
            b(surfaceView.getHolder());
        } else {
            if (surfaceView instanceof com.applovin.impl.rk) {
                W();
                this.v = (com.applovin.impl.rk) surfaceView;
                this.e.a(this.g).a(10000).a(this.v).j();
                this.v.a(this.f);
                a(this.v.getVideoSurface());
                b(surfaceView.getHolder());
                return;
            }
            c(surfaceView == null ? null : surfaceView.getHolder());
        }
    }

    @Override // com.applovin.impl.qh
    public void a(android.view.TextureView textureView) {
        Z();
        if (textureView == null) {
            R();
            return;
        }
        W();
        this.x = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            com.applovin.impl.oc.d("SimpleExoPlayer", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f);
        android.graphics.SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            a((java.lang.Object) null);
            a(0, 0);
        } else {
            a(surfaceTexture);
            a(textureView.getWidth(), textureView.getHeight());
        }
    }

    public void a(float f) {
        Z();
        float fA = com.applovin.impl.xp.a(f, 0.0f, 1.0f);
        if (this.G == fA) {
            return;
        }
        this.G = fA;
        X();
        this.i.a(fA);
        java.util.Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((com.applovin.impl.qh.e) it.next()).a(fA);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, int i, int i2) {
        int i3 = 0;
        boolean z2 = z && i != -1;
        if (z2 && i != 1) {
            i3 = 1;
        }
        this.e.a(z2, i3, i2);
    }
}
