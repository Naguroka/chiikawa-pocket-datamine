package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class ff extends com.applovin.impl.e2 implements android.os.Handler.Callback {
    private final com.applovin.impl.cf n;
    private final com.applovin.impl.ef o;
    private final android.os.Handler p;
    private final com.applovin.impl.df q;
    private com.applovin.impl.bf r;
    private boolean s;
    private boolean t;
    private long u;
    private long v;
    private com.applovin.impl.af w;

    @Override // com.applovin.impl.qi
    public boolean d() {
        return true;
    }

    @Override // com.applovin.impl.qi, com.applovin.impl.ri
    public java.lang.String getName() {
        return "MetadataRenderer";
    }

    public ff(com.applovin.impl.ef efVar, android.os.Looper looper) {
        this(efVar, looper, com.applovin.impl.cf.f677a);
    }

    private void a(com.applovin.impl.af afVar, java.util.List list) {
        for (int i = 0; i < afVar.c(); i++) {
            com.applovin.impl.e9 e9VarB = afVar.a(i).b();
            if (e9VarB != null && this.n.a(e9VarB)) {
                com.applovin.impl.bf bfVarB = this.n.b(e9VarB);
                byte[] bArr = (byte[]) com.applovin.impl.b1.a(afVar.a(i).a());
                this.q.b();
                this.q.g(bArr.length);
                ((java.nio.ByteBuffer) com.applovin.impl.xp.a(this.q.c)).put(bArr);
                this.q.g();
                com.applovin.impl.af afVarA = bfVarB.a(this.q);
                if (afVarA != null) {
                    a(afVarA, list);
                }
            } else {
                list.add(afVar.a(i));
            }
        }
    }

    public ff(com.applovin.impl.ef efVar, android.os.Looper looper, com.applovin.impl.cf cfVar) {
        super(5);
        this.o = (com.applovin.impl.ef) com.applovin.impl.b1.a(efVar);
        this.p = looper == null ? null : com.applovin.impl.xp.a(looper, (android.os.Handler.Callback) this);
        this.n = (com.applovin.impl.cf) com.applovin.impl.b1.a(cfVar);
        this.q = new com.applovin.impl.df();
        this.v = androidx.media3.common.C.TIME_UNSET;
    }

    @Override // com.applovin.impl.e2
    protected void v() {
        this.w = null;
        this.v = androidx.media3.common.C.TIME_UNSET;
        this.r = null;
    }

    @Override // com.applovin.impl.qi
    public boolean c() {
        return this.t;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        if (message.what == 0) {
            b((com.applovin.impl.af) message.obj);
            return true;
        }
        throw new java.lang.IllegalStateException();
    }

    private void z() {
        if (this.s || this.w != null) {
            return;
        }
        this.q.b();
        com.applovin.impl.f9 f9VarR = r();
        int iA = a(f9VarR, this.q, 0);
        if (iA != -4) {
            if (iA == -5) {
                this.u = ((com.applovin.impl.e9) com.applovin.impl.b1.a(f9VarR.b)).q;
                return;
            }
            return;
        }
        if (this.q.e()) {
            this.s = true;
            return;
        }
        com.applovin.impl.df dfVar = this.q;
        dfVar.j = this.u;
        dfVar.g();
        com.applovin.impl.af afVarA = ((com.applovin.impl.bf) com.applovin.impl.xp.a(this.r)).a(this.q);
        if (afVarA != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(afVarA.c());
            a(afVarA, arrayList);
            if (arrayList.isEmpty()) {
                return;
            }
            this.w = new com.applovin.impl.af(arrayList);
            this.v = this.q.f;
        }
    }

    private void b(com.applovin.impl.af afVar) {
        this.o.a(afVar);
    }

    private void a(com.applovin.impl.af afVar) {
        android.os.Handler handler = this.p;
        if (handler != null) {
            handler.obtainMessage(0, afVar).sendToTarget();
        } else {
            b(afVar);
        }
    }

    private boolean c(long j) {
        boolean z;
        com.applovin.impl.af afVar = this.w;
        if (afVar == null || this.v > j) {
            z = false;
        } else {
            a(afVar);
            this.w = null;
            this.v = androidx.media3.common.C.TIME_UNSET;
            z = true;
        }
        if (this.s && this.w == null) {
            this.t = true;
        }
        return z;
    }

    @Override // com.applovin.impl.e2
    protected void a(long j, boolean z) {
        this.w = null;
        this.v = androidx.media3.common.C.TIME_UNSET;
        this.s = false;
        this.t = false;
    }

    @Override // com.applovin.impl.e2
    protected void a(com.applovin.impl.e9[] e9VarArr, long j, long j2) {
        this.r = this.n.b(e9VarArr[0]);
    }

    @Override // com.applovin.impl.qi
    public void a(long j, long j2) {
        boolean zC = true;
        while (zC) {
            z();
            zC = c(j);
        }
    }

    @Override // com.applovin.impl.ri
    public int a(com.applovin.impl.e9 e9Var) {
        if (this.n.a(e9Var)) {
            return com.applovin.impl.ri.a(e9Var.F == 0 ? 4 : 2);
        }
        return com.applovin.impl.ri.a(0);
    }
}
