package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
abstract class nr {
    public static com.applovin.impl.mr a(com.applovin.impl.k8 k8Var) {
        byte[] bArr;
        com.applovin.impl.b1.a(k8Var);
        com.applovin.impl.ah ahVar = new com.applovin.impl.ah(16);
        if (com.applovin.impl.nr.a.a(k8Var, ahVar).f1104a != 1380533830) {
            return null;
        }
        k8Var.c(ahVar.c(), 0, 4);
        ahVar.f(0);
        int iJ = ahVar.j();
        if (iJ != 1463899717) {
            com.applovin.impl.oc.b("WavHeaderReader", "Unsupported RIFF format: " + iJ);
            return null;
        }
        com.applovin.impl.nr.a aVarA = com.applovin.impl.nr.a.a(k8Var, ahVar);
        while (aVarA.f1104a != 1718449184) {
            k8Var.c((int) aVarA.b);
            aVarA = com.applovin.impl.nr.a.a(k8Var, ahVar);
        }
        com.applovin.impl.b1.b(aVarA.b >= 16);
        k8Var.c(ahVar.c(), 0, 16);
        ahVar.f(0);
        int iR = ahVar.r();
        int iR2 = ahVar.r();
        int iQ = ahVar.q();
        int iQ2 = ahVar.q();
        int iR3 = ahVar.r();
        int iR4 = ahVar.r();
        int i = ((int) aVarA.b) - 16;
        if (i > 0) {
            byte[] bArr2 = new byte[i];
            k8Var.c(bArr2, 0, i);
            bArr = bArr2;
        } else {
            bArr = com.applovin.impl.xp.f;
        }
        return new com.applovin.impl.mr(iR, iR2, iQ, iQ2, iR3, iR4, bArr);
    }

    public static android.util.Pair b(com.applovin.impl.k8 k8Var) throws com.applovin.impl.ch {
        com.applovin.impl.b1.a(k8Var);
        k8Var.b();
        com.applovin.impl.ah ahVar = new com.applovin.impl.ah(8);
        com.applovin.impl.nr.a aVarA = com.applovin.impl.nr.a.a(k8Var, ahVar);
        while (true) {
            int i = aVarA.f1104a;
            if (i != 1684108385) {
                if (i != 1380533830 && i != 1718449184) {
                    com.applovin.impl.oc.d("WavHeaderReader", "Ignoring unknown WAV chunk: " + aVarA.f1104a);
                }
                long j = aVarA.b + 8;
                if (aVarA.f1104a == 1380533830) {
                    j = 12;
                }
                if (j <= 2147483647L) {
                    k8Var.a((int) j);
                    aVarA = com.applovin.impl.nr.a.a(k8Var, ahVar);
                } else {
                    throw com.applovin.impl.ch.a("Chunk is too large (~2GB+) to skip; id: " + aVarA.f1104a);
                }
            } else {
                k8Var.a(8);
                long jF = k8Var.f();
                long j2 = aVarA.b + jF;
                long jA = k8Var.a();
                if (jA != -1 && j2 > jA) {
                    com.applovin.impl.oc.d("WavHeaderReader", "Data exceeds input length: " + j2 + ", " + jA);
                    j2 = jA;
                }
                return android.util.Pair.create(java.lang.Long.valueOf(jF), java.lang.Long.valueOf(j2));
            }
        }
    }

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f1104a;
        public final long b;

        private a(int i, long j) {
            this.f1104a = i;
            this.b = j;
        }

        public static com.applovin.impl.nr.a a(com.applovin.impl.k8 k8Var, com.applovin.impl.ah ahVar) {
            k8Var.c(ahVar.c(), 0, 8);
            ahVar.f(0);
            return new com.applovin.impl.nr.a(ahVar.j(), ahVar.p());
        }
    }
}
