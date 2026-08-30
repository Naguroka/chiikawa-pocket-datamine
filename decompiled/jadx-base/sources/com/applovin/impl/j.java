package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements com.applovin.impl.p7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.zg f900a;
    private final com.applovin.impl.ah b;
    private final java.lang.String c;
    private java.lang.String d;
    private com.applovin.impl.qo e;
    private int f;
    private int g;
    private boolean h;
    private long i;
    private com.applovin.impl.e9 j;
    private int k;
    private long l;

    @Override // com.applovin.impl.p7
    public void b() {
    }

    public j() {
        this(null);
    }

    @Override // com.applovin.impl.p7
    public void a(com.applovin.impl.ah ahVar) {
        com.applovin.impl.b1.b(this.e);
        while (ahVar.a() > 0) {
            int i = this.f;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int iMin = java.lang.Math.min(ahVar.a(), this.k - this.g);
                        this.e.a(ahVar, iMin);
                        int i2 = this.g + iMin;
                        this.g = i2;
                        int i3 = this.k;
                        if (i2 == i3) {
                            long j = this.l;
                            if (j != androidx.media3.common.C.TIME_UNSET) {
                                this.e.a(j, 1, i3, 0, null);
                                this.l += this.i;
                            }
                            this.f = 0;
                        }
                    }
                } else if (a(ahVar, this.b.c(), 128)) {
                    c();
                    this.b.f(0);
                    this.e.a(this.b, 128);
                    this.f = 2;
                }
            } else if (b(ahVar)) {
                this.f = 1;
                this.b.c()[0] = 11;
                this.b.c()[1] = 119;
                this.g = 2;
            }
        }
    }

    public j(java.lang.String str) {
        com.applovin.impl.zg zgVar = new com.applovin.impl.zg(new byte[128]);
        this.f900a = zgVar;
        this.b = new com.applovin.impl.ah(zgVar.f1572a);
        this.f = 0;
        this.l = androidx.media3.common.C.TIME_UNSET;
        this.c = str;
    }

    private boolean b(com.applovin.impl.ah ahVar) {
        while (true) {
            if (ahVar.a() <= 0) {
                return false;
            }
            if (!this.h) {
                this.h = ahVar.w() == 11;
            } else {
                int iW = ahVar.w();
                if (iW == 119) {
                    this.h = false;
                    return true;
                }
                this.h = iW == 11;
            }
        }
    }

    private void c() {
        this.f900a.c(0);
        com.applovin.impl.k.b bVarA = com.applovin.impl.k.a(this.f900a);
        com.applovin.impl.e9 e9Var = this.j;
        if (e9Var == null || bVarA.d != e9Var.z || bVarA.c != e9Var.A || !com.applovin.impl.xp.a((java.lang.Object) bVarA.f935a, (java.lang.Object) e9Var.m)) {
            com.applovin.impl.e9 e9VarA = new com.applovin.impl.e9.b().c(this.d).f(bVarA.f935a).c(bVarA.d).n(bVarA.c).e(this.c).a();
            this.j = e9VarA;
            this.e.a(e9VarA);
        }
        this.k = bVarA.e;
        this.i = (((long) bVarA.f) * 1000000) / ((long) this.j.A);
    }

    private boolean a(com.applovin.impl.ah ahVar, byte[] bArr, int i) {
        int iMin = java.lang.Math.min(ahVar.a(), i - this.g);
        ahVar.a(bArr, this.g, iMin);
        int i2 = this.g + iMin;
        this.g = i2;
        return i2 == i;
    }

    @Override // com.applovin.impl.p7
    public void a(com.applovin.impl.l8 l8Var, com.applovin.impl.dp.d dVar) {
        dVar.a();
        this.d = dVar.b();
        this.e = l8Var.a(dVar.c(), 1);
    }

    @Override // com.applovin.impl.p7
    public void a(long j, int i) {
        if (j != androidx.media3.common.C.TIME_UNSET) {
            this.l = j;
        }
    }

    @Override // com.applovin.impl.p7
    public void a() {
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.l = androidx.media3.common.C.TIME_UNSET;
    }
}
