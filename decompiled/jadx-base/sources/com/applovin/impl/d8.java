package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class d8 implements android.os.Handler.Callback, com.applovin.impl.vd.a, com.applovin.impl.vo.a, com.applovin.impl.ee.d, com.applovin.impl.g6.a, com.applovin.impl.rh.a {
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private int F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private int K;
    private com.applovin.impl.d8.h L;
    private long M;
    private int N;
    private boolean O;
    private com.applovin.impl.z7 P;
    private long Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.qi[] f710a;
    private final java.util.Set b;
    private final com.applovin.impl.ri[] c;
    private final com.applovin.impl.vo d;
    private final com.applovin.impl.wo f;
    private final com.applovin.impl.kc g;
    private final com.applovin.impl.y1 h;
    private final com.applovin.impl.ia i;
    private final android.os.HandlerThread j;
    private final android.os.Looper k;
    private final com.applovin.impl.fo.d l;
    private final com.applovin.impl.fo.b m;
    private final long n;
    private final boolean o;
    private final com.applovin.impl.g6 p;
    private final java.util.ArrayList q;
    private final com.applovin.impl.l3 r;
    private final com.applovin.impl.d8.f s;
    private final com.applovin.impl.zd t;
    private final com.applovin.impl.ee u;
    private final com.applovin.impl.jc v;
    private final long w;
    private com.applovin.impl.jj x;
    private com.applovin.impl.oh y;
    private com.applovin.impl.d8.e z;

    private static class c {
    }

    public interface f {
        void a(com.applovin.impl.d8.e eVar);
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f714a;
        public com.applovin.impl.oh b;
        public int c;
        public boolean d;
        public int e;
        public boolean f;
        public int g;

        public e(com.applovin.impl.oh ohVar) {
            this.b = ohVar;
        }

        public void c(int i) {
            if (this.d && this.e != 5) {
                com.applovin.impl.b1.a(i == 5);
                return;
            }
            this.f714a = true;
            this.d = true;
            this.e = i;
        }

        public void b(int i) {
            this.f714a = true;
            this.f = true;
            this.g = i;
        }

        public void a(int i) {
            this.f714a |= i > 0;
            this.c += i;
        }

        public void a(com.applovin.impl.oh ohVar) {
            this.f714a |= this.b != ohVar;
            this.b = ohVar;
        }
    }

    public d8(com.applovin.impl.qi[] qiVarArr, com.applovin.impl.vo voVar, com.applovin.impl.wo woVar, com.applovin.impl.kc kcVar, com.applovin.impl.y1 y1Var, int i, boolean z, com.applovin.impl.r0 r0Var, com.applovin.impl.jj jjVar, com.applovin.impl.jc jcVar, long j, boolean z2, android.os.Looper looper, com.applovin.impl.l3 l3Var, com.applovin.impl.d8.f fVar) {
        this.s = fVar;
        this.f710a = qiVarArr;
        this.d = voVar;
        this.f = woVar;
        this.g = kcVar;
        this.h = y1Var;
        this.F = i;
        this.G = z;
        this.x = jjVar;
        this.v = jcVar;
        this.w = j;
        this.Q = j;
        this.B = z2;
        this.r = l3Var;
        this.n = kcVar.d();
        this.o = kcVar.a();
        com.applovin.impl.oh ohVarA = com.applovin.impl.oh.a(woVar);
        this.y = ohVarA;
        this.z = new com.applovin.impl.d8.e(ohVarA);
        this.c = new com.applovin.impl.ri[qiVarArr.length];
        for (int i2 = 0; i2 < qiVarArr.length; i2++) {
            qiVarArr[i2].b(i2);
            this.c[i2] = qiVarArr[i2].n();
        }
        this.p = new com.applovin.impl.g6(this, l3Var);
        this.q = new java.util.ArrayList();
        this.b = com.applovin.impl.rj.b();
        this.l = new com.applovin.impl.fo.d();
        this.m = new com.applovin.impl.fo.b();
        voVar.a(this, y1Var);
        this.O = true;
        android.os.Handler handler = new android.os.Handler(looper);
        this.t = new com.applovin.impl.zd(r0Var, handler);
        this.u = new com.applovin.impl.ee(this, r0Var, handler);
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("ExoPlayer:Playback", -16);
        this.j = handlerThread;
        handlerThread.start();
        android.os.Looper looper2 = handlerThread.getLooper();
        this.k = looper2;
        this.i = l3Var.a(looper2, this);
    }

    private void a(com.applovin.impl.wj wjVar) throws java.lang.Throwable {
        this.z.a(1);
        a(this.u.a(wjVar), false);
    }

    public void v() {
        this.i.d(0).a();
    }

    public void G() {
        this.i.d(6).a();
    }

    public synchronized boolean x() {
        if (!this.A && this.j.isAlive()) {
            this.i.c(7);
            a(new com.applovin.exoplayer2.common.base.Supplier() { // from class: com.applovin.impl.d8$$ExternalSyntheticLambda1
                @Override // com.applovin.exoplayer2.common.base.Supplier
                public final java.lang.Object get() {
                    return this.f$0.l();
                }
            }, this.w);
            return this.A;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Boolean l() {
        return java.lang.Boolean.valueOf(this.A);
    }

    public android.os.Looper g() {
        return this.k;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) throws java.lang.Throwable {
        com.applovin.impl.wd wdVarF;
        int i = 1000;
        try {
            switch (message.what) {
                case 0:
                    w();
                    break;
                case 1:
                    a(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    c();
                    break;
                case 3:
                    a((com.applovin.impl.d8.h) message.obj);
                    break;
                case 4:
                    b((com.applovin.impl.ph) message.obj);
                    break;
                case 5:
                    a((com.applovin.impl.jj) message.obj);
                    break;
                case 6:
                    a(false, true);
                    break;
                case 7:
                    y();
                    return true;
                case 8:
                    c((com.applovin.impl.vd) message.obj);
                    break;
                case 9:
                    b((com.applovin.impl.vd) message.obj);
                    break;
                case 10:
                    A();
                    break;
                case 11:
                    b(message.arg1);
                    break;
                case 12:
                    g(message.arg1 != 0);
                    break;
                case 13:
                    a(message.arg1 != 0, (java.util.concurrent.atomic.AtomicBoolean) message.obj);
                    break;
                case 14:
                    d((com.applovin.impl.rh) message.obj);
                    break;
                case 15:
                    f((com.applovin.impl.rh) message.obj);
                    break;
                case 16:
                    a((com.applovin.impl.ph) message.obj, false);
                    break;
                case 17:
                    a((com.applovin.impl.d8.b) message.obj);
                    break;
                case 18:
                    a((com.applovin.impl.d8.b) message.obj, message.arg1);
                    break;
                case 19:
                    com.applovin.impl.c8.a(message.obj);
                    a((com.applovin.impl.d8.c) null);
                    break;
                case 20:
                    a(message.arg1, message.arg2, (com.applovin.impl.wj) message.obj);
                    break;
                case 21:
                    a((com.applovin.impl.wj) message.obj);
                    break;
                case 22:
                    s();
                    break;
                case 23:
                    e(message.arg1 != 0);
                    break;
                case 24:
                    d(message.arg1 == 1);
                    break;
                case 25:
                    b();
                    break;
                default:
                    return false;
            }
        } catch (com.applovin.impl.ch e2) {
            int i2 = e2.b;
            if (i2 == 1) {
                i = e2.f679a ? 3001 : 3003;
            } else if (i2 == 4) {
                i = e2.f679a ? 3002 : 3004;
            }
            a(e2, i);
        } catch (com.applovin.impl.i5 e3) {
            a(e3, e3.f874a);
        } catch (com.applovin.impl.y6.a e4) {
            a(e4, e4.f1531a);
        } catch (com.applovin.impl.z7 e5) {
            e = e5;
            if (e.d == 1 && (wdVarF = this.t.f()) != null) {
                e = e.a(wdVarF.f.f1538a);
            }
            if (e.k && this.P == null) {
                com.applovin.impl.oc.c("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.P = e;
                com.applovin.impl.ia iaVar = this.i;
                iaVar.a(iaVar.a(25, e));
            } else {
                com.applovin.impl.z7 z7Var = this.P;
                if (z7Var != null) {
                    z7Var.addSuppressed(e);
                    e = this.P;
                }
                com.applovin.impl.oc.a("ExoPlayerImplInternal", "Playback error", e);
                a(true, false);
                this.y = this.y.a(e);
            }
        } catch (java.io.IOException e6) {
            a(e6, 2000);
        } catch (java.lang.RuntimeException e7) {
            com.applovin.impl.z7 z7VarA = com.applovin.impl.z7.a(e7, ((e7 instanceof java.lang.IllegalStateException) || (e7 instanceof java.lang.IllegalArgumentException)) ? 1004 : 1000);
            com.applovin.impl.oc.a("ExoPlayerImplInternal", "Playback error", z7VarA);
            a(true, false);
            this.y = this.y.a(z7VarA);
        }
        n();
        return true;
    }

    private void n() {
        this.z.a(this.y);
        if (this.z.f714a) {
            this.s.a(this.z);
            this.z = new com.applovin.impl.d8.e(this.y);
        }
    }

    private void w() {
        this.z.a(1);
        a(false, false, false, true);
        this.g.f();
        c(this.y.f1125a.c() ? 4 : 2);
        this.u.a(this.h.a());
        this.i.c(2);
    }

    private void s() throws java.lang.Throwable {
        a(this.u.a(), true);
    }

    private void a(com.applovin.impl.d8.b bVar, int i) throws java.lang.Throwable {
        this.z.a(1);
        com.applovin.impl.ee eeVar = this.u;
        if (i == -1) {
            i = eeVar.c();
        }
        a(eeVar.a(i, bVar.f712a, bVar.b), false);
    }

    private void F() {
        this.D = false;
        this.p.b();
        for (com.applovin.impl.qi qiVar : this.f710a) {
            if (c(qiVar)) {
                qiVar.start();
            }
        }
    }

    private void H() {
        this.p.c();
        for (com.applovin.impl.qi qiVar : this.f710a) {
            if (c(qiVar)) {
                b(qiVar);
            }
        }
    }

    private void b() throws com.applovin.impl.z7 {
        c(true);
    }

    private void K() {
        com.applovin.impl.wd wdVarE = this.t.e();
        if (wdVarE == null) {
            return;
        }
        long jH = wdVarE.d ? wdVarE.f1464a.h() : -9223372036854775807L;
        if (jH != androidx.media3.common.C.TIME_UNSET) {
            c(jH);
            if (jH != this.y.s) {
                com.applovin.impl.oh ohVar = this.y;
                this.y = a(ohVar.b, jH, ohVar.c, jH, true, 5);
            }
        } else {
            long jB = this.p.b(wdVarE != this.t.f());
            this.M = jB;
            long jD = wdVarE.d(jB);
            b(this.y.s, jD);
            this.y.s = jD;
        }
        this.y.q = this.t.d().c();
        this.y.r = h();
        com.applovin.impl.oh ohVar2 = this.y;
        if (ohVar2.l && ohVar2.e == 3 && a(ohVar2.f1125a, ohVar2.b) && this.y.n.f1145a == 1.0f) {
            float fA = this.v.a(e(), h());
            if (this.p.a().f1145a != fA) {
                this.p.a(this.y.n.a(fA));
                a(this.y.n, this.p.a().f1145a, false, false);
            }
        }
    }

    private void u() {
        for (com.applovin.impl.wd wdVarE = this.t.e(); wdVarE != null; wdVarE = wdVarE.d()) {
            for (com.applovin.impl.g8 g8Var : wdVarE.i().c) {
                if (g8Var != null) {
                    g8Var.k();
                }
            }
        }
    }

    private void c() throws com.applovin.impl.z7 {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        long jA = this.r.a();
        J();
        int i2 = this.y.e;
        if (i2 != 1 && i2 != 4) {
            com.applovin.impl.wd wdVarE = this.t.e();
            if (wdVarE == null) {
                c(jA, 10L);
                return;
            }
            com.applovin.impl.ko.a("doSomeWork");
            K();
            if (wdVarE.d) {
                long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() * 1000;
                wdVarE.f1464a.a(this.y.s - this.n, this.o);
                z = true;
                z2 = true;
                int i3 = 0;
                while (true) {
                    com.applovin.impl.qi[] qiVarArr = this.f710a;
                    if (i3 >= qiVarArr.length) {
                        break;
                    }
                    com.applovin.impl.qi qiVar = qiVarArr[i3];
                    if (c(qiVar)) {
                        qiVar.a(this.M, jElapsedRealtime);
                        z = z && qiVar.c();
                        boolean z4 = wdVarE.c[i3] != qiVar.o();
                        boolean z5 = z4 || (!z4 && qiVar.j()) || qiVar.d() || qiVar.c();
                        z2 = z2 && z5;
                        if (!z5) {
                            qiVar.h();
                        }
                    }
                    i3++;
                }
            } else {
                wdVarE.f1464a.f();
                z = true;
                z2 = true;
            }
            long j = wdVarE.f.e;
            boolean z6 = z && wdVarE.d && (j == androidx.media3.common.C.TIME_UNSET || j <= this.y.s);
            if (z6 && this.C) {
                this.C = false;
                a(false, this.y.m, false, 5);
            }
            if (z6 && wdVarE.f.i) {
                c(4);
                H();
            } else if (this.y.e == 2 && h(z2)) {
                c(3);
                this.P = null;
                if (E()) {
                    F();
                }
            } else if (this.y.e == 3 && (this.K != 0 ? !z2 : !k())) {
                this.D = E();
                c(2);
                if (this.D) {
                    u();
                    this.v.a();
                }
                H();
            }
            if (this.y.e == 2) {
                int i4 = 0;
                while (true) {
                    com.applovin.impl.qi[] qiVarArr2 = this.f710a;
                    if (i4 >= qiVarArr2.length) {
                        break;
                    }
                    if (c(qiVarArr2[i4]) && this.f710a[i4].o() == wdVarE.c[i4]) {
                        this.f710a[i4].h();
                    }
                    i4++;
                }
                com.applovin.impl.oh ohVar = this.y;
                if (!ohVar.g && ohVar.r < 500000 && j()) {
                    throw new java.lang.IllegalStateException("Playback stuck buffering and not loading");
                }
            }
            boolean z7 = this.J;
            com.applovin.impl.oh ohVar2 = this.y;
            if (z7 != ohVar2.o) {
                this.y = ohVar2.b(z7);
            }
            if ((E() && this.y.e == 3) || (i = this.y.e) == 2) {
                z3 = !a(jA, 10L);
            } else {
                if (this.K != 0 && i != 4) {
                    c(jA, 1000L);
                } else {
                    this.i.b(2);
                }
                z3 = false;
            }
            com.applovin.impl.oh ohVar3 = this.y;
            if (ohVar3.p != z3) {
                this.y = ohVar3.c(z3);
            }
            this.I = false;
            com.applovin.impl.ko.a();
            return;
        }
        this.i.b(2);
    }

    private long e() {
        com.applovin.impl.oh ohVar = this.y;
        return a(ohVar.f1125a, ohVar.b.f1504a, ohVar.s);
    }

    private void g(boolean z) throws com.applovin.impl.z7 {
        this.G = z;
        if (!this.t.a(this.y.f1125a, z)) {
            c(true);
        }
        a(false);
    }

    private void y() {
        a(true, false, true, false);
        this.g.e();
        c(1);
        this.j.quit();
        synchronized (this) {
            this.A = true;
            notifyAll();
        }
    }

    private boolean a(com.applovin.impl.fo foVar, com.applovin.impl.ae.a aVar) {
        if (aVar.a() || foVar.c()) {
            return false;
        }
        foVar.a(foVar.a(aVar.f1504a, this.m).c, this.l);
        if (!this.l.e()) {
            return false;
        }
        com.applovin.impl.fo.d dVar = this.l;
        return dVar.j && dVar.g != androidx.media3.common.C.TIME_UNSET;
    }

    private void A() throws com.applovin.impl.z7 {
        float f2 = this.p.a().f1145a;
        com.applovin.impl.wd wdVarF = this.t.f();
        boolean z = true;
        for (com.applovin.impl.wd wdVarE = this.t.e(); wdVarE != null && wdVarE.d; wdVarE = wdVarE.d()) {
            com.applovin.impl.wo woVarB = wdVarE.b(f2, this.y.f1125a);
            if (!woVarB.a(wdVarE.i())) {
                if (z) {
                    com.applovin.impl.wd wdVarE2 = this.t.e();
                    boolean zA = this.t.a(wdVarE2);
                    boolean[] zArr = new boolean[this.f710a.length];
                    long jA = wdVarE2.a(woVarB, this.y.s, zA, zArr);
                    com.applovin.impl.oh ohVar = this.y;
                    boolean z2 = (ohVar.e == 4 || jA == ohVar.s) ? false : true;
                    com.applovin.impl.oh ohVar2 = this.y;
                    this.y = a(ohVar2.b, jA, ohVar2.c, ohVar2.d, z2, 5);
                    if (z2) {
                        c(jA);
                    }
                    boolean[] zArr2 = new boolean[this.f710a.length];
                    int i = 0;
                    while (true) {
                        com.applovin.impl.qi[] qiVarArr = this.f710a;
                        if (i >= qiVarArr.length) {
                            break;
                        }
                        com.applovin.impl.qi qiVar = qiVarArr[i];
                        boolean zC = c(qiVar);
                        zArr2[i] = zC;
                        com.applovin.impl.cj cjVar = wdVarE2.c[i];
                        if (zC) {
                            if (cjVar != qiVar.o()) {
                                a(qiVar);
                            } else if (zArr[i]) {
                                qiVar.a(this.M);
                            }
                        }
                        i++;
                    }
                    a(zArr2);
                } else {
                    this.t.a(wdVarE);
                    if (wdVarE.d) {
                        wdVarE.a(woVarB, java.lang.Math.max(wdVarE.f.b, wdVarE.d(this.M)), false);
                    }
                }
                a(true);
                if (this.y.e != 4) {
                    m();
                    K();
                    this.i.c(2);
                    return;
                }
                return;
            }
            if (wdVarE == wdVarF) {
                z = false;
            }
        }
    }

    private void t() {
        for (com.applovin.impl.wd wdVarE = this.t.e(); wdVarE != null; wdVarE = wdVarE.d()) {
            for (com.applovin.impl.g8 g8Var : wdVarE.i().c) {
                if (g8Var != null) {
                    g8Var.j();
                }
            }
        }
    }

    private boolean k() {
        com.applovin.impl.wd wdVarE = this.t.e();
        long j = wdVarE.f.e;
        return wdVarE.d && (j == androidx.media3.common.C.TIME_UNSET || this.y.s < j || !E());
    }

    private long f() {
        com.applovin.impl.wd wdVarF = this.t.f();
        if (wdVarF == null) {
            return 0L;
        }
        long jF = wdVarF.f();
        if (!wdVarF.d) {
            return jF;
        }
        int i = 0;
        while (true) {
            com.applovin.impl.qi[] qiVarArr = this.f710a;
            if (i >= qiVarArr.length) {
                return jF;
            }
            if (c(qiVarArr[i]) && this.f710a[i].o() == wdVarF.c[i]) {
                long jI = this.f710a[i].i();
                if (jI == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jF = java.lang.Math.max(jI, jF);
            }
            i++;
        }
    }

    private void J() throws com.applovin.impl.z7 {
        if (this.y.f1125a.c() || !this.u.d()) {
            return;
        }
        o();
        q();
        r();
        p();
    }

    private void o() {
        com.applovin.impl.yd ydVarA;
        this.t.a(this.M);
        if (this.t.h() && (ydVarA = this.t.a(this.M, this.y)) != null) {
            com.applovin.impl.wd wdVarA = this.t.a(this.c, this.d, this.g.b(), this.u, ydVarA, this.f);
            wdVarA.f1464a.a(this, ydVarA.b);
            if (this.t.e() == wdVarA) {
                c(wdVarA.g());
            }
            a(false);
        }
        if (this.E) {
            this.E = j();
            I();
        } else {
            m();
        }
    }

    private void q() {
        com.applovin.impl.wd wdVarF = this.t.f();
        if (wdVarF == null) {
            return;
        }
        int i = 0;
        if (wdVarF.d() != null && !this.C) {
            if (i()) {
                if (wdVarF.d().d || this.M >= wdVarF.d().g()) {
                    com.applovin.impl.wo woVarI = wdVarF.i();
                    com.applovin.impl.wd wdVarB = this.t.b();
                    com.applovin.impl.wo woVarI2 = wdVarB.i();
                    if (wdVarB.d && wdVarB.f1464a.h() != androidx.media3.common.C.TIME_UNSET) {
                        d(wdVarB.g());
                        return;
                    }
                    for (int i2 = 0; i2 < this.f710a.length; i2++) {
                        boolean zA = woVarI.a(i2);
                        boolean zA2 = woVarI2.a(i2);
                        if (zA && !this.f710a[i2].k()) {
                            boolean z = this.c[i2].e() == -2;
                            com.applovin.impl.si siVar = woVarI.b[i2];
                            com.applovin.impl.si siVar2 = woVarI2.b[i2];
                            if (!zA2 || !siVar2.equals(siVar) || z) {
                                a(this.f710a[i2], wdVarB.g());
                            }
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (!wdVarF.f.i && !this.C) {
            return;
        }
        while (true) {
            com.applovin.impl.qi[] qiVarArr = this.f710a;
            if (i >= qiVarArr.length) {
                return;
            }
            com.applovin.impl.qi qiVar = qiVarArr[i];
            com.applovin.impl.cj cjVar = wdVarF.c[i];
            if (cjVar != null && qiVar.o() == cjVar && qiVar.j()) {
                long j = wdVarF.f.e;
                a(qiVar, (j == androidx.media3.common.C.TIME_UNSET || j == Long.MIN_VALUE) ? -9223372036854775807L : wdVarF.f() + wdVarF.f.e);
            }
            i++;
        }
    }

    private void r() throws com.applovin.impl.z7 {
        com.applovin.impl.wd wdVarF = this.t.f();
        if (wdVarF == null || this.t.e() == wdVarF || wdVarF.g || !z()) {
            return;
        }
        d();
    }

    private boolean z() {
        com.applovin.impl.wd wdVarF = this.t.f();
        com.applovin.impl.wo woVarI = wdVarF.i();
        int i = 0;
        boolean z = false;
        while (true) {
            com.applovin.impl.qi[] qiVarArr = this.f710a;
            if (i >= qiVarArr.length) {
                return !z;
            }
            com.applovin.impl.qi qiVar = qiVarArr[i];
            if (c(qiVar)) {
                boolean z2 = qiVar.o() != wdVarF.c[i];
                if (!woVarI.a(i) || z2) {
                    if (!qiVar.k()) {
                        qiVar.a(a(woVarI.c[i]), wdVarF.c[i], wdVarF.g(), wdVarF.f());
                    } else if (qiVar.c()) {
                        a(qiVar);
                    } else {
                        z = true;
                    }
                }
            }
            i++;
        }
    }

    private void p() {
        boolean z = false;
        while (C()) {
            if (z) {
                n();
            }
            com.applovin.impl.wd wdVarE = this.t.e();
            com.applovin.impl.wd wdVarA = this.t.a();
            com.applovin.impl.yd ydVar = wdVarA.f;
            com.applovin.impl.ae.a aVar = ydVar.f1538a;
            long j = ydVar.b;
            com.applovin.impl.oh ohVarA = a(aVar, j, ydVar.c, j, true, 0);
            this.y = ohVarA;
            com.applovin.impl.fo foVar = ohVarA.f1125a;
            a(foVar, wdVarA.f.f1538a, foVar, wdVarE.f.f1538a, androidx.media3.common.C.TIME_UNSET);
            B();
            K();
            z = true;
        }
    }

    private void B() {
        com.applovin.impl.wd wdVarE = this.t.e();
        this.C = wdVarE != null && wdVarE.f.h && this.B;
    }

    private boolean C() {
        com.applovin.impl.wd wdVarE;
        com.applovin.impl.wd wdVarD;
        return E() && !this.C && (wdVarE = this.t.e()) != null && (wdVarD = wdVarE.d()) != null && this.M >= wdVarD.g() && wdVarD.g;
    }

    private boolean i() {
        com.applovin.impl.wd wdVarF = this.t.f();
        if (!wdVarF.d) {
            return false;
        }
        int i = 0;
        while (true) {
            com.applovin.impl.qi[] qiVarArr = this.f710a;
            if (i >= qiVarArr.length) {
                return true;
            }
            com.applovin.impl.qi qiVar = qiVarArr[i];
            com.applovin.impl.cj cjVar = wdVarF.c[i];
            if (qiVar.o() != cjVar || (cjVar != null && !qiVar.j() && !a(qiVar, wdVarF))) {
                return false;
            }
            i++;
        }
    }

    private void m() {
        boolean zD = D();
        this.E = zD;
        if (zD) {
            this.t.d().a(this.M);
        }
        I();
    }

    private boolean D() {
        long jD;
        if (!j()) {
            return false;
        }
        com.applovin.impl.wd wdVarD = this.t.d();
        long jB = b(wdVarD.e());
        if (wdVarD == this.t.e()) {
            jD = wdVarD.d(this.M);
        } else {
            jD = wdVarD.d(this.M) - wdVarD.f.b;
        }
        return this.g.a(jD, jB, this.p.a().f1145a);
    }

    private boolean j() {
        com.applovin.impl.wd wdVarD = this.t.d();
        return (wdVarD == null || wdVarD.e() == Long.MIN_VALUE) ? false : true;
    }

    private void I() {
        com.applovin.impl.wd wdVarD = this.t.d();
        boolean z = this.E || (wdVarD != null && wdVarD.f1464a.a());
        com.applovin.impl.oh ohVar = this.y;
        if (z != ohVar.g) {
            this.y = ohVar.a(z);
        }
    }

    private void d() throws com.applovin.impl.z7 {
        a(new boolean[this.f710a.length]);
    }

    private void b(com.applovin.impl.rh rhVar) {
        if (rhVar.i()) {
            return;
        }
        try {
            rhVar.e().a(rhVar.g(), rhVar.c());
        } finally {
            rhVar.a(true);
        }
    }

    class a implements com.applovin.impl.qi.a {
        a() {
        }

        @Override // com.applovin.impl.qi.a
        public void a(long j) {
            if (j >= 2000) {
                com.applovin.impl.d8.this.I = true;
            }
        }

        @Override // com.applovin.impl.qi.a
        public void a() {
            com.applovin.impl.d8.this.i.c(2);
        }
    }

    private long h() {
        return b(this.y.q);
    }

    private void a(com.applovin.impl.qi qiVar) {
        if (c(qiVar)) {
            this.p.a(qiVar);
            b(qiVar);
            qiVar.f();
            this.K--;
        }
    }

    private boolean E() {
        com.applovin.impl.oh ohVar = this.y;
        return ohVar.l && ohVar.m == 0;
    }

    private void e(com.applovin.impl.rh rhVar) {
        if (rhVar.b() == this.k) {
            b(rhVar);
            int i = this.y.e;
            if (i == 3 || i == 2) {
                this.i.c(2);
                return;
            }
            return;
        }
        this.i.a(15, rhVar).a();
    }

    private void a(boolean z, boolean z2) {
        a(z || !this.H, false, true, false);
        this.z.a(z2 ? 1 : 0);
        this.g.c();
        c(1);
    }

    @Override // com.applovin.impl.pj.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void a(com.applovin.impl.vd vdVar) {
        this.i.a(9, vdVar).a();
    }

    private static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.applovin.impl.fo f716a;
        public final int b;
        public final long c;

        public h(com.applovin.impl.fo foVar, int i, long j) {
            this.f716a = foVar;
            this.b = i;
            this.c = j;
        }
    }

    private static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.applovin.impl.ae.a f715a;
        public final long b;
        public final long c;
        public final boolean d;
        public final boolean e;
        public final boolean f;

        public g(com.applovin.impl.ae.a aVar, long j, long j2, boolean z, boolean z2, boolean z3) {
            this.f715a = aVar;
            this.b = j;
            this.c = j2;
            this.d = z;
            this.e = z2;
            this.f = z3;
        }
    }

    private static final class d implements java.lang.Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.applovin.impl.rh f713a;
        public int b;
        public long c;
        public java.lang.Object d;

        public d(com.applovin.impl.rh rhVar) {
            this.f713a = rhVar;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(com.applovin.impl.d8.d dVar) {
            java.lang.Object obj = this.d;
            if ((obj == null) != (dVar.d == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i = this.b - dVar.b;
            return i != 0 ? i : com.applovin.impl.xp.a(this.c, dVar.c);
        }

        public void a(int i, long j, java.lang.Object obj) {
            this.b = i;
            this.c = j;
            this.d = obj;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.util.List f712a;
        private final com.applovin.impl.wj b;
        private final int c;
        private final long d;

        private b(java.util.List list, com.applovin.impl.wj wjVar, int i, long j) {
            this.f712a = list;
            this.b = wjVar;
            this.c = i;
            this.d = j;
        }

        /* synthetic */ b(java.util.List list, com.applovin.impl.wj wjVar, int i, long j, com.applovin.impl.d8.a aVar) {
            this(list, wjVar, i, j);
        }
    }

    private void c(com.applovin.impl.vd vdVar) throws com.applovin.impl.z7 {
        if (this.t.a(vdVar)) {
            com.applovin.impl.wd wdVarD = this.t.d();
            wdVarD.a(this.p.a().f1145a, this.y.f1125a);
            a(wdVarD.h(), wdVarD.i());
            if (wdVarD == this.t.e()) {
                c(wdVarD.f.b);
                d();
                com.applovin.impl.oh ohVar = this.y;
                com.applovin.impl.ae.a aVar = ohVar.b;
                long j = wdVarD.f.b;
                this.y = a(aVar, j, ohVar.c, j, false, 5);
            }
            m();
        }
    }

    private void e(boolean z) throws com.applovin.impl.z7 {
        this.B = z;
        B();
        if (!this.C || this.t.f() == this.t.e()) {
            return;
        }
        c(true);
        a(false);
    }

    private void f(final com.applovin.impl.rh rhVar) {
        android.os.Looper looperB = rhVar.b();
        if (!looperB.getThread().isAlive()) {
            com.applovin.impl.oc.d("TAG", "Trying to send message on a dead thread.");
            rhVar.a(false);
        } else {
            this.r.a(looperB, null).a(new java.lang.Runnable() { // from class: com.applovin.impl.d8$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.c(rhVar);
                }
            });
        }
    }

    public void f(boolean z) {
        this.i.a(12, z ? 1 : 0, 0).a();
    }

    private void b(com.applovin.impl.qi qiVar) {
        if (qiVar.b() == 2) {
            qiVar.stop();
        }
    }

    private boolean h(boolean z) {
        if (this.K == 0) {
            return k();
        }
        if (!z) {
            return false;
        }
        com.applovin.impl.oh ohVar = this.y;
        if (!ohVar.g) {
            return true;
        }
        long jB = a(ohVar.f1125a, this.t.e().f.f1538a) ? this.v.b() : androidx.media3.common.C.TIME_UNSET;
        com.applovin.impl.wd wdVarD = this.t.d();
        return (wdVarD.j() && wdVarD.f.i) || (wdVarD.f.f1538a.a() && !wdVarD.d) || this.g.a(h(), this.p.a().f1145a, this.D, jB);
    }

    private void d(com.applovin.impl.rh rhVar) {
        if (rhVar.d() == androidx.media3.common.C.TIME_UNSET) {
            e(rhVar);
            return;
        }
        if (this.y.f1125a.c()) {
            this.q.add(new com.applovin.impl.d8.d(rhVar));
            return;
        }
        com.applovin.impl.d8.d dVar = new com.applovin.impl.d8.d(rhVar);
        com.applovin.impl.fo foVar = this.y.f1125a;
        if (a(dVar, foVar, foVar, this.F, this.G, this.l, this.m)) {
            this.q.add(dVar);
            java.util.Collections.sort(this.q);
        } else {
            rhVar.a(false);
        }
    }

    private void a(com.applovin.impl.fo foVar, com.applovin.impl.ae.a aVar, com.applovin.impl.fo foVar2, com.applovin.impl.ae.a aVar2, long j) {
        if (!foVar.c() && a(foVar, aVar)) {
            foVar.a(foVar.a(aVar.f1504a, this.m).c, this.l);
            this.v.a((com.applovin.impl.sd.f) com.applovin.impl.xp.a(this.l.l));
            if (j != androidx.media3.common.C.TIME_UNSET) {
                this.v.a(a(foVar, aVar.f1504a, j));
                return;
            }
            if (com.applovin.impl.xp.a(!foVar2.c() ? foVar2.a(foVar2.a(aVar2.f1504a, this.m).c, this.l).f794a : null, this.l.f794a)) {
                return;
            }
            this.v.a(androidx.media3.common.C.TIME_UNSET);
            return;
        }
        float f2 = this.p.a().f1145a;
        com.applovin.impl.ph phVar = this.y.n;
        if (f2 != phVar.f1145a) {
            this.p.a(phVar);
        }
    }

    private void a(int i, boolean z) throws com.applovin.impl.z7 {
        com.applovin.impl.qi qiVar = this.f710a[i];
        if (c(qiVar)) {
            return;
        }
        com.applovin.impl.wd wdVarF = this.t.f();
        boolean z2 = wdVarF == this.t.e();
        com.applovin.impl.wo woVarI = wdVarF.i();
        com.applovin.impl.si siVar = woVarI.b[i];
        com.applovin.impl.e9[] e9VarArrA = a(woVarI.c[i]);
        boolean z3 = E() && this.y.e == 3;
        boolean z4 = !z && z3;
        this.K++;
        this.b.add(qiVar);
        qiVar.a(siVar, e9VarArrA, wdVarF.c[i], this.M, z4, z2, wdVarF.g(), wdVarF.f());
        qiVar.a(11, new com.applovin.impl.d8.a());
        this.p.b(qiVar);
        if (z3) {
            qiVar.start();
        }
    }

    private static boolean c(com.applovin.impl.qi qiVar) {
        return qiVar.b() != 0;
    }

    private void d(long j) {
        for (com.applovin.impl.qi qiVar : this.f710a) {
            if (qiVar.o() != null) {
                a(qiVar, j);
            }
        }
    }

    private long b(long j) {
        com.applovin.impl.wd wdVarD = this.t.d();
        if (wdVarD == null) {
            return 0L;
        }
        return java.lang.Math.max(0L, j - wdVarD.d(this.M));
    }

    private void a(com.applovin.impl.po poVar, com.applovin.impl.wo woVar) {
        this.g.a(this.f710a, poVar, woVar.c);
    }

    private void d(boolean z) {
        if (z == this.J) {
            return;
        }
        this.J = z;
        com.applovin.impl.oh ohVar = this.y;
        int i = ohVar.e;
        if (!z && i != 4 && i != 1) {
            this.i.c(2);
        } else {
            this.y = ohVar.b(z);
        }
    }

    private void a(boolean[] zArr) throws com.applovin.impl.z7 {
        com.applovin.impl.wd wdVarF = this.t.f();
        com.applovin.impl.wo woVarI = wdVarF.i();
        for (int i = 0; i < this.f710a.length; i++) {
            if (!woVarI.a(i) && this.b.remove(this.f710a[i])) {
                this.f710a[i].reset();
            }
        }
        for (int i2 = 0; i2 < this.f710a.length; i2++) {
            if (woVarI.a(i2)) {
                a(i2, zArr[i2]);
            }
        }
        wdVarF.g = true;
    }

    public void a(long j) {
        this.Q = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(com.applovin.impl.rh rhVar) {
        try {
            b(rhVar);
        } catch (com.applovin.impl.z7 e2) {
            com.applovin.impl.oc.a("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e2);
            throw new java.lang.RuntimeException(e2);
        }
    }

    private void b(com.applovin.impl.vd vdVar) {
        if (this.t.a(vdVar)) {
            this.t.a(this.M);
            m();
        }
    }

    private void a(float f2) {
        for (com.applovin.impl.wd wdVarE = this.t.e(); wdVarE != null; wdVarE = wdVarE.d()) {
            for (com.applovin.impl.g8 g8Var : wdVarE.i().c) {
                if (g8Var != null) {
                    g8Var.a(f2);
                }
            }
        }
    }

    private void c(long j) {
        com.applovin.impl.wd wdVarE = this.t.e();
        if (wdVarE != null) {
            j = wdVarE.e(j);
        }
        this.M = j;
        this.p.a(j);
        for (com.applovin.impl.qi qiVar : this.f710a) {
            if (c(qiVar)) {
                qiVar.a(this.M);
            }
        }
        t();
    }

    private synchronized void a(com.applovin.exoplayer2.common.base.Supplier supplier, long j) {
        long jC = this.r.c() + j;
        boolean z = false;
        while (!((java.lang.Boolean) supplier.get()).booleanValue() && j > 0) {
            try {
                this.r.b();
                wait(j);
            } catch (java.lang.InterruptedException unused) {
                z = true;
            }
            j = jC - this.r.c();
        }
        if (z) {
            java.lang.Thread.currentThread().interrupt();
        }
    }

    private com.applovin.impl.db a(com.applovin.impl.g8[] g8VarArr) {
        com.applovin.impl.db.a aVar = new com.applovin.impl.db.a();
        boolean z = false;
        for (com.applovin.impl.g8 g8Var : g8VarArr) {
            if (g8Var != null) {
                com.applovin.impl.af afVar = g8Var.a(0).k;
                if (afVar == null) {
                    aVar.b(new com.applovin.impl.af(new com.applovin.impl.af.b[0]));
                } else {
                    aVar.b(afVar);
                    z = true;
                }
            }
        }
        return z ? aVar.a() : com.applovin.impl.db.h();
    }

    private void c(long j, long j2) {
        this.i.b(2);
        this.i.a(2, j + j2);
    }

    private void b(long j, long j2) {
        com.applovin.impl.d8 d8Var;
        com.applovin.impl.d8.d dVar;
        if (this.q.isEmpty() || this.y.b.a()) {
            return;
        }
        if (this.O) {
            j--;
            this.O = false;
        }
        com.applovin.impl.oh ohVar = this.y;
        int iA = ohVar.f1125a.a(ohVar.b.f1504a);
        int iMin = java.lang.Math.min(this.N, this.q.size());
        com.applovin.impl.d8.d dVar2 = iMin > 0 ? (com.applovin.impl.d8.d) this.q.get(iMin - 1) : null;
        while (dVar2 != null) {
            int i = dVar2.b;
            if (i <= iA && (i != iA || dVar2.c <= j)) {
                break;
            }
            int i2 = iMin - 1;
            dVar2 = i2 > 0 ? (com.applovin.impl.d8.d) this.q.get(iMin - 2) : null;
            iMin = i2;
        }
        if (iMin < this.q.size()) {
            dVar = (com.applovin.impl.d8.d) this.q.get(iMin);
            d8Var = this;
        } else {
            d8Var = this;
            dVar = null;
        }
        while (dVar != null && dVar.d != null) {
            int i3 = dVar.b;
            if (i3 >= iA && (i3 != iA || dVar.c > j)) {
                break;
            }
            iMin++;
            if (iMin < d8Var.q.size()) {
                dVar = (com.applovin.impl.d8.d) d8Var.q.get(iMin);
            } else {
                d8Var = d8Var;
                dVar = null;
            }
        }
        while (dVar != null && dVar.d != null && dVar.b == iA) {
            long j3 = dVar.c;
            if (j3 <= j || j3 > j2) {
                break;
            }
            try {
                d8Var.e(dVar.f713a);
                if (dVar.f713a.a() || dVar.f713a.i()) {
                    d8Var.q.remove(iMin);
                } else {
                    iMin++;
                }
                dVar = iMin < d8Var.q.size() ? (com.applovin.impl.d8.d) d8Var.q.get(iMin) : null;
            } catch (java.lang.Throwable th) {
                if (dVar.f713a.a() || dVar.f713a.i()) {
                    d8Var.q.remove(iMin);
                }
                throw th;
            }
        }
        d8Var.N = iMin;
    }

    private void c(boolean z) throws com.applovin.impl.z7 {
        com.applovin.impl.ae.a aVar = this.t.e().f.f1538a;
        long jA = a(aVar, this.y.s, true, false);
        if (jA != this.y.s) {
            com.applovin.impl.oh ohVar = this.y;
            this.y = a(aVar, jA, ohVar.c, ohVar.d, z, 5);
        }
    }

    private void b(boolean z) {
        for (com.applovin.impl.wd wdVarE = this.t.e(); wdVarE != null; wdVarE = wdVarE.d()) {
            for (com.applovin.impl.g8 g8Var : wdVarE.i().c) {
                if (g8Var != null) {
                    g8Var.a(z);
                }
            }
        }
    }

    public void b(int i, int i2, com.applovin.impl.wj wjVar) {
        this.i.a(20, i, i2, wjVar).a();
    }

    private void c(int i) {
        com.applovin.impl.oh ohVar = this.y;
        if (ohVar.e != i) {
            this.y = ohVar.a(i);
        }
    }

    private void b(com.applovin.impl.ph phVar) {
        this.p.a(phVar);
        a(this.p.a(), true);
    }

    private static com.applovin.impl.e9[] a(com.applovin.impl.g8 g8Var) {
        int iB = g8Var != null ? g8Var.b() : 0;
        com.applovin.impl.e9[] e9VarArr = new com.applovin.impl.e9[iB];
        for (int i = 0; i < iB; i++) {
            e9VarArr[i] = g8Var.a(i);
        }
        return e9VarArr;
    }

    private void b(int i) throws com.applovin.impl.z7 {
        this.F = i;
        if (!this.t.a(this.y.f1125a, i)) {
            c(true);
        }
        a(false);
    }

    private long a(com.applovin.impl.fo foVar, java.lang.Object obj, long j) {
        foVar.a(foVar.a(obj, this.m).c, this.l);
        com.applovin.impl.fo.d dVar = this.l;
        if (dVar.g != androidx.media3.common.C.TIME_UNSET && dVar.e()) {
            com.applovin.impl.fo.d dVar2 = this.l;
            if (dVar2.j) {
                return com.applovin.impl.t2.a(dVar2.a() - this.l.g) - (j + this.m.e());
            }
        }
        return androidx.media3.common.C.TIME_UNSET;
    }

    private android.util.Pair a(com.applovin.impl.fo foVar) {
        long jB = 0;
        if (foVar.c()) {
            return android.util.Pair.create(com.applovin.impl.oh.a(), 0L);
        }
        android.util.Pair pairA = foVar.a(this.l, this.m, foVar.a(this.G), androidx.media3.common.C.TIME_UNSET);
        com.applovin.impl.ae.a aVarA = this.t.a(foVar, pairA.first, 0L);
        long jLongValue = ((java.lang.Long) pairA.second).longValue();
        if (aVarA.a()) {
            foVar.a(aVarA.f1504a, this.m);
            if (aVarA.c == this.m.d(aVarA.b)) {
                jB = this.m.b();
            }
        } else {
            jB = jLongValue;
        }
        return android.util.Pair.create(aVarA, java.lang.Long.valueOf(jB));
    }

    private void a(java.io.IOException iOException, int i) {
        com.applovin.impl.z7 z7VarA = com.applovin.impl.z7.a(iOException, i);
        com.applovin.impl.wd wdVarE = this.t.e();
        if (wdVarE != null) {
            z7VarA = z7VarA.a(wdVarE.f.f1538a);
        }
        com.applovin.impl.oc.a("ExoPlayerImplInternal", "Playback error", z7VarA);
        a(false, false);
        this.y = this.y.a(z7VarA);
    }

    private void a(boolean z) {
        long jC;
        com.applovin.impl.wd wdVarD = this.t.d();
        com.applovin.impl.ae.a aVar = wdVarD == null ? this.y.b : wdVarD.f.f1538a;
        boolean z2 = !this.y.k.equals(aVar);
        if (z2) {
            this.y = this.y.a(aVar);
        }
        com.applovin.impl.oh ohVar = this.y;
        if (wdVarD == null) {
            jC = ohVar.s;
        } else {
            jC = wdVarD.c();
        }
        ohVar.q = jC;
        this.y.r = h();
        if ((z2 || z) && wdVarD != null && wdVarD.d) {
            a(wdVarD.h(), wdVarD.i());
        }
    }

    private void a(com.applovin.impl.fo foVar, boolean z) throws java.lang.Throwable {
        int i;
        int i2;
        boolean z2;
        com.applovin.impl.d8.g gVarA = a(foVar, this.y, this.L, this.t, this.F, this.G, this.l, this.m);
        com.applovin.impl.ae.a aVar = gVarA.f715a;
        long j = gVarA.c;
        boolean z3 = gVarA.d;
        long jA = gVarA.b;
        boolean z4 = (this.y.b.equals(aVar) && jA == this.y.s) ? false : true;
        com.applovin.impl.d8.h hVar = null;
        long j2 = androidx.media3.common.C.TIME_UNSET;
        try {
            if (gVarA.e) {
                if (this.y.e != 1) {
                    c(4);
                }
                a(false, false, false, true);
            }
            try {
                if (!z4) {
                    try {
                        i2 = 4;
                        z2 = false;
                        if (!this.t.a(foVar, this.M, f())) {
                            c(false);
                        }
                    } catch (java.lang.Throwable th) {
                        th = th;
                        i = 4;
                        com.applovin.impl.oh ohVar = this.y;
                        com.applovin.impl.fo foVar2 = ohVar.f1125a;
                        com.applovin.impl.ae.a aVar2 = ohVar.b;
                        if (gVarA.f) {
                            j2 = jA;
                        }
                        com.applovin.impl.d8.h hVar2 = hVar;
                        a(foVar, aVar, foVar2, aVar2, j2);
                        if (z4 || j != this.y.c) {
                            com.applovin.impl.oh ohVar2 = this.y;
                            java.lang.Object obj = ohVar2.b.f1504a;
                            com.applovin.impl.fo foVar3 = ohVar2.f1125a;
                            this.y = a(aVar, jA, j, this.y.d, z4 && z && !foVar3.c() && !foVar3.a(obj, this.m).g, foVar.a(obj) == -1 ? i : 3);
                        }
                        B();
                        a(foVar, this.y.f1125a);
                        this.y = this.y.a(foVar);
                        if (!foVar.c()) {
                            this.L = hVar2;
                        }
                        a(false);
                        throw th;
                    }
                } else {
                    i2 = 4;
                    z2 = false;
                    if (!foVar.c()) {
                        for (com.applovin.impl.wd wdVarE = this.t.e(); wdVarE != null; wdVarE = wdVarE.d()) {
                            if (wdVarE.f.f1538a.equals(aVar)) {
                                wdVarE.f = this.t.a(foVar, wdVarE.f);
                                wdVarE.m();
                            }
                        }
                        jA = a(aVar, jA, z3);
                    }
                }
                com.applovin.impl.oh ohVar3 = this.y;
                a(foVar, aVar, ohVar3.f1125a, ohVar3.b, gVarA.f ? jA : -9223372036854775807L);
                if (z4 || j != this.y.c) {
                    com.applovin.impl.oh ohVar4 = this.y;
                    java.lang.Object obj2 = ohVar4.b.f1504a;
                    com.applovin.impl.fo foVar4 = ohVar4.f1125a;
                    this.y = a(aVar, jA, j, this.y.d, (!z4 || !z || foVar4.c() || foVar4.a(obj2, this.m).g) ? z2 : true, foVar.a(obj2) == -1 ? i2 : 3);
                }
                B();
                a(foVar, this.y.f1125a);
                this.y = this.y.a(foVar);
                if (!foVar.c()) {
                    this.L = null;
                }
                a(z2);
            } catch (java.lang.Throwable th2) {
                th = th2;
                hVar = null;
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            i = 4;
        }
    }

    private void a(com.applovin.impl.ph phVar, float f2, boolean z, boolean z2) {
        if (z) {
            if (z2) {
                this.z.a(1);
            }
            this.y = this.y.a(phVar);
        }
        a(phVar.f1145a);
        for (com.applovin.impl.qi qiVar : this.f710a) {
            if (qiVar != null) {
                qiVar.a(f2, phVar.f1145a);
            }
        }
    }

    private void a(com.applovin.impl.ph phVar, boolean z) {
        a(phVar, phVar.f1145a, true, z);
    }

    private com.applovin.impl.oh a(com.applovin.impl.ae.a aVar, long j, long j2, long j3, boolean z, int i) {
        java.util.List listH;
        com.applovin.impl.po poVar;
        com.applovin.impl.wo woVar;
        com.applovin.impl.po poVarH;
        com.applovin.impl.wo woVarI;
        this.O = (!this.O && j == this.y.s && aVar.equals(this.y.b)) ? false : true;
        B();
        com.applovin.impl.oh ohVar = this.y;
        com.applovin.impl.po poVar2 = ohVar.h;
        com.applovin.impl.wo woVar2 = ohVar.i;
        java.util.List list = ohVar.j;
        if (this.u.d()) {
            com.applovin.impl.wd wdVarE = this.t.e();
            if (wdVarE == null) {
                poVarH = com.applovin.impl.po.d;
            } else {
                poVarH = wdVarE.h();
            }
            if (wdVarE == null) {
                woVarI = this.f;
            } else {
                woVarI = wdVarE.i();
            }
            com.applovin.impl.db dbVarA = a(woVarI.c);
            if (wdVarE != null) {
                com.applovin.impl.yd ydVar = wdVarE.f;
                if (ydVar.c != j2) {
                    wdVarE.f = ydVar.a(j2);
                }
            }
            poVar = poVarH;
            woVar = woVarI;
            listH = dbVarA;
        } else if (aVar.equals(this.y.b)) {
            listH = list;
            poVar = poVar2;
            woVar = woVar2;
        } else {
            poVar = com.applovin.impl.po.d;
            woVar = this.f;
            listH = com.applovin.impl.db.h();
        }
        if (z) {
            this.z.c(i);
        }
        return this.y.a(aVar, j, j2, j3, h(), poVar, woVar, listH);
    }

    private boolean a(com.applovin.impl.qi qiVar, com.applovin.impl.wd wdVar) {
        com.applovin.impl.wd wdVarD = wdVar.d();
        return wdVar.f.f && wdVarD.d && ((qiVar instanceof com.applovin.impl.bo) || qiVar.i() >= wdVarD.g());
    }

    private static boolean a(com.applovin.impl.oh ohVar, com.applovin.impl.fo.b bVar) {
        com.applovin.impl.ae.a aVar = ohVar.b;
        com.applovin.impl.fo foVar = ohVar.f1125a;
        return foVar.c() || foVar.a(aVar.f1504a, bVar).g;
    }

    private boolean a(long j, long j2) {
        if (this.J && this.I) {
            return false;
        }
        c(j, j2);
        return true;
    }

    private void a(com.applovin.impl.d8.c cVar) {
        this.z.a(1);
        throw null;
    }

    @Override // com.applovin.impl.g6.a
    public void a(com.applovin.impl.ph phVar) {
        this.i.a(16, phVar).a();
    }

    @Override // com.applovin.impl.ee.d
    public void a() {
        this.i.c(22);
    }

    @Override // com.applovin.impl.vd.a
    public void a(com.applovin.impl.vd vdVar) {
        this.i.a(8, vdVar).a();
    }

    private void a(int i, int i2, com.applovin.impl.wj wjVar) throws java.lang.Throwable {
        this.z.a(1);
        a(this.u.a(i, i2, wjVar), false);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009f A[PHI: r4 r5 r7
  0x009f: PHI (r4v3 com.applovin.impl.ae$a) = (r4v2 com.applovin.impl.ae$a), (r4v9 com.applovin.impl.ae$a) binds: [B:30:0x0076, B:32:0x009b] A[DONT_GENERATE, DONT_INLINE]
  0x009f: PHI (r5v2 long) = (r5v1 long), (r5v5 long) binds: [B:30:0x0076, B:32:0x009b] A[DONT_GENERATE, DONT_INLINE]
  0x009f: PHI (r7v3 long) = (r7v2 long), (r7v5 long) binds: [B:30:0x0076, B:32:0x009b] A[DONT_GENERATE, DONT_INLINE]] */
    private void a(boolean z, boolean z2, boolean z3, boolean z4) {
        long j;
        boolean z5;
        this.i.b(2);
        this.P = null;
        this.D = false;
        this.p.c();
        this.M = 0L;
        for (com.applovin.impl.qi qiVar : this.f710a) {
            try {
                a(qiVar);
            } catch (com.applovin.impl.z7 | java.lang.RuntimeException e2) {
                com.applovin.impl.oc.a("ExoPlayerImplInternal", "Disable failed.", e2);
            }
        }
        if (z) {
            for (com.applovin.impl.qi qiVar2 : this.f710a) {
                if (this.b.remove(qiVar2)) {
                    try {
                        qiVar2.reset();
                    } catch (java.lang.RuntimeException e3) {
                        com.applovin.impl.oc.a("ExoPlayerImplInternal", "Reset failed.", e3);
                    }
                }
            }
        }
        this.K = 0;
        com.applovin.impl.oh ohVar = this.y;
        com.applovin.impl.ae.a aVar = ohVar.b;
        long jLongValue = ohVar.s;
        if (!this.y.b.a() && !a(this.y, this.m)) {
            j = this.y.s;
        } else {
            j = this.y.c;
        }
        if (z2) {
            this.L = null;
            android.util.Pair pairA = a(this.y.f1125a);
            aVar = (com.applovin.impl.ae.a) pairA.first;
            jLongValue = ((java.lang.Long) pairA.second).longValue();
            boolean zEquals = aVar.equals(this.y.b);
            j = androidx.media3.common.C.TIME_UNSET;
            if (zEquals) {
                z5 = false;
            } else {
                z5 = true;
            }
        } else {
            z5 = false;
        }
        com.applovin.impl.ae.a aVar2 = aVar;
        long j2 = jLongValue;
        this.t.c();
        this.E = false;
        com.applovin.impl.oh ohVar2 = this.y;
        com.applovin.impl.fo foVar = ohVar2.f1125a;
        int i = ohVar2.e;
        com.applovin.impl.z7 z7Var = z4 ? null : ohVar2.f;
        com.applovin.impl.po poVar = z5 ? com.applovin.impl.po.d : ohVar2.h;
        com.applovin.impl.wo woVar = z5 ? this.f : ohVar2.i;
        java.util.List listH = z5 ? com.applovin.impl.db.h() : ohVar2.j;
        com.applovin.impl.oh ohVar3 = this.y;
        this.y = new com.applovin.impl.oh(foVar, aVar2, j, j2, i, z7Var, false, poVar, woVar, listH, aVar2, ohVar3.l, ohVar3.m, ohVar3.n, j2, 0L, j2, this.J, false);
        if (z3) {
            this.u.e();
        }
    }

    private static void a(com.applovin.impl.fo foVar, com.applovin.impl.d8.d dVar, com.applovin.impl.fo.d dVar2, com.applovin.impl.fo.b bVar) {
        int i = foVar.a(foVar.a(dVar.d, bVar).c, dVar2).q;
        java.lang.Object obj = foVar.a(i, bVar, true).b;
        long j = bVar.d;
        dVar.a(i, j != androidx.media3.common.C.TIME_UNSET ? j - 1 : Long.MAX_VALUE, obj);
    }

    private static boolean a(com.applovin.impl.d8.d dVar, com.applovin.impl.fo foVar, com.applovin.impl.fo foVar2, int i, boolean z, com.applovin.impl.fo.d dVar2, com.applovin.impl.fo.b bVar) {
        java.lang.Object obj = dVar.d;
        if (obj == null) {
            android.util.Pair pairA = a(foVar, new com.applovin.impl.d8.h(dVar.f713a.f(), dVar.f713a.h(), dVar.f713a.d() == Long.MIN_VALUE ? androidx.media3.common.C.TIME_UNSET : com.applovin.impl.t2.a(dVar.f713a.d())), false, i, z, dVar2, bVar);
            if (pairA == null) {
                return false;
            }
            dVar.a(foVar.a(pairA.first), ((java.lang.Long) pairA.second).longValue(), pairA.first);
            if (dVar.f713a.d() == Long.MIN_VALUE) {
                a(foVar, dVar, dVar2, bVar);
            }
            return true;
        }
        int iA = foVar.a(obj);
        if (iA == -1) {
            return false;
        }
        if (dVar.f713a.d() == Long.MIN_VALUE) {
            a(foVar, dVar, dVar2, bVar);
            return true;
        }
        dVar.b = iA;
        foVar2.a(dVar.d, bVar);
        if (bVar.g && foVar2.a(bVar.c, dVar2).p == foVar2.a(dVar.d)) {
            android.util.Pair pairA2 = foVar.a(dVar2, bVar, foVar.a(dVar.d, bVar).c, dVar.c + bVar.e());
            dVar.a(foVar.a(pairA2.first), ((java.lang.Long) pairA2.second).longValue(), pairA2.first);
        }
        return true;
    }

    private void a(com.applovin.impl.fo foVar, com.applovin.impl.fo foVar2) {
        if (foVar.c() && foVar2.c()) {
            return;
        }
        for (int size = this.q.size() - 1; size >= 0; size--) {
            if (!a((com.applovin.impl.d8.d) this.q.get(size), foVar, foVar2, this.F, this.G, this.l, this.m)) {
                ((com.applovin.impl.d8.d) this.q.get(size)).f713a.a(false);
                this.q.remove(size);
            }
        }
        java.util.Collections.sort(this.q);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0158  */
    /* JADX WARN: Code duplicated, block: B:50:0x0176  */
    /* JADX WARN: Code duplicated, block: B:53:0x0182  */
    /* JADX WARN: Code duplicated, block: B:59:0x018e  */
    /* JADX WARN: Code duplicated, block: B:62:0x0198  */
    /* JADX WARN: Code duplicated, block: B:68:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:84:0x01d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:88:0x01df  */
    /* JADX WARN: Code duplicated, block: B:90:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:91:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:93:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:94:0x01fc  */
    private static com.applovin.impl.d8.g a(com.applovin.impl.fo foVar, com.applovin.impl.oh ohVar, com.applovin.impl.d8.h hVar, com.applovin.impl.zd zdVar, int i, boolean z, com.applovin.impl.fo.d dVar, com.applovin.impl.fo.b bVar) {
        long j;
        com.applovin.impl.ae.a aVar;
        int i2;
        int iA;
        boolean z2;
        long jLongValue;
        int iA2;
        boolean z3;
        boolean z4;
        boolean z5;
        int iA3;
        long j2;
        com.applovin.impl.ae.a aVarA;
        boolean z6;
        boolean zEquals;
        boolean z7;
        int i3;
        int i4;
        boolean z8;
        if (foVar.c()) {
            return new com.applovin.impl.d8.g(com.applovin.impl.oh.a(), 0L, androidx.media3.common.C.TIME_UNSET, false, true, false);
        }
        com.applovin.impl.ae.a aVar2 = ohVar.b;
        java.lang.Object obj = aVar2.f1504a;
        boolean zA = a(ohVar, bVar);
        if (!ohVar.b.a() && !zA) {
            j = ohVar.s;
        } else {
            j = ohVar.c;
        }
        long j3 = j;
        boolean z9 = false;
        if (hVar != null) {
            aVar = aVar2;
            i2 = -1;
            android.util.Pair pairA = a(foVar, hVar, true, i, z, dVar, bVar);
            if (pairA == null) {
                iA2 = foVar.a(z);
                jLongValue = j3;
                z3 = false;
                z5 = false;
                z4 = true;
            } else {
                if (hVar.c == androidx.media3.common.C.TIME_UNSET) {
                    i4 = foVar.a(pairA.first, bVar).c;
                    jLongValue = j3;
                    z8 = false;
                } else {
                    obj = pairA.first;
                    jLongValue = ((java.lang.Long) pairA.second).longValue();
                    i4 = -1;
                    z8 = true;
                }
                z5 = z8;
                if (ohVar.e == 4) {
                    iA2 = i4;
                    z4 = false;
                    z3 = true;
                } else {
                    iA2 = i4;
                    z3 = false;
                    z4 = false;
                }
            }
        } else {
            aVar = aVar2;
            i2 = -1;
            if (ohVar.f1125a.c()) {
                iA3 = foVar.a(z);
            } else {
                if (foVar.a(obj) == -1) {
                    java.lang.Object objA = a(dVar, bVar, i, z, obj, ohVar.f1125a, foVar);
                    if (objA == null) {
                        iA = foVar.a(z);
                        z2 = true;
                    } else {
                        iA = foVar.a(objA, bVar).c;
                        z2 = false;
                    }
                } else {
                    if (j3 == androidx.media3.common.C.TIME_UNSET) {
                        iA3 = foVar.a(obj, bVar).c;
                    } else if (zA) {
                        aVar = aVar;
                        ohVar.f1125a.a(aVar.f1504a, bVar);
                        if (ohVar.f1125a.a(bVar.c, dVar).p == ohVar.f1125a.a(aVar.f1504a)) {
                            android.util.Pair pairA2 = foVar.a(dVar, bVar, foVar.a(obj, bVar).c, j3 + bVar.e());
                            obj = pairA2.first;
                            jLongValue = ((java.lang.Long) pairA2.second).longValue();
                        } else {
                            jLongValue = j3;
                        }
                        iA2 = -1;
                        z3 = false;
                        z4 = false;
                        z5 = true;
                    } else {
                        iA = -1;
                        z2 = false;
                    }
                    if (iA2 != i2) {
                        android.util.Pair pairA3 = foVar.a(dVar, bVar, iA2, androidx.media3.common.C.TIME_UNSET);
                        obj = pairA3.first;
                        jLongValue = ((java.lang.Long) pairA3.second).longValue();
                        j2 = -9223372036854775807L;
                    } else {
                        j2 = jLongValue;
                    }
                    aVarA = zdVar.a(foVar, obj, jLongValue);
                    if (aVarA.e != i2 || ((i3 = aVar.e) != i2 && aVarA.b >= i3)) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    zEquals = aVar.f1504a.equals(obj);
                    if (zEquals || aVar.a() || aVarA.a() || !z6) {
                        z7 = false;
                    } else {
                        z7 = true;
                    }
                    foVar.a(obj, bVar);
                    if (zEquals && !zA && j3 == j2 && ((aVarA.a() && bVar.f(aVarA.b)) || (aVar.a() && bVar.f(aVar.b)))) {
                        z9 = true;
                    }
                    if (z7 || z9) {
                        aVarA = aVar;
                    }
                    if (aVarA.a()) {
                        if (aVarA.equals(aVar)) {
                            jLongValue = ohVar.s;
                        } else {
                            foVar.a(aVarA.f1504a, bVar);
                            if (aVarA.c == bVar.d(aVarA.b)) {
                                jLongValue = bVar.b();
                            } else {
                                jLongValue = 0;
                            }
                        }
                    }
                    return new com.applovin.impl.d8.g(aVarA, jLongValue, j2, z3, z4, z5);
                }
                iA2 = iA;
                z4 = z2;
                jLongValue = j3;
                z3 = false;
                z5 = false;
                if (iA2 != i2) {
                    android.util.Pair pairA4 = foVar.a(dVar, bVar, iA2, androidx.media3.common.C.TIME_UNSET);
                    obj = pairA4.first;
                    jLongValue = ((java.lang.Long) pairA4.second).longValue();
                    j2 = -9223372036854775807L;
                } else {
                    j2 = jLongValue;
                }
                aVarA = zdVar.a(foVar, obj, jLongValue);
                if (aVarA.e != i2) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                zEquals = aVar.f1504a.equals(obj);
                if (zEquals) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                foVar.a(obj, bVar);
                if (zEquals) {
                    z9 = true;
                }
                if (z7) {
                    aVarA = aVar;
                } else {
                    aVarA = aVar;
                }
                if (aVarA.a()) {
                    if (aVarA.equals(aVar)) {
                        jLongValue = ohVar.s;
                    } else {
                        foVar.a(aVarA.f1504a, bVar);
                        if (aVarA.c == bVar.d(aVarA.b)) {
                            jLongValue = bVar.b();
                        } else {
                            jLongValue = 0;
                        }
                    }
                }
                return new com.applovin.impl.d8.g(aVarA, jLongValue, j2, z3, z4, z5);
            }
            iA2 = iA3;
            jLongValue = j3;
            z3 = false;
            z4 = false;
            z5 = false;
        }
        aVar = aVar;
        if (iA2 != i2) {
            android.util.Pair pairA5 = foVar.a(dVar, bVar, iA2, androidx.media3.common.C.TIME_UNSET);
            obj = pairA5.first;
            jLongValue = ((java.lang.Long) pairA5.second).longValue();
            j2 = -9223372036854775807L;
        } else {
            j2 = jLongValue;
        }
        aVarA = zdVar.a(foVar, obj, jLongValue);
        if (aVarA.e != i2) {
            z6 = true;
        } else {
            z6 = true;
        }
        zEquals = aVar.f1504a.equals(obj);
        if (zEquals) {
            z7 = false;
        } else {
            z7 = false;
        }
        foVar.a(obj, bVar);
        if (zEquals) {
            z9 = true;
        }
        if (z7) {
            aVarA = aVar;
        } else {
            aVarA = aVar;
        }
        if (aVarA.a()) {
            if (aVarA.equals(aVar)) {
                jLongValue = ohVar.s;
            } else {
                foVar.a(aVarA.f1504a, bVar);
                if (aVarA.c == bVar.d(aVarA.b)) {
                    jLongValue = bVar.b();
                } else {
                    jLongValue = 0;
                }
            }
        }
        return new com.applovin.impl.d8.g(aVarA, jLongValue, j2, z3, z4, z5);
    }

    private static android.util.Pair a(com.applovin.impl.fo foVar, com.applovin.impl.d8.h hVar, boolean z, int i, boolean z2, com.applovin.impl.fo.d dVar, com.applovin.impl.fo.b bVar) {
        java.lang.Object objA;
        com.applovin.impl.fo foVar2 = hVar.f716a;
        if (foVar.c()) {
            return null;
        }
        com.applovin.impl.fo foVar3 = foVar2.c() ? foVar : foVar2;
        try {
            android.util.Pair pairA = foVar3.a(dVar, bVar, hVar.b, hVar.c);
            if (foVar.equals(foVar3)) {
                return pairA;
            }
            if (foVar.a(pairA.first) != -1) {
                return (foVar3.a(pairA.first, bVar).g && foVar3.a(bVar.c, dVar).p == foVar3.a(pairA.first)) ? foVar.a(dVar, bVar, foVar.a(pairA.first, bVar).c, hVar.c) : pairA;
            }
            if (z && (objA = a(dVar, bVar, i, z2, pairA.first, foVar3, foVar)) != null) {
                return foVar.a(dVar, bVar, foVar.a(objA, bVar).c, androidx.media3.common.C.TIME_UNSET);
            }
            return null;
        } catch (java.lang.IndexOutOfBoundsException unused) {
        }
    }

    static java.lang.Object a(com.applovin.impl.fo.d dVar, com.applovin.impl.fo.b bVar, int i, boolean z, java.lang.Object obj, com.applovin.impl.fo foVar, com.applovin.impl.fo foVar2) {
        int iA = foVar.a(obj);
        int iA2 = foVar.a();
        int iA3 = iA;
        int iA4 = -1;
        for (int i2 = 0; i2 < iA2 && iA4 == -1; i2++) {
            iA3 = foVar.a(iA3, bVar, dVar, i, z);
            if (iA3 == -1) {
                break;
            }
            iA4 = foVar2.a(foVar.b(iA3));
        }
        if (iA4 == -1) {
            return null;
        }
        return foVar2.b(iA4);
    }

    public void a(com.applovin.impl.fo foVar, int i, long j) {
        this.i.a(3, new com.applovin.impl.d8.h(foVar, i, j)).a();
    }

    private void a(com.applovin.impl.d8.h hVar) throws java.lang.Throwable {
        long j;
        long j2;
        boolean z;
        com.applovin.impl.ae.a aVar;
        long j3;
        long jA;
        long j4;
        com.applovin.impl.oh ohVar;
        int i;
        this.z.a(1);
        android.util.Pair pairA = a(this.y.f1125a, hVar, true, this.F, this.G, this.l, this.m);
        if (pairA == null) {
            android.util.Pair pairA2 = a(this.y.f1125a);
            aVar = (com.applovin.impl.ae.a) pairA2.first;
            long jLongValue = ((java.lang.Long) pairA2.second).longValue();
            z = !this.y.f1125a.c();
            j = jLongValue;
            j2 = -9223372036854775807L;
        } else {
            java.lang.Object obj = pairA.first;
            long jLongValue2 = ((java.lang.Long) pairA.second).longValue();
            long j5 = hVar.c == androidx.media3.common.C.TIME_UNSET ? -9223372036854775807L : jLongValue2;
            com.applovin.impl.ae.a aVarA = this.t.a(this.y.f1125a, obj, jLongValue2);
            if (aVarA.a()) {
                this.y.f1125a.a(aVarA.f1504a, this.m);
                jLongValue2 = this.m.d(aVarA.b) == aVarA.c ? this.m.b() : 0L;
            } else if (hVar.c != androidx.media3.common.C.TIME_UNSET) {
                j = jLongValue2;
                j2 = j5;
                z = false;
                aVar = aVarA;
            }
            j = jLongValue2;
            j2 = j5;
            aVar = aVarA;
            z = true;
        }
        try {
            if (this.y.f1125a.c()) {
                this.L = hVar;
            } else {
                if (pairA == null) {
                    if (this.y.e != 1) {
                        c(4);
                    }
                    a(false, true, false, true);
                } else {
                    if (aVar.equals(this.y.b)) {
                        com.applovin.impl.wd wdVarE = this.t.e();
                        jA = (wdVarE == null || !wdVarE.d || j == 0) ? j : wdVarE.f1464a.a(j, this.x);
                        if (com.applovin.impl.t2.b(jA) == com.applovin.impl.t2.b(this.y.s) && ((i = (ohVar = this.y).e) == 2 || i == 3)) {
                            long j6 = ohVar.s;
                            this.y = a(aVar, j6, j2, j6, z, 2);
                            return;
                        }
                    } else {
                        jA = j;
                    }
                    long jA2 = a(aVar, jA, this.y.e == 4);
                    boolean z2 = (j != jA2) | z;
                    try {
                        com.applovin.impl.oh ohVar2 = this.y;
                        com.applovin.impl.fo foVar = ohVar2.f1125a;
                        a(foVar, aVar, foVar, ohVar2.b, j2);
                        z = z2;
                        j4 = jA2;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        z = z2;
                        j3 = jA2;
                        this.y = a(aVar, j3, j2, j3, z, 2);
                        throw th;
                    }
                }
                this.y = a(aVar, j4, j2, j4, z, 2);
            }
            j4 = j;
            this.y = a(aVar, j4, j2, j4, z, 2);
        } catch (java.lang.Throwable th2) {
            th = th2;
            j3 = j;
        }
    }

    private long a(com.applovin.impl.ae.a aVar, long j, boolean z) {
        return a(aVar, j, this.t.e() != this.t.f(), z);
    }

    private long a(com.applovin.impl.ae.a aVar, long j, boolean z, boolean z2) throws com.applovin.impl.z7 {
        H();
        this.D = false;
        if (z2 || this.y.e == 3) {
            c(2);
        }
        com.applovin.impl.wd wdVarE = this.t.e();
        com.applovin.impl.wd wdVarD = wdVarE;
        while (wdVarD != null && !aVar.equals(wdVarD.f.f1538a)) {
            wdVarD = wdVarD.d();
        }
        if (z || wdVarE != wdVarD || (wdVarD != null && wdVarD.e(j) < 0)) {
            for (com.applovin.impl.qi qiVar : this.f710a) {
                a(qiVar);
            }
            if (wdVarD != null) {
                while (this.t.e() != wdVarD) {
                    this.t.a();
                }
                this.t.a(wdVarD);
                wdVarD.c(0L);
                d();
            }
        }
        if (wdVarD != null) {
            this.t.a(wdVarD);
            if (!wdVarD.d) {
                wdVarD.f = wdVarD.f.b(j);
            } else if (wdVarD.e) {
                long jA = wdVarD.f1464a.a(j);
                wdVarD.f1464a.a(jA - this.n, this.o);
                j = jA;
            }
            c(j);
            m();
        } else {
            this.t.c();
            c(j);
        }
        a(false);
        this.i.c(2);
        return j;
    }

    @Override // com.applovin.impl.rh.a
    public synchronized void a(com.applovin.impl.rh rhVar) {
        if (!this.A && this.j.isAlive()) {
            this.i.a(14, rhVar).a();
            return;
        }
        com.applovin.impl.oc.d("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        rhVar.a(false);
    }

    private void a(com.applovin.impl.qi qiVar, long j) {
        qiVar.g();
        if (qiVar instanceof com.applovin.impl.bo) {
            ((com.applovin.impl.bo) qiVar).c(j);
        }
    }

    private void a(boolean z, java.util.concurrent.atomic.AtomicBoolean atomicBoolean) {
        if (this.H != z) {
            this.H = z;
            if (!z) {
                for (com.applovin.impl.qi qiVar : this.f710a) {
                    if (!c(qiVar) && this.b.remove(qiVar)) {
                        qiVar.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    private void a(com.applovin.impl.d8.b bVar) throws java.lang.Throwable {
        this.z.a(1);
        if (bVar.c != -1) {
            this.L = new com.applovin.impl.d8.h(new com.applovin.impl.sh(bVar.f712a, bVar.b), bVar.c, bVar.d);
        }
        a(this.u.a(bVar.f712a, bVar.b), false);
    }

    public void a(java.util.List list, int i, long j, com.applovin.impl.wj wjVar) {
        this.i.a(17, new com.applovin.impl.d8.b(list, wjVar, i, j, null)).a();
    }

    public void a(boolean z, int i) {
        this.i.a(1, z ? 1 : 0, i).a();
    }

    private void a(boolean z, int i, boolean z2, int i2) {
        this.z.a(z2 ? 1 : 0);
        this.z.b(i2);
        this.y = this.y.a(z, i);
        this.D = false;
        b(z);
        if (!E()) {
            H();
            K();
            return;
        }
        int i3 = this.y.e;
        if (i3 == 3) {
            F();
            this.i.c(2);
        } else if (i3 == 2) {
            this.i.c(2);
        }
    }

    public void a(int i) {
        this.i.a(11, i, 0).a();
    }

    private void a(com.applovin.impl.jj jjVar) {
        this.x = jjVar;
    }
}
