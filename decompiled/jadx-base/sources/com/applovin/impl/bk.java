package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bk implements com.applovin.impl.l5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Thread f651a;
    private final java.lang.Object b = new java.lang.Object();
    private final java.util.ArrayDeque c = new java.util.ArrayDeque();
    private final java.util.ArrayDeque d = new java.util.ArrayDeque();
    private final com.applovin.impl.o5[] e;
    private final com.applovin.impl.yg[] f;
    private int g;
    private int h;
    private com.applovin.impl.o5 i;
    private com.applovin.impl.n5 j;
    private boolean k;
    private boolean l;
    private int m;

    protected abstract com.applovin.impl.n5 a(com.applovin.impl.o5 o5Var, com.applovin.impl.yg ygVar, boolean z);

    protected abstract com.applovin.impl.n5 a(java.lang.Throwable th);

    protected abstract com.applovin.impl.o5 f();

    protected abstract com.applovin.impl.yg g();

    protected bk(com.applovin.impl.o5[] o5VarArr, com.applovin.impl.yg[] ygVarArr) {
        this.e = o5VarArr;
        this.g = o5VarArr.length;
        for (int i = 0; i < this.g; i++) {
            this.e[i] = f();
        }
        this.f = ygVarArr;
        this.h = ygVarArr.length;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.f[i2] = g();
        }
        com.applovin.impl.bk.a aVar = new com.applovin.impl.bk.a("ExoPlayer:SimpleDecoder");
        this.f651a = aVar;
        aVar.start();
    }

    class a extends java.lang.Thread {
        a(java.lang.String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            com.applovin.impl.bk.this.m();
        }
    }

    @Override // com.applovin.impl.l5
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final com.applovin.impl.o5 d() {
        com.applovin.impl.o5 o5Var;
        synchronized (this.b) {
            l();
            com.applovin.impl.b1.b(this.i == null);
            int i = this.g;
            if (i == 0) {
                o5Var = null;
            } else {
                com.applovin.impl.o5[] o5VarArr = this.e;
                int i2 = i - 1;
                this.g = i2;
                o5Var = o5VarArr[i2];
            }
            this.i = o5Var;
        }
        return o5Var;
    }

    @Override // com.applovin.impl.l5
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final com.applovin.impl.yg c() {
        synchronized (this.b) {
            l();
            if (this.d.isEmpty()) {
                return null;
            }
            return (com.applovin.impl.yg) this.d.removeFirst();
        }
    }

    @Override // com.applovin.impl.l5
    public final void a(com.applovin.impl.o5 o5Var) {
        synchronized (this.b) {
            l();
            com.applovin.impl.b1.a(o5Var == this.i);
            this.c.addLast(o5Var);
            k();
            this.i = null;
        }
    }

    @Override // com.applovin.impl.l5
    public final void b() {
        synchronized (this.b) {
            this.k = true;
            this.m = 0;
            com.applovin.impl.o5 o5Var = this.i;
            if (o5Var != null) {
                b(o5Var);
                this.i = null;
            }
            while (!this.c.isEmpty()) {
                b((com.applovin.impl.o5) this.c.removeFirst());
            }
            while (!this.d.isEmpty()) {
                ((com.applovin.impl.yg) this.d.removeFirst()).g();
            }
        }
    }

    private void l() throws com.applovin.impl.n5 {
        com.applovin.impl.n5 n5Var = this.j;
        if (n5Var != null) {
            throw n5Var;
        }
    }

    private void k() {
        if (e()) {
            this.b.notify();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        do {
            try {
            } catch (java.lang.InterruptedException e) {
                throw new java.lang.IllegalStateException(e);
            }
        } while (h());
    }

    private boolean h() {
        com.applovin.impl.n5 n5VarA;
        synchronized (this.b) {
            while (!this.l && !e()) {
                this.b.wait();
            }
            if (this.l) {
                return false;
            }
            com.applovin.impl.o5 o5Var = (com.applovin.impl.o5) this.c.removeFirst();
            com.applovin.impl.yg[] ygVarArr = this.f;
            int i = this.h - 1;
            this.h = i;
            com.applovin.impl.yg ygVar = ygVarArr[i];
            boolean z = this.k;
            this.k = false;
            if (o5Var.e()) {
                ygVar.b(4);
            } else {
                if (o5Var.d()) {
                    ygVar.b(Integer.MIN_VALUE);
                }
                try {
                    n5VarA = a(o5Var, ygVar, z);
                } catch (java.lang.OutOfMemoryError e) {
                    n5VarA = a((java.lang.Throwable) e);
                } catch (java.lang.RuntimeException e2) {
                    n5VarA = a((java.lang.Throwable) e2);
                }
                if (n5VarA != null) {
                    synchronized (this.b) {
                        this.j = n5VarA;
                    }
                    return false;
                }
            }
            synchronized (this.b) {
                if (this.k) {
                    ygVar.g();
                } else if (ygVar.d()) {
                    this.m++;
                    ygVar.g();
                } else {
                    ygVar.c = this.m;
                    this.m = 0;
                    this.d.addLast(ygVar);
                }
                b(o5Var);
            }
            return true;
        }
    }

    private boolean e() {
        return !this.c.isEmpty() && this.h > 0;
    }

    @Override // com.applovin.impl.l5
    public void a() {
        synchronized (this.b) {
            this.l = true;
            this.b.notify();
        }
        try {
            this.f651a.join();
        } catch (java.lang.InterruptedException unused) {
            java.lang.Thread.currentThread().interrupt();
        }
    }

    private void b(com.applovin.impl.o5 o5Var) {
        o5Var.b();
        com.applovin.impl.o5[] o5VarArr = this.e;
        int i = this.g;
        this.g = i + 1;
        o5VarArr[i] = o5Var;
    }

    protected void a(com.applovin.impl.yg ygVar) {
        synchronized (this.b) {
            b(ygVar);
            k();
        }
    }

    protected final void a(int i) {
        com.applovin.impl.b1.b(this.g == this.e.length);
        for (com.applovin.impl.o5 o5Var : this.e) {
            o5Var.g(i);
        }
    }

    private void b(com.applovin.impl.yg ygVar) {
        ygVar.b();
        com.applovin.impl.yg[] ygVarArr = this.f;
        int i = this.h;
        this.h = i + 1;
        ygVarArr[i] = ygVar;
    }
}
