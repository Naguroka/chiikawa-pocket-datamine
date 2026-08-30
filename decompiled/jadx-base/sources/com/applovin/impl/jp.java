package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class jp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f931a;
    private int b;
    private boolean c;
    private int d;
    private boolean e;
    private float k;
    private java.lang.String l;
    private android.text.Layout.Alignment o;
    private android.text.Layout.Alignment p;
    private com.applovin.impl.xn r;
    private int f = -1;
    private int g = -1;
    private int h = -1;
    private int i = -1;
    private int j = -1;
    private int m = -1;
    private int n = -1;
    private int q = -1;
    private float s = Float.MAX_VALUE;

    public int k() {
        int i = this.h;
        if (i == -1 && this.i == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.i == 1 ? 2 : 0);
    }

    public boolean q() {
        return this.f == 1;
    }

    public boolean r() {
        return this.g == 1;
    }

    public java.lang.String c() {
        return this.f931a;
    }

    public int b() {
        if (this.c) {
            return this.b;
        }
        throw new java.lang.IllegalStateException("Font color has not been defined.");
    }

    public boolean p() {
        return this.c;
    }

    public boolean o() {
        return this.e;
    }

    public float j() {
        return this.s;
    }

    public com.applovin.impl.jp a(com.applovin.impl.jp jpVar) {
        return a(jpVar, true);
    }

    public java.lang.String f() {
        return this.l;
    }

    public int i() {
        return this.m;
    }

    public int h() {
        return this.n;
    }

    public android.text.Layout.Alignment l() {
        return this.o;
    }

    public android.text.Layout.Alignment g() {
        return this.p;
    }

    public boolean m() {
        return this.q == 1;
    }

    public com.applovin.impl.jp b(int i) {
        this.b = i;
        this.c = true;
        return this;
    }

    public com.applovin.impl.xn n() {
        return this.r;
    }

    public int e() {
        return this.j;
    }

    public float d() {
        return this.k;
    }

    public int a() {
        if (this.e) {
            return this.d;
        }
        throw new java.lang.IllegalStateException("Background color has not been defined.");
    }

    public com.applovin.impl.jp c(int i) {
        this.j = i;
        return this;
    }

    public com.applovin.impl.jp b(java.lang.String str) {
        this.l = str;
        return this;
    }

    private com.applovin.impl.jp a(com.applovin.impl.jp jpVar, boolean z) {
        int i;
        android.text.Layout.Alignment alignment;
        android.text.Layout.Alignment alignment2;
        java.lang.String str;
        if (jpVar != null) {
            if (!this.c && jpVar.c) {
                b(jpVar.b);
            }
            if (this.h == -1) {
                this.h = jpVar.h;
            }
            if (this.i == -1) {
                this.i = jpVar.i;
            }
            if (this.f931a == null && (str = jpVar.f931a) != null) {
                this.f931a = str;
            }
            if (this.f == -1) {
                this.f = jpVar.f;
            }
            if (this.g == -1) {
                this.g = jpVar.g;
            }
            if (this.n == -1) {
                this.n = jpVar.n;
            }
            if (this.o == null && (alignment2 = jpVar.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = jpVar.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = jpVar.q;
            }
            if (this.j == -1) {
                this.j = jpVar.j;
                this.k = jpVar.k;
            }
            if (this.r == null) {
                this.r = jpVar.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = jpVar.s;
            }
            if (z && !this.e && jpVar.e) {
                a(jpVar.d);
            }
            if (z && this.m == -1 && (i = jpVar.m) != -1) {
                this.m = i;
            }
        }
        return this;
    }

    public com.applovin.impl.jp c(boolean z) {
        this.f = z ? 1 : 0;
        return this;
    }

    public com.applovin.impl.jp e(int i) {
        this.m = i;
        return this;
    }

    public com.applovin.impl.jp d(int i) {
        this.n = i;
        return this;
    }

    public com.applovin.impl.jp b(boolean z) {
        this.i = z ? 1 : 0;
        return this;
    }

    public com.applovin.impl.jp e(boolean z) {
        this.g = z ? 1 : 0;
        return this;
    }

    public com.applovin.impl.jp a(int i) {
        this.d = i;
        this.e = true;
        return this;
    }

    public com.applovin.impl.jp b(float f) {
        this.s = f;
        return this;
    }

    public com.applovin.impl.jp a(boolean z) {
        this.h = z ? 1 : 0;
        return this;
    }

    public com.applovin.impl.jp d(boolean z) {
        this.q = z ? 1 : 0;
        return this;
    }

    public com.applovin.impl.jp a(java.lang.String str) {
        this.f931a = str;
        return this;
    }

    public com.applovin.impl.jp b(android.text.Layout.Alignment alignment) {
        this.o = alignment;
        return this;
    }

    public com.applovin.impl.jp a(float f) {
        this.k = f;
        return this;
    }

    public com.applovin.impl.jp a(android.text.Layout.Alignment alignment) {
        this.p = alignment;
        return this;
    }

    public com.applovin.impl.jp a(com.applovin.impl.xn xnVar) {
        this.r = xnVar;
        return this;
    }
}
