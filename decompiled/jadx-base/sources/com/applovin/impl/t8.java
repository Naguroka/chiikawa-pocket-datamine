package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class t8 extends com.applovin.impl.i2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8(final com.applovin.impl.z8 z8Var, int i, long j, long j2) {
        super(new com.applovin.impl.i2.d() { // from class: com.applovin.impl.t8$$ExternalSyntheticLambda0
            @Override // com.applovin.impl.i2.d
            public final long a(long j3) {
                return z8Var.a(j3);
            }
        }, new com.applovin.impl.t8.b(z8Var, i), z8Var.b(), 0L, z8Var.j, j, j2, z8Var.a(), java.lang.Math.max(6, z8Var.c));
        java.util.Objects.requireNonNull(z8Var);
    }

    private static final class b implements com.applovin.impl.i2.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.z8 f1352a;
        private final int b;
        private final com.applovin.impl.v8.a c;

        private b(com.applovin.impl.z8 z8Var, int i) {
            this.f1352a = z8Var;
            this.b = i;
            this.c = new com.applovin.impl.v8.a();
        }

        private long a(com.applovin.impl.k8 k8Var) {
            while (k8Var.d() < k8Var.a() - 6 && !com.applovin.impl.v8.a(k8Var, this.f1352a, this.b, this.c)) {
                k8Var.c(1);
            }
            if (k8Var.d() >= k8Var.a() - 6) {
                k8Var.c((int) (k8Var.a() - k8Var.d()));
                return this.f1352a.j;
            }
            return this.c.f1423a;
        }

        @Override // com.applovin.impl.i2.f
        public com.applovin.impl.i2.e a(com.applovin.impl.k8 k8Var, long j) {
            long jF = k8Var.f();
            long jA = a(k8Var);
            long jD = k8Var.d();
            k8Var.c(java.lang.Math.max(6, this.f1352a.c));
            long jA2 = a(k8Var);
            long jD2 = k8Var.d();
            if (jA <= j && jA2 > j) {
                return com.applovin.impl.i2.e.a(jD);
            }
            if (jA2 <= j) {
                return com.applovin.impl.i2.e.b(jA2, jD2);
            }
            return com.applovin.impl.i2.e.a(jA, jF);
        }
    }
}
