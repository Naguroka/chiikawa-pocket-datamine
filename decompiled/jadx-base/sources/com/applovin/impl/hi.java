package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class hi {
    private boolean c;
    private boolean d;
    private boolean e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.ho f853a = new com.applovin.impl.ho(0);
    private long f = androidx.media3.common.C.TIME_UNSET;
    private long g = androidx.media3.common.C.TIME_UNSET;
    private long h = androidx.media3.common.C.TIME_UNSET;
    private final com.applovin.impl.ah b = new com.applovin.impl.ah();

    hi() {
    }

    public boolean c() {
        return this.c;
    }

    public com.applovin.impl.ho b() {
        return this.f853a;
    }

    private int b(com.applovin.impl.k8 k8Var, com.applovin.impl.th thVar) {
        int iMin = (int) java.lang.Math.min(20000L, k8Var.a());
        long j = 0;
        if (k8Var.f() != j) {
            thVar.f1364a = j;
            return 1;
        }
        this.b.d(iMin);
        k8Var.b();
        k8Var.c(this.b.c(), 0, iMin);
        this.f = a(this.b);
        this.d = true;
        return 0;
    }

    private static boolean a(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    private int c(com.applovin.impl.k8 k8Var, com.applovin.impl.th thVar) {
        long jA = k8Var.a();
        int iMin = (int) java.lang.Math.min(20000L, jA);
        long j = jA - ((long) iMin);
        if (k8Var.f() != j) {
            thVar.f1364a = j;
            return 1;
        }
        this.b.d(iMin);
        k8Var.b();
        k8Var.c(this.b.c(), 0, iMin);
        this.g = b(this.b);
        this.e = true;
        return 0;
    }

    private int a(com.applovin.impl.k8 k8Var) {
        this.b.a(com.applovin.impl.xp.f);
        this.c = true;
        k8Var.b();
        return 0;
    }

    public static long c(com.applovin.impl.ah ahVar) {
        int iD = ahVar.d();
        if (ahVar.a() < 9) {
            return androidx.media3.common.C.TIME_UNSET;
        }
        byte[] bArr = new byte[9];
        ahVar.a(bArr, 0, 9);
        ahVar.f(iD);
        return !a(bArr) ? androidx.media3.common.C.TIME_UNSET : b(bArr);
    }

    private long b(com.applovin.impl.ah ahVar) {
        int iD = ahVar.d();
        for (int iE = ahVar.e() - 4; iE >= iD; iE--) {
            if (a(ahVar.c(), iE) == 442) {
                ahVar.f(iE + 4);
                long jC = c(ahVar);
                if (jC != androidx.media3.common.C.TIME_UNSET) {
                    return jC;
                }
            }
        }
        return androidx.media3.common.C.TIME_UNSET;
    }

    public long a() {
        return this.h;
    }

    private static long b(byte[] bArr) {
        long j = bArr[0];
        long j2 = ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((((long) bArr[1]) & 255) << 20);
        long j3 = bArr[2];
        return j2 | (((j3 & 248) >> 3) << 15) | ((j3 & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
    }

    private int a(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public int a(com.applovin.impl.k8 k8Var, com.applovin.impl.th thVar) {
        if (!this.e) {
            return c(k8Var, thVar);
        }
        if (this.g == androidx.media3.common.C.TIME_UNSET) {
            return a(k8Var);
        }
        if (!this.d) {
            return b(k8Var, thVar);
        }
        long j = this.f;
        if (j == androidx.media3.common.C.TIME_UNSET) {
            return a(k8Var);
        }
        long jB = this.f853a.b(this.g) - this.f853a.b(j);
        this.h = jB;
        if (jB < 0) {
            com.applovin.impl.oc.d("PsDurationReader", "Invalid duration: " + this.h + ". Using TIME_UNSET instead.");
            this.h = androidx.media3.common.C.TIME_UNSET;
        }
        return a(k8Var);
    }

    private long a(com.applovin.impl.ah ahVar) {
        int iE = ahVar.e();
        for (int iD = ahVar.d(); iD < iE - 3; iD++) {
            if (a(ahVar.c(), iD) == 442) {
                ahVar.f(iD + 4);
                long jC = c(ahVar);
                if (jC != androidx.media3.common.C.TIME_UNSET) {
                    return jC;
                }
            }
        }
        return androidx.media3.common.C.TIME_UNSET;
    }
}
