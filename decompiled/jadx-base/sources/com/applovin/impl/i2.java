package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.i2.a f867a;
    protected final com.applovin.impl.i2.f b;
    protected com.applovin.impl.i2.c c;
    private final int d;

    public static final class b implements com.applovin.impl.i2.d {
        @Override // com.applovin.impl.i2.d
        public long a(long j) {
            return j;
        }
    }

    protected interface d {
        long a(long j);
    }

    protected interface f {
        com.applovin.impl.i2.e a(com.applovin.impl.k8 k8Var, long j);

        default void a() {
        }
    }

    protected void b(boolean z, long j) {
    }

    protected i2(com.applovin.impl.i2.d dVar, com.applovin.impl.i2.f fVar, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.b = fVar;
        this.d = i;
        this.f867a = new com.applovin.impl.i2.a(dVar, j, j2, j3, j4, j5, j6);
    }

    public final com.applovin.impl.ij a() {
        return this.f867a;
    }

    public final boolean b() {
        return this.c != null;
    }

    protected static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f869a;
        private final long b;
        private final long c;
        private long d;
        private long e;
        private long f;
        private long g;
        private long h;

        protected c(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
            this.f869a = j;
            this.b = j2;
            this.d = j3;
            this.e = j4;
            this.f = j5;
            this.g = j6;
            this.c = j7;
            this.h = a(j2, j3, j4, j5, j6, j7);
        }

        private void f() {
            this.h = a(this.b, this.d, this.e, this.f, this.g, this.c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long e() {
            return this.b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long d() {
            return this.f869a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long c() {
            return this.h;
        }

        protected static long a(long j, long j2, long j3, long j4, long j5, long j6) {
            if (j4 + 1 >= j5 || j2 + 1 >= j3) {
                return j4;
            }
            long j7 = (long) ((j - j2) * ((j5 - j4) / (j3 - j2)));
            return com.applovin.impl.xp.b(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long b() {
            return this.f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long a() {
            return this.g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(long j, long j2) {
            this.d = j;
            this.f = j2;
            f();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j, long j2) {
            this.e = j;
            this.g = j2;
            f();
        }
    }

    public final void b(long j) {
        com.applovin.impl.i2.c cVar = this.c;
        if (cVar == null || cVar.d() != j) {
            this.c = a(j);
        }
    }

    public int a(com.applovin.impl.k8 k8Var, com.applovin.impl.th thVar) {
        while (true) {
            com.applovin.impl.i2.c cVar = (com.applovin.impl.i2.c) com.applovin.impl.b1.b(this.c);
            long jB = cVar.b();
            long jA = cVar.a();
            long jC = cVar.c();
            if (jA - jB <= this.d) {
                a(false, jB);
                return a(k8Var, jB, thVar);
            }
            if (!a(k8Var, jC)) {
                return a(k8Var, jC, thVar);
            }
            k8Var.b();
            com.applovin.impl.i2.e eVarA = this.b.a(k8Var, cVar.e());
            int i = eVarA.f870a;
            if (i == -3) {
                a(false, jC);
                return a(k8Var, jC, thVar);
            }
            if (i == -2) {
                cVar.b(eVarA.b, eVarA.c);
            } else {
                if (i != -1) {
                    if (i != 0) {
                        throw new java.lang.IllegalStateException("Invalid case");
                    }
                    a(k8Var, eVarA.c);
                    a(true, eVarA.c);
                    return a(k8Var, eVarA.c, thVar);
                }
                cVar.a(eVarA.b, eVarA.c);
            }
        }
    }

    public static final class e {
        public static final com.applovin.impl.i2.e d = new com.applovin.impl.i2.e(-3, androidx.media3.common.C.TIME_UNSET, -1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f870a;
        private final long b;
        private final long c;

        public static com.applovin.impl.i2.e a(long j, long j2) {
            return new com.applovin.impl.i2.e(-1, j, j2);
        }

        public static com.applovin.impl.i2.e b(long j, long j2) {
            return new com.applovin.impl.i2.e(-2, j, j2);
        }

        public static com.applovin.impl.i2.e a(long j) {
            return new com.applovin.impl.i2.e(0, androidx.media3.common.C.TIME_UNSET, j);
        }

        private e(int i, long j, long j2) {
            this.f870a = i;
            this.b = j;
            this.c = j2;
        }
    }

    public static class a implements com.applovin.impl.ij {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.i2.d f868a;
        private final long b;
        private final long c;
        private final long d;
        private final long e;
        private final long f;
        private final long g;

        @Override // com.applovin.impl.ij
        public boolean b() {
            return true;
        }

        public a(com.applovin.impl.i2.d dVar, long j, long j2, long j3, long j4, long j5, long j6) {
            this.f868a = dVar;
            this.b = j;
            this.c = j2;
            this.d = j3;
            this.e = j4;
            this.f = j5;
            this.g = j6;
        }

        @Override // com.applovin.impl.ij
        public com.applovin.impl.ij.a b(long j) {
            return new com.applovin.impl.ij.a(new com.applovin.impl.kj(j, com.applovin.impl.i2.c.a(this.f868a.a(j), this.c, this.d, this.e, this.f, this.g)));
        }

        @Override // com.applovin.impl.ij
        public long d() {
            return this.b;
        }

        public long c(long j) {
            return this.f868a.a(j);
        }
    }

    protected final void a(boolean z, long j) {
        this.c = null;
        this.b.a();
        b(z, j);
    }

    protected final int a(com.applovin.impl.k8 k8Var, long j, com.applovin.impl.th thVar) {
        if (j == k8Var.f()) {
            return 0;
        }
        thVar.f1364a = j;
        return 1;
    }

    protected final boolean a(com.applovin.impl.k8 k8Var, long j) {
        long jF = j - k8Var.f();
        if (jF < 0 || jF > 262144) {
            return false;
        }
        k8Var.a((int) jF);
        return true;
    }

    protected com.applovin.impl.i2.c a(long j) {
        return new com.applovin.impl.i2.c(j, this.f867a.c(j), this.f867a.c, this.f867a.d, this.f867a.e, this.f867a.f, this.f867a.g);
    }
}
