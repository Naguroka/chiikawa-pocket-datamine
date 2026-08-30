package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class q5 implements com.applovin.impl.n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f1172a;
    private final int b;
    private final byte[] c;
    private final com.applovin.impl.m0[] d;
    private int e;
    private int f;
    private int g;
    private com.applovin.impl.m0[] h;

    public q5(boolean z, int i) {
        this(z, i, 0);
    }

    public synchronized void e() {
        if (this.f1172a) {
            a(0);
        }
    }

    @Override // com.applovin.impl.n0
    public synchronized com.applovin.impl.m0 b() {
        com.applovin.impl.m0 m0Var;
        this.f++;
        int i = this.g;
        if (i > 0) {
            com.applovin.impl.m0[] m0VarArr = this.h;
            int i2 = i - 1;
            this.g = i2;
            m0Var = (com.applovin.impl.m0) com.applovin.impl.b1.a(m0VarArr[i2]);
            this.h[this.g] = null;
        } else {
            m0Var = new com.applovin.impl.m0(new byte[this.b], 0);
        }
        return m0Var;
    }

    @Override // com.applovin.impl.n0
    public synchronized void a(com.applovin.impl.m0 m0Var) {
        com.applovin.impl.m0[] m0VarArr = this.d;
        m0VarArr[0] = m0Var;
        a(m0VarArr);
    }

    public q5(boolean z, int i, int i2) {
        com.applovin.impl.b1.a(i > 0);
        com.applovin.impl.b1.a(i2 >= 0);
        this.f1172a = z;
        this.b = i;
        this.g = i2;
        this.h = new com.applovin.impl.m0[i2 + 100];
        if (i2 > 0) {
            this.c = new byte[i2 * i];
            for (int i3 = 0; i3 < i2; i3++) {
                this.h[i3] = new com.applovin.impl.m0(this.c, i3 * i);
            }
        } else {
            this.c = null;
        }
        this.d = new com.applovin.impl.m0[1];
    }

    public synchronized int d() {
        return this.f * this.b;
    }

    @Override // com.applovin.impl.n0
    public int c() {
        return this.b;
    }

    @Override // com.applovin.impl.n0
    public synchronized void a(com.applovin.impl.m0[] m0VarArr) {
        int i = this.g;
        int length = m0VarArr.length + i;
        com.applovin.impl.m0[] m0VarArr2 = this.h;
        if (length >= m0VarArr2.length) {
            this.h = (com.applovin.impl.m0[]) java.util.Arrays.copyOf(m0VarArr2, java.lang.Math.max(m0VarArr2.length * 2, i + m0VarArr.length));
        }
        for (com.applovin.impl.m0 m0Var : m0VarArr) {
            com.applovin.impl.m0[] m0VarArr3 = this.h;
            int i2 = this.g;
            this.g = i2 + 1;
            m0VarArr3[i2] = m0Var;
        }
        this.f -= m0VarArr.length;
        notifyAll();
    }

    public synchronized void a(int i) {
        boolean z = i < this.e;
        this.e = i;
        if (z) {
            a();
        }
    }

    @Override // com.applovin.impl.n0
    public synchronized void a() {
        int i = 0;
        int iMax = java.lang.Math.max(0, com.applovin.impl.xp.a(this.e, this.b) - this.f);
        int i2 = this.g;
        if (iMax >= i2) {
            return;
        }
        if (this.c != null) {
            int i3 = i2 - 1;
            while (i <= i3) {
                com.applovin.impl.m0 m0Var = (com.applovin.impl.m0) com.applovin.impl.b1.a(this.h[i]);
                if (m0Var.f1003a == this.c) {
                    i++;
                } else {
                    com.applovin.impl.m0 m0Var2 = (com.applovin.impl.m0) com.applovin.impl.b1.a(this.h[i3]);
                    if (m0Var2.f1003a != this.c) {
                        i3--;
                    } else {
                        com.applovin.impl.m0[] m0VarArr = this.h;
                        m0VarArr[i] = m0Var2;
                        m0VarArr[i3] = m0Var;
                        i3--;
                        i++;
                    }
                }
            }
            iMax = java.lang.Math.max(iMax, i);
            if (iMax >= this.g) {
                return;
            }
        }
        java.util.Arrays.fill(this.h, iMax, this.g, (java.lang.Object) null);
        this.g = iMax;
    }
}
