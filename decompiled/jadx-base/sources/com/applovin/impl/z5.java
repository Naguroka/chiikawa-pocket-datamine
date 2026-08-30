package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class z5 implements com.applovin.impl.o7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f1561a = new byte[8];
    private final java.util.ArrayDeque b = new java.util.ArrayDeque();
    private final com.applovin.impl.zp c = new com.applovin.impl.zp();
    private com.applovin.impl.n7 d;
    private int e;
    private int f;
    private long g;

    @Override // com.applovin.impl.o7
    public void a(com.applovin.impl.n7 n7Var) {
        this.d = n7Var;
    }

    @Override // com.applovin.impl.o7
    public void reset() {
        this.e = 0;
        this.b.clear();
        this.c.b();
    }

    @Override // com.applovin.impl.o7
    public boolean a(com.applovin.impl.k8 k8Var) throws com.applovin.impl.ch {
        com.applovin.impl.b1.b(this.d);
        while (true) {
            com.applovin.impl.z5.b bVar = (com.applovin.impl.z5.b) this.b.peek();
            if (bVar == null || k8Var.f() < bVar.b) {
                if (this.e == 0) {
                    long jA = this.c.a(k8Var, true, false, 4);
                    if (jA == -2) {
                        jA = b(k8Var);
                    }
                    if (jA == -1) {
                        return false;
                    }
                    this.f = (int) jA;
                    this.e = 1;
                }
                if (this.e == 1) {
                    this.g = this.c.a(k8Var, false, true, 8);
                    this.e = 2;
                }
                int iB = this.d.b(this.f);
                if (iB != 0) {
                    if (iB == 1) {
                        long jF = k8Var.f();
                        this.b.push(new com.applovin.impl.z5.b(this.f, this.g + jF));
                        this.d.a(this.f, jF, this.g);
                        this.e = 0;
                        return true;
                    }
                    if (iB == 2) {
                        long j = this.g;
                        if (j <= 8) {
                            this.d.a(this.f, b(k8Var, (int) j));
                            this.e = 0;
                            return true;
                        }
                        throw com.applovin.impl.ch.a("Invalid integer size: " + this.g, null);
                    }
                    if (iB == 3) {
                        long j2 = this.g;
                        if (j2 <= 2147483647L) {
                            this.d.a(this.f, c(k8Var, (int) j2));
                            this.e = 0;
                            return true;
                        }
                        throw com.applovin.impl.ch.a("String element size: " + this.g, null);
                    }
                    if (iB == 4) {
                        this.d.a(this.f, (int) this.g, k8Var);
                        this.e = 0;
                        return true;
                    }
                    if (iB != 5) {
                        throw com.applovin.impl.ch.a("Invalid element type " + iB, null);
                    }
                    long j3 = this.g;
                    if (j3 != 4 && j3 != 8) {
                        throw com.applovin.impl.ch.a("Invalid float size: " + this.g, null);
                    }
                    this.d.a(this.f, a(k8Var, (int) j3));
                    this.e = 0;
                    return true;
                }
                k8Var.a((int) this.g);
                this.e = 0;
            } else {
                this.d.a(((com.applovin.impl.z5.b) this.b.pop()).f1562a);
                return true;
            }
        }
    }

    private long b(com.applovin.impl.k8 k8Var) {
        k8Var.b();
        while (true) {
            k8Var.c(this.f1561a, 0, 4);
            int iA = com.applovin.impl.zp.a(this.f1561a[0]);
            if (iA != -1 && iA <= 4) {
                int iA2 = (int) com.applovin.impl.zp.a(this.f1561a, iA, false);
                if (this.d.c(iA2)) {
                    k8Var.a(iA);
                    return iA2;
                }
            }
            k8Var.a(1);
        }
    }

    private static java.lang.String c(com.applovin.impl.k8 k8Var, int i) {
        if (i == 0) {
            return "";
        }
        byte[] bArr = new byte[i];
        k8Var.d(bArr, 0, i);
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        return new java.lang.String(bArr, 0, i);
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f1562a;
        private final long b;

        private b(int i, long j) {
            this.f1562a = i;
            this.b = j;
        }
    }

    private long b(com.applovin.impl.k8 k8Var, int i) {
        k8Var.d(this.f1561a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.f1561a[i2] & 255));
        }
        return j;
    }

    private double a(com.applovin.impl.k8 k8Var, int i) {
        long jB = b(k8Var, i);
        if (i == 4) {
            return java.lang.Float.intBitsToFloat((int) jB);
        }
        return java.lang.Double.longBitsToDouble(jB);
    }
}
