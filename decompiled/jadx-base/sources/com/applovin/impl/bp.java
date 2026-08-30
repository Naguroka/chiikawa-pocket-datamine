package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class bp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f658a;
    private boolean d;
    private boolean e;
    private boolean f;
    private final com.applovin.impl.ho b = new com.applovin.impl.ho(0);
    private long g = androidx.media3.common.C.TIME_UNSET;
    private long h = androidx.media3.common.C.TIME_UNSET;
    private long i = androidx.media3.common.C.TIME_UNSET;
    private final com.applovin.impl.ah c = new com.applovin.impl.ah();

    bp(int i) {
        this.f658a = i;
    }

    public boolean c() {
        return this.d;
    }

    public com.applovin.impl.ho b() {
        return this.b;
    }

    private int a(com.applovin.impl.k8 k8Var) {
        this.c.a(com.applovin.impl.xp.f);
        this.d = true;
        k8Var.b();
        return 0;
    }

    private int c(com.applovin.impl.k8 k8Var, com.applovin.impl.th thVar, int i) {
        long jA = k8Var.a();
        int iMin = (int) java.lang.Math.min(this.f658a, jA);
        long j = jA - ((long) iMin);
        if (k8Var.f() != j) {
            thVar.f1364a = j;
            return 1;
        }
        this.c.d(iMin);
        k8Var.b();
        k8Var.c(this.c.c(), 0, iMin);
        this.h = b(this.c, i);
        this.f = true;
        return 0;
    }

    public long a() {
        return this.i;
    }

    private int b(com.applovin.impl.k8 k8Var, com.applovin.impl.th thVar, int i) {
        int iMin = (int) java.lang.Math.min(this.f658a, k8Var.a());
        long j = 0;
        if (k8Var.f() != j) {
            thVar.f1364a = j;
            return 1;
        }
        this.c.d(iMin);
        k8Var.b();
        k8Var.c(this.c.c(), 0, iMin);
        this.g = a(this.c, i);
        this.e = true;
        return 0;
    }

    public int a(com.applovin.impl.k8 k8Var, com.applovin.impl.th thVar, int i) {
        if (i <= 0) {
            return a(k8Var);
        }
        if (!this.f) {
            return c(k8Var, thVar, i);
        }
        if (this.h == androidx.media3.common.C.TIME_UNSET) {
            return a(k8Var);
        }
        if (!this.e) {
            return b(k8Var, thVar, i);
        }
        long j = this.g;
        if (j == androidx.media3.common.C.TIME_UNSET) {
            return a(k8Var);
        }
        long jB = this.b.b(this.h) - this.b.b(j);
        this.i = jB;
        if (jB < 0) {
            com.applovin.impl.oc.d("TsDurationReader", "Invalid duration: " + this.i + ". Using TIME_UNSET instead.");
            this.i = androidx.media3.common.C.TIME_UNSET;
        }
        return a(k8Var);
    }

    private long b(com.applovin.impl.ah ahVar, int i) {
        int iD = ahVar.d();
        int iE = ahVar.e();
        for (int i2 = iE - 188; i2 >= iD; i2--) {
            if (com.applovin.impl.ep.a(ahVar.c(), iD, iE, i2)) {
                long jA = com.applovin.impl.ep.a(ahVar, i2, i);
                if (jA != androidx.media3.common.C.TIME_UNSET) {
                    return jA;
                }
            }
        }
        return androidx.media3.common.C.TIME_UNSET;
    }

    private long a(com.applovin.impl.ah ahVar, int i) {
        int iE = ahVar.e();
        for (int iD = ahVar.d(); iD < iE; iD++) {
            if (ahVar.c()[iD] == 71) {
                long jA = com.applovin.impl.ep.a(ahVar, iD, i);
                if (jA != androidx.media3.common.C.TIME_UNSET) {
                    return jA;
                }
            }
        }
        return androidx.media3.common.C.TIME_UNSET;
    }
}
