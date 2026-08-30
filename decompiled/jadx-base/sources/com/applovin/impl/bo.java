package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class bo extends com.applovin.impl.e2 implements android.os.Handler.Callback {
    private int A;
    private long B;
    private final android.os.Handler n;
    private final com.applovin.impl.ao o;
    private final com.applovin.impl.ql p;
    private final com.applovin.impl.f9 q;
    private boolean r;
    private boolean s;
    private boolean t;
    private int u;
    private com.applovin.impl.e9 v;
    private com.applovin.impl.ol w;
    private com.applovin.impl.rl x;
    private com.applovin.impl.sl y;
    private com.applovin.impl.sl z;

    @Override // com.applovin.impl.qi
    public boolean d() {
        return true;
    }

    @Override // com.applovin.impl.qi, com.applovin.impl.ri
    public java.lang.String getName() {
        return "TextRenderer";
    }

    public bo(com.applovin.impl.ao aoVar, android.os.Looper looper) {
        this(aoVar, looper, com.applovin.impl.ql.f1197a);
    }

    public bo(com.applovin.impl.ao aoVar, android.os.Looper looper, com.applovin.impl.ql qlVar) {
        super(3);
        this.o = (com.applovin.impl.ao) com.applovin.impl.b1.a(aoVar);
        this.n = looper == null ? null : com.applovin.impl.xp.a(looper, (android.os.Handler.Callback) this);
        this.p = qlVar;
        this.q = new com.applovin.impl.f9();
        this.B = androidx.media3.common.C.TIME_UNSET;
    }

    @Override // com.applovin.impl.e2
    protected void v() {
        this.v = null;
        this.B = androidx.media3.common.C.TIME_UNSET;
        z();
        D();
    }

    @Override // com.applovin.impl.qi
    public boolean c() {
        return this.s;
    }

    private void C() {
        this.x = null;
        this.A = -1;
        com.applovin.impl.sl slVar = this.y;
        if (slVar != null) {
            slVar.g();
            this.y = null;
        }
        com.applovin.impl.sl slVar2 = this.z;
        if (slVar2 != null) {
            slVar2.g();
            this.z = null;
        }
    }

    private void D() {
        C();
        ((com.applovin.impl.ol) com.applovin.impl.b1.a(this.w)).a();
        this.w = null;
        this.u = 0;
    }

    private void B() {
        this.t = true;
        this.w = this.p.b((com.applovin.impl.e9) com.applovin.impl.b1.a(this.v));
    }

    private void E() {
        D();
        B();
    }

    private long A() {
        if (this.A == -1) {
            return Long.MAX_VALUE;
        }
        com.applovin.impl.b1.a(this.y);
        if (this.A >= this.y.a()) {
            return Long.MAX_VALUE;
        }
        return this.y.a(this.A);
    }

    private void b(java.util.List list) {
        android.os.Handler handler = this.n;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            a(list);
        }
    }

    private void z() {
        b(java.util.Collections.emptyList());
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        if (message.what == 0) {
            a((java.util.List) message.obj);
            return true;
        }
        throw new java.lang.IllegalStateException();
    }

    private void a(com.applovin.impl.pl plVar) {
        com.applovin.impl.oc.a("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.v, plVar);
        z();
        E();
    }

    public void c(long j) {
        com.applovin.impl.b1.b(k());
        this.B = j;
    }

    private void a(java.util.List list) {
        this.o.a(list);
    }

    @Override // com.applovin.impl.e2
    protected void a(long j, boolean z) {
        z();
        this.r = false;
        this.s = false;
        this.B = androidx.media3.common.C.TIME_UNSET;
        if (this.u != 0) {
            E();
        } else {
            C();
            ((com.applovin.impl.ol) com.applovin.impl.b1.a(this.w)).b();
        }
    }

    @Override // com.applovin.impl.e2
    protected void a(com.applovin.impl.e9[] e9VarArr, long j, long j2) {
        this.v = e9VarArr[0];
        if (this.w != null) {
            this.u = 1;
        } else {
            B();
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00a9  */
    @Override // com.applovin.impl.qi
    public void a(long j, long j2) {
        boolean z;
        if (k()) {
            long j3 = this.B;
            if (j3 != androidx.media3.common.C.TIME_UNSET && j >= j3) {
                C();
                this.s = true;
            }
        }
        if (this.s) {
            return;
        }
        if (this.z == null) {
            ((com.applovin.impl.ol) com.applovin.impl.b1.a(this.w)).a(j);
            try {
                this.z = (com.applovin.impl.sl) ((com.applovin.impl.ol) com.applovin.impl.b1.a(this.w)).c();
            } catch (com.applovin.impl.pl e) {
                a(e);
                return;
            }
        }
        if (b() != 2) {
            return;
        }
        if (this.y != null) {
            long jA = A();
            z = false;
            while (jA <= j) {
                this.A++;
                jA = A();
                z = true;
            }
        } else {
            z = false;
        }
        com.applovin.impl.sl slVar = this.z;
        if (slVar != null) {
            if (!slVar.e()) {
                if (slVar.b <= j) {
                    com.applovin.impl.sl slVar2 = this.y;
                    if (slVar2 != null) {
                        slVar2.g();
                    }
                    this.A = slVar.a(j);
                    this.y = slVar;
                    this.z = null;
                }
                com.applovin.impl.b1.a(this.y);
                b(this.y.b(j));
            } else if (!z && A() == Long.MAX_VALUE) {
                if (this.u == 2) {
                    E();
                } else {
                    C();
                    this.s = true;
                }
            }
            if (z) {
                com.applovin.impl.b1.a(this.y);
                b(this.y.b(j));
            }
        } else if (z) {
            com.applovin.impl.b1.a(this.y);
            b(this.y.b(j));
        }
        if (this.u == 2) {
            return;
        }
        while (!this.r) {
            try {
                com.applovin.impl.rl rlVar = this.x;
                if (rlVar == null) {
                    rlVar = (com.applovin.impl.rl) ((com.applovin.impl.ol) com.applovin.impl.b1.a(this.w)).d();
                    if (rlVar == null) {
                        return;
                    } else {
                        this.x = rlVar;
                    }
                }
                if (this.u == 1) {
                    rlVar.e(4);
                    ((com.applovin.impl.ol) com.applovin.impl.b1.a(this.w)).a(rlVar);
                    this.x = null;
                    this.u = 2;
                    return;
                }
                int iA = a(this.q, rlVar, 0);
                if (iA == -4) {
                    if (rlVar.e()) {
                        this.r = true;
                        this.t = false;
                    } else {
                        com.applovin.impl.e9 e9Var = this.q.b;
                        if (e9Var == null) {
                            return;
                        }
                        rlVar.j = e9Var.q;
                        rlVar.g();
                        this.t &= !rlVar.f();
                    }
                    if (!this.t) {
                        ((com.applovin.impl.ol) com.applovin.impl.b1.a(this.w)).a(rlVar);
                        this.x = null;
                    }
                } else if (iA == -3) {
                    return;
                }
            } catch (com.applovin.impl.pl e2) {
                a(e2);
                return;
            }
        }
    }

    @Override // com.applovin.impl.ri
    public int a(com.applovin.impl.e9 e9Var) {
        if (this.p.a(e9Var)) {
            return com.applovin.impl.ri.a(e9Var.F == 0 ? 4 : 2);
        }
        if (com.applovin.impl.hf.h(e9Var.m)) {
            return com.applovin.impl.ri.a(1);
        }
        return com.applovin.impl.ri.a(0);
    }
}
