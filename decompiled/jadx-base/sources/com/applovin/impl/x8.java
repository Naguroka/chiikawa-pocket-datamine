package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class x8 extends com.applovin.impl.gl {
    private com.applovin.impl.z8 n;
    private com.applovin.impl.x8.a o;

    x8() {
    }

    public static boolean c(com.applovin.impl.ah ahVar) {
        return ahVar.a() >= 5 && ahVar.w() == 127 && ahVar.y() == 1179402563;
    }

    private static boolean a(byte[] bArr) {
        return bArr[0] == -1;
    }

    private int b(com.applovin.impl.ah ahVar) {
        int i = (ahVar.c()[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            ahVar.g(4);
            ahVar.D();
        }
        int iB = com.applovin.impl.v8.b(ahVar, i);
        ahVar.f(0);
        return iB;
    }

    private static final class a implements com.applovin.impl.jg {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.applovin.impl.z8 f1497a;
        private com.applovin.impl.z8.a b;
        private long c = -1;
        private long d = -1;

        public a(com.applovin.impl.z8 z8Var, com.applovin.impl.z8.a aVar) {
            this.f1497a = z8Var;
            this.b = aVar;
        }

        public void b(long j) {
            this.c = j;
        }

        @Override // com.applovin.impl.jg
        public com.applovin.impl.ij a() {
            com.applovin.impl.b1.b(this.c != -1);
            return new com.applovin.impl.y8(this.f1497a, this.c);
        }

        @Override // com.applovin.impl.jg
        public long a(com.applovin.impl.k8 k8Var) {
            long j = this.d;
            if (j < 0) {
                return -1L;
            }
            long j2 = -(j + 2);
            this.d = -1L;
            return j2;
        }

        @Override // com.applovin.impl.jg
        public void a(long j) {
            long[] jArr = this.b.f1566a;
            this.d = jArr[com.applovin.impl.xp.b(jArr, j, true, true)];
        }
    }

    @Override // com.applovin.impl.gl
    protected long a(com.applovin.impl.ah ahVar) {
        if (a(ahVar.c())) {
            return b(ahVar);
        }
        return -1L;
    }

    @Override // com.applovin.impl.gl
    protected boolean a(com.applovin.impl.ah ahVar, long j, com.applovin.impl.gl.b bVar) {
        byte[] bArrC = ahVar.c();
        com.applovin.impl.z8 z8Var = this.n;
        if (z8Var == null) {
            com.applovin.impl.z8 z8Var2 = new com.applovin.impl.z8(bArrC, 17);
            this.n = z8Var2;
            bVar.f826a = z8Var2.a(java.util.Arrays.copyOfRange(bArrC, 9, ahVar.e()), (com.applovin.impl.af) null);
            return true;
        }
        if ((bArrC[0] & 127) == 3) {
            com.applovin.impl.z8.a aVarA = com.applovin.impl.w8.a(ahVar);
            com.applovin.impl.z8 z8VarA = z8Var.a(aVarA);
            this.n = z8VarA;
            this.o = new com.applovin.impl.x8.a(z8VarA, aVarA);
            return true;
        }
        if (!a(bArrC)) {
            return true;
        }
        com.applovin.impl.x8.a aVar = this.o;
        if (aVar != null) {
            aVar.b(j);
            bVar.b = this.o;
        }
        com.applovin.impl.b1.a(bVar.f826a);
        return false;
    }

    @Override // com.applovin.impl.gl
    protected void a(boolean z) {
        super.a(z);
        if (z) {
            this.n = null;
            this.o = null;
        }
    }
}
