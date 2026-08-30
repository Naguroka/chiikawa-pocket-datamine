package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class r6 {
    private static final int p = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.json.e4 f3237a;
    private int b;
    private long c;
    private boolean d;
    private java.util.ArrayList<com.json.e7> e;
    private com.json.e7 f;
    private int g;
    private int h;
    private com.json.l5 i;
    private boolean j;
    private long k;
    private boolean l;
    private boolean m;
    private boolean n;
    private long o;

    public r6() {
        this.f3237a = new com.json.e4();
        this.e = new java.util.ArrayList<>();
    }

    public r6(int i, long j, boolean z, com.json.e4 e4Var, int i2, com.json.l5 l5Var, int i3, boolean z2, long j2, boolean z3, boolean z4, boolean z5, long j3) {
        this.e = new java.util.ArrayList<>();
        this.b = i;
        this.c = j;
        this.d = z;
        this.f3237a = e4Var;
        this.g = i2;
        this.h = i3;
        this.i = l5Var;
        this.j = z2;
        this.k = j2;
        this.l = z3;
        this.m = z4;
        this.n = z5;
        this.o = j3;
    }

    public int a() {
        return this.b;
    }

    public com.json.e7 a(java.lang.String str) {
        for (com.json.e7 e7Var : this.e) {
            if (e7Var.getPlacementName().equals(str)) {
                return e7Var;
            }
        }
        return null;
    }

    public void a(com.json.e7 e7Var) {
        if (e7Var != null) {
            this.e.add(e7Var);
            if (this.f == null || e7Var.isPlacementId(0)) {
                this.f = e7Var;
            }
        }
    }

    public long b() {
        return this.c;
    }

    public boolean c() {
        return this.d;
    }

    public com.json.l5 d() {
        return this.i;
    }

    public long e() {
        return this.k;
    }

    public int f() {
        return this.h;
    }

    public com.json.e4 g() {
        return this.f3237a;
    }

    public int h() {
        return this.g;
    }

    public com.json.e7 i() {
        for (com.json.e7 e7Var : this.e) {
            if (e7Var.getIsDefault()) {
                return e7Var;
            }
        }
        return this.f;
    }

    public long j() {
        return this.o;
    }

    public boolean k() {
        return this.j;
    }

    public boolean l() {
        return this.l;
    }

    public boolean m() {
        return this.n;
    }

    public boolean n() {
        return this.m;
    }

    public java.lang.String toString() {
        return "BannerConfigurations{parallelLoad=" + this.b + ", bidderExclusive=" + this.d + '}';
    }
}
